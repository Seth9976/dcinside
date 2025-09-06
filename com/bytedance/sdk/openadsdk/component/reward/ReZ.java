package com.bytedance.sdk.openadsdk.component.reward;

import android.os.CountDownTimer;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.cr.XX;
import s.a;
import v.c;
import x.b.d;
import x.b;

public class ReZ implements b {
    static class PjT implements a {
        private final XX Au;
        private x.b.a JQp;
        private final long PjT;
        private int ReZ;
        private final w.a XX;
        private long Zh;
        private CountDownTimer cr;
        private long cz;

        public PjT(long v, w.a a0, XX xX0) {
            this.ReZ = 0;
            this.PjT = v;
            this.XX = a0;
            this.Au = xX0;
        }

        @Override  // s.a
        public boolean Au() {
            return this.ReZ == 0;
        }

        public void DWo() {
            this.ReZ = 2;
            this.Zh = this.cz;
            CountDownTimer countDownTimer0 = this.cr;
            if(countDownTimer0 != null) {
                countDownTimer0.cancel();
                this.cr = null;
            }
        }

        @Override  // s.a
        public int JQp() {
            return 0;
        }

        public void PjT(long v) {
            this.Zh = v;
        }

        public void PjT(x.b.a b$a0) {
            this.JQp = b$a0;
        }

        @Override  // s.a
        public boolean PjT() {
            return false;
        }

        @Override  // s.a
        public boolean ReZ() {
            return false;
        }

        public void SM() {
            if(this.ReZ == 1) {
                return;
            }
            this.ReZ = 1;
            long v = this.fDm();
            long v1 = v - this.Zh;
            com.bytedance.sdk.openadsdk.component.reward.ReZ.PjT.1 reZ$PjT$10 = new CountDownTimer(v1, 200L) {
                final PjT ReZ;

                @Override  // android.os.CountDownTimer
                public void onFinish() {
                    PjT.this.ReZ = 4;
                    PjT.this.cz = v;
                    if(PjT.this.JQp != null) {
                        PjT.this.JQp.PjT(PjT.this.qla(), 100);
                    }
                    com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
                    qla$PjT0.PjT(v);
                    qla$PjT0.ReZ(v);
                    qla$PjT0.Zh(0L);
                    qla$PjT0.cr(0);
                    com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.Zh(PjT.this.XX, qla$PjT0, PjT.this.Au);
                }

                @Override  // android.os.CountDownTimer
                public void onTick(long v) {
                    long v1 = PjT.this.Zh;
                    long v2 = v1 - v + v1;
                    PjT.this.cz = v2;
                    if(PjT.this.JQp != null) {
                        PjT.this.JQp.PjT(v2, v);
                    }
                }
            };
            this.cr = reZ$PjT$10;
            reZ$PjT$10.start();
        }

        @Override  // s.a
        public boolean XX() {
            return this.ReZ == 2;
        }

        @Override  // s.a
        public boolean Zh() {
            return false;
        }

        @Override  // s.a
        public int cr() {
            return 0;
        }

        @Override  // s.a
        public boolean cz() {
            return this.ReZ == 1;
        }

        public long fDm() {
            return this.PjT;
        }

        public void qj() {
            this.ReZ = 0;
            CountDownTimer countDownTimer0 = this.cr;
            if(countDownTimer0 != null) {
                countDownTimer0.cancel();
                this.cr = null;
            }
            if(this.JQp != null) {
                this.JQp = null;
            }
        }

        public long qla() {
            return this.cz;
        }

        public long xf() [...] // Inlined contents

        public int xs() [...] // Inlined contents
    }

    private com.bytedance.sdk.openadsdk.core.xf.cr.PjT.PjT Au;
    private boolean JQp;
    private final PjT PjT;
    private long ReZ;
    private final w.a XX;
    private boolean Zh;
    private boolean cr;
    private final Owx cz;

    public ReZ(Owx owx0, XX xX0) {
        this.Zh = true;
        this.ReZ = 0L;
        this.cr = false;
        com.bytedance.sdk.openadsdk.component.reward.ReZ.1 reZ$10 = new w.a() {
            final ReZ PjT;

        };
        this.XX = reZ$10;
        this.cz = owx0;
        c c0 = owx0.MWx();
        long v = 10L;
        long v1 = c0 == null ? 10L : ((long)c0.C());
        if(v1 <= 0L) {
            c0.j(10.0);
        }
        else {
            v = v1;
        }
        this.PjT = new PjT(v * 1000L, reZ$10, xX0);
    }

    @Override  // x.b
    public long Au() {
        return this.PjT.fDm();
    }

    @Override  // x.b
    public int DWo() {
        return z.a.a(this.PjT.cz, this.PjT.PjT);
    }

    @Override  // x.b
    public long JQp() {
        return this.PjT.qla();
    }

    @Override  // x.b
    public void PjT() {
        this.PjT.DWo();
        com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
        qla$PjT0.PjT(this.JQp());
        qla$PjT0.ReZ(this.Au());
        qla$PjT0.Zh(0L);
        com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(this.XX, qla$PjT0);
        com.bytedance.sdk.openadsdk.core.xf.cr.PjT.PjT pjT$PjT0 = this.Au;
        if(pjT$PjT0 != null) {
            pjT$PjT0.PjT(2);
        }
    }

    @Override  // x.b
    public void PjT(long v) {
        this.PjT.PjT(v);
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.xf.cr.PjT.PjT pjT$PjT0) {
        this.Au = pjT$PjT0;
    }

    @Override  // x.b
    public void PjT(x.b.a b$a0) {
        this.PjT.PjT(b$a0);
    }

    @Override  // x.b
    public void PjT(x.b.c b$c0) {
    }

    @Override  // x.b
    public void PjT(d b$d0) {
    }

    @Override  // x.b
    public void PjT(boolean z) {
        this.Zh = z;
    }

    @Override  // x.b
    public void PjT(boolean z, int v) {
        this.ReZ();
    }

    @Override  // x.b
    public void PjT(boolean z, String s) {
        this.cr = z;
    }

    @Override  // x.b
    public boolean PjT(v.b b0) {
        this.cr = b0.Au();
        if(b0.XX() > 0L) {
            this.PjT.PjT(b0.XX());
        }
        com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(this.cz, this.XX, b0);
        this.PjT.SM();
        return true;
    }

    @Override  // x.b
    public void ReZ() {
        this.PjT.qj();
    }

    @Override  // x.b
    public void ReZ(long v) {
    }

    @Override  // x.b
    public void ReZ(boolean z) {
    }

    @Override  // x.b
    public long SM() {
        return this.JQp();
    }

    @Override  // x.b
    public int XX() {
        return 0;
    }

    @Override  // x.b
    public void Zh() {
        this.PjT.SM();
        com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
        qla$PjT0.PjT(this.JQp());
        qla$PjT0.ReZ(this.Au());
        qla$PjT0.Zh(0L);
        com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.Zh(this.XX, qla$PjT0);
        com.bytedance.sdk.openadsdk.core.xf.cr.PjT.PjT pjT$PjT0 = this.Au;
        if(pjT$PjT0 != null) {
            pjT$PjT0.PjT(1);
        }
    }

    @Override  // x.b
    public void Zh(long v) {
        this.ReZ = v;
    }

    @Override  // x.b
    public void Zh(v.b b0) {
    }

    @Override  // x.b
    public void Zh(boolean z) {
        this.JQp = z;
    }

    @Override  // x.b
    public void cr() {
        this.ReZ();
    }

    @Override  // x.b
    public void cr(boolean z) {
    }

    @Override  // x.b
    public long cz() [...] // Inlined contents

    @Override  // x.b
    public boolean fDm() {
        return this.cr;
    }

    public w.a gK() {
        return this.XX;
    }

    @Override  // x.b
    public boolean qj() {
        return false;
    }

    @Override  // x.b
    public boolean qla() {
        return this.JQp;
    }

    @Override  // x.b
    public boolean ub() {
        return false;
    }

    @Override  // x.b
    public boolean xE() {
        return false;
    }

    @Override  // x.b
    public a xf() {
        return this.PjT;
    }

    @Override  // x.b
    public x.c xs() {
        return null;
    }
}

