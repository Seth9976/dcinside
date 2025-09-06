package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class o {
    public static final o a;

    static {
        o.a = o.c();
    }

    private static void b(Class class0) {
        String s = c.a(class0);
        if(s != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + s);
        }
    }

    private static o c() {
        class a extends o {
            final Method b;
            final Object c;

            a(Method method0, Object object0) {
                this.c = object0;
                super();
            }

            @Override  // com.google.gson.internal.o
            public Object d(Class class0) throws Exception {
                o.b(class0);
                return this.b.invoke(this.c, class0);
            }
        }


        class b extends o {
            final Method b;
            final int c;

            b(Method method0, int v) {
                this.c = v;
                super();
            }

            @Override  // com.google.gson.internal.o
            public Object d(Class class0) throws Exception {
                o.b(class0);
                return this.b.invoke(null, class0, this.c);
            }
        }


        class com.google.gson.internal.o.c extends o {
            final Method b;

            com.google.gson.internal.o.c(Method method0) {
            }

            @Override  // com.google.gson.internal.o
            public Object d(Class class0) throws Exception {
                o.b(class0);
                return this.b.invoke(null, class0, Object.class);
            }
        }


        class d extends o {
            d() {
                super();
            }

            @Override  // com.google.gson.internal.o
            public Object d(Class class0) {
                throw new UnsupportedOperationException("Cannot allocate " + class0 + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
            }
        }

        Class class1;
        Class class0;
        try {
            class0 = ObjectStreamClass.class;
            class1 = Class.class;
            Class class2 = Class.forName("sun.misc.Unsafe");
            Field field0 = class2.getDeclaredField("theUnsafe");
            field0.setAccessible(true);
            Object object0 = field0.get(null);
            return new a(class2.getMethod("allocateInstance", class1), object0);
        }
        catch(Exception unused_ex) {
            try {
                Method method0 = class0.getDeclaredMethod("getConstructorId", class1);
                method0.setAccessible(true);
                int v = (int)(((Integer)method0.invoke(null, Object.class)));
                Method method1 = class0.getDeclaredMethod("newInstance", class1, Integer.TYPE);
                method1.setAccessible(true);
                return new b(method1, v);
            }
            catch(Exception unused_ex) {
                try {
                    Method method2 = ObjectInputStream.class.getDeclaredMethod("newInstance", class1, class1);
                    method2.setAccessible(true);
                    return new com.google.gson.internal.o.c(method2);
                }
                catch(Exception unused_ex) {
                    return new d();
                }
            }
        }
    }

    public abstract Object d(Class arg1) throws Exception;
}

