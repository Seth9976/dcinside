package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({Scope.c})
public class PathInterpolatorCompat implements Interpolator {
    private float[] a;
    private float[] b;
    private static final float c = 0.002f;
    public static final int d = 3000;
    public static final double e = 0.00001;

    public PathInterpolatorCompat(Context context0, AttributeSet attributeSet0, XmlPullParser xmlPullParser0) {
        this(context0.getResources(), context0.getTheme(), attributeSet0, xmlPullParser0);
    }

    public PathInterpolatorCompat(Resources resources0, Resources.Theme resources$Theme0, AttributeSet attributeSet0, XmlPullParser xmlPullParser0) {
        TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, AndroidResources.r0);
        this.d(typedArray0, xmlPullParser0);
        typedArray0.recycle();
    }

    private void a(float f, float f1, float f2, float f3) {
        Path path0 = new Path();
        path0.moveTo(0.0f, 0.0f);
        path0.cubicTo(f, f1, f2, f3, 1.0f, 1.0f);
        this.b(path0);
    }

    private void b(Path path0) {
        int v = 0;
        PathMeasure pathMeasure0 = new PathMeasure(path0, false);
        float f = pathMeasure0.getLength();
        int v1 = Math.min(3000, ((int)(f / 0.002f)) + 1);
        if(v1 <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + f);
        }
        this.a = new float[v1];
        this.b = new float[v1];
        float[] arr_f = new float[2];
        for(int v2 = 0; v2 < v1; ++v2) {
            pathMeasure0.getPosTan(((float)v2) * f / ((float)(v1 - 1)), arr_f, null);
            this.a[v2] = arr_f[0];
            this.b[v2] = arr_f[1];
        }
        if(((double)Math.abs(this.a[0])) > 0.00001 || ((double)Math.abs(this.b[0])) > 0.00001 || ((double)Math.abs(this.a[v1 - 1] - 1.0f)) > 0.00001 || ((double)Math.abs(this.b[v1 - 1] - 1.0f)) > 0.00001) {
            throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1) start: " + this.a[0] + "," + this.b[0] + " end:" + this.a[v1 - 1] + "," + this.b[v1 - 1]);
        }
        float f1 = 0.0f;
        for(int v3 = 0; v < v1; ++v3) {
            float[] arr_f1 = this.a;
            float f2 = arr_f1[v3];
            if(f2 < f1) {
                throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
            }
            arr_f1[v] = f2;
            ++v;
            f1 = f2;
        }
        if(pathMeasure0.nextContour()) {
            throw new IllegalArgumentException("The Path should be continuous, can\'t have 2+ contours");
        }
    }

    private void c(float f, float f1) {
        Path path0 = new Path();
        path0.moveTo(0.0f, 0.0f);
        path0.quadTo(f, f1, 1.0f, 1.0f);
        this.b(path0);
    }

    private void d(TypedArray typedArray0, XmlPullParser xmlPullParser0) {
        if(TypedArrayUtils.r(xmlPullParser0, "pathData")) {
            String s = TypedArrayUtils.m(typedArray0, xmlPullParser0, "pathData", 4);
            Path path0 = PathParser.e(s);
            if(path0 == null) {
                throw new InflateException("The path is null, which is created from " + s);
            }
            this.b(path0);
            return;
        }
        if(!TypedArrayUtils.r(xmlPullParser0, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if(!TypedArrayUtils.r(xmlPullParser0, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float f = TypedArrayUtils.j(typedArray0, xmlPullParser0, "controlX1", 0, 0.0f);
        float f1 = TypedArrayUtils.j(typedArray0, xmlPullParser0, "controlY1", 1, 0.0f);
        boolean z = TypedArrayUtils.r(xmlPullParser0, "controlX2");
        if(z != TypedArrayUtils.r(xmlPullParser0, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if(!z) {
            this.c(f, f1);
            return;
        }
        this.a(f, f1, TypedArrayUtils.j(typedArray0, xmlPullParser0, "controlX2", 2, 0.0f), TypedArrayUtils.j(typedArray0, xmlPullParser0, "controlY2", 3, 0.0f));
    }

    @Override  // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if(f <= 0.0f) {
            return 0.0f;
        }
        if(f >= 1.0f) {
            return 1.0f;
        }
        int v = this.a.length - 1;
        int v1 = 0;
        while(v - v1 > 1) {
            int v2 = (v1 + v) / 2;
            if(f < this.a[v2]) {
                v = v2;
            }
            else {
                v1 = v2;
            }
        }
        float[] arr_f = this.a;
        float f1 = arr_f[v];
        float f2 = arr_f[v1];
        float f3 = f1 - f2;
        if(f3 == 0.0f) {
            return this.b[v1];
        }
        float[] arr_f1 = this.b;
        float f4 = arr_f1[v1];
        return f4 + (f - f2) / f3 * (arr_f1[v] - f4);
    }
}

