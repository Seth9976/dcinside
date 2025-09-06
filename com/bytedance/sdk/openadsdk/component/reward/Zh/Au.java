package com.bytedance.sdk.openadsdk.component.reward.Zh;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.SM.ReZ;
import com.bytedance.sdk.openadsdk.SM.cr;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.component.reward.view.JQp;
import com.bytedance.sdk.openadsdk.component.reward.view.XX;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.model.xE;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.HashMap;
import java.util.List;

public class Au extends Zh {
    private String gK;
    private final int qla;
    private JQp ub;
    private ViewGroup xE;

    public Au(PjT pjT0) {
        super(pjT0);
        this.gK = "fullscreen_interstitial_ad";
        this.qla = this.Zh.fK();
    }

    // 去混淆评级： 低(20)
    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public boolean JQp() {
        return this.Jo() || cRA.XX(this.Zh);
    }

    private boolean Jo() {
        return this.Zh == null ? false : this.Zh.iZZ() == 2;
    }

    private void KM() {
        FrameLayout frameLayout0 = new FrameLayout(this.PjT.rds);
        this.xE = frameLayout0;
        frameLayout0.setId(qla.JDf);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        this.xE.setLayoutParams(frameLayout$LayoutParams0);
        View view0 = this.PjT.Zd.qj();
        if(view0 != null) {
            frameLayout$LayoutParams0.bottomMargin = view0.getHeight();
        }
        JQp jQp0 = new JQp(this.PjT.rds);
        this.ub = jQp0;
        jQp0.setId(qla.jK);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = this.PjT.Zh.jK() == 1 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(-2, -1);
        frameLayout$LayoutParams1.gravity = 17;
        this.ub.setLayoutParams(frameLayout$LayoutParams1);
        this.xE.addView(this.ub);
        this.Qf();
    }

    private void PjT(ImageView imageView0) {
        Owx owx0 = this.Zh;
        if(owx0 == null) {
            return;
        }
        List list0 = owx0.CY();
        if(list0 != null && list0.size() > 0) {
            xE xE0 = (xE)list0.get(0);
            if(xE0 != null) {
                cr.PjT(((xE)list0.get(0))).ReZ(2).PjT(ReZ.PjT(this.Zh, xE0.PjT(), imageView0));
            }
        }
    }

    // 去混淆评级： 低(20)
    public static boolean PjT(Owx owx0) {
        return Owx.JQp(owx0) ? false : owx0.Qtm() == 100.0f;
    }

    protected void PjT(View view0) {
        if(view0 != null && this.PjT.rds != null && this.Zh != null) {
            com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0 = this.xf;
            if(pjT0 == null) {
                pjT0 = new com.bytedance.sdk.openadsdk.core.Zh.PjT(this.PjT.rds, this.Zh, this.gK, wN.PjT(this.gK));
                pjT0.PjT(this.ReZ(this.Zh));
                HashMap hashMap0 = new HashMap();
                if(cRA.gK(this.Zh)) {
                    hashMap0.put("click_scence", 3);
                }
                else {
                    hashMap0.put("click_scence", 1);
                }
                pjT0.PjT(hashMap0);
            }
            Activity activity0 = this.PjT.rds;
            if(activity0 != null) {
                pjT0.PjT(activity0);
            }
            view0.setOnTouchListener(pjT0);
            view0.setOnClickListener(pjT0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void PjT(FrameLayout frameLayout0) {
        try {
            this.KM();
            this.Zh(this.Zh);
            frameLayout0.addView(this.xE);
        }
        catch(Exception exception0) {
            Log.e("TTAD.RFTI", "bindAd: ", exception0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void PjT(XX xX0) {
        if(gK.Zh(this.Zh)) {
            com.bytedance.sdk.openadsdk.component.reward.Zh.cr.PjT(xX0, this.Zh);
            this.PjT.Xtz.PjT(((long)(this.PjT.tT.KM() * 1000.0)));
            return;
        }
        if(!gK.cr(this.Zh) && !gK.JQp(this.Zh)) {
            super.PjT(xX0);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.Zh.cr.Zh(xX0, this.Zh);
        this.PjT.Xtz.PjT(((long)(this.PjT.tT.KM() * 1000.0)));
    }

    private void Qf() {
        if(this.xE == null) {
            return;
        }
        this.PjT(this.ub);
    }

    private cz ReZ(Owx owx0) {
        return owx0.cI() == 4 ? new com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cr(ub.PjT(), owx0, this.gK) : null;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void XX() {
        if(gK.Zh(this.Zh)) {
            this.cz.Zh(8);
        }
        this.Au.ReZ(false);
        this.Au.cr(false);
        if(this.Zh.iZZ() == 2) {
            this.Au.PjT(false);
            this.cz.JQp(8);
            return;
        }
        boolean z = this.Zh.jp();
        this.Au.PjT(z);
        if(this.PjT.yks) {
            Message message0 = Message.obtain();
            message0.what = 900;
            PjT pjT0 = this.PjT;
            double f = pjT0.tT.KM();
            pjT0.SM = (int)(f * 1000.0);
            message0.arg1 = (int)(f * 1000.0);
            this.PjT.OMu.sendMessage(message0);
        }
    }

    private void ZX() {
        List list0 = this.Zh.CY();
        if(list0 != null && list0.size() > 0) {
            xE xE0 = (xE)list0.get(0);
            if(xE0 != null) {
                try {
                    int v = xE0.Zh();
                    int v1 = xE0.ReZ();
                    if(v != 0 && v1 != 0) {
                        this.ub.setRatio(((float)v) / ((float)v1));
                        return;
                    }
                    int v2 = this.qla;
                    if(v2 == 33) {
                        this.ub.setRatio(1.0f);
                        return;
                    }
                    if(v2 == 3) {
                        this.ub.setRatio(1.91f);
                        return;
                    }
                    this.ub.setRatio(0.56f);
                    return;
                }
                catch(Exception exception0) {
                }
                RD.Zh("TTAD.RFTI", exception0.getMessage());
            }
        }
    }

    private void Zh(Owx owx0) {
        if(owx0 == null) {
            return;
        }
        if(this.ub != null) {
            this.ZX();
            this.PjT(this.ub);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public boolean cz() {
        return this.Jo();
    }
}

