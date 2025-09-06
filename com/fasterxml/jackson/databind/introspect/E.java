package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.type.p;
import com.fasterxml.jackson.databind.util.h;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class e {
    private final t a;
    private final b b;
    private final a c;
    private final p d;
    private final m e;
    private final Class f;
    private final Class g;
    private final boolean h;
    private static final com.fasterxml.jackson.databind.util.b i;
    private static final Class j;
    private static final Class k;
    private static final Class l;
    private static final Class m;

    static {
        e.i = q.d();
        e.j = Object.class;
        e.k = Enum.class;
        e.l = List.class;
        e.m = Map.class;
    }

    e(t t0, m m0, a w$a0) {
        this.a = t0;
        this.e = m0;
        Class class0 = m0.g();
        this.f = class0;
        this.c = w$a0;
        this.d = m0.D();
        Class class1 = null;
        b b0 = t0.Z() ? t0.n() : null;
        this.b = b0;
        if(w$a0 != null) {
            class1 = w$a0.b(class0);
        }
        this.g = class1;
        this.h = b0 != null && (!h.a0(class0) || !m0.o());
    }

    e(t t0, Class class0, a w$a0) {
        this.a = t0;
        Class class1 = null;
        this.e = null;
        this.f = class0;
        this.c = w$a0;
        this.d = p.i();
        if(t0 == null) {
            this.b = null;
            this.g = null;
        }
        else {
            this.b = t0.Z() ? t0.n() : null;
            if(w$a0 != null) {
                class1 = w$a0.b(class0);
            }
            this.g = class1;
        }
        this.h = this.b != null;
    }

    private q a(q q0, Annotation[] arr_annotation) {
        if(arr_annotation != null) {
            for(int v = 0; v < arr_annotation.length; ++v) {
                Annotation annotation0 = arr_annotation[v];
                if(!q0.h(annotation0)) {
                    q0 = q0.a(annotation0);
                    if(this.b.G0(annotation0)) {
                        q0 = this.c(q0, annotation0);
                    }
                }
            }
        }
        return q0;
    }

    private q b(q q0, Class class0, Class class1) {
        if(class1 != null) {
            q0 = this.a(q0, h.r(class1));
            for(Object object0: h.z(class1, class0, false)) {
                q0 = this.a(q0, h.r(((Class)object0)));
            }
        }
        return q0;
    }

    private q c(q q0, Annotation annotation0) {
        Annotation[] arr_annotation = h.r(annotation0.annotationType());
        for(int v = 0; v < arr_annotation.length; ++v) {
            Annotation annotation1 = arr_annotation[v];
            if(!(annotation1 instanceof Target) && !(annotation1 instanceof Retention) && !q0.h(annotation1)) {
                q0 = q0.a(annotation1);
                if(this.b.G0(annotation1)) {
                    q0 = this.c(q0, annotation1);
                }
            }
        }
        return q0;
    }

    private static void d(m m0, List list0, boolean z) {
        Class class0 = m0.g();
        if(z) {
            if(e.f(list0, class0)) {
                return;
            }
            list0.add(m0);
            if(class0 == e.l || class0 == e.m) {
                return;
            }
        }
        for(Object object0: m0.M()) {
            e.d(((m)object0), list0, true);
        }
    }

    private static void e(m m0, List list0, boolean z) {
        Class class0 = m0.g();
        if(class0 != e.j && class0 != e.k) {
            if(z) {
                if(e.f(list0, class0)) {
                    return;
                }
                list0.add(m0);
            }
            for(Object object0: m0.M()) {
                e.d(((m)object0), list0, true);
            }
            m m1 = m0.Q();
            if(m1 != null) {
                e.e(m1, list0, true);
            }
        }
    }

    private static boolean f(List list0, Class class0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((m)list0.get(v1)).g() == class0) {
                return true;
            }
        }
        return false;
    }

    static d g(t t0, Class class0) {
        return new d(class0);
    }

    static d h(Class class0) {
        return new d(class0);
    }

    // 去混淆评级： 低(20)
    public static d i(t t0, m m0, a w$a0) {
        return !m0.l() || !e.p(t0, m0.g()) ? new e(t0, m0, w$a0).k() : e.g(t0, m0.g());
    }

    private com.fasterxml.jackson.databind.util.b j(List list0) {
        if(this.b == null) {
            return e.i;
        }
        boolean z = this.c != null && (!(this.c instanceof J) || ((J)this.c).e());
        if(!z && !this.h) {
            return e.i;
        }
        q q0 = q.e();
        Class class0 = this.g;
        if(class0 != null) {
            q0 = this.b(q0, this.f, class0);
        }
        if(this.h) {
            q0 = this.a(q0, h.r(this.f));
        }
        for(Object object0: list0) {
            m m0 = (m)object0;
            if(z) {
                Class class1 = m0.g();
                q0 = this.b(q0, class1, this.c.b(class1));
            }
            if(this.h) {
                q0 = this.a(q0, h.r(m0.g()));
            }
        }
        if(z) {
            Class class2 = this.c.b(Object.class);
            q0 = this.b(q0, Object.class, class2);
        }
        return q0.c();
    }

    d k() {
        ArrayList arrayList0 = new ArrayList(8);
        if(!this.e.j(Object.class)) {
            if(this.e.isInterface()) {
                e.d(this.e, arrayList0, false);
            }
            else {
                e.e(this.e, arrayList0, false);
            }
        }
        com.fasterxml.jackson.databind.util.b b0 = this.j(arrayList0);
        com.fasterxml.jackson.databind.type.q q0 = this.a.S();
        return new d(this.e, this.f, arrayList0, this.g, b0, this.d, this.b, this.c, q0, this.h);
    }

    d l() {
        List list0 = Collections.emptyList();
        com.fasterxml.jackson.databind.util.b b0 = this.j(list0);
        com.fasterxml.jackson.databind.type.q q0 = this.a.S();
        return new d(null, this.f, list0, this.g, b0, this.d, this.b, this.c, q0, this.h);
    }

    // 去混淆评级： 低(20)
    public static d m(t t0, m m0, a w$a0) {
        return !m0.l() || !e.p(t0, m0.g()) ? new e(t0, m0, w$a0).l() : e.g(t0, m0.g());
    }

    public static d n(t t0, Class class0) {
        return e.o(t0, class0, t0);
    }

    // 去混淆评级： 低(20)
    public static d o(t t0, Class class0, a w$a0) {
        return !class0.isArray() || !e.p(t0, class0) ? new e(t0, class0, w$a0).l() : e.g(t0, class0);
    }

    private static boolean p(t t0, Class class0) {
        return t0 == null || t0.b(class0) == null;
    }
}

