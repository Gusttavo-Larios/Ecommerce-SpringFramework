package com.tads4.tads4.generics.pagination;

import java.util.List;

public class PageGenericImpl<T> implements PageGeneric {
    private List<T> items;
    private Integer currentPage;
    private Integer lastPage;

    public PageGenericImpl(List<T> items, Integer currentPage, Integer lastPage) {
        this.items = items;
        this.currentPage = currentPage;
        this.lastPage = lastPage;
    }

    public List<T> getItems() {
        return items;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public Integer getLastPage() {
        return lastPage;
    }
}
