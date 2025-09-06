package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.r;
import java.util.Arrays;

public abstract class k {
    static final class a extends k {
        private final Class b;
        private final Class c;
        private final r d;
        private final r e;

        public a(k k0, Class class0, r r0, Class class1, r r1) {
            super(k0);
            this.b = class0;
            this.d = r0;
            this.c = class1;
            this.e = r1;
        }

        @Override  // com.fasterxml.jackson.databind.ser.impl.k
        public k l(Class class0, r r0) {
            return new c(this, new f[]{new f(this.b, this.d), new f(this.c, this.e), new f(class0, r0)});
        }

        @Override  // com.fasterxml.jackson.databind.ser.impl.k
        public r m(Class class0) {
            if(class0 == this.b) {
                return this.d;
            }
            return class0 == this.c ? this.e : null;
        }
    }

    static final class b extends k {
        public static final b b;
        public static final b c;

        static {
            b.b = new b(false);
            b.c = new b(true);
        }

        protected b(boolean z) {
            super(z);
        }

        @Override  // com.fasterxml.jackson.databind.ser.impl.k
        public k l(Class class0, r r0) {
            return new e(this, class0, r0);
        }

        @Override  // com.fasterxml.jackson.databind.ser.impl.k
        public r m(Class class0) {
            return null;
        }
    }

    static final class c extends k {
        private final f[] b;
        private static final int c = 8;

        public c(k k0, f[] arr_k$f) {
            super(k0);
            this.b = arr_k$f;
        }

        @Override  // com.fasterxml.jackson.databind.ser.impl.k
        public k l(Class class0, r r0) {
            f[] arr_k$f = this.b;
            if(arr_k$f.length == 8) {
                return this.a ? new e(this, class0, r0) : this;
            }
            f[] arr_k$f1 = (f[])Arrays.copyOf(arr_k$f, arr_k$f.length + 1);
            arr_k$f1[arr_k$f.length] = new f(class0, r0);
            return new c(this, arr_k$f1);
        }

        @Override  // com.fasterxml.jackson.databind.ser.impl.k
        public r m(Class class0) {
            f[] arr_k$f = this.b;
            f k$f0 = arr_k$f[0];
            if(k$f0.a == class0) {
                return k$f0.b;
            }
            f k$f1 = arr_k$f[1];
            if(k$f1.a == class0) {
                return k$f1.b;
            }
            f k$f2 = arr_k$f[2];
            if(k$f2.a == class0) {
                return k$f2.b;
            }
            switch(arr_k$f.length) {
                case 4: {
                    break;
                }
                case 5: {
                label_21:
                    f k$f6 = arr_k$f[4];
                    if(k$f6.a == class0) {
                        return k$f6.b;
                    }
                    break;
                }
                case 6: {
                label_18:
                    f k$f5 = arr_k$f[5];
                    if(k$f5.a == class0) {
                        return k$f5.b;
                    }
                    goto label_21;
                }
                case 7: {
                label_15:
                    f k$f4 = arr_k$f[6];
                    if(k$f4.a == class0) {
                        return k$f4.b;
                    }
                    goto label_18;
                }
                case 8: {
                    f k$f3 = arr_k$f[7];
                    if(k$f3.a == class0) {
                        return k$f3.b;
                    }
                    goto label_15;
                }
                default: {
                    return null;
                }
            }
            f k$f7 = arr_k$f[3];
            return k$f7.a == class0 ? k$f7.b : null;
        }
    }

    public static final class d {
        public final r a;
        public final k b;

        public d(r r0, k k0) {
            this.a = r0;
            this.b = k0;
        }
    }

    static final class e extends k {
        private final Class b;
        private final r c;

        public e(k k0, Class class0, r r0) {
            super(k0);
            this.b = class0;
            this.c = r0;
        }

        @Override  // com.fasterxml.jackson.databind.ser.impl.k
        public k l(Class class0, r r0) {
            return new a(this, this.b, this.c, class0, r0);
        }

        @Override  // com.fasterxml.jackson.databind.ser.impl.k
        public r m(Class class0) {
            return class0 == this.b ? this.c : null;
        }
    }

    static final class f {
        public final Class a;
        public final r b;

        public f(Class class0, r r0) {
            this.a = class0;
            this.b = r0;
        }
    }

    protected final boolean a;

    protected k(k k0) {
        this.a = k0.a;
    }

    protected k(boolean z) {
        this.a = z;
    }

    public final d a(m m0, r r0) {
        return new d(r0, this.l(m0.g(), r0));
    }

    public final d b(Class class0, r r0) {
        return new d(r0, this.l(class0, r0));
    }

    public static k c() {
        return b.b;
    }

    public static k d() {
        return b.c;
    }

    public final d e(Class class0, I i0, com.fasterxml.jackson.databind.d d0) throws o {
        r r0 = i0.c0(class0, d0);
        return new d(r0, this.l(class0, r0));
    }

    public final d f(m m0, I i0, com.fasterxml.jackson.databind.d d0) throws o {
        r r0 = i0.h0(m0, d0);
        return new d(r0, this.l(m0.g(), r0));
    }

    public final d g(Class class0, I i0, com.fasterxml.jackson.databind.d d0) throws o {
        r r0 = i0.i0(class0, d0);
        return new d(r0, this.l(class0, r0));
    }

    public final d h(m m0, I i0) throws o {
        r r0 = i0.k0(m0, false, null);
        return new d(r0, this.l(m0.g(), r0));
    }

    public final d i(Class class0, I i0) throws o {
        r r0 = i0.m0(class0, false, null);
        return new d(r0, this.l(class0, r0));
    }

    public final d j(m m0, I i0, com.fasterxml.jackson.databind.d d0) throws o {
        r r0 = i0.Z(m0, d0);
        return new d(r0, this.l(m0.g(), r0));
    }

    public final d k(Class class0, I i0, com.fasterxml.jackson.databind.d d0) throws o {
        r r0 = i0.a0(class0, d0);
        return new d(r0, this.l(class0, r0));
    }

    public abstract k l(Class arg1, r arg2);

    public abstract r m(Class arg1);
}

