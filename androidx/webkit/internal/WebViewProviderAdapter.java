package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.Profile;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat.VisualStateCallback;
import androidx.webkit.WebViewCompat.WebMessageListener;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.util.a;

public class WebViewProviderAdapter {
    WebViewProviderBoundaryInterface a;

    public WebViewProviderAdapter(@NonNull WebViewProviderBoundaryInterface webViewProviderBoundaryInterface0) {
        this.a = webViewProviderBoundaryInterface0;
    }

    @NonNull
    public ScriptHandlerImpl a(@NonNull String s, @NonNull String[] arr_s) {
        return ScriptHandlerImpl.a(this.a.addDocumentStartJavaScript(s, arr_s));
    }

    public void b(@NonNull String s, @NonNull String[] arr_s, @NonNull WebMessageListener webViewCompat$WebMessageListener0) {
        this.a.addWebMessageListener(s, arr_s, a.d(new WebMessageListenerAdapter(webViewCompat$WebMessageListener0)));
    }

    @NonNull
    public WebMessagePortCompat[] c() {
        InvocationHandler[] arr_invocationHandler = this.a.createWebMessageChannel();
        WebMessagePortCompat[] arr_webMessagePortCompat = new WebMessagePortCompat[arr_invocationHandler.length];
        for(int v = 0; v < arr_invocationHandler.length; ++v) {
            arr_webMessagePortCompat[v] = new WebMessagePortImpl(arr_invocationHandler[v]);
        }
        return arr_webMessagePortCompat;
    }

    @NonNull
    public Profile d() {
        InvocationHandler invocationHandler0 = this.a.getProfile();
        return new ProfileImpl(((ProfileBoundaryInterface)a.a(ProfileBoundaryInterface.class, invocationHandler0)));
    }

    @Nullable
    public WebChromeClient e() {
        return this.a.getWebChromeClient();
    }

    @NonNull
    public WebViewClient f() {
        return this.a.getWebViewClient();
    }

    @Nullable
    public WebViewRenderProcess g() {
        return WebViewRenderProcessImpl.c(this.a.getWebViewRenderer());
    }

    @Nullable
    public WebViewRenderProcessClient h() {
        InvocationHandler invocationHandler0 = this.a.getWebViewRendererClient();
        return invocationHandler0 == null ? null : ((WebViewRenderProcessClientAdapter)a.g(invocationHandler0)).a();
    }

    public void i(long v, @NonNull VisualStateCallback webViewCompat$VisualStateCallback0) {
        this.a.insertVisualStateCallback(v, a.d(new VisualStateCallbackAdapter(webViewCompat$VisualStateCallback0)));
    }

    public boolean j() {
        return this.a.isAudioMuted();
    }

    public void k(@NonNull WebMessageCompat webMessageCompat0, @NonNull Uri uri0) {
        this.a.postMessageToMainFrame(a.d(new WebMessageAdapter(webMessageCompat0)), uri0);
    }

    public void l(@NonNull String s) {
        this.a.removeWebMessageListener(s);
    }

    public void m(boolean z) {
        this.a.setAudioMuted(z);
    }

    public void n(@NonNull String s) {
        this.a.setProfile(s);
    }

    @SuppressLint({"LambdaLast"})
    public void o(@Nullable Executor executor0, @Nullable WebViewRenderProcessClient webViewRenderProcessClient0) {
        InvocationHandler invocationHandler0 = webViewRenderProcessClient0 == null ? null : a.d(new WebViewRenderProcessClientAdapter(executor0, webViewRenderProcessClient0));
        this.a.setWebViewRendererClient(invocationHandler0);
    }
}

