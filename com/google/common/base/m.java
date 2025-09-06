package com.google.common.base;

import J1.b;
import J1.c;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@b(emulated = true)
@k
public final class M {
    public static final class f {
        private final M a;
        private final M b;
        private static final String c = "Chunk [%s] is not a valid entry";

        private f(M m0, M m1) {
            this.a = m0;
            this.b = (M)H.E(m1);
        }

        f(M m0, M m1, a m$a0) {
            this(m0, m1);
        }

        public Map a(CharSequence charSequence0) {
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            for(Object object0: this.a.n(charSequence0)) {
                Iterator iterator1 = this.b.p(((String)object0));
                H.u(iterator1.hasNext(), "Chunk [%s] is not a valid entry", ((String)object0));
                Object object1 = iterator1.next();
                H.u(!linkedHashMap0.containsKey(((String)object1)), "Duplicate key [%s] found.", ((String)object1));
                H.u(iterator1.hasNext(), "Chunk [%s] is not a valid entry", ((String)object0));
                Object object2 = iterator1.next();
                linkedHashMap0.put(((String)object1), ((String)object2));
                H.u(!iterator1.hasNext(), "Chunk [%s] is not a valid entry", ((String)object0));
            }
            return DesugarCollections.unmodifiableMap(linkedHashMap0);
        }
    }

    static abstract class g extends com.google.common.base.b {
        final CharSequence c;
        final e d;
        final boolean e;
        int f;
        int g;

        protected g(M m0, CharSequence charSequence0) {
            this.f = 0;
            this.d = m0.a;
            this.e = m0.b;
            this.g = m0.d;
            this.c = charSequence0;
        }

        @Override  // com.google.common.base.b
        @o3.a
        protected Object a() {
            return this.d();
        }

        @o3.a
        protected String d() {
            int v = this.f;
            int v1;
            while((v1 = this.f) != -1) {
                int v2 = this.f(v1);
                if(v2 == -1) {
                    v2 = this.c.length();
                    this.f = -1;
                }
                else {
                    this.f = this.e(v2);
                }
                int v3 = this.f;
                if(v3 == v) {
                    this.f = v3 + 1;
                    if(v3 + 1 <= this.c.length()) {
                        continue;
                    }
                    this.f = -1;
                    continue;
                }
                while(v < v2) {
                    int v4 = this.c.charAt(v);
                    if(!this.d.B(((char)v4))) {
                        break;
                    }
                    ++v;
                }
                while(v2 > v) {
                    int v5 = this.c.charAt(v2 - 1);
                    if(!this.d.B(((char)v5))) {
                        break;
                    }
                    --v2;
                }
                if(this.e && v == v2) {
                    v = this.f;
                    continue;
                }
                int v6 = this.g;
                if(v6 == 1) {
                    v2 = this.c.length();
                    this.f = -1;
                    while(v2 > v) {
                        int v7 = this.c.charAt(v2 - 1);
                        if(!this.d.B(((char)v7))) {
                            return this.c.subSequence(v, v2).toString();
                        }
                        --v2;
                    }
                    return this.c.subSequence(v, v2).toString();
                }
                else {
                    this.g = v6 - 1;
                }
                return this.c.subSequence(v, v2).toString();
            }
            return (String)this.b();
        }

        abstract int e(int arg1);

        abstract int f(int arg1);
    }

    interface h {
        Iterator a(M arg1, CharSequence arg2);
    }

    private final e a;
    private final boolean b;
    private final h c;
    private final int d;

    private M(h m$h0) {
        this(m$h0, false, e.G(), 0x7FFFFFFF);
    }

    private M(h m$h0, boolean z, e e0, int v) {
        this.c = m$h0;
        this.b = z;
        this.a = e0;
        this.d = v;
    }

    public static M e(int v) {
        class d implements h {
            final int a;

            d(int v) {
            }

            @Override  // com.google.common.base.M$h
            public Iterator a(M m0, CharSequence charSequence0) {
                return this.b(m0, charSequence0);
            }

            public g b(M m0, CharSequence charSequence0) {
                class com.google.common.base.M.d.a extends g {
                    final d h;

                    com.google.common.base.M.d.a(M m0, CharSequence charSequence0) {
                        super(m0, charSequence0);
                    }

                    @Override  // com.google.common.base.M$g
                    public int e(int v) {
                        return v;
                    }

                    @Override  // com.google.common.base.M$g
                    public int f(int v) {
                        int v1 = v + d.this.a;
                        return v1 < this.c.length() ? v1 : -1;
                    }
                }

                return new com.google.common.base.M.d.a(this, m0, charSequence0);
            }
        }

        H.e(v > 0, "The length may not be less than 1");
        return new M(new d(v));
    }

    public M f(int v) {
        H.k(v > 0, "must be greater than zero: %s", v);
        return new M(this.c, this.b, this.a, v);
    }

    public M g() {
        return new M(this.c, true, this.a, this.d);
    }

    public static M h(char c) {
        return M.i(e.q(c));
    }

    public static M i(e e0) {
        class a implements h {
            final e a;

            a(e e0) {
            }

            @Override  // com.google.common.base.M$h
            public Iterator a(M m0, CharSequence charSequence0) {
                return this.b(m0, charSequence0);
            }

            public g b(M m0, CharSequence charSequence0) {
                class com.google.common.base.M.a.a extends g {
                    final a h;

                    com.google.common.base.M.a.a(M m0, CharSequence charSequence0) {
                        super(m0, charSequence0);
                    }

                    @Override  // com.google.common.base.M$g
                    int e(int v) {
                        return v + 1;
                    }

                    @Override  // com.google.common.base.M$g
                    int f(int v) {
                        return a.this.a.o(this.c, v);
                    }
                }

                return new com.google.common.base.M.a.a(this, m0, charSequence0);
            }
        }

        H.E(e0);
        return new M(new a(e0));
    }

    public static M j(String s) {
        class com.google.common.base.M.b implements h {
            final String a;

            com.google.common.base.M.b(String s) {
            }

            @Override  // com.google.common.base.M$h
            public Iterator a(M m0, CharSequence charSequence0) {
                return this.b(m0, charSequence0);
            }

            public g b(M m0, CharSequence charSequence0) {
                class com.google.common.base.M.b.a extends g {
                    final com.google.common.base.M.b h;

                    com.google.common.base.M.b.a(M m0, CharSequence charSequence0) {
                        super(m0, charSequence0);
                    }

                    @Override  // com.google.common.base.M$g
                    public int e(int v) {
                        return v + com.google.common.base.M.b.this.a.length();
                    }

                    @Override  // com.google.common.base.M$g
                    public int f(int v) {
                        int v1 = com.google.common.base.M.b.this.a.length();
                        int v2 = this.c.length();
                    label_2:
                        while(v <= v2 - v1) {
                            int v3 = 0;
                            while(v3 < v1) {
                                if(this.c.charAt(v3 + v) == com.google.common.base.M.b.this.a.charAt(v3)) {
                                    ++v3;
                                    continue;
                                }
                                ++v;
                                continue label_2;
                            }
                            return v;
                        }
                        return -1;
                    }
                }

                return new com.google.common.base.M.b.a(this, m0, charSequence0);
            }
        }

        H.e(s.length() != 0, "The separator may not be the empty string.");
        return s.length() == 1 ? M.h(s.charAt(0)) : new M(new com.google.common.base.M.b(s));
    }

    @c
    @J1.d
    public static M k(Pattern pattern0) {
        return M.m(new x(pattern0));
    }

    @c
    @J1.d
    public static M l(String s) {
        return M.m(G.a(s));
    }

    static M m(com.google.common.base.h h0) {
        class com.google.common.base.M.c implements h {
            final com.google.common.base.h a;

            com.google.common.base.M.c(com.google.common.base.h h0) {
            }

            @Override  // com.google.common.base.M$h
            public Iterator a(M m0, CharSequence charSequence0) {
                return this.b(m0, charSequence0);
            }

            public g b(M m0, CharSequence charSequence0) {
                class com.google.common.base.M.c.a extends g {
                    final com.google.common.base.g h;

                    com.google.common.base.M.c.a(M m0, CharSequence charSequence0, com.google.common.base.g g0) {
                        this.h = g0;
                        super(m0, charSequence0);
                    }

                    @Override  // com.google.common.base.M$g
                    public int e(int v) {
                        return this.h.a();
                    }

                    // 去混淆评级： 低(20)
                    @Override  // com.google.common.base.M$g
                    public int f(int v) {
                        return this.h.c(v) ? this.h.f() : -1;
                    }
                }

                return new com.google.common.base.M.c.a(this, m0, charSequence0, this.a.d(charSequence0));
            }
        }

        H.u(!h0.d("").d(), "The pattern may not match the empty string: %s", h0);
        return new M(new com.google.common.base.M.c(h0));
    }

    public Iterable n(CharSequence charSequence0) {
        class com.google.common.base.M.e implements Iterable {
            final CharSequence a;
            final M b;

            com.google.common.base.M.e(CharSequence charSequence0) {
                this.a = charSequence0;
                super();
            }

            @Override
            public Iterator iterator() {
                return M.this.p(this.a);
            }

            @Override
            public String toString() {
                y y0 = y.p(", ");
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append('[');
                StringBuilder stringBuilder1 = y0.f(stringBuilder0, this);
                stringBuilder1.append(']');
                return stringBuilder1.toString();
            }
        }

        H.E(charSequence0);
        return new com.google.common.base.M.e(this, charSequence0);
    }

    public List o(CharSequence charSequence0) {
        H.E(charSequence0);
        Iterator iterator0 = this.p(charSequence0);
        ArrayList arrayList0 = new ArrayList();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            arrayList0.add(((String)object0));
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    private Iterator p(CharSequence charSequence0) {
        return this.c.a(this, charSequence0);
    }

    public M q() {
        return this.r(e.X());
    }

    public M r(e e0) {
        H.E(e0);
        return new M(this.c, this.b, e0, this.d);
    }

    public f s(char c) {
        return this.t(M.h(c));
    }

    public f t(M m0) {
        return new f(this, m0, null);
    }

    public f u(String s) {
        return this.t(M.j(s));
    }
}

