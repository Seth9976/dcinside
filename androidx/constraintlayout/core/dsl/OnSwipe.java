package androidx.constraintlayout.core.dsl;

public class OnSwipe {
    public static enum Boundary {
        OVERSHOOT,
        BOUNCE_START,
        BOUNCE_END,
        BOUNCE_BOTH;

        private static Boundary[] a() [...] // Inlined contents
    }

    public static enum Drag {
        UP,
        DOWN,
        LEFT,
        RIGHT,
        START,
        END,
        CLOCKWISE,
        ANTICLOCKWISE;

        private static Drag[] a() [...] // Inlined contents
    }

    public static enum Mode {
        VELOCITY,
        SPRING;

        private static Mode[] a() [...] // Inlined contents
    }

    public static enum Side {
        TOP,
        LEFT,
        RIGHT,
        BOTTOM,
        MIDDLE,
        START,
        END;

        private static Side[] a() [...] // Inlined contents
    }

    public static enum TouchUp {
        AUTOCOMPLETE,
        TO_START,
        NEVER_COMPLETE_END,
        TO_END,
        STOP,
        DECELERATE,
        DECELERATE_COMPLETE,
        NEVER_COMPLETE_START;

        private static TouchUp[] a() [...] // Inlined contents
    }

    private Drag a;
    private Side b;
    private String c;
    private String d;
    private TouchUp e;
    private String f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private Boundary o;
    private Mode p;
    public static final int q = 1;
    public static final int r = 2;

    public OnSwipe() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = NaNf;
        this.h = NaNf;
        this.i = NaNf;
        this.j = NaNf;
        this.k = NaNf;
        this.l = NaNf;
        this.m = NaNf;
        this.n = NaNf;
        this.o = null;
        this.p = null;
    }

    public OnSwipe(String s, Side onSwipe$Side0, Drag onSwipe$Drag0) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = NaNf;
        this.h = NaNf;
        this.i = NaNf;
        this.j = NaNf;
        this.k = NaNf;
        this.l = NaNf;
        this.m = NaNf;
        this.n = NaNf;
        this.o = null;
        this.p = null;
        this.c = s;
        this.b = onSwipe$Side0;
        this.a = onSwipe$Drag0;
    }

    public OnSwipe A(float f) {
        this.k = f;
        return this;
    }

    public OnSwipe B(float f) {
        this.l = f;
        return this;
    }

    public OnSwipe C(float f) {
        this.m = f;
        return this;
    }

    public OnSwipe D(float f) {
        this.n = f;
        return this;
    }

    public OnSwipe E(String s) {
        this.c = s;
        return this;
    }

    public OnSwipe F(Side onSwipe$Side0) {
        this.b = onSwipe$Side0;
        return this;
    }

    public Mode a() {
        return this.p;
    }

    public Drag b() {
        return this.a;
    }

    public float c() {
        return this.i;
    }

    public float d() {
        return this.j;
    }

    public String e() {
        return this.d;
    }

    public float f() {
        return this.h;
    }

    public float g() {
        return this.g;
    }

    public TouchUp h() {
        return this.e;
    }

    public String i() {
        return this.f;
    }

    public Boundary j() {
        return this.o;
    }

    public float k() {
        return this.k;
    }

    public float l() {
        return this.l;
    }

    public float m() {
        return this.m;
    }

    public float n() {
        return this.n;
    }

    public String o() {
        return this.c;
    }

    public Side p() {
        return this.b;
    }

    public void q(Mode onSwipe$Mode0) {
        this.p = onSwipe$Mode0;
    }

    public OnSwipe r(Drag onSwipe$Drag0) {
        this.a = onSwipe$Drag0;
        return this;
    }

    public OnSwipe s(int v) {
        this.i = (float)v;
        return this;
    }

    public OnSwipe t(int v) {
        this.j = (float)v;
        return this;
    }

    @Override
    public String toString() [...] // 潜在的解密器

    public OnSwipe u(String s) {
        this.d = s;
        return this;
    }

    public OnSwipe v(int v) {
        this.h = (float)v;
        return this;
    }

    public OnSwipe w(int v) {
        this.g = (float)v;
        return this;
    }

    public OnSwipe x(TouchUp onSwipe$TouchUp0) {
        this.e = onSwipe$TouchUp0;
        return this;
    }

    public OnSwipe y(String s) {
        this.f = s;
        return this;
    }

    public OnSwipe z(Boundary onSwipe$Boundary0) {
        this.o = onSwipe$Boundary0;
        return this;
    }
}

