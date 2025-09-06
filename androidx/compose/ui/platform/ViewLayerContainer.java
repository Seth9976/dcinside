package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import kotlin.jvm.internal.L;
import y4.l;

public final class ViewLayerContainer extends DrawChildContainer {
    public ViewLayerContainer(@l Context context0) {
        L.p(context0, "context");
        super(context0);
    }

    @Override  // androidx.compose.ui.platform.DrawChildContainer
    protected void dispatchDraw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
    }

    protected final void dispatchGetDisplayList() {
    }
}

