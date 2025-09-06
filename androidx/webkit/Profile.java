package androidx.webkit;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import androidx.annotation.NonNull;

public interface Profile {
    public static final String a = "Default";

    @NonNull
    GeolocationPermissions a();

    @NonNull
    CookieManager getCookieManager();

    @NonNull
    String getName();

    @NonNull
    ServiceWorkerController getServiceWorkerController();

    @NonNull
    WebStorage getWebStorage();
}

