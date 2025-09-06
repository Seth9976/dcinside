package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public class IncompatibleApkWebViewProviderFactory implements WebViewProviderFactory {
    private static final String[] a = null;
    private static final String b = "This should never happen, if this method was called it means we\'re trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily";

    static {
        IncompatibleApkWebViewProviderFactory.a = new String[0];
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public String[] a() {
        return IncompatibleApkWebViewProviderFactory.a;
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public WebViewProviderBoundaryInterface createWebView(@NonNull WebView webView0) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we\'re trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we\'re trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public ProfileStoreBoundaryInterface getProfileStore() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we\'re trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public ProxyControllerBoundaryInterface getProxyController() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we\'re trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we\'re trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we\'re trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public TracingControllerBoundaryInterface getTracingController() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we\'re trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we\'re trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}

