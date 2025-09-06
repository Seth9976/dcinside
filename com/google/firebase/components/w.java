package com.google.firebase.components;

public final class w {
    private final K a;
    private final int b;
    private final int c;

    private w(K k0, int v, int v1) {
        this.a = (K)J.c(k0, "Null dependency anInterface.");
        this.b = v;
        this.c = v1;
    }

    private w(Class class0, int v, int v1) {
        this(K.b(class0), v, v1);
    }

    public static w a(K k0) {
        return new w(k0, 0, 2);
    }

    public static w b(Class class0) {
        return new w(class0, 0, 2);
    }

    private static String c(int v) {
        switch(v) {
            case 0: {
                return "direct";
            }
            case 1: {
                return "provider";
            }
            case 2: {
                return "deferred";
            }
            default: {
                throw new AssertionError("Unsupported injection: " + v);
            }
        }
    }

    public K d() {
        return this.a;
    }

    public boolean e() {
        return this.c == 2;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof w && this.a.equals(((w)object0).a) && this.b == ((w)object0).b && this.c == ((w)object0).c;
    }

    public boolean f() {
        return this.c == 0;
    }

    public boolean g() {
        return this.b == 1;
    }

    public boolean h() {
        return this.b == 2;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c;
    }

    @Deprecated
    public static w i(Class class0) {
        return new w(class0, 0, 0);
    }

    public static w j(K k0) {
        return new w(k0, 0, 1);
    }

    public static w k(Class class0) {
        return new w(class0, 0, 1);
    }

    public static w l(K k0) {
        return new w(k0, 1, 0);
    }

    public static w m(Class class0) {
        return new w(class0, 1, 0);
    }

    public static w n(K k0) {
        return new w(k0, 1, 1);
    }

    public static w o(Class class0) {
        return new w(class0, 1, 1);
    }

    public static w p(K k0) {
        return new w(k0, 2, 0);
    }

    public static w q(Class class0) {
        return new w(class0, 2, 0);
    }

    public static w r(K k0) {
        return new w(k0, 2, 1);
    }

    public static w s(Class class0) {
        return new w(class0, 2, 1);
    }

    @Override
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("Dependency{anInterface=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", type=");
        int v = this.b;
        if(v == 1) {
            s = "required";
        }
        else {
            s = v == 0 ? "optional" : "set";
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", injection=");
        stringBuilder0.append(w.c(this.c));
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

