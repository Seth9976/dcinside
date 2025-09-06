package androidx.collection;

import androidx.annotation.IntRange;
import java.util.Arrays;
import kotlin.collections.l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;

@s0({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13600#3,2:972\n1663#3,6:983\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
public final class MutableIntList extends IntList {
    public MutableIntList() {
        this(0, 1, null);
    }

    public MutableIntList(int v) {
        super(v, null);
    }

    public MutableIntList(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 16;
        }
        this(v);
    }

    public final void W(@IntRange(from = 0L) int v, int v1) {
        if(v >= 0) {
            int v2 = this.b;
            if(v <= v2) {
                this.d0(v2 + 1);
                int[] arr_v = this.a;
                int v3 = this.b;
                if(v != v3) {
                    l.z0(arr_v, arr_v, v + 1, v, v3);
                }
                arr_v[v] = v1;
                ++this.b;
                return;
            }
        }
        throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + this.b);
    }

    public final boolean X(int v) {
        this.d0(this.b + 1);
        int v1 = this.b;
        this.a[v1] = v;
        this.b = v1 + 1;
        return true;
    }

    public final boolean Y(@IntRange(from = 0L) int v, @y4.l IntList intList0) {
        L.p(intList0, "elements");
        if(v < 0 || v > this.b) {
            throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + this.b);
        }
        if(intList0.B()) {
            return false;
        }
        this.d0(this.b + intList0.b);
        int[] arr_v = this.a;
        int v1 = this.b;
        if(v != v1) {
            l.z0(arr_v, arr_v, intList0.b + v, v, v1);
        }
        l.z0(intList0.a, arr_v, v, 0, intList0.b);
        this.b += intList0.b;
        return true;
    }

    public final boolean Z(@IntRange(from = 0L) int v, @y4.l int[] arr_v) {
        L.p(arr_v, "elements");
        if(v >= 0) {
            int v1 = this.b;
            if(v <= v1) {
                if(arr_v.length == 0) {
                    return false;
                }
                this.d0(v1 + arr_v.length);
                int[] arr_v1 = this.a;
                int v2 = this.b;
                if(v != v2) {
                    l.z0(arr_v1, arr_v1, arr_v.length + v, v, v2);
                }
                l.I0(arr_v, arr_v1, v, 0, 0, 12, null);
                this.b += arr_v.length;
                return true;
            }
        }
        throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + this.b);
    }

    public final boolean a0(@y4.l IntList intList0) {
        L.p(intList0, "elements");
        return this.Y(this.b, intList0);
    }

    public final boolean b0(@y4.l int[] arr_v) {
        L.p(arr_v, "elements");
        return this.Z(this.b, arr_v);
    }

    public final void c0() {
        this.b = 0;
    }

    public final void d0(int v) {
        int[] arr_v = this.a;
        if(arr_v.length < v) {
            int[] arr_v1 = Arrays.copyOf(arr_v, Math.max(v, arr_v.length * 3 / 2));
            L.o(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
        }
    }

    public final int e0() {
        return this.a.length;
    }

    public final void f0(int v) {
        this.l0(v);
    }

    public final void g0(@y4.l IntList intList0) {
        L.p(intList0, "elements");
        int[] arr_v = intList0.a;
        int v = intList0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            this.l0(arr_v[v1]);
        }
    }

    public final void h0(@y4.l int[] arr_v) {
        L.p(arr_v, "elements");
        for(int v = 0; v < arr_v.length; ++v) {
            this.l0(arr_v[v]);
        }
    }

    public final void i0(int v) {
        this.X(v);
    }

    public final void j0(@y4.l IntList intList0) {
        L.p(intList0, "elements");
        this.Y(this.b, intList0);
    }

    public final void k0(@y4.l int[] arr_v) {
        L.p(arr_v, "elements");
        this.Z(this.b, arr_v);
    }

    public final boolean l0(int v) {
        int v1 = this.y(v);
        if(v1 >= 0) {
            this.o0(v1);
            return true;
        }
        return false;
    }

    public final boolean m0(@y4.l IntList intList0) {
        L.p(intList0, "elements");
        int v = this.b;
        int v1 = intList0.b - 1;
        if(v1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                this.l0(intList0.s(v2));
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v != this.b;
    }

    public final boolean n0(@y4.l int[] arr_v) {
        L.p(arr_v, "elements");
        int v = this.b;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            this.l0(arr_v[v1]);
        }
        return v != this.b;
    }

    public final int o0(@IntRange(from = 0L) int v) {
        if(v >= 0) {
            int v1 = this.b;
            if(v < v1) {
                int[] arr_v = this.a;
                int v2 = arr_v[v];
                if(v != v1 - 1) {
                    l.z0(arr_v, arr_v, v, v + 1, v1);
                }
                --this.b;
                return v2;
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
                        l.z0(this.a, this.a, v, v1, v2);
                    }
                    this.b -= v1 - v;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException("Start (" + v + ") and end (" + v1 + ") must be in 0.." + this.b);
    }

    public final boolean q0(@y4.l IntList intList0) {
        L.p(intList0, "elements");
        int v = this.b;
        int[] arr_v = this.a;
        for(int v1 = v - 1; -1 < v1; --v1) {
            if(!intList0.c(arr_v[v1])) {
                this.o0(v1);
            }
        }
        return v != this.b;
    }

    public final boolean r0(@y4.l int[] arr_v) {
        int v2;
        L.p(arr_v, "elements");
        int v = this.b;
        int[] arr_v1 = this.a;
        for(int v1 = v - 1; true; --v1) {
            v2 = 0;
            int v3 = -1;
            if(-1 >= v1) {
                break;
            }
            int v4 = arr_v1[v1];
            while(v2 < arr_v.length) {
                if(arr_v[v2] == v4) {
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

    public final int s0(@IntRange(from = 0L) int v, int v1) {
        if(v < 0 || v >= this.b) {
            throw new IndexOutOfBoundsException("set index " + v + " must be between 0 .. " + (this.b - 1));
        }
        int[] arr_v = this.a;
        int v2 = arr_v[v];
        arr_v[v] = v1;
        return v2;
    }

    public final void t0() {
        l.P3(this.a, 0, this.b);
    }

    public final void u0() {
        l.Au(this.a, 0, this.b);
    }

    public final void v0(int v) {
        int v1 = Math.max(v, this.b);
        int[] arr_v = this.a;
        if(arr_v.length > v1) {
            int[] arr_v1 = Arrays.copyOf(arr_v, v1);
            L.o(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
        }
    }

    public static void w0(MutableIntList mutableIntList0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = mutableIntList0.b;
        }
        mutableIntList0.v0(v);
    }
}

