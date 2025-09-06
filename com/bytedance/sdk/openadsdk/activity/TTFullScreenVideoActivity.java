package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.PjT.ReZ.Zh;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.component.reward.PjT.ub;
import com.bytedance.sdk.openadsdk.component.reward.Zh.SM;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.Lrd;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.tT;
import com.bytedance.sdk.openadsdk.core.widget.JQp;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.cr.XX;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.fDm;
import com.bytedance.sdk.openadsdk.utils.xs;
import org.json.JSONObject;
import v.c;
import x.b.a;

public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private Zh qj;
    private static Zh xf;
    private boolean xs;

    // 检测为 Lambda 实现
    private void Owx() [...]

    private void PjT(String s) {
        Jo.ReZ(new Au("FullScreen_executeMultiProcessCallback") {
            final TTFullScreenVideoActivity Zh;

            @Override
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.Zh(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.Zh.tY, s);
                }
                catch(Throwable throwable0) {
                    RD.Zh("TTAD.FSVA", new Object[]{"fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", throwable0});
                }
            }
        }, 5);
    }

    private boolean PjT(Owx owx0) {
        return owx0 == null ? true : owx0.Qtm() == 100.0f;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void PjT(int v) {
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void PjT(@NonNull Intent intent0) {
        super.PjT(intent0);
        PjT pjT0 = this.Zh;
        pjT0.xu = intent0.getBooleanExtra("is_verity_playable", false);
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void PjT(Bundle bundle0) {
        if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            this.qj = Lrd.PjT().cr();
        }
        if(this.qj == null && bundle0 != null) {
            this.qj = TTFullScreenVideoActivity.xf;
            TTFullScreenVideoActivity.xf = null;
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void PjT(String s, JSONObject jSONObject0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void PjT(boolean z) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public boolean PjT(long v, boolean z) {
        XX xX0 = new XX();
        xX0.PjT(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.ReZ;
        if(zh0 == null || !(zh0 instanceof SM)) {
            this.Zh.tT.PjT(this.Zh.Zd.cz(), xX0);
        }
        else {
            this.Zh.tT.PjT(((SM)zh0).KM(), xX0);
        }
        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.5 tTFullScreenVideoActivity$50 = new a() {
            boolean PjT;
            final TTFullScreenVideoActivity Zh;

            @Override  // x.b$a
            public void PjT() {
                TTFullScreenVideoActivity.this.cr.removeMessages(300);
                TTFullScreenVideoActivity.this.xE();
                TTFullScreenVideoActivity tTFullScreenVideoActivity0 = TTFullScreenVideoActivity.this;
                if(tTFullScreenVideoActivity0.Zh.ReZ) {
                    tTFullScreenVideoActivity0.PjT(false, true, 6);
                }
                else {
                    tTFullScreenVideoActivity0.finish();
                }
                ub ub0 = TTFullScreenVideoActivity.this.Zh.tT;
                ub0.PjT(!ub0.Yo(), true ^ TTFullScreenVideoActivity.this.Zh.tT.Yo());
                TTFullScreenVideoActivity.this.Zh.tT.fDm();
            }

            @Override  // x.b$a
            public void PjT(long v, int v1) {
                if(this.PjT) {
                    return;
                }
                this.PjT = true;
                TTFullScreenVideoActivity.this.cr.removeMessages(300);
                TTFullScreenVideoActivity.this.xE();
                TTFullScreenVideoActivity.this.Zh.tT.PjT(v, v);
                TTFullScreenVideoActivity.this.Zh.ltE.set(true);
                if(TTFullScreenVideoActivity.this.Zh.Zh.RD() == 36) {
                    PjT pjT0 = TTFullScreenVideoActivity.this.Zh;
                    if(pjT0.ReZ) {
                        pjT0.Lrd.ReZ().cr();
                        fDm.Zh();
                    }
                }
                if(TTFullScreenVideoActivity.this.Zh.Zh.KH()) {
                    TTFullScreenVideoActivity.this.Zh.Zh.ig(1);
                    TTFullScreenVideoActivity.this.Zh.Zd.ub();
                }
                if(TTFullScreenVideoActivity.this.Zh.Zh.RD() == 21 && !TTFullScreenVideoActivity.this.Zh.Zh.Au()) {
                    TTFullScreenVideoActivity.this.Zh.Zh.Zh(true);
                    TTFullScreenVideoActivity.this.Zh.Zd.ub();
                }
                PjT pjT1 = TTFullScreenVideoActivity.this.Zh;
                if(pjT1.ReZ) {
                    if(pjT1.Zh.Ik()) {
                        TTFullScreenVideoActivity.this.Zh.wN.ReZ();
                        return;
                    }
                    TTFullScreenVideoActivity.this.PjT(false, 5);
                    if(gK.Zh(TTFullScreenVideoActivity.this.Zh.Zh)) {
                        xs xs0 = TTFullScreenVideoActivity.this.Zh.Xtz;
                        if(xs0 != null) {
                            xs0.PjT(0L);
                        }
                    }
                    if(!Owx.JQp(TTFullScreenVideoActivity.this.Zh.Zh)) {
                        TTFullScreenVideoActivity.this.Zh.tT.PjT("skip", true);
                    }
                }
                else {
                    if(pjT1.Zh.Ik()) {
                        TTFullScreenVideoActivity.this.Zh.wN.ReZ();
                        return;
                    }
                    if(!Owx.JQp(TTFullScreenVideoActivity.this.Zh.Zh)) {
                        TTFullScreenVideoActivity.this.Zh.tT.PjT("skip", true);
                    }
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            @Override  // x.b$a
            public void PjT(long v, long v1) {
                PjT pjT0 = TTFullScreenVideoActivity.this.Zh;
                if(!pjT0.dwk && pjT0.tT.Zh()) {
                    TTFullScreenVideoActivity.this.Zh.tT.xE();
                }
                if(TTFullScreenVideoActivity.this.Zh.DWo.get()) {
                    return;
                }
                TTFullScreenVideoActivity.this.cr.removeMessages(300);
                if(v != TTFullScreenVideoActivity.this.Zh.tT.Au()) {
                    TTFullScreenVideoActivity.this.xE();
                }
                TTFullScreenVideoActivity.this.Zh.tT.PjT(v, v1);
                TTFullScreenVideoActivity.this.cz = (int)(TTFullScreenVideoActivity.this.Zh.tT.KM() - ((double)(v / 1000L)));
                if((TTFullScreenVideoActivity.this.Zh.Owx.get() || TTFullScreenVideoActivity.this.Zh.qj.get()) && TTFullScreenVideoActivity.this.Zh.tT.Zh()) {
                    TTFullScreenVideoActivity.this.Zh.tT.xE();
                }
                TTFullScreenVideoActivity.this.ReZ(((int)(v / 1000L)));
                TTFullScreenVideoActivity tTFullScreenVideoActivity0 = TTFullScreenVideoActivity.this;
                int v2 = tTFullScreenVideoActivity0.cz;
                if(v2 >= 0) {
                    tTFullScreenVideoActivity0.Zh.wN.PjT(String.valueOf(v2), null);
                }
            }

            @Override  // x.b$a
            public void Zh(long v, int v1) {
                TTFullScreenVideoActivity.this.cr.removeMessages(300);
                gK gK0 = TTFullScreenVideoActivity.this.Zh.Zd.qla;
                if(gK0 != null) {
                    gK0.DWo();
                }
                if(TTFullScreenVideoActivity.this.Zh.tT.Zh()) {
                    TTFullScreenVideoActivity.this.qla();
                    return;
                }
                TTFullScreenVideoActivity.this.Zh.tT.fDm();
                TTFullScreenVideoActivity tTFullScreenVideoActivity0 = TTFullScreenVideoActivity.this;
                if(tTFullScreenVideoActivity0.Zh.ReZ) {
                    tTFullScreenVideoActivity0.PjT(false, true, 3);
                    ub ub0 = TTFullScreenVideoActivity.this.Zh.tT;
                    ub0.PjT(!ub0.Yo(), 2);
                    return;
                }
                tTFullScreenVideoActivity0.finish();
            }
        };
        this.Zh.tT.PjT(tTFullScreenVideoActivity$50);
        gK gK0 = this.Zh.Zd.qla;
        if(gK0 != null) {
            gK0.PjT(tTFullScreenVideoActivity$50);
        }
        return this.Zh.tT.PjT(v, z, null, this.ReZ);
    }

    private void RD() {
        if(!this.Au) {
            this.Au = true;
            RD.PjT("BVA", "invoke callback onAdClose, " + this);
            if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                this.PjT("onAdClose");
                return;
            }
            Zh zh0 = this.qj;
            if(zh0 != null) {
                zh0.Zh();
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void ReZ() {
        if(Owx.JQp(this.Zh.Zh)) {
            this.Zh.wN.PjT(null, TTAdDislikeToast.getSkipText());
        }
        else {
            PjT pjT0 = this.Zh;
            if(pjT0.ReZ) {
                this.Zh.wN.PjT(null, TTAdDislikeToast.getSkipText());
            }
            else {
                pjT0.wN.PjT(null, "X");
            }
        }
        this.Zh.wN.JQp(true);
    }

    protected void ReZ(int v) {
        int v1;
        PjT pjT0 = this.Zh;
        if(pjT0 == null) {
            v1 = 5;
        }
        else {
            Owx owx0 = pjT0.Zh;
            if(owx0 == null) {
                v1 = pjT0 == null ? 5 : com.bytedance.sdk.openadsdk.core.ub.cr().ltE(String.valueOf(this.Zh.cz));
            }
            else {
                v1 = owx0.PjT();
            }
        }
        if(com.bytedance.sdk.openadsdk.core.ub.cr().cz(String.valueOf(this.Zh.cz)) && (Owx.JQp(this.Zh.Zh) || this.Zh.ReZ)) {
            PjT pjT1 = this.Zh;
            if(!pjT1.kFP) {
                pjT1.PjT(true);
            }
            if(v <= v1) {
                this.cr(v1 - v);
                this.Zh.wN.JQp(false);
                return;
            }
            this.ReZ();
            return;
        }
        if(v >= v1) {
            PjT pjT2 = this.Zh;
            if(!pjT2.kFP) {
                pjT2.PjT(true);
            }
            this.ReZ();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void XX() {
        if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            this.PjT("onAdShow");
        }
        else {
            Zh zh0 = this.qj;
            if(zh0 != null) {
                zh0.PjT();
            }
        }
        if(this.ltE()) {
            this.Zh.yIW.DWo();
        }
    }

    private boolean Zh(Owx owx0) {
        return owx0 == null ? false : com.bytedance.sdk.openadsdk.core.ub.cr().Owx(String.valueOf(this.Zh.cz));
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void c_() {
        if(this.Zh.Zh.Qtm() != 100.0f) {
            this.xs = true;
        }
        this.Owx();
    }

    private void cr(int v) {
        String s = com.bytedance.sdk.component.utils.Lrd.PjT(com.bytedance.sdk.openadsdk.core.ub.PjT(), "tt_skip_ad_time_text");
        this.Zh.wN.PjT(null, String.format(s, v));
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void cr() {
        this.Owx();
        this.Zh.Zh.Xw();
        this.Zh.Zh.PjT(true);
        if(Owx.JQp(this.Zh.Zh)) {
            Owx owx0 = this.Zh.Zh;
            ReZ.Zh(owx0, this.Zh.JQp, owx0.Ebj());
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void fDm() {
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        TTFullScreenVideoActivity.xf = null;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void finish() {
        if(this.Zh != null) {
            com.bytedance.sdk.openadsdk.cz.Zh.PjT().PjT("videoForceBreak", this.Zh.Zh);
            this.Zh.cRA.PjT(this.Zh.xu);
        }
        try {
            this.RD();
        }
        catch(Exception unused_ex) {
        }
        super.finish();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean gK() {
        return false;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        if(this.Zh != null && !Owx.JQp(this.Zh.Zh)) {
            c c0 = this.Zh.Zh.MWx();
            if(c0 == null) {
                c c1 = new c();
                c1.j(10.0);
                this.Zh.Zh.PjT(c1);
                return;
            }
            if(c0.C() <= 0.0) {
                c0.j(10.0);
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void onDestroy() {
        super.onDestroy();
        this.RD();
        if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            this.PjT("recycleRes");
        }
        this.qj = null;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void onResume() {
        super.onResume();
        PjT pjT0 = this.Zh;
        if(pjT0 == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.Zh zh0 = pjT0.yIW.PjT();
        if(zh0 != null) {
            zh0.setJsbLandingPageOpenListener(() -> {
                RD.PjT("BVA", "invoke callback onAdClicked, " + TTFullScreenVideoActivity.this);
                if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                    TTFullScreenVideoActivity.this.PjT("onAdVideoBarClick");
                    return;
                }
                Zh zh0 = TTFullScreenVideoActivity.this.qj;
                if(zh0 != null) {
                    zh0.onAdClicked();
                }
            });
        }

        class com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1 implements JQp {
            final TTFullScreenVideoActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.JQp
            public void PjT() {
                TTFullScreenVideoActivity.this.Owx();
            }
        }

    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void onSaveInstanceState(Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        TTFullScreenVideoActivity.xf = this.qj;
        super.onSaveInstanceState(bundle0);
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void onStop() {
        super.onStop();
        PjT pjT0 = this.Zh;
        if(pjT0 == null) {
            return;
        }
        if(this.Zh(pjT0.Zh) && !this.PjT(this.Zh.Zh)) {
            if(this.xs) {
                this.xs = false;
                this.finish();
                return;
            }
            if(this.Zh.Jo.Co()) {
                this.finish();
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void ub() {
        View view0 = this.Zh.Zd.DWo();
        if(view0 != null) {
            com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3 tTFullScreenVideoActivity$30 = new View.OnClickListener() {
                final TTFullScreenVideoActivity Zh;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    boolean z1;
                    if(TTFullScreenVideoActivity.this.Zh.Jo.yIW() && TTFullScreenVideoActivity.this.Zh.DWo.get()) {
                        boolean z = TTFullScreenVideoActivity.this.Zh.Co.xs();
                        TTFullScreenVideoActivity.this.Zh.Jo.cz(z);
                        TTFullScreenVideoActivity.this.Zh.Zd.JQp(8);
                        View view1 = view0;
                        if(view1 instanceof cr) {
                            ((cr)view1).setImageResource(com.bytedance.sdk.component.utils.Lrd.cr(TTFullScreenVideoActivity.this.Zh.IJ, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.Zh.OMu.sendEmptyMessageDelayed(600, 5000L);
                        if(!Owx.ReZ(TTFullScreenVideoActivity.this.Zh.Zh) || Owx.ReZ(TTFullScreenVideoActivity.this.Zh.Zh) && z) {
                            return;
                        }
                    }
                    if(!TTFullScreenVideoActivity.this.Zh.Zh.wWn()) {
                    label_24:
                        z1 = false;
                    }
                    else if(TTFullScreenVideoActivity.this.Zh.Zh.uvo()) {
                        PjT pjT0 = TTFullScreenVideoActivity.this.Zh;
                        if(pjT0.qZS == null) {
                            goto label_24;
                        }
                        else {
                            pjT0.Zh.ig(2);
                            z1 = TTFullScreenVideoActivity.this.Zh.qZS.JQp();
                        }
                    }
                    else {
                        if(TTFullScreenVideoActivity.this.Zh.Zh.cyr() == 0 && !TTFullScreenVideoActivity.this.Zh.Jo.ub()) {
                            TTFullScreenVideoActivity.this.Zh.Zh.ig(11);
                            if(TTFullScreenVideoActivity.this.Zh.Jo.cr()) {
                                TTFullScreenVideoActivity.this.Zh.Zh.ig(12);
                            }
                            try {
                                TTFullScreenVideoActivity.this.Zh.Zd.ub();
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
                    TTFullScreenVideoActivity.this.Zh.Jo.iZZ();
                    TTFullScreenVideoActivity.this.Zh.Co.qj();
                    TTFullScreenVideoActivity.this.Zh.Yo.cz();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            view0.setOnClickListener(tTFullScreenVideoActivity$30);
            view0.setTag(view0.getId(), tTFullScreenVideoActivity$30);
        }
        this.Zh.wN.PjT(new com.bytedance.sdk.openadsdk.component.reward.top.Zh() {
            final TTFullScreenVideoActivity Zh;

            @Override  // com.bytedance.sdk.openadsdk.component.reward.top.Zh
            public void PjT(View view0) {
                if(!cRA.cz(TTFullScreenVideoActivity.this.Zh.Zh) && (!cRA.JQp(TTFullScreenVideoActivity.this.Zh.Zh) || !TTFullScreenVideoActivity.this.Zh.cRA.Au(com.bytedance.sdk.openadsdk.component.reward.PjT.Au.Zh))) {
                    if(cRA.Au(TTFullScreenVideoActivity.this.Zh.Zh) && (cRA.gK(TTFullScreenVideoActivity.this.Zh.Zh) || TTFullScreenVideoActivity.this.Zh.DWo.get())) {
                        if(TTFullScreenVideoActivity.this.Zh.cRA.PjT()) {
                            TTFullScreenVideoActivity.this.Zh.cRA.PjT(5);
                            return;
                        }
                        TTFullScreenVideoActivity.this.Zh.Jo.Au();
                        return;
                    }
                    if(!cRA.gK(TTFullScreenVideoActivity.this.Zh.Zh) && (!gK.PjT(TTFullScreenVideoActivity.this.Zh.Zh) || TTFullScreenVideoActivity.this.Zh.xE.get())) {
                        if(TTFullScreenVideoActivity.this.Zh.Zh.Ee()) {
                            if(TTFullScreenVideoActivity.this.Zh.Zd.qj() != null) {
                                TTFullScreenVideoActivity.this.Zh.Zh.ig(2);
                                TTFullScreenVideoActivity.this.Zh.Zd.ub();
                            }
                            return;
                        }
                        PjT pjT0 = TTFullScreenVideoActivity.this.Zh;
                        if(!pjT0.ReZ && pjT0.Zh.wWn() && !TTFullScreenVideoActivity.this.Zh.Zh.uvo()) {
                            TTFullScreenVideoActivity.this.Zh.Zh.ig(13);
                            try {
                                TTFullScreenVideoActivity.this.Zh.Zd.ub();
                                return;
                            }
                            catch(Exception unused_ex) {
                            }
                        }
                        com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
                        qla$PjT0.PjT(TTFullScreenVideoActivity.this.Zh.tT.XX());
                        qla$PjT0.ReZ(TTFullScreenVideoActivity.this.Zh.tT.Owx());
                        qla$PjT0.Zh(TTFullScreenVideoActivity.this.Zh.tT.qj());
                        qla$PjT0.ReZ(3);
                        qla$PjT0.cr(TTFullScreenVideoActivity.this.Zh.tT.ltE());
                        com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(TTFullScreenVideoActivity.this.Zh.tT.ReZ(), qla$PjT0, TTFullScreenVideoActivity.this.Zh.tT.PjT());
                        tT.ReZ(TTFullScreenVideoActivity.this.Zh.cz);
                        TTFullScreenVideoActivity.this.Zh.tT.PjT("skip", false);
                        TTFullScreenVideoActivity.this.Zh.wN.cr(false);
                        PjT pjT1 = TTFullScreenVideoActivity.this.Zh;
                        if(!pjT1.ReZ) {
                            TTFullScreenVideoActivity.this.finish();
                        }
                        else if(gK.ReZ(pjT1.Zh)) {
                            com.bytedance.sdk.openadsdk.component.reward.view.Zh zh0 = TTFullScreenVideoActivity.this.Zh.yIW.PjT();
                            if(zh0 != null && zh0.cr == 0) {
                                TTFullScreenVideoActivity.this.finish();
                            }
                            else {
                                TTFullScreenVideoActivity.this.PjT(true, 4);
                            }
                        }
                        else {
                            TTFullScreenVideoActivity.this.PjT(true, 4);
                        }
                        Owx owx0 = TTFullScreenVideoActivity.this.Zh.Zh;
                        if(owx0 != null && owx0.QB() != null) {
                            PjT pjT2 = TTFullScreenVideoActivity.this.Zh;
                            if(pjT2.tT != null) {
                                pjT2.Zh.QB().PjT().cz(TTFullScreenVideoActivity.this.Zh.tT.XX());
                                TTFullScreenVideoActivity.this.Zh.Zh.QB().PjT().JQp(TTFullScreenVideoActivity.this.Zh.tT.XX());
                            }
                        }
                        com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(TTFullScreenVideoActivity.this.Zh.Zh, 5);
                        return;
                    }
                    if(!cRA.Au(TTFullScreenVideoActivity.this.Zh.Zh) && TTFullScreenVideoActivity.this.Zh.cRA.PjT()) {
                        TTFullScreenVideoActivity.this.Zh.cRA.PjT(4);
                    }
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                if(cRA.DWo(TTFullScreenVideoActivity.this.Zh.Zh)) {
                    TTFullScreenVideoActivity.this.Zh.cRA.ub();
                    return;
                }
                View view1 = view0;
                if(view1 != null) {
                    view1.performClick();
                    return;
                }
                TTFullScreenVideoActivity.this.finish();
            }

            @Override  // com.bytedance.sdk.openadsdk.component.reward.top.Zh
            public void PjT(View view0, String s) {
                TTFullScreenVideoActivity.this.Zh.xH = !TTFullScreenVideoActivity.this.Zh.xH;
                com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = TTFullScreenVideoActivity.this.ReZ;
                if(zh0 != null && zh0.cr() != null) {
                    TTFullScreenVideoActivity.this.ReZ.cr().PjT(TTFullScreenVideoActivity.this.Zh.xH);
                }
                TTFullScreenVideoActivity.this.Zh.tT.PjT(TTFullScreenVideoActivity.this.Zh.xH, s);
                if(cRA.ltE(TTFullScreenVideoActivity.this.Zh.Zh) && !TTFullScreenVideoActivity.this.Zh.DWo.get()) {
                    return;
                }
                TTFullScreenVideoActivity.this.Zh.Jo.JQp(TTFullScreenVideoActivity.this.Zh.xH);
                TTFullScreenVideoActivity.this.Zh.cRA.cz(TTFullScreenVideoActivity.this.Zh.xH);
                Owx owx0 = TTFullScreenVideoActivity.this.Zh.Zh;
                if(owx0 != null && owx0.QB() != null && TTFullScreenVideoActivity.this.Zh.Zh.QB().PjT() != null) {
                    PjT pjT0 = TTFullScreenVideoActivity.this.Zh;
                    if(pjT0.tT != null) {
                        if(pjT0.xH) {
                            pjT0.Zh.QB().PjT().Au(TTFullScreenVideoActivity.this.Zh.tT.XX());
                            return;
                        }
                        pjT0.Zh.QB().PjT().SM(TTFullScreenVideoActivity.this.Zh.tT.XX());
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
                TTFullScreenVideoActivity.this.Zh.Qf.PjT(TTFullScreenVideoActivity.this.ReZ);
            }
        });
    }
}

