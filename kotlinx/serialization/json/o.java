package kotlinx.serialization.json;

import kotlin.S0;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.x;

@b0
@x(forClass = l.class)
public final class o implements i {
    static final class a extends N implements Function1 {
        public static final a e;

        static {
            a.e = new a();
        }

        a() {
            super(1);
        }

        public final void a(@y4.l kotlinx.serialization.descriptors.a a0) {
            static final class kotlinx.serialization.json.o.a.a extends N implements A3.a {
                public static final kotlinx.serialization.json.o.a.a e;

                static {
                    kotlinx.serialization.json.o.a.a.e = new kotlinx.serialization.json.o.a.a();
                }

                kotlinx.serialization.json.o.a.a() {
                    super(0);
                }

                @y4.l
                public final f b() {
                    return C.a.getDescriptor();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            }


            static final class b extends N implements A3.a {
                public static final b e;

                static {
                    b.e = new b();
                }

                b() {
                    super(0);
                }

                @y4.l
                public final f b() {
                    return kotlinx.serialization.json.x.a.getDescriptor();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            }


            static final class c extends N implements A3.a {
                public static final c e;

                static {
                    c.e = new c();
                }

                c() {
                    super(0);
                }

                @y4.l
                public final f b() {
                    return u.a.getDescriptor();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            }


            static final class d extends N implements A3.a {
                public static final d e;

                static {
                    d.e = new d();
                }

                d() {
                    super(0);
                }

                @y4.l
                public final f b() {
                    return A.a.getDescriptor();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            }


            static final class e extends N implements A3.a {
                public static final e e;

                static {
                    e.e = new e();
                }

                e() {
                    super(0);
                }

                @y4.l
                public final f b() {
                    return kotlinx.serialization.json.e.a.getDescriptor();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            }

            L.p(a0, "$this$buildSerialDescriptor");
            kotlinx.serialization.descriptors.a.b(a0, "JsonPrimitive", p.f(kotlinx.serialization.json.o.a.a.e), null, false, 12, null);
            kotlinx.serialization.descriptors.a.b(a0, "JsonNull", p.f(b.e), null, false, 12, null);
            kotlinx.serialization.descriptors.a.b(a0, "JsonLiteral", p.f(c.e), null, false, 12, null);
            kotlinx.serialization.descriptors.a.b(a0, "JsonObject", p.f(d.e), null, false, 12, null);
            kotlinx.serialization.descriptors.a.b(a0, "JsonArray", p.f(e.e), null, false, 12, null);
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            this.a(((kotlinx.serialization.descriptors.a)object0));
            return S0.a;
        }
    }

    @y4.l
    public static final o a;
    @y4.l
    private static final f b;

    static {
        o.a = new o();
        o.b = kotlinx.serialization.descriptors.i.e("kotlinx.serialization.json.JsonElement", kotlinx.serialization.descriptors.d.b.a, new f[0], a.e);
    }

    @y4.l
    public l a(@y4.l kotlinx.serialization.encoding.e e0) {
        L.p(e0, "decoder");
        return p.d(e0).t();
    }

    public void b(@y4.l g g0, @y4.l l l0) {
        L.p(g0, "encoder");
        L.p(l0, "value");
        p.h(g0);
        if(l0 instanceof B) {
            g0.e(C.a, l0);
            return;
        }
        if(l0 instanceof y) {
            g0.e(A.a, l0);
            return;
        }
        if(l0 instanceof kotlinx.serialization.json.c) {
            g0.e(kotlinx.serialization.json.e.a, l0);
        }
    }

    @Override  // kotlinx.serialization.d
    public Object deserialize(kotlinx.serialization.encoding.e e0) {
        return this.a(e0);
    }

    @Override  // kotlinx.serialization.i
    @y4.l
    public f getDescriptor() {
        return o.b;
    }

    @Override  // kotlinx.serialization.w
    public void serialize(g g0, Object object0) {
        this.b(g0, ((l)object0));
    }
}

