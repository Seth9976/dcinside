package com.bytedance.sdk.openadsdk.core.Au;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Zh.XX;
import com.bytedance.sdk.component.adexpress.Zh.cr;
import com.bytedance.sdk.component.adexpress.Zh.fDm;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.cRA;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class ReZ {
    public static class PjT implements cr, Zh {
        private FrameLayout Au;
        private final int DWo;
        private final Context JQp;
        AtomicBoolean PjT;
        private TTDislikeDialogAbstract ReZ;
        private Owx SM;
        private final int XX;
        private com.bytedance.sdk.openadsdk.ReZ.ReZ Zh;
        private String cr;
        private final int cz;
        private XX fDm;
        private String qj;
        private PAGExpressAdWrapperListener qla;
        private JQp xf;
        private int xs;

        public PjT(Context context0, Owx owx0, int v, int v1, String s, int v2) {
            this.PjT = new AtomicBoolean(false);
            this.qj = s;
            if(owx0 != null && owx0.es()) {
                this.qj = "fullscreen_interstitial_ad";
            }
            this.JQp = context0;
            this.cz = v;
            this.XX = v1;
            this.SM = owx0;
            this.DWo = qZS.Zh(context0, 3.0f);
            this.xs = v2;
            this.cz();
        }

        @SuppressLint({"ClickableViewAccessibility"})
        private JQp Au() {
            JQp jQp0 = com.bytedance.sdk.openadsdk.core.Au.cr.PjT().Zh();
            this.xf = jQp0;
            if(jQp0 == null) {
                this.xf = new JQp(this.JQp);
            }
            com.bytedance.sdk.openadsdk.core.Au.cr.PjT().ReZ(this.xf);
            this.xf.PjT(this.SM, this, this.qj);
            this.xf.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.xf;
        }

        @Override  // com.bytedance.sdk.component.adexpress.Zh.cr
        public View JQp() {
            return this.Au;
        }

        @Override  // com.bytedance.sdk.openadsdk.core.Au.JQp$Zh
        public View PjT() {
            return null;
        }

        @Override  // com.bytedance.sdk.openadsdk.core.Au.JQp$Zh
        public void PjT(int v, int v1) {
            XX xX0 = this.fDm;
            if(xX0 != null) {
                xX0.PjT(v, "render fail");
            }
        }

        @Override  // com.bytedance.sdk.openadsdk.core.Au.JQp$Zh
        public void PjT(View view0, int v) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener0 = this.qla;
            if(pAGExpressAdWrapperListener0 != null) {
                pAGExpressAdWrapperListener0.onAdClicked();
            }
        }

        @Override  // com.bytedance.sdk.component.adexpress.Zh.cr
        public void PjT(XX xX0) {
            if(this.PjT.get()) {
                return;
            }
            if(this.JQp != null) {
                Owx owx0 = this.SM;
                if(owx0 != null) {
                    this.fDm = xX0;
                    if(TextUtils.isEmpty(owx0.sjb())) {
                        xX0.PjT(106, "dsp data is null");
                        return;
                    }
                    this.xf.Owx();
                    return;
                }
            }
            xX0.PjT(106, "material null");
        }

        public void PjT(TTDislikeDialogAbstract tTDislikeDialogAbstract0) {
            if(tTDislikeDialogAbstract0 != null) {
                Owx owx0 = this.SM;
                if(owx0 != null) {
                    tTDislikeDialogAbstract0.setMaterialMeta(owx0.xR(), this.SM.na());
                }
            }
            this.ReZ = tTDislikeDialogAbstract0;
        }

        public void PjT(PAGExpressAdWrapperListener pAGExpressAdWrapperListener0) {
            this.qla = pAGExpressAdWrapperListener0;
        }

        public void PjT(cRA cRA0) {
            if(cRA0 instanceof com.bytedance.sdk.openadsdk.ReZ.ReZ) {
                this.Zh = (com.bytedance.sdk.openadsdk.ReZ.ReZ)cRA0;
            }
        }

        public void PjT(String s) {
            this.cr = s;
        }

        @Override  // com.bytedance.sdk.component.adexpress.Zh.cr
        public int ReZ() {
            return 5;
        }

        private View XX() {
            View view0 = PAGLogoView.createPAGLogoViewByMaterial(this.JQp, this.SM);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
            if(this.SM == null || !this.SM.es()) {
                frameLayout$LayoutParams0.topMargin = this.DWo;
                frameLayout$LayoutParams0.leftMargin = this.DWo;
            }
            else {
                frameLayout$LayoutParams0.leftMargin = qZS.Zh(this.JQp, 20.0f);
                frameLayout$LayoutParams0.bottomMargin = qZS.Zh(this.JQp, 20.0f);
                frameLayout$LayoutParams0.gravity = 0x800053;
            }
            view0.setLayoutParams(frameLayout$LayoutParams0);
            view0.setOnClickListener(new View.OnClickListener() {
                final PjT PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    TTWebsiteActivity.PjT(PjT.this.JQp, PjT.this.SM, PjT.this.qj);
                }
            });
            return view0;
        }

        @Override  // com.bytedance.sdk.openadsdk.core.Au.JQp$Zh
        public View Zh() {
            return this.Au == null ? null : ((View)this.Au.getParent());
        }

        public void cr() {
            this.Au = null;
            this.Zh = null;
            this.ReZ = null;
            this.fDm = null;
            this.SM = null;
            JQp jQp0 = this.xf;
            if(jQp0 != null) {
                jQp0.xE();
                com.bytedance.sdk.openadsdk.core.Au.cr.PjT().PjT(this.xf);
            }
            this.PjT.set(true);
        }

        private void cz() {
            FrameLayout frameLayout0 = new FrameLayout(this.JQp);
            this.Au = frameLayout0;
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)frameLayout0.getLayoutParams();
            if(frameLayout$LayoutParams0 == null) {
                frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.cz, this.XX);
            }
            frameLayout$LayoutParams0.width = this.cz;
            frameLayout$LayoutParams0.height = this.XX;
            frameLayout$LayoutParams0.gravity = 17;
            this.Au.setLayoutParams(frameLayout$LayoutParams0);
            JQp jQp0 = this.Au();
            this.Au.addView(jQp0);
            View view0 = this.XX();
            this.Au.addView(view0);
            if(this.SM != null && this.SM.es()) {
                jQp0.setBackgroundColor(0xFF000000);
                jQp0.PjT(((Activity)this.JQp).findViewById(qla.wWn), FriendlyObstructionPurpose.OTHER);
            }
            FriendlyObstructionPurpose friendlyObstructionPurpose0 = FriendlyObstructionPurpose.OTHER;
            jQp0.PjT(view0, friendlyObstructionPurpose0);
            Context context0 = this.JQp;
            if(context0 != null && context0 instanceof Activity) {
                View view1 = ((Activity)context0).findViewById(qla.FaL);
                if(view1 != null) {
                    jQp0.PjT(view1, friendlyObstructionPurpose0);
                }
                View view2 = ((Activity)this.JQp).findViewById(qla.Sky);
                if(view2 != null) {
                    jQp0.PjT(view2, friendlyObstructionPurpose0);
                }
            }
        }

        @Override  // com.bytedance.sdk.openadsdk.core.Au.JQp$Zh
        @SuppressLint({"ClickableViewAccessibility"})
        public void e_() {
            if(this.fDm != null) {
                fDm fDm0 = new fDm();
                fDm0.PjT(true);
                fDm0.PjT(((double)qZS.ReZ(this.JQp, ((float)this.cz))));
                fDm0.Zh(((double)qZS.ReZ(this.JQp, ((float)this.XX))));
                this.fDm.PjT(this.Au, fDm0);
            }
        }
    }

    interface com.bytedance.sdk.openadsdk.core.Au.ReZ.ReZ {
        void PjT();

        void PjT(int arg1, int arg2);

        void PjT(String arg1);

        void Zh(String arg1);
    }

    static class com.bytedance.sdk.openadsdk.core.Au.ReZ.Zh implements Runnable {
        com.bytedance.sdk.openadsdk.core.Au.ReZ.ReZ PjT;

        public com.bytedance.sdk.openadsdk.core.Au.ReZ.Zh(com.bytedance.sdk.openadsdk.core.Au.ReZ.ReZ reZ$ReZ0) {
            this.PjT = reZ$ReZ0;
        }

        @Override
        public void run() {
            com.bytedance.sdk.openadsdk.core.Au.ReZ.ReZ reZ$ReZ0 = this.PjT;
            if(reZ$ReZ0 != null) {
                reZ$ReZ0.PjT(107, 107);
            }
        }
    }

    private ScheduledFuture Au;
    private ltE JQp;
    Owx PjT;
    private PjT ReZ;
    private int SM;
    private int XX;
    private final Context Zh;
    private com.bytedance.sdk.component.adexpress.Zh.qla cr;
    private int cz;

    public ReZ(Context context0, ltE ltE0, Owx owx0, String s) {
        this.PjT = owx0;
        this.Zh = context0;
        this.JQp = ltE0;
        this.PjT(ltE0);
        this.ReZ = new PjT(context0, owx0, this.cz, this.XX, s, this.SM);
    }

    private void PjT(ltE ltE0) {
        if(this.PjT != null && this.PjT.es()) {
            this.cz = -1;
            this.XX = -1;
            return;
        }
        ub ub0 = com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT(ltE0.getExpectExpressWidth(), ltE0.getExpectExpressHeight());
        this.SM = ub0.PjT;
        if(ltE0.getExpectExpressWidth() <= 0 || ltE0.getExpectExpressHeight() <= 0) {
            int v = qZS.ReZ(this.Zh);
            this.cz = v;
            this.XX = ((float)(((float)v) / ub0.Zh)).intValue();
        }
        else {
            float f = (float)ltE0.getExpectExpressWidth();
            this.cz = qZS.Zh(this.Zh, f);
            float f1 = (float)ltE0.getExpectExpressHeight();
            this.XX = qZS.Zh(this.Zh, f1);
        }
        if(this.cz > 0 && this.cz > qZS.ReZ(this.Zh)) {
            float f2 = ((float)qZS.ReZ(this.Zh)) / ((float)this.cz);
            this.cz = qZS.ReZ(this.Zh);
            this.XX = ((float)(((float)this.XX) * f2)).intValue();
        }
    }

    public void PjT() {
        if(this.PjT != null && this.PjT.es()) {
            this.Au = Jo.PjT().schedule(new com.bytedance.sdk.openadsdk.core.Au.ReZ.Zh(this.ReZ.xf), ((long)com.bytedance.sdk.openadsdk.core.ub.cr().cRA()), TimeUnit.MILLISECONDS);
        }
        PjT reZ$PjT0 = this.ReZ;
        if(reZ$PjT0 != null) {
            reZ$PjT0.PjT(new XX() {
                final ReZ PjT;

                @Override  // com.bytedance.sdk.component.adexpress.Zh.XX
                public void PjT(int v, String s) {
                    if(ReZ.this.cr != null) {
                        ReZ.this.cr.a_(106);
                    }
                    ReZ.this.ReZ();
                }

                @Override  // com.bytedance.sdk.component.adexpress.Zh.XX
                public void PjT(View view0, fDm fDm0) {
                    if(ReZ.this.JQp == null || view0 == null) {
                        if(ReZ.this.cr != null) {
                            ReZ.this.cr.a_(106);
                        }
                    }
                    else if(ReZ.this.cr != null) {
                        ReZ.this.cr.PjT(ReZ.this.ReZ, fDm0);
                    }
                    ReZ.this.ReZ();
                }
            });
            View view0 = this.ReZ.JQp();
            this.JQp.removeView(view0);
            if(view0.getParent() != null) {
                ((ViewGroup)view0.getParent()).removeView(view0);
            }
            this.JQp.addView(view0, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.bytedance.sdk.component.adexpress.Zh.qla qla0 = this.cr;
        if(qla0 != null) {
            qla0.a_(106);
        }
    }

    public void PjT(com.bytedance.sdk.component.adexpress.Zh.qla qla0) {
        this.cr = qla0;
    }

    public void PjT(TTDislikeDialogAbstract tTDislikeDialogAbstract0) {
        PjT reZ$PjT0 = this.ReZ;
        if(reZ$PjT0 != null) {
            reZ$PjT0.PjT(tTDislikeDialogAbstract0);
        }
    }

    public void PjT(PAGExpressAdWrapperListener pAGExpressAdWrapperListener0) {
        PjT reZ$PjT0 = this.ReZ;
        if(reZ$PjT0 != null) {
            reZ$PjT0.PjT(pAGExpressAdWrapperListener0);
        }
    }

    public void PjT(cRA cRA0) {
        PjT reZ$PjT0 = this.ReZ;
        if(reZ$PjT0 != null) {
            reZ$PjT0.PjT(cRA0);
        }
    }

    public void PjT(String s) {
        PjT reZ$PjT0 = this.ReZ;
        if(reZ$PjT0 != null) {
            reZ$PjT0.PjT(s);
        }
    }

    private void ReZ() {
        try {
            if(this.Au != null && !this.Au.isCancelled()) {
                this.Au.cancel(false);
                this.Au = null;
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public void Zh() {
        PjT reZ$PjT0 = this.ReZ;
        if(reZ$PjT0 != null) {
            reZ$PjT0.cr();
            this.ReZ = null;
        }
        this.ReZ();
        this.cr = null;
        this.JQp = null;
    }
}

