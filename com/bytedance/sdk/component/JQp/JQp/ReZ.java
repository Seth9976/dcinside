package com.bytedance.sdk.component.JQp.JQp;

import android.text.TextUtils;
import com.bytedance.sdk.component.JQp.xf;

public class ReZ extends PjT {
    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public String PjT() {
        return "generate_key";
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public void PjT(com.bytedance.sdk.component.JQp.ReZ.ReZ reZ0) {
        if(TextUtils.isEmpty(reZ0.DWo())) {
            xf xf0 = reZ0.gK().cz();
            reZ0.Zh(xf0.PjT(reZ0));
            reZ0.PjT(xf0.Zh(reZ0));
        }
        reZ0.PjT(new XX());
    }
}

