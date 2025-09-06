package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.f;
import java.util.HashMap;
import java.util.HashSet;

public class MotionKeyPosition extends MotionKey {
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    private float J;
    private float K;
    static final String L = "KeyPosition";
    protected static final float M = 20.0f;
    public static final int N = 2;
    public static final int O = 1;
    public static final int P = 0;
    static final int Q = 2;
    public int y;
    public String z;

    public MotionKeyPosition() {
        this.y = MotionKey.m;
        this.z = null;
        this.A = MotionKey.m;
        this.B = 0;
        this.C = NaNf;
        this.D = NaNf;
        this.E = NaNf;
        this.F = NaNf;
        this.G = NaNf;
        this.H = NaNf;
        this.I = 0;
        this.J = NaNf;
        this.K = NaNf;
        this.k = 2;
    }

    float A() {
        return this.K;
    }

    public boolean B(int v, int v1, FloatRect floatRect0, FloatRect floatRect1, float f, float f1) {
        this.x(v, v1, floatRect0.a(), floatRect0.b(), floatRect1.a(), floatRect1.b());
        return Math.abs(f - this.J) < 20.0f && Math.abs(f1 - this.K) < 20.0f;
    }

    public void C(MotionWidget motionWidget0, FloatRect floatRect0, FloatRect floatRect1, float f, float f1, String[] arr_s, float[] arr_f) {
        switch(this.I) {
            case 1: {
                this.E(floatRect0, floatRect1, f, f1, arr_s, arr_f);
                return;
            }
            case 2: {
                this.F(motionWidget0, floatRect0, floatRect1, f, f1, arr_s, arr_f);
                return;
            }
            default: {
                this.D(floatRect0, floatRect1, f, f1, arr_s, arr_f);
            }
        }
    }

    void D(FloatRect floatRect0, FloatRect floatRect1, float f, float f1, String[] arr_s, float[] arr_f) {
        float f2 = floatRect0.a();
        float f3 = floatRect0.b();
        float f4 = floatRect1.a() - f2;
        float f5 = floatRect1.b() - f3;
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

    void E(FloatRect floatRect0, FloatRect floatRect1, float f, float f1, String[] arr_s, float[] arr_f) {
        float f2 = floatRect0.a();
        float f3 = floatRect0.b();
        float f4 = floatRect1.a() - f2;
        float f5 = floatRect1.b() - f3;
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

    // 去混淆评级： 低(20)
    void F(MotionWidget motionWidget0, FloatRect floatRect0, FloatRect floatRect1, float f, float f1, String[] arr_s, float[] arr_f) {
        throw new NullPointerException();
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean a(int v, int v1) {
        switch(v) {
            case 100: {
                this.h = v1;
                return true;
            }
            case 508: {
                this.y = v1;
                return true;
            }
            case 510: {
                this.I = v1;
                return true;
            }
            default: {
                return super.a(v, v1);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean b(int v, float f) {
        switch(v) {
            case 503: {
                this.C = f;
                return true;
            }
            case 504: {
                this.D = f;
                return true;
            }
            case 505: {
                this.C = f;
                this.D = f;
                return true;
            }
            case 506: {
                this.E = f;
                return true;
            }
            case 507: {
                this.F = f;
                return true;
            }
            default: {
                return super.b(v, f);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public Object clone() throws CloneNotSupportedException {
        return this.g();
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean d(int v, String s) {
        if(v != 501) {
            return super.d(v, s);
        }
        this.z = s.toString();
        return true;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public int e(String s) {
        return f.a(s);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void f(HashMap hashMap0) {
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey g() {
        return new MotionKeyPosition().h(this);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey h(MotionKey motionKey0) {
        super.h(motionKey0);
        this.z = ((MotionKeyPosition)motionKey0).z;
        this.A = ((MotionKeyPosition)motionKey0).A;
        this.B = ((MotionKeyPosition)motionKey0).B;
        this.C = ((MotionKeyPosition)motionKey0).C;
        this.D = NaNf;
        this.E = ((MotionKeyPosition)motionKey0).E;
        this.F = ((MotionKeyPosition)motionKey0).F;
        this.G = ((MotionKeyPosition)motionKey0).G;
        this.H = ((MotionKeyPosition)motionKey0).H;
        this.J = ((MotionKeyPosition)motionKey0).J;
        this.K = ((MotionKeyPosition)motionKey0).K;
        return this;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void i(HashSet hashSet0) {
    }

    private void v(float f, float f1, float f2, float f3) {
        float f4 = f2 - f;
        float f5 = f3 - f1;
        float f6 = 0.0f;
        float f7 = Float.isNaN(this.E) ? 0.0f : this.E;
        float f8 = Float.isNaN(this.H) ? 0.0f : this.H;
        float f9 = Float.isNaN(this.F) ? 0.0f : this.F;
        if(!Float.isNaN(this.G)) {
            f6 = this.G;
        }
        this.J = (float)(((int)(f + f7 * f4 + f6 * f5)));
        this.K = (float)(((int)(f1 + f4 * f8 + f5 * f9)));
    }

    private void w(float f, float f1, float f2, float f3) {
        float f4 = f2 - f;
        float f5 = f3 - f1;
        this.J = f + f4 * this.E + -f5 * this.F;
        this.K = f1 + f5 * this.E + f4 * this.F;
    }

    void x(int v, int v1, float f, float f1, float f2, float f3) {
        switch(this.I) {
            case 1: {
                this.w(f, f1, f2, f3);
                return;
            }
            case 2: {
                this.y(v, v1);
                return;
            }
            default: {
                this.v(f, f1, f2, f3);
            }
        }
    }

    private void y(int v, int v1) {
        this.J = ((float)v) * this.E + 0.0f;
        this.K = ((float)v1) * this.E + 0.0f;
    }

    float z() {
        return this.J;
    }
}

