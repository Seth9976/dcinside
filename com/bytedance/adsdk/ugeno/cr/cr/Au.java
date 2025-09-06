package com.bytedance.adsdk.ugeno.cr.cr;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.adsdk.ugeno.XX.ReZ;
import com.bytedance.adsdk.ugeno.XX.SM;
import java.util.Map;

public class Au extends PjT implements com.bytedance.adsdk.ugeno.XX.SM.PjT {
    private int fDm;
    private int qj;
    private int xf;
    private Handler xs;

    public Au(Context context0) {
        super(context0);
        this.xf = 0;
        this.xs = new SM(Looper.getMainLooper(), this);
        this.fDm = 0;
    }

    @Override  // com.bytedance.adsdk.ugeno.XX.SM$PjT
    public void PjT(Message message0) {
        if(message0.what == 1001) {
            Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.fDm);
            this.PjT.PjT(this.Zh, this.cz, this.ReZ.Zh());
            int v = this.fDm - 1;
            this.fDm = v;
            if(v < 0) {
                int v1 = this.xf;
                if(v1 != 0) {
                    this.xs.sendEmptyMessageDelayed(1001, ((long)v1));
                    return;
                }
            }
            if(v > 0) {
                int v2 = this.xf;
                if(v2 != 0) {
                    this.xs.sendEmptyMessageDelayed(1001, ((long)v2));
                    return;
                }
            }
            this.xs.removeMessages(1001);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.cr.cr.PjT
    public boolean PjT(Object[] arr_object) {
        Map map0 = this.JQp;
        if(map0 != null) {
            int v = ReZ.PjT(((String)map0.get("loop")), 0);
            this.qj = v;
            this.fDm = v <= 0 ? -1 : v;
            this.xf = ReZ.PjT(((String)this.JQp.get("duration")), 0);
        }
        this.xs.sendEmptyMessageDelayed(1001, ((long)this.xf));
        return true;
    }
}

