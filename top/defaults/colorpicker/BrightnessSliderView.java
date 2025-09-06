package top.defaults.colorpicker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

public class BrightnessSliderView extends ColorSliderView {
    public BrightnessSliderView(Context context0) {
        super(context0);
    }

    public BrightnessSliderView(Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public BrightnessSliderView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // top.defaults.colorpicker.ColorSliderView
    protected int b() {
        float[] arr_f = new float[3];
        Color.colorToHSV(this.a, arr_f);
        arr_f[2] = this.h;
        return Color.HSVToColor(arr_f);
    }

    @Override  // top.defaults.colorpicker.ColorSliderView
    protected void e(Paint paint0) {
        float[] arr_f = new float[3];
        Color.colorToHSV(this.a, arr_f);
        arr_f[2] = 0.0f;
        int v = Color.HSVToColor(arr_f);
        arr_f[2] = 1.0f;
        int v1 = Color.HSVToColor(arr_f);
        paint0.setShader(new LinearGradient(0.0f, 0.0f, ((float)this.getWidth()), ((float)this.getHeight()), v, v1, Shader.TileMode.CLAMP));
    }

    @Override  // top.defaults.colorpicker.ColorSliderView
    protected float f(int v) {
        float[] arr_f = new float[3];
        Color.colorToHSV(v, arr_f);
        return arr_f[2];
    }
}

