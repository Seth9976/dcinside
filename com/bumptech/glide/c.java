package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.resource.bitmap.D;
import com.bumptech.glide.load.resource.bitmap.x;
import com.bumptech.glide.manager.o;
import com.bumptech.glide.request.i;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c implements ComponentCallbacks2 {
    public interface a {
        @NonNull
        i build();
    }

    private final k a;
    private final e b;
    private final j c;
    private final com.bumptech.glide.e d;
    private final b e;
    private final o f;
    private final com.bumptech.glide.manager.c g;
    @GuardedBy("managers")
    private final List h;
    private final a i;
    private h j;
    @GuardedBy("this")
    @Nullable
    private com.bumptech.glide.load.engine.prefill.b k;
    private static final String l = "image_manager_disk_cache";
    private static final String m = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).";
    private static final String n = "Glide";
    @GuardedBy("Glide.class")
    private static volatile c o;
    private static volatile boolean p;

    c(@NonNull Context context0, @NonNull k k0, @NonNull j j0, @NonNull e e0, @NonNull b b0, @NonNull o o0, @NonNull com.bumptech.glide.manager.c c0, int v, @NonNull a c$a0, @NonNull Map map0, @NonNull List list0, @NonNull List list1, @Nullable com.bumptech.glide.module.a a0, @NonNull f f0) {
        this.h = new ArrayList();
        this.j = h.c;
        this.a = k0;
        this.b = e0;
        this.e = b0;
        this.c = j0;
        this.f = o0;
        this.g = c0;
        this.i = c$a0;
        this.d = new com.bumptech.glide.e(context0, b0, l.d(this, list1, a0), new com.bumptech.glide.request.target.k(), c$a0, map0, list0, k0, f0, v);
    }

    private static void A(Exception exception0) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exception0);
    }

    public void B(int v) {
        com.bumptech.glide.util.o.b();
        synchronized(this.h) {
            for(Object object0: this.h) {
                ((n)object0).onTrimMemory(v);
            }
        }
        this.c.b(v);
        this.b.b(v);
        this.e.b(v);
    }

    void C(n n0) {
        synchronized(this.h) {
            if(this.h.contains(n0)) {
                this.h.remove(n0);
                return;
            }
        }
        throw new IllegalStateException("Cannot unregister not yet registered manager");
    }

    @NonNull
    @Deprecated
    public static n D(@NonNull Activity activity0) {
        return c.F(activity0.getApplicationContext());
    }

    @NonNull
    @Deprecated
    public static n E(@NonNull Fragment fragment0) {
        Activity activity0 = fragment0.getActivity();
        m.f(activity0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c.F(activity0.getApplicationContext());
    }

    @NonNull
    public static n F(@NonNull Context context0) {
        return c.p(context0).h(context0);
    }

    @NonNull
    public static n G(@NonNull View view0) {
        return c.p(view0.getContext()).i(view0);
    }

    @NonNull
    public static n H(@NonNull androidx.fragment.app.Fragment fragment0) {
        return c.p(fragment0.getContext()).j(fragment0);
    }

    @NonNull
    public static n I(@NonNull FragmentActivity fragmentActivity0) {
        return c.p(fragmentActivity0).k(fragmentActivity0);
    }

    @GuardedBy("Glide.class")
    @VisibleForTesting
    static void a(@NonNull Context context0, @Nullable GeneratedAppGlideModule generatedAppGlideModule0) {
        if(!c.p) {
            try {
                c.p = true;
                c.s(context0, generatedAppGlideModule0);
                c.p = false;
                return;
            }
            catch(Throwable throwable0) {
                c.p = false;
                throw throwable0;
            }
        }
        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
    }

    public void b() {
        com.bumptech.glide.util.o.a();
        this.a.e();
    }

    public void c() {
        com.bumptech.glide.util.o.b();
        this.c.c();
        this.b.c();
        this.e.c();
    }

    @VisibleForTesting
    public static void d() {
        D.c().i();
    }

    @NonNull
    public static c e(@NonNull Context context0) {
        if(c.o == null) {
            GeneratedAppGlideModule generatedAppGlideModule0 = c.f(context0.getApplicationContext());
            Class class0 = c.class;
            synchronized(class0) {
                if(c.o == null) {
                    c.a(context0, generatedAppGlideModule0);
                }
            }
        }
        return c.o;
    }

    // 去混淆评级： 低(30)
    @Nullable
    private static GeneratedAppGlideModule f(Context context0) {
        return new GeneratedAppGlideModuleImpl(context0.getApplicationContext());
    }

    @NonNull
    public b g() {
        return this.e;
    }

    @NonNull
    public e h() {
        return this.b;
    }

    com.bumptech.glide.manager.c i() {
        return this.g;
    }

    @NonNull
    public Context j() {
        return this.d.getBaseContext();
    }

    @NonNull
    com.bumptech.glide.e k() {
        return this.d;
    }

    @Nullable
    public static File l(@NonNull Context context0) {
        return c.m(context0, "image_manager_disk_cache");
    }

    @Nullable
    public static File m(@NonNull Context context0, @NonNull String s) {
        File file0 = context0.getCacheDir();
        if(file0 != null) {
            File file1 = new File(file0, s);
            return file1.isDirectory() || file1.mkdirs() ? file1 : null;
        }
        if(Log.isLoggable("Glide", 6)) {
            Log.e("Glide", "default disk cache dir is null");
        }
        return null;
    }

    @NonNull
    public com.bumptech.glide.k n() {
        return this.d.i();
    }

    @NonNull
    public o o() {
        return this.f;
    }

    @Override  // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration0) {
    }

    @Override  // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.c();
    }

    @Override  // android.content.ComponentCallbacks2
    public void onTrimMemory(int v) {
        this.B(v);
    }

    @NonNull
    private static o p(@Nullable Context context0) {
        m.f(context0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c.e(context0).o();
    }

    @VisibleForTesting
    public static void q(@NonNull Context context0, @NonNull d d0) {
        GeneratedAppGlideModule generatedAppGlideModule0 = c.f(context0);
        synchronized(c.class) {
            if(c.o != null) {
                c.z();
            }
            c.t(context0, d0, generatedAppGlideModule0);
        }
    }

    @VisibleForTesting
    @Deprecated
    public static void r(c c0) {
        synchronized(c.class) {
            if(c.o != null) {
                c.z();
            }
            c.o = c0;
        }
    }

    @GuardedBy("Glide.class")
    private static void s(@NonNull Context context0, @Nullable GeneratedAppGlideModule generatedAppGlideModule0) {
        c.t(context0, new d(), generatedAppGlideModule0);
    }

    @GuardedBy("Glide.class")
    private static void t(@NonNull Context context0, @NonNull d d0, @Nullable GeneratedAppGlideModule generatedAppGlideModule0) {
        Context context1 = context0.getApplicationContext();
        List list0 = Collections.emptyList();
        if(generatedAppGlideModule0 == null || generatedAppGlideModule0.c()) {
            list0 = new com.bumptech.glide.module.e(context1).b();
        }
        if(generatedAppGlideModule0 != null && !generatedAppGlideModule0.d().isEmpty()) {
            Set set0 = generatedAppGlideModule0.d();
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                com.bumptech.glide.module.c c0 = (com.bumptech.glide.module.c)object0;
                if(set0.contains(c0.getClass())) {
                    if(Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + c0);
                    }
                    iterator0.remove();
                }
            }
        }
        if(Log.isLoggable("Glide", 3)) {
            for(Object object1: list0) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((com.bumptech.glide.module.c)object1).getClass());
            }
        }
        d0.u((generatedAppGlideModule0 == null ? null : generatedAppGlideModule0.e()));
        for(Object object2: list0) {
            ((com.bumptech.glide.module.c)object2).a(context1, d0);
        }
        if(generatedAppGlideModule0 != null) {
            generatedAppGlideModule0.a(context1, d0);
        }
        c c1 = d0.b(context1, list0, generatedAppGlideModule0);
        context1.registerComponentCallbacks(c1);
        c.o = c1;
    }

    @VisibleForTesting
    public static boolean u() {
        synchronized(c.class) {
        }
        return c.o != null;
    }

    public void v(@NonNull com.bumptech.glide.load.engine.prefill.d.a[] arr_d$a) {
        synchronized(this) {
            if(this.k == null) {
                com.bumptech.glide.load.b b0 = (com.bumptech.glide.load.b)this.i.build().K().c(x.g);
                this.k = new com.bumptech.glide.load.engine.prefill.b(this.c, this.b, b0);
            }
            this.k.c(arr_d$a);
        }
    }

    void w(n n0) {
        synchronized(this.h) {
            if(!this.h.contains(n0)) {
                this.h.add(n0);
                return;
            }
        }
        throw new IllegalStateException("Cannot register already registered manager");
    }

    boolean x(@NonNull p p0) {
        synchronized(this.h) {
            for(Object object0: this.h) {
                if(((n)object0).a0(p0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
    }

    @NonNull
    public h y(@NonNull h h0) {
        com.bumptech.glide.util.o.b();
        this.c.d(h0.b());
        this.b.d(h0.b());
        h h1 = this.j;
        this.j = h0;
        return h1;
    }

    @VisibleForTesting
    public static void z() {
        synchronized(c.class) {
            if(c.o != null) {
                c.o.j().getApplicationContext().unregisterComponentCallbacks(c.o);
                c.o.a.m();
            }
            c.o = null;
        }
    }
}

