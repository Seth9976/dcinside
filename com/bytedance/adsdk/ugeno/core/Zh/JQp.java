package com.bytedance.adsdk.ugeno.core.Zh;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.ReZ.Zh;
import com.bytedance.adsdk.ugeno.XX.SM.PjT;
import com.bytedance.adsdk.ugeno.XX.SM;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.adsdk.ugeno.core.DWo;
import com.bytedance.adsdk.ugeno.core.xf;
import org.json.JSONObject;

public class JQp implements PjT {
    private DWo JQp;
    private boolean PjT;
    private xf ReZ;
    private Handler XX;
    private int Zh;
    private Context cr;
    private ReZ cz;

    public JQp(Context context0, DWo dWo0, ReZ reZ0) {
        this.XX = new SM(Looper.getMainLooper(), this);
        this.cr = context0;
        this.JQp = dWo0;
        this.cz = reZ0;
    }

    public void PjT() {
        DWo dWo0 = this.JQp;
        if(dWo0 == null) {
            return;
        }
        JSONObject jSONObject0 = dWo0.ReZ();
        String s = Zh.PjT(jSONObject0.optString("interval", "8000"), this.cz.xf());
        try {
            this.Zh = Integer.parseInt(s);
            this.PjT = jSONObject0.optBoolean("repeat");
            this.XX.sendEmptyMessageDelayed(1001, ((long)this.Zh));
        }
        catch(NumberFormatException unused_ex) {
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.XX.SM$PjT
    public void PjT(Message message0) {
        if(message0.what == 1001) {
            xf xf0 = this.ReZ;
            if(xf0 != null) {
                xf0.PjT(this.JQp, this.cz, this.cz);
            }
            if(this.PjT) {
                this.XX.sendEmptyMessageDelayed(1001, ((long)this.Zh));
                return;
            }
            this.XX.removeMessages(1001);
        }
    }

    public void PjT(xf xf0) {
        this.ReZ = xf0;
    }
}

