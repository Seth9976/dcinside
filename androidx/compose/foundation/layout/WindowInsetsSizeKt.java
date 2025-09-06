package androidx.compose.foundation.layout;

import A3.o;
import A3.p;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,217:1\n135#2:218\n135#2:219\n135#2:220\n135#2:221\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n51#1:218\n77#1:219\n101#1:220\n121#1:221\n*E\n"})
public final class WindowInsetsSizeKt {
    @Stable
    @l
    public static final Modifier a(@l Modifier modifier0, @l WindowInsets windowInsets0) {
        L.p(modifier0, "<this>");
        L.p(windowInsets0, "insets");
        return modifier0.r0(new DerivedHeightModifier(windowInsets0, InspectableValueKt.b(), androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsBottomHeight.2.e));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,170:1\n122#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsBottomHeight..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final WindowInsets e;

            public androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsBottomHeight..inlined.debugInspectorInfo.1(WindowInsets windowInsets0) {
                this.e = windowInsets0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("insetsBottomHeight");
                inspectorInfo0.b().c("insets", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }


        final class androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsBottomHeight.2 extends N implements o {
            public static final androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsBottomHeight.2 e;

            static {
                androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsBottomHeight.2.e = new androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsBottomHeight.2();
            }

            androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsBottomHeight.2() {
                super(2);
            }

            @l
            public final Integer a(@l WindowInsets windowInsets0, @l Density density0) {
                L.p(windowInsets0, "$this$$receiver");
                L.p(density0, "it");
                return windowInsets0.c(density0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((WindowInsets)object0), ((Density)object1));
            }
        }

    }

    @Stable
    @l
    public static final Modifier b(@l Modifier modifier0, @l WindowInsets windowInsets0) {
        L.p(modifier0, "<this>");
        L.p(windowInsets0, "insets");
        return modifier0.r0(new DerivedWidthModifier(windowInsets0, InspectableValueKt.b(), androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsEndWidth.2.e));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,170:1\n78#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsEndWidth..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final WindowInsets e;

            public androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsEndWidth..inlined.debugInspectorInfo.1(WindowInsets windowInsets0) {
                this.e = windowInsets0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("insetsEndWidth");
                inspectorInfo0.b().c("insets", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }


        final class androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsEndWidth.2 extends N implements p {
            public static final androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsEndWidth.2 e;

            static {
                androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsEndWidth.2.e = new androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsEndWidth.2();
            }

            androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsEndWidth.2() {
                super(3);
            }

            @l
            public final Integer a(@l WindowInsets windowInsets0, @l LayoutDirection layoutDirection0, @l Density density0) {
                L.p(windowInsets0, "$this$$receiver");
                L.p(layoutDirection0, "layoutDirection");
                L.p(density0, "density");
                return layoutDirection0 == LayoutDirection.b ? windowInsets0.d(density0, layoutDirection0) : windowInsets0.b(density0, layoutDirection0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((WindowInsets)object0), ((LayoutDirection)object1), ((Density)object2));
            }
        }

    }

    @Stable
    @l
    public static final Modifier c(@l Modifier modifier0, @l WindowInsets windowInsets0) {
        L.p(modifier0, "<this>");
        L.p(windowInsets0, "insets");
        return modifier0.r0(new DerivedWidthModifier(windowInsets0, InspectableValueKt.b(), androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsStartWidth.2.e));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,170:1\n52#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsStartWidth..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final WindowInsets e;

            public androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsStartWidth..inlined.debugInspectorInfo.1(WindowInsets windowInsets0) {
                this.e = windowInsets0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("insetsStartWidth");
                inspectorInfo0.b().c("insets", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }


        final class androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsStartWidth.2 extends N implements p {
            public static final androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsStartWidth.2 e;

            static {
                androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsStartWidth.2.e = new androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsStartWidth.2();
            }

            androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsStartWidth.2() {
                super(3);
            }

            @l
            public final Integer a(@l WindowInsets windowInsets0, @l LayoutDirection layoutDirection0, @l Density density0) {
                L.p(windowInsets0, "$this$$receiver");
                L.p(layoutDirection0, "layoutDirection");
                L.p(density0, "density");
                return layoutDirection0 == LayoutDirection.a ? windowInsets0.d(density0, layoutDirection0) : windowInsets0.b(density0, layoutDirection0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((WindowInsets)object0), ((LayoutDirection)object1), ((Density)object2));
            }
        }

    }

    @Stable
    @l
    public static final Modifier d(@l Modifier modifier0, @l WindowInsets windowInsets0) {
        L.p(modifier0, "<this>");
        L.p(windowInsets0, "insets");
        return modifier0.r0(new DerivedHeightModifier(windowInsets0, InspectableValueKt.b(), androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsTopHeight.2.e));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,170:1\n102#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsTopHeight..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final WindowInsets e;

            public androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsTopHeight..inlined.debugInspectorInfo.1(WindowInsets windowInsets0) {
                this.e = windowInsets0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("insetsTopHeight");
                inspectorInfo0.b().c("insets", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }


        final class androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsTopHeight.2 extends N implements o {
            public static final androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsTopHeight.2 e;

            static {
                androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsTopHeight.2.e = new androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsTopHeight.2();
            }

            androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsTopHeight.2() {
                super(2);
            }

            @l
            public final Integer a(@l WindowInsets windowInsets0, @l Density density0) {
                L.p(windowInsets0, "$this$$receiver");
                L.p(density0, "it");
                return windowInsets0.a(density0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((WindowInsets)object0), ((Density)object1));
            }
        }

    }
}

