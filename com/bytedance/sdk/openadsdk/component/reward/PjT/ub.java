package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.reward.ReZ;
import com.bytedance.sdk.openadsdk.component.reward.qj;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.model.ltE;
import com.bytedance.sdk.openadsdk.core.xf.PjT.Zh;
import com.bytedance.sdk.openadsdk.core.xf.cr.PjT.PjT;
import com.bytedance.sdk.openadsdk.cr.XX;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;
import s.a;
import v.c;
import x.b;

public class ub {
    private final Owx Au;
    private final String DWo;
    protected boolean JQp;
    private XX Owx;
    protected boolean PjT;
    boolean ReZ;
    private FrameLayout SM;
    private final Activity XX;
    boolean Zh;
    final boolean cr;
    b cz;
    private String fDm;
    private boolean gK;
    private PjT ltE;
    private long qj;
    private HashSet qla;
    private final com.bytedance.sdk.openadsdk.component.reward.PjT.PjT ub;
    private boolean xE;
    private long xf;
    private int xs;

    public ub(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        this.PjT = false;
        this.Zh = false;
        this.JQp = false;
        this.xs = -1;
        this.ub = pjT0;
        this.XX = pjT0.rds;
        this.Au = pjT0.Zh;
        this.cr = pjT0.cr;
        this.DWo = pjT0.JQp;
        this.qla = new HashSet();
    }

    public long Au() {
        return this.xf;
    }

    public void Co() {
        b b0 = this.cz;
        if(b0 instanceof com.bytedance.sdk.openadsdk.core.xf.cr.PjT) {
            ((com.bytedance.sdk.openadsdk.core.xf.cr.PjT)b0).Zd();
        }
    }

    public void DWo() {
        try {
            if(this.Zh()) {
                this.cz.PjT();
            }
        }
        catch(Throwable throwable0) {
            RD.Zh(("RewardFullVideoPlayerManager onPause throw Exception :" + throwable0.getMessage()), new Object[0]);
        }
    }

    public boolean JQp() {
        return this.cz != null && this.cz.xE();
    }

    public void Jo() {
        b b0 = this.cz;
        if(b0 instanceof com.bytedance.sdk.openadsdk.core.xf.cr.PjT) {
            ((com.bytedance.sdk.openadsdk.core.xf.cr.PjT)b0).qZS();
        }
    }

    public double KM() {
        double f;
        ltE ltE0 = this.Au.xs();
        if(gK.cr(this.Au) && ltE0 != null) {
            f = (double)ltE0.Zh();
        }
        else if(!gK.JQp(this.Au) || ltE0 == null) {
            c c0 = this.Au.MWx();
            f = c0 == null ? 0.0 : c0.C() * ((double)c0.t());
        }
        else {
            f = (double)ltE0.cr();
        }
        qj qj0 = this.ub.uQg;
        if(qj0 != null) {
            qj0.PjT(((long)f));
        }
        return f;
    }

    public boolean Lrd() {
        return this.cz != null && this.cz.xf() == null;
    }

    public long Owx() {
        return this.cz == null ? 0L : this.cz.Au() + this.cz.cz();
    }

    private boolean PjT(long v, boolean z) {
        if(this.cz != null && this.Au.MWx() != null) {
            String s = CacheDirFactory.getICacheDir(this.Au.hx()).PjT();
            File file0 = new File(s, "");
            if(file0.exists() && file0.length() > 0L) {
                this.Zh = true;
            }
            Zh zh0 = Owx.PjT(s, this.Au);
            zh0.Zh(this.Au.dIF());
            zh0.PjT(this.SM.getWidth());
            zh0.Zh(this.SM.getHeight());
            zh0.ReZ(this.Au.xR());
            zh0.PjT(v);
            zh0.PjT(z);
            if(this.ub.Zh.cr() && !this.ub.yIW.Au() && Owx.JQp(this.Au)) {
                zh0.cr = 1;
            }
            return this.cz.PjT(zh0);
        }
        return false;
    }

    public XX PjT() {
        return this.Owx;
    }

    public void PjT(int v, int v1) {
        if(this.cz != null) {
            com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
            qla$PjT0.Zh(this.qj());
            qla$PjT0.ReZ(this.Owx());
            qla$PjT0.PjT(this.XX());
            qla$PjT0.PjT(v);
            qla$PjT0.Zh(v1);
            com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.cr(this.cz.xs(), qla$PjT0);
        }
    }

    public void PjT(int v, String s) {
        this.xs = v;
        this.fDm = s;
    }

    public void PjT(long v) {
        this.qj = v;
    }

    public void PjT(long v, long v1) {
        this.xf = v;
        this.Zh(v, v1);
    }

    public void PjT(FrameLayout frameLayout0, XX xX0) {
        if(this.xE) {
            return;
        }
        this.xE = true;
        this.SM = frameLayout0;
        this.Owx = xX0;
        if(Owx.JQp(this.Au)) {
            this.cz = new com.bytedance.sdk.openadsdk.core.xf.cr.PjT(this.XX, this.SM, this.Au, xX0);
            this.ReZ(this.gK);
            PjT pjT$PjT0 = this.ltE;
            if(pjT$PjT0 != null) {
                ((com.bytedance.sdk.openadsdk.core.xf.cr.PjT)this.cz).PjT(pjT$PjT0);
            }
        }
        else {
            ReZ reZ0 = new ReZ(this.Au, xX0);
            this.cz = reZ0;
            PjT pjT$PjT1 = this.ltE;
            if(pjT$PjT1 != null) {
                reZ0.PjT(pjT$PjT1);
            }
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0) {
        if(this.ub.DWo.get() || (!this.ub.dwk || cRA.ReZ(this.ub.Zh) || !Owx.JQp(this.ub.Zh) && com.bytedance.sdk.openadsdk.core.ub.cr().xs(String.valueOf(this.ub.cz)) == 1 && this.ub.yIW.cr() || gK.cr(this.ub.Zh) || gK.JQp(this.ub.Zh) || this.JQp)) {
            return;
        }
        if(!zh0.cz()) {
            return;
        }
        this.ub.OMu.removeMessages(300);
        Message message0 = Message.obtain();
        message0.what = 300;
        this.ub.OMu.sendMessageDelayed(message0, 5000L);
    }

    public void PjT(PjT pjT$PjT0) {
        this.ltE = pjT$PjT0;
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0) {
        try {
            this.JQp = false;
            if(this.cz()) {
                this.wN();
                this.Zh(zh0);
                return;
            }
            if(this.cr()) {
                this.qla();
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + throwable0.getMessage());
    }

    public void PjT(XX xX0) {
        this.Owx = xX0;
    }

    public void PjT(String s, boolean z) {
        if(this.cz != null) {
            long v = this.XX();
            if(this.Au.Ik()) {
                v = this.ub.ReZ();
            }
            long v1 = this.cz.cz();
            a a0 = this.cz.xf();
            JSONObject jSONObject0 = wN.PjT(this.Au, v1, a0);
            try {
                jSONObject0.put("auto_click", z);
            }
            catch(Exception unused_ex) {
            }
            int v2 = this.gK();
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(this.Au, this.DWo, s, v, v2, jSONObject0, this.Owx);
            this.Owx();
            this.gK();
        }
        this.Jo();
    }

    public void PjT(x.b.a b$a0) {
        b b0 = this.cz;
        if(b0 != null) {
            b0.PjT(b$a0);
        }
    }

    public void PjT(boolean z) {
        this.PjT = z;
    }

    public void PjT(boolean z, com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0, boolean z1) {
        if(z1 && !z && !this.JQp) {
            if(this.cr()) {
                this.qla();
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
                return;
            }
            this.wN();
            this.Zh(zh0);
            Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
        }
    }

    public void PjT(boolean z, String s) {
        b b0 = this.cz;
        if(b0 != null) {
            b0.PjT(z, s);
        }
    }

    public boolean PjT(long v, boolean z, Map map0, com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0) {
        boolean z1 = false;
        if(!this.tT()) {
            return false;
        }
        if(!gK.cr(this.ub.Zh) && !gK.JQp(this.ub.Zh)) {
            if(!z || !this.Lrd()) {
                this.PjT(zh0);
            }
            try {
                z1 = this.PjT(v, this.ub.xH);
            }
            catch(Exception exception0) {
                Log.e("TTAD.RFVideoPlayerMag", "playVideo: ", exception0);
            }
            if(z1 && !z) {
                this.ub.Yo.PjT(map0);
            }
            return z1;
        }
        return true;
    }

    public void Qf() {
        b b0 = this.cz;
        if(b0 instanceof com.bytedance.sdk.openadsdk.core.xf.cr.PjT) {
            ((com.bytedance.sdk.openadsdk.core.xf.cr.PjT)b0).Jo();
        }
    }

    public long RD() {
        return this.cz == null ? 0L : this.cz.Au();
    }

    public w.a ReZ() {
        b b0 = this.cz;
        if(b0 != null) {
            return b0 instanceof ReZ ? ((ReZ)b0).gK() : b0.xs();
        }
        return null;
    }

    public void ReZ(boolean z) {
        this.gK = z;
        if(!(this.cz instanceof com.bytedance.sdk.openadsdk.core.xf.cr.PjT)) {
            return;
        }
        if(z) {
            int v = this.Au.MWx().t();
            ((com.bytedance.sdk.openadsdk.core.xf.cr.PjT)this.cz).Zh(v);
            return;
        }
        this.Au.MWx().d(1);
        ((com.bytedance.sdk.openadsdk.core.xf.cr.PjT)this.cz).Zh(1);
    }

    public long SM() {
        return this.qj;
    }

    public boolean Sks() {
        b b0 = this.cz;
        if(b0 != null) {
            if(b0.xf() != null) {
                a a0 = this.cz.xf();
                if(a0.XX() || a0.Au()) {
                    b b1 = this.cz;
                    if(b1 instanceof com.bytedance.sdk.openadsdk.core.xf.cr.PjT) {
                        ((com.bytedance.sdk.openadsdk.core.xf.cr.PjT)b1).Co();
                    }
                    return true;
                }
            }
            else if(this.cz()) {
                this.PjT(false);
                b b2 = this.cz;
                if(b2 instanceof com.bytedance.sdk.openadsdk.core.xf.cr.PjT) {
                    ((com.bytedance.sdk.openadsdk.core.xf.cr.PjT)b2).Co();
                }
                return true;
            }
        }
        return false;
    }

    public long XX() {
        return this.cz == null ? this.qj : this.cz.JQp();
    }

    public boolean Yo() {
        return this.cz == null || this.cz.xf() == null ? false : this.cz.xf().PjT();
    }

    // 去混淆评级： 低(20)
    public View ZX() {
        return this.cz instanceof com.bytedance.sdk.openadsdk.core.xf.cr.PjT ? ((View)((com.bytedance.sdk.openadsdk.core.xf.cr.PjT)this.cz).wN()) : null;
    }

    private void Zh(long v, long v1) {
        int v2 = (int)Math.abs(((long)this.xs) - v);
        if(this.xs >= 0 && v2 <= 500 && ((long)this.xs) <= v1 && v2 < 500 && !this.qla.contains(this.fDm)) {
            if(((long)this.xs) > v) {
                fDm.ReZ().postDelayed(new Runnable() {
                    final ub PjT;

                    @Override
                    public void run() {
                        ub.this.iZZ();
                        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = ub.this.ub;
                        int v = ub.this.xs;
                        String s = ub.this.fDm;
                        pjT0.yIW.PjT(v, s);
                    }
                }, ((long)v2));
            }
            else {
                this.iZZ();
                this.ub.yIW.PjT(this.xs, this.fDm);
            }
            this.qla.add(this.fDm);
        }
    }

    protected void Zh(com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0) {
        if(this.Sks() && zh0 != null) {
            zh0.PjT(this.SM(), true);
        }
    }

    public void Zh(boolean z) {
        this.ReZ = z;
    }

    public boolean Zh() {
        return this.cz != null && this.cz.xf() != null && this.cz.xf().cz();
    }

    public boolean cRA() {
        return this.ReZ;
    }

    public boolean cr() {
        return this.cz != null && this.cz.xf() != null && this.cz.xf().XX();
    }

    public boolean cz() {
        return this.PjT;
    }

    public void fDm() {
        b b0 = this.cz;
        if(b0 != null) {
            b0.cr();
        }
    }

    public int gK() {
        return this.cz == null ? 0 : this.cz.DWo();
    }

    public void iZZ() {
        try {
            if(this.Zh()) {
                this.JQp = true;
                this.xE();
            }
        }
        catch(Exception exception0) {
            RD.Zh("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + exception0.getMessage());
        }
    }

    public int ltE() {
        return this.cz == null ? 0 : this.cz.XX();
    }

    public long qj() {
        return this.cz == null ? 0L : this.cz.cz();
    }

    public void qla() {
        b b0 = this.cz;
        if(b0 != null) {
            b0.Zh();
        }
    }

    public boolean tT() {
        return this.cz != null;
    }

    public long ub() {
        return this.cz == null ? 0L : this.cz.Au();
    }

    private void wN() {
        if(this.cz != null && this.cz.xf() != null) {
            this.qj = this.cz.JQp();
            if(this.cz.xf().ReZ() || !this.cz.xf().Zh()) {
                this.cz.PjT();
                this.cz.ReZ();
                this.PjT = true;
            }
        }
    }

    public void xE() {
        b b0 = this.cz;
        if(b0 != null) {
            b0.PjT();
        }
    }

    public a xf() {
        return this.cz == null ? null : this.cz.xf();
    }

    public void xs() {
        b b0 = this.cz;
        if(b0 == null) {
            return;
        }
        b0.ReZ();
        this.cz = null;
    }

    public void yIW() {
        this.xs();
    }
}

