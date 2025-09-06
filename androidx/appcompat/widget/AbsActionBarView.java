package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.styleable;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;

abstract class AbsActionBarView extends ViewGroup {
    public class VisibilityAnimListener implements ViewPropertyAnimatorListener {
        private boolean a;
        int b;
        final AbsActionBarView c;

        protected VisibilityAnimListener() {
            this.a = false;
        }

        @Override  // androidx.core.view.ViewPropertyAnimatorListener
        public void a(View view0) {
            this.a = true;
        }

        @Override  // androidx.core.view.ViewPropertyAnimatorListener
        public void b(View view0) {
            if(this.a) {
                return;
            }
            AbsActionBarView.this.f = null;
            AbsActionBarView.this.super.setVisibility(this.b);
        }

        @Override  // androidx.core.view.ViewPropertyAnimatorListener
        public void c(View view0) {
            AbsActionBarView.this.super.setVisibility(0);
            this.a = false;
        }

        public VisibilityAnimListener d(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0, int v) {
            AbsActionBarView.this.f = viewPropertyAnimatorCompat0;
            this.b = v;
            return this;
        }
    }

    protected final VisibilityAnimListener a;
    protected final Context b;
    protected ActionMenuView c;
    protected ActionMenuPresenter d;
    protected int e;
    protected ViewPropertyAnimatorCompat f;
    private boolean g;
    private boolean h;
    private static final int i = 200;

    AbsActionBarView(@NonNull Context context0) {
        this(context0, null);
    }

    AbsActionBarView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    AbsActionBarView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new VisibilityAnimListener(this);
        TypedValue typedValue0 = new TypedValue();
        if(context0.getTheme().resolveAttribute(attr.actionBarPopupTheme, typedValue0, true) && typedValue0.resourceId != 0) {
            this.b = new ContextThemeWrapper(context0, typedValue0.resourceId);
            return;
        }
        this.b = context0;
    }

    public void c(int v) {
        this.n(v, 200L).y();
    }

    public boolean d() {
        return this.i() && this.getVisibility() == 0;
    }

    public void e() {
        ActionMenuPresenter actionMenuPresenter0 = this.d;
        if(actionMenuPresenter0 != null) {
            actionMenuPresenter0.B();
        }
    }

    public boolean f() {
        return this.d == null ? false : this.d.E();
    }

    public boolean g() {
        return this.d == null ? false : this.d.G();
    }

    public int getAnimatedVisibility() {
        return this.f == null ? this.getVisibility() : this.a.b;
    }

    public int getContentHeight() {
        return this.e;
    }

    public boolean h() {
        return this.d == null ? false : this.d.H();
    }

    public boolean i() {
        return this.d != null && this.d.I();
    }

    protected int j(View view0, int v, int v1, int v2) {
        view0.measure(View.MeasureSpec.makeMeasureSpec(v, 0x80000000), v1);
        return Math.max(0, v - view0.getMeasuredWidth() - v2);
    }

    // 去混淆评级： 低(20)
    protected static int k(int v, int v1, boolean z) {
        return z ? v - v1 : v + v1;
    }

    protected int l(View view0, int v, int v1, int v2, boolean z) {
        int v3 = view0.getMeasuredWidth();
        int v4 = view0.getMeasuredHeight();
        int v5 = v1 + (v2 - v4) / 2;
        if(z) {
            view0.layout(v - v3, v5, v, v4 + v5);
            return -v3;
        }
        view0.layout(v, v5, v + v3, v4 + v5);
        return v3;
    }

    public void m() {
        this.post(() -> (AbsActionBarView.this.d == null ? false : AbsActionBarView.this.d.Q()));

        class androidx.appcompat.widget.AbsActionBarView.1 implements Runnable {
            final AbsActionBarView a;

            @Override
            public void run() {
                AbsActionBarView.this.o();
            }
        }

    }

    public ViewPropertyAnimatorCompat n(int v, long v1) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = this.f;
        if(viewPropertyAnimatorCompat0 != null) {
            viewPropertyAnimatorCompat0.d();
        }
        if(v == 0) {
            if(this.getVisibility() != 0) {
                this.setAlpha(0.0f);
            }
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat1 = ViewCompat.h(this).b(1.0f);
            viewPropertyAnimatorCompat1.s(v1);
            viewPropertyAnimatorCompat1.u(this.a.d(viewPropertyAnimatorCompat1, 0));
            return viewPropertyAnimatorCompat1;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = ViewCompat.h(this).b(0.0f);
        viewPropertyAnimatorCompat2.s(v1);
        viewPropertyAnimatorCompat2.u(this.a.d(viewPropertyAnimatorCompat2, v));
        return viewPropertyAnimatorCompat2;
    }

    // 检测为 Lambda 实现
    public boolean o() [...]

    @Override  // android.view.View
    protected void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(null, styleable.ActionBar, attr.actionBarStyle, 0);
        this.setContentHeight(typedArray0.getLayoutDimension(styleable.ActionBar_height, 0));
        typedArray0.recycle();
        ActionMenuPresenter actionMenuPresenter0 = this.d;
        if(actionMenuPresenter0 != null) {
            actionMenuPresenter0.J(configuration0);
        }
    }

    @Override  // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 9) {
            this.h = false;
        }
        if(!this.h && (v == 9 && !super.onHoverEvent(motionEvent0))) {
            this.h = true;
        }
        if(v == 3 || v == 10) {
            this.h = false;
        }
        return true;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.g = false;
        }
        if(!this.g && (v == 0 && !super.onTouchEvent(motionEvent0))) {
            this.g = true;
        }
        if(v == 1 || v == 3) {
            this.g = false;
        }
        return true;
    }

    public void setContentHeight(int v) {
        this.e = v;
        this.requestLayout();
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        if(v != this.getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = this.f;
            if(viewPropertyAnimatorCompat0 != null) {
                viewPropertyAnimatorCompat0.d();
            }
            super.setVisibility(v);
        }
    }
}

