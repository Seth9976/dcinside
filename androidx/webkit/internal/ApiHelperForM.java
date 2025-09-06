package androidx.webkit.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort.WebMessageCallback;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView.VisualStateCallback;
import android.webkit.WebView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat;
import androidx.webkit.WebViewCompat.VisualStateCallback;

@RequiresApi(23)
public class ApiHelperForM {
    @DoNotInline
    public static void a(@NonNull WebMessagePort webMessagePort0) {
        webMessagePort0.close();
    }

    @DoNotInline
    @NonNull
    public static WebMessage b(@NonNull WebMessageCompat webMessageCompat0) {
        return e.a(webMessageCompat0.c(), WebMessagePortImpl.h(webMessageCompat0.d()));
    }

    @DoNotInline
    @NonNull
    public static WebMessagePort[] c(@NonNull WebView webView0) {
        return webView0.createWebMessageChannel();
    }

    @DoNotInline
    @NonNull
    public static WebMessageCompat d(@NonNull WebMessage webMessage0) {
        return new WebMessageCompat(webMessage0.getData(), WebMessagePortImpl.l(webMessage0.getPorts()));
    }

    @DoNotInline
    @NonNull
    public static CharSequence e(@NonNull WebResourceError webResourceError0) {
        return webResourceError0.getDescription();
    }

    @DoNotInline
    public static int f(@NonNull WebResourceError webResourceError0) {
        return webResourceError0.getErrorCode();
    }

    @DoNotInline
    public static boolean g(@NonNull WebSettings webSettings0) {
        return webSettings0.getOffscreenPreRaster();
    }

    @DoNotInline
    public static void h(@NonNull WebMessagePort webMessagePort0, @NonNull WebMessage webMessage0) {
        webMessagePort0.postMessage(webMessage0);
    }

    @DoNotInline
    public static void i(@NonNull WebView webView0, long v, @NonNull VisualStateCallback webViewCompat$VisualStateCallback0) {
        webView0.postVisualStateCallback(v, new WebView.VisualStateCallback() {
            @Override  // android.webkit.WebView$VisualStateCallback
            public void onComplete(long v) {
                webViewCompat$VisualStateCallback0.onComplete(v);
            }
        });
    }

    @DoNotInline
    public static void j(@NonNull WebView webView0, @NonNull WebMessage webMessage0, @NonNull Uri uri0) {
        webView0.postWebMessage(webMessage0, uri0);
    }

    @DoNotInline
    public static void k(@NonNull WebSettings webSettings0, boolean z) {
        webSettings0.setOffscreenPreRaster(z);
    }

    @DoNotInline
    public static void l(@NonNull WebMessagePort webMessagePort0, @NonNull WebMessageCallbackCompat webMessagePortCompat$WebMessageCallbackCompat0) {
        webMessagePort0.setWebMessageCallback(new WebMessagePort.WebMessageCallback() {
            @Override  // android.webkit.WebMessagePort$WebMessageCallback
            public void onMessage(WebMessagePort webMessagePort0, WebMessage webMessage0) {
                new WebMessagePortImpl(webMessagePort0);
                WebMessagePortImpl.i(webMessage0);
            }
        });
    }

    @DoNotInline
    public static void m(@NonNull WebMessagePort webMessagePort0, @NonNull WebMessageCallbackCompat webMessagePortCompat$WebMessageCallbackCompat0, @Nullable Handler handler0) {
        webMessagePort0.setWebMessageCallback(new WebMessagePort.WebMessageCallback() {
            @Override  // android.webkit.WebMessagePort$WebMessageCallback
            public void onMessage(WebMessagePort webMessagePort0, WebMessage webMessage0) {
                new WebMessagePortImpl(webMessagePort0);
                WebMessagePortImpl.i(webMessage0);
            }
        }, handler0);
    }
}

