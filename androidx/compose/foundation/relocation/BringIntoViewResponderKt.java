package androidx.compose.foundation.relocation;

import A3.p;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,199:1\n135#2:200\n*S KotlinDebug\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderKt\n*L\n102#1:200\n*E\n"})
public final class BringIntoViewResponderKt {
    @ExperimentalFoundationApi
    @l
    public static final Modifier b(@l Modifier modifier0, @l BringIntoViewResponder bringIntoViewResponder0) {
        L.p(modifier0, "<this>");
        L.p(bringIntoViewResponder0, "responder");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(bringIntoViewResponder0) {
            final BringIntoViewResponder e;

            {
                this.e = bringIntoViewResponder0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0xCD36B491);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xCD36B491, v, -1, "androidx.compose.foundation.relocation.bringIntoViewResponder.<anonymous> (BringIntoViewResponder.kt:104)");
                }
                BringIntoViewParent bringIntoViewParent0 = BringIntoViewResponder_androidKt.b(composer0, 0);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(bringIntoViewParent0);
                BringIntoViewResponderModifier bringIntoViewResponderModifier0 = composer0.W();
                if(z || bringIntoViewResponderModifier0 == Composer.a.a()) {
                    bringIntoViewResponderModifier0 = new BringIntoViewResponderModifier(bringIntoViewParent0);
                    composer0.O(bringIntoViewResponderModifier0);
                }
                composer0.g0();
                bringIntoViewResponderModifier0.n(this.e);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return bringIntoViewResponderModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderKt\n*L\n1#1,170:1\n103#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.relocation.BringIntoViewResponderKt.bringIntoViewResponder..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final BringIntoViewResponder e;

            public androidx.compose.foundation.relocation.BringIntoViewResponderKt.bringIntoViewResponder..inlined.debugInspectorInfo.1(BringIntoViewResponder bringIntoViewResponder0) {
                this.e = bringIntoViewResponder0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("bringIntoViewResponder");
                inspectorInfo0.b().c("responder", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    private static final boolean c(Rect rect0, Rect rect1) {
        return rect0.t() <= rect1.t() && rect0.B() <= rect1.B() && rect0.x() >= rect1.x() && rect0.j() >= rect1.j();
    }

    private static final Rect d(LayoutCoordinates layoutCoordinates0, LayoutCoordinates layoutCoordinates1, Rect rect0) {
        return rect0.S(layoutCoordinates0.E(layoutCoordinates1, false).E());
    }
}

