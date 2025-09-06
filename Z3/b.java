package z3;

import java.lang.annotation.Annotation;
import kotlin.c0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.t;
import kotlin.k;
import kotlin.reflect.d;
import y4.l;
import y4.m;

@i(name = "JvmClassMappingKt")
public final class b {
    @l
    public static final d a(@l Annotation annotation0) {
        L.p(annotation0, "<this>");
        Class class0 = annotation0.annotationType();
        L.o(class0, "annotationType(...)");
        d d0 = b.i(class0);
        L.n(d0, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return d0;
    }

    private static final Class b(Enum enum0) {
        L.p(enum0, "<this>");
        Class class0 = enum0.getDeclaringClass();
        L.o(class0, "getDeclaringClass(...)");
        return class0;
    }

    @h0(version = "1.7")
    @f
    public static void c(Enum enum0) {
    }

    @l
    public static final Class d(@l Object object0) {
        L.p(object0, "<this>");
        Class class0 = object0.getClass();
        L.n(class0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return class0;
    }

    @l
    @i(name = "getJavaClass")
    public static final Class e(@l d d0) {
        L.p(d0, "<this>");
        Class class0 = ((t)d0).q();
        L.n(class0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return class0;
    }

    public static void f(d d0) {
    }

    @l
    public static final Class g(@l d d0) {
        L.p(d0, "<this>");
        Class class0 = ((t)d0).q();
        if(!class0.isPrimitive()) {
            L.n(class0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return class0;
        }
        switch(class0.getName()) {
            case "boolean": {
                class0 = Boolean.class;
                break;
            }
            case "byte": {
                class0 = Byte.class;
                break;
            }
            case "char": {
                class0 = Character.class;
                break;
            }
            case "double": {
                class0 = Double.class;
                break;
            }
            case "float": {
                class0 = Float.class;
                break;
            }
            case "int": {
                class0 = Integer.class;
                break;
            }
            case "long": {
                class0 = Long.class;
                break;
            }
            case "short": {
                class0 = Short.class;
                break;
            }
            case "void": {
                class0 = Void.class;
            }
        }
        L.n(class0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return class0;
    }

    @m
    public static final Class h(@l d d0) {
        L.p(d0, "<this>");
        Class class0 = ((t)d0).q();
        if(class0.isPrimitive()) {
            L.n(class0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return class0;
        }
        switch(class0.getName()) {
            case "java.lang.Boolean": {
                return Boolean.TYPE;
            }
            case "java.lang.Byte": {
                return Byte.TYPE;
            }
            case "java.lang.Character": {
                return Character.TYPE;
            }
            case "java.lang.Double": {
                return Double.TYPE;
            }
            case "java.lang.Float": {
                return Float.TYPE;
            }
            case "java.lang.Integer": {
                return Integer.TYPE;
            }
            case "java.lang.Long": {
                return Long.TYPE;
            }
            case "java.lang.Short": {
                return Short.TYPE;
            }
            case "java.lang.Void": {
                return Void.TYPE;
            }
            default: {
                return null;
            }
        }
    }

    @l
    @i(name = "getKotlinClass")
    public static final d i(@l Class class0) {
        L.p(class0, "<this>");
        return m0.d(class0);
    }

    @l
    @i(name = "getRuntimeClassOfKClassInstance")
    public static final Class j(@l d d0) {
        L.p(d0, "<this>");
        Class class0 = d0.getClass();
        L.n(class0, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return class0;
    }

    @k(level = kotlin.m.b, message = "Use \'java\' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @c0(expression = "(this as Any).javaClass", imports = {}))
    public static void k(d d0) {
    }

    public static final boolean l(Object[] arr_object) {
        L.p(arr_object, "<this>");
        L.y(4, "T");
        Class class0 = arr_object.getClass().getComponentType();
        return Object.class.isAssignableFrom(class0);
    }
}

