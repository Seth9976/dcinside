package androidx.compose.foundation.layout;

import A3.p;
import android.os.Build.VERSION;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
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
import y4.m;

@s0({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,708:1\n135#2:709\n76#3:710\n76#3:711\n76#3:712\n83#4,3:713\n1057#5,6:716\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n76#1:709\n112#1:710\n114#1:711\n115#1:712\n116#1:713,3\n116#1:716,6\n*E\n"})
public final class WindowInsetsConnection_androidKt {
    private static final float a = 0.35f;
    private static final float b = 0.0f;
    private static final float c = 9.80665f;
    private static final float d = 39.369999f;
    private static final double e = 0.0;
    private static final double f = 0.0;
    private static final float g = 0.5f;
    private static final float h = 1.0f;
    private static final float i = 0.175f;
    private static final float j = 0.35f;

    static {
        WindowInsetsConnection_androidKt.b = 0.015f;
        WindowInsetsConnection_androidKt.e = 2.358202;
        WindowInsetsConnection_androidKt.f = 1.358202;
    }

    public static final double a() [...] // 潜在的解密器

    public static final double b() [...] // 潜在的解密器

    public static final float c() [...] // 潜在的解密器

    @ExperimentalLayoutApi
    @l
    public static final Modifier d(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return Build.VERSION.SDK_INT >= 30 ? ComposedModifierKt.e(modifier0, InspectableValueKt.b(), androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.imeNestedScroll.2.e) : modifier0;

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n1#1,170:1\n77#2,2:171\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.imeNestedScroll..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.imeNestedScroll..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("imeNestedScroll");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }


        final class androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.imeNestedScroll.2 extends N implements p {
            public static final androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.imeNestedScroll.2 e;

            static {
                androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.imeNestedScroll.2.e = new androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.imeNestedScroll.2();
            }

            androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.imeNestedScroll.2() {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0xE9F29258);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xE9F29258, v, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:78)");
                }
                Modifier modifier1 = NestedScrollModifierKt.b(modifier0, WindowInsetsConnection_androidKt.e(WindowInsetsHolder.x.c(composer0, 8).h(), 0x20, composer0, 0x30), null, 2, null);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier1;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }

    }

    @ExperimentalLayoutApi
    @Composable
    @l
    public static final NestedScrollConnection e(@l AndroidWindowInsets androidWindowInsets0, int v, @m Composer composer0, int v1) {
        L.p(androidWindowInsets0, "windowInsets");
        composer0.V(-1011341039);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1011341039, v1, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:104)");
        }
        if(Build.VERSION.SDK_INT < 30) {
            NestedScrollConnection nestedScrollConnection0 = DoNothingNestedScrollConnection.a;
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            composer0.g0();
            return nestedScrollConnection0;
        }
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.L(CompositionLocalsKt.p());
        SideCalculator sideCalculator0 = SideCalculator.a.a(v, layoutDirection0);
        View view0 = (View)composer0.L(AndroidCompositionLocals_androidKt.k());
        Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
        Object[] arr_object = {androidWindowInsets0, view0, sideCalculator0, density0};
        composer0.V(0xDE219177);
        boolean z = false;
        for(int v2 = 0; v2 < 4; ++v2) {
            z |= composer0.t(arr_object[v2]);
        }
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection0 = composer0.W();
        if(z || windowInsetsNestedScrollConnection0 == Composer.a.a()) {
            windowInsetsNestedScrollConnection0 = new WindowInsetsNestedScrollConnection(androidWindowInsets0, view0, sideCalculator0, density0);
            composer0.O(windowInsetsNestedScrollConnection0);
        }
        composer0.g0();
        EffectsKt.c(windowInsetsNestedScrollConnection0, new Function1(windowInsetsNestedScrollConnection0) {
            final WindowInsetsNestedScrollConnection e;

            {
                this.e = windowInsetsNestedScrollConnection0;
                super(1);
            }

            @l
            public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                L.p(disposableEffectScope0, "$this$DisposableEffect");
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.a.o();
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((DisposableEffectScope)object0));
            }
        }, composer0, 8);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsetsNestedScrollConnection0;
    }
}

