package com.bytedance.adsdk.ugeno.cr.cr;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.cr.qj;
import java.util.Map;

public class ReZ extends PjT {
    private String fDm;
    private float qj;
    private float xf;
    private int xs;

    public ReZ(Context context0) {
        super(context0);
        this.xs = 0;
        this.fDm = "up";
    }

    private boolean PjT(com.bytedance.adsdk.ugeno.Zh.ReZ reZ0, MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                this.qj = motionEvent0.getX();
                this.xf = motionEvent0.getY();
                return true;
            }
            case 1: 
            case 3: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                if(this.xs == 0) {
                    qj qj0 = this.PjT;
                    if(qj0 != null) {
                        qj0.PjT(reZ0, this.cz, this.ReZ.Zh());
                        return true;
                    }
                }
                int v = Au.Zh(this.DWo, f - this.qj);
                int v1 = Au.Zh(this.DWo, f1 - this.xf);
                switch(this.fDm) {
                    case "all": {
                        v = (int)Math.abs(Math.sqrt(Math.pow(v, 2.0) + Math.pow(v1, 2.0)));
                        break;
                    }
                    case "down": {
                        v = v1;
                        break;
                    }
                    case "left": {
                        v = -v;
                        break;
                    }
                    case "right": {
                        break;
                    }
                    case "up": {
                        v = -v1;
                        break;
                    }
                    default: {
                        v = (int)Math.abs(Math.sqrt(Math.pow(v, 2.0) + Math.pow(v1, 2.0)));
                    }
                }
                if(v >= this.xs) {
                    qj qj1 = this.PjT;
                    if(qj1 != null) {
                        this.qj = 0.0f;
                        this.xf = 0.0f;
                        qj1.PjT(reZ0, this.cz, this.ReZ.Zh());
                        return true;
                    }
                    return true;
                }
                return false;
            }
            default: {
                return true;
            }
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.cr.cr.PjT
    public boolean PjT(Object[] arr_object) {
        if(arr_object != null && arr_object.length > 0) {
            Map map0 = this.JQp;
            if(map0 != null) {
                this.fDm = TextUtils.isEmpty(((CharSequence)map0.get("direction"))) ? "all" : ((String)this.JQp.get("direction"));
                this.xs = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(((String)this.JQp.get("distance")), 0);
            }
            return this.PjT(this.Zh, ((MotionEvent)arr_object[0]));
        }
        return false;
    }
}

