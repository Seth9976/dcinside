package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(28)
final class ViewLayerVerificationHelper28 {
    @l
    public static final ViewLayerVerificationHelper28 a;

    static {
        ViewLayerVerificationHelper28.a = new ViewLayerVerificationHelper28();
    }

    @DoNotInline
    public final void a(@l View view0, int v) {
        L.p(view0, "view");
        view0.setOutlineAmbientShadowColor(v);
    }

    @DoNotInline
    public final void b(@l View view0, int v) {
        L.p(view0, "view");
        view0.setOutlineSpotShadowColor(v);
    }
}

