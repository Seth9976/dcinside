package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.AnyThread;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.collection.ArraySet;
import androidx.core.app.AppLocalesStorageHelper;
import androidx.core.os.LocaleListCompat;
import j..util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

public abstract class AppCompatDelegate {
    @RequiresApi(24)
    static class Api24Impl {
        @DoNotInline
        static LocaleList a(String s) {
            return LocaleList.forLanguageTags(s);
        }
    }

    @RequiresApi(33)
    static class Api33Impl {
        @DoNotInline
        static LocaleList a(Object object0) {
            return ((LocaleManager)object0).getApplicationLocales();
        }

        @DoNotInline
        static void b(Object object0, LocaleList localeList0) {
            ((LocaleManager)object0).setApplicationLocales(localeList0);
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NightMode {
    }

    static class SerialExecutor implements Executor {
        private final Object a;
        final Queue b;
        final Executor c;
        Runnable d;

        SerialExecutor(Executor executor0) {
            this.a = new Object();
            this.b = new ArrayDeque();
            this.c = executor0;
        }

        // 检测为 Lambda 实现
        private void b(Runnable runnable0) [...]

        protected void c() {
            synchronized(this.a) {
                Runnable runnable0 = (Runnable)this.b.poll();
                this.d = runnable0;
                if(runnable0 != null) {
                    this.c.execute(runnable0);
                }
            }
        }

        @Override
        public void execute(Runnable runnable0) {
            synchronized(this.a) {
                c c0 = () -> try {
                    runnable0.run();
                }
                finally {
                    this.c();
                };
                this.b.add(c0);
                if(this.d == null) {
                    this.c();
                }
            }
        }
    }

    static class ThreadPerTaskExecutor implements Executor {
        @Override
        public void execute(Runnable runnable0) {
            new Thread(runnable0).start();
        }
    }

    static final boolean a = false;
    static final String b = "AppCompatDelegate";
    static SerialExecutor c = null;
    static final String d = "androidx.appcompat.app.AppLocalesMetadataHolderService";
    public static final int e = -1;
    @Deprecated
    public static final int f = 0;
    @Deprecated
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = -100;
    private static int l = 0;
    private static LocaleListCompat m = null;
    private static LocaleListCompat n = null;
    private static Boolean o = null;
    private static boolean p = false;
    private static final ArraySet q = null;
    private static final Object r = null;
    private static final Object s = null;
    public static final int t = 108;
    public static final int u = 109;
    public static final int v = 10;

    static {
        AppCompatDelegate.c = new SerialExecutor(new ThreadPerTaskExecutor());
        AppCompatDelegate.l = -100;
        AppCompatDelegate.m = null;
        AppCompatDelegate.n = null;
        AppCompatDelegate.o = null;
        AppCompatDelegate.p = false;
        AppCompatDelegate.q = new ArraySet();
        AppCompatDelegate.r = new Object();
        AppCompatDelegate.s = new Object();
    }

    @Nullable
    static LocaleListCompat A() {
        return AppCompatDelegate.m;
    }

    @Nullable
    static LocaleListCompat B() {
        return AppCompatDelegate.n;
    }

    @Nullable
    public abstract ActionBar C();

    public abstract boolean D(int arg1);

    public abstract void E();

    public abstract void F();

    static boolean G(Context context0) {
        if(AppCompatDelegate.o == null) {
            try {
                Bundle bundle0 = AppLocalesMetadataHolderService.a(context0).metaData;
                if(bundle0 != null) {
                    AppCompatDelegate.o = Boolean.valueOf(bundle0.getBoolean("autoStoreLocales"));
                    return AppCompatDelegate.o.booleanValue();
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                AppCompatDelegate.o = Boolean.FALSE;
                return AppCompatDelegate.o.booleanValue();
            }
        }
        return AppCompatDelegate.o.booleanValue();
    }

    // 去混淆评级： 低(20)
    public static boolean H() {
        return false;
    }

    public abstract boolean I();

    // 检测为 Lambda 实现
    private static void K(Context context0) [...]

    public abstract void L(Configuration arg1);

    public abstract void M(Bundle arg1);

    public abstract void N();

    public abstract void O(Bundle arg1);

    public abstract void P();

    public abstract void Q(Bundle arg1);

    public abstract void R();

    public abstract void S();

    static void T(@NonNull AppCompatDelegate appCompatDelegate0) {
        synchronized(AppCompatDelegate.r) {
            AppCompatDelegate.U(appCompatDelegate0);
        }
    }

    private static void U(@NonNull AppCompatDelegate appCompatDelegate0) {
        synchronized(AppCompatDelegate.r) {
            Iterator iterator0 = AppCompatDelegate.q.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                AppCompatDelegate appCompatDelegate1 = (AppCompatDelegate)((WeakReference)object1).get();
                if(appCompatDelegate1 == appCompatDelegate0 || appCompatDelegate1 == null) {
                    iterator0.remove();
                }
            }
        }
    }

    public abstract boolean V(int arg1);

    @VisibleForTesting
    static void W() {
        AppCompatDelegate.m = null;
        AppCompatDelegate.n = null;
    }

    public static void X(@NonNull LocaleListCompat localeListCompat0) {
        Objects.requireNonNull(localeListCompat0);
        if(Build.VERSION.SDK_INT >= 33) {
            Object object0 = AppCompatDelegate.y();
            if(object0 != null) {
                Api33Impl.b(object0, Api24Impl.a(localeListCompat0.m()));
            }
        }
        else if(!localeListCompat0.equals(AppCompatDelegate.m)) {
            synchronized(AppCompatDelegate.r) {
                AppCompatDelegate.m = localeListCompat0;
                AppCompatDelegate.j();
            }
        }
    }

    public static void Y(boolean z) {
        VectorEnabledTintResources.c(z);
    }

    public abstract void Z(@LayoutRes int arg1);

    public abstract void a0(View arg1);

    public abstract void b0(View arg1, ViewGroup.LayoutParams arg2);

    public static void c0(int v) {
        if(v != -1 && v != 0 && (v != 1 && v != 2 && v != 3)) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if(AppCompatDelegate.l != v) {
            AppCompatDelegate.l = v;
            AppCompatDelegate.i();
        }
    }

    public abstract void d0(boolean arg1);

    static void e(@NonNull AppCompatDelegate appCompatDelegate0) {
        synchronized(AppCompatDelegate.r) {
            AppCompatDelegate.U(appCompatDelegate0);
            WeakReference weakReference0 = new WeakReference(appCompatDelegate0);
            AppCompatDelegate.q.add(weakReference0);
        }
    }

    @VisibleForTesting
    static void e0(boolean z) {
        AppCompatDelegate.o = Boolean.valueOf(z);
    }

    public abstract void f(View arg1, ViewGroup.LayoutParams arg2);

    public abstract void f0(int arg1);

    boolean g() {
        return false;
    }

    @CallSuper
    @RequiresApi(33)
    public void g0(@Nullable OnBackInvokedDispatcher onBackInvokedDispatcher0) {
    }

    public abstract boolean h();

    public abstract void h0(@Nullable Toolbar arg1);

    private static void i() {
        synchronized(AppCompatDelegate.r) {
            for(Object object1: AppCompatDelegate.q) {
                AppCompatDelegate appCompatDelegate0 = (AppCompatDelegate)((WeakReference)object1).get();
                if(appCompatDelegate0 != null) {
                    appCompatDelegate0.h();
                }
            }
        }
    }

    public void i0(@StyleRes int v) {
    }

    private static void j() {
        for(Object object0: AppCompatDelegate.q) {
            AppCompatDelegate appCompatDelegate0 = (AppCompatDelegate)((WeakReference)object0).get();
            if(appCompatDelegate0 != null) {
                appCompatDelegate0.g();
            }
        }
    }

    public abstract void j0(@Nullable CharSequence arg1);

    void k(Context context0) {
        AppCompatDelegate.c.execute(() -> {
            Object object0;
            if(!AppCompatDelegate.G(context0)) {
                return;
            }
            if(Build.VERSION.SDK_INT < 33) {
                object0 = AppCompatDelegate.s;
                synchronized(object0) {
                    LocaleListCompat localeListCompat0 = AppCompatDelegate.m;
                    if(localeListCompat0 == null) {
                        if(AppCompatDelegate.n == null) {
                            AppCompatDelegate.n = LocaleListCompat.c(AppLocalesStorageHelper.b(context0));
                        }
                        if(!AppCompatDelegate.n.j()) {
                            AppCompatDelegate.m = AppCompatDelegate.n;
                            return;
                        }
                        return;
                    }
                    else {
                        goto label_17;
                    }
                    return;
                }
                return;
            label_17:
                if(!localeListCompat0.equals(AppCompatDelegate.n)) {
                    AppCompatDelegate.n = AppCompatDelegate.m;
                    AppLocalesStorageHelper.a(context0, AppCompatDelegate.m.m());
                }
            }
            else if(!AppCompatDelegate.p) {
                AppCompatDelegate.c.execute(() -> {
                    AppCompatDelegate.l0(context0);
                    AppCompatDelegate.p = true;
                });
            }
        });
    }

    @Nullable
    public abstract ActionMode k0(@NonNull Callback arg1);

    @Deprecated
    public void l(Context context0) {
    }

    static void l0(Context context0) {
        if(Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName0 = new ComponentName(context0, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if(context0.getPackageManager().getComponentEnabledSetting(componentName0) != 1) {
                if(AppCompatDelegate.t().j()) {
                    String s = AppLocalesStorageHelper.b(context0);
                    Object object0 = context0.getSystemService("locale");
                    if(object0 != null) {
                        Api33Impl.b(object0, Api24Impl.a(s));
                    }
                }
                context0.getPackageManager().setComponentEnabledSetting(componentName0, 1, 1);
            }
        }
    }

    @CallSuper
    @NonNull
    public Context m(@NonNull Context context0) {
        return context0;
    }

    // 检测为 Lambda 实现
    static void m0(Context context0) [...]

    @NonNull
    public static AppCompatDelegate n(@NonNull Activity activity0, @Nullable AppCompatCallback appCompatCallback0) {
        return new AppCompatDelegateImpl(activity0, appCompatCallback0);
    }

    @NonNull
    public static AppCompatDelegate o(@NonNull Dialog dialog0, @Nullable AppCompatCallback appCompatCallback0) {
        return new AppCompatDelegateImpl(dialog0, appCompatCallback0);
    }

    @NonNull
    public static AppCompatDelegate p(@NonNull Context context0, @NonNull Activity activity0, @Nullable AppCompatCallback appCompatCallback0) {
        return new AppCompatDelegateImpl(context0, activity0, appCompatCallback0);
    }

    @NonNull
    public static AppCompatDelegate q(@NonNull Context context0, @NonNull Window window0, @Nullable AppCompatCallback appCompatCallback0) {
        return new AppCompatDelegateImpl(context0, window0, appCompatCallback0);
    }

    public abstract View r(@Nullable View arg1, String arg2, @NonNull Context arg3, @NonNull AttributeSet arg4);

    @Nullable
    public abstract View s(@IdRes int arg1);

    @AnyThread
    @NonNull
    public static LocaleListCompat t() {
        if(Build.VERSION.SDK_INT >= 33) {
            Object object0 = AppCompatDelegate.y();
            return object0 == null ? LocaleListCompat.g() : LocaleListCompat.o(Api33Impl.a(object0));
        }
        return AppCompatDelegate.m == null ? LocaleListCompat.g() : AppCompatDelegate.m;
    }

    @Nullable
    public Context u() {
        return null;
    }

    public static int v() [...] // 潜在的解密器

    @Nullable
    public abstract Delegate w();

    public int x() {
        return -100;
    }

    @RequiresApi(33)
    static Object y() {
        for(Object object0: AppCompatDelegate.q) {
            AppCompatDelegate appCompatDelegate0 = (AppCompatDelegate)((WeakReference)object0).get();
            if(appCompatDelegate0 != null) {
                Context context0 = appCompatDelegate0.u();
                if(context0 != null) {
                    return context0.getSystemService("locale");
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public abstract MenuInflater z();
}

