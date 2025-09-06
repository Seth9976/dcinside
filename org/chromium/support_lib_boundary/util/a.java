package org.chromium.support_lib_boundary.util;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;

public class a {
    @RequiresApi(19)
    static class org.chromium.support_lib_boundary.util.a.a implements InvocationHandler {
        private final Object a;

        public org.chromium.support_lib_boundary.util.a.a(@NonNull Object object0) {
            this.a = object0;
        }

        @NonNull
        public Object a() {
            return this.a;
        }

        @Override
        public Object invoke(Object object0, Method method0, Object[] arr_object) throws Throwable {
            ClassLoader classLoader0 = this.a.getClass().getClassLoader();
            try {
                return a.f(method0, classLoader0).invoke(this.a, arr_object);
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw invocationTargetException0.getTargetException();
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
                throw new RuntimeException("Reflection failed for method " + method0, reflectiveOperationException0);
            }
        }
    }

    static final boolean a;

    static {
    }

    @Nullable
    public static Object a(@NonNull Class class0, @Nullable InvocationHandler invocationHandler0) {
        return invocationHandler0 == null ? null : class0.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{class0}, invocationHandler0));
    }

    // 去混淆评级： 低(30)
    public static boolean b(Collection collection0, String s) {
        return collection0.contains(s) || a.i() && collection0.contains(s + ":dev");
    }

    public static boolean c(String[] arr_s, String s) {
        return a.b(Arrays.asList(arr_s), s);
    }

    @Nullable
    @RequiresApi(19)
    public static InvocationHandler d(@Nullable Object object0) {
        return object0 == null ? null : new org.chromium.support_lib_boundary.util.a.a(object0);
    }

    @Nullable
    @RequiresApi(19)
    public static InvocationHandler[] e(@Nullable Object[] arr_object) {
        if(arr_object == null) {
            return null;
        }
        InvocationHandler[] arr_invocationHandler = new InvocationHandler[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            arr_invocationHandler[v] = a.d(arr_object[v]);
        }
        return arr_invocationHandler;
    }

    public static Method f(Method method0, ClassLoader classLoader0) throws ClassNotFoundException, NoSuchMethodException {
        Class class0 = Class.forName(method0.getDeclaringClass().getName(), true, classLoader0);
        Class[] arr_class = method0.getParameterTypes();
        return class0.getDeclaredMethod(method0.getName(), arr_class);
    }

    @Nullable
    @RequiresApi(19)
    public static Object g(@Nullable InvocationHandler invocationHandler0) {
        return invocationHandler0 == null ? null : ((org.chromium.support_lib_boundary.util.a.a)invocationHandler0).a();
    }

    public static boolean h(Object object0, String s) {
        try {
            return Class.forName(s, false, object0.getClass().getClassLoader()).isInstance(object0);
        }
        catch(ClassNotFoundException unused_ex) {
            return false;
        }
    }

    // 去混淆评级： 低(20)
    private static boolean i() {
        return "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
    }
}

