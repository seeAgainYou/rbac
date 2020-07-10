package com.xxty.rbac.common.result;

import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.List;

@Data
public class PageInfoBT<T> {
    // 结果集
    private List<T> data;

    // 总数
    private long totalCount;
    private long totalPage;
    private long pageSize;
    private long pageNo;

    public PageInfoBT(PageInfo<T> page) {
        this.data = page.getList();
        this.totalCount = page.getTotal();
        this.totalPage = page.getPages();
        this.pageSize = page.getSize();
        this.pageNo = page.getPageNum();
    }
}
