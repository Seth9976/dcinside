package com.bytedance.adsdk.Zh.ReZ.ReZ;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.Zh.SM;

public class cz extends PjT {
    cz(SM sM0, JQp jQp0) {
        super(sM0, jQp0);
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public void PjT(RectF rectF0, Matrix matrix0, boolean z) {
        super.PjT(rectF0, matrix0, z);
        rectF0.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public void Zh(Canvas canvas0, Matrix matrix0, int v) {
        super.Zh(canvas0, matrix0, v);
    }
}

