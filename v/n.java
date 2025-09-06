package V;

import com.google.gson.annotations.c;
import y4.m;

public final class n {
    @c("id")
    @m
    private String a;
    @c("name")
    @m
    private String b;
    @c("time")
    private long c;
    @c("type")
    private int d;
    @c("pin")
    private int e;

    public n(@m String s, @m String s1, long v, int v1, int v2) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = v1;
        this.e = v2;
    }

    @m
    public final String a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final long e() {
        return this.c;
    }

    public final void f(@m String s) {
        this.a = s;
    }

    public final void g(@m String s) {
        this.b = s;
    }

    public final void h(int v) {
        this.d = v;
    }

    public final void i(int v) {
        this.e = v;
    }

    public final void j(long v) {
        this.c = v;
    }
}

