package com.google.gson.internal;

import com.google.gson.v.e;
import com.google.gson.v;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.List;

public class m {
    static class a {
    }

    static abstract class b {
        class com.google.gson.internal.m.b.a extends b {
            final Method b;

            com.google.gson.internal.m.b.a(Method method0) {
                super(null);
            }

            @Override  // com.google.gson.internal.m$b
            public boolean a(AccessibleObject accessibleObject0, Object object0) {
                try {
                    return ((Boolean)this.b.invoke(accessibleObject0, object0)).booleanValue();
                }
                catch(Exception exception0) {
                    throw new RuntimeException("Failed invoking canAccess", exception0);
                }
            }
        }

        class com.google.gson.internal.m.b.b extends b {
            com.google.gson.internal.m.b.b() {
                super(null);
            }

            @Override  // com.google.gson.internal.m$b
            public boolean a(AccessibleObject accessibleObject0, Object object0) {
                return true;
            }
        }

        public static final b a;

        static {
            b.a = new com.google.gson.internal.m.b.b();
        }

        private b() {
        }

        b(a m$a0) {
        }

        public abstract boolean a(AccessibleObject arg1, Object arg2);
    }

    public static boolean a(AccessibleObject accessibleObject0, Object object0) {
        return b.a.a(accessibleObject0, object0);
    }

    public static e b(List list0, Class class0) {
        for(Object object0: list0) {
            e v$e0 = ((v)object0).a(class0);
            if(v$e0 != e.b) {
                return v$e0;
            }
            if(false) {
                break;
            }
        }
        return e.a;
    }

    public static boolean c(Class class0) {
        return m.d(class0.getName());
    }

    // 去混淆评级： 低(30)
    private static boolean d(String s) {
        return s.startsWith("android.") || s.startsWith("androidx.") || m.g(s);
    }

    // 去混淆评级： 低(20)
    public static boolean e(Class class0) {
        String s = class0.getName();
        return m.d(s) || s.startsWith("kotlin.") || s.startsWith("kotlinx.") || s.startsWith("scala.");
    }

    public static boolean f(Class class0) {
        return m.g(class0.getName());
    }

    // 去混淆评级： 低(20)
    private static boolean g(String s) {
        return s.startsWith("java.") || s.startsWith("javax.");
    }
}

