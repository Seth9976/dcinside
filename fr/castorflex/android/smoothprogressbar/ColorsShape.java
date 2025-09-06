package fr.castorflex.android.smoothprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.shapes.Shape;

public class ColorsShape extends Shape {
    private int[] mColors;
    private float mStrokeWidth;

    public ColorsShape(float f, int[] arr_v) {
        this.mStrokeWidth = f;
        this.mColors = arr_v;
    }

    @Override  // android.graphics.drawable.shapes.Shape
    public void draw(Canvas canvas0, Paint paint0) {
        float f = 1.0f / ((float)this.mColors.length);
        paint0.setStrokeWidth(this.mStrokeWidth);
        int[] arr_v = this.mColors;
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            paint0.setColor(arr_v[v]);
            float f1 = ((float)v1) * f * this.getWidth();
            ++v1;
            canvas0.drawLine(f1, this.getHeight() / 2.0f, ((float)v1) * f * this.getWidth(), this.getHeight() / 2.0f, paint0);
        }
    }

    public int[] getColors() {
        return this.mColors;
    }

    public float getStrokeWidth() {
        return this.mStrokeWidth;
    }

    public void setColors(int[] arr_v) {
        this.mColors = arr_v;
    }

    public void setStrokeWidth(float f) {
        this.mStrokeWidth = f;
    }
}

