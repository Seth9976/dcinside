package com.bytedance.adsdk.ugeno.core.Zh;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.adsdk.ugeno.core.DWo;
import com.bytedance.adsdk.ugeno.core.xf;

public class Zh {
    private boolean JQp;
    private float PjT;
    private DWo ReZ;
    private float Zh;
    private Context cr;

    public Zh(Context context0, DWo dWo0) {
        this.cr = context0;
        this.ReZ = dWo0;
    }

    public boolean PjT(xf xf0, ReZ reZ0, MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                this.PjT = motionEvent0.getX();
                this.Zh = motionEvent0.getY();
                return true;
            }
            case 1: {
                if(this.JQp) {
                    this.JQp = false;
                    return false;
                }
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                if(Math.abs(f - this.PjT) >= 15.0f || Math.abs(f1 - this.Zh) >= 15.0f) {
                    this.JQp = false;
                    return true;
                }
                else if(xf0 != null) {
                    xf0.PjT(this.ReZ, reZ0, reZ0);
                    return true;
                }
                break;
            }
            case 2: {
                float f2 = motionEvent0.getX();
                float f3 = motionEvent0.getY();
                if(Math.abs(f2 - this.PjT) >= 15.0f || Math.abs(f3 - this.Zh) >= 15.0f) {
                    this.JQp = true;
                    return true;
                }
                break;
            }
            case 3: {
                this.JQp = false;
                return true;
            }
            default: {
                return true;
            }
        }
        return true;
    }
}

