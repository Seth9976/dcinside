package com.bytedance.adsdk.ugeno.cr.cr;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public class SM extends PjT {
    private Map qj;

    public SM(Context context0) {
        super(context0);
        this.qj = new HashMap();
    }

    @Override  // com.bytedance.adsdk.ugeno.cr.cr.PjT
    public boolean PjT(Object[] arr_object) {
        int v = this.JQp == null ? -1 : Integer.parseInt(((String)this.JQp.get("interval")));
        if(((int)(((Integer)arr_object[0]))) >= v) {
            Boolean boolean0 = (Boolean)this.qj.get(v);
            if(boolean0 == null || !boolean0.booleanValue()) {
                this.qj.put(v, Boolean.TRUE);
                this.PjT.PjT(this.Zh, this.cz, this.ReZ.Zh());
            }
        }
        return true;
    }
}

