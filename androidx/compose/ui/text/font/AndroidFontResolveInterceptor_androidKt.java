package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build.VERSION;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidFontResolveInterceptor_androidKt {
    @l
    public static final AndroidFontResolveInterceptor a(@l Context context0) {
        L.p(context0, "context");
        return Build.VERSION.SDK_INT < 0x1F ? new AndroidFontResolveInterceptor(0) : new AndroidFontResolveInterceptor(context0.getResources().getConfiguration().fontWeightAdjustment);
    }
}

