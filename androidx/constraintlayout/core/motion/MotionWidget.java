package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.a;
import androidx.constraintlayout.core.motion.utils.e;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.util.Set;

public class MotionWidget implements TypedValues {
    public static class Motion {
        public String a;
        public int b;
        public String c;
        public int d;
        public int e;
        public float f;
        public int g;
        public float h;
        public float i;
        public int j;
        public String k;
        public int l;
        public int m;
        private static final int n = -2;
        private static final int o = -1;
        private static final int p = -3;

        public Motion() {
            this.a = null;
            this.b = 0;
            this.c = null;
            this.d = -1;
            this.e = 0;
            this.f = NaNf;
            this.g = -1;
            this.h = NaNf;
            this.i = NaNf;
            this.j = -1;
            this.k = null;
            this.l = -3;
            this.m = -1;
        }
    }

    public static class PropertySet {
        public int a;
        public int b;
        public float c;
        public float d;

        public PropertySet() {
            this.a = 4;
            this.b = 0;
            this.c = 1.0f;
            this.d = NaNf;
        }
    }

    public static final int A = 0;
    public static final int B = 0;
    public static final int C = -1;
    public static final int D = -1;
    public static final int E = -2;
    public static final int F = 0x80000000;
    public static final int G = 1;
    WidgetFrame h;
    Motion i;
    PropertySet j;
    private float k;
    float l;
    public static final int m = 0;
    public static final int n = 1;
    private static final int o = -1;
    private static final int p = -2;
    public static final int q = 0;
    public static final int r = 4;
    private static final int s = -3;
    private static final int t = -4;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 3;
    public static final int y = 4;
    public static final int z = -1;

    public MotionWidget() {
        this.h = new WidgetFrame();
        this.i = new Motion();
        this.j = new PropertySet();
    }

    public MotionWidget(WidgetFrame widgetFrame0) {
        this.h = new WidgetFrame();
        this.i = new Motion();
        this.j = new PropertySet();
        this.h = widgetFrame0;
    }

    public float A(int v) {
        switch(v) {
            case 303: {
                return this.h.p;
            }
            case 304: {
                return this.h.k;
            }
            case 305: {
                return this.h.l;
            }
            case 306: {
                return this.h.m;
            }
            case 308: {
                return this.h.h;
            }
            case 309: {
                return this.h.i;
            }
            case 310: {
                return this.h.j;
            }
            case 311: {
                return this.h.n;
            }
            case 312: {
                return this.h.o;
            }
            case 313: {
                return this.h.f;
            }
            case 314: {
                return this.h.g;
            }
            case 315: {
                return this.k;
            }
            case 316: {
                return this.l;
            }
            default: {
                return NaNf;
            }
        }
    }

    public int B() {
        return this.j.a;
    }

    public WidgetFrame C() {
        return this.h;
    }

    public int D() {
        return this.h.d - this.h.b;
    }

    public int E() {
        return this.h.b;
    }

    public int F() {
        return this.h.c;
    }

    public void G(int v, int v1, int v2, int v3) {
        this.H(v, v1, v2, v3);
    }

    public void H(int v, int v1, int v2, int v3) {
        if(this.h == null) {
            this.h = new WidgetFrame(null);
        }
        this.h.c = v1;
        this.h.b = v;
        this.h.d = v2;
        this.h.e = v3;
    }

    public void I(String s, int v, float f) {
        this.h.x(s, v, f);
    }

    public void J(String s, int v, int v1) {
        this.h.y(s, v, v1);
    }

    public void K(String s, int v, String s1) {
        this.h.z(s, v, s1);
    }

    public void L(String s, int v, boolean z) {
        this.h.A(s, v, z);
    }

    public void M(CustomAttribute customAttribute0, float[] arr_f) {
        this.h.x(customAttribute0.b, 901, arr_f[0]);
    }

    public void N(float f) {
        this.h.f = f;
    }

    public void O(float f) {
        this.h.g = f;
    }

    public void P(float f) {
        this.h.h = f;
    }

    public void Q(float f) {
        this.h.i = f;
    }

    public void R(float f) {
        this.h.j = f;
    }

    public void S(float f) {
        this.h.n = f;
    }

    public void T(float f) {
        this.h.o = f;
    }

    public void U(float f) {
        this.h.k = f;
    }

    public void V(float f) {
        this.h.l = f;
    }

    public void W(float f) {
        this.h.m = f;
    }

    public boolean X(int v, float f) {
        switch(v) {
            case 303: {
                this.h.p = f;
                return true;
            }
            case 304: {
                this.h.k = f;
                return true;
            }
            case 305: {
                this.h.l = f;
                return true;
            }
            case 306: {
                this.h.m = f;
                return true;
            }
            case 308: {
                this.h.h = f;
                return true;
            }
            case 309: {
                this.h.i = f;
                return true;
            }
            case 310: {
                this.h.j = f;
                return true;
            }
            case 311: {
                this.h.n = f;
                return true;
            }
            case 312: {
                this.h.o = f;
                return true;
            }
            case 313: {
                this.h.f = f;
                return true;
            }
            case 314: {
                this.h.g = f;
                return true;
            }
            case 315: {
                this.k = f;
                return true;
            }
            case 316: {
                this.l = f;
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public boolean Y(int v, float f) {
        switch(v) {
            case 600: {
                this.i.f = f;
                return true;
            }
            case 601: {
                this.i.h = f;
                return true;
            }
            case 602: {
                this.i.i = f;
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public boolean Z(int v, int v1) {
        switch(v) {
            case 606: {
                this.i.b = v1;
                return true;
            }
            case 607: {
                this.i.d = v1;
                return true;
            }
            case 608: {
                this.i.e = v1;
                return true;
            }
            case 609: {
                this.i.g = v1;
                return true;
            }
            case 610: {
                this.i.j = v1;
                return true;
            }
            case 611: {
                this.i.l = v1;
                return true;
            }
            case 612: {
                this.i.m = v1;
                return true;
            }
            default: {
                return false;
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean a(int v, int v1) {
        return this.X(v, ((float)v1)) ? true : this.Z(v, v1);
    }

    public boolean a0(int v, String s) {
        switch(v) {
            case 603: {
                this.i.c = s;
                return true;
            }
            case 604: {
                this.i.k = s;
                return true;
            }
            default: {
                return false;
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean b(int v, float f) {
        return this.X(v, f) ? true : this.Y(v, f);
    }

    public void b0(int v) {
        this.j.a = v;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean c(int v, boolean z) {
        return false;
    }

    public void c0(TypedValues typedValues0) {
        if(this.h.m() != null) {
            this.h.m().g(typedValues0);
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean d(int v, String s) {
        if(v == 605) {
            this.i.a = s;
            return true;
        }
        return this.a0(v, s);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public int e(String s) {
        int v = a.a(s);
        return v == -1 ? e.a(s) : v;
    }

    public MotionWidget f(int v) [...] // Inlined contents

    public float g() {
        return this.h.p;
    }

    public int h() {
        return this.h.e;
    }

    public CustomVariable i(String s) {
        return this.h.h(s);
    }

    public Set j() {
        return this.h.i();
    }

    public int k() {
        return this.h.e - this.h.c;
    }

    public int l() {
        return this.h.b;
    }

    // 去混淆评级： 低(20)
    public String m() [...] // 潜在的解密器

    public MotionWidget n() [...] // Inlined contents

    public float o() {
        return this.h.f;
    }

    public float p() {
        return this.h.g;
    }

    public int q() {
        return this.h.d;
    }

    public float r() {
        return this.h.h;
    }

    public float s() {
        return this.h.i;
    }

    public float t() {
        return this.h.j;
    }

    @Override
    public String toString() {
        return this.h.b + ", " + this.h.c + ", " + this.h.d + ", " + this.h.e;
    }

    public float u() {
        return this.h.n;
    }

    public float v() {
        return this.h.o;
    }

    public int w() {
        return this.h.c;
    }

    public float x() {
        return this.h.k;
    }

    public float y() {
        return this.h.l;
    }

    public float z() {
        return this.h.m;
    }
}

