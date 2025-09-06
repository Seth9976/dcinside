package org.slf4j.helpers;

public class d {
    private String a;
    private Throwable b;
    private Object[] c;
    public static d d;

    static {
        d.d = new d(null);
    }

    public d(String s) {
        this(s, null, null);
    }

    public d(String s, Object[] arr_object, Throwable throwable0) {
        this.a = s;
        this.b = throwable0;
        this.c = arr_object;
    }

    public Object[] a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    public Throwable c() {
        return this.b;
    }
}

