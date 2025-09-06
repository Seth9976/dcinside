package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.adexpress.Zh.fDm;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.component.reward.PjT.xE;
import com.bytedance.sdk.openadsdk.component.reward.Zh.Zh;
import com.bytedance.sdk.openadsdk.component.reward.Zh.cr;
import com.bytedance.sdk.openadsdk.core.JQp.cz;
import com.bytedance.sdk.openadsdk.core.Zh.JQp;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.model.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import java.util.concurrent.atomic.AtomicBoolean;

public class DWo {
    View Au;
    ImageView DWo;
    ImageView JQp;
    private int Owx;
    int PjT;
    private boolean RD;
    protected final PjT ReZ;
    PAGLogoView SM;
    private ReZ Sks;
    View XX;
    final Activity Zh;
    final Owx cr;
    FrameLayout cz;
    protected final AtomicBoolean fDm;
    private final boolean gK;
    private final String ltE;
    RelativeLayout qj;
    public gK qla;
    Runnable ub;
    cz xE;
    xE xf;
    protected int xs;

    public DWo(PjT pjT0) {
        this.PjT = 3;
        this.xs = 0;
        this.fDm = new AtomicBoolean(false);
        this.ub = new Runnable() {
            final DWo PjT;

            @Override
            public void run() {
                try {
                    Owx owx0 = DWo.this.cr;
                    if(owx0 != null && owx0.es()) {
                        return;
                    }
                    ImageView imageView0 = DWo.this.JQp;
                    if(imageView0 != null) {
                        int[] arr_v = new int[2];
                        imageView0.getLocationOnScreen(arr_v);
                        DWo.this.ReZ.wN.PjT(arr_v[0]);
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        };
        this.ReZ = pjT0;
        this.Zh = pjT0.rds;
        this.cr = pjT0.Zh;
        this.ltE = pjT0.JQp;
        this.gK = pjT0.cr;
    }

    protected void Au() {
        ReZ reZ0 = this.Sks;
        if(reZ0 == null) {
            return;
        }
        reZ0.PjT();
    }

    public View DWo() {
        return this.JQp;
    }

    void JQp() {
        int v = this.cr.rds();
        this.PjT = v;
        if(v == -200) {
            this.PjT = ub.cr().qla(String.valueOf(this.cr.joj()));
        }
        if(this.PjT == -1 && !this.PjT()) {
            Zh zh0 = this.ReZ.wKV;
            if(!(zh0 instanceof cr) && !(zh0 instanceof com.bytedance.sdk.openadsdk.component.reward.Zh.ReZ)) {
                this.Zh(0);
            }
        }
    }

    public void JQp(int v) {
        qZS.PjT(this.JQp, v);
        if(v == 0 && !this.ReZ.DWo.get() && cRA.XX(this.ReZ.Zh)) {
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(this.ReZ.Zh, this.ReZ.JQp, "show_close_button", null, System.currentTimeMillis() - this.ReZ.CY);
        }
    }

    private int PjT(String s) {
        Resources resources0 = this.Zh.getResources();
        return resources0 == null ? 0 : resources0.getDimensionPixelSize(resources0.getIdentifier(s, "dimen", "android"));
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.Zh.ReZ reZ0) {
        qZS.PjT(this.cz, reZ0, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void PjT(float f) {
        qZS.PjT(this.JQp, f);
    }

    public void PjT(int v) {
        if(this.xE == null) {
            this.xE = new cz(this.ReZ.rds);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(120, 120);
            frameLayout$LayoutParams0.gravity = 17;
            this.xE.setLayoutParams(frameLayout$LayoutParams0);
            Drawable drawable0 = com.bytedance.sdk.openadsdk.utils.DWo.PjT(this.ReZ.rds, "tt_video_loading_progress_bar");
            this.xE.setIndeterminateDrawable(drawable0);
            this.ReZ.Zd.cz().addView(this.xE);
        }
        this.xE.setVisibility(v);
    }

    public void PjT(int v, int v1) {
        if(this.cr.qZS() == 1 && (this.cz != null && this.cz.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int v2 = qZS.ReZ(this.Zh);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = (RelativeLayout.LayoutParams)this.cz.getLayoutParams();
            relativeLayout$LayoutParams0.width = v2;
            int v3 = v2 * 9 / 16;
            relativeLayout$LayoutParams0.height = v3;
            this.cz.setLayoutParams(relativeLayout$LayoutParams0);
            this.xs = (qZS.JQp(this.Zh) - v3) / 2;
        }
    }

    public void PjT(int v, fDm fDm0) {
        gK gK0 = this.qla;
        if(gK0 != null) {
            gK0.PjT(v, fDm0);
        }
    }

    public void PjT(View.OnClickListener view$OnClickListener0) {
        qZS.PjT(this.cz, view$OnClickListener0, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void PjT(Animation animation0) {
        RelativeLayout relativeLayout0 = this.qj;
        if(relativeLayout0 != null) {
            relativeLayout0.startAnimation(animation0);
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.Zh.ReZ reZ0, View.OnTouchListener view$OnTouchListener0, View.OnClickListener view$OnClickListener0) {
        if(this.cz != null && (this.cr != null && this.cr.Zd() != null)) {
            if(!this.cr.Zd().cz || gK.Zh(this.cr)) {
                this.PjT(view$OnClickListener0);
            }
            else {
                this.PjT(reZ0);
                this.PjT(reZ0);
            }
        }
        if(this.cr != null && this.cr.qZS() == 1) {
            if(this.cr.Zd() != null) {
                View view0 = this.XX;
                if(view0 != null) {
                    qZS.PjT(view0, 0);
                    RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = (RelativeLayout.LayoutParams)this.XX.getLayoutParams();
                    relativeLayout$LayoutParams0.height = this.xs;
                    this.XX.setLayoutParams(relativeLayout$LayoutParams0);
                    if(this.cr.Zd().Zh) {
                        this.XX.setOnClickListener(reZ0);
                        this.XX.setOnTouchListener(view$OnTouchListener0);
                    }
                    else {
                        this.XX.setOnClickListener(view$OnClickListener0);
                    }
                }
            }
            if(this.cr.Zd() != null) {
                View view1 = this.Au;
                if(view1 != null) {
                    qZS.PjT(view1, 0);
                    RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = (RelativeLayout.LayoutParams)this.Au.getLayoutParams();
                    relativeLayout$LayoutParams1.height = this.xs;
                    this.Au.setLayoutParams(relativeLayout$LayoutParams1);
                    if(this.cr.Zd().cr) {
                        this.Au.setOnClickListener(reZ0);
                        this.Au.setOnTouchListener(view$OnTouchListener0);
                    }
                    else {
                        this.Au.setOnClickListener(view$OnClickListener0);
                    }
                }
            }
        }
        PAGLogoView pAGLogoView0 = this.SM;
        if(pAGLogoView0 != null) {
            pAGLogoView0.setOnClickListener(new View.OnClickListener() {
                final DWo PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    try {
                        TTWebsiteActivity.PjT(DWo.this.Zh, DWo.this.cr, DWo.this.ltE);
                    }
                    catch(Throwable throwable0) {
                        RD.Zh("TTAD.RFullVideoLayout", throwable0.getMessage());
                    }
                }
            });
        }
        ImageView imageView0 = this.DWo;
        if(imageView0 != null) {
            imageView0.setClickable(true);
            com.bytedance.sdk.openadsdk.gK.Zh.PjT().PjT(((int)qZS.PjT(ub.PjT(), 14.0f, true)), this.DWo, this.ReZ.Zh);
        }
    }

    public void PjT(boolean z) {
        int v = 0;
        qZS.PjT(this.SM, (cRA.ReZ(this.cr) ? 8 : 0));
        ImageView imageView0 = this.DWo;
        if(!this.cr.uvo() || !this.cr.xf()) {
            v = 8;
        }
        qZS.PjT(imageView0, v);
        this.Zh(z);
        if(this.gK) {
            this.JQp();
        }
    }

    protected boolean PjT() {
        return true;
    }

    public void ReZ() {
        this.cz.removeAllViews();
    }

    public void ReZ(int v) {
        qZS.PjT(this.SM, v);
    }

    public boolean SM() {
        return this.JQp != null && this.JQp.getVisibility() == 0;
    }

    public void XX() {
        if(this.DWo.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.DWo.getLayoutParams();
            viewGroup$MarginLayoutParams0.setMargins(0, 0, 11, 16);
            viewGroup$MarginLayoutParams0.setMarginStart(0);
            viewGroup$MarginLayoutParams0.setMarginEnd(11);
            this.DWo.setLayoutParams(viewGroup$MarginLayoutParams0);
        }
    }

    public void Zh() {
        if(this.RD) {
            return;
        }
        this.RD = true;
        this.Owx = this.ReZ.cI;
        if(this.PjT()) {
            xE xE0 = new xE(this.ReZ);
            this.xf = xE0;
            xE0.PjT();
        }
        this.gK();
        gK gK0 = new gK(this.Zh, this.cr, this.ltE, this.cz, this.ReZ.kph, this.ReZ.ig);
        this.qla = gK0;
        gK0.PjT();
    }

    public void Zh(int v) {
        if(this.cr != null && this.cr.uvo() && xs.PjT(this.cr)) {
            qZS.PjT(this.Sks, 8);
            return;
        }
        qZS.PjT(this.Sks, v);
    }

    void Zh(boolean z) {
        if(this.Owx != 1) {
            ImageView imageView0 = this.JQp;
            if(imageView0 != null && z) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = imageView0.getLayoutParams();
                if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
                    int v = this.PjT("navigation_bar_height");
                    if(v > 0 && v > ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin) {
                        ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin = v;
                    }
                }
            }
        }
        Zh zh0 = this.ReZ.wKV;
        if(!(zh0 instanceof cr) && !(zh0 instanceof com.bytedance.sdk.openadsdk.component.reward.Zh.ReZ)) {
            this.Zh(0);
        }
    }

    public void cr() {
        qZS.PjT(this.cz, 8);
        qZS.PjT(this.XX, 8);
        qZS.PjT(this.Au, 8);
        this.Zh(8);
        qZS.PjT(this.JQp, 8);
        qZS.PjT(this.SM, 8);
        qZS.PjT(this.qj, 8);
        qZS.PjT(this.DWo, 8);
    }

    public void cr(int v) {
        if(this.PjT != -1 && v == this.PjT && !this.fDm.get()) {
            this.Zh(0);
            this.fDm.set(true);
            this.Au();
        }
    }

    public FrameLayout cz() {
        return this.cz;
    }

    public void fDm() {
        gK gK0 = this.qla;
        if(gK0 != null) {
            gK0.cz();
        }
        ImageView imageView0 = this.JQp;
        if(imageView0 != null) {
            imageView0.removeCallbacks(this.ub);
        }
    }

    private void gK() {
        ReZ reZ0 = (ReZ)this.ReZ.ig.findViewById(qla.xf);
        this.Sks = reZ0;
        reZ0.PjT(this.ReZ);
        this.SM = (PAGLogoView)this.ReZ.ig.findViewById(0x1F00003D);
        this.DWo = (ImageView)this.ReZ.ig.findViewById(qla.GL);
        this.JQp = (ImageView)this.ReZ.ig.findViewById(0x1F00000C);
        this.cz = (FrameLayout)this.ReZ.ig.findViewById(qla.qj);
        this.XX = this.ReZ.ig.findViewById(qla.ub);
        this.Au = this.ReZ.ig.findViewById(qla.UR);
        this.qj = (RelativeLayout)this.ReZ.ig.findViewById(qla.Sky);
        if(this.xf != null && this.xf.cr() != null) {
            RelativeLayout relativeLayout0 = this.qj;
            if(relativeLayout0 != null) {
                relativeLayout0.addView(this.xf.cr(), new LinearLayout.LayoutParams(-1, -1));
                this.xf.Zh();
            }
        }
    }

    public View qj() {
        return this.Sks;
    }

    public void qla() {
        gK gK0 = this.qla;
        if(gK0 != null) {
            gK0.XX();
        }
    }

    public void ub() {
        JQp jQp0 = this.ReZ.Yo.JQp();
        ReZ reZ0 = this.Sks;
        if(reZ0 == null) {
            reZ0 = this.ReZ.ig;
        }
        jQp0.onClick(reZ0);
    }

    public void xE() {
        gK gK0 = this.qla;
        if(gK0 != null) {
            gK0.Au();
        }
    }

    public void xf() {
        try {
            xE xE0 = this.xf;
            if(xE0 != null) {
                xE0.ReZ();
            }
            RelativeLayout relativeLayout0 = this.qj;
            if(relativeLayout0 != null) {
                relativeLayout0.removeAllViews();
            }
        }
        catch(Throwable unused_ex) {
            RelativeLayout relativeLayout1 = this.qj;
            if(relativeLayout1 != null) {
                relativeLayout1.setAlpha(0.0f);
            }
        }
    }

    public void xs() {
        try {
            int v = Lrd.SM(this.ReZ.rds, "tt_fade_out");
            Animation animation0 = AnimationUtils.loadAnimation(this.ReZ.rds, v);
            if(animation0 != null) {
                animation0.setAnimationListener(new Animation.AnimationListener() {
                    final DWo PjT;

                    @Override  // android.view.animation.Animation$AnimationListener
                    public void onAnimationEnd(Animation animation0) {
                        DWo.this.ReZ.Zd.xf();
                    }

                    @Override  // android.view.animation.Animation$AnimationListener
                    public void onAnimationRepeat(Animation animation0) {
                    }

                    @Override  // android.view.animation.Animation$AnimationListener
                    public void onAnimationStart(Animation animation0) {
                    }
                });
                this.ReZ.Zd.PjT(animation0);
                return;
            }
            this.ReZ.Zd.xf();
        }
        catch(Throwable unused_ex) {
            this.ReZ.Zd.xf();
        }
    }
}

