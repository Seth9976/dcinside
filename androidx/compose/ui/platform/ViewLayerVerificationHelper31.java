package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(0x1F)
final class ViewLayerVerificationHelper31 {
    @l
    public static final ViewLayerVerificationHelper31 a;

    static {
        ViewLayerVerificationHelper31.a = new ViewLayerVerificationHelper31();
    }

    @DoNotInline
    public final void a(@l View view0, @m RenderEffect renderEffect0) {
        L.p(view0, "view");
        view0.setRenderEffect((renderEffect0 == null ? null : renderEffect0.a()));
    }
}

