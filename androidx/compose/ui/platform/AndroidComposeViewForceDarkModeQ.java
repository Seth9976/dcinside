package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(29)
final class AndroidComposeViewForceDarkModeQ {
    @l
    public static final AndroidComposeViewForceDarkModeQ a;

    static {
        AndroidComposeViewForceDarkModeQ.a = new AndroidComposeViewForceDarkModeQ();
    }

    @DoNotInline
    @RequiresApi(29)
    public final void a(@l View view0) {
        L.p(view0, "view");
        view0.setForceDarkAllowed(false);
    }
}

