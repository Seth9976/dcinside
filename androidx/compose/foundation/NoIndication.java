package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class NoIndication implements Indication {
    static final class NoIndicationInstance implements IndicationInstance {
        @l
        public static final NoIndicationInstance a;

        static {
            NoIndicationInstance.a = new NoIndicationInstance();
        }

        @Override  // androidx.compose.foundation.IndicationInstance
        public void a(@l ContentDrawScope contentDrawScope0) {
            L.p(contentDrawScope0, "<this>");
            contentDrawScope0.Q0();
        }
    }

    @l
    public static final NoIndication a;

    static {
        NoIndication.a = new NoIndication();
    }

    @Override  // androidx.compose.foundation.Indication
    @Composable
    @l
    public IndicationInstance a(@l InteractionSource interactionSource0, @m Composer composer0, int v) {
        L.p(interactionSource0, "interactionSource");
        composer0.V(0x1106BDB4);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x1106BDB4, v, -1, "androidx.compose.foundation.NoIndication.rememberUpdatedInstance (Indication.kt:140)");
        }
        IndicationInstance indicationInstance0 = NoIndicationInstance.a;
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return indicationInstance0;
    }
}

