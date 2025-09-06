package androidx.webkit.internal;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

@RequiresApi(29)
public class ApiHelperForQ {
    @DoNotInline
    @Deprecated
    public static int a(@NonNull WebSettings webSettings0) {
        return webSettings0.getForceDark();
    }

    @DoNotInline
    @Nullable
    public static WebViewRenderProcess b(@NonNull WebView webView0) {
        return webView0.getWebViewRenderProcess();
    }

    @DoNotInline
    @Nullable
    public static WebViewRenderProcessClient c(@NonNull WebView webView0) {
        return webView0.getWebViewRenderProcessClient();
    }

    @DoNotInline
    @Deprecated
    public static void d(@NonNull WebSettings webSettings0, int v) {
        webSettings0.setForceDark(v);
    }

    @DoNotInline
    public static void e(@NonNull WebView webView0, @Nullable androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient0) {
        webView0.setWebViewRenderProcessClient((webViewRenderProcessClient0 == null ? null : new WebViewRenderProcessClientFrameworkAdapter(webViewRenderProcessClient0)));
    }

    @DoNotInline
    public static void f(@NonNull WebView webView0, @NonNull Executor executor0, @Nullable androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient0) {
        webView0.setWebViewRenderProcessClient(executor0, (webViewRenderProcessClient0 == null ? null : new WebViewRenderProcessClientFrameworkAdapter(webViewRenderProcessClient0)));
    }

    @DoNotInline
    public static boolean g(@NonNull WebViewRenderProcess webViewRenderProcess0) {
        return webViewRenderProcess0.terminate();
    }
}

