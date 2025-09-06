package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.component.utils.iZZ;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.tT;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf.PjT.Zh;
import com.bytedance.sdk.openadsdk.utils.Co;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import t.b;

public class JQp {
    static class PjT implements PAGInterstitialAdLoadListener {
        private final boolean JQp;
        private final Context PjT;
        private final com.bytedance.sdk.openadsdk.core.model.PjT ReZ;
        private final AdSlot Zh;
        private final PAGInterstitialAdLoadListener cr;

        public PjT(Context context0, AdSlot adSlot0, com.bytedance.sdk.openadsdk.core.model.PjT pjT0, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0, boolean z) {
            this.PjT = context0;
            this.Zh = adSlot0;
            this.ReZ = pjT0;
            this.cr = pAGInterstitialAdLoadListener0;
            this.JQp = z;
        }

        public void PjT(PAGInterstitialAd pAGInterstitialAd0) {
            JQp.PjT(this.PjT).PjT(this.Zh, this.ReZ, this.cr, pAGInterstitialAd0, this.JQp);
        }

        @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public void onAdLoaded(Object object0) {
            this.PjT(((PAGInterstitialAd)object0));
        }

        @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public void onError(int v, String s) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0 = this.cr;
            if(pAGInterstitialAdLoadListener0 != null) {
                pAGInterstitialAdLoadListener0.onError(v, s);
            }
        }
    }

    static class ReZ extends Au {
        final Owx PjT;
        final com.bytedance.sdk.openadsdk.core.model.PjT ReZ;
        final AdSlot Zh;

        ReZ(Owx owx0, AdSlot adSlot0, com.bytedance.sdk.openadsdk.core.model.PjT pjT0) {
            super("Fullscreen Task");
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
                    Zh zh0 = Owx.PjT(CacheDirFactory.getICacheDir(this.PjT.hx()).PjT(), this.PjT);
                    zh0.PjT("material_meta", this.PjT);
                    zh0.PjT("ad_slot", this.Zh);
                    com.bytedance.sdk.openadsdk.core.xf.JQp.PjT.PjT(zh0, new b() {
                        final ReZ PjT;

                        @Override  // t.a$a
                        public void PjT(v.b b0, int v) {
                            cr.PjT(ub.PjT()).PjT(ReZ.this.Zh, ReZ.this.ReZ);
                        }

                        @Override  // t.a$a
                        public void PjT(v.b b0, int v, String s) {
                        }
                    });
                }
                return;
            }
            cr cr0 = cr.PjT(ub.PjT());
            com.bytedance.sdk.openadsdk.component.reward.JQp.ReZ.2 jQp$ReZ$20 = new com.bytedance.sdk.openadsdk.common.PjT.PjT() {
                final ReZ PjT;

                @Override  // com.bytedance.sdk.openadsdk.common.PjT$PjT
                public void PjT(boolean z, Object object0) {
                    if(z) {
                        cr.PjT(ub.PjT()).PjT(ReZ.this.Zh, ReZ.this.ReZ);
                    }
                }
            };
            cr0.PjT(this.PjT, jQp$ReZ$20);
        }
    }

    static class com.bytedance.sdk.openadsdk.component.reward.JQp.Zh implements PAGInterstitialAdLoadListener {
        private final PAGInterstitialAdLoadListener PjT;
        private final AtomicInteger ReZ;
        private final AtomicBoolean Zh;
        private final com.bytedance.sdk.openadsdk.core.model.PjT cr;

        private com.bytedance.sdk.openadsdk.component.reward.JQp.Zh(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0, com.bytedance.sdk.openadsdk.core.model.PjT pjT0) {
            this.Zh = new AtomicBoolean(false);
            this.PjT = pAGInterstitialAdLoadListener0;
            this.cr = pjT0;
            this.ReZ = new AtomicInteger(this.PjT());
        }

        com.bytedance.sdk.openadsdk.component.reward.JQp.Zh(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0, com.bytedance.sdk.openadsdk.core.model.PjT pjT0, com.bytedance.sdk.openadsdk.component.reward.JQp.1 jQp$10) {
            this(pAGInterstitialAdLoadListener0, pjT0);
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

        static com.bytedance.sdk.openadsdk.core.model.PjT PjT(com.bytedance.sdk.openadsdk.component.reward.JQp.Zh jQp$Zh0) {
            return jQp$Zh0.cr;
        }

        public void PjT(PAGInterstitialAd pAGInterstitialAd0) {
            this.ReZ.decrementAndGet();
            if(this.PjT != null && this.Zh.compareAndSet(false, true)) {
                this.PjT.onAdLoaded(pAGInterstitialAd0);
            }
        }

        @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public void onAdLoaded(Object object0) {
            this.PjT(((PAGInterstitialAd)object0));
        }

        @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public void onError(int v, String s) {
            if(this.ReZ.decrementAndGet() <= 0 && this.Zh.compareAndSet(false, true)) {
                this.PjT.onError(v, s);
                com.bytedance.sdk.openadsdk.qla.ReZ.PjT("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
                    final com.bytedance.sdk.openadsdk.component.reward.JQp.Zh PjT;

                    // 去混淆评级： 低(20)
                    @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                    @Nullable
                    public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                        new JSONObject().put("req_id", "");
                        return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("choose_ad_load_error").Zh("{\"req_id\":\"\"}");
                    }
                });
            }
        }
    }

    private Au JQp;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile JQp PjT;
    private final AtomicBoolean ReZ;
    private final Context Zh;
    private final List cr;
    private final com.bytedance.sdk.component.utils.iZZ.PjT cz;

    private JQp(Context context0) {
        this.ReZ = new AtomicBoolean(false);
        this.cr = DesugarCollections.synchronizedList(new ArrayList());
        this.cz = new com.bytedance.sdk.component.utils.iZZ.PjT() {
            final JQp PjT;

            @Override  // com.bytedance.sdk.component.utils.iZZ$PjT
            public void PjT(Context context0, Intent intent0, boolean z, int v) {
                if(!z) {
                    return;
                }
                if(JQp.this.JQp == null) {
                    com.bytedance.sdk.openadsdk.component.reward.Zh zh0 = new com.bytedance.sdk.openadsdk.component.reward.Zh("fsv net connect task", JQp.this.cr);
                    JQp.this.JQp = zh0;
                }
                SM.PjT().post(JQp.this.JQp);
            }
        };
        this.Zh = context0 == null ? ub.PjT() : context0.getApplicationContext();
        this.ReZ();
    }

    public static JQp PjT(Context context0) {
        if(JQp.PjT == null) {
            Class class0 = JQp.class;
            __monitor_enter(class0);
            try {
                if(JQp.PjT == null) {
                    JQp.PjT = new JQp(context0);
                }
                __monitor_exit(class0);
                return JQp.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return JQp.PjT;
    }

    private void PjT(AdSlot adSlot0, com.bytedance.sdk.openadsdk.core.model.PjT pjT0, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0, PAGInterstitialAd pAGInterstitialAd0, boolean z) {
        if(pAGInterstitialAdLoadListener0 != null) {
            pAGInterstitialAdLoadListener0.onAdLoaded(pAGInterstitialAd0);
        }
        int v = JQp.Zh();
        if(z) {
            if(v == 2) {
                this.Zh(adSlot0);
                return;
            }
            if(v == 1) {
                cr.PjT(this.Zh).PjT(adSlot0.getCodeId(), null);
            }
        }
        else if(v == 2) {
            cr.PjT(this.Zh).PjT(adSlot0, pjT0);
            this.Zh(adSlot0);
        }
    }

    private void PjT(AdSlot adSlot0, boolean z, Co co0, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0) {
        long v = System.currentTimeMillis();
        tT tT0 = new tT();
        tT0.ReZ = z ? 2 : 1;
        if(ub.cr().xf(adSlot0.getCodeId()) || adSlot0.getExpressViewAcceptedWidth() > 0.0f || adSlot0.isExpressAd()) {
            tT0.Au = 2;
        }
        ub.ReZ().PjT(adSlot0, tT0, 8, new com.bytedance.sdk.openadsdk.core.ltE.PjT() {
            final JQp cz;

            @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
            public void PjT(int v, String s) {
                if(!z) {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0 = pAGInterstitialAdLoadListener0;
                    if(pAGInterstitialAdLoadListener0 != null) {
                        pAGInterstitialAdLoadListener0.onError(v, s);
                    }
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
            public void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0, com.bytedance.sdk.openadsdk.core.model.ReZ reZ0) {
                if(pjT0.cr() != null && !pjT0.cr().isEmpty()) {
                    fDm fDm0 = new fDm(JQp.this.Zh, pjT0);
                    if(!z) {
                        if(!TextUtils.isEmpty(adSlot0.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.Owx.PjT.cr.PjT().PjT((pjT0.cr().isEmpty() ? null : ((Owx)pjT0.cr().get(0))));
                            com.bytedance.sdk.openadsdk.qla.ReZ.PjT(pjT0.cz(), System.currentTimeMillis() - v);
                        }
                        if(!pjT0.XX() && pAGInterstitialAdLoadListener0 != null && ub.cr().gK() == 0) {
                            JQp.this.PjT(adSlot0, pjT0, pAGInterstitialAdLoadListener0, fDm0.PjT(), false);
                        }
                    }
                    com.bytedance.sdk.openadsdk.xs.PjT.PjT().PjT(pjT0.cz());
                    com.bytedance.sdk.openadsdk.component.reward.JQp.Zh jQp$Zh0 = new com.bytedance.sdk.openadsdk.component.reward.JQp.Zh(new PjT(JQp.this.Zh, adSlot0, pjT0, pAGInterstitialAdLoadListener0, false), pjT0, null);
                    for(int v = 0; v < pjT0.cr().size(); ++v) {
                        Object object0 = pjT0.cr().get(v);
                        boolean z = pjT0.XX();
                        JQp.this.PjT(pjT0, ((Owx)object0), fDm0, adSlot0, z, co0, jQp$Zh0, z);
                        if(pjT0.xf()) {
                            break;
                        }
                    }
                    return;
                }
                if(!z) {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0 = pAGInterstitialAdLoadListener0;
                    if(pAGInterstitialAdLoadListener0 != null) {
                        pAGInterstitialAdLoadListener0.onError(-3, "");
                        reZ0.PjT(-3);
                        com.bytedance.sdk.openadsdk.core.model.ReZ.PjT(reZ0);
                    }
                }
            }
        });
    }

    private void PjT(ReZ jQp$ReZ0) {
        if(jQp$ReZ0 == null) {
            return;
        }
        if(this.cr.size() > 0) {
            this.cr.remove(0);
        }
        this.cr.add(jQp$ReZ0);
    }

    private void PjT(Owx owx0, AdSlot adSlot0, com.bytedance.sdk.openadsdk.component.reward.JQp.Zh jQp$Zh0, Co co0, fDm fDm0, boolean z) {
        int v = 1;
        int v1 = 0;
        if(jQp$Zh0 == null || !z && ub.cr().gK() != 1) {
            v = 0;
        }
        if(cRA.ReZ(owx0) || !Owx.JQp(owx0) || Build.VERSION.SDK_INT < 23) {
            v1 = v;
        }
        else {
            owx0.MWx();
            Zh zh0 = Owx.PjT(CacheDirFactory.getICacheDir(owx0.hx()).PjT(), owx0);
            zh0.PjT("material_meta", owx0);
            zh0.PjT("ad_slot", adSlot0);
            com.bytedance.sdk.openadsdk.core.xf.JQp.PjT.PjT(zh0, new b() {
                final JQp cr;

                @Override  // t.a$a
                public void PjT(v.b b0, int v) {
                    if(jQp$Zh0 != null && (z || ub.cr().gK() == 1)) {
                        jQp$Zh0.PjT(fDm0.PjT());
                    }
                }

                @Override  // t.a$a
                public void PjT(v.b b0, int v, String s) {
                    if(jQp$Zh0 != null && (z || ub.cr().gK() == 1)) {
                        jQp$Zh0.onError(v, s);
                    }
                }
            });
        }
        if(v1 != 0) {
            jQp$Zh0.onAdLoaded(fDm0.PjT());
        }
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0, Owx owx0, fDm fDm0, AdSlot adSlot0, boolean z, Co co0, com.bytedance.sdk.openadsdk.component.reward.JQp.Zh jQp$Zh0, boolean z1) {
        int v = 0;
        com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(owx0, new com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT() {
            final JQp PjT;

        });
        int v1 = 1;
        if(z && !cRA.ReZ(owx0) && Owx.JQp(owx0) && ub.cr().iZZ(adSlot0.getCodeId()).cr == 1 && !ltE.cr(this.Zh)) {
            this.PjT(new ReZ(owx0, adSlot0, pjT0));
            return;
        }
        if(jQp$Zh0 == null || !z1 && ub.cr().gK() != 1) {
            v1 = 0;
        }
        if(cRA.ReZ(owx0)) {
            if(z) {
                cr.PjT(this.Zh).PjT(adSlot0, pjT0);
            }
            v = v1;
        }
        else if(!Owx.JQp(owx0)) {
            if(z) {
                cr.PjT(this.Zh).PjT(adSlot0, pjT0);
            }
            v = v1;
        }
        else if(Build.VERSION.SDK_INT < 23) {
            cr.PjT(this.Zh).PjT(owx0, new com.bytedance.sdk.openadsdk.common.PjT.PjT() {
                final JQp XX;

                @Override  // com.bytedance.sdk.openadsdk.common.PjT$PjT
                public void PjT(boolean z, Object object0) {
                    if(z) {
                        fDm0.Zh();
                    }
                    if(z) {
                        if(z) {
                            cr.PjT(JQp.this.Zh).PjT(adSlot0, pjT0);
                        }
                    }
                    else if(z) {
                        if(jQp$Zh0 != null && (z1 || ub.cr().gK() == 1)) {
                            jQp$Zh0.PjT(fDm0.PjT());
                        }
                    }
                    else if(jQp$Zh0 != null && (z1 || ub.cr().gK() == 1)) {
                        jQp$Zh0.onError(-1, "");
                    }
                }
            });
        }
        else if(owx0.MWx() != null) {
            Zh zh0 = Owx.PjT(CacheDirFactory.getICacheDir(owx0.hx()).PjT(), owx0);
            zh0.PjT("material_meta", owx0);
            zh0.PjT("ad_slot", adSlot0);
            com.bytedance.sdk.openadsdk.core.xf.JQp.PjT.PjT(zh0, new b() {
                final JQp XX;

                @Override  // t.a$a
                public void PjT(v.b b0, int v) {
                    fDm0.Zh();
                    if(z) {
                        cr.PjT(JQp.this.Zh).PjT(adSlot0, pjT0);
                        return;
                    }
                    if(jQp$Zh0 != null && (z1 || ub.cr().gK() == 1)) {
                        jQp$Zh0.PjT(fDm0.PjT());
                    }
                }

                @Override  // t.a$a
                public void PjT(v.b b0, int v, String s) {
                    if(jQp$Zh0 != null && (z1 || ub.cr().gK() == 1)) {
                        jQp$Zh0.onError(v, s);
                    }
                }
            });
        }
        else {
            v = v1;
        }
        if(v != 0) {
            jQp$Zh0.onAdLoaded(fDm0.PjT());
        }
    }

    public void PjT() {
        try {
            cr.PjT(this.Zh).PjT();
        }
        catch(Throwable unused_ex) {
        }
    }

    public void PjT(AdSlot adSlot0) {
        if(adSlot0 == null || TextUtils.isEmpty(adSlot0.getCodeId()) || !TextUtils.isEmpty(adSlot0.getBidAdm()) || cr.PjT(this.Zh).PjT(adSlot0.getCodeId(), false) != null) {
            return;
        }
        this.PjT(adSlot0, true, Co.Zh(), null);
    }

    public void PjT(AdSlot adSlot0, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0) {
        this.Zh(adSlot0, pAGInterstitialAdLoadListener0);
    }

    public void PjT(String s, Owx owx0) {
        cr.PjT(this.Zh).PjT(s, owx0);
    }

    private void ReZ() {
        if(this.ReZ.get()) {
            return;
        }
        this.ReZ.set(true);
        iZZ.PjT(this.cz, this.Zh);
    }

    public static int Zh() {
        return com.bytedance.sdk.openadsdk.RD.PjT.PjT("ivrv_load_ad_cache_strategy", 0);
    }

    private void Zh(AdSlot adSlot0) {
        if(JQp.Zh() != 2) {
            return;
        }
        cr.PjT(this.Zh).PjT(adSlot0.getCodeId());
    }

    private void Zh(AdSlot adSlot0, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0) {
        Co co0 = Co.Zh();
        if(TextUtils.isEmpty(adSlot0.getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.model.PjT pjT0 = cr.PjT(this.Zh).PjT(adSlot0.getCodeId(), true);
            if(pjT0 != null && pjT0.JQp()) {
                Owx owx0 = pjT0.cz();
                for(Object object0: pjT0.cr()) {
                    Owx owx1 = (Owx)object0;
                    if(owx1.ig() == null) {
                        owx1.PjT(adSlot0);
                    }
                }
                fDm fDm0 = new fDm(this.Zh, pjT0);
                if(!pjT0.XX() && !cRA.ReZ(owx0)) {
                    fDm0.Zh();
                }
                if(pAGInterstitialAdLoadListener0 != null) {
                    if(!pjT0.XX() && ub.cr().gK() == 0) {
                        this.PjT(adSlot0, pjT0, pAGInterstitialAdLoadListener0, fDm0.PjT(), true);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.JQp.Zh jQp$Zh0 = new com.bytedance.sdk.openadsdk.component.reward.JQp.Zh(new PjT(this.Zh, adSlot0, pjT0, pAGInterstitialAdLoadListener0, true), pjT0, null);
                    for(int v1 = 0; v1 < pjT0.cr().size(); ++v1) {
                        this.PjT(((Owx)pjT0.cr().get(v1)), adSlot0, jQp$Zh0, co0, fDm0, pjT0.XX());
                        if(pjT0.xf()) {
                            break;
                        }
                    }
                }
                for(int v = 0; v < pjT0.cr().size(); ++v) {
                    Owx owx2 = (Owx)pjT0.cr().get(v);
                    com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(owx2, new com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT() {
                        final JQp PjT;

                    });
                }
                return;
            }
        }
        this.PjT(adSlot0, false, co0, pAGInterstitialAdLoadListener0);
    }

    private void cr() {
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
        this.cr();
    }
}

