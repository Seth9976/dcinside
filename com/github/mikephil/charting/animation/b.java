package com.github.mikephil.charting.animation;

import android.animation.TimeInterpolator;
import androidx.annotation.RequiresApi;

@RequiresApi(11)
public class b {
    static final class A implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return (float)Math.pow(f, 4.0);
        }
    }

    static final class B implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return -(((float)Math.pow(f - 1.0f, 4.0)) - 1.0f);
        }
    }

    public interface C extends TimeInterpolator {
        @Override  // android.animation.TimeInterpolator
        float getInterpolation(float arg1);
    }

    static final class a implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return f * 2.0f < 1.0f ? ((float)Math.pow(f * 2.0f, 4.0)) * 0.5f : (((float)Math.pow(f * 2.0f - 2.0f, 4.0)) - 2.0f) * -0.5f;
        }
    }

    static final class com.github.mikephil.charting.animation.b.b implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return 1.0f - ((float)Math.cos(((double)f) * 1.570796));
        }
    }

    static final class c implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return (float)Math.sin(((double)f) * 1.570796);
        }
    }

    static final class d implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return (((float)Math.cos(((double)f) * 3.141593)) - 1.0f) * -0.5f;
        }
    }

    static final class e implements C {
        // 去混淆评级： 低(20)
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return f == 0.0f ? 0.0f : ((float)Math.pow(2.0, (f - 1.0f) * 10.0f));
        }
    }

    static final class f implements C {
        // 去混淆评级： 低(20)
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return f == 1.0f ? 1.0f : -((float)Math.pow(2.0, (f + 1.0f) * -10.0f));
        }
    }

    static final class g implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            switch(f) {
                case 0: {
                    return 0.0f;
                }
                case 0x3F800000: {
                    return 1.0f;
                }
                default: {
                    return f * 2.0f < 1.0f ? ((float)Math.pow(2.0, (f * 2.0f - 1.0f) * 10.0f)) * 0.5f : (2.0f - ((float)Math.pow(2.0, (f * 2.0f - 1.0f) * -10.0f))) * 0.5f;
                }
            }
        }
    }

    static final class h implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return -(((float)Math.sqrt(1.0f - f * f)) - 1.0f);
        }
    }

    static final class i implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return (float)Math.sqrt(1.0f - (f - 1.0f) * (f - 1.0f));
        }
    }

    static final class j implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            if(f * 2.0f < 1.0f) {
                return (((float)Math.sqrt(1.0f - f * 2.0f * (f * 2.0f))) - 1.0f) * -0.5f;
            }
            float f1 = f * 2.0f - 2.0f;
            return (((float)Math.sqrt(1.0f - f1 * f1)) + 1.0f) * 0.5f;
        }
    }

    static final class k implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return f;
        }
    }

    static final class l implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            switch(f) {
                case 0: {
                    return 0.0f;
                }
                case 0x3F800000: {
                    return 1.0f;
                }
                default: {
                    return -(((float)Math.pow(2.0, 10.0f * (f - 1.0f))) * ((float)Math.sin((f - 1.0f - 0.075f) * 6.283185f / 0.3f)));
                }
            }
        }
    }

    static final class m implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            switch(f) {
                case 0: {
                    return 0.0f;
                }
                case 0x3F800000: {
                    return 1.0f;
                }
                default: {
                    return ((float)Math.pow(2.0, -10.0f * f)) * ((float)Math.sin((f - 0.075f) * 6.283185f / 0.3f)) + 1.0f;
                }
            }
        }
    }

    static final class n implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            if(f == 0.0f) {
                return 0.0f;
            }
            if(f * 2.0f == 2.0f) {
                return 1.0f;
            }
            if(f * 2.0f < 1.0f) {
                float f1 = f * 2.0f - 1.0f;
                return ((float)Math.pow(2.0, 10.0f * f1)) * ((float)Math.sin((f1 * 1.0f - 0.1125f) * 13.962635f)) * -0.5f;
            }
            float f2 = f * 2.0f - 1.0f;
            return ((float)Math.pow(2.0, -10.0f * f2)) * 0.5f * ((float)Math.sin((f2 * 1.0f - 0.1125f) * 13.962635f)) + 1.0f;
        }
    }

    static final class o implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return f * f * (f * 2.70158f - 1.70158f);
        }
    }

    static final class p implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return (f - 1.0f) * (f - 1.0f) * ((f - 1.0f) * 2.70158f + 1.70158f) + 1.0f;
        }
    }

    static final class q implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            if(f * 2.0f < 1.0f) {
                return f * 2.0f * (f * 2.0f) * (3.594909f * (f * 2.0f) - 2.594909f) * 0.5f;
            }
            float f1 = f * 2.0f - 2.0f;
            return (f1 * f1 * (3.594909f * f1 + 2.594909f) + 2.0f) * 0.5f;
        }
    }

    static final class r implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return 1.0f - b.B.getInterpolation(1.0f - f);
        }
    }

    static final class s implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            if(f < 0.363636f) {
                return 7.5625f * f * f;
            }
            if(f < 0.727273f) {
                return 7.5625f * (f - 0.545455f) * (f - 0.545455f) + 0.75f;
            }
            return f < 0.909091f ? 7.5625f * (f - 0.818182f) * (f - 0.818182f) + 0.9375f : 7.5625f * (f - 0.954545f) * (f - 0.954545f) + 0.984375f;
        }
    }

    static final class t implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return f < 0.5f ? b.A.getInterpolation(f * 2.0f) * 0.5f : b.B.getInterpolation(f * 2.0f - 1.0f) * 0.5f + 0.5f;
        }
    }

    static final class u implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return f * f;
        }
    }

    static final class v implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return -f * (f - 2.0f);
        }
    }

    static final class w implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            if(f * 2.0f < 1.0f) {
                return 0.5f * (f * 2.0f) * (f * 2.0f);
            }
            float f1 = f * 2.0f - 1.0f;
            return (f1 * (f1 - 2.0f) - 1.0f) * -0.5f;
        }
    }

    static final class x implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return (float)Math.pow(f, 3.0);
        }
    }

    static final class y implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return ((float)Math.pow(f - 1.0f, 3.0)) + 1.0f;
        }
    }

    static final class z implements C {
        @Override  // com.github.mikephil.charting.animation.b$C
        public float getInterpolation(float f) {
            return f * 2.0f < 1.0f ? ((float)Math.pow(f * 2.0f, 3.0)) * 0.5f : (((float)Math.pow(f * 2.0f - 2.0f, 3.0)) + 2.0f) * 0.5f;
        }
    }

    public static final C A = null;
    public static final C B = null;
    public static final C C = null;
    private static final float a = 6.283185f;
    public static final C b;
    public static final C c;
    public static final C d;
    public static final C e;
    public static final C f;
    public static final C g;
    public static final C h;
    public static final C i;
    public static final C j;
    public static final C k;
    public static final C l;
    public static final C m;
    public static final C n;
    public static final C o;
    public static final C p;
    public static final C q;
    public static final C r;
    public static final C s;
    public static final C t;
    public static final C u;
    public static final C v;
    public static final C w;
    public static final C x;
    public static final C y;
    public static final C z;

    static {
        b.b = new k();
        b.c = new u();
        b.d = new v();
        b.e = new w();
        b.f = new x();
        b.g = new y();
        b.h = new z();
        b.i = new A();
        b.j = new B();
        b.k = new a();
        b.l = new com.github.mikephil.charting.animation.b.b();
        b.m = new c();
        b.n = new d();
        b.o = new e();
        b.p = new f();
        b.q = new g();
        b.r = new h();
        b.s = new i();
        b.t = new j();
        b.u = new l();
        b.v = new m();
        b.w = new n();
        b.x = new o();
        b.y = new p();
        b.z = new q();
        b.A = new r();
        b.B = new s();
        b.C = new t();
    }
}

