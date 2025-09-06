package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(0x1F)
final class RenderNodeApi29VerificationHelper {
    @l
    public static final RenderNodeApi29VerificationHelper a;

    static {
        RenderNodeApi29VerificationHelper.a = new RenderNodeApi29VerificationHelper();
    }

    @DoNotInline
    public final void a(@l RenderNode renderNode0, @m RenderEffect renderEffect0) {
        L.p(renderNode0, "renderNode");
        renderNode0.setRenderEffect((renderEffect0 == null ? null : renderEffect0.a()));
    }
}

