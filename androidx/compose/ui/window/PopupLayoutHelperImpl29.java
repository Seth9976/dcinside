package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(29)
final class PopupLayoutHelperImpl29 extends PopupLayoutHelperImpl {
    @Override  // androidx.compose.ui.window.PopupLayoutHelperImpl
    public void b(@l View view0, int v, int v1) {
        L.p(view0, "composeView");
        view0.setSystemGestureExclusionRects(u.S(new Rect[]{new Rect(0, 0, v, v1)}));
    }
}

