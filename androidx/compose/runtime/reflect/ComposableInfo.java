package androidx.compose.runtime.reflect;

import y4.l;
import y4.m;

public final class ComposableInfo {
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;

    public ComposableInfo(boolean z, int v, int v1, int v2) {
        this.a = z;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    public final boolean a() {
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

    @l
    public final ComposableInfo e(boolean z, int v, int v1, int v2) {
        return new ComposableInfo(z, v, v1, v2);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ComposableInfo)) {
            return false;
        }
        if(this.a != ((ComposableInfo)object0).a) {
            return false;
        }
        if(this.b != ((ComposableInfo)object0).b) {
            return false;
        }
        return this.c == ((ComposableInfo)object0).c ? this.d == ((ComposableInfo)object0).d : false;
    }

    public static ComposableInfo f(ComposableInfo composableInfo0, boolean z, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            z = composableInfo0.a;
        }
        if((v3 & 2) != 0) {
            v = composableInfo0.b;
        }
        if((v3 & 4) != 0) {
            v1 = composableInfo0.c;
        }
        if((v3 & 8) != 0) {
            v2 = composableInfo0.d;
        }
        return composableInfo0.e(z, v, v1, v2);
    }

    public final int g() {
        return this.c;
    }

    public final int h() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = this.a;
        if(v) {
            v = 1;
        }
        return ((v * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    public final int i() {
        return this.b;
    }

    public final boolean j() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "ComposableInfo(isComposable=" + this.a + ", realParamsCount=" + this.b + ", changedParams=" + this.c + ", defaultParams=" + this.d + ')';
    }
}

