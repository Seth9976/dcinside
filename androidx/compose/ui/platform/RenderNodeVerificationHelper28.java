package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(28)
final class RenderNodeVerificationHelper28 {
    @l
    public static final RenderNodeVerificationHelper28 a;

    static {
        RenderNodeVerificationHelper28.a = new RenderNodeVerificationHelper28();
    }

    @DoNotInline
    public final int a(@l RenderNode renderNode0) {
        L.p(renderNode0, "renderNode");
        return renderNode0.getAmbientShadowColor();
    }

    @DoNotInline
    public final int b(@l RenderNode renderNode0) {
        L.p(renderNode0, "renderNode");
        return renderNode0.getSpotShadowColor();
    }

    @DoNotInline
    public final void c(@l RenderNode renderNode0, int v) {
        L.p(renderNode0, "renderNode");
        renderNode0.setAmbientShadowColor(v);
    }

    @DoNotInline
    public final void d(@l RenderNode renderNode0, int v) {
        L.p(renderNode0, "renderNode");
        renderNode0.setSpotShadowColor(v);
    }
}

