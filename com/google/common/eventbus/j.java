package com.google.common.eventbus;

import com.google.common.base.H;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

@e
class j {
    static class a {
    }

    @J1.e
    static final class b extends j {
        private b(f f0, Object object0, Method method0) {
            super(f0, object0, method0, null);
        }

        b(f f0, Object object0, Method method0, a j$a0) {
            this(f0, object0, method0);
        }

        @Override  // com.google.common.eventbus.j
        void e(Object object0) throws InvocationTargetException {
            synchronized(this) {
                super.e(object0);
            }
        }
    }

    @Weak
    private f a;
    @J1.e
    final Object b;
    private final Method c;
    private final Executor d;

    private j(f f0, Object object0, Method method0) {
        this.a = f0;
        this.b = H.E(object0);
        this.c = method0;
        method0.setAccessible(true);
        this.d = f0.a();
    }

    j(f f0, Object object0, Method method0, a j$a0) {
        this(f0, object0, method0);
    }

    private k b(Object object0) {
        return new k(this.a, object0, this.b, this.c);
    }

    static j c(f f0, Object object0, Method method0) {
        return j.f(method0) ? new j(f0, object0, method0) : new b(f0, object0, method0, null);
    }

    final void d(Object object0) {
        i i0 = () -> try {
            this.e(object0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            this.a.b(invocationTargetException0.getCause(), this.b(object0));
        };
        this.d.execute(i0);
    }

    @J1.e
    void e(Object object0) throws InvocationTargetException {
        try {
            Object[] arr_object = {H.E(object0)};
            this.c.invoke(this.b, arr_object);
            return;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new Error("Method rejected target/argument: " + object0, illegalArgumentException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new Error("Method became inaccessible: " + object0, illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            if(invocationTargetException0.getCause() instanceof Error) {
                throw (Error)invocationTargetException0.getCause();
            }
            throw invocationTargetException0;
        }
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@o3.a Object object0) {
        return object0 instanceof j && this.b == ((j)object0).b && this.c.equals(((j)object0).c);
    }

    private static boolean f(Method method0) {
        return method0.getAnnotation(com.google.common.eventbus.a.class) != null;
    }

    // 检测为 Lambda 实现
    private void g(Object object0) [...]

    @Override
    public final int hashCode() {
        return (this.c.hashCode() + 0x1F) * 0x1F + System.identityHashCode(this.b);
    }
}

