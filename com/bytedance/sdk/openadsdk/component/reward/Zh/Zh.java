package com.bytedance.sdk.openadsdk.component.reward.Zh;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.component.reward.PjT.fDm;
import com.bytedance.sdk.openadsdk.component.reward.PjT.ub;
import com.bytedance.sdk.openadsdk.component.reward.PjT.xf;
import com.bytedance.sdk.openadsdk.component.reward.view.Au;
import com.bytedance.sdk.openadsdk.component.reward.view.DWo;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.JQp.XX;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.Zh.JQp;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.model.xE;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.bytedance.sdk.openadsdk.utils.xs;
import com.bytedance.sdk.openadsdk.xf.cz;
import java.util.List;
import v.c;

public abstract class Zh extends PjT {
    public interface com.bytedance.sdk.openadsdk.component.reward.Zh.Zh.PjT {
        void PjT(boolean arg1);
    }

    public LinearLayout fDm;
    protected String qj;
    private cz qla;
    protected JQp xf;
    public com.bytedance.sdk.openadsdk.core.widget.Zh xs;

    public Zh(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        super(pjT0);
    }

    public RFEndCardBackUpLayout Au() {
        return new RFEndCardBackUpLayout(this.PjT.IJ);
    }

    public View DWo() {
        if(this.Zh.qZS() != 5) {
            View view0 = new XX(this.PjT.rds);
            view0.setId(qla.Sky);
            return view0;
        }
        return null;
    }

    public abstract boolean JQp();

    public void Lrd() {
        this.PjT.wN.ReZ();
        this.PjT.wN.JQp(true);
    }

    public void Owx() {
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
        if(pjT0 == null) {
            return;
        }
        pjT0.dwk = false;
        if(!this.PjT.qj.get()) {
            this.PjT.tT.DWo();
        }
        this.xE();
        this.PjT.Jo.RD();
        this.PjT.cRA.xE();
        this.PjT.Sks.set(true);
        if(this.PjT.DWo.get()) {
            this.PjT.RD.set(true);
        }
        xs xs0 = this.PjT.Xtz;
        if(xs0 != null) {
            xs0.Zh();
        }
        this.PjT.Zh();
    }

    protected static FrameLayout PjT(Context context0) {
        FrameLayout frameLayout0 = new ReZ(context0);
        frameLayout0.setId(qla.qj);
        frameLayout0.setBackgroundColor(0xFF000000);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout$LayoutParams0.gravity = 17;
        frameLayout0.setLayoutParams(frameLayout$LayoutParams0);
        return frameLayout0;
    }

    private void PjT(long v, long v1) {
        long v2 = v1 - v;
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
        Activity activity0 = pjT0.rds;
        if(activity0 instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity)activity0).Zh(v2, v1);
            return;
        }
        com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0 = pjT0.kph;
        if(zh0 instanceof com.bytedance.sdk.openadsdk.activity.JQp) {
            ((com.bytedance.sdk.openadsdk.activity.JQp)zh0).PjT(v2, v1);
        }
    }

    static void PjT(FrameLayout frameLayout0, com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        cr cr0;
        Context context0 = frameLayout0.getContext();
        if(pjT0.yks) {
            ReZ reZ0 = new ReZ(context0);
            reZ0.setId(qla.DWo);
            frameLayout0.addView(reZ0, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout1 = Zh.PjT(context0);
            String s = "";
            if(Owx.JQp(pjT0.Zh)) {
                c c0 = pjT0.Zh.MWx();
                if(c0 != null) {
                    s = c0.c();
                }
            }
            else {
                List list0 = pjT0.Zh.CY();
                if(list0 != null && !list0.isEmpty()) {
                    s = ((xE)list0.get(0)).PjT();
                }
            }
            if(TextUtils.isEmpty(s)) {
                cr0 = null;
            }
            else {
                cr0 = new cr(context0);
                cr0.setId(qla.WAt);
                cr0.setTag(qla.WAt, s);
                cr0.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayout1.addView(cr0);
            }
            reZ0.addView(frameLayout1);
            com.bytedance.sdk.openadsdk.component.reward.view.ReZ reZ1 = new com.bytedance.sdk.openadsdk.component.reward.view.ReZ(context0);
            reZ1.setId(qla.xf);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
            frameLayout$LayoutParams0.gravity = 80;
            frameLayout0.addView(reZ1, frameLayout$LayoutParams0);
            reZ1.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override  // android.view.View$OnLayoutChangeListener
                public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                    int v8 = view0.getHeight();
                    if(v8 <= 0) {
                        return;
                    }
                    View view1 = pjT0.ig.findViewById(0x1F00003D);
                    if(view1 != null) {
                        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
                        if(viewGroup$LayoutParams0 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).bottomMargin = v8;
                        }
                    }
                    View view2 = pjT0.ig.findViewById(qla.GL);
                    if(view2 != null) {
                        ViewGroup.LayoutParams viewGroup$LayoutParams1 = view2.getLayoutParams();
                        if(viewGroup$LayoutParams1 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams)viewGroup$LayoutParams1).bottomMargin = v8;
                        }
                    }
                    View view3 = pjT0.ig.findViewById(qla.JDf);
                    if(view3 != null) {
                        ViewGroup.LayoutParams viewGroup$LayoutParams2 = view3.getLayoutParams();
                        if(viewGroup$LayoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams)viewGroup$LayoutParams2).bottomMargin = v8;
                        }
                    }
                    cr cr0 = cr0;
                    if(cr0 != null) {
                        ViewGroup.LayoutParams viewGroup$LayoutParams3 = cr0.getLayoutParams();
                        if(viewGroup$LayoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams3).bottomMargin = v8;
                            cr0.setLayoutParams(viewGroup$LayoutParams3);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.JQp.JQp jQp0 = new com.bytedance.sdk.openadsdk.core.JQp.JQp(context0);
            jQp0.setId(qla.xs);
            jQp0.setOrientation(1);
            jQp0.setVisibility(8);
            frameLayout0.addView(jQp0, new FrameLayout.LayoutParams(-1, -1));
        }
        if(pjT0.VY) {
            com.bytedance.sdk.component.SM.cz cz0 = new com.bytedance.sdk.component.SM.cz(context0, true);
            cz0.setId(qla.fDm);
            cz0.setLayerType(2, null);
            cz0.setVisibility(4);
            frameLayout0.addView(cz0, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout2 = new FrameLayout(context0);
            frameLayout2.setId(qla.qla);
            frameLayout2.setVisibility(4);
            frameLayout0.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if(cRA.Zh(pjT0.Zh)) {
                ReZ reZ2 = new ReZ(context0);
                reZ2.setId(qla.Pv);
                reZ2.setVisibility(4);
                frameLayout0.addView(reZ2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        com.bytedance.sdk.component.SM.cz cz1 = new com.bytedance.sdk.component.SM.cz(context0, true);
        cz1.setId(qla.xE);
        cz1.setVisibility(8);
        frameLayout0.addView(cz1, new FrameLayout.LayoutParams(-1, -1));
    }

    public void PjT(int v) {
        this.JQp.fDm();
        this.PjT(false, true, false, v);
        if(this.PjT.cr) {
            this.SM.PjT(10000);
        }
    }

    public void PjT(Message message0) {
        switch(message0.what) {
            case 1: {
                this.Lrd();
                return;
            }
            case 300: {
                com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
                if(pjT0.ix) {
                    com.bytedance.sdk.openadsdk.activity.cz cz0 = pjT0.hN;
                    if(cz0 instanceof com.bytedance.sdk.openadsdk.activity.PjT) {
                        ((com.bytedance.sdk.openadsdk.activity.PjT)cz0).RD();
                        goto label_16;
                    }
                    goto label_13;
                }
                else {
                label_13:
                    this.PjT(com.bytedance.sdk.openadsdk.cr.Zh.Zh.Zh);
                    ub ub0 = this.PjT.tT;
                    ub0.PjT(!ub0.Yo(), true ^ this.PjT.tT.Yo());
                }
            label_16:
                if(this.PjT.Zh.QB() != null && this.PjT.Zh.QB().PjT() != null) {
                    this.PjT.Zh.QB().PjT().PjT(com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.JQp);
                }
                this.PjT.Zd.qla.DWo();
                return;
            }
            case 400: {
                this.PjT.tT.fDm();
                this.PjT(false, true, false, 3);
                return;
            }
            case 500: {
                if(!cRA.XX(this.PjT.Zh)) {
                    this.PjT.wN.ReZ(false);
                }
                com.bytedance.sdk.component.SM.cz cz3 = this.PjT.Jo.DWo();
                if(cz3 != null && cz3.getWebView() != null) {
                    cz3.xs();
                    cz3.getWebView().resumeTimers();
                }
                if(this.PjT.Jo.DWo() != null) {
                    this.PjT.Jo.PjT(1.0f);
                    this.PjT.Zd.PjT(1.0f);
                }
                if(!this.PjT.Zh.Sky() && this.PjT.tT.Zh() && this.PjT.gK.get()) {
                    this.PjT.tT.fDm();
                }
                break;
            }
            case 600: {
                this.qla();
                return;
            }
            case 700: {
                int v1 = message0.arg1;
                if(!this.PjT.RD.get()) {
                    if(v1 > 0) {
                        this.PjT.wN.Zh();
                        this.PjT.wN.PjT(v1 / 1000 + "s");
                        this.PjT.wN.JQp(false);
                        Message message2 = Message.obtain();
                        message2.what = 700;
                        message2.arg1 = v1 - 1000;
                        this.PjT.Au -= 1000;
                        this.DWo.sendMessageDelayed(message2, 1000L);
                        return;
                    }
                    this.DWo.removeMessages(700);
                    if(cRA.SM(this.Zh)) {
                        if(!this.PjT.cRA.XX() && this.PjT.Jo.gK()) {
                            this.Lrd();
                            return;
                        }
                        this.qla();
                        return;
                    }
                    this.qla();
                    return;
                }
                break;
            }
            case 800: {
                if(!cRA.XX(this.PjT.Zh)) {
                    this.PjT.wN.ReZ(false);
                }
                this.PjT.Zd.PjT(1.0f);
                if(!this.PjT.Zh.Sky() && this.PjT.tT.Zh() && this.PjT.gK.get()) {
                    this.PjT.tT.fDm();
                    return;
                }
                break;
            }
            case 900: {
                if(!this.PjT.Sks.get()) {
                    int v = message0.arg1;
                    double f = this.PjT.tT.KM();
                    this.PjT(((long)v), ((long)(1000.0 * f)));
                    if(v > 0) {
                        this.PjT.wN.Zh();
                        this.PjT.wN.PjT(v / 1000 + "s");
                        this.PjT.wN.JQp(false);
                        Message message1 = Message.obtain();
                        message1.what = 900;
                        message1.arg1 = v - 1000;
                        this.PjT.SM = v - 1000;
                        this.DWo.sendMessageDelayed(message1, 1000L);
                        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = this.PjT;
                        if(pjT1.ix) {
                            com.bytedance.sdk.openadsdk.activity.cz cz1 = pjT1.hN;
                            if(cz1 instanceof com.bytedance.sdk.openadsdk.activity.PjT && f > 0.0) {
                                ((com.bytedance.sdk.openadsdk.activity.PjT)cz1).PjT(((float)(1.0 - ((double)(((float)v) / 1000.0f)) / f)));
                            }
                        }
                        return;
                    }
                    this.DWo.removeMessages(900);
                    this.qla();
                    com.bytedance.sdk.openadsdk.activity.cz cz2 = this.PjT.hN;
                    if(this.PjT.ix && cz2 instanceof com.bytedance.sdk.openadsdk.activity.PjT) {
                        cz2.cRA().PjT(cz2, new com.bytedance.sdk.openadsdk.activity.Zh.JQp(5, this.PjT));
                    }
                    return;
                }
                break;
            }
        }
    }

    public abstract void PjT(FrameLayout arg1);

    public void PjT(com.bytedance.sdk.openadsdk.component.reward.view.XX xX0) {
        Zh.PjT(xX0, this.PjT);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.PjT
    public void PjT(com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0, KM kM0) {
        super.PjT(zh0, kM0);
        if(this.PjT.Zh.cr()) {
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
            if(pjT0.yks) {
                pjT0.Jo.PjT(false);
            }
        }
        if(cRA.gK(this.PjT.Zh)) {
            this.PjT.cRA.xf();
        }
    }

    public void PjT(cz cz0) {
        this.qla = cz0;
        this.ReZ();
        if(!this.PjT.Zh.uvo() && this.Yo()) {
            this.iZZ();
        }
        if(this.Yo()) {
            this.PjT.qZS.Zh();
        }
        if(gK.cr(this.PjT.Zh) || gK.JQp(this.PjT.Zh)) {
            this.DWo.sendEmptyMessageDelayed(500, 100L);
        }
        this.PjT.Zd.PjT(this.PjT.oG == 100.0f);
        this.cRA();
        this.XX();
    }

    public void PjT(boolean z, boolean z1, boolean z2, int v) {
        this.PjT.qZS.PjT(z, z1, z2, this, v);
    }

    public void RD() {
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
        if(pjT0 == null) {
            return;
        }
        DWo dWo0 = pjT0.Zd;
        if(dWo0 != null) {
            dWo0.xE();
        }
        this.PjT.Jo.Owx();
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = this.PjT;
        if(pjT1.xH) {
            com.bytedance.sdk.openadsdk.component.reward.Zh.Zh.2 zh$20 = new Runnable() {
                final Zh PjT;

                @Override
                public void run() {
                    if(Zh.this.PjT.ZX.PjT() > 0) {
                        Zh.this.PjT.ZX.PjT(false);
                    }
                }
            };
            pjT1.rds.runOnUiThread(zh$20);
        }
    }

    public View SM() {
        View view0 = new ReZ(this.PjT.rds);
        view0.setId(qla.FaL);
        cr cr0 = com.bytedance.sdk.openadsdk.core.widget.cz.Zh(this.PjT.rds);
        cr0.setId(0x1F00000C);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.gravity = 0x800035;
        frameLayout$LayoutParams0.topMargin = qZS.Zh(this.PjT.rds, 20.0f);
        frameLayout$LayoutParams0.rightMargin = qZS.Zh(this.PjT.rds, 16.0f);
        cr0.setLayoutParams(frameLayout$LayoutParams0);
        cr0.setContentDescription(Lrd.PjT(this.PjT.rds, "tt_ad_close_text"));
        cr0.setVisibility(8);
        PAGLogoView pAGLogoView0 = PAGLogoView.createPAGLogoViewByMaterial(this.PjT.rds, this.PjT.Zh);
        pAGLogoView0.setId(0x1F00003D);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-2, qZS.Zh(this.PjT.rds, 14.0f));
        frameLayout$LayoutParams1.gravity = 0x800053;
        pAGLogoView0.setLayoutParams(frameLayout$LayoutParams1);
        cr cr1 = new cr(this.PjT.rds);
        cr1.setId(qla.GL);
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(qZS.Zh(this.PjT.rds, 32.0f), qZS.Zh(this.PjT.rds, 14.0f));
        frameLayout$LayoutParams2.gravity = 0x800055;
        cr1.setLayoutParams(frameLayout$LayoutParams2);
        cr1.setPadding(qZS.Zh(this.PjT.rds, 9.0f), 0, qZS.Zh(this.PjT.rds, 9.0f), 0);
        cr1.setScaleType(ImageView.ScaleType.FIT_CENTER);
        com.bytedance.sdk.openadsdk.core.widget.DWo dWo0 = new com.bytedance.sdk.openadsdk.core.widget.DWo(this.PjT.rds);
        dWo0.setId(qla.dnv);
        dWo0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        dWo0.setClickable(true);
        dWo0.setFocusable(true);
        ((ViewGroup)view0).addView(pAGLogoView0);
        ((ViewGroup)view0).addView(cr1);
        ((ViewGroup)view0).addView(dWo0);
        if(!this.PjT.Zh.fd() || (!this.PjT.ix || this.PjT.PjT != 1)) {
            com.bytedance.sdk.openadsdk.component.reward.top.ReZ reZ0 = new com.bytedance.sdk.openadsdk.component.reward.top.ReZ(this.PjT.rds);
            reZ0.setId(qla.DnO);
            reZ0.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            ((ViewGroup)view0).addView(reZ0);
        }
        ((ViewGroup)view0).addView(cr0);
        return view0;
    }

    public void Sks() {
        Au au0 = this.PjT.yIW;
        if(au0 != null) {
            au0.cz();
        }
        DWo dWo0 = this.PjT.Zd;
        if(dWo0 != null) {
            dWo0.fDm();
        }
        this.PjT.tT.yIW();
        if(!this.JQp()) {
            this.PjT.DWo.get();
        }
        com.bytedance.sdk.openadsdk.component.reward.PjT.gK gK0 = this.PjT.Jo;
        if(gK0 != null) {
            gK0.xE();
        }
        com.bytedance.sdk.openadsdk.component.reward.PjT.Au au1 = this.PjT.cRA;
        if(au1 != null) {
            au1.XX(com.bytedance.sdk.openadsdk.component.reward.PjT.Au.PjT);
        }
        DWo dWo1 = this.PjT.Zd;
        if(dWo1 != null) {
            dWo1.xf();
        }
        com.bytedance.sdk.openadsdk.component.reward.PjT.JQp jQp0 = this.PjT.qZS;
        if(jQp0 != null) {
            jQp0.ReZ();
        }
        xf xf0 = this.PjT.iZZ;
        if(xf0 != null) {
            xf0.Zh();
        }
        xs xs0 = this.PjT.Xtz;
        if(xs0 != null) {
            xs0.ReZ();
        }
    }

    public abstract void XX();

    protected boolean Yo() {
        return true;
    }

    public void cRA() {
        this.xf = this.PjT.Yo.ReZ();
    }

    public com.bytedance.sdk.openadsdk.component.reward.Zh.Zh.PjT cr() {
        return null;
    }

    public abstract boolean cz();

    public void fDm() {
        if(this.xs != null && this.xs.isShowing()) {
            this.xs.dismiss();
        }
    }

    protected void gK() {
        if(this.PjT.DWo.get() && (!this.PjT.XX && this.PjT.RD.getAndSet(false))) {
            int v = this.PjT.Au;
            if(v >= 0 || v == -1) {
                Message message0 = Message.obtain();
                message0.what = 700;
                message0.arg1 = this.PjT.Au;
                this.PjT.OMu.sendMessage(message0);
            }
        }
        if(this.PjT.SM > 0 && this.PjT.Sks.getAndSet(false)) {
            Message message1 = Message.obtain();
            message1.what = 900;
            message1.arg1 = this.PjT.SM;
            this.PjT.OMu.sendMessage(message1);
        }
    }

    public final void iZZ() {
        if(this.PjT.rds.isFinishing()) {
            return;
        }
        this.PjT.Jo.qla();
        String s = this.PjT.cr ? "reward_endcard" : "fullscreen_endcard";
        this.PjT.Jo.PjT(this.qla, s, this.PjT.kph);
        this.PjT.cRA.PjT(this.qla, this.PjT.xH);
        this.PjT.Jo.PjT(s, this.PjT.kph);
        this.PjT.Jo.JQp();
    }

    public void ltE() {
    }

    public void qj() {
        this.PjT.iZZ.PjT(this.PjT.cr);
        this.PjT.Zd.Zh();
        this.PjT.qZS.PjT();
        if(!this.PjT.Zh.uvo()) {
            if(this.PjT.XX && TextUtils.isEmpty(Owx.PjT(this.PjT.IJ, this.Zh))) {
                this.xf();
            }
            this.PjT.Jo.PjT();
            this.PjT.Co.PjT();
        }
        this.PjT.cRA.qla();
        this.PjT.wN.PjT();
        if(cRA.XX(this.PjT.Zh)) {
            com.bytedance.sdk.component.SM.cz cz0 = this.PjT.Jo.DWo();
            if(cz0 != null) {
                cz0.setBackgroundColor(0xFF000000);
            }
            this.PjT.Jo.qj().setBackgroundColor(0xFF000000);
            this.PjT.wN.ReZ(true);
            if(cRA.gK(this.PjT.Zh)) {
                this.PjT.Zd.cr();
                qZS.PjT(cz0, 4);
                qZS.PjT(this.PjT.Jo.qj(), 0);
            }
        }
        if(cRA.cz(this.PjT.Zh)) {
            this.PjT.Zd.cr();
            qZS.PjT(this.PjT.Jo.DWo(), 4);
        }
        if(!gK.cr(this.PjT.Zh) && !gK.Zh(this.PjT.Zh) && !gK.JQp(this.PjT.Zh)) {
            this.PjT.Zd.PjT(qZS.Zh(this.PjT.IJ, ((float)this.PjT.HG)), qZS.Zh(this.PjT.IJ, ((float)this.PjT.zZ)));
            this.PjT.Lrd.PjT();
            if(cRA.gK(this.PjT.Zh)) {
                this.PjT.Jo.PjT(true);
                this.PjT.Jo.JQp();
                this.PjT(false, false, false, com.bytedance.sdk.openadsdk.cr.Zh.Zh.ReZ);
                return;
            }
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
            if(pjT0.zYH) {
                pjT0.Zd.PjT(0);
            }
        }
    }

    public void qla() {
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
        if(pjT0.XX) {
            return;
        }
        pjT0.wN.JQp();
        if(this.PjT.Nv && (this.PjT.hN != null && !this.PjT.hN.Lrd())) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = this.PjT;
        if(!pjT1.ix || !(pjT1.hN instanceof com.bytedance.sdk.openadsdk.activity.PjT)) {
            pjT1.Zd.JQp(0);
        }
    }

    public void tT() {
        int v;
        if(com.bytedance.sdk.openadsdk.core.ub.cr().RD(String.valueOf(this.PjT.cz)) == 1) {
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
            if(!pjT0.cr) {
                if(cRA.ReZ(pjT0.Zh)) {
                    v = com.bytedance.sdk.openadsdk.core.ub.cr().PjT(String.valueOf(this.PjT.cz), false);
                }
                else {
                    v = this.PjT.Zh.PjT() < 0 ? com.bytedance.sdk.openadsdk.core.ub.cr().ltE(String.valueOf(this.PjT.cz)) : this.PjT.Zh.PjT();
                }
            }
            else if(cRA.ReZ(pjT0.Zh)) {
                v = com.bytedance.sdk.openadsdk.core.ub.cr().PjT(String.valueOf(this.PjT.cz), true);
            }
            else if(this.PjT.Zh.Zh() >= 0) {
                v = this.PjT.Zh.Zh();
            }
            else {
                v = com.bytedance.sdk.openadsdk.core.ub.cr().DWo(String.valueOf(this.PjT.cz));
            }
            DWo dWo0 = this.PjT.Zd;
            if(dWo0 != null && dWo0.SM()) {
                DWo dWo1 = this.PjT.Zd;
                if(dWo1 != null) {
                    dWo1.DWo().performClick();
                }
            }
            else if((!this.PjT.DWo.get() || cRA.ReZ(this.PjT.Zh)) && v != -1) {
                ub ub0 = this.PjT.tT;
                if(ub0 != null && ub0.Au() >= ((long)v) * 1000L) {
                label_26:
                    fDm fDm0 = this.PjT.wN;
                    if(fDm0 != null) {
                        fDm0.cr();
                    }
                }
                else {
                    com.bytedance.sdk.openadsdk.component.reward.PjT.Au au0 = this.PjT.cRA;
                    if(au0 != null && au0.cr(v)) {
                        goto label_26;
                    }
                }
            }
        }
    }

    public void ub() {
        if(!cRA.DWo(this.Zh) || this.PjT.Jo.ig()) {
            this.gK();
        }
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
        if(pjT0 == null) {
            return;
        }
        xs xs0 = pjT0.Xtz;
        if(xs0 != null) {
            xs0.PjT();
        }
        this.PjT.PjT();
    }

    public void xE() {
        this.DWo.removeMessages(300);
    }

    public void xf() {
        LinearLayout linearLayout0 = (LinearLayout)this.PjT.ig.findViewById(qla.xs);
        this.fDm = linearLayout0;
        qZS.PjT(linearLayout0, 8);
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
        pjT0.fA = new com.bytedance.sdk.openadsdk.common.xs(pjT0.rds, pjT0.Zh, "landingpage_endcard");
        this.PjT.fA.ReZ().setOnClickListener(new View.OnClickListener() {
            final Zh PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                Zh.this.PjT.Zd.DWo().performClick();
            }
        });
        this.fDm.addView(this.PjT.fA.JQp(), new LinearLayout.LayoutParams(-1, -1));
        this.PjT.Jo.PjT(this.PjT.fA);
    }

    public void xs() {
    }

    public void yIW() {
        if(!this.cz() && (this instanceof com.bytedance.sdk.openadsdk.component.reward.Zh.Au || this instanceof SM)) {
            this.PjT.Yo.Zh();
            return;
        }
        if(!this.SM.PjT(this.JQp.SM(), false)) {
            this.DWo.removeMessages(300);
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
            if(pjT0.ix) {
                com.bytedance.sdk.openadsdk.activity.cz cz0 = pjT0.hN;
                if(cz0 instanceof com.bytedance.sdk.openadsdk.activity.PjT) {
                    ((com.bytedance.sdk.openadsdk.activity.PjT)cz0).RD();
                    goto label_14;
                }
                goto label_11;
            }
            else {
            label_11:
                this.PjT(com.bytedance.sdk.openadsdk.cr.Zh.Zh.PjT);
                boolean z = this.JQp.Yo();
                this.JQp.PjT(!z, 4);
            }
        }
    label_14:
        if(this.PjT != null && (this.PjT.Zh != null && this.PjT.Xtz != null && this.PjT.Zh.es())) {
            this.PjT.Xtz.PjT(this.PjT.tT.RD());
        }
    }
}

