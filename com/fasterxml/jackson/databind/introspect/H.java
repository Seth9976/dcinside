package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.type.q;
import com.fasterxml.jackson.databind.util.h.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class h extends x {
    private final K d;
    private final boolean e;
    private f f;

    h(b b0, K k0, boolean z) {
        super(b0);
        this.d = k0;
        this.e = z;
    }

    private List i(m m0, Class class0) {
        int v2;
        List list1;
        List list0;
        a h$a0;
        if(m0.p()) {
            h$a0 = null;
            list0 = null;
        }
        else {
            a[] arr_h$a = com.fasterxml.jackson.databind.util.h.F(m0.g());
            h$a0 = null;
            list0 = null;
            for(int v1 = 0; v1 < arr_h$a.length; ++v1) {
                a h$a1 = arr_h$a[v1];
                if(h.t(h$a1.a())) {
                    if(h$a1.d() == 0) {
                        h$a0 = h$a1;
                    }
                    else {
                        if(list0 == null) {
                            list0 = new ArrayList();
                        }
                        list0.add(h$a1);
                    }
                }
            }
        }
        if(list0 == null) {
            list1 = Collections.emptyList();
            if(h$a0 == null) {
                return list1;
            }
            v2 = 0;
        }
        else {
            int v3 = list0.size();
            ArrayList arrayList0 = new ArrayList(v3);
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList0.add(null);
            }
            v2 = v3;
            list1 = arrayList0;
        }
        if(class0 != null) {
            a[] arr_h$a1 = com.fasterxml.jackson.databind.util.h.F(class0);
            C[] arr_c = null;
            for(int v5 = 0; v5 < arr_h$a1.length; ++v5) {
                a h$a2 = arr_h$a1[v5];
                if(h$a2.d() != 0) {
                    if(list0 != null) {
                        if(arr_c == null) {
                            arr_c = new C[v2];
                            for(int v6 = 0; v6 < v2; ++v6) {
                                arr_c[v6] = new C(((a)list0.get(v6)).a());
                            }
                        }
                        C c0 = new C(h$a2.a());
                        for(int v7 = 0; v7 < v2; ++v7) {
                            if(c0.equals(arr_c[v7])) {
                                list1.set(v7, this.s(((a)list0.get(v7)), h$a2));
                                break;
                            }
                        }
                    }
                }
                else if(h$a0 != null) {
                    this.f = this.q(h$a0, h$a2);
                    h$a0 = null;
                }
            }
        }
        if(h$a0 != null) {
            this.f = this.q(h$a0, null);
        }
        for(int v = 0; v < v2; ++v) {
            if(((f)list1.get(v)) == null) {
                list1.set(v, this.s(((a)list0.get(v)), null));
            }
        }
        return list1;
    }

    private List j(q q0, m m0, Class class0) {
        Method[] arr_method = com.fasterxml.jackson.databind.util.h.E(m0.g());
        List list0 = null;
        for(int v1 = 0; v1 < arr_method.length; ++v1) {
            Method method0 = arr_method[v1];
            if(h.k(method0)) {
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                list0.add(method0);
            }
        }
        if(list0 == null) {
            return Collections.emptyList();
        }
        K k0 = this.d;
        int v2 = list0.size();
        List list1 = new ArrayList(v2);
        for(int v3 = 0; v3 < v2; ++v3) {
            list1.add(null);
        }
        if(class0 != null) {
            Method[] arr_method1 = class0.getDeclaredMethods();
            C[] arr_c = null;
            for(int v4 = 0; v4 < arr_method1.length; ++v4) {
                Method method1 = arr_method1[v4];
                if(h.k(method1)) {
                    if(arr_c == null) {
                        arr_c = new C[v2];
                        for(int v5 = 0; v5 < v2; ++v5) {
                            arr_c[v5] = new C(((Method)list0.get(v5)));
                        }
                    }
                    C c0 = new C(method1);
                    for(int v6 = 0; v6 < v2; ++v6) {
                        if(c0.equals(arr_c[v6])) {
                            list1.set(v6, this.r(((Method)list0.get(v6)), k0, method1));
                            break;
                        }
                    }
                }
            }
        }
        for(int v = 0; v < v2; ++v) {
            if(((l)list1.get(v)) == null) {
                Method method2 = (Method)list0.get(v);
                list1.set(v, this.r(method2, D.e(method2, m0, q0, k0), null));
            }
        }
        return list1;
    }

    private static boolean k(Method method0) {
        return Modifier.isStatic(method0.getModifiers()) ? !method0.isSynthetic() : false;
    }

    com.fasterxml.jackson.databind.introspect.d.a l(q q0, m m0, Class class0) {
        List list0 = this.i(m0, class0);
        List list1 = this.j(q0, m0, class0);
        if(this.e) {
            if(this.f != null && this.a.E0(this.f)) {
                this.f = null;
            }
            int v = list0.size();
            while(true) {
                --v;
                if(v < 0) {
                    break;
                }
                k k0 = (k)list0.get(v);
                if(this.a.E0(k0)) {
                    list0.remove(v);
                }
            }
            int v1 = list1.size();
            while(true) {
                --v1;
                if(v1 < 0) {
                    break;
                }
                k k1 = (k)list1.get(v1);
                if(this.a.E0(k1)) {
                    list1.remove(v1);
                }
            }
        }
        return new com.fasterxml.jackson.databind.introspect.d.a(this.f, list0, list1);
    }

    private s m(a h$a0, a h$a1) {
        if(this.e) {
            com.fasterxml.jackson.databind.introspect.q q0 = this.e(h$a0.b());
            if(h$a1 != null) {
                q0 = this.d(q0, h$a1.b());
            }
            return q0.b();
        }
        return x.a();
    }

    private final s n(AnnotatedElement annotatedElement0, AnnotatedElement annotatedElement1) {
        com.fasterxml.jackson.databind.introspect.q q0 = this.e(annotatedElement0.getDeclaredAnnotations());
        if(annotatedElement1 != null) {
            q0 = this.d(q0, annotatedElement1.getDeclaredAnnotations());
        }
        return q0.b();
    }

    private s[] o(Annotation[][] arr2_annotation, Annotation[][] arr2_annotation1) {
        if(this.e) {
            s[] arr_s = new s[arr2_annotation.length];
            for(int v = 0; v < arr2_annotation.length; ++v) {
                com.fasterxml.jackson.databind.introspect.q q0 = this.d(com.fasterxml.jackson.databind.introspect.q.e(), arr2_annotation[v]);
                if(arr2_annotation1 != null) {
                    q0 = this.d(q0, arr2_annotation1[v]);
                }
                arr_s[v] = q0.b();
            }
            return arr_s;
        }
        return x.b;
    }

    public static com.fasterxml.jackson.databind.introspect.d.a p(b b0, q q0, K k0, m m0, Class class0, boolean z) {
        return class0 == null ? new h(b0, k0, z).l(q0, m0, null) : new h(b0, k0, ((boolean)(z | true))).l(q0, m0, class0);
    }

    protected f q(a h$a0, a h$a1) {
        s s0 = this.m(h$a0, h$a1);
        return new f(this.d, h$a0.a(), s0, x.b);
    }

    protected l r(Method method0, K k0, Method method1) {
        int v = g.a(method0);
        if(this.a == null) {
            return new l(k0, method0, x.a(), x.b(v));
        }
        if(v == 0) {
            return new l(k0, method0, this.n(method0, method1), x.b);
        }
        s s0 = this.n(method0, method1);
        Annotation[][] arr2_annotation = method0.getParameterAnnotations();
        return method1 == null ? new l(k0, method0, s0, this.o(arr2_annotation, null)) : new l(k0, method0, s0, this.o(arr2_annotation, method1.getParameterAnnotations()));
    }

    protected f s(a h$a0, a h$a1) {
        Annotation[][] arr2_annotation2;
        int v = h$a0.d();
        if(this.a == null) {
            s s0 = x.a();
            s[] arr_s = x.b(v);
            return new f(this.d, h$a0.a(), s0, arr_s);
        }
        if(v == 0) {
            s s1 = this.m(h$a0, h$a1);
            return new f(this.d, h$a0.a(), s1, x.b);
        }
        Annotation[][] arr2_annotation = h$a0.e();
        Annotation[][] arr2_annotation1 = null;
        if(v == arr2_annotation.length) {
            if(h$a1 != null) {
                arr2_annotation1 = h$a1.e();
            }
            arr2_annotation1 = this.o(arr2_annotation, arr2_annotation1);
        }
        else {
            Class class0 = h$a0.c();
            if(com.fasterxml.jackson.databind.util.h.Y(class0) && v == arr2_annotation.length + 2) {
                arr2_annotation2 = new Annotation[arr2_annotation.length + 2][];
                System.arraycopy(arr2_annotation, 0, arr2_annotation2, 2, arr2_annotation.length);
                arr2_annotation1 = this.o(arr2_annotation2, null);
                arr2_annotation = arr2_annotation2;
            }
            else if(class0.isMemberClass() && v == arr2_annotation.length + 1) {
                arr2_annotation2 = new Annotation[arr2_annotation.length + 1][];
                System.arraycopy(arr2_annotation, 0, arr2_annotation2, 1, arr2_annotation.length);
                arr2_annotation2[0] = x.c;
                arr2_annotation1 = this.o(arr2_annotation2, null);
                arr2_annotation = arr2_annotation2;
            }
            if(arr2_annotation1 == null) {
                throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", h$a0.c().getName(), v, ((int)arr2_annotation.length)));
            }
        }
        s s2 = this.m(h$a0, h$a1);
        return new f(this.d, h$a0.a(), s2, ((s[])arr2_annotation1));
    }

    private static boolean t(Constructor constructor0) {
        return !constructor0.isSynthetic();
    }
}

