package com.bytedance.sdk.component.Zh.PjT;

public enum xf {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final String JQp;

    private xf(String s1) {
        this.JQp = s1;
    }

    @Override
    public String toString() {
        return this.JQp;
    }
}

