package androidx.collection;

import androidx.annotation.IntRange;
import java.util.Arrays;
import kotlin.collections.l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;

@s0({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n+ 2 FloatList.kt\nandroidx/collection/FloatList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13614#3,2:972\n1687#3,6:983\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
public final class MutableFloatList extends FloatList {
    public MutableFloatList() {
        this(0, 1, null);
    }

    public MutableFloatList(int v) {
        super(v, null);
    }

    public MutableFloatList(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 16;
        }
        this(v);
    }

    public final void W(@IntRange(from = 0L) int v, float f) {
        if(v >= 0) {
            int v1 = this.b;
            if(v <= v1) {
                this.d0(v1 + 1);
                float[] arr_f = this.a;
                int v2 = this.b;
                if(v != v2) {
                    l.y0(arr_f, arr_f, v + 1, v, v2);
                }
                arr_f[v] = f;
                ++this.b;
                return;
            }
        }
        throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + this.b);
    }

    public final boolean X(float f) {
        this.d0(this.b + 1);
        int v = this.b;
        this.a[v] = f;
        this.b = v + 1;
        return true;
    }

    public final boolean Y(@IntRange(from = 0L) int v, @y4.l FloatList floatList0) {
        L.p(floatList0, "elements");
        if(v < 0 || v > this.b) {
            throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + this.b);
        }
        if(floatList0.B()) {
            return false;
        }
        this.d0(this.b + floatList0.b);
        float[] arr_f = this.a;
        int v1 = this.b;
        if(v != v1) {
            l.y0(arr_f, arr_f, floatList0.b + v, v, v1);
        }
        l.y0(floatList0.a, arr_f, v, 0, floatList0.b);
        this.b += floatList0.b;
        return true;
    }

    public final boolean Z(@IntRange(from = 0L) int v, @y4.l float[] arr_f) {
        L.p(arr_f, "elements");
        if(v >= 0) {
            int v1 = this.b;
            if(v <= v1) {
                if(arr_f.length == 0) {
                    return false;
                }
                this.d0(v1 + arr_f.length);
                float[] arr_f1 = this.a;
                int v2 = this.b;
                if(v != v2) {
                    l.y0(arr_f1, arr_f1, arr_f.length + v, v, v2);
                }
                l.H0(arr_f, arr_f1, v, 0, 0, 12, null);
                this.b += arr_f.length;
                return true;
            }
        }
        throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + this.b);
    }

    public final boolean a0(@y4.l FloatList floatList0) {
        L.p(floatList0, "elements");
        return this.Y(this.b, floatList0);
    }

    public final boolean b0(@y4.l float[] arr_f) {
        L.p(arr_f, "elements");
        return this.Z(this.b, arr_f);
    }

    public final void c0() {
        this.b = 0;
    }

    public final void d0(int v) {
        float[] arr_f = this.a;
        if(arr_f.length < v) {
            float[] arr_f1 = Arrays.copyOf(arr_f, Math.max(v, arr_f.length * 3 / 2));
            L.o(arr_f1, "copyOf(this, newSize)");
            this.a = arr_f1;
        }
    }

    public final int e0() {
        return this.a.length;
    }

    public final void f0(float f) {
        this.l0(f);
    }

    public final void g0(@y4.l FloatList floatList0) {
        L.p(floatList0, "elements");
        float[] arr_f = floatList0.a;
        int v = floatList0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            this.l0(arr_f[v1]);
        }
    }

    public final void h0(@y4.l float[] arr_f) {
        L.p(arr_f, "elements");
        for(int v = 0; v < arr_f.length; ++v) {
            this.l0(arr_f[v]);
        }
    }

    public final void i0(float f) {
        this.X(f);
    }

    public final void j0(@y4.l FloatList floatList0) {
        L.p(floatList0, "elements");
        this.Y(this.b, floatList0);
    }

    public final void k0(@y4.l float[] arr_f) {
        L.p(arr_f, "elements");
        this.Z(this.b, arr_f);
    }

    public final boolean l0(float f) {
        int v = this.y(f);
        if(v >= 0) {
            this.o0(v);
            return true;
        }
        return false;
    }

    public final boolean m0(@y4.l FloatList floatList0) {
        L.p(floatList0, "elements");
        int v = this.b;
        int v1 = floatList0.b - 1;
        if(v1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                this.l0(floatList0.s(v2));
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v != this.b;
    }

    public final boolean n0(@y4.l float[] arr_f) {
        L.p(arr_f, "elements");
        int v = this.b;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            this.l0(arr_f[v1]);
        }
        return v != this.b;
    }

    public final float o0(@IntRange(from = 0L) int v) {
        if(v >= 0) {
            int v1 = this.b;
            if(v < v1) {
                float[] arr_f = this.a;
                float f = arr_f[v];
                if(v != v1 - 1) {
                    l.y0(arr_f, arr_f, v, v + 1, v1);
                }
                --this.b;
                return f;
            }
        }
        throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + (this.b - 1));
    }

    public final void p0(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1) {
        if(v >= 0) {
            int v2 = this.b;
            if(v <= v2 && v1 >= 0 && v1 <= v2) {
                if(v1 < v) {
                    throw new IllegalArgumentException("Start (" + v + ") is more than end (" + v1 + ')');
                }
                if(v1 != v) {
                    if(v1 < v2) {
                        l.y0(this.a, this.a, v, v1, v2);
                    }
                    this.b -= v1 - v;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException("Start (" + v + ") and end (" + v1 + ") must be in 0.." + this.b);
    }

    public final boolean q0(@y4.l FloatList floatList0) {
        L.p(floatList0, "elements");
        int v = this.b;
        float[] arr_f = this.a;
        for(int v1 = v - 1; -1 < v1; --v1) {
            if(!floatList0.c(arr_f[v1])) {
                this.o0(v1);
            }
        }
        return v != this.b;
    }

    public final boolean r0(@y4.l float[] arr_f) {
        int v2;
        L.p(arr_f, "elements");
        int v = this.b;
        float[] arr_f1 = this.a;
        for(int v1 = v - 1; true; --v1) {
            v2 = 0;
            int v3 = -1;
            if(-1 >= v1) {
                break;
            }
            float f = arr_f1[v1];
            while(v2 < arr_f.length) {
                if(arr_f[v2] == f) {
                    v3 = v2;
                    break;
                }
                ++v2;
            }
            if(v3 < 0) {
                this.o0(v1);
            }
        }
        if(v != this.b) {
            v2 = 1;
        }
        return v2 != 0;
    }

    public final float s0(@IntRange(from = 0L) int v, float f) {
        if(v < 0 || v >= this.b) {
            throw new IndexOutOfBoundsException("set index " + v + " must be between 0 .. " + (this.b - 1));
        }
        float[] arr_f = this.a;
        float f1 = arr_f[v];
        arr_f[v] = f;
        return f1;
    }

    public final void t0() {
        l.N3(this.a, 0, this.b);
    }

    public final void u0() {
        l.yu(this.a, 0, this.b);
    }

    public final void v0(int v) {
        int v1 = Math.max(v, this.b);
        float[] arr_f = this.a;
        if(arr_f.length > v1) {
            float[] arr_f1 = Arrays.copyOf(arr_f, v1);
            L.o(arr_f1, "copyOf(this, newSize)");
            this.a = arr_f1;
        }
    }

    public static void w0(MutableFloatList mutableFloatList0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = mutableFloatList0.b;
        }
        mutableFloatList0.v0(v);
    }
}

