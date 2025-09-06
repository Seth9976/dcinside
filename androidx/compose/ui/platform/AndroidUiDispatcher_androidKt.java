package androidx.compose.ui.platform;

import android.os.Looper;

public final class AndroidUiDispatcher_androidKt {
    private static final boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}

