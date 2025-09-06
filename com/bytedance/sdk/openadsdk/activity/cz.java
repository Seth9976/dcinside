package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.IListenerManager.Stub;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.component.reward.qj;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.utils.Jo;

public abstract class cz {
    protected final Owx Au;
    public boolean DWo;
    private final Zh PjT;
    public int SM;
    protected IListenerManager qj;
    protected com.bytedance.sdk.openadsdk.xf.cz xf;

    public cz(Zh zh0, Owx owx0, int v) {
        this.xf = () -> {
        };
        this.PjT = zh0;
        this.Au = owx0;
        this.SM = v;
    }

    public void JQp(Activity activity0) {
    }

    protected void KM() {
        if(this.PjT.ub()) {
            return;
        }
        if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            this.PjT("onAdShow");
        }
        else {
            this.PjT.fDm();
        }
        this.PjT.gK();
    }

    public boolean Lrd() {
        return this.PjT != null && this.PjT.Zh(this.SM);
    }

    protected abstract String Owx();

    private void PjT(String s, boolean z, int v, String s1, int v1, String s2) {
        Jo.ReZ(new Au("Reward_executeMultiProcessCallback") {
            final cz XX;

            @Override
            public void run() {
                try {
                    cz.this.cr(0).executeRewardVideoCallback(cz.this.Owx(), s, z, v, s1, v1, s2);
                }
                catch(Throwable throwable0) {
                    RD.Zh("Scene", new Object[]{"rewarded_video", "executeRewardVideoCallback execute throw Exception : ", throwable0});
                }
            }
        }, 5);
    }

    public abstract View PjT();

    public void PjT(Activity activity0) {
    }

    public void PjT(Activity activity0, Bundle bundle0) {
    }

    public void PjT(Activity activity0, JQp zh$JQp0) {
    }

    public void PjT(cz cz0, cz cz1, JQp zh$JQp0) {
    }

    protected void PjT(String s) {
        if(this.a_()) {
            this.PjT(s, false, 0, "", 0, "");
            return;
        }
        this.Zh(s);
    }

    protected final void PjT(boolean z, int v, String s, int v1, String s1, int v2) {
        if(this.PjT.qla()) {
            return;
        }
        if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            this.PjT("onRewardVerify", z, v, s, v1, s1);
        }
        else {
            this.PjT.PjT(this, z, v, s, v1, s1);
        }
        qj.PjT(this.Au, z, v2);
    }

    protected void PjT(boolean z, boolean z1, boolean z2, int v) {
        this.PjT.PjT(this, z, z1, z2, v);
    }

    protected final void Qf() {
        if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            this.PjT("onAdVideoBarClick");
            return;
        }
        this.PjT.xf();
    }

    public void ReZ(Activity activity0) {
    }

    public abstract PjT Sks();

    public void Yo() {
        if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            this.PjT("onAdClose");
            return;
        }
        this.PjT.xs();
    }

    private void Zh(String s) {
        Jo.ReZ(new Au("FullScreen_executeMultiProcessCallback") {
            final cz Zh;

            @Override
            public void run() {
                try {
                    cz.this.cr(1).executeFullVideoCallback(cz.this.Owx(), s);
                }
                catch(Throwable throwable0) {
                    RD.Zh("Scene", new Object[]{"fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", throwable0});
                }
            }
        }, 5);
    }

    public void Zh(Activity activity0) {
    }

    public abstract void Zh(boolean arg1);

    protected abstract boolean a_();

    public abstract String b_();

    public Zh cRA() {
        return this.PjT;
    }

    protected final IListenerManager cr(int v) {
        if(this.qj == null) {
            this.qj = Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT().PjT(v));
        }
        return this.qj;
    }

    public void cr(Activity activity0) {
    }

    // 检测为 Lambda 实现
    public void fDm() [...]

    protected void iZZ() {
        if(this.Au != null) {
            com.bytedance.sdk.openadsdk.cz.Zh.PjT().PjT("videoForceBreak", this.Au);
        }
        this.PjT.Zh(this);
    }

    public abstract boolean ltE();

    public void qla() {
    }

    public void ub() {
    }

    public Activity yIW() {
        return this.PjT.cr();
    }

    class com.bytedance.sdk.openadsdk.activity.cz.1 implements com.bytedance.sdk.openadsdk.xf.cz {
        final cz PjT;

        @Override  // com.bytedance.sdk.openadsdk.xf.cz
        public void PjT() {
            cz.this.fDm();
        }
    }

}

