package org.bson.codecs.pojo;

import S3.a;
import S3.b;
import S3.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

final class f implements e {
    @Override  // org.bson.codecs.pojo.e
    public void a(c c0) {
        for(Object object0: c0.i()) {
            this.d(c0, ((Annotation)object0));
        }
        for(Object object1: c0.q()) {
            this.f(c0, ((K)object1));
        }
        this.e(c0);
        this.c(c0);
    }

    private K b(c c0, String s, Class class0) {
        K k0 = z.c(new I(s, c0.s().getSimpleName(), O.b(class0).c())).t(null).x(s);
        c0.a(k0);
        return k0;
    }

    private void c(c c0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: c0.q()) {
            K k0 = (K)object0;
            if(!k0.n() && !k0.o()) {
                arrayList0.add(k0.e());
            }
        }
        for(Object object1: arrayList0) {
            c0.x(((String)object1));
        }
    }

    private void d(c c0, Annotation annotation0) {
        if(annotation0 instanceof b) {
            String s = ((b)annotation0).key();
            if(!s.equals("")) {
                c0.g(s);
            }
            String s1 = ((b)annotation0).value();
            if(!s1.equals("")) {
                c0.f(s1);
            }
            c0.h(true);
        }
    }

    private void e(c c0) {
        K k0;
        Class class0 = c0.s();
        Constructor[] arr_constructor = class0.getDeclaredConstructors();
        int v = 0;
        l l0 = null;
        while(true) {
            Class class1 = a.class;
            if(v >= arr_constructor.length) {
                break;
            }
            Constructor constructor0 = arr_constructor[v];
            if(Modifier.isPublic(constructor0.getModifiers()) && !constructor0.isSynthetic()) {
                Annotation[] arr_annotation = constructor0.getDeclaredAnnotations();
                for(int v1 = 0; v1 < arr_annotation.length; ++v1) {
                    if(arr_annotation[v1].annotationType().equals(class1)) {
                        if(l0 != null) {
                            throw new org.bson.codecs.configuration.a("Found multiple constructors annotated with @BsonCreator");
                        }
                        l0 = new l(class0, constructor0);
                        continue;
                    }
                }
            }
            ++v;
        }
        Class class2 = class0;
        boolean z = false;
        while(class2 != null && !z) {
            Method[] arr_method = class2.getDeclaredMethods();
            int v2 = 0;
            while(v2 < arr_method.length) {
                Method method0 = arr_method[v2];
                if(Modifier.isStatic(method0.getModifiers()) && !method0.isSynthetic() && !method0.isBridge()) {
                    Annotation[] arr_annotation1 = method0.getDeclaredAnnotations();
                    for(int v3 = 0; v3 < arr_annotation1.length; ++v3) {
                        if(arr_annotation1[v3].annotationType().equals(class1)) {
                            if(l0 != null) {
                                throw new org.bson.codecs.configuration.a("Found multiple constructors / methods annotated with @BsonCreator");
                            }
                            if(!class2.isAssignableFrom(method0.getReturnType())) {
                                throw new org.bson.codecs.configuration.a(String.format("Invalid method annotated with @BsonCreator. Returns \'%s\', expected %s", method0.getReturnType(), class2));
                            }
                            l0 = new l(class0, method0);
                            z = true;
                            continue;
                        }
                    }
                }
                ++v2;
            }
            class2 = class2.getSuperclass();
        }
        if(l0 != null) {
            List list0 = l0.i();
            List list1 = l0.h();
            List list2 = l0.g();
            if(list0.size() != list1.size()) {
                throw l0.b(class0, "All parameters in the @BsonCreator method / constructor must be annotated with a @BsonProperty.");
            }
            for(int v4 = 0; v4 < list0.size(); ++v4) {
                Class class3 = (Class)list1.get(v4);
                Type type0 = (Type)list2.get(v4);
                if(l0.d() == null || !l0.d().equals(v4)) {
                    S3.e e0 = (S3.e)list0.get(v4);
                    K k1 = null;
                    for(Object object0: c0.q()) {
                        K k2 = (K)object0;
                        if(e0.value().equals(k2.l())) {
                            k1 = k2;
                            break;
                        }
                        if(e0.value().equals(k2.i())) {
                            k1 = k2;
                        }
                    }
                    K k3 = k1 == null ? c0.p(e0.value()) : k1;
                    if(k3 == null) {
                        k0 = this.b(c0, e0.value(), class3);
                    }
                    else {
                        if(!e0.value().equals(k3.e())) {
                            k3.x(e0.value());
                        }
                        f.g(class3, k3, type0);
                        k0 = k3;
                    }
                }
                else {
                    k0 = c0.p(c0.n());
                }
                if(!k0.j().d(class3)) {
                    throw l0.b(class0, String.format("Invalid Property type for \'%s\'. Expected %s, found %s.", k0.l(), k0.j().getType(), class3));
                }
            }
            c0.v(new u(l0));
        }
    }

    private void f(c c0, K k0) {
        for(Object object0: k0.h()) {
            Annotation annotation0 = (Annotation)object0;
            if(annotation0 instanceof S3.e) {
                if(!"".equals(((S3.e)annotation0).value())) {
                    k0.t(((S3.e)annotation0).value());
                }
                k0.c(((S3.e)annotation0).useDiscriminator());
                if(!k0.e().equals(c0.n())) {
                    continue;
                }
                c0.u(null);
            }
            else if(annotation0 instanceof S3.c) {
                c0.u(k0.e());
            }
            else if(annotation0 instanceof d) {
                k0.t(null);
            }
        }
        for(Object object1: k0.k()) {
            Annotation annotation1 = (Annotation)object1;
            if(annotation1 instanceof S3.e) {
                if("".equals(((S3.e)annotation1).value())) {
                    continue;
                }
                k0.x(((S3.e)annotation1).value());
            }
            else if(annotation1 instanceof d) {
                k0.x(null);
            }
        }
    }

    private static void g(Class class0, K k0, Type type0) {
        if(class0.isAssignableFrom(k0.j().getType())) {
            k0.v(O.h(type0, class0));
        }
    }
}

