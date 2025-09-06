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
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.R.id;
import com.bumptech.glide.request.e;
import com.bumptech.glide.util.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public abstract class r extends b {
    @VisibleForTesting
    static final class com.bumptech.glide.request.target.r.b {
        static final class a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference a;

            a(@NonNull com.bumptech.glide.request.target.r.b r$b0) {
                this.a = new WeakReference(r$b0);
            }

            @Override  // android.view.ViewTreeObserver$OnPreDrawListener
            public boolean onPreDraw() {
                if(Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                com.bumptech.glide.request.target.r.b r$b0 = (com.bumptech.glide.request.target.r.b)this.a.get();
                if(r$b0 != null) {
                    r$b0.a();
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

        com.bumptech.glide.request.target.r.b(@NonNull View view0) {
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
            if(com.bumptech.glide.request.target.r.b.f == null) {
                Display display0 = ((WindowManager)m.e(((WindowManager)context0.getSystemService("window")))).getDefaultDisplay();
                Point point0 = new Point();
                display0.getSize(point0);
                com.bumptech.glide.request.target.r.b.f = Math.max(point0.x, point0.y);
            }
            return (int)com.bumptech.glide.request.target.r.b.f;
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
                a r$b$a0 = new a(this);
                this.d = r$b$a0;
                viewTreeObserver0.addOnPreDrawListener(r$b$a0);
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
                if(Log.isLoggable("ViewTarget", 4)) {
                    Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device\'s screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
                }
                return com.bumptech.glide.request.target.r.b.c(this.a.getContext());
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

    protected final View b;
    private final com.bumptech.glide.request.target.r.b c;
    @Nullable
    private View.OnAttachStateChangeListener d;
    private boolean e;
    private boolean f;
    private static final String g = "ViewTarget";
    private static boolean h;
    private static int i;

    static {
        r.i = id.glide_custom_view_target_tag;
    }

    public r(@NonNull View view0) {
        this.b = (View)m.e(view0);
        this.c = new com.bumptech.glide.request.target.r.b(view0);
    }

    @Deprecated
    public r(@NonNull View view0, boolean z) {
        this(view0);
        if(z) {
            this.k();
        }
    }

    @Override  // com.bumptech.glide.request.target.p
    @CallSuper
    public void A(@NonNull o o0) {
        this.c.k(o0);
    }

    @Override  // com.bumptech.glide.request.target.b
    @CallSuper
    public void B(@Nullable Drawable drawable0) {
        super.B(drawable0);
        this.c.b();
        if(!this.e) {
            this.f();
        }
    }

    @Override  // com.bumptech.glide.request.target.b
    @CallSuper
    public void D(@Nullable Drawable drawable0) {
        super.D(drawable0);
        this.e();
    }

    @Override  // com.bumptech.glide.request.target.b
    public void E(@Nullable e e0) {
        this.i(e0);
    }

    @Override  // com.bumptech.glide.request.target.p
    @CallSuper
    public void G(@NonNull o o0) {
        this.c.d(o0);
    }

    @NonNull
    public final r c() {
        class com.bumptech.glide.request.target.r.a implements View.OnAttachStateChangeListener {
            final r a;

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                r.this.h();
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                r.this.g();
            }
        }

        if(this.d != null) {
            return this;
        }
        this.d = new com.bumptech.glide.request.target.r.a(this);
        this.e();
        return this;
    }

    @Nullable
    private Object d() {
        return this.b.getTag(r.i);
    }

    private void e() {
        View.OnAttachStateChangeListener view$OnAttachStateChangeListener0 = this.d;
        if(view$OnAttachStateChangeListener0 != null && !this.f) {
            this.b.addOnAttachStateChangeListener(view$OnAttachStateChangeListener0);
            this.f = true;
        }
    }

    private void f() {
        View.OnAttachStateChangeListener view$OnAttachStateChangeListener0 = this.d;
        if(view$OnAttachStateChangeListener0 != null && this.f) {
            this.b.removeOnAttachStateChangeListener(view$OnAttachStateChangeListener0);
            this.f = false;
        }
    }

    void g() {
        e e0 = this.z();
        if(e0 != null) {
            this.e = true;
            e0.clear();
            this.e = false;
        }
    }

    @NonNull
    public View getView() {
        return this.b;
    }

    void h() {
        e e0 = this.z();
        if(e0 != null && e0.f()) {
            e0.i();
        }
    }

    private void i(@Nullable Object object0) {
        r.h = true;
        this.b.setTag(r.i, object0);
    }

    @Deprecated
    public static void j(int v) {
        if(r.h) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        r.i = v;
    }

    @NonNull
    public final r k() {
        this.c.c = true;
        return this;
    }

    @Override
    public String toString() {
        return "Target for: " + this.b;
    }

    @Override  // com.bumptech.glide.request.target.b
    @Nullable
    public e z() {
        Object object0 = this.d();
        if(object0 != null) {
            if(!(object0 instanceof e)) {
                throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
            }
            return (e)object0;
        }
        return null;
    }
}

