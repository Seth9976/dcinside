package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(23)
final class EdgeToEdgeApi23 extends EdgeToEdgeBase {
    @Override  // androidx.activity.EdgeToEdgeBase
    @DoNotInline
    public void b(@l SystemBarStyle systemBarStyle0, @l SystemBarStyle systemBarStyle1, @l Window window0, @l View view0, boolean z, boolean z1) {
        L.p(systemBarStyle0, "statusBarStyle");
        L.p(systemBarStyle1, "navigationBarStyle");
        L.p(window0, "window");
        L.p(view0, "view");
        WindowCompat.c(window0, false);
        window0.setStatusBarColor(systemBarStyle0.g(z));
        window0.setNavigationBarColor(systemBarStyle1.d());
        new WindowInsetsControllerCompat(window0, view0).i(!z);
    }
}

