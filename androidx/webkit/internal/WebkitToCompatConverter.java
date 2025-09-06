package androidx.webkit.internal;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.a;

public class WebkitToCompatConverter {
    private final WebkitToCompatConverterBoundaryInterface a;

    public WebkitToCompatConverter(@NonNull WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface0) {
        this.a = webkitToCompatConverterBoundaryInterface0;
    }

    @NonNull
    public CookieManagerAdapter a(@NonNull CookieManager cookieManager0) {
        InvocationHandler invocationHandler0 = this.a.convertCookieManager(cookieManager0);
        return new CookieManagerAdapter(((WebViewCookieManagerBoundaryInterface)a.a(WebViewCookieManagerBoundaryInterface.class, invocationHandler0)));
    }

    @NonNull
    @RequiresApi(27)
    public SafeBrowsingResponse b(@NonNull InvocationHandler invocationHandler0) {
        return m0.a(this.a.convertSafeBrowsingResponse(invocationHandler0));
    }

    @NonNull
    public InvocationHandler c(@NonNull SafeBrowsingResponse safeBrowsingResponse0) {
        return this.a.convertSafeBrowsingResponse(safeBrowsingResponse0);
    }

    @NonNull
    @RequiresApi(24)
    public ServiceWorkerWebSettings d(@NonNull InvocationHandler invocationHandler0) {
        return p0.a(this.a.convertServiceWorkerSettings(invocationHandler0));
    }

    @NonNull
    public InvocationHandler e(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0) {
        return this.a.convertServiceWorkerSettings(serviceWorkerWebSettings0);
    }

    @NonNull
    public WebSettingsAdapter f(@NonNull WebSettings webSettings0) {
        InvocationHandler invocationHandler0 = this.a.convertSettings(webSettings0);
        return new WebSettingsAdapter(((WebSettingsBoundaryInterface)a.a(WebSettingsBoundaryInterface.class, invocationHandler0)));
    }

    @NonNull
    @RequiresApi(23)
    public WebMessagePort g(@NonNull InvocationHandler invocationHandler0) {
        return o0.a(this.a.convertWebMessagePort(invocationHandler0));
    }

    @NonNull
    public InvocationHandler h(@NonNull WebMessagePort webMessagePort0) {
        return this.a.convertWebMessagePort(webMessagePort0);
    }

    @NonNull
    @RequiresApi(23)
    public WebResourceError i(@NonNull InvocationHandler invocationHandler0) {
        return n0.a(this.a.convertWebResourceError(invocationHandler0));
    }

    @NonNull
    public InvocationHandler j(@NonNull WebResourceError webResourceError0) {
        return this.a.convertWebResourceError(webResourceError0);
    }

    @NonNull
    public WebResourceRequestAdapter k(@NonNull WebResourceRequest webResourceRequest0) {
        InvocationHandler invocationHandler0 = this.a.convertWebResourceRequest(webResourceRequest0);
        return new WebResourceRequestAdapter(((WebResourceRequestBoundaryInterface)a.a(WebResourceRequestBoundaryInterface.class, invocationHandler0)));
    }
}

