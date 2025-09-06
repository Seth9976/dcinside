package androidx.compose.foundation.lazy.staggeredgrid;

import A3.o;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,157:1\n83#2,3:158\n1114#3,6:161\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n*L\n47#1:158,3\n47#1:161,6\n*E\n"})
public final class LazyStaggeredGridMeasurePolicyKt {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[Orientation.values().length];
            try {
                arr_v[Orientation.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Orientation.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    private static final float d(PaddingValues paddingValues0, Orientation orientation0, boolean z, LayoutDirection layoutDirection0) {
        switch(orientation0) {
            case 1: {
                return z ? paddingValues0.d() : paddingValues0.a();
            }
            case 2: {
                return z ? PaddingKt.i(paddingValues0, layoutDirection0) : PaddingKt.h(paddingValues0, layoutDirection0);
            }
            default: {
                throw new J();
            }
        }
    }

    private static final float e(PaddingValues paddingValues0, Orientation orientation0, boolean z, LayoutDirection layoutDirection0) {
        switch(orientation0) {
            case 1: {
                return z ? paddingValues0.a() : paddingValues0.d();
            }
            case 2: {
                return z ? PaddingKt.h(paddingValues0, layoutDirection0) : PaddingKt.i(paddingValues0, layoutDirection0);
            }
            default: {
                throw new J();
            }
        }
    }

    @ExperimentalFoundationApi
    @Composable
    @l
    public static final o f(@l LazyStaggeredGridState lazyStaggeredGridState0, @l LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider0, @l PaddingValues paddingValues0, boolean z, @l Orientation orientation0, float f, float f1, @l o o0, @m Composer composer0, int v) {
        L.p(lazyStaggeredGridState0, "state");
        L.p(lazyStaggeredGridItemProvider0, "itemProvider");
        L.p(paddingValues0, "contentPadding");
        L.p(orientation0, "orientation");
        L.p(o0, "slotSizesSums");
        composer0.V(0x4DCECE1F);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x4DCECE1F, v, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:37)");
        }
        Object[] arr_object = {lazyStaggeredGridState0, lazyStaggeredGridItemProvider0, paddingValues0, Boolean.valueOf(z), orientation0, Dp.d(f), Dp.d(f1), o0};
        composer0.V(0xDE219177);
        boolean z1 = false;
        for(int v1 = 0; v1 < 8; ++v1) {
            z1 |= composer0.t(arr_object[v1]);
        }
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.rememberStaggeredGridMeasurePolicy.1.1 lazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$10 = composer0.W();
        if(z1 || lazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$10 == Composer.a.a()) {
            lazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$10 = new o(orientation0, o0, lazyStaggeredGridState0, lazyStaggeredGridItemProvider0, paddingValues0, z, f, f1) {
                final Orientation e;
                final o f;
                final LazyStaggeredGridState g;
                final LazyStaggeredGridItemProvider h;
                final PaddingValues i;
                final boolean j;
                final float k;
                final float l;

                {
                    this.e = orientation0;
                    this.f = o0;
                    this.g = lazyStaggeredGridState0;
                    this.h = lazyStaggeredGridItemProvider0;
                    this.i = paddingValues0;
                    this.j = z;
                    this.k = f;
                    this.l = f1;
                    super(2);
                }

                @l
                public final LazyStaggeredGridMeasureResult a(@l LazyLayoutMeasureScope lazyLayoutMeasureScope0, long v) {
                    L.p(lazyLayoutMeasureScope0, "$this$null");
                    CheckScrollableContainerConstraintsKt.a(v, this.e);
                    Constraints constraints0 = Constraints.b(v);
                    Object object0 = this.f.invoke(lazyLayoutMeasureScope0, constraints0);
                    this.g.O(((int[])object0));
                    this.g.S(this.e == Orientation.a);
                    LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider0 = this.h.a();
                    this.g.R(lazyStaggeredGridSpanProvider0);
                    LayoutDirection layoutDirection0 = lazyLayoutMeasureScope0.getLayoutDirection();
                    int v1 = lazyLayoutMeasureScope0.b1(LazyStaggeredGridMeasurePolicyKt.e(this.i, this.e, this.j, layoutDirection0));
                    LayoutDirection layoutDirection1 = lazyLayoutMeasureScope0.getLayoutDirection();
                    int v2 = lazyLayoutMeasureScope0.b1(LazyStaggeredGridMeasurePolicyKt.d(this.i, this.e, this.j, layoutDirection1));
                    LayoutDirection layoutDirection2 = lazyLayoutMeasureScope0.getLayoutDirection();
                    int v3 = lazyLayoutMeasureScope0.b1(LazyStaggeredGridMeasurePolicyKt.g(this.i, this.e, layoutDirection2));
                    int v4 = this.e == Orientation.a ? Constraints.o(v) : Constraints.p(v);
                    LayoutDirection layoutDirection3 = lazyLayoutMeasureScope0.getLayoutDirection();
                    float f = PaddingKt.i(this.i, layoutDirection3);
                    LayoutDirection layoutDirection4 = lazyLayoutMeasureScope0.getLayoutDirection();
                    int v5 = lazyLayoutMeasureScope0.b1(Dp.g(f + PaddingKt.h(this.i, layoutDirection4)));
                    int v6 = lazyLayoutMeasureScope0.b1(Dp.g(this.i.d() + this.i.a()));
                    long v7 = Constraints.e(v, ConstraintsKt.g(v, v5), 0, ConstraintsKt.f(v, v6), 0, 10, null);
                    int v8 = lazyLayoutMeasureScope0.b1(this.k);
                    int v9 = lazyLayoutMeasureScope0.b1(this.l);
                    LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult0 = LazyStaggeredGridMeasureKt.p(lazyLayoutMeasureScope0, this.g, this.h, ((int[])object0), v7, this.e == Orientation.a, this.j, (this.e == Orientation.a ? IntOffsetKt.a(v1, v3) : IntOffsetKt.a(v3, v1)), v4 - v1 - v2, v8, v9, v1, v2);
                    this.g.l(lazyStaggeredGridMeasureResult0);
                    return lazyStaggeredGridMeasureResult0;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((LazyLayoutMeasureScope)object0), ((Constraints)object1).x());
                }
            };
            composer0.O(lazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$10);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$10;
    }

    private static final float g(PaddingValues paddingValues0, Orientation orientation0, LayoutDirection layoutDirection0) {
        switch(orientation0) {
            case 1: {
                return PaddingKt.i(paddingValues0, layoutDirection0);
            }
            case 2: {
                return paddingValues0.d();
            }
            default: {
                throw new J();
            }
        }
    }
}

