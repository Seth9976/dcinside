package com.bytedance.sdk.component.JQp.cr.Zh;

import android.text.TextUtils;
import com.bytedance.sdk.component.JQp.cr.ReZ.PjT;
import com.bytedance.sdk.component.JQp.cr.ReZ.ReZ;
import com.bytedance.sdk.component.JQp.ltE;
import com.bytedance.sdk.component.utils.xE;

public class Zh implements cz {
    private String PjT(ReZ reZ0) {
        return xE.PjT(reZ0.PjT());
    }

    @Override  // com.bytedance.sdk.component.JQp.cr.Zh.cz
    public String PjT() {
        return "generate_key";
    }

    @Override  // com.bytedance.sdk.component.JQp.cr.Zh.cz
    public boolean PjT(ReZ reZ0, ltE ltE0, PjT pjT0) {
        if(TextUtils.isEmpty(reZ0.DWo())) {
            String s = this.PjT(reZ0);
            reZ0.Zh(s);
            reZ0.PjT(s);
        }
        return true;
    }
}

