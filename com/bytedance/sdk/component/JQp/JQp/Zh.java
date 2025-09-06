package com.bytedance.sdk.component.JQp.JQp;

import com.bytedance.sdk.component.JQp.ReZ.ReZ;
import com.bytedance.sdk.component.JQp.cz;

public class Zh implements SM {
    private byte[] PjT;
    private cz Zh;

    public Zh(byte[] arr_b, cz cz0) {
        this.PjT = arr_b;
        this.Zh = cz0;
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public String PjT() {
        return "image_type";
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public void PjT(ReZ reZ0) {
        xs xs0;
        reZ0.PjT(this.PjT.length);
        switch(reZ0.xf()) {
            case 2: {
                if(com.bytedance.sdk.component.utils.cz.PjT(this.PjT)) {
                    xs0 = new JQp(this.PjT, this.Zh);
                }
                else if(this.Zh == null) {
                    xs0 = new qj();
                }
                else {
                    xs0 = new Au(1001, "not image format", null);
                }
                break;
            }
            case 3: {
                xs0 = new xs(this.PjT, this.Zh, com.bytedance.sdk.component.utils.cz.Zh(this.PjT));
                break;
            }
            default: {
                if(com.bytedance.sdk.component.utils.cz.Zh(this.PjT)) {
                    xs0 = new xs(this.PjT, this.Zh, true);
                }
                else if(com.bytedance.sdk.component.utils.cz.PjT(this.PjT)) {
                    xs0 = new JQp(this.PjT, this.Zh);
                }
                else {
                    xs0 = new xs(this.PjT, this.Zh, false);
                }
            }
        }
        reZ0.PjT(xs0);
    }
}

