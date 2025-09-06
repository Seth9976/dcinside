package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewRenderProcessClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

public class WebViewRenderProcessClientAdapter implements WebViewRendererClientBoundaryInterface {
    private final Executor a;
    private final WebViewRenderProcessClient b;
    private static final String[] c;

    static {
        WebViewRenderProcessClientAdapter.c = new String[]{"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};
    }

    @SuppressLint({"LambdaLast"})
    public WebViewRenderProcessClientAdapter(@Nullable Executor executor0, @Nullable WebViewRenderProcessClient webViewRenderProcessClient0) {
        this.a = executor0;
        this.b = webViewRenderProcessClient0;
    }

    @Nullable
    public WebViewRenderProcessClient a() {
        return this.b;
    }

    @Override  // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public final String[] getSupportedFeatures() {
        return WebViewRenderProcessClientAdapter.c;
    }

    @Override  // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(@NonNull WebView webView0, @NonNull InvocationHandler invocationHandler0) {
        WebViewRenderProcessImpl webViewRenderProcessImpl0 = WebViewRenderProcessImpl.c(invocationHandler0);
        WebViewRenderProcessClient webViewRenderProcessClient0 = this.b;
        Executor executor0 = this.a;
        if(executor0 == null) {
            webViewRenderProcessClient0.a(webView0, webViewRenderProcessImpl0);
            return;
        }
        executor0.execute(new Runnable() {
            final WebViewRenderProcessClientAdapter d;

            @Override
            public void run() {
                webViewRenderProcessClient0.a(webView0, webViewRenderProcessImpl0);
            }
        });
    }

    @Override  // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(@NonNull WebView webView0, @NonNull InvocationHandler invocationHandler0) {
        WebViewRenderProcessImpl webViewRenderProcessImpl0 = WebViewRenderProcessImpl.c(invocationHandler0);
        WebViewRenderProcessClient webViewRenderProcessClient0 = this.b;
        Executor executor0 = this.a;
        if(executor0 == null) {
            webViewRenderProcessClient0.b(webView0, webViewRenderProcessImpl0);
            return;
        }
        executor0.execute(new Runnable() {
            final WebViewRenderProcessClientAdapter d;

            @Override
            public void run() {
                webViewRenderProcessClient0.b(webView0, webViewRenderProcessImpl0);
            }
        });
    }
}

