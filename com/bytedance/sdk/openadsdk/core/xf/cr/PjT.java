package com.bytedance.sdk.openadsdk.core.xf.cr;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.PjT.PjT.PjT.cz.d;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ;
import com.bytedance.sdk.openadsdk.Lrd.Zh.JQp;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.qj.cz;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.XX;
import com.bytedance.sdk.openadsdk.fDm.fDm;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.Set;
import s.a;
import v.b;
import x.c;

public class PjT extends com.bytedance.sdk.openadsdk.core.xf.PjT.PjT {
    public interface com.bytedance.sdk.openadsdk.core.xf.cr.PjT.PjT {
        void PjT(int arg1);
    }

    final Zh Co;
    private com.bytedance.sdk.openadsdk.core.xf.cr.PjT.PjT IJ;
    protected boolean Jo;
    protected long ZX;
    private long Zd;
    private boolean ig;
    private final Runnable kph;
    private long qZS;
    private final int rds;
    private final XX wN;

    public PjT(Context context0, ViewGroup viewGroup0, Owx owx0, XX xX0) {
        super(context0, owx0, viewGroup0);
        this.qZS = 0L;
        this.Zd = 0L;
        this.ig = false;
        this.ZX = 0L;
        this.Jo = false;
        this.Co = new Zh() {
            final PjT PjT;
            private boolean Zh;

            {
                this.Zh = true;
            }

            @Override  // s.a$a
            public void JQp(a a0) {
                JQp.PjT(PjT.this.Au, 0);
                if(PjT.this.Yo != null) {
                    PjT.this.Yo.PjT(1);
                }
                if(PjT.this.IJ != null) {
                    PjT.this.IJ.PjT(1);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.ReZ$Zh
            public void PjT(int v, int v1) {
                XX xX0 = PjT.this.wN;
                PjT.this.Zh(xX0);
                com.bytedance.sdk.openadsdk.core.xf.PjT.Zh zh0 = PjT.this.tT;
                zh0.cr = PjT.this.cz.Owx();
                PjT.this.KM();
                PjT.this.Owx.set(false);
                XX xX1 = PjT.this.wN;
                PjT.this.PjT(xX1);
            }

            @Override  // s.a$a
            public void PjT(a a0) {
                PjT.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.cr.PjT.1 PjT;

                    @Override
                    public void run() {
                        if(PjT.this.Yo != null) {
                            try {
                                PjT.this.Yo.PjT(9);
                            }
                            catch(Exception unused_ex) {
                            }
                        }
                        PjT.this.kph();
                    }
                });
                com.bytedance.sdk.openadsdk.core.qj.PjT pjT0 = PjT.this.Au.QB();
                if(pjT0 != null && pjT0.PjT() != null) {
                    long v = PjT.this.JQp();
                    pjT0.PjT().cr(v);
                    pjT0.PjT().JQp(v);
                }
                JQp.PjT(PjT.this.Au, 5);
                ReZ.PjT(PjT.this.Au, 5);
                if(PjT.this.IJ != null) {
                    PjT.this.IJ.PjT(3);
                }
            }

            @Override  // s.a$a
            public void PjT(a a0, int v) {
                PjT.this.Lrd = false;
                PjT.this.ReZ.removeCallbacks(PjT.this.kph);
                PjT.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.cr.PjT.1 PjT;

                    @Override
                    public void run() {
                        if(PjT.this.XX != null) {
                            PjT.this.XX.Zh();
                        }
                    }
                });
                JQp.PjT(PjT.this.Au, 0);
                if(PjT.this.Yo != null) {
                    PjT.this.Yo.PjT(5);
                }
            }

            @Override  // s.a$a
            public void PjT(a a0, int v, int v1) {
                SM.PjT().post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.cr.PjT.1 PjT;

                    @Override
                    public void run() {
                        int v;
                        float f;
                        if(PjT.this.cz == null) {
                            return;
                        }
                        try {
                            f = (float)PjT.this.cz.cr();
                            v = PjT.this.cz.JQp();
                        }
                        catch(Throwable throwable0) {
                            RD.Zh(PjT.this.PjT, throwable0.getMessage());
                            return;
                        }
                        if(f != 0.0f && ((float)v) != 0.0f) {
                            PjT.this.ReZ.post(new Runnable() {
                                final com.bytedance.sdk.openadsdk.core.xf.cr.PjT.1.6 ReZ;

                                @Override
                                public void run() {
                                    if(PjT.this.IJ()) {
                                        if(!gK.Zh(PjT.this.Au) && PjT.this.tT.JQp != 4) {
                                            if(gK.ReZ(PjT.this.Au)) {
                                                PjT.this.PjT(true, f, ((float)v));
                                                return;
                                            }
                                            if(PjT.this.Au.wN() == 3) {
                                                PjT.this.PjT(true, f, ((float)v));
                                                return;
                                            }
                                            if(PjT.this.Au.wN() == 0) {
                                                PjT.this.ReZ(f, ((float)v));
                                                return;
                                            }
                                            PjT.this.Zh(f, ((float)v));
                                            return;
                                        }
                                        PjT.this.PjT(true, f, ((float)v));
                                        return;
                                    }
                                    PjT.this.PjT(f, ((float)v));
                                }
                            });
                        }
                    }
                });
            }

            @Override  // s.a$a
            public void PjT(a a0, int v, int v1, int v2) {
                PjT.this.Lrd = true;
                PjT.this.rds();
                PjT.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.cr.PjT.1 PjT;

                    @Override
                    public void run() {
                        if(PjT.this.XX != null) {
                            PjT.this.XX.ub();
                        }
                    }
                });
                JQp.PjT(PjT.this.Au, 3);
                if(PjT.this.Yo != null) {
                    PjT.this.Yo.PjT(4);
                }
            }

            @Override  // s.a$a
            public void PjT(a a0, long v) {
                PjT.this.Lrd = false;
                PjT.this.ReZ.removeCallbacks(PjT.this.kph);
                PjT.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.cr.PjT.1 PjT;

                    @Override
                    public void run() {
                        if(PjT.this.XX != null) {
                            PjT.this.XX.Zh();
                        }
                    }
                });
                if(!PjT.this.Owx.get()) {
                    PjT.this.ZX = v;
                    PjT.this.PjT(PjT.this.wN);
                    PjT.this.ZX();
                }
                if(PjT.this.Yo != null) {
                    PjT.this.Yo.ReZ();
                }
                JQp.PjT(PjT.this.Au, 0);
            }

            @Override  // s.a$a
            public void PjT(a a0, long v, long v1) {
                if(Math.abs(v - PjT.this.SM) < 50L) {
                    return;
                }
                PjT.this.PjT(PjT.this.wN);
                PjT.this.PjT(v, v1);
                PjT.this.Zh(v, v1);
                com.bytedance.sdk.openadsdk.core.qj.PjT pjT0 = PjT.this.Au.QB();
                if(pjT0 != null && pjT0.PjT() != null) {
                    pjT0.PjT().PjT(v, v1, PjT.this.Yo);
                }
                if(this.Zh && v1 - v < 500L) {
                    this.Zh = false;
                    this.PjT(a0);
                }
            }

            @Override  // s.a$a
            public void PjT(a a0, v.a a1) {
                PjT.this.ReZ.removeCallbacks(PjT.this.kph);
                PjT.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.cr.PjT.1 PjT;

                    @Override
                    public void run() {
                        if(PjT.this.XX != null) {
                            PjT.this.XX.Zh();
                        }
                        if(PjT.this.iZZ != null) {
                            PjT.this.iZZ.Zh(PjT.this.Zd, z.a.a(PjT.this.SM, PjT.this.KM));
                        }
                    }
                });
                PjT.this.PjT(a1);
                JQp.PjT(PjT.this.Au, 6);
                ReZ.Zh(PjT.this.Au);
                if(PjT.this.Yo != null) {
                    PjT.this.Yo.PjT(14);
                }
                if(PjT.this.IJ != null) {
                    PjT.this.IJ.PjT(4);
                }
            }

            @Override  // s.a$a
            public void PjT(a a0, boolean z) {
                PjT.this.ReZ.removeCallbacks(PjT.this.kph);
                PjT.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.cr.PjT.1 PjT;

                    @Override
                    public void run() {
                        if(PjT.this.XX != null) {
                            PjT.this.XX.Zh();
                        }
                    }
                });
            }

            @Override  // s.a$a
            public void ReZ(a a0) {
            }

            @Override  // s.a$a
            public void Zh(a a0) {
                PjT.this.ReZ.removeCallbacks(PjT.this.kph);
                PjT.this.ReZ.post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.xf.cr.PjT.1 PjT;

                    @Override
                    public void run() {
                        if(PjT.this.XX != null) {
                            PjT.this.XX.Zh();
                        }
                    }
                });
            }

            @Override  // s.a$a
            public void Zh(a a0, int v) {
            }

            @Override  // s.a$a
            public void cr(a a0) {
                com.bytedance.sdk.openadsdk.core.qj.PjT pjT0 = PjT.this.Au.QB();
                if(pjT0 != null && pjT0.PjT() != null) {
                    pjT0.PjT().Zh(PjT.this.SM);
                }
                JQp.PjT(PjT.this.Au, 3);
                if(PjT.this.Yo != null) {
                    PjT.this.Yo.PjT(0);
                }
                if(PjT.this.IJ != null) {
                    PjT.this.IJ.PjT(2);
                }
            }
        };
        this.kph = new Runnable() {
            final PjT PjT;

            @Override
            public void run() {
                if(PjT.this.iZZ != null) {
                    PjT.this.gK();
                    PjT.this.iZZ.PjT();
                }
            }
        };
        this.wN = xX0;
        this.rds = owx0.joj();
        if(owx0.uvo() && owx0.QB() != null && this.cRA != null) {
            if(this.Yo == null) {
                this.Yo = cz.PjT();
            }
            cz cz0 = this.Yo;
            Set set0 = owx0.QB().fDm();
            cz0.PjT(this.cRA, set0);
        }
        com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp0 = new com.bytedance.sdk.openadsdk.core.xf.Zh.JQp(context0.getApplicationContext(), new fDm(context0), true, 17, this.Au, this);
        this.XX = jQp0;
        jQp0.PjT(this);
    }

    public void Co() {
        if(!this.ig && this.Owx.get()) {
            this.iZZ();
            com.bytedance.sdk.openadsdk.core.qj.PjT pjT0 = this.Au.QB();
            if(pjT0 != null && pjT0.PjT() != null) {
                pjT0.PjT().ReZ(this.JQp());
            }
        }
    }

    static String DWo(PjT pjT0) {
        return pjT0.PjT;
    }

    private boolean IJ() {
        return this.Au.Qtm() == 100.0f;
    }

    public void Jo() {
        this.Co.PjT(null, 0, 0);
    }

    static String Ld(PjT pjT0) {
        return pjT0.PjT;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.PjT.PjT
    public boolean Lrd() {
        return true;
    }

    static String MWx(PjT pjT0) {
        return pjT0.PjT;
    }

    static String OMu(PjT pjT0) {
        return pjT0.PjT;
    }

    private boolean OMu() {
        if(com.bytedance.sdk.openadsdk.core.DWo.ReZ.PjT(this.Au.ZX())) {
            return this.Au.xH() == null ? this.wN() == null || this.cz == null || this.Au.qZS() == 1 : this.wN() == null || this.cz == null || true || this.Au.qZS() == 1;
        }
        return this.Au.VY() == null ? this.wN() == null || this.cz == null || this.Au.qZS() == 1 : this.wN() == null || this.cz == null || true || this.Au.qZS() == 1;
    }

    static String PjT(PjT pjT0) {
        return pjT0.PjT;
    }

    private void PjT(float f, float f1) {
        try {
            if(this.wN() != null && this.cz != null) {
                ViewGroup viewGroup0 = this.cRA;
                if(viewGroup0 != null) {
                    float f2 = (float)viewGroup0.getWidth();
                    float f3 = (float)this.cRA.getHeight();
                    if(f / (f2 * 1.0f) <= f1 / (1.0f * f3)) {
                        f2 = f * (f3 / f1);
                    }
                    else {
                        f3 = f1 * (f2 / f);
                    }
                    RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(((int)f2), ((int)f3));
                    relativeLayout$LayoutParams0.addRule(13);
                    if(this.wN() instanceof TextureView) {
                        ((TextureView)this.wN()).setLayoutParams(relativeLayout$LayoutParams0);
                        return;
                    }
                    if(this.wN() instanceof SurfaceView) {
                        ((SurfaceView)this.wN()).setLayoutParams(relativeLayout$LayoutParams0);
                    }
                }
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        RD.PjT(this.PjT, "changeVideoSizeSupportInteraction error", throwable0);
    }

    private void PjT(float f, float f1, float f2, float f3, boolean z) {
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0;
        try {
            if(f2 <= 0.0f || f3 <= 0.0f) {
                f2 = (float)this.Au.MWx().o();
                f3 = (float)this.Au.MWx().w();
            }
            if(f3 > 0.0f && f2 > 0.0f) {
                if(z) {
                    if(f2 < f3) {
                        return;
                    }
                    relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(((int)f), ((int)(f3 * f / f2)));
                }
                else {
                    if(f2 > f3) {
                        return;
                    }
                    relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(((int)(f2 * f1 / f3)), ((int)f1));
                }
                relativeLayout$LayoutParams0.addRule(13);
                if(this.wN() != null) {
                    if(this.wN() instanceof TextureView) {
                        ((TextureView)this.wN()).setLayoutParams(relativeLayout$LayoutParams0);
                    }
                    else if(this.wN() instanceof SurfaceView) {
                        ((SurfaceView)this.wN()).setLayoutParams(relativeLayout$LayoutParams0);
                    }
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.cRA.getLayoutParams();
                    if(com.bytedance.sdk.component.adexpress.cr.Zh.PjT(ub.PjT()) && this.cRA.getHeight() > 0 && viewGroup$LayoutParams0 != null) {
                        viewGroup$LayoutParams0.width = relativeLayout$LayoutParams0.width;
                        viewGroup$LayoutParams0.height = relativeLayout$LayoutParams0.height;
                        this.cRA.setLayoutParams(viewGroup$LayoutParams0);
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.xf.cr.PjT.PjT pjT$PjT0) {
        this.IJ = pjT$PjT0;
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
            this.Zh();
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

    protected void PjT(boolean z, float f, float f1) {
        try {
            this.Au.ig();
            if(this.OMu() && !z) {
                return;
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(((int)f), ((int)f1));
            relativeLayout$LayoutParams0.addRule(13);
            if(this.wN() != null) {
                if(this.wN() instanceof TextureView) {
                    ((TextureView)this.wN()).setLayoutParams(relativeLayout$LayoutParams0);
                }
                else if(this.wN() instanceof SurfaceView) {
                    ((SurfaceView)this.wN()).setLayoutParams(relativeLayout$LayoutParams0);
                }
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.cRA.getLayoutParams();
                if(this.cRA.getHeight() > 0) {
                    float f2 = Math.min(((float)this.cRA.getWidth()) / f, ((float)this.cRA.getHeight()) / f1);
                    if(viewGroup$LayoutParams0 != null) {
                        relativeLayout$LayoutParams0.width = (int)(f * f2);
                        relativeLayout$LayoutParams0.height = (int)(f1 * f2);
                        if(this.wN() instanceof TextureView) {
                            ((TextureView)this.wN()).setLayoutParams(relativeLayout$LayoutParams0);
                        }
                        else if(this.wN() instanceof SurfaceView) {
                            ((SurfaceView)this.wN()).setLayoutParams(relativeLayout$LayoutParams0);
                        }
                        if(this.tT.JQp == 4) {
                            viewGroup$LayoutParams0.width = relativeLayout$LayoutParams0.width;
                            viewGroup$LayoutParams0.height = relativeLayout$LayoutParams0.height;
                            this.cRA.setLayoutParams(viewGroup$LayoutParams0);
                        }
                    }
                }
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        RD.PjT(this.PjT, "changeSize error", throwable0);
    }

    @Override  // x.b
    public void PjT(boolean z, int v) {
        this.ReZ();
    }

    @Override  // x.b
    public boolean PjT(@NonNull b b0) {
        int v;
        boolean z = false;
        if(this.cz != null) {
            return false;
        }
        b0.xs();
        if(TextUtils.isEmpty(b0.xs())) {
            return false;
        }
        this.Zh(b0);
        b0.ReZ(1);
        this.Jo = !b0.xs().startsWith("http");
        if(this.Yo != null) {
            if(this.tT.JQp != 1) {
                v = this.Au == null || this.Au.PjT() < 0 ? ub.cr().ltE(String.valueOf(this.rds)) : this.Au.PjT();
            }
            else if(this.Au != null && this.Au.Zh() >= 0) {
                v = this.Au.Zh();
            }
            else {
                v = ub.cr().DWo(String.valueOf(this.rds));
            }
            ViewGroup viewGroup0 = this.cRA;
            if(viewGroup0 != null) {
                View view0 = (View)viewGroup0.getParent();
                if(view0 != null) {
                    try {
                        View view1 = view0.findViewById(qla.xf);
                        View view2 = view0.findViewById(qla.FaL);
                        this.Yo.PjT(view2, FriendlyObstructionPurpose.OTHER);
                        this.Yo.PjT(view1, FriendlyObstructionPurpose.OTHER);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
            cz cz0 = this.Yo;
            if(v > 0) {
                z = true;
            }
            cz0.PjT(z, ((float)v) / 1000.0f);
        }
        this.KM();
        if(b0.XX() > 0L) {
            long v1 = b0.XX();
            this.SM = v1;
            this.DWo = Math.max(this.DWo, v1);
        }
        com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp0 = this.XX;
        if(jQp0 != null) {
            jQp0.PjT();
            this.XX.XX();
            this.XX.ReZ(b0.JQp(), b0.cz());
            this.XX.ReZ(this.cRA);
        }
        com.bytedance.sdk.openadsdk.core.xf.cr.ReZ reZ0 = new com.bytedance.sdk.openadsdk.core.xf.cr.ReZ();
        this.cz = reZ0;
        reZ0.PjT(this.Co);
        this.ltE();
        this.Zd = 0L;
        this.ig();
        return true;
    }

    private void ReZ(float f, float f1) {
        try {
            if(this.wN() != null && this.cz != null) {
                boolean z = this.Au.jK() == 1;
                int[] arr_v = qZS.Zh(ub.PjT());
                this.PjT(((float)arr_v[0]), ((float)arr_v[1]), f, f1, z);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // x.b
    public void ReZ() {
        com.bytedance.sdk.openadsdk.core.xf.cr.ReZ reZ0 = this.cz;
        if(reZ0 == null) {
            return;
        }
        reZ0.xf();
        this.cz = null;
        com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp0 = this.XX;
        if(jQp0 != null) {
            jQp0.SM();
        }
        this.ReZ.removeCallbacks(this.kph);
        this.ReZ.removeCallbacksAndMessages(null);
        cz cz0 = this.Yo;
        if(cz0 != null) {
            cz0.cr();
        }
    }

    static String Sks(PjT pjT0) {
        return pjT0.PjT;
    }

    public void Zd() {
        cz cz0 = this.Yo;
        if(cz0 != null) {
            cz0.PjT(13);
        }
    }

    private void Zh(float f, float f1) {
        try {
            this.Au.ig();
            if(this.OMu()) {
                return;
            }
            int[] arr_v = qZS.Zh(ub.PjT());
            boolean z = false;
            boolean z1 = this.Au.jK() == 1;
            float f2 = (float)arr_v[0];
            float f3 = (float)arr_v[1];
            if(z1) {
                if(f > f1) {
                    this.PjT(f2, f3, f, f1, true);
                    return;
                }
            }
            else if(f < f1) {
                this.PjT(f2, f3, f, f1, false);
                return;
            }
            float f4 = f / f1;
            float f5 = f2 / f3;
            if(!z1) {
                if(f5 > 1.777778f && f4 == 1.777778f) {
                    f1 = 9.0f * f2 / 16.0f;
                    f = f2;
                    z = true;
                }
            }
            else if(f5 < 0.5625f && f4 == 0.5625f) {
                f = 9.0f * f3 / 16.0f;
                f1 = f3;
                z = true;
            }
            if(z) {
                f2 = f;
                f3 = f1;
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(((int)f2), ((int)f3));
            relativeLayout$LayoutParams0.addRule(13);
            if(this.wN() != null) {
                if(this.wN() instanceof TextureView) {
                    ((TextureView)this.wN()).setLayoutParams(relativeLayout$LayoutParams0);
                }
                else if(this.wN() instanceof SurfaceView) {
                    ((SurfaceView)this.wN()).setLayoutParams(relativeLayout$LayoutParams0);
                }
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.cRA.getLayoutParams();
                if(viewGroup$LayoutParams0 != null) {
                    viewGroup$LayoutParams0.height = (int)f3;
                    viewGroup$LayoutParams0.width = (int)f2;
                    this.cRA.setLayoutParams(viewGroup$LayoutParams0);
                }
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        RD.PjT(this.PjT, "changeSize error", throwable0);
    }

    private void Zh(long v, long v1) {
        this.Au.ReZ(v);
        this.SM = v;
        this.KM = v1;
        com.bytedance.sdk.openadsdk.core.xf.cr.PjT.4 pjT$40 = new Runnable() {
            final PjT cr;

            @Override
            public void run() {
                PjT.this.XX.PjT(v, v1);
                PjT.this.XX.PjT(z.a.a(v, v1));
                try {
                    if(PjT.this.iZZ != null) {
                        PjT.this.iZZ.PjT(v, v1);
                    }
                }
                catch(Throwable throwable0) {
                    RD.PjT(PjT.this.PjT, "onProgressUpdate error: ", throwable0);
                }
            }
        };
        this.ReZ.post(pjT$40);
    }

    @Override  // x.b
    public void Zh() {
        com.bytedance.sdk.openadsdk.core.xf.Zh.JQp jQp0 = this.XX;
        if(jQp0 != null) {
            jQp0.PjT();
            this.XX.qla();
            this.XX.gK();
        }
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
        if(!this.ig && this.Owx.get()) {
            this.iZZ();
            com.bytedance.sdk.openadsdk.core.qj.PjT pjT0 = this.Au.QB();
            if(pjT0 != null && pjT0.PjT() != null) {
                pjT0.PjT().ReZ(this.JQp());
            }
        }
    }

    @Override  // x.b
    public void cr() {
        this.ReZ();
    }

    protected void gK() {
    }

    static String iZZ(PjT pjT0) {
        return pjT0.PjT;
    }

    private void ig() {
        this.cz.ReZ(this.Qf());
        this.cz.PjT(this.tT);
        this.qZS = System.currentTimeMillis();
        this.XX.ReZ(8);
        this.XX.ReZ(0);
        this.PjT(new Runnable() {
            final PjT PjT;

            @Override
            public void run() {
                if(PjT.this.cz == null) {
                    return;
                }
                PjT.this.qZS = System.currentTimeMillis();
                PjT.this.XX.cr(0);
                PjT.this.cz.PjT(true, PjT.this.SM, PjT.this.xE);
            }
        });
    }

    private void kph() {
        if(this.XX == null) {
            return;
        }
        this.ReZ.removeCallbacks(this.kph);
        this.XX.Zh();
        this.Zd = System.currentTimeMillis() - this.qZS;
        if(!this.ig) {
            this.ig = true;
            this.Zh(this.KM, this.KM);
            this.SM = this.KM;
            this.DWo = this.KM;
            this.Zh(this.wN);
        }
        x.b.a b$a0 = this.iZZ;
        if(b$a0 != null) {
            b$a0.PjT(this.Zd, z.a.a(this.SM, this.KM));
        }
        this.fDm = true;
    }

    public void qZS() {
        cz cz0 = this.Yo;
        if(cz0 != null) {
            cz0.PjT(2);
        }
    }

    private void rds() {
        int v;
        switch(this.tT.JQp) {
            case 1: 
            case 2: {
                v = ub.cr().ig() * 1000;
                break;
            }
            case 4: {
                v = ub.cr().SM(String.valueOf(this.rds));
                break;
            }
            default: {
                v = 5000;
            }
        }
        this.ReZ.removeCallbacks(this.kph);
        this.ReZ.postDelayed(this.kph, ((long)v));
    }

    public d wN() {
        return this.XX == null ? null : this.XX.xs();
    }

    static String xR(PjT pjT0) {
        return pjT0.PjT;
    }

    static String yks(PjT pjT0) {
        return pjT0.PjT;
    }
}

