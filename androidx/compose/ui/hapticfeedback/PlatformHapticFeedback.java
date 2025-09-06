package androidx.compose.ui.hapticfeedback;

import android.view.View;
import kotlin.jvm.internal.L;
import y4.l;

public final class PlatformHapticFeedback implements HapticFeedback {
    @l
    private final View a;

    public PlatformHapticFeedback(@l View view0) {
        L.p(view0, "view");
        super();
        this.a = view0;
    }

    @Override  // androidx.compose.ui.hapticfeedback.HapticFeedback
    public void a(int v) {
        if(HapticFeedbackType.d(v, 0)) {
            this.a.performHapticFeedback(0);
            return;
        }
        if(HapticFeedbackType.d(v, 9)) {
            this.a.performHapticFeedback(9);
        }
    }
}

