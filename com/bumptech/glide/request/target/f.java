package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.R.id;
import com.bumptech.glide.request.e;
import com.bumptech.glide.util.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class f implements p {
    @VisibleForTesting
    static final class b {
        static final class a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference a;

            a(@NonNull b f$b0) {
                this.a = new WeakReference(f$b0);
            }

            @Override  // android.view.ViewTreeObserver$OnPreDrawListener
            public boolean onPreDraw() {
                if(Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                b f$b0 = (b)this.a.get();
                if(f$b0 != null) {
                    f$b0.a();
                }
                return true;
            }
        }

        private final View a;
        private final List b;
        boolean c;
        @Nullable
        private a d;
        private static final int e;
        @Nullable
        @VisibleForTesting
        static Integer f;

        b(@NonNull View view0) {
            this.b = new ArrayList();
            this.a = view0;
        }

        void a() {
            if(this.b.isEmpty()) {
                return;
            }
            int v = this.g();
            int v1 = this.f();
            if(!this.i(v, v1)) {
                return;
            }
            this.j(v, v1);
            this.b();
        }

        void b() {
            ViewTreeObserver viewTreeObserver0 = this.a.getViewTreeObserver();
            if(viewTreeObserver0.isAlive()) {
                viewTreeObserver0.removeOnPreDrawListener(this.d);
            }
            this.d = null;
            this.b.clear();
        }

        private static int c(@NonNull Context context0) {
            if(b.f == null) {
                Display display0 = ((WindowManager)m.e(((WindowManager)context0.getSystemService("window")))).getDefaultDisplay();
                Point point0 = new Point();
                display0.getSize(point0);
                b.f = Math.max(point0.x, point0.y);
            }
            return (int)b.f;
        }

        void d(@NonNull o o0) {
            int v = this.g();
            int v1 = this.f();
            if(this.i(v, v1)) {
                o0.d(v, v1);
                return;
            }
            if(!this.b.contains(o0)) {
                this.b.add(o0);
            }
            if(this.d == null) {
                ViewTreeObserver viewTreeObserver0 = this.a.getViewTreeObserver();
                a f$b$a0 = new a(this);
                this.d = f$b$a0;
                viewTreeObserver0.addOnPreDrawListener(f$b$a0);
            }
        }

        private int e(int v, int v1, int v2) {
            int v3 = v1 - v2;
            if(v3 > 0) {
                return v3;
            }
            if(this.c && this.a.isLayoutRequested()) {
                return 0;
            }
            int v4 = v - v2;
            if(v4 > 0) {
                return v4;
            }
            if(!this.a.isLayoutRequested() && v1 == -2) {
                if(Log.isLoggable("CustomViewTarget", 4)) {
                    Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device\'s screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
                }
                return b.c(this.a.getContext());
            }
            return 0;
        }

        private int f() {
            int v = this.a.getPaddingTop();
            int v1 = this.a.getPaddingBottom();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.a.getLayoutParams();
            if(viewGroup$LayoutParams0 != null) {
                int v2 = viewGroup$LayoutParams0.height;
                return this.e(this.a.getHeight(), v2, v + v1);
            }
            return this.e(this.a.getHeight(), 0, v + v1);
        }

        private int g() {
            int v = this.a.getPaddingLeft();
            int v1 = this.a.getPaddingRight();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.a.getLayoutParams();
            if(viewGroup$LayoutParams0 != null) {
                int v2 = viewGroup$LayoutParams0.width;
                return this.e(this.a.getWidth(), v2, v + v1);
            }
            return this.e(this.a.getWidth(), 0, v + v1);
        }

        private boolean h(int v) {
            return v > 0 || v == 0x80000000;
        }

        // 去混淆评级： 低(20)
        private boolean i(int v, int v1) {
            return this.h(v) && this.h(v1);
        }

        private void j(int v, int v1) {
            for(Object object0: new ArrayList(this.b)) {
                ((o)object0).d(v, v1);
            }
        }

        void k(@NonNull o o0) {
            this.b.remove(o0);
        }
    }

    private final b a;
    protected final View b;
    @Nullable
    private View.OnAttachStateChangeListener c;
    private boolean d;
    private boolean e;
    private static final String f = "CustomViewTarget";
    @IdRes
    private static final int g;

    static {
        f.g = id.glide_custom_view_target_tag;
    }

    public f(@NonNull View view0) {
        this.b = (View)m.e(view0);
        this.a = new b(view0);
    }

    @Override  // com.bumptech.glide.request.target.p
    public final void A(@NonNull o o0) {
        this.a.k(o0);
    }

    @Override  // com.bumptech.glide.request.target.p
    public final void B(@Nullable Drawable drawable0) {
        this.a.b();
        this.f(drawable0);
        if(!this.d) {
            this.e();
        }
    }

    @Override  // com.bumptech.glide.request.target.p
    public final void D(@Nullable Drawable drawable0) {
        this.d();
    }

    @Override  // com.bumptech.glide.request.target.p
    public final void E(@Nullable e e0) {
        this.j(e0);
    }

    @Override  // com.bumptech.glide.request.target.p
    public final void G(@NonNull o o0) {
        this.a.d(o0);
    }

    @NonNull
    public final f a() {
        class com.bumptech.glide.request.target.f.a implements View.OnAttachStateChangeListener {
            final f a;

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                f.this.i();
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                f.this.h();
            }
        }

        if(this.c != null) {
            return this;
        }
        this.c = new com.bumptech.glide.request.target.f.a(this);
        this.d();
        return this;
    }

    @Nullable
    private Object b() {
        return this.b.getTag(f.g);
    }

    @NonNull
    public final View c() {
        return this.b;
    }

    private void d() {
        View.OnAttachStateChangeListener view$OnAttachStateChangeListener0 = this.c;
        if(view$OnAttachStateChangeListener0 != null && !this.e) {
            this.b.addOnAttachStateChangeListener(view$OnAttachStateChangeListener0);
            this.e = true;
        }
    }

    private void e() {
        View.OnAttachStateChangeListener view$OnAttachStateChangeListener0 = this.c;
        if(view$OnAttachStateChangeListener0 != null && this.e) {
            this.b.removeOnAttachStateChangeListener(view$OnAttachStateChangeListener0);
            this.e = false;
        }
    }

    protected abstract void f(@Nullable Drawable arg1);

    protected void g(@Nullable Drawable drawable0) {
    }

    final void h() {
        e e0 = this.z();
        if(e0 != null) {
            this.d = true;
            e0.clear();
            this.d = false;
        }
    }

    final void i() {
        e e0 = this.z();
        if(e0 != null && e0.f()) {
            e0.i();
        }
    }

    private void j(@Nullable Object object0) {
        this.b.setTag(f.g, object0);
    }

    @Deprecated
    public final f k(@IdRes int v) {
        return this;
    }

    @NonNull
    public final f l() {
        this.a.c = true;
        return this;
    }

    @Override  // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override  // com.bumptech.glide.manager.k
    public void onStart() {
    }

    @Override  // com.bumptech.glide.manager.k
    public void onStop() {
    }

    @Override
    public String toString() {
        return "Target for: " + this.b;
    }

    @Override  // com.bumptech.glide.request.target.p
    @Nullable
    public final e z() {
        Object object0 = this.b();
        if(object0 != null) {
            if(!(object0 instanceof e)) {
                throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
            }
            return (e)object0;
        }
        return null;
    }
}

