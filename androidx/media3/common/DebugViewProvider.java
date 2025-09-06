package androidx.media3.common;

import android.view.SurfaceView;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface DebugViewProvider {
    public static final DebugViewProvider a;

    static {
        DebugViewProvider.a = new e();
    }

    @Nullable
    SurfaceView a(int arg1, int arg2);
}

