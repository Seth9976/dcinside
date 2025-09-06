package com.google.common.reflect;

import com.google.common.base.H;
import com.google.common.collect.O2;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

@d
public abstract class g implements AnnotatedElement, Member {
    static class a extends g {
        final Constructor d;

        a(Constructor constructor0) {
            super(constructor0);
            this.d = constructor0;
        }

        private boolean F() {
            Class class0 = this.d.getDeclaringClass();
            if(class0.getEnclosingConstructor() != null) {
                return true;
            }
            Method method0 = class0.getEnclosingMethod();
            return method0 == null ? class0.getEnclosingClass() != null && !Modifier.isStatic(class0.getModifiers()) : !Modifier.isStatic(method0.getModifiers());
        }

        @Override  // com.google.common.reflect.g
        Type[] d() {
            return this.d.getGenericExceptionTypes();
        }

        @Override  // com.google.common.reflect.g
        Type[] e() {
            Type[] arr_type = this.d.getGenericParameterTypes();
            if(arr_type.length > 0 && this.F()) {
                Class[] arr_class = this.d.getParameterTypes();
                return arr_type.length != arr_class.length || arr_class[0] != this.getDeclaringClass().getEnclosingClass() ? arr_type : ((Type[])Arrays.copyOfRange(arr_type, 1, arr_type.length));
            }
            return arr_type;
        }

        @Override  // com.google.common.reflect.g
        Type f() {
            Type type0 = this.getDeclaringClass();
            TypeVariable[] arr_typeVariable = ((Class)type0).getTypeParameters();
            return arr_typeVariable.length > 0 ? t.l(((Class)type0), arr_typeVariable) : type0;
        }

        @Override  // com.google.common.reflect.g
        public final TypeVariable[] getTypeParameters() {
            TypeVariable[] arr_typeVariable = this.getDeclaringClass().getTypeParameters();
            TypeVariable[] arr_typeVariable1 = this.d.getTypeParameters();
            TypeVariable[] arr_typeVariable2 = new TypeVariable[arr_typeVariable.length + arr_typeVariable1.length];
            System.arraycopy(arr_typeVariable, 0, arr_typeVariable2, 0, arr_typeVariable.length);
            System.arraycopy(arr_typeVariable1, 0, arr_typeVariable2, arr_typeVariable.length, arr_typeVariable1.length);
            return arr_typeVariable2;
        }

        @Override  // com.google.common.reflect.g
        final Annotation[][] h() {
            return this.d.getParameterAnnotations();
        }

        @Override  // com.google.common.reflect.g
        final Object m(@o3.a Object object0, Object[] arr_object) throws InvocationTargetException, IllegalAccessException {
            try {
                return this.d.newInstance(arr_object);
            }
            catch(InstantiationException instantiationException0) {
                throw new RuntimeException(this.d + " failed.", instantiationException0);
            }
        }

        @Override  // com.google.common.reflect.g
        public final boolean r() {
            return false;
        }

        @Override  // com.google.common.reflect.g
        public final boolean z() {
            return this.d.isVarArgs();
        }
    }

    static class b extends g {
        final Method d;

        b(Method method0) {
            super(method0);
            this.d = method0;
        }

        @Override  // com.google.common.reflect.g
        Type[] d() {
            return this.d.getGenericExceptionTypes();
        }

        @Override  // com.google.common.reflect.g
        Type[] e() {
            return this.d.getGenericParameterTypes();
        }

        @Override  // com.google.common.reflect.g
        Type f() {
            return this.d.getGenericReturnType();
        }

        @Override  // com.google.common.reflect.g
        public final TypeVariable[] getTypeParameters() {
            return this.d.getTypeParameters();
        }

        @Override  // com.google.common.reflect.g
        final Annotation[][] h() {
            return this.d.getParameterAnnotations();
        }

        @Override  // com.google.common.reflect.g
        @o3.a
        final Object m(@o3.a Object object0, Object[] arr_object) throws InvocationTargetException, IllegalAccessException {
            return this.d.invoke(object0, arr_object);
        }

        // 去混淆评级： 低(40)
        @Override  // com.google.common.reflect.g
        public final boolean r() {
            return !this.p() && !this.t() && !this.w() && !Modifier.isFinal(this.getDeclaringClass().getModifiers());
        }

        @Override  // com.google.common.reflect.g
        public final boolean z() {
            return this.d.isVarArgs();
        }
    }

    private final AccessibleObject a;
    private final Member b;
    private static final boolean c;

    static {
        g.c = g.k();
    }

    g(AccessibleObject accessibleObject0) {
        H.E(accessibleObject0);
        this.a = accessibleObject0;
        this.b = (Member)accessibleObject0;
    }

    final boolean A() {
        return Modifier.isVolatile(this.getModifiers());
    }

    public final g B(q q0) {
        if(!q0.O(this.j())) {
            throw new IllegalArgumentException("Invokable is known to return " + this.j() + ", not " + q0);
        }
        return this;
    }

    public final g C(Class class0) {
        return this.B(q.U(class0));
    }

    public final void D(boolean z) {
        this.a.setAccessible(z);
    }

    public final boolean E() {
        try {
            this.a.setAccessible(true);
            return true;
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public static g a(Constructor constructor0) {
        return new a(constructor0);
    }

    public static g b(Method method0) {
        return new b(method0);
    }

    public final O2 c() {
        com.google.common.collect.O2.a o2$a0 = O2.n();
        Type[] arr_type = this.d();
        for(int v = 0; v < arr_type.length; ++v) {
            o2$a0.j(q.V(arr_type[v]));
        }
        return o2$a0.n();
    }

    abstract Type[] d();

    abstract Type[] e();

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@o3.a Object object0) {
        return object0 instanceof g && this.g().equals(((g)object0).g()) && this.b.equals(((g)object0).b);
    }

    abstract Type f();

    public q g() {
        return q.U(this.getDeclaringClass());
    }

    @Override
    @o3.a
    public final Annotation getAnnotation(Class class0) {
        return this.a.getAnnotation(class0);
    }

    @Override
    public final Annotation[] getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override
    public final Annotation[] getDeclaredAnnotations() {
        return this.a.getDeclaredAnnotations();
    }

    @Override
    public final Class getDeclaringClass() {
        return this.b.getDeclaringClass();
    }

    @Override
    public final int getModifiers() {
        return this.b.getModifiers();
    }

    @Override
    public final String getName() {
        return this.b.getName();
    }

    public abstract TypeVariable[] getTypeParameters();

    abstract Annotation[][] h();

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    @e
    public final O2 i() {
        Type[] arr_type = this.e();
        Annotation[][] arr2_annotation = this.h();
        Object[] arr_object = new Object[arr_type.length];
        com.google.common.collect.O2.a o2$a0 = O2.n();
        for(int v = 0; v < arr_type.length; ++v) {
            o2$a0.j(new j(this, v, q.V(arr_type[v]), arr2_annotation[v], arr_object[v]));
        }
        return o2$a0.n();
    }

    @Override
    public final boolean isAnnotationPresent(Class class0) {
        return this.a.isAnnotationPresent(class0);
    }

    @Override
    public final boolean isSynthetic() {
        return this.b.isSynthetic();
    }

    public final q j() {
        return q.V(this.f());
    }

    // 去混淆评级： 低(20)
    private static boolean k() {
        return true;
    }

    @O1.a
    @o3.a
    public final Object l(@o3.a Object object0, Object[] arr_object) throws InvocationTargetException, IllegalAccessException {
        return this.m(object0, ((Object[])H.E(arr_object)));
    }

    @o3.a
    abstract Object m(@o3.a Object arg1, Object[] arg2) throws InvocationTargetException, IllegalAccessException;

    public final boolean n() {
        return Modifier.isAbstract(this.getModifiers());
    }

    public final boolean o() {
        return this.a.isAccessible();
    }

    public final boolean p() {
        return Modifier.isFinal(this.getModifiers());
    }

    public final boolean q() {
        return Modifier.isNative(this.getModifiers());
    }

    public abstract boolean r();

    // 去混淆评级： 低(30)
    public final boolean s() {
        return !this.t() && !this.v() && !this.u();
    }

    public final boolean t() {
        return Modifier.isPrivate(this.getModifiers());
    }

    @Override
    public String toString() {
        return this.b.toString();
    }

    public final boolean u() {
        return Modifier.isProtected(this.getModifiers());
    }

    public final boolean v() {
        return Modifier.isPublic(this.getModifiers());
    }

    public final boolean w() {
        return Modifier.isStatic(this.getModifiers());
    }

    public final boolean x() {
        return Modifier.isSynchronized(this.getModifiers());
    }

    final boolean y() {
        return Modifier.isTransient(this.getModifiers());
    }

    public abstract boolean z();
}

