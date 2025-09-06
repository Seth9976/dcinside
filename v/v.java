package V;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.w;
import y4.m;

public final class v {
    @c("userId")
    @m
    private String a;
    @c("nickname")
    @m
    private String b;

    public v() {
        this(null, null, 3, null);
    }

    public v(@m String s, @m String s1) {
        this.a = s;
        this.b = s1;
    }

    public v(String s, String s1, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        this(s, s1);
    }

    @m
    public final String a() {
        return this.b;
    }

    @m
    public final String b() {
        return this.a;
    }

    public final void c(@m String s) {
        this.b = s;
    }

    public final void d(@m String s) {
        this.a = s;
    }
}

