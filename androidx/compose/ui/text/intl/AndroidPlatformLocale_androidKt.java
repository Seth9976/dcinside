package androidx.compose.ui.text.intl;

import android.os.Build.VERSION;
import y4.l;

public final class AndroidPlatformLocale_androidKt {
    @l
    public static final PlatformLocaleDelegate a() {
        return Build.VERSION.SDK_INT >= 24 ? new AndroidLocaleDelegateAPI24() : new AndroidLocaleDelegateAPI23();
    }
}

