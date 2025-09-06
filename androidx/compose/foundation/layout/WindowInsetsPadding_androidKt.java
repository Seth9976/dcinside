package androidx.compose.foundation.layout;

import A3.p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,255:1\n249#1,7:257\n249#1,7:265\n249#1,7:273\n249#1,7:281\n249#1,7:289\n249#1,7:297\n249#1,7:305\n249#1,7:313\n249#1,7:321\n249#1,7:329\n249#1,7:337\n249#1,7:345\n135#2:256\n135#2:264\n135#2:272\n135#2:280\n135#2:288\n135#2:296\n135#2:304\n135#2:312\n135#2:320\n135#2:328\n135#2:336\n135#2:344\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n41#1:257,7\n59#1:265,7\n77#1:273,7\n95#1:281,7\n113#1:289,7\n131#1:297,7\n149#1:305,7\n167#1:313,7\n185#1:321,7\n203#1:329,7\n221#1:337,7\n240#1:345,7\n41#1:256\n59#1:264\n77#1:272\n95#1:280\n113#1:288\n131#1:296\n149#1:304\n167#1:312\n185#1:320\n203#1:328\n221#1:336\n240#1:344\n*E\n"})
public final class WindowInsetsPadding_androidKt {
    @l
    public static final Modifier a(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p() {
            {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x15733969);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.x.c(composer0, 8);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.W();
                if(z || insetsPaddingModifier0 == Composer.a.a()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.d(), null, 2, null);
                    composer0.O(insetsPaddingModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return insetsPaddingModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,170:1\n185#2:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.captionBarPadding..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.captionBarPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("captionBarPadding");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier b(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p() {
            {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x15733969);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.x.c(composer0, 8);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.W();
                if(z || insetsPaddingModifier0 == Composer.a.a()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.g(), null, 2, null);
                    composer0.O(insetsPaddingModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return insetsPaddingModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,170:1\n113#2:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("displayCutoutPadding");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier c(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p() {
            {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x15733969);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.x.c(composer0, 8);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.W();
                if(z || insetsPaddingModifier0 == Composer.a.a()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.h(), null, 2, null);
                    composer0.O(insetsPaddingModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return insetsPaddingModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,170:1\n149#2:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("imePadding");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier d(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p() {
            {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x15733969);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.x.c(composer0, 8);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.W();
                if(z || insetsPaddingModifier0 == Composer.a.a()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.k(), null, 2, null);
                    composer0.O(insetsPaddingModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return insetsPaddingModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,170:1\n240#2:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.mandatorySystemGesturesPadding..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.mandatorySystemGesturesPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("mandatorySystemGesturesPadding");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier e(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p() {
            {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x15733969);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.x.c(composer0, 8);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.W();
                if(z || insetsPaddingModifier0 == Composer.a.a()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.l(), null, 2, null);
                    composer0.O(insetsPaddingModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return insetsPaddingModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,170:1\n167#2:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("navigationBarsPadding");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier f(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p() {
            {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x15733969);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.x.c(composer0, 8);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.W();
                if(z || insetsPaddingModifier0 == Composer.a.a()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.n(), null, 2, null);
                    composer0.O(insetsPaddingModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return insetsPaddingModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,170:1\n77#2:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeContentPadding..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeContentPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("safeContentPadding");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier g(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p() {
            {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x15733969);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.x.c(composer0, 8);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.W();
                if(z || insetsPaddingModifier0 == Composer.a.a()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.o(), null, 2, null);
                    composer0.O(insetsPaddingModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return insetsPaddingModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,170:1\n41#2:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeDrawingPadding..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeDrawingPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("safeDrawingPadding");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier h(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p() {
            {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x15733969);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.x.c(composer0, 8);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.W();
                if(z || insetsPaddingModifier0 == Composer.a.a()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.p(), null, 2, null);
                    composer0.O(insetsPaddingModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return insetsPaddingModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,170:1\n59#2:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeGesturesPadding..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeGesturesPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("safeGesturesPadding");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier i(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p() {
            {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x15733969);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.x.c(composer0, 8);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.W();
                if(z || insetsPaddingModifier0 == Composer.a.a()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.q(), null, 2, null);
                    composer0.O(insetsPaddingModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return insetsPaddingModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,170:1\n131#2:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("statusBarsPadding");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier j(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p() {
            {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x15733969);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.x.c(composer0, 8);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.W();
                if(z || insetsPaddingModifier0 == Composer.a.a()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.s(), null, 2, null);
                    composer0.O(insetsPaddingModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return insetsPaddingModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,170:1\n95#2:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemBarsPadding..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemBarsPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("systemBarsPadding");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier k(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p() {
            {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x15733969);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.x.c(composer0, 8);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.W();
                if(z || insetsPaddingModifier0 == Composer.a.a()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.u(), null, 2, null);
                    composer0.O(insetsPaddingModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return insetsPaddingModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,170:1\n221#2:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemGesturesPadding..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemGesturesPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("systemGesturesPadding");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier l(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p() {
            {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x15733969);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.x.c(composer0, 8);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.W();
                if(z || insetsPaddingModifier0 == Composer.a.a()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.x(), null, 2, null);
                    composer0.O(insetsPaddingModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return insetsPaddingModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,170:1\n203#2:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.waterfallPadding..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.waterfallPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("waterfallPadding");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Stable
    private static final Modifier m(Modifier modifier0, Function1 function10, Function1 function11) {
        return ComposedModifierKt.e(modifier0, function10, new p(function11) {
            final Function1 e;

            {
                this.e = function10;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x15733969);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.x.c(composer0, 8);
                Function1 function10 = this.e;
                composer0.V(0x44FAF204);
                boolean z = composer0.t(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.W();
                if(z || insetsPaddingModifier0 == Composer.a.a()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(((WindowInsets)function10.invoke(windowInsetsHolder0)), null, 2, null);
                    composer0.O(insetsPaddingModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return insetsPaddingModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });
    }
}

