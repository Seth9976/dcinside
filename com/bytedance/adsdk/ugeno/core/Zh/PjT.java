package com.bytedance.adsdk.ugeno.core.Zh;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ReZ.Zh;
import com.bytedance.adsdk.ugeno.XX.SM;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.adsdk.ugeno.core.DWo;
import com.bytedance.adsdk.ugeno.core.XX;
import com.bytedance.adsdk.ugeno.core.xf;
import org.json.JSONObject;

public class PjT implements com.bytedance.adsdk.ugeno.XX.SM.PjT {
    private ReZ JQp;
    private int PjT;
    private Context ReZ;
    private xf Zh;
    private DWo cr;
    private Handler cz;

    public PjT(Context context0, DWo dWo0, ReZ reZ0) {
        this.cz = new SM(Looper.getMainLooper(), this);
        this.ReZ = context0;
        this.cr = dWo0;
        this.JQp = reZ0;
    }

    public void PjT() {
        DWo dWo0 = this.cr;
        if(dWo0 == null) {
            return;
        }
        String s = Zh.PjT(dWo0.ReZ().optString("delay"), this.JQp.xf());
        try {
            int v = Integer.parseInt(s);
            this.PjT = v;
            this.cz.sendEmptyMessageDelayed(1001, ((long)v));
        }
        catch(NumberFormatException unused_ex) {
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.XX.SM$PjT
    public void PjT(Message message0) {
        if(message0.what == 1001) {
            JSONObject jSONObject0 = this.cr.ReZ();
            if(TextUtils.equals(jSONObject0.optString("type"), "onAnimation")) {
                String s = jSONObject0.optString("nodeId");
                ReZ reZ0 = this.JQp.Zh(this.JQp).ReZ(s);
                new XX(reZ0.qj(), com.bytedance.adsdk.ugeno.core.PjT.PjT(jSONObject0.optJSONObject("animatorSet"), reZ0)).PjT();
            }
            else {
                xf xf0 = this.Zh;
                if(xf0 != null) {
                    xf0.PjT(this.cr, this.JQp, this.JQp);
                }
            }
            this.cz.removeMessages(1001);
        }
    }

    public void PjT(xf xf0) {
        this.Zh = xf0;
    }
}

