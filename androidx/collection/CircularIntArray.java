package androidx.collection;

import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.j;

@s0({"SMAP\nCircularIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,213:1\n1#2:214\n26#3:215\n26#3:216\n26#3:217\n26#3:218\n26#3:219\n26#3:220\n26#3:221\n*S KotlinDebug\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n*L\n100#1:215\n113#1:216\n139#1:217\n156#1:218\n169#1:219\n181#1:220\n193#1:221\n*E\n"})
public final class CircularIntArray {
    @l
    private int[] a;
    private int b;
    private int c;
    private int d;

    @j
    public CircularIntArray() {
        this(0, 1, null);
    }

    @j
    public CircularIntArray(int v) {
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
        this.a = new int[v];
    }

    public CircularIntArray(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 8;
        }
        this(v);
    }

    public final void a(int v) {
        int v1 = this.b - 1 & this.d;
        this.b = v1;
        this.a[v1] = v;
        if(v1 == this.c) {
            this.d();
        }
    }

    public final void b(int v) {
        int v1 = this.c;
        this.a[v1] = v;
        int v2 = this.d & v1 + 1;
        this.c = v2;
        if(v2 == this.b) {
            this.d();
        }
    }

    public final void c() {
        this.c = this.b;
    }

    private final void d() {
        int[] arr_v = this.a;
        int v = this.b;
        int v1 = arr_v.length - v;
        int v2 = arr_v.length << 1;
        if(v2 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] arr_v1 = new int[v2];
        kotlin.collections.l.z0(arr_v, arr_v1, 0, v, arr_v.length);
        kotlin.collections.l.z0(this.a, arr_v1, v1, 0, this.b);
        this.a = arr_v1;
        this.b = 0;
        this.c = arr_v.length;
        this.d = v2 - 1;
    }

    public final int e(int v) {
        if(v < 0 || v >= this.m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.a[this.d & this.b + v];
    }

    public final int f() {
        int v = this.b;
        if(v == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.a[v];
    }

    public final int g() {
        int v = this.c;
        if(this.b == v) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.a[v - 1 & this.d];
    }

    public final boolean h() {
        return this.b == this.c;
    }

    public final int i() {
        int v = this.b;
        if(v == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.b = v + 1 & this.d;
        return this.a[v];
    }

    public final int j() {
        int v = this.c;
        if(this.b == v) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int v1 = this.d & v - 1;
        this.c = v1;
        return this.a[v1];
    }

    public final void k(int v) {
        if(v <= 0) {
            return;
        }
        if(v > this.m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.c = this.d & this.c - v;
    }

    public final void l(int v) {
        if(v <= 0) {
            return;
        }
        if(v > this.m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.b = this.d & this.b + v;
    }

    public final int m() {
        return this.c - this.b & this.d;
    }
}

