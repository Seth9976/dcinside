package androidx.webkit;

import android.webkit.CookieManager;
import androidx.annotation.NonNull;
import androidx.webkit.internal.CookieManagerAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.util.List;

public class CookieManagerCompat {
    private static CookieManagerAdapter a(CookieManager cookieManager0) {
        return WebViewGlueCommunicator.c().a(cookieManager0);
    }

    @NonNull
    public static List b(@NonNull CookieManager cookieManager0, @NonNull String s) {
        if(!WebViewFeatureInternal.Z.d()) {
            throw WebViewFeatureInternal.a();
        }
        return CookieManagerCompat.a(cookieManager0).a(s);
    }
}

