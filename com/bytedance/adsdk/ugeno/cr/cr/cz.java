package com.bytedance.adsdk.ugeno.cr.cr;

import android.content.Context;
import com.bytedance.adsdk.ugeno.XX.ReZ;
import java.util.HashMap;

public class cz extends PjT {
    private int qj;
    private int xf;
    private int xs;

    public cz(Context context0) {
        super(context0);
        this.qj = -1;
        this.xf = -1;
        this.xs = -1;
    }

    @Override  // com.bytedance.adsdk.ugeno.cr.cr.PjT
    public boolean PjT(Object[] arr_object) {
        if(arr_object != null && arr_object.length > 0) {
            int v = ReZ.PjT(String.valueOf(arr_object[0]), -1);
            int v1 = ReZ.PjT(String.valueOf(arr_object[1]), -1);
            int v2 = ReZ.PjT(String.valueOf(arr_object[2]), -1);
            if(this.JQp == null || this.JQp.isEmpty()) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("fromIndex", v);
                hashMap0.put("toIndex", v1);
                hashMap0.put("type", v2);
                for(Object object0: this.ReZ.Zh()) {
                    ((com.bytedance.adsdk.ugeno.cr.cz.PjT)object0).Zh(hashMap0);
                }
                this.PjT.PjT(this.Zh, this.cz, this.ReZ.Zh());
            }
            else {
                this.qj = ReZ.PjT(((String)this.JQp.get("fromIndex")), -1);
                this.xf = ReZ.PjT(((String)this.JQp.get("toIndex")), -1);
                int v3 = ReZ.PjT(((String)this.JQp.get("type")), -1);
                this.xs = v3;
                if(v == this.qj && v1 == this.xf && v2 == v3) {
                    this.PjT.PjT(this.Zh, this.cz, this.ReZ.Zh());
                    return false;
                }
            }
        }
        return false;
    }
}

