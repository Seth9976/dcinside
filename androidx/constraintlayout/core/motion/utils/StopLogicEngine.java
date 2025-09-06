package androidx.constraintlayout.core.motion.utils;

public class StopLogicEngine implements StopEngine {
    public static class Decelerate implements StopEngine {
        private float a;
        private float b;
        private float c;
        private float d;
        private float e;
        private float f;
        private boolean g;

        public Decelerate() {
            this.g = false;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
        public float a() {
            return this.d;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
        public float b(float f) {
            if(f > this.e) {
                return 0.0f;
            }
            float f1 = this.b + this.c * f;
            this.d = f1;
            return f1;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
        public String c(String s, float f) {
            return this.e + " " + this.d;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
        public boolean d() {
            return this.g;
        }

        public void e(float f, float f1, float f2) {
            this.g = false;
            this.a = f1;
            this.b = f2;
            this.f = f;
            float f3 = (f1 - f) / (f2 / 2.0f);
            this.e = f3;
            this.c = -f2 / f3;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getInterpolation(float f) {
            if(f > this.e) {
                this.g = true;
                return this.a;
            }
            this.b(f);
            return this.f + (this.b + this.c * f / 2.0f) * f;
        }
    }

    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private String k;
    private boolean l;
    private float m;
    private float n;
    private float o;
    private boolean p;
    private static final float q = 0.00001f;

    public StopLogicEngine() {
        this.l = false;
        this.p = false;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public float a() {
        return this.l ? -this.b(this.o) : this.b(this.o);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public float b(float f) {
        float f1 = this.d;
        if(f <= f1) {
            return this.a + (this.b - this.a) * f / f1;
        }
        int v = this.j;
        if(v == 1) {
            return 0.0f;
        }
        float f2 = f - f1;
        float f3 = this.e;
        if(f2 < f3) {
            return this.b + (this.c - this.b) * f2 / f3;
        }
        if(v == 2) {
            return 0.0f;
        }
        float f4 = f2 - f3;
        return f4 < this.f ? this.c - f4 * this.c / this.f : 0.0f;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public String c(String s, float f) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s + " ===== " + this.k + "\n");
        stringBuilder0.append(s);
        stringBuilder0.append((this.l ? "backwards" : "forward "));
        stringBuilder0.append(" time = ");
        stringBuilder0.append(f);
        stringBuilder0.append("  stages ");
        stringBuilder0.append(this.j);
        stringBuilder0.append("\n");
        String s1 = this.j <= 1 ? stringBuilder0.toString() + s + " dur " + this.d + " vel " + this.a + " pos " + this.g + "\n" : stringBuilder0.toString() + s + " dur " + this.d + " vel " + this.a + " pos " + this.g + "\n" + s + " dur " + this.e + " vel " + this.b + " pos " + this.h + "\n";
        if(this.j > 2) {
            s1 = s1 + s + " dur " + this.f + " vel " + this.c + " pos " + this.i + "\n";
        }
        float f1 = this.d;
        if(f <= f1) {
            return s1 + s + "stage 0\n";
        }
        int v = this.j;
        if(v == 1) {
            return s1 + s + "end stage 0\n";
        }
        float f2 = f - f1;
        float f3 = this.e;
        if(f2 < f3) {
            return s1 + s + " stage 1\n";
        }
        if(v == 2) {
            return s1 + s + "end stage 1\n";
        }
        return f2 - f3 < this.f ? s1 + s + " stage 2\n" : s1 + s + " end stage 2\n";
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean d() {
        return this.a() < 0.00001f && Math.abs(this.i - this.n) < 0.00001f;
    }

    private float e(float f) {
        this.p = false;
        float f1 = this.d;
        if(f <= f1) {
            return this.a * f + (this.b - this.a) * f * f / (f1 * 2.0f);
        }
        int v = this.j;
        if(v == 1) {
            return this.g;
        }
        float f2 = f - f1;
        float f3 = this.e;
        if(f2 < f3) {
            return this.g + this.b * f2 + (this.c - this.b) * f2 * f2 / (f3 * 2.0f);
        }
        if(v == 2) {
            return this.h;
        }
        float f4 = f2 - f3;
        float f5 = this.f;
        if(f4 <= f5) {
            return this.h + this.c * f4 - this.c * f4 * f4 / (f5 * 2.0f);
        }
        this.p = true;
        return this.i;
    }

    public void f(float f, float f1, float f2, float f3, float f4, float f5) {
        boolean z = false;
        this.p = false;
        this.m = f;
        if(f > f1) {
            z = true;
        }
        this.l = z;
        if(z) {
            this.g(-f2, f - f1, f4, f5, f3);
            return;
        }
        this.g(f2, f1 - f, f4, f5, f3);
    }

    private void g(float f, float f1, float f2, float f3, float f4) {
        this.p = false;
        this.i = f1;
        if(f == 0.0f) {
            f = 0.0001f;
        }
        float f5 = f / f2;
        float f6 = f5 * f / 2.0f;
        if(f < 0.0f) {
            float f7 = (float)Math.sqrt((f1 - -f / f2 * f / 2.0f) * f2);
            if(f7 < f3) {
                this.k = "backward accelerate, decelerate";
                this.j = 2;
                this.a = f;
                this.b = f7;
                this.c = 0.0f;
                float f8 = (f7 - f) / f2;
                this.d = f8;
                this.e = f7 / f2;
                this.g = (f + f7) * f8 / 2.0f;
                this.h = f1;
                this.i = f1;
                return;
            }
            this.k = "backward accelerate cruse decelerate";
            this.j = 3;
            this.a = f;
            this.b = f3;
            this.c = f3;
            float f9 = (f3 - f) / f2;
            this.d = f9;
            float f10 = f3 / f2;
            this.f = f10;
            float f11 = (f + f3) * f9 / 2.0f;
            float f12 = f10 * f3 / 2.0f;
            this.e = (f1 - f11 - f12) / f3;
            this.g = f11;
            this.h = f1 - f12;
            this.i = f1;
            return;
        }
        if(f6 >= f1) {
            this.k = "hard stop";
            this.j = 1;
            this.a = f;
            this.b = 0.0f;
            this.g = f1;
            this.d = 2.0f * f1 / f;
            return;
        }
        float f13 = f1 - f6;
        float f14 = f13 / f;
        if(f14 + f5 < f4) {
            this.k = "cruse decelerate";
            this.j = 2;
            this.a = f;
            this.b = f;
            this.c = 0.0f;
            this.g = f13;
            this.h = f1;
            this.d = f14;
            this.e = f5;
            return;
        }
        float f15 = (float)Math.sqrt(f2 * f1 + f * f / 2.0f);
        float f16 = (f15 - f) / f2;
        this.d = f16;
        float f17 = f15 / f2;
        this.e = f17;
        if(f15 < f3) {
            this.k = "accelerate decelerate";
            this.j = 2;
            this.a = f;
            this.b = f15;
            this.c = 0.0f;
            this.d = f16;
            this.e = f17;
            this.g = (f + f15) * f16 / 2.0f;
            this.h = f1;
            return;
        }
        this.k = "accelerate cruse decelerate";
        this.j = 3;
        this.a = f;
        this.b = f3;
        this.c = f3;
        float f18 = (f3 - f) / f2;
        this.d = f18;
        float f19 = f3 / f2;
        this.f = f19;
        float f20 = (f + f3) * f18 / 2.0f;
        float f21 = f19 * f3 / 2.0f;
        this.e = (f1 - f20 - f21) / f3;
        this.g = f20;
        this.h = f1 - f21;
        this.i = f1;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        float f1 = this.e(f);
        this.n = f1;
        this.o = f;
        return this.l ? this.m - f1 : this.m + f1;
    }
}

