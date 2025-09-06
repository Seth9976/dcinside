package V;

import com.google.gson.annotations.c;
import y4.m;

public final class e {
    @c("blockDate")
    private final long a;
    @c("imageUrl")
    @m
    private final String b;

    public e(long v, @m String s) {
        this.a = v;
        this.b = s;
    }

    public final long a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.b;
    }
}

