package V;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import y4.l;

public final class f {
    @c("key")
    @l
    private final String a;
    @c("id")
    @l
    private final String b;
    @c("name")
    @l
    private final String c;
    @c("order")
    private final int d;
    @c("type")
    private final int e;

    public f(@l String s, @l String s1, @l String s2, int v, int v1) {
        L.p(s, "key");
        L.p(s1, "id");
        L.p(s2, "name");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = v;
        this.e = v1;
    }

    public final int a() {
        return this.e;
    }

    @l
    public final String b() {
        return this.b;
    }

    @l
    public final String c() {
        return this.a;
    }

    @l
    public final String d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }
}

