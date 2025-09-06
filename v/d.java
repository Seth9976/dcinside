package V;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class d {
    @c("groupIndex")
    private final long a;
    @c("groupName")
    @m
    private final String b;
    @c("groupImageUrl")
    @m
    private final String c;
    @c("dcConList")
    @l
    private final e[] d;
    @c("groupTotalCount")
    private final int e;

    public d(long v, @m String s, @m String s1, @l e[] arr_e, int v1) {
        L.p(arr_e, "dcConList");
        super();
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = arr_e;
        this.e = v1;
    }

    public d(long v, String s, String s1, e[] arr_e, int v1, int v2, w w0) {
        this(v, s, s1, arr_e, ((v2 & 16) == 0 ? v1 : 0));
    }

    @l
    public final e[] a() {
        return this.d;
    }

    @m
    public final String b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    @m
    public final String d() {
        return this.b;
    }

    public final int e() {
        return this.e;
    }
}

