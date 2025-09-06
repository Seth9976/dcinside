package com.fasterxml.jackson.databind.util;

import java.util.function.BiConsumer;

public interface w {
    void a(BiConsumer arg1);

    w b();

    void clear();

    Object get(Object arg1);

    Object put(Object arg1, Object arg2);

    Object putIfAbsent(Object arg1, Object arg2);

    int size();
}

