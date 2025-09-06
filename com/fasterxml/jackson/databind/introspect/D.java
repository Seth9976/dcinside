package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.type.p;
import com.fasterxml.jackson.databind.type.q;
import com.fasterxml.jackson.databind.util.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public final class d extends b implements K {
    public static final class a {
        public final f a;
        public final List b;
        public final List c;

        public a(f f0, List list0, List list1) {
            this.a = f0;
            this.b = list0;
            this.c = list1;
        }
    }

    protected final m a;
    protected final Class b;
    protected final p c;
    protected final List d;
    protected final com.fasterxml.jackson.databind.b e;
    protected final q f;
    protected final com.fasterxml.jackson.databind.introspect.w.a g;
    protected final Class h;
    protected final boolean i;
    protected final com.fasterxml.jackson.databind.util.b j;
    protected a k;
    protected n l;
    protected List m;
    protected transient Boolean n;
    private static final a o;

    static {
        d.o = new a(null, Collections.emptyList(), Collections.emptyList());
    }

    @Deprecated
    d(m m0, Class class0, List list0, Class class1, com.fasterxml.jackson.databind.util.b b0, p p0, com.fasterxml.jackson.databind.b b1, com.fasterxml.jackson.databind.introspect.w.a w$a0, q q0) {
        this(m0, class0, list0, class1, b0, p0, b1, w$a0, q0, true);
    }

    d(m m0, Class class0, List list0, Class class1, com.fasterxml.jackson.databind.util.b b0, p p0, com.fasterxml.jackson.databind.b b1, com.fasterxml.jackson.databind.introspect.w.a w$a0, q q0, boolean z) {
        this.a = m0;
        this.b = class0;
        this.d = list0;
        this.h = class1;
        this.j = b0;
        this.c = p0;
        this.e = b1;
        this.g = w$a0;
        this.f = q0;
        this.i = z;
    }

    d(Class class0) {
        this.a = null;
        this.b = class0;
        this.d = Collections.emptyList();
        this.h = null;
        this.j = com.fasterxml.jackson.databind.introspect.q.d();
        this.c = p.i();
        this.e = null;
        this.g = null;
        this.f = null;
        this.i = false;
    }

    public int A() {
        return this.l().size();
    }

    public int B() {
        return this.m().size();
    }

    @Deprecated
    public List C() {
        return this.z();
    }

    public boolean D() {
        return this.j.size() > 0;
    }

    public boolean E() {
        Boolean boolean0 = this.n;
        if(boolean0 == null) {
            boolean0 = Boolean.valueOf(h.e0(this.b));
            this.n = boolean0;
        }
        return boolean0.booleanValue();
    }

    public Iterable F() {
        return this.m();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.K
    public m a(Type type0) {
        return this.f.t0(type0, this.c);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    @Deprecated
    public Iterable b() {
        com.fasterxml.jackson.databind.util.b b0 = this.j;
        if(b0 instanceof s) {
            return ((s)b0).g();
        }
        if(b0 instanceof com.fasterxml.jackson.databind.introspect.q.d || b0 instanceof com.fasterxml.jackson.databind.introspect.q.f) {
            throw new UnsupportedOperationException("please use getAnnotations/ hasAnnotation to check for Annotations");
        }
        return Collections.emptyList();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public AnnotatedElement c() {
        return this.u();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public Annotation d(Class class0) {
        return this.j.a(class0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public int e() {
        return this.b.getModifiers();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return h.R(object0, d.class) ? ((d)object0).b == this.b : false;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public Class f() {
        return this.b;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public m g() {
        return this.a;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public String getName() {
        return this.b.getName();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public boolean h(Class class0) {
        return this.j.c(class0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public boolean i(Class[] arr_class) {
        return this.j.b(arr_class);
    }

    private final a k() {
        a d$a0 = this.k;
        if(d$a0 == null) {
            d$a0 = this.a == null ? d.o : com.fasterxml.jackson.databind.introspect.h.p(this.e, this.f, this, this.a, this.h, this.i);
            this.k = d$a0;
        }
        return d$a0;
    }

    private final List l() {
        List list0 = this.m;
        if(list0 == null) {
            list0 = this.a == null ? Collections.emptyList() : j.m(this.e, this, this.g, this.f, this.a, this.i);
            this.m = list0;
        }
        return list0;
    }

    private final n m() {
        n n0 = this.l;
        if(n0 == null) {
            n0 = this.a == null ? new n() : com.fasterxml.jackson.databind.introspect.m.m(this.e, this, this.g, this.f, this.a, this.d, this.h, this.i);
            this.l = n0;
        }
        return n0;
    }

    @Deprecated
    public static d n(m m0, t t0) {
        return d.o(m0, t0, t0);
    }

    @Deprecated
    public static d o(m m0, t t0, com.fasterxml.jackson.databind.introspect.w.a w$a0) {
        return e.i(t0, m0, w$a0);
    }

    @Deprecated
    public static d p(Class class0, t t0) {
        return d.q(class0, t0, t0);
    }

    @Deprecated
    public static d q(Class class0, t t0, com.fasterxml.jackson.databind.introspect.w.a w$a0) {
        return e.o(t0, class0, w$a0);
    }

    public Iterable r() {
        return this.l();
    }

    public l s(String s, Class[] arr_class) {
        return this.m().a(s, arr_class);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public String toString() {
        return "[AnnotedClass " + this.b.getName() + "]";
    }

    public Class u() {
        return this.b;
    }

    public com.fasterxml.jackson.databind.util.b w() {
        return this.j;
    }

    public List x() {
        return this.k().b;
    }

    public f y() {
        return this.k().a;
    }

    public List z() {
        return this.k().c;
    }
}

