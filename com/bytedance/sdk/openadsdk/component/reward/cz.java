package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.IListenerManager.Stub;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.PjT.ReZ.Zh;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.component.reward.Zh.SM;
import com.bytedance.sdk.openadsdk.core.Lrd;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.PjT;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.aidl.Zh.ReZ;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.ub.cr;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.Yo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

class cz extends PAGInterstitialAd {
    private boolean Au;
    private final AtomicBoolean JQp;
    private final Context PjT;
    private Zh ReZ;
    private boolean SM;
    private final String XX;
    private final PjT Zh;
    private boolean cr;
    private boolean cz;

    cz(Context context0, PjT pjT0) {
        this.JQp = new AtomicBoolean(false);
        this.cz = false;
        this.PjT = context0;
        this.Zh = pjT0;
        this.cr = false;
        this.XX = "f58db840-14bd-48c6-b07a-769cf1ba6b72";
    }

    private void PjT(int v) {
        if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            return;
        }
        Jo.ReZ(new Au("FullScreen_registerMultiProcessListener") {
            final cz Zh;

            @Override
            public void run() {
                com.bytedance.sdk.openadsdk.multipro.aidl.PjT pjT0 = com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT();
                if(v == 1 && cz.this.ReZ != null) {
                    ReZ reZ0 = new ReZ(cz.this.ReZ);
                    IListenerManager iListenerManager0 = Stub.asInterface(pjT0.PjT(1));
                    if(iListenerManager0 != null) {
                        try {
                            iListenerManager0.registerFullVideoListener(cz.this.XX, reZ0);
                        }
                        catch(RemoteException remoteException0) {
                            RD.Zh("TTFullScreenVideoAdImpl", remoteException0.getMessage());
                        }
                    }
                }
            }
        }, 5);
    }

    private static boolean PjT(Owx owx0) {
        if(owx0 == null) {
            return false;
        }
        int v = owx0.RD();
        return owx0.iZZ() == 2 && (v != 5 && v != 6 && v != 12 && v != 19 && v != 33);
    }

    public void PjT() {
        if(this.JQp.get()) {
            return;
        }
        this.cr = true;
    }

    public void PjT(boolean z) {
        this.cz = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String s) {
        if(this.Zh != null && this.Zh.cz() != null && this.Zh.cz().Vs() != null) {
            try {
                return this.Zh.cz().Vs().get(s);
            }
            catch(Throwable throwable0) {
                RD.Zh("TTFullScreenVideoAdImpl", throwable0.getMessage());
            }
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map getMediaExtraInfo() {
        return this.Zh == null || this.Zh.cz() == null ? null : this.Zh.cz().Vs();
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double double0, String s, String s1) {
        if(!this.SM) {
            Yo.PjT(this.Zh.cz(), double0, s, s1);
            this.SM = true;
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback0) {
        this.ReZ = new com.bytedance.sdk.openadsdk.component.ReZ.PjT(pAGInterstitialAdInteractionCallback0);
        this.PjT(1);
    }

    @Override  // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener0) {
        this.ReZ = new com.bytedance.sdk.openadsdk.component.ReZ.PjT(pAGInterstitialAdInteractionListener0);
        this.PjT(1);
    }

    @Override  // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity0) {
        Intent intent0;
        if(activity0 != null && activity0.isFinishing()) {
            activity0 = null;
        }
        if(this.Zh != null && this.Zh.JQp()) {
            boolean z = this.Zh.XX();
            Owx owx0 = this.Zh.cz();
            if(a.x()) {
                List list0 = this.Zh.cr();
                if(list0 != null) {
                    for(Object object0: list0) {
                        IPMiBroadcastReceiver.PjT(this.PjT, ((Owx)object0));
                    }
                }
                if(this.JQp.get()) {
                    return;
                }
                this.JQp.set(true);
                if(owx0 != null && (owx0.MWx() != null || owx0.CY() != null)) {
                    Context context0 = activity0 == null ? this.PjT : activity0;
                    if(context0 == null) {
                        context0 = ub.PjT();
                    }
                    if(!xs.Gr().UR() || !com.bytedance.sdk.openadsdk.component.reward.Au.PjT(this.Zh)) {
                        Class class0 = TTFullScreenExpressVideoActivity.class;
                        if(z) {
                            intent0 = new Intent(context0, class0);
                        }
                        else if(!cz.PjT(owx0)) {
                            intent0 = SM.PjT(owx0) ? new Intent(context0, TTInterstitialActivity.class) : new Intent(context0, TTFullScreenVideoActivity.class);
                        }
                        else if(SM.PjT(owx0)) {
                            intent0 = new Intent(context0, TTInterstitialExpressActivity.class);
                        }
                        else {
                            intent0 = new Intent(context0, class0);
                        }
                    }
                    else {
                        intent0 = new Intent(context0, TTAdActivity.class);
                    }
                    intent0.putExtra("start_show_time", SystemClock.elapsedRealtime());
                    com.bytedance.sdk.openadsdk.component.reward.PjT.Zh.PjT(intent0, activity0, this.cr, this.Zh, this.XX);
                    intent0.putExtra("is_verity_playable", this.cz);
                    if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                        Lrd.PjT().PjT(this.ReZ);
                        this.ReZ = null;
                    }
                    boolean z1 = com.bytedance.sdk.openadsdk.RD.PjT.PjT("start_activity_async", 0) == 1;
                    if(z1) {
                        com.bytedance.sdk.openadsdk.ub.ReZ.PjT(new cr() {
                            final cz PjT;

                            @Override  // com.bytedance.sdk.openadsdk.ub.cr
                            public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                pjT0.Zh("start_activity");
                                pjT0.cr("fullscreen_interstitial_ad");
                                return pjT0;
                            }
                        });
                    }
                    com.bytedance.sdk.component.utils.Zh.PjT(context0, intent0, new com.bytedance.sdk.component.utils.Zh.Zh() {
                        final cz cr;

                        @Override  // com.bytedance.sdk.component.utils.Zh$Zh
                        public void PjT() {
                            if(cz.this.cz) {
                                try {
                                    com.bytedance.sdk.openadsdk.qla.ReZ.PjT().PjT(owx0.MWx().M());
                                }
                                catch(Throwable unused_ex) {
                                }
                            }
                            if(z1) {
                                com.bytedance.sdk.openadsdk.ub.ReZ.Zh(new cr() {
                                    final com.bytedance.sdk.openadsdk.component.reward.cz.2 PjT;

                                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                        pjT0.Zh("start_activity");
                                        pjT0.cr("fullscreen_interstitial_ad");
                                        return pjT0;
                                    }
                                });
                                com.bytedance.sdk.openadsdk.qla.ReZ.PjT("start_activity_action", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
                                    final com.bytedance.sdk.openadsdk.component.reward.cz.2 Zh;

                                    @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                                    public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                                        JSONObject jSONObject0 = new JSONObject();
                                        jSONObject0.put("duration", SystemClock.elapsedRealtime() - this.ReZ);
                                        return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("start_activity_action").Zh(jSONObject0.toString());
                                    }
                                });
                            }
                        }

                        @Override  // com.bytedance.sdk.component.utils.Zh$Zh
                        public void PjT(Throwable throwable0) {
                            if(cz.this.cz) {
                                try {
                                    com.bytedance.sdk.openadsdk.qla.ReZ.PjT().PjT(owx0.MWx().M(), -1, (throwable0 == null ? "playable tool error open" : throwable0.getMessage()));
                                }
                                catch(Throwable unused_ex) {
                                }
                            }
                            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, "fullscreen_interstitial_ad", "activity start  fail ");
                            if(z1) {
                                com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new cr() {
                                    final com.bytedance.sdk.openadsdk.component.reward.cz.2 PjT;

                                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                        pjT0.Zh("start_activity");
                                        pjT0.cr("fullscreen_interstitial_ad");
                                        return pjT0;
                                    }
                                });
                            }
                        }
                    }, true);
                    if(!z) {
                        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT(this.Zh.cz(), this.cr, false);
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double double0) {
        if(!this.Au) {
            Yo.PjT(this.Zh.cz(), double0);
            this.Au = true;
        }
    }
}

