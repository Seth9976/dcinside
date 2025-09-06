package org.slf4j.spi;

import java.util.Map;

public interface MDCAdapter {
    void a(String arg1, String arg2);

    Map b();

    void c(Map arg1);

    void clear();

    String get(String arg1);

    void remove(String arg1);
}

