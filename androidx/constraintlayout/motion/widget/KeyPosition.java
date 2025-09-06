package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;

public class KeyPosition extends KeyPositionBase {
    static class Loader {
        private static final int a = 1;
        private static final int b = 2;
        private static final int c = 3;
        private static final int d = 4;
        private static final int e = 5;
        private static final int f = 6;
        private static final int g = 7;
        private static final int h = 8;
        private static final int i = 9;
        private static final int j = 10;
        private static final int k = 11;
        private static final int l = 12;
        private static SparseIntArray m;

        static {
            SparseIntArray sparseIntArray0 = new SparseIntArray();
            Loader.m = sparseIntArray0;
            sparseIntArray0.append(styleable.KeyPosition_motionTarget, 1);
            Loader.m.append(styleable.KeyPosition_framePosition, 2);
            Loader.m.append(styleable.KeyPosition_transitionEasing, 3);
            Loader.m.append(styleable.KeyPosition_curveFit, 4);
            Loader.m.append(styleable.KeyPosition_drawPath, 5);
            Loader.m.append(styleable.KeyPosition_percentX, 6);
            Loader.m.append(styleable.KeyPosition_percentY, 7);
            Loader.m.append(styleable.KeyPosition_keyPositionType, 9);
            Loader.m.append(styleable.KeyPosition_sizePercent, 8);
            Loader.m.append(styleable.KeyPosition_percentWidth, 11);
            Loader.m.append(styleable.KeyPosition_percentHeight, 12);
            Loader.m.append(styleable.KeyPosition_pathMotionArc, 10);
        }

        private static void b(KeyPosition keyPosition0, TypedArray typedArray0) {
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(Loader.m.get(v2)) {
                    case 1: {
                        if(MotionLayout.G9) {
                            int v3 = typedArray0.getResourceId(v2, keyPosition0.b);
                            keyPosition0.b = v3;
                            if(v3 == -1) {
                                keyPosition0.c = typedArray0.getString(v2);
                            }
                        }
                        else if(typedArray0.peekValue(v2).type == 3) {
                            keyPosition0.c = typedArray0.getString(v2);
                        }
                        else {
                            keyPosition0.b = typedArray0.getResourceId(v2, keyPosition0.b);
                        }
                        break;
                    }
                    case 2: {
                        keyPosition0.a = typedArray0.getInt(v2, keyPosition0.a);
                        break;
                    }
                    case 3: {
                        if(typedArray0.peekValue(v2).type == 3) {
                            keyPosition0.F = typedArray0.getString(v2);
                        }
                        else {
                            String[] arr_s = Easing.o;
                            keyPosition0.F = arr_s[typedArray0.getInteger(v2, 0)];
                        }
                        break;
                    }
                    case 4: {
                        keyPosition0.D = typedArray0.getInteger(v2, keyPosition0.D);
                        break;
                    }
                    case 5: {
                        keyPosition0.H = typedArray0.getInt(v2, keyPosition0.H);
                        break;
                    }
                    case 6: {
                        keyPosition0.K = typedArray0.getFloat(v2, keyPosition0.K);
                        break;
                    }
                    case 7: {
                        keyPosition0.L = typedArray0.getFloat(v2, keyPosition0.L);
                        break;
                    }
                    case 8: {
                        float f = typedArray0.getFloat(v2, keyPosition0.J);
                        keyPosition0.I = f;
                        keyPosition0.J = f;
                        break;
                    }
                    case 9: {
                        keyPosition0.O = typedArray0.getInt(v2, keyPosition0.O);
                        break;
                    }
                    case 10: {
                        keyPosition0.G = typedArray0.getInt(v2, keyPosition0.G);
                        break;
                    }
                    case 11: {
                        keyPosition0.I = typedArray0.getFloat(v2, keyPosition0.I);
                        break;
                    }
                    case 12: {
                        keyPosition0.J = typedArray0.getFloat(v2, keyPosition0.J);
                        break;
                    }
                    default: {
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(v2) + "   " + Loader.m.get(v2));
                    }
                }
            }
            if(keyPosition0.a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    String F;
    int G;
    int H;
    float I;
    float J;
    float K;
    float L;
    float M;
    float N;
    int O;
    private float P;
    private float Q;
    private static final String R = "KeyPosition";
    static final String S = "KeyPosition";
    public static final int T = 3;
    public static final int U = 2;
    public static final int V = 1;
    public static final int W = 0;
    public static final String X = "transitionEasing";
    public static final String Y = "drawPath";
    public static final String Z = "percentWidth";
    public static final String a0 = "percentHeight";
    public static final String b0 = "sizePercent";
    public static final String c0 = "percentX";
    public static final String d0 = "percentY";
    static final int e0 = 2;

    public KeyPosition() {
        this.F = null;
        this.G = Key.f;
        this.H = 0;
        this.I = NaNf;
        this.J = NaNf;
        this.K = NaNf;
        this.L = NaNf;
        this.M = NaNf;
        this.N = NaNf;
        this.O = 0;
        this.P = NaNf;
        this.Q = NaNf;
        this.d = 2;
    }

    public void A(int v) {
        this.O = v;
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void a(HashMap hashMap0) {
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key b() {
        return new KeyPosition().c(this);
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key c(Key key0) {
        super.c(key0);
        this.F = ((KeyPosition)key0).F;
        this.G = ((KeyPosition)key0).G;
        this.H = ((KeyPosition)key0).H;
        this.I = ((KeyPosition)key0).I;
        this.J = NaNf;
        this.K = ((KeyPosition)key0).K;
        this.L = ((KeyPosition)key0).L;
        this.M = ((KeyPosition)key0).M;
        this.N = ((KeyPosition)key0).N;
        this.P = ((KeyPosition)key0).P;
        this.Q = ((KeyPosition)key0).Q;
        return this;
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Object clone() throws CloneNotSupportedException {
        return this.b();
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void f(Context context0, AttributeSet attributeSet0) {
        Loader.b(this, context0.obtainStyledAttributes(attributeSet0, styleable.KeyPosition));
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void j(String s, Object object0) {
        s.hashCode();
        switch(s) {
            case "drawPath": {
                this.H = this.n(object0);
                return;
            }
            case "percentHeight": {
                this.J = this.m(object0);
                return;
            }
            case "percentWidth": {
                this.I = this.m(object0);
                return;
            }
            case "percentX": {
                this.K = this.m(object0);
                return;
            }
            case "percentY": {
                this.L = this.m(object0);
                return;
            }
            case "sizePercent": {
                float f = this.m(object0);
                this.I = f;
                this.J = f;
                return;
            }
            case "transitionEasing": {
                this.F = object0.toString();
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.KeyPositionBase
    void o(int v, int v1, float f, float f1, float f2, float f3) {
        switch(this.O) {
            case 1: {
                this.u(f, f1, f2, f3);
                return;
            }
            case 2: {
                this.v(v, v1);
                return;
            }
            default: {
                this.t(f, f1, f2, f3);
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.KeyPositionBase
    float p() {
        return this.P;
    }

    @Override  // androidx.constraintlayout.motion.widget.KeyPositionBase
    float q() {
        return this.Q;
    }

    @Override  // androidx.constraintlayout.motion.widget.KeyPositionBase
    public boolean r(int v, int v1, RectF rectF0, RectF rectF1, float f, float f1) {
        this.o(v, v1, rectF0.centerX(), rectF0.centerY(), rectF1.centerX(), rectF1.centerY());
        return Math.abs(f - this.P) < 20.0f && Math.abs(f1 - this.Q) < 20.0f;
    }

    @Override  // androidx.constraintlayout.motion.widget.KeyPositionBase
    public void s(View view0, RectF rectF0, RectF rectF1, float f, float f1, String[] arr_s, float[] arr_f) {
        switch(this.O) {
            case 1: {
                this.y(rectF0, rectF1, f, f1, arr_s, arr_f);
                return;
            }
            case 2: {
                this.z(view0, rectF0, rectF1, f, f1, arr_s, arr_f);
                return;
            }
            case 3: {
                this.w(rectF0, rectF1, f, f1, arr_s, arr_f);
                return;
            }
            default: {
                this.x(rectF0, rectF1, f, f1, arr_s, arr_f);
            }
        }
    }

    private void t(float f, float f1, float f2, float f3) {
        float f4 = f2 - f;
        float f5 = f3 - f1;
        float f6 = 0.0f;
        float f7 = Float.isNaN(this.K) ? 0.0f : this.K;
        float f8 = Float.isNaN(this.N) ? 0.0f : this.N;
        float f9 = Float.isNaN(this.L) ? 0.0f : this.L;
        if(!Float.isNaN(this.M)) {
            f6 = this.M;
        }
        this.P = (float)(((int)(f + f7 * f4 + f6 * f5)));
        this.Q = (float)(((int)(f1 + f4 * f8 + f5 * f9)));
    }

    private void u(float f, float f1, float f2, float f3) {
        float f4 = f2 - f;
        float f5 = f3 - f1;
        this.P = f + f4 * this.K + -f5 * this.L;
        this.Q = f1 + f5 * this.K + f4 * this.L;
    }

    private void v(int v, int v1) {
        this.P = ((float)v) * this.K + 0.0f;
        this.Q = ((float)v1) * this.K + 0.0f;
    }

    void w(RectF rectF0, RectF rectF1, float f, float f1, String[] arr_s, float[] arr_f) {
        float f2 = rectF0.centerX();
        float f3 = rectF0.centerY();
        float f4 = rectF1.centerX();
        float f5 = rectF1.centerY();
        if(f2 > f4) {
            float f6 = f4;
            f4 = f2;
            f2 = f6;
        }
        if(f3 <= f5) {
            float f7 = f5;
            f5 = f3;
            f3 = f7;
        }
        float f8 = f4 - f2;
        float f9 = f3 - f5;
        String s = arr_s[0];
        if(s != null) {
            if("percentX".equals(s)) {
                arr_f[0] = (f - f2) / f8;
                arr_f[1] = (f1 - f5) / f9;
                return;
            }
            arr_f[1] = (f - f2) / f8;
            arr_f[0] = (f1 - f5) / f9;
            return;
        }
        arr_s[0] = "percentX";
        arr_f[0] = (f - f2) / f8;
        arr_s[1] = "percentY";
        arr_f[1] = (f1 - f5) / f9;
    }

    void x(RectF rectF0, RectF rectF1, float f, float f1, String[] arr_s, float[] arr_f) {
        float f2 = rectF0.centerX();
        float f3 = rectF0.centerY();
        float f4 = rectF1.centerX() - f2;
        float f5 = rectF1.centerY() - f3;
        String s = arr_s[0];
        if(s != null) {
            if("percentX".equals(s)) {
                arr_f[0] = (f - f2) / f4;
                arr_f[1] = (f1 - f3) / f5;
                return;
            }
            arr_f[1] = (f - f2) / f4;
            arr_f[0] = (f1 - f3) / f5;
            return;
        }
        arr_s[0] = "percentX";
        arr_f[0] = (f - f2) / f4;
        arr_s[1] = "percentY";
        arr_f[1] = (f1 - f3) / f5;
    }

    void y(RectF rectF0, RectF rectF1, float f, float f1, String[] arr_s, float[] arr_f) {
        float f2 = rectF0.centerX();
        float f3 = rectF0.centerY();
        float f4 = rectF1.centerX() - f2;
        float f5 = rectF1.centerY() - f3;
        float f6 = (float)Math.hypot(f4, f5);
        if(((double)f6) < 0.0001) {
            System.out.println("distance ~ 0");
            arr_f[0] = 0.0f;
            arr_f[1] = 0.0f;
            return;
        }
        float f7 = f4 / f6;
        float f8 = f5 / f6;
        float f9 = f1 - f3;
        float f10 = f - f2;
        float f11 = (f7 * f9 - f10 * f8) / f6;
        float f12 = (f7 * f10 + f8 * f9) / f6;
        String s = arr_s[0];
        if(s == null) {
            arr_s[0] = "percentX";
            arr_s[1] = "percentY";
            arr_f[0] = f12;
            arr_f[1] = f11;
        }
        else if("percentX".equals(s)) {
            arr_f[0] = f12;
            arr_f[1] = f11;
        }
    }

    void z(View view0, RectF rectF0, RectF rectF1, float f, float f1, String[] arr_s, float[] arr_f) {
        rectF0.centerX();
        rectF0.centerY();
        rectF1.centerX();
        rectF1.centerY();
        ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
        int v = viewGroup0.getWidth();
        int v1 = viewGroup0.getHeight();
        String s = arr_s[0];
        if(s != null) {
            if("percentX".equals(s)) {
                arr_f[0] = f / ((float)v);
                arr_f[1] = f1 / ((float)v1);
                return;
            }
            arr_f[1] = f / ((float)v);
            arr_f[0] = f1 / ((float)v1);
            return;
        }
        arr_s[0] = "percentX";
        arr_f[0] = f / ((float)v);
        arr_s[1] = "percentY";
        arr_f[1] = f1 / ((float)v1);
    }
}

