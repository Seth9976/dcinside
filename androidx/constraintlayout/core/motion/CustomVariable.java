package androidx.constraintlayout.core.motion;

public class CustomVariable {
    String a;
    private int b;
    private int c;
    private float d;
    private String e;
    boolean f;
    private static final String g = "TransitionLayout";

    public CustomVariable(CustomVariable customVariable0) {
        this.a = customVariable0.a;
        this.b = customVariable0.b;
        this.c = customVariable0.c;
        this.d = customVariable0.d;
        this.e = customVariable0.e;
        this.f = customVariable0.f;
    }

    public CustomVariable(CustomVariable customVariable0, Object object0) {
        this.c = 0x80000000;
        this.d = NaNf;
        this.e = null;
        this.a = customVariable0.a;
        this.b = customVariable0.b;
        this.y(object0);
    }

    public CustomVariable(String s, int v) {
        this.c = 0x80000000;
        this.d = NaNf;
        this.e = null;
        this.a = s;
        this.b = v;
    }

    public CustomVariable(String s, int v, float f) {
        this.c = 0x80000000;
        this.e = null;
        this.a = s;
        this.b = v;
        this.d = f;
    }

    public CustomVariable(String s, int v, int v1) {
        this.c = 0x80000000;
        this.d = NaNf;
        this.e = null;
        this.a = s;
        this.b = v;
        if(v == 901) {
            this.d = (float)v1;
            return;
        }
        this.c = v1;
    }

    public CustomVariable(String s, int v, Object object0) {
        this.c = 0x80000000;
        this.d = NaNf;
        this.e = null;
        this.a = s;
        this.b = v;
        this.y(object0);
    }

    public CustomVariable(String s, int v, String s1) {
        this.c = 0x80000000;
        this.d = NaNf;
        this.a = s;
        this.b = v;
        this.e = s1;
    }

    public CustomVariable(String s, int v, boolean z) {
        this.c = 0x80000000;
        this.d = NaNf;
        this.e = null;
        this.a = s;
        this.b = v;
        this.f = z;
    }

    public void a(MotionWidget motionWidget0) {
        int v = this.b;
        switch(v) {
            case 903: {
                motionWidget0.K(this.a, 903, this.e);
                return;
            }
            case 904: {
                motionWidget0.L(this.a, 904, this.f);
                return;
            }
            case 901: 
            case 905: {
                motionWidget0.I(this.a, v, this.d);
                return;
            }
            case 900: 
            case 902: 
            case 906: {
                motionWidget0.J(this.a, v, this.c);
            }
        }
    }

    private static int b(int v) {
        int v1 = (v & ~(v >> 0x1F)) - 0xFF;
        return (v1 & v1 >> 0x1F) + 0xFF;
    }

    public static String c(int v) {
        String s = "00000000" + Integer.toHexString(v);
        return "#" + s.substring(s.length() - 8);
    }

    public CustomVariable d() {
        return new CustomVariable(this);
    }

    public boolean e(CustomVariable customVariable0) {
        if(customVariable0 != null) {
            int v = this.b;
            if(v == customVariable0.b) {
                switch(v) {
                    case 901: {
                        return this.d == customVariable0.d;
                    }
                    case 902: {
                        return this.c == customVariable0.c;
                    }
                    case 903: {
                        return this.c == customVariable0.c;
                    }
                    case 904: {
                        return this.f == customVariable0.f;
                    }
                    case 905: {
                        return this.d == customVariable0.d;
                    }
                    case 900: 
                    case 906: {
                        return this.c == customVariable0.c;
                    }
                    default: {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public boolean f() {
        return this.f;
    }

    public int g() {
        return this.c;
    }

    public float h() {
        return this.d;
    }

    public int i() {
        return this.c;
    }

    public int j(float[] arr_f) {
        return CustomVariable.b(((int)(arr_f[3] * 255.0f))) << 24 | CustomVariable.b(((int)(((float)Math.pow(arr_f[0], 0.454545)) * 255.0f))) << 16 | CustomVariable.b(((int)(((float)Math.pow(arr_f[1], 0.454545)) * 255.0f))) << 8 | CustomVariable.b(((int)(((float)Math.pow(arr_f[2], 0.454545)) * 255.0f)));
    }

    public String k() {
        return this.a;
    }

    public String l() {
        return this.e;
    }

    public int m() {
        return this.b;
    }

    public float n() {
        switch(this.b) {
            case 900: {
                return (float)this.c;
            }
            case 901: {
                return this.d;
            }
            case 902: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 903: {
                throw new RuntimeException("Cannot interpolate String");
            }
            case 904: {
                return this.f ? 1.0f : 0.0f;
            }
            case 905: {
                return this.d;
            }
            default: {
                return NaNf;
            }
        }
    }

    public void o(float[] arr_f) {
        switch(this.b) {
            case 900: {
                arr_f[0] = (float)this.c;
                return;
            }
            case 901: {
                arr_f[0] = this.d;
                return;
            }
            case 902: {
                int v = this.c >> 24 & 0xFF;
                float f = (float)Math.pow(((float)(this.c >> 8 & 0xFF)) / 255.0f, 2.2);
                float f1 = (float)Math.pow(((float)(this.c & 0xFF)) / 255.0f, 2.2);
                arr_f[0] = (float)Math.pow(((float)(this.c >> 16 & 0xFF)) / 255.0f, 2.2);
                arr_f[1] = f;
                arr_f[2] = f1;
                arr_f[3] = ((float)v) / 255.0f;
                return;
            }
            case 903: {
                throw new RuntimeException("Cannot interpolate String");
            }
            case 904: {
                arr_f[0] = this.f ? 1.0f : 0.0f;
                return;
            }
            case 905: {
                arr_f[0] = this.d;
            }
        }
    }

    public static int p(float f, float f1, float f2) {
        float f3 = f * 6.0f - ((float)(((int)(f * 6.0f))));
        int v = (int)((1.0f - f1) * (f2 * 255.0f) + 0.5f);
        int v1 = (int)((1.0f - f3 * f1) * (f2 * 255.0f) + 0.5f);
        int v2 = (int)((1.0f - (1.0f - f3) * f1) * (f2 * 255.0f) + 0.5f);
        int v3 = (int)(f2 * 255.0f + 0.5f);
        switch(((int)(f * 6.0f))) {
            case 0: {
                return (v3 << 16) + (v2 << 8) + v | 0xFF000000;
            }
            case 1: {
                return (v1 << 16) + (v3 << 8) + v | 0xFF000000;
            }
            case 2: {
                return (v << 16) + (v3 << 8) + v2 | 0xFF000000;
            }
            case 3: {
                return (v << 16) + (v1 << 8) + v3 | 0xFF000000;
            }
            case 4: {
                return (v2 << 16) + (v << 8) + v3 | 0xFF000000;
            }
            case 5: {
                return (v3 << 16) + (v << 8) + v1 | 0xFF000000;
            }
            default: {
                return 0;
            }
        }
    }

    public boolean q() {
        return this.b != 903 && this.b != 904 && this.b != 906;
    }

    public int r() {
        return this.b == 902 ? 4 : 1;
    }

    public static int s(float f, float f1, float f2, float f3) {
        return CustomVariable.b(((int)(f * 255.0f))) << 16 | CustomVariable.b(((int)(f3 * 255.0f))) << 24 | CustomVariable.b(((int)(f1 * 255.0f))) << 8 | CustomVariable.b(((int)(f2 * 255.0f)));
    }

    public void t(boolean z) {
        this.f = z;
    }

    @Override
    public String toString() {
        String s = this.a + ':';
        switch(this.b) {
            case 900: {
                return s + this.c;
            }
            case 901: {
                return s + this.d;
            }
            case 902: {
                return s + CustomVariable.c(this.c);
            }
            case 903: {
                return s + this.e;
            }
            case 904: {
                return s + Boolean.valueOf(this.f);
            }
            case 905: {
                return s + this.d;
            }
            default: {
                return s + "????";
            }
        }
    }

    public void u(float f) {
        this.d = f;
    }

    public void v(int v) {
        this.c = v;
    }

    public void w(MotionWidget motionWidget0, float[] arr_f) {
        int v = this.b;
        boolean z = true;
        switch(v) {
            case 900: {
                motionWidget0.J(this.a, 900, ((int)arr_f[0]));
                return;
            }
            case 902: {
                motionWidget0.J(this.a, this.b, CustomVariable.b(((int)(arr_f[3] * 255.0f))) << 24 | CustomVariable.b(((int)(((float)Math.pow(arr_f[0], 0.454545)) * 255.0f))) << 16 | CustomVariable.b(((int)(((float)Math.pow(arr_f[1], 0.454545)) * 255.0f))) << 8 | CustomVariable.b(((int)(((float)Math.pow(arr_f[2], 0.454545)) * 255.0f))));
                return;
            }
            case 904: {
                String s = this.a;
                if(arr_f[0] <= 0.5f) {
                    z = false;
                }
                motionWidget0.L(s, 904, z);
                return;
            }
            case 901: 
            case 905: {
                motionWidget0.I(this.a, v, arr_f[0]);
                return;
            }
            case 903: 
            case 906: {
                throw new RuntimeException("unable to interpolate " + this.a);
            }
        }
    }

    public void x(String s) {
        this.e = s;
    }

    public void y(Object object0) {
        switch(this.b) {
            case 901: {
                this.d = (float)(((Float)object0));
                return;
            }
            case 902: {
                this.c = (int)(((Integer)object0));
                return;
            }
            case 903: {
                this.e = (String)object0;
                return;
            }
            case 904: {
                this.f = ((Boolean)object0).booleanValue();
                return;
            }
            case 905: {
                this.d = (float)(((Float)object0));
                return;
            }
            case 900: 
            case 906: {
                this.c = (int)(((Integer)object0));
            }
        }
    }

    public void z(float[] arr_f) {
        boolean z = true;
        switch(this.b) {
            case 902: {
                this.c = (Math.round(arr_f[3] * 255.0f) & 0xFF) << 24 | (Math.round(((float)Math.pow(arr_f[0], 0.5)) * 255.0f) & 0xFF) << 16 | (Math.round(((float)Math.pow(arr_f[1], 0.5)) * 255.0f) & 0xFF) << 8 | Math.round(((float)Math.pow(arr_f[2], 0.5)) * 255.0f) & 0xFF;
                return;
            }
            case 903: {
                throw new RuntimeException("Cannot interpolate String");
            }
            case 904: {
                if(((double)arr_f[0]) <= 0.5) {
                    z = false;
                }
                this.f = z;
                return;
            }
            case 901: 
            case 905: {
                this.d = arr_f[0];
                return;
            }
            case 900: 
            case 906: {
                this.c = (int)arr_f[0];
            }
        }
    }
}

