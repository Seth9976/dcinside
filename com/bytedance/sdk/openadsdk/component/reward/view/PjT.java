package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.Zh.JQp;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.fDm;
import com.bytedance.sdk.openadsdk.core.model.xE;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.fDm.Au;
import com.bytedance.sdk.openadsdk.fDm.ReZ;
import com.bytedance.sdk.openadsdk.fDm.SM;
import com.bytedance.sdk.openadsdk.fDm.XX;
import com.bytedance.sdk.openadsdk.fDm.Zh;
import com.bytedance.sdk.openadsdk.fDm.cr;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.List;

public class PjT extends com.bytedance.sdk.openadsdk.core.Au.PjT {
    private JQp Owx;
    private float PjT;
    private int fDm;
    private View gK;
    private FrameLayout ltE;
    private int qla;
    private View ub;
    private int xE;
    private boolean xs;

    public PjT(@NonNull Context context0, String s) {
        super(context0, s);
        this.xE = 1;
        this.Zh = context0;
    }

    private void Au() {
        cr cr0 = new cr(this.Zh);
        this.ub = cr0;
        this.Zh(cr0);
        this.cr();
    }

    private void DWo() {
        Au au0 = new Au(this.Zh);
        this.ub = au0;
        this.Zh(au0);
        this.cr();
    }

    private void JQp() {
        ReZ reZ0 = new ReZ(this.Zh);
        this.ub = reZ0;
        this.Zh(reZ0);
        this.cr();
        this.cz();
    }

    private cz PjT(Owx owx0, Context context0) {
        if(owx0 == null) {
            return null;
        }
        return owx0.cI() == 4 ? new com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cr(context0, owx0, this.cz) : null;
    }

    private void PjT(float f) {
        int v3;
        int v2;
        int v1;
        float f4;
        float f3;
        float f1 = this.getHeightDp();
        float f2 = this.getWidthDp();
        if(this.xE == 2) {
            f3 = Math.max(f1, f2);
            f4 = Math.min(f1, f2);
        }
        else {
            f3 = Math.min(f1, f2);
            f4 = Math.max(f1, f2);
        }
        if(this.xE != 2 && qZS.ReZ(((Activity)this.Zh))) {
            f4 -= (float)qZS.ReZ(this.Zh, qZS.PjT());
        }
        int v = 20;
        if(this.xE == 2) {
            if(f == 0 || f == 0x42C80000) {
                v = 0;
                v1 = 0;
                v2 = 0;
                v3 = 0;
            }
            else {
                v2 = (int)Math.max((f3 - (f4 - 20.0f - 20.0f) * f) / 2.0f, 0.0f);
                v3 = v2;
                v1 = 20;
            }
        }
        else if(f != 0 && f != 0x42C80000) {
            v1 = (int)Math.max((f4 - (f3 - 20.0f - 20.0f) / f) / 2.0f, 0.0f);
            v = v1;
            v2 = 20;
            v3 = 20;
        }
        else {
            v = 0;
            v1 = 0;
            v2 = 0;
            v3 = 0;
        }
        int v4 = qZS.Zh(this.Zh, ((float)v));
        int v5 = qZS.Zh(this.Zh, ((float)v1));
        int v6 = qZS.Zh(this.Zh, ((float)v2));
        int v7 = qZS.Zh(this.Zh, ((float)v3));
        ((Activity)this.Zh).getWindow().getDecorView().setPadding(v6, v4, v7, v5);
    }

    private void PjT(FrameLayout frameLayout0, ImageView imageView0) {
        Owx owx0 = this.ReZ;
        if(owx0 == null) {
            return;
        }
        boolean z = Owx.JQp(owx0);
        if(this.ReZ.MWx() != null && z) {
            qZS.PjT(imageView0, 8);
            qZS.PjT(frameLayout0, 0);
            return;
        }
        this.PjT(imageView0);
        qZS.PjT(imageView0, 0);
        qZS.PjT(frameLayout0, 8);
    }

    private void PjT(ImageView imageView0) {
        Owx owx0 = this.ReZ;
        if(owx0 == null) {
            return;
        }
        List list0 = owx0.CY();
        if(list0 != null && list0.size() > 0) {
            xE xE0 = (xE)list0.get(0);
            if(xE0 != null) {
                com.bytedance.sdk.openadsdk.SM.cr.PjT(xE0).ReZ(2).PjT(com.bytedance.sdk.openadsdk.SM.ReZ.PjT(this.ReZ, xE0.PjT(), imageView0));
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.PjT
    protected void PjT(View view0, int v, fDm fDm0) {
    }

    public void PjT(Owx owx0, float f, int v, int v1, int v2) {
        this.PjT = f;
        this.xE = v;
        this.ReZ = owx0;
        this.cz = "fullscreen_interstitial_ad";
        this.fDm = v1;
        this.qla = v2;
        this.PjT(this.SM);
        this.Zh();
    }

    private void ReZ() {
        com.bytedance.sdk.openadsdk.fDm.PjT pjT0 = new com.bytedance.sdk.openadsdk.fDm.PjT(this.Zh);
        this.ub = pjT0;
        this.Zh(pjT0);
        this.cr();
        this.cz();
    }

    private void ReZ(View view0) {
        if(view0 == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0 = this.Owx;
        if(pjT0 == null) {
            pjT0 = new com.bytedance.sdk.openadsdk.core.Zh.PjT(this.Zh, this.ReZ, this.cz, wN.PjT(this.cz));
            pjT0.PjT(this.PjT(this.ReZ, this.Zh));
        }
        view0.setOnTouchListener(pjT0);
        view0.setOnClickListener(pjT0);
    }

    private void SM() {
        com.bytedance.sdk.openadsdk.fDm.cz cz0 = new com.bytedance.sdk.openadsdk.fDm.cz(this.Zh);
        this.ub = cz0;
        this.Zh(cz0);
        this.cr();
        this.cz();
    }

    private void XX() {
        Zh zh0 = new Zh(this.Zh);
        this.ub = zh0;
        this.Zh(zh0);
        this.cr();
        this.cz();
    }

    private void Zh() {
        this.XX = qZS.Zh(this.Zh, ((float)this.fDm));
        this.Au = qZS.Zh(this.Zh, ((float)this.qla));
        int v = (int)(this.PjT * 1000.0f);
        if(this.xE == 1) {
            switch(v) {
                case 666: {
                    this.JQp();
                    return;
                }
                case 1000: {
                    this.ReZ();
                    return;
                }
                case 1500: {
                    this.qj();
                    return;
                }
                default: {
                    if(v != 0x6F1) {
                        this.PjT(0.562f);
                        this.xf();
                        return;
                    }
                    this.xs();
                    return;
                }
            }
        }
        switch(v) {
            case 562: {
                this.SM();
                return;
            }
            case 666: {
                this.XX();
                return;
            }
            case 1000: {
                this.ReZ();
                return;
            }
            case 1500: {
                this.Au();
                return;
            }
            default: {
                this.PjT(1.777f);
                this.DWo();
            }
        }
    }

    private void Zh(View view0) {
        if(view0.getParent() == null) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
            view0.setLayoutParams(frameLayout$LayoutParams0);
            frameLayout$LayoutParams0.gravity = 17;
            this.addView(view0);
        }
    }

    private void cr() {
        this.ltE = (FrameLayout)this.ub.findViewById(qla.ZsT);
        ImageView imageView0 = (ImageView)this.ub.findViewById(qla.oMU);
        com.bytedance.sdk.openadsdk.core.widget.xE xE0 = (com.bytedance.sdk.openadsdk.core.widget.xE)this.ub.findViewById(qla.Vs);
        View view0 = this.ub.findViewById(qla.jp);
        View view1 = this.ub.findViewById(qla.Wo);
        View view2 = this.ub.findViewById(0x1F00002B);
        if(!TextUtils.isEmpty(this.ReZ.Nv())) {
            ((TextView)view1).setText(this.ReZ.Nv());
        }
        this.PjT(this.ltE, imageView0);
        if(this.ReZ.Xe() != null && !TextUtils.isEmpty(this.ReZ.Xe().PjT())) {
            com.bytedance.sdk.openadsdk.gK.Zh.PjT().PjT(this.ReZ.Xe().PjT(), this.ReZ.Xe().Zh(), this.ReZ.Xe().ReZ(), xE0, this.ReZ);
        }
        ((TextView)view0).setText(this.getTitle());
        this.ReZ(this.ltE);
        this.ReZ(imageView0);
        this.ReZ(xE0);
        this.ReZ(((TextView)view0));
        this.ReZ(((TextView)view1));
        if(view2 instanceof PAGLogoView) {
            ((PAGLogoView)view2).initData(this.ReZ);
        }
        view2.setOnClickListener(new View.OnClickListener() {
            final PjT PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                try {
                    TTWebsiteActivity.PjT(PjT.this.Zh, PjT.this.ReZ, PjT.this.cz);
                }
                catch(Throwable throwable0) {
                    RD.Zh("FullInteractionStyleView", throwable0.getMessage());
                }
            }
        });
    }

    private void cz() {
        TextView textView0 = (TextView)this.ub.findViewById(qla.dDm);
        if(textView0 != null) {
            textView0.setText(this.getDescription());
            this.ReZ(textView0);
        }
    }

    private float getHeightDp() {
        int v = qZS.qj(this.Zh);
        return (float)qZS.ReZ(this.Zh, ((float)v));
    }

    public View getInteractionStyleRootView() [...] // Inlined contents

    public FrameLayout getVideoContainer() {
        return this.ltE;
    }

    private float getWidthDp() {
        int v = qZS.xf(this.Zh);
        return (float)qZS.ReZ(this.Zh, ((float)v));
    }

    private void qj() {
        com.bytedance.sdk.openadsdk.fDm.JQp jQp0 = new com.bytedance.sdk.openadsdk.fDm.JQp(this.Zh);
        this.ub = jQp0;
        this.Zh(jQp0);
        this.ltE = (FrameLayout)this.ub.findViewById(qla.ZsT);
        ImageView imageView0 = (ImageView)this.ub.findViewById(qla.kWj);
        TextView textView0 = (TextView)this.ub.findViewById(qla.Gr);
        View view0 = this.ub.findViewById(0x1F00002B);
        this.PjT(this.ltE, imageView0);
        textView0.setText(this.getDescription());
        this.ReZ(this.ltE);
        this.ReZ(imageView0);
        this.ReZ(textView0);
        if(view0 instanceof PAGLogoView) {
            ((PAGLogoView)view0).initData(this.ReZ);
        }
        view0.setOnClickListener(new View.OnClickListener() {
            final PjT PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                try {
                    TTWebsiteActivity.PjT(PjT.this.Zh, PjT.this.ReZ, PjT.this.cz);
                }
                catch(Throwable throwable0) {
                    RD.Zh("FullInteractionStyleView", throwable0.getMessage());
                }
            }
        });
    }

    public void setDownloadListener(JQp jQp0) {
        this.Owx = jQp0;
    }

    public void setIsMute(boolean z) {
        this.xs = z;
        View view0 = this.gK;
        if(view0 == null) {
            return;
        }
        if(view0 instanceof com.bytedance.sdk.openadsdk.core.xf.Zh.cz) {
            ((com.bytedance.sdk.openadsdk.core.xf.Zh.cz)view0).PjT(z, "interactionStyle");
        }
    }

    private void xf() {
        XX xX0 = new XX(this.Zh);
        this.ub = xX0;
        this.Zh(xX0);
        this.cr();
    }

    private void xs() {
        SM sM0 = new SM(this.Zh);
        this.ub = sM0;
        this.Zh(sM0);
        this.cr();
        this.cz();
    }
}

