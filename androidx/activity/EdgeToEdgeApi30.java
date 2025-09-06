package androidx.activity;

import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(30)
final class EdgeToEdgeApi30 extends EdgeToEdgeApi29 {
    @Override  // androidx.activity.EdgeToEdgeApi28
    @DoNotInline
    public void a(@l Window window0) {
        L.p(window0, "window");
        window0.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}

