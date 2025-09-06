package androidx.webkit.internal;

import android.webkit.ServiceWorkerController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.ServiceWorkerClientCompat;
import androidx.webkit.ServiceWorkerControllerCompat;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

public class ServiceWorkerControllerImpl extends ServiceWorkerControllerCompat {
    private ServiceWorkerController a;
    private ServiceWorkerControllerBoundaryInterface b;
    private final ServiceWorkerWebSettingsCompat c;

    public ServiceWorkerControllerImpl() {
        this.a = ApiHelperForN.g();
        this.b = null;
        this.c = ApiHelperForN.i(this.e());
    }

    @Override  // androidx.webkit.ServiceWorkerControllerCompat
    @NonNull
    public ServiceWorkerWebSettingsCompat b() {
        return this.c;
    }

    @Override  // androidx.webkit.ServiceWorkerControllerCompat
    public void c(@Nullable ServiceWorkerClientCompat serviceWorkerClientCompat0) {
        if(serviceWorkerClientCompat0 == null) {
            ApiHelperForN.p(this.e(), null);
            return;
        }
        ApiHelperForN.q(this.e(), serviceWorkerClientCompat0);
    }

    private ServiceWorkerControllerBoundaryInterface d() {
        if(this.b == null) {
            this.b = WebViewGlueCommunicator.d().getServiceWorkerController();
        }
        return this.b;
    }

    @RequiresApi(24)
    private ServiceWorkerController e() {
        if(this.a == null) {
            this.a = ApiHelperForN.g();
        }
        return this.a;
    }
}

