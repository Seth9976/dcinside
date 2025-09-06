package com.vungle.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.internal.downloader.e;
import com.vungle.ads.internal.task.n;
import com.vungle.ads.internal.util.q;
import java.util.HashMap;
import java.util.Map;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class ServiceLocator {
    @Keep
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final void deInit() {
            synchronized(this) {
                this.setINSTANCE$vungle_ads_release(null);
            }
        }

        @m
        public final ServiceLocator getINSTANCE$vungle_ads_release() {
            return ServiceLocator.INSTANCE;
        }

        @VisibleForTesting
        public static void getINSTANCE$vungle_ads_release$annotations() {
        }

        @l
        public final ServiceLocator getInstance(@l Context context0) {
            L.p(context0, "context");
            ServiceLocator serviceLocator0 = this.getINSTANCE$vungle_ads_release();
            if(serviceLocator0 == null) {
                synchronized(this) {
                    Companion serviceLocator$Companion0 = ServiceLocator.Companion;
                    ServiceLocator serviceLocator1 = serviceLocator$Companion0.getINSTANCE$vungle_ads_release();
                    if(serviceLocator1 == null) {
                        serviceLocator1 = new ServiceLocator(context0, null);
                        serviceLocator$Companion0.setINSTANCE$vungle_ads_release(serviceLocator1);
                    }
                    return serviceLocator1;
                }
            }
            return serviceLocator0;
        }

        public final D inject(Context context0) {
            public static final class a extends N implements A3.a {
                final Context $context;

                public a(Context context0) {
                    this.$context = context0;
                    super(0);
                }

                @Override  // A3.a
                @l
                public final Object invoke() {
                    ServiceLocator serviceLocator0 = ServiceLocator.Companion.getInstance(this.$context);
                    L.y(4, "T");
                    return serviceLocator0.getService(Object.class);
                }
            }

            L.p(context0, "context");
            L.w();
            a serviceLocator$Companion$a0 = new a(context0);
            return E.c(H.a, serviceLocator$Companion$a0);
        }

        public final void setINSTANCE$vungle_ads_release(@m ServiceLocator serviceLocator0) {
            ServiceLocator.INSTANCE = serviceLocator0;
        }
    }

    abstract class com.vungle.ads.ServiceLocator.a {
        private final boolean isSingleton;

        public com.vungle.ads.ServiceLocator.a(boolean z) {
            this.isSingleton = z;
        }

        public com.vungle.ads.ServiceLocator.a(boolean z, int v, w w0) {
            if((v & 1) != 0) {
                z = true;
            }
            this(z);
        }

        public abstract Object create();

        public final boolean isSingleton() {
            return this.isSingleton;
        }
    }

    @l
    public static final Companion Companion;
    @SuppressLint({"StaticFieldLeak"})
    @m
    private static volatile ServiceLocator INSTANCE;
    @l
    private final Map cache;
    @l
    private final Map creators;
    @l
    private final Context ctx;

    static {
        ServiceLocator.Companion = new Companion(null);
    }

    private ServiceLocator(Context context0) {
        Context context1 = context0.getApplicationContext();
        L.o(context1, "context.applicationContext");
        this.ctx = context1;
        this.creators = new HashMap();
        this.cache = new HashMap();
        this.buildCreators();
    }

    public ServiceLocator(Context context0, w w0) {
        this(context0);
    }

    @VisibleForTesting
    public final void bindService$vungle_ads_release(@l Class class0, Object object0) {
        L.p(class0, "serviceClass");
        this.cache.put(class0, object0);
    }

    private final void buildCreators() {
        public static final class b extends com.vungle.ads.ServiceLocator.a {
            b(ServiceLocator serviceLocator0) {
                ServiceLocator.this = serviceLocator0;
                super(false, 1, null);
            }

            @l
            public com.vungle.ads.internal.bidding.a create() {
                return new com.vungle.ads.internal.bidding.a(ServiceLocator.this.ctx);
            }

            @Override  // com.vungle.ads.ServiceLocator$a
            public Object create() {
                return this.create();
            }
        }


        public static final class c extends com.vungle.ads.ServiceLocator.a {
            c(ServiceLocator serviceLocator0) {
                ServiceLocator.this = serviceLocator0;
                super(false, 1, null);
            }

            @l
            public q create() {
                return new q(ServiceLocator.this.ctx);
            }

            @Override  // com.vungle.ads.ServiceLocator$a
            public Object create() {
                return this.create();
            }
        }


        public static final class d extends com.vungle.ads.ServiceLocator.a {
            d(ServiceLocator serviceLocator0) {
                ServiceLocator.this = serviceLocator0;
                super(false);
            }

            @l
            public e create() {
                return new com.vungle.ads.internal.downloader.c(((com.vungle.ads.internal.executor.a)ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getDownloaderExecutor(), ((q)ServiceLocator.this.getOrBuild(q.class)));
            }

            @Override  // com.vungle.ads.ServiceLocator$a
            public Object create() {
                return this.create();
            }
        }


        public static final class com.vungle.ads.ServiceLocator.e extends com.vungle.ads.ServiceLocator.a {
            com.vungle.ads.ServiceLocator.e(ServiceLocator serviceLocator0) {
                super(false, 1, null);
            }

            @l
            public com.vungle.ads.internal.util.d create() {
                return new com.vungle.ads.internal.util.d();
            }

            @Override  // com.vungle.ads.ServiceLocator$a
            public Object create() {
                return this.create();
            }
        }


        public static final class f extends com.vungle.ads.ServiceLocator.a {
            f(ServiceLocator serviceLocator0) {
                ServiceLocator.this = serviceLocator0;
                super(false, 1, null);
            }

            @l
            public com.vungle.ads.internal.signals.c create() {
                return new com.vungle.ads.internal.signals.c(ServiceLocator.this.ctx);
            }

            @Override  // com.vungle.ads.ServiceLocator$a
            public Object create() {
                return this.create();
            }
        }


        public static final class g extends com.vungle.ads.ServiceLocator.a {
            g(ServiceLocator serviceLocator0) {
                ServiceLocator.this = serviceLocator0;
                super(false, 1, null);
            }

            @l
            public com.vungle.ads.internal.task.d create() {
                return new com.vungle.ads.internal.task.m(ServiceLocator.this.ctx, ((q)ServiceLocator.this.getOrBuild(q.class)));
            }

            @Override  // com.vungle.ads.ServiceLocator$a
            public Object create() {
                return this.create();
            }
        }


        public static final class h extends com.vungle.ads.ServiceLocator.a {
            h(ServiceLocator serviceLocator0) {
                ServiceLocator.this = serviceLocator0;
                super(false, 1, null);
            }

            @l
            public com.vungle.ads.internal.task.g create() {
                return new n(((com.vungle.ads.internal.task.d)ServiceLocator.this.getOrBuild(com.vungle.ads.internal.task.d.class)), ((com.vungle.ads.internal.executor.a)ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getJobExecutor(), new com.vungle.ads.internal.task.h());
            }

            @Override  // com.vungle.ads.ServiceLocator$a
            public Object create() {
                return this.create();
            }
        }


        public static final class i extends com.vungle.ads.ServiceLocator.a {
            i(ServiceLocator serviceLocator0) {
                ServiceLocator.this = serviceLocator0;
                super(false, 1, null);
            }

            @l
            public com.vungle.ads.internal.network.l create() {
                return new com.vungle.ads.internal.network.l(ServiceLocator.this.ctx, ((com.vungle.ads.internal.platform.d)ServiceLocator.this.getOrBuild(com.vungle.ads.internal.platform.d.class)), ((com.vungle.ads.internal.persistence.b)ServiceLocator.this.getOrBuild(com.vungle.ads.internal.persistence.b.class)));
            }

            @Override  // com.vungle.ads.ServiceLocator$a
            public Object create() {
                return this.create();
            }
        }


        public static final class j extends com.vungle.ads.ServiceLocator.a {
            j(ServiceLocator serviceLocator0) {
                ServiceLocator.this = serviceLocator0;
                super(false, 1, null);
            }

            @l
            public com.vungle.ads.internal.platform.d create() {
                com.vungle.ads.internal.executor.i i0 = ((com.vungle.ads.internal.executor.a)ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getUaExecutor();
                return new com.vungle.ads.internal.platform.c(ServiceLocator.this.ctx, i0);
            }

            @Override  // com.vungle.ads.ServiceLocator$a
            public Object create() {
                return this.create();
            }
        }


        public static final class k extends com.vungle.ads.ServiceLocator.a {
            k(ServiceLocator serviceLocator0) {
                super(false, 1, null);
            }

            @l
            public com.vungle.ads.internal.executor.a create() {
                return new com.vungle.ads.internal.executor.d();
            }

            @Override  // com.vungle.ads.ServiceLocator$a
            public Object create() {
                return this.create();
            }
        }


        public static final class com.vungle.ads.ServiceLocator.l extends com.vungle.ads.ServiceLocator.a {
            com.vungle.ads.ServiceLocator.l(ServiceLocator serviceLocator0) {
                ServiceLocator.this = serviceLocator0;
                super(false, 1, null);
            }

            @l
            public com.vungle.ads.internal.omsdk.c create() {
                return new com.vungle.ads.internal.omsdk.c(ServiceLocator.this.ctx);
            }

            @Override  // com.vungle.ads.ServiceLocator$a
            public Object create() {
                return this.create();
            }
        }


        public static final class com.vungle.ads.ServiceLocator.m extends com.vungle.ads.ServiceLocator.a {
            com.vungle.ads.ServiceLocator.m(ServiceLocator serviceLocator0) {
                super(false, 1, null);
            }

            @l
            public com.vungle.ads.internal.omsdk.e.b create() {
                return new com.vungle.ads.internal.omsdk.e.b();
            }

            @Override  // com.vungle.ads.ServiceLocator$a
            public Object create() {
                return this.create();
            }
        }


        public static final class com.vungle.ads.ServiceLocator.n extends com.vungle.ads.ServiceLocator.a {
            com.vungle.ads.ServiceLocator.n(ServiceLocator serviceLocator0) {
                ServiceLocator.this = serviceLocator0;
                super(false, 1, null);
            }

            @l
            public com.vungle.ads.internal.persistence.b create() {
                com.vungle.ads.internal.executor.i i0 = ((com.vungle.ads.internal.executor.a)ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getIoExecutor();
                q q0 = (q)ServiceLocator.this.getOrBuild(q.class);
                return com.vungle.ads.internal.persistence.b.a.get$default(com.vungle.ads.internal.persistence.b.Companion, i0, q0, null, 4, null);
            }

            @Override  // com.vungle.ads.ServiceLocator$a
            public Object create() {
                return this.create();
            }
        }


        public static final class o extends com.vungle.ads.ServiceLocator.a {
            o(ServiceLocator serviceLocator0) {
                super(false, 1, null);
            }

            @l
            public U2.a create() {
                return new U2.b();
            }

            @Override  // com.vungle.ads.ServiceLocator$a
            public Object create() {
                return this.create();
            }
        }

        g serviceLocator$g0 = new g(this);
        this.creators.put(com.vungle.ads.internal.task.d.class, serviceLocator$g0);
        h serviceLocator$h0 = new h(this);
        this.creators.put(com.vungle.ads.internal.task.g.class, serviceLocator$h0);
        i serviceLocator$i0 = new i(this);
        this.creators.put(com.vungle.ads.internal.network.l.class, serviceLocator$i0);
        j serviceLocator$j0 = new j(this);
        this.creators.put(com.vungle.ads.internal.platform.d.class, serviceLocator$j0);
        k serviceLocator$k0 = new k(this);
        this.creators.put(com.vungle.ads.internal.executor.a.class, serviceLocator$k0);
        com.vungle.ads.ServiceLocator.l serviceLocator$l0 = new com.vungle.ads.ServiceLocator.l(this);
        this.creators.put(com.vungle.ads.internal.omsdk.c.class, serviceLocator$l0);
        com.vungle.ads.ServiceLocator.m serviceLocator$m0 = new com.vungle.ads.ServiceLocator.m(this);
        this.creators.put(com.vungle.ads.internal.omsdk.e.b.class, serviceLocator$m0);
        com.vungle.ads.ServiceLocator.n serviceLocator$n0 = new com.vungle.ads.ServiceLocator.n(this);
        this.creators.put(com.vungle.ads.internal.persistence.b.class, serviceLocator$n0);
        o serviceLocator$o0 = new o(this);
        this.creators.put(U2.a.class, serviceLocator$o0);
        b serviceLocator$b0 = new b(this);
        this.creators.put(com.vungle.ads.internal.bidding.a.class, serviceLocator$b0);
        c serviceLocator$c0 = new c(this);
        this.creators.put(q.class, serviceLocator$c0);
        d serviceLocator$d0 = new d(this);
        this.creators.put(e.class, serviceLocator$d0);
        com.vungle.ads.ServiceLocator.e serviceLocator$e0 = new com.vungle.ads.ServiceLocator.e(this);
        this.creators.put(com.vungle.ads.internal.util.d.class, serviceLocator$e0);
        f serviceLocator$f0 = new f(this);
        this.creators.put(com.vungle.ads.internal.signals.c.class, serviceLocator$f0);
    }

    private final Object getOrBuild(Class class0) {
        Class class1 = this.getServiceClass(class0);
        Object object0 = this.cache.get(class1);
        if(object0 == null) {
            com.vungle.ads.ServiceLocator.a serviceLocator$a0 = (com.vungle.ads.ServiceLocator.a)this.creators.get(class1);
            if(serviceLocator$a0 == null) {
                throw new IllegalArgumentException("Unknown class");
            }
            Object object1 = serviceLocator$a0.create();
            if(serviceLocator$a0.isSingleton()) {
                this.cache.put(class1, object1);
            }
            return object1;
        }
        return object0;
    }

    public final Object getService(@l Class class0) {
        synchronized(this) {
            L.p(class0, "serviceClass");
            return this.getOrBuild(class0);
        }
    }

    private final Class getServiceClass(Class class0) {
        for(Object object0: this.creators.keySet()) {
            Class class1 = (Class)object0;
            if(class1.isAssignableFrom(class0)) {
                return class1;
            }
            if(false) {
                break;
            }
        }
        throw new IllegalArgumentException("Unknown dependency for " + class0);
    }

    public final boolean isCreated(@l Class class0) {
        synchronized(this) {
            L.p(class0, "serviceClass");
            Class class1 = this.getServiceClass(class0);
            return this.cache.containsKey(class1);
        }
    }
}

