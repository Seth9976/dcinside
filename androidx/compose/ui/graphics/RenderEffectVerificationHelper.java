package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(0x1F)
final class RenderEffectVerificationHelper {
    @l
    public static final RenderEffectVerificationHelper a;

    static {
        RenderEffectVerificationHelper.a = new RenderEffectVerificationHelper();
    }

    @DoNotInline
    @l
    public final RenderEffect a(@m androidx.compose.ui.graphics.RenderEffect renderEffect0, float f, float f1, int v) {
        RenderEffect renderEffect1;
        if(renderEffect0 == null) {
            renderEffect1 = RenderEffect.createBlurEffect(f, f1, AndroidTileMode_androidKt.b(v));
            L.o(renderEffect1, "{\n            android.gr…)\n            )\n        }");
            return renderEffect1;
        }
        renderEffect1 = RenderEffect.createBlurEffect(f, f1, renderEffect0.a(), AndroidTileMode_androidKt.b(v));
        L.o(renderEffect1, "{\n            android.gr…)\n            )\n        }");
        return renderEffect1;
    }

    @DoNotInline
    @l
    public final RenderEffect b(@m androidx.compose.ui.graphics.RenderEffect renderEffect0, long v) {
        RenderEffect renderEffect1;
        if(renderEffect0 == null) {
            renderEffect1 = RenderEffect.createOffsetEffect(Offset.p(v), Offset.r(v));
            L.o(renderEffect1, "{\n            android.gr…et.x, offset.y)\n        }");
            return renderEffect1;
        }
        renderEffect1 = RenderEffect.createOffsetEffect(Offset.p(v), Offset.r(v), renderEffect0.a());
        L.o(renderEffect1, "{\n            android.gr…)\n            )\n        }");
        return renderEffect1;
    }
}

