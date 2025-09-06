package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.L;
import y4.l;

public final class ViewLayer.Companion.OutlineProvider.1 extends ViewOutlineProvider {
    @Override  // android.view.ViewOutlineProvider
    public void getOutline(@l View view0, @l Outline outline0) {
        L.p(view0, "view");
        L.p(outline0, "outline");
        Outline outline1 = ((ViewLayer)view0).e.c();
        L.m(outline1);
        outline0.set(outline1);
    }
}

