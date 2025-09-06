package top.defaults.colorpicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

public class ColorWheelPalette extends View {
    private float a;
    private float b;
    private float c;
    private Paint d;
    private Paint e;

    public ColorWheelPalette(Context context0) {
        this(context0, null);
    }

    public ColorWheelPalette(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ColorWheelPalette(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.d = new Paint(1);
        this.e = new Paint(1);
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        canvas0.drawCircle(this.b, this.c, this.a, this.d);
        canvas0.drawCircle(this.b, this.c, this.a, this.e);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        float f = ((float)Math.min(v - this.getPaddingLeft() - this.getPaddingRight(), v1 - this.getPaddingTop() - this.getPaddingBottom())) * 0.5f;
        this.a = f;
        if(f < 0.0f) {
            return;
        }
        this.b = ((float)v) * 0.5f;
        this.c = ((float)v1) * 0.5f;
        SweepGradient sweepGradient0 = new SweepGradient(this.b, this.c, new int[]{0xFFFF0000, 0xFFFF00FF, 0xFF0000FF, 0xFF00FFFF, 0xFF00FF00, 0xFFFFFF00, 0xFFFF0000}, null);
        this.d.setShader(sweepGradient0);
        RadialGradient radialGradient0 = new RadialGradient(this.b, this.c, this.a, -1, 0xFFFFFF, Shader.TileMode.CLAMP);
        this.e.setShader(radialGradient0);
    }
}

