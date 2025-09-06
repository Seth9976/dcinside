package com.bytedance.sdk.component.JQp.cr.Zh;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.JQp.Zh;
import com.bytedance.sdk.component.JQp.cr.ReZ.ReZ;
import com.bytedance.sdk.component.JQp.cr.ReZ.cr;
import com.bytedance.sdk.component.JQp.ltE;

public class PjT implements cz {
    private boolean PjT(ReZ reZ0) {
        switch(reZ0.xf()) {
            case 1: 
            case 2: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // com.bytedance.sdk.component.JQp.cr.Zh.cz
    public String PjT() {
        return "bitmap_cache";
    }

    @Override  // com.bytedance.sdk.component.JQp.cr.Zh.cz
    public boolean PjT(ReZ reZ0, ltE ltE0, com.bytedance.sdk.component.JQp.cr.ReZ.PjT pjT0) {
        String s = reZ0.DWo();
        Zh zh0 = reZ0.gK();
        com.bytedance.sdk.component.JQp.cr.ReZ.cz cz0 = reZ0.ub();
        if(zh0 != null && cz0 != null && zh0.JQp() && this.PjT(reZ0)) {
            Bitmap bitmap0 = (Bitmap)cz0.PjT(zh0).PjT(s);
            if(bitmap0 != null) {
                pjT0.PjT(new cr().PjT(reZ0, bitmap0, null, false));
                return false;
            }
        }
        return true;
    }
}

