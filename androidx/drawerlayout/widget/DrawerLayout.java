package androidx.drawerlayout.widget;

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
import android.util.DisplayMetrics;
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
import androidx.core.graphics.Insets;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper.Callback;
import androidx.customview.widget.ViewDragHelper;
import androidx.drawerlayout.R.attr;
import androidx.drawerlayout.R.dimen;
import androidx.drawerlayout.R.styleable;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup implements Openable {
    class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final Rect d;
        final DrawerLayout e;

        AccessibilityDelegate() {
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
            accessibilityEvent0.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            if(DrawerLayout.X8) {
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
            accessibilityNodeInfoCompat0.k1("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfoCompat0.y1(false);
            accessibilityNodeInfoCompat0.z1(false);
            accessibilityNodeInfoCompat0.W0(AccessibilityActionCompat.f);
            accessibilityNodeInfoCompat0.W0(AccessibilityActionCompat.g);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public boolean i(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
            return DrawerLayout.X8 || DrawerLayout.A(view0) ? super.i(viewGroup0, view0, accessibilityEvent0) : false;
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
            accessibilityNodeInfoCompat1.t(this.d);
            accessibilityNodeInfoCompat0.f1(this.d);
            accessibilityNodeInfoCompat0.r2(accessibilityNodeInfoCompat1.N0());
            accessibilityNodeInfoCompat0.P1(accessibilityNodeInfoCompat1.S());
            accessibilityNodeInfoCompat0.k1(accessibilityNodeInfoCompat1.y());
            accessibilityNodeInfoCompat0.p1(accessibilityNodeInfoCompat1.D());
            accessibilityNodeInfoCompat0.v1(accessibilityNodeInfoCompat1.x0());
            accessibilityNodeInfoCompat0.z1(accessibilityNodeInfoCompat1.A0());
            accessibilityNodeInfoCompat0.b1(accessibilityNodeInfoCompat1.p0());
            accessibilityNodeInfoCompat0.a2(accessibilityNodeInfoCompat1.J0());
            accessibilityNodeInfoCompat0.a(accessibilityNodeInfoCompat1.p());
        }
    }

    static final class ChildAccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            super.g(view0, accessibilityNodeInfoCompat0);
            if(!DrawerLayout.A(view0)) {
                accessibilityNodeInfoCompat0.R1(null);
            }
        }
    }

    public interface DrawerListener {
        void c(@NonNull View arg1, float arg2);

        void d(int arg1);

        void onDrawerClosed(@NonNull View arg1);

        void onDrawerOpened(@NonNull View arg1);
    }

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
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, DrawerLayout.W8);
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
        public static final Parcelable.Creator CREATOR;
        int c;
        int d;
        int e;
        int f;
        int g;

        static {
            SavedState.CREATOR = new Parcelable.ClassLoaderCreator() {
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
            };
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

    public static abstract class SimpleDrawerListener implements DrawerListener {
        @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
        public void c(View view0, float f) {
        }

        @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
        public void d(int v) {
        }

        @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
        public void onDrawerClosed(View view0) {
        }

        @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
        public void onDrawerOpened(View view0) {
        }
    }

    class ViewDragCallback extends Callback {
        private final int a;
        private ViewDragHelper b;
        private final Runnable c;
        final DrawerLayout d;

        ViewDragCallback(int v) {
            this.c = () -> {
                int v2;
                View view0;
                int v = ViewDragCallback.this.b.B();
                int v1 = 0;
                boolean z = ViewDragCallback.this.a == 3;
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
                    ViewDragCallback.this.b.X(view0, v2, view0.getTop());
                    drawerLayout$LayoutParams0.c = true;
                    DrawerLayout.this.invalidate();
                    ViewDragCallback.this.n();
                    DrawerLayout.this.b();
                }
            };
            this.a = v;
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int a(View view0, int v, int v1) {
            if(DrawerLayout.this.c(view0, 3)) {
                return Math.max(-view0.getWidth(), Math.min(v, 0));
            }
            int v2 = DrawerLayout.this.getWidth();
            return Math.max(v2 - view0.getWidth(), Math.min(v, v2));
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int b(View view0, int v, int v1) {
            return view0.getTop();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int d(View view0) {
            return DrawerLayout.this.E(view0) ? view0.getWidth() : 0;
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void f(int v, int v1) {
            View view0 = (v & 1) == 1 ? DrawerLayout.this.n(3) : DrawerLayout.this.n(5);
            if(view0 != null && DrawerLayout.this.r(view0) == 0) {
                this.b.d(view0, v1);
            }
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public boolean g(int v) {
            return false;
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void h(int v, int v1) {
            DrawerLayout.this.postDelayed(this.c, 0xA0L);
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void i(View view0, int v) {
            ((LayoutParams)view0.getLayoutParams()).c = false;
            this.n();
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void j(int v) {
            View view0 = this.b.z();
            DrawerLayout.this.b0(v, view0);
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void k(View view0, int v, int v1, int v2, int v3) {
            int v4 = view0.getWidth();
            float f = (DrawerLayout.this.c(view0, 3) ? ((float)(v + v4)) : ((float)(DrawerLayout.this.getWidth() - v))) / ((float)v4);
            DrawerLayout.this.Y(view0, f);
            view0.setVisibility((f == 0.0f ? 4 : 0));
            DrawerLayout.this.invalidate();
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void l(View view0, float f, float f1) {
            int v2;
            float f2 = DrawerLayout.this.u(view0);
            int v = view0.getWidth();
            if(DrawerLayout.this.c(view0, 3)) {
                int v1 = Float.compare(f, 0.0f);
                v2 = v1 > 0 || v1 == 0 && f2 > 0.5f ? 0 : -v;
            }
            else {
                int v3 = DrawerLayout.this.getWidth();
                if(f < 0.0f || f == 0.0f && f2 > 0.5f) {
                    v3 -= v;
                }
                v2 = v3;
            }
            this.b.V(v2, view0.getTop());
            DrawerLayout.this.invalidate();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public boolean m(View view0, int v) {
            return DrawerLayout.this.E(view0) && DrawerLayout.this.c(view0, this.a) && DrawerLayout.this.r(view0) == 0;
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

        public void q(ViewDragHelper viewDragHelper0) {
            this.b = viewDragHelper0;
        }

        class androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback.1 implements Runnable {
            final ViewDragCallback a;

            @Override
            public void run() {
                ViewDragCallback.this.o();
            }
        }

    }

    private CharSequence A;
    private Object B;
    private boolean C;
    private Drawable D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private final ArrayList H;
    private Rect I;
    private Matrix J;
    private final AccessibilityViewCommand K;
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
    private static final int Q8 = 0x99000000;
    private static final int R8 = 0xA0;
    private static final int S8 = 400;
    private static final boolean T8 = false;
    private static final boolean U8 = true;
    private static final float V8 = 1.0f;
    static final int[] W8 = null;
    static final boolean X8 = false;
    private static final boolean Y8 = false;
    private static final String Z8 = "androidx.drawerlayout.widget.DrawerLayout";
    private final ChildAccessibilityDelegate a;
    private static boolean a9;
    private float b;
    private int c;
    private int d;
    private float e;
    private Paint f;
    private final ViewDragHelper g;
    private final ViewDragHelper h;
    private final ViewDragCallback i;
    private final ViewDragCallback j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    @Nullable
    private DrawerListener s;
    private List t;
    private float u;
    private float v;
    private Drawable w;
    private Drawable x;
    private Drawable y;
    private CharSequence z;

    static {
        DrawerLayout.M = new int[]{0x1010434};
        DrawerLayout.W8 = new int[]{0x10100B3};
        boolean z = true;
        DrawerLayout.X8 = true;
        DrawerLayout.Y8 = true;
        if(Build.VERSION.SDK_INT < 29) {
            z = false;
        }
        DrawerLayout.a9 = z;
    }

    public DrawerLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public DrawerLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.drawerLayoutStyle);
    }

    public DrawerLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new ChildAccessibilityDelegate();
        this.d = 0x99000000;
        this.f = new Paint();
        this.m = true;
        this.n = 3;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.K = new AccessibilityViewCommand() {
            final DrawerLayout a;

            @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean a(@NonNull View view0, @Nullable CommandArguments accessibilityViewCommand$CommandArguments0) {
                if(DrawerLayout.this.D(view0) && DrawerLayout.this.r(view0) != 2) {
                    DrawerLayout.this.f(view0);
                    return true;
                }
                return false;
            }
        };
        this.setDescendantFocusability(0x40000);
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.c = (int)(64.0f * displayMetrics0.density + 0.5f);
        float f = displayMetrics0.density * 400.0f;
        ViewDragCallback drawerLayout$ViewDragCallback0 = new ViewDragCallback(this, 3);
        this.i = drawerLayout$ViewDragCallback0;
        ViewDragCallback drawerLayout$ViewDragCallback1 = new ViewDragCallback(this, 5);
        this.j = drawerLayout$ViewDragCallback1;
        ViewDragHelper viewDragHelper0 = ViewDragHelper.p(this, 1.0f, drawerLayout$ViewDragCallback0);
        this.g = viewDragHelper0;
        viewDragHelper0.T(1);
        viewDragHelper0.U(f);
        drawerLayout$ViewDragCallback0.q(viewDragHelper0);
        ViewDragHelper viewDragHelper1 = ViewDragHelper.p(this, 1.0f, drawerLayout$ViewDragCallback1);
        this.h = viewDragHelper1;
        viewDragHelper1.T(2);
        viewDragHelper1.U(f);
        drawerLayout$ViewDragCallback1.q(viewDragHelper1);
        this.setFocusableInTouchMode(true);
        ViewCompat.b2(this, 1);
        ViewCompat.J1(this, new AccessibilityDelegate(this));
        this.setMotionEventSplittingEnabled(false);
        if(ViewCompat.Y(this)) {
            this.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                final DrawerLayout a;

                @Override  // android.view.View$OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
                    ((DrawerLayout)view0).S(windowInsets0, windowInsets0.getSystemWindowInsetTop() > 0);
                    return windowInsets0.consumeSystemWindowInsets();
                }
            });
            this.setSystemUiVisibility(0x500);
            TypedArray typedArray0 = context0.obtainStyledAttributes(DrawerLayout.M);
            try {
                this.w = typedArray0.getDrawable(0);
            }
            finally {
                typedArray0.recycle();
            }
        }
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, styleable.DrawerLayout, v, 0);
        try {
            this.b = typedArray1.hasValue(styleable.DrawerLayout_elevation) ? typedArray1.getDimension(0, 0.0f) : this.getResources().getDimension(dimen.def_drawer_elevation);
        }
        finally {
            typedArray1.recycle();
        }
        this.H = new ArrayList();
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
        if(!this.E(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return (((LayoutParams)view0.getLayoutParams()).d & 1) == 1;
    }

    boolean E(View view0) {
        int v = GravityCompat.d(((LayoutParams)view0.getLayoutParams()).a, ViewCompat.e0(view0));
        return (v & 3) == 0 ? (v & 5) != 0 : true;
    }

    public boolean F(int v) {
        View view0 = this.n(v);
        return view0 == null ? false : this.G(view0);
    }

    public boolean G(@NonNull View view0) {
        if(!this.E(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return ((LayoutParams)view0.getLayoutParams()).b > 0.0f;
    }

    private boolean H(float f, float f1, View view0) {
        if(this.I == null) {
            this.I = new Rect();
        }
        view0.getHitRect(this.I);
        return this.I.contains(((int)f), ((int)f1));
    }

    private void I(Drawable drawable0, int v) {
        if(drawable0 != null && DrawableCompat.h(drawable0)) {
            DrawableCompat.m(drawable0, v);
        }
    }

    void J(View view0, float f) {
        float f1 = this.u(view0);
        float f2 = (float)view0.getWidth();
        view0.offsetLeftAndRight((this.c(view0, 3) ? ((int)(f2 * f)) - ((int)(f1 * f2)) : -(((int)(f2 * f)) - ((int)(f1 * f2)))));
        this.Y(view0, f);
    }

    public void K(int v) {
        this.L(v, true);
    }

    public void L(int v, boolean z) {
        View view0 = this.n(v);
        if(view0 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.w(v));
        }
        this.N(view0, z);
    }

    public void M(@NonNull View view0) {
        this.N(view0, true);
    }

    public void N(@NonNull View view0, boolean z) {
        if(!this.E(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a sliding drawer");
        }
        LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(this.m) {
            drawerLayout$LayoutParams0.b = 1.0f;
            drawerLayout$LayoutParams0.d = 1;
            this.a0(view0, true);
            this.Z(view0);
        }
        else if(z) {
            drawerLayout$LayoutParams0.d |= 2;
            if(this.c(view0, 3)) {
                int v = view0.getTop();
                this.g.X(view0, 0, v);
            }
            else {
                int v1 = this.getWidth();
                int v2 = view0.getWidth();
                int v3 = view0.getTop();
                this.h.X(view0, v1 - v2, v3);
            }
        }
        else {
            this.J(view0, 1.0f);
            this.b0(0, view0);
            view0.setVisibility(0);
        }
        this.invalidate();
    }

    public void O(@NonNull DrawerListener drawerLayout$DrawerListener0) {
        if(drawerLayout$DrawerListener0 == null) {
            return;
        }
        List list0 = this.t;
        if(list0 == null) {
            return;
        }
        list0.remove(drawerLayout$DrawerListener0);
    }

    private Drawable P() {
        int v = ViewCompat.e0(this);
        if(v == 0) {
            Drawable drawable0 = this.D;
            if(drawable0 != null) {
                this.I(drawable0, 0);
                return this.D;
            }
        }
        else {
            Drawable drawable1 = this.E;
            if(drawable1 != null) {
                this.I(drawable1, v);
                return this.E;
            }
        }
        return this.F;
    }

    private Drawable Q() {
        int v = ViewCompat.e0(this);
        if(v == 0) {
            Drawable drawable0 = this.E;
            if(drawable0 != null) {
                this.I(drawable0, 0);
                return this.E;
            }
        }
        else {
            Drawable drawable1 = this.D;
            if(drawable1 != null) {
                this.I(drawable1, v);
                return this.D;
            }
        }
        return this.G;
    }

    private void R() {
        if(DrawerLayout.Y8) {
            return;
        }
        this.x = this.P();
        this.y = this.Q();
    }

    @RestrictTo({Scope.c})
    public void S(Object object0, boolean z) {
        this.B = object0;
        this.C = z;
        this.setWillNotDraw(!z && this.getBackground() == null);
        this.requestLayout();
    }

    public void T(int v, int v1) {
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
                    this.M(view1);
                    return;
                }
                break;
            }
        }
    }

    public void U(int v, @NonNull View view0) {
        if(!this.E(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer with appropriate layout_gravity");
        }
        this.T(v, ((LayoutParams)view0.getLayoutParams()).a);
    }

    public void V(@DrawableRes int v, int v1) {
        this.W(ContextCompat.getDrawable(this.getContext(), v), v1);
    }

    public void W(Drawable drawable0, int v) {
        if(DrawerLayout.Y8) {
            return;
        }
        if((v & 0x800003) == 0x800003) {
            this.D = drawable0;
            this.R();
            this.invalidate();
            return;
        }
        if((v & 0x800005) == 0x800005) {
            this.E = drawable0;
            this.R();
            this.invalidate();
            return;
        }
        if((v & 3) == 3) {
            this.F = drawable0;
            this.R();
            this.invalidate();
            return;
        }
        if((v & 5) == 5) {
            this.G = drawable0;
            this.R();
            this.invalidate();
        }
    }

    public void X(int v, @Nullable CharSequence charSequence0) {
        int v1 = GravityCompat.d(v, ViewCompat.e0(this));
        if(v1 == 3) {
            this.z = charSequence0;
            return;
        }
        if(v1 == 5) {
            this.A = charSequence0;
        }
    }

    void Y(View view0, float f) {
        LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(f == drawerLayout$LayoutParams0.b) {
            return;
        }
        drawerLayout$LayoutParams0.b = f;
        this.l(view0, f);
    }

    private void Z(View view0) {
        AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0 = AccessibilityActionCompat.z;
        ViewCompat.z1(view0, accessibilityNodeInfoCompat$AccessibilityActionCompat0.b());
        if(this.D(view0) && this.r(view0) != 2) {
            ViewCompat.C1(view0, accessibilityNodeInfoCompat$AccessibilityActionCompat0, null, this.K);
        }
    }

    public void a(@NonNull DrawerListener drawerLayout$DrawerListener0) {
        if(drawerLayout$DrawerListener0 == null) {
            return;
        }
        if(this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(drawerLayout$DrawerListener0);
    }

    private void a0(View view0, boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.getChildAt(v1);
            if((z || this.E(view1)) && (!z || view1 != view0)) {
                ViewCompat.b2(view1, 4);
            }
            else {
                ViewCompat.b2(view1, 1);
            }
        }
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
            if(!this.E(view0)) {
                this.H.add(view0);
            }
            else if(this.D(view0)) {
                view0.addFocusables(arrayList0, v, v1);
                z = true;
            }
        }
        if(!z) {
            int v5 = this.H.size();
            for(int v3 = 0; v3 < v5; ++v3) {
                View view1 = (View)this.H.get(v3);
                if(view1.getVisibility() == 0) {
                    view1.addFocusables(arrayList0, v, v1);
                }
            }
        }
        this.H.clear();
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
        if(this.o() != null || this.E(view0)) {
            ViewCompat.b2(view0, 4);
        }
        else {
            ViewCompat.b2(view0, 1);
        }
        if(!DrawerLayout.X8) {
            ViewCompat.J1(view0, this.a);
        }
    }

    void b() {
        if(!this.r) {
            long v = SystemClock.uptimeMillis();
            MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
            int v1 = this.getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                this.getChildAt(v2).dispatchTouchEvent(motionEvent0);
            }
            motionEvent0.recycle();
            this.r = true;
        }
    }

    void b0(int v, View view0) {
        int v1 = 2;
        int v2 = this.g.F();
        int v3 = this.h.F();
        if(v2 == 1 || v3 == 1) {
            v1 = 1;
        }
        else if(v2 != 2 && v3 != 2) {
            v1 = 0;
        }
        if(view0 != null && v == 0) {
            float f = ((LayoutParams)view0.getLayoutParams()).b;
            if(f == 0.0f) {
                this.j(view0);
            }
            else if(f == 1.0f) {
                this.k(view0);
            }
        }
        if(v1 != this.k) {
            this.k = v1;
            List list0 = this.t;
            if(list0 != null) {
                for(int v4 = list0.size() - 1; v4 >= 0; --v4) {
                    ((DrawerListener)this.t.get(v4)).d(v1);
                }
            }
        }
    }

    boolean c(View view0, int v) {
        return (this.t(view0) & v) == v;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams && super.checkLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // androidx.customview.widget.Openable
    public void close() {
        this.d(0x800003);
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
        if((motionEvent0.getSource() & 2) != 0 && motionEvent0.getAction() != 10 && this.e > 0.0f) {
            int v = this.getChildCount();
            if(v != 0) {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                for(int v1 = v - 1; v1 >= 0; --v1) {
                    View view0 = this.getChildAt(v1);
                    if(this.H(f, f1, view0) && !this.B(view0) && this.m(motionEvent0, view0)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent0);
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
                if(view1 != view0 && view1.getVisibility() == 0 && DrawerLayout.x(view1) && this.E(view1) && view1.getHeight() >= v1) {
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
        if(this.x != null && this.c(view0, 3)) {
            int v10 = this.x.getIntrinsicWidth();
            int v11 = view0.getRight();
            this.x.setBounds(v11, view0.getTop(), v10 + v11, view0.getBottom());
            this.x.setAlpha(((int)(Math.max(0.0f, Math.min(((float)v11) / ((float)this.g.B()), 1.0f)) * 255.0f)));
            this.x.draw(canvas0);
            return z1;
        }
        if(this.y != null && this.c(view0, 5)) {
            int v12 = this.y.getIntrinsicWidth();
            int v13 = view0.getLeft();
            float f1 = Math.max(0.0f, Math.min(((float)(this.getWidth() - v13)) / ((float)this.h.B()), 1.0f));
            this.y.setBounds(v13 - v12, view0.getTop(), v13, view0.getBottom());
            this.y.setAlpha(((int)(f1 * 255.0f)));
            this.y.draw(canvas0);
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
        if(!this.E(view0)) {
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
                this.g.X(view0, -v, v1);
            }
            else {
                int v2 = this.getWidth();
                int v3 = view0.getTop();
                this.h.X(view0, v2, v3);
            }
        }
        else {
            this.J(view0, 0.0f);
            this.b0(0, view0);
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
        return DrawerLayout.Y8 ? this.b : 0.0f;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.w;
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
            if(this.E(view0) && (!z || drawerLayout$LayoutParams0.c)) {
                int v2 = view0.getWidth();
                if(this.c(view0, 3)) {
                    int v3 = view0.getTop();
                    z2 = this.g.X(view0, -v2, v3);
                }
                else {
                    int v4 = this.getWidth();
                    int v5 = view0.getTop();
                    z2 = this.h.X(view0, v4, v5);
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

    @Override  // androidx.customview.widget.Openable
    public boolean isOpen() {
        return this.C(0x800003);
    }

    void j(View view0) {
        LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if((drawerLayout$LayoutParams0.d & 1) == 1) {
            drawerLayout$LayoutParams0.d = 0;
            List list0 = this.t;
            if(list0 != null) {
                for(int v = list0.size() - 1; v >= 0; --v) {
                    ((DrawerListener)this.t.get(v)).onDrawerClosed(view0);
                }
            }
            this.a0(view0, false);
            this.Z(view0);
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
            List list0 = this.t;
            if(list0 != null) {
                for(int v = list0.size() - 1; v >= 0; --v) {
                    ((DrawerListener)this.t.get(v)).onDrawerOpened(view0);
                }
            }
            this.a0(view0, true);
            this.Z(view0);
            if(this.hasWindowFocus()) {
                this.sendAccessibilityEvent(0x20);
            }
        }
    }

    void l(View view0, float f) {
        List list0 = this.t;
        if(list0 != null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                ((DrawerListener)this.t.get(v)).c(view0, f);
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
        if(this.C && this.w != null) {
            int v = this.B == null ? 0 : ((WindowInsets)this.B).getSystemWindowInsetTop();
            if(v > 0) {
                this.w.setBounds(0, 0, this.getWidth(), v);
                this.w.draw(canvas0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        int v = motionEvent0.getActionMasked();
        boolean z = this.g.W(motionEvent0);
        boolean z1 = this.h.W(motionEvent0);
        switch(v) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                this.u = f;
                this.v = f1;
                if(this.e > 0.0f) {
                    View view0 = this.g.v(((int)f), ((int)f1));
                    z2 = view0 == null || !this.B(view0) ? false : true;
                }
                else {
                    z2 = false;
                }
                this.r = false;
                return z || z1 || z2 || this.y() || this.r;
            }
            case 2: {
                if(this.g.f(3)) {
                    this.i.p();
                    this.j.p();
                    return z || z1 || this.y() || this.r;
                }
                return z || z1 || this.y() || this.r;
            }
            case 1: 
            case 3: {
                this.i(true);
                this.r = false;
                return z || z1 || this.y() || this.r;
            }
            default: {
                return z || z1 || this.y() || this.r;
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
                        this.Y(view0, f);
                    }
                    int v16 = drawerLayout$LayoutParams0.b > 0.0f ? 0 : 4;
                    if(view0.getVisibility() != v16) {
                        view0.setVisibility(v16);
                    }
                }
            }
        }
        if(DrawerLayout.a9) {
            WindowInsets windowInsets0 = this.getRootWindowInsets();
            if(windowInsets0 != null) {
                Insets insets0 = WindowInsetsCompat.L(windowInsets0).n();
                this.g.S(Math.max(this.g.A(), insets0.a));
                this.h.S(Math.max(this.h.A(), insets0.c));
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
            if(v2 == 0) {
                v4 = 300;
            }
            if(v3 == 0) {
                v5 = 300;
            }
        }
        this.setMeasuredDimension(v4, v5);
        boolean z = this.B != null && ViewCompat.Y(this);
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
                        WindowInsets windowInsets0 = (WindowInsets)this.B;
                        if(v9 == 3) {
                            windowInsets0 = windowInsets0.replaceSystemWindowInsets(windowInsets0.getSystemWindowInsetLeft(), windowInsets0.getSystemWindowInsetTop(), 0, windowInsets0.getSystemWindowInsetBottom());
                        }
                        else if(v9 == 5) {
                            windowInsets0 = windowInsets0.replaceSystemWindowInsets(0, windowInsets0.getSystemWindowInsetTop(), windowInsets0.getSystemWindowInsetRight(), windowInsets0.getSystemWindowInsetBottom());
                        }
                        view0.dispatchApplyWindowInsets(windowInsets0);
                    }
                    else {
                        WindowInsets windowInsets1 = (WindowInsets)this.B;
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
                    if(!this.E(view0)) {
                        throw new IllegalStateException("Child " + view0 + " at index " + v8 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if(DrawerLayout.Y8) {
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
                this.M(view0);
            }
        }
        int v1 = ((SavedState)parcelable0).d;
        if(v1 != 3) {
            this.T(v1, 3);
        }
        int v2 = ((SavedState)parcelable0).e;
        if(v2 != 3) {
            this.T(v2, 5);
        }
        int v3 = ((SavedState)parcelable0).f;
        if(v3 != 3) {
            this.T(v3, 0x800003);
        }
        int v4 = ((SavedState)parcelable0).g;
        if(v4 != 3) {
            this.T(v4, 0x800005);
        }
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        this.R();
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
        this.g.M(motionEvent0);
        this.h.M(motionEvent0);
        int v = motionEvent0.getAction();
        boolean z = false;
        switch(v & 0xFF) {
            case 0: {
                float f4 = motionEvent0.getX();
                float f5 = motionEvent0.getY();
                this.u = f4;
                this.v = f5;
                this.r = false;
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
                    float f2 = f - this.u;
                    float f3 = f1 - this.v;
                    int v1 = this.g.E();
                    if(f2 * f2 + f3 * f3 < ((float)(v1 * v1))) {
                        View view1 = this.o();
                        if(view1 == null || this.r(view1) == 2) {
                            z = true;
                        }
                    }
                    else {
                        z = true;
                    }
                }
                this.i(z);
                return true;
            label_23:
                if((v & 0xFF) == 3) {
                    this.i(true);
                    this.r = false;
                    return true;
                }
                break;
            }
            default: {
                goto label_23;
            }
        }
        return true;
    }

    @Override  // androidx.customview.widget.Openable
    public void open() {
        this.K(0x800003);
    }

    View p() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(this.E(view0) && this.G(view0)) {
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
        if(!this.E(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return this.q(((LayoutParams)view0.getLayoutParams()).a);
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
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
            return this.z;
        }
        return v1 == 5 ? this.A : null;
    }

    public void setDrawerElevation(float f) {
        this.b = f;
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(this.E(view0)) {
                ViewCompat.X1(view0, this.b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerLayout$DrawerListener0) {
        DrawerListener drawerLayout$DrawerListener1 = this.s;
        if(drawerLayout$DrawerListener1 != null) {
            this.O(drawerLayout$DrawerListener1);
        }
        if(drawerLayout$DrawerListener0 != null) {
            this.a(drawerLayout$DrawerListener0);
        }
        this.s = drawerLayout$DrawerListener0;
    }

    public void setDrawerLockMode(int v) {
        this.T(v, 3);
        this.T(v, 5);
    }

    public void setScrimColor(@ColorInt int v) {
        this.d = v;
        this.invalidate();
    }

    public void setStatusBarBackground(int v) {
        this.w = v == 0 ? null : ContextCompat.getDrawable(this.getContext(), v);
        this.invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable0) {
        this.w = drawable0;
        this.invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int v) {
        this.w = new ColorDrawable(v);
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
            if(this.J == null) {
                this.J = new Matrix();
            }
            matrix0.invert(this.J);
            motionEvent1.transform(this.J);
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

