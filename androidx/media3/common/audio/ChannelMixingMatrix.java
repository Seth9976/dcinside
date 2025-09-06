package androidx.media3.common.audio;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class ChannelMixingMatrix {
    private final int a;
    private final int b;
    private final float[] c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public ChannelMixingMatrix(int v, int v1, float[] arr_f) {
        boolean z = false;
        Assertions.b(v > 0, "Input channel count must be positive.");
        Assertions.b(v1 > 0, "Output channel count must be positive.");
        Assertions.b(arr_f.length == v * v1, "Coefficient array length is invalid.");
        this.a = v;
        this.b = v1;
        this.c = ChannelMixingMatrix.a(arr_f);
        boolean z1 = true;
        boolean z2 = true;
        boolean z3 = true;
        for(int v2 = 0; v2 < v; ++v2) {
            for(int v3 = 0; v3 < v1; ++v3) {
                float f = this.e(v2, v3);
                boolean z4 = v2 == v3;
                if(f != 1.0f && z4) {
                    z3 = false;
                }
                if(f != 0.0f) {
                    z1 = false;
                    if(!z4) {
                        z2 = false;
                    }
                }
            }
        }
        this.d = z1;
        boolean z5 = this.j() && z2;
        this.e = z5;
        if(z5 && z3) {
            z = true;
        }
        this.f = z;
    }

    private static float[] a(float[] arr_f) {
        for(int v = 0; v < arr_f.length; ++v) {
            if(arr_f[v] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + v + " is negative.");
            }
        }
        return arr_f;
    }

    public static ChannelMixingMatrix b(int v, int v1) {
        return new ChannelMixingMatrix(v, v1, ChannelMixingMatrix.c(v, v1));
    }

    private static float[] c(int v, int v1) {
        if(v == v1) {
            return ChannelMixingMatrix.g(v1);
        }
        if(v == 1 && v1 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if(v != 2 || v1 != 1) {
            throw new UnsupportedOperationException("Default channel mixing coefficients for " + v + "->" + v1 + " are not yet implemented.");
        }
        return new float[]{0.5f, 0.5f};
    }

    public int d() {
        return this.a;
    }

    public float e(int v, int v1) {
        return this.c[v * this.b + v1];
    }

    public int f() {
        return this.b;
    }

    private static float[] g(int v) {
        float[] arr_f = new float[v * v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_f[v * v1 + v1] = 1.0f;
        }
        return arr_f;
    }

    public boolean h() {
        return this.e;
    }

    public boolean i() {
        return this.f;
    }

    public boolean j() {
        return this.a == this.b;
    }

    public boolean k() {
        return this.d;
    }

    public ChannelMixingMatrix l(float f) {
        float[] arr_f = new float[this.c.length];
        for(int v = 0; true; ++v) {
            float[] arr_f1 = this.c;
            if(v >= arr_f1.length) {
                break;
            }
            arr_f[v] = arr_f1[v] * f;
        }
        return new ChannelMixingMatrix(this.a, this.b, arr_f);
    }
}

