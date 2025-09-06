package V;

import com.google.gson.annotations.c;
import y4.m;

public final class i {
    @c("galleryName")
    @m
    private final String a;
    @c("galleryId")
    @m
    private final String b;
    @c("keywords")
    @m
    private final String[] c;

    public i(@m String s, @m String s1, @m String[] arr_s) {
        this.a = s;
        this.b = s1;
        this.c = arr_s;
    }

    @m
    public final String a() {
        return this.b;
    }

    @m
    public final String b() {
        return this.a;
    }

    @m
    public final String[] c() {
        return this.c;
    }
}

