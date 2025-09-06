package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@s0({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,216:1\n1182#2:217\n1161#2,2:218\n523#3:220\n523#3:221\n523#3:222\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n*L\n98#1:217\n98#1:218,2\n150#1:220\n152#1:221\n169#1:222\n*E\n"})
public final class MutableIntervalList implements IntervalList {
    @l
    private final MutableVector a;
    private int b;
    @m
    private Interval c;
    public static final int d = 8;

    static {
    }

    public MutableIntervalList() {
        this.a = new MutableVector(new Interval[16], 0);
    }

    @Override  // androidx.compose.foundation.lazy.layout.IntervalList
    public void a(int v, int v1, @l Function1 function10) {
        L.p(function10, "block");
        this.c(v);
        this.c(v1);
        if(v1 < v) {
            throw new IllegalArgumentException(("toIndex (" + v1 + ") should be not smaller than fromIndex (" + v + ')').toString());
        }
        int v2 = IntervalListKt.b(this.a, v);
        int v3 = ((Interval)this.a.F()[v2]).b();
        while(v3 <= v1) {
            Interval intervalList$Interval0 = (Interval)this.a.F()[v2];
            function10.invoke(intervalList$Interval0);
            v3 += intervalList$Interval0.a();
            ++v2;
        }
    }

    public final void b(int v, Object object0) {
        if(v < 0) {
            throw new IllegalArgumentException(("size should be >=0, but was " + v).toString());
        }
        if(v == 0) {
            return;
        }
        Interval intervalList$Interval0 = new Interval(this.getSize(), v, object0);
        this.b = this.getSize() + v;
        this.a.b(intervalList$Interval0);
    }

    private final void c(int v) {
        if(v < 0 || v >= this.getSize()) {
            throw new IndexOutOfBoundsException("Index " + v + ", size " + this.getSize());
        }
    }

    private final boolean d(Interval intervalList$Interval0, int v) {
        return v < intervalList$Interval0.b() + intervalList$Interval0.a() && intervalList$Interval0.b() <= v;
    }

    private final Interval e(int v) {
        Interval intervalList$Interval0 = this.c;
        if(intervalList$Interval0 == null || !this.d(intervalList$Interval0, v)) {
            intervalList$Interval0 = (Interval)this.a.F()[IntervalListKt.b(this.a, v)];
            this.c = intervalList$Interval0;
        }
        return intervalList$Interval0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.IntervalList
    @l
    public Interval get(int v) {
        this.c(v);
        return this.e(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.b;
    }
}

