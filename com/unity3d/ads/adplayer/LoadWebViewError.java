package com.unity3d.ads.adplayer;

import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class LoadWebViewError extends AdPlayerError {
    @l
    private final List errors;

    public LoadWebViewError(@l List list0) {
        L.p(list0, "errors");
        super("AdPlayer was not able to load the webview.", null);
        this.errors = list0;
    }

    @l
    public final List getErrors() {
        return this.errors;
    }
}

