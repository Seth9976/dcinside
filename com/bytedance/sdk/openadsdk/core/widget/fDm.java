package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.JQp.Au;

public class fDm extends Au {
    private Paint PjT;
    private int ReZ;
    private RectF Zh;

    public fDm(Context context0) {
        this(context0, null);
    }

    public fDm(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public fDm(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.ReZ = 0;
        this.PjT();
    }

    private void PjT() {
        this.setTextColor(-1);
        Paint paint0 = new Paint();
        this.PjT = paint0;
        paint0.setStyle(Paint.Style.FILL_AND_STROKE);
        this.PjT.setColor(Color.parseColor("#99333333"));
        this.PjT.setAntiAlias(true);
        this.PjT.setStrokeWidth(0.0f);
        this.Zh = new RectF();
    }

    @Override  // android.widget.TextView
    protected void onDraw(Canvas canvas0) {
        canvas0.drawRoundRect(this.Zh, this.Zh.bottom / 2.0f, this.Zh.bottom / 2.0f, this.PjT);
        float f = this.getPaint().measureText(this.getText().toString());
        canvas0.translate(this.Zh.right / 2.0f - f / 2.0f, 0.0f);
        super.onDraw(canvas0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.JQp.Au
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = this.getMeasuredWidth();
        int v3 = this.getMeasuredHeight();
        if(v2 > 0 && v3 > 0) {
            int v4 = (int)this.getPaint().measureText("00");
            this.ReZ = v4;
            if(v2 < v4) {
                v2 = v4;
            }
            int v5 = v2 + v3 / 2 * 2;
            this.setMeasuredDimension(v5, v3);
            this.Zh.set(0.0f, 0.0f, ((float)v5), ((float)v3));
            return;
        }
        this.Zh.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}

