package V;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import y4.l;

public final class u {
    @c("detailIdx")
    private final int a;
    @c("customTag")
    @l
    private final String b;

    public u(int v, @l String s) {
        L.p(s, "customTag");
        super();
        this.a = v;
        this.b = s;
    }

    @l
    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }
}

