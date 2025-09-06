package V;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import y4.l;

public final class h {
    @c("galleryId")
    @l
    private final String a;
    @c("isEnable")
    private final boolean b;
    @c("type")
    private final int c;
    @c("words")
    @l
    private final String[] d;

    public h(@l String s, boolean z, int v, @l String[] arr_s) {
        L.p(s, "galleryId");
        L.p(arr_s, "words");
        super();
        this.a = s;
        this.b = z;
        this.c = v;
        this.d = arr_s;
    }

    @l
    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    @l
    public final String[] c() {
        return this.d;
    }

    public final boolean d() {
        return this.b;
    }
}

