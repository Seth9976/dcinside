package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.Arrays;

public final class U1 {
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;
    private static final int f = 8;
    private static final U1 g;

    static {
        U1.g = new U1(0, new int[0], new Object[0], false);
    }

    private U1() {
        this(0, new int[8], new Object[8], true);
    }

    private U1(int v, int[] arr_v, Object[] arr_object, boolean z) {
        this.d = -1;
        this.a = v;
        this.b = arr_v;
        this.c = arr_object;
        this.e = z;
    }

    void a() {
        if(!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    private void b(int v) {
        int[] arr_v = this.b;
        if(v > arr_v.length) {
            int v1 = this.a + this.a / 2;
            if(v1 >= v) {
                v = v1;
            }
            if(v < 8) {
                v = 8;
            }
            this.b = Arrays.copyOf(arr_v, v);
            this.c = Arrays.copyOf(this.c, v);
        }
    }

    public static U1 c() {
        return U1.g;
    }

    public int d() {
        int v5;
        int v = this.d;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.a; ++v1) {
            int v3 = this.b[v1];
            int v4 = v3 >>> 3;
            switch(v3 & 7) {
                case 0: {
                    v5 = B.n0(v4, ((long)(((Long)this.c[v1]))));
                    break;
                }
                case 1: {
                    v5 = B.B(v4, ((long)(((Long)this.c[v1]))));
                    break;
                }
                case 2: {
                    v5 = B.t(v4, ((u)this.c[v1]));
                    break;
                }
                case 3: {
                    v5 = B.k0(v4) * 2 + ((U1)this.c[v1]).d();
                    break;
                }
                case 5: {
                    v5 = B.z(v4, ((int)(((Integer)this.c[v1]))));
                    break;
                }
                default: {
                    throw new IllegalStateException(y0.f());
                }
            }
            v2 += v5;
        }
        this.d = v2;
        return v2;
    }

    public int e() {
        int v = this.d;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.a; ++v1) {
            v2 += B.X(c2.a(this.b[v1]), ((u)this.c[v1]));
        }
        this.d = v2;
        return v2;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof U1 ? this.a == ((U1)object0).a && U1.s(this.b, ((U1)object0).b, this.a) && U1.p(this.c, ((U1)object0).c, this.a) : false;
    }

    private static int f(int[] arr_v, int v) {
        int v1 = 17;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 = v1 * 0x1F + arr_v[v2];
        }
        return v1;
    }

    private static int g(Object[] arr_object, int v) {
        int v1 = 17;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 = v1 * 0x1F + arr_object[v2].hashCode();
        }
        return v1;
    }

    public void h() {
        this.e = false;
    }

    @Override
    public int hashCode() {
        return ((this.a + 0x20F) * 0x1F + U1.f(this.b, this.a)) * 0x1F + U1.g(this.c, this.a);
    }

    boolean i(int v, z z0) throws IOException {
        this.a();
        switch(v & 7) {
            case 0: {
                this.r(v, z0.H());
                return true;
            }
            case 1: {
                this.r(v, z0.C());
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            U1 u10 = new U1();
                            u10.j(z0);
                            z0.a(v >>> 3 << 3 | 4);
                            this.r(v, u10);
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw y0.f();
                            }
                            this.r(v, z0.B());
                            return true;
                        }
                    }
                }
                this.r(v, z0.y());
                return true;
            }
        }
    }

    private U1 j(z z0) throws IOException {
        do {
            int v = z0.Z();
        }
        while(v != 0 && this.i(v, z0));
        return this;
    }

    @x
    U1 k(U1 u10) {
        if(u10.equals(U1.c())) {
            return this;
        }
        this.a();
        int v = this.a + u10.a;
        this.b(v);
        System.arraycopy(u10.b, 0, this.b, this.a, u10.a);
        System.arraycopy(u10.c, 0, this.c, this.a, u10.a);
        this.a = v;
        return this;
    }

    U1 l(int v, u u0) {
        this.a();
        if(v == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        this.r(v << 3 | 2, u0);
        return this;
    }

    U1 m(int v, int v1) {
        this.a();
        if(v == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        this.r(v << 3, ((long)v1));
        return this;
    }

    static U1 n(U1 u10, U1 u11) {
        int v = u10.a + u11.a;
        int[] arr_v = Arrays.copyOf(u10.b, v);
        System.arraycopy(u11.b, 0, arr_v, u10.a, u11.a);
        Object[] arr_object = Arrays.copyOf(u10.c, v);
        System.arraycopy(u11.c, 0, arr_object, u10.a, u11.a);
        return new U1(v, arr_v, arr_object, true);
    }

    static U1 o() {
        return new U1();
    }

    private static boolean p(Object[] arr_object, Object[] arr_object1, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(!arr_object[v1].equals(arr_object1[v1])) {
                return false;
            }
        }
        return true;
    }

    final void q(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < this.a; ++v1) {
            T0.d(stringBuilder0, v, String.valueOf(c2.a(this.b[v1])), this.c[v1]);
        }
    }

    void r(int v, Object object0) {
        this.a();
        this.b(this.a + 1);
        int v1 = this.a;
        this.b[v1] = v;
        this.c[v1] = object0;
        this.a = v1 + 1;
    }

    private static boolean s(int[] arr_v, int[] arr_v1, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(arr_v[v1] != arr_v1[v1]) {
                return false;
            }
        }
        return true;
    }

    public void t(B b0) throws IOException {
        for(int v = 0; v < this.a; ++v) {
            b0.l1(c2.a(this.b[v]), ((u)this.c[v]));
        }
    }

    void u(e2 e20) throws IOException {
        if(e20.fieldOrder() == a.b) {
            for(int v = this.a - 1; v >= 0; --v) {
                e20.writeMessageSetItem(c2.a(this.b[v]), this.c[v]);
            }
            return;
        }
        for(int v1 = 0; v1 < this.a; ++v1) {
            e20.writeMessageSetItem(c2.a(this.b[v1]), this.c[v1]);
        }
    }

    private static void v(int v, Object object0, e2 e20) throws IOException {
        switch(v & 7) {
            case 0: {
                e20.writeInt64(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 1: {
                e20.writeFixed64(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 2: {
                e20.f(v >>> 3, ((u)object0));
                return;
            }
            case 3: {
                if(e20.fieldOrder() == a.a) {
                    e20.writeStartGroup(v >>> 3);
                    ((U1)object0).x(e20);
                    e20.writeEndGroup(v >>> 3);
                    return;
                }
                e20.writeEndGroup(v >>> 3);
                ((U1)object0).x(e20);
                e20.writeStartGroup(v >>> 3);
                return;
            }
            case 5: {
                e20.writeFixed32(v >>> 3, ((int)(((Integer)object0))));
                return;
            }
            default: {
                throw new RuntimeException(y0.f());
            }
        }
    }

    public void w(B b0) throws IOException {
        for(int v = 0; v < this.a; ++v) {
            int v1 = this.b[v];
            int v2 = v1 >>> 3;
            switch(v1 & 7) {
                case 0: {
                    b0.writeUInt64(v2, ((long)(((Long)this.c[v]))));
                    break;
                }
                case 1: {
                    b0.writeFixed64(v2, ((long)(((Long)this.c[v]))));
                    break;
                }
                case 2: {
                    b0.f(v2, ((u)this.c[v]));
                    break;
                }
                case 3: {
                    b0.t1(v2, 3);
                    ((U1)this.c[v]).w(b0);
                    b0.t1(v2, 4);
                    break;
                }
                case 5: {
                    b0.writeFixed32(v2, ((int)(((Integer)this.c[v]))));
                    break;
                }
                default: {
                    throw y0.f();
                }
            }
        }
    }

    public void x(e2 e20) throws IOException {
        if(this.a == 0) {
            return;
        }
        if(e20.fieldOrder() == a.a) {
            for(int v = 0; v < this.a; ++v) {
                U1.v(this.b[v], this.c[v], e20);
            }
            return;
        }
        for(int v1 = this.a - 1; v1 >= 0; --v1) {
            U1.v(this.b[v1], this.c[v1], e20);
        }
    }
}

