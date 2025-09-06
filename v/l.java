package V;

import com.google.gson.annotations.c;
import y4.m;

public final class l {
    @c("config")
    @m
    private final V.m a;
    @c("keywords")
    @m
    private final i[] b;
    @c("articles")
    @m
    private final b[] c;
    @c("galleries")
    @m
    private final o[] d;
    @c("notices")
    @m
    private final o[] e;
    @c("users")
    @m
    private final o[] f;

    public l(@m V.m m0, @m i[] arr_i, @m b[] arr_b, @m o[] arr_o, @m o[] arr_o1, @m o[] arr_o2) {
        this.a = m0;
        this.b = arr_i;
        this.c = arr_b;
        this.d = arr_o;
        this.e = arr_o1;
        this.f = arr_o2;
    }

    @m
    public final b[] a() {
        return this.c;
    }

    @m
    public final V.m b() {
        return this.a;
    }

    @m
    public final o[] c() {
        return this.d;
    }

    @m
    public final i[] d() {
        return this.b;
    }

    @m
    public final o[] e() {
        return this.e;
    }

    @m
    public final o[] f() {
        return this.f;
    }
}

