package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class PjT extends Zh {
    private final Bitmap ReZ;
    private final Rect Zh;
    private final Paint cr;

    public PjT(Bitmap bitmap0, Zh zh0) {
        this.Zh = new Rect();
        this.cr = new Paint(1);
        this.ReZ = bitmap0;
        if(zh0 != null) {
            this.PjT = zh0.PjT;
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Zh
    protected void PjT(Canvas canvas0) {
        Rect rect0 = this.getBounds();
        canvas0.drawBitmap(this.ReZ, this.Zh, rect0, this.cr);
    }

    @Override  // android.graphics.drawable.GradientDrawable
    protected void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        int v = rect0.height();
        int v1 = rect0.width();
        int v2 = this.ReZ.getWidth();
        int v3 = this.ReZ.getHeight();
        this.Zh.set(0, 0, v2, v3);
        if(v3 >= v && v2 >= v1) {
            if(v2 > v1) {
                int v4 = (v2 - v1) / 2;
                this.Zh.left = v4;
                this.Zh.right = v4 + v1;
            }
            if(v3 > v) {
                int v5 = (v3 - v) / 2;
                this.Zh.top = v5;
                this.Zh.bottom = v5 + v;
            }
            return;
        }
        float f = ((float)v) * 1.0f / ((float)v3);
        if(Math.max(f, 1.0f * ((float)v1) / ((float)v2)) > f) {
            int v6 = (int)(((float)v) * 1.0f / ((float)v1) * ((float)v2));
            int v7 = (v3 - v6) / 2;
            this.Zh.top = v7;
            this.Zh.bottom = v7 + v6;
            return;
        }
        int v8 = (int)(1.0f * ((float)v1) / ((float)v) * ((float)v3));
        int v9 = (v2 - v8) / 2;
        this.Zh.left = v9;
        this.Zh.right = v9 + v8;
    }
}

