package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(29)
class EdgeToEdgeApi29 extends EdgeToEdgeApi28 {
    @Override  // androidx.activity.EdgeToEdgeApi26
    @DoNotInline
    public void b(@l SystemBarStyle systemBarStyle0, @l SystemBarStyle systemBarStyle1, @l Window window0, @l View view0, boolean z, boolean z1) {
        L.p(systemBarStyle0, "statusBarStyle");
        L.p(systemBarStyle1, "navigationBarStyle");
        L.p(window0, "window");
        L.p(view0, "view");
        boolean z2 = false;
        WindowCompat.c(window0, false);
        window0.setStatusBarColor(systemBarStyle0.h(z));
        window0.setNavigationBarColor(systemBarStyle1.h(z1));
        window0.setStatusBarContrastEnforced(false);
        if(systemBarStyle1.f() == 0) {
            z2 = true;
        }
        window0.setNavigationBarContrastEnforced(z2);
        WindowInsetsControllerCompat windowInsetsControllerCompat0 = new WindowInsetsControllerCompat(window0, view0);
        windowInsetsControllerCompat0.i(!z);
        windowInsetsControllerCompat0.h(((boolean)(true ^ z1)));
    }
}

