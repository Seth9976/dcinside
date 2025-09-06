package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(26)
final class AndroidComposeViewVerificationHelperMethodsO {
    @l
    public static final AndroidComposeViewVerificationHelperMethodsO a;

    static {
        AndroidComposeViewVerificationHelperMethodsO.a = new AndroidComposeViewVerificationHelperMethodsO();
    }

    @DoNotInline
    @RequiresApi(26)
    public final void a(@l View view0, int v, boolean z) {
        L.p(view0, "view");
        view0.setFocusable(v);
        view0.setDefaultFocusHighlightEnabled(z);
    }
}

