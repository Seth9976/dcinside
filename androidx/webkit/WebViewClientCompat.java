package androidx.webkit;

import android.app.PendingIntent;
import android.os.Build.VERSION;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.webkit.internal.ApiHelperForLollipop;
import androidx.webkit.internal.SafeBrowsingResponseImpl;
import androidx.webkit.internal.WebResourceErrorImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SafeBrowsingThreat {
    }

    private static final String[] sSupportedFeatures;

    static {
        WebViewClientCompat.sSupportedFeatures = new String[]{"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};
    }

    @Override  // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    @RestrictTo({Scope.a})
    public final String[] getSupportedFeatures() {
        return WebViewClientCompat.sSupportedFeatures;
    }

    @Override  // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @UiThread
    public void onPageCommitVisible(@NonNull WebView webView0, @NonNull String s) {
    }

    @Override  // android.webkit.WebViewClient
    @RequiresApi(23)
    public final void onReceivedError(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0, @NonNull WebResourceError webResourceError0) {
        if(Build.VERSION.SDK_INT < 23) {
            return;
        }
        this.onReceivedError(webView0, webResourceRequest0, new WebResourceErrorImpl(webResourceError0));
    }

    @RequiresApi(21)
    @UiThread
    public void onReceivedError(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0, @NonNull WebResourceErrorCompat webResourceErrorCompat0) {
        if(WebViewFeature.a("WEB_RESOURCE_ERROR_GET_CODE") && WebViewFeature.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && ApiHelperForLollipop.b(webResourceRequest0)) {
            this.onReceivedError(webView0, webResourceErrorCompat0.b(), webResourceErrorCompat0.a().toString(), ApiHelperForLollipop.a(webResourceRequest0).toString());
        }
    }

    @Override  // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @RequiresApi(21)
    @RestrictTo({Scope.a})
    public final void onReceivedError(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0, @NonNull InvocationHandler invocationHandler0) {
        this.onReceivedError(webView0, webResourceRequest0, new WebResourceErrorImpl(invocationHandler0));
    }

    @Override  // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @UiThread
    public void onReceivedHttpError(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0, @NonNull WebResourceResponse webResourceResponse0) {
    }

    @Override  // android.webkit.WebViewClient
    @RequiresApi(27)
    public final void onSafeBrowsingHit(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0, int v, @NonNull SafeBrowsingResponse safeBrowsingResponse0) {
        this.onSafeBrowsingHit(webView0, webResourceRequest0, v, new SafeBrowsingResponseImpl(safeBrowsingResponse0));
    }

    @UiThread
    public void onSafeBrowsingHit(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0, int v, @NonNull SafeBrowsingResponseCompat safeBrowsingResponseCompat0) {
        if(!WebViewFeature.a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            throw WebViewFeatureInternal.a();
        }
        safeBrowsingResponseCompat0.c(true);
    }

    @Override  // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @RestrictTo({Scope.a})
    public final void onSafeBrowsingHit(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0, int v, @NonNull InvocationHandler invocationHandler0) {
        this.onSafeBrowsingHit(webView0, webResourceRequest0, v, new SafeBrowsingResponseImpl(invocationHandler0));
    }

    @Override  // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @RestrictTo({Scope.a})
    public boolean onWebAuthnIntent(@NonNull WebView webView0, @NonNull PendingIntent pendingIntent0, @NonNull InvocationHandler invocationHandler0) {
        return false;
    }

    @Override  // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @RequiresApi(21)
    @UiThread
    public boolean shouldOverrideUrlLoading(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0) {
        return this.shouldOverrideUrlLoading(webView0, ApiHelperForLollipop.a(webResourceRequest0).toString());
    }
}

