package androidx.constraintlayout.core.motion;

public class CustomAttribute {
    public static enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE;

        private static AttributeType[] a() [...] // Inlined contents
    }

    private boolean a;
    String b;
    private AttributeType c;
    private int d;
    private float e;
    private String f;
    boolean g;
    private int h;
    private static final String i = "TransitionLayout";

    public CustomAttribute(CustomAttribute customAttribute0, Object object0) {
        this.a = false;
        this.b = customAttribute0.b;
        this.c = customAttribute0.c;
        this.m(object0);
    }

    public CustomAttribute(String s, AttributeType customAttribute$AttributeType0) {
        this.a = false;
        this.b = s;
        this.c = customAttribute$AttributeType0;
    }

    public CustomAttribute(String s, AttributeType customAttribute$AttributeType0, Object object0, boolean z) {
        this.b = s;
        this.c = customAttribute$AttributeType0;
        this.a = z;
        this.m(object0);
    }

    private static int a(int v) {
        int v1 = (v & ~(v >> 0x1F)) - 0xFF;
        return (v1 & v1 >> 0x1F) + 0xFF;
    }

    public boolean b(CustomAttribute customAttribute0) {
        if(customAttribute0 != null) {
            AttributeType customAttribute$AttributeType0 = this.c;
            if(customAttribute$AttributeType0 == customAttribute0.c) {
                switch(customAttribute$AttributeType0.ordinal()) {
                    case 1: {
                        return this.e == customAttribute0.e;
                    }
                    case 2: 
                    case 3: {
                        return this.h == customAttribute0.h;
                    }
                    case 4: {
                        return this.d == customAttribute0.d;
                    }
                    case 5: {
                        return this.g == customAttribute0.g;
                    }
                    case 6: {
                        return this.e == customAttribute0.e;
                    }
                    case 0: 
                    case 7: {
                        return this.d == customAttribute0.d;
                    }
                    default: {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public AttributeType c() {
        return this.c;
    }

    public float d() {
        switch(this.c.ordinal()) {
            case 0: {
                return (float)this.d;
            }
            case 1: {
                return this.e;
            }
            case 2: 
            case 3: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 4: {
                throw new RuntimeException("Cannot interpolate String");
            }
            case 5: {
                return this.g ? 1.0f : 0.0f;
            }
            case 6: {
                return this.e;
            }
            default: {
                return NaNf;
            }
        }
    }

    public void e(float[] arr_f) {
        switch(this.c.ordinal()) {
            case 0: {
                arr_f[0] = (float)this.d;
                return;
            }
            case 1: {
                arr_f[0] = this.e;
                return;
            }
            case 2: 
            case 3: {
                int v = this.h >> 24 & 0xFF;
                float f = (float)Math.pow(((float)(this.h >> 8 & 0xFF)) / 255.0f, 2.2);
                float f1 = (float)Math.pow(((float)(this.h & 0xFF)) / 255.0f, 2.2);
                arr_f[0] = (float)Math.pow(((float)(this.h >> 16 & 0xFF)) / 255.0f, 2.2);
                arr_f[1] = f;
                arr_f[2] = f1;
                arr_f[3] = ((float)v) / 255.0f;
                return;
            }
            case 4: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 5: {
                arr_f[0] = this.g ? 1.0f : 0.0f;
                return;
            }
            case 6: {
                arr_f[0] = this.e;
            }
        }
    }

    public static int f(float f, float f1, float f2) {
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

    public boolean g() {
        switch(this.c.ordinal()) {
            case 4: 
            case 5: 
            case 7: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    public int h() {
        switch(this.c.ordinal()) {
            case 2: 
            case 3: {
                return 4;
            }
            default: {
                return 1;
            }
        }
    }

    public void i(int v) {
        this.h = v;
    }

    public void j(float f) {
        this.e = f;
    }

    public void k(int v) {
        this.d = v;
    }

    public void l(String s) {
        this.f = s;
    }

    public void m(Object object0) {
        switch(this.c.ordinal()) {
            case 1: {
                this.e = (float)(((Float)object0));
                return;
            }
            case 2: 
            case 3: {
                this.h = (int)(((Integer)object0));
                return;
            }
            case 4: {
                this.f = (String)object0;
                return;
            }
            case 5: {
                this.g = ((Boolean)object0).booleanValue();
                return;
            }
            case 6: {
                this.e = (float)(((Float)object0));
                return;
            }
            case 0: 
            case 7: {
                this.d = (int)(((Integer)object0));
            }
        }
    }

    public void n(float[] arr_f) {
        boolean z = true;
        switch(this.c.ordinal()) {
            case 1: {
                this.e = arr_f[0];
                return;
            }
            case 2: 
            case 3: {
                this.h = CustomAttribute.a(((int)(arr_f[3] * 255.0f))) << 24 | CustomAttribute.f(arr_f[0], arr_f[1], arr_f[2]) & 0xFFFFFF;
                return;
            }
            case 4: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 5: {
                if(((double)arr_f[0]) <= 0.5) {
                    z = false;
                }
                this.g = z;
                return;
            }
            case 6: {
                this.e = arr_f[0];
                return;
            }
            case 0: 
            case 7: {
                this.d = (int)arr_f[0];
            }
        }
    }
}

