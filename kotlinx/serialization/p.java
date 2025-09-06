package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.S0;
import kotlin.b0;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.d;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.internal.b;
import y4.l;
import y4.m;

@h
public final class p extends b {
    @l
    private final d a;
    @l
    private List b;
    @l
    private final D c;
    @l
    private final Map d;
    @l
    private final Map e;

    public p(@l String s, @l d d0, @l d[] arr_d, @l i[] arr_i) {
        static final class a extends N implements A3.a {
            final String e;
            final p f;
            final i[] g;

            a(String s, p p0, i[] arr_i) {
                this.e = s;
                this.f = p0;
                this.g = arr_i;
                super(0);
            }

            @l
            public final f b() {
                static final class kotlinx.serialization.p.a.a extends N implements Function1 {
                    final p e;
                    final i[] f;

                    kotlinx.serialization.p.a.a(p p0, i[] arr_i) {
                        this.e = p0;
                        this.f = arr_i;
                        super(1);
                    }

                    public final void a(@l kotlinx.serialization.descriptors.a a0) {
                        static final class kotlinx.serialization.p.a.a.a extends N implements Function1 {
                            final i[] e;

                            kotlinx.serialization.p.a.a.a(i[] arr_i) {
                                this.e = arr_i;
                                super(1);
                            }

                            public final void a(@l kotlinx.serialization.descriptors.a a0) {
                                L.p(a0, "$this$buildSerialDescriptor");
                                for(Object object0: kotlin.collections.l.T8(this.e)) {
                                    f f0 = ((i)object0).getDescriptor();
                                    kotlinx.serialization.descriptors.a.b(a0, f0.h(), f0, null, false, 12, null);
                                }
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((kotlinx.serialization.descriptors.a)object0));
                                return S0.a;
                            }
                        }

                        L.p(a0, "$this$buildSerialDescriptor");
                        kotlinx.serialization.descriptors.a.b(a0, "type", P3.a.J(u0.a).getDescriptor(), null, false, 12, null);
                        kotlinx.serialization.p.a.a.a p$a$a$a0 = new kotlinx.serialization.p.a.a.a(this.f);
                        kotlinx.serialization.descriptors.a.b(a0, "value", kotlinx.serialization.descriptors.i.e(("kotlinx.serialization.Sealed<" + this.e.e().u() + '>'), kotlinx.serialization.descriptors.j.a.a, new f[0], p$a$a$a0), null, false, 12, null);
                        a0.l(this.e.b);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((kotlinx.serialization.descriptors.a)object0));
                        return S0.a;
                    }
                }

                kotlinx.serialization.p.a.a p$a$a0 = new kotlinx.serialization.p.a.a(this.f, this.g);
                return kotlinx.serialization.descriptors.i.e(this.e, kotlinx.serialization.descriptors.d.b.a, new f[0], p$a$a0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        public static final class kotlinx.serialization.p.b implements kotlin.collections.L {
            final Iterable a;

            public kotlinx.serialization.p.b(Iterable iterable0) {
                this.a = iterable0;
                super();
            }

            @Override  // kotlin.collections.L
            public Object a(Object object0) {
                return ((i)((Map.Entry)object0).getValue()).getDescriptor().h();
            }

            @Override  // kotlin.collections.L
            @l
            public Iterator b() {
                return this.a.iterator();
            }
        }

        L.p(s, "serialName");
        L.p(d0, "baseClass");
        L.p(arr_d, "subclasses");
        L.p(arr_i, "subclassSerializers");
        super();
        this.a = d0;
        this.b = u.H();
        a p$a0 = new a(s, this, arr_i);
        this.c = E.c(H.b, p$a0);
        if(arr_d.length != arr_i.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + this.e().u() + " should be marked @Serializable");
        }
        Map map0 = Y.B0(kotlin.collections.l.uA(arr_d, arr_i));
        this.d = map0;
        kotlinx.serialization.p.b p$b0 = new kotlinx.serialization.p.b(map0.entrySet());
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        Iterator iterator0 = p$b0.b();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = p$b0.a(object0);
            Object object2 = linkedHashMap0.get(object1);
            if(object2 == null) {
                linkedHashMap0.containsKey(object1);
            }
            if(((Map.Entry)object2) != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of \'" + this.e() + "\' have the same serial name \'" + ((String)object1) + "\': \'" + ((Map.Entry)object2).getKey() + "\', \'" + ((Map.Entry)object0).getKey() + '\'').toString());
            }
            linkedHashMap0.put(object1, ((Map.Entry)object0));
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(Y.j(linkedHashMap0.size()));
        for(Object object3: linkedHashMap0.entrySet()) {
            linkedHashMap1.put(((Map.Entry)object3).getKey(), ((i)((Map.Entry)((Map.Entry)object3).getValue()).getValue()));
        }
        this.e = linkedHashMap1;
    }

    @b0
    public p(@l String s, @l d d0, @l d[] arr_d, @l i[] arr_i, @l Annotation[] arr_annotation) {
        L.p(s, "serialName");
        L.p(d0, "baseClass");
        L.p(arr_d, "subclasses");
        L.p(arr_i, "subclassSerializers");
        L.p(arr_annotation, "classAnnotations");
        this(s, d0, arr_d, arr_i);
        this.b = kotlin.collections.l.t(arr_annotation);
    }

    @Override  // kotlinx.serialization.internal.b
    @m
    public kotlinx.serialization.d c(@l c c0, @m String s) {
        L.p(c0, "decoder");
        kotlinx.serialization.d d0 = (i)this.e.get(s);
        return d0 == null ? super.c(c0, s) : d0;
    }

    @Override  // kotlinx.serialization.internal.b
    @m
    public w d(@l g g0, @l Object object0) {
        L.p(g0, "encoder");
        L.p(object0, "value");
        d d0 = m0.d(object0.getClass());
        w w0 = (i)this.d.get(d0);
        if(w0 == null) {
            w0 = super.d(g0, object0);
        }
        return w0 == null ? null : w0;
    }

    @Override  // kotlinx.serialization.internal.b
    @l
    public d e() {
        return this.a;
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return (f)this.c.getValue();
    }
}

