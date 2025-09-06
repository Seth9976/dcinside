package com.bykv.vk.openvk.preload.a.b;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class i {
    public static i a() {
        Class class1;
        Class class0;
        try {
            class0 = ObjectStreamClass.class;
            class1 = Class.class;
            Class class2 = Class.forName("sun.misc.Unsafe");
            Field field0 = class2.getDeclaredField("theUnsafe");
            field0.setAccessible(true);
            Object object0 = field0.get(null);
            return new i() {
                @Override  // com.bykv.vk.openvk.preload.a.b.i
                public final Object a(Class class0) throws Exception {
                    i.b(class0);
                    return class2.getMethod("allocateInstance", class1).invoke(object0, class0);
                }
            };
        }
        catch(Exception unused_ex) {
            try {
                Method method0 = class0.getDeclaredMethod("getConstructorId", class1);
                method0.setAccessible(true);
                int v = (int)(((Integer)method0.invoke(null, Object.class)));
                Method method1 = class0.getDeclaredMethod("newInstance", class1, Integer.TYPE);
                method1.setAccessible(true);
                return new i() {
                    @Override  // com.bykv.vk.openvk.preload.a.b.i
                    public final Object a(Class class0) throws Exception {
                        i.b(class0);
                        return method1.invoke(null, class0, v);
                    }
                };
            }
            catch(Exception unused_ex) {
                try {
                    Method method2 = ObjectInputStream.class.getDeclaredMethod("newInstance", class1, class1);
                    method2.setAccessible(true);
                    return new i() {
                        @Override  // com.bykv.vk.openvk.preload.a.b.i
                        public final Object a(Class class0) throws Exception {
                            i.b(class0);
                            return method2.invoke(null, class0, Object.class);
                        }
                    };
                }
                catch(Exception unused_ex) {
                    return new i() {
                        @Override  // com.bykv.vk.openvk.preload.a.b.i
                        public final Object a(Class class0) {
                            throw new UnsupportedOperationException("Cannot allocate " + class0);
                        }
                    };
                }
            }
        }
    }

    public abstract Object a(Class arg1) throws Exception;

    static void b(Class class0) {
        int v = class0.getModifiers();
        if(Modifier.isInterface(v)) {
            throw new UnsupportedOperationException("Interface can\'t be instantiated! Interface name: " + class0.getName());
        }
        if(Modifier.isAbstract(v)) {
            throw new UnsupportedOperationException("Abstract class can\'t be instantiated! Class name: " + class0.getName());
        }
    }
}

