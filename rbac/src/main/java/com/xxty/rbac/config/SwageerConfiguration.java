package com.xxty.rbac.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.lang.reflect.Field;
import java.util.Arrays;

@EnableSwagger2
@Configuration
public class SwageerConfiguration implements InitializingBean {

    @Autowired
    private ApplicationContext applicationContext;

    // 默认版本的分组,,@ApiVersion实现版本管理
    @Bean
    public Docket docket() {
        // basePackage 需要扫描注解生成文档的路径
        return new Docket(DocumentationType.SWAGGER_2)
                // 分组名用aaa开头以便排在最前面
                .groupName("aaa_默认分组（所有接口）")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xxty.rbac.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger demo")
                .description("这是展示Swagger怎么用的例子")
                .version("1.0").build();
    }

    private Docket buildDocket(String groupName) {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName(groupName)
                .select()
                .apis(method -> {
                    // 每个方法会进入这里进行判断并归类到不同分组，**请不要调换下面两段代码的顺序，在方法上的注解有优先级**

                    // 该方法上标注了版本
                    if (method.isAnnotatedWith(ApiVersion.class)) {
                        ApiVersion apiVersion = method.getHandlerMethod().getMethodAnnotation(ApiVersion.class);
                        if (apiVersion.value() != null && apiVersion.value().length != 0) {
                            if (Arrays.asList(apiVersion.value()).contains(groupName)) {
                                return true;
                            }
                        }

                    }

                    // 方法所在的类是否标注了?
                    ApiVersion annotationOnClass = method.getHandlerMethod().getBeanType().getAnnotation(ApiVersion.class);
                    if (annotationOnClass != null) {
                        if (annotationOnClass.value() != null && annotationOnClass.value().length != 0) {
                            if (Arrays.asList(annotationOnClass.value()).contains(groupName)) {
                                return true;
                            }
                        }
                    }
                    return false;
                })
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 动态得创建Docket bean
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        // ApiConstantVersion 里面定义的每个变量会成为一个docket
        Class<ApiVersionConstant> clazz = ApiVersionConstant.class;
        Field[] declaredFields = clazz.getDeclaredFields();

        // 动态注入bean
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        if (autowireCapableBeanFactory instanceof DefaultListableBeanFactory) {
            DefaultListableBeanFactory capableBeanFactory = (DefaultListableBeanFactory) autowireCapableBeanFactory;
            for (Field declaredField : declaredFields) {

                // 要注意 "工厂名和方法名"，意思是用这个bean的指定方法创建docket,swageerConfiguration首字母必须小写
                AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder
                        .genericBeanDefinition()
                        .setFactoryMethodOnBean("buildDocket", "swageerConfiguration")
                        .addConstructorArgValue(declaredField.get(ApiVersionConstant.class)).getBeanDefinition();
                capableBeanFactory.registerBeanDefinition(declaredField.getName(), beanDefinition);
            }
        }
    }





//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .pathMapping("/")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.xxty.rbac.controller"))
//                .paths(PathSelectors.any())
//                .build().apiInfo(new ApiInfoBuilder()
//                        .title("SpringBoot整合Swagger")
//                        .description("SpringBoot整合Swagger，详细信息......")
//                        .version("9.0")
//                        .contact(new Contact("啊啊啊啊","blog.csdn.net","aaa@gmail.com"))
//                        .license("The Apache License")
//                        .licenseUrl("http://www.baidu.com")
//                        .build());
//    }





//    @Bean
//    public Docket createRestApi() {
//    return new Docket(DocumentationType.SWAGGER_2)
//            .apiInfo(apiInfo())
//            .select()
//            .apis(RequestHandlerSelectors.basePackage("com.xxty.rbac.controller"))
//            .paths(PathSelectors.any())
//            .build();
//}
//    //配置在线文档的基本信息
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("springboot利用swagger构建api文档")
//                .description("简单优雅的restfun风格，https://me.csdn.net/blog/miachen520")
//                .termsOfServiceUrl("https://me.csdn.net/blog/miachen520")
//                .version("1.0")
//                .build();
//    }


//    @Override
//    public void afterPropertiesSet() throws Exception {
//
//    }
}
