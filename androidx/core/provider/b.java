package androidx.core.provider;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;

public final class b {
    public static ContentQueryWrapper a(Context context0, Uri uri0) {
        return Build.VERSION.SDK_INT < 24 ? new ContentQueryWrapperApi16Impl(context0, uri0) : new ContentQueryWrapperApi24Impl(context0, uri0);
    }
}

