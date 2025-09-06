package com.bytedance.sdk.component.JQp.JQp;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.JQp.ReZ.ReZ;
import com.bytedance.sdk.component.JQp.cz;

public class JQp extends PjT {
    private byte[] PjT;
    private cz Zh;

    public JQp(byte[] arr_b, cz cz0) {
        this.PjT = arr_b;
        this.Zh = cz0;
    }

    private void PjT(int v, String s, Throwable throwable0, ReZ reZ0) {
        if(this.Zh == null) {
            reZ0.PjT(new qj());
            return;
        }
        reZ0.PjT(new Au(v, s, throwable0));
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public String PjT() {
        return "decode";
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public void PjT(ReZ reZ0) {
        com.bytedance.sdk.component.JQp.ReZ.cz cz0 = reZ0.gK();
        com.bytedance.sdk.component.JQp.ReZ.Zh.PjT pjT0 = cz0.PjT(reZ0);
        try {
            Bitmap bitmap0 = pjT0.PjT(this.PjT);
            if(bitmap0 != null) {
                reZ0.PjT(new xs(bitmap0, this.Zh, false));
                cz0.PjT(reZ0.ltE()).PjT(reZ0.DWo(), bitmap0);
                return;
            }
            this.PjT(1002, "decode failed bitmap null", null, reZ0);
            return;
        }
        catch(Throwable throwable0) {
        }
        this.PjT(1002, "decode failed:" + throwable0.getMessage(), throwable0, reZ0);
    }
}

