package androidx.compose.foundation;

import A3.p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,123:1\n135#2:124\n*S KotlinDebug\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt\n*L\n50#1:124\n*E\n"})
public final class FocusedBoundsKt {
    @l
    private static final ProvidableModifierLocal a;

    static {
        FocusedBoundsKt.a = ModifierLocalKt.a(FocusedBoundsKt.ModifierLocalFocusedBoundsObserver.1.e);
    }

    @l
    public static final ProvidableModifierLocal a() {
        return FocusedBoundsKt.a;
    }

    public static void b() {
    }

    @ExperimentalFoundationApi
    @l
    public static final Modifier c(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "onPositioned");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(1176407768);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(1176407768, v, -1, "androidx.compose.foundation.onFocusedBoundsChanged.<anonymous> (FocusedBounds.kt:53)");
                }
                Function1 function10 = this.e;
                composer0.V(0x44FAF204);
                boolean z = composer0.t(function10);
                FocusedBoundsObserverModifier focusedBoundsObserverModifier0 = composer0.W();
                if(z || focusedBoundsObserverModifier0 == Composer.a.a()) {
                    focusedBoundsObserverModifier0 = new FocusedBoundsObserverModifier(function10);
                    composer0.O(focusedBoundsObserverModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return focusedBoundsObserverModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt\n*L\n1#1,170:1\n51#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.FocusedBoundsKt.onFocusedBoundsChanged..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Function1 e;

            public androidx.compose.foundation.FocusedBoundsKt.onFocusedBoundsChanged..inlined.debugInspectorInfo.1(Function1 function10) {
                this.e = function10;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("onFocusedBoundsChanged");
                inspectorInfo0.b().c("onPositioned", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }
}

