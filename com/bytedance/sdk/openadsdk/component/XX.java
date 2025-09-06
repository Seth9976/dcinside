package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.KM.PjT;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.JQp.Zh;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.ltE;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.iZZ;
import com.bytedance.sdk.openadsdk.core.model.tT;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.Co;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.util.concurrent.atomic.AtomicBoolean;

public class XX implements PjT {
    private int Au;
    private final iZZ DWo;
    private int JQp;
    private final Context PjT;
    private final cz ReZ;
    private volatile int SM;
    private PAGAppOpenAdLoadListener XX;
    private final ltE Zh;
    private final AtomicBoolean cr;
    private AdSlot cz;
    private boolean qj;

    public XX(Context context0) {
        this.cr = new AtomicBoolean(false);
        this.JQp = 0;
        this.SM = 0;
        this.DWo = new iZZ();
        this.PjT = context0 == null ? ub.PjT() : context0.getApplicationContext();
        this.Zh = ub.ReZ();
        this.ReZ = cz.PjT(this.PjT);
    }

    public static XX PjT(Context context0) {
        return new XX(context0);
    }

    private void PjT() {
        Jo.Zh(new Au("tryGetAppOpenAdFromCache") {
            final XX PjT;

            @Override
            public void run() {
                Owx owx0 = XX.this.ReZ.JQp(XX.this.JQp);
                if(owx0 != null) {
                    if(owx0.ig() == null) {
                        owx0.PjT(XX.this.cz);
                    }
                    boolean z = Owx.JQp(owx0);
                    if(owx0.Pv()) {
                        Zh zh0 = new Zh(1, 101, owx0, null);
                        XX.this.PjT(zh0);
                        return;
                    }
                    if(!z && ub.cr().DWo() == 1) {
                        Zh zh1 = new Zh(1, 101, owx0, null);
                        XX.this.PjT(zh1);
                        return;
                    }
                    if(z) {
                        switch(ub.cr().qj()) {
                            case 2: 
                            case 3: {
                                Zh zh2 = new Zh(1, 101, owx0, null);
                                XX.this.PjT(zh2);
                                return;
                            }
                        }
                    }
                    if(!XX.this.ReZ.Zh(XX.this.JQp) && !XX.this.ReZ.cr(XX.this.JQp)) {
                        XX.this.PjT(true);
                        return;
                    }
                    if(xs.Gr().cRA(XX.this.cz.getCodeId()) == 0) {
                        XX.this.ReZ.XX(XX.this.JQp);
                    }
                    if(z) {
                        if(TextUtils.isEmpty(XX.this.ReZ.PjT(owx0)) && Build.VERSION.SDK_INT >= 23) {
                            XX.this.PjT(false);
                            com.bytedance.sdk.openadsdk.component.cr.PjT.Zh(owx0);
                            return;
                        }
                        Zh zh3 = new Zh(1, 101, owx0, null);
                        XX.this.PjT(zh3);
                        return;
                    }
                    if(XX.this.ReZ.Zh(owx0)) {
                        Zh zh4 = new Zh(1, 101, owx0, null);
                        XX.this.PjT(zh4);
                        return;
                    }
                    XX.this.PjT(false);
                    com.bytedance.sdk.openadsdk.component.cr.PjT.Zh(owx0);
                    return;
                }
                XX.this.PjT(false);
            }
        });
    }

    private void PjT(Zh zh0) {
        int v = zh0.ReZ();
        int v1 = zh0.cr();
        if(this.cr.get()) {
            if(v == 1 && v1 == 100 && zh0.Zh()) {
                com.bytedance.sdk.openadsdk.component.JQp.PjT pjT0 = new com.bytedance.sdk.openadsdk.component.JQp.PjT(this.JQp, zh0.JQp(), zh0.PjT());
                cz.PjT(ub.PjT()).PjT(pjT0);
                if(!this.qj) {
                    com.bytedance.sdk.openadsdk.component.cr.PjT.PjT(zh0.JQp(), 1, this.DWo);
                }
            }
            return;
        }
        if(v == 1) {
            if(this.XX != null) {
                cr cr0 = new cr(this.PjT, zh0.JQp(), v1 == 101, this.cz);
                this.XX.onAdLoaded(cr0);
            }
            this.cr.set(true);
            if(v1 == 101) {
                com.bytedance.sdk.openadsdk.component.cr.PjT.PjT(zh0.JQp(), this.DWo.PjT().cr());
                return;
            }
            if(v1 == 100) {
                com.bytedance.sdk.openadsdk.component.cr.PjT.PjT(zh0.JQp(), 0, this.DWo);
                this.qj = true;
                if(!this.DWo.PjT && !Owx.cz(zh0.JQp())) {
                    Owx owx0 = zh0.JQp();
                    if(xs.Gr().cRA(this.cz.getCodeId()) == 0 && owx0 != null && !owx0.zq()) {
                        this.ReZ.PjT(this.cz);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.JQp.PjT pjT1 = new com.bytedance.sdk.openadsdk.component.JQp.PjT(this.JQp, zh0.JQp(), zh0.PjT());
                    this.ReZ.PjT(pjT1);
                }
            }
        }
        else if(v == 2 || v == 3) {
            PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener0 = this.XX;
            if(pAGAppOpenAdLoadListener0 != null) {
                pAGAppOpenAdLoadListener0.onError(zh0.cz(), zh0.XX());
            }
            this.cr.set(true);
            if(v == 3) {
                com.bytedance.sdk.openadsdk.component.cr.PjT.PjT(this.SM, this.Au);
            }
        }
    }

    private void PjT(@NonNull Owx owx0, AdSlot adSlot0, boolean z, com.bytedance.sdk.openadsdk.core.model.PjT pjT0) {
        com.bytedance.sdk.openadsdk.component.XX.3 xX$30 = new ReZ() {
            final XX cr;

            @Override  // com.bytedance.sdk.openadsdk.component.cz$ReZ
            public void PjT() {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: video load success");
                if(z) {
                    XX.this.SM = 4;
                    Zh zh0 = new Zh(1, 100, owx0, pjT0);
                    zh0.PjT(true);
                    XX.this.PjT(zh0);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.component.cz$ReZ
            public void PjT(int v, String s) {
                if(z) {
                    XX.this.SM = 5;
                    Zh zh0 = new Zh(2, 100, 10003, "resource error");
                    XX.this.PjT(zh0);
                }
            }
        };
        this.ReZ.PjT(owx0, adSlot0, this.DWo, xX$30);
    }

    private void PjT(@NonNull Owx owx0, boolean z, com.bytedance.sdk.openadsdk.core.model.PjT pjT0) {
        com.bytedance.sdk.openadsdk.component.XX.4 xX$40 = new com.bytedance.sdk.openadsdk.component.cz.Zh() {
            final XX cr;

            @Override  // com.bytedance.sdk.openadsdk.component.cz$Zh
            public void PjT() {
                Log.d("TTAppOpenAdLoadManager", "preLoadFail: image load fail");
                if(z) {
                    XX.this.SM = 5;
                    Zh zh0 = new Zh(2, 100, 10003, "resource error");
                    XX.this.PjT(zh0);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.component.cz$Zh
            public void PjT(com.bytedance.sdk.openadsdk.gK.PjT.Zh zh0) {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: image load success");
                if(z) {
                    XX.this.SM = 4;
                    Zh zh1 = new Zh(1, 100, owx0, pjT0);
                    zh1.PjT(true);
                    XX.this.PjT(zh1);
                }
            }
        };
        this.ReZ.PjT(owx0, this.DWo, xX$40);
    }

    private void PjT(boolean z) {
        if(z) {
            this.ReZ.XX(this.JQp);
        }
        if(xs.Gr().cRA(this.cz.getCodeId()) == 1) {
            this.Zh(this.cz);
        }
    }

    public int PjT(@NonNull AdSlot adSlot0) {
        try {
            return Integer.parseInt(adSlot0.getCodeId());
        }
        catch(Throwable unused_ex) {
            return 0;
        }
    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public void PjT(Message message0) {
        if(message0.what != 1 || this.cr.get()) {
            return;
        }
        this.PjT(new Zh(3, 102, 10002, "load time out"));
    }

    public void PjT(@NonNull AdSlot adSlot0, com.bytedance.sdk.openadsdk.common.cz cz0, int v) {
        if(cz0 == null) {
            return;
        }
        if(v <= 0) {
            v = 3500;
        }
        this.cz = adSlot0;
        this.DWo.PjT = !TextUtils.isEmpty(adSlot0.getBidAdm());
        if(cz0 instanceof PAGAppOpenAdLoadListener) {
            this.XX = (PAGAppOpenAdLoadListener)cz0;
        }
        this.JQp = this.PjT(this.cz);
        this.Au = v;
        Co co0 = Co.Zh();
        this.DWo.PjT(co0);
        if(this.DWo.PjT || xs.Gr().cRA(this.cz.getCodeId()) == 0) {
            this.Zh(this.cz);
        }
        if(!this.DWo.PjT) {
            new KM(fDm.Zh().getLooper(), this).sendEmptyMessageDelayed(1, ((long)v));
            this.PjT();
        }
    }

    private void Zh(@NonNull AdSlot adSlot0) {
        Co co0 = Co.Zh();
        this.SM = 1;
        tT tT0 = new tT();
        tT0.DWo = this.DWo;
        tT0.cr = 1;
        tT0.Au = 2;
        com.bytedance.sdk.openadsdk.component.XX.1 xX$10 = new com.bytedance.sdk.openadsdk.core.ltE.PjT() {
            final XX ReZ;

            @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
            public void PjT(int v, String s) {
                XX.this.SM = 3;
                Zh zh0 = new Zh(2, 100, v, s);
                XX.this.PjT(zh0);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
            public void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0, com.bytedance.sdk.openadsdk.core.model.ReZ reZ0) {
                XX.this.SM = 2;
                if(pjT0 != null && pjT0.cr() != null && pjT0.cr().size() != 0) {
                    Owx owx0 = (Owx)pjT0.cr().get(0);
                    long v = owx0.ltE();
                    XX.this.DWo.Zh = v;
                    boolean z = Owx.cz(owx0);
                    if(owx0.Pv()) {
                        Zh zh0 = new Zh(1, 100, owx0, pjT0);
                        XX.this.PjT(zh0);
                        return;
                    }
                    if(!z && !owx0.zq()) {
                        if(Owx.JQp(owx0)) {
                            switch(ub.cr().qj()) {
                                case 1: 
                                case 3: {
                                    XX.this.DWo.Zh = -1L;
                                    XX.this.DWo.PjT(3);
                                    Zh zh1 = new Zh(1, 100, owx0, pjT0);
                                    XX.this.PjT(zh1);
                                    XX.this.PjT(owx0, adSlot0, false, pjT0);
                                    return;
                                }
                                default: {
                                    XX.this.PjT(owx0, adSlot0, !XX.this.DWo.PjT, pjT0);
                                    break;
                                }
                            }
                        }
                        else {
                            if(ub.cr().DWo() == 1) {
                                XX.this.DWo.Zh = -1L;
                                XX.this.DWo.PjT(3);
                                Zh zh2 = new Zh(1, 100, owx0, pjT0);
                                XX.this.PjT(zh2);
                                XX.this.PjT(owx0, false, pjT0);
                                return;
                            }
                            XX.this.PjT(owx0, !XX.this.DWo.PjT, pjT0);
                        }
                        if(XX.this.DWo.PjT) {
                            com.bytedance.sdk.openadsdk.qla.ReZ.PjT(owx0, co0.cr());
                            if(v == 0L) {
                                XX.this.DWo.PjT(2);
                                Zh zh3 = new Zh(1, 100, owx0, pjT0);
                                XX.this.PjT(zh3);
                                return;
                            }
                            fDm.Zh().postDelayed(new Runnable() {
                                final com.bytedance.sdk.openadsdk.component.XX.1 ReZ;

                                @Override
                                public void run() {
                                    XX.this.DWo.PjT(2);
                                    Zh zh0 = new Zh(1, 100, owx0, pjT0);
                                    XX.this.PjT(zh0);
                                }
                            }, v);
                        }
                        return;
                    }
                    Zh zh4 = new Zh(1, 100, owx0, pjT0);
                    XX.this.PjT(zh4);
                    if(Owx.JQp(owx0)) {
                        XX.this.PjT(owx0, adSlot0, false, pjT0);
                        return;
                    }
                    XX.this.PjT(owx0, false, pjT0);
                    return;
                }
                XX.this.SM = 3;
                Zh zh5 = new Zh(2, 100, 20001, "");
                XX.this.PjT(zh5);
                reZ0.PjT(-3);
                com.bytedance.sdk.openadsdk.core.model.ReZ.PjT(reZ0);
            }
        };
        this.Zh.PjT(adSlot0, tT0, 3, xX$10);
    }
}

