package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
public class ApiHelperForLollipop {
    @DoNotInline
    @NonNull
    public static Uri a(@NonNull WebResourceRequest webResourceRequest0) {
        return webResourceRequest0.getUrl();
    }

    @DoNotInline
    public static boolean b(@NonNull WebResourceRequest webResourceRequest0) {
        return webResourceRequest0.isForMainFrame();
    }
}

