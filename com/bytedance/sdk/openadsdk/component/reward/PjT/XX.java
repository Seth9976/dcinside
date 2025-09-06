package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Message;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.Owx.PjT.Zh;
import com.bytedance.sdk.openadsdk.Owx.PjT.cr;
import com.bytedance.sdk.openadsdk.component.reward.qj;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.xf.cz;

public class XX extends DWo implements Handler.Callback {
    int JQp;
    boolean PjT;
    int ReZ;
    long Zh;
    int cr;
    boolean cz;
    private final Handler ltE;

    public XX(PjT pjT0) {
        super(pjT0);
        this.ltE = new Handler(this);
        this.PjT = false;
        this.Zh = 0L;
        this.ReZ = 0;
        this.cr = 0;
        this.JQp = 0;
        this.cz = false;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.DWo
    public void Au() {
        if(!this.xs) {
            return;
        }
        this.ltE.removeMessages(900);
        this.ltE.removeMessages(600);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.DWo
    public void JQp() {
        if(!this.xs) {
            return;
        }
        super.JQp();
        if(cRA.ReZ(this.qj.Zh)) {
            this.qj.OMu.removeMessages(600);
        }
        this.ltE.removeMessages(900);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.DWo
    public void PjT() {
        if(!this.xs) {
            return;
        }
        if(this.xf) {
            return;
        }
        super.PjT();
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.DWo
    public void PjT(int v) {
        this.ReZ = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.DWo
    public void PjT(long v) {
        if(!this.xs) {
            return;
        }
        if(!this.XX) {
            return;
        }
        Message message0 = Message.obtain();
        message0.what = 900;
        message0.arg1 = this.XX();
        this.ltE.sendMessageDelayed(message0, v);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.DWo
    protected void PjT(boolean z) {
        if(this.xE != null) {
            try {
                cr cr0 = cr.PjT();
                FrameLayout frameLayout0 = this.xE;
                cz cz0 = this.Zh();
                Zh zh0 = cr0.PjT(this.SM, frameLayout0, cz0);
                this.ub = zh0;
                zh0.PjT(this.qj.kph);
            }
            catch(Throwable unused_ex) {
                RD.Zh("RVIVPlayableNewManager", "PreRender injection exception");
            }
            if(this.ub == null) {
                super.PjT(z);
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.DWo
    public void ReZ() {
        if(!this.xs) {
            return;
        }
        this.XX = true;
        this.ub.PjT();
        if(cRA.DWo(this.SM)) {
            this.qj.Jo.cz();
        }
        this.cr = this.SM.Gr();
        com.bytedance.sdk.openadsdk.core.settings.cz cz0 = ub.cr();
        boolean z = this.SM.Sky();
        this.JQp = cz0.PjT(String.valueOf(this.qj.cz), z);
        this.Zh = System.currentTimeMillis();
        Message message0 = this.ltE.obtainMessage(900, this.cr, 0);
        this.ltE.sendMessage(message0);
        this.qj.kph.qj();
        qj qj0 = this.qj.uQg;
        if(qj0 != null) {
            qj0.PjT(((long)this.cr));
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.DWo
    public boolean SM() {
        return this.cz;
    }

    public int XX() {
        return this.ReZ;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.DWo
    protected cz Zh() {
        return () -> {
            com.bytedance.sdk.openadsdk.core.settings.Zh zh0 = ub.cr().iZZ(String.valueOf(XX.this.qj.cz));
            int v = 0;
            int v1 = (1.0f - ((float)XX.this.ReZ) / ((float)XX.this.cr)) * 100.0f >= ((float)zh0.cz) ? 1 : 0;
            int v2 = ub.cr().PjT(String.valueOf(XX.this.qj.cz));
            if(v2 == 0) {
                boolean z = XX.this.ub == null ? false : XX.this.ub.cz();
                if(XX.this.fDm) {
                    z = true;
                }
                if(v1 != 0 && z) {
                    v = 1;
                }
            }
            else if(v2 == 1) {
                v = v1;
            }
            if(v != 0) {
                XX.this.qj.kph.PjT(true);
            }
        };

        class com.bytedance.sdk.openadsdk.component.reward.PjT.XX.1 implements cz {
            final XX PjT;

            @Override  // com.bytedance.sdk.openadsdk.xf.cz
            public void PjT() {
                XX.this.xf();
            }
        }

    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.DWo
    public void cr() {
        if(!this.xs) {
            return;
        }
        super.cr();
        this.qj.xH = true;
        PjT pjT0 = this.qj;
        if(pjT0.xH) {
            pjT0.wN.Zh(true);
            this.ReZ(true);
        }
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.qj.wKV;
        if((zh0 == null || (zh0.xs == null || !zh0.xs.isShowing())) && this.XX() > 0) {
            this.PjT(0L);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.DWo
    public void cz() {
        if(!this.xs) {
            return;
        }
        if(this.qla) {
            return;
        }
        super.cz();
        this.ltE.removeCallbacksAndMessages(null);
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(Message message0) {
        if(message0.what == 900 && this.XX && cRA.ReZ(this.qj.Zh) && !this.gK.get()) {
            int v = message0.arg1;
            if(v > 0) {
                this.qj.wN.cr(true);
                int v1 = this.JQp - (this.cr - v);
                if(v1 == v) {
                    this.qj.wN.PjT(String.valueOf(v), null);
                }
                else if(v1 > 0) {
                    String s = Lrd.PjT(this.qj.rds.getApplicationContext(), "tt_skip_ad_time_text");
                    this.qj.wN.PjT(String.valueOf(v), String.format(s, v1));
                }
                else {
                    this.cz = true;
                    if(cRA.DWo(this.qj.Zh)) {
                        this.qj.wN.ReZ();
                        this.qj.wN.JQp(true);
                    }
                    else {
                        this.qj.ltE.set(true);
                        this.qj.wKV.qla();
                    }
                }
                Message message1 = Message.obtain();
                message1.what = 900;
                message1.arg1 = v - 1;
                this.ltE.sendMessageDelayed(message1, 1000L);
                this.ReZ = v - 1;
            }
            else {
                this.cz = true;
                if(!cRA.DWo(this.SM) || cRA.tT(this.SM) && this.ub.JQp()) {
                    this.qj.wN.cr(false);
                    this.qj.ltE.set(true);
                    this.qj.wKV.qla();
                }
                else {
                    this.qj.wN.ReZ();
                    this.qj.wN.JQp(true);
                }
                if(this.ub == null || this.ub.JQp()) {
                    this.fDm = true;
                }
            }
            this.xf();
        }
        return true;
    }

    // 检测为 Lambda 实现
    private void xf() [...]
}

