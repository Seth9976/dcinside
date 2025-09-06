package com.bytedance.sdk.component.adexpress.cz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class cr extends View {
    private List Au;
    private Paint DWo;
    private float JQp;
    private int PjT;
    private float ReZ;
    private List SM;
    private boolean XX;
    private int Zh;
    private int cr;
    private int cz;
    private int fDm;
    private Paint qj;
    private float xf;
    private float xs;

    public cr(Context context0) {
        this(context0, null);
    }

    public cr(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, -1);
    }

    public cr(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.PjT = -1;
        this.Zh = 0xFFFF0000;
        this.ReZ = 18.0f;
        this.cr = 3;
        this.JQp = 50.0f;
        this.cz = 2;
        this.XX = false;
        this.Au = new ArrayList();
        this.SM = new ArrayList();
        this.fDm = 24;
        this.ReZ();
    }

    public void PjT() {
        this.XX = true;
        this.invalidate();
    }

    private void ReZ() {
        Paint paint0 = new Paint();
        this.DWo = paint0;
        paint0.setAntiAlias(true);
        this.DWo.setStrokeWidth(((float)this.fDm));
        this.Au.add(0xFF);
        this.SM.add(0);
        Paint paint1 = new Paint();
        this.qj = paint1;
        paint1.setAntiAlias(true);
        this.qj.setColor(Color.parseColor("#0FFFFFFF"));
        this.qj.setStyle(Paint.Style.FILL);
    }

    public void Zh() {
        this.XX = false;
        this.SM.clear();
        this.Au.clear();
        this.Au.add(0xFF);
        this.SM.add(0);
        this.invalidate();
    }

    @Override  // android.view.View
    public void invalidate() {
        if(this.hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        this.DWo.setShader(new LinearGradient(this.xf, 0.0f, this.xs, ((float)this.getMeasuredHeight()), -1, 0xFFFFFF, Shader.TileMode.CLAMP));
        for(int v = 0; true; ++v) {
            int v1 = 1;
            if(v >= this.Au.size()) {
                break;
            }
            Integer integer0 = (Integer)this.Au.get(v);
            this.DWo.setAlpha(((int)integer0));
            Integer integer1 = (Integer)this.SM.get(v);
            if(this.ReZ + ((float)(((int)integer1))) < this.JQp) {
                canvas0.drawCircle(this.xf, this.xs, this.ReZ + ((float)(((int)integer1))), this.DWo);
            }
            if(((int)integer0) > 0 && ((float)(((int)integer1))) < this.JQp) {
                List list0 = this.Au;
                if(((int)integer0) - this.cz > 0) {
                    v1 = ((int)integer0) - this.cz * 3;
                }
                list0.set(v, v1);
                this.SM.set(v, ((int)(((int)integer1) + this.cz)));
            }
        }
        if(((float)(((int)(((Integer)this.SM.get(this.SM.size() - 1)))))) >= this.JQp / ((float)this.cr)) {
            this.Au.add(0xFF);
            this.SM.add(0);
        }
        if(this.SM.size() >= 3) {
            this.SM.remove(0);
            this.Au.remove(0);
        }
        this.DWo.setAlpha(0xFF);
        this.DWo.setColor(this.Zh);
        canvas0.drawCircle(this.xf, this.xs, this.ReZ, this.qj);
        if(this.XX) {
            this.invalidate();
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = View.MeasureSpec.getSize(v);
        int v3 = View.MeasureSpec.getSize(v1);
        this.setMeasuredDimension(Math.min(v2, v3), Math.min(v2, v3));
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.xf = ((float)v) / 2.0f;
        this.xs = ((float)v1) / 2.0f;
        float f = ((float)v) / 2.0f - ((float)this.fDm) / 2.0f;
        this.JQp = f;
        this.ReZ = f / 4.0f;
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if(z) {
            this.invalidate();
        }
    }

    public void setColor(int v) {
        this.PjT = v;
    }

    public void setCoreColor(int v) {
        this.Zh = v;
    }

    public void setCoreRadius(int v) {
        this.ReZ = (float)v;
    }

    public void setDiffuseSpeed(int v) {
        this.cz = v;
    }

    public void setDiffuseWidth(int v) {
        this.cr = v;
    }

    public void setMaxWidth(int v) {
        this.JQp = (float)v;
    }
}

