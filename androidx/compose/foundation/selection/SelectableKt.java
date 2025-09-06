package androidx.compose.foundation.selection;

import A3.a;
import A3.p;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,134:1\n135#2:135\n135#2:136\n146#2:137\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n61#1:135\n114#1:136\n113#1:137\n*E\n"})
public final class SelectableKt {
    @l
    public static final Modifier a(@l Modifier modifier0, boolean z, @l MutableInteractionSource mutableInteractionSource0, @m Indication indication0, boolean z1, @m Role role0, @l a a0) {
        L.p(modifier0, "$this$selectable");
        L.p(mutableInteractionSource0, "interactionSource");
        L.p(a0, "onClick");
        return InspectableValueKt.d(modifier0, InspectableValueKt.b(), SemanticsModifierKt.c(ClickableKt.c(Modifier.m0, mutableInteractionSource0, indication0, z1, null, role0, a0, 8, null), false, new Function1(z) {
            final boolean e;

            {
                this.e = z;
                super(1);
            }

            public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                L.p(semanticsPropertyReceiver0, "$this$semantics");
                SemanticsPropertiesKt.S0(semanticsPropertyReceiver0, this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((SemanticsPropertyReceiver)object0));
                return S0.a;
            }
        }, 1, null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n1#1,170:1\n115#2,8:171\n*E\n"})
        public final class androidx.compose.foundation.selection.SelectableKt.selectable-O2vRcR0..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final boolean e;
            final MutableInteractionSource f;
            final Indication g;
            final boolean h;
            final Role i;
            final a j;

            public androidx.compose.foundation.selection.SelectableKt.selectable-O2vRcR0..inlined.debugInspectorInfo.1(boolean z, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z1, Role role0, a a0) {
                this.e = z;
                this.f = mutableInteractionSource0;
                this.g = indication0;
                this.h = z1;
                this.i = role0;
                this.j = a0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("selectable");
                inspectorInfo0.b().c("selected", Boolean.valueOf(this.e));
                inspectorInfo0.b().c("interactionSource", this.f);
                inspectorInfo0.b().c("indication", this.g);
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.h));
                inspectorInfo0.b().c("role", this.i);
                inspectorInfo0.b().c("onClick", this.j);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier b(Modifier modifier0, boolean z, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z1, Role role0, a a0, int v, Object object0) {
        if((v & 16) != 0) {
            role0 = null;
        }
        return SelectableKt.a(modifier0, z, mutableInteractionSource0, indication0, ((v & 8) == 0 ? z1 : true), role0, a0);
    }

    @l
    public static final Modifier c(@l Modifier modifier0, boolean z, boolean z1, @m Role role0, @l a a0) {
        L.p(modifier0, "$this$selectable");
        L.p(a0, "onClick");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(z, z1, role0, a0) {
            final boolean e;
            final boolean f;
            final Role g;
            final a h;

            {
                this.e = z;
                this.f = z1;
                this.g = role0;
                this.h = a0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x815D0778);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x815D0778, v, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:67)");
                }
                Companion modifier$Companion0 = Modifier.m0;
                composer0.V(0xE2A708A4);
                MutableInteractionSource mutableInteractionSource0 = composer0.W();
                if(mutableInteractionSource0 == Composer.a.a()) {
                    mutableInteractionSource0 = InteractionSourceKt.a();
                    composer0.O(mutableInteractionSource0);
                }
                composer0.g0();
                Object object0 = composer0.L(IndicationKt.a());
                Modifier modifier1 = SelectableKt.a(modifier$Companion0, this.e, mutableInteractionSource0, ((Indication)object0), this.f, this.g, this.h);
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
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n1#1,170:1\n62#2,6:171\n*E\n"})
        public final class androidx.compose.foundation.selection.SelectableKt.selectable-XHw0xAI..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final boolean e;
            final boolean f;
            final Role g;
            final a h;

            public androidx.compose.foundation.selection.SelectableKt.selectable-XHw0xAI..inlined.debugInspectorInfo.1(boolean z, boolean z1, Role role0, a a0) {
                this.e = z;
                this.f = z1;
                this.g = role0;
                this.h = a0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("selectable");
                inspectorInfo0.b().c("selected", Boolean.valueOf(this.e));
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.f));
                inspectorInfo0.b().c("role", this.g);
                inspectorInfo0.b().c("onClick", this.h);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier d(Modifier modifier0, boolean z, boolean z1, Role role0, a a0, int v, Object object0) {
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            role0 = null;
        }
        return SelectableKt.c(modifier0, z, z1, role0, a0);
    }
}

