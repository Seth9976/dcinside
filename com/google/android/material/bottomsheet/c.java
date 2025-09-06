package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.style;
import com.google.android.material.color.v;
import com.google.android.material.internal.M;
import com.google.android.material.shape.k;

public class c extends AppCompatDialog {
    class e extends g {
        final c a;

        @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$g
        public void b(@NonNull View view0, float f) {
        }

        @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$g
        public void c(@NonNull View view0, int v) {
            if(v == 5) {
                c.this.cancel();
            }
        }
    }

    static class f extends g {
        @Nullable
        private final Boolean a;
        @NonNull
        private final WindowInsetsCompat b;
        @Nullable
        private Window c;
        private boolean d;

        private f(@NonNull View view0, @NonNull WindowInsetsCompat windowInsetsCompat0) {
            this.b = windowInsetsCompat0;
            k k0 = BottomSheetBehavior.x0(view0).E0();
            ColorStateList colorStateList0 = k0 == null ? ViewCompat.Q(view0) : k0.z();
            if(colorStateList0 != null) {
                this.a = Boolean.valueOf(v.q(colorStateList0.getDefaultColor()));
                return;
            }
            Integer integer0 = M.j(view0);
            if(integer0 != null) {
                this.a = Boolean.valueOf(v.q(((int)integer0)));
                return;
            }
            this.a = null;
        }

        f(View view0, WindowInsetsCompat windowInsetsCompat0, a c$a0) {
            this(view0, windowInsetsCompat0);
        }

        @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$g
        void a(@NonNull View view0) {
            this.d(view0);
        }

        @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$g
        public void b(@NonNull View view0, float f) {
            this.d(view0);
        }

        @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$g
        public void c(@NonNull View view0, int v) {
            this.d(view0);
        }

        private void d(View view0) {
            if(view0.getTop() < this.b.r()) {
                Window window0 = this.c;
                if(window0 != null) {
                    com.google.android.material.internal.e.g(window0, (this.a == null ? this.d : this.a.booleanValue()));
                }
                view0.setPadding(view0.getPaddingLeft(), this.b.r() - view0.getTop(), view0.getPaddingRight(), view0.getPaddingBottom());
                return;
            }
            if(view0.getTop() != 0) {
                Window window1 = this.c;
                if(window1 != null) {
                    com.google.android.material.internal.e.g(window1, this.d);
                }
                view0.setPadding(view0.getPaddingLeft(), 0, view0.getPaddingRight(), view0.getPaddingBottom());
            }
        }

        void e(@Nullable Window window0) {
            if(this.c == window0) {
                return;
            }
            this.c = window0;
            if(window0 != null) {
                this.d = WindowCompat.a(window0, window0.getDecorView()).f();
            }
        }
    }

    private BottomSheetBehavior f;
    private FrameLayout g;
    private CoordinatorLayout h;
    private FrameLayout i;
    boolean j;
    boolean k;
    private boolean l;
    private boolean m;
    private f n;
    private boolean o;
    @Nullable
    private com.google.android.material.motion.c p;
    @NonNull
    private g q;

    public c(@NonNull Context context0) {
        this(context0, 0);
        this.o = this.getContext().getTheme().obtainStyledAttributes(new int[]{attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public c(@NonNull Context context0, @StyleRes int v) {
        super(context0, c.h(context0, v));
        this.k = true;
        this.l = true;
        this.q = new e(this);
        this.k(1);
        this.o = this.getContext().getTheme().obtainStyledAttributes(new int[]{attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    protected c(@NonNull Context context0, boolean z, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        super(context0, z, dialogInterface$OnCancelListener0);
        this.k = true;
        this.l = true;
        this.q = new e(this);
        this.k(1);
        this.k = z;
        this.o = this.getContext().getTheme().obtainStyledAttributes(new int[]{attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    private View A(int v, @Nullable View view0, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        class a implements OnApplyWindowInsetsListener {
            final c a;

            @Override  // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat a(View view0, WindowInsetsCompat windowInsetsCompat0) {
                if(c.this.n != null) {
                    c.this.f.Y0(c.this.n);
                }
                if(windowInsetsCompat0 != null) {
                    f c$f0 = new f(c.this.i, windowInsetsCompat0, null);
                    c.this.n = c$f0;
                    c.this.n.e(c.this.getWindow());
                    c.this.f.h0(c.this.n);
                }
                return windowInsetsCompat0;
            }
        }


        class b implements View.OnClickListener {
            final c a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(c.this.k && c.this.isShowing() && c.this.y()) {
                    c.this.cancel();
                }
            }
        }


        class com.google.android.material.bottomsheet.c.c extends AccessibilityDelegateCompat {
            final c d;

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void g(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                if(c.this.k) {
                    accessibilityNodeInfoCompat0.a(0x100000);
                    accessibilityNodeInfoCompat0.s1(true);
                    return;
                }
                accessibilityNodeInfoCompat0.s1(false);
            }

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public boolean j(View view0, int v, Bundle bundle0) {
                if(v == 0x100000) {
                    c c0 = c.this;
                    if(c0.k) {
                        c0.cancel();
                        return true;
                    }
                }
                return super.j(view0, v, bundle0);
            }
        }


        class d implements View.OnTouchListener {
            final c a;

            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                return true;
            }
        }

        this.p();
        CoordinatorLayout coordinatorLayout0 = (CoordinatorLayout)this.g.findViewById(id.coordinator);
        if(v != 0 && view0 == null) {
            view0 = this.getLayoutInflater().inflate(v, coordinatorLayout0, false);
        }
        if(this.o) {
            ViewCompat.m2(this.i, new a(this));
        }
        this.i.removeAllViews();
        if(viewGroup$LayoutParams0 == null) {
            this.i.addView(view0);
        }
        else {
            this.i.addView(view0, viewGroup$LayoutParams0);
        }
        coordinatorLayout0.findViewById(id.touch_outside).setOnClickListener(new b(this));
        ViewCompat.J1(this.i, new com.google.android.material.bottomsheet.c.c(this));
        this.i.setOnTouchListener(new d(this));
        return this.g;
    }

    @Override  // android.app.Dialog
    public void cancel() {
        BottomSheetBehavior bottomSheetBehavior0 = this.q();
        if(this.j && bottomSheetBehavior0.getState() != 5) {
            bottomSheetBehavior0.g(5);
            return;
        }
        super.cancel();
    }

    private static int h(@NonNull Context context0, int v) {
        if(v == 0) {
            TypedValue typedValue0 = new TypedValue();
            return context0.getTheme().resolveAttribute(attr.bottomSheetDialogTheme, typedValue0, true) ? typedValue0.resourceId : style.Theme_Design_Light_BottomSheetDialog;
        }
        return v;
    }

    @Override  // android.app.Dialog
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window0 = this.getWindow();
        if(window0 != null) {
            int v = !this.o || Color.alpha(window0.getNavigationBarColor()) >= 0xFF ? 0 : 1;
            FrameLayout frameLayout0 = this.g;
            if(frameLayout0 != null) {
                frameLayout0.setFitsSystemWindows(((boolean)(v ^ 1)));
            }
            CoordinatorLayout coordinatorLayout0 = this.h;
            if(coordinatorLayout0 != null) {
                coordinatorLayout0.setFitsSystemWindows(((boolean)(v ^ 1)));
            }
            WindowCompat.c(window0, ((boolean)(v ^ 1)));
            f c$f0 = this.n;
            if(c$f0 != null) {
                c$f0.e(window0);
            }
        }
        this.z();
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Window window0 = this.getWindow();
        if(window0 != null) {
            int v = Build.VERSION.SDK_INT;
            window0.setStatusBarColor(0);
            window0.addFlags(0x80000000);
            if(v < 23) {
                window0.addFlags(0x4000000);
            }
            window0.setLayout(-1, -1);
        }
    }

    @Override  // android.app.Dialog
    public void onDetachedFromWindow() {
        f c$f0 = this.n;
        if(c$f0 != null) {
            c$f0.e(null);
        }
        com.google.android.material.motion.c c0 = this.p;
        if(c0 != null) {
            c0.f();
        }
    }

    @Override  // androidx.activity.ComponentDialog
    protected void onStart() {
        super.onStart();
        if(this.f != null && this.f.getState() == 5) {
            this.f.g(4);
        }
    }

    private FrameLayout p() {
        if(this.g == null) {
            FrameLayout frameLayout0 = (FrameLayout)View.inflate(this.getContext(), layout.design_bottom_sheet_dialog, null);
            this.g = frameLayout0;
            this.h = (CoordinatorLayout)frameLayout0.findViewById(id.coordinator);
            FrameLayout frameLayout1 = (FrameLayout)this.g.findViewById(id.design_bottom_sheet);
            this.i = frameLayout1;
            BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.x0(frameLayout1);
            this.f = bottomSheetBehavior0;
            bottomSheetBehavior0.h0(this.q);
            this.f.l1(this.k);
            this.p = new com.google.android.material.motion.c(this.f, this.i);
        }
        return this.g;
    }

    @NonNull
    public BottomSheetBehavior q() {
        if(this.f == null) {
            this.p();
        }
        return this.f;
    }

    @Override  // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if(this.k != z) {
            this.k = z;
            BottomSheetBehavior bottomSheetBehavior0 = this.f;
            if(bottomSheetBehavior0 != null) {
                bottomSheetBehavior0.l1(z);
            }
            if(this.getWindow() != null) {
                this.z();
            }
        }
    }

    @Override  // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if(z && !this.k) {
            this.k = true;
        }
        this.l = z;
        this.m = true;
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setContentView(@LayoutRes int v) {
        super.setContentView(this.A(v, null, null));
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setContentView(View view0) {
        super.setContentView(this.A(0, view0, null));
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setContentView(this.A(0, view0, viewGroup$LayoutParams0));
    }

    public boolean t() {
        return this.j;
    }

    public boolean u() {
        return this.o;
    }

    void v() {
        this.f.Y0(this.q);
    }

    public void w(boolean z) {
        this.j = z;
    }

    @Deprecated
    public static void x(@NonNull View view0, boolean z) {
        if(Build.VERSION.SDK_INT >= 23) {
            int v = view0.getSystemUiVisibility();
            view0.setSystemUiVisibility((z ? v | 0x2000 : v & 0xFFFFDFFF));
        }
    }

    boolean y() {
        if(!this.m) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(new int[]{0x101035B});
            this.l = typedArray0.getBoolean(0, true);
            typedArray0.recycle();
            this.m = true;
        }
        return this.l;
    }

    private void z() {
        com.google.android.material.motion.c c0 = this.p;
        if(c0 == null) {
            return;
        }
        if(this.k) {
            c0.c();
            return;
        }
        c0.f();
    }
}

