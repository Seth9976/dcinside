package androidx.compose.foundation.lazy.layout;

import A3.o;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@ExperimentalFoundationApi
@s0({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    @l
    private final LazyLayoutItemContentFactory a;
    @l
    private final SubcomposeMeasureScope b;
    @l
    private final HashMap c;

    public LazyLayoutMeasureScopeImpl(@l LazyLayoutItemContentFactory lazyLayoutItemContentFactory0, @l SubcomposeMeasureScope subcomposeMeasureScope0) {
        L.p(lazyLayoutItemContentFactory0, "itemContentFactory");
        L.p(subcomposeMeasureScope0, "subcomposeMeasureScope");
        super();
        this.a = lazyLayoutItemContentFactory0;
        this.b = subcomposeMeasureScope0;
        this.c = new HashMap();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public float C(int v) {
        return this.b.C(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public float D(float f) {
        return this.b.D(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int E1(long v) {
        return this.b.E1(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    @l
    public Rect H0(@l DpRect dpRect0) {
        L.p(dpRect0, "<this>");
        return this.b.H0(dpRect0);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public long J(long v) {
        return this.b.J(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public long M(float f) {
        return this.b.M(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int b1(float f) {
        return this.b.b1(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float g1(long v) {
        return this.b.g1(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.b.getDensity();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    @l
    public LayoutDirection getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    @l
    public List i0(int v, long v1) {
        List list0 = (List)this.c.get(v);
        if(list0 == null) {
            Object object0 = ((LazyLayoutItemProvider)this.a.d().invoke()).D(v);
            o o0 = this.a.b(v, object0);
            List list1 = this.b.d0(object0, o0);
            int v2 = list1.size();
            ArrayList arrayList0 = new ArrayList(v2);
            for(int v3 = 0; v3 < v2; ++v3) {
                arrayList0.add(((Measurable)list1.get(v3)).r1(v1));
            }
            this.c.put(v, arrayList0);
            return arrayList0;
        }
        return list0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public long m(long v) {
        return this.b.m(v);
    }

    @Override  // androidx.compose.ui.layout.MeasureScope
    @l
    public MeasureResult o1(int v, int v1, @l Map map0, @l Function1 function10) {
        L.p(map0, "alignmentLines");
        L.p(function10, "placementBlock");
        return this.b.o1(v, v1, map0, function10);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public float p(long v) {
        return this.b.p(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public long r(int v) {
        return this.b.r(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public long s(float f) {
        return this.b.s(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float w1() {
        return this.b.w1();
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float y1(float f) {
        return this.b.y1(f);
    }
}

