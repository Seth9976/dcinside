package com.dcinside.app.post.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat.Builder;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RtlHardcoded", "InlinedApi"})
public class DrawerLayout extends ViewGroup {
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int a;
        float b;
        boolean c;
        int d;
        private static final int e = 1;
        private static final int f = 2;
        private static final int g = 4;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.a = 0;
        }

        public LayoutParams(int v, int v1, int v2) {
            this(v, v1);
            this.a = v2;
        }

        public LayoutParams(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.a = 0;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, DrawerLayout.X8);
            this.a = typedArray0.getInt(0, 0);
            typedArray0.recycle();
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.a = 0;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.a = 0;
        }

        public LayoutParams(@NonNull LayoutParams drawerLayout$LayoutParams0) {
            super(drawerLayout$LayoutParams0);
            this.a = drawerLayout$LayoutParams0.a;
        }
    }

    public static class SavedState extends AbsSavedState {
        class a implements Parcelable.ClassLoaderCreator {
            a() {
                super();
            }

            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0, null);
            }

            public SavedState b(Parcel parcel0, ClassLoader classLoader0) {
                return new SavedState(parcel0, classLoader0);
            }

            public SavedState[] c(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                return this.b(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.c(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        int c;
        int d;
        int e;
        int f;
        int g;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.c = parcel0.readInt();
            this.d = parcel0.readInt();
            this.e = parcel0.readInt();
            this.f = parcel0.readInt();
            this.g = parcel0.readInt();
        }

        public SavedState(@NonNull Parcelable parcelable0) {
            super(parcelable0);
            this.c = 0;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.c);
            parcel0.writeInt(this.d);
            parcel0.writeInt(this.e);
            parcel0.writeInt(this.f);
            parcel0.writeInt(this.g);
        }
    }

    class b extends AccessibilityDelegateCompat {
        private final Rect d;
        final DrawerLayout e;

        b() {
            this.d = new Rect();
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public boolean a(View view0, AccessibilityEvent accessibilityEvent0) {
            if(accessibilityEvent0.getEventType() == 0x20) {
                List list0 = accessibilityEvent0.getText();
                View view1 = DrawerLayout.this.p();
                if(view1 != null) {
                    int v = DrawerLayout.this.t(view1);
                    CharSequence charSequence0 = DrawerLayout.this.s(v);
                    if(charSequence0 != null) {
                        list0.add(charSequence0);
                    }
                }
                return true;
            }
            return super.a(view0, accessibilityEvent0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void f(View view0, AccessibilityEvent accessibilityEvent0) {
            super.f(view0, accessibilityEvent0);
            accessibilityEvent0.setClassName("com.dcinside.app.post.view.DrawerLayout");
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            if(DrawerLayout.Y8) {
                super.g(view0, accessibilityNodeInfoCompat0);
            }
            else {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat1 = AccessibilityNodeInfoCompat.R0(accessibilityNodeInfoCompat0);
                super.g(view0, accessibilityNodeInfoCompat1);
                accessibilityNodeInfoCompat0.c2(view0);
                ViewParent viewParent0 = ViewCompat.q0(view0);
                if(viewParent0 instanceof View) {
                    accessibilityNodeInfoCompat0.R1(((View)viewParent0));
                }
                this.o(accessibilityNodeInfoCompat0, accessibilityNodeInfoCompat1);
                this.n(accessibilityNodeInfoCompat0, ((ViewGroup)view0));
            }
            accessibilityNodeInfoCompat0.k1("com.dcinside.app.post.view.DrawerLayout");
            accessibilityNodeInfoCompat0.y1(false);
            accessibilityNodeInfoCompat0.z1(false);
            accessibilityNodeInfoCompat0.W0(AccessibilityActionCompat.f);
            accessibilityNodeInfoCompat0.W0(AccessibilityActionCompat.g);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public boolean i(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
            return DrawerLayout.Y8 || DrawerLayout.A(view0) ? super.i(viewGroup0, view0, accessibilityEvent0) : false;
        }

        private void n(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, ViewGroup viewGroup0) {
            int v = viewGroup0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = viewGroup0.getChildAt(v1);
                if(DrawerLayout.A(view0)) {
                    accessibilityNodeInfoCompat0.c(view0);
                }
            }
        }

        private void o(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat1) {
            accessibilityNodeInfoCompat1.s(this.d);
            accessibilityNodeInfoCompat0.e1(this.d);
            accessibilityNodeInfoCompat1.t(this.d);
            accessibilityNodeInfoCompat0.f1(this.d);
            accessibilityNodeInfoCompat0.r2(accessibilityNodeInfoCompat1.N0());
            accessibilityNodeInfoCompat0.P1(accessibilityNodeInfoCompat1.S());
            accessibilityNodeInfoCompat0.k1(accessibilityNodeInfoCompat1.y());
            accessibilityNodeInfoCompat0.p1(accessibilityNodeInfoCompat1.D());
            accessibilityNodeInfoCompat0.v1(accessibilityNodeInfoCompat1.x0());
            accessibilityNodeInfoCompat0.l1(accessibilityNodeInfoCompat1.s0());
            accessibilityNodeInfoCompat0.y1(accessibilityNodeInfoCompat1.z0());
            accessibilityNodeInfoCompat0.z1(accessibilityNodeInfoCompat1.A0());
            accessibilityNodeInfoCompat0.b1(accessibilityNodeInfoCompat1.p0());
            accessibilityNodeInfoCompat0.a2(accessibilityNodeInfoCompat1.J0());
            accessibilityNodeInfoCompat0.K1(accessibilityNodeInfoCompat1.E0());
            accessibilityNodeInfoCompat0.a(accessibilityNodeInfoCompat1.p());
        }
    }

    static final class c extends AccessibilityDelegateCompat {
        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            super.g(view0, accessibilityNodeInfoCompat0);
            if(!DrawerLayout.A(view0)) {
                accessibilityNodeInfoCompat0.R1(null);
            }
        }
    }

    public interface d {
        void c(@NonNull View arg1, float arg2);

        void o(int arg1, int arg2);

        void onDrawerClosed(@NonNull View arg1);

        void onDrawerOpened(@NonNull View arg1);
    }

    @Retention(RetentionPolicy.SOURCE)
    @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @interface f {
    }

    public static abstract class g implements d {
        @Override  // com.dcinside.app.post.view.DrawerLayout$d
        public void c(View view0, float f) {
        }

        @Override  // com.dcinside.app.post.view.DrawerLayout$d
        public void o(int v, int v1) {
        }

        @Override  // com.dcinside.app.post.view.DrawerLayout$d
        public void onDrawerClosed(View view0) {
        }

        @Override  // com.dcinside.app.post.view.DrawerLayout$d
        public void onDrawerOpened(View view0) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @interface h {
    }

    class i extends com.dcinside.app.post.view.b.c {
        class com.dcinside.app.post.view.DrawerLayout.i.a implements Runnable {
            final i a;

            @Override
            public void run() {
                i.this.o();
            }
        }

        private final int a;
        private com.dcinside.app.post.view.b b;
        private final Runnable c;
        final DrawerLayout d;

        i(int v) {
            this.c = () -> {
                int v2;
                View view0;
                int v = i.this.b.C();
                int v1 = 0;
                boolean z = i.this.a == 3;
                if(z) {
                    view0 = DrawerLayout.this.n(3);
                    if(view0 != null) {
                        v1 = -view0.getWidth();
                    }
                    v2 = v1 + v;
                }
                else {
                    view0 = DrawerLayout.this.n(5);
                    v2 = DrawerLayout.this.getWidth() - v;
                }
                if(view0 != null && (z && view0.getLeft() < v2 || !z && view0.getLeft() > v2) && DrawerLayout.this.r(view0) == 0) {
                    LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                    i.this.b.a0(view0, v2, view0.getTop());
                    drawerLayout$LayoutParams0.c = true;
                    DrawerLayout.this.invalidate();
                    i.this.n();
                    DrawerLayout.this.b();
                }
            };
            this.a = v;
        }

        @Override  // com.dcinside.app.post.view.b$c
        public int a(View view0, int v, int v1) {
            if(DrawerLayout.this.c(view0, 3)) {
                return Math.max(-view0.getWidth(), Math.min(v, 0));
            }
            int v2 = DrawerLayout.this.getWidth();
            return Math.max(v2 - view0.getWidth(), Math.min(v, v2));
        }

        @Override  // com.dcinside.app.post.view.b$c
        public int b(View view0, int v, int v1) {
            return view0.getTop();
        }

        // 去混淆评级： 低(20)
        @Override  // com.dcinside.app.post.view.b$c
        public int d(View view0) {
            return DrawerLayout.this.G(view0) ? view0.getWidth() : 0;
        }

        @Override  // com.dcinside.app.post.view.b$c
        public void f(int v, int v1) {
            View view0 = (v & 1) == 1 ? DrawerLayout.this.n(3) : DrawerLayout.this.n(5);
            if(view0 != null && DrawerLayout.this.r(view0) == 0) {
                this.b.d(view0, v1);
            }
        }

        @Override  // com.dcinside.app.post.view.b$c
        public boolean g(int v) {
            return false;
        }

        @Override  // com.dcinside.app.post.view.b$c
        public void h(int v, int v1) {
            DrawerLayout.this.postDelayed(this.c, 0xA0L);
        }

        @Override  // com.dcinside.app.post.view.b$c
        public void i(View view0, int v) {
            ((LayoutParams)view0.getLayoutParams()).c = false;
            this.n();
        }

        @Override  // com.dcinside.app.post.view.b$c
        public void j(int v, int v1) {
            View view0 = this.b.z();
            DrawerLayout.this.c0(this.a, v, v1, view0);
        }

        @Override  // com.dcinside.app.post.view.b$c
        public void k(View view0, int v, int v1, int v2, int v3) {
            int v4 = view0.getWidth();
            float f = (DrawerLayout.this.c(view0, 3) ? ((float)(v + v4)) : ((float)(DrawerLayout.this.getWidth() - v))) / ((float)v4);
            DrawerLayout.this.a0(view0, f);
            view0.setVisibility((f == 0.0f ? 4 : 0));
            DrawerLayout.this.invalidate();
        }

        @Override  // com.dcinside.app.post.view.b$c
        public void l(View view0, float f, float f1) {
            float f2 = DrawerLayout.this.u(view0);
            int v = view0.getWidth();
            int v1 = 0;
            boolean z = Math.abs(f) >= Math.abs(f1);
            if(DrawerLayout.this.c(view0, 3)) {
                int v2 = Float.compare(f, 0.0f);
                if(v2 <= 0 && (v2 != 0 || f2 <= 0.5f)) {
                    v1 = -v;
                }
            }
            else {
                int v3 = DrawerLayout.this.getWidth();
                if(!z || f < 0.0f || f == 0.0f && f2 > 0.5f) {
                    v3 -= v;
                }
                v1 = v3;
            }
            this.b.Y(v1, view0.getTop());
            DrawerLayout.this.invalidate();
        }

        // 去混淆评级： 低(20)
        @Override  // com.dcinside.app.post.view.b$c
        public boolean m(View view0, int v) {
            return DrawerLayout.this.G(view0) && DrawerLayout.this.c(view0, this.a) && DrawerLayout.this.r(view0) == 0;
        }

        private void n() {
            View view0 = DrawerLayout.this.n((this.a == 3 ? 5 : 3));
            if(view0 != null) {
                DrawerLayout.this.f(view0);
            }
        }

        // 检测为 Lambda 实现
        void o() [...]

        public void p() {
            DrawerLayout.this.removeCallbacks(this.c);
        }

        public void q(com.dcinside.app.post.view.b b0) {
            this.b = b0;
        }
    }

    private CharSequence A;
    private CharSequence B;
    private Object C;
    private boolean D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private final ArrayList I;
    private Rect J;
    private Matrix K;
    private static final String L = "DrawerLayout";
    private static final int[] M = null;
    public static final int M8 = 1;
    public static final int N = 0;
    public static final int N8 = 2;
    public static final int O = 1;
    public static final int O8 = 3;
    public static final int P = 2;
    private static final int P8 = 0x40;
    public static final int Q = 0;
    private static final int Q8 = 10;
    private static final int R8 = 0x99000000;
    private static final int S8 = 0xA0;
    private static final int T8 = 400;
    private static final boolean U8 = false;
    private static final boolean V8 = true;
    private static final float W8 = 1.0f;
    static final int[] X8;
    static final boolean Y8;
    private static final boolean Z8;
    private final c a;
    private float b;
    private int c;
    private int d;
    private float e;
    private Paint f;
    private final com.dcinside.app.post.view.b g;
    private final com.dcinside.app.post.view.b h;
    private final i i;
    private final i j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    @Nullable
    private d t;
    private List u;
    private float v;
    private float w;
    private Drawable x;
    private Drawable y;
    private Drawable z;

    static {
        DrawerLayout.M = new int[]{0x1010434};
        DrawerLayout.X8 = new int[]{0x10100B3};
        DrawerLayout.Y8 = true;
        DrawerLayout.Z8 = true;
    }

    public DrawerLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public DrawerLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public DrawerLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        class com.dcinside.app.post.view.DrawerLayout.a implements View.OnApplyWindowInsetsListener {
            @Override  // android.view.View$OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
                WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.L(windowInsets0);
                Builder windowInsetsCompat$Builder0 = Build.VERSION.SDK_INT < 29 ? new Builder(windowInsetsCompat0) : new Builder();
                windowInsetsCompat$Builder0.c(0x20F, windowInsetsCompat0.f(0x20F));
                WindowInsets windowInsets1 = windowInsetsCompat$Builder0.a().K();
                ((DrawerLayout)view0).U(windowInsets1, windowInsets1.getSystemWindowInsetTop() > 0);
                return windowInsets1.consumeSystemWindowInsets();
            }
        }

        super(context0, attributeSet0, v);
        this.a = new c();
        this.d = 0x99000000;
        this.f = new Paint();
        this.m = true;
        this.n = 3;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.setDescendantFocusability(0x40000);
        float f = this.getResources().getDisplayMetrics().density;
        this.c = (int)(64.0f * f + 0.5f);
        i drawerLayout$i0 = new i(this, 3);
        this.i = drawerLayout$i0;
        i drawerLayout$i1 = new i(this, 5);
        this.j = drawerLayout$i1;
        com.dcinside.app.post.view.b b0 = com.dcinside.app.post.view.b.p(this, 1.0f, drawerLayout$i0);
        this.g = b0;
        b0.U(1);
        b0.V(400.0f * f);
        drawerLayout$i0.q(b0);
        com.dcinside.app.post.view.b b1 = com.dcinside.app.post.view.b.p(this, 1.0f, drawerLayout$i1);
        this.h = b1;
        b1.U(2);
        b1.V(400.0f * f);
        drawerLayout$i1.q(b1);
        this.setFocusableInTouchMode(true);
        ViewCompat.b2(this, 1);
        ViewCompat.J1(this, new b(this));
        this.setMotionEventSplittingEnabled(false);
        if(ViewCompat.Y(this)) {
            this.setOnApplyWindowInsetsListener(new com.dcinside.app.post.view.DrawerLayout.a(this));
            this.setSystemUiVisibility(0x500);
            TypedArray typedArray0 = context0.obtainStyledAttributes(DrawerLayout.M);
            try {
                this.x = typedArray0.getDrawable(0);
            }
            finally {
                typedArray0.recycle();
            }
        }
        this.b = f * 10.0f;
        this.I = new ArrayList();
    }

    static boolean A(View view0) {
        switch(ViewCompat.Z(view0)) {
            case 2: 
            case 4: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    boolean B(View view0) {
        return ((LayoutParams)view0.getLayoutParams()).a == 0;
    }

    public boolean C(int v) {
        View view0 = this.n(v);
        return view0 == null ? false : this.D(view0);
    }

    public boolean D(@NonNull View view0) {
        if(!this.G(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return (((LayoutParams)view0.getLayoutParams()).d & 5) == 1;
    }

    public boolean E(int v) {
        View view0 = this.n(v);
        return view0 == null ? false : this.F(view0);
    }

    public boolean F(@NonNull View view0) {
        if(!this.G(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return (((LayoutParams)view0.getLayoutParams()).d & 1) == 1;
    }

    boolean G(View view0) {
        int v = GravityCompat.d(((LayoutParams)view0.getLayoutParams()).a, ViewCompat.e0(view0));
        return (v & 3) == 0 ? (v & 5) != 0 : true;
    }

    public boolean H(int v) {
        View view0 = this.n(v);
        return view0 == null ? false : this.I(view0);
    }

    public boolean I(@NonNull View view0) {
        if(!this.G(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return ((LayoutParams)view0.getLayoutParams()).b > 0.0f;
    }

    private boolean J(float f, float f1, View view0) {
        if(this.J == null) {
            this.J = new Rect();
        }
        view0.getHitRect(this.J);
        return this.J.contains(((int)f), ((int)f1));
    }

    private boolean K(Drawable drawable0, int v) {
        if(drawable0 != null && DrawableCompat.h(drawable0)) {
            DrawableCompat.m(drawable0, v);
            return true;
        }
        return false;
    }

    void L(View view0, float f) {
        float f1 = this.u(view0);
        float f2 = (float)view0.getWidth();
        view0.offsetLeftAndRight((this.c(view0, 3) ? ((int)(f2 * f)) - ((int)(f1 * f2)) : -(((int)(f2 * f)) - ((int)(f1 * f2)))));
        this.a0(view0, f);
    }

    public void M(int v) {
        this.N(v, true);
    }

    public void N(int v, boolean z) {
        View view0 = this.n(v);
        if(view0 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.w(v));
        }
        this.P(view0, z);
    }

    public void O(@NonNull View view0) {
        this.P(view0, true);
    }

    public void P(@NonNull View view0, boolean z) {
        if(!this.G(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a sliding drawer");
        }
        LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(this.m) {
            drawerLayout$LayoutParams0.b = 1.0f;
            drawerLayout$LayoutParams0.d = 1;
            this.b0(view0, true);
        }
        else if(z) {
            drawerLayout$LayoutParams0.d |= 2;
            if(this.c(view0, 3)) {
                int v = view0.getTop();
                this.g.a0(view0, 0, v);
            }
            else {
                int v1 = this.getWidth();
                int v2 = view0.getWidth();
                int v3 = view0.getTop();
                this.h.a0(view0, v1 - v2, v3);
            }
        }
        else {
            this.L(view0, 1.0f);
            this.c0(drawerLayout$LayoutParams0.a, 0, 0, view0);
            view0.setVisibility(0);
        }
        this.invalidate();
    }

    public void Q(@NonNull d drawerLayout$d0) {
        if(drawerLayout$d0 == null) {
            return;
        }
        List list0 = this.u;
        if(list0 == null) {
            return;
        }
        list0.remove(drawerLayout$d0);
    }

    private Drawable R() {
        int v = ViewCompat.e0(this);
        if(v == 0) {
            Drawable drawable0 = this.E;
            if(drawable0 != null) {
                this.K(drawable0, 0);
                return this.E;
            }
        }
        else {
            Drawable drawable1 = this.F;
            if(drawable1 != null) {
                this.K(drawable1, v);
                return this.F;
            }
        }
        return this.G;
    }

    private Drawable S() {
        int v = ViewCompat.e0(this);
        if(v == 0) {
            Drawable drawable0 = this.F;
            if(drawable0 != null) {
                this.K(drawable0, 0);
                return this.F;
            }
        }
        else {
            Drawable drawable1 = this.E;
            if(drawable1 != null) {
                this.K(drawable1, v);
                return this.E;
            }
        }
        return this.H;
    }

    private void T() {
        if(DrawerLayout.Z8) {
            return;
        }
        this.y = this.R();
        this.z = this.S();
    }

    @RestrictTo({Scope.b})
    public void U(Object object0, boolean z) {
        this.C = object0;
        this.D = z;
        this.setWillNotDraw(!z && this.getBackground() == null);
        this.requestLayout();
    }

    public void V(int v, int v1) {
        int v2 = GravityCompat.d(v1, ViewCompat.e0(this));
        switch(v1) {
            case 3: {
                this.n = v;
                break;
            }
            case 5: {
                this.o = v;
                break;
            }
            case 0x800003: {
                this.p = v;
                break;
            }
            case 0x800005: {
                this.q = v;
            }
        }
        if(v != 0) {
            (v2 == 3 ? this.g : this.h).c();
        }
        switch(v) {
            case 1: {
                View view0 = this.n(v2);
                if(view0 != null) {
                    this.f(view0);
                    return;
                }
                break;
            }
            case 2: {
                View view1 = this.n(v2);
                if(view1 != null) {
                    this.O(view1);
                    return;
                }
                break;
            }
        }
    }

    public void W(int v, @NonNull View view0) {
        if(!this.G(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer with appropriate layout_gravity");
        }
        this.V(v, ((LayoutParams)view0.getLayoutParams()).a);
    }

    public void X(@DrawableRes int v, int v1) {
        this.Y(ContextCompat.getDrawable(this.getContext(), v), v1);
    }

    public void Y(Drawable drawable0, int v) {
        if(DrawerLayout.Z8) {
            return;
        }
        if((v & 0x800003) == 0x800003) {
            this.E = drawable0;
            this.T();
            this.invalidate();
            return;
        }
        if((v & 0x800005) == 0x800005) {
            this.F = drawable0;
            this.T();
            this.invalidate();
            return;
        }
        if((v & 3) == 3) {
            this.G = drawable0;
            this.T();
            this.invalidate();
            return;
        }
        if((v & 5) == 5) {
            this.H = drawable0;
            this.T();
            this.invalidate();
        }
    }

    public void Z(int v, @Nullable CharSequence charSequence0) {
        int v1 = GravityCompat.d(v, ViewCompat.e0(this));
        if(v1 == 3) {
            this.A = charSequence0;
            return;
        }
        if(v1 == 5) {
            this.B = charSequence0;
        }
    }

    public void a(@NonNull d drawerLayout$d0) {
        if(drawerLayout$d0 == null) {
            return;
        }
        if(this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(drawerLayout$d0);
    }

    void a0(View view0, float f) {
        LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(f == drawerLayout$LayoutParams0.b) {
            return;
        }
        drawerLayout$LayoutParams0.b = f;
        this.l(view0, f);
    }

    @Override  // android.view.ViewGroup
    public void addFocusables(ArrayList arrayList0, int v, int v1) {
        if(this.getDescendantFocusability() == 0x60000) {
            return;
        }
        int v2 = this.getChildCount();
        boolean z = false;
        for(int v4 = 0; v4 < v2; ++v4) {
            View view0 = this.getChildAt(v4);
            if(!this.G(view0)) {
                this.I.add(view0);
            }
            else if(this.F(view0)) {
                view0.addFocusables(arrayList0, v, v1);
                z = true;
            }
        }
        if(!z) {
            int v5 = this.I.size();
            for(int v3 = 0; v3 < v5; ++v3) {
                View view1 = (View)this.I.get(v3);
                if(view1.getVisibility() == 0) {
                    view1.addFocusables(arrayList0, v, v1);
                }
            }
        }
        this.I.clear();
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
        if(this.o() != null || this.G(view0)) {
            ViewCompat.b2(view0, 4);
        }
        else {
            ViewCompat.b2(view0, 1);
        }
        if(!DrawerLayout.Y8) {
            ViewCompat.J1(view0, this.a);
        }
    }

    void b() {
        if(!this.s) {
            long v = SystemClock.uptimeMillis();
            MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
            int v1 = this.getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                this.getChildAt(v2).dispatchTouchEvent(motionEvent0);
            }
            motionEvent0.recycle();
            this.s = true;
        }
    }

    private void b0(View view0, boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.getChildAt(v1);
            if((z || this.G(view1)) && (!z || view1 != view0)) {
                ViewCompat.b2(view1, 4);
            }
            else {
                ViewCompat.b2(view1, 1);
            }
        }
    }

    boolean c(View view0, int v) {
        return (this.t(view0) & v) == v;
    }

    void c0(int v, int v1, int v2, View view0) {
        int v3 = 2;
        int v4 = this.g.G();
        int v5 = this.h.G();
        if(v4 == 1 || v5 == 1) {
            v3 = 1;
        }
        else if(v4 != 2 && v5 != 2) {
            v3 = 0;
        }
        if(view0 != null && v1 == 0) {
            float f = ((LayoutParams)view0.getLayoutParams()).b;
            if(f == 0.0f) {
                this.j(view0);
            }
            else if(f == 1.0f) {
                this.k(view0);
            }
        }
        if(v3 != this.k) {
            this.k = v3;
            List list0 = this.u;
            if(list0 != null) {
                for(int v6 = list0.size() - 1; v6 >= 0; --v6) {
                    ((d)this.u.get(v6)).o(v3, v2);
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams && super.checkLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    public void computeScroll() {
        int v = this.getChildCount();
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            f = Math.max(f, ((LayoutParams)this.getChildAt(v1).getLayoutParams()).b);
        }
        this.e = f;
        if(this.g.o(true) || this.h.o(true)) {
            ViewCompat.v1(this);
        }
    }

    public void d(int v) {
        this.e(v, true);
    }

    @Override  // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent0) {
        if((motionEvent0.getSource() & 2) == 0 || motionEvent0.getAction() == 10 || this.e <= 0.0f) {
            try {
                return super.dispatchGenericMotionEvent(motionEvent0);
            }
            catch(NullPointerException unused_ex) {
            }
        }
        int v = this.getChildCount();
        if(v != 0) {
            float f = motionEvent0.getX();
            float f1 = motionEvent0.getY();
            for(int v1 = v - 1; v1 >= 0; --v1) {
                View view0 = this.getChildAt(v1);
                if(this.J(f, f1, view0) && !this.B(view0) && this.m(motionEvent0, view0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas0, View view0, long v) {
        int v1 = this.getHeight();
        boolean z = this.B(view0);
        int v2 = this.getWidth();
        int v3 = canvas0.save();
        int v4 = 0;
        if(z) {
            int v5 = this.getChildCount();
            int v7 = 0;
            for(int v6 = 0; v6 < v5; ++v6) {
                View view1 = this.getChildAt(v6);
                if(view1 != view0 && view1.getVisibility() == 0 && DrawerLayout.x(view1) && this.G(view1) && view1.getHeight() >= v1) {
                    if(this.c(view1, 3)) {
                        int v8 = view1.getRight();
                        if(v8 > v7) {
                            v7 = v8;
                        }
                    }
                    else {
                        int v9 = view1.getLeft();
                        if(v9 < v2) {
                            v2 = v9;
                        }
                    }
                }
            }
            canvas0.clipRect(v7, 0, v2, this.getHeight());
            v4 = v7;
        }
        boolean z1 = super.drawChild(canvas0, view0, v);
        canvas0.restoreToCount(v3);
        float f = this.e;
        if(f > 0.0f && z) {
            this.f.setColor(this.d & 0xFFFFFF | ((int)(((float)((0xFF000000 & this.d) >>> 24)) * f)) << 24);
            canvas0.drawRect(((float)v4), 0.0f, ((float)v2), ((float)this.getHeight()), this.f);
            return z1;
        }
        if(this.y != null && this.c(view0, 3)) {
            int v10 = this.y.getIntrinsicWidth();
            int v11 = view0.getRight();
            this.y.setBounds(v11, view0.getTop(), v10 + v11, view0.getBottom());
            this.y.setAlpha(((int)(Math.max(0.0f, Math.min(((float)v11) / ((float)this.g.C()), 1.0f)) * 255.0f)));
            this.y.draw(canvas0);
            return z1;
        }
        if(this.z != null && this.c(view0, 5)) {
            int v12 = this.z.getIntrinsicWidth();
            int v13 = view0.getLeft();
            float f1 = Math.max(0.0f, Math.min(((float)(this.getWidth() - v13)) / ((float)this.h.C()), 1.0f));
            this.z.setBounds(v13 - v12, view0.getTop(), v13, view0.getBottom());
            this.z.setAlpha(((int)(f1 * 255.0f)));
            this.z.draw(canvas0);
        }
        return z1;
    }

    public void e(int v, boolean z) {
        View view0 = this.n(v);
        if(view0 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.w(v));
        }
        this.g(view0, z);
    }

    public void f(@NonNull View view0) {
        this.g(view0, true);
    }

    public void g(@NonNull View view0, boolean z) {
        if(!this.G(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a sliding drawer");
        }
        LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(this.m) {
            drawerLayout$LayoutParams0.b = 0.0f;
            drawerLayout$LayoutParams0.d = 0;
        }
        else if(z) {
            drawerLayout$LayoutParams0.d |= 4;
            if(this.c(view0, 3)) {
                int v = view0.getWidth();
                int v1 = view0.getTop();
                this.g.a0(view0, -v, v1);
            }
            else {
                int v2 = this.getWidth();
                int v3 = view0.getTop();
                this.h.a0(view0, v2, v3);
            }
        }
        else {
            this.L(view0, 0.0f);
            this.c0(drawerLayout$LayoutParams0.a, 0, 0, view0);
            view0.setVisibility(4);
        }
        this.invalidate();
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof LayoutParams) {
            return new LayoutParams(((LayoutParams)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    // 去混淆评级： 低(20)
    public float getDrawerElevation() {
        return DrawerLayout.Z8 ? this.b : 0.0f;
    }

    public Object getLastInsets() {
        return this.C;
    }

    public com.dcinside.app.post.view.b getLeftDragger() {
        return this.g;
    }

    public com.dcinside.app.post.view.b getRightDragger() {
        return this.h;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.x;
    }

    public void h() {
        this.i(false);
    }

    void i(boolean z) {
        boolean z2;
        int v = this.getChildCount();
        boolean z1 = false;
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(this.G(view0) && (!z || drawerLayout$LayoutParams0.c)) {
                int v2 = view0.getWidth();
                if(this.c(view0, 3)) {
                    int v3 = view0.getTop();
                    z2 = this.g.a0(view0, -v2, v3);
                }
                else {
                    int v4 = this.getWidth();
                    int v5 = view0.getTop();
                    z2 = this.h.a0(view0, v4, v5);
                }
                z1 |= z2;
                drawerLayout$LayoutParams0.c = false;
            }
        }
        this.i.p();
        this.j.p();
        if(z1) {
            this.invalidate();
        }
    }

    void j(View view0) {
        LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if((drawerLayout$LayoutParams0.d & 1) == 1) {
            drawerLayout$LayoutParams0.d = 0;
            List list0 = this.u;
            if(list0 != null) {
                for(int v = list0.size() - 1; v >= 0; --v) {
                    ((d)this.u.get(v)).onDrawerClosed(view0);
                }
            }
            this.b0(view0, false);
            if(this.hasWindowFocus()) {
                View view1 = this.getRootView();
                if(view1 != null) {
                    view1.sendAccessibilityEvent(0x20);
                }
            }
        }
    }

    void k(View view0) {
        LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if((drawerLayout$LayoutParams0.d & 1) == 0) {
            drawerLayout$LayoutParams0.d = 1;
            List list0 = this.u;
            if(list0 != null) {
                for(int v = list0.size() - 1; v >= 0; --v) {
                    ((d)this.u.get(v)).onDrawerOpened(view0);
                }
            }
            this.b0(view0, true);
            if(this.hasWindowFocus()) {
                this.sendAccessibilityEvent(0x20);
            }
        }
    }

    void l(View view0, float f) {
        List list0 = this.u;
        if(list0 != null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                ((d)this.u.get(v)).c(view0, f);
            }
        }
    }

    private boolean m(MotionEvent motionEvent0, View view0) {
        boolean z;
        if(!view0.getMatrix().isIdentity()) {
            MotionEvent motionEvent1 = this.v(motionEvent0, view0);
            z = view0.dispatchGenericMotionEvent(motionEvent1);
            motionEvent1.recycle();
            return z;
        }
        float f = (float)(this.getScrollX() - view0.getLeft());
        float f1 = (float)(this.getScrollY() - view0.getTop());
        motionEvent0.offsetLocation(f, f1);
        z = view0.dispatchGenericMotionEvent(motionEvent0);
        motionEvent0.offsetLocation(-f, -f1);
        return z;
    }

    View n(int v) {
        int v1 = GravityCompat.d(v, ViewCompat.e0(this));
        int v2 = this.getChildCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            View view0 = this.getChildAt(v3);
            if((this.t(view0) & 7) == (v1 & 7)) {
                return view0;
            }
        }
        return null;
    }

    View o() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if((((LayoutParams)view0.getLayoutParams()).d & 1) == 1) {
                return view0;
            }
        }
        return null;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = true;
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        if(this.D && this.x != null) {
            int v = this.C == null ? 0 : ((WindowInsets)this.C).getSystemWindowInsetTop();
            if(v > 0) {
                this.x.setBounds(0, 0, this.getWidth(), v);
                this.x.draw(canvas0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        int v = motionEvent0.getActionMasked();
        boolean z = this.g.Z(motionEvent0);
        boolean z1 = this.h.Z(motionEvent0);
        switch(v) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                this.v = f;
                this.w = f1;
                if(this.e > 0.0f) {
                    View view0 = this.g.v(((int)f), ((int)f1));
                    z2 = view0 == null || !this.B(view0) ? false : true;
                }
                else {
                    z2 = false;
                }
                this.r = false;
                this.s = false;
                return z || z1 || z2 || this.y() || this.s;
            }
            case 2: {
                if(this.g.f(3)) {
                    this.i.p();
                    this.j.p();
                    return z || z1 || this.y() || this.s;
                }
                return z || z1 || this.y() || this.s;
            }
            case 1: 
            case 3: {
                this.i(true);
                this.r = false;
                this.s = false;
                return z || z1 || this.y() || this.s;
            }
            default: {
                return z || z1 || this.y() || this.s;
            }
        }
    }

    @Override  // android.view.View
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(v == 4 && this.z()) {
            keyEvent0.startTracking();
            return true;
        }
        return super.onKeyDown(v, keyEvent0);
    }

    @Override  // android.view.View
    public boolean onKeyUp(int v, KeyEvent keyEvent0) {
        if(v == 4) {
            View view0 = this.p();
            if(view0 != null && this.r(view0) == 0) {
                this.h();
            }
            return view0 != null;
        }
        return super.onKeyUp(v, keyEvent0);
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        float f;
        int v10;
        this.l = true;
        int v4 = v2 - v;
        int v5 = this.getChildCount();
        for(int v6 = 0; v6 < v5; ++v6) {
            View view0 = this.getChildAt(v6);
            if(view0.getVisibility() != 8) {
                LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(this.B(view0)) {
                    int v7 = drawerLayout$LayoutParams0.leftMargin;
                    view0.layout(v7, drawerLayout$LayoutParams0.topMargin, view0.getMeasuredWidth() + v7, drawerLayout$LayoutParams0.topMargin + view0.getMeasuredHeight());
                }
                else {
                    int v8 = view0.getMeasuredWidth();
                    int v9 = view0.getMeasuredHeight();
                    if(this.c(view0, 3)) {
                        v10 = ((int)(drawerLayout$LayoutParams0.b * ((float)v8))) - v8;
                        f = ((float)(v8 + v10)) / ((float)v8);
                    }
                    else {
                        int v11 = v4 - ((int)(drawerLayout$LayoutParams0.b * ((float)v8)));
                        f = ((float)(v4 - v11)) / ((float)v8);
                        v10 = v11;
                    }
                    boolean z1 = f != drawerLayout$LayoutParams0.b;
                    switch(drawerLayout$LayoutParams0.a & 0x70) {
                        case 16: {
                            int v12 = v3 - v1;
                            int v13 = (v12 - v9) / 2;
                            int v14 = drawerLayout$LayoutParams0.topMargin;
                            if(v13 < v14) {
                                v13 = v14;
                            }
                            else {
                                int v15 = drawerLayout$LayoutParams0.bottomMargin;
                                if(v13 + v9 > v12 - v15) {
                                    v13 = v12 - v15 - v9;
                                }
                            }
                            view0.layout(v10, v13, v8 + v10, v9 + v13);
                            break;
                        }
                        case 80: {
                            view0.layout(v10, v3 - v1 - drawerLayout$LayoutParams0.bottomMargin - view0.getMeasuredHeight(), v8 + v10, v3 - v1 - drawerLayout$LayoutParams0.bottomMargin);
                            break;
                        }
                        default: {
                            view0.layout(v10, drawerLayout$LayoutParams0.topMargin, v8 + v10, v9 + drawerLayout$LayoutParams0.topMargin);
                        }
                    }
                    if(z1) {
                        this.a0(view0, f);
                    }
                    int v16 = drawerLayout$LayoutParams0.b > 0.0f ? 0 : 4;
                    if(view0.getVisibility() != v16) {
                        view0.setVisibility(v16);
                    }
                }
            }
        }
        this.l = false;
        this.m = false;
    }

    @Override  // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getMode(v1);
        int v4 = View.MeasureSpec.getSize(v);
        int v5 = View.MeasureSpec.getSize(v1);
        if(v2 != 0x40000000 || v3 != 0x40000000) {
            if(!this.isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if(v2 != 0x80000000 && v2 == 0) {
                v4 = 300;
            }
            if(v3 != 0x80000000 && v3 == 0) {
                v5 = 300;
            }
        }
        this.setMeasuredDimension(v4, v5);
        boolean z = this.C != null && ViewCompat.Y(this);
        int v6 = ViewCompat.e0(this);
        int v7 = this.getChildCount();
        boolean z1 = false;
        boolean z2 = false;
        for(int v8 = 0; v8 < v7; ++v8) {
            View view0 = this.getChildAt(v8);
            if(view0.getVisibility() != 8) {
                LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(z) {
                    int v9 = GravityCompat.d(drawerLayout$LayoutParams0.a, v6);
                    if(ViewCompat.Y(view0)) {
                        WindowInsets windowInsets0 = (WindowInsets)this.C;
                        if(v9 == 3) {
                            windowInsets0 = windowInsets0.replaceSystemWindowInsets(windowInsets0.getSystemWindowInsetLeft(), windowInsets0.getSystemWindowInsetTop(), 0, windowInsets0.getSystemWindowInsetBottom());
                        }
                        else if(v9 == 5) {
                            windowInsets0 = windowInsets0.replaceSystemWindowInsets(0, windowInsets0.getSystemWindowInsetTop(), windowInsets0.getSystemWindowInsetRight(), windowInsets0.getSystemWindowInsetBottom());
                        }
                        view0.dispatchApplyWindowInsets(windowInsets0);
                    }
                    else {
                        WindowInsets windowInsets1 = (WindowInsets)this.C;
                        if(v9 == 3) {
                            windowInsets1 = windowInsets1.replaceSystemWindowInsets(windowInsets1.getSystemWindowInsetLeft(), windowInsets1.getSystemWindowInsetTop(), 0, windowInsets1.getSystemWindowInsetBottom());
                        }
                        else if(v9 == 5) {
                            windowInsets1 = windowInsets1.replaceSystemWindowInsets(0, windowInsets1.getSystemWindowInsetTop(), windowInsets1.getSystemWindowInsetRight(), windowInsets1.getSystemWindowInsetBottom());
                        }
                        drawerLayout$LayoutParams0.leftMargin = windowInsets1.getSystemWindowInsetLeft();
                        drawerLayout$LayoutParams0.topMargin = windowInsets1.getSystemWindowInsetTop();
                        drawerLayout$LayoutParams0.rightMargin = windowInsets1.getSystemWindowInsetRight();
                        drawerLayout$LayoutParams0.bottomMargin = windowInsets1.getSystemWindowInsetBottom();
                    }
                }
                if(this.B(view0)) {
                    view0.measure(View.MeasureSpec.makeMeasureSpec(v4 - drawerLayout$LayoutParams0.leftMargin - drawerLayout$LayoutParams0.rightMargin, 0x40000000), View.MeasureSpec.makeMeasureSpec(v5 - drawerLayout$LayoutParams0.topMargin - drawerLayout$LayoutParams0.bottomMargin, 0x40000000));
                }
                else {
                    if(!this.G(view0)) {
                        throw new IllegalStateException("Child " + view0 + " at index " + v8 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if(DrawerLayout.Z8) {
                        float f = ViewCompat.V(view0);
                        float f1 = this.b;
                        if(f != f1) {
                            ViewCompat.X1(view0, f1);
                        }
                    }
                    int v10 = this.t(view0) & 7;
                    if(v10 == 3 && z1 || v10 != 3 && z2) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + DrawerLayout.w(v10) + " but this " + "DrawerLayout" + " already has a drawer view along that edge");
                    }
                    if(v10 == 3) {
                        z1 = true;
                    }
                    else {
                        z2 = true;
                    }
                    view0.measure(ViewGroup.getChildMeasureSpec(v, this.c + drawerLayout$LayoutParams0.leftMargin + drawerLayout$LayoutParams0.rightMargin, drawerLayout$LayoutParams0.width), ViewGroup.getChildMeasureSpec(v1, drawerLayout$LayoutParams0.topMargin + drawerLayout$LayoutParams0.bottomMargin, drawerLayout$LayoutParams0.height));
                    continue;
                }
            }
        }
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        int v = ((SavedState)parcelable0).c;
        if(v != 0) {
            View view0 = this.n(v);
            if(view0 != null) {
                this.O(view0);
            }
        }
        int v1 = ((SavedState)parcelable0).d;
        if(v1 != 3) {
            this.V(v1, 3);
        }
        int v2 = ((SavedState)parcelable0).e;
        if(v2 != 3) {
            this.V(v2, 5);
        }
        int v3 = ((SavedState)parcelable0).f;
        if(v3 != 3) {
            this.V(v3, 0x800003);
        }
        int v4 = ((SavedState)parcelable0).g;
        if(v4 != 3) {
            this.V(v4, 0x800005);
        }
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        this.T();
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        int v = this.getChildCount();
        int v1 = 0;
        while(v1 < v) {
            LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)this.getChildAt(v1).getLayoutParams();
            if(drawerLayout$LayoutParams0.d != 1 && drawerLayout$LayoutParams0.d != 2) {
                ++v1;
            }
            else {
                parcelable0.c = drawerLayout$LayoutParams0.a;
                if(true) {
                    break;
                }
            }
        }
        parcelable0.d = this.n;
        parcelable0.e = this.o;
        parcelable0.f = this.p;
        parcelable0.g = this.q;
        return parcelable0;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z;
        this.g.N(motionEvent0);
        this.h.N(motionEvent0);
        int v = motionEvent0.getAction();
        switch(v & 0xFF) {
            case 0: {
                float f4 = motionEvent0.getX();
                float f5 = motionEvent0.getY();
                this.v = f4;
                this.w = f5;
                this.r = false;
                this.s = false;
                break;
            }
            case 1: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                View view0 = this.g.v(((int)f), ((int)f1));
                if(view0 == null || !this.B(view0)) {
                    z = true;
                }
                else {
                    float f2 = f - this.v;
                    float f3 = f1 - this.w;
                    int v1 = this.g.F();
                    if(f2 * f2 + f3 * f3 < ((float)(v1 * v1))) {
                        View view1 = this.o();
                        z = view1 == null || this.r(view1) == 2;
                    }
                    else {
                        z = true;
                    }
                }
                this.i(z);
                this.r = false;
                return true;
            label_25:
                if((v & 0xFF) == 3) {
                    this.i(true);
                    this.r = false;
                    this.s = false;
                    return true;
                }
                break;
            }
            default: {
                goto label_25;
            }
        }
        return true;
    }

    View p() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(this.G(view0) && this.I(view0)) {
                return view0;
            }
        }
        return null;
    }

    public int q(int v) {
        int v1 = ViewCompat.e0(this);
        switch(v) {
            case 3: {
                int v2 = this.n;
                if(v2 != 3) {
                    return v2;
                }
                int v3 = v1 == 0 ? this.p : this.q;
                return v3 == 3 ? 0 : v3;
            }
            case 5: {
                int v4 = this.o;
                if(v4 != 3) {
                    return v4;
                }
                int v5 = v1 == 0 ? this.q : this.p;
                return v5 == 3 ? 0 : v5;
            }
            case 0x800003: {
                int v6 = this.p;
                if(v6 != 3) {
                    return v6;
                }
                int v7 = v1 == 0 ? this.n : this.o;
                return v7 == 3 ? 0 : v7;
            }
            case 0x800005: {
                int v8 = this.q;
                if(v8 != 3) {
                    return v8;
                }
                int v9 = v1 == 0 ? this.o : this.n;
                return v9 == 3 ? 0 : v9;
            }
            default: {
                return 0;
            }
        }
    }

    public int r(@NonNull View view0) {
        if(!this.G(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return this.q(((LayoutParams)view0.getLayoutParams()).a);
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.r = z;
        if(z) {
            this.i(true);
        }
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if(!this.l) {
            super.requestLayout();
        }
    }

    @Nullable
    public CharSequence s(int v) {
        int v1 = GravityCompat.d(v, ViewCompat.e0(this));
        if(v1 == 3) {
            return this.A;
        }
        return v1 == 5 ? this.B : null;
    }

    public void setDrawerElevation(float f) {
        this.b = f;
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(this.G(view0)) {
                ViewCompat.X1(view0, this.b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d drawerLayout$d0) {
        d drawerLayout$d1 = this.t;
        if(drawerLayout$d1 != null) {
            this.Q(drawerLayout$d1);
        }
        if(drawerLayout$d0 != null) {
            this.a(drawerLayout$d0);
        }
        this.t = drawerLayout$d0;
    }

    public void setDrawerLockMode(int v) {
        this.V(v, 3);
        this.V(v, 5);
    }

    public void setScrimColor(@ColorInt int v) {
        this.d = v;
        this.invalidate();
    }

    public void setStatusBarBackground(int v) {
        this.x = v == 0 ? null : ContextCompat.getDrawable(this.getContext(), v);
        this.invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable0) {
        this.x = drawable0;
        this.invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int v) {
        this.x = new ColorDrawable(v);
        this.invalidate();
    }

    int t(View view0) {
        return GravityCompat.d(((LayoutParams)view0.getLayoutParams()).a, ViewCompat.e0(this));
    }

    float u(View view0) {
        return ((LayoutParams)view0.getLayoutParams()).b;
    }

    private MotionEvent v(MotionEvent motionEvent0, View view0) {
        int v = this.getScrollX();
        int v1 = view0.getLeft();
        int v2 = this.getScrollY();
        int v3 = view0.getTop();
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.offsetLocation(((float)(v - v1)), ((float)(v2 - v3)));
        Matrix matrix0 = view0.getMatrix();
        if(!matrix0.isIdentity()) {
            if(this.K == null) {
                this.K = new Matrix();
            }
            matrix0.invert(this.K);
            motionEvent1.transform(this.K);
        }
        return motionEvent1;
    }

    static String w(int v) {
        if((v & 3) == 3) {
            return "LEFT";
        }
        return (v & 5) == 5 ? "RIGHT" : Integer.toHexString(v);
    }

    private static boolean x(View view0) {
        Drawable drawable0 = view0.getBackground();
        return drawable0 != null && drawable0.getOpacity() == -1;
    }

    private boolean y() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((LayoutParams)this.getChildAt(v1).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return this.p() != null;
    }
}

