package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class a extends com.fasterxml.jackson.databind.jsontype.d.a implements Serializable {
    public static class com.fasterxml.jackson.databind.jsontype.a.a {
        protected Set a;
        protected List b;
        protected List c;
        protected List d;

        protected com.fasterxml.jackson.databind.jsontype.a.a a(c a$c0) {
            if(this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(a$c0);
            return this;
        }

        protected com.fasterxml.jackson.databind.jsontype.a.a b(c a$c0) {
            if(this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(a$c0);
            return this;
        }

        protected com.fasterxml.jackson.databind.jsontype.a.a c(b a$b0) {
            if(this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(a$b0);
            return this;
        }

        public com.fasterxml.jackson.databind.jsontype.a.a d(c a$c0) {
            return this.a(a$c0);
        }

        public com.fasterxml.jackson.databind.jsontype.a.a e(Class class0) {
            class com.fasterxml.jackson.databind.jsontype.a.a.a extends c {
                final Class a;
                final com.fasterxml.jackson.databind.jsontype.a.a b;

                com.fasterxml.jackson.databind.jsontype.a.a.a(Class class0) {
                    this.a = class0;
                    super();
                }

                @Override  // com.fasterxml.jackson.databind.jsontype.a$c
                public boolean a(t t0, Class class0) {
                    return this.a.isAssignableFrom(class0);
                }
            }

            return this.a(new com.fasterxml.jackson.databind.jsontype.a.a.a(this, class0));
        }

        public com.fasterxml.jackson.databind.jsontype.a.a f(String s) {
            class com.fasterxml.jackson.databind.jsontype.a.a.c extends c {
                final String a;
                final com.fasterxml.jackson.databind.jsontype.a.a b;

                com.fasterxml.jackson.databind.jsontype.a.a.c(String s) {
                    this.a = s;
                    super();
                }

                @Override  // com.fasterxml.jackson.databind.jsontype.a$c
                public boolean a(t t0, Class class0) {
                    return class0.getName().startsWith(this.a);
                }
            }

            return this.a(new com.fasterxml.jackson.databind.jsontype.a.a.c(this, s));
        }

        public com.fasterxml.jackson.databind.jsontype.a.a g(Pattern pattern0) {
            class com.fasterxml.jackson.databind.jsontype.a.a.b extends c {
                final Pattern a;
                final com.fasterxml.jackson.databind.jsontype.a.a b;

                com.fasterxml.jackson.databind.jsontype.a.a.b(Pattern pattern0) {
                    this.a = pattern0;
                    super();
                }

                @Override  // com.fasterxml.jackson.databind.jsontype.a$c
                public boolean a(t t0, Class class0) {
                    return this.a.matcher(class0.getName()).matches();
                }
            }

            return this.a(new com.fasterxml.jackson.databind.jsontype.a.a.b(this, pattern0));
        }

        public com.fasterxml.jackson.databind.jsontype.a.a h(c a$c0) {
            return this.b(a$c0);
        }

        public com.fasterxml.jackson.databind.jsontype.a.a i(Class class0) {
            class d extends c {
                final Class a;
                final com.fasterxml.jackson.databind.jsontype.a.a b;

                d(Class class0) {
                    this.a = class0;
                    super();
                }

                @Override  // com.fasterxml.jackson.databind.jsontype.a$c
                public boolean a(t t0, Class class0) {
                    return this.a.isAssignableFrom(class0);
                }
            }

            return this.b(new d(this, class0));
        }

        public com.fasterxml.jackson.databind.jsontype.a.a j(String s) {
            class f extends b {
                final String a;
                final com.fasterxml.jackson.databind.jsontype.a.a b;

                f(String s) {
                    this.a = s;
                    super();
                }

                @Override  // com.fasterxml.jackson.databind.jsontype.a$b
                public boolean a(t t0, String s) {
                    return s.startsWith(this.a);
                }
            }

            return this.c(new f(this, s));
        }

        public com.fasterxml.jackson.databind.jsontype.a.a k(Pattern pattern0) {
            class e extends b {
                final Pattern a;
                final com.fasterxml.jackson.databind.jsontype.a.a b;

                e(Pattern pattern0) {
                    this.a = pattern0;
                    super();
                }

                @Override  // com.fasterxml.jackson.databind.jsontype.a$b
                public boolean a(t t0, String s) {
                    return this.a.matcher(s).matches();
                }
            }

            return this.c(new e(this, pattern0));
        }

        public com.fasterxml.jackson.databind.jsontype.a.a l() {
            class g extends c {
                final com.fasterxml.jackson.databind.jsontype.a.a a;

                @Override  // com.fasterxml.jackson.databind.jsontype.a$c
                public boolean a(t t0, Class class0) {
                    return class0.isArray();
                }
            }

            return this.b(new g(this));
        }

        public a m() {
            Set set0 = this.a;
            c[] arr_a$c = null;
            c[] arr_a$c1 = this.b == null ? null : ((c[])this.b.toArray(new c[0]));
            b[] arr_a$b = this.c == null ? null : ((b[])this.c.toArray(new b[0]));
            List list0 = this.d;
            if(list0 != null) {
                arr_a$c = (c[])list0.toArray(new c[0]);
            }
            return new a(set0, arr_a$c1, arr_a$b, arr_a$c);
        }

        public com.fasterxml.jackson.databind.jsontype.a.a n(Class class0) {
            if(this.a == null) {
                this.a = new HashSet();
            }
            this.a.add(class0);
            return this;
        }
    }

    public static abstract class b {
        public abstract boolean a(t arg1, String arg2);
    }

    public static abstract class c {
        public abstract boolean a(t arg1, Class arg2);
    }

    protected final Set c;
    protected final c[] d;
    protected final b[] e;
    protected final c[] f;
    private static final long g = 1L;

    protected a(Set set0, c[] arr_a$c, b[] arr_a$b, c[] arr_a$c1) {
        this.c = set0;
        this.d = arr_a$c;
        this.e = arr_a$b;
        this.f = arr_a$c1;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.d$a
    public com.fasterxml.jackson.databind.jsontype.d.b a(t t0, m m0) {
        Class class0 = m0.g();
        if(this.c != null && this.c.contains(class0)) {
            return com.fasterxml.jackson.databind.jsontype.d.b.b;
        }
        c[] arr_a$c = this.d;
        if(arr_a$c != null) {
            for(int v = 0; v < arr_a$c.length; ++v) {
                if(arr_a$c[v].a(t0, class0)) {
                    return com.fasterxml.jackson.databind.jsontype.d.b.a;
                }
            }
        }
        return com.fasterxml.jackson.databind.jsontype.d.b.c;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.d$a
    public com.fasterxml.jackson.databind.jsontype.d.b b(t t0, m m0, String s) throws o {
        b[] arr_a$b = this.e;
        if(arr_a$b != null) {
            for(int v = 0; v < arr_a$b.length; ++v) {
                if(arr_a$b[v].a(t0, s)) {
                    return com.fasterxml.jackson.databind.jsontype.d.b.a;
                }
            }
        }
        return com.fasterxml.jackson.databind.jsontype.d.b.c;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.d$a
    public com.fasterxml.jackson.databind.jsontype.d.b c(t t0, m m0, m m1) throws o {
        if(this.f != null) {
            Class class0 = m1.g();
            c[] arr_a$c = this.f;
            for(int v = 0; v < arr_a$c.length; ++v) {
                if(arr_a$c[v].a(t0, class0)) {
                    return com.fasterxml.jackson.databind.jsontype.d.b.a;
                }
            }
        }
        return com.fasterxml.jackson.databind.jsontype.d.b.c;
    }

    public static com.fasterxml.jackson.databind.jsontype.a.a d() {
        return new com.fasterxml.jackson.databind.jsontype.a.a();
    }
}

