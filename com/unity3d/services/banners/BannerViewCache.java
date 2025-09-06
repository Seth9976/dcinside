package com.unity3d.services.banners;

import P2.d;
import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.services.ads.operation.load.LoadBannerModule;
import com.unity3d.services.ads.operation.load.LoadBannerOperationState;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.Utilities;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class BannerViewCache {
    private HashMap _bannerViews;
    private final HashMap _deletedViewsFifo;
    private static BannerViewCache instance;

    public BannerViewCache() {
        this._bannerViews = new HashMap();
        this._deletedViewsFifo = new LinkedHashMap() {
            @Override
            protected boolean removeEldestEntry(Map.Entry map$Entry0) {
                return this.size() > 10;
            }
        };
    }

    public String addBannerView(BannerView bannerView0) {
        synchronized(this) {
            WeakReference weakReference0 = new WeakReference(bannerView0);
            this._bannerViews.put(bannerView0.getViewId(), weakReference0);
        }
        return bannerView0.getViewId();
    }

    public void addScarContainer(String s) {
        synchronized(this) {
            BannerView bannerView0 = this.getBannerView(s);
            if(bannerView0 != null) {
                bannerView0.addScarContainer();
            }
        }
    }

    public BannerView getBannerView(String s) {
        synchronized(this) {
            WeakReference weakReference0 = (WeakReference)this._bannerViews.get(s);
            return weakReference0 != null && weakReference0.get() != null ? ((BannerView)weakReference0.get()) : null;
        }
    }

    public static BannerViewCache getInstance() {
        if(BannerViewCache.instance == null) {
            BannerViewCache.instance = new BannerViewCache();
        }
        return BannerViewCache.instance;
    }

    public boolean isBannerViewDeleted(String s) {
        synchronized(this) {
            Boolean boolean0 = (Boolean)this._deletedViewsFifo.get(s);
            return boolean0 != null ? boolean0.booleanValue() : false;
        }
    }

    public void loadBanner(LoadBannerOperationState loadBannerOperationState0) {
        synchronized(this) {
            String s = loadBannerOperationState0.getId();
            UnityBannerSize unityBannerSize0 = loadBannerOperationState0.getSize();
            if(loadBannerOperationState0.isScarAd()) {
                this.loadScarPlayer(s, loadBannerOperationState0.getScarAdMetadata(), unityBannerSize0);
            }
            else if(this.loadWebPlayer(s, unityBannerSize0)) {
                BannerBridge.didLoad(s);
            }
        }
    }

    public void loadScarPlayer(String s, d d0, UnityBannerSize unityBannerSize0) {
        synchronized(this) {
            BannerView bannerView0 = this.getBannerView(s);
            if(bannerView0 != null) {
                bannerView0.loadScarPlayer(s, d0, unityBannerSize0);
            }
        }
    }

    public boolean loadWebPlayer(String s, UnityBannerSize unityBannerSize0) {
        synchronized(this) {
            BannerView bannerView0 = this.getBannerView(s);
            if(bannerView0 != null) {
                bannerView0.loadWebPlayer(unityBannerSize0);
                return true;
            }
            return false;
        }
    }

    public void removeBannerView(String s) {
        synchronized(this) {
            this._deletedViewsFifo.put(s, Boolean.TRUE);
            this._bannerViews.remove(s);
        }
    }

    public void triggerBannerClickEvent(String s) {
        synchronized(this) {
            BannerView bannerView0 = this.getBannerView(s);
            if(bannerView0 != null && bannerView0.getListener() != null) {
                Utilities.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        IListener bannerView$IListener0 = bannerView0.getListener();
                        if(bannerView$IListener0 != null) {
                            bannerView$IListener0.onBannerClick(bannerView0);
                        }
                    }
                });
            }
        }
    }

    public void triggerBannerErrorEvent(String s, BannerErrorInfo bannerErrorInfo0) {
        synchronized(this) {
            UnityAdsLoadError unityAds$UnityAdsLoadError0 = bannerErrorInfo0.toLoadError();
            LoadBannerModule.getInstance().onUnityAdsFailedToLoad(s, unityAds$UnityAdsLoadError0, bannerErrorInfo0.errorMessage);
        }
    }

    public void triggerBannerLeftApplicationEvent(String s) {
        synchronized(this) {
            BannerView bannerView0 = this.getBannerView(s);
            if(bannerView0 != null && bannerView0.getListener() != null) {
                Utilities.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        IListener bannerView$IListener0 = bannerView0.getListener();
                        if(bannerView$IListener0 != null) {
                            bannerView$IListener0.onBannerLeftApplication(bannerView0);
                        }
                    }
                });
            }
        }
    }

    public void triggerBannerLoadEvent(String s) {
        synchronized(this) {
            BannerView bannerView0 = this.getBannerView(s);
            if(bannerView0 != null && bannerView0.getListener() != null) {
                LoadBannerModule.getInstance().onUnityAdsAdLoaded(s);
                Utilities.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        IListener bannerView$IListener0 = bannerView0.getListener();
                        if(bannerView$IListener0 != null) {
                            bannerView$IListener0.onBannerLoaded(bannerView0);
                        }
                    }
                });
            }
        }
    }

    public void triggerBannerShowEvent(String s) {
        synchronized(this) {
            BannerView bannerView0 = this.getBannerView(s);
            if(bannerView0 != null && bannerView0.getListener() != null) {
                Utilities.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        IListener bannerView$IListener0 = bannerView0.getListener();
                        if(bannerView$IListener0 != null) {
                            bannerView$IListener0.onBannerShown(bannerView0);
                        }
                    }
                });
            }
        }
    }
}

