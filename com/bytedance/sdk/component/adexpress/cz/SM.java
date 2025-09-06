package com.bytedance.sdk.component.adexpress.cz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class SM extends View {
    private int Au;
    private Paint JQp;
    private int PjT;
    private final RectF ReZ;
    private Paint XX;
    private int Zh;
    private Paint cr;
    private int cz;

    public SM(Context context0) {
        super(context0);
        this.ReZ = new RectF();
        this.PjT();
    }

    private void PjT() {
        Paint paint0 = new Paint();
        this.cr = paint0;
        paint0.setAntiAlias(true);
        Paint paint1 = new Paint();
        this.XX = paint1;
        paint1.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.JQp = paint2;
        paint2.setAntiAlias(true);
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        canvas0.drawRoundRect(this.ReZ, ((float)this.cz), ((float)this.cz), this.JQp);
        canvas0.drawRoundRect(this.ReZ, ((float)this.cz), ((float)this.cz), this.cr);
        canvas0.drawLine(((float)this.PjT) * 0.3f, ((float)this.Zh) * 0.3f, ((float)this.PjT) * 0.7f, ((float)this.Zh) * 0.7f, this.XX);
        canvas0.drawLine(((float)this.PjT) * 0.7f, ((float)this.Zh) * 0.3f, ((float)this.PjT) * 0.3f, ((float)this.Zh) * 0.7f, this.XX);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.PjT = v;
        this.Zh = v1;
        this.ReZ.set(((float)this.Au), ((float)this.Au), ((float)(v - this.Au)), ((float)(v1 - this.Au)));
    }

    public void setBgColor(int v) {
        this.JQp.setStyle(Paint.Style.FILL);
        this.JQp.setColor(v);
    }

    public void setDislikeColor(int v) {
        this.XX.setColor(v);
    }

    public void setDislikeWidth(int v) {
        this.XX.setStrokeWidth(((float)v));
    }

    public void setRadius(int v) {
        this.cz = v;
    }

    public void setStrokeColor(int v) {
        this.cr.setStyle(Paint.Style.STROKE);
        this.cr.setColor(v);
    }

    public void setStrokeWidth(int v) {
        this.cr.setStrokeWidth(((float)v));
        this.Au = v;
    }
}

