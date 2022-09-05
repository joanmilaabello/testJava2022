package com.test.testjava.constants;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public final class Constants {
    public static final String VERSION = "1.0";
    public static final Pageable PAGE_FIRST_ITEM = PageRequest.of(0, 1);

}
