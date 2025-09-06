package Q;

import com.google.gson.annotations.c;
import y4.m;

public final class b {
    @c("name")
    @m
    private final String a;
    @c("id")
    @m
    private final String b;
    @c("per")
    private final int c;

    public b(@m String s, @m String s1, int v) {
        this.a = s;
        this.b = s1;
        this.c = v;
    }

    @m
    public final String a() {
        return this.b;
    }

    @m
    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }
}

