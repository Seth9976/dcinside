package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import kotlin.jvm.internal.L;
import y4.l;

class PopupLayoutHelperImpl implements PopupLayoutHelper {
    @Override  // androidx.compose.ui.window.PopupLayoutHelper
    public void a(@l WindowManager windowManager0, @l View view0, @l ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        L.p(windowManager0, "windowManager");
        L.p(view0, "popupView");
        L.p(viewGroup$LayoutParams0, "params");
        windowManager0.updateViewLayout(view0, viewGroup$LayoutParams0);
    }

    @Override  // androidx.compose.ui.window.PopupLayoutHelper
    public void b(@l View view0, int v, int v1) {
        L.p(view0, "composeView");
    }

    @Override  // androidx.compose.ui.window.PopupLayoutHelper
    public void c(@l View view0, @l Rect rect0) {
        L.p(view0, "composeView");
        L.p(rect0, "outRect");
        view0.getWindowVisibleDisplayFrame(rect0);
    }
}

