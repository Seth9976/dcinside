package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.webkit.internal.ProfileStoreImpl;
import androidx.webkit.internal.WebViewFeatureInternal;

public final class a {
    @NonNull
    public static ProfileStore a() {
        if(!WebViewFeatureInternal.c0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return ProfileStoreImpl.a();
    }
}

