package com.google.gson.internal.reflect;

import com.google.gson.k;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class a {
    static class com.google.gson.internal.reflect.a.a {
    }

    static abstract class b {
        private b() {
        }

        b(com.google.gson.internal.reflect.a.a a$a0) {
        }

        public abstract Method a(Class arg1, Field arg2);

        abstract Constructor b(Class arg1);

        abstract String[] c(Class arg1);

        abstract boolean d(Class arg1);
    }

    static class c extends b {
        private c() {
            super(null);
        }

        c(com.google.gson.internal.reflect.a.a a$a0) {
        }

        @Override  // com.google.gson.internal.reflect.a$b
        public Method a(Class class0, Field field0) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override  // com.google.gson.internal.reflect.a$b
        Constructor b(Class class0) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override  // com.google.gson.internal.reflect.a$b
        String[] c(Class class0) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override  // com.google.gson.internal.reflect.a$b
        boolean d(Class class0) {
            return false;
        }
    }

    static class d extends b {
        private final Method a;
        private final Method b;
        private final Method c;
        private final Method d;

        private d() throws NoSuchMethodException {
            super(null);
            this.a = Class.class.getMethod("isRecord", null);
            Method method0 = Class.class.getMethod("getRecordComponents", null);
            this.b = method0;
            Class class0 = method0.getReturnType().getComponentType();
            this.c = class0.getMethod("getName", null);
            this.d = class0.getMethod("getType", null);
        }

        d(com.google.gson.internal.reflect.a.a a$a0) throws NoSuchMethodException {
        }

        @Override  // com.google.gson.internal.reflect.a$b
        public Method a(Class class0, Field field0) {
            try {
                return class0.getMethod(field0.getName(), null);
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
                throw a.d(reflectiveOperationException0);
            }
        }

        @Override  // com.google.gson.internal.reflect.a$b
        public Constructor b(Class class0) {
            try {
                Object[] arr_object = (Object[])this.b.invoke(class0, null);
                Class[] arr_class = new Class[arr_object.length];
                for(int v = 0; v < arr_object.length; ++v) {
                    arr_class[v] = (Class)this.d.invoke(arr_object[v], null);
                }
                return class0.getDeclaredConstructor(arr_class);
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
            }
            throw a.d(reflectiveOperationException0);
        }

        @Override  // com.google.gson.internal.reflect.a$b
        String[] c(Class class0) {
            try {
                Object[] arr_object = (Object[])this.b.invoke(class0, null);
                String[] arr_s = new String[arr_object.length];
                for(int v = 0; v < arr_object.length; ++v) {
                    arr_s[v] = (String)this.c.invoke(arr_object[v], null);
                }
                return arr_s;
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
                throw a.d(reflectiveOperationException0);
            }
        }

        @Override  // com.google.gson.internal.reflect.a$b
        boolean d(Class class0) {
            try {
                return ((Boolean)this.a.invoke(class0, null)).booleanValue();
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
                throw a.d(reflectiveOperationException0);
            }
        }
    }

    private static final b a;

    static {
        d a$d0;
        try {
            a$d0 = new d(null);
        }
        catch(NoSuchMethodException unused_ex) {
            a$d0 = new c(null);
        }
        a.a = a$d0;
    }

    private static void b(AccessibleObject accessibleObject0, StringBuilder stringBuilder0) {
        stringBuilder0.append('(');
        Class[] arr_class = accessibleObject0 instanceof Method ? ((Method)accessibleObject0).getParameterTypes() : ((Constructor)accessibleObject0).getParameterTypes();
        for(int v = 0; v < arr_class.length; ++v) {
            if(v > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(arr_class[v].getSimpleName());
        }
        stringBuilder0.append(')');
    }

    public static String c(Constructor constructor0) {
        StringBuilder stringBuilder0 = new StringBuilder(constructor0.getDeclaringClass().getName());
        a.b(constructor0, stringBuilder0);
        return stringBuilder0.toString();
    }

    private static RuntimeException d(ReflectiveOperationException reflectiveOperationException0) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException0);
    }

    public static RuntimeException e(IllegalAccessException illegalAccessException0) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException0);
    }

    public static String f(Field field0) {
        return field0.getDeclaringClass().getName() + "#" + field0.getName();
    }

    public static String g(AccessibleObject accessibleObject0, boolean z) {
        String s;
        if(accessibleObject0 instanceof Field) {
            s = "field \'" + a.f(((Field)accessibleObject0)) + "\'";
            return !z || !Character.isLowerCase(s.charAt(0)) ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1);
        }
        if(accessibleObject0 instanceof Method) {
            StringBuilder stringBuilder0 = new StringBuilder(((Method)accessibleObject0).getName());
            a.b(((Method)accessibleObject0), stringBuilder0);
            s = "method \'" + ((Method)accessibleObject0).getDeclaringClass().getName() + "#" + stringBuilder0.toString() + "\'";
            return !z || !Character.isLowerCase(s.charAt(0)) ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1);
        }
        s = accessibleObject0 instanceof Constructor ? "constructor \'" + a.c(((Constructor)accessibleObject0)) + "\'" : "<unknown AccessibleObject> " + accessibleObject0.toString();
        return !z || !Character.isLowerCase(s.charAt(0)) ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    public static Method h(Class class0, Field field0) {
        return a.a.a(class0, field0);
    }

    public static Constructor i(Class class0) {
        return a.a.b(class0);
    }

    public static String[] j(Class class0) {
        return a.a.c(class0);
    }

    public static boolean k(Class class0) {
        return a.a.d(class0);
    }

    public static void l(AccessibleObject accessibleObject0) throws k {
        try {
            accessibleObject0.setAccessible(true);
        }
        catch(Exception exception0) {
            throw new k("Failed making " + a.g(accessibleObject0, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", exception0);
        }
    }

    public static String m(Constructor constructor0) {
        try {
            constructor0.setAccessible(true);
            return null;
        }
        catch(Exception exception0) {
            return "Failed making constructor \'" + a.c(constructor0) + "\' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + exception0.getMessage();
        }
    }
}

