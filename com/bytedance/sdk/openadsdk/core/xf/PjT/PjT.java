package com.bytedance.sdk.openadsdk.core.xf.PjT;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.qj.cz;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf.Zh.JQp;
import com.bytedance.sdk.openadsdk.core.xf.cr.ReZ;
import com.bytedance.sdk.openadsdk.cr.PjT.cr;
import com.bytedance.sdk.openadsdk.cr.XX;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import x.b.a;
import x.b.d;
import x.b;
import x.c;

public abstract class PjT implements com.bytedance.sdk.component.utils.KM.PjT, com.bytedance.sdk.openadsdk.core.xf.Zh.PjT, b {
    @NonNull
    protected final Owx Au;
    private boolean Co;
    protected long DWo;
    protected SurfaceTexture JQp;
    private long Jo;
    protected long KM;
    protected boolean Lrd;
    protected AtomicBoolean Owx;
    protected String PjT;
    protected Runnable Qf;
    protected boolean RD;
    protected final KM ReZ;
    protected long SM;
    protected boolean Sks;
    protected JQp XX;
    protected cz Yo;
    private long ZX;
    protected final int Zh;
    protected final ViewGroup cRA;
    protected SurfaceHolder cr;
    protected ReZ cz;
    protected boolean fDm;
    protected boolean gK;
    protected a iZZ;
    protected boolean ltE;
    private final AtomicBoolean qZS;
    @NonNull
    protected final Context qj;
    protected boolean qla;
    protected Zh tT;
    protected boolean ub;
    private int wN;
    protected boolean xE;
    protected final List xf;
    protected boolean xs;
    protected WeakReference yIW;

    public PjT(Context context0, @NonNull Owx owx0, ViewGroup viewGroup0) {
        this.PjT = "TTAD.VideoController";
        this.Zh = 100;
        this.ReZ = new KM(Looper.getMainLooper(), this);
        this.SM = 0L;
        this.DWo = 0L;
        this.xf = new ArrayList();
        this.xs = false;
        this.fDm = false;
        this.qla = true;
        this.ub = false;
        this.gK = false;
        this.ltE = false;
        this.Owx = new AtomicBoolean(false);
        this.Sks = true;
        this.Qf = () -> {
            com.bytedance.sdk.openadsdk.core.xf.PjT.PjT.2 pjT$20 = new Runnable() {
                final PjT PjT;

                @Override
                public void run() {
                    if(PjT.this.cz != null) {
                        PjT.this.cz.DWo();
                    }
                }
            };
            PjT.this.ReZ.postAtFrontOfQueue(pjT$20);
        };
        this.Jo = 0L;
        this.Co = true;
        this.wN = 1;
        this.qZS = new AtomicBoolean(false);
        this.Au = owx0;
        this.qj = context0;
        this.cRA = viewGroup0;
        this.PjT = this.PjT + this.hashCode();
    }

    @Override  // x.b
    public final long Au() {
        return this.cz == null ? 0L : this.cz.xE();
    }

    @Override  // x.b
    public final int DWo() {
        return z.a.a(this.DWo, this.KM);
    }

    @Override  // x.b
    public long JQp() {
        return this.SM;
    }

    @Override  // x.a
    public final void JQp(c c0, View view0) {
        this.PjT(c0, view0, false);
    }

    protected void JQp(boolean z) {
        this.ltE = z;
    }

    private void Jo() {
        JQp jQp0 = this.XX;
        if(jQp0 != null) {
            jQp0.cr(0);
            this.XX.PjT(false, false);
            this.XX.ReZ(false);
            this.XX.JQp();
            this.XX.XX();
        }
    }

    protected final void KM() {
        com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(this.Au, this.XX, this.tT);
    }

    public boolean Lrd() {
        return this.Co;
    }

    protected void Owx() {
        if(this.xf.isEmpty()) {
            return;
        }
        for(Object object0: new ArrayList(this.xf)) {
            ((Runnable)object0).run();
        }
        this.xf.clear();
    }

    private void PjT(long v, boolean z) {
        if(this.cz == null) {
            return;
        }
        if(z) {
            this.Jo();
        }
        this.cz.PjT(v);
    }

    @Override  // x.b
    public final void PjT() {
        ReZ reZ0 = this.cz;
        if(reZ0 != null) {
            reZ0.qj();
        }
        if(!this.RD && this.Owx.get()) {
            this.Yo();
        }
    }

    public final void PjT(int v) {
        Context context0 = this.qj;
        if(context0 == null) {
            return;
        }
        if(!(context0 instanceof Activity)) {
            return;
        }
        Activity activity0 = (Activity)context0;
        try {
            activity0.setRequestedOrientation(v);
        }
        catch(Throwable unused_ex) {
        }
        if(v != 0 && v != 8) {
            activity0.getWindow().setFlags(0x400, 0x400);
            return;
        }
        activity0.getWindow().clearFlags(0x400);
    }

    @Override  // x.b
    public void PjT(long v) {
        this.SM = v;
        this.DWo = Math.max(this.DWo, v);
    }

    protected void PjT(long v, long v1) {
        if(this.qZS.get()) {
            return;
        }
        if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().ReZ() && ((double)v) * 1.0 / ((double)v1) > 0.3) {
            this.qZS.set(true);
            if(this.Au != null) {
                com.bytedance.sdk.openadsdk.cz.Zh.PjT().PjT("videoPercent30", this.Au);
            }
        }
    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public void PjT(Message message0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.PjT
    public final void PjT(com.bytedance.sdk.openadsdk.core.widget.gK.PjT gK$PjT0, String s) {
        switch(gK$PjT0) {
            case 1: {
                this.PjT();
                return;
            }
            case 2: {
                this.ReZ();
                return;
            }
            case 3: {
                this.Zh();
                this.ub = false;
                this.gK = true;
            }
        }
    }

    protected final void PjT(XX xX0) {
        if(!this.Owx.compareAndSet(false, true)) {
            return;
        }
        cz cz0 = this.Yo;
        if(cz0 != null) {
            cz0.PjT(this.Au(), this.fDm());
        }
        com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
        qla$PjT0.PjT(this.Lrd());
        qla$PjT0.ReZ(this.Au());
        com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(ub.PjT(), this.XX, qla$PjT0, xX0);
    }

    protected void PjT(Runnable runnable0) {
        if(this.XX.Sks() && this.xs) {
            runnable0.run();
            return;
        }
        this.Zh(runnable0);
    }

    protected final void PjT(v.a a0) {
        com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
        qla$PjT0.Zh(this.cz());
        qla$PjT0.ReZ(this.Au() / ((long)this.Qf()));
        qla$PjT0.PjT(this.JQp());
        qla$PjT0.PjT(a0);
        com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.ReZ(this.Sks(), qla$PjT0);
    }

    @Override  // x.b
    public final void PjT(a b$a0) {
        this.iZZ = b$a0;
    }

    @Override  // x.b
    public final void PjT(x.b.c b$c0) {
        this.yIW = new WeakReference(b$c0);
    }

    @Override  // x.b
    public void PjT(d b$d0) {
    }

    @Override  // x.a
    public final void PjT(c c0, int v) {
        if(this.cz == null) {
            return;
        }
        this.PjT(this.ZX, this.ReZ(v));
    }

    @Override  // x.a
    public final void PjT(c c0, int v, boolean z) {
        if(this.qj == null) {
            return;
        }
        long v1 = (long)(((float)(((long)v) * this.KM)) * 1.0f / 100.0f);
        this.ZX = this.KM > 0L ? ((long)(((int)v1))) : 0L;
        JQp jQp0 = this.XX;
        if(jQp0 != null) {
            jQp0.PjT(this.ZX);
        }
    }

    @Override  // x.a
    public void PjT(c c0, SurfaceTexture surfaceTexture0) {
        this.xs = true;
        this.JQp = surfaceTexture0;
        ReZ reZ0 = this.cz;
        if(reZ0 != null) {
            reZ0.PjT(surfaceTexture0);
            this.cz.PjT(this.xs);
        }
        this.Owx();
    }

    @Override  // x.a
    public void PjT(c c0, SurfaceHolder surfaceHolder0) {
        this.xs = true;
        this.cr = surfaceHolder0;
        ReZ reZ0 = this.cz;
        if(reZ0 == null) {
            return;
        }
        reZ0.PjT(surfaceHolder0);
        this.Owx();
    }

    public void PjT(c c0, View view0, boolean z) {
    }

    @Override  // x.a
    public final void PjT(c c0, View view0, boolean z, boolean z1) {
        if(this.qla) {
            this.PjT();
        }
        if(z && !this.qla && !this.cRA()) {
            this.XX.Zh(!this.yIW(), false);
            this.XX.PjT(z1, true, false);
        }
        if(this.cz != null && this.cz.cz()) {
            this.XX.cz();
            this.XX.JQp();
            return;
        }
        this.XX.cz();
    }

    @Override  // x.b
    public void PjT(boolean z) {
        this.qla = z;
        JQp jQp0 = this.XX;
        if(jQp0 != null) {
            jQp0.cr(z);
        }
    }

    @Override  // x.b
    public final void PjT(boolean z, String s) {
        this.xE = z;
        ReZ reZ0 = this.cz;
        if(reZ0 != null) {
            reZ0.Zh(z);
            com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(this.XX, z, s);
        }
        if(this.Yo != null) {
            if(com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.x()) {
                this.Yo.PjT(z);
                return;
            }
            com.bytedance.sdk.openadsdk.core.xf.PjT.PjT.3 pjT$30 = new Runnable() {
                final PjT Zh;

                @Override
                public void run() {
                    PjT.this.Yo.PjT(z);
                }
            };
            this.ReZ.post(pjT$30);
        }
    }

    public int Qf() {
        return this.wN;
    }

    // 检测为 Lambda 实现
    protected void RD() [...]

    private boolean ReZ(int v) {
        return this.XX.Zh(v);
    }

    @Override  // x.b
    public void ReZ(long v) {
        this.KM = v;
    }

    @Override  // x.a
    public final void ReZ(c c0, View view0) {
        JQp jQp0 = this.XX;
        if(jQp0 != null) {
            jQp0.SM();
        }
        this.PjT(true, 3);
    }

    @Override  // x.b
    public final void ReZ(boolean z) {
        this.Co = z;
    }

    @Override  // x.b
    public final long SM() {
        return this.JQp() + this.cz();
    }

    public final JQp Sks() {
        return this.XX;
    }

    @Override  // x.b
    public final int XX() {
        return this.cz == null ? 0 : this.cz.qla();
    }

    protected final void Yo() {
        com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
        qla$PjT0.PjT(this.JQp());
        qla$PjT0.ReZ(this.Au() / ((long)this.Qf()));
        qla$PjT0.Zh(this.cz());
        com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(this.XX, qla$PjT0);
    }

    protected final void ZX() {
        cr.PjT(com.bytedance.sdk.openadsdk.Lrd.PjT.PjT(this.Au.yks(), true, this.Au), 5, this.Au.dIF());
    }

    public void Zh(int v) {
        this.wN = v;
    }

    @Override  // x.b
    public void Zh(long v) {
        this.Jo = v;
    }

    protected final void Zh(XX xX0) {
        com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
        qla$PjT0.PjT(this.JQp());
        qla$PjT0.ReZ(this.Au() / ((long)this.Qf()));
        qla$PjT0.Zh(this.cz());
        qla$PjT0.cr(this.XX());
        com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.Zh(this.XX, qla$PjT0, xX0);
    }

    protected void Zh(Runnable runnable0) {
        this.xf.add(runnable0);
    }

    @Override  // x.b
    public void Zh(v.b b0) {
        this.tT = (Zh)b0;
        this.xE = ((Zh)b0).Au();
        b0.cr(String.valueOf(this.Au.joj()));
    }

    @Override  // x.a
    public final void Zh(c c0, int v) {
        JQp jQp0 = this.XX;
        if(jQp0 != null) {
            jQp0.cz();
        }
    }

    @Override  // x.a
    public void Zh(c c0, SurfaceTexture surfaceTexture0) {
        this.xs = false;
        ReZ reZ0 = this.cz;
        if(reZ0 != null) {
            reZ0.PjT(false);
        }
        this.JQp = null;
        this.Owx();
    }

    @Override  // x.a
    public void Zh(c c0, SurfaceHolder surfaceHolder0) {
        this.xs = false;
        this.cr = null;
        ReZ reZ0 = this.cz;
        if(reZ0 != null) {
            reZ0.PjT(false);
        }
    }

    @Override  // x.a
    public final void Zh(c c0, View view0) {
        this.Zh(c0, view0, false, false);
    }

    public final void Zh(c c0, View view0, boolean z, boolean z1) {
        this.JQp(!this.ltE);
        Context context0 = this.qj;
        if(context0 == null) {
            return;
        }
        if(!(context0 instanceof Activity)) {
            return;
        }
        if(this.ltE) {
            this.PjT((z ? 8 : 0));
            JQp jQp0 = this.XX;
            if(jQp0 != null) {
                jQp0.PjT(this.cRA);
                this.XX.ReZ(false);
            }
        }
        else {
            this.PjT(1);
            JQp jQp1 = this.XX;
            if(jQp1 != null) {
                jQp1.Zh(this.cRA);
                this.XX.ReZ(false);
            }
        }
        x.b.c b$c0 = this.yIW == null ? null : ((x.b.c)this.yIW.get());
        if(b$c0 != null) {
            b$c0.PjT(this.ltE);
        }
    }

    @Override  // x.b
    public final void Zh(boolean z) {
        this.fDm = z;
    }

    public final boolean cRA() {
        return this.cz == null || this.cz.Zh();
    }

    public final void cr(long v) {
        this.SM = v;
        this.DWo = Math.max(this.DWo, v);
        JQp jQp0 = this.XX;
        if(jQp0 != null) {
            jQp0.PjT();
        }
        ReZ reZ0 = this.cz;
        if(reZ0 != null) {
            reZ0.PjT(true, this.SM, this.xE);
        }
    }

    @Override  // x.a
    public final void cr(c c0, View view0) {
        if(this.ltE) {
            this.JQp(false);
            JQp jQp0 = this.XX;
            if(jQp0 != null) {
                jQp0.Zh(this.cRA);
            }
            this.PjT(1);
            return;
        }
        this.PjT(true, 3);
    }

    @Override  // x.b
    public void cr(boolean z) {
        this.Sks = z;
    }

    @Override  // x.b
    public final long cz() {
        return this.cz == null ? 0L : this.cz.fDm();
    }

    @Override  // x.b
    public boolean fDm() {
        return this.xE;
    }

    private boolean gK() {
        return this.XX == null ? false : this.XX.xs() instanceof com.bykv.vk.openvk.PjT.PjT.PjT.cz.cr;
    }

    protected final void iZZ() {
        com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
        qla$PjT0.PjT(this.JQp());
        qla$PjT0.ReZ(this.Au() / ((long)this.Qf()));
        qla$PjT0.Zh(this.cz());
        com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.Zh(this.Sks(), qla$PjT0);
    }

    protected void ltE() {
        if(this.cz == null) {
            return;
        }
        if(this.gK()) {
            if(this.JQp != null && this.JQp != this.cz.ltE()) {
                this.cz.PjT(this.JQp);
            }
        }
        else if(this.cr != null && this.cr != this.cz.gK()) {
            this.cz.PjT(this.cr);
        }
    }

    @Override  // x.b
    public boolean qj() {
        return this.ub;
    }

    @Override  // x.b
    public boolean qla() {
        return this.fDm;
    }

    public boolean tT() {
        return this.qla;
    }

    @Override  // x.b
    public boolean ub() {
        return true;
    }

    @Override  // x.b
    public final boolean xE() {
        return this.Lrd;
    }

    @Override  // x.b
    public s.a xf() {
        return this.cz;
    }

    @Override  // x.b
    public c xs() {
        return this.Sks();
    }

    public final boolean yIW() {
        return this.cz != null && this.cz.cz();
    }

    class com.bytedance.sdk.openadsdk.core.xf.PjT.PjT.1 implements Runnable {
        final PjT PjT;

        @Override
        public void run() {
            PjT.this.RD();
        }
    }

}

