package com.bytedance.sdk.openadsdk.component.Au;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.Zh.PjT.PjT;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import x.b.a;

public class ReZ implements PjT {
    private boolean JQp;
    private Context PjT;
    private Owx ReZ;
    private FrameLayout Zh;
    private Zh cr;

    public ReZ(Context context0) {
        this.JQp = false;
        this.PjT = context0.getApplicationContext();
    }

    public void Au() {
        try {
            if(this.JQp()) {
                this.DWo();
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("TTAppOpenVideoManager", "onContinue throw Exception :" + throwable0.getMessage());
        }
    }

    public void DWo() {
        Zh zh0 = this.cr;
        if(zh0 != null) {
            zh0.Zh();
        }
    }

    public boolean JQp() {
        return this.cr != null && this.cr.xf() != null && this.cr.xf().XX();
    }

    public void PjT(int v) {
        if(this.cr != null) {
            com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
            qla$PjT0.PjT(this.xf());
            qla$PjT0.ReZ(this.fDm());
            qla$PjT0.Zh(this.xs());
            qla$PjT0.ReZ(v);
            qla$PjT0.cr(this.cr.XX());
            this.cr.PjT(qla$PjT0);
        }
    }

    public void PjT(FrameLayout frameLayout0, Owx owx0) {
        this.Zh = frameLayout0;
        this.ReZ = owx0;
        this.cr = new Zh(this.PjT, frameLayout0, owx0);
    }

    public void PjT(a b$a0) {
        Zh zh0 = this.cr;
        if(zh0 != null) {
            zh0.PjT(b$a0);
        }
    }

    public void PjT(boolean z) {
        this.JQp = z;
    }

    public boolean PjT() {
        String s;
        if(Build.VERSION.SDK_INT >= 23) {
            s = CacheDirFactory.getICacheDir(0).Zh();
        }
        else {
            try {
                s = "";
                s = com.bytedance.sdk.openadsdk.component.XX.PjT.PjT();
            }
            catch(Throwable unused_ex) {
            }
        }
        com.bytedance.sdk.openadsdk.core.xf.PjT.Zh zh0 = Owx.PjT(s, this.ReZ);
        zh0.Zh(this.ReZ.dIF());
        zh0.PjT(this.Zh.getWidth());
        zh0.Zh(this.Zh.getHeight());
        zh0.ReZ(this.ReZ.xR());
        zh0.PjT(0L);
        zh0.PjT(true);
        return this.cr.PjT(zh0);
    }

    public boolean PjT(FrameLayout frameLayout0, com.bytedance.sdk.openadsdk.component.PjT pjT0, Owx owx0) {
        this.PjT(frameLayout0, owx0);
        this.PjT(pjT0);
        try {
            return this.PjT();
        }
        catch(Throwable throwable0) {
            RD.Zh("TTAppOpenVideoManager", new Object[]{"open_ad", "ttAppOpenAd playVideo error: " + throwable0.getMessage()});
            return false;
        }
    }

    public boolean ReZ() {
        return this.cr != null && this.cr.xf() != null && this.cr.xf().Zh();
    }

    public void SM() {
        Zh zh0 = this.cr;
        if(zh0 == null) {
            return;
        }
        zh0.ReZ();
        this.cr = null;
    }

    public void XX() {
        try {
            if(this.cr()) {
                this.cr.PjT();
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("TTAppOpenVideoManager", new Object[]{"open_ad", "AppOpenVideoManager onPause throw Exception :" + throwable0.getMessage()});
        }
    }

    public boolean Zh() {
        return this.JQp;
    }

    public boolean cr() {
        return this.cr != null && this.cr.xf() != null && this.cr.xf().cz();
    }

    public boolean cz() {
        return this.cr != null && this.cr.xE();
    }

    public long fDm() {
        return this.cr == null ? 0L : this.cr.Au() + this.cr.cz();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Zh.PjT$PjT
    public long getVideoProgress() {
        return this.xf();
    }

    public void qj() {
        Zh zh0 = this.cr;
        if(zh0 == null) {
            return;
        }
        this.PjT = null;
        zh0.ReZ();
        this.cr = null;
    }

    public long xf() {
        return this.cr == null ? 0L : this.cr.JQp();
    }

    public long xs() {
        return this.cr == null ? 0L : this.cr.cz();
    }
}

