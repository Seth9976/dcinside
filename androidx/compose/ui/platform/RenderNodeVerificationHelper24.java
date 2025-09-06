package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(24)
final class RenderNodeVerificationHelper24 {
    @l
    public static final RenderNodeVerificationHelper24 a;

    static {
        RenderNodeVerificationHelper24.a = new RenderNodeVerificationHelper24();
    }

    @DoNotInline
    public final void a(@l RenderNode renderNode0) {
        L.p(renderNode0, "renderNode");
        renderNode0.discardDisplayList();
    }
}

