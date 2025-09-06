package androidx.webkit;

import android.webkit.WebResourceRequest;
import androidx.annotation.NonNull;
import androidx.webkit.internal.ApiHelperForN;
import androidx.webkit.internal.WebResourceRequestAdapter;
import androidx.webkit.internal.WebViewGlueCommunicator;

public class WebResourceRequestCompat {
    private static WebResourceRequestAdapter a(WebResourceRequest webResourceRequest0) {
        return WebViewGlueCommunicator.c().k(webResourceRequest0);
    }

    // 去混淆评级： 低(40)
    public static boolean b(@NonNull WebResourceRequest webResourceRequest0) {
        return ApiHelperForN.j(webResourceRequest0);
    }
}

