package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import y4.l;
import y4.m;

@Immutable
public final class InsetsValues {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public InsetsValues(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof InsetsValues ? this.a == ((InsetsValues)object0).a && this.b == ((InsetsValues)object0).b && this.c == ((InsetsValues)object0).c && this.d == ((InsetsValues)object0).d : false;
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Override
    @l
    public String toString() {
        return "InsetsValues(left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ')';
    }
}

