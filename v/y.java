package V;

import com.google.gson.annotations.c;
import y4.m;

public final class y {
    @c("gall_ko_name")
    @m
    private final String a;
    @c("gallery_id")
    @m
    private final String b;
    @c("keyword")
    @m
    private final String[] c;

    public y(@m String s, @m String s1, @m String[] arr_s) {
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

