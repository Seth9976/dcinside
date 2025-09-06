package com.bytedance.adsdk.Zh.ReZ.ReZ;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View.MeasureSpec;
import android.view.View;
import com.bytedance.adsdk.Zh.SM;
import com.bytedance.adsdk.Zh.cz.cz;

public class DWo extends cr {
    private Path Au;
    private int DWo;
    private int SM;

    public DWo(SM sM0, JQp jQp0, Context context0) {
        super(sM0, jQp0);
        this.Au = null;
        this.SM = -1;
        this.DWo = -1;
        if(this.XX != null) {
            float f = cz.PjT();
            this.SM = (int)(((float)this.XX.PjT()) * f);
            this.DWo = (int)(((float)this.XX.Zh()) * f);
            RectF rectF0 = new RectF();
            rectF0.set(0.0f, 0.0f, ((float)this.SM), ((float)this.DWo));
            Path path0 = new Path();
            this.Au = path0;
            path0.addRoundRect(rectF0, f * 40.0f, f * 40.0f, Path.Direction.CW);
        }
    }

    private static void PjT(View view0, int v, int v1) {
        view0.layout(0, 0, v, v1);
        view0.measure(View.MeasureSpec.makeMeasureSpec(v, 0x40000000), View.MeasureSpec.makeMeasureSpec(v1, 0x40000000));
        view0.layout(0, 0, view0.getMeasuredWidth(), view0.getMeasuredHeight());
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.cr
    public void Zh(Canvas canvas0, Matrix matrix0, int v) {
        View view0 = this.Zh.PjT();
        if(this.SM > 0 && view0 != null) {
            canvas0.save();
            canvas0.concat(matrix0);
            this.PjT(v);
            DWo.PjT(view0, this.SM, this.DWo);
            view0.setAlpha(this.cz());
            canvas0.clipPath(this.Au);
            view0.draw(canvas0);
            canvas0.restore();
        }
    }
}

