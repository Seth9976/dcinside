package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class ub {
    public interface PjT {
        void PjT(View arg1, boolean arg2);

        boolean tT();
    }

    private boolean Au;
    private final View.OnTouchListener DWo;
    private float JQp;
    private final PjT PjT;
    private boolean ReZ;
    private boolean SM;
    private int XX;
    private final boolean Zh;
    private float cr;
    private int cz;
    private boolean qj;

    public ub(PjT ub$PjT0) {
        this.Zh = false;
        this.ReZ = false;
        this.Au = true;
        this.SM = false;
        this.DWo = new View.OnTouchListener() {
            final ub PjT;

            @Override  // android.view.View$OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                if(ub.this.PjT.tT()) {
                    return !ub.this.ReZ;
                }
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                int v = motionEvent0.getAction();
                switch(v) {
                    case 0: {
                        boolean z = ub.this.PjT(motionEvent0);
                        ub.this.qj = z;
                        ub.this.cr = f;
                        ub.this.JQp = f1;
                        ub.this.cz = (int)f;
                        ub.this.XX = (int)f1;
                        ub.this.Au = true;
                        if(ub.this.PjT != null && ub.this.ReZ) {
                            ub.this.PjT.PjT(view0, true);
                        }
                        break;
                    }
                    case 1: {
                        if(Math.abs(f - ((float)ub.this.cz)) > 20.0f || Math.abs(f1 - ((float)ub.this.XX)) > 20.0f) {
                            ub.this.Au = false;
                        }
                        ub.this.Au = true;
                        ub.this.SM = false;
                        ub.this.cr = 0.0f;
                        ub.this.JQp = 0.0f;
                        ub.this.cz = 0;
                        if(ub.this.PjT != null) {
                            ub.this.PjT.PjT(view0, ub.this.Au);
                        }
                        ub.this.qj = false;
                        return !ub.this.ReZ;
                    label_18:
                        if(v == 3) {
                            ub.this.qj = false;
                            return !ub.this.ReZ;
                        }
                        break;
                    }
                    default: {
                        goto label_18;
                    }
                }
                return !ub.this.ReZ;
            }
        };
        this.PjT = ub$PjT0;
    }

    private boolean PjT(MotionEvent motionEvent0) {
        if(motionEvent0.getActionMasked() == 0) {
            int v = qZS.ReZ(com.bytedance.sdk.openadsdk.core.ub.PjT().getApplicationContext());
            int v1 = qZS.JQp(com.bytedance.sdk.openadsdk.core.ub.PjT().getApplicationContext());
            float f = motionEvent0.getRawX();
            float f1 = motionEvent0.getRawY();
            return f <= ((float)v) * 0.01f || f >= ((float)v) * 0.99f || f1 <= 0.01f * ((float)v1) || f1 >= ((float)v1) * 0.99f;
        }
        return false;
    }

    public void PjT(View view0) {
        if(view0 != null) {
            view0.setOnTouchListener(this.DWo);
        }
    }

    public void PjT(boolean z) {
        this.ReZ = z;
    }
}

