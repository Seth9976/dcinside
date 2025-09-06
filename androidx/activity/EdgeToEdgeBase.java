package androidx.activity;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.L;
import y4.l;

class EdgeToEdgeBase implements EdgeToEdgeImpl {
    @Override  // androidx.activity.EdgeToEdgeImpl
    public void a(@l Window window0) {
        L.p(window0, "window");
    }

    @Override  // androidx.activity.EdgeToEdgeImpl
    public void b(@l SystemBarStyle systemBarStyle0, @l SystemBarStyle systemBarStyle1, @l Window window0, @l View view0, boolean z, boolean z1) {
        L.p(systemBarStyle0, "statusBarStyle");
        L.p(systemBarStyle1, "navigationBarStyle");
        L.p(window0, "window");
        L.p(view0, "view");
    }
}

