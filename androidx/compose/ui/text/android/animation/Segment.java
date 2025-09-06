package androidx.compose.ui.text.android.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
public final class Segment {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    public static final int g;

    static {
    }

    public Segment(int v, int v1, int v2, int v3, int v4, int v5) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Segment)) {
            return false;
        }
        if(this.a != ((Segment)object0).a) {
            return false;
        }
        if(this.b != ((Segment)object0).b) {
            return false;
        }
        if(this.c != ((Segment)object0).c) {
            return false;
        }
        if(this.d != ((Segment)object0).d) {
            return false;
        }
        return this.e == ((Segment)object0).e ? this.f == ((Segment)object0).f : false;
    }

    public final int f() {
        return this.f;
    }

    @l
    public final Segment g(int v, int v1, int v2, int v3, int v4, int v5) {
        return new Segment(v, v1, v2, v3, v4, v5);
    }

    public static Segment h(Segment segment0, int v, int v1, int v2, int v3, int v4, int v5, int v6, Object object0) {
        if((v6 & 1) != 0) {
            v = segment0.a;
        }
        if((v6 & 2) != 0) {
            v1 = segment0.b;
        }
        if((v6 & 4) != 0) {
            v2 = segment0.c;
        }
        if((v6 & 8) != 0) {
            v3 = segment0.d;
        }
        if((v6 & 16) != 0) {
            v4 = segment0.e;
        }
        if((v6 & 0x20) != 0) {
            v5 = segment0.f;
        }
        return segment0.g(v, v1, v2, v3, v4, v5);
    }

    @Override
    public int hashCode() {
        return ((((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f;
    }

    public final int i() {
        return this.f;
    }

    public final int j() {
        return this.b;
    }

    public final int k() {
        return this.c;
    }

    public final int l() {
        return this.e;
    }

    public final int m() {
        return this.a;
    }

    public final int n() {
        return this.d;
    }

    @Override
    @l
    public String toString() {
        return "Segment(startOffset=" + this.a + ", endOffset=" + this.b + ", left=" + this.c + ", top=" + this.d + ", right=" + this.e + ", bottom=" + this.f + ')';
    }
}

