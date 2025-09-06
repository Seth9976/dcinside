package com.bytedance.sdk.component.JQp.JQp;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.JQp.ReZ.ReZ;
import com.bytedance.sdk.component.JQp.ub;
import java.util.Collection;

public class DWo extends PjT {
    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public String PjT() {
        return "memory_cache";
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public void PjT(ReZ reZ0) {
        Bitmap bitmap0;
        switch(reZ0.xf()) {
            case 1: 
            case 2: {
                bitmap0 = reZ0.Owx() || reZ0.ltE().SM() ? this.Zh(reZ0) : this.ReZ(reZ0);
                break;
            }
            default: {
                bitmap0 = null;
            }
        }
        if(bitmap0 == null) {
            reZ0.PjT(new xf());
            return;
        }
        reZ0.PjT(new xs(bitmap0, null, false));
    }

    private Bitmap ReZ(ReZ reZ0) {
        return (Bitmap)reZ0.gK().PjT(reZ0.ltE()).PjT(reZ0.DWo());
    }

    private Bitmap Zh(ReZ reZ0) {
        Collection collection0 = reZ0.gK().PjT();
        Bitmap bitmap0 = null;
        if(collection0 == null) {
            return null;
        }
        for(Object object0: collection0) {
            bitmap0 = (Bitmap)((ub)object0).PjT(reZ0.DWo());
            if(bitmap0 != null) {
                break;
            }
        }
        return bitmap0;
    }
}

