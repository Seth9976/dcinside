package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.component.utils.iZZ;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.tT;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import com.bytedance.sdk.openadsdk.qla.Zh;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import t.b;

public class xs {
    static class PjT implements PAGRewardedAdLoadListener {
        private final boolean JQp;
        private final Context PjT;
        private final com.bytedance.sdk.openadsdk.core.model.PjT ReZ;
        private final AdSlot Zh;
        private final PAGRewardedAdLoadListener cr;

        public PjT(Context context0, AdSlot adSlot0, com.bytedance.sdk.openadsdk.core.model.PjT pjT0, PAGRewardedAdLoadListener pAGRewardedAdLoadListener0, boolean z) {
            this.PjT = context0;
            this.Zh = adSlot0;
            this.ReZ = pjT0;
            this.cr = pAGRewardedAdLoadListener0;
            this.JQp = z;
        }

        public void PjT(PAGRewardedAd pAGRewardedAd0) {
            xs.PjT(this.PjT).PjT(this.Zh, this.ReZ, this.cr, pAGRewardedAd0, this.JQp);
        }

        @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public void onAdLoaded(Object object0) {
            this.PjT(((PAGRewardedAd)object0));
        }

        @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public void onError(int v, String s) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener0 = this.cr;
            if(pAGRewardedAdLoadListener0 != null) {
                pAGRewardedAdLoadListener0.onError(v, s);
            }
        }
    }

    static class ReZ implements PAGRewardedAdLoadListener {
        private final PAGRewardedAdLoadListener PjT;
        private final AtomicInteger ReZ;
        private final AtomicBoolean Zh;
        private final com.bytedance.sdk.openadsdk.core.model.PjT cr;

        private ReZ(PAGRewardedAdLoadListener pAGRewardedAdLoadListener0, com.bytedance.sdk.openadsdk.core.model.PjT pjT0) {
            this.Zh = new AtomicBoolean(false);
            this.PjT = pAGRewardedAdLoadListener0;
            this.cr = pjT0;
            this.ReZ = new AtomicInteger(this.PjT());
        }

        ReZ(PAGRewardedAdLoadListener pAGRewardedAdLoadListener0, com.bytedance.sdk.openadsdk.core.model.PjT pjT0, com.bytedance.sdk.openadsdk.component.reward.xs.1 xs$10) {
            this(pAGRewardedAdLoadListener0, pjT0);
        }

        private int PjT() {
            if(this.cr.JQp()) {
                int v1 = 0;
                for(int v = 0; v < this.cr.cr().size(); ++v) {
                    Owx owx0 = (Owx)this.cr.cr().get(v);
                    if(owx0 != null && !cRA.ReZ(owx0) && owx0.MWx() != null) {
                        ++v1;
                    }
                }
                return v1;
            }
            return 0;
        }

        static com.bytedance.sdk.openadsdk.core.model.PjT PjT(ReZ xs$ReZ0) {
            return xs$ReZ0.cr;
        }

        public void PjT(PAGRewardedAd pAGRewardedAd0) {
            this.ReZ.decrementAndGet();
            if(this.PjT != null && this.Zh.compareAndSet(false, true)) {
                this.PjT.onAdLoaded(pAGRewardedAd0);
            }
        }

        @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public void onAdLoaded(Object object0) {
            this.PjT(((PAGRewardedAd)object0));
        }

        @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public void onError(int v, String s) {
            if(this.ReZ.decrementAndGet() <= 0 && this.PjT != null && this.Zh.compareAndSet(false, true)) {
                this.PjT.onError(v, s);
                com.bytedance.sdk.openadsdk.qla.ReZ.PjT("choose_ad_load_error", false, new Zh() {
                    final ReZ PjT;

                    // 去混淆评级： 低(20)
                    @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                    @Nullable
                    public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                        new JSONObject().put("req_id", "");
                        return cr.Zh().PjT("choose_ad_load_error").Zh("{\"req_id\":\"\"}");
                    }
                });
            }
        }
    }

    public static class com.bytedance.sdk.openadsdk.component.reward.xs.Zh extends Au {
        final Owx PjT;
        final com.bytedance.sdk.openadsdk.core.model.PjT ReZ;
        final AdSlot Zh;

        com.bytedance.sdk.openadsdk.component.reward.xs.Zh(Owx owx0, AdSlot adSlot0, com.bytedance.sdk.openadsdk.core.model.PjT pjT0) {
            super("Reward Task");
            this.PjT = owx0;
            this.Zh = adSlot0;
            this.ReZ = pjT0;
        }

        @Override
        public void run() {
            Owx owx0 = this.PjT;
            if(owx0 == null) {
                return;
            }
            if(Build.VERSION.SDK_INT >= 23) {
                if(owx0.MWx() != null) {
                    com.bytedance.sdk.openadsdk.core.xf.PjT.Zh zh0 = Owx.PjT(CacheDirFactory.getICacheDir(this.PjT.hx()).PjT(), this.PjT);
                    zh0.PjT("material_meta", this.PjT);
                    zh0.PjT("ad_slot", this.Zh);
                    com.bytedance.sdk.openadsdk.core.xf.JQp.PjT.PjT(zh0, new b() {
                        final com.bytedance.sdk.openadsdk.component.reward.xs.Zh PjT;

                        @Override  // t.a$a
                        public void PjT(v.b b0, int v) {
                            xf.PjT(ub.PjT()).PjT(com.bytedance.sdk.openadsdk.component.reward.xs.Zh.this.Zh, com.bytedance.sdk.openadsdk.component.reward.xs.Zh.this.ReZ);
                        }

                        @Override  // t.a$a
                        public void PjT(v.b b0, int v, String s) {
                        }
                    });
                }
                return;
            }
            xf xf0 = xf.PjT(ub.PjT());
            com.bytedance.sdk.openadsdk.component.reward.xs.Zh.2 xs$Zh$20 = new com.bytedance.sdk.openadsdk.common.PjT.PjT() {
                final com.bytedance.sdk.openadsdk.component.reward.xs.Zh PjT;

                @Override  // com.bytedance.sdk.openadsdk.common.PjT$PjT
                public void PjT(boolean z, Object object0) {
                    if(z) {
                        xf.PjT(ub.PjT()).PjT(com.bytedance.sdk.openadsdk.component.reward.xs.Zh.this.Zh, com.bytedance.sdk.openadsdk.component.reward.xs.Zh.this.ReZ);
                    }
                }
            };
            xf0.PjT(this.PjT, xs$Zh$20);
        }
    }

    private Au JQp;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile xs PjT;
    private final AtomicBoolean ReZ;
    private final Context Zh;
    private final List cr;
    private final com.bytedance.sdk.component.utils.iZZ.PjT cz;

    private xs(Context context0) {
        this.ReZ = new AtomicBoolean(false);
        this.cr = DesugarCollections.synchronizedList(new ArrayList());
        this.cz = new com.bytedance.sdk.component.utils.iZZ.PjT() {
            final xs PjT;

            @Override  // com.bytedance.sdk.component.utils.iZZ$PjT
            public void PjT(Context context0, Intent intent0, boolean z, int v) {
                if(!z) {
                    return;
                }
                if(xs.this.JQp == null) {
                    com.bytedance.sdk.openadsdk.component.reward.Zh zh0 = new com.bytedance.sdk.openadsdk.component.reward.Zh("net connect task", xs.this.cr);
                    xs.this.JQp = zh0;
                }
                SM.PjT().post(xs.this.JQp);
            }
        };
        this.Zh = context0 == null ? ub.PjT() : context0.getApplicationContext();
        this.Zh();
    }

    public static xs PjT(Context context0) {
        if(xs.PjT == null) {
            Class class0 = xs.class;
            __monitor_enter(class0);
            try {
                if(xs.PjT == null) {
                    xs.PjT = new xs(context0);
                }
                __monitor_exit(class0);
                return xs.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return xs.PjT;
    }

    private void PjT(AdSlot adSlot0, com.bytedance.sdk.openadsdk.core.model.PjT pjT0, PAGRewardedAdLoadListener pAGRewardedAdLoadListener0, PAGRewardedAd pAGRewardedAd0, boolean z) {
        if(pAGRewardedAdLoadListener0 != null) {
            pAGRewardedAdLoadListener0.onAdLoaded(pAGRewardedAd0);
        }
        int v = JQp.Zh();
        if(z) {
            if(v == 2) {
                this.Zh(adSlot0);
                return;
            }
            if(v == 1) {
                xf.PjT(this.Zh).PjT(adSlot0.getCodeId(), null);
            }
        }
        else if(v == 2) {
            xf.PjT(this.Zh).PjT(adSlot0, pjT0);
            this.Zh(adSlot0);
        }
    }

    private void PjT(AdSlot adSlot0, boolean z, PAGRewardedAdLoadListener pAGRewardedAdLoadListener0) {
        long v = System.currentTimeMillis();
        tT tT0 = new tT();
        tT0.Zh = z ? 2 : 1;
        if(ub.cr().xf(adSlot0.getCodeId()) || adSlot0.getExpressViewAcceptedWidth() > 0.0f || adSlot0.isExpressAd()) {
            tT0.Au = 2;
        }
        ub.ReZ().PjT(adSlot0, tT0, 7, new com.bytedance.sdk.openadsdk.core.ltE.PjT() {
            final xs JQp;

            @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
            public void PjT(int v, String s) {
                if(!z) {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener0 = pAGRewardedAdLoadListener0;
                    if(pAGRewardedAdLoadListener0 != null) {
                        pAGRewardedAdLoadListener0.onError(v, s);
                    }
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
            public void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0, com.bytedance.sdk.openadsdk.core.model.ReZ reZ0) {
                if(pjT0.cr() != null && !pjT0.cr().isEmpty()) {
                    qla qla0 = new qla(xs.this.Zh, pjT0, adSlot0);
                    if(!z) {
                        if(!TextUtils.isEmpty(adSlot0.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.Owx.PjT.cr.PjT().PjT((pjT0.cr().isEmpty() ? null : ((Owx)pjT0.cr().get(0))));
                            com.bytedance.sdk.openadsdk.qla.ReZ.PjT(pjT0.cz(), System.currentTimeMillis() - v);
                        }
                        if(!pjT0.XX() && pAGRewardedAdLoadListener0 != null && ub.cr().gK() == 0) {
                            xs.this.PjT(adSlot0, pjT0, pAGRewardedAdLoadListener0, qla0.PjT(), false);
                        }
                    }
                    com.bytedance.sdk.openadsdk.xs.PjT.PjT().PjT(pjT0.cz());
                    ReZ xs$ReZ0 = new ReZ(new PjT(xs.this.Zh, adSlot0, pjT0, pAGRewardedAdLoadListener0, false), pjT0, null);
                    for(int v = 0; v < pjT0.cr().size(); ++v) {
                        Object object0 = pjT0.cr().get(v);
                        boolean z = pjT0.XX();
                        xs.this.PjT(pjT0, ((Owx)object0), qla0, adSlot0, z, xs$ReZ0, z);
                        if(pjT0.xf()) {
                            break;
                        }
                    }
                    return;
                }
                if(!z) {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener0 = pAGRewardedAdLoadListener0;
                    if(pAGRewardedAdLoadListener0 != null) {
                        pAGRewardedAdLoadListener0.onError(-3, "");
                        reZ0.PjT(-3);
                        com.bytedance.sdk.openadsdk.core.model.ReZ.PjT(reZ0);
                    }
                }
            }
        });
    }

    private void PjT(com.bytedance.sdk.openadsdk.component.reward.xs.Zh xs$Zh0) {
        if(xs$Zh0 == null) {
            return;
        }
        if(this.cr.size() > 0) {
            this.cr.remove(0);
        }
        this.cr.add(xs$Zh0);
    }

    private void PjT(Owx owx0, AdSlot adSlot0, ReZ xs$ReZ0, qla qla0, boolean z) {
        int v = 1;
        int v1 = 0;
        if(xs$ReZ0 == null || !z && ub.cr().gK() != 1) {
            v = 0;
        }
        if(cRA.ReZ(owx0) || Build.VERSION.SDK_INT < 23) {
            v1 = v;
        }
        else {
            com.bytedance.sdk.openadsdk.core.xf.PjT.Zh zh0 = Owx.PjT(CacheDirFactory.getICacheDir(owx0.hx()).PjT(), owx0);
            zh0.PjT("material_meta", owx0);
            zh0.PjT("ad_slot", adSlot0);
            com.bytedance.sdk.openadsdk.core.xf.JQp.PjT.PjT(zh0, new b() {
                final xs cr;

                @Override  // t.a$a
                public void PjT(v.b b0, int v) {
                    Log.d("RewardVideoLoadManager", "onVideoPreloadSuccess: ");
                    if(xs$ReZ0 != null && (z || ub.cr().gK() == 1)) {
                        xs$ReZ0.PjT(qla0.PjT());
                    }
                }

                @Override  // t.a$a
                public void PjT(v.b b0, int v, String s) {
                    if(xs$ReZ0 != null && (z || ub.cr().gK() == 1)) {
                        xs$ReZ0.onError(v, s);
                    }
                }
            });
        }
        if(v1 != 0) {
            xs$ReZ0.onAdLoaded(qla0.PjT());
        }
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0, Owx owx0, qla qla0, AdSlot adSlot0, boolean z, ReZ xs$ReZ0, boolean z1) {
        int v = 0;
        com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(owx0, new com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT() {
            final xs PjT;

        });
        int v1 = 1;
        if(z && !cRA.ReZ(owx0) && ub.cr().iZZ(adSlot0.getCodeId()).cr == 1 && !ltE.cr(this.Zh)) {
            this.PjT(new com.bytedance.sdk.openadsdk.component.reward.xs.Zh(owx0, adSlot0, pjT0));
            return;
        }
        if(xs$ReZ0 == null || !z1 && ub.cr().gK() != 1) {
            v1 = 0;
        }
        if(cRA.ReZ(owx0)) {
            if(z) {
                xf.PjT(this.Zh).PjT(adSlot0, pjT0);
            }
            v = v1;
        }
        else if(Build.VERSION.SDK_INT < 23) {
            xf.PjT(this.Zh).PjT(owx0, new com.bytedance.sdk.openadsdk.common.PjT.PjT() {
                final xs XX;

                @Override  // com.bytedance.sdk.openadsdk.common.PjT$PjT
                public void PjT(boolean z, Object object0) {
                    if(z) {
                        qla0.Zh();
                    }
                    if(z) {
                        if(z) {
                            xf.PjT(xs.this.Zh).PjT(adSlot0, pjT0);
                        }
                    }
                    else if(z) {
                        if(xs$ReZ0 != null && (z1 || ub.cr().gK() == 1)) {
                            xs$ReZ0.PjT(qla0.PjT());
                        }
                    }
                    else if(xs$ReZ0 != null && (z1 || ub.cr().gK() == 1)) {
                        xs$ReZ0.onError(-1, "");
                    }
                }
            });
        }
        else if(owx0.MWx() != null) {
            com.bytedance.sdk.openadsdk.core.xf.PjT.Zh zh0 = Owx.PjT(CacheDirFactory.getICacheDir(owx0.hx()).PjT(), owx0);
            zh0.PjT("material_meta", owx0);
            zh0.PjT("ad_slot", adSlot0);
            com.bytedance.sdk.openadsdk.core.xf.JQp.PjT.PjT(zh0, new b() {
                final xs XX;

                @Override  // t.a$a
                public void PjT(v.b b0, int v) {
                    qla0.Zh();
                    if(z) {
                        xf.PjT(xs.this.Zh).PjT(adSlot0, pjT0);
                        return;
                    }
                    if(xs$ReZ0 != null && (z1 || ub.cr().gK() == 1)) {
                        xs$ReZ0.PjT(qla0.PjT());
                    }
                }

                @Override  // t.a$a
                public void PjT(v.b b0, int v, String s) {
                    if(xs$ReZ0 != null && (z1 || ub.cr().gK() == 1)) {
                        xs$ReZ0.onError(v, s);
                    }
                }
            });
        }
        else {
            v = v1;
        }
        if(v != 0) {
            xs$ReZ0.onAdLoaded(qla0.PjT());
        }
    }

    public void PjT() {
        try {
            xf.PjT(this.Zh).PjT();
        }
        catch(Throwable unused_ex) {
        }
    }

    public void PjT(AdSlot adSlot0) {
        if(adSlot0 == null || TextUtils.isEmpty(adSlot0.getCodeId()) || !TextUtils.isEmpty(adSlot0.getBidAdm()) || xf.PjT(this.Zh).PjT(adSlot0.getCodeId(), false) != null) {
            return;
        }
        this.PjT(adSlot0, true, null);
    }

    public void PjT(AdSlot adSlot0, PAGRewardedAdLoadListener pAGRewardedAdLoadListener0) {
        this.Zh(adSlot0, pAGRewardedAdLoadListener0);
    }

    public void PjT(String s, Owx owx0) {
        xf.PjT(this.Zh).PjT(s, owx0);
    }

    private void ReZ() {
        if(!this.ReZ.get()) {
            return;
        }
        this.ReZ.set(false);
        try {
            iZZ.PjT(this.cz);
        }
        catch(Exception unused_ex) {
        }
    }

    private void Zh() {
        if(this.ReZ.get()) {
            return;
        }
        this.ReZ.set(true);
        iZZ.PjT(this.cz, this.Zh);
    }

    private void Zh(AdSlot adSlot0) {
        if(JQp.Zh() != 2) {
            return;
        }
        xf.PjT(this.Zh).PjT(adSlot0.getCodeId());
    }

    private void Zh(AdSlot adSlot0, PAGRewardedAdLoadListener pAGRewardedAdLoadListener0) {
        if(TextUtils.isEmpty(adSlot0.getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.model.PjT pjT0 = xf.PjT(this.Zh).PjT(adSlot0.getCodeId(), true);
            if(pjT0 != null && pjT0.JQp()) {
                Owx owx0 = pjT0.cz();
                for(Object object0: pjT0.cr()) {
                    Owx owx1 = (Owx)object0;
                    if(owx1.ig() == null) {
                        owx1.PjT(adSlot0);
                    }
                }
                qla qla0 = new qla(this.Zh, pjT0, adSlot0);
                if(!pjT0.XX() && !cRA.ReZ(owx0)) {
                    qla0.Zh();
                }
                if(pAGRewardedAdLoadListener0 != null) {
                    if(!pjT0.XX() && ub.cr().gK() == 0) {
                        this.PjT(adSlot0, pjT0, pAGRewardedAdLoadListener0, qla0.PjT(), true);
                    }
                    ReZ xs$ReZ0 = new ReZ(new PjT(this.Zh, adSlot0, pjT0, pAGRewardedAdLoadListener0, true), pjT0, null);
                    for(int v1 = 0; v1 < pjT0.cr().size(); ++v1) {
                        this.PjT(((Owx)pjT0.cr().get(v1)), adSlot0, xs$ReZ0, qla0, pjT0.XX());
                        if(pjT0.xf()) {
                            break;
                        }
                    }
                }
                for(int v = 0; v < pjT0.cr().size(); ++v) {
                    Owx owx2 = (Owx)pjT0.cr().get(v);
                    com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(owx2, new com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT() {
                        final xs PjT;

                    });
                }
                return;
            }
        }
        this.PjT(adSlot0, false, pAGRewardedAdLoadListener0);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if(this.JQp != null) {
            try {
                SM.PjT().removeCallbacks(this.JQp);
            }
            catch(Exception unused_ex) {
            }
            this.JQp = null;
        }
        this.ReZ();
    }
}

