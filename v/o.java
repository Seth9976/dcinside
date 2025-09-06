package V;

import com.google.gson.annotations.c;
import java.util.List;
import y4.m;

public final class o {
    @c("galleryName")
    @m
    private final String a;
    @c("galleryId")
    @m
    private final String b;
    @c("user")
    @m
    private final List c;

    public o(@m String s, @m String s1, @m List list0) {
        this.a = s;
        this.b = s1;
        this.c = list0;
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
    public final List c() {
        return this.c;
    }
}

