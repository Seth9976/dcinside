package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper.Callback;
import androidx.customview.widget.ViewDragHelper;

public class SwipeDismissBehavior extends Behavior {
    class a extends Callback {
        private int a;
        private int b;
        final SwipeDismissBehavior c;
        private static final int d = -1;

        a() {
            this.b = -1;
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int a(@NonNull View view0, int v, int v1) {
            int v3;
            boolean z = ViewCompat.e0(view0) == 1;
            int v2 = SwipeDismissBehavior.this.g;
            if(v2 == 0) {
                if(z) {
                    return SwipeDismissBehavior.Q(this.a - view0.getWidth(), v, this.a);
                }
                v3 = this.a;
                return SwipeDismissBehavior.Q(v3, v, view0.getWidth() + v3);
            }
            if(v2 == 1) {
                if(z) {
                    v3 = this.a;
                    return SwipeDismissBehavior.Q(v3, v, view0.getWidth() + v3);
                }
                return SwipeDismissBehavior.Q(this.a - view0.getWidth(), v, this.a);
            }
            v3 = this.a - view0.getWidth();
            int v4 = this.a;
            return SwipeDismissBehavior.Q(v3, v, view0.getWidth() + v4);
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int b(@NonNull View view0, int v, int v1) {
            return view0.getTop();
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int d(@NonNull View view0) {
            return view0.getWidth();
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void i(@NonNull View view0, int v) {
            this.b = v;
            this.a = view0.getLeft();
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 != null) {
                SwipeDismissBehavior.this.d = true;
                viewParent0.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.d = false;
            }
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void j(int v) {
            c swipeDismissBehavior$c0 = SwipeDismissBehavior.this.b;
            if(swipeDismissBehavior$c0 != null) {
                swipeDismissBehavior$c0.b(v);
            }
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void k(@NonNull View view0, int v, int v1, int v2, int v3) {
            float f = ((float)view0.getWidth()) * SwipeDismissBehavior.this.i;
            float f1 = ((float)view0.getWidth()) * SwipeDismissBehavior.this.j;
            float f2 = (float)Math.abs(v - this.a);
            if(f2 <= f) {
                view0.setAlpha(1.0f);
                return;
            }
            if(f2 >= f1) {
                view0.setAlpha(0.0f);
                return;
            }
            view0.setAlpha(SwipeDismissBehavior.P(0.0f, 1.0f - (f2 - f) / (f1 - f), 1.0f));
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void l(@NonNull View view0, float f, float f1) {
            boolean z;
            int v3;
            this.b = -1;
            int v = view0.getWidth();
            if(this.n(view0, f)) {
                if(f >= 0.0f) {
                    int v1 = view0.getLeft();
                    int v2 = this.a;
                    v3 = v1 >= v2 ? v2 + v : this.a - v;
                }
                else {
                    v3 = this.a - v;
                }
                z = true;
            }
            else {
                v3 = this.a;
                z = false;
            }
            if(SwipeDismissBehavior.this.a.V(v3, view0.getTop())) {
                ViewCompat.x1(view0, new d(SwipeDismissBehavior.this, view0, z));
                return;
            }
            if(z) {
                c swipeDismissBehavior$c0 = SwipeDismissBehavior.this.b;
                if(swipeDismissBehavior$c0 != null) {
                    swipeDismissBehavior$c0.a(view0);
                }
            }
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public boolean m(View view0, int v) {
            return (this.b == -1 || this.b == v) && SwipeDismissBehavior.this.O(view0);
        }

        private boolean n(@NonNull View view0, float f) {
            int v = Float.compare(f, 0.0f);
            if(v != 0) {
                boolean z = ViewCompat.e0(view0) == 1;
                int v1 = SwipeDismissBehavior.this.g;
                if(v1 == 2) {
                    return true;
                }
                if(v1 == 0) {
                    return z ? f < 0.0f : v > 0;
                }
                if(v1 == 1) {
                    return z ? v > 0 : f < 0.0f;
                }
                return false;
            }
            return Math.abs(view0.getLeft() - this.a) >= Math.round(((float)view0.getWidth()) * SwipeDismissBehavior.this.h);
        }
    }

    public interface c {
        void a(View arg1);

        void b(int arg1);
    }

    class d implements Runnable {
        private final View a;
        private final boolean b;
        final SwipeDismissBehavior c;

        d(View view0, boolean z) {
            this.a = view0;
            this.b = z;
        }

        @Override
        public void run() {
            ViewDragHelper viewDragHelper0 = SwipeDismissBehavior.this.a;
            if(viewDragHelper0 != null && viewDragHelper0.o(true)) {
                ViewCompat.x1(this.a, this);
                return;
            }
            if(this.b) {
                c swipeDismissBehavior$c0 = SwipeDismissBehavior.this.b;
                if(swipeDismissBehavior$c0 != null) {
                    swipeDismissBehavior$c0.a(this.a);
                }
            }
        }
    }

    ViewDragHelper a;
    c b;
    private boolean c;
    private boolean d;
    private float e;
    private boolean f;
    int g;
    float h;
    float i;
    float j;
    private final Callback k;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 2;
    private static final float r = 0.5f;
    private static final float s = 0.0f;
    private static final float t = 0.5f;

    public SwipeDismissBehavior() {
        this.e = 0.0f;
        this.g = 2;
        this.h = 0.5f;
        this.i = 0.0f;
        this.j = 0.5f;
        this.k = new a(this);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean L(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        if(this.a != null) {
            if(!this.d || motionEvent0.getActionMasked() != 3) {
                this.a.M(motionEvent0);
            }
            return true;
        }
        return false;
    }

    public boolean O(@NonNull View view0) {
        return true;
    }

    static float P(float f, float f1, float f2) {
        return Math.min(Math.max(f, f1), f2);
    }

    static int Q(int v, int v1, int v2) {
        return Math.min(Math.max(v, v1), v2);
    }

    private void R(ViewGroup viewGroup0) {
        if(this.a == null) {
            this.a = this.f ? ViewDragHelper.p(viewGroup0, this.e, this.k) : ViewDragHelper.q(viewGroup0, this.k);
        }
    }

    static float S(float f, float f1, float f2) [...] // Inlined contents

    public int T() {
        return this.a == null ? 0 : this.a.F();
    }

    @Nullable
    @VisibleForTesting
    public c U() {
        return this.b;
    }

    public void V(float f) {
        this.h = SwipeDismissBehavior.P(0.0f, f, 1.0f);
    }

    public void W(float f) {
        this.j = SwipeDismissBehavior.P(0.0f, f, 1.0f);
    }

    public void X(@Nullable c swipeDismissBehavior$c0) {
        this.b = swipeDismissBehavior$c0;
    }

    public void Y(float f) {
        this.e = f;
        this.f = true;
    }

    public void Z(float f) {
        this.i = SwipeDismissBehavior.P(0.0f, f, 1.0f);
    }

    public void a0(int v) {
        this.g = v;
    }

    private void b0(View view0) {
        class b implements AccessibilityViewCommand {
            final SwipeDismissBehavior a;

            @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean a(@NonNull View view0, @Nullable CommandArguments accessibilityViewCommand$CommandArguments0) {
                boolean z = false;
                if(SwipeDismissBehavior.this.O(view0)) {
                    if(ViewCompat.e0(view0) == 1) {
                        z = true;
                    }
                    int v = SwipeDismissBehavior.this.g;
                    ViewCompat.k1(view0, ((v != 0 || !z) && (v != 1 || z) ? view0.getWidth() : -view0.getWidth()));
                    view0.setAlpha(0.0f);
                    c swipeDismissBehavior$c0 = SwipeDismissBehavior.this.b;
                    if(swipeDismissBehavior$c0 != null) {
                        swipeDismissBehavior$c0.a(view0);
                    }
                    return true;
                }
                return false;
            }
        }

        ViewCompat.z1(view0, 0x100000);
        if(this.O(view0)) {
            b swipeDismissBehavior$b0 = new b(this);
            ViewCompat.C1(view0, AccessibilityActionCompat.z, null, swipeDismissBehavior$b0);
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean s(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        boolean z = this.c;
        int v = motionEvent0.getActionMasked();
        switch(v) {
            case 0: {
                z = coordinatorLayout0.G(view0, ((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
                this.c = z;
                break;
            }
            case 1: {
                this.c = false;
                break;
            }
            default: {
                if(v == 3) {
                    this.c = false;
                }
            }
        }
        if(z) {
            this.R(coordinatorLayout0);
            return !this.d && this.a.W(motionEvent0);
        }
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean t(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        boolean z = super.t(coordinatorLayout0, view0, v);
        if(ViewCompat.Z(view0) == 0) {
            ViewCompat.b2(view0, 1);
            this.b0(view0);
        }
        return z;
    }
}

