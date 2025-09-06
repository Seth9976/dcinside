package com.bytedance.sdk.component.SM;

import android.content.Context;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

public abstract class ReZ implements View.OnTouchListener {
    private ViewConfiguration PjT;
    private int Zh;

    public ReZ() {
        this.Zh = -1;
    }

    abstract void PjT(View.OnTouchListener arg1);

    boolean PjT(float f, float f1, float f2, float f3, Context context0) {
        if(this.PjT == null) {
            this.PjT = ViewConfiguration.get(context0);
        }
        if(this.Zh == -1) {
            this.Zh = this.PjT.getScaledTouchSlop();
        }
        return Math.abs(f - f2) <= ((float)this.Zh) && Math.abs(f1 - f3) <= ((float)this.Zh);
    }
}

