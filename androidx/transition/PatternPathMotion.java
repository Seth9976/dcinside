package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion extends PathMotion {
    private Path a;
    @NonNull
    private final Path b;
    private final Matrix c;

    public PatternPathMotion() {
        Path path0 = new Path();
        this.b = path0;
        this.c = new Matrix();
        path0.lineTo(1.0f, 0.0f);
        this.a = path0;
    }

    public PatternPathMotion(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        this.b = new Path();
        this.c = new Matrix();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, Styleable.k);
        try {
            String s = TypedArrayUtils.m(typedArray0, ((XmlPullParser)attributeSet0), "patternPathData", 0);
            if(s != null) {
                this.d(PathParser.e(s));
                return;
            }
        }
        finally {
            typedArray0.recycle();
        }
        throw new RuntimeException("pathData must be supplied for patternPathMotion");
    }

    public PatternPathMotion(@NonNull Path path0) {
        this.b = new Path();
        this.c = new Matrix();
        this.d(path0);
    }

    @Override  // androidx.transition.PathMotion
    @NonNull
    public Path a(float f, float f1, float f2, float f3) {
        float f4 = f2 - f;
        float f5 = f3 - f1;
        float f6 = PatternPathMotion.b(f4, f5);
        this.c.setScale(f6, f6);
        this.c.postRotate(((float)Math.toDegrees(Math.atan2(f5, f4))));
        this.c.postTranslate(f, f1);
        Path path0 = new Path();
        this.b.transform(this.c, path0);
        return path0;
    }

    private static float b(float f, float f1) {
        return (float)Math.sqrt(f * f + f1 * f1);
    }

    @NonNull
    public Path c() {
        return this.a;
    }

    public void d(@NonNull Path path0) {
        PathMeasure pathMeasure0 = new PathMeasure(path0, false);
        float f = pathMeasure0.getLength();
        float[] arr_f = new float[2];
        pathMeasure0.getPosTan(f, arr_f, null);
        float f1 = arr_f[0];
        float f2 = arr_f[1];
        pathMeasure0.getPosTan(0.0f, arr_f, null);
        float f3 = arr_f[0];
        float f4 = arr_f[1];
        if(f3 == f1 && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.c.setTranslate(-f3, -f4);
        float f5 = f1 - f3;
        float f6 = f2 - f4;
        float f7 = PatternPathMotion.b(f5, f6);
        this.c.postScale(1.0f / f7, 1.0f / f7);
        this.c.postRotate(((float)Math.toDegrees(-Math.atan2(f6, f5))));
        path0.transform(this.c, this.b);
        this.a = path0;
    }
}

