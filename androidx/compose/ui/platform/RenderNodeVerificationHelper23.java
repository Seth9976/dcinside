package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(23)
final class RenderNodeVerificationHelper23 {
    @l
    public static final RenderNodeVerificationHelper23 a;

    static {
        RenderNodeVerificationHelper23.a = new RenderNodeVerificationHelper23();
    }

    @DoNotInline
    public final void a(@l RenderNode renderNode0) {
        L.p(renderNode0, "renderNode");
        renderNode0.destroyDisplayListData();
    }
}

