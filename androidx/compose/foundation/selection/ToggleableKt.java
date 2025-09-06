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
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,228:1\n135#2:229\n135#2:230\n146#2:231\n135#2:232\n135#2:233\n146#2:234\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n59#1:229\n108#1:230\n107#1:231\n156#1:232\n208#1:233\n207#1:234\n*E\n"})
public final class ToggleableKt {
    @l
    public static final Modifier a(@l Modifier modifier0, boolean z, @l MutableInteractionSource mutableInteractionSource0, @m Indication indication0, boolean z1, @m Role role0, @l Function1 function10) {
        L.p(modifier0, "$this$toggleable");
        L.p(mutableInteractionSource0, "interactionSource");
        L.p(function10, "onValueChange");
        ToggleableState toggleableState0 = ToggleableStateKt.a(z);
        androidx.compose.foundation.selection.ToggleableKt.toggleable.4.1 toggleableKt$toggleable$4$10 = new a(function10, z) {
            final Function1 e;
            final boolean f;

            {
                this.e = function10;
                this.f = z;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.invoke(Boolean.valueOf(!this.f));
            }
        };
        return InspectableValueKt.d(modifier0, InspectableValueKt.b(), ToggleableKt.e(Modifier.m0, toggleableState0, mutableInteractionSource0, indication0, z1, role0, toggleableKt$toggleable$4$10));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,170:1\n109#2,8:171\n*E\n"})
        public final class androidx.compose.foundation.selection.ToggleableKt.toggleable-O2vRcR0..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final boolean e;
            final MutableInteractionSource f;
            final Indication g;
            final boolean h;
            final Role i;
            final Function1 j;

            public androidx.compose.foundation.selection.ToggleableKt.toggleable-O2vRcR0..inlined.debugInspectorInfo.1(boolean z, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z1, Role role0, Function1 function10) {
                this.e = z;
                this.f = mutableInteractionSource0;
                this.g = indication0;
                this.h = z1;
                this.i = role0;
                this.j = function10;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("toggleable");
                inspectorInfo0.b().c("value", Boolean.valueOf(this.e));
                inspectorInfo0.b().c("interactionSource", this.f);
                inspectorInfo0.b().c("indication", this.g);
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.h));
                inspectorInfo0.b().c("role", this.i);
                inspectorInfo0.b().c("onValueChange", this.j);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier b(Modifier modifier0, boolean z, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z1, Role role0, Function1 function10, int v, Object object0) {
        if((v & 16) != 0) {
            role0 = null;
        }
        return ToggleableKt.a(modifier0, z, mutableInteractionSource0, indication0, ((v & 8) == 0 ? z1 : true), role0, function10);
    }

    @l
    public static final Modifier c(@l Modifier modifier0, boolean z, boolean z1, @m Role role0, @l Function1 function10) {
        L.p(modifier0, "$this$toggleable");
        L.p(function10, "onValueChange");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(z, z1, role0, function10) {
            final boolean e;
            final boolean f;
            final Role g;
            final Function1 h;

            {
                this.e = z;
                this.f = z1;
                this.g = role0;
                this.h = function10;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x114E1E09);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x114E1E09, v, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:65)");
                }
                Companion modifier$Companion0 = Modifier.m0;
                boolean z = this.e;
                composer0.V(0xE2A708A4);
                MutableInteractionSource mutableInteractionSource0 = composer0.W();
                if(mutableInteractionSource0 == Composer.a.a()) {
                    mutableInteractionSource0 = InteractionSourceKt.a();
                    composer0.O(mutableInteractionSource0);
                }
                composer0.g0();
                Modifier modifier1 = ToggleableKt.a(modifier$Companion0, z, mutableInteractionSource0, ((Indication)composer0.L(IndicationKt.a())), this.f, this.g, this.h);
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

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,170:1\n60#2,6:171\n*E\n"})
        public final class androidx.compose.foundation.selection.ToggleableKt.toggleable-XHw0xAI..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final boolean e;
            final boolean f;
            final Role g;
            final Function1 h;

            public androidx.compose.foundation.selection.ToggleableKt.toggleable-XHw0xAI..inlined.debugInspectorInfo.1(boolean z, boolean z1, Role role0, Function1 function10) {
                this.e = z;
                this.f = z1;
                this.g = role0;
                this.h = function10;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("toggleable");
                inspectorInfo0.b().c("value", Boolean.valueOf(this.e));
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.f));
                inspectorInfo0.b().c("role", this.g);
                inspectorInfo0.b().c("onValueChange", this.h);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier d(Modifier modifier0, boolean z, boolean z1, Role role0, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            role0 = null;
        }
        return ToggleableKt.c(modifier0, z, z1, role0, function10);
    }

    @l
    public static final Modifier e(@l Modifier modifier0, @l ToggleableState toggleableState0, @l MutableInteractionSource mutableInteractionSource0, @m Indication indication0, boolean z, @m Role role0, @l a a0) {
        L.p(modifier0, "$this$triStateToggleable");
        L.p(toggleableState0, "state");
        L.p(mutableInteractionSource0, "interactionSource");
        L.p(a0, "onClick");
        return InspectableValueKt.d(modifier0, InspectableValueKt.b(), SemanticsModifierKt.c(ClickableKt.c(Modifier.m0, mutableInteractionSource0, indication0, z, null, role0, a0, 8, null), false, new Function1(toggleableState0) {
            final ToggleableState e;

            {
                this.e = toggleableState0;
                super(1);
            }

            public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                L.p(semanticsPropertyReceiver0, "$this$semantics");
                SemanticsPropertiesKt.b1(semanticsPropertyReceiver0, this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((SemanticsPropertyReceiver)object0));
                return S0.a;
            }
        }, 1, null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,170:1\n209#2,8:171\n*E\n"})
        public final class androidx.compose.foundation.selection.ToggleableKt.triStateToggleable-O2vRcR0..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final ToggleableState e;
            final boolean f;
            final Role g;
            final MutableInteractionSource h;
            final Indication i;
            final a j;

            public androidx.compose.foundation.selection.ToggleableKt.triStateToggleable-O2vRcR0..inlined.debugInspectorInfo.1(ToggleableState toggleableState0, boolean z, Role role0, MutableInteractionSource mutableInteractionSource0, Indication indication0, a a0) {
                this.e = toggleableState0;
                this.f = z;
                this.g = role0;
                this.h = mutableInteractionSource0;
                this.i = indication0;
                this.j = a0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("triStateToggleable");
                inspectorInfo0.b().c("state", this.e);
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.f));
                inspectorInfo0.b().c("role", this.g);
                inspectorInfo0.b().c("interactionSource", this.h);
                inspectorInfo0.b().c("indication", this.i);
                inspectorInfo0.b().c("onClick", this.j);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier f(Modifier modifier0, ToggleableState toggleableState0, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z, Role role0, a a0, int v, Object object0) {
        if((v & 16) != 0) {
            role0 = null;
        }
        return ToggleableKt.e(modifier0, toggleableState0, mutableInteractionSource0, indication0, ((v & 8) == 0 ? z : true), role0, a0);
    }

    @l
    public static final Modifier g(@l Modifier modifier0, @l ToggleableState toggleableState0, boolean z, @m Role role0, @l a a0) {
        L.p(modifier0, "$this$triStateToggleable");
        L.p(toggleableState0, "state");
        L.p(a0, "onClick");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(toggleableState0, z, role0, a0) {
            final ToggleableState e;
            final boolean f;
            final Role g;
            final a h;

            {
                this.e = toggleableState0;
                this.f = z;
                this.g = role0;
                this.h = a0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(-1808118329);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(-1808118329, v, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:162)");
                }
                Companion modifier$Companion0 = Modifier.m0;
                ToggleableState toggleableState0 = this.e;
                composer0.V(0xE2A708A4);
                MutableInteractionSource mutableInteractionSource0 = composer0.W();
                if(mutableInteractionSource0 == Composer.a.a()) {
                    mutableInteractionSource0 = InteractionSourceKt.a();
                    composer0.O(mutableInteractionSource0);
                }
                composer0.g0();
                Modifier modifier1 = ToggleableKt.e(modifier$Companion0, toggleableState0, mutableInteractionSource0, ((Indication)composer0.L(IndicationKt.a())), this.f, this.g, this.h);
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

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,170:1\n157#2,6:171\n*E\n"})
        public final class androidx.compose.foundation.selection.ToggleableKt.triStateToggleable-XHw0xAI..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final ToggleableState e;
            final boolean f;
            final Role g;
            final a h;

            public androidx.compose.foundation.selection.ToggleableKt.triStateToggleable-XHw0xAI..inlined.debugInspectorInfo.1(ToggleableState toggleableState0, boolean z, Role role0, a a0) {
                this.e = toggleableState0;
                this.f = z;
                this.g = role0;
                this.h = a0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("triStateToggleable");
                inspectorInfo0.b().c("state", this.e);
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

    public static Modifier h(Modifier modifier0, ToggleableState toggleableState0, boolean z, Role role0, a a0, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        if((v & 4) != 0) {
            role0 = null;
        }
        return ToggleableKt.g(modifier0, toggleableState0, z, role0, a0);
    }
}

