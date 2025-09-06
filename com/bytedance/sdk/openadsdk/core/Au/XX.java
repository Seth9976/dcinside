package com.bytedance.sdk.openadsdk.core.Au;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.Au;
import com.bytedance.sdk.openadsdk.core.ReZ.cr;
import com.bytedance.sdk.openadsdk.core.ReZ.cz;
import com.bytedance.sdk.openadsdk.core.ltE;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.tT;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf.PjT.Zh;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import com.bytedance.sdk.openadsdk.utils.Co;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class XX {
    public interface PjT {
    }

    private PjT Au;
    private final Co DWo;
    private final AtomicBoolean JQp;
    private AdSlot PjT;
    private final Context ReZ;
    private int SM;
    private List XX;
    private final ltE Zh;
    private PAGBannerAdLoadListener cr;
    private List cz;

    private XX(Context context0) {
        this.JQp = new AtomicBoolean(false);
        this.SM = 5;
        this.DWo = Co.ReZ();
        this.Zh = ub.ReZ();
        if(context0 != null) {
            this.ReZ = context0.getApplicationContext();
            return;
        }
        this.ReZ = ub.PjT();
    }

    private PAGBannerAd PjT(Owx owx0) {
        if(this.SM == 1) {
            return owx0.MWx() != null ? new cz(this.ReZ, owx0, this.PjT) : new cr(this.ReZ, owx0, this.PjT);
        }
        return null;
    }

    @Nullable
    private PAGBannerAd PjT(Co co0) {
        int v1;
        int v;
        PAGBannerAd pAGBannerAd0 = null;
        for(Object object0: this.XX) {
            PAGBannerSize pAGBannerSize0 = ((Owx)object0).WfD();
            float f = Math.min(this.PjT.getExpressViewAcceptedHeight(), 250.0f);
            if(pAGBannerSize0 == null) {
                v1 = 0;
                v = 0;
            }
            else {
                v = pAGBannerSize0.getWidth();
                v1 = pAGBannerSize0.getHeight();
            }
            float f1 = v <= 0 ? this.PjT.getExpressViewAcceptedWidth() : ((float)v);
            if(v1 > 0) {
                f = (float)v1;
            }
            this.PjT.setExpressViewAccepted(f1, f);
            pAGBannerAd0 = this.PjT(((Owx)object0));
            if(pAGBannerAd0 != null) {
                break;
            }
        }
        return pAGBannerAd0;
    }

    public static XX PjT(Context context0) {
        return new XX(context0);
    }

    private void PjT() {
        List list0 = this.cz;
        if(list0 != null) {
            list0.clear();
        }
        List list1 = this.XX;
        if(list1 != null) {
            list1.clear();
        }
    }

    private void PjT(int v) {
        String s = this.cz == null || this.cz.size() <= 0 ? "" : ((Owx)this.cz.get(0)).ydj();
        com.bytedance.sdk.openadsdk.qla.PjT.cr cr0 = com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT(this.SM).ReZ(this.PjT.getCodeId()).JQp(s).Zh(v).cz(Au.PjT(v));
        ReZ.PjT().PjT(cr0);
    }

    private void PjT(int v, String s) {
        if(this.JQp.getAndSet(false)) {
            PAGBannerAdLoadListener pAGBannerAdLoadListener0 = this.cr;
            if(pAGBannerAdLoadListener0 != null) {
                pAGBannerAdLoadListener0.onError(v, s);
            }
            this.PjT();
        }
    }

    private void PjT(AdSlot adSlot0) {
        List list0 = this.cz;
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            Owx owx0 = (Owx)object0;
            if(Owx.JQp(owx0) && owx0.MWx() != null && owx0.MWx().I() != null) {
                int v = owx0.joj();
                if(ub.cr().JQp(String.valueOf(v)) && ub.cr().MWx()) {
                    Zh zh0 = Owx.PjT(CacheDirFactory.getICacheDir(owx0.hx()).ReZ(), owx0);
                    zh0.PjT("material_meta", owx0);
                    zh0.PjT("ad_slot", adSlot0);
                    com.bytedance.sdk.openadsdk.core.xf.JQp.PjT.PjT(zh0, null);
                }
            }
        }
    }

    private void PjT(AdSlot adSlot0, com.bytedance.sdk.openadsdk.common.cz cz0) {
        if(adSlot0 == null) {
            return;
        }
        tT tT0 = new tT();
        tT0.Au = 2;
        int v = this.SM;
        com.bytedance.sdk.openadsdk.core.Au.XX.1 xX$10 = new com.bytedance.sdk.openadsdk.core.ltE.PjT() {
            final XX Zh;

            @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
            public void PjT(int v, String s) {
                XX.this.PjT(v, s);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
            public void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0, com.bytedance.sdk.openadsdk.core.model.ReZ reZ0) {
                if(pjT0.cr() == null || pjT0.cr().isEmpty()) {
                    XX.this.PjT(-3, "");
                    reZ0.PjT(-3);
                    com.bytedance.sdk.openadsdk.core.model.ReZ.PjT(reZ0);
                }
                else {
                    XX.this.cz = pjT0.cr();
                    XX.this.XX = pjT0.cr();
                    XX.this.PjT(adSlot0);
                    if(XX.this.JQp.getAndSet(false)) {
                        Jo.PjT(new Runnable() {
                            final com.bytedance.sdk.openadsdk.core.Au.XX.1 Zh;

                            @Override
                            public void run() {
                                long v = SystemClock.elapsedRealtime();
                                if(XX.this.XX != null && XX.this.XX.size() > 0) {
                                    XX.this.PjT(pjT0, XX.this.DWo, v);
                                }
                                XX.this.PjT();
                            }
                        });
                    }
                }
            }
        };
        this.Zh.PjT(adSlot0, tT0, v, xX$10);
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0, long v, long v1, long v2) {
        try {
            if(!ub.cr().dwk()) {
                return;
            }
            if(com.bytedance.sdk.openadsdk.RD.PjT.cr() && (this.SM == 1 && pjT0 != null && pjT0.cr() != null && !pjT0.cr().isEmpty() && pjT0.PjT() != null)) {
                Object object0 = pjT0.cr().get(0);
                if(((Owx)object0) == null) {
                    return;
                }
                JSONObject jSONObject0 = pjT0.PjT();
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(System.currentTimeMillis(), ((Owx)object0), jSONObject0.optString("tag", ""), "load_ad_time", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                    final XX JQp;

                    @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                    public JSONObject PjT() {
                        JSONObject jSONObject0 = new JSONObject();
                        try {
                            long v = jSONObject0.optLong("callback_start", 0L);
                            long v1 = v1 - v;
                            long v2 = v2 - v1;
                            long v3 = jSONObject0.optLong("duration", 0L);
                            JSONObject jSONObject1 = jSONObject0.optJSONObject("extra_data");
                            if(jSONObject1 == null) {
                                jSONObject1 = new JSONObject();
                            }
                            jSONObject1.put("thread_dispatch_duration", v1);
                            jSONObject1.put("build_banner_ad_duration", v2);
                            jSONObject1.put("ad_load_duration_full", v);
                            jSONObject0.put("duration", v3);
                            jSONObject0.put("ad_extra_data", jSONObject1.toString());
                        }
                        catch(Throwable unused_ex) {
                        }
                        return jSONObject0;
                    }
                });
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0, Co co0, long v) {
        if(this.cr != null) {
            PAGBannerAd pAGBannerAd0 = this.PjT(co0);
            if(pAGBannerAd0 != null) {
                long v1 = SystemClock.elapsedRealtime();
                long v2 = this.DWo.cr();
                if(!TextUtils.isEmpty(this.PjT.getBidAdm())) {
                    ReZ.PjT(((Owx)this.XX.get(0)), v2);
                }
                this.cr.onAdLoaded(pAGBannerAd0);
                this.PjT(pjT0, v2, v, v1);
                return;
            }
            this.cr.onError(103, "");
            this.PjT(103);
        }
    }

    public void PjT(AdSlot adSlot0, int v, @NonNull com.bytedance.sdk.openadsdk.common.cz cz0, int v1) {
        this.PjT(adSlot0, v, cz0, null, v1);
    }

    public void PjT(AdSlot adSlot0, int v, @Nullable com.bytedance.sdk.openadsdk.common.cz cz0, @Nullable PjT xX$PjT0, int v1) {
        this.DWo.JQp();
        if(this.JQp.get()) {
            return;
        }
        this.SM = v;
        this.JQp.set(true);
        this.PjT = adSlot0;
        if(cz0 instanceof PAGBannerAdLoadListener) {
            this.cr = (PAGBannerAdLoadListener)cz0;
        }
        this.Au = xX$PjT0;
        this.PjT(adSlot0, cz0);
    }

    static PjT cr(XX xX0) {
        return xX0.Au;
    }
}

