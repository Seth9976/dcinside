package androidx.webkit.internal;

import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

public class WebResourceRequestAdapter {
    private final WebResourceRequestBoundaryInterface a;

    public WebResourceRequestAdapter(@NonNull WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface0) {
        this.a = webResourceRequestBoundaryInterface0;
    }

    public boolean a() {
        return this.a.isRedirect();
    }
}

