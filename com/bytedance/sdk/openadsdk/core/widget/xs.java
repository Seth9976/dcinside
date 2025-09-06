package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.sdk.openadsdk.core.JQp.cr;

@SuppressLint({"AppCompatCustomView"})
public class xs extends cr {
    private Paint PjT;
    private RectF Zh;

    public xs(Context context0) {
        super(context0);
        this.PjT();
    }

    private void PjT() {
        Paint paint0 = new Paint();
        this.PjT = paint0;
        paint0.setStyle(Paint.Style.FILL_AND_STROKE);
        this.PjT.setColor(Color.parseColor("#99333333"));
        this.PjT.setAntiAlias(true);
        this.PjT.setStrokeWidth(0.0f);
        this.Zh = new RectF();
    }

    @Override  // android.widget.ImageView
    protected void onDraw(Canvas canvas0) {
        canvas0.drawRoundRect(this.Zh, this.Zh.right / 2.0f, this.Zh.bottom / 2.0f, this.PjT);
        super.onDraw(canvas0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.JQp.cr
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.Zh.right != ((float)this.getMeasuredWidth()) || this.Zh.bottom != ((float)this.getMeasuredHeight())) {
            this.Zh.set(0.0f, 0.0f, ((float)this.getMeasuredWidth()), ((float)this.getMeasuredHeight()));
        }
    }
}

