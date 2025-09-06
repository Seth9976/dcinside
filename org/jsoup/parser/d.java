package org.jsoup.parser;

public class d {
    private final int a;
    private final String b;
    private final String c;

    d(int v, String s) {
        this.a = v;
        this.b = String.valueOf(v);
        this.c = s;
    }

    d(int v, String s, Object[] arr_object) {
        this.a = v;
        this.b = String.valueOf(v);
        this.c = String.format(s, arr_object);
    }

    d(a a0, String s) {
        this.a = a0.P();
        this.b = a0.Q();
        this.c = s;
    }

    d(a a0, String s, Object[] arr_object) {
        this.a = a0.P();
        this.b = a0.Q();
        this.c = String.format(s, arr_object);
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    @Override
    public String toString() {
        return "<" + this.b + ">: " + this.c;
    }
}

