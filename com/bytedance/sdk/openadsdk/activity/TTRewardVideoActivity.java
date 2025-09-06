package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.Lrd.Zh.JQp;
import com.bytedance.sdk.openadsdk.PjT.JQp.PjT;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.qj;
import com.bytedance.sdk.openadsdk.core.Lrd;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.qj.cr;
import com.bytedance.sdk.openadsdk.core.tT;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.cr.XX;
import com.bytedance.sdk.openadsdk.multipro.Zh;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.fDm;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.bytedance.sdk.openadsdk.utils.xs;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import x.b.a;

public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private boolean Lrd;
    private String Owx;
    private static PjT RD;
    private final AtomicBoolean Sks;
    private static String fDm;
    private static String gK;
    private String ltE;
    protected int qj;
    private static String qla;
    private int tT;
    private static String ub;
    private static String xE;
    protected int xf;
    protected PjT xs;

    public TTRewardVideoActivity() {
        this.Sks = new AtomicBoolean(false);
        this.tT = -1;
    }

    private void Lrd() {
        if(!this.Au) {
            this.Au = true;
            RD.PjT("BVA", "invoke callback onAdClose, " + this);
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.Zh;
            if(pjT0 != null) {
                qj qj0 = pjT0.uQg;
                if(qj0 != null) {
                    qj0.cr();
                }
            }
            if(Zh.ReZ()) {
                this.PjT("onAdClose");
                return;
            }
            PjT pjT1 = this.xs;
            if(pjT1 != null) {
                pjT1.Zh();
            }
        }
    }

    protected void Owx() {
        this.ReZ(0);
    }

    private void PjT(String s, boolean z, int v, String s1, int v1, String s2) {
        Jo.ReZ(new Au("Reward_executeMultiProcessCallback") {
            final TTRewardVideoActivity XX;

            @Override
            public void run() {
                try {
                    TTRewardVideoActivity.this.Zh(0).executeRewardVideoCallback(TTRewardVideoActivity.this.Zh.tY, s, z, v, s1, v1, s2);
                }
                catch(Throwable throwable0) {
                    RD.Zh("TTAD.RVA", new Object[]{"rewarded_video", "executeRewardVideoCallback execute throw Exception : ", throwable0});
                }
            }
        }, 5);
    }

    private void PjT(boolean z, int v, String s, int v1, String s1, int v2) {
        RD.PjT("BVA", "invoke callback onRewardVerify: " + z + ", " + v + ", " + s + ", " + v1 + ", " + s1 + "; " + this);
        if(Zh.ReZ()) {
            this.PjT("onRewardVerify", z, v, s, v1, s1);
            qj.PjT(this.Zh.Zh, z, v2);
            return;
        }
        Jo.PjT(new Runnable() {
            final TTRewardVideoActivity XX;

            @Override
            public void run() {
                PjT pjT0 = TTRewardVideoActivity.this.xs;
                if(pjT0 != null) {
                    pjT0.PjT(z, v, s, v1, s1);
                    qj.PjT(TTRewardVideoActivity.this.Zh.Zh, z, v2);
                }
            }
        });
    }

    private void PjT(boolean z, boolean z1) {
        if(!z1 && this.Lrd && this.Zh.DWo.get()) {
            if(cRA.Au(this.Zh.Zh)) {
                this.Zh.Jo.Au();
                return;
            }
            if(cRA.DWo(this.Zh.Zh)) {
                this.Zh.cRA.ub();
                return;
            }
        }
        if(!ub.cr().Au(String.valueOf(this.Zh.cz))) {
            if(!z1 && this.Zh.DWo.get()) {
                if(cRA.Au(this.Zh.Zh)) {
                    this.Zh.Jo.Au();
                    return;
                }
                if(cRA.DWo(this.Zh.Zh)) {
                    this.Zh.cRA.ub();
                    return;
                }
            }
            if(z) {
                this.finish();
                return;
            }
            this.RD();
            return;
        }
        if(this.Sks.get()) {
            if(this.Zh.DWo.get()) {
                if(cRA.Au(this.Zh.Zh)) {
                    this.Zh.Jo.Au();
                    return;
                }
                if(cRA.DWo(this.Zh.Zh)) {
                    this.Zh.cRA.ub();
                    return;
                }
            }
            if(z) {
                this.finish();
                return;
            }
            this.RD();
            return;
        }
        if(cRA.Au(this.Zh.Zh) && this.Zh.Jo.qj().getVisibility() == 0) {
            this.Zh.Jo.Au();
            return;
        }
        if(cRA.DWo(this.Zh.Zh) && this.Zh.Jo.DWo().getVisibility() == 0) {
            this.Zh.cRA.ub();
            return;
        }
        this.Zh.Owx.set(true);
        this.Zh.tT.xE();
        if(z) {
            this.Zh.cRA.fDm();
        }
        com.bytedance.sdk.openadsdk.core.widget.Zh zh0 = new com.bytedance.sdk.openadsdk.core.widget.Zh(this);
        this.ReZ.xs = zh0;
        if(z) {
            zh0.PjT(TTRewardVideoActivity.qla).Zh(TTRewardVideoActivity.gK).ReZ(TTRewardVideoActivity.xE);
        }
        else {
            zh0.PjT(TTRewardVideoActivity.fDm).Zh(TTRewardVideoActivity.ub).ReZ(TTRewardVideoActivity.xE);
        }
        this.ReZ.xs.PjT(new com.bytedance.sdk.openadsdk.core.widget.Zh.PjT() {
            final TTRewardVideoActivity ReZ;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.Zh$PjT
            public void PjT() {
                TTRewardVideoActivity.this.Zh.tT.qla();
                if(z) {
                    TTRewardVideoActivity.this.Zh.cRA.JQp(1000);
                }
                zh0.dismiss();
                TTRewardVideoActivity.this.Zh.Owx.set(false);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.Zh$PjT
            public void Zh() {
                zh0.dismiss();
                TTRewardVideoActivity.this.Lrd = true;
                TTRewardVideoActivity.this.Zh.Owx.set(false);
                TTRewardVideoActivity.this.Zh.cRA.cz(0x7FFFFFFF);
                if(z) {
                    if(cRA.gK(TTRewardVideoActivity.this.Zh.Zh)) {
                        if(cRA.Au(TTRewardVideoActivity.this.Zh.Zh)) {
                            if(TTRewardVideoActivity.this.Zh.cRA.PjT()) {
                                TTRewardVideoActivity.this.Zh.cRA.PjT(5);
                                return;
                            }
                            TTRewardVideoActivity.this.Zh.Jo.Au();
                            return;
                        }
                        TTRewardVideoActivity.this.Zh.Yo.cz();
                        if(TTRewardVideoActivity.this.Zh.cRA.PjT()) {
                            TTRewardVideoActivity.this.Zh.cRA.PjT(4);
                        }
                        TTRewardVideoActivity.this.finish();
                        return;
                    }
                    if(cRA.cz(TTRewardVideoActivity.this.Zh.Zh)) {
                        if(cRA.DWo(TTRewardVideoActivity.this.Zh.Zh)) {
                            TTRewardVideoActivity.this.Zh.cRA.ub();
                            return;
                        }
                        TTRewardVideoActivity.this.Zh.Yo.cz();
                        TTRewardVideoActivity.this.finish();
                        return;
                    }
                }
                TTRewardVideoActivity.this.RD();
            }
        }).show();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void PjT() {
        super.PjT();
        if(!this.Sks.get()) {
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.Zh;
            if(pjT0 != null) {
                pjT0.uQg = new qj(new com.bytedance.sdk.openadsdk.component.reward.qj.PjT() {
                    final TTRewardVideoActivity PjT;

                    @Override  // com.bytedance.sdk.openadsdk.component.reward.qj$PjT
                    public void PjT() {
                        if(!TTRewardVideoActivity.this.Sks.get() && !TTRewardVideoActivity.this.Lrd) {
                            TTRewardVideoActivity.this.ReZ(1);
                        }
                    }
                });
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void PjT(int v) {
        if(v == 10000) {
            this.Owx();
        }
    }

    protected void PjT(long v, long v1) {
        if(v1 <= 0L) {
            return;
        }
        if(this.tT == -1) {
            this.tT = Math.min(100, this.Zh.Zh.Yo());
        }
        if(((float)v) / 1000.0f / ((float)v1) * 100.0f >= ((float)this.tT)) {
            this.Owx();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void PjT(@NonNull Intent intent0) {
        super.PjT(intent0);
        this.ltE = intent0.getStringExtra("media_extra");
        this.Owx = intent0.getStringExtra("user_id");
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void PjT(Bundle bundle0) {
        if(!Zh.ReZ()) {
            this.xs = Lrd.PjT().ReZ();
        }
        if(this.xs == null && bundle0 != null) {
            this.xs = TTRewardVideoActivity.RD;
            TTRewardVideoActivity.RD = null;
        }
    }

    protected void PjT(String s) {
        this.PjT(s, false, 0, "", 0, "");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void PjT(String s, JSONObject jSONObject0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void PjT(boolean z) {
        if(z) {
            this.Owx();
            return;
        }
        int v = ub.cr().iZZ(String.valueOf(this.Zh.cz)).cz;
        double f = this.Zh.tT.KM();
        if((1.0 - ((double)this.cz) / f) * 100.0 >= ((double)v)) {
            this.Owx();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public boolean PjT(long v, boolean z) {
        XX xX0 = new XX();
        xX0.PjT(System.currentTimeMillis(), 1.0f);
        this.Zh.tT.PjT(this.Zh.Zd.cz(), xX0);
        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7 tTRewardVideoActivity$70 = new a() {
            boolean PjT;
            final TTRewardVideoActivity Zh;

            @Override  // x.b$a
            public void PjT() {
                TTRewardVideoActivity.this.cr.removeMessages(300);
                TTRewardVideoActivity.this.xE();
                TTRewardVideoActivity.this.Owx();
                TTRewardVideoActivity tTRewardVideoActivity0 = TTRewardVideoActivity.this;
                if(tTRewardVideoActivity0.Zh.ReZ) {
                    tTRewardVideoActivity0.PjT(false, true, 6);
                }
                else {
                    tTRewardVideoActivity0.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.PjT.ub ub0 = TTRewardVideoActivity.this.Zh.tT;
                ub0.PjT(!ub0.Yo(), true ^ TTRewardVideoActivity.this.Zh.tT.Yo());
                TTRewardVideoActivity.this.Zh.tT.fDm();
            }

            @Override  // x.b$a
            public void PjT(long v, int v1) {
                if(this.PjT) {
                    return;
                }
                this.PjT = true;
                TTRewardVideoActivity.this.cr.removeMessages(300);
                TTRewardVideoActivity.this.xE();
                TTRewardVideoActivity.this.Owx();
                TTRewardVideoActivity.this.Zh.tT.PjT(v, v);
                TTRewardVideoActivity.this.Zh.ltE.set(true);
                if(TTRewardVideoActivity.this.Zh.Zh.RD() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = TTRewardVideoActivity.this.Zh;
                    if(pjT0.ReZ) {
                        pjT0.Lrd.ReZ().cr();
                        fDm.Zh();
                    }
                }
                if(TTRewardVideoActivity.this.Zh.Zh.KH()) {
                    TTRewardVideoActivity.this.Zh.Zh.ig(1);
                    TTRewardVideoActivity.this.Zh.Zd.ub();
                }
                if(TTRewardVideoActivity.this.Zh.Zh.RD() == 21 && !TTRewardVideoActivity.this.Zh.Zh.Au()) {
                    TTRewardVideoActivity.this.Zh.Zh.Zh(true);
                    TTRewardVideoActivity.this.Zh.Zd.ub();
                }
                TTRewardVideoActivity.this.xf = (int)(System.currentTimeMillis() / 1000L);
                if(!gK.cr(TTRewardVideoActivity.this.Zh.Zh) && !gK.Zh(TTRewardVideoActivity.this.Zh.Zh) && !gK.JQp(TTRewardVideoActivity.this.Zh.Zh)) {
                    if(gK.PjT(TTRewardVideoActivity.this.Zh.Zh) && !TTRewardVideoActivity.this.Zh.xE.get()) {
                        TTRewardVideoActivity.this.Zh.PjT(true);
                        TTRewardVideoActivity.this.Zh.wN.JQp(true);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = TTRewardVideoActivity.this.Zh;
                    if(pjT1.ReZ) {
                        if(pjT1.Zh.Ik()) {
                            TTRewardVideoActivity.this.Zh.wN.ReZ();
                            return;
                        }
                        TTRewardVideoActivity.this.PjT(false, 5);
                        if(!Owx.JQp(TTRewardVideoActivity.this.Zh.Zh)) {
                            TTRewardVideoActivity.this.Zh.tT.PjT("skip", true);
                            return;
                        }
                    }
                    else {
                        if(pjT1.Zh.Ik()) {
                            TTRewardVideoActivity.this.Zh.wN.ReZ();
                            return;
                        }
                        if(!Owx.JQp(TTRewardVideoActivity.this.Zh.Zh)) {
                            TTRewardVideoActivity.this.Zh.tT.PjT("skip", true);
                        }
                        TTRewardVideoActivity.this.finish();
                    }
                    return;
                }
                TTRewardVideoActivity.this.PjT(false, 5);
                if(gK.Zh(TTRewardVideoActivity.this.Zh.Zh)) {
                    xs xs0 = TTRewardVideoActivity.this.Zh.Xtz;
                    if(xs0 != null) {
                        xs0.PjT(0L);
                    }
                }
            }

            @Override  // x.b$a
            public void PjT(long v, long v1) {
                int v3;
                com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = TTRewardVideoActivity.this.Zh;
                if(!pjT0.dwk && pjT0.tT.Zh()) {
                    TTRewardVideoActivity.this.Zh.tT.xE();
                }
                if(TTRewardVideoActivity.this.Zh.DWo.get()) {
                    return;
                }
                TTRewardVideoActivity.this.cr.removeMessages(300);
                if(v != TTRewardVideoActivity.this.Zh.tT.Au()) {
                    TTRewardVideoActivity.this.xE();
                }
                TTRewardVideoActivity.this.Zh.tT.PjT(v, v1);
                TTRewardVideoActivity.this.cz = (int)(TTRewardVideoActivity.this.Zh.tT.KM() - ((double)(v / 1000L)));
                TTRewardVideoActivity tTRewardVideoActivity0 = TTRewardVideoActivity.this;
                int v2 = tTRewardVideoActivity0.cz;
                if(v2 >= 0) {
                    tTRewardVideoActivity0.Zh.wN.PjT(String.valueOf(v2), null);
                }
                TTRewardVideoActivity.this.cz = (int)(TTRewardVideoActivity.this.Zh.tT.KM() - ((double)(v / 1000L)));
                com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = TTRewardVideoActivity.this.Zh;
                if(pjT1 == null || (pjT1.Zh == null || pjT1.Zh.Zh() < 0)) {
                    v3 = TTRewardVideoActivity.this.Zh == null ? 30 : ub.cr().DWo(String.valueOf(TTRewardVideoActivity.this.Zh.cz));
                }
                else {
                    v3 = TTRewardVideoActivity.this.Zh.Zh.Zh();
                }
                if((TTRewardVideoActivity.this.Zh.Owx.get() || TTRewardVideoActivity.this.Zh.qj.get()) && TTRewardVideoActivity.this.Zh.tT.Zh()) {
                    TTRewardVideoActivity.this.Zh.tT.xE();
                }
                TTRewardVideoActivity.this.Zh.Zd.cr(((int)(v / 1000L)));
                TTRewardVideoActivity.this.Zh(v, v1);
                TTRewardVideoActivity tTRewardVideoActivity1 = TTRewardVideoActivity.this;
                if(tTRewardVideoActivity1.cz > 0) {
                    tTRewardVideoActivity1.Zh.wN.cr(true);
                    if(v3 >= 0 && ((int)(v / 1000L)) >= v3) {
                        TTRewardVideoActivity.this.Zh.PjT(true);
                        TTRewardVideoActivity.this.Zh.wN.PjT(String.valueOf(TTRewardVideoActivity.this.cz), TTAdDislikeToast.getSkipText());
                        TTRewardVideoActivity.this.Zh.wN.JQp(true);
                        return;
                    }
                    TTRewardVideoActivity.this.Zh.wN.PjT(String.valueOf(TTRewardVideoActivity.this.cz), null);
                }
            }

            @Override  // x.b$a
            public void Zh(long v, int v1) {
                TTRewardVideoActivity.this.cr.removeMessages(300);
                gK gK0 = TTRewardVideoActivity.this.Zh.Zd.qla;
                if(gK0 != null) {
                    gK0.DWo();
                }
                if(TTRewardVideoActivity.this.Zh.tT.Zh()) {
                    TTRewardVideoActivity.this.qla();
                    return;
                }
                TTRewardVideoActivity.this.Zh.tT.fDm();
                TTRewardVideoActivity.this.Owx();
                TTRewardVideoActivity tTRewardVideoActivity0 = TTRewardVideoActivity.this;
                if(tTRewardVideoActivity0.Zh.ReZ) {
                    tTRewardVideoActivity0.PjT(false, true, 3);
                }
                else {
                    tTRewardVideoActivity0.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.PjT.ub ub0 = TTRewardVideoActivity.this.Zh.tT;
                ub0.PjT(!ub0.Yo(), 2);
            }
        };
        this.Zh.tT.PjT(tTRewardVideoActivity$70);
        gK gK0 = this.Zh.Zd.qla;
        if(gK0 != null) {
            gK0.PjT(tTRewardVideoActivity$70);
        }
        boolean z1 = this.Zh.tT.PjT(v, z, null, this.ReZ);
        if(z1 && !z) {
            this.qj = (int)(System.currentTimeMillis() / 1000L);
        }
        return z1;
    }

    private void RD() {
        com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
        qla$PjT0.PjT(this.Zh.tT.XX());
        qla$PjT0.ReZ(this.Zh.tT.Owx());
        qla$PjT0.Zh(this.Zh.tT.qj());
        qla$PjT0.ReZ(3);
        qla$PjT0.cr(this.Zh.tT.ltE());
        com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(this.Zh.tT.ReZ(), qla$PjT0, this.Zh.tT.PjT());
        tT.ReZ(this.Zh.cz);
        this.Zh.tT.PjT("skip", false);
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.Zh;
        if(pjT0.ReZ) {
            if(gK.ReZ(pjT0.Zh)) {
                com.bytedance.sdk.openadsdk.component.reward.view.Zh zh0 = this.Zh.yIW.PjT();
                if(zh0 == null || zh0.cr != 0) {
                    this.PjT(true, 4);
                }
                else {
                    this.finish();
                }
            }
            else {
                this.PjT(true, 4);
            }
            if(gK.PjT(this.Zh.Zh) && !this.Zh.xE.get()) {
                this.finish();
            }
        }
        else {
            this.finish();
        }
        com.bytedance.sdk.openadsdk.core.qj.PjT pjT1 = this.Zh.Zh.QB();
        if(pjT1 != null) {
            cr cr0 = pjT1.PjT();
            long v = this.Zh.tT.XX();
            cr0.cz(v);
            cr0.JQp(v);
        }
        JQp.PjT(this.Zh.Zh, 5);
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void ReZ() {
        this.Zh.wN.PjT(null, TTAdDislikeToast.getSkipText());
        this.Zh.wN.JQp(true);
    }

    protected void ReZ(int v) {
        if(!this.Sks.get() && !this.Lrd) {
            this.Sks.set(true);
            qj qj0 = this.Zh.uQg;
            if(qj0 != null) {
                qj0.ReZ();
            }
            if(ub.cr().xE(String.valueOf(this.Zh.cz))) {
                this.PjT(true, this.Zh.Zh.yIW(), this.Zh.Zh.cRA(), 0, "", v);
                return;
            }
            JSONObject jSONObject0 = this.tT();
            ub.ReZ().PjT(jSONObject0, new com.bytedance.sdk.openadsdk.core.ltE.Zh() {
                final TTRewardVideoActivity Zh;

                @Override  // com.bytedance.sdk.openadsdk.core.ltE$Zh
                public void PjT(int v, String s) {
                    TTRewardVideoActivity.this.PjT(false, 0, "", v, s, v);
                }

                @Override  // com.bytedance.sdk.openadsdk.core.ltE$Zh
                public void PjT(com.bytedance.sdk.openadsdk.core.Owx.Zh owx$Zh0) {
                    TTRewardVideoActivity.this.PjT(owx$Zh0.Zh, owx$Zh0.ReZ.PjT(), owx$Zh0.ReZ.Zh(), 0, "", v);
                }
            });
        }
    }

    // 检测为 Lambda 实现
    private void Sks() [...]

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void XX() {
        if(Zh.ReZ()) {
            this.PjT("onAdShow");
        }
        else {
            PjT pjT0 = this.xs;
            if(pjT0 != null) {
                pjT0.PjT();
            }
        }
        if(this.ltE()) {
            this.Zh.yIW.DWo();
        }
    }

    public void Zh(long v, long v1) {
        boolean z = false;
        if(this.Zh != null && (this.Zh.Zh != null && (this.Zh.Zh.Yo() >= 0 && this.Zh.Zh.Zh() >= 0))) {
            z = true;
            v1 = (long)this.Zh.Zh.Zh();
        }
        long v2 = v + ((long)this.Zh.MWx) * 1000L;
        if(z) {
            this.PjT(v2, v1);
            return;
        }
        if(this.tT == -1) {
            this.tT = ub.cr().iZZ(String.valueOf(this.Zh.cz)).cz;
        }
        if(v1 <= 0L) {
            return;
        }
        if(v1 >= 30000L && v2 >= 27000L) {
            this.Owx();
            return;
        }
        if(((float)(v2 * 100L)) / ((float)v1) >= ((float)this.tT)) {
            this.Owx();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void c_() {
        this.Sks();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void cr() {
        this.Sks();
        this.Zh.Zh.Xw();
        this.Zh.Zh.PjT(true);
        if(Owx.JQp(this.Zh.Zh)) {
            Owx owx0 = this.Zh.Zh;
            ReZ.Zh(owx0, this.Zh.JQp, owx0.Ebj());
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void fDm() {
        int v = ub.cr().iZZ(String.valueOf(this.Zh.cz)).cz;
        int v1 = 1;
        int v2 = 0;
        if(cRA.ltE(this.Zh.Zh)) {
            double f = this.Zh.tT.KM();
            if((1.0 - ((double)this.cz) / f) * 100.0 < ((double)v)) {
                v1 = 0;
            }
            v2 = v1;
        }
        else {
            int v3 = this.Zh.Zh.Gr();
            int v4 = (1.0f - this.Zh.cRA.Zh() / ((float)v3)) * 100.0f >= ((float)v) ? 1 : 0;
            int v5 = ub.cr().PjT(String.valueOf(this.Zh.cz));
            if(v5 == 0) {
                boolean z = this.Zh.Jo.xf().cz();
                if(this.Zh.cRA.ReZ()) {
                    z = true;
                }
                if(v4 == 0 || !z) {
                    v1 = 0;
                }
                v2 = v1;
            }
            else if(v5 == 1) {
                v2 = v4;
            }
        }
        if(v2 != 0) {
            this.Owx();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        TTRewardVideoActivity.RD = null;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void finish() {
        if(this.Zh != null) {
            com.bytedance.sdk.openadsdk.cz.Zh.PjT().PjT("videoForceBreak", this.Zh.Zh);
        }
        this.Lrd();
        super.finish();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean gK() {
        return true;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(TTRewardVideoActivity.fDm == null) {
            try {
                TTRewardVideoActivity.fDm = com.bytedance.sdk.component.utils.Lrd.PjT(this, "tt_reward_msg");
                TTRewardVideoActivity.qla = com.bytedance.sdk.component.utils.Lrd.PjT(this, "tt_msgPlayable");
                TTRewardVideoActivity.xE = com.bytedance.sdk.component.utils.Lrd.PjT(this, "tt_negtiveBtnBtnText");
                TTRewardVideoActivity.ub = com.bytedance.sdk.component.utils.Lrd.PjT(this, "tt_postiveBtnText");
                TTRewardVideoActivity.gK = com.bytedance.sdk.component.utils.Lrd.PjT(this, "tt_postiveBtnTextPlayable");
            }
            catch(Throwable throwable0) {
                RD.Zh("TTAD.RVA", throwable0.getMessage());
            }
        }
        if(bundle0 != null && (this.Zh != null && (this.Zh.Zh != null && this.Zh.Zh.Lex()))) {
            this.Sks.set(true);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void onDestroy() {
        super.onDestroy();
        this.Lrd();
        if(Zh.ReZ()) {
            this.PjT("recycleRes");
        }
        this.xs = null;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.Zh;
        if(pjT0 != null) {
            qj qj0 = pjT0.uQg;
            if(qj0 != null) {
                qj0.PjT();
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void onResume() {
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.Zh;
        if(pjT0 == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.Zh zh0 = pjT0.yIW.PjT();
        if(zh0 != null) {
            zh0.setJsbLandingPageOpenListener(() -> {
                RD.PjT("BVA", "invoke callback onAdClicked, " + TTRewardVideoActivity.this);
                if(Zh.ReZ()) {
                    TTRewardVideoActivity.this.PjT("onAdVideoBarClick");
                    return;
                }
                PjT pjT0 = TTRewardVideoActivity.this.xs;
                if(pjT0 != null) {
                    pjT0.onAdClicked();
                }
            });
        }
        qj qj0 = this.Zh.uQg;
        if(qj0 != null) {
            qj0.Zh();
        }

        class com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2 implements com.bytedance.sdk.openadsdk.core.widget.JQp {
            final TTRewardVideoActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.JQp
            public void PjT() {
                TTRewardVideoActivity.this.Sks();
            }
        }

    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void onSaveInstanceState(Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        TTRewardVideoActivity.RD = this.xs;
        if(this.Sks.get()) {
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.Zh;
            if(pjT0 != null) {
                pjT0.Zh.VNy();
            }
        }
        super.onSaveInstanceState(bundle0);
    }

    private JSONObject tT() {
        JSONObject jSONObject0 = new JSONObject();
        int v = (int)this.Zh.tT.RD();
        try {
            jSONObject0.put("oversea_version_type", 1);
            jSONObject0.put("reward_name", this.Zh.Zh.cRA());
            jSONObject0.put("reward_amount", this.Zh.Zh.yIW());
            jSONObject0.put("network", ltE.ReZ(this.getApplicationContext()));
            jSONObject0.put("sdk_version", "7.1.0.4");
            int v1 = this.Zh.Zh.OMu();
            jSONObject0.put("user_agent", (v1 == 2 || v1 != 1 ? "unKnow" : wN.ReZ()));
            JSONObject jSONObject1 = this.Zh.Zh.Tn();
            jSONObject1.put("gaid", com.bytedance.sdk.openadsdk.ltE.PjT.Zh.PjT.PjT().Zh());
            jSONObject0.put("extra", jSONObject1);
            jSONObject0.put("media_extra", this.ltE);
            jSONObject0.put("video_duration", this.Zh.Zh.MWx().C());
            jSONObject0.put("play_start_ts", this.qj);
            jSONObject0.put("play_end_ts", this.xf);
            jSONObject0.put("duration", v);
            jSONObject0.put("user_id", this.Owx);
            jSONObject0.put("trans_id", "6ca93beea19a4f69913d32877711bfc0");
            return jSONObject0;
        }
        catch(Throwable throwable0) {
        }
        RD.PjT("TTAD.RVA", "", throwable0);
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void ub() {
        View view0 = this.Zh.Zd.DWo();
        if(view0 != null) {
            com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4 tTRewardVideoActivity$40 = new View.OnClickListener() {
                final TTRewardVideoActivity Zh;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    boolean z1;
                    if(TTRewardVideoActivity.this.Zh.Jo.yIW() && TTRewardVideoActivity.this.Zh.DWo.get()) {
                        boolean z = TTRewardVideoActivity.this.Zh.Co.xs();
                        TTRewardVideoActivity.this.Zh.Jo.cz(z);
                        TTRewardVideoActivity.this.Zh.Zd.JQp(8);
                        View view1 = view0;
                        if(view1 instanceof com.bytedance.sdk.openadsdk.core.JQp.cr) {
                            ((com.bytedance.sdk.openadsdk.core.JQp.cr)view1).setImageResource(com.bytedance.sdk.component.utils.Lrd.cr(TTRewardVideoActivity.this.Zh.IJ, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.Zh.OMu.sendEmptyMessageDelayed(600, 5000L);
                        if(!Owx.ReZ(TTRewardVideoActivity.this.Zh.Zh) || Owx.ReZ(TTRewardVideoActivity.this.Zh.Zh) && z) {
                            return;
                        }
                    }
                    if(!TTRewardVideoActivity.this.Zh.Zh.wWn()) {
                    label_24:
                        z1 = false;
                    }
                    else if(TTRewardVideoActivity.this.Zh.Zh.uvo()) {
                        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = TTRewardVideoActivity.this.Zh;
                        if(pjT0.qZS == null) {
                            goto label_24;
                        }
                        else {
                            pjT0.Zh.ig(2);
                            z1 = TTRewardVideoActivity.this.Zh.qZS.JQp();
                        }
                    }
                    else {
                        if(TTRewardVideoActivity.this.Zh.Zh.cyr() == 0 && !TTRewardVideoActivity.this.Zh.Jo.ub()) {
                            TTRewardVideoActivity.this.Zh.Zh.ig(11);
                            if(TTRewardVideoActivity.this.Zh.Jo.cr()) {
                                TTRewardVideoActivity.this.Zh.Zh.ig(12);
                            }
                            try {
                                TTRewardVideoActivity.this.Zh.Zd.ub();
                                z1 = true;
                                goto label_25;
                            }
                            catch(Exception unused_ex) {
                            }
                        }
                        goto label_24;
                    }
                label_25:
                    if(z1) {
                        return;
                    }
                    TTRewardVideoActivity.this.Zh.Jo.iZZ();
                    TTRewardVideoActivity.this.Zh.Co.qj();
                    TTRewardVideoActivity.this.Zh.Yo.cz();
                    if(cRA.cr(TTRewardVideoActivity.this.Zh.Zh)) {
                        TTRewardVideoActivity.this.PjT(true, true);
                        return;
                    }
                    TTRewardVideoActivity.this.finish();
                }
            };
            view0.setOnClickListener(tTRewardVideoActivity$40);
            view0.setTag(view0.getId(), tTRewardVideoActivity$40);
        }
        this.Zh.wN.PjT(new com.bytedance.sdk.openadsdk.component.reward.top.Zh() {
            final TTRewardVideoActivity Zh;

            @Override  // com.bytedance.sdk.openadsdk.component.reward.top.Zh
            public void PjT(View view0) {
                if(TTRewardVideoActivity.this.Zh.Zh.Ee()) {
                    if(TTRewardVideoActivity.this.Zh.Zd.qj() != null) {
                        TTRewardVideoActivity.this.Zh.Zh.ig(2);
                        TTRewardVideoActivity.this.Zh.Zd.ub();
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = TTRewardVideoActivity.this.Zh;
                if(!pjT0.ReZ && pjT0.Zh.wWn() && !TTRewardVideoActivity.this.Zh.Zh.uvo()) {
                    TTRewardVideoActivity.this.Zh.Zh.ig(13);
                    try {
                        TTRewardVideoActivity.this.Zh.Zd.ub();
                        return;
                    }
                    catch(Exception unused_ex) {
                    }
                }
                boolean z = cRA.ReZ(TTRewardVideoActivity.this.Zh.Zh);
                TTRewardVideoActivity.this.PjT(z, false);
            }

            @Override  // com.bytedance.sdk.openadsdk.component.reward.top.Zh
            public void PjT(View view0, String s) {
                com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = TTRewardVideoActivity.this.ReZ;
                if(zh0 != null && zh0.cr() != null) {
                    TTRewardVideoActivity.this.ReZ.cr().PjT(TTRewardVideoActivity.this.Zh.xH);
                }
                TTRewardVideoActivity.this.Zh.xH = !TTRewardVideoActivity.this.Zh.xH;
                StringBuilder stringBuilder0 = new StringBuilder("will set is Mute ");
                stringBuilder0.append(TTRewardVideoActivity.this.Zh.xH);
                stringBuilder0.append(" mLastVolume=");
                stringBuilder0.append(TTRewardVideoActivity.this.Zh.ZX.PjT());
                TTRewardVideoActivity.this.Zh.tT.PjT(TTRewardVideoActivity.this.Zh.xH, s);
                if(cRA.ltE(TTRewardVideoActivity.this.Zh.Zh) && !TTRewardVideoActivity.this.Zh.DWo.get()) {
                    return;
                }
                TTRewardVideoActivity.this.Zh.Jo.JQp(TTRewardVideoActivity.this.Zh.xH);
                TTRewardVideoActivity.this.Zh.cRA.cz(TTRewardVideoActivity.this.Zh.xH);
                Owx owx0 = TTRewardVideoActivity.this.Zh.Zh;
                if(owx0 != null && owx0.QB() != null && TTRewardVideoActivity.this.Zh.Zh.QB().PjT() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = TTRewardVideoActivity.this.Zh;
                    if(pjT0.tT != null) {
                        if(pjT0.xH) {
                            pjT0.Zh.QB().PjT().Au(TTRewardVideoActivity.this.Zh.tT.XX());
                            return;
                        }
                        pjT0.Zh.QB().PjT().SM(TTRewardVideoActivity.this.Zh.tT.XX());
                    }
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.component.reward.top.Zh
            public void ReZ(View view0) {
                View view1 = view0;
                if(view1 != null) {
                    view1.performClick();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.component.reward.top.Zh
            public void Zh(View view0) {
                TTRewardVideoActivity.this.Zh.Qf.PjT(TTRewardVideoActivity.this.ReZ);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void xf() {
        this.Owx();
    }
}

