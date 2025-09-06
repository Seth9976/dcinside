package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

@y
final class l {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.g.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.o.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.h.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.r.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.i.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.q.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.j.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.s.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.t.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.p.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.n.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.k.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.l.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.m.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static final class com.google.crypto.tink.shaded.protobuf.l.b {
        public int a;
        public long b;
        public Object c;
        public final V d;

        com.google.crypto.tink.shaded.protobuf.l.b() {
            this.d = V.d();
        }

        com.google.crypto.tink.shaded.protobuf.l.b(V v0) {
            v0.getClass();
            this.d = v0;
        }
    }

    static int A(int v, byte[] arr_b, int v1, int v2, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) {
        int v3 = l.I(arr_b, v1, l$b0);
        ((r0)t0$k0).addInt(-(l$b0.a & 1) ^ l$b0.a >>> 1);
        while(v3 < v2) {
            int v4 = l.I(arr_b, v3, l$b0);
            if(v != l$b0.a) {
                break;
            }
            v3 = l.I(arr_b, v4, l$b0);
            ((r0)t0$k0).addInt(-(l$b0.a & 1) ^ l$b0.a >>> 1);
        }
        return v3;
    }

    static int B(int v, byte[] arr_b, int v1, int v2, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) {
        int v3 = l.L(arr_b, v1, l$b0);
        ((I0)t0$k0).addLong(-(l$b0.b & 1L) ^ l$b0.b >>> 1);
        while(v3 < v2) {
            int v4 = l.I(arr_b, v3, l$b0);
            if(v != l$b0.a) {
                break;
            }
            v3 = l.L(arr_b, v4, l$b0);
            ((I0)t0$k0).addLong(-(l$b0.b & 1L) ^ l$b0.b >>> 1);
        }
        return v3;
    }

    static int C(byte[] arr_b, int v, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws y0 {
        int v1 = l.I(arr_b, v, l$b0);
        int v2 = l$b0.a;
        if(v2 < 0) {
            throw y0.h();
        }
        if(v2 == 0) {
            l$b0.c = "";
            return v1;
        }
        l$b0.c = new String(arr_b, v1, v2, t0.b);
        return v1 + v2;
    }

    static int D(int v, byte[] arr_b, int v1, int v2, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws y0 {
        int v3 = l.I(arr_b, v1, l$b0);
        int v4 = l$b0.a;
        if(v4 < 0) {
            throw y0.h();
        }
        if(v4 == 0) {
            t0$k0.add("");
            goto label_8;
        }
        else {
            t0$k0.add(new String(arr_b, v3, v4, t0.b));
        }
    alab1:
        while(true) {
            v3 += v4;
            while(true) {
            label_8:
                if(v3 >= v2) {
                    break alab1;
                }
                int v5 = l.I(arr_b, v3, l$b0);
                if(v != l$b0.a) {
                    break alab1;
                }
                v3 = l.I(arr_b, v5, l$b0);
                v4 = l$b0.a;
                if(v4 < 0) {
                    throw y0.h();
                }
                if(v4 != 0) {
                    t0$k0.add(new String(arr_b, v3, v4, t0.b));
                    break;
                }
                t0$k0.add("");
            }
        }
        return v3;
    }

    static int E(int v, byte[] arr_b, int v1, int v2, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws y0 {
        int v3 = l.I(arr_b, v1, l$b0);
        int v4 = l$b0.a;
        if(v4 < 0) {
            throw y0.h();
        }
        if(v4 == 0) {
            t0$k0.add("");
            goto label_10;
        }
        int v5 = v3 + v4;
        if(!Z1.u(arr_b, v3, v5)) {
            throw y0.e();
        }
        t0$k0.add(new String(arr_b, v3, v4, t0.b));
    alab1:
        while(true) {
            v3 = v5;
            while(true) {
            label_10:
                if(v3 >= v2) {
                    return v3;
                }
                int v6 = l.I(arr_b, v3, l$b0);
                if(v != l$b0.a) {
                    return v3;
                }
                v3 = l.I(arr_b, v6, l$b0);
                int v7 = l$b0.a;
                if(v7 < 0) {
                    throw y0.h();
                }
                if(v7 != 0) {
                    v5 = v3 + v7;
                    if(!Z1.u(arr_b, v3, v5)) {
                        break alab1;
                    }
                    t0$k0.add(new String(arr_b, v3, v7, t0.b));
                    break;
                }
                t0$k0.add("");
            }
        }
        throw y0.e();
    }

    static int F(byte[] arr_b, int v, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws y0 {
        int v1 = l.I(arr_b, v, l$b0);
        int v2 = l$b0.a;
        if(v2 < 0) {
            throw y0.h();
        }
        if(v2 == 0) {
            l$b0.c = "";
            return v1;
        }
        l$b0.c = Z1.h(arr_b, v1, v2);
        return v1 + v2;
    }

    static int G(int v, byte[] arr_b, int v1, int v2, U1 u10, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws y0 {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    int v9 = l.L(arr_b, v1, l$b0);
                    u10.r(v, l$b0.b);
                    return v9;
                }
                case 1: {
                    u10.r(v, l.j(arr_b, v1));
                    return v1 + 8;
                }
                case 2: {
                    int v7 = l.I(arr_b, v1, l$b0);
                    int v8 = l$b0.a;
                    if(v8 < 0) {
                        throw y0.h();
                    }
                    if(v8 > arr_b.length - v7) {
                        throw y0.n();
                    }
                    if(v8 == 0) {
                        u10.r(v, u.e);
                        return v7;
                    }
                    u10.r(v, u.q(arr_b, v7, v8));
                    return v7 + v8;
                }
                case 3: {
                    U1 u11 = U1.o();
                    int v3 = v & -8 | 4;
                    int v4 = 0;
                    while(v1 < v2) {
                        int v5 = l.I(arr_b, v1, l$b0);
                        int v6 = l$b0.a;
                        if(v6 == v3) {
                            v4 = v6;
                            v1 = v5;
                            break;
                        }
                        v4 = v6;
                        v1 = l.G(v6, arr_b, v5, v2, u11, l$b0);
                    }
                    if(v1 > v2 || v4 != v3) {
                        throw y0.i();
                    }
                    u10.r(v, u11);
                    return v1;
                }
                case 5: {
                    u10.r(v, l.h(arr_b, v1));
                    return v1 + 4;
                }
                default: {
                    throw y0.d();
                }
            }
        }
        throw y0.d();
    }

    static int H(int v, byte[] arr_b, int v1, com.google.crypto.tink.shaded.protobuf.l.b l$b0) {
        int v2 = arr_b[v1];
        if(v2 >= 0) {
            l$b0.a = v & 0x7F | v2 << 7;
            return v1 + 1;
        }
        int v3 = v & 0x7F | (v2 & 0x7F) << 7;
        int v4 = arr_b[v1 + 1];
        if(v4 >= 0) {
            l$b0.a = v3 | v4 << 14;
            return v1 + 2;
        }
        int v5 = v3 | (v4 & 0x7F) << 14;
        int v6 = arr_b[v1 + 2];
        if(v6 >= 0) {
            l$b0.a = v5 | v6 << 21;
            return v1 + 3;
        }
        int v7 = v5 | (v6 & 0x7F) << 21;
        int v8 = v1 + 4;
        int v9 = arr_b[v1 + 3];
        if(v9 >= 0) {
            l$b0.a = v7 | v9 << 28;
            return v8;
        }
        while(arr_b[v8] < 0) {
            ++v8;
        }
        l$b0.a = v7 | (v9 & 0x7F) << 28;
        return v8 + 1;
    }

    static int I(byte[] arr_b, int v, com.google.crypto.tink.shaded.protobuf.l.b l$b0) {
        int v1 = arr_b[v];
        if(v1 >= 0) {
            l$b0.a = v1;
            return v + 1;
        }
        return l.H(v1, arr_b, v + 1, l$b0);
    }

    static int J(int v, byte[] arr_b, int v1, int v2, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) {
        int v3 = l.I(arr_b, v1, l$b0);
        ((r0)t0$k0).addInt(l$b0.a);
        while(v3 < v2) {
            int v4 = l.I(arr_b, v3, l$b0);
            if(v != l$b0.a) {
                break;
            }
            v3 = l.I(arr_b, v4, l$b0);
            ((r0)t0$k0).addInt(l$b0.a);
        }
        return v3;
    }

    static int K(long v, byte[] arr_b, int v1, com.google.crypto.tink.shaded.protobuf.l.b l$b0) {
        int v2 = v1 + 1;
        int v3 = arr_b[v1];
        long v4 = v & 0x7FL | ((long)(v3 & 0x7F)) << 7;
        int v5 = 7;
        while(v3 < 0) {
            int v6 = arr_b[v2];
            v5 += 7;
            v4 |= ((long)(v6 & 0x7F)) << v5;
            ++v2;
            v3 = v6;
        }
        l$b0.b = v4;
        return v2;
    }

    static int L(byte[] arr_b, int v, com.google.crypto.tink.shaded.protobuf.l.b l$b0) {
        long v1 = (long)arr_b[v];
        if(v1 >= 0L) {
            l$b0.b = v1;
            return v + 1;
        }
        return l.K(v1, arr_b, v + 1, l$b0);
    }

    static int M(int v, byte[] arr_b, int v1, int v2, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) {
        int v3 = l.L(arr_b, v1, l$b0);
        ((I0)t0$k0).addLong(l$b0.b);
        while(v3 < v2) {
            int v4 = l.I(arr_b, v3, l$b0);
            if(v != l$b0.a) {
                break;
            }
            v3 = l.L(arr_b, v4, l$b0);
            ((I0)t0$k0).addLong(l$b0.b);
        }
        return v3;
    }

    static int N(Object object0, t1 t10, byte[] arr_b, int v, int v1, int v2, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        int v3 = ((U0)t10).b0(object0, arr_b, v, v1, v2, l$b0);
        l$b0.c = object0;
        return v3;
    }

    static int O(Object object0, t1 t10, byte[] arr_b, int v, int v1, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        int v2 = v + 1;
        int v3 = arr_b[v];
        if(v3 < 0) {
            v2 = l.H(v3, arr_b, v2, l$b0);
            v3 = l$b0.a;
        }
        if(v3 < 0 || v3 > v1 - v2) {
            throw y0.n();
        }
        int v4 = v3 + v2;
        t10.a(object0, arr_b, v2, v4, l$b0);
        l$b0.c = object0;
        return v4;
    }

    static int P(int v, byte[] arr_b, int v1, int v2, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws y0 {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    return l.L(arr_b, v1, l$b0);
                }
                case 1: {
                    return v1 + 8;
                }
                case 2: {
                    return l.I(arr_b, v1, l$b0) + l$b0.a;
                }
                case 3: {
                    int v3 = v & -8 | 4;
                    int v4 = 0;
                    while(v1 < v2) {
                        v1 = l.I(arr_b, v1, l$b0);
                        v4 = l$b0.a;
                        if(v4 == v3) {
                            break;
                        }
                        v1 = l.P(v4, arr_b, v1, v2, l$b0);
                    }
                    if(v1 > v2 || v4 != v3) {
                        throw y0.i();
                    }
                    return v1;
                }
                case 5: {
                    return v1 + 4;
                }
                default: {
                    throw y0.d();
                }
            }
        }
        throw y0.d();
    }

    static int a(int v, byte[] arr_b, int v1, int v2, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) {
        int v3 = l.L(arr_b, v1, l$b0);
        ((q)t0$k0).addBoolean(l$b0.b != 0L);
        while(v3 < v2) {
            int v4 = l.I(arr_b, v3, l$b0);
            if(v != l$b0.a) {
                break;
            }
            v3 = l.L(arr_b, v4, l$b0);
            ((q)t0$k0).addBoolean(l$b0.b != 0L);
        }
        return v3;
    }

    static int b(byte[] arr_b, int v, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws y0 {
        int v1 = l.I(arr_b, v, l$b0);
        int v2 = l$b0.a;
        if(v2 < 0) {
            throw y0.h();
        }
        if(v2 > arr_b.length - v1) {
            throw y0.n();
        }
        if(v2 == 0) {
            l$b0.c = u.e;
            return v1;
        }
        l$b0.c = u.q(arr_b, v1, v2);
        return v1 + v2;
    }

    static int c(int v, byte[] arr_b, int v1, int v2, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws y0 {
        int v3 = l.I(arr_b, v1, l$b0);
        int v4 = l$b0.a;
        if(v4 < 0) {
            throw y0.h();
        }
        if(v4 > arr_b.length - v3) {
            throw y0.n();
        }
        if(v4 == 0) {
            t0$k0.add(u.e);
            goto label_9;
        }
        else {
            t0$k0.add(u.q(arr_b, v3, v4));
        }
    alab1:
        while(true) {
            v3 += v4;
            while(true) {
            label_9:
                if(v3 >= v2) {
                    return v3;
                }
                int v5 = l.I(arr_b, v3, l$b0);
                if(v != l$b0.a) {
                    return v3;
                }
                v3 = l.I(arr_b, v5, l$b0);
                v4 = l$b0.a;
                if(v4 < 0) {
                    throw y0.h();
                }
                if(v4 > arr_b.length - v3) {
                    break alab1;
                }
                if(v4 != 0) {
                    t0$k0.add(u.q(arr_b, v3, v4));
                    break;
                }
                t0$k0.add(u.e);
            }
        }
        throw y0.n();
    }

    static double d(byte[] arr_b, int v) {
        return Double.longBitsToDouble(l.j(arr_b, v));
    }

    static int e(int v, byte[] arr_b, int v1, int v2, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) {
        ((E)t0$k0).addDouble(l.d(arr_b, v1));
        int v3;
        for(v3 = v1 + 8; v3 < v2; v3 = v4 + 8) {
            int v4 = l.I(arr_b, v3, l$b0);
            if(v != l$b0.a) {
                break;
            }
            ((E)t0$k0).addDouble(l.d(arr_b, v4));
        }
        return v3;
    }

    static int f(int v, byte[] arr_b, int v1, int v2, e l0$e0, h l0$h0, T1 t10, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        int v3;
        Object object0 = null;
        f0 f00 = l0$e0.extensions;
        if(l0$h0.d.isRepeated() && l0$h0.d.isPacked()) {
            switch(l0$h0.b()) {
                case 1: {
                    E e0 = new E();
                    v3 = l.s(arr_b, v1, e0, l$b0);
                    f00.P(l0$h0.d, e0);
                    return v3;
                }
                case 2: {
                    h0 h00 = new h0();
                    v3 = l.v(arr_b, v1, h00, l$b0);
                    f00.P(l0$h0.d, h00);
                    return v3;
                }
                case 3: 
                case 4: {
                    I0 i00 = new I0();
                    v3 = l.z(arr_b, v1, i00, l$b0);
                    f00.P(l0$h0.d, i00);
                    return v3;
                }
                case 5: 
                case 6: {
                    r0 r00 = new r0();
                    v3 = l.y(arr_b, v1, r00, l$b0);
                    f00.P(l0$h0.d, r00);
                    return v3;
                }
                case 7: 
                case 8: {
                    I0 i01 = new I0();
                    v3 = l.u(arr_b, v1, i01, l$b0);
                    f00.P(l0$h0.d, i01);
                    return v3;
                }
                case 9: 
                case 10: {
                    r0 r01 = new r0();
                    v3 = l.t(arr_b, v1, r01, l$b0);
                    f00.P(l0$h0.d, r01);
                    return v3;
                }
                case 11: {
                    q q0 = new q();
                    v3 = l.r(arr_b, v1, q0, l$b0);
                    f00.P(l0$h0.d, q0);
                    return v3;
                }
                case 12: {
                    r0 r02 = new r0();
                    v3 = l.w(arr_b, v1, r02, l$b0);
                    f00.P(l0$h0.d, r02);
                    return v3;
                }
                case 13: {
                    I0 i02 = new I0();
                    v3 = l.x(arr_b, v1, i02, l$b0);
                    f00.P(l0$h0.d, i02);
                    return v3;
                }
                case 14: {
                    r0 r03 = new r0();
                    v3 = l.y(arr_b, v1, r03, l$b0);
                    v1.B(l0$e0, v >>> 3, r03, l0$h0.d.getEnumType(), null, t10);
                    f00.P(l0$h0.d, r03);
                    return v3;
                }
                default: {
                    throw new IllegalStateException("Type cannot be packed: " + l0$h0.d.getLiteType());
                }
            }
        }
        if(l0$h0.b() == b.p) {
            v1 = l.I(arr_b, v1, l$b0);
            if(l0$h0.d.getEnumType().findValueByNumber(l$b0.a) == null) {
                v1.Q(l0$e0, v >>> 3, l$b0.a, null, t10);
                return v1;
            }
            object0 = l$b0.a;
        }
        else {
            switch(l0$h0.b()) {
                case 1: {
                    object0 = l.d(arr_b, v1);
                    v1 += 8;
                    break;
                }
                case 2: {
                    object0 = l.l(arr_b, v1);
                    v1 += 4;
                    break;
                }
                case 3: 
                case 4: {
                    v1 = l.L(arr_b, v1, l$b0);
                    object0 = l$b0.b;
                    break;
                }
                case 5: 
                case 6: {
                    v1 = l.I(arr_b, v1, l$b0);
                    object0 = l$b0.a;
                    break;
                }
                case 7: 
                case 8: {
                    object0 = l.j(arr_b, v1);
                    v1 += 8;
                    break;
                }
                case 9: 
                case 10: {
                    object0 = l.h(arr_b, v1);
                    v1 += 4;
                    break;
                }
                case 11: {
                    v1 = l.L(arr_b, v1, l$b0);
                    object0 = Boolean.valueOf(l$b0.b != 0L);
                    break;
                }
                case 12: {
                    v1 = l.I(arr_b, v1, l$b0);
                    object0 = (int)(-(l$b0.a & 1) ^ l$b0.a >>> 1);
                    break;
                }
                case 13: {
                    v1 = l.L(arr_b, v1, l$b0);
                    object0 = (long)(-(l$b0.b & 1L) ^ l$b0.b >>> 1);
                    break;
                }
                case 14: {
                    throw new IllegalStateException("Shouldn\'t reach here.");
                }
                case 15: {
                    v1 = l.b(arr_b, v1, l$b0);
                    object0 = l$b0.c;
                    break;
                }
                case 16: {
                    v1 = l.C(arr_b, v1, l$b0);
                    object0 = l$b0.c;
                    break;
                }
                case 17: {
                    int v4 = v >>> 3 << 3 | 4;
                    t1 t11 = m1.a().i(l0$h0.c().getClass());
                    if(l0$h0.f()) {
                        int v5 = l.n(t11, arr_b, v1, v2, v4, l$b0);
                        f00.h(l0$h0.d, l$b0.c);
                        return v5;
                    }
                    Object object1 = f00.u(l0$h0.d);
                    if(object1 == null) {
                        object1 = t11.newInstance();
                        f00.P(l0$h0.d, object1);
                    }
                    return l.N(object1, t11, arr_b, v1, v2, v4, l$b0);
                }
                case 18: {
                    t1 t12 = m1.a().i(l0$h0.c().getClass());
                    if(l0$h0.f()) {
                        int v6 = l.p(t12, arr_b, v1, v2, l$b0);
                        f00.h(l0$h0.d, l$b0.c);
                        return v6;
                    }
                    Object object2 = f00.u(l0$h0.d);
                    if(object2 == null) {
                        object2 = t12.newInstance();
                        f00.P(l0$h0.d, object2);
                    }
                    return l.O(object2, t12, arr_b, v1, v2, l$b0);
                }
            }
        }
        if(l0$h0.f()) {
            f00.h(l0$h0.d, object0);
            return v1;
        }
        f00.P(l0$h0.d, object0);
        return v1;
    }

    static int g(int v, byte[] arr_b, int v1, int v2, Object object0, R0 r00, T1 t10, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        h l0$h0 = l$b0.d.c(r00, v >>> 3);
        if(l0$h0 == null) {
            return l.G(v, arr_b, v1, v2, U0.q(object0), l$b0);
        }
        ((e)object0).E2();
        return l.f(v, arr_b, v1, v2, ((e)object0), l0$h0, t10, l$b0);
    }

    static int h(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16);
    }

    static int i(int v, byte[] arr_b, int v1, int v2, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) {
        ((r0)t0$k0).addInt(l.h(arr_b, v1));
        int v3;
        for(v3 = v1 + 4; v3 < v2; v3 = v4 + 4) {
            int v4 = l.I(arr_b, v3, l$b0);
            if(v != l$b0.a) {
                break;
            }
            ((r0)t0$k0).addInt(l.h(arr_b, v4));
        }
        return v3;
    }

    static long j(byte[] arr_b, int v) {
        return (((long)arr_b[v + 7]) & 0xFFL) << 56 | (((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30);
    }

    static int k(int v, byte[] arr_b, int v1, int v2, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) {
        ((I0)t0$k0).addLong(l.j(arr_b, v1));
        int v3;
        for(v3 = v1 + 8; v3 < v2; v3 = v4 + 8) {
            int v4 = l.I(arr_b, v3, l$b0);
            if(v != l$b0.a) {
                break;
            }
            ((I0)t0$k0).addLong(l.j(arr_b, v4));
        }
        return v3;
    }

    static float l(byte[] arr_b, int v) {
        return Float.intBitsToFloat(l.h(arr_b, v));
    }

    static int m(int v, byte[] arr_b, int v1, int v2, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) {
        ((h0)t0$k0).addFloat(l.l(arr_b, v1));
        int v3;
        for(v3 = v1 + 4; v3 < v2; v3 = v4 + 4) {
            int v4 = l.I(arr_b, v3, l$b0);
            if(v != l$b0.a) {
                break;
            }
            ((h0)t0$k0).addFloat(l.l(arr_b, v4));
        }
        return v3;
    }

    static int n(t1 t10, byte[] arr_b, int v, int v1, int v2, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        Object object0 = t10.newInstance();
        int v3 = l.N(object0, t10, arr_b, v, v1, v2, l$b0);
        t10.makeImmutable(object0);
        l$b0.c = object0;
        return v3;
    }

    static int o(t1 t10, int v, byte[] arr_b, int v1, int v2, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        int v3 = v & -8 | 4;
        int v4 = l.n(t10, arr_b, v1, v2, v3, l$b0);
        t0$k0.add(l$b0.c);
        while(v4 < v2) {
            int v5 = l.I(arr_b, v4, l$b0);
            if(v != l$b0.a) {
                break;
            }
            v4 = l.n(t10, arr_b, v5, v2, v3, l$b0);
            t0$k0.add(l$b0.c);
        }
        return v4;
    }

    static int p(t1 t10, byte[] arr_b, int v, int v1, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        Object object0 = t10.newInstance();
        int v2 = l.O(object0, t10, arr_b, v, v1, l$b0);
        t10.makeImmutable(object0);
        l$b0.c = object0;
        return v2;
    }

    static int q(t1 t10, int v, byte[] arr_b, int v1, int v2, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        int v3 = l.p(t10, arr_b, v1, v2, l$b0);
        t0$k0.add(l$b0.c);
        while(v3 < v2) {
            int v4 = l.I(arr_b, v3, l$b0);
            if(v != l$b0.a) {
                break;
            }
            v3 = l.p(t10, arr_b, v4, v2, l$b0);
            t0$k0.add(l$b0.c);
        }
        return v3;
    }

    static int r(byte[] arr_b, int v, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        int v1 = l.I(arr_b, v, l$b0);
        int v2 = l$b0.a + v1;
        while(v1 < v2) {
            v1 = l.L(arr_b, v1, l$b0);
            ((q)t0$k0).addBoolean(l$b0.b != 0L);
        }
        if(v1 != v2) {
            throw y0.n();
        }
        return v1;
    }

    static int s(byte[] arr_b, int v, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        int v1 = l.I(arr_b, v, l$b0);
        int v2 = l$b0.a + v1;
        while(v1 < v2) {
            ((E)t0$k0).addDouble(l.d(arr_b, v1));
            v1 += 8;
        }
        if(v1 != v2) {
            throw y0.n();
        }
        return v1;
    }

    static int t(byte[] arr_b, int v, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        int v1 = l.I(arr_b, v, l$b0);
        int v2 = l$b0.a + v1;
        while(v1 < v2) {
            ((r0)t0$k0).addInt(l.h(arr_b, v1));
            v1 += 4;
        }
        if(v1 != v2) {
            throw y0.n();
        }
        return v1;
    }

    static int u(byte[] arr_b, int v, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        int v1 = l.I(arr_b, v, l$b0);
        int v2 = l$b0.a + v1;
        while(v1 < v2) {
            ((I0)t0$k0).addLong(l.j(arr_b, v1));
            v1 += 8;
        }
        if(v1 != v2) {
            throw y0.n();
        }
        return v1;
    }

    static int v(byte[] arr_b, int v, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        int v1 = l.I(arr_b, v, l$b0);
        int v2 = l$b0.a + v1;
        while(v1 < v2) {
            ((h0)t0$k0).addFloat(l.l(arr_b, v1));
            v1 += 4;
        }
        if(v1 != v2) {
            throw y0.n();
        }
        return v1;
    }

    static int w(byte[] arr_b, int v, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        int v1 = l.I(arr_b, v, l$b0);
        int v2 = l$b0.a + v1;
        while(v1 < v2) {
            v1 = l.I(arr_b, v1, l$b0);
            ((r0)t0$k0).addInt(-(l$b0.a & 1) ^ l$b0.a >>> 1);
        }
        if(v1 != v2) {
            throw y0.n();
        }
        return v1;
    }

    static int x(byte[] arr_b, int v, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        int v1 = l.I(arr_b, v, l$b0);
        int v2 = l$b0.a + v1;
        while(v1 < v2) {
            v1 = l.L(arr_b, v1, l$b0);
            ((I0)t0$k0).addLong(-(l$b0.b & 1L) ^ l$b0.b >>> 1);
        }
        if(v1 != v2) {
            throw y0.n();
        }
        return v1;
    }

    static int y(byte[] arr_b, int v, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        int v1 = l.I(arr_b, v, l$b0);
        int v2 = l$b0.a + v1;
        while(v1 < v2) {
            v1 = l.I(arr_b, v1, l$b0);
            ((r0)t0$k0).addInt(l$b0.a);
        }
        if(v1 != v2) {
            throw y0.n();
        }
        return v1;
    }

    static int z(byte[] arr_b, int v, k t0$k0, com.google.crypto.tink.shaded.protobuf.l.b l$b0) throws IOException {
        int v1 = l.I(arr_b, v, l$b0);
        int v2 = l$b0.a + v1;
        while(v1 < v2) {
            v1 = l.L(arr_b, v1, l$b0);
            ((I0)t0$k0).addLong(l$b0.b);
        }
        if(v1 != v2) {
            throw y0.n();
        }
        return v1;
    }
}

