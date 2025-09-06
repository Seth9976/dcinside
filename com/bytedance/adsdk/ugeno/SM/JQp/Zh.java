package com.bytedance.adsdk.ugeno.SM.JQp;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.adsdk.ugeno.XX.PjT;
import com.bytedance.adsdk.ugeno.Zh.ReZ;

public class Zh extends ReZ {
    private int OL;
    private int PjT;
    private static final int ZsT;
    private float dDm;
    private float jp;
    private static final int kWj;
    private float oMU;

    static {
        Zh.ZsT = Color.parseColor("#FFC642");
        Zh.kWj = Color.parseColor("#e3e3e4");
    }

    public Zh(Context context0) {
        super(context0);
        this.PjT = Zh.ZsT;
        this.OL = Zh.kWj;
        this.jp = 4.0f;
        this.dDm = 20.0f;
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public View PjT() {
        return this.ReZ();
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void PjT(String s, String s1) {
        super.PjT(s, s1);
        s.hashCode();
        switch(s) {
            case "gap": {
                this.oMU = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "highLightColor": 
            case "highlightColor": {
                this.PjT = PjT.PjT(s1);
                return;
            }
            case "lowLightColor": 
            case "lowlightColor": {
                this.OL = PjT.PjT(s1, Zh.kWj);
                return;
            }
            case "score": {
                this.jp = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 4.0f);
                return;
            }
            case "size": {
                this.dDm = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 20.0f);
            }
        }
    }

    public com.bytedance.adsdk.ugeno.SM.JQp.PjT ReZ() {
        com.bytedance.adsdk.ugeno.SM.JQp.PjT pjT0 = new com.bytedance.adsdk.ugeno.SM.JQp.PjT(this.Zh);
        pjT0.PjT(this);
        return pjT0;
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void Zh() {
        super.Zh();
        if(this.Qf()) {
            ((com.bytedance.adsdk.ugeno.SM.JQp.PjT)this.JQp).PjT(((double)this.jp), this.PjT, this.OL, this.dDm, ((int)this.oMU));
            return;
        }
        ((com.bytedance.adsdk.ugeno.SM.JQp.PjT)this.JQp).PjT(((double)this.jp), this.PjT, this.OL, this.dDm, 5);
    }
}

