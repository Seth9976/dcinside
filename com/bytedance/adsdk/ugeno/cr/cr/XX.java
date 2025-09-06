package com.bytedance.adsdk.ugeno.cr.cr;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.adsdk.ugeno.cr.qj;

public class XX extends PjT {
    private float qj;
    private float xf;
    private boolean xs;

    public XX(Context context0) {
        super(context0);
    }

    public boolean PjT(ReZ reZ0, MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                this.qj = motionEvent0.getRawX();
                this.xf = motionEvent0.getRawY();
                return true;
            }
            case 1: {
                if(this.xs) {
                    this.xs = false;
                    this.qj = 0.0f;
                    this.xf = 0.0f;
                    return false;
                }
                float f = motionEvent0.getRawX();
                float f1 = motionEvent0.getRawY();
                if(Math.abs(f - this.qj) >= 15.0f || Math.abs(f1 - this.xf) >= 15.0f) {
                    this.xs = false;
                    return true;
                }
                qj qj0 = this.PjT;
                if(qj0 != null) {
                    qj0.PjT(reZ0, this.cz, this.ReZ.Zh());
                    this.qj = 0.0f;
                    this.xf = 0.0f;
                    return true;
                }
                break;
            }
            case 2: {
                float f2 = motionEvent0.getRawX();
                float f3 = motionEvent0.getRawY();
                if(Math.abs(f2 - this.qj) >= 15.0f || Math.abs(f3 - this.xf) >= 15.0f) {
                    this.xs = true;
                    return true;
                }
                break;
            }
            case 3: {
                this.xs = false;
                return true;
            }
            default: {
                return true;
            }
        }
        return true;
    }

    @Override  // com.bytedance.adsdk.ugeno.cr.cr.PjT
    public boolean PjT(Object[] arr_object) {
        return arr_object == null || arr_object.length <= 0 ? false : this.PjT(this.Zh, ((MotionEvent)arr_object[0]));
    }
}

