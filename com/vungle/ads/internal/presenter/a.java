package com.vungle.ads.internal.presenter;

import com.vungle.ads.d1;
import com.vungle.ads.internal.util.p;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class a {
    public static final class com.vungle.ads.internal.presenter.a.a {
        private com.vungle.ads.internal.presenter.a.a() {
        }

        public com.vungle.ads.internal.presenter.a.a(w w0) {
        }
    }

    @l
    public static final com.vungle.ads.internal.presenter.a.a Companion = null;
    @l
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;
    @m
    private com.vungle.ads.internal.model.m placement;
    @m
    private final b playAdCallback;

    static {
        a.Companion = new com.vungle.ads.internal.presenter.a.a(null);
    }

    public a(@m b b0, @m com.vungle.ads.internal.model.m m0) {
        this.playAdCallback = b0;
        this.placement = m0;
    }

    public final void onError(@l d1 d10, @m String s) {
        L.p(d10, "error");
        b b0 = this.playAdCallback;
        if(b0 != null) {
            b0.onFailure(d10);
            p.Companion.e("AdEventListener", "AdEventListener#PlayAdCallback " + s, d10);
        }
    }

    public final void onNext(@l String s, @m String s1, @m String s2) {
        L.p(s, "s");
        p.Companion.d("AdEventListener", "s=" + s + ", value=" + s1 + ", id=" + s2);
        switch(s.hashCode()) {
            case 0x8E037C5F: {
                if(s.equals("successfulView") && (this.placement != null && this.placement.isRewardedVideo() && !this.adRewarded)) {
                    this.adRewarded = true;
                    b b0 = this.playAdCallback;
                    if(b0 != null) {
                        b0.onAdRewarded(s2);
                        return;
                    }
                }
                break;
            }
            case 0x9EF94407: {
                if(s.equals("adViewed")) {
                    b b1 = this.playAdCallback;
                    if(b1 != null) {
                        b1.onAdImpression(s2);
                        return;
                    }
                }
                break;
            }
            case 100571: {
                if(s.equals("end")) {
                    b b2 = this.playAdCallback;
                    if(b2 != null) {
                        b2.onAdEnd(s2);
                        return;
                    }
                }
                break;
            }
            case 0x34264A: {
                if(s.equals("open")) {
                    if(L.g(s1, "adClick")) {
                        b b3 = this.playAdCallback;
                        if(b3 != null) {
                            b3.onAdClick(s2);
                            return;
                        }
                    }
                    else if(L.g(s1, "adLeftApplication")) {
                        b b4 = this.playAdCallback;
                        if(b4 != null) {
                            b4.onAdLeftApplication(s2);
                            return;
                        }
                    }
                }
                break;
            }
            case 109757538: {
                if(s.equals("start")) {
                    b b5 = this.playAdCallback;
                    if(b5 != null) {
                        b5.onAdStart(s2);
                        return;
                    }
                }
                break;
            }
        }
    }
}

