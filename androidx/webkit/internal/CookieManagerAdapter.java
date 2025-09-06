package androidx.webkit.internal;

import androidx.annotation.NonNull;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;

public class CookieManagerAdapter {
    private final WebViewCookieManagerBoundaryInterface a;

    public CookieManagerAdapter(@NonNull WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface0) {
        this.a = webViewCookieManagerBoundaryInterface0;
    }

    @NonNull
    public List a(@NonNull String s) {
        return this.a.getCookieInfo(s);
    }
}

