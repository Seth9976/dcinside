package androidx.compose.foundation.lazy;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyListBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,126:1\n1182#2:127\n1161#2,2:128\n460#3,11:130\n460#3,11:141\n*S KotlinDebug\n*F\n+ 1 LazyListBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo\n*L\n51#1:127\n51#1:128,2\n87#1:130,11\n102#1:141,11\n*E\n"})
public final class LazyListBeyondBoundsInfo {
    public static final class Interval {
        private final int a;
        private final int b;

        public Interval(int v, int v1) {
            this.a = v;
            this.b = v1;
            if(v < 0 || v1 < v) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        @l
        public final Interval c(int v, int v1) {
            return new Interval(v, v1);
        }

        public static Interval d(Interval lazyListBeyondBoundsInfo$Interval0, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = lazyListBeyondBoundsInfo$Interval0.a;
            }
            if((v2 & 2) != 0) {
                v1 = lazyListBeyondBoundsInfo$Interval0.b;
            }
            return lazyListBeyondBoundsInfo$Interval0.c(v, v1);
        }

        public final int e() {
            return this.b;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Interval)) {
                return false;
            }
            return this.a == ((Interval)object0).a ? this.b == ((Interval)object0).b : false;
        }

        public final int f() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a * 0x1F + this.b;
        }

        @Override
        @l
        public String toString() {
            return "Interval(start=" + this.a + ", end=" + this.b + ')';
        }
    }

    @l
    private final MutableVector a;

    public LazyListBeyondBoundsInfo() {
        this.a = new MutableVector(new Interval[16], 0);
    }

    @l
    public final Interval a(int v, int v1) {
        Interval lazyListBeyondBoundsInfo$Interval0 = new Interval(v, v1);
        this.a.b(lazyListBeyondBoundsInfo$Interval0);
        return lazyListBeyondBoundsInfo$Interval0;
    }

    public final int b() {
        int v = ((Interval)this.a.s()).e();
        MutableVector mutableVector0 = this.a;
        int v1 = mutableVector0.J();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.F();
            int v2 = 0;
            while(true) {
                Interval lazyListBeyondBoundsInfo$Interval0 = (Interval)arr_object[v2];
                if(lazyListBeyondBoundsInfo$Interval0.e() > v) {
                    v = lazyListBeyondBoundsInfo$Interval0.e();
                }
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        return v;
    }

    public final int c() {
        int v = ((Interval)this.a.s()).f();
        MutableVector mutableVector0 = this.a;
        int v1 = mutableVector0.J();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.F();
            int v2 = 0;
            while(true) {
                Interval lazyListBeyondBoundsInfo$Interval0 = (Interval)arr_object[v2];
                if(lazyListBeyondBoundsInfo$Interval0.f() < v) {
                    v = lazyListBeyondBoundsInfo$Interval0.f();
                }
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        if(v < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return v;
    }

    public final boolean d() {
        return this.a.O();
    }

    public final void e(@l Interval lazyListBeyondBoundsInfo$Interval0) {
        L.p(lazyListBeyondBoundsInfo$Interval0, "interval");
        this.a.a0(lazyListBeyondBoundsInfo$Interval0);
    }
}

