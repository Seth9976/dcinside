package S0;

import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.m;

public final class l extends i {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private int E;
    private int F;
    @m
    private Throwable G;
    @y4.l
    private e H;
    @y4.l
    private v I;
    private long J;
    private long K;
    @m
    private c L;
    @m
    private a M;
    @m
    private String s;
    @m
    private String t;
    @m
    private Object u;
    @m
    private Object v;
    @m
    private Object w;
    private long x;
    private long y;
    private long z;

    public l(@y4.l S0.m m0) {
        L.p(m0, "infra");
        super(m0);
        this.x = -1L;
        this.y = -1L;
        this.z = -1L;
        this.A = -1L;
        this.B = -1L;
        this.C = -1L;
        this.E = -1;
        this.F = -1;
        this.H = e.d;
        this.I = v.d;
        this.J = -1L;
        this.K = -1L;
    }

    @m
    public final Object J() {
        return this.v;
    }

    @m
    public final c K() {
        return this.L;
    }

    @m
    public final Object L() {
        return this.M;
    }

    @y4.l
    public final e M() {
        return this.H;
    }

    public final long N() {
        return this.J;
    }

    public final void O() {
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.D = false;
        this.E = -1;
        this.F = -1;
        this.G = null;
        this.H = e.d;
        this.I = v.d;
        this.L = null;
        this.M = null;
        this.P();
        this.s();
    }

    public final void P() {
        this.B = -1L;
        this.C = -1L;
        this.x = -1L;
        this.z = -1L;
        this.A = -1L;
        this.J = -1L;
        this.K = -1L;
        this.k().clear();
        this.D(false);
        this.y(null);
        this.E(null);
    }

    public final void Q(@m Object object0) {
        this.v = object0;
    }

    public final void R(long v) {
        this.A = v;
    }

    public final void S(long v) {
        this.z = v;
    }

    public final void T(@m String s) {
        this.s = s;
    }

    public final void U(long v) {
        this.y = v;
    }

    public final void V(long v) {
        this.x = v;
    }

    public final void W(@m c c0) {
        this.L = c0;
    }

    public final void X(@m Throwable throwable0) {
        this.G = throwable0;
    }

    public final void Y(@m a b$a0) {
        this.M = b$a0;
    }

    public final void Z(@m Object object0) {
        this.w = object0;
    }

    public final void a0(@y4.l e e0) {
        L.p(e0, "<set-?>");
        this.H = e0;
    }

    public final void b0(@m Object object0) {
        this.u = object0;
    }

    public final void c0(long v) {
        this.C = v;
    }

    public final void d0(long v) {
        this.B = v;
    }

    public final void e0(long v) {
        this.K = v;
    }

    public final void f0(int v) {
        this.F = v;
    }

    public final void g0(int v) {
        this.E = v;
    }

    public final void h0(boolean z) {
        this.D = z;
    }

    public final void i0(@m String s) {
        this.t = s;
    }

    public final void j0(long v) {
        this.J = v;
    }

    public final void k0(boolean z) {
        this.I = z ? v.e : v.f;
    }

    @y4.l
    public final f l0() {
        return new f(this.j(), this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.f(), this.n(), this.D, this.E, this.F, this.G, this.I, this.J, this.K, this.L, this.M, this.a(), this.o(), this.c(), this.d(), this.b(), this.r(), this.q(), this.l(), this.p(), u.V5(this.k()), this.m(), this.h(), this.i(), this.g(), this.e());
    }
}

