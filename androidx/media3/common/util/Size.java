package androidx.media3.common.util;

import androidx.annotation.Nullable;

@UnstableApi
public final class Size {
    private final int a;
    private final int b;
    public static final Size c;
    public static final Size d;

    static {
        Size.c = new Size(-1, -1);
        Size.d = new Size(0, 0);
    }

    public Size(int v, int v1) {
        Assertions.a((v == -1 || v >= 0) && (v1 == -1 || v1 >= 0));
        this.a = v;
        this.b = v1;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 == null) {
            return false;
        }
        return this == object0 ? true : object0 instanceof Size && this.a == ((Size)object0).a && this.b == ((Size)object0).b;
    }

    @Override
    public int hashCode() {
        return this.b ^ (this.a >>> 16 | this.a << 16);
    }

    @Override
    public String toString() {
        return this.a + "x" + this.b;
    }
}

