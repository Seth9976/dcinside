package top.defaults.colorpicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

public class ColorWheelSelector extends View {
    private Paint a;
    private float b;
    private PointF c;

    public ColorWheelSelector(Context context0) {
        this(context0, null);
    }

    public ColorWheelSelector(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ColorWheelSelector(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.b = 27.0f;
        this.c = new PointF();
        Paint paint0 = new Paint(1);
        this.a = paint0;
        paint0.setColor(0xFF000000);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeWidth(2.0f);
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        canvas0.drawLine(this.c.x - this.b, this.c.y, this.c.x + this.b, this.c.y, this.a);
        canvas0.drawLine(this.c.x, this.c.y - this.b, this.c.x, this.c.y + this.b, this.a);
        canvas0.drawCircle(this.c.x, this.c.y, this.b * 0.66f, this.a);
    }

    public void setCurrentPoint(PointF pointF0) {
        this.c = pointF0;
        this.invalidate();
    }

    public void setSelectorRadiusPx(float f) {
        this.b = f;
    }
}

