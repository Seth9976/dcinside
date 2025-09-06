package com.google.common.base;

import J1.c;
import J1.d;
import J1.e;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

@c
@d
@k
public class q implements Closeable {
    static class a implements com.google.common.base.q.c {
        private static final String a = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

        @Override  // com.google.common.base.q$c
        @o3.a
        public Class a() {
            try {
                return this.c(this.b()).loadClass("com.google.common.base.internal.Finalizer");
            }
            catch(Exception exception0) {
                q.d.log(Level.WARNING, "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", exception0);
                return null;
            }
        }

        URL b() throws IOException {
            URL uRL0 = this.getClass().getClassLoader().getResource("com/google/common/base/internal/Finalizer.class");
            if(uRL0 == null) {
                throw new FileNotFoundException("com/google/common/base/internal/Finalizer.class");
            }
            String s = uRL0.toString();
            if(!s.endsWith("com/google/common/base/internal/Finalizer.class")) {
                throw new IOException("Unsupported path style: " + s);
            }
            return new URL(uRL0, s.substring(0, s.length() - 0x2F));
        }

        URLClassLoader c(URL uRL0) {
            return new URLClassLoader(new URL[]{uRL0}, null);
        }
    }

    static class b implements com.google.common.base.q.c {
        // 去混淆评级： 低(20)
        @Override  // com.google.common.base.q$c
        public Class a() {
            return K1.a.class;
        }
    }

    interface com.google.common.base.q.c {
        @o3.a
        Class a();
    }

    static class com.google.common.base.q.d implements com.google.common.base.q.c {
        @e
        static boolean a;

        @Override  // com.google.common.base.q$c
        @o3.a
        public Class a() {
            ClassLoader classLoader0;
            if(com.google.common.base.q.d.a) {
                return null;
            }
            try {
                classLoader0 = ClassLoader.getSystemClassLoader();
            }
            catch(SecurityException unused_ex) {
                q.d.info("Not allowed to access system class loader.");
                return null;
            }
            if(classLoader0 != null) {
                try {
                    return classLoader0.loadClass("com.google.common.base.internal.Finalizer");
                }
                catch(ClassNotFoundException unused_ex) {
                }
            }
            return null;
        }
    }

    final ReferenceQueue a;
    final PhantomReference b;
    final boolean c;
    private static final Logger d = null;
    private static final String e = "com.google.common.base.internal.Finalizer";
    private static final Method f;

    static {
        q.d = Logger.getLogger("com.google.common.base.q");
        q.f = q.c(q.e(new com.google.common.base.q.c[]{new com.google.common.base.q.d(), new a(), new b()}));
    }

    public q() {
        boolean z = true;
        super();
        ReferenceQueue referenceQueue0 = new ReferenceQueue();
        this.a = referenceQueue0;
        PhantomReference phantomReference0 = new PhantomReference(this, referenceQueue0);
        this.b = phantomReference0;
        try {
            q.f.invoke(null, p.class, referenceQueue0, phantomReference0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError(illegalAccessException0);
        }
        catch(Throwable throwable0) {
            q.d.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", throwable0);
            z = false;
        }
        this.c = z;
    }

    void b() {
        if(this.c) {
            return;
        }
        Reference reference0;
        while((reference0 = this.a.poll()) != null) {
            reference0.clear();
            try {
                ((p)reference0).a();
            }
            catch(Throwable throwable0) {
                q.d.log(Level.SEVERE, "Error cleaning up after reference.", throwable0);
            }
        }
    }

    static Method c(Class class0) {
        try {
            return class0.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new AssertionError(noSuchMethodException0);
        }
    }

    @Override
    public void close() {
        this.b.enqueue();
        this.b();
    }

    private static Class e(com.google.common.base.q.c[] arr_q$c) {
        for(int v = 0; v < arr_q$c.length; ++v) {
            Class class0 = arr_q$c[v].a();
            if(class0 != null) {
                return class0;
            }
        }
        throw new AssertionError();
    }
}

