package j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

public final class a {
    private final Unsafe a;
    private static final a b;

    static {
        Field field0 = a.i();
        field0.setAccessible(true);
        try {
            a.b = new a(((Unsafe)field0.get(null)));
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError("Couldn\'t get the Unsafe", illegalAccessException0);
        }
    }

    a(Unsafe unsafe0) {
        this.a = unsafe0;
    }

    public final int a(Class class0) {
        return this.a.arrayBaseOffset(class0);
    }

    public final int b(Class class0) {
        return this.a.arrayIndexScale(class0);
    }

    public final boolean c(Object object0, long v, int v1, int v2) {
        return this.a.compareAndSwapInt(object0, v, v1, v2);
    }

    public final boolean d(Object object0, long v, long v1, long v2) {
        return this.a.compareAndSwapLong(object0, v, v1, v2);
    }

    public final boolean e(Object object0, long v, Object object1) {
        return j..com.android.tools.r8.a.l(this.a, object0, v, object1);
    }

    public final int f(Object object0, long v) {
        int v1;
        do {
            v1 = this.a.getIntVolatile(object0, v);
        }
        while(!this.a.compareAndSwapInt(object0, v, v1, v1 - 4));
        return v1;
    }

    public final Object g(Object object0, long v) {
        return this.a.getObjectVolatile(object0, v);
    }

    public static a h() {
        return a.b;
    }

    private static Field i() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            Field[] arr_field = Unsafe.class.getDeclaredFields();
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                if(Modifier.isStatic(field0.getModifiers())) {
                    Class class0 = field0.getType();
                    if(Unsafe.class.isAssignableFrom(class0)) {
                        return field0;
                    }
                }
            }
            throw new AssertionError("Couldn\'t find the Unsafe", noSuchFieldException0);
        }
    }

    public final long j(Class class0, String s) {
        try {
            return this.k(class0.getDeclaredField(s));
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            throw new AssertionError("Cannot find field:", noSuchFieldException0);
        }
    }

    public final long k(Field field0) {
        return this.a.objectFieldOffset(field0);
    }

    public final void l(Object object0, long v, Object object1) {
        this.a.putObjectVolatile(object0, v, object1);
    }
}

