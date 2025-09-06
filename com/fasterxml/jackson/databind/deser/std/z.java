package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.M;
import com.fasterxml.jackson.core.exc.c;
import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.deser.impl.q;
import com.fasterxml.jackson.databind.deser.j;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.o;
import j..util.Objects;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class z extends D implements j {
    @b
    static final class a extends z {
        private static final long i = 1L;

        public a() {
            super(boolean[].class);
        }

        protected a(a z$a0, v v0, Boolean boolean0) {
            super(z$a0, v0, boolean0);
        }

        public boolean[] A1(n n0, h h0) throws IOException {
            boolean z;
            if(!n0.d4()) {
                return (boolean[])this.v1(n0, h0);
            }
            com.fasterxml.jackson.databind.util.c.b c$b0 = h0.e0().c();
            boolean[] arr_z = (boolean[])c$b0.f();
            int v = 0;
            while(true) {
                try {
                label_5:
                    r r0 = n0.m4();
                    if(r0 == r.n) {
                        return (boolean[])c$b0.e(arr_z, v);
                    }
                    if(r0 == r.t) {
                        z = true;
                    }
                    else {
                        if(r0 != r.u) {
                            if(r0 == r.v) {
                                v v1 = this.h;
                                if(v1 == null) {
                                    this.W0(h0);
                                    goto label_18;
                                }
                                else {
                                    v1.c(h0);
                                    goto label_5;
                                }
                            }
                            z = this.u0(n0, h0);
                            goto label_21;
                        }
                    label_18:
                        z = false;
                    }
                label_21:
                    if(v >= arr_z.length) {
                        arr_z = (boolean[])c$b0.c(arr_z, v);
                        v = 0;
                    }
                }
                catch(Exception exception0) {
                    throw o.C(exception0, arr_z, c$b0.d() + v);
                }
                try {
                    arr_z[v] = z;
                    ++v;
                    goto label_5;
                }
                catch(Exception exception0) {
                }
                break;
            }
            ++v;
            throw o.C(exception0, arr_z, c$b0.d() + v);
        }

        protected boolean[] B1(n n0, h h0) throws IOException {
            return new boolean[]{this.u0(n0, h0)};
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.A1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object r1(Object object0, Object object1) {
            return this.y1(((boolean[])object0), ((boolean[])object1));
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object s1() {
            return this.z1();
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object w1(n n0, h h0) throws IOException {
            return this.B1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected z x1(v v0, Boolean boolean0) {
            return new a(this, v0, boolean0);
        }

        protected boolean[] y1(boolean[] arr_z, boolean[] arr_z1) {
            boolean[] arr_z2 = Arrays.copyOf(arr_z, arr_z.length + arr_z1.length);
            System.arraycopy(arr_z1, 0, arr_z2, arr_z.length, arr_z1.length);
            return arr_z2;
        }

        protected boolean[] z1() {
            return new boolean[0];
        }
    }

    @b
    static final class com.fasterxml.jackson.databind.deser.std.z.b extends z {
        private static final long i = 1L;

        public com.fasterxml.jackson.databind.deser.std.z.b() {
            super(byte[].class);
        }

        protected com.fasterxml.jackson.databind.deser.std.z.b(com.fasterxml.jackson.databind.deser.std.z.b z$b0, v v0, Boolean boolean0) {
            super(z$b0, v0, boolean0);
        }

        public byte[] A1(n n0, h h0) throws IOException {
            byte b;
            r r0 = n0.Y();
            if(r0 == r.q) {
                try {
                    return n0.L0(h0.f0());
                }
                catch(c | com.fasterxml.jackson.databind.f c0) {
                    String s = c0.b();
                    if(s.contains("base64")) {
                        String s1 = n0.R2();
                        return (byte[])h0.C0(byte[].class, s1, s, new Object[0]);
                    }
                }
            }
            if(r0 == r.p) {
                Object object0 = n0.l1();
                if(object0 == null) {
                    return null;
                }
                if(object0 instanceof byte[]) {
                    return (byte[])object0;
                }
            }
            if(!n0.d4()) {
                return (byte[])this.v1(n0, h0);
            }
            com.fasterxml.jackson.databind.util.c.c c$c0 = h0.e0().d();
            byte[] arr_b = (byte[])c$c0.f();
            int v = 0;
            while(true) {
                try {
                label_19:
                    r r1 = n0.m4();
                    if(r1 == r.n) {
                        return (byte[])c$c0.e(arr_b, v);
                    }
                    if(r1 == r.r) {
                        b = n0.Y0();
                    }
                    else {
                        if(r1 == r.v) {
                            v v1 = this.h;
                            if(v1 == null) {
                                this.W0(h0);
                                b = 0;
                                goto label_33;
                            }
                            else {
                                v1.c(h0);
                                goto label_19;
                            }
                        }
                        b = this.w0(n0, h0);
                    }
                label_33:
                    if(v >= arr_b.length) {
                        arr_b = (byte[])c$c0.c(arr_b, v);
                        v = 0;
                    }
                }
                catch(Exception exception0) {
                    throw o.C(exception0, arr_b, c$c0.d() + v);
                }
                try {
                    arr_b[v] = b;
                    ++v;
                    goto label_19;
                }
                catch(Exception exception0) {
                }
                break;
            }
            ++v;
            throw o.C(exception0, arr_b, c$c0.d() + v);
        }

        protected byte[] B1(n n0, h h0) throws IOException {
            r r0 = n0.Y();
            if(r0 == r.r) {
                return new byte[]{n0.Y0()};
            }
            if(r0 == r.v) {
                v v0 = this.h;
                if(v0 != null) {
                    v0.c(h0);
                    return (byte[])this.o(h0);
                }
                this.W0(h0);
                return null;
            }
            return new byte[]{((Number)h0.v0(this.a.getComponentType(), n0)).byteValue()};
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.A1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object r1(Object object0, Object object1) {
            return this.y1(((byte[])object0), ((byte[])object1));
        }

        // 去混淆评级： 低(20)
        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object s1() {
            return new byte[0];
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        public com.fasterxml.jackson.databind.type.h w() {
            return com.fasterxml.jackson.databind.type.h.k;
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object w1(n n0, h h0) throws IOException {
            return this.B1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected z x1(v v0, Boolean boolean0) {
            return new com.fasterxml.jackson.databind.deser.std.z.b(this, v0, boolean0);
        }

        protected byte[] y1(byte[] arr_b, byte[] arr_b1) {
            byte[] arr_b2 = Arrays.copyOf(arr_b, arr_b.length + arr_b1.length);
            System.arraycopy(arr_b1, 0, arr_b2, arr_b.length, arr_b1.length);
            return arr_b2;
        }

        protected byte[] z1() [...] // 潜在的解密器
    }

    @b
    static final class com.fasterxml.jackson.databind.deser.std.z.c extends z {
        private static final long i = 1L;

        public com.fasterxml.jackson.databind.deser.std.z.c() {
            super(char[].class);
        }

        protected com.fasterxml.jackson.databind.deser.std.z.c(com.fasterxml.jackson.databind.deser.std.z.c z$c0, v v0, Boolean boolean0) {
            super(z$c0, v0, boolean0);
        }

        public char[] A1(n n0, h h0) throws IOException {
            String s;
            if(n0.Y3(r.q)) {
                char[] arr_c = n0.Y2();
                int v = n0.e3();
                int v1 = n0.b3();
                char[] arr_c1 = new char[v1];
                System.arraycopy(arr_c, v, arr_c1, 0, v1);
                return arr_c1;
            }
            if(n0.d4()) {
                StringBuilder stringBuilder0 = new StringBuilder(0x40);
                r r0;
                while((r0 = n0.m4()) != r.n) {
                    if(r0 == r.q) {
                        s = n0.R2();
                    }
                    else if(r0 == r.v) {
                        v v2 = this.h;
                        if(v2 == null) {
                            this.W0(h0);
                            s = "\u0000";
                            goto label_23;
                        }
                        else {
                            v2.c(h0);
                            continue;
                        }
                        goto label_22;
                    }
                    else {
                    label_22:
                        s = ((CharSequence)h0.v0(Character.TYPE, n0)).toString();
                    }
                label_23:
                    if(s.length() != 1) {
                        h0.a1(this, "Cannot convert a JSON String of length %d into a char element of char array", new Object[]{s.length()});
                    }
                    stringBuilder0.append(s.charAt(0));
                }
                return stringBuilder0.toString().toCharArray();
            }
            if(n0.Y3(r.p)) {
                Object object0 = n0.l1();
                if(object0 == null) {
                    return null;
                }
                if(object0 instanceof char[]) {
                    return (char[])object0;
                }
                if(object0 instanceof String) {
                    return ((String)object0).toCharArray();
                }
                return object0 instanceof byte[] ? com.fasterxml.jackson.core.b.a().k(((byte[])object0), false).toCharArray() : ((char[])h0.v0(this.a, n0));
            }
            return (char[])h0.v0(this.a, n0);
        }

        protected char[] B1(n n0, h h0) throws IOException {
            return (char[])h0.v0(this.a, n0);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.A1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object r1(Object object0, Object object1) {
            return this.y1(((char[])object0), ((char[])object1));
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object s1() {
            return this.z1();
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object w1(n n0, h h0) throws IOException {
            return this.B1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected z x1(v v0, Boolean boolean0) {
            return this;
        }

        protected char[] y1(char[] arr_c, char[] arr_c1) {
            char[] arr_c2 = Arrays.copyOf(arr_c, arr_c.length + arr_c1.length);
            System.arraycopy(arr_c1, 0, arr_c2, arr_c.length, arr_c1.length);
            return arr_c2;
        }

        protected char[] z1() {
            return new char[0];
        }
    }

    @b
    static final class d extends z {
        private static final long i = 1L;

        public d() {
            super(double[].class);
        }

        protected d(d z$d0, v v0, Boolean boolean0) {
            super(z$d0, v0, boolean0);
        }

        public double[] A1(n n0, h h0) throws IOException {
            double f;
            if(!n0.d4()) {
                return (double[])this.v1(n0, h0);
            }
            com.fasterxml.jackson.databind.util.c.d c$d0 = h0.e0().e();
            double[] arr_f = (double[])c$d0.f();
            int v = 0;
            while(true) {
                try {
                label_5:
                    r r0 = n0.m4();
                    if(r0 == r.n) {
                        return (double[])c$d0.e(arr_f, v);
                    }
                    if(r0 == r.v) {
                        v v1 = this.h;
                        if(v1 != null) {
                            v1.c(h0);
                            goto label_5;
                        }
                    }
                    f = this.C0(n0, h0);
                    if(v >= arr_f.length) {
                        arr_f = (double[])c$d0.c(arr_f, v);
                        v = 0;
                    }
                }
                catch(Exception exception0) {
                    throw o.C(exception0, arr_f, c$d0.d() + v);
                }
                try {
                    arr_f[v] = f;
                    ++v;
                    goto label_5;
                }
                catch(Exception exception0) {
                }
                break;
            }
            ++v;
            throw o.C(exception0, arr_f, c$d0.d() + v);
        }

        protected double[] B1(n n0, h h0) throws IOException {
            return new double[]{this.C0(n0, h0)};
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.A1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object r1(Object object0, Object object1) {
            return this.y1(((double[])object0), ((double[])object1));
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object s1() {
            return this.z1();
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object w1(n n0, h h0) throws IOException {
            return this.B1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected z x1(v v0, Boolean boolean0) {
            return new d(this, v0, boolean0);
        }

        protected double[] y1(double[] arr_f, double[] arr_f1) {
            double[] arr_f2 = Arrays.copyOf(arr_f, arr_f.length + arr_f1.length);
            System.arraycopy(arr_f1, 0, arr_f2, arr_f.length, arr_f1.length);
            return arr_f2;
        }

        protected double[] z1() {
            return new double[0];
        }
    }

    @b
    static final class e extends z {
        private static final long i = 1L;

        public e() {
            super(float[].class);
        }

        protected e(e z$e0, v v0, Boolean boolean0) {
            super(z$e0, v0, boolean0);
        }

        public float[] A1(n n0, h h0) throws IOException {
            float f;
            if(!n0.d4()) {
                return (float[])this.v1(n0, h0);
            }
            com.fasterxml.jackson.databind.util.c.e c$e0 = h0.e0().f();
            float[] arr_f = (float[])c$e0.f();
            int v = 0;
            while(true) {
                try {
                label_5:
                    r r0 = n0.m4();
                    if(r0 == r.n) {
                        return (float[])c$e0.e(arr_f, v);
                    }
                    if(r0 == r.v) {
                        v v1 = this.h;
                        if(v1 != null) {
                            v1.c(h0);
                            goto label_5;
                        }
                    }
                    f = this.F0(n0, h0);
                    if(v >= arr_f.length) {
                        arr_f = (float[])c$e0.c(arr_f, v);
                        v = 0;
                    }
                }
                catch(Exception exception0) {
                    throw o.C(exception0, arr_f, c$e0.d() + v);
                }
                try {
                    arr_f[v] = f;
                    ++v;
                    goto label_5;
                }
                catch(Exception exception0) {
                }
                break;
            }
            ++v;
            throw o.C(exception0, arr_f, c$e0.d() + v);
        }

        protected float[] B1(n n0, h h0) throws IOException {
            return new float[]{this.F0(n0, h0)};
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.A1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object r1(Object object0, Object object1) {
            return this.y1(((float[])object0), ((float[])object1));
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object s1() {
            return this.z1();
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object w1(n n0, h h0) throws IOException {
            return this.B1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected z x1(v v0, Boolean boolean0) {
            return new e(this, v0, boolean0);
        }

        protected float[] y1(float[] arr_f, float[] arr_f1) {
            float[] arr_f2 = Arrays.copyOf(arr_f, arr_f.length + arr_f1.length);
            System.arraycopy(arr_f1, 0, arr_f2, arr_f.length, arr_f1.length);
            return arr_f2;
        }

        protected float[] z1() {
            return new float[0];
        }
    }

    @b
    static final class com.fasterxml.jackson.databind.deser.std.z.f extends z {
        private static final long i = 1L;
        public static final com.fasterxml.jackson.databind.deser.std.z.f j;

        static {
            com.fasterxml.jackson.databind.deser.std.z.f.j = new com.fasterxml.jackson.databind.deser.std.z.f();
        }

        public com.fasterxml.jackson.databind.deser.std.z.f() {
            super(int[].class);
        }

        protected com.fasterxml.jackson.databind.deser.std.z.f(com.fasterxml.jackson.databind.deser.std.z.f z$f0, v v0, Boolean boolean0) {
            super(z$f0, v0, boolean0);
        }

        public int[] A1(n n0, h h0) throws IOException {
            int v2;
            if(!n0.d4()) {
                return (int[])this.v1(n0, h0);
            }
            com.fasterxml.jackson.databind.util.c.f c$f0 = h0.e0().g();
            int[] arr_v = (int[])c$f0.f();
            int v = 0;
            while(true) {
                try {
                label_5:
                    r r0 = n0.m4();
                    if(r0 == r.n) {
                        return (int[])c$f0.e(arr_v, v);
                    }
                    if(r0 == r.r) {
                        v2 = n0.Q1();
                    }
                    else {
                        if(r0 == r.v) {
                            v v1 = this.h;
                            if(v1 == null) {
                                this.W0(h0);
                                v2 = 0;
                                goto label_19;
                            }
                            else {
                                v1.c(h0);
                                goto label_5;
                            }
                        }
                        v2 = this.I0(n0, h0);
                    }
                label_19:
                    if(v >= arr_v.length) {
                        arr_v = (int[])c$f0.c(arr_v, v);
                        v = 0;
                    }
                }
                catch(Exception exception0) {
                    throw o.C(exception0, arr_v, c$f0.d() + v);
                }
                try {
                    arr_v[v] = v2;
                    ++v;
                    goto label_5;
                }
                catch(Exception exception0) {
                }
                break;
            }
            ++v;
            throw o.C(exception0, arr_v, c$f0.d() + v);
        }

        protected int[] B1(n n0, h h0) throws IOException {
            return new int[]{this.I0(n0, h0)};
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.A1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object r1(Object object0, Object object1) {
            return this.y1(((int[])object0), ((int[])object1));
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object s1() {
            return this.z1();
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object w1(n n0, h h0) throws IOException {
            return this.B1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected z x1(v v0, Boolean boolean0) {
            return new com.fasterxml.jackson.databind.deser.std.z.f(this, v0, boolean0);
        }

        protected int[] y1(int[] arr_v, int[] arr_v1) {
            int[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + arr_v1.length);
            System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
            return arr_v2;
        }

        protected int[] z1() {
            return new int[0];
        }
    }

    @b
    static final class g extends z {
        private static final long i = 1L;
        public static final g j;

        static {
            g.j = new g();
        }

        public g() {
            super(long[].class);
        }

        protected g(g z$g0, v v0, Boolean boolean0) {
            super(z$g0, v0, boolean0);
        }

        public long[] A1(n n0, h h0) throws IOException {
            long v2;
            if(!n0.d4()) {
                return (long[])this.v1(n0, h0);
            }
            com.fasterxml.jackson.databind.util.c.g c$g0 = h0.e0().h();
            long[] arr_v = (long[])c$g0.f();
            int v = 0;
            while(true) {
                try {
                label_5:
                    r r0 = n0.m4();
                    if(r0 == r.n) {
                        return (long[])c$g0.e(arr_v, v);
                    }
                    if(r0 == r.r) {
                        v2 = n0.e2();
                    }
                    else {
                        if(r0 == r.v) {
                            v v1 = this.h;
                            if(v1 == null) {
                                this.W0(h0);
                                v2 = 0L;
                                goto label_19;
                            }
                            else {
                                v1.c(h0);
                                goto label_5;
                            }
                        }
                        v2 = this.O0(n0, h0);
                    }
                label_19:
                    if(v >= arr_v.length) {
                        arr_v = (long[])c$g0.c(arr_v, v);
                        v = 0;
                    }
                }
                catch(Exception exception0) {
                    throw o.C(exception0, arr_v, c$g0.d() + v);
                }
                try {
                    arr_v[v] = v2;
                    ++v;
                    goto label_5;
                }
                catch(Exception exception0) {
                }
                break;
            }
            ++v;
            throw o.C(exception0, arr_v, c$g0.d() + v);
        }

        protected long[] B1(n n0, h h0) throws IOException {
            return new long[]{this.O0(n0, h0)};
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.A1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object r1(Object object0, Object object1) {
            return this.y1(((long[])object0), ((long[])object1));
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object s1() {
            return this.z1();
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object w1(n n0, h h0) throws IOException {
            return this.B1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected z x1(v v0, Boolean boolean0) {
            return new g(this, v0, boolean0);
        }

        protected long[] y1(long[] arr_v, long[] arr_v1) {
            long[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + arr_v1.length);
            System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
            return arr_v2;
        }

        protected long[] z1() {
            return new long[0];
        }
    }

    @b
    static final class com.fasterxml.jackson.databind.deser.std.z.h extends z {
        private static final long i = 1L;

        public com.fasterxml.jackson.databind.deser.std.z.h() {
            super(short[].class);
        }

        protected com.fasterxml.jackson.databind.deser.std.z.h(com.fasterxml.jackson.databind.deser.std.z.h z$h0, v v0, Boolean boolean0) {
            super(z$h0, v0, boolean0);
        }

        public short[] A1(n n0, h h0) throws IOException {
            short v2;
            if(!n0.d4()) {
                return (short[])this.v1(n0, h0);
            }
            com.fasterxml.jackson.databind.util.c.h c$h0 = h0.e0().i();
            short[] arr_v = (short[])c$h0.f();
            int v = 0;
            while(true) {
                try {
                label_5:
                    r r0 = n0.m4();
                    if(r0 == r.n) {
                        return (short[])c$h0.e(arr_v, v);
                    }
                    if(r0 == r.v) {
                        v v1 = this.h;
                        if(v1 == null) {
                            this.W0(h0);
                            v2 = 0;
                            goto label_16;
                        }
                        else {
                            v1.c(h0);
                            goto label_5;
                        }
                        goto label_15;
                    }
                    else {
                    label_15:
                        v2 = this.Q0(n0, h0);
                    }
                label_16:
                    if(v >= arr_v.length) {
                        arr_v = (short[])c$h0.c(arr_v, v);
                        v = 0;
                    }
                }
                catch(Exception exception0) {
                    throw o.C(exception0, arr_v, c$h0.d() + v);
                }
                try {
                    arr_v[v] = v2;
                    ++v;
                    goto label_5;
                }
                catch(Exception exception0) {
                }
                break;
            }
            ++v;
            throw o.C(exception0, arr_v, c$h0.d() + v);
        }

        protected short[] B1(n n0, h h0) throws IOException {
            return new short[]{this.Q0(n0, h0)};
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.A1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object r1(Object object0, Object object1) {
            return this.y1(((short[])object0), ((short[])object1));
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object s1() {
            return this.z1();
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected Object w1(n n0, h h0) throws IOException {
            return this.B1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.z
        protected z x1(v v0, Boolean boolean0) {
            return new com.fasterxml.jackson.databind.deser.std.z.h(this, v0, boolean0);
        }

        protected short[] y1(short[] arr_v, short[] arr_v1) {
            short[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + arr_v1.length);
            System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
            return arr_v2;
        }

        protected short[] z1() {
            return new short[0];
        }
    }

    protected final Boolean f;
    private transient Object g;
    protected final v h;

    protected z(z z0, v v0, Boolean boolean0) {
        super(z0.a);
        this.f = boolean0;
        this.h = v0;
    }

    protected z(Class class0) {
        super(class0);
        this.f = null;
        this.h = null;
    }

    @Override  // com.fasterxml.jackson.databind.deser.j
    public com.fasterxml.jackson.databind.n a(h h0, com.fasterxml.jackson.databind.d d0) throws o {
        q q0;
        Boolean boolean0 = this.g1(h0, d0, this.a, com.fasterxml.jackson.annotation.n.a.a);
        M m0 = this.d1(h0, d0);
        if(m0 == M.b) {
            q0 = q.h();
            return !Objects.equals(boolean0, this.f) || q0 != this.h ? this.x1(q0, boolean0) : this;
        }
        if(m0 == M.c) {
            if(d0 == null) {
                q0 = com.fasterxml.jackson.databind.deser.impl.r.e(h0.R(this.a.getComponentType()));
                return !Objects.equals(boolean0, this.f) || q0 != this.h ? this.x1(q0, boolean0) : this;
            }
            q0 = com.fasterxml.jackson.databind.deser.impl.r.b(d0, d0.getType().E());
            return !Objects.equals(boolean0, this.f) || q0 != this.h ? this.x1(q0, boolean0) : this;
        }
        return !Objects.equals(boolean0, this.f) || null != this.h ? this.x1(null, boolean0) : this;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object h(n n0, h h0, Object object0) throws IOException {
        Object object1 = this.g(n0, h0);
        if(object0 == null) {
            return object1;
        }
        return Array.getLength(object0) == 0 ? object1 : this.r1(object0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public Object i(n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0) throws IOException {
        return f0.d(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.util.a m() {
        return com.fasterxml.jackson.databind.util.a.b;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object o(h h0) throws o {
        Object object0 = this.g;
        if(object0 == null) {
            object0 = this.s1();
            this.g = object0;
        }
        return object0;
    }

    protected abstract Object r1(Object arg1, Object arg2);

    protected abstract Object s1();

    protected void t1(h h0) throws IOException {
        throw com.fasterxml.jackson.databind.exc.d.J(h0, null, h0.R(this.a));
    }

    public static com.fasterxml.jackson.databind.n u1(Class class0) {
        if(class0 == Integer.TYPE) {
            return com.fasterxml.jackson.databind.deser.std.z.f.j;
        }
        if(class0 == Long.TYPE) {
            return g.j;
        }
        if(class0 == Byte.TYPE) {
            return new com.fasterxml.jackson.databind.deser.std.z.b();
        }
        if(class0 == Short.TYPE) {
            return new com.fasterxml.jackson.databind.deser.std.z.h();
        }
        if(class0 == Float.TYPE) {
            return new e();
        }
        if(class0 == Double.TYPE) {
            return new d();
        }
        if(class0 == Boolean.TYPE) {
            return new a();
        }
        if(class0 != Character.TYPE) {
            throw new IllegalArgumentException("Unknown primitive array element type: " + class0);
        }
        return new com.fasterxml.jackson.databind.deser.std.z.c();
    }

    protected Object v1(n n0, h h0) throws IOException {
        if(n0.Y3(r.q)) {
            return this.X(n0, h0);
        }
        return this.f == Boolean.TRUE || this.f == null && h0.J0(i.s) ? this.w1(n0, h0) : h0.v0(this.a, n0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.a;
    }

    protected abstract Object w1(n arg1, h arg2) throws IOException;

    protected abstract z x1(v arg1, Boolean arg2);

    @Override  // com.fasterxml.jackson.databind.n
    public Boolean y(com.fasterxml.jackson.databind.g g0) {
        return true;
    }
}

