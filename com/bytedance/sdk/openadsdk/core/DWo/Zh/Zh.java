package com.bytedance.sdk.openadsdk.core.DWo.Zh;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.SM.cz.PjT;

public class Zh extends com.bytedance.adsdk.ugeno.SM.cz.Zh {
    private String dDm;
    private String oMU;

    public Zh(Context context0) {
        super(context0);
    }

    @Override  // com.bytedance.adsdk.ugeno.SM.cz.Zh
    public void PjT(String s, String s1) {
        super.PjT(s, s1);
        s.hashCode();
        if(!s.equals("before")) {
            if(s.equals("after")) {
                this.oMU = s1;
            }
            return;
        }
        this.dDm = s1;
    }

    @Override  // com.bytedance.adsdk.ugeno.SM.cz.Zh
    public void XX(String s) {
        if(TextUtils.isEmpty(s) || TextUtils.equals(s, "null")) {
            s = "";
        }
        if(TextUtils.isEmpty(this.oMU) || TextUtils.equals(this.oMU, "null")) {
            this.oMU = "";
        }
        if(TextUtils.isEmpty(this.dDm) || TextUtils.equals(this.dDm, "null")) {
            this.dDm = "";
        }
        String s1 = this.dDm + s + this.oMU;
        this.PjT = s1;
        ((PjT)this.JQp).setText(s1);
        try {
            float f = this.Jo ? this.iZZ : this.yIW;
            float f1 = this.Co ? this.Yo : this.yIW;
            float f2 = ((PjT)this.JQp).getPaint().measureText(this.PjT);
            if(f2 >= 0.0f) {
                this.JQp(((int)(f + f2 + f1)));
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.SM.cz.Zh
    public void Zh() {
        super.Zh();
        if(TextUtils.isEmpty(this.oMU) || TextUtils.equals(this.oMU, "null")) {
            this.oMU = "";
        }
        if(TextUtils.isEmpty(this.dDm) || TextUtils.equals(this.dDm, "null")) {
            this.dDm = "";
        }
        String s = this.dDm + this.oMU;
        this.PjT = s;
        ((PjT)this.JQp).setText(s);
        ((PjT)this.JQp).setGravity(17);
    }
}

