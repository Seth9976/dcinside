package com.kakao.adfit.m;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

public final class b {
    public static final class a implements Application.ActivityLifecycleCallbacks {
        private final ArrayList a;
        private final ArrayList b;

        public a() {
            this.a = new ArrayList();
            this.b = new ArrayList();
        }

        public final ArrayList a() {
            return this.b;
        }

        public final ArrayList b() {
            return this.a;
        }

        private final void c() {
            static final class com.kakao.adfit.m.b.a.a extends N implements Function1 {
                public static final com.kakao.adfit.m.b.a.a a;

                static {
                    com.kakao.adfit.m.b.a.a.a = new com.kakao.adfit.m.b.a.a();
                }

                com.kakao.adfit.m.b.a.a() {
                    super(1);
                }

                public final Boolean a(WeakReference weakReference0) {
                    L.p(weakReference0, "it");
                    return weakReference0.get() == null;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((WeakReference)object0));
                }
            }


            static final class com.kakao.adfit.m.b.a.b extends N implements Function1 {
                public static final com.kakao.adfit.m.b.a.b a;

                static {
                    com.kakao.adfit.m.b.a.b.a = new com.kakao.adfit.m.b.a.b();
                }

                com.kakao.adfit.m.b.a.b() {
                    super(1);
                }

                public final Boolean a(WeakReference weakReference0) {
                    L.p(weakReference0, "it");
                    return weakReference0.get() == null;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((WeakReference)object0));
                }
            }

            u.L0(this.b, com.kakao.adfit.m.b.a.a.a);
            u.L0(this.a, com.kakao.adfit.m.b.a.b.a);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity0, Bundle bundle0) {
            L.p(activity0, "activity");
            this.c();
            Context context0 = activity0.getApplicationContext();
            if(context0 != null) {
                d.a.c(context0);
            }
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity0) {
            L.p(activity0, "activity");
            this.c();
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity0) {
            L.p(activity0, "activity");
            int v = 0;
            Iterator iterator0 = this.b.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    v = -1;
                    break;
                }
                Object object0 = iterator0.next();
                if(((WeakReference)object0).get() == activity0) {
                    break;
                }
                ++v;
            }
            if(v >= 0) {
                this.b.remove(v);
            }
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity0) {
            L.p(activity0, "activity");
            WeakReference weakReference0 = new WeakReference(activity0);
            this.b.add(weakReference0);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
            L.p(activity0, "activity");
            L.p(bundle0, "outState");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity0) {
            L.p(activity0, "activity");
            WeakReference weakReference0 = new WeakReference(activity0);
            this.a.add(weakReference0);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity0) {
            L.p(activity0, "activity");
            int v = 0;
            Iterator iterator0 = this.a.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    v = -1;
                    break;
                }
                Object object0 = iterator0.next();
                if(((WeakReference)object0).get() == activity0) {
                    break;
                }
                ++v;
            }
            if(v >= 0) {
                this.a.remove(v);
            }
        }
    }

    public static final b a;
    private static final a b;
    private static AtomicBoolean c;

    static {
        b.a = new b();
        b.b = new a();
        b.c = new AtomicBoolean(false);
    }

    public final void a(Application application0) {
        L.p(application0, "application");
        if(b.c.compareAndSet(false, true)) {
            application0.registerActivityLifecycleCallbacks(b.b);
        }
    }

    public final void a(Context context0) {
        L.p(context0, "context");
        if(!b.c.get()) {
            Context context1 = context0.getApplicationContext();
            L.n(context1, "null cannot be cast to non-null type android.app.Application");
            this.a(((Application)context1));
        }
    }

    public final boolean a() {
        ArrayList arrayList0 = b.b.a();
        if(!(arrayList0 instanceof Collection) || !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                if(((WeakReference)object0).get() != null) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public final boolean a(Activity activity0) {
        L.p(activity0, "activity");
        for(Object object0: b.b.b()) {
            if(L.g(((WeakReference)object0).get(), activity0)) {
                return object0 != null;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public final boolean b() {
        ArrayList arrayList0 = b.b.b();
        if(!(arrayList0 instanceof Collection) || !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                if(((WeakReference)object0).get() != null) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }
}

