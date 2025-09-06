package androidx.transition;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class GhostViewUtils {
    @Nullable
    static GhostView a(@NonNull View view0, @NonNull ViewGroup viewGroup0, @Nullable Matrix matrix0) {
        return Build.VERSION.SDK_INT == 28 ? GhostViewPlatform.b(view0, viewGroup0, matrix0) : GhostViewPort.b(view0, viewGroup0, matrix0);
    }

    static void b(View view0) {
        if(Build.VERSION.SDK_INT == 28) {
            GhostViewPlatform.f(view0);
            return;
        }
        GhostViewPort.f(view0);
    }
}

