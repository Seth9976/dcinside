package com.google.common.reflect;

import com.google.common.base.H;
import com.google.common.collect.O2;
import com.google.common.collect.V1;
import com.google.common.collect.u5;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import o3.a;

@d
public final class j implements AnnotatedElement {
    private final g a;
    private final int b;
    private final q c;
    private final O2 d;
    private final Object e;

    j(g g0, int v, q q0, Annotation[] arr_annotation, Object object0) {
        this.a = g0;
        this.b = v;
        this.c = q0;
        this.d = O2.x(arr_annotation);
        this.e = object0;
    }

    public g a() {
        return this.a;
    }

    public q b() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@a Object object0) {
        return object0 instanceof j && this.b == ((j)object0).b && this.a.equals(((j)object0).a);
    }

    @Override
    @a
    public Annotation getAnnotation(Class class0) {
        H.E(class0);
        u5 u50 = this.d.i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            Annotation annotation0 = (Annotation)object0;
            if(class0.isInstance(annotation0)) {
                return (Annotation)class0.cast(annotation0);
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override
    public Annotation[] getAnnotations() {
        return this.getDeclaredAnnotations();
    }

    @Override
    public Annotation[] getAnnotationsByType(Class class0) {
        return this.getDeclaredAnnotationsByType(class0);
    }

    @Override
    @a
    public Annotation getDeclaredAnnotation(Class class0) {
        H.E(class0);
        return (Annotation)V1.u(this.d).p(class0).q().j();
    }

    @Override
    public Annotation[] getDeclaredAnnotations() {
        return (Annotation[])this.d.toArray(new Annotation[0]);
    }

    @Override
    public Annotation[] getDeclaredAnnotationsByType(Class class0) {
        return (Annotation[])V1.u(this.d).p(class0).F(class0);
    }

    @Override
    public int hashCode() {
        return this.b;
    }

    @Override
    public boolean isAnnotationPresent(Class class0) {
        return this.getAnnotation(class0) != null;
    }

    @Override
    public String toString() {
        return this.c + " arg" + this.b;
    }
}

