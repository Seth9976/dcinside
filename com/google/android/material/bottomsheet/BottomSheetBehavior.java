package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper.Callback;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.M;
import com.google.android.material.motion.b;
import com.google.android.material.motion.f;
import com.google.android.material.resources.d;
import com.google.android.material.shape.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior extends Behavior implements b {
    public static class SavedState extends AbsSavedState {
        class a implements Parcelable.ClassLoaderCreator {
            a() {
                super();
            }

            @Nullable
            public SavedState a(@NonNull Parcel parcel0) {
                return new SavedState(parcel0, null);
            }

            @NonNull
            public SavedState b(@NonNull Parcel parcel0, ClassLoader classLoader0) {
                return new SavedState(parcel0, classLoader0);
            }

            @NonNull
            public SavedState[] c(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            @Nullable
            public Object createFromParcel(@NonNull Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            @NonNull
            public Object createFromParcel(@NonNull Parcel parcel0, ClassLoader classLoader0) {
                return this.b(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            @NonNull
            public Object[] newArray(int v) {
                return this.c(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        final int c;
        int d;
        boolean e;
        boolean f;
        boolean g;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(@NonNull Parcel parcel0) {
            this(parcel0, null);
        }

        public SavedState(@NonNull Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.c = parcel0.readInt();
            this.d = parcel0.readInt();
            boolean z = false;
            this.e = parcel0.readInt() == 1;
            this.f = parcel0.readInt() == 1;
            if(parcel0.readInt() == 1) {
                z = true;
            }
            this.g = z;
        }

        @Deprecated
        public SavedState(Parcelable parcelable0, int v) {
            super(parcelable0);
            this.c = v;
        }

        public SavedState(Parcelable parcelable0, @NonNull BottomSheetBehavior bottomSheetBehavior0) {
            super(parcelable0);
            this.c = bottomSheetBehavior0.M;
            this.d = bottomSheetBehavior0.f;
            this.e = bottomSheetBehavior0.b;
            this.f = bottomSheetBehavior0.J;
            this.g = bottomSheetBehavior0.K;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.c);
            parcel0.writeInt(this.d);
            parcel0.writeInt(((int)this.e));
            parcel0.writeInt(((int)this.f));
            parcel0.writeInt(((int)this.g));
        }
    }

    class e extends Callback {
        private long a;
        final BottomSheetBehavior b;

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int a(@NonNull View view0, int v, int v1) {
            return view0.getLeft();
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int b(@NonNull View view0, int v, int v1) {
            return MathUtils.e(v, BottomSheetBehavior.this.A0(), this.e(view0));
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int e(@NonNull View view0) {
            return BottomSheetBehavior.this.p0() ? BottomSheetBehavior.this.N8 : BottomSheetBehavior.this.H;
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void j(int v) {
            if(v == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.v1(1);
            }
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void k(@NonNull View view0, int v, int v1, int v2, int v3) {
            BottomSheetBehavior.this.v0(v1);
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void l(@NonNull View view0, float f, float f1) {
            int v = 6;
            if(f1 >= 0.0f) {
                if(!BottomSheetBehavior.this.J || !BottomSheetBehavior.this.A1(view0, f1)) {
                    if(f1 == 0.0f || Math.abs(f) > Math.abs(f1)) {
                        int v2 = view0.getTop();
                        if(!BottomSheetBehavior.this.b) {
                            BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.this;
                            int v3 = bottomSheetBehavior0.F;
                            if(v2 >= v3) {
                                if(Math.abs(v2 - v3) >= Math.abs(v2 - BottomSheetBehavior.this.H)) {
                                    v = 4;
                                }
                            }
                            else if(v2 < Math.abs(v2 - bottomSheetBehavior0.H)) {
                                v = 3;
                            }
                        }
                        else if(Math.abs(v2 - BottomSheetBehavior.this.E) >= Math.abs(v2 - BottomSheetBehavior.this.H)) {
                            v = 4;
                        }
                        else {
                            v = 3;
                        }
                    }
                    else if(!BottomSheetBehavior.this.b) {
                        int v1 = view0.getTop();
                        if(Math.abs(v1 - BottomSheetBehavior.this.F) >= Math.abs(v1 - BottomSheetBehavior.this.H)) {
                            v = 4;
                        }
                    }
                    else {
                        v = 4;
                    }
                }
                else if(Math.abs(f) < Math.abs(f1) && f1 > ((float)BottomSheetBehavior.this.e) || this.n(view0)) {
                    v = 5;
                }
                else if(BottomSheetBehavior.this.b || Math.abs(view0.getTop() - BottomSheetBehavior.this.A0()) < Math.abs(view0.getTop() - BottomSheetBehavior.this.F)) {
                    v = 3;
                }
            }
            else if(BottomSheetBehavior.this.b) {
                v = 3;
            }
            else if(view0.getTop() <= BottomSheetBehavior.this.F) {
                v = 3;
            }
            BottomSheetBehavior.this.D1(view0, v, true);
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public boolean m(@NonNull View view0, int v) {
            BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.this;
            int v1 = bottomSheetBehavior0.M;
            if(v1 == 1) {
                return false;
            }
            if(bottomSheetBehavior0.W8) {
                return false;
            }
            if(v1 == 3 && bottomSheetBehavior0.U8 == v) {
                View view1 = bottomSheetBehavior0.Q8 == null ? null : ((View)bottomSheetBehavior0.Q8.get());
                if(view1 != null && view1.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.a = System.currentTimeMillis();
            WeakReference weakReference0 = BottomSheetBehavior.this.O8;
            return weakReference0 != null && weakReference0.get() == view0;
        }

        private boolean n(@NonNull View view0) {
            return view0.getTop() > (BottomSheetBehavior.this.N8 + BottomSheetBehavior.this.A0()) / 2;
        }
    }

    public static abstract class g {
        void a(@NonNull View view0) {
        }

        public abstract void b(@NonNull View arg1, float arg2);

        public abstract void c(@NonNull View arg1, int arg2);
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    class k {
        class com.google.android.material.bottomsheet.BottomSheetBehavior.k.a implements Runnable {
            final k a;

            @Override
            public void run() {
                k.this.b = false;
                ViewDragHelper viewDragHelper0 = BottomSheetBehavior.this.O;
                if(viewDragHelper0 != null && viewDragHelper0.o(true)) {
                    k.this.c(k.this.a);
                    return;
                }
                k bottomSheetBehavior$k0 = k.this;
                BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.this;
                if(bottomSheetBehavior0.M == 2) {
                    bottomSheetBehavior0.v1(bottomSheetBehavior$k0.a);
                }
            }
        }

        private int a;
        private boolean b;
        private final Runnable c;
        final BottomSheetBehavior d;

        private k() {
            this.c = new com.google.android.material.bottomsheet.BottomSheetBehavior.k.a(this);
        }

        k(com.google.android.material.bottomsheet.BottomSheetBehavior.a bottomSheetBehavior$a0) {
        }

        void c(int v) {
            WeakReference weakReference0 = BottomSheetBehavior.this.O8;
            if(weakReference0 != null && weakReference0.get() != null) {
                this.a = v;
                if(!this.b) {
                    ViewCompat.x1(((View)BottomSheetBehavior.this.O8.get()), this.c);
                    this.b = true;
                }
            }
        }
    }

    private boolean A;
    private final k B;
    @Nullable
    private ValueAnimator C;
    int D;
    int E;
    int F;
    float G;
    int H;
    float I;
    boolean J;
    private boolean K;
    private boolean L;
    int M;
    int M8;
    int N;
    int N8;
    @Nullable
    ViewDragHelper O;
    @Nullable
    WeakReference O8;
    private boolean P;
    @Nullable
    WeakReference P8;
    private int Q;
    @Nullable
    WeakReference Q8;
    @NonNull
    private final ArrayList R8;
    @Nullable
    private VelocityTracker S8;
    @Nullable
    f T8;
    int U8;
    private int V8;
    boolean W8;
    private boolean X;
    @Nullable
    private Map X8;
    private float Y;
    @VisibleForTesting
    final SparseIntArray Y8;
    private int Z;
    private final Callback Z8;
    private int a;
    public static final int a9 = 1;
    private boolean b;
    public static final int b9 = 2;
    private boolean c;
    public static final int c9 = 3;
    private float d;
    public static final int d9 = 4;
    private int e;
    public static final int e9 = 5;
    private int f;
    public static final int f9 = 6;
    private boolean g;
    public static final int g9 = -1;
    private int h;
    public static final int h9 = 1;
    private int i;
    public static final int i9 = 2;
    private com.google.android.material.shape.k j;
    public static final int j9 = 4;
    @Nullable
    private ColorStateList k;
    public static final int k9 = 8;
    private int l;
    public static final int l9 = -1;
    private int m;
    public static final int m9 = 0;
    private int n;
    private static final String n9 = "BottomSheetBehavior";
    private boolean o;
    @VisibleForTesting
    static final int o9 = 500;
    private boolean p;
    private static final float p9 = 0.5f;
    private boolean q;
    private static final float q9 = 0.1f;
    private boolean r;
    private static final int r9 = 500;
    private boolean s;
    private static final int s9 = -1;
    private boolean t;
    private static final int t9 = 0;
    private boolean u;
    private static final int u9 = -1;
    private boolean v;
    @VisibleForTesting
    static final int v9 = 1;
    private int w;
    private static final int w9;
    private int x;
    private boolean y;
    private p z;

    static {
        BottomSheetBehavior.w9 = style.Widget_Design_BottomSheet_Modal;
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.c = false;
        this.l = -1;
        this.m = -1;
        this.B = new k(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.Y = 0.1f;
        this.R8 = new ArrayList();
        this.V8 = -1;
        this.Y8 = new SparseIntArray();
        this.Z8 = new e(this);
    }

    public BottomSheetBehavior(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = 0;
        this.b = true;
        this.c = false;
        this.l = -1;
        this.m = -1;
        this.B = new k(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.Y = 0.1f;
        this.R8 = new ArrayList();
        this.V8 = -1;
        this.Y8 = new SparseIntArray();
        this.Z8 = new e(this);
        this.i = context0.getResources().getDimensionPixelSize(dimen.mtrl_min_touch_target_size);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.BottomSheetBehavior_Layout);
        if(typedArray0.hasValue(styleable.BottomSheetBehavior_Layout_backgroundTint)) {
            this.k = d.a(context0, typedArray0, 3);
        }
        if(typedArray0.hasValue(styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.z = p.e(context0, attributeSet0, attr.bottomSheetStyle, BottomSheetBehavior.w9).m();
        }
        this.s0(context0);
        this.t0();
        this.I = typedArray0.getDimension(styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if(typedArray0.hasValue(styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.o1(typedArray0.getDimensionPixelSize(0, -1));
        }
        if(typedArray0.hasValue(styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.n1(typedArray0.getDimensionPixelSize(1, -1));
        }
        TypedValue typedValue0 = typedArray0.peekValue(styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if(typedValue0 == null || typedValue0.data != -1) {
            this.p1(typedArray0.getDimensionPixelSize(9, -1));
        }
        else {
            this.p1(-1);
        }
        this.l1(typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.i1(typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        this.h1(typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.u1(typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        this.f1(typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        this.r1(typedArray0.getInt(styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        this.j1(typedArray0.getFloat(styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue typedValue1 = typedArray0.peekValue(styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if(typedValue1 == null || typedValue1.type != 16) {
            this.g1(typedArray0.getDimensionPixelOffset(5, 0));
        }
        else {
            this.g1(typedValue1.data);
        }
        this.t1(typedArray0.getInt(styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.p = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.q = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.r = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.s = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.t = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.u = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.v = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.y = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArray0.recycle();
        this.d = (float)ViewConfiguration.get(context0).getScaledMaximumFlingVelocity();
    }

    public int A0() {
        if(this.b) {
            return this.E;
        }
        return this.s ? Math.max(this.D, 0) : Math.max(this.D, this.x);
    }

    boolean A1(@NonNull View view0, float f) {
        if(this.K) {
            return true;
        }
        if(view0.getTop() < this.H) {
            return false;
        }
        int v = this.m0();
        return Math.abs(((float)view0.getTop()) + f * this.Y - ((float)this.H)) / ((float)v) > 0.5f;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void B(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, int v2, int v3, int v4, @NonNull int[] arr_v) {
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float B0() {
        return this.G;
    }

    @RestrictTo({Scope.b})
    public boolean B1() [...] // Inlined contents

    public float C0() {
        return this.Y;
    }

    @RestrictTo({Scope.b})
    public boolean C1() [...] // Inlined contents

    @RestrictTo({Scope.b})
    public int D0() {
        return this.N;
    }

    private void D1(View view0, int v, boolean z) {
        int v1 = this.M0(v);
        ViewDragHelper viewDragHelper0 = this.O;
        if(viewDragHelper0 != null) {
            if(!z) {
                if(viewDragHelper0.X(view0, view0.getLeft(), v1)) {
                    this.v1(2);
                    this.G1(v, true);
                    this.B.c(v);
                    return;
                }
            }
            else if(viewDragHelper0.V(view0.getLeft(), v1)) {
                this.v1(2);
                this.G1(v, true);
                this.B.c(v);
                return;
            }
        }
        this.v1(v);
    }

    com.google.android.material.shape.k E0() {
        return this.j;
    }

    private void E1() {
        WeakReference weakReference0 = this.O8;
        if(weakReference0 != null) {
            this.F1(((View)weakReference0.get()), 0);
        }
        WeakReference weakReference1 = this.P8;
        if(weakReference1 != null) {
            this.F1(((View)weakReference1.get()), 1);
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void F(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Parcelable parcelable0) {
        super.F(coordinatorLayout0, view0, ((SavedState)parcelable0).a());
        this.b1(((SavedState)parcelable0));
        int v = ((SavedState)parcelable0).c;
        if(v != 1 && v != 2) {
            this.M = v;
            this.N = v;
            return;
        }
        this.M = 4;
        this.N = 4;
    }

    @Px
    public int F0() {
        return this.m;
    }

    private void F1(View view0, int v) {
        if(view0 == null) {
            return;
        }
        this.q0(view0, v);
        int v1 = 6;
        if(!this.b && this.M != 6) {
            int v2 = this.g0(view0, string.bottomsheet_action_expand_halfway, 6);
            this.Y8.put(v, v2);
        }
        if(this.J && this.M != 5) {
            this.Z0(view0, AccessibilityActionCompat.z, 5);
        }
        switch(this.M) {
            case 3: {
                if(this.b) {
                    v1 = 4;
                }
                this.Z0(view0, AccessibilityActionCompat.y, v1);
                return;
            }
            case 4: {
                if(this.b) {
                    v1 = 3;
                }
                this.Z0(view0, AccessibilityActionCompat.x, v1);
                return;
            }
            case 6: {
                this.Z0(view0, AccessibilityActionCompat.y, 4);
                this.Z0(view0, AccessibilityActionCompat.x, 3);
            }
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    @NonNull
    public Parcelable G(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) {
        return new SavedState(super.G(coordinatorLayout0, view0), this);
    }

    @Px
    public int G0() {
        return this.l;
    }

    private void G1(int v, boolean z) {
        if(v == 2) {
            return;
        }
        boolean z1 = this.Q0();
        if(this.A != z1 && this.j != null) {
            this.A = z1;
            float f = 1.0f;
            if(z) {
                ValueAnimator valueAnimator0 = this.C;
                if(valueAnimator0 != null) {
                    if(valueAnimator0.isRunning()) {
                        this.C.reverse();
                        return;
                    }
                    float f1 = this.j.A();
                    if(z1) {
                        f = this.l0();
                    }
                    this.C.setFloatValues(new float[]{f1, f});
                    this.C.start();
                    return;
                }
            }
            if(this.C != null && this.C.isRunning()) {
                this.C.cancel();
            }
            com.google.android.material.shape.k k0 = this.j;
            if(this.A) {
                f = this.l0();
            }
            k0.q0(f);
        }
    }

    // 去混淆评级： 低(20)
    public int H0() {
        return this.g ? -1 : this.f;
    }

    private void H1(boolean z) {
        WeakReference weakReference0 = this.O8;
        if(weakReference0 == null) {
            return;
        }
        ViewParent viewParent0 = ((View)weakReference0.get()).getParent();
        if(!(viewParent0 instanceof CoordinatorLayout)) {
            return;
        }
        int v = ((CoordinatorLayout)viewParent0).getChildCount();
        if(z) {
            if(this.X8 == null) {
                this.X8 = new HashMap(v);
                goto label_12;
            }
            return;
        }
    label_12:
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = ((CoordinatorLayout)viewParent0).getChildAt(v1);
            if(view0 != this.O8.get()) {
                if(z) {
                    this.X8.put(view0, view0.getImportantForAccessibility());
                    if(this.c) {
                        ViewCompat.b2(view0, 4);
                    }
                }
                else if(this.c && (this.X8 != null && this.X8.containsKey(view0))) {
                    ViewCompat.b2(view0, ((int)(((Integer)this.X8.get(view0)))));
                }
            }
        }
        if(!z) {
            this.X8 = null;
            return;
        }
        if(this.c) {
            ((View)this.O8.get()).sendAccessibilityEvent(8);
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean I(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v, int v1) {
        this.Q = 0;
        this.X = false;
        return (v & 2) != 0;
    }

    @VisibleForTesting
    int I0() {
        return this.h;
    }

    private void I1(boolean z) {
        if(this.O8 != null) {
            this.i0();
            if(this.M == 4) {
                View view0 = (View)this.O8.get();
                if(view0 != null) {
                    if(z) {
                        this.g(4);
                        return;
                    }
                    view0.requestLayout();
                }
            }
        }
    }

    public int J0() {
        return this.a;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void K(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v) {
        int v1 = 3;
        if(view0.getTop() == this.A0()) {
            this.v1(3);
            return;
        }
        if(this.Q8 == null || view1 != this.Q8.get() || !this.X) {
            return;
        }
        if(this.Q <= 0) {
            if(this.J && this.A1(view0, this.N0())) {
                v1 = 5;
            }
            else if(this.Q == 0) {
                int v2 = view0.getTop();
                if(!this.b) {
                    int v3 = this.F;
                    if(v2 >= v3) {
                        v1 = Math.abs(v2 - v3) < Math.abs(v2 - this.H) ? 6 : 4;
                    }
                    else if(v2 >= Math.abs(v2 - this.H)) {
                        v1 = 6;
                    }
                }
                else if(Math.abs(v2 - this.E) >= Math.abs(v2 - this.H)) {
                    v1 = 4;
                }
            }
            else if(this.b) {
                v1 = 4;
            }
            else {
                int v4 = view0.getTop();
                v1 = Math.abs(v4 - this.F) < Math.abs(v4 - this.H) ? 6 : 4;
            }
        }
        else if(!this.b && view0.getTop() > this.F) {
            v1 = 6;
        }
        this.D1(view0, v1, false);
        this.X = false;
    }

    public int K0() {
        return this.e;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean L(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        if(!view0.isShown()) {
            return false;
        }
        int v = motionEvent0.getActionMasked();
        if(this.M == 1 && v == 0) {
            return true;
        }
        if(this.z1()) {
            this.O.M(motionEvent0);
        }
        if(v == 0) {
            this.a1();
        }
        if(this.S8 == null) {
            this.S8 = VelocityTracker.obtain();
        }
        this.S8.addMovement(motionEvent0);
        if(this.z1() && v == 2 && !this.P && Math.abs(((float)this.V8) - motionEvent0.getY()) > ((float)this.O.E())) {
            this.O.d(view0, motionEvent0.getPointerId(motionEvent0.getActionIndex()));
        }
        return !this.P;
    }

    public boolean L0() {
        return this.K;
    }

    private int M0(int v) {
        switch(v) {
            case 3: {
                return this.A0();
            }
            case 4: {
                return this.H;
            }
            case 5: {
                return this.N8;
            }
            case 6: {
                return this.F;
            }
            default: {
                throw new IllegalArgumentException("Invalid state to get top offset: " + v);
            }
        }
    }

    private float N0() {
        VelocityTracker velocityTracker0 = this.S8;
        if(velocityTracker0 == null) {
            return 0.0f;
        }
        velocityTracker0.computeCurrentVelocity(1000, this.d);
        return this.S8.getYVelocity(this.U8);
    }

    private boolean O0() {
        if(this.O8 != null && this.O8.get() != null) {
            int[] arr_v = new int[2];
            ((View)this.O8.get()).getLocationOnScreen(arr_v);
            return arr_v[1] == 0;
        }
        return false;
    }

    public boolean P0() {
        return this.L;
    }

    // 去混淆评级： 低(20)
    private boolean Q0() {
        return this.M == 3 && (this.y || this.O0());
    }

    public boolean R0() {
        return this.b;
    }

    public boolean S0() {
        return this.o;
    }

    public boolean T0() {
        return this.J;
    }

    @RestrictTo({Scope.b})
    public boolean U0() [...] // Inlined contents

    private boolean V0(View view0) {
        ViewParent viewParent0 = view0.getParent();
        return viewParent0 != null && viewParent0.isLayoutRequested() && ViewCompat.T0(view0);
    }

    @RestrictTo({Scope.b})
    public boolean W0() [...] // Inlined contents

    public boolean X0() {
        return this.y;
    }

    public void Y0(@NonNull g bottomSheetBehavior$g0) {
        this.R8.remove(bottomSheetBehavior$g0);
    }

    private void Z0(View view0, AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0, int v) {
        ViewCompat.C1(view0, accessibilityNodeInfoCompat$AccessibilityActionCompat0, null, this.r0(v));
    }

    private void a1() {
        this.U8 = -1;
        this.V8 = -1;
        VelocityTracker velocityTracker0 = this.S8;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.S8 = null;
        }
    }

    @Override  // com.google.android.material.motion.b
    public void b(@NonNull BackEventCompat backEventCompat0) {
        f f0 = this.T8;
        if(f0 == null) {
            return;
        }
        f0.j(backEventCompat0);
    }

    private void b1(@NonNull SavedState bottomSheetBehavior$SavedState0) {
        int v = this.a;
        if(v == 0) {
            return;
        }
        if(v == -1 || (v & 1) == 1) {
            this.f = bottomSheetBehavior$SavedState0.d;
        }
        if(v == -1 || (v & 2) == 2) {
            this.b = bottomSheetBehavior$SavedState0.e;
        }
        if(v == -1 || (v & 4) == 4) {
            this.J = bottomSheetBehavior$SavedState0.f;
        }
        if(v == -1 || (v & 8) == 8) {
            this.K = bottomSheetBehavior$SavedState0.g;
        }
    }

    @Override  // com.google.android.material.motion.b
    public void c(@NonNull BackEventCompat backEventCompat0) {
        f f0 = this.T8;
        if(f0 == null) {
            return;
        }
        f0.l(backEventCompat0);
    }

    private void c1(View view0, Runnable runnable0) {
        if(this.V0(view0)) {
            view0.post(runnable0);
            return;
        }
        runnable0.run();
    }

    @Override  // com.google.android.material.motion.b
    public void d() {
        class com.google.android.material.bottomsheet.BottomSheetBehavior.b extends AnimatorListenerAdapter {
            final BottomSheetBehavior a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                BottomSheetBehavior.this.v1(5);
                WeakReference weakReference0 = BottomSheetBehavior.this.O8;
                if(weakReference0 != null && weakReference0.get() != null) {
                    ((View)BottomSheetBehavior.this.O8.get()).requestLayout();
                }
            }
        }

        f f0 = this.T8;
        if(f0 == null) {
            return;
        }
        BackEventCompat backEventCompat0 = f0.c();
        int v = 4;
        if(backEventCompat0 != null && Build.VERSION.SDK_INT >= 34) {
            if(this.J) {
                this.T8.h(backEventCompat0, new com.google.android.material.bottomsheet.BottomSheetBehavior.b(this));
                return;
            }
            this.T8.i(backEventCompat0, null);
            this.g(4);
            return;
        }
        if(this.J) {
            v = 5;
        }
        this.g(v);
    }

    void d1(@Nullable View view0) {
        if(view0 == null) {
            WeakReference weakReference0 = this.P8;
            if(weakReference0 != null) {
                this.q0(((View)weakReference0.get()), 1);
                this.P8 = null;
                return;
            }
        }
        this.P8 = new WeakReference(view0);
        this.F1(view0, 1);
    }

    @Deprecated
    public void e1(g bottomSheetBehavior$g0) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.R8.clear();
        if(bottomSheetBehavior$g0 != null) {
            this.R8.add(bottomSheetBehavior$g0);
        }
    }

    @Override  // com.google.android.material.motion.b
    public void f() {
        f f0 = this.T8;
        if(f0 == null) {
            return;
        }
        f0.f();
    }

    public void f1(boolean z) {
        this.L = z;
    }

    public void g(int v) {
        class com.google.android.material.bottomsheet.BottomSheetBehavior.a implements Runnable {
            final View a;
            final int b;
            final BottomSheetBehavior c;

            com.google.android.material.bottomsheet.BottomSheetBehavior.a(View view0, int v) {
                this.a = view0;
                this.b = v;
                super();
            }

            @Override
            public void run() {
                BottomSheetBehavior.this.D1(this.a, this.b, false);
            }
        }

        if(v == 1 || v == 2) {
            throw new IllegalArgumentException("STATE_" + (v == 1 ? "DRAGGING" : "SETTLING") + " should not be set externally.");
        }
        if(!this.J && v == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + 5);
            return;
        }
        int v1 = v != 6 || !this.b || this.M0(6) > this.E ? v : 3;
        if(this.O8 != null && this.O8.get() != null) {
            View view0 = (View)this.O8.get();
            this.c1(view0, new com.google.android.material.bottomsheet.BottomSheetBehavior.a(this, view0, v1));
            return;
        }
        this.v1(v);
    }

    private int g0(View view0, @StringRes int v, int v1) {
        return ViewCompat.c(view0, view0.getResources().getString(v), this.r0(v1));
    }

    public void g1(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.D = v;
        this.G1(this.M, true);
    }

    public int getState() {
        return this.M;
    }

    public void h0(@NonNull g bottomSheetBehavior$g0) {
        if(!this.R8.contains(bottomSheetBehavior$g0)) {
            this.R8.add(bottomSheetBehavior$g0);
        }
    }

    public void h1(boolean z) {
        if(this.b == z) {
            return;
        }
        this.b = z;
        if(this.O8 != null) {
            this.i0();
        }
        this.v1((!this.b || this.M != 6 ? this.M : 3));
        this.G1(this.M, true);
        this.E1();
    }

    private void i0() {
        int v = this.m0();
        if(this.b) {
            this.H = Math.max(this.N8 - v, this.E);
            return;
        }
        this.H = this.N8 - v;
    }

    public void i1(boolean z) {
        this.o = z;
    }

    @RequiresApi(0x1F)
    private float j0(float f, @Nullable RoundedCorner roundedCorner0) {
        if(roundedCorner0 != null) {
            float f1 = (float)roundedCorner0.getRadius();
            return f1 <= 0.0f || f <= 0.0f ? 0.0f : f1 / f;
        }
        return 0.0f;
    }

    public void j1(@FloatRange(from = 0.0, fromInclusive = false, to = 1.0, toInclusive = false) float f) {
        if(f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f;
        if(this.O8 != null) {
            this.k0();
        }
    }

    private void k0() {
        this.F = (int)(((float)this.N8) * (1.0f - this.G));
    }

    public void k1(float f) {
        this.Y = f;
    }

    private float l0() {
        if(this.j != null && (this.O8 != null && this.O8.get() != null && Build.VERSION.SDK_INT >= 0x1F)) {
            View view0 = (View)this.O8.get();
            if(this.O0()) {
                WindowInsets windowInsets0 = view0.getRootWindowInsets();
                return windowInsets0 == null ? 0.0f : Math.max(this.j0(this.j.T(), windowInsets0.getRoundedCorner(0)), this.j0(this.j.U(), windowInsets0.getRoundedCorner(1)));
            }
        }
        return 0.0f;
    }

    public void l1(boolean z) {
        if(this.J != z) {
            this.J = z;
            if(!z && this.M == 5) {
                this.g(4);
            }
            this.E1();
        }
    }

    private int m0() {
        if(this.g) {
            return Math.min(Math.max(this.h, this.N8 - this.M8 * 9 / 16), this.Z) + this.w;
        }
        if(!this.o && !this.p) {
            return this.n <= 0 ? this.f + this.w : Math.max(this.f, this.n + this.i);
        }
        return this.f + this.w;
    }

    @RestrictTo({Scope.b})
    public void m1(boolean z) {
        this.J = z;
    }

    public float n0() {
        return this.O8 == null || this.O8.get() == null ? -1.0f : this.o0(((View)this.O8.get()).getTop());
    }

    public void n1(@Px int v) {
        this.m = v;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void o(@NonNull LayoutParams coordinatorLayout$LayoutParams0) {
        super.o(coordinatorLayout$LayoutParams0);
        this.O8 = null;
        this.O = null;
        this.T8 = null;
    }

    private float o0(int v) {
        return v > this.H || this.H == this.A0() ? ((float)(this.H - v)) / ((float)(this.N8 - this.H)) : ((float)(this.H - v)) / ((float)(this.H - this.A0()));
    }

    public void o1(@Px int v) {
        this.l = v;
    }

    private boolean p0() {
        return this.T0();
    }

    public void p1(int v) {
        this.q1(v, false);
    }

    private void q0(View view0, int v) {
        if(view0 == null) {
            return;
        }
        ViewCompat.z1(view0, 0x80000);
        ViewCompat.z1(view0, 0x40000);
        ViewCompat.z1(view0, 0x100000);
        int v1 = this.Y8.get(v, -1);
        if(v1 != -1) {
            ViewCompat.z1(view0, v1);
            this.Y8.delete(v);
        }
    }

    public final void q1(int v, boolean z) {
        if(v == -1) {
            if(!this.g) {
                this.g = true;
                this.I1(z);
            }
        }
        else if(this.g || this.f != v) {
            this.g = false;
            this.f = Math.max(0, v);
            this.I1(z);
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void r() {
        super.r();
        this.O8 = null;
        this.O = null;
        this.T8 = null;
    }

    private AccessibilityViewCommand r0(int v) {
        class com.google.android.material.bottomsheet.BottomSheetBehavior.f implements AccessibilityViewCommand {
            final int a;
            final BottomSheetBehavior b;

            com.google.android.material.bottomsheet.BottomSheetBehavior.f(int v) {
                this.a = v;
                super();
            }

            @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean a(@NonNull View view0, @Nullable CommandArguments accessibilityViewCommand$CommandArguments0) {
                BottomSheetBehavior.this.g(this.a);
                return true;
            }
        }

        return new com.google.android.material.bottomsheet.BottomSheetBehavior.f(this, v);
    }

    public void r1(int v) {
        this.a = v;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean s(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        if(view0.isShown() && this.L) {
            int v = motionEvent0.getActionMasked();
            if(v == 0) {
                this.a1();
            }
            if(this.S8 == null) {
                this.S8 = VelocityTracker.obtain();
            }
            this.S8.addMovement(motionEvent0);
            View view1 = null;
            switch(v) {
                case 0: {
                    int v1 = (int)motionEvent0.getX();
                    this.V8 = (int)motionEvent0.getY();
                    if(this.M != 2) {
                        View view2 = this.Q8 == null ? null : ((View)this.Q8.get());
                        if(view2 != null && coordinatorLayout0.G(view2, v1, this.V8)) {
                            this.U8 = motionEvent0.getPointerId(motionEvent0.getActionIndex());
                            this.W8 = true;
                        }
                    }
                    this.P = this.U8 == -1 && !coordinatorLayout0.G(view0, v1, this.V8);
                    break;
                }
                case 1: {
                label_20:
                    this.W8 = false;
                    this.U8 = -1;
                    if(this.P) {
                        this.P = false;
                        return false;
                    }
                    break;
                }
                default: {
                    if(v == 3) {
                        goto label_20;
                    }
                }
            }
            if(!this.P && (this.O != null && this.O.W(motionEvent0))) {
                return true;
            }
            WeakReference weakReference0 = this.Q8;
            if(weakReference0 != null) {
                view1 = (View)weakReference0.get();
            }
            return v == 2 && view1 != null && !this.P && this.M != 1 && !coordinatorLayout0.G(view1, ((int)motionEvent0.getX()), ((int)motionEvent0.getY())) && this.O != null && (this.V8 != -1 && Math.abs(((float)this.V8) - motionEvent0.getY()) > ((float)this.O.E()));
        }
        this.P = true;
        return false;
    }

    private void s0(@NonNull Context context0) {
        if(this.z == null) {
            return;
        }
        com.google.android.material.shape.k k0 = new com.google.android.material.shape.k(this.z);
        this.j = k0;
        k0.a0(context0);
        ColorStateList colorStateList0 = this.k;
        if(colorStateList0 != null) {
            this.j.p0(colorStateList0);
            return;
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(0x1010031, typedValue0, true);
        this.j.setTint(typedValue0.data);
    }

    public void s1(boolean z) {
        if(this.y != z) {
            this.y = z;
            this.G1(this.getState(), true);
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean t(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        if(ViewCompat.Y(coordinatorLayout0) && !ViewCompat.Y(view0)) {
            view0.setFitsSystemWindows(true);
        }
        if(this.O8 == null) {
            this.h = coordinatorLayout0.getResources().getDimensionPixelSize(dimen.design_bottom_sheet_peek_height_min);
            this.x1(view0);
            ViewCompat.J2(view0, new com.google.android.material.bottomsheet.f(view0));
            this.O8 = new WeakReference(view0);
            this.T8 = new f(view0);
            com.google.android.material.shape.k k0 = this.j;
            if(k0 == null) {
                ColorStateList colorStateList0 = this.k;
                if(colorStateList0 != null) {
                    ViewCompat.S1(view0, colorStateList0);
                }
            }
            else {
                ViewCompat.R1(view0, k0);
                this.j.o0((this.I == -1.0f ? ViewCompat.V(view0) : this.I));
            }
            this.E1();
            if(ViewCompat.Z(view0) == 0) {
                ViewCompat.b2(view0, 1);
            }
        }
        if(this.O == null) {
            this.O = ViewDragHelper.q(coordinatorLayout0, this.Z8);
        }
        int v1 = view0.getTop();
        coordinatorLayout0.N(view0, v);
        this.M8 = coordinatorLayout0.getWidth();
        this.N8 = coordinatorLayout0.getHeight();
        int v2 = view0.getHeight();
        this.Z = v2;
        int v3 = this.N8;
        int v4 = this.x;
        if(v3 - v2 < v4) {
            if(this.s) {
                int v5 = this.m;
                if(v5 != -1) {
                    v3 = Math.min(v3, v5);
                }
                this.Z = v3;
            }
            else {
                int v6 = v3 - v4;
                int v7 = this.m;
                if(v7 != -1) {
                    v6 = Math.min(v6, v7);
                }
                this.Z = v6;
            }
        }
        this.E = Math.max(0, this.N8 - this.Z);
        this.k0();
        this.i0();
        int v9 = this.M;
        if(v9 == 3) {
            ViewCompat.l1(view0, this.A0());
        }
        else if(v9 == 6) {
            ViewCompat.l1(view0, this.F);
        }
        else if(!this.J || v9 != 5) {
            switch(v9) {
                case 1: 
                case 2: {
                    ViewCompat.l1(view0, v1 - view0.getTop());
                    break;
                }
                case 4: {
                    ViewCompat.l1(view0, this.H);
                }
            }
        }
        else {
            ViewCompat.l1(view0, this.N8);
        }
        this.G1(this.M, false);
        this.Q8 = new WeakReference(this.w0(view0));
        for(int v8 = 0; v8 < this.R8.size(); ++v8) {
            ((g)this.R8.get(v8)).a(view0);
        }
        return true;
    }

    private void t0() {
        class c implements ValueAnimator.AnimatorUpdateListener {
            final BottomSheetBehavior a;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                if(BottomSheetBehavior.this.j != null) {
                    BottomSheetBehavior.this.j.q0(f);
                }
            }
        }

        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{this.l0(), 1.0f});
        this.C = valueAnimator0;
        valueAnimator0.setDuration(500L);
        this.C.addUpdateListener(new c(this));
    }

    public void t1(int v) {
        this.e = v;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean u(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v, int v1, int v2, int v3) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        view0.measure(this.z0(v, coordinatorLayout0.getPaddingLeft() + coordinatorLayout0.getPaddingRight() + viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin + v1, this.l, viewGroup$MarginLayoutParams0.width), this.z0(v2, coordinatorLayout0.getPaddingTop() + coordinatorLayout0.getPaddingBottom() + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin + v3, this.m, viewGroup$MarginLayoutParams0.height));
        return true;
    }

    @RestrictTo({Scope.b})
    @VisibleForTesting
    public void u0() {
        this.C = null;
    }

    public void u1(boolean z) {
        this.K = z;
    }

    void v0(int v) {
        View view0 = (View)this.O8.get();
        if(view0 != null && !this.R8.isEmpty()) {
            float f = this.o0(v);
            for(int v1 = 0; v1 < this.R8.size(); ++v1) {
                ((g)this.R8.get(v1)).b(view0, f);
            }
        }
    }

    void v1(int v) {
        if(this.M == v) {
            return;
        }
        this.M = v;
        if(v == 3 || v == 4 || v == 6 || this.J && v == 5) {
            this.N = v;
        }
        WeakReference weakReference0 = this.O8;
        if(weakReference0 == null) {
            return;
        }
        View view0 = (View)weakReference0.get();
        if(view0 == null) {
            return;
        }
        if(v == 3) {
            this.H1(true);
        }
        else if(v == 4 || v == 5 || v == 6) {
            this.H1(false);
        }
        this.G1(v, true);
        for(int v1 = 0; v1 < this.R8.size(); ++v1) {
            ((g)this.R8.get(v1)).c(view0, v);
        }
        this.E1();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean w(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, float f, float f1) {
        return this.Q8 != null && view1 == this.Q8.get() && (this.M != 3 || super.w(coordinatorLayout0, view0, view1, f, f1));
    }

    @Nullable
    @VisibleForTesting
    View w0(View view0) {
        if(view0.getVisibility() != 0) {
            return null;
        }
        if(ViewCompat.c1(view0)) {
            return view0;
        }
        if(view0 instanceof ViewGroup) {
            int v = ((ViewGroup)view0).getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = this.w0(((ViewGroup)view0).getChildAt(v1));
                if(view1 != null) {
                    return view1;
                }
            }
        }
        return null;
    }

    public void w1(boolean z) {
        this.c = z;
    }

    @NonNull
    public static BottomSheetBehavior x0(@NonNull View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        Behavior coordinatorLayout$Behavior0 = ((LayoutParams)viewGroup$LayoutParams0).f();
        if(!(coordinatorLayout$Behavior0 instanceof BottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        return (BottomSheetBehavior)coordinatorLayout$Behavior0;
    }

    private void x1(@NonNull View view0) {
        class com.google.android.material.bottomsheet.BottomSheetBehavior.d implements com.google.android.material.internal.M.d {
            final boolean a;
            final BottomSheetBehavior b;

            com.google.android.material.bottomsheet.BottomSheetBehavior.d(boolean z) {
                this.a = z;
                super();
            }

            @Override  // com.google.android.material.internal.M$d
            public WindowInsetsCompat a(View view0, WindowInsetsCompat windowInsetsCompat0, com.google.android.material.internal.M.e m$e0) {
                int v6;
                Insets insets0 = windowInsetsCompat0.f(0x207);
                Insets insets1 = windowInsetsCompat0.f(0x20);
                BottomSheetBehavior.this.x = insets0.b;
                boolean z = M.s(view0);
                int v = view0.getPaddingBottom();
                int v1 = view0.getPaddingLeft();
                int v2 = view0.getPaddingRight();
                if(BottomSheetBehavior.this.p) {
                    int v3 = windowInsetsCompat0.o();
                    BottomSheetBehavior.this.w = v3;
                    v = m$e0.d + BottomSheetBehavior.this.w;
                }
                if(BottomSheetBehavior.this.q) {
                    v1 = (z ? m$e0.c : m$e0.a) + insets0.a;
                }
                if(BottomSheetBehavior.this.r) {
                    v2 = (z ? m$e0.a : m$e0.c) + insets0.c;
                }
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
                int v4 = 1;
                if(BottomSheetBehavior.this.t) {
                    int v5 = insets0.a;
                    if(viewGroup$MarginLayoutParams0.leftMargin == v5) {
                        v6 = 0;
                    }
                    else {
                        viewGroup$MarginLayoutParams0.leftMargin = v5;
                        v6 = 1;
                    }
                }
                else {
                    v6 = 0;
                }
                if(BottomSheetBehavior.this.u) {
                    int v7 = insets0.c;
                    if(viewGroup$MarginLayoutParams0.rightMargin != v7) {
                        viewGroup$MarginLayoutParams0.rightMargin = v7;
                        v6 = 1;
                    }
                }
                if(BottomSheetBehavior.this.v) {
                    int v8 = insets0.b;
                    if(viewGroup$MarginLayoutParams0.topMargin == v8) {
                        v4 = v6;
                    }
                    else {
                        viewGroup$MarginLayoutParams0.topMargin = v8;
                    }
                }
                else {
                    v4 = v6;
                }
                if(v4 != 0) {
                    view0.setLayoutParams(viewGroup$MarginLayoutParams0);
                }
                view0.setPadding(v1, view0.getPaddingTop(), v2, v);
                if(this.a) {
                    BottomSheetBehavior.this.n = insets1.d;
                }
                if(BottomSheetBehavior.this.p || this.a) {
                    BottomSheetBehavior.this.I1(false);
                }
                return windowInsetsCompat0;
            }
        }

        boolean z = Build.VERSION.SDK_INT >= 29 && !this.S0() && !this.g;
        if(!this.p && !this.q && !this.r && !this.t && !this.u && !this.v && !z) {
            return;
        }
        M.h(view0, new com.google.android.material.bottomsheet.BottomSheetBehavior.d(this, z));
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void y(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, @NonNull int[] arr_v, int v2) {
        if(v2 == 1) {
            return;
        }
        if(view1 != (this.Q8 == null ? null : ((View)this.Q8.get()))) {
            return;
        }
        int v3 = view0.getTop();
        int v4 = v3 - v1;
        if(v1 <= 0) {
            if(v1 < 0 && !view1.canScrollVertically(-1)) {
                if(v4 <= this.H || this.p0()) {
                    if(!this.L) {
                        return;
                    }
                    arr_v[1] = v1;
                    ViewCompat.l1(view0, -v1);
                    this.v1(1);
                }
                else {
                    int v6 = v3 - this.H;
                    arr_v[1] = v6;
                    ViewCompat.l1(view0, -v6);
                    this.v1(4);
                }
            }
        }
        else if(v4 < this.A0()) {
            int v5 = v3 - this.A0();
            arr_v[1] = v5;
            ViewCompat.l1(view0, -v5);
            this.v1(3);
        }
        else {
            if(!this.L) {
                return;
            }
            arr_v[1] = v1;
            ViewCompat.l1(view0, -v1);
            this.v1(1);
        }
        this.v0(view0.getTop());
        this.Q = v1;
        this.X = true;
    }

    @Nullable
    @VisibleForTesting
    f y0() {
        return this.T8;
    }

    @RestrictTo({Scope.b})
    public boolean y1(long v, @FloatRange(from = 0.0, to = 100.0) float f) {
        return false;
    }

    private int z0(int v, int v1, int v2, int v3) {
        int v4 = ViewGroup.getChildMeasureSpec(v, v1, v3);
        if(v2 == -1) {
            return v4;
        }
        int v5 = View.MeasureSpec.getMode(v4);
        int v6 = View.MeasureSpec.getSize(v4);
        if(v5 != 0x40000000) {
            if(v6 != 0) {
                v2 = Math.min(v6, v2);
            }
            return View.MeasureSpec.makeMeasureSpec(v2, 0x80000000);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(v6, v2), 0x40000000);
    }

    // 去混淆评级： 低(20)
    private boolean z1() {
        return this.O != null && (this.L || this.M == 1);
    }
}

