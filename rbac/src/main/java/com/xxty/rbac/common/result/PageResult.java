package com.xxty.rbac.common.result;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {
    //总条数
    long  totalCount= 0;
    //总页数
    long totalPage= 0;
    //每页条数
    long pageSize= 10;
    //页码
    long pageNo= 1;
    //列表信息
    List<T> data;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PageResult{");
        sb.append("totalCount=").append(totalCount);
        sb.append(", totalPage=").append(totalPage);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", pageNo=").append(pageNo);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
