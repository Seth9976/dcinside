package org.bson.codecs.pojo;

import S3.c;
import S3.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.codecs.configuration.a;

final class l {
    private final Class a;
    private final Constructor b;
    private final Method c;
    private final List d;
    private final Integer e;
    private final List f;
    private final List g;

    l(Class class0, Constructor constructor0) {
        this(class0, constructor0, null);
    }

    private l(Class class0, Constructor constructor0, Method method0) {
        this.d = new ArrayList();
        ArrayList arrayList0 = new ArrayList();
        this.f = arrayList0;
        ArrayList arrayList1 = new ArrayList();
        this.g = arrayList1;
        this.a = class0;
        this.b = constructor0;
        this.c = method0;
        Integer integer0 = null;
        if(constructor0 != null || method0 != null) {
            Class[] arr_class = constructor0 == null ? method0.getParameterTypes() : constructor0.getParameterTypes();
            Type[] arr_type = constructor0 == null ? method0.getGenericParameterTypes() : constructor0.getGenericParameterTypes();
            arrayList0.addAll(Arrays.asList(arr_class));
            arrayList1.addAll(Arrays.asList(arr_type));
            Annotation[][] arr2_annotation = constructor0 == null ? method0.getParameterAnnotations() : constructor0.getParameterAnnotations();
            Integer integer1 = null;
            for(int v = 0; v < arr2_annotation.length; ++v) {
                Annotation[] arr_annotation = arr2_annotation[v];
                for(int v1 = 0; v1 < arr_annotation.length; ++v1) {
                    Annotation annotation0 = arr_annotation[v1];
                    if(annotation0.annotationType().equals(e.class)) {
                        this.d.add(((e)annotation0));
                        break;
                    }
                    if(annotation0.annotationType().equals(c.class)) {
                        this.d.add(null);
                        integer1 = v;
                        break;
                    }
                }
            }
            integer0 = integer1;
        }
        this.e = integer0;
    }

    l(Class class0, Method method0) {
        this(class0, null, method0);
    }

    private void a() {
        if(this.b == null && this.c == null) {
            throw new a(String.format("Cannot find a public constructor for \'%s\'.", this.a.getSimpleName()));
        }
    }

    a b(Class class0, String s) {
        return this.b == null ? l.c(class0, false, s) : l.c(class0, true, s);
    }

    // 去混淆评级： 低(20)
    private static a c(Class class0, boolean z, String s) {
        return z ? new a(String.format("Invalid @BsonCreator %s in %s. %s", "constructor", class0.getSimpleName(), s)) : new a(String.format("Invalid @BsonCreator %s in %s. %s", "method", class0.getSimpleName(), s));
    }

    Integer d() {
        return this.e;
    }

    Object e() {
        this.a();
        try {
            return this.b == null ? this.c.invoke(this.a, null) : this.b.newInstance(null);
        }
        catch(Exception exception0) {
        }
        throw new a(exception0.getMessage(), exception0);
    }

    Object f(Object[] arr_object) {
        this.a();
        try {
            return this.b == null ? this.c.invoke(this.a, arr_object) : this.b.newInstance(arr_object);
        }
        catch(Exception exception0) {
        }
        throw new a(exception0.getMessage(), exception0);
    }

    List g() {
        return this.g;
    }

    List h() {
        return this.f;
    }

    List i() {
        return this.d;
    }

    Class j() {
        return this.a;
    }
}

