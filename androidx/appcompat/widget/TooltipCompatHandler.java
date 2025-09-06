package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;

@RestrictTo({Scope.c})
class TooltipCompatHandler implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {
    private final View a;
    private final CharSequence b;
    private final int c;
    private final Runnable d;
    private final Runnable e;
    private int f;
    private int g;
    private TooltipPopup h;
    private boolean i;
    private boolean j;
    private static final String k = "TooltipCompatHandler";
    private static final long l = 2500L;
    private static final long m = 15000L;
    private static final long n = 3000L;
    private static TooltipCompatHandler o;
    private static TooltipCompatHandler p;

    private TooltipCompatHandler(View view0, CharSequence charSequence0) {
        this.d = () -> this.i(false);
        this.e = () -> {
            if(TooltipCompatHandler.p == this) {
                TooltipCompatHandler.p = null;
                TooltipPopup tooltipPopup0 = this.h;
                if(tooltipPopup0 == null) {
                    Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
                }
                else {
                    tooltipPopup0.c();
                    this.h = null;
                    this.c();
                    this.a.removeOnAttachStateChangeListener(this);
                }
            }
            if(TooltipCompatHandler.o == this) {
                TooltipCompatHandler.g(null);
            }
            this.a.removeCallbacks(this.e);
        };
        this.a = view0;
        this.b = charSequence0;
        this.c = ViewConfigurationCompat.g(ViewConfiguration.get(view0.getContext()));
        this.c();
        view0.setOnLongClickListener(this);
        view0.setOnHoverListener(this);
    }

    private void b() {
        this.a.removeCallbacks(this.d);
    }

    private void c() {
        this.j = true;
    }

    // 检测为 Lambda 实现
    void d() [...]

    // 检测为 Lambda 实现
    private void e() [...]

    private void f() {
        long v = (long)ViewConfiguration.getLongPressTimeout();
        this.a.postDelayed(this.d, v);
    }

    private static void g(TooltipCompatHandler tooltipCompatHandler0) {
        TooltipCompatHandler tooltipCompatHandler1 = TooltipCompatHandler.o;
        if(tooltipCompatHandler1 != null) {
            tooltipCompatHandler1.b();
        }
        TooltipCompatHandler.o = tooltipCompatHandler0;
        if(tooltipCompatHandler0 != null) {
            tooltipCompatHandler0.f();
        }
    }

    public static void h(View view0, CharSequence charSequence0) {
        if(TooltipCompatHandler.o != null && TooltipCompatHandler.o.a == view0) {
            TooltipCompatHandler.g(null);
        }
        if(TextUtils.isEmpty(charSequence0)) {
            TooltipCompatHandler tooltipCompatHandler0 = TooltipCompatHandler.p;
            if(tooltipCompatHandler0 != null && tooltipCompatHandler0.a == view0) {
                tooltipCompatHandler0.d();
            }
            view0.setOnLongClickListener(null);
            view0.setLongClickable(false);
            view0.setOnHoverListener(null);
            return;
        }
        new TooltipCompatHandler(view0, charSequence0);
    }

    void i(boolean z) {
        long v2;
        long v1;
        long v;
        if(!this.a.isAttachedToWindow()) {
            return;
        }
        TooltipCompatHandler.g(null);
        TooltipCompatHandler tooltipCompatHandler0 = TooltipCompatHandler.p;
        if(tooltipCompatHandler0 != null) {
            tooltipCompatHandler0.d();
        }
        TooltipCompatHandler.p = this;
        this.i = z;
        TooltipPopup tooltipPopup0 = new TooltipPopup(this.a.getContext());
        this.h = tooltipPopup0;
        tooltipPopup0.e(this.a, this.f, this.g, this.i, this.b);
        this.a.addOnAttachStateChangeListener(this);
        if(this.i) {
            v = 2500L;
        }
        else {
            if((ViewCompat.H0(this.a) & 1) == 1) {
                v1 = (long)ViewConfiguration.getLongPressTimeout();
                v2 = 3000L;
            }
            else {
                v1 = (long)ViewConfiguration.getLongPressTimeout();
                v2 = 15000L;
            }
            v = v2 - v1;
        }
        this.a.removeCallbacks(this.e);
        this.a.postDelayed(this.e, v);
    }

    private boolean j(MotionEvent motionEvent0) {
        int v = (int)motionEvent0.getX();
        int v1 = (int)motionEvent0.getY();
        if(!this.j && Math.abs(v - this.f) <= this.c && Math.abs(v1 - this.g) <= this.c) {
            return false;
        }
        this.f = v;
        this.g = v1;
        this.j = false;
        return true;
    }

    @Override  // android.view.View$OnHoverListener
    public boolean onHover(View view0, MotionEvent motionEvent0) {
        if(this.h != null && this.i) {
            return false;
        }
        AccessibilityManager accessibilityManager0 = (AccessibilityManager)this.a.getContext().getSystemService("accessibility");
        if(accessibilityManager0.isEnabled() && accessibilityManager0.isTouchExplorationEnabled()) {
            return false;
        }
        switch(motionEvent0.getAction()) {
            case 7: {
                if(this.a.isEnabled() && this.h == null && this.j(motionEvent0)) {
                    TooltipCompatHandler.g(this);
                }
                return false;
            }
            case 10: {
                this.c();
                this.d();
                return false;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // android.view.View$OnLongClickListener
    public boolean onLongClick(View view0) {
        this.f = view0.getWidth() / 2;
        this.g = view0.getHeight() / 2;
        this.i(true);
        return true;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view0) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view0) {
        this.d();
    }
}

