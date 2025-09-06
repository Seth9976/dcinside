package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View.MeasureSpec;
import android.view.View;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class qla extends View {
    private Drawable JQp;
    private final Path PjT;
    private int ReZ;
    private final boolean Zh;
    private Drawable cr;
    private float cz;

    public qla(Context context0) {
        this(context0, false);
    }

    public qla(Context context0, boolean z) {
        super(context0);
        this.PjT = new Path();
        this.Zh = z;
        this.PjT();
    }

    private void PjT() {
        Context context0 = this.getContext();
        this.cr = Lrd.ReZ(context0, (this.Zh ? "tt_star_thick_dark" : "tt_star_thick"));
        this.JQp = Lrd.ReZ(context0, "tt_star");
    }

    public void PjT(double f, int v) {
        int v1 = (int)qZS.PjT(this.getContext(), ((float)v), false);
        this.ReZ = v1;
        this.cr.setBounds(0, 0, v1, v1);
        this.JQp.setBounds(0, 0, this.ReZ, this.ReZ);
        this.cz = ((float)f) / 5.0f;
        this.Zh();
        this.requestLayout();
    }

    private void Zh() {
        int v = this.getWidth();
        int v1 = this.getHeight();
        if(this.cz > 0.0f && v > 0 && v1 > 0) {
            this.PjT.reset();
            RectF rectF0 = new RectF(0.0f, 0.0f, ((float)v) * this.cz, ((float)v1));
            this.PjT.addRect(rectF0, Path.Direction.CCW);
        }
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        if(this.ReZ <= 0) {
            return;
        }
        int v = canvas0.save();
        for(int v2 = 0; v2 < 5; ++v2) {
            this.cr.draw(canvas0);
            canvas0.translate(((float)this.ReZ), 0.0f);
        }
        canvas0.restoreToCount(v);
        canvas0.clipPath(this.PjT);
        for(int v1 = 0; v1 < 5; ++v1) {
            this.JQp.draw(canvas0);
            canvas0.translate(((float)this.ReZ), 0.0f);
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.ReZ * 5, 0x40000000), View.MeasureSpec.makeMeasureSpec(this.ReZ, 0x40000000));
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.Zh();
    }
}

