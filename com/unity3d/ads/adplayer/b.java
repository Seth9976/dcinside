package com.unity3d.ads.adplayer;

import android.webkit.WebResourceResponse;
import androidx.webkit.WebViewAssetLoader.PathHandler;

public final class b implements PathHandler {
    public final CommonGetWebViewCacheAssetLoader a;

    public b(CommonGetWebViewCacheAssetLoader commonGetWebViewCacheAssetLoader0) {
        this.a = commonGetWebViewCacheAssetLoader0;
    }

    @Override  // androidx.webkit.WebViewAssetLoader$PathHandler
    public final WebResourceResponse a(String s) {
        return com.unity3d.ads.adplayer.CommonGetWebViewCacheAssetLoader.invoke.1.invokeSuspend$lambda$2(this.a, s);
    }
}

