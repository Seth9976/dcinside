package com.bytedance.sdk.openadsdk.ReZ;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class PjT extends Au {
    private Paint PjT;
    private boolean ReZ;
    private float Zh;
    private int cr;

    public PjT(Context context0) {
        super(context0);
        this.PjT();
    }

    private float PjT(float f, String s) {
        this.PjT.setTextSize(f);
        return this.PjT.measureText(s);
    }

    private void PjT() {
        this.Zh = qZS.PjT(this.getContext(), 8.0f);
        this.PjT = new Paint();
    }

    private void PjT(String s, int v) {
        if(this.ReZ) {
            return;
        }
        if(v > 0) {
            float f = this.getTextSize();
            this.PjT.set(this.getPaint());
            int v1 = this.getPaddingLeft();
            int v2 = this.getPaddingRight();
            for(float f1 = this.PjT(f, s); f1 > ((float)(v - v1 - v2)); f1 = this.PjT(f, s)) {
                --f;
                this.PjT.setTextSize(f);
                if(f <= this.Zh) {
                    break;
                }
            }
            this.setTextSize(0, f);
            this.ReZ = true;
        }
    }

    @Override  // android.widget.TextView
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        this.PjT(this.getText().toString(), this.getWidth());
    }

    @Override  // com.bytedance.sdk.openadsdk.core.JQp.Au
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        this.cr = this.getMeasuredHeight();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-2, this.cr);
        }
        else {
            viewGroup$LayoutParams0.height = this.cr;
        }
        this.setLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.JQp.Au
    public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setLayoutParams(viewGroup$LayoutParams0);
        int v = this.cr;
        if(v != 0 && viewGroup$LayoutParams0 != null) {
            viewGroup$LayoutParams0.height = v;
        }
    }

    public void setMinTextSize(float f) {
        if(f <= 0.0f) {
            return;
        }
        this.Zh = f;
    }
}

