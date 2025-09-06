package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.b;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,186:1\n36#2:187\n1114#3,6:188\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n*L\n171#1:187\n171#1:188,6\n*E\n"})
final class DefaultDebugIndication implements Indication {
    static final class DefaultDebugIndicationInstance implements IndicationInstance {
        @l
        private final State a;
        @l
        private final State b;
        @l
        private final State c;

        public DefaultDebugIndicationInstance(@l State state0, @l State state1, @l State state2) {
            L.p(state0, "isPressed");
            L.p(state1, "isHovered");
            L.p(state2, "isFocused");
            super();
            this.a = state0;
            this.b = state1;
            this.c = state2;
        }

        @Override  // androidx.compose.foundation.IndicationInstance
        public void a(@l ContentDrawScope contentDrawScope0) {
            L.p(contentDrawScope0, "<this>");
            contentDrawScope0.Q0();
            if(((Boolean)this.a.getValue()).booleanValue()) {
                b.K(contentDrawScope0, Color.w(0xFF00000000000000L, 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope0.b(), 0.0f, null, null, 0, 0x7A, null);
                return;
            }
            if(((Boolean)this.b.getValue()).booleanValue() || ((Boolean)this.c.getValue()).booleanValue()) {
                b.K(contentDrawScope0, Color.w(0xFF00000000000000L, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope0.b(), 0.0f, null, null, 0, 0x7A, null);
            }
        }
    }

    @l
    public static final DefaultDebugIndication a;

    static {
        DefaultDebugIndication.a = new DefaultDebugIndication();
    }

    @Override  // androidx.compose.foundation.Indication
    @Composable
    @l
    public IndicationInstance a(@l InteractionSource interactionSource0, @m Composer composer0, int v) {
        L.p(interactionSource0, "interactionSource");
        composer0.V(0x64593183);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x64593183, v, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        State state0 = PressInteractionKt.a(interactionSource0, composer0, v & 14);
        State state1 = HoverInteractionKt.a(interactionSource0, composer0, v & 14);
        State state2 = FocusInteractionKt.a(interactionSource0, composer0, v & 14);
        composer0.V(0x44FAF204);
        boolean z = composer0.t(interactionSource0);
        DefaultDebugIndicationInstance defaultDebugIndication$DefaultDebugIndicationInstance0 = composer0.W();
        if(z || defaultDebugIndication$DefaultDebugIndicationInstance0 == Composer.a.a()) {
            defaultDebugIndication$DefaultDebugIndicationInstance0 = new DefaultDebugIndicationInstance(state0, state1, state2);
            composer0.O(defaultDebugIndication$DefaultDebugIndicationInstance0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return defaultDebugIndication$DefaultDebugIndicationInstance0;
    }
}

