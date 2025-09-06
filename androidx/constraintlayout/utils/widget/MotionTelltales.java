package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R.styleable;

public class MotionTelltales extends MockView {
    private Paint l;
    MotionLayout m;
    float[] n;
    Matrix o;
    int p;
    int q;
    float r;
    private static final String s = "MotionTelltales";

    public MotionTelltales(Context context0) {
        super(context0);
        this.l = new Paint();
        this.n = new float[2];
        this.o = new Matrix();
        this.p = 0;
        this.q = 0xFFFF00FF;
        this.r = 0.25f;
        this.a(context0, null);
    }

    public MotionTelltales(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.l = new Paint();
        this.n = new float[2];
        this.o = new Matrix();
        this.p = 0;
        this.q = 0xFFFF00FF;
        this.r = 0.25f;
        this.a(context0, attributeSet0);
    }

    public MotionTelltales(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.l = new Paint();
        this.n = new float[2];
        this.o = new Matrix();
        this.p = 0;
        this.q = 0xFFFF00FF;
        this.r = 0.25f;
        this.a(context0, attributeSet0);
    }

    private void a(Context context0, AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.MotionTelltales);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.MotionTelltales_telltales_tailColor) {
                    this.q = typedArray0.getColor(v2, this.q);
                }
                else if(v2 == styleable.MotionTelltales_telltales_velocityMode) {
                    this.p = typedArray0.getInt(v2, this.p);
                }
                else if(v2 == styleable.MotionTelltales_telltales_tailScale) {
                    this.r = typedArray0.getFloat(v2, this.r);
                }
            }
            typedArray0.recycle();
        }
        this.l.setColor(this.q);
        this.l.setStrokeWidth(5.0f);
    }

    @Override  // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override  // androidx.constraintlayout.utils.widget.MockView
    public void onDraw(@NonNull Canvas canvas0) {
        super.onDraw(canvas0);
        this.getMatrix().invert(this.o);
        if(this.m == null) {
            ViewParent viewParent0 = this.getParent();
            if(viewParent0 instanceof MotionLayout) {
                this.m = (MotionLayout)viewParent0;
            }
            return;
        }
        int v = this.getWidth();
        int v1 = this.getHeight();
        float[] arr_f = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for(int v2 = 0; v2 < 5; ++v2) {
            float f = arr_f[v2];
            for(int v3 = 0; v3 < 5; ++v3) {
                float f1 = arr_f[v3];
                this.m.z0(this, f1, f, this.n, this.p);
                this.o.mapVectors(this.n);
                float f2 = ((float)v) * f1;
                float f3 = ((float)v1) * f;
                float[] arr_f1 = this.n;
                float f4 = this.r;
                float f5 = f2 - arr_f1[0] * f4;
                float f6 = f3 - arr_f1[1] * f4;
                this.o.mapVectors(arr_f1);
                canvas0.drawLine(f2, f3, f5, f6, this.l);
            }
        }
    }

    @Override  // android.view.View
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.postInvalidate();
    }

    public void setText(CharSequence charSequence0) {
        this.f = charSequence0.toString();
        this.requestLayout();
    }
}

