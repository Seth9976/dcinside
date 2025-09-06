package com.google.common.io;

import J1.c;
import J1.d;
import J1.e;
import com.google.common.base.H;
import com.google.common.base.U;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

@c
@d
@q
public final class n implements Closeable {
    @e
    static final class a implements com.google.common.io.n.c {
        static final a a;

        static {
            a.a = new a();
        }

        @Override  // com.google.common.io.n$c
        public void a(Closeable closeable0, Throwable throwable0, Throwable throwable1) {
            m.a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable0, throwable1);
        }
    }

    @e
    static final class b implements com.google.common.io.n.c {
        private final Method a;

        private b(Method method0) {
            this.a = method0;
        }

        @Override  // com.google.common.io.n$c
        public void a(Closeable closeable0, Throwable throwable0, Throwable throwable1) {
            if(throwable0 == throwable1) {
                return;
            }
            try {
                this.a.invoke(throwable0, throwable1);
            }
            catch(Throwable unused_ex) {
                a.a.a(closeable0, throwable0, throwable1);
            }
        }

        @o3.a
        static b b() {
            try {
                return new b(Throwable.class.getMethod("addSuppressed", Throwable.class));
            }
            catch(Throwable unused_ex) {
                return null;
            }
        }
    }

    @e
    interface com.google.common.io.n.c {
        void a(Closeable arg1, Throwable arg2, Throwable arg3);
    }

    @e
    final com.google.common.io.n.c a;
    private final Deque b;
    @o3.a
    private Throwable c;
    private static final com.google.common.io.n.c d;

    static {
        b n$b0 = b.b();
        if(n$b0 == null) {
            n$b0 = a.a;
        }
        n.d = n$b0;
    }

    @e
    n(com.google.common.io.n.c n$c0) {
        this.b = new ArrayDeque(4);
        this.a = (com.google.common.io.n.c)H.E(n$c0);
    }

    public static n a() {
        return new n(n.d);
    }

    @O1.a
    @E
    public Closeable b(@E Closeable closeable0) {
        if(closeable0 != null) {
            this.b.addFirst(closeable0);
        }
        return closeable0;
    }

    public RuntimeException c(Throwable throwable0) throws IOException {
        H.E(throwable0);
        this.c = throwable0;
        U.t(throwable0, IOException.class);
        throw new RuntimeException(throwable0);
    }

    @Override
    public void close() throws IOException {
        Throwable throwable0 = this.c;
        while(!this.b.isEmpty()) {
            Closeable closeable0 = (Closeable)this.b.removeFirst();
            try {
                closeable0.close();
            }
            catch(Throwable throwable1) {
                if(throwable0 == null) {
                    throwable0 = throwable1;
                    continue;
                }
                this.a.a(closeable0, throwable0, throwable1);
            }
        }
        if(this.c == null && throwable0 != null) {
            U.t(throwable0, IOException.class);
            throw new AssertionError(throwable0);
        }
    }

    public RuntimeException e(Throwable throwable0, Class class0) throws IOException, Exception {
        H.E(throwable0);
        this.c = throwable0;
        U.t(throwable0, IOException.class);
        U.t(throwable0, class0);
        throw new RuntimeException(throwable0);
    }

    public RuntimeException f(Throwable throwable0, Class class0, Class class1) throws IOException, Exception, Exception {
        H.E(throwable0);
        this.c = throwable0;
        U.t(throwable0, IOException.class);
        U.u(throwable0, class0, class1);
        throw new RuntimeException(throwable0);
    }
}

