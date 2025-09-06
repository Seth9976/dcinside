package com.bytedance.sdk.openadsdk.core.xf.Zh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.component.utils.iZZ;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.Lrd.Zh.JQp;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.Au.tT;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.qj.cz;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf.PjT.PjT;
import com.bytedance.sdk.openadsdk.cr.XX;
import com.bytedance.sdk.openadsdk.fDm.fDm;
import com.bytedance.sdk.openadsdk.fDm.xs;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import s.a.a;
import v.b;
import x.b.d;
import x.c;

public class ReZ extends PjT {
    public interface com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.PjT {
        void PjT(int arg1);

        void cz();
    }

    private final boolean Co;
    private int IJ;
    private long Jo;
    private final com.bytedance.sdk.component.utils.iZZ.PjT Ld;
    private final Runnable MWx;
    private int OMu;
    private XX VY;
    private long ZX;
    private final boolean Zd;
    private int cI;
    private int dwk;
    private boolean ig;
    private WeakReference kph;
    private boolean oG;
    private final boolean qZS;
    private WeakReference rds;
    private Zh tY;
    private final String wN;
    private final a xH;

    public ReZ(Context context0, ViewGroup viewGroup0, Owx owx0, String s, boolean z, boolean z1, boolean z2, XX xX0) {
        super(context0, owx0, viewGroup0);
        this.ZX = 0L;
        this.Jo = 0L;
        this.ig = true;
        this.IJ = 0;
        this.OMu = 0;
        this.xH = new a() {
            final ReZ PjT;

            @Override  // s.a$a
            public void JQp(s.a a0) {
                com.bytedance.sdk.openadsdk.core.qj.PjT pjT0 = ReZ.this.Au.QB();
                if(pjT0 != null && pjT0.PjT() != null) {
                    pjT0.PjT().ReZ(ReZ.this.SM);
                }
                if(ReZ.this.Yo != null) {
                    ReZ.this.Yo.PjT(1);
                }
            }

            @Override  // s.a$a
            public void PjT(s.a a0) {
                ReZ.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.1 PjT;

                    @Override
                    public void run() {
                        try {
                            JQp.PjT(ReZ.this.Au, 5);
                            com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(ReZ.this.Au, 5);
                            if(ReZ.this.Yo != null) {
                                ReZ.this.Yo.PjT(9);
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                        ReZ.this.wN();
                    }
                });
                if(ReZ.this.Au.QB() != null && ReZ.this.Au.QB().PjT() != null) {
                    ReZ.this.Au.QB().PjT().cr(ReZ.this.SM);
                }
            }

            @Override  // s.a$a
            public void PjT(s.a a0, int v) {
                ReZ.this.Lrd = false;
                ReZ.this.ReZ.removeCallbacks(ReZ.this.MWx);
                ReZ.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.1 PjT;

                    @Override
                    public void run() {
                        ReZ.this.XX.Zh();
                    }
                });
                JQp.PjT(ReZ.this.Au, 0);
                if(ReZ.this.Yo != null) {
                    ReZ.this.Yo.PjT(5);
                }
            }

            @Override  // s.a$a
            public void PjT(s.a a0, int v, int v1) {
                SM.PjT().post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.1 PjT;

                    @Override
                    public void run() {
                        ReZ.this.Zd();
                    }
                });
            }

            @Override  // s.a$a
            public void PjT(s.a a0, int v, int v1, int v2) {
                ReZ.this.Lrd = true;
                ReZ.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.1 PjT;

                    @Override
                    public void run() {
                        if(ReZ.this.XX != null) {
                            ReZ.this.XX.ub();
                            ReZ.this.ReZ.postDelayed(ReZ.this.MWx, 8000L);
                        }
                    }
                });
                JQp.PjT(ReZ.this.Au, 2);
                if(ReZ.this.Yo != null) {
                    ReZ.this.Yo.PjT(4);
                }
            }

            @Override  // s.a$a
            public void PjT(s.a a0, long v) {
                ReZ.this.Lrd = false;
                ReZ.this.ReZ.removeCallbacks(ReZ.this.MWx);
                ReZ.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.1 PjT;

                    @Override
                    public void run() {
                        if(ReZ.this.XX != null) {
                            ReZ.this.XX.Zh();
                        }
                        if(ReZ.this.qla && ReZ.this.kph != null && ReZ.this.kph.get() != null) {
                            ((com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.PjT)ReZ.this.kph.get()).cz();
                        }
                    }
                });
                ReZ.this.ZX();
                JQp.PjT(ReZ.this.Au, 0);
                if(ReZ.this.Yo != null) {
                    ReZ.this.Yo.ReZ();
                }
                XX xX0 = ReZ.this.VY;
                ReZ.this.PjT(xX0);
            }

            @Override  // s.a$a
            public void PjT(s.a a0, long v, long v1) {
                if(Math.abs(v - ReZ.this.SM) < 50L) {
                    return;
                }
                ReZ.this.PjT(ReZ.this.VY);
                ReZ.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.1 ReZ;

                    @Override
                    public void run() {
                        ReZ.this.PjT(v, v1);
                        ReZ.this.Zh(v, v1);
                    }
                });
            }

            @Override  // s.a$a
            public void PjT(s.a a0, v.a a1) {
                ReZ.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.1 Zh;

                    @Override
                    public void run() {
                        int v = a1.a();
                        int v1 = a1.d();
                        if(ReZ.this.yIW() && v1 != -1004) {
                            return;
                        }
                        if(ReZ.this.cr(v, v1)) {
                            ReZ.this.XX.PjT(ReZ.this.Au, null, false);
                            ReZ.this.Zh(true);
                            ReZ.this.cr();
                        }
                        if(ReZ.this.XX != null) {
                            ReZ.this.XX.Zh();
                        }
                        if(ReZ.this.iZZ != null) {
                            ReZ.this.iZZ.Zh(ReZ.this.Jo, z.a.a(ReZ.this.SM, ReZ.this.KM));
                        }
                        if(ReZ.this.rds != null && ReZ.this.rds.get() != null && !ReZ.this.yIW()) {
                            ((d)ReZ.this.rds.get()).PjT(v, v1);
                        }
                    }
                });
                ReZ.this.PjT(a1);
                com.bytedance.sdk.openadsdk.core.qj.PjT pjT0 = ReZ.this.Au.QB();
                if(pjT0 != null && pjT0.PjT() != null) {
                    pjT0.PjT().PjT(com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.JQp);
                }
                JQp.PjT(ReZ.this.Au, 6);
                com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.Zh(ReZ.this.Au);
                if(ReZ.this.Yo != null) {
                    ReZ.this.Yo.PjT(14);
                }
            }

            @Override  // s.a$a
            public void PjT(s.a a0, boolean z) {
                ReZ.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.1 PjT;

                    @Override
                    public void run() {
                        if(ReZ.this.XX != null) {
                            ReZ.this.XX.Zh();
                        }
                    }
                });
            }

            @Override  // s.a$a
            public void ReZ(s.a a0) {
            }

            @Override  // s.a$a
            public void Zh(s.a a0) {
                ReZ.this.ReZ.removeCallbacks(ReZ.this.MWx);
                ReZ.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.1 PjT;

                    @Override
                    public void run() {
                        if(ReZ.this.rds != null && ReZ.this.rds.get() != null) {
                            ReZ.this.rds.get();
                        }
                        if(ReZ.this.XX != null) {
                            ReZ.this.XX.Zh();
                        }
                    }
                });
                if(!ReZ.this.Co) {
                    ReZ.this.PjT(ReZ.this.VY);
                }
            }

            @Override  // s.a$a
            public void Zh(s.a a0, int v) {
            }

            @Override  // s.a$a
            public void cr(s.a a0) {
                com.bytedance.sdk.openadsdk.core.qj.PjT pjT0 = ReZ.this.Au.QB();
                if(pjT0 != null && pjT0.PjT() != null) {
                    pjT0.PjT().Zh(ReZ.this.SM);
                }
                JQp.PjT(ReZ.this.Au, 3);
                if(ReZ.this.Yo != null) {
                    ReZ.this.Yo.PjT(0);
                }
            }
        };
        this.dwk = 0;
        this.MWx = new Runnable() {
            final ReZ PjT;

            @Override
            public void run() {
                if(ReZ.this.XX != null) {
                    ReZ.this.XX.PjT(ReZ.this.Au, null, false);
                    ReZ.this.XX.Zh();
                    ReZ.this.Zh(true);
                }
            }
        };
        this.Ld = new com.bytedance.sdk.component.utils.iZZ.PjT() {
            final ReZ PjT;

            @Override  // com.bytedance.sdk.component.utils.iZZ$PjT
            @WorkerThread
            public void PjT(Context context0, Intent intent0, boolean z, int v) {
                Jo.PjT(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.6 Zh;

                    @Override
                    public void run() {
                        ReZ.this.JQp(v);
                    }
                });
            }
        };
        this.oG = false;
        this.cI = ltE.ReZ(context0);
        this.PjT(z);
        this.wN = s;
        try {
            this.IJ = viewGroup0.getWidth();
            this.OMu = viewGroup0.getHeight();
        }
        catch(Throwable unused_ex) {
        }
        this.PjT(context0);
        this.Co = true;
        this.qZS = z1;
        this.Zd = z2;
        if(xX0 != null) {
            this.VY = xX0;
        }
    }

    public void Co() {
        cz cz0 = this.Yo;
        if(cz0 != null) {
            cz0.PjT(13);
        }
    }

    static String Gr(ReZ reZ0) {
        return reZ0.PjT;
    }

    private void JQp(int v) {
        this.cr(v);
        if(v == 4) {
            this.ub = false;
        }
    }

    public void Jo() {
        if(this.oG && this.Sks) {
            this.oG = false;
            iZZ.PjT(this.Ld);
        }
    }

    static String KM(ReZ reZ0) {
        return reZ0.PjT;
    }

    static String Lx(ReZ reZ0) {
        return reZ0.PjT;
    }

    private void PjT(Context context0) {
        fDm fDm0 = this.qla ? new fDm(context0) : new xs(context0);
        this.XX = this.qla ? new com.bytedance.sdk.openadsdk.core.xf.Zh.JQp(context0, fDm0, true, 17, this.Au, this, this.tT()) : new cr(context0, fDm0, true, 17, this.Au, this, false);
        this.XX.PjT(this);
    }

    public cz PjT(View view0, List list0) {
        if(this.Au.uvo()) {
            if(this.Yo == null) {
                this.Yo = cz.PjT();
            }
            this.Yo.PjT(view0, this.Au.QB().fDm());
            if(list0 != null && list0.size() > 0) {
                for(Object object0: list0) {
                    Pair pair0 = (Pair)object0;
                    if(pair0 != null) {
                        this.Yo.PjT(((View)pair0.first), (pair0.second == null ? FriendlyObstructionPurpose.OTHER : ((FriendlyObstructionPurpose)pair0.second)));
                    }
                }
            }
            return this.Yo;
        }
        return null;
    }

    public void PjT(int v, int v1) {
        if(v != 0 && v1 != 0) {
            this.IJ = v;
            this.OMu = v1;
        }
    }

    public void PjT(PAGNativeAd pAGNativeAd0) {
        if(this.qla) {
            com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp0 = this.XX;
            if(jQp0 != null) {
                jQp0.PjT(pAGNativeAd0);
            }
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.PjT reZ$PjT0) {
        this.kph = new WeakReference(reZ$PjT0);
    }

    public void PjT(Zh zh0) {
        this.tY = zh0;
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.xf.Zh.cz.PjT cz$PjT0) {
        if(this.qla) {
            com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp0 = this.XX;
            if(jQp0 != null) {
                jQp0.PjT(new com.bytedance.sdk.openadsdk.core.xf.Zh.cz.PjT() {
                    final ReZ Zh;

                    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.cz$PjT
                    public void PjT(View view0, int v) {
                        com.bytedance.sdk.openadsdk.core.xf.Zh.cz.PjT cz$PjT0 = cz$PjT0;
                        if(cz$PjT0 != null) {
                            cz$PjT0.PjT(view0, v);
                        }
                    }
                });
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.PjT.PjT
    public void PjT(d b$d0) {
        this.rds = new WeakReference(b$d0);
    }

    @Override  // x.a
    public void PjT(c c0, View view0) {
        com.bytedance.sdk.openadsdk.core.xf.cr.ReZ reZ0 = this.cz;
        if(reZ0 == null) {
            return;
        }
        if(reZ0.cz()) {
            this.PjT();
            this.XX.Zh(true, false);
            this.XX.cz();
            return;
        }
        if(this.cz.XX()) {
            this.XX(false);
            com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp2 = this.XX;
            if(jQp2 != null) {
                jQp2.Zh(false, false);
            }
        }
        else {
            com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp0 = this.XX;
            if(jQp0 != null) {
                jQp0.ReZ(this.cRA);
            }
            this.cr(this.SM);
            com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp1 = this.XX;
            if(jQp1 != null) {
                jQp1.Zh(false, false);
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.PjT.PjT
    public void PjT(c c0, View view0, boolean z) {
        this.JQp(!this.ltE);
        if(!(this.qj instanceof Activity)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp0 = this.XX;
        if(jQp0 != null) {
            jQp0.Zh(this.cRA);
            this.XX.ReZ(false);
        }
        this.PjT(1);
        x.b.c b$c0 = this.yIW == null ? null : ((x.b.c)this.yIW.get());
        if(b$c0 != null) {
            b$c0.PjT(this.ltE);
        }
    }

    @Override  // x.b
    public void PjT(boolean z, int v) {
        if(!this.RD && this.Owx.get()) {
            if(z) {
                com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
                qla$PjT0.PjT(this.JQp());
                qla$PjT0.ReZ(this.Au());
                qla$PjT0.Zh(this.cz());
                qla$PjT0.ReZ(v);
                qla$PjT0.cr(this.XX());
                com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(this.XX, qla$PjT0, this.VY);
                this.RD = false;
            }
            else {
                this.Yo();
            }
        }
        this.cr();
        cz cz0 = this.Yo;
        if(cz0 != null) {
            cz0.cr();
        }
    }

    @Override  // x.b
    public boolean PjT(b b0) {
        if(this.cz != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if(TextUtils.isEmpty(b0.xs())) {
            return false;
        }
        this.Zh(false);
        b0.xs();
        this.Zh(b0);
        this.KM();
        cz cz0 = this.Yo;
        if(cz0 != null) {
            cz0.PjT(false, 0.0f);
        }
        if(!tT.Zh(this.wN) || this.SM <= 0L) {
            this.SM = b0.XX();
        }
        if(b0.XX() <= 0L) {
            this.RD = false;
            this.Owx.set(false);
        }
        else {
            long v = b0.XX();
            this.SM = v;
            this.DWo = Math.max(this.DWo, v);
        }
        com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp0 = this.XX;
        if(jQp0 != null) {
            jQp0.PjT();
            if(this.dwk == 0) {
                this.XX.XX();
            }
            this.XX.ReZ(b0.JQp(), b0.cz());
            this.XX.ReZ(this.cRA);
            this.XX.PjT(b0.JQp(), b0.cz());
        }
        if(this.cz == null) {
            com.bytedance.sdk.openadsdk.core.xf.cr.ReZ reZ0 = new com.bytedance.sdk.openadsdk.core.xf.cr.ReZ();
            this.cz = reZ0;
            reZ0.PjT(this.xH);
        }
        this.ltE();
        this.Jo = 0L;
        try {
            this.ReZ(b0);
            return true;
        }
        catch(Exception exception0) {
            this.PjT(new v.a(-10, 0, exception0.getMessage()));
            RD.Zh(this.PjT, "[video] invoke NativeVideoController#playVideo cause exception :" + exception0);
            return false;
        }
    }

    static String QB(ReZ reZ0) {
        return reZ0.PjT;
    }

    static String Qf(ReZ reZ0) {
        return reZ0.PjT;
    }

    private void ReZ(b b0) {
        b0.ReZ(0);
        this.cz.PjT(b0);
        this.ZX = System.currentTimeMillis();
        this.XX.ReZ(8);
        this.XX.ReZ(0);
        this.PjT(new Runnable() {
            final ReZ PjT;

            @Override
            public void run() {
                if(ReZ.this.cz == null) {
                    return;
                }
                ReZ.this.ZX = System.currentTimeMillis();
                ReZ.this.XX.cr(0);
                ReZ.this.cz.PjT(true, ReZ.this.SM, ReZ.this.xE);
            }
        });
        if(this.qla) {
            this.gK();
        }
    }

    private boolean ReZ(int v, int v1) {
        if(v1 == 0) {
            this.PjT();
            this.ub = true;
            com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp0 = this.XX;
            if(jQp0 != null) {
                jQp0.PjT(this.Au, null, false);
            }
        }
        if(v1 != 0 && v1 != 4) {
            com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp1 = this.XX;
            if(jQp1 != null) {
                jQp1.PjT();
            }
            this.PjT();
            this.ub = true;
            this.gK = false;
            return this.XX == null ? true : this.XX.PjT(v, this.Au.MWx(), this.Zd);
        }
        if(v1 == 4) {
            this.ub = false;
            com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp2 = this.XX;
            if(jQp2 != null) {
                jQp2.qla();
            }
        }
        return true;
    }

    @Override  // x.b
    public void ReZ() {
        this.PjT(true, 3);
    }

    public void ReZ(int v) {
        this.cr(v);
        if(v == 4) {
            this.ub = false;
            this.Zh();
        }
    }

    public void XX(boolean z) {
        com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp0 = this.XX;
        if(jQp0 != null) {
            jQp0.PjT();
        }
        com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp1 = this.XX;
        if(jQp1 != null && z) {
            jQp1.gK();
        }
        this.qZS();
    }

    private void Zd() {
        int v5;
        int v4;
        try {
            if(this.ig() != null) {
                com.bytedance.sdk.openadsdk.core.xf.cr.ReZ reZ0 = this.cz;
                if(reZ0 != null && this.cRA != null) {
                    int v = reZ0.cr();
                    int v1 = this.cz.JQp();
                    int v2 = this.cRA.getWidth();
                    int v3 = this.cRA.getHeight();
                    if(v2 > 0 && v3 > 0 && v1 > 0 && v > 0) {
                        if(v == v1) {
                            v4 = v2 <= v3 ? v2 : v3;
                            v5 = v4;
                        }
                        else if(v > v1) {
                            v4 = (int)(((double)v2) * 1.0 / ((double)(((float)v) * 1.0f / ((float)v1))));
                            v5 = v2;
                        }
                        else {
                            v5 = (int)(((double)v3) * 1.0 / ((double)(((float)v1) * 1.0f / ((float)v))));
                            v4 = v3;
                        }
                        if(v4 <= v3 && v4 > 0) {
                            v3 = v4;
                        }
                        if(v5 <= v2 && v5 > 0) {
                            v2 = v5;
                        }
                        com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.5 reZ$50 = new Runnable() {
                            final ReZ ReZ;

                            @Override
                            public void run() {
                                try {
                                    RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v2, v3);
                                    relativeLayout$LayoutParams0.addRule(13);
                                    if(ReZ.this.ig() instanceof TextureView) {
                                        ((TextureView)ReZ.this.ig()).setLayoutParams(relativeLayout$LayoutParams0);
                                        return;
                                    }
                                    if(ReZ.this.ig() instanceof SurfaceView) {
                                        ((SurfaceView)ReZ.this.ig()).setLayoutParams(relativeLayout$LayoutParams0);
                                    }
                                }
                                catch(Throwable unused_ex) {
                                }
                            }
                        };
                        this.ReZ.post(reZ$50);
                        return;
                    }
                    return;
                }
            }
            this.ig();
        }
        catch(Throwable unused_ex) {
        }
    }

    private void Zh(long v, long v1) {
        this.Au.ReZ(v);
        this.SM = v;
        this.KM = v1;
        this.XX.PjT(v, v1);
        this.XX.PjT(z.a.a(v, v1));
        x.b.a b$a0 = this.iZZ;
        if(b$a0 != null) {
            try {
                b$a0.PjT(v, v1);
            }
            catch(Throwable throwable0) {
                RD.PjT(this.PjT, "onProgressUpdate error: ", throwable0);
            }
        }
        com.bytedance.sdk.openadsdk.core.qj.PjT pjT0 = this.Au.QB();
        if(pjT0 != null && pjT0.PjT() != null) {
            pjT0.PjT().PjT(v, v1, this.Yo);
        }
    }

    @Override  // x.b
    public void Zh() {
        com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp0 = this.XX;
        if(jQp0 != null) {
            jQp0.PjT();
        }
        com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp1 = this.XX;
        if(jQp1 != null) {
            jQp1.gK();
        }
        this.qZS();
    }

    public void Zh(int v, int v1) {
        this.PjT(v, v1);
        com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp0 = this.XX;
        if(jQp0 != null && v > 0 && v1 > 0) {
            jQp0.ReZ(v, v1);
            this.XX.PjT(v, v1);
            this.Zd();
        }
    }

    private void cr(int v) {
        if(this.cI == v) {
            return;
        }
        this.cI = v;
        if(v != 0 && v != 4) {
            this.gK = false;
        }
        if(!this.gK && !this.qla() && this.qZS) {
            this.ReZ(2, v);
        }
        if(this.kph != null && this.kph.get() != null) {
            ((com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.PjT)this.kph.get()).PjT(this.cI);
        }
    }

    private boolean cr(int v, int v1) {
        switch(v) {
            case -1010: 
            case -1007: 
            case -1004: 
            case -110: 
            case 100: 
            case 200: {
                return true;
            }
            default: {
                return v1 == 1 || v1 == 700 || v1 == 800;
            }
        }
    }

    @Override  // x.b
    public void cr() {
        com.bytedance.sdk.openadsdk.core.xf.cr.ReZ reZ0 = this.cz;
        if(reZ0 != null) {
            reZ0.xf();
            this.cz = null;
        }
        if(!this.ig) {
            return;
        }
        if("embeded_ad".equals(this.wN)) {
            this.XX.Owx();
        }
        else {
            this.XX.PjT(this.Au, null, true);
        }
        this.ReZ.removeCallbacksAndMessages(null);
        this.xf.clear();
        if(this.qla) {
            this.Jo();
        }
    }

    public void cz(boolean z) {
        this.ig = z;
    }

    public void gK() {
        if(!this.oG && this.Sks) {
            Context context0 = ub.PjT().getApplicationContext();
            this.oG = true;
            iZZ.PjT(this.Ld, context0);
        }
    }

    private com.bykv.vk.openvk.PjT.PjT.PjT.cz.d ig() {
        if(this.qj.getResources().getConfiguration().orientation == 1) {
            return this.XX == null ? null : this.XX.xs();
        }
        return null;
    }

    private void qZS() {
        com.bytedance.sdk.openadsdk.core.xf.cr.ReZ reZ0 = this.cz;
        if(reZ0 != null) {
            if(!reZ0.XX()) {
                this.cz.PjT(false, this.SM, this.xE);
            }
            else if(this.xs) {
                this.RD();
            }
            else {
                this.Zh(this.Qf);
            }
        }
        if(this.Owx.get()) {
            this.iZZ();
        }
    }

    static String uvo(ReZ reZ0) {
        return reZ0.PjT;
    }

    private void wN() {
        ++this.dwk;
        com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp0 = this.XX;
        if(jQp0 == null) {
            return;
        }
        jQp0.Zh();
        x.b.a b$a0 = this.iZZ;
        if(b$a0 != null) {
            b$a0.PjT(this.Jo, z.a.a(this.SM, this.KM));
        }
        this.Jo = System.currentTimeMillis() - this.ZX;
        if(this.ig) {
            this.XX.PjT(this.Au, null, true);
        }
        if(!this.RD) {
            this.RD = true;
            this.Zh(this.KM, this.KM);
            this.SM = this.KM;
            this.DWo = this.KM;
            this.Zh(this.VY);
        }
        if(!this.qla && this.ltE) {
            this.JQp(this.XX, null);
        }
        this.fDm = true;
    }
}

