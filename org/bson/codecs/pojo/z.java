package org.bson.codecs.pojo;

import R3.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeSet;

final class z {
    private static void a(I i0, Map map0, O o0, List list0, Type type0) {
        P p0 = z.h(list0, type0);
        map0.put(i0.h(), p0);
        i0.v(p0, o0);
    }

    static void b(c c0, Class class0) {
        c0.y(((Class)a.e("clazz", class0)));
        ArrayList arrayList0 = new ArrayList();
        TreeSet treeSet0 = new TreeSet();
        HashMap hashMap0 = new HashMap();
        String s = class0.getSimpleName();
        HashMap hashMap1 = new HashMap();
        Class class1 = class0;
        O o0 = null;
        while(!class1.isEnum() && class1.getSuperclass() != null) {
            arrayList0.addAll(Arrays.asList(class1.getDeclaredAnnotations()));
            ArrayList arrayList1 = new ArrayList();
            TypeVariable[] arr_typeVariable = class1.getTypeParameters();
            for(int v = 0; v < arr_typeVariable.length; ++v) {
                arrayList1.add(arr_typeVariable[v].getName());
            }
            org.bson.codecs.pojo.M.a m$a0 = M.a(class1);
            for(Object object0: m$a0.b()) {
                String s1 = M.d(((Method)object0));
                treeSet0.add(s1);
                O o1 = O.g(((Method)object0));
                Type type0 = z.d(((Method)object0));
                Method method0 = (Method)object0;
                I i0 = z.f(s1, s, hashMap1, o1, hashMap0, o0, arrayList1, type0);
                if(i0.j() == null) {
                    i0.u(method0);
                    Annotation[] arr_annotation = method0.getDeclaredAnnotations();
                    for(int v1 = 0; v1 < arr_annotation.length; ++v1) {
                        i0.b(arr_annotation[v1]);
                    }
                }
            }
            ArrayList arrayList2 = arrayList1;
            for(Object object1: m$a0.a()) {
                Method method1 = (Method)object1;
                String s2 = M.d(method1);
                treeSet0.add(s2);
                I i1 = (I)hashMap1.get(s2);
                if(i1 == null || i1.g() == null) {
                    I i2 = z.f(s2, s, hashMap1, O.g(method1), hashMap0, o0, arrayList2, z.d(method1));
                    if(i2.g() == null) {
                        i2.t(method1);
                        Annotation[] arr_annotation1 = method1.getDeclaredAnnotations();
                        for(int v2 = 0; v2 < arr_annotation1.length; ++v2) {
                            i2.a(arr_annotation1[v2]);
                        }
                    }
                }
            }
            Field[] arr_field = class1.getDeclaredFields();
            for(int v3 = 0; v3 < arr_field.length; ++v3) {
                Field field0 = arr_field[v3];
                treeSet0.add(field0.getName());
                Field field1 = field0;
                I i3 = z.e(field0.getName(), s, hashMap1, O.f(field0), hashMap0, o0, arrayList2, field0.getGenericType());
                if(i3 != null && i3.f() == null) {
                    i3.c(field1);
                    Annotation[] arr_annotation2 = field1.getDeclaredAnnotations();
                    for(int v4 = 0; v4 < arr_annotation2.length; ++v4) {
                        Annotation annotation0 = arr_annotation2[v4];
                        i3.a(annotation0);
                        i3.b(annotation0);
                    }
                }
            }
            o0 = O.h(class1.getGenericSuperclass(), class1);
            class1 = class1.getSuperclass();
        }
        if(class1.isInterface()) {
            arrayList0.addAll(Arrays.asList(class1.getDeclaredAnnotations()));
        }
        for(Object object2: treeSet0) {
            I i4 = (I)hashMap1.get(((String)object2));
            if(i4.q() || i4.o()) {
                c0.a(z.c(i4));
            }
        }
        Collections.reverse(arrayList0);
        c0.b(arrayList0);
        c0.w(hashMap0);
        Constructor[] arr_constructor = class0.getDeclaredConstructors();
        Constructor constructor0 = null;
        for(int v5 = 0; v5 < arr_constructor.length; ++v5) {
            Constructor constructor1 = arr_constructor[v5];
            if(constructor1.getParameterTypes().length == 0 && (Modifier.isPublic(constructor1.getModifiers()) || Modifier.isProtected(constructor1.getModifiers()))) {
                constructor1.setAccessible(true);
                constructor0 = constructor1;
            }
        }
        c0.v(new u(new l(class0, constructor0)));
    }

    static K c(I i0) {
        K k0 = J.a().q(i0.h()).t(i0.h()).x(i0.h()).v(i0.k()).s(i0.i()).w(i0.n()).r(new L()).p(new E(i0)).u(i0.e());
        if(i0.m() != null) {
            z.j(k0, i0);
        }
        return k0;
    }

    // 去混淆评级： 低(20)
    private static Type d(Method method0) {
        return M.b(method0) ? method0.getGenericReturnType() : method0.getGenericParameterTypes()[0];
    }

    private static I e(String s, String s1, Map map0, O o0, Map map1, O o1, List list0, Type type0) {
        I i0 = z.g(s, s1, map0, o0);
        if(!i0.k().getType().isAssignableFrom(o0.getType())) {
            return null;
        }
        z.a(i0, map1, o1, list0, type0);
        return i0;
    }

    private static I f(String s, String s1, Map map0, O o0, Map map1, O o1, List list0, Type type0) {
        I i0 = z.g(s, s1, map0, o0);
        if(!z.i(i0.k().getType(), o0.getType())) {
            i0.s(String.format("Property \'%s\' in %s, has differing data types: %s and %s.", s, s1, i0.k(), o0));
        }
        z.a(i0, map1, o1, list0, type0);
        return i0;
    }

    private static I g(String s, String s1, Map map0, O o0) {
        I i0 = (I)map0.get(s);
        if(i0 == null) {
            i0 = new I(s, s1, o0);
            map0.put(s, i0);
        }
        return i0;
    }

    private static P h(List list0, Type type0) {
        int v = list0.indexOf(type0.toString());
        b p$b0 = P.a();
        if(v != -1) {
            p$b0.a(v);
            return p$b0.c();
        }
        if(type0 instanceof ParameterizedType) {
            for(int v1 = 0; v1 < ((ParameterizedType)type0).getActualTypeArguments().length; ++v1) {
                int v2 = list0.indexOf(((ParameterizedType)type0).getActualTypeArguments()[v1].toString());
                if(v2 != -1) {
                    p$b0.b(v1, v2);
                }
            }
        }
        return p$b0.c();
    }

    // 去混淆评级： 低(20)
    private static boolean i(Class class0, Class class1) {
        return class0.isAssignableFrom(class1) || class1.isAssignableFrom(class0);
    }

    private static void j(K k0, I i0) {
        O o0;
        if(i0.l().c() && !i0.m().isEmpty()) {
            Map map0 = i0.l().b();
            Integer integer0 = (Integer)map0.get(-1);
            if(integer0 == null) {
                org.bson.codecs.pojo.O.b o$b0 = O.b(k0.j().getType());
                ArrayList arrayList0 = new ArrayList(k0.j().getTypeParameters());
                for(int v = 0; v < arrayList0.size(); ++v) {
                    for(Object object0: map0.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object0;
                        if(((Integer)map$Entry0.getKey()).equals(v)) {
                            arrayList0.set(v, i0.m().get(((int)(((Integer)map$Entry0.getValue())))));
                        }
                    }
                }
                o$b0.b(arrayList0);
                o0 = o$b0.c();
            }
            else {
                o0 = (O)i0.m().get(((int)integer0));
            }
            k0.v(o0);
        }
    }

    static Object k(String s, Object object0) {
        if(object0 == null) {
            throw new IllegalStateException(String.format("%s cannot be null", s));
        }
        return object0;
    }
}

