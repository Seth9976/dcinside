package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.DWo.cz.Zh;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.concurrent.atomic.AtomicBoolean;

public class qla {
    private volatile long Au;
    private final AtomicBoolean DWo;
    private final AtomicBoolean JQp;
    final Owx PjT;
    private FrameLayout ReZ;
    private String SM;
    private volatile long XX;
    private final PjT Zh;
    private final AtomicBoolean cr;
    private volatile long cz;
    private ReZ fDm;
    private long qj;
    private String qla;
    private boolean ub;
    private boolean xE;
    private long xf;
    private ReZ xs;

    public qla(PjT pjT0) {
        this.cr = new AtomicBoolean(false);
        this.JQp = new AtomicBoolean(false);
        this.DWo = new AtomicBoolean(false);
        this.qj = 0L;
        this.xf = 0L;
        this.qla = null;
        this.xE = false;
        this.Zh = pjT0;
        this.PjT = pjT0.Zh;
        this.SM = pjT0.JQp;
    }

    public void Au() {
        ReZ reZ0 = this.fDm;
        if(reZ0 != null) {
            this.ReZ.addView(reZ0.qj(), new FrameLayout.LayoutParams(this.fDm.wN(), this.fDm.qZS()));
        }
    }

    public void DWo() {
        com.bytedance.sdk.openadsdk.cr.ReZ.ReZ(this.PjT, this.SM);
    }

    public void JQp() {
        this.cz = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(this.PjT, this.SM);
    }

    public void PjT() {
        if(this.ub) {
            return;
        }
        this.ub = true;
        this.Zh();
    }

    public void PjT(int v) {
        qZS.PjT(this.ReZ, v);
    }

    public void ReZ() {
        Owx owx0 = this.PjT;
        if(owx0 == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.DWo.XX.PjT pjT0 = owx0.BPY();
        if(pjT0 == null) {
            return;
        }
        String s = this.SM;
        com.bytedance.sdk.openadsdk.component.reward.PjT.qla.1 qla$10 = new Zh() {
            final qla PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.Zh
            public void PjT() {
                qla.this.JQp();
            }

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.Zh
            public void PjT(int v, String s) {
                qla.this.cr.set(false);
                long v1 = SystemClock.elapsedRealtime();
                long v2 = qla.this.cz;
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(qla.this.PjT, qla.this.SM, v1 - v2, v, s, null);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.ReZ
            public void PjT(int v, String s, String s1) {
                qla.this.qla = s1;
                qla.this.cr.set(false);
                long v1 = SystemClock.elapsedRealtime();
                long v2 = qla.this.qj;
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(qla.this.PjT, false, qla.this.SM, "fail", v1 - v2, s1, "endcard", v, s);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.Zh
            public void PjT(ReZ reZ0) {
                qla.this.xs = reZ0;
                qla.this.cr.set(true);
                long v = SystemClock.elapsedRealtime();
                qla.this.XX = v;
                if(qla.this.Zh.Jo.yIW()) {
                    View view0 = qla.this.Zh.Zd.DWo();
                    if(view0 instanceof cr) {
                        ((cr)view0).setImageResource(Lrd.cr(qla.this.Zh.IJ, "tt_skip_btn"));
                    }
                }
                qla.this.fDm();
                qla.this.SM();
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(qla.this.PjT, qla.this.SM, qla.this.XX - qla.this.cz);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.ReZ
            public void PjT(String s) {
                long v = SystemClock.elapsedRealtime();
                qla.this.qj = v;
            }

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.ReZ
            public void Zh(String s) {
                qla.this.qla = s;
                long v = SystemClock.elapsedRealtime();
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(qla.this.PjT, false, qla.this.SM, "success", v - qla.this.qj, s, "endcard", 0, null);
            }
        };
        com.bytedance.sdk.openadsdk.core.DWo.cr.Zh zh0 = new com.bytedance.sdk.openadsdk.core.DWo.cr.Zh(this.Zh.rds, this.PjT, pjT0, s, qla$10);
        if(this.PjT.Ohg() != null) {
            zh0.PjT(new com.bytedance.sdk.openadsdk.core.DWo.cz.PjT() {
                final qla PjT;

                @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.PjT
                public String PjT() {
                    return "normal";
                }

                @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.PjT
                public void Zh() {
                }
            });
        }
        zh0.PjT();
        zh0.PjT(this.Zh.Zd.DWo());
    }

    public void SM() {
        if(this.Au > 0L && this.XX > 0L && !this.DWo.getAndSet(true)) {
            com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.XX - this.Au, this.PjT, this.SM, this.qla);
        }
    }

    public void XX() {
        this.DWo();
        this.SM();
        ReZ reZ0 = this.xs;
        if(reZ0 != null) {
            this.ReZ.addView(reZ0.qj(), new FrameLayout.LayoutParams(this.xs.wN(), this.xs.qZS()));
        }
    }

    void Zh() {
        this.ReZ = (FrameLayout)this.Zh.ig.findViewById(com.bytedance.sdk.openadsdk.utils.qla.qla);
    }

    public boolean cr() {
        return this.xE;
    }

    public void cz() {
        this.Au = SystemClock.elapsedRealtime();
    }

    private void fDm() {
        Owx owx0 = this.PjT;
        if(owx0 == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.DWo.XX.PjT pjT0 = owx0.Ohg();
        if(pjT0 == null) {
            return;
        }
        String s = this.SM;
        com.bytedance.sdk.openadsdk.component.reward.PjT.qla.3 qla$30 = new Zh() {
            final qla PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.Zh
            public void PjT() {
            }

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.Zh
            public void PjT(int v, String s) {
                qla.this.JQp.set(false);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.ReZ
            public void PjT(int v, String s, String s1) {
                qla.this.JQp.set(false);
                String s2 = qla.this.SM;
                long v1 = SystemClock.elapsedRealtime();
                long v2 = qla.this.xf;
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(qla.this.PjT, true, s2, "fail", v1 - v2, s1, "endcard", v, s);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.Zh
            public void PjT(ReZ reZ0) {
                qla.this.fDm = reZ0;
                qla.this.JQp.set(true);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.ReZ
            public void PjT(String s) {
                long v = SystemClock.elapsedRealtime();
                qla.this.xf = v;
            }

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.ReZ
            public void Zh(String s) {
                long v = SystemClock.elapsedRealtime();
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(qla.this.PjT, true, qla.this.SM, "success", v - qla.this.xf, s, "endcard", 0, null);
            }
        };
        com.bytedance.sdk.openadsdk.core.DWo.cr.Zh zh0 = new com.bytedance.sdk.openadsdk.core.DWo.cr.Zh(this.Zh.rds, this.PjT, pjT0, s, qla$30);
        zh0.PjT(new com.bytedance.sdk.openadsdk.core.DWo.cz.PjT() {
            final qla PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.PjT
            public String PjT() {
                return "overlay";
            }

            @Override  // com.bytedance.sdk.openadsdk.core.DWo.cz.PjT
            public void Zh() {
                qla.this.xE = true;
                qla.this.Zh.Zd.DWo().performClick();
            }
        });
        zh0.PjT();
        zh0.PjT(this.Zh.Zd.DWo());
    }

    public void qj() {
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(SystemClock.elapsedRealtime() - this.Au, this.PjT, this.SM);
    }

    public boolean xf() {
        return this.cr.get();
    }

    public boolean xs() {
        return this.JQp.get();
    }
}

