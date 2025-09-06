package com.unity3d.services.banners.bridge;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.ads.UnityAds.UnityAdsShowCompletionState;
import com.unity3d.ads.UnityAds.UnityAdsShowError;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.ads.operation.load.LoadBannerModule;
import com.unity3d.services.ads.operation.load.LoadBannerOperationState;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView.IListener;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInvoker;
import java.util.HashMap;
import org.json.JSONObject;
import y4.l;

public class BannerBridge {
    public static enum BannerEvent {
        BANNER_VISIBILITY_CHANGED,
        BANNER_RESIZED,
        BANNER_LOADED,
        BANNER_DESTROYED,
        BANNER_ATTACHED,
        BANNER_DETACHED,
        BANNER_LOAD_PLACEMENT,
        BANNER_DESTROY_BANNER,
        SCAR_BANNER_LOADED,
        SCAR_BANNER_LOAD_FAILED,
        SCAR_BANNER_ATTACHED,
        SCAR_BANNER_DETACHED,
        SCAR_BANNER_OPENED,
        SCAR_BANNER_CLOSED,
        SCAR_BANNER_IMPRESSION,
        SCAR_BANNER_CLICKED;

        private static BannerEvent[] $values() [...] // Inlined contents
    }

    public static void destroy(String s) {
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null) {
            webViewApp0.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DESTROY_BANNER, new Object[]{s});
        }
    }

    public static void didAttach(String s) {
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null) {
            webViewApp0.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_ATTACHED, new Object[]{s});
        }
    }

    public static void didAttachScarBanner(String s) {
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null) {
            webViewApp0.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_ATTACHED, new Object[]{s});
        }
    }

    public static void didDestroy(String s) {
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null) {
            webViewApp0.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DESTROYED, new Object[]{s});
        }
    }

    public static void didDetach(String s) {
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null) {
            webViewApp0.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DETACHED, new Object[]{s});
        }
    }

    public static void didDetachScarBanner(String s) {
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null) {
            webViewApp0.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_DETACHED, new Object[]{s});
        }
    }

    public static void didLoad(String s) {
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null) {
            webViewApp0.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_LOADED, new Object[]{s});
        }
    }

    private static boolean isHeaderBidding(JSONObject jSONObject0) {
        return jSONObject0 == null ? false : jSONObject0.has("adMarkup");
    }

    public static void load(String s, String s1, UnityBannerSize unityBannerSize0) {
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null) {
            webViewApp0.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_LOAD_PLACEMENT, new Object[]{s, s1, unityBannerSize0.getWidth(), unityBannerSize0.getHeight()});
            return;
        }
        BannerView bannerView0 = BannerViewCache.getInstance().getBannerView(s1);
        if(bannerView0 != null && bannerView0.getListener() != null) {
            bannerView0.getListener().onBannerFailedToLoad(bannerView0, new BannerErrorInfo("WebViewApp was not available, this is likely because UnityAds has not been initialized", BannerErrorCode.WEBVIEW_ERROR));
        }
    }

    public static void load(String s, String s1, UnityBannerSize unityBannerSize0, UnityAdsLoadOptions unityAdsLoadOptions0) {
        Object object0 = Utilities.getService(SDKMetricsSender.class);
        com.unity3d.services.banners.bridge.BannerBridge.1 bannerBridge$10 = new HashMap() {
            {
                boolean z = BannerBridge.isHeaderBidding(unityAdsLoadOptions0.getData());  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.put("is_header_bidding", String.valueOf(z));
            }
        };
        BannerView bannerView0 = BannerViewCache.getInstance().getBannerView(s1);
        if(bannerView0 == null) {
            ((SDKMetricsSender)object0).sendMetricWithInitState(new Metric("native_banner_load_not_found", null, bannerBridge$10));
            return;
        }
        boolean z = ((AlternativeFlowReader)Utilities.getService(AlternativeFlowReader.class)).invoke();
        if(z && unityAdsLoadOptions0.getObjectId() == null) {
            unityAdsLoadOptions0.setObjectId(s1);
        }
        com.unity3d.services.banners.bridge.BannerBridge.2 bannerBridge$20 = new IUnityAdsLoadListener() {
            @Override  // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String s) {
                if(bannerView0.getListener() == null) {
                    Metric metric0 = new Metric("native_banner_listener_loaded_not_found", null, bannerBridge$10);
                    ((SDKMetricsSender)object0).sendMetricWithInitState(metric0);
                }
                if(z) {
                    IListener bannerView$IListener0 = bannerView0.getListener();
                    if(bannerView$IListener0 != null) {
                        bannerView$IListener0.onBannerLoaded(bannerView0);
                    }
                    UnityAdsShowOptions unityAdsShowOptions0 = new UnityAdsShowOptions();
                    unityAdsShowOptions0.setObjectId(unityAdsLoadOptions0.getObjectId());
                    new UnityAdsSDK().show(ClientProperties.getActivity(), s, unityAdsShowOptions0, new Listeners() {
                        @Override  // com.unity3d.ads.core.data.model.Listeners
                        public void onClick(@l String s) {
                            com.unity3d.services.banners.bridge.BannerBridge.2 bannerBridge$20 = com.unity3d.services.banners.bridge.BannerBridge.2.this;
                            IListener bannerView$IListener0 = bannerBridge$20.val$bannerListener;
                            if(bannerView$IListener0 != null) {
                                bannerView$IListener0.onBannerClick(bannerBridge$20.val$bannerAdView);
                            }
                        }

                        @Override  // com.unity3d.ads.core.data.model.Listeners
                        public void onComplete(@l String s, @l UnityAdsShowCompletionState unityAds$UnityAdsShowCompletionState0) {
                        }

                        @Override  // com.unity3d.ads.core.data.model.Listeners
                        public void onError(@l String s, @l UnityAdsShowError unityAds$UnityAdsShowError0, @l String s1) {
                        }

                        @Override  // com.unity3d.ads.core.data.model.Listeners
                        public void onLeftApplication(@l String s) {
                            com.unity3d.services.banners.bridge.BannerBridge.2 bannerBridge$20 = com.unity3d.services.banners.bridge.BannerBridge.2.this;
                            IListener bannerView$IListener0 = bannerBridge$20.val$bannerListener;
                            if(bannerView$IListener0 != null) {
                                bannerView$IListener0.onBannerLeftApplication(bannerBridge$20.val$bannerAdView);
                            }
                        }

                        @Override  // com.unity3d.ads.core.data.model.Listeners
                        public void onStart(@l String s) {
                            com.unity3d.services.banners.bridge.BannerBridge.2 bannerBridge$20 = com.unity3d.services.banners.bridge.BannerBridge.2.this;
                            IListener bannerView$IListener0 = bannerBridge$20.val$bannerListener;
                            if(bannerView$IListener0 != null) {
                                bannerView$IListener0.onBannerShown(bannerBridge$20.val$bannerAdView);
                            }
                        }
                    });
                }
            }

            @Override  // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String s, UnityAdsLoadError unityAds$UnityAdsLoadError0, String s1) {
                BannerView bannerView0 = BannerViewCache.getInstance().getBannerView(s1);
                if(bannerView0 != null && bannerView0.getListener() != null) {
                    bannerView0.getListener().onBannerFailedToLoad(bannerView0, BannerErrorInfo.fromLoadError(unityAds$UnityAdsLoadError0, s1));
                    return;
                }
                Metric metric0 = new Metric("native_banner_listener_load_fail_not_found", null, bannerBridge$10);
                ((SDKMetricsSender)object0).sendMetricWithInitState(metric0);
            }
        };
        if(z) {
            new UnityAdsSDK().load(s, unityAdsLoadOptions0, bannerBridge$20, unityBannerSize0);
            return;
        }
        LoadBannerModule.getInstance().executeAdOperation(new WebViewBridgeInvoker(), new LoadBannerOperationState(s, s1, unityBannerSize0, bannerBridge$20, unityAdsLoadOptions0, new ConfigurationReader().getCurrentConfiguration()));
    }

    public static void resize(String s, int v, int v1, int v2, int v3, float f) {
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null) {
            webViewApp0.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_RESIZED, new Object[]{s, v, v1, v2, v3, f});
        }
    }

    public static void visibilityChanged(String s, int v) {
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null) {
            webViewApp0.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_VISIBILITY_CHANGED, new Object[]{s, v});
        }
    }
}

