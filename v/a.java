package V;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import y4.l;

public final class a {
    @c("type")
    private final int a;
    @c("names")
    @l
    private final String[] b;

    public a(int v, @l String[] arr_s) {
        L.p(arr_s, "names");
        super();
        this.a = v;
        this.b = arr_s;
    }

    @l
    public final String[] a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }
}

