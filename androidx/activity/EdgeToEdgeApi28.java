package androidx.activity;

import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(28)
class EdgeToEdgeApi28 extends EdgeToEdgeApi26 {
    @Override  // androidx.activity.EdgeToEdgeBase
    @DoNotInline
    public void a(@l Window window0) {
        L.p(window0, "window");
        window0.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}

