package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(21)
final class EdgeToEdgeApi21 extends EdgeToEdgeBase {
    @Override  // androidx.activity.EdgeToEdgeBase
    @DoNotInline
    public void b(@l SystemBarStyle systemBarStyle0, @l SystemBarStyle systemBarStyle1, @l Window window0, @l View view0, boolean z, boolean z1) {
        L.p(systemBarStyle0, "statusBarStyle");
        L.p(systemBarStyle1, "navigationBarStyle");
        L.p(window0, "window");
        L.p(view0, "view");
        WindowCompat.c(window0, false);
        window0.addFlags(0x4000000);
        window0.addFlags(0x8000000);
    }
}

