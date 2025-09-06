package androidx.collection;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.j;

@s0({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,270:1\n1#2:271\n26#3:272\n26#3:273\n26#3:274\n26#3:275\n26#3:276\n26#3:277\n26#3:278\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n104#1:272\n122#1:273\n152#1:274\n187#1:275\n221#1:276\n235#1:277\n249#1:278\n*E\n"})
public final class CircularArray {
    @l
    private Object[] a;
    private int b;
    private int c;
    private int d;

    @j
    public CircularArray() {
        this(0, 1, null);
    }

    @j
    public CircularArray(int v) {
        if(v < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if(v > 0x40000000) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        if(Integer.bitCount(v) != 1) {
            v = Integer.highestOneBit(v - 1) << 1;
        }
        this.d = v - 1;
        this.a = new Object[v];
    }

    public CircularArray(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 8;
        }
        this(v);
    }

    public final void a(Object object0) {
        int v = this.b - 1 & this.d;
        this.b = v;
        this.a[v] = object0;
        if(v == this.c) {
            this.d();
        }
    }

    public final void b(Object object0) {
        int v = this.c;
        this.a[v] = object0;
        int v1 = this.d & v + 1;
        this.c = v1;
        if(v1 == this.b) {
            this.d();
        }
    }

    public final void c() {
        this.l(this.m());
    }

    private final void d() {
        Object[] arr_object = this.a;
        int v = this.b;
        int v1 = arr_object.length - v;
        int v2 = arr_object.length << 1;
        if(v2 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        Object[] arr_object1 = new Object[v2];
        kotlin.collections.l.B0(arr_object, arr_object1, 0, v, arr_object.length);
        kotlin.collections.l.B0(this.a, arr_object1, v1, 0, this.b);
        this.a = arr_object1;
        this.b = 0;
        this.c = arr_object.length;
        this.d = v2 - 1;
    }

    public final Object e(int v) {
        if(v < 0 || v >= this.m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object object0 = this.a[this.d & this.b + v];
        L.m(object0);
        return object0;
    }

    public final Object f() {
        int v = this.b;
        if(v == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object object0 = this.a[v];
        L.m(object0);
        return object0;
    }

    public final Object g() {
        int v = this.c;
        if(this.b == v) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object object0 = this.a[v - 1 & this.d];
        L.m(object0);
        return object0;
    }

    public final boolean h() {
        return this.b == this.c;
    }

    public final Object i() {
        int v = this.b;
        if(v == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object[] arr_object = this.a;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        this.b = v + 1 & this.d;
        return object0;
    }

    public final Object j() {
        int v = this.c;
        if(this.b == v) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int v1 = this.d & v - 1;
        Object[] arr_object = this.a;
        Object object0 = arr_object[v1];
        arr_object[v1] = null;
        this.c = v1;
        return object0;
    }

    public final void k(int v) {
        if(v <= 0) {
            return;
        }
        if(v > this.m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int v1 = this.c;
        int v2 = v >= v1 ? 0 : v1 - v;
        for(int v3 = v2; v3 < v1; ++v3) {
            this.a[v3] = null;
        }
        int v4 = this.c - v2;
        int v5 = v - v4;
        this.c -= v4;
        if(v5 > 0) {
            int v6 = this.a.length;
            this.c = v6;
            int v7 = v6 - v5;
            for(int v8 = v7; v8 < v6; ++v8) {
                this.a[v8] = null;
            }
            this.c = v7;
        }
    }

    public final void l(int v) {
        if(v <= 0) {
            return;
        }
        if(v > this.m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int v1 = this.a.length;
        int v2 = this.b;
        if(v < v1 - v2) {
            v1 = v2 + v;
        }
        while(v2 < v1) {
            this.a[v2] = null;
            ++v2;
        }
        int v3 = v1 - this.b;
        int v4 = v - v3;
        this.b = this.d & this.b + v3;
        if(v4 > 0) {
            for(int v5 = 0; v5 < v4; ++v5) {
                this.a[v5] = null;
            }
            this.b = v4;
        }
    }

    public final int m() {
        return this.c - this.b & this.d;
    }
}

