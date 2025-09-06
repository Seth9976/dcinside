package com.bytedance.adsdk.ugeno.cr.Zh;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.Zh.ReZ;

public class cr extends PjT {
    public cr(ReZ reZ0, String s, com.bytedance.adsdk.ugeno.cr.cz.PjT cz$PjT0) {
        super(reZ0, s, cz$PjT0);
    }

    private void PjT(ReZ reZ0) {
        if(reZ0 == null) {
            return;
        }
        for(Object object0: this.cz.keySet()) {
            String s = (String)object0;
            if(!TextUtils.isEmpty(s) && !TextUtils.equals(s, "id")) {
                reZ0.PjT(s, ((String)this.cz.get(s)));
            }
        }
        reZ0.Yo();
        reZ0.Zh();
    }

    @Override  // com.bytedance.adsdk.ugeno.cr.Zh.PjT
    public void PjT() {
        if(this.cz != null && this.cz.size() > 0) {
            String s = (String)this.cz.get("id");
            if(TextUtils.isEmpty(s)) {
                this.PjT(this.ReZ);
                return;
            }
            ReZ reZ0 = this.ReZ.Zh(this.ReZ);
            if(reZ0 == null) {
                return;
            }
            this.PjT(reZ0.ReZ(s));
        }
    }
}

