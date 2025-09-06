package com.bytedance.adsdk.ugeno.cr.cr;

import android.content.Context;
import com.bytedance.adsdk.ugeno.XX.ReZ;

public class JQp extends PjT {
    public JQp(Context context0) {
        super(context0);
    }

    @Override  // com.bytedance.adsdk.ugeno.cr.cr.PjT
    public boolean PjT(Object[] arr_object) {
        if(arr_object != null && arr_object.length > 0) {
            int v = ReZ.PjT(String.valueOf(arr_object[0]), 0);
            if(this.JQp == null || this.JQp.isEmpty()) {
                this.PjT.PjT(this.Zh, this.cz, this.ReZ.Zh());
            }
            else if(v == ReZ.PjT(((String)this.JQp.get("type")), 0)) {
                this.PjT.PjT(this.Zh, this.cz, this.ReZ.Zh());
                return false;
            }
        }
        return false;
    }
}

