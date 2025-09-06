package V;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class j {
    @c("galleryId")
    @l
    private final String a;
    @c("value")
    @l
    private final String[] b;
    @c("memo")
    @l
    private final String[] c;
    @c("color")
    @m
    private final String[] d;

    public j(@l String s, @l String[] arr_s, @l String[] arr_s1, @m String[] arr_s2) {
        L.p(s, "galleryId");
        L.p(arr_s, "value");
        L.p(arr_s1, "memo");
        super();
        this.a = s;
        this.b = arr_s;
        this.c = arr_s1;
        this.d = arr_s2;
    }

    @m
    public final String[] a() {
        return this.d;
    }

    @l
    public final String b() {
        return this.a;
    }

    @l
    public final String[] c() {
        return this.c;
    }

    @l
    public final String[] d() {
        return this.b;
    }
}

