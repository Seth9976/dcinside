package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n135#2:437\n135#2:442\n135#2:445\n135#2:446\n135#2:447\n155#3:438\n155#3:439\n155#3:440\n155#3:441\n155#3:443\n155#3:444\n155#3:448\n155#3:449\n155#3:450\n155#3:451\n155#3:452\n155#3:453\n155#3:454\n155#3:455\n155#3:456\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n62#1:437\n95#1:442\n123#1:445\n146#1:446\n178#1:447\n51#1:438\n52#1:439\n53#1:440\n54#1:441\n86#1:443\n87#1:444\n167#1:448\n168#1:449\n169#1:450\n170#1:451\n286#1:452\n296#1:453\n297#1:454\n298#1:455\n299#1:456\n*E\n"})
public final class PaddingKt {
    @Stable
    @l
    public static final PaddingValues a(float f) {
        return new PaddingValuesImpl(f, f, f, f, null);
    }

    @Stable
    @l
    public static final PaddingValues b(float f, float f1) {
        return new PaddingValuesImpl(f, f1, f, f1, null);
    }

    public static PaddingValues c(float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        return PaddingKt.b(f, f1);
    }

    @Stable
    @l
    public static final PaddingValues d(float f, float f1, float f2, float f3) {
        return new PaddingValuesImpl(f, f1, f2, f3, null);
    }

    public static PaddingValues e(float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        return PaddingKt.d(f, f1, f2, f3);
    }

    @Stable
    @l
    public static final Modifier f(@l Modifier modifier0, float f, float f1, float f2, float f3) {
        L.p(modifier0, "$this$absolutePadding");
        return modifier0.r0(new PaddingModifier(f, f1, f2, f3, false, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n1#1,170:1\n179#2,6:171\n*E\n"})
        public final class androidx.compose.foundation.layout.PaddingKt.absolutePadding-qDBjuR0..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final float f;
            final float g;
            final float h;

            public androidx.compose.foundation.layout.PaddingKt.absolutePadding-qDBjuR0..inlined.debugInspectorInfo.1(float f, float f1, float f2, float f3) {
                this.e = f;
                this.f = f1;
                this.g = f2;
                this.h = f3;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("absolutePadding");
                inspectorInfo0.b().c("left", Dp.d(this.e));
                inspectorInfo0.b().c("top", Dp.d(this.f));
                inspectorInfo0.b().c("right", Dp.d(this.g));
                inspectorInfo0.b().c("bottom", Dp.d(this.h));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier g(Modifier modifier0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        return PaddingKt.f(modifier0, f, f1, f2, f3);
    }

    @Stable
    public static final float h(@l PaddingValues paddingValues0, @l LayoutDirection layoutDirection0) {
        L.p(paddingValues0, "<this>");
        L.p(layoutDirection0, "layoutDirection");
        return layoutDirection0 == LayoutDirection.a ? paddingValues0.c(layoutDirection0) : paddingValues0.b(layoutDirection0);
    }

    @Stable
    public static final float i(@l PaddingValues paddingValues0, @l LayoutDirection layoutDirection0) {
        L.p(paddingValues0, "<this>");
        L.p(layoutDirection0, "layoutDirection");
        return layoutDirection0 == LayoutDirection.a ? paddingValues0.b(layoutDirection0) : paddingValues0.c(layoutDirection0);
    }

    @Stable
    @l
    public static final Modifier j(@l Modifier modifier0, @l PaddingValues paddingValues0) {
        L.p(modifier0, "<this>");
        L.p(paddingValues0, "paddingValues");
        return modifier0.r0(new PaddingValuesModifier(paddingValues0, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n1#1,170:1\n147#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.PaddingKt.padding..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final PaddingValues e;

            public androidx.compose.foundation.layout.PaddingKt.padding..inlined.debugInspectorInfo.1(PaddingValues paddingValues0) {
                this.e = paddingValues0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("padding");
                inspectorInfo0.b().c("paddingValues", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Stable
    @l
    public static final Modifier k(@l Modifier modifier0, float f) {
        L.p(modifier0, "$this$padding");
        return modifier0.r0(new PaddingModifier(f, f, f, f, true, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n1#1,170:1\n124#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;

            public androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs..inlined.debugInspectorInfo.1(float f) {
                this.e = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("padding");
                inspectorInfo0.e(Dp.d(this.e));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Stable
    @l
    public static final Modifier l(@l Modifier modifier0, float f, float f1) {
        L.p(modifier0, "$this$padding");
        return modifier0.r0(new PaddingModifier(f, f1, f, f1, true, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n1#1,170:1\n96#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final float f;

            public androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.e = f;
                this.f = f1;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("padding");
                inspectorInfo0.b().c("horizontal", Dp.d(this.e));
                inspectorInfo0.b().c("vertical", Dp.d(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier m(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        return PaddingKt.l(modifier0, f, f1);
    }

    @Stable
    @l
    public static final Modifier n(@l Modifier modifier0, float f, float f1, float f2, float f3) {
        L.p(modifier0, "$this$padding");
        return modifier0.r0(new PaddingModifier(f, f1, f2, f3, true, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n1#1,170:1\n63#2,6:171\n*E\n"})
        public final class androidx.compose.foundation.layout.PaddingKt.padding-qDBjuR0..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final float f;
            final float g;
            final float h;

            public androidx.compose.foundation.layout.PaddingKt.padding-qDBjuR0..inlined.debugInspectorInfo.1(float f, float f1, float f2, float f3) {
                this.e = f;
                this.f = f1;
                this.g = f2;
                this.h = f3;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("padding");
                inspectorInfo0.b().c("start", Dp.d(this.e));
                inspectorInfo0.b().c("top", Dp.d(this.f));
                inspectorInfo0.b().c("end", Dp.d(this.g));
                inspectorInfo0.b().c("bottom", Dp.d(this.h));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier o(Modifier modifier0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        return PaddingKt.n(modifier0, f, f1, f2, f3);
    }
}

