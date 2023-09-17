package com.tads4.tads4.generics.pagination;

import java.util.List;

public interface PageGeneric<T> {
    public List<T> getItems();

    public Integer getCurrentPage();

    public Integer getLastPage();
}
