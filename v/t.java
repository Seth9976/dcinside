package V;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import y4.l;

public final class t {
    @c("packageIdx")
    private final int a;
    @c("dcconTagList")
    @l
    private final u[] b;

    public t(int v, @l u[] arr_u) {
        L.p(arr_u, "dcconTagList");
        super();
        this.a = v;
        this.b = arr_u;
    }

    @l
    public final u[] a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }
}

