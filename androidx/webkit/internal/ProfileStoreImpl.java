package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.util.a;

public class ProfileStoreImpl implements ProfileStore {
    private final ProfileStoreBoundaryInterface a;
    private static ProfileStore b;

    private ProfileStoreImpl() {
        this.a = null;
    }

    private ProfileStoreImpl(ProfileStoreBoundaryInterface profileStoreBoundaryInterface0) {
        this.a = profileStoreBoundaryInterface0;
    }

    @NonNull
    public static ProfileStore a() {
        if(ProfileStoreImpl.b == null) {
            ProfileStoreImpl.b = new ProfileStoreImpl(WebViewGlueCommunicator.d().getProfileStore());
        }
        return ProfileStoreImpl.b;
    }

    @Override  // androidx.webkit.ProfileStore
    public boolean deleteProfile(@NonNull String s) throws IllegalStateException {
        if(!WebViewFeatureInternal.c0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return this.a.deleteProfile(s);
    }

    @Override  // androidx.webkit.ProfileStore
    @NonNull
    public List getAllProfileNames() {
        if(!WebViewFeatureInternal.c0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return this.a.getAllProfileNames();
    }

    @Override  // androidx.webkit.ProfileStore
    @NonNull
    public Profile getOrCreateProfile(@NonNull String s) {
        if(!WebViewFeatureInternal.c0.d()) {
            throw WebViewFeatureInternal.a();
        }
        InvocationHandler invocationHandler0 = this.a.getOrCreateProfile(s);
        return new ProfileImpl(((ProfileBoundaryInterface)a.a(ProfileBoundaryInterface.class, invocationHandler0)));
    }

    @Override  // androidx.webkit.ProfileStore
    @Nullable
    public Profile getProfile(@NonNull String s) {
        if(!WebViewFeatureInternal.c0.d()) {
            throw WebViewFeatureInternal.a();
        }
        InvocationHandler invocationHandler0 = this.a.getProfile(s);
        return invocationHandler0 != null ? new ProfileImpl(((ProfileBoundaryInterface)a.a(ProfileBoundaryInterface.class, invocationHandler0))) : null;
    }
}

