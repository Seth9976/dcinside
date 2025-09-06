package com.bytedance.adsdk.ugeno.core.Zh;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.adsdk.ugeno.core.DWo;
import com.bytedance.adsdk.ugeno.core.xf;

public class cr {
    private boolean Au;
    private DWo JQp;
    private float PjT;
    private int ReZ;
    private Context XX;
    private float Zh;
    private DWo cr;
    private String cz;

    public cr(Context context0, DWo dWo0, DWo dWo1, boolean z) {
        this.PjT = 1.401298E-45f;
        this.Zh = 1.401298E-45f;
        this.ReZ = 0;
        this.XX = context0;
        this.cr = dWo0;
        this.JQp = dWo1;
        this.Au = z;
        this.Zh();
    }

    public cr(Context context0, DWo dWo0, boolean z) {
        this.PjT = 1.401298E-45f;
        this.Zh = 1.401298E-45f;
        this.ReZ = 0;
        this.XX = context0;
        this.cr = dWo0;
        this.Au = z;
        this.Zh();
    }

    public void PjT() {
        this.PjT = 1.401298E-45f;
        this.Zh = 1.401298E-45f;
    }

    public boolean PjT(xf xf0, ReZ reZ0, MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                this.PjT = motionEvent0.getX();
                this.Zh = motionEvent0.getY();
                return true;
            }
            case 1: {
                break;
            }
            case 3: {
                if(this.PjT == 1.401298E-45f || this.Zh == 1.401298E-45f) {
                    return false;
                }
                break;
            }
            default: {
                return true;
            }
        }
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        if(this.Au && Math.abs(f - this.PjT) <= 10.0f && Math.abs(f1 - this.Zh) <= 10.0f && xf0 != null) {
            this.PjT();
            xf0.PjT(this.JQp, reZ0, reZ0);
            return true;
        }
        if(this.ReZ == 0 && xf0 != null) {
            this.PjT();
            xf0.PjT(this.cr, reZ0, reZ0);
            return true;
        }
        int v = Au.Zh(this.XX, f - this.PjT);
        int v1 = Au.Zh(this.XX, f1 - this.Zh);
        if(TextUtils.equals(this.cz, "up")) {
            v = -v1;
        }
        else if(TextUtils.equals(this.cz, "down")) {
            v = v1;
        }
        else if(TextUtils.equals(this.cz, "left")) {
            v = -v;
        }
        else if(!TextUtils.equals(this.cz, "right")) {
            v = (int)Math.abs(Math.sqrt(Math.pow(v, 2.0) + Math.pow(v1, 2.0)));
        }
        if(v >= this.ReZ) {
            if(xf0 != null) {
                this.PjT();
                xf0.PjT(this.cr, reZ0, reZ0);
                return true;
            }
            this.PjT();
            return true;
        }
        this.PjT();
        return false;
    }

    private void Zh() {
        DWo dWo0 = this.cr;
        if(dWo0 == null) {
            return;
        }
        this.ReZ = dWo0.ReZ().optInt("slideThreshold");
        this.cz = this.cr.ReZ().optString("slideDirection");
    }
}

