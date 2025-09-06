package com.igaworks.ssp.plugin.unity;

import android.app.Activity;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.part.mix.AdPopcornSSPVideoMixAd;
import com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener;

public class AdPopcornSSPUnityVideoMix {
    private Activity a;
    private AdPopcornSSPVideoMixAd b;

    public AdPopcornSSPUnityVideoMix(Activity activity0) {
        this.a = activity0;
        this.b = new AdPopcornSSPVideoMixAd(activity0);
    }

    public void loadAd() {
        synchronized(this) {
            try {
                this.a.runOnUiThread(new Runnable() {
                    final AdPopcornSSPUnityVideoMix a;

                    @Override
                    public void run() {
                        if(AdPopcornSSPUnityVideoMix.this.b != null) {
                            AdPopcornSSPUnityVideoMix.this.b.loadAd();
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
        AdPopcornSSPVideoMixAd adPopcornSSPVideoMixAd0 = this.b;
        if(adPopcornSSPVideoMixAd0 != null) {
            adPopcornSSPVideoMixAd0.setPlacementId(s);
        }
    }

    public void setVideoMixEventCallbackListener(AdPopcornSSPUnityVideoMixListener adPopcornSSPUnityVideoMixListener0) {
        AdPopcornSSPVideoMixAd adPopcornSSPVideoMixAd0 = this.b;
        if(adPopcornSSPVideoMixAd0 != null) {
            adPopcornSSPVideoMixAd0.setVideoMixAdEventCallbackListener(new IVideoMixAdEventCallbackListener() {
                final AdPopcornSSPUnityVideoMix b;

                @Override  // com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener
                public void OnVideoMixAdClicked() {
                    AdPopcornSSPUnityVideoMixListener adPopcornSSPUnityVideoMixListener0 = adPopcornSSPUnityVideoMixListener0;
                    if(adPopcornSSPUnityVideoMixListener0 != null) {
                        adPopcornSSPUnityVideoMixListener0.OnVideoMixAdClicked();
                    }
                }

                @Override  // com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener
                public void OnVideoMixAdClosed(int v) {
                    AdPopcornSSPUnityVideoMixListener adPopcornSSPUnityVideoMixListener0 = adPopcornSSPUnityVideoMixListener0;
                    if(adPopcornSSPUnityVideoMixListener0 != null) {
                        adPopcornSSPUnityVideoMixListener0.OnVideoMixAdClosed(v);
                    }
                }

                @Override  // com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener
                public void OnVideoMixAdLoadFailed(SSPErrorCode sSPErrorCode0) {
                    AdPopcornSSPUnityVideoMixListener adPopcornSSPUnityVideoMixListener0 = adPopcornSSPUnityVideoMixListener0;
                    if(adPopcornSSPUnityVideoMixListener0 != null) {
                        adPopcornSSPUnityVideoMixListener0.OnVideoMixAdLoadFailed(sSPErrorCode0.getErrorCode(), sSPErrorCode0.getErrorMessage());
                    }
                }

                @Override  // com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener
                public void OnVideoMixAdLoaded() {
                    AdPopcornSSPUnityVideoMixListener adPopcornSSPUnityVideoMixListener0 = adPopcornSSPUnityVideoMixListener0;
                    if(adPopcornSSPUnityVideoMixListener0 != null) {
                        adPopcornSSPUnityVideoMixListener0.OnVideoMixAdLoaded();
                    }
                }

                @Override  // com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener
                public void OnVideoMixAdOpenFailed() {
                    AdPopcornSSPUnityVideoMixListener adPopcornSSPUnityVideoMixListener0 = adPopcornSSPUnityVideoMixListener0;
                    if(adPopcornSSPUnityVideoMixListener0 != null) {
                        adPopcornSSPUnityVideoMixListener0.OnVideoMixAdOpenFailed();
                    }
                }

                @Override  // com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener
                public void OnVideoMixAdOpened() {
                    AdPopcornSSPUnityVideoMixListener adPopcornSSPUnityVideoMixListener0 = adPopcornSSPUnityVideoMixListener0;
                    if(adPopcornSSPUnityVideoMixListener0 != null) {
                        adPopcornSSPUnityVideoMixListener0.OnVideoMixAdOpened();
                    }
                }

                @Override  // com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener
                public void OnVideoMixPlayCompleted(int v, boolean z) {
                    AdPopcornSSPUnityVideoMixListener adPopcornSSPUnityVideoMixListener0 = adPopcornSSPUnityVideoMixListener0;
                    if(adPopcornSSPUnityVideoMixListener0 != null) {
                        adPopcornSSPUnityVideoMixListener0.OnVideoMixPlayCompleted(v, z);
                    }
                }
            });
        }
    }

    public void showAd() {
        synchronized(this) {
            try {
                this.a.runOnUiThread(new Runnable() {
                    final AdPopcornSSPUnityVideoMix a;

                    @Override
                    public void run() {
                        if(AdPopcornSSPUnityVideoMix.this.b != null) {
                            AdPopcornSSPUnityVideoMix.this.b.showAd();
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

