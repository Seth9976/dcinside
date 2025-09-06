package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public final class v2 {
    private j A3(k k0) {
        return this.d6();
    }

    @NonNull
    public j A5() {
        return j.f("neutral_variant_palette_key_color", new c2(), new d2());
    }

    @NonNull
    public j A6() {
        return j.f("text_secondary_and_tertiary_inverse_disabled", new V0(), new g1());
    }

    // 去混淆评级： 低(20)
    private static Double B2(k k0) {
        return k0.d ? 80.0 : 30.0;
    }

    // 去混淆评级： 低(20)
    private static Double B4(k k0) {
        return v2.s2(k0) ? 70.0 : 80.0;
    }

    @NonNull
    public j B5() {
        return new j("on_background", new o1(), new p1(), false, new q1(this), null, new e(3.0, 3.0, 4.5, 7.0), null);
    }

    // 去混淆评级： 低(20)
    private static X2 B6(k k0) {
        return k0.d ? X2.a(30.0) : X2.a(80.0);
    }

    // 去混淆评级： 低(20)
    private static Double C3(k k0) {
        return v2.s2(k0) ? 25.0 : 30.0;
    }

    private U2 C4(k k0) {
        return new U2(this.d6(), this.e6(), 10.0, V2.b, true);
    }

    @NonNull
    public j C5() {
        return new j("on_error", new O1(), new P1(), false, new Q1(this), null, new e(4.5, 7.0, 11.0, 21.0), null);
    }

    // 去混淆评级： 低(20)
    private static Double D2(k k0) {
        return k0.d ? 80.0 : 40.0;
    }

    private j D3(k k0) {
        return this.e6();
    }

    @NonNull
    public j D5() {
        return new j("on_error_container", new h0(), new i0(), false, new j0(this), null, new e(4.5, 7.0, 11.0, 21.0), null);
    }

    private U2 E2(k k0) {
        return new U2(this.l2(), this.k2(), 15.0, V2.c, false);
    }

    private j E3(k k0) {
        return this.d6();
    }

    private static Double E4(k k0) {
        return k0.g.h().e();
    }

    @NonNull
    public j E5() {
        return new j("on_primary", new w1(), new x1(), false, new y1(this), null, new e(4.5, 7.0, 11.0, 21.0), null);
    }

    @NonNull
    public j F5() {
        return new j("on_primary_container", new T1(), new U1(this), false, new V1(this), null, new e(4.5, 7.0, 11.0, 21.0), null);
    }

    // 去混淆评级： 低(20)
    private static Double G2(k k0) {
        return k0.d ? 30.0 : 90.0;
    }

    // 去混淆评级： 低(20)
    private static Double G3(k k0) {
        return k0.d ? 90.0 : 10.0;
    }

    private static Double G4(k k0) {
        return 0.0;
    }

    @NonNull
    public j G5() {
        return new j("on_primary_fixed", new P(), new Q(), false, new S(this), new T(this), new e(4.5, 7.0, 11.0, 21.0), null);
    }

    private U2 H2(k k0) {
        return new U2(this.l2(), this.k2(), 15.0, V2.c, false);
    }

    @NonNull
    public j H5() {
        return new j("on_primary_fixed_variant", new G1(), new H1(), false, new I1(this), new J1(this), new e(3.0, 4.5, 7.0, 11.0), null);
    }

    // 去混淆评级： 低(20)
    private static Double I3(k k0) {
        return k0.d ? 80.0 : 30.0;
    }

    // 去混淆评级： 低(20)
    private static Double I4(k k0) {
        return k0.d ? 6.0 : 98.0;
    }

    @NonNull
    public j I5() {
        return new j("on_secondary", new o(), new p(), false, new q(this), null, new e(4.5, 7.0, 11.0, 21.0), null);
    }

    // 去混淆评级： 低(20)
    private static Double J2(k k0) {
        return k0.d ? 20.0 : 95.0;
    }

    @NonNull
    public j J5() {
        return new j("on_secondary_container", new M(), new N(this), false, new O(this), null, new e(4.5, 7.0, 11.0, 21.0), null);
    }

    private j K2(k k0) {
        return this.q2();
    }

    private static Double K3(k k0) {
        if(v2.s2(k0)) {
            return k0.d ? 10.0 : 90.0;
        }
        return k0.d ? 20.0 : 100.0;
    }

    // 去混淆评级： 低(20)
    private static Double K4(k k0) {
        return k0.d ? 24.0 : 98.0;
    }

    @NonNull
    public j K5() {
        return new j("on_secondary_fixed", new B(), new C(), false, new D(this), new E(this), new e(4.5, 7.0, 11.0, 21.0), null);
    }

    private j L3(k k0) {
        return this.r6();
    }

    @NonNull
    public j L5() {
        return new j("on_secondary_fixed_variant", new y0(), new z0(), false, new A0(this), new B0(this), new e(3.0, 4.5, 7.0, 11.0), null);
    }

    // 去混淆评级： 低(20)
    private static Double M2(k k0) {
        return k0.d ? 40.0 : 80.0;
    }

    // 去混淆评级： 低(20)
    private static Double M4(k k0) {
        return k0.d ? 12.0 : 94.0;
    }

    @NonNull
    public j M5() {
        return new j("on_surface", new Y1(), new j2(), false, new u2(this), null, new e(4.5, 7.0, 11.0, 21.0), null);
    }

    private j N2(k k0) {
        return this.q2();
    }

    private Double N3(k k0) {
        if(v2.s2(k0)) {
            return k0.d ? 0.0 : 100.0;
        }
        if(!v2.r2(k0)) {
            return k0.d ? 90.0 : 10.0;
        }
        return j.d(((double)(((Double)this.s6().c.apply(k0)))), 4.5);
    }

    @NonNull
    public j N5() {
        return new j("on_surface_variant", new c0(), new d0(), false, new u2(this), null, new e(3.0, 4.5, 7.0, 11.0), null);
    }

    private j O3(k k0) {
        return this.s6();
    }

    // 去混淆评级： 低(20)
    private static Double O4(k k0) {
        return k0.d ? 17.0 : 92.0;
    }

    @NonNull
    public j O5() {
        return new j("on_tertiary", new r1(), new C1(), false, new N1(this), null, new e(4.5, 7.0, 11.0, 21.0), null);
    }

    // 去混淆评级： 低(20)
    private static Double P2(k k0) {
        return k0.d ? 90.0 : 20.0;
    }

    @NonNull
    public j P5() {
        return new j("on_tertiary_container", new I(), new K(this), false, new L(this), null, new e(4.5, 7.0, 11.0, 21.0), null);
    }

    // 去混淆评级： 低(20)
    private static Double Q3(k k0) {
        return v2.s2(k0) ? 100.0 : 10.0;
    }

    // 去混淆评级： 低(20)
    private static Double Q4(k k0) {
        return k0.d ? 22.0 : 90.0;
    }

    @NonNull
    public j Q5() {
        return new j("on_tertiary_fixed", new X0(), new Y0(), false, new Z0(this), new a1(this), new e(4.5, 7.0, 11.0, 21.0), null);
    }

    private static Double R2(k k0) {
        return k0.i.h().e();
    }

    private j R3(k k0) {
        return this.u6();
    }

    @NonNull
    public j R5() {
        return new j("on_tertiary_fixed_variant", new L0(), new M0(), false, new N0(this), new O0(this), new e(3.0, 4.5, 7.0, 11.0), null);
    }

    private j S3(k k0) {
        return this.t6();
    }

    // 去混淆评级： 低(20)
    private static Double S4(k k0) {
        return k0.d ? 10.0 : 96.0;
    }

    @NonNull
    public j S5() {
        return new j("outline", new w(), new x(), false, new u2(this), null, new e(1.5, 3.0, 4.5, 7.0), null);
    }

    private static Double T2(k k0) {
        return k0.j.h().e();
    }

    @NonNull
    public j T5() {
        return new j("outline_variant", new s1(), new t1(), false, new u2(this), null, new e(1.0, 1.0, 3.0, 7.0), null);
    }

    // 去混淆评级： 低(20)
    private static Double U3(k k0) {
        return v2.s2(k0) ? 90.0 : 30.0;
    }

    // 去混淆评级： 低(20)
    private static Double U4(k k0) {
        return k0.d ? 4.0 : 100.0;
    }

    static double U5(l l0, k k0) {
        l l1 = l0.f(v2.B6(k0));
        return !j.n(l0.e()) || j.m(l1.e()) ? j.c(l1.e()) : j.c(l0.e());
    }

    // 去混淆评级： 低(20)
    private static Double V2(k k0) {
        return k0.d ? 90.0 : 10.0;
    }

    private j V3(k k0) {
        return this.u6();
    }

    @NonNull
    public j V5() {
        return new j("primary", new t0(), new u0(), true, new u2(this), null, new e(3.0, 4.5, 7.0, 11.0), new v0(this));
    }

    private j W2(k k0) {
        return this.g2();
    }

    private j W3(k k0) {
        return this.t6();
    }

    // 去混淆评级： 低(20)
    private static Double W4(k k0) {
        return k0.d ? 6.0 : 87.0;
    }

    @NonNull
    public j W5() {
        return new j("primary_container", new h1(), new i1(), true, new u2(this), null, new e(1.0, 1.0, 3.0, 7.0), new j1(this));
    }

    @NonNull
    public j X5() {
        return new j("primary_fixed", new l2(), new m2(), true, new u2(this), null, new e(1.0, 1.0, 3.0, 7.0), new n2(this));
    }

    // 去混淆评级： 低(20)
    private static Double Y2(k k0) {
        return k0.d ? 20.0 : 100.0;
    }

    // 去混淆评级： 低(20)
    private static Double Y3(k k0) {
        return k0.d ? 60.0 : 50.0;
    }

    // 去混淆评级： 低(20)
    private static Double Y4(k k0) {
        return k0.d ? 80.0 : 40.0;
    }

    @NonNull
    public j Y5() {
        return new j("primary_fixed_dim", new o2(), new p2(), true, new u2(this), null, new e(1.0, 1.0, 3.0, 7.0), new q2(this));
    }

    private j Z2(k k0) {
        return this.k2();
    }

    @NonNull
    public j Z5() {
        return j.f("primary_palette_key_color", new I0(), new J0());
    }

    // 去混淆评级： 低(20)
    private static Double a4(k k0) {
        return k0.d ? 30.0 : 80.0;
    }

    // 去混淆评级： 低(20)
    private static Double a5(k k0) {
        return k0.d ? 30.0 : 90.0;
    }

    @NonNull
    public j a6() {
        return new j("scrim", new w0(), new x0(), false, null, null, null, null);
    }

    // 去混淆评级： 低(20)
    private static Double b3(k k0) {
        return k0.d ? 90.0 : 10.0;
    }

    @NonNull
    public j b6() {
        return new j("secondary", new r(), new s(), true, new u2(this), null, new e(3.0, 4.5, 7.0, 11.0), new t(this));
    }

    private j c3(k k0) {
        return this.l2();
    }

    private static Double c4(k k0) {
        if(v2.s2(k0)) {
            return k0.d ? 100.0 : 0.0;
        }
        return k0.d ? 80.0 : 40.0;
    }

    private static Double c5(k k0) {
        if(v2.s2(k0)) {
            return k0.d ? 90.0 : 25.0;
        }
        return k0.d ? 80.0 : 40.0;
    }

    @NonNull
    public j c6() {
        return new j("secondary_container", new T0(), new U0(), true, new u2(this), null, new e(1.0, 1.0, 3.0, 7.0), new W0(this));
    }

    private U2 d4(k k0) {
        return new U2(this.W5(), this.V5(), 15.0, V2.c, false);
    }

    private U2 d5(k k0) {
        return new U2(this.s6(), this.r6(), 15.0, V2.c, false);
    }

    @NonNull
    public j d6() {
        return new j("secondary_fixed", new D1(), new E1(), true, new u2(this), null, new e(1.0, 1.0, 3.0, 7.0), new F1(this));
    }

    private static Double e3(k k0) {
        if(v2.s2(k0)) {
            return k0.d ? 10.0 : 90.0;
        }
        return k0.d ? 20.0 : 100.0;
    }

    @NonNull
    public j e6() {
        return new j("secondary_fixed_dim", new W1(), new X1(), true, new u2(this), null, new e(1.0, 1.0, 3.0, 7.0), new Z1(this));
    }

    private j f3(k k0) {
        return this.V5();
    }

    private static Double f4(k k0) {
        if(v2.r2(k0)) {
            return v2.U5(k0.b, k0);
        }
        if(v2.s2(k0)) {
            return k0.d ? 85.0 : 25.0;
        }
        return k0.d ? 30.0 : 90.0;
    }

    private static Double f5(k k0) {
        if(v2.s2(k0)) {
            return k0.d ? 60.0 : 49.0;
        }
        if(!v2.r2(k0)) {
            return k0.d ? 30.0 : 90.0;
        }
        double f = v2.U5(k0.h.f(k0.b.e()), k0);
        return g.a(k0.h.f(f)).e();
    }

    @NonNull
    public j f6() {
        return j.f("secondary_palette_key_color", new P0(), new Q0());
    }

    @NonNull
    public j g2() {
        return new j("background", new k1(), new l1(), true, null, null, null, null);
    }

    private U2 g4(k k0) {
        return new U2(this.W5(), this.V5(), 15.0, V2.c, false);
    }

    private U2 g5(k k0) {
        return new U2(this.s6(), this.r6(), 15.0, V2.c, false);
    }

    @NonNull
    public j g6() {
        return new j("shadow", new g2(), new h2(), false, null, null, null, null);
    }

    @NonNull
    public j h2() {
        return j.f("control_activated", new G0(), new H0());
    }

    private Double h3(k k0) {
        if(v2.r2(k0)) {
            return j.d(((double)(((Double)this.W5().c.apply(k0)))), 4.5);
        }
        if(v2.s2(k0)) {
            return k0.d ? 0.0 : 100.0;
        }
        return k0.d ? 90.0 : 10.0;
    }

    @NonNull
    public j h6() {
        return new j("surface", new n(), new K0(), true, null, null, null, null);
    }

    @NonNull
    public j i2() {
        return new j("control_highlight", new d1(), new e1(), false, null, null, null, null, new f1());
    }

    private j i3(k k0) {
        return this.W5();
    }

    // 去混淆评级： 低(20)
    private static Double i4(k k0) {
        return v2.s2(k0) ? 40.0 : 90.0;
    }

    // 去混淆评级： 低(20)
    private static Double i5(k k0) {
        return v2.s2(k0) ? 40.0 : 90.0;
    }

    @NonNull
    public j i6() {
        return new j("surface_bright", new u1(), new v1(), true, null, null, null, null);
    }

    @NonNull
    public j j2() {
        return j.f("control_normal", new r0(), new C0());
    }

    private U2 j4(k k0) {
        return new U2(this.X5(), this.Y5(), 10.0, V2.b, true);
    }

    private U2 j5(k k0) {
        return new U2(this.t6(), this.u6(), 10.0, V2.b, true);
    }

    @NonNull
    public j j6() {
        return new j("surface_container", new a0(), new b0(), true, null, null, null, null);
    }

    @NonNull
    public j k2() {
        return new j("error", new U(), new W(), true, new u2(this), null, new e(3.0, 4.5, 7.0, 11.0), new X(this));
    }

    // 去混淆评级： 低(20)
    private static Double k3(k k0) {
        return v2.s2(k0) ? 100.0 : 10.0;
    }

    @NonNull
    public j k6() {
        return new j("surface_container_high", new m1(), new n1(), true, null, null, null, null);
    }

    @NonNull
    public j l2() {
        return new j("error_container", new m0(), new n0(), true, new u2(this), null, new e(1.0, 1.0, 3.0, 7.0), new o0(this));
    }

    private j l3(k k0) {
        return this.Y5();
    }

    // 去混淆评级： 低(20)
    private static Double l4(k k0) {
        return v2.s2(k0) ? 30.0 : 80.0;
    }

    // 去混淆评级： 低(20)
    private static Double l5(k k0) {
        return v2.s2(k0) ? 30.0 : 80.0;
    }

    @NonNull
    public j l6() {
        return new j("surface_container_highest", new i2(), new k2(), true, null, null, null, null);
    }

    static double m2(double f, double f1, double f2, boolean z) {
        l l0 = l.a(f, f1, f2);
        if(l0.c() < f1) {
            double f3 = l0.c();
            l l1 = l0;
            double f4 = f2;
            while(l1.c() < f1) {
                f4 += (z ? -1.0 : 1.0);
                l l2 = l.a(f, f1, f4);
                if(f3 > l2.c() || Math.abs(l2.c() - f1) < 0.4) {
                    break;
                }
                if(Math.abs(l2.c() - f1) < Math.abs(l1.c() - f1)) {
                    l1 = l2;
                }
                f3 = Math.max(f3, l2.c());
            }
            return f4;
        }
        return f2;
    }

    private j m3(k k0) {
        return this.X5();
    }

    private U2 m4(k k0) {
        return new U2(this.X5(), this.Y5(), 10.0, V2.b, true);
    }

    private U2 m5(k k0) {
        return new U2(this.t6(), this.u6(), 10.0, V2.b, true);
    }

    @NonNull
    public j m6() {
        return new j("surface_container_low", new R0(), new S0(), true, null, null, null, null);
    }

    // 去混淆评级： 低(20)
    @NonNull
    public j n2(@NonNull k k0) {
        return k0.d ? this.i6() : this.o6();
    }

    @NonNull
    public j n6() {
        return new j("surface_container_lowest", new u(), new v(), true, null, null, null, null);
    }

    @NonNull
    public j o2() {
        return new j("inverse_on_surface", new F(), new G(), false, new H(this), null, new e(4.5, 7.0, 11.0, 21.0), null);
    }

    // 去混淆评级： 低(20)
    private static Double o3(k k0) {
        return v2.s2(k0) ? 90.0 : 30.0;
    }

    private static Double o4(k k0) {
        return k0.f.h().e();
    }

    private static Double o5(k k0) {
        return k0.h.h().e();
    }

    @NonNull
    public j o6() {
        return new j("surface_dim", new V(), new g0(), true, null, null, null, null);
    }

    @NonNull
    public j p2() {
        return new j("inverse_primary", new z1(), new A1(), false, new B1(this), null, new e(3.0, 4.5, 7.0, 11.0), null);
    }

    private j p3(k k0) {
        return this.Y5();
    }

    @NonNull
    public j p6() {
        return new j("surface_tint", new z(), new A(), true, null, null, null, null);
    }

    @NonNull
    public j q2() {
        return new j("inverse_surface", new e0(), new f0(), false, null, null, null, null);
    }

    private j q3(k k0) {
        return this.X5();
    }

    private static Double q4(k k0) {
        return 0.0;
    }

    // 去混淆评级： 低(20)
    private static Double q5(k k0) {
        return k0.d ? 10.0 : 90.0;
    }

    @NonNull
    public j q6() {
        return new j("surface_variant", new a2(), new b2(), true, null, null, null, null);
    }

    private static boolean r2(k k0) {
        return k0.c == W2.f || k0.c == W2.g;
    }

    @NonNull
    public j r6() {
        return new j("tertiary", new D0(), new E0(), true, new u2(this), null, new e(3.0, 4.5, 7.0, 11.0), new F0(this));
    }

    private static boolean s2(k k0) {
        return k0.c == W2.a;
    }

    private static Double s3(k k0) {
        double f = 100.0;
        if(v2.s2(k0)) {
            if(k0.d) {
                f = 10.0;
            }
            return f;
        }
        if(k0.d) {
            f = 20.0;
        }
        return f;
    }

    // 去混淆评级： 低(20)
    private static Double s4(k k0) {
        return k0.d ? 80.0 : 40.0;
    }

    // 去混淆评级： 低(20)
    private static Double s5(k k0) {
        return k0.d ? 10.0 : 90.0;
    }

    @NonNull
    public j s6() {
        return new j("tertiary_container", new r2(), new s2(), true, new u2(this), null, new e(1.0, 1.0, 3.0, 7.0), new t2(this));
    }

    private j t3(k k0) {
        return this.b6();
    }

    private U2 t4(k k0) {
        return new U2(this.c6(), this.b6(), 15.0, V2.c, false);
    }

    @NonNull
    public j t6() {
        return new j("tertiary_fixed", new p0(), new q0(), true, new u2(this), null, new e(1.0, 1.0, 3.0, 7.0), new s0(this));
    }

    // 去混淆评级： 低(20)
    private static Double u2(k k0) {
        return k0.d ? 6.0 : 98.0;
    }

    // 去混淆评级： 低(20)
    private static Double u5(k k0) {
        return k0.d ? 10.0 : 90.0;
    }

    @NonNull
    public j u6() {
        return new j("tertiary_fixed_dim", new K1(), new L1(), true, new u2(this), null, new e(1.0, 1.0, 3.0, 7.0), new M1(this));
    }

    private Double v3(k k0) {
        if(!v2.r2(k0)) {
            return k0.d ? 90.0 : 10.0;
        }
        return j.d(((double)(((Double)this.c6().c.apply(k0)))), 4.5);
    }

    private static Double v4(k k0) {
        double f = 30.0;
        double f1 = k0.d ? 30.0 : 90.0;
        if(v2.s2(k0)) {
            if(!k0.d) {
                f = 85.0;
            }
            return f;
        }
        if(!v2.r2(k0)) {
            return f1;
        }
        double f2 = v2.m2(k0.g.g(), k0.g.e(), f1, !k0.d);
        return v2.U5(k0.g.f(f2), k0);
    }

    @NonNull
    public j v6() {
        return j.f("tertiary_palette_key_color", new b1(), new c1());
    }

    // 去混淆评级： 低(20)
    private static Double w2(k k0) {
        return k0.d ? 30.0 : 90.0;
    }

    private j w3(k k0) {
        return this.c6();
    }

    private U2 w4(k k0) {
        return new U2(this.c6(), this.b6(), 15.0, V2.c, false);
    }

    // 去混淆评级： 低(20)
    private static Double w5(k k0) {
        return k0.d ? 30.0 : 80.0;
    }

    @NonNull
    public j w6() {
        return j.f("text_hint_inverse", new e2(), new f2());
    }

    @NonNull
    public j x6() {
        return j.f("text_primary_inverse", new Y(), new Z());
    }

    // 去混淆评级： 低(20)
    private static Double y2(k k0) {
        return k0.d ? 100.0 : 0.0;
    }

    private static Double y3(k k0) {
        return 10.0;
    }

    // 去混淆评级： 低(20)
    private static Double y4(k k0) {
        return v2.s2(k0) ? 80.0 : 90.0;
    }

    // 去混淆评级： 低(20)
    private static Double y5(k k0) {
        return k0.d ? 10.0 : 90.0;
    }

    @NonNull
    public j y6() {
        return j.f("text_primary_inverse_disable_only", new R1(), new S1());
    }

    // 去混淆评级： 低(20)
    private static Double z2(k k0) {
        return k0.d ? 0.2 : 0.12;
    }

    private j z3(k k0) {
        return this.e6();
    }

    private U2 z4(k k0) {
        return new U2(this.d6(), this.e6(), 10.0, V2.b, true);
    }

    @NonNull
    public j z5() {
        return j.f("neutral_palette_key_color", new y(), new J());
    }

    @NonNull
    public j z6() {
        return j.f("text_secondary_and_tertiary_inverse", new k0(), new l0());
    }
}

