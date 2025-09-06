package com.bytedance.sdk.openadsdk.component.SM;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.Zh.cr;
import com.bytedance.sdk.component.adexpress.Zh.fDm;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.component.Au.ReZ;
import com.bytedance.sdk.openadsdk.component.PjT;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.Au.tT;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.xf.XX;
import org.json.JSONObject;
import x.b.a;

public class Zh extends ltE {
    private ReZ JQp;
    boolean PjT;
    private a Qf;
    private final com.bytedance.sdk.openadsdk.component.cz.Zh ReZ;
    private FrameLayout XX;
    private final PjT Zh;
    private final com.bytedance.sdk.openadsdk.component.Au.PjT cr;
    private com.bytedance.sdk.openadsdk.component.cz.PjT cz;

    public Zh(@NonNull Context context0, Owx owx0, AdSlot adSlot0, String s, PjT pjT0, com.bytedance.sdk.openadsdk.component.cz.Zh zh0, com.bytedance.sdk.openadsdk.component.Au.PjT pjT1) {
        super(context0, owx0, adSlot0, s, true, true);
        this.PjT = true;
        this.Zh = pjT0;
        this.ReZ = zh0;
        this.cr = pjT1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void JQp() {
        com.bytedance.sdk.openadsdk.component.cz.PjT pjT0 = this.cz;
        if(pjT0 != null) {
            pjT0.Zh(this);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT() {
        com.bytedance.sdk.openadsdk.component.cz.PjT pjT0 = this.cz;
        if(pjT0 != null) {
            pjT0.PjT(this);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(int v) {
        ReZ reZ0 = this.JQp;
        if(reZ0 == null) {
            return;
        }
        switch(v) {
            case 2: {
                reZ0.XX();
                this.ReZ.cr();
                return;
            }
            case 3: {
                reZ0.Au();
                this.ReZ.ReZ();
                return;
            }
            case 4: {
                reZ0.SM();
                return;
            }
            case 1: 
            case 5: {
                if(!reZ0.cr() && !this.JQp.JQp()) {
                    this.JQp.PjT(this.getVideoFrameLayout(), this.Zh, this.qj);
                }
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(int v, String s) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(View view0, int v, com.bytedance.sdk.component.adexpress.ReZ reZ0) {
        if(v != -1 && reZ0 != null && v == 3) {
            this.JQp();
            return;
        }
        super.PjT(view0, v, reZ0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void PjT(cr cr0, fDm fDm0) {
        this.KM = cr0;
        if(cr0 instanceof tT && ((tT)cr0).xE() != null) {
            ((tT)cr0).xE().PjT(this);
        }
        if(fDm0 != null && fDm0.ReZ()) {
            this.Zh(fDm0);
        }
        super.PjT(cr0, fDm0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    protected void PjT(com.bytedance.sdk.component.adexpress.Zh.xs.PjT xs$PjT0) {
        xs$PjT0.JQp(com.bytedance.sdk.openadsdk.component.XX.PjT.Zh());
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    protected void PjT(JSONObject jSONObject0) {
        int v = 0;
        boolean z = this.qj != null && this.qj.ZX() == 0;
        Owx owx0 = this.qj;
        if(owx0 != null) {
            v = owx0.joj();
        }
        com.bytedance.sdk.openadsdk.component.XX.PjT.PjT(jSONObject0, v, z);
    }

    // 检测为 Lambda 实现
    private void ReZ(fDm fDm0) [...]

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public long ReZ() {
        return this.cr.Zh();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public void Zh() {
        super.Zh();
    }

    // 检测为 Lambda 实现
    public void Zh(fDm fDm0) [...]

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public int cr() {
        if(this.JQp != null && this.JQp.cz()) {
            return 1;
        }
        if(this.JQp != null && this.JQp.JQp()) {
            return 3;
        }
        if(this.JQp != null && this.JQp.cr()) {
            return 2;
        }
        if(this.JQp != null && this.JQp.Zh()) {
            return 4;
        }
        return this.JQp == null || !this.JQp.ReZ() ? 3 : 5;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    protected void cz() {
        this.fDm = true;
        this.XX = new FrameLayout(this.Au);
        if(!com.bytedance.sdk.openadsdk.core.DWo.ReZ.PjT(this.qj) && !com.bytedance.sdk.openadsdk.core.DWo.ReZ.Zh(this.qj)) {
            this.addView(this.XX, new FrameLayout.LayoutParams(-1, -1));
        }
        super.cz();
        this.setVideoFrameChangeListener((fDm fDm0) -> {
            if(fDm0 == null) {
                return;
            }
            Jo.PjT(() -> {
                if(this.PjT == null) {
                    return;
                }
                if(this.PjT.PjT() != null) {
                    if(Zh.this.PjT) {
                        this.PjT.PjT().setTag(com.bytedance.sdk.component.adexpress.dynamic.PjT.cz, 1);
                        ((FrameLayout)this.PjT.PjT()).removeAllViews();
                        FrameLayout frameLayout0 = (FrameLayout)this.PjT.PjT();
                        Zh.this.XX = frameLayout0;
                        ((FrameLayout.LayoutParams)frameLayout0.getLayoutParams()).gravity = 17;
                        Zh.this.PjT = false;
                    }
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
                            FrameLayout frameLayout1 = ((com.bytedance.sdk.openadsdk.core.DWo.JQp.Zh)this.PjT).xE();
                            if(frameLayout1 != null) {
                                FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
                                frameLayout$LayoutParams0.gravity = 17;
                                frameLayout1.addView(Zh.this.XX, frameLayout$LayoutParams0);
                            }
                            return;
                        }
                    }
                }
                FrameLayout.LayoutParams frameLayout$LayoutParams1 = (FrameLayout.LayoutParams)Zh.this.XX.getLayoutParams();
                if(frameLayout$LayoutParams1 == null) {
                    frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(v2, v3);
                }
                frameLayout$LayoutParams1.width = v2;
                frameLayout$LayoutParams1.height = v3;
                frameLayout$LayoutParams1.topMargin = v1;
                frameLayout$LayoutParams1.leftMargin = v;
                frameLayout$LayoutParams1.setMarginStart(v);
                frameLayout$LayoutParams1.setMarginEnd(frameLayout$LayoutParams1.rightMargin);
                Zh.this.XX.setLayoutParams(frameLayout$LayoutParams1);
            });

            class com.bytedance.sdk.openadsdk.component.SM.Zh.2 implements Runnable {
                final Zh Zh;

                com.bytedance.sdk.openadsdk.component.SM.Zh.2(fDm fDm0) {
                }

                @Override
                public void run() {
                    Zh.this.ReZ(this.PjT);
                }
            }

        });

        class com.bytedance.sdk.openadsdk.component.SM.Zh.1 implements XX {
            final Zh PjT;

            @Override  // com.bytedance.sdk.openadsdk.xf.XX
            public void PjT(fDm fDm0) {
                Zh.this.Zh(fDm0);
            }
        }

    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    public int getDynamicShowType() {
        return this.KM == null ? 1 : super.getDynamicShowType();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ltE
    protected int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.XX.PjT.PjT(this.qj, ub.cr().XX(String.valueOf(this.qj.joj())));
    }

    public FrameLayout getVideoFrameLayout() {
        return this.XX;
    }

    public void setExpressVideoListenerProxy(a b$a0) {
        this.Qf = b$a0;
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.cz.PjT pjT0) {
        this.cz = pjT0;
    }

    public void setVideoManager(ReZ reZ0) {
        this.JQp = reZ0;
    }
}

