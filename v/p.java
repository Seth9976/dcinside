package V;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class p {
    @c("title")
    @m
    private final String a;
    @c("date")
    private final long b;
    @c("posts")
    @l
    private final q[] c;

    public p(@m String s, long v, @l q[] arr_q) {
        L.p(arr_q, "postList");
        super();
        this.a = s;
        this.b = v;
        this.c = arr_q;
    }

    @l
    public final q[] a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    @m
    public final String c() {
        return this.a;
    }
}

