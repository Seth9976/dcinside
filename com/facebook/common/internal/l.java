package com.facebook.common.internal;

import java.util.Arrays;
import k1.n.a;
import k1.n;
import o3.c;
import o3.h;

@n(a.a)
public final class l {
    public static final class com.facebook.common.internal.l.a {
        static final class com.facebook.common.internal.l.a.a {
            @h
            String a;
            @h
            Object b;
            @h
            com.facebook.common.internal.l.a.a c;

            private com.facebook.common.internal.l.a.a() {
            }

            com.facebook.common.internal.l.a.a(m m0) {
            }
        }

        private final String a;
        private final com.facebook.common.internal.l.a.a b;
        private com.facebook.common.internal.l.a.a c;
        private boolean d;

        private com.facebook.common.internal.l.a(String s) {
            com.facebook.common.internal.l.a.a l$a$a0 = new com.facebook.common.internal.l.a.a(null);
            this.b = l$a$a0;
            this.c = l$a$a0;
            this.d = false;
            this.a = (String)com.facebook.common.internal.n.i(s);
        }

        com.facebook.common.internal.l.a(String s, m m0) {
            this(s);
        }

        public com.facebook.common.internal.l.a a(String s, char c) {
            return this.j(s, String.valueOf(c));
        }

        public com.facebook.common.internal.l.a b(String s, double f) {
            return this.j(s, String.valueOf(f));
        }

        public com.facebook.common.internal.l.a c(String s, float f) {
            return this.j(s, String.valueOf(f));
        }

        public com.facebook.common.internal.l.a d(String s, int v) {
            return this.j(s, String.valueOf(v));
        }

        public com.facebook.common.internal.l.a e(String s, long v) {
            return this.j(s, String.valueOf(v));
        }

        public com.facebook.common.internal.l.a f(String s, @h Object object0) {
            return this.j(s, object0);
        }

        public com.facebook.common.internal.l.a g(String s, boolean z) {
            return this.j(s, String.valueOf(z));
        }

        private com.facebook.common.internal.l.a.a h() {
            com.facebook.common.internal.l.a.a l$a$a0 = new com.facebook.common.internal.l.a.a(null);
            this.c.c = l$a$a0;
            this.c = l$a$a0;
            return l$a$a0;
        }

        private com.facebook.common.internal.l.a i(@h Object object0) {
            this.h().b = object0;
            return this;
        }

        private com.facebook.common.internal.l.a j(String s, @h Object object0) {
            com.facebook.common.internal.l.a.a l$a$a0 = this.h();
            l$a$a0.b = object0;
            l$a$a0.a = (String)com.facebook.common.internal.n.i(s);
            return this;
        }

        public com.facebook.common.internal.l.a k(char c) {
            return this.i(String.valueOf(c));
        }

        public com.facebook.common.internal.l.a l(double f) {
            return this.i(String.valueOf(f));
        }

        public com.facebook.common.internal.l.a m(float f) {
            return this.i(String.valueOf(f));
        }

        public com.facebook.common.internal.l.a n(int v) {
            return this.i(String.valueOf(v));
        }

        public com.facebook.common.internal.l.a o(long v) {
            return this.i(String.valueOf(v));
        }

        public com.facebook.common.internal.l.a p(@h Object object0) {
            return this.i(object0);
        }

        public com.facebook.common.internal.l.a q(boolean z) {
            return this.i(String.valueOf(z));
        }

        public com.facebook.common.internal.l.a r() {
            this.d = true;
            return this;
        }

        @Override
        public String toString() {
            boolean z = this.d;
            StringBuilder stringBuilder0 = new StringBuilder(0x20);
            stringBuilder0.append(this.a);
            stringBuilder0.append('{');
            com.facebook.common.internal.l.a.a l$a$a0 = this.b.c;
            String s = "";
            while(l$a$a0 != null) {
                Object object0 = l$a$a0.b;
                if(!z || object0 != null) {
                    stringBuilder0.append(s);
                    String s1 = l$a$a0.a;
                    if(s1 != null) {
                        stringBuilder0.append(s1);
                        stringBuilder0.append('=');
                    }
                    if(object0 == null || !object0.getClass().isArray()) {
                        stringBuilder0.append(object0);
                    }
                    else {
                        String s2 = Arrays.deepToString(new Object[]{object0});
                        stringBuilder0.append(s2, 1, s2.length() - 1);
                    }
                    s = ", ";
                }
                l$a$a0 = l$a$a0.c;
            }
            stringBuilder0.append('}');
            return stringBuilder0.toString();
        }
    }

    // 去混淆评级： 低(20)
    @c
    public static boolean a(@h Object object0, @h Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    public static Object b(@h Object object0, @h Object object1) {
        return object0 == null ? com.facebook.common.internal.n.i(object1) : object0;
    }

    public static int c(@h Object[] arr_object) {
        return Arrays.hashCode(arr_object);
    }

    public static com.facebook.common.internal.l.a d(Class class0) {
        return new com.facebook.common.internal.l.a(class0.getSimpleName(), null);
    }

    public static com.facebook.common.internal.l.a e(Object object0) {
        return new com.facebook.common.internal.l.a(object0.getClass().getSimpleName(), null);
    }

    public static com.facebook.common.internal.l.a f(String s) {
        return new com.facebook.common.internal.l.a(s, null);
    }
}

