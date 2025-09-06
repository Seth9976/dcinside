package com.igaworks.ssp.plugin.unity;

import android.app.Activity;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd;
import com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener;

public class AdPopcornSSPUnityRewardVideo {
    private Activity a;
    private AdPopcornSSPRewardVideoAd b;

    public AdPopcornSSPUnityRewardVideo(Activity activity0) {
        this.a = activity0;
        this.b = new AdPopcornSSPRewardVideoAd(activity0);
    }

    public void loadAd() {
        synchronized(this) {
            try {
                this.a.runOnUiThread(new Runnable() {
                    final AdPopcornSSPUnityRewardVideo a;

                    @Override
                    public void run() {
                        if(AdPopcornSSPUnityRewardVideo.this.b != null) {
                            AdPopcornSSPUnityRewardVideo.this.b.loadAd();
                        }
                    }

                    public Runnable start() {
                        return this;
                    }
                }.start());
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public void setPlacementId(String s) {
        AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0 = this.b;
        if(adPopcornSSPRewardVideoAd0 != null) {
            adPopcornSSPRewardVideoAd0.setPlacementId(s);
        }
    }

    public void setRewardVideoAdEventCallbackListener(AdPopcornSSPUnityRewardVideoListener adPopcornSSPUnityRewardVideoListener0) {
        AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0 = this.b;
        if(adPopcornSSPRewardVideoAd0 != null) {
            adPopcornSSPRewardVideoAd0.setRewardVideoAdEventCallbackListener(new IRewardVideoAdEventCallbackListener() {
                final AdPopcornSSPUnityRewardVideo b;

                @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
                public void OnRewardPlusCompleted(boolean z, int v, int v1) {
                    AdPopcornSSPUnityRewardVideoListener adPopcornSSPUnityRewardVideoListener0 = adPopcornSSPUnityRewardVideoListener0;
                    if(adPopcornSSPUnityRewardVideoListener0 != null) {
                        adPopcornSSPUnityRewardVideoListener0.OnRewardPlusCompleteResult(z, v, v1);
                    }
                }

                @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
                public void OnRewardVideoAdClicked() {
                    AdPopcornSSPUnityRewardVideoListener adPopcornSSPUnityRewardVideoListener0 = adPopcornSSPUnityRewardVideoListener0;
                    if(adPopcornSSPUnityRewardVideoListener0 != null) {
                        adPopcornSSPUnityRewardVideoListener0.OnRewardVideoAdClicked();
                    }
                }

                @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
                public void OnRewardVideoAdClosed() {
                    AdPopcornSSPUnityRewardVideoListener adPopcornSSPUnityRewardVideoListener0 = adPopcornSSPUnityRewardVideoListener0;
                    if(adPopcornSSPUnityRewardVideoListener0 != null) {
                        adPopcornSSPUnityRewardVideoListener0.OnRewardVideoAdClosed();
                    }
                }

                @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
                public void OnRewardVideoAdLoadFailed(SSPErrorCode sSPErrorCode0) {
                    AdPopcornSSPUnityRewardVideoListener adPopcornSSPUnityRewardVideoListener0 = adPopcornSSPUnityRewardVideoListener0;
                    if(adPopcornSSPUnityRewardVideoListener0 != null) {
                        adPopcornSSPUnityRewardVideoListener0.OnRewardVideoAdLoadFailed(sSPErrorCode0.getErrorCode(), sSPErrorCode0.getErrorMessage());
                    }
                }

                @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
                public void OnRewardVideoAdLoaded() {
                    AdPopcornSSPUnityRewardVideoListener adPopcornSSPUnityRewardVideoListener0 = adPopcornSSPUnityRewardVideoListener0;
                    if(adPopcornSSPUnityRewardVideoListener0 != null) {
                        adPopcornSSPUnityRewardVideoListener0.OnRewardVideoAdLoaded();
                    }
                }

                @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
                public void OnRewardVideoAdOpenFalied() {
                    AdPopcornSSPUnityRewardVideoListener adPopcornSSPUnityRewardVideoListener0 = adPopcornSSPUnityRewardVideoListener0;
                    if(adPopcornSSPUnityRewardVideoListener0 != null) {
                        adPopcornSSPUnityRewardVideoListener0.OnRewardVideoAdOpenFalied();
                    }
                }

                @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
                public void OnRewardVideoAdOpened() {
                    AdPopcornSSPUnityRewardVideoListener adPopcornSSPUnityRewardVideoListener0 = adPopcornSSPUnityRewardVideoListener0;
                    if(adPopcornSSPUnityRewardVideoListener0 != null) {
                        adPopcornSSPUnityRewardVideoListener0.OnRewardVideoAdOpened();
                    }
                }

                @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
                public void OnRewardVideoPlayCompleted(int v, boolean z) {
                    AdPopcornSSPUnityRewardVideoListener adPopcornSSPUnityRewardVideoListener0 = adPopcornSSPUnityRewardVideoListener0;
                    if(adPopcornSSPUnityRewardVideoListener0 != null) {
                        adPopcornSSPUnityRewardVideoListener0.OnRewardVideoPlayCompleted(v, z);
                    }
                }
            });
        }
    }

    public void showAd() {
        synchronized(this) {
            try {
                this.a.runOnUiThread(new Runnable() {
                    final AdPopcornSSPUnityRewardVideo a;

                    @Override
                    public void run() {
                        if(AdPopcornSSPUnityRewardVideo.this.b != null) {
                            AdPopcornSSPUnityRewardVideo.this.b.showAd();
                        }
                    }

                    public Runnable start() {
                        return this;
                    }
                }.start());
            }
            catch(Exception unused_ex) {
            }
        }
    }
}

