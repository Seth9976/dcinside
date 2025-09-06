package androidx.compose.ui.text.android;

import kotlin.jvm.internal.L;
import y4.l;

final class HorizontalPositionCache {
    @l
    private final TextLayout a;
    private int b;
    private float c;

    public HorizontalPositionCache(@l TextLayout textLayout0) {
        L.p(textLayout0, "layout");
        super();
        this.a = textLayout0;
        this.b = -1;
    }

    private final float a(int v, boolean z, boolean z1, boolean z2) {
        boolean z3;
        int v1 = 1;
        if(z) {
            int v2 = LayoutCompatKt.a(this.a.j(), v, true);
            z3 = v != this.a.A(v2) && v != this.a.u(v2) ? false : true;
        }
        else {
            z3 = false;
        }
        if(!z2) {
            v1 = z3 ? 2 : 3;
        }
        else if(z3) {
            v1 = 0;
        }
        int v3 = v * 4 + v1;
        if(this.b == v3) {
            return this.c;
        }
        float f = z2 ? this.a.I(v, z) : this.a.K(v, z);
        if(z1) {
            this.b = v3;
            this.c = f;
        }
        return f;
    }

    @l
    public final TextLayout b() {
        return this.a;
    }

    public final float c(int v) {
        return this.a(v, false, false, true);
    }

    public final float d(int v) {
        return this.a(v, true, true, true);
    }

    public final float e(int v) {
        return this.a(v, false, false, false);
    }

    public final float f(int v) {
        return this.a(v, true, true, false);
    }
}

