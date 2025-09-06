package com.unity3d.services.banners;

import P2.d;
import android.app.Activity;
import android.content.Context;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.webplayer.WebPlayerSettingsCache;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.banners.view.BannerWebPlayerContainer;
import com.unity3d.services.banners.view.ScarBannerContainer;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.properties.ClientProperties;
import org.json.JSONObject;

public class BannerView extends RelativeLayout {
    public interface IListener {
        void onBannerClick(BannerView arg1);

        void onBannerFailedToLoad(BannerView arg1, BannerErrorInfo arg2);

        void onBannerLeftApplication(BannerView arg1);

        void onBannerLoaded(BannerView arg1);

        void onBannerShown(BannerView arg1);
    }

    public static abstract class Listener implements IListener {
        @Override  // com.unity3d.services.banners.BannerView$IListener
        public void onBannerClick(BannerView bannerView0) {
        }

        @Override  // com.unity3d.services.banners.BannerView$IListener
        public void onBannerFailedToLoad(BannerView bannerView0, BannerErrorInfo bannerErrorInfo0) {
        }

        @Override  // com.unity3d.services.banners.BannerView$IListener
        public void onBannerLeftApplication(BannerView bannerView0) {
        }

        @Override  // com.unity3d.services.banners.BannerView$IListener
        public void onBannerLoaded(BannerView bannerView0) {
        }

        @Override  // com.unity3d.services.banners.BannerView$IListener
        public void onBannerShown(BannerView bannerView0) {
        }
    }

    private BannerWebPlayerContainer bannerWebPlayerContainer;
    private final GMAScarAdapterBridge gmaScarAdapterBridge;
    private IInitializationListener initializationListener;
    private IListener listener;
    private String placementId;
    private ScarBannerContainer scarBannerContainer;
    private UnityBannerSize size;
    private String viewId;

    public BannerView(Activity activity0, String s, UnityBannerSize unityBannerSize0) {
        super(activity0);
        this.gmaScarAdapterBridge = GMA.getInstance().getBridge();
        this.viewId = "c95a74a9-8249-441f-8a14-8bb9a8dd1cd2";
        this.placementId = s;
        this.size = unityBannerSize0;
        this.setupLayoutParams();
        this.setBackgroundColor(0);
        ClientProperties.setActivity(activity0);
        BannerViewCache.getInstance().addBannerView(this);
    }

    public void addScarContainer() {
        this.scarBannerContainer = new ScarBannerContainer(this.getContext(), this.viewId);
        Utilities.runOnUiThread(() -> this.addView(this.scarBannerContainer));
    }

    private void bridgeLoad() {
        BannerBridge.load(this.placementId, this.viewId, this.size, new UnityAdsLoadOptions());
    }

    private void bridgeLoad(UnityAdsLoadOptions unityAdsLoadOptions0) {
        if(unityAdsLoadOptions0 != null) {
            String s = unityAdsLoadOptions0.getObjectId();
            if(s != null) {
                BannerViewCache bannerViewCache0 = BannerViewCache.getInstance();
                bannerViewCache0.removeBannerView(this.viewId);
                this.viewId = s;
                bannerViewCache0.addBannerView(this);
            }
        }
        BannerBridge.load(this.placementId, this.viewId, this.size, unityAdsLoadOptions0);
    }

    public void destroy() {
        UnityAdsSDK unityAdsSDK0 = new UnityAdsSDK();
        unityAdsSDK0.sendBannerDestroyed();
        BannerViewCache.getInstance().removeBannerView(this.viewId);
        this.unregisterInitializeListener();
        unityAdsSDK0.finishOMIDSession(this.viewId);
        BannerBridge.destroy(this.placementId);
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ViewParent viewParent0 = this.getParent();
                if(viewParent0 != null && viewParent0 instanceof ViewManager) {
                    ((ViewManager)viewParent0).removeView(this);
                }
            }
        });
        BannerWebPlayerContainer bannerWebPlayerContainer0 = this.bannerWebPlayerContainer;
        if(bannerWebPlayerContainer0 != null) {
            bannerWebPlayerContainer0.destroy();
        }
        ScarBannerContainer scarBannerContainer0 = this.scarBannerContainer;
        if(scarBannerContainer0 != null) {
            scarBannerContainer0.destroy();
        }
        DeviceLog.info(("Banner [" + this.placementId + "] was destroyed"));
        this.viewId = null;
        this.listener = null;
        this.bannerWebPlayerContainer = null;
    }

    public IListener getListener() {
        return this.listener;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public UnityBannerSize getSize() {
        return this.size;
    }

    String getViewId() {
        return this.viewId;
    }

    // 检测为 Lambda 实现
    private void lambda$addScarContainer$0() [...]

    public void load() {
        this.bridgeLoad();
    }

    public void load(UnityAdsLoadOptions unityAdsLoadOptions0) {
        this.bridgeLoad(unityAdsLoadOptions0);
    }

    void loadScarPlayer(String s, d d0, UnityBannerSize unityBannerSize0) {
        Context context0 = this.getContext();
        this.gmaScarAdapterBridge.loadBanner(context0, this, s, d0, unityBannerSize0);
    }

    void loadWebPlayer(UnityBannerSize unityBannerSize0) {
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                JSONObject jSONObject0 = WebPlayerSettingsCache.getInstance().getWebSettings(this.viewId);
                JSONObject jSONObject1 = WebPlayerSettingsCache.getInstance().getWebPlayerSettings(this.viewId);
                JSONObject jSONObject2 = WebPlayerSettingsCache.getInstance().getWebPlayerEventSettings(this.viewId);
                if(this.bannerWebPlayerContainer == null) {
                    BannerWebPlayerContainer bannerWebPlayerContainer0 = new BannerWebPlayerContainer(this.getContext(), this.viewId, jSONObject0, jSONObject1, jSONObject2, unityBannerSize0);
                    this.bannerWebPlayerContainer = bannerWebPlayerContainer0;
                    this.addView(this.bannerWebPlayerContainer);
                    return;
                }
                this.bannerWebPlayerContainer.setWebPlayerSettings(jSONObject0, jSONObject1);
                this.bannerWebPlayerContainer.setWebPlayerEventSettings(jSONObject2);
            }
        });
    }

    private void registerInitializeListener() {
        this.unregisterInitializeListener();
        this.initializationListener = new IInitializationListener() {
            @Override  // com.unity3d.services.core.configuration.IInitializationListener
            public void onSdkInitializationFailed(String s, ErrorState errorState0, int v) {
                this.unregisterInitializeListener();
                if(this.getListener() != null) {
                    IListener bannerView$IListener0 = this.getListener();
                    BannerErrorInfo bannerErrorInfo0 = new BannerErrorInfo("UnityAds sdk initialization failed", BannerErrorCode.NATIVE_ERROR);
                    bannerView$IListener0.onBannerFailedToLoad(this, bannerErrorInfo0);
                }
            }

            @Override  // com.unity3d.services.core.configuration.IInitializationListener
            public void onSdkInitialized() {
                this.unregisterInitializeListener();
                this.bridgeLoad();
            }
        };
        InitializationNotificationCenter.getInstance().addListener(this.initializationListener);
    }

    public void setListener(IListener bannerView$IListener0) {
        this.listener = bannerView$IListener0;
    }

    private void setupLayoutParams() {
        this.setLayoutParams(new RelativeLayout.LayoutParams(Math.round(ViewUtilities.pxFromDp(this.getContext(), ((float)this.size.getWidth()))), Math.round(ViewUtilities.pxFromDp(this.getContext(), ((float)this.size.getHeight())))));
        this.setGravity(17);
        this.requestLayout();
    }

    private void unregisterInitializeListener() {
        if(this.initializationListener != null) {
            InitializationNotificationCenter.getInstance().removeListener(this.initializationListener);
        }
        this.initializationListener = null;
    }
}

