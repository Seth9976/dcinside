package androidx.compose.ui.input.nestedscroll;

import A3.p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.coroutines.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nNestedScrollModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,344:1\n135#2:345\n*S KotlinDebug\n*F\n+ 1 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt\n*L\n331#1:345\n*E\n"})
public final class NestedScrollModifierKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l NestedScrollConnection nestedScrollConnection0, @m NestedScrollDispatcher nestedScrollDispatcher0) {
        L.p(modifier0, "<this>");
        L.p(nestedScrollConnection0, "connection");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(nestedScrollDispatcher0, nestedScrollConnection0) {
            final NestedScrollDispatcher e;
            final NestedScrollConnection f;

            {
                this.e = nestedScrollDispatcher0;
                this.f = nestedScrollConnection0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(410346167);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(410346167, v, -1, "androidx.compose.ui.input.nestedscroll.nestedScroll.<anonymous> (NestedScrollModifier.kt:335)");
                }
                composer0.V(0x2E20B340);
                composer0.V(0xE2A708A4);
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.W();
                Companion composer$Companion0 = Composer.a;
                if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.a()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.m(i.a, composer0));
                    composer0.O(compositionScopedCoroutineScopeCanceller1);
                    compositionScopedCoroutineScopeCanceller0 = compositionScopedCoroutineScopeCanceller1;
                }
                composer0.g0();
                O o0 = compositionScopedCoroutineScopeCanceller0.b();
                composer0.g0();
                NestedScrollDispatcher nestedScrollDispatcher0 = this.e;
                composer0.V(100475956);
                if(nestedScrollDispatcher0 == null) {
                    composer0.V(0xE2A708A4);
                    NestedScrollDispatcher nestedScrollDispatcher1 = composer0.W();
                    if(nestedScrollDispatcher1 == composer$Companion0.a()) {
                        nestedScrollDispatcher1 = new NestedScrollDispatcher();
                        composer0.O(nestedScrollDispatcher1);
                    }
                    composer0.g0();
                    nestedScrollDispatcher0 = nestedScrollDispatcher1;
                }
                composer0.g0();
                NestedScrollConnection nestedScrollConnection0 = this.f;
                composer0.V(0x607FB4C4);
                boolean z = composer0.t(nestedScrollConnection0);
                boolean z1 = composer0.t(nestedScrollDispatcher0);
                boolean z2 = composer0.t(o0);
                NestedScrollModifierLocal nestedScrollModifierLocal0 = composer0.W();
                if((z | z1 | z2) != 0 || nestedScrollModifierLocal0 == composer$Companion0.a()) {
                    nestedScrollDispatcher0.j(o0);
                    nestedScrollModifierLocal0 = new NestedScrollModifierLocal(nestedScrollDispatcher0, nestedScrollConnection0);
                    composer0.O(nestedScrollModifierLocal0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return nestedScrollModifierLocal0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt\n*L\n1#1,170:1\n332#2,4:171\n*E\n"})
        public final class androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final NestedScrollConnection e;
            final NestedScrollDispatcher f;

            public androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll..inlined.debugInspectorInfo.1(NestedScrollConnection nestedScrollConnection0, NestedScrollDispatcher nestedScrollDispatcher0) {
                this.e = nestedScrollConnection0;
                this.f = nestedScrollDispatcher0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("nestedScroll");
                inspectorInfo0.b().c("connection", this.e);
                inspectorInfo0.b().c("dispatcher", this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier b(Modifier modifier0, NestedScrollConnection nestedScrollConnection0, NestedScrollDispatcher nestedScrollDispatcher0, int v, Object object0) {
        if((v & 2) != 0) {
            nestedScrollDispatcher0 = null;
        }
        return NestedScrollModifierKt.a(modifier0, nestedScrollConnection0, nestedScrollDispatcher0);
    }
}

