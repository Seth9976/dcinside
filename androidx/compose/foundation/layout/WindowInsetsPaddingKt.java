package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import y4.l;

@s0({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,305:1\n135#2:306\n135#2:307\n135#2:308\n135#2:309\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n57#1:306\n75#1:307\n102#1:308\n126#1:309\n*E\n"})
public final class WindowInsetsPaddingKt {
    @l
    private static final ProvidableModifierLocal a;

    static {
        WindowInsetsPaddingKt.a = ModifierLocalKt.a(WindowInsetsPaddingKt.ModifierLocalConsumedWindowInsets.1.e);
    }

    @ExperimentalLayoutApi
    @Stable
    @l
    public static final Modifier a(@l Modifier modifier0, @l PaddingValues paddingValues0) {
        L.p(modifier0, "<this>");
        L.p(paddingValues0, "paddingValues");
        return modifier0.r0(new PaddingValuesConsumingModifier(paddingValues0, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,170:1\n103#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPaddingKt.consumeWindowInsets..inlined.debugInspectorInfo.2 extends N implements Function1 {
            final PaddingValues e;

            public androidx.compose.foundation.layout.WindowInsetsPaddingKt.consumeWindowInsets..inlined.debugInspectorInfo.2(PaddingValues paddingValues0) {
                this.e = paddingValues0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("consumeWindowInsets");
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
    public static final Modifier b(@l Modifier modifier0, @l WindowInsets windowInsets0) {
        L.p(modifier0, "<this>");
        L.p(windowInsets0, "insets");
        return modifier0.r0(new UnionInsetsConsumingModifier(windowInsets0, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,170:1\n76#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPaddingKt.consumeWindowInsets..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final WindowInsets e;

            public androidx.compose.foundation.layout.WindowInsetsPaddingKt.consumeWindowInsets..inlined.debugInspectorInfo.1(WindowInsets windowInsets0) {
                this.e = windowInsets0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("consumeWindowInsets");
                inspectorInfo0.b().c("insets", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @ExperimentalLayoutApi
    @Stable
    @k(message = "Use consumeWindowInsets", replaceWith = @c0(expression = "this.consumeWindowInsets(paddingValues)", imports = {}))
    @l
    public static final Modifier c(@l Modifier modifier0, @l PaddingValues paddingValues0) {
        L.p(modifier0, "<this>");
        L.p(paddingValues0, "paddingValues");
        return WindowInsetsPaddingKt.a(modifier0, paddingValues0);
    }

    @ExperimentalLayoutApi
    @Stable
    @k(message = "Use consumeWindowInsets", replaceWith = @c0(expression = "this.consumeWindowInsets(insets)", imports = {}))
    @l
    public static final Modifier d(@l Modifier modifier0, @l WindowInsets windowInsets0) {
        L.p(modifier0, "<this>");
        L.p(windowInsets0, "insets");
        return WindowInsetsPaddingKt.b(modifier0, windowInsets0);
    }

    @l
    public static final ProvidableModifierLocal e() {
        return WindowInsetsPaddingKt.a;
    }

    @Stable
    @l
    public static final Modifier f(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "block");
        return modifier0.r0(new ConsumedInsetsModifier(function10, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,170:1\n127#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPaddingKt.onConsumedWindowInsetsChanged..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Function1 e;

            public androidx.compose.foundation.layout.WindowInsetsPaddingKt.onConsumedWindowInsetsChanged..inlined.debugInspectorInfo.1(Function1 function10) {
                this.e = function10;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("onConsumedWindowInsetsChanged");
                inspectorInfo0.b().c("block", this.e);
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
    public static final Modifier g(@l Modifier modifier0, @l WindowInsets windowInsets0) {
        L.p(modifier0, "<this>");
        L.p(windowInsets0, "insets");
        return modifier0.r0(new InsetsPaddingModifier(windowInsets0, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,170:1\n58#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final WindowInsets e;

            public androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding..inlined.debugInspectorInfo.1(WindowInsets windowInsets0) {
                this.e = windowInsets0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("windowInsetsPadding");
                inspectorInfo0.b().c("insets", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @ExperimentalLayoutApi
    @Stable
    @k(message = "Use onConsumedWindowInsetsChanged", replaceWith = @c0(expression = "onConsumedWindowInsetsChanged(block)", imports = {}))
    @l
    public static final Modifier h(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "block");
        return WindowInsetsPaddingKt.f(modifier0, function10);
    }
}

