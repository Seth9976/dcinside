package com.bytedance.sdk.component.JQp.JQp;

import com.bytedance.sdk.component.JQp.ReZ.ReZ;
import java.util.Collection;

public class cz extends PjT {
    private byte[] PjT(ReZ reZ0, String s) {
        reZ0.gK().ReZ(reZ0.ltE());
        Collection collection0 = reZ0.gK().ReZ();
        if(collection0 == null) {
            return null;
        }
        for(Object object0: collection0) {
            byte[] arr_b = (byte[])((com.bytedance.sdk.component.JQp.ReZ)object0).PjT(s);
            if(arr_b != null) {
                return arr_b;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public String PjT() {
        return "disk_cache";
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public void PjT(ReZ reZ0) {
        String s = reZ0.SM();
        byte[] arr_b = reZ0.Owx() || reZ0.ltE().SM() ? this.PjT(reZ0, s) : this.Zh(reZ0, s);
        if(arr_b == null) {
            reZ0.PjT(new qj());
            return;
        }
        reZ0.PjT(new Zh(arr_b, null));
        reZ0.gK().Zh(reZ0.ltE()).PjT(s, arr_b);
    }

    private byte[] Zh(ReZ reZ0, String s) {
        com.bytedance.sdk.component.JQp.ReZ reZ1 = reZ0.gK().ReZ(reZ0.ltE());
        return reZ1 == null ? null : ((byte[])reZ1.PjT(s));
    }
}

