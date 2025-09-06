package com.bytedance.adsdk.ugeno.cr.cr;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.cr.PjT.ReZ;
import com.bytedance.adsdk.ugeno.cr.PjT.cr;

public class Zh extends PjT implements cr {
    private ReZ qj;

    public Zh(Context context0) {
        super(context0);
    }

    @Override  // com.bytedance.adsdk.ugeno.cr.PjT.cr
    public void PjT(String s) {
        Log.d("UGBaseEventMonitor", "receive: ");
        this.PjT.PjT(this.Zh, this.cz, this.ReZ.Zh());
    }

    @Override  // com.bytedance.adsdk.ugeno.cr.cr.PjT
    public boolean PjT(Object[] arr_object) {
        com.bytedance.adsdk.ugeno.cr.PjT.PjT pjT0 = this.Zh.rds();
        if(pjT0 != null) {
            ReZ reZ0 = pjT0.PjT(this.cz);
            this.qj = reZ0;
            if(reZ0 != null) {
                reZ0.PjT(this);
                return false;
            }
            pjT0.PjT(this.cz, new com.bytedance.adsdk.ugeno.cr.PjT.Zh());
        }
        return false;
    }
}

