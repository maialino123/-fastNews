package com.laptrinhJavaWeb.paging;

import com.laptrinhJavaWeb.sort.sorter;

public interface pageble {
 Integer getPage();
 Integer getLimit();
 Integer getOffset();
 sorter getSorter();
}
