package com.bytedance.sdk.openadsdk.core.Au;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.adexpress.Zh.cr;
import com.bytedance.sdk.component.adexpress.Zh.fDm;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.PjT.Zh.ReZ;
import com.bytedance.sdk.openadsdk.core.DWo.JQp.Zh;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.Zh.PjT;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.bytedance.sdk.openadsdk.xf.XX;
import x.b.b;
import x.b.d;

public class gK extends ltE implements b, d {
    private long Co;
    boolean JQp;
    private long Jo;
    int PjT;
    private qla Qf;
    boolean ReZ;
    int XX;
    private PjT ZX;
    boolean Zh;
    int cr;
    boolean cz;
    private ReZ wN;

    public gK(@NonNull Context context0, Owx owx0, AdSlot adSlot0, String s) {
        super(context0, owx0, adSlot0, s, false, true);
        this.PjT = 1;
        this.Zh = false;
        this.ReZ = true;
        this.JQp = true;
        this.cz = true;
        this.XX = -1;
        this.XX();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void JQp() {
    }

    private boolean PjT(fDm fDm0, boolean z) {
        double f = fDm0.cz();
        double f1 = fDm0.XX();
        double f2 = fDm0.Au();
        double f3 = fDm0.SM();
        if((f2 == 0.0 || f3 == 0.0) && (this.XX != 7 && this.XX != 9 && this.XX != 10)) {
            return false;
        }
        int v = qZS.Zh(this.Au, ((float)f));
        int v1 = qZS.Zh(this.Au, ((float)f1));
        int v2 = qZS.Zh(this.Au, ((float)f2));
        int v3 = qZS.Zh(this.Au, ((float)f3));
        float f4 = Math.min(Math.min(qZS.Zh(this.Au, fDm0.xf()), qZS.Zh(this.Au, fDm0.xs())), Math.min(qZS.Zh(this.Au, fDm0.fDm()), qZS.Zh(this.Au, fDm0.qla())));
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.xf.getLayoutParams();
        if(frameLayout$LayoutParams0 == null) {
            frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v2, v3);
        }
        frameLayout$LayoutParams0.width = v2;
        frameLayout$LayoutParams0.height = v3;
        frameLayout$LayoutParams0.topMargin = v1;
        frameLayout$LayoutParams0.leftMargin = v;
        frameLayout$LayoutParams0.setMarginStart(v);
        frameLayout$LayoutParams0.setMarginEnd(frameLayout$LayoutParams0.rightMargin);
        this.xf.setLayoutParams(frameLayout$LayoutParams0);
        qZS.Zh(this.xf, f4);
        qla qla0 = this.Qf;
        if(qla0 != null && z) {
            qla0.PjT(v2, v3);
        }
        return true;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT() {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(int v) {
        qla qla0 = this.Qf;
        if(qla0 == null) {
            return;
        }
        switch(v) {
            case 1: {
                qla0.PjT(0L, true, false);
                return;
            }
            case 2: 
            case 3: {
                qla0.setCanInterruptVideoPlay(true);
                this.Qf.performClick();
                return;
            }
            case 4: {
                qla0.getNativeVideoController().cr();
                return;
            }
            case 5: {
                qla0.PjT(0L, true, false);
            }
        }
    }

    @Override  // x.b$d
    public void PjT(int v, int v1) {
        this.Jo = this.Co;
        this.PjT = 4;
        ReZ reZ0 = this.wN;
        if(reZ0 != null) {
            reZ0.PjT(v, v1);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(int v, String s) {
        this.gK = v;
        this.ltE = s;
    }

    @Override  // x.b$b
    public void PjT(long v, long v1) {
        this.JQp = false;
        if(this.PjT != 3 && this.PjT != 5 && v > this.Jo) {
            this.PjT = 2;
        }
        this.Jo = v;
        this.Co = v1;
        if(this.Yo != null && this.Yo.Zh() != null) {
            this.Yo.Zh().setTimeUpdate(((int)(v1 - v)) / 1000);
        }
        this.Zh(v, v1);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(View view0, int v, com.bytedance.sdk.component.adexpress.ReZ reZ0) {
        if(v != -1 && reZ0 != null) {
            if(v == 11) {
                try {
                    qla qla0 = this.Qf;
                    if(qla0 != null) {
                        qla0.setCanInterruptVideoPlay(true);
                        this.Qf.performClick();
                        if(this.xs) {
                            this.Qf.findViewById(com.bytedance.sdk.openadsdk.utils.qla.dG).setVisibility(0);
                        }
                    }
                }
                catch(Exception unused_ex) {
                }
                return;
            }
            super.PjT(view0, v, reZ0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(cr cr0, fDm fDm0) {
        this.KM = cr0;
        this.XX = cr0.ReZ();
        if(this.KM instanceof tT && ((tT)this.KM).xE() != null) {
            ((tT)this.KM).xE().PjT(this);
        }
        if(fDm0 != null && fDm0.ReZ()) {
            this.Zh(fDm0);
        }
        super.PjT(cr0, fDm0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(boolean z, String s) {
        qla qla0 = this.Qf;
        if(qla0 != null) {
            qla0.PjT(z, s);
            this.setSoundMute(z);
        }
    }

    // 检测为 Lambda 实现
    private void ReZ(@NonNull fDm fDm0) [...]

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public long ReZ() {
        return this.Jo;
    }

    protected void XX() {
        this.xf = new FrameLayout(this.Au);
        int v = this.qj == null ? 0 : this.qj.joj();
        this.cr = v;
        this.cr(v);
        this.ub();
        this.addView(this.xf, new FrameLayout.LayoutParams(-1, -1));
        if(this.getWebView() != null) {
            this.getWebView().setBackgroundColor(0);
        }
        this.setVideoFrameChangeListener(new XX() {
            final gK PjT;

            @Override  // com.bytedance.sdk.openadsdk.xf.XX
            public void PjT(fDm fDm0) {
                Jo.PjT(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.Au.gK.1 Zh;

                    @Override
                    public void run() {
                        gK.this.PjT(fDm0, true);
                    }
                });
            }
        });
    }

    private void Zh(long v, long v1) {
        int v2 = (int)Math.abs(((long)this.gK) - v);
        if(this.gK >= 0 && v2 <= 500 && ((long)this.gK) <= v1 && v2 < 500 && !this.Owx.contains(this.ltE)) {
            if(((long)this.gK) > v) {
                this.postDelayed(new Runnable() {
                    final gK PjT;

                    @Override
                    public void run() {
                        gK.this.Qf.setCanInterruptVideoPlay(true);
                        gK.this.Qf.performClick();
                        gK.this.Zh(gK.this.gK, gK.this.ltE);
                    }
                }, ((long)v2));
            }
            else {
                this.Qf.setCanInterruptVideoPlay(true);
                this.Qf.performClick();
                this.Zh(this.gK, this.ltE);
            }
            this.Owx.add(this.ltE);
        }
    }

    private void Zh(fDm fDm0) {
        if(fDm0 == null) {
            return;
        }
        Jo.PjT(() -> {
            if(!gK.this.PjT(this.PjT, false)) {
                return;
            }
            gK.this.xf.removeAllViews();
            if(gK.this.Qf != null) {
                if((gK.this.XX == 7 || gK.this.XX == 10) && this.PjT instanceof Zh) {
                    FrameLayout frameLayout0 = ((Zh)this.PjT).xE();
                    if(frameLayout0 != null) {
                        frameLayout0.removeAllViews();
                        frameLayout0.addView(gK.this.Qf, new FrameLayout.LayoutParams(-1, -1));
                    }
                }
                else if(this.PjT.PjT() == null) {
                    gK.this.xf.addView(gK.this.Qf);
                }
                else if(gK.this.cz) {
                    this.PjT.PjT().setTag(com.bytedance.sdk.component.adexpress.dynamic.PjT.cz, 1);
                    ((FrameLayout)this.PjT.PjT()).removeAllViews();
                    ((FrameLayout)this.PjT.PjT()).addView(gK.this.Qf, new FrameLayout.LayoutParams(-1, -1));
                    gK.this.cz = false;
                }
                gK.this.Qf.PjT(0L, true, false);
                gK.this.cr(gK.this.cr);
                if(!com.bytedance.sdk.component.utils.ltE.cr(gK.this.Au) && !gK.this.ReZ && gK.this.JQp) {
                    gK.this.Qf.JQp();
                }
                if(!TextUtils.equals("embeded_ad", gK.this.SM)) {
                    gK.this.setShowAdInteractionView(false);
                }
            }
        });

        class com.bytedance.sdk.openadsdk.core.Au.gK.3 implements Runnable {
            final gK Zh;

            com.bytedance.sdk.openadsdk.core.Au.gK.3(fDm fDm0) {
            }

            @Override
            public void run() {
                gK.this.ReZ(this.PjT);
            }
        }

    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void Zh() {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public int cr() {
        if(this.PjT == 3) {
            qla qla0 = this.Qf;
            if(qla0 != null) {
                qla0.cr();
            }
        }
        return this.Qf == null || !this.Qf.getNativeVideoController().xE() ? this.PjT : 1;
    }

    void cr(int v) {
        int v1 = ub.cr().Zh(v);
        if(3 == v1) {
            this.Zh = false;
            this.ReZ = false;
        }
        else if(4 == v1) {
            this.Zh = true;
        }
        else {
            int v2 = com.bytedance.sdk.component.utils.ltE.ReZ(ub.PjT());
            if(1 == v1) {
                this.Zh = false;
                this.ReZ = wN.cr(v2);
            }
            else if(2 != v1) {
                if(5 == v1 && (wN.cr(v2) || wN.cz(v2))) {
                    this.Zh = false;
                    this.ReZ = true;
                }
            }
            else if(wN.JQp(v2) || wN.cr(v2) || wN.cz(v2)) {
                this.Zh = false;
                this.ReZ = true;
            }
        }
        if(!this.ReZ) {
            this.PjT = 3;
        }
    }

    @Override  // x.b$b
    public void d_() {
        this.JQp = false;
        this.PjT = 2;
        ReZ reZ0 = this.wN;
        if(reZ0 != null) {
            reZ0.PjT(null);
        }
    }

    @Override  // x.b$b
    public void g_() {
        this.JQp = false;
        this.xs = true;
        this.PjT = 3;
        ReZ reZ0 = this.wN;
        if(reZ0 != null) {
            reZ0.Zh(null);
        }
    }

    protected qla getExpressVideoView() {
        return this.Qf;
    }

    public ReZ getVideoAdListener() {
        return this.wN;
    }

    @Nullable
    public x.b getVideoController() {
        return this.Qf == null ? null : this.Qf.getNativeVideoController();
    }

    public PjT getVideoModel() {
        return this.ZX;
    }

    @Override  // x.b$b
    public void h_() {
        this.JQp = false;
        this.xs = false;
        this.PjT = 2;
    }

    @Override  // x.b$b
    public void i_() {
        this.JQp = false;
        this.PjT = 5;
        if(this.Yo != null && this.Yo.Zh() != null) {
            this.Yo.Zh().onvideoComplate();
        }
        ReZ reZ0 = this.wN;
        if(reZ0 != null) {
            reZ0.ReZ(null);
        }
    }

    private void setShowAdInteractionView(boolean z) {
        qla qla0 = this.Qf;
        if(qla0 != null) {
            qla0.setShowAdInteractionView(z);
        }
    }

    public void setVideoAdListener(ReZ reZ0) {
        this.wN = reZ0;
    }

    private void ub() {
        try {
            this.ZX = new PjT();
            qla qla0 = new qla(this.Au, this.qj, this.SM, this.yIW);
            this.Qf = qla0;
            qla0.setShouldCheckNetChange(false);
            this.Qf.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.xf.Zh.cz.Zh() {
                final gK PjT;

                @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.cz$Zh
                public void PjT(boolean z, long v, long v1, long v2, boolean z1) {
                    gK.this.ZX.PjT = z;
                    gK.this.ZX.JQp = v;
                    gK.this.ZX.cz = v1;
                    gK.this.ZX.XX = v2;
                    gK.this.ZX.cr = z1;
                }
            });
            this.Qf.setVideoAdLoadListener(this);
            this.Qf.setVideoAdInteractionListener(this);
            if("embeded_ad".equals(this.SM)) {
                this.Qf.setIsAutoPlay((this.Zh ? this.DWo.isAutoPlay() : this.ReZ));
            }
            else if("open_ad".equals(this.SM)) {
                this.Qf.setIsAutoPlay(true);
            }
            else {
                this.Qf.setIsAutoPlay(this.ReZ);
            }
            if("open_ad".equals(this.SM)) {
                this.Qf.PjT(true, "initVideo");
            }
            else {
                boolean z = ub.cr().ReZ(String.valueOf(this.cr));
                this.tT = z;
                this.Qf.PjT(z, "initVideo");
            }
            this.Qf.cr();
        }
        catch(Exception unused_ex) {
            this.Qf = null;
        }
    }
}

