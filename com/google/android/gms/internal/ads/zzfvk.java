package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o3.a;

public final class zzfvk {
    @a
    private static final Object zza;

    static {
        Object object0 = zzfvk.zza();
        zzfvk.zza = object0;
        if(object0 != null) {
            zzfvk.zzb("getStackTraceElement", new Class[]{Throwable.class, Integer.TYPE});
        }
        if(object0 == null) {
            return;
        }
        zzfvk.zzc(object0);
    }

    @a
    private static Object zza() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        }
        catch(ThreadDeath threadDeath0) {
            throw threadDeath0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    @a
    private static Method zzb(String s, Class[] arr_class) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(s, arr_class);
        }
        catch(ThreadDeath threadDeath0) {
            throw threadDeath0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    @a
    private static Method zzc(Object object0) {
        try {
            Method method0 = zzfvk.zzb("getStackTraceDepth", new Class[]{Throwable.class});
            if(method0 == null) {
                return null;
            }
            method0.invoke(object0, new Throwable());
            return method0;
        }
        catch(UnsupportedOperationException | IllegalAccessException | InvocationTargetException unused_ex) {
            return null;
        }
    }
}

