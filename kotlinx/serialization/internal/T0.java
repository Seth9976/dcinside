package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.reflect.d;
import kotlin.y;
import kotlinx.serialization.i;
import kotlinx.serialization.u;
import kotlinx.serialization.v;
import y4.l;
import y4.m;
import z3.b;

public final class t0 {
    private static final Object a(Class class0) {
        try {
            Field field0 = class0.getDeclaredField("Companion");
            field0.setAccessible(true);
            return field0.get(null);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    @m
    public static final i b(@l d d0) {
        L.p(d0, "<this>");
        return t0.d(d0, new i[0]);
    }

    @m
    public static final i c(@l Class class0, @l i[] arr_i) {
        i i3;
        Object object0;
        L.p(class0, "<this>");
        L.p(arr_i, "args");
        if(class0.isEnum() && t0.l(class0)) {
            return t0.e(class0);
        }
        if(class0.isInterface()) {
            i i0 = t0.i(class0);
            if(i0 != null) {
                return i0;
            }
        }
        i i1 = t0.j(class0, ((i[])Arrays.copyOf(arr_i, arr_i.length)));
        if(i1 != null) {
            return i1;
        }
        i i2 = t0.f(class0);
        if(i2 != null) {
            return i2;
        }
        try {
            Class[] arr_class = class0.getDeclaredClasses();
            L.o(arr_class, "declaredClasses");
            int v = 0;
            Class class1 = null;
            boolean z = false;
            while(v < arr_class.length) {
                Class class2 = arr_class[v];
                if(L.g(class2.getSimpleName(), "$serializer")) {
                    if(z) {
                        class1 = null;
                        goto label_31;
                    }
                    z = true;
                    class1 = class2;
                }
                ++v;
            }
            if(!z) {
                class1 = null;
            }
        label_31:
            if(class1 == null) {
                object0 = null;
            }
            else {
                Field field0 = class1.getField("INSTANCE");
                object0 = field0 == null ? null : field0.get(null);
            }
            i3 = object0 instanceof i ? ((i)object0) : null;
        }
        catch(NoSuchFieldException unused_ex) {
            i3 = null;
        }
        if(i3 != null) {
            return i3;
        }
        return t0.m(class0) ? new kotlinx.serialization.m(b.i(class0)) : null;
    }

    @m
    public static final i d(@l d d0, @l i[] arr_i) {
        L.p(d0, "<this>");
        L.p(arr_i, "args");
        return t0.c(b.e(d0), ((i[])Arrays.copyOf(arr_i, arr_i.length)));
    }

    private static final i e(Class class0) {
        Object[] arr_object = class0.getEnumConstants();
        String s = class0.getCanonicalName();
        L.o(s, "canonicalName");
        L.n(arr_object, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new H(s, ((Enum[])arr_object));
    }

    private static final i f(Class class0) {
        Field[] arr_field = class0.getDeclaredFields();
        L.o(arr_field, "declaredFields");
        int v = 0;
        Field field0 = null;
        int v1 = 0;
        boolean z = false;
        while(v1 < arr_field.length) {
            Field field1 = arr_field[v1];
            if(L.g(field1.getName(), "INSTANCE") && L.g(field1.getType(), class0) && Modifier.isStatic(field1.getModifiers())) {
                if(!z) {
                    field0 = field1;
                    z = true;
                    goto label_15;
                }
                field0 = null;
                goto label_19;
            }
        label_15:
            ++v1;
        }
        if(!z) {
            field0 = null;
        }
    label_19:
        if(field0 == null) {
            return null;
        }
        Object object0 = field0.get(null);
        Method[] arr_method = class0.getMethods();
        L.o(arr_method, "methods");
        Method method0 = null;
        boolean z1 = false;
        while(v < arr_method.length) {
            Method method1 = arr_method[v];
            if(L.g(method1.getName(), "serializer")) {
                Class[] arr_class = method1.getParameterTypes();
                L.o(arr_class, "it.parameterTypes");
                if(arr_class.length == 0 && L.g(method1.getReturnType(), i.class)) {
                    if(!z1) {
                        method0 = method1;
                        z1 = true;
                        goto label_38;
                    }
                    method0 = null;
                    goto label_42;
                }
            }
        label_38:
            ++v;
        }
        if(!z1) {
            method0 = null;
        }
    label_42:
        if(method0 == null) {
            return null;
        }
        Object object1 = method0.invoke(object0, null);
        return object1 instanceof i ? ((i)object1) : null;
    }

    public static final Object g(@l Object[] arr_object, int v) {
        L.p(arr_object, "<this>");
        return arr_object[v];
    }

    public static final boolean h(@l boolean[] arr_z, int v) {
        L.p(arr_z, "<this>");
        return arr_z[v];
    }

    private static final i i(Class class0) {
        u u0 = (u)class0.getAnnotation(u.class);
        return u0 != null && !L.g(m0.d(u0.with()), m0.d(kotlinx.serialization.m.class)) ? null : new kotlinx.serialization.m(b.i(class0));
    }

    private static final i j(Class class0, i[] arr_i) {
        Throwable throwable0;
        Class[] arr_class1;
        Object object0 = t0.a(class0);
        if(object0 == null) {
            return null;
        }
        try {
            if(arr_i.length == 0) {
                arr_class1 = new Class[0];
            }
            else {
                Class[] arr_class = new Class[arr_i.length];
                for(int v = 0; v < arr_i.length; ++v) {
                    arr_class[v] = i.class;
                }
                arr_class1 = arr_class;
            }
            Object object1 = object0.getClass().getDeclaredMethod("serializer", ((Class[])Arrays.copyOf(arr_class1, arr_class1.length))).invoke(object0, Arrays.copyOf(arr_i, arr_i.length));
            return object1 instanceof i ? ((i)object1) : null;
        label_16:
            throwable0 = invocationTargetException0.getCause();
            if(throwable0 == null) {
                throw invocationTargetException0;
            }
        }
        catch(NoSuchMethodException unused_ex) {
            return null;
        }
        catch(InvocationTargetException invocationTargetException0) {
            goto label_16;
        }
        String s = throwable0.getMessage();
        if(s == null) {
            s = invocationTargetException0.getMessage();
        }
        throw new InvocationTargetException(throwable0, s);
    }

    public static final boolean k(@l Object object0, @l d d0) {
        L.p(object0, "<this>");
        L.p(d0, "kclass");
        return b.g(d0).isInstance(object0);
    }

    private static final boolean l(Class class0) {
        return class0.getAnnotation(u.class) == null && class0.getAnnotation(kotlinx.serialization.l.class) == null;
    }

    private static final boolean m(Class class0) {
        if(class0.getAnnotation(kotlinx.serialization.l.class) != null) {
            return true;
        }
        u u0 = (u)class0.getAnnotation(u.class);
        return u0 != null && L.g(m0.d(u0.with()), m0.d(kotlinx.serialization.m.class));
    }

    public static final boolean n(@l d d0) {
        L.p(d0, "rootClass");
        return b.e(d0).isArray();
    }

    @l
    public static final Void o(@l d d0) {
        L.p(d0, "<this>");
        u0.i(d0);
        throw new y();
    }

    @l
    public static final Void p(@l Class class0) {
        L.p(class0, "<this>");
        throw new v("Serializer for class \'" + class0.getSimpleName() + "\' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }

    @l
    public static final Object[] q(@l ArrayList arrayList0, @l d d0) {
        L.p(arrayList0, "<this>");
        L.p(d0, "eClass");
        Object object0 = Array.newInstance(b.e(d0), arrayList0.size());
        L.n(object0, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] arr_object = arrayList0.toArray(((Object[])object0));
        L.o(arr_object, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return arr_object;
    }
}

