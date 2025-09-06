package top.defaults.colorpicker;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

public class AlphaSliderView extends ColorSliderView {
    private Bitmap n;
    private Canvas o;

    public AlphaSliderView(Context context0) {
        super(context0);
    }

    public AlphaSliderView(Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public AlphaSliderView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // top.defaults.colorpicker.ColorSliderView
    protected int b() {
        float[] arr_f = new float[3];
        Color.colorToHSV(this.a, arr_f);
        return Color.HSVToColor(((int)(this.h * 255.0f)), arr_f);
    }

    @Override  // top.defaults.colorpicker.ColorSliderView
    protected void e(Paint paint0) {
        float[] arr_f = new float[3];
        Color.colorToHSV(this.a, arr_f);
        int v = Color.HSVToColor(0, arr_f);
        int v1 = Color.HSVToColor(0xFF, arr_f);
        paint0.setShader(new LinearGradient(0.0f, 0.0f, ((float)this.getWidth()), ((float)this.getHeight()), v, v1, Shader.TileMode.CLAMP));
    }

    @Override  // top.defaults.colorpicker.ColorSliderView
    protected float f(int v) {
        return ((float)Color.alpha(v)) / 255.0f;
    }

    @Override  // top.defaults.colorpicker.ColorSliderView
    protected void onDraw(Canvas canvas0) {
        a a0 = a.b();
        a0.setBounds(0, 0, this.o.getWidth(), this.o.getHeight());
        a0.draw(this.o);
        canvas0.drawBitmap(this.n, this.g, this.g, null);
        super.onDraw(canvas0);
    }

    @Override  // top.defaults.colorpicker.ColorSliderView
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.n = Bitmap.createBitmap(((int)(((float)v) - 2.0f * this.g)), ((int)(((float)v1) - this.g)), Bitmap.Config.ARGB_8888);
        this.o = new Canvas(this.n);
    }
}

