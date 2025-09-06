package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager.Stub;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.Lrd;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.PjT;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.Zh;
import com.bytedance.sdk.openadsdk.multipro.aidl.Zh.cr;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.ub.ReZ;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.Yo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

class Au extends PAGRewardedAd {
    private boolean Au;
    private boolean JQp;
    private final Context PjT;
    private final AdSlot ReZ;
    private boolean SM;
    private final String XX;
    private final PjT Zh;
    private com.bytedance.sdk.openadsdk.PjT.JQp.PjT cr;
    private final AtomicBoolean cz;

    Au(Context context0, PjT pjT0, AdSlot adSlot0) {
        this.cz = new AtomicBoolean(false);
        this.PjT = context0;
        this.Zh = pjT0;
        this.ReZ = adSlot0;
        this.XX = "2baabaed-e3a5-4cd7-98e6-97a376e8262a";
    }

    private void PjT(int v) {
        if(!Zh.ReZ()) {
            return;
        }
        Jo.ReZ(new com.bytedance.sdk.component.Au.Au("Reward_registerMultiProcessListener") {
            final Au Zh;

            @Override
            public void run() {
                com.bytedance.sdk.openadsdk.multipro.aidl.PjT pjT0 = com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT();
                if(v == 0 && Au.this.cr != null) {
                    cr cr0 = new cr(Au.this.cr);
                    IListenerManager iListenerManager0 = Stub.asInterface(pjT0.PjT(0));
                    if(iListenerManager0 != null) {
                        try {
                            iListenerManager0.registerRewardVideoListener(Au.this.XX, cr0);
                        }
                        catch(RemoteException remoteException0) {
                            RD.Zh("TTRewardVideoAdImpl", remoteException0.getMessage());
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

    public static boolean PjT(PjT pjT0) {
        if(pjT0 == null) {
            return false;
        }
        Owx owx0 = pjT0.cz();
        if(owx0 == null) {
            return false;
        }
        if(gK.ReZ(owx0)) {
            return false;
        }
        if(owx0.fd()) {
            return true;
        }
        try {
            String s = com.bytedance.sdk.openadsdk.RD.PjT.PjT("rviv_new_arch", null);
            if(TextUtils.isEmpty(s)) {
                return false;
            }
            JSONArray jSONArray0 = new JSONArray(s);
            for(int v = 0; v < jSONArray0.length(); ++v) {
                int v1 = jSONArray0.getInt(v);
                if(owx0.RD() == v1) {
                    return true;
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public void PjT() {
        if(this.cz.get()) {
            return;
        }
        this.JQp = true;
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String s) {
        if(this.Zh != null && this.Zh.cz() != null && this.Zh.cz().Vs() != null) {
            try {
                return this.Zh.cz().Vs().get(s);
            }
            catch(Throwable throwable0) {
                RD.Zh("TTRewardVideoAdImpl", throwable0.getMessage());
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

    @Override  // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback0) {
        this.cr = new SM(pAGRewardedAdInteractionCallback0);
        this.PjT(0);
    }

    @Override  // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener0) {
        this.cr = new SM(pAGRewardedAdInteractionListener0);
        this.PjT(0);
    }

    @Override  // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(@Nullable Activity activity0) {
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
                if(!this.cz.compareAndSet(false, true)) {
                    return;
                }
                if(owx0 != null && owx0.MWx() != null) {
                    Context context0 = activity0 == null ? this.PjT : activity0;
                    if(context0 == null) {
                        context0 = ub.PjT();
                    }
                    if(!xs.Gr().UR() || !Au.PjT(this.Zh)) {
                        Class class0 = TTRewardExpressVideoActivity.class;
                        if(z) {
                            intent0 = new Intent(context0, class0);
                        }
                        else {
                            intent0 = Au.PjT(owx0) ? new Intent(context0, class0) : new Intent(context0, TTRewardVideoActivity.class);
                        }
                    }
                    else {
                        intent0 = new Intent(context0, TTAdActivity.class);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.PjT.Zh.PjT(intent0, activity0, this.JQp, this.Zh, this.XX);
                    intent0.putExtra("media_extra", this.ReZ.getMediaExtra());
                    intent0.putExtra("user_id", this.ReZ.getUserID());
                    intent0.putExtra("start_show_time", SystemClock.elapsedRealtime());
                    if(!Zh.ReZ()) {
                        Lrd.PjT().PjT(this.cr);
                        this.cr = null;
                    }
                    boolean z1 = com.bytedance.sdk.openadsdk.RD.PjT.PjT("start_activity_async", 0) == 1;
                    if(z1) {
                        ReZ.PjT(new com.bytedance.sdk.openadsdk.ub.cr() {
                            final Au PjT;

                            @Override  // com.bytedance.sdk.openadsdk.ub.cr
                            public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                pjT0.Zh("start_activity");
                                pjT0.cr("rewarded_video");
                                return pjT0;
                            }
                        });
                    }
                    com.bytedance.sdk.component.utils.Zh.PjT(context0, intent0, new com.bytedance.sdk.component.utils.Zh.Zh() {
                        final Au cr;

                        @Override  // com.bytedance.sdk.component.utils.Zh$Zh
                        public void PjT() {
                            if(z1) {
                                ReZ.Zh(new com.bytedance.sdk.openadsdk.ub.cr() {
                                    final com.bytedance.sdk.openadsdk.component.reward.Au.2 PjT;

                                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                        pjT0.Zh("start_activity");
                                        pjT0.cr("rewarded_video");
                                        return pjT0;
                                    }
                                });
                                com.bytedance.sdk.openadsdk.qla.ReZ.PjT("start_activity_action", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
                                    final com.bytedance.sdk.openadsdk.component.reward.Au.2 Zh;

                                    @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                                    public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                                        JSONObject jSONObject0 = new JSONObject();
                                        jSONObject0.put("duration", SystemClock.elapsedRealtime() - this.Zh);
                                        return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("start_activity_action").Zh(jSONObject0.toString());
                                    }
                                });
                            }
                        }

                        @Override  // com.bytedance.sdk.component.utils.Zh$Zh
                        public void PjT(Throwable throwable0) {
                            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, "fullscreen_interstitial_ad", "activity start  fail ");
                            if(z1) {
                                ReZ.ReZ(new com.bytedance.sdk.openadsdk.ub.cr() {
                                    final com.bytedance.sdk.openadsdk.component.reward.Au.2 PjT;

                                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                        pjT0.Zh("start_activity");
                                        pjT0.cr("rewarded_video");
                                        return pjT0;
                                    }
                                });
                            }
                        }
                    }, true);
                    if(!z) {
                        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT(this.Zh.cz(), this.JQp, true);
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
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

