package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

@RestrictTo({Scope.b})
public final class j {
    public final String a;
    public final Function b;
    public final Function c;
    public final boolean d;
    public final Function e;
    public final Function f;
    public final e g;
    public final Function h;
    public final Function i;
    private final HashMap j;

    public j(@NonNull String s, @NonNull Function function0, @NonNull Function function1, boolean z, @Nullable Function function2, @Nullable Function function3, @Nullable e e0, @Nullable Function function4) {
        this.j = new HashMap();
        this.a = s;
        this.b = function0;
        this.c = function1;
        this.d = z;
        this.e = function2;
        this.f = function3;
        this.g = e0;
        this.h = function4;
        this.i = null;
    }

    public j(@NonNull String s, @NonNull Function function0, @NonNull Function function1, boolean z, @Nullable Function function2, @Nullable Function function3, @Nullable e e0, @Nullable Function function4, @Nullable Function function5) {
        this.j = new HashMap();
        this.a = s;
        this.b = function0;
        this.c = function1;
        this.d = z;
        this.e = function2;
        this.f = function3;
        this.g = e0;
        this.h = function4;
        this.i = function5;
    }

    public static T2 b(T2 t20, k k0) {
        return t20;
    }

    // 去混淆评级： 低(20)
    public static double c(double f) {
        return !j.n(f) || j.m(f) ? f : 49.0;
    }

    public static double d(double f, double f1) {
        double f2 = d.d(f, f1);
        double f3 = d.b(f, f1);
        double f4 = d.e(f2, f);
        double f5 = d.e(f3, f);
        if(j.n(f)) {
            return f4 >= f1 || f4 >= f5 || Math.abs(f4 - f5) < 0.1 && f4 < f1 && f5 < f1 ? f2 : f3;
        }
        return f5 < f1 && f5 < f4 ? f2 : f3;
    }

    @NonNull
    public static j e(@NonNull String s, int v) {
        l l0 = l.b(v);
        return j.f(s, new h(T2.d(v)), new i(l0));
    }

    @NonNull
    public static j f(@NonNull String s, @NonNull Function function0, @NonNull Function function1) {
        return new j(s, function0, function1, false, null, null, null, null);
    }

    @NonNull
    public static j g(@NonNull String s, @NonNull Function function0, @NonNull Function function1, boolean z) {
        return new j(s, function0, function1, z, null, null, null, null);
    }

    public int h(@NonNull k k0) {
        int v = this.i(k0).k();
        return this.i == null ? v : w2.b(0, 0xFF, ((int)Math.round(((double)(((Double)this.i.apply(k0)))) * 255.0))) << 24 | v & 0xFFFFFF;
    }

    @NonNull
    public l i(@NonNull k k0) {
        l l0 = (l)this.j.get(k0);
        if(l0 != null) {
            return l0;
        }
        double f = this.j(k0);
        l l1 = ((T2)this.b.apply(k0)).f(f);
        if(this.j.size() > 4) {
            this.j.clear();
        }
        this.j.put(k0, l1);
        return l1;
    }

    public double j(@NonNull k k0) {
        boolean z = k0.e < 0.0;
        Function function0 = this.h;
        if(function0 != null) {
            U2 u20 = (U2)function0.apply(k0);
            j j0 = u20.c();
            j j1 = u20.d();
            double f = u20.a();
            V2 v20 = u20.b();
            boolean z1 = u20.e();
            double f1 = ((j)this.e.apply(k0)).j(k0);
            boolean z2 = v20 == V2.c || v20 == V2.b && !k0.d || v20 == V2.a && k0.d;
            j j2 = z2 ? j0 : j1;
            j j3 = z2 ? j1 : j0;
            boolean z3 = this.a.equals(j2.a);
            double f2 = k0.d ? 1.0 : -1.0;
            double f3 = j2.g.a(k0.e);
            double f4 = j3.g.a(k0.e);
            double f5 = (double)(((Double)j2.c.apply(k0)));
            if(d.e(f1, f5) < f3) {
                f5 = j.d(f1, f3);
            }
            double f6 = (double)(((Double)j3.c.apply(k0)));
            if(d.e(f1, f6) < f4) {
                f6 = j.d(f1, f4);
            }
            if(z) {
                f5 = j.d(f1, f3);
                f6 = j.d(f1, f4);
            }
            if((f6 - f5) * f2 < f) {
                double f7 = f * f2;
                f6 = w2.a(0.0, 100.0, f5 + f7);
                if((f6 - f5) * f2 < f) {
                    f5 = w2.a(0.0, 100.0, f6 - f7);
                }
            }
            if(Double.compare(50.0, f5) <= 0 && f5 < 60.0) {
                if(f2 > 0.0) {
                    return z3 ? 60.0 : Math.max(f6, f * f2 + 60.0);
                }
                return z3 ? 49.0 : Math.min(f6, f * f2 + 49.0);
            }
            if(50.0 <= f6 && f6 < 60.0) {
                if(z1) {
                    if(f2 > 0.0) {
                        return z3 ? 60.0 : Math.max(f6, f * f2 + 60.0);
                    }
                    return z3 ? 49.0 : Math.min(f6, f * f2 + 49.0);
                }
                if(f2 > 0.0) {
                    return z3 ? f5 : 60.0;
                }
                return z3 ? f5 : 49.0;
            }
            return z3 ? f5 : f6;
        }
        double f8 = (double)(((Double)this.c.apply(k0)));
        Function function1 = this.e;
        if(function1 == null) {
            return f8;
        }
        double f9 = ((j)function1.apply(k0)).j(k0);
        double f10 = this.g.a(k0.e);
        if(d.e(f9, f8) < f10) {
            f8 = j.d(f9, f10);
        }
        if(z) {
            f8 = j.d(f9, f10);
        }
        double f11 = 60.0;
        if(!this.d || 50.0 > f8 || f8 >= 60.0) {
            f11 = f8;
        }
        else if(d.e(49.0, f9) >= f10) {
            f11 = 49.0;
        }
        if(this.f != null) {
            double f12 = ((j)this.e.apply(k0)).j(k0);
            double f13 = ((j)this.f.apply(k0)).j(k0);
            double f14 = Math.max(f12, f13);
            double f15 = Math.min(f12, f13);
            if(d.e(f14, f11) >= f10 && d.e(f15, f11) >= f10) {
                return f11;
            }
            double f16 = d.c(f14, f10);
            double f17 = d.a(f15, f10);
            ArrayList arrayList0 = new ArrayList();
            int v = Double.compare(f16, -1.0);
            if(v != 0) {
                arrayList0.add(f16);
            }
            int v1 = Double.compare(f17, -1.0);
            if(v1 != 0) {
                arrayList0.add(f17);
            }
            if(!j.n(f12) && !j.n(f13)) {
                if(arrayList0.size() == 1) {
                    return (double)(((Double)arrayList0.get(0)));
                }
                return v1 == 0 ? 0.0 : f17;
            }
            return v == 0 ? 100.0 : f16;
        }
        return f11;
    }

    private static T2 k(T2 t20, k k0) [...] // Inlined contents

    private static Double l(l l0, k k0) {
        return l0.e();
    }

    public static boolean m(double f) {
        return Math.round(f) <= 49L;
    }

    public static boolean n(double f) {
        return Math.round(f) < 60L;
    }
}

