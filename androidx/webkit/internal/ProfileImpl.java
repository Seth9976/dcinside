package androidx.webkit.internal;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import androidx.annotation.NonNull;
import androidx.webkit.Profile;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

public class ProfileImpl implements Profile {
    private final ProfileBoundaryInterface b;

    private ProfileImpl() {
        this.b = null;
    }

    ProfileImpl(ProfileBoundaryInterface profileBoundaryInterface0) {
        this.b = profileBoundaryInterface0;
    }

    @Override  // androidx.webkit.Profile
    @NonNull
    public GeolocationPermissions a() throws IllegalStateException {
        if(!WebViewFeatureInternal.c0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return this.b.getGeoLocationPermissions();
    }

    @Override  // androidx.webkit.Profile
    @NonNull
    public CookieManager getCookieManager() throws IllegalStateException {
        if(!WebViewFeatureInternal.c0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return this.b.getCookieManager();
    }

    @Override  // androidx.webkit.Profile
    @NonNull
    public String getName() {
        if(!WebViewFeatureInternal.c0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return this.b.getName();
    }

    @Override  // androidx.webkit.Profile
    @NonNull
    public ServiceWorkerController getServiceWorkerController() throws IllegalStateException {
        if(!WebViewFeatureInternal.c0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return this.b.getServiceWorkerController();
    }

    @Override  // androidx.webkit.Profile
    @NonNull
    public WebStorage getWebStorage() throws IllegalStateException {
        if(!WebViewFeatureInternal.c0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return this.b.getWebStorage();
    }
}

