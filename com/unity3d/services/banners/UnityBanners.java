package com.unity3d.services.banners;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.properties.BannerRefreshInfo;
import com.unity3d.services.banners.view.BannerPosition;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.concurrent.TimeUnit;

public final class UnityBanners {
    class BannerAdRefreshView extends RelativeLayout {
        @TargetApi(14)
        class LifecycleListener implements Application.ActivityLifecycleCallbacks {
            private LifecycleListener() {
            }

            LifecycleListener(com.unity3d.services.banners.UnityBanners.1 unityBanners$10) {
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity0, Bundle bundle0) {
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity0) {
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity0) {
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity0) {
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity0) {
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity0) {
            }
        }

        private BannerView bannerView;
        private boolean didLoad;
        private boolean didShow;
        private boolean didSubscribeToLifecycle;
        private LifecycleListener lifecycleListener;
        private String placementId;
        private Handler refreshHandler;
        private long refreshRate;
        private long refreshTime;
        private Runnable reloadRunnable;

        public BannerAdRefreshView(Activity activity0, String s, UnityBannerSize unityBannerSize0) {
            super(activity0);
            this.didLoad = false;
            this.refreshRate = 30L;
            this.didShow = false;
            this.didSubscribeToLifecycle = false;
            this.placementId = s;
            this.refreshHandler = new Handler();
            this.reloadRunnable = () -> {
                UnityAdsLoadOptions unityAdsLoadOptions0 = new UnityAdsLoadOptions();
                unityAdsLoadOptions0.setObjectId("bdc8e27a-c70f-4233-a8fe-b8a811b5ef9b");
                this.val$self.bannerView.load(unityAdsLoadOptions0);
                long v = SystemClock.uptimeMillis() + TimeUnit.SECONDS.toMillis(this.val$self.refreshRate);
                this.val$self.refreshTime = v;
                this.val$self.refreshHandler.postAtTime(this.val$self.reloadRunnable, v);
            };
            this.setupLayoutParams();
            this.setBackgroundColor(0);
            BannerView bannerView0 = new BannerView(activity0, s, unityBannerSize0);
            this.bannerView = bannerView0;
            this.addView(bannerView0);

            class com.unity3d.services.banners.UnityBanners.BannerAdRefreshView.1 implements Runnable {
                com.unity3d.services.banners.UnityBanners.BannerAdRefreshView.1(UnityBanners unityBanners0, BannerAdRefreshView unityBanners$BannerAdRefreshView1) {
                }

                @Override
                public void run() {
                    this.val$self.reload();
                }
            }

        }

        public void destroy() {
            this.stopReloadTask();
            this.bannerView.destroy();
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    this.removeAllViews();
                }
            });
            this.bannerView = null;
        }

        public IListener getListener() {
            return this.bannerView.getListener();
        }

        public String getPlacementId() {
            return this.bannerView.getPlacementId();
        }

        public UnityBannerSize getSize() {
            return this.bannerView.getSize();
        }

        public void load() {
            if(!this.didLoad) {
                this.didLoad = true;
                Integer integer0 = BannerRefreshInfo.getInstance().getRefreshRate(this.placementId);
                if(integer0 != null) {
                    this.refreshRate = integer0.longValue();
                }
                this.reload();
            }
        }

        @Override  // android.view.ViewGroup
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.subscribeToLifecycle();
            if(this.didShow) {
                this.startReloadTask();
                return;
            }
            this.didShow = true;
        }

        @Override  // android.view.ViewGroup
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.stopReloadTask();
            this.unsubscribeFromLifecycle();
        }

        // 检测为 Lambda 实现
        private void reload() [...]

        public void setListener(IListener bannerView$IListener0) {
            this.bannerView.setListener(bannerView$IListener0);
        }

        private void setupLayoutParams() {
            this.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        }

        private void startReloadTask() {
            long v = SystemClock.uptimeMillis();
            long v1 = this.refreshTime;
            if(v < v1) {
                this.refreshHandler.postAtTime(this.reloadRunnable, v1);
                return;
            }
            this.reload();
        }

        private void stopReloadTask() {
            Handler handler0 = this.refreshHandler;
            if(handler0 != null) {
                Runnable runnable0 = this.reloadRunnable;
                if(runnable0 != null) {
                    handler0.removeCallbacks(runnable0);
                }
            }
        }

        private void subscribeToLifecycle() {
            if(!this.didSubscribeToLifecycle && ClientProperties.getApplication() != null) {
                this.lifecycleListener = new LifecycleListener(this) {
                    final BannerAdRefreshView val$self;

                    {
                        BannerAdRefreshView.this = unityBanners$BannerAdRefreshView0;
                        this.val$self = unityBanners$BannerAdRefreshView1;
                        super(null);
                    }

                    @Override  // com.unity3d.services.banners.UnityBanners$BannerAdRefreshView$LifecycleListener
                    public void onActivityDestroyed(Activity activity0) {
                        this.val$self.stopReloadTask();
                    }

                    @Override  // com.unity3d.services.banners.UnityBanners$BannerAdRefreshView$LifecycleListener
                    public void onActivityPaused(Activity activity0) {
                        this.val$self.stopReloadTask();
                    }

                    @Override  // com.unity3d.services.banners.UnityBanners$BannerAdRefreshView$LifecycleListener
                    public void onActivityResumed(Activity activity0) {
                        this.val$self.startReloadTask();
                    }

                    @Override  // com.unity3d.services.banners.UnityBanners$BannerAdRefreshView$LifecycleListener
                    public void onActivityStopped(Activity activity0) {
                        this.val$self.stopReloadTask();
                    }
                };
                this.didSubscribeToLifecycle = true;
                ClientProperties.getApplication().registerActivityLifecycleCallbacks(this.lifecycleListener);
            }
        }

        private void unsubscribeFromLifecycle() {
            if(this.didSubscribeToLifecycle && this.lifecycleListener != null && ClientProperties.getApplication() != null) {
                this.didSubscribeToLifecycle = false;
                ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(this.lifecycleListener);
            }
        }
    }

    class BannerWrapper extends FrameLayout {
        private BannerAdRefreshView _bannerAdRefreshView;
        private BannerPosition _bannerPosition;

        public BannerWrapper(Context context0, BannerAdRefreshView unityBanners$BannerAdRefreshView0) {
            super(context0);
            this._bannerPosition = BannerPosition.NONE;
            this._bannerAdRefreshView = unityBanners$BannerAdRefreshView0;
            this.addView(unityBanners$BannerAdRefreshView0);
            this.setupLayoutConstraints();
            this.setBackgroundColor(0);
        }

        public void destroy() {
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    this.removeAllViews();
                    ViewUtilities.removeViewFromParent(this);
                }
            });
            BannerAdRefreshView unityBanners$BannerAdRefreshView0 = this._bannerAdRefreshView;
            if(unityBanners$BannerAdRefreshView0 != null) {
                unityBanners$BannerAdRefreshView0.destroy();
                this._bannerAdRefreshView = null;
            }
        }

        public void setBannerPosition(BannerPosition bannerPosition0) {
            this._bannerPosition = bannerPosition0;
            this.setupLayoutConstraints();
        }

        private void setupLayoutConstraints() {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
            frameLayout$LayoutParams0.gravity = this._bannerPosition.getGravity();
            this.setLayoutParams(frameLayout$LayoutParams0);
        }
    }

    private IUnityBannerListener _bannerListener;
    private BannerPosition _currentBannerPosition;
    private BannerWrapper _currentBannerWrapper;
    private static UnityBanners instance;

    private UnityBanners() {
        this._currentBannerPosition = BannerPosition.NONE;
    }

    private void _destroy() {
        BannerWrapper unityBanners$BannerWrapper0 = this._currentBannerWrapper;
        if(unityBanners$BannerWrapper0 != null) {
            unityBanners$BannerWrapper0.destroy();
            this._currentBannerWrapper = null;
        }
    }

    private void _loadBanner(Activity activity0, String s) {
        if(this._currentBannerWrapper == null) {
            BannerAdRefreshView unityBanners$BannerAdRefreshView0 = new BannerAdRefreshView(this, activity0, s, new UnityBannerSize(320, 50));
            BannerWrapper unityBanners$BannerWrapper0 = new BannerWrapper(this, activity0, unityBanners$BannerAdRefreshView0);
            unityBanners$BannerWrapper0.setBannerPosition(this._currentBannerPosition);
            this._currentBannerWrapper = unityBanners$BannerWrapper0;
            unityBanners$BannerAdRefreshView0.setListener(new Listener() {
                @Override  // com.unity3d.services.banners.BannerView$Listener
                public void onBannerClick(BannerView bannerView0) {
                    if(this._bannerListener != null) {
                        this._bannerListener.onUnityBannerClick(bannerView0.getPlacementId());
                    }
                }

                @Override  // com.unity3d.services.banners.BannerView$Listener
                public void onBannerFailedToLoad(BannerView bannerView0, BannerErrorInfo bannerErrorInfo0) {
                    if(this._bannerListener != null) {
                        this._bannerListener.onUnityBannerError(bannerView0.getPlacementId() + " " + bannerErrorInfo0.errorMessage);
                    }
                }

                @Override  // com.unity3d.services.banners.BannerView$Listener
                public void onBannerLoaded(BannerView bannerView0) {
                    if(this._bannerListener != null) {
                        this._bannerListener.onUnityBannerLoaded(bannerView0.getPlacementId(), unityBanners$BannerWrapper0);
                    }
                }

                @Override  // com.unity3d.services.banners.BannerView$Listener
                public void onBannerShown(BannerView bannerView0) {
                    if(this._bannerListener != null) {
                        this._bannerListener.onUnityBannerShow(bannerView0.getPlacementId());
                    }
                }
            });
            unityBanners$BannerAdRefreshView0.load();
            return;
        }
        UnityBanners.sendError("A Banner is already in use, please call destroy before loading another banner!");
    }

    @Deprecated
    public static void destroy() {
        UnityBanners.getInstance()._destroy();
    }

    @Deprecated
    public static IUnityBannerListener getBannerListener() {
        return UnityBanners.getInstance()._bannerListener;
    }

    private static UnityBanners getInstance() {
        if(UnityBanners.instance == null) {
            UnityBanners.instance = new UnityBanners();
        }
        return UnityBanners.instance;
    }

    @Deprecated
    public static void loadBanner(Activity activity0, String s) {
        DeviceLog.entered();
        if(!UnityAds.isSupported()) {
            UnityBanners.sendError("Unity Ads is not supported on this device.");
        }
        if(!UnityAds.isInitialized()) {
            UnityBanners.sendError("UnityAds is not initialized.");
            return;
        }
        ClientProperties.setActivity(activity0);
        UnityBanners.getInstance()._loadBanner(activity0, s);
    }

    private static void sendError(String s) {
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                IUnityBannerListener iUnityBannerListener0 = UnityBanners.getBannerListener();
                if(iUnityBannerListener0 != null) {
                    iUnityBannerListener0.onUnityBannerError(s);
                }
            }
        });
    }

    @Deprecated
    public static void setBannerListener(IUnityBannerListener iUnityBannerListener0) {
        UnityBanners.getInstance()._bannerListener = iUnityBannerListener0;
    }

    @Deprecated
    public static void setBannerPosition(BannerPosition bannerPosition0) {
        UnityBanners.getInstance()._currentBannerPosition = bannerPosition0;
    }
}

