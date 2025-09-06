package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ReZ;
import com.bytedance.sdk.component.adexpress.Zh.cr;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.cz;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.core.Au.fDm;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.Au.tT;
import com.bytedance.sdk.openadsdk.core.Au.xE;
import com.bytedance.sdk.openadsdk.core.model.RD;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.xf.XX;
import org.json.JSONObject;

public class Zh extends ltE {
    private final PjT JQp;
    public static float PjT = 100.0f;
    xE ReZ;
    fDm Zh;
    public int cr;
    private float cz;

    static {
    }

    public Zh(PjT pjT0, AdSlot adSlot0, String s) {
        super(pjT0.rds, pjT0.Zh, adSlot0, s, pjT0.xH, !pjT0.ix);
        this.cr = 1;
        this.cz = -1.0f;
        this.JQp = pjT0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void JQp() {
        fDm fDm0 = this.Zh;
        if(fDm0 != null) {
            fDm0.JQp();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT() {
        fDm fDm0 = this.Zh;
        if(fDm0 != null) {
            fDm0.PjT();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(int v) {
        fDm fDm0 = this.Zh;
        if(fDm0 != null) {
            fDm0.PjT(v);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(int v, com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) {
        fDm fDm1 = this.Zh;
        if(fDm1 != null) {
            fDm1.PjT(v, fDm0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(int v, String s) {
        fDm fDm0 = this.Zh;
        if(fDm0 != null) {
            fDm0.PjT(v, s);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(View view0, int v, ReZ reZ0) {
        if(v != -1 && reZ0 != null && v == 3) {
            this.JQp();
            return;
        }
        super.PjT(view0, v, reZ0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(cr cr0, com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) {
        this.KM = cr0;
        if(this.qj != null && this.qj.es()) {
            super.PjT(cr0, fDm0);
            return;
        }
        if(cr0 instanceof tT && ((tT)cr0).xE() != null) {
            ((tT)cr0).xE().PjT(this);
        }
        if(fDm0 != null && fDm0.ReZ()) {
            this.Zh(fDm0);
            this.cr = cr0.ReZ();
        }
        super.PjT(cr0, fDm0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(String s, JSONObject jSONObject0) {
        super.PjT(s, jSONObject0);
        fDm fDm0 = this.Zh;
        if(fDm0 != null) {
            fDm0.PjT(s, jSONObject0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(boolean z, String s) {
        fDm fDm0 = this.Zh;
        if(fDm0 != null) {
            fDm0.PjT(z, s);
        }
        this.setSoundMute(z);
    }

    // 去混淆评级： 低(30)
    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    protected boolean PjT(com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) {
        return !(this.qj instanceof RD) || !((RD)this.qj).ELH() || !fDm0.ReZ() || fDm0.Zh() != 1 ? super.PjT(fDm0) : false;
    }

    // 检测为 Lambda 实现
    private void ReZ(com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) [...]

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public long ReZ() {
        return this.Zh == null ? 0L : this.Zh.ReZ();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    protected com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT ReZ(int v) {
        com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT jQp$PjT0 = super.ReZ(v);
        PjT pjT0 = this.JQp;
        if(pjT0.ix) {
            cz cz0 = pjT0.hN;
            if(cz0 != null) {
                if(pjT0.Nv && cz0.cRA() != null) {
                    jQp$PjT0.Zh = this.JQp.hN.cRA().PjT(this.JQp.hN);
                    return jQp$PjT0;
                }
                if(this.JQp.hN.cRA() != null) {
                    jQp$PjT0.Zh = this.JQp.hN.SM;
                }
            }
        }
        return jQp$PjT0;
    }

    private void XX() {
        this.setBackupListener(new com.bytedance.sdk.component.adexpress.Zh.ReZ() {
            final Zh PjT;

            @Override  // com.bytedance.sdk.component.adexpress.Zh.ReZ
            public boolean PjT(ViewGroup viewGroup0, int v) {
                try {
                    ((ltE)viewGroup0).xf();
                    Zh.this.ReZ = new xE(viewGroup0.getContext());
                    Zh.this.ReZ.PjT(Zh.this.qj, ((ltE)viewGroup0), Zh.this.JQp.ig);
                    return true;
                }
                catch(Exception unused_ex) {
                    return false;
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void Zh() {
        fDm fDm0 = this.Zh;
        if(fDm0 != null) {
            fDm0.Zh();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void Zh(int v) {
        fDm fDm0 = this.Zh;
        if(fDm0 != null) {
            fDm0.Zh(v);
        }
    }

    // 检测为 Lambda 实现
    public void Zh(com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) [...]

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public int cr() {
        return this.Zh == null ? 0 : this.Zh.cr();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    protected void cz() {
        this.fDm = true;
        this.xf = new FrameLayout(this.Au);
        if(!com.bytedance.sdk.openadsdk.core.DWo.ReZ.PjT(this.qj) && !com.bytedance.sdk.openadsdk.core.DWo.ReZ.Zh(this.qj)) {
            this.addView(this.xf, new FrameLayout.LayoutParams(-1, -1));
        }
        super.cz();
        com.bytedance.sdk.component.SM.cz cz0 = this.getWebView();
        if(cz0 != null) {
            cz0.setBackgroundColor(0);
        }
        this.XX();
        this.setVideoFrameChangeListener((com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) -> {
            if(fDm0 == null) {
                return;
            }
            Jo.PjT(() -> {
                if(this.PjT == null) {
                    return;
                }
                double f = this.PjT.Au();
                double f1 = this.PjT.SM();
                int v = qZS.Zh(Zh.this.Au, ((float)this.PjT.cz()));
                int v1 = qZS.Zh(Zh.this.Au, ((float)this.PjT.XX()));
                int v2 = qZS.Zh(Zh.this.Au, ((float)f));
                int v3 = qZS.Zh(Zh.this.Au, ((float)f1));
                if(f1 == 0.0 || f == 0.0) {
                    switch(Zh.this.KM.ReZ()) {
                        case 7: 
                        case 10: {
                            break;
                        }
                        default: {
                            return;
                        }
                    }
                }
                switch(Zh.this.KM.ReZ()) {
                    case 7: 
                    case 10: {
                        if(this.PjT instanceof com.bytedance.sdk.openadsdk.core.DWo.JQp.Zh) {
                            FrameLayout frameLayout0 = ((com.bytedance.sdk.openadsdk.core.DWo.JQp.Zh)this.PjT).xE();
                            if(frameLayout0 != null) {
                                FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
                                frameLayout$LayoutParams0.gravity = 17;
                                frameLayout0.addView(Zh.this.xf, frameLayout$LayoutParams0);
                            }
                            return;
                        }
                    }
                }
                FrameLayout.LayoutParams frameLayout$LayoutParams1 = (FrameLayout.LayoutParams)Zh.this.xf.getLayoutParams();
                if(frameLayout$LayoutParams1 == null) {
                    frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(v2, v3);
                }
                frameLayout$LayoutParams1.width = v2;
                frameLayout$LayoutParams1.height = v3;
                frameLayout$LayoutParams1.topMargin = v1;
                frameLayout$LayoutParams1.leftMargin = v;
                frameLayout$LayoutParams1.setMarginStart(v);
                frameLayout$LayoutParams1.setMarginEnd(frameLayout$LayoutParams1.rightMargin);
                Zh.this.xf.setLayoutParams(frameLayout$LayoutParams1);
            });

            class com.bytedance.sdk.openadsdk.component.reward.view.Zh.3 implements Runnable {
                final Zh Zh;

                com.bytedance.sdk.openadsdk.component.reward.view.Zh.3(com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) {
                }

                @Override
                public void run() {
                    Zh.this.ReZ(this.PjT);
                }
            }

        });

        class com.bytedance.sdk.openadsdk.component.reward.view.Zh.1 implements XX {
            final Zh PjT;

            @Override  // com.bytedance.sdk.openadsdk.xf.XX
            public void PjT(com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) {
                Zh.this.Zh(fDm0);
            }
        }

    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        DWo dWo0 = this.JQp.Zd;
        if(dWo0 != null) {
            gK gK0 = dWo0.qla;
            if(gK0 != null && gK0.SM()) {
                int v = motionEvent0.getAction();
                if(v == 0) {
                    this.cz = motionEvent0.getY();
                }
                else if(v != 1) {
                    return super.dispatchTouchEvent(motionEvent0);
                }
                float f = motionEvent0.getY();
                if(qZS.PjT(this.cz, f, this.Au)) {
                    gK0.PjT(5);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent0);
    }

    // 去混淆评级： 低(20)
    public View getBackupContainerBackgroundView() {
        return this.xs() ? this.ReZ.getBackupContainerBackgroundView() : null;
    }

    // 去混淆评级： 低(20)
    public FrameLayout getVideoFrameLayout() {
        return this.xs() ? this.ReZ.getVideoContainer() : this.xf;
    }

    public void setExpressVideoListenerProxy(fDm fDm0) {
        this.Zh = fDm0;
    }
}

