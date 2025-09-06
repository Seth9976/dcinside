package com.bytedance.sdk.component.JQp.JQp;

import com.bytedance.sdk.component.JQp.ReZ.ReZ;

public class xf extends PjT {
    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public String PjT() {
        return "raw_cache";
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public void PjT(ReZ reZ0) {
        byte[] arr_b = (byte[])reZ0.gK().Zh(reZ0.ltE()).PjT(reZ0.SM());
        if(arr_b == null) {
            reZ0.PjT(new cz());
            return;
        }
        reZ0.PjT(new Zh(arr_b, null));
    }
}

