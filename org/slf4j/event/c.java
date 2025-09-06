package org.slf4j.event;

public enum c {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");

    private int a;
    private String b;

    private c(int v1, String s1) {
        this.a = v1;
        this.b = s1;
    }

    public int a() {
        return this.a;
    }

    @Override
    public String toString() {
        return this.b;
    }
}

