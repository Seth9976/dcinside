package com.bytedance.sdk.component.JQp.cr.Zh;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.JQp.Zh;
import com.bytedance.sdk.component.JQp.cr.ReZ.PjT;
import com.bytedance.sdk.component.JQp.cr.ReZ.ReZ;
import com.bytedance.sdk.component.JQp.ltE;
import com.bytedance.sdk.component.utils.qj;

public class cr implements cz {
    private void PjT(Zh zh0, com.bytedance.sdk.component.JQp.cr.ReZ.cz cz0, String s, Bitmap bitmap0) {
        if(zh0 != null && cz0 != null && zh0.JQp()) {
            cz0.PjT(zh0).PjT(s, bitmap0);
        }
    }

    private void PjT(ReZ reZ0, byte[] arr_b, PjT pjT0) {
        try {
            com.bytedance.sdk.component.JQp.cr.ReZ.cz cz0 = reZ0.ub();
            Bitmap bitmap0 = cz0.PjT(reZ0).PjT(arr_b);
            if(bitmap0 != null) {
                bitmap0.getWidth();
                bitmap0.getHeight();
                bitmap0.getByteCount();
                pjT0.PjT(new com.bytedance.sdk.component.JQp.cr.ReZ.cr().PjT(reZ0, bitmap0, null, false));
                this.PjT(reZ0.gK(), cz0, reZ0.DWo(), bitmap0);
                return;
            }
            pjT0.PjT(1002, "decode failed bitmap null", new Exception("decode failed bitmap null"));
            return;
        }
        catch(Throwable throwable0) {
        }
        pjT0.PjT(1002, "decode failed:" + throwable0.getMessage(), throwable0);
    }

    @Override  // com.bytedance.sdk.component.JQp.cr.Zh.cz
    public String PjT() {
        return "decode";
    }

    @Override  // com.bytedance.sdk.component.JQp.cr.Zh.cz
    public boolean PjT(ReZ reZ0, ltE ltE0, PjT pjT0) {
        byte[] arr_b = reZ0.fDm();
        if(arr_b == null) {
            pjT0.PjT(2000, "imageData is empty", new Exception("imageData is empty"));
            return false;
        }
        reZ0.PjT(arr_b.length);
        switch(reZ0.xf()) {
            case 2: {
                if(com.bytedance.sdk.component.utils.cz.PjT(arr_b)) {
                    this.PjT(reZ0, arr_b, pjT0);
                    return false;
                }
                pjT0.PjT(1001, "result type is bit but data not image", new Exception("not image format"));
                return false;
            }
            case 3: {
                pjT0.PjT(new com.bytedance.sdk.component.JQp.cr.ReZ.cr().PjT(reZ0, arr_b, null, com.bytedance.sdk.component.utils.cz.Zh(arr_b)));
                return false;
            }
            default: {
                boolean z = com.bytedance.sdk.component.utils.cz.Zh(arr_b);
                if(!z && !qj.PjT(arr_b, 0)) {
                    if(com.bytedance.sdk.component.utils.cz.PjT(arr_b)) {
                        this.PjT(reZ0, arr_b, pjT0);
                        return false;
                    }
                    pjT0.PjT(new com.bytedance.sdk.component.JQp.cr.ReZ.cr().PjT(reZ0, arr_b, null, false));
                    return false;
                }
                pjT0.PjT(new com.bytedance.sdk.component.JQp.cr.ReZ.cr().PjT(reZ0, arr_b, null, z));
                return false;
            }
        }
    }
}

