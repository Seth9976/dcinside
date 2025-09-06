package androidx.core.app;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@RestrictTo({Scope.a})
final class ActivityRecreator {
    static final class LifecycleCheckCallbacks implements Application.ActivityLifecycleCallbacks {
        Object a;
        private Activity b;
        private final int c;
        private boolean d;
        private boolean e;
        private boolean f;

        LifecycleCheckCallbacks(Activity activity0) {
            this.d = false;
            this.e = false;
            this.f = false;
            this.b = activity0;
            this.c = activity0.hashCode();
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity0, Bundle bundle0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity0) {
            if(this.b == activity0) {
                this.b = null;
                this.e = true;
            }
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity0) {
            if(this.e && !this.f && !this.d && ActivityRecreator.h(this.a, this.c, activity0)) {
                this.f = true;
                this.a = null;
            }
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity0) {
            if(this.b == activity0) {
                this.d = true;
            }
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity0) {
        }
    }

    private static final String a = "ActivityRecreator";
    protected static final Class b;
    protected static final Field c;
    protected static final Field d;
    protected static final Method e;
    protected static final Method f;
    protected static final Method g;
    private static final Handler h;

    static {
        ActivityRecreator.h = new Handler(Looper.getMainLooper());
        Class class0 = ActivityRecreator.a();
        ActivityRecreator.b = class0;
        ActivityRecreator.c = ActivityRecreator.b();
        ActivityRecreator.d = ActivityRecreator.f();
        ActivityRecreator.e = ActivityRecreator.d(class0);
        ActivityRecreator.f = ActivityRecreator.c(class0);
        ActivityRecreator.g = ActivityRecreator.e(class0);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field field0 = Activity.class.getDeclaredField("mMainThread");
            field0.setAccessible(true);
            return field0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static Method c(Class class0) {
        if(class0 == null) {
            return null;
        }
        try {
            Method method0 = class0.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            method0.setAccessible(true);
            return method0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static Method d(Class class0) {
        if(class0 == null) {
            return null;
        }
        try {
            Method method0 = class0.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            method0.setAccessible(true);
            return method0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    // 去混淆评级： 低(30)
    private static Method e(Class class0) {
        return null;
    }

    private static Field f() {
        try {
            Field field0 = Activity.class.getDeclaredField("mToken");
            field0.setAccessible(true);
            return field0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static boolean g() [...] // 潜在的解密器

    protected static boolean h(Object object0, int v, Activity activity0) {
        try {
            Object object1 = ActivityRecreator.d.get(activity0);
            if(object1 == object0 && activity0.hashCode() == v) {
                androidx.core.app.ActivityRecreator.3 activityRecreator$30 = new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Method method0 = ActivityRecreator.e;
                            if(method0 != null) {
                                method0.invoke(ActivityRecreator.c.get(activity0), object1, Boolean.FALSE, "AppCompat recreation");
                                return;
                            }
                            ActivityRecreator.f.invoke(ActivityRecreator.c.get(activity0), object1, Boolean.FALSE);
                            return;
                        }
                        catch(RuntimeException runtimeException0) {
                        }
                        catch(Throwable throwable0) {
                            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", throwable0);
                            return;
                        }
                        if(runtimeException0.getClass() == RuntimeException.class && runtimeException0.getMessage() != null && runtimeException0.getMessage().startsWith("Unable to stop")) {
                            throw runtimeException0;
                        }
                    }
                };
                ActivityRecreator.h.postAtFrontOfQueue(activityRecreator$30);
                return true;
            }
        }
        catch(Throwable throwable0) {
            Log.e("ActivityRecreator", "Exception while fetching field values", throwable0);
        }
        return false;
    }

    static boolean i(Activity activity0) {
        Handler handler0;
        LifecycleCheckCallbacks activityRecreator$LifecycleCheckCallbacks0;
        Application application0;
        if(Build.VERSION.SDK_INT >= 28) {
            activity0.recreate();
            return true;
        }
        if(ActivityRecreator.f == null && ActivityRecreator.e == null) {
            return false;
        }
        try {
            Object object0 = ActivityRecreator.d.get(activity0);
            if(object0 == null) {
                return false;
            }
            if(ActivityRecreator.c.get(activity0) == null) {
                return false;
            }
            application0 = activity0.getApplication();
            activityRecreator$LifecycleCheckCallbacks0 = new LifecycleCheckCallbacks(activity0);
            application0.registerActivityLifecycleCallbacks(activityRecreator$LifecycleCheckCallbacks0);
            handler0 = ActivityRecreator.h;
            handler0.post(new Runnable() {
                @Override
                public void run() {
                    activityRecreator$LifecycleCheckCallbacks0.a = object0;
                }
            });
        }
        catch(Throwable unused_ex) {
            return false;
        }
        try {
            activity0.recreate();
            goto label_21;
        }
        catch(Throwable throwable0) {
        }
        try {
            androidx.core.app.ActivityRecreator.2 activityRecreator$20 = new Runnable() {
                @Override
                public void run() {
                    application0.unregisterActivityLifecycleCallbacks(activityRecreator$LifecycleCheckCallbacks0);
                }
            };
            ActivityRecreator.h.post(activityRecreator$20);
            throw throwable0;
        label_21:
            handler0.post(new Runnable() {
                @Override
                public void run() {
                    application0.unregisterActivityLifecycleCallbacks(activityRecreator$LifecycleCheckCallbacks0);
                }
            });
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }
}

