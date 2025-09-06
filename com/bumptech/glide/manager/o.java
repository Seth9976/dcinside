package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.c;
import com.bumptech.glide.load.resource.bitmap.D;
import com.bumptech.glide.n;
import com.bumptech.glide.util.m;
import java.util.Collection;
import java.util.Map;

public class o implements Handler.Callback {
    class a implements b {
        a() {
            super();
        }

        @Override  // com.bumptech.glide.manager.o$b
        @NonNull
        public n a(@NonNull c c0, @NonNull j j0, @NonNull p p0, @NonNull Context context0) {
            return new n(c0, j0, p0, context0);
        }
    }

    public interface b {
        @NonNull
        n a(@NonNull c arg1, @NonNull j arg2, @NonNull p arg3, @NonNull Context arg4);
    }

    private volatile n a;
    private final b b;
    private final ArrayMap c;
    private final i d;
    private final l e;
    @VisibleForTesting
    static final String f = "com.bumptech.glide.manager";
    private static final b g;

    static {
        o.g = new a();
    }

    public o(@Nullable b o$b0) {
        this.c = new ArrayMap();
        if(o$b0 == null) {
            o$b0 = o.g;
        }
        this.b = o$b0;
        this.e = new l(o$b0);
        this.d = o.b();
    }

    @TargetApi(17)
    private static void a(@NonNull Activity activity0) {
        if(activity0.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        return D.g && D.f ? new h() : new f();
    }

    @Nullable
    private static Activity c(@NonNull Context context0) {
        if(context0 instanceof Activity) {
            return (Activity)context0;
        }
        return context0 instanceof ContextWrapper ? o.c(((ContextWrapper)context0).getBaseContext()) : null;
    }

    private static void d(@Nullable Collection collection0, @NonNull Map map0) {
        if(collection0 == null) {
            return;
        }
        for(Object object0: collection0) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null && fragment0.getView() != null) {
                map0.put(fragment0.getView(), fragment0);
                o.d(fragment0.getChildFragmentManager().I0(), map0);
            }
        }
    }

    @Nullable
    private Fragment e(@NonNull View view0, @NonNull FragmentActivity fragmentActivity0) {
        this.c.clear();
        o.d(fragmentActivity0.getSupportFragmentManager().I0(), this.c);
        View view1 = fragmentActivity0.findViewById(0x1020002);
        Fragment fragment0 = null;
        while(!view0.equals(view1)) {
            fragment0 = (Fragment)this.c.get(view0);
            if(fragment0 != null || !(view0.getParent() instanceof View)) {
                break;
            }
            view0 = (View)view0.getParent();
        }
        this.c.clear();
        return fragment0;
    }

    @NonNull
    @Deprecated
    public n f(@NonNull Activity activity0) {
        return this.h(activity0.getApplicationContext());
    }

    @TargetApi(17)
    @NonNull
    @Deprecated
    public n g(@NonNull android.app.Fragment fragment0) {
        if(fragment0.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        return this.h(fragment0.getActivity().getApplicationContext());
    }

    @NonNull
    public n h(@NonNull Context context0) {
        if(context0 == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if(com.bumptech.glide.util.o.v() && !(context0 instanceof Application)) {
            if(context0 instanceof FragmentActivity) {
                return this.k(((FragmentActivity)context0));
            }
            return !(context0 instanceof ContextWrapper) || ((ContextWrapper)context0).getBaseContext().getApplicationContext() == null ? this.l(context0) : this.h(((ContextWrapper)context0).getBaseContext());
        }
        return this.l(context0);
    }

    @Override  // android.os.Handler$Callback
    @Deprecated
    public boolean handleMessage(Message message0) {
        return false;
    }

    @NonNull
    public n i(@NonNull View view0) {
        if(com.bumptech.glide.util.o.u()) {
            return this.h(view0.getContext().getApplicationContext());
        }
        m.e(view0);
        m.f(view0.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activity0 = o.c(view0.getContext());
        if(activity0 == null) {
            return this.h(view0.getContext().getApplicationContext());
        }
        if(activity0 instanceof FragmentActivity) {
            Fragment fragment0 = this.e(view0, ((FragmentActivity)activity0));
            return fragment0 == null ? this.k(((FragmentActivity)activity0)) : this.j(fragment0);
        }
        return this.h(view0.getContext().getApplicationContext());
    }

    @NonNull
    public n j(@NonNull Fragment fragment0) {
        m.f(fragment0.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if(com.bumptech.glide.util.o.u()) {
            return this.h(fragment0.getContext().getApplicationContext());
        }
        if(fragment0.getActivity() != null) {
            FragmentActivity fragmentActivity0 = fragment0.getActivity();
            this.d.a(fragmentActivity0);
        }
        FragmentManager fragmentManager0 = fragment0.getChildFragmentManager();
        Context context0 = fragment0.getContext();
        c c0 = c.e(context0.getApplicationContext());
        boolean z = fragment0.isVisible();
        return this.e.b(context0, c0, fragment0.getLifecycle(), fragmentManager0, z);
    }

    @NonNull
    public n k(@NonNull FragmentActivity fragmentActivity0) {
        if(com.bumptech.glide.util.o.u()) {
            return this.h(fragmentActivity0.getApplicationContext());
        }
        o.a(fragmentActivity0);
        this.d.a(fragmentActivity0);
        boolean z = o.m(fragmentActivity0);
        c c0 = c.e(fragmentActivity0.getApplicationContext());
        Lifecycle lifecycle0 = fragmentActivity0.getLifecycle();
        FragmentManager fragmentManager0 = fragmentActivity0.getSupportFragmentManager();
        return this.e.b(fragmentActivity0, c0, lifecycle0, fragmentManager0, z);
    }

    @NonNull
    private n l(@NonNull Context context0) {
        if(this.a == null) {
            synchronized(this) {
                if(this.a == null) {
                    c c0 = c.e(context0.getApplicationContext());
                    com.bumptech.glide.manager.a a0 = new com.bumptech.glide.manager.a();
                    g g0 = new g();
                    Context context1 = context0.getApplicationContext();
                    this.a = this.b.a(c0, a0, g0, context1);
                }
            }
        }
        return this.a;
    }

    private static boolean m(Context context0) {
        Activity activity0 = o.c(context0);
        return activity0 == null || !activity0.isFinishing();
    }
}

