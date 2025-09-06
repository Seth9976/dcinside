package androidx.compose.ui.input.pointer.util;

import kotlin.jvm.internal.L;
import y4.l;

final class Vector {
    private final int a;
    @l
    private final Float[] b;

    public Vector(int v) {
        this.a = v;
        Float[] arr_float = new Float[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_float[v1] = 0.0f;
        }
        this.b = arr_float;
    }

    public final float a(int v) {
        return (float)this.b[v];
    }

    @l
    public final Float[] b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final float d() {
        return (float)Math.sqrt(this.f(this));
    }

    public final void e(int v, float f) {
        this.b[v] = f;
    }

    public final float f(@l Vector vector0) {
        L.p(vector0, "a");
        int v = this.a;
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            f += this.a(v1) * vector0.a(v1);
        }
        return f;
    }
}

