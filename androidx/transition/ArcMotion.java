package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion extends PathMotion {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private static final float g = 0.0f;
    private static final float h = 70.0f;
    private static final float i;

    static {
        ArcMotion.i = 0.700208f;
    }

    public ArcMotion() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 70.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = ArcMotion.i;
    }

    public ArcMotion(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 70.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = ArcMotion.i;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, Styleable.j);
        this.g(TypedArrayUtils.j(typedArray0, ((XmlPullParser)attributeSet0), "minimumVerticalAngle", 1, 0.0f));
        this.f(TypedArrayUtils.j(typedArray0, ((XmlPullParser)attributeSet0), "minimumHorizontalAngle", 0, 0.0f));
        this.e(TypedArrayUtils.j(typedArray0, ((XmlPullParser)attributeSet0), "maximumAngle", 2, 70.0f));
        typedArray0.recycle();
    }

    @Override  // androidx.transition.PathMotion
    @NonNull
    public Path a(float f, float f1, float f2, float f3) {
        float f12;
        float f11;
        float f10;
        Path path0 = new Path();
        path0.moveTo(f, f1);
        float f4 = f2 - f;
        float f5 = f3 - f1;
        float f6 = f4 * f4 + f5 * f5;
        float f7 = (f + f2) / 2.0f;
        float f8 = (f1 + f3) / 2.0f;
        boolean z = f1 > f3;
        if(Math.abs(f4) < Math.abs(f5)) {
            float f9 = Math.abs(f6 / (f5 * 2.0f));
            if(z) {
                f10 = f9 + f3;
                f11 = f2;
            }
            else {
                f10 = f9 + f1;
                f11 = f;
            }
            f12 = this.e;
        }
        else {
            float f13 = f6 / (f4 * 2.0f);
            if(z) {
                f10 = f1;
                f11 = f13 + f;
            }
            else {
                f11 = f2 - f13;
                f10 = f3;
            }
            f12 = this.d;
        }
        float f14 = 0.25f * f6 * f12 * f12;
        float f15 = (f7 - f11) * (f7 - f11) + (f8 - f10) * (f8 - f10);
        float f16 = 0.25f * f6 * this.f * this.f;
        if(f15 >= f14) {
            f14 = f15 > f16 ? f16 : 0.0f;
        }
        if(f14 != 0.0f) {
            float f17 = (float)Math.sqrt(f14 / f15);
            f11 = (f11 - f7) * f17 + f7;
            f10 = f8 + f17 * (f10 - f8);
        }
        path0.cubicTo((f + f11) / 2.0f, (f1 + f10) / 2.0f, (f11 + f2) / 2.0f, (f10 + f3) / 2.0f, f2, f3);
        return path0;
    }

    public float b() {
        return this.c;
    }

    public float c() {
        return this.a;
    }

    public float d() {
        return this.b;
    }

    public void e(float f) {
        this.c = f;
        this.f = ArcMotion.h(f);
    }

    public void f(float f) {
        this.a = f;
        this.d = ArcMotion.h(f);
    }

    public void g(float f) {
        this.b = f;
        this.e = ArcMotion.h(f);
    }

    private static float h(float f) {
        if(f < 0.0f || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float)Math.tan(Math.toRadians(f / 2.0f));
    }
}

