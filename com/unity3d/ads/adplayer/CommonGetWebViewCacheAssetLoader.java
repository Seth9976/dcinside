package com.unity3d.ads.adplayer;

import A3.o;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import androidx.webkit.WebViewAssetLoader.Builder;
import androidx.webkit.WebViewAssetLoader;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import java.io.InputStream;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kotlinx.coroutines.j;
import y4.l;
import y4.m;

public final class CommonGetWebViewCacheAssetLoader implements GetWebViewCacheAssetLoader {
    @l
    private final Context context;
    @l
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;

    public CommonGetWebViewCacheAssetLoader(@l Context context0, @l GetLatestWebViewConfiguration getLatestWebViewConfiguration0) {
        L.p(context0, "context");
        L.p(getLatestWebViewConfiguration0, "getLatestWebViewConfiguration");
        super();
        this.context = context0;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration0;
    }

    @Override  // com.unity3d.ads.adplayer.GetWebViewCacheAssetLoader
    @l
    public WebViewAssetLoader invoke() {
        Object object0 = j.b(null, new o(null) {
            int label;

            {
                CommonGetWebViewCacheAssetLoader.this = commonGetWebViewCacheAssetLoader0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.CommonGetWebViewCacheAssetLoader.invoke.1(CommonGetWebViewCacheAssetLoader.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.adplayer.CommonGetWebViewCacheAssetLoader.invoke.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                String s1;
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        this.label = 1;
                        object0 = GetLatestWebViewConfiguration.invoke$default(CommonGetWebViewCacheAssetLoader.this.getLatestWebViewConfiguration, null, null, null, this, 7, null);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                Uri uri0 = Uri.parse(((WebViewConfiguration)object0).getEntryPoint());
                String s = uri0.getPath();
                if(s == null || s.length() == 0) {
                    s1 = "/unity-ads-sdk-webview/";
                }
                else {
                    L.o(s, "path");
                    s1 = v.C5(s, '/', null, 2, null) + '/';
                }
                String s2 = uri0.getHost();
                if(s2 != null && s2.length() != 0) {
                    L.o(s2, "{\n                it\n            }");
                    return new Builder().a(s1, (String s) -> try {
                        InputStream inputStream0 = CommonGetWebViewCacheAssetLoader.this.context.getAssets().open("ad-viewer/" + s);
                        L.o(inputStream0, "context.assets.open(\"$WE…W_ASSET_PATH_LOCAL$path\")");
                        return new WebResourceResponse(StringExtensionsKt.guessMimeType(s), null, inputStream0);
                    }
                    catch(Exception unused_ex) {
                        DeviceLog.debug("Webview Asset not found: %s", new Object[]{s});
                        return null;
                    }).c(s2).b();
                }
                return new Builder().a(s1, (String s) -> try {
                    InputStream inputStream0 = CommonGetWebViewCacheAssetLoader.this.context.getAssets().open("ad-viewer/" + s);
                    L.o(inputStream0, "context.assets.open(\"$WE…W_ASSET_PATH_LOCAL$path\")");
                    return new WebResourceResponse(StringExtensionsKt.guessMimeType(s), null, inputStream0);
                }
                catch(Exception unused_ex) {
                    DeviceLog.debug("Webview Asset not found: %s", new Object[]{s});
                    return null;
                }).c("webview.unityads.unity3d.com").b();
            }

            // 检测为 Lambda 实现
            private static final WebResourceResponse invokeSuspend$lambda$2(CommonGetWebViewCacheAssetLoader commonGetWebViewCacheAssetLoader0, String s) [...]
        }, 1, null);
        L.o(object0, "override fun invoke(): W…           .build()\n    }");
        return (WebViewAssetLoader)object0;
    }
}

