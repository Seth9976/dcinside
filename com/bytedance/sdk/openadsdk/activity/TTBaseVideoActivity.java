package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.KM.PjT;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.IListenerManager.Stub;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.Lrd.Zh.JQp;
import com.bytedance.sdk.openadsdk.component.reward.PjT.Au;
import com.bytedance.sdk.openadsdk.component.reward.PjT.qj;
import com.bytedance.sdk.openadsdk.component.reward.Zh.XX;
import com.bytedance.sdk.openadsdk.component.reward.xs;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf.cr.Zh;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.utils.cr;
import com.bytedance.sdk.openadsdk.utils.fDm;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.xf.cz;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class TTBaseVideoActivity extends TTBaseActivity implements PjT, Zh {
    boolean Au;
    protected cz DWo;
    protected IListenerManager JQp;
    public final String PjT;
    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.Zh.Zh ReZ;
    int SM;
    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT Zh;
    final KM cr;
    int cz;
    private boolean qj;
    private int xf;
    private final AtomicBoolean xs;

    public TTBaseVideoActivity() {
        this.PjT = this.gK() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.cr = new KM(Looper.getMainLooper(), this);
        this.qj = false;
        this.xf = 0;
        this.SM = 1;
        this.xs = new AtomicBoolean(false);
        this.DWo = new cz() {
            final TTBaseVideoActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.xf.cz
            public void PjT() {
                TTBaseVideoActivity.this.fDm();
            }
        };
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void Au() {
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.ReZ;
        if(zh0 == null) {
            return;
        }
        zh0.xs();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public View DWo() {
        return this.Zh.tT.ZX();
    }

    protected void JQp() {
        if(cRA.ReZ(this.Zh.Zh)) {
            this.PjT(false, com.bytedance.sdk.openadsdk.cr.Zh.Zh.ReZ);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.ReZ;
        if(zh0 != null) {
            zh0.PjT(this.Zh.Zd.cz());
            this.ReZ.yIW();
        }
    }

    private void Owx() {
        this.ReZ.PjT(this.DWo);
        this.cz = (int)this.Zh.tT.KM();
        this.ub();
        this.JQp();
        if(this.Zh.Zh.QB() != null && this.Zh.Zh.QB().PjT() != null) {
            this.Zh.Zh.QB().PjT().PjT(0L);
        }
    }

    private void PjT(Owx owx0, Bundle bundle0) {
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = new com.bytedance.sdk.openadsdk.component.reward.PjT.PjT(this, this.cr, owx0, this, 0);
        this.Zh = pjT0;
        com.bytedance.sdk.openadsdk.component.reward.PjT.Zh.PjT(pjT0, this.getIntent(), bundle0);
        Intent intent0 = this.getIntent();
        if(intent0 != null) {
            this.PjT(intent0);
            owx0.PjT(intent0.getLongExtra("start_show_time", 0L));
        }
        if(bundle0 != null && this.Zh.kFP) {
            this.ReZ();
        }
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = XX.PjT(this.Zh);
        this.ReZ = zh0;
        this.Zh.wKV = zh0;
        fDm.PjT(this.Zh);
    }

    protected void PjT() {
        this.setContentView(this.Zh.ig);
        this.Zh.ig.PjT(this.ReZ);
        this.ReZ.PjT(this, this.cr);
        this.ReZ.qj();
    }

    protected void PjT(@NonNull Intent intent0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void PjT(Bundle bundle0) {
    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public void PjT(Message message0) {
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.ReZ;
        if(zh0 == null) {
            return;
        }
        zh0.PjT(message0);
    }

    public void PjT(boolean z, int v) {
        this.PjT(z, false, v);
    }

    public void PjT(boolean z, boolean z1, int v) {
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.ReZ;
        if(zh0 == null) {
            return;
        }
        zh0.PjT(z, z1, false, v);
    }

    private boolean RD() {
        if(this.Zh.DWo.get() && this.Zh.XX) {
            return false;
        }
        return this instanceof TTFullScreenExpressVideoActivity || this instanceof TTRewardExpressVideoActivity ? this.Zh.DWo.get() : true;
    }

    protected abstract void ReZ();

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void SM() {
        this.Zh.tT.Qf();
    }

    protected abstract void XX();

    protected IListenerManager Zh(int v) {
        if(this.JQp == null) {
            this.JQp = Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT().PjT(v));
        }
        return this.JQp;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public final void cz() {
        if(!this.xs.compareAndSet(false, true)) {
            return;
        }
        RD.PjT("BVA", "invoke callback onShow, " + this);
        this.XX();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void finish() {
        super.finish();
        if(this.Zh == null) {
            return;
        }
        if(com.bytedance.sdk.openadsdk.utils.cRA.JQp()) {
            qZS.Zh(this);
        }
        if(cRA.XX(this.Zh.Zh) && !this.Zh.DWo.get()) {
            ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
            return;
        }
        if(cRA.JQp(this.Zh.Zh) && !this.Zh.cRA.Au(Au.Zh)) {
            ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
        }
    }

    public abstract boolean gK();

    public boolean ltE() {
        return false;
    }

    @Override  // android.app.Activity
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.Zh;
        if(pjT0 == null) {
            return;
        }
        pjT0.iZZ.PjT();
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        if(this.Zh != null) {
            com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.ReZ;
            if(zh0 != null) {
                zh0.tT();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override  // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        RD.PjT("BVA", "onCreate " + this);
        ub.Zh(this.getApplicationContext());
        this.finish();
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        RD.PjT("BVA", "onDestroy " + this);
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.Zh;
        if(pjT0 != null && this.ReZ != null) {
            if(pjT0.CY > 0L && pjT0.xs.get()) {
                ReZ.PjT(String.valueOf(SystemClock.elapsedRealtime() - this.Zh.CY), this.Zh.Zh, this.PjT, this.Zh.tT.PjT());
                this.Zh.CY = 0L;
            }
            this.Zh.Qf.Zh();
            this.cr.removeCallbacksAndMessages(null);
            this.ReZ.Sks();
            JQp.PjT(this.Zh.Zh);
            com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.Zh(this.Zh.Zh);
            AdSlot adSlot0 = this.Zh.Zh.ig();
            if(!this.Zh.tT.cRA() && adSlot0 != null && TextUtils.isEmpty(adSlot0.getBidAdm()) && !this.Zh.Zh.zq()) {
                com.bytedance.sdk.openadsdk.core.fDm.Zh().post(new Runnable() {
                    final TTBaseVideoActivity Zh;

                    @Override
                    public void run() {
                        if(TTBaseVideoActivity.this.gK()) {
                            xs.PjT(ub.PjT()).PjT(adSlot0);
                            return;
                        }
                        com.bytedance.sdk.openadsdk.component.reward.JQp.PjT(ub.PjT()).PjT(adSlot0);
                    }
                });
            }
            fDm.PjT();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void onPause() {
        super.onPause();
        RD.PjT("BVA", "onPause " + this);
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.ReZ;
        if(zh0 == null) {
            return;
        }
        zh0.Owx();
    }

    @Override  // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.Zh;
        if(pjT0 != null) {
            Owx owx0 = pjT0.Zh;
            if(owx0 != null) {
                if(this.XX && !owx0.kWj() && !TextUtils.isEmpty(Owx.PjT(this, owx0))) {
                    this.finish();
                }
                if(owx0.kWj()) {
                    owx0.JQp(false);
                }
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void onResume() {
        super.onResume();
        RD.PjT("BVA", "onResume " + this);
        if(this.Zh != null) {
            com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.ReZ;
            if(zh0 != null) {
                zh0.ub();
                this.Zh.dwk = true;
                this.Zh.iZZ.Zh(this.cr);
                if(this.RD()) {
                    this.Zh.wN.PjT(this.Zh.Zh.jp());
                }
                this.Zh.Zd.qla();
                this.Zh.Jo.Sks();
                this.Zh.cRA.xs();
                if(this.ReZ.Zh()) {
                    this.Zh.tT.PjT(this.ReZ);
                    this.Zh.tT.PjT(false, this, this.xf != 0);
                }
                ++this.xf;
                this.xs();
                com.bytedance.sdk.openadsdk.component.reward.view.Au au0 = this.Zh.yIW;
                if(au0 != null) {
                    au0.XX();
                }
                this.Zh.iZZ.PjT(this.cr);
                this.ReZ.ltE();
            }
        }
    }

    @Override  // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle0) {
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.Zh;
        if(pjT0 == null) {
            super.onSaveInstanceState(bundle0);
            return;
        }
        if(pjT0.xs.get()) {
            this.Zh.Zh.Au(true);
        }
        if(this.xs.get()) {
            this.Zh.Zh.TE();
        }
        com.bytedance.sdk.openadsdk.component.reward.PjT.Zh.PjT(this.Zh, bundle0);
        super.onSaveInstanceState(bundle0);
    }

    @Override  // android.app.Activity
    protected void onStart() {
        super.onStart();
        RD.PjT("BVA", "onStart " + this);
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.Zh;
        if(pjT0 == null) {
            return;
        }
        pjT0.Jo.Jo();
        cr.PjT(this, this.Zh.Zh);
    }

    @Override  // android.app.Activity
    protected void onStop() {
        super.onStop();
        RD.PjT("BVA", "onStop " + this);
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.ReZ;
        if(zh0 == null) {
            return;
        }
        zh0.RD();
    }

    @Override  // android.app.Activity
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.Zh;
        if(pjT0 != null) {
            qj qj0 = pjT0.Yo;
            if(qj0 != null) {
                qj0.Zh(z);
                this.Zh.Yo.ReZ(z);
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = this.Zh;
        if(pjT1 != null) {
            com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = pjT1.wKV;
            if(zh0 instanceof com.bytedance.sdk.openadsdk.component.reward.Zh.cz) {
                ((com.bytedance.sdk.openadsdk.component.reward.Zh.cz)zh0).Zh(z);
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void qj() {
        if(this.Zh.fDm.getAndSet(true) && !cRA.ReZ(this.Zh.Zh)) {
            return;
        }
        this.Zh.Yo.PjT();
    }

    protected void qla() {
        Message message0 = new Message();
        message0.what = 400;
        if(this.gK()) {
            this.PjT(10000);
        }
        this.cr.sendMessageDelayed(message0, 2000L);
    }

    protected abstract void ub();

    protected void xE() {
        this.cr.removeMessages(400);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void xf() {
    }

    protected void xs() {
        if(!this.ltE()) {
            return;
        }
        if(this.qj) {
            return;
        }
        this.qj = true;
        this.getWindow().getDecorView().post(new Runnable() {
            final TTBaseVideoActivity PjT;

            @Override
            public void run() {
                TTBaseVideoActivity.this.Zh.KM.PjT(TTBaseVideoActivity.this.Zh.iZZ.PjT(TTBaseVideoActivity.this.SM), TTBaseVideoActivity.this, TTBaseVideoActivity.this.ReZ);
            }
        });
    }
}

