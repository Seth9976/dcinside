package androidx.webkit.internal;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.ServiceWorkerClientCompat;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;

public class ServiceWorkerClientAdapter implements ServiceWorkerClientBoundaryInterface {
    private final ServiceWorkerClientCompat a;

    public ServiceWorkerClientAdapter(@NonNull ServiceWorkerClientCompat serviceWorkerClientCompat0) {
        this.a = serviceWorkerClientCompat0;
    }

    @Override  // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return new String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }

    @Override  // org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NonNull WebResourceRequest webResourceRequest0) {
        return this.a.a(webResourceRequest0);
    }
}

