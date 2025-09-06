package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.integer;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.v;
import com.google.android.material.internal.D;
import com.google.android.material.shape.k;
import com.google.android.material.shape.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AppBarLayout extends LinearLayout implements AttachedBehavior {
    public static class BaseBehavior extends HeaderBehavior {
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
            boolean c;
            boolean d;
            int e;
            float f;
            boolean g;

            static {
                SavedState.CREATOR = new a();
            }

            public SavedState(@NonNull Parcel parcel0, ClassLoader classLoader0) {
                super(parcel0, classLoader0);
                boolean z = false;
                this.c = parcel0.readByte() != 0;
                this.d = parcel0.readByte() != 0;
                this.e = parcel0.readInt();
                this.f = parcel0.readFloat();
                if(parcel0.readByte() != 0) {
                    z = true;
                }
                this.g = z;
            }

            public SavedState(Parcelable parcelable0) {
                super(parcelable0);
            }

            @Override  // androidx.customview.view.AbsSavedState
            public void writeToParcel(@NonNull Parcel parcel0, int v) {
                super.writeToParcel(parcel0, v);
                parcel0.writeByte(((byte)this.c));
                parcel0.writeByte(((byte)this.d));
                parcel0.writeInt(this.e);
                parcel0.writeFloat(this.f);
                parcel0.writeByte(((byte)this.g));
            }
        }

        public static abstract class c {
            public abstract boolean a(@NonNull AppBarLayout arg1);
        }

        private int l;
        private int m;
        private ValueAnimator n;
        private SavedState o;
        @Nullable
        private WeakReference p;
        private c q;
        private static final int r = 600;

        public BaseBehavior() {
        }

        public BaseBehavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public boolean A0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, int v) {
            boolean z = super.t(coordinatorLayout0, appBarLayout0, v);
            int v1 = appBarLayout0.getPendingAction();
            SavedState appBarLayout$BaseBehavior$SavedState0 = this.o;
            if(appBarLayout$BaseBehavior$SavedState0 == null || (v1 & 8) != 0) {
                if(v1 != 0) {
                    boolean z1 = (v1 & 4) != 0;
                    if((v1 & 2) != 0) {
                        int v3 = appBarLayout0.getUpNestedPreScrollRange();
                        if(z1) {
                            this.k0(coordinatorLayout0, appBarLayout0, -v3, 0.0f);
                        }
                        else {
                            this.e0(coordinatorLayout0, appBarLayout0, -v3);
                        }
                    }
                    else if((v1 & 1) != 0) {
                        if(z1) {
                            this.k0(coordinatorLayout0, appBarLayout0, 0, 0.0f);
                        }
                        else {
                            this.e0(coordinatorLayout0, appBarLayout0, 0);
                        }
                    }
                }
            }
            else if(appBarLayout$BaseBehavior$SavedState0.c) {
                this.e0(coordinatorLayout0, appBarLayout0, -appBarLayout0.getTotalScrollRange());
            }
            else if(appBarLayout$BaseBehavior$SavedState0.d) {
                this.e0(coordinatorLayout0, appBarLayout0, 0);
            }
            else {
                View view0 = appBarLayout0.getChildAt(appBarLayout$BaseBehavior$SavedState0.e);
                int v2 = view0.getBottom();
                this.e0(coordinatorLayout0, appBarLayout0, (this.o.g ? ViewCompat.j0(view0) + appBarLayout0.getTopInset() : Math.round(((float)view0.getHeight()) * this.o.f)) - v2);
            }
            appBarLayout0.C();
            this.o = null;
            this.U(MathUtils.e(this.O(), -appBarLayout0.getTotalScrollRange(), 0));
            this.O0(coordinatorLayout0, appBarLayout0, this.O(), 0, true);
            appBarLayout0.x(this.O());
            this.j0(coordinatorLayout0, appBarLayout0);
            return z;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void B(CoordinatorLayout coordinatorLayout0, @NonNull View view0, View view1, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
            this.D0(coordinatorLayout0, ((AppBarLayout)view0), view1, v, v1, v2, v3, v4, arr_v);
        }

        public boolean B0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, int v, int v1, int v2, int v3) {
            if(((LayoutParams)appBarLayout0.getLayoutParams()).height == -2) {
                coordinatorLayout0.O(appBarLayout0, v, v1, 0, v3);
                return true;
            }
            return super.u(coordinatorLayout0, appBarLayout0, v, v1, v2, v3);
        }

        public void C0(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, View view0, int v, int v1, int[] arr_v, int v2) {
            int v5;
            int v4;
            if(v1 != 0) {
                if(v1 < 0) {
                    int v3 = appBarLayout0.getTotalScrollRange();
                    v4 = -v3;
                    v5 = appBarLayout0.getDownNestedPreScrollRange() - v3;
                }
                else {
                    v4 = -appBarLayout0.getUpNestedPreScrollRange();
                    v5 = 0;
                }
                if(v4 != v5) {
                    arr_v[1] = this.d0(coordinatorLayout0, appBarLayout0, v1, v4, v5);
                }
            }
            if(appBarLayout0.s()) {
                appBarLayout0.I(appBarLayout0.L(view0));
            }
        }

        public void D0(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
            if(v3 < 0) {
                arr_v[1] = this.d0(coordinatorLayout0, appBarLayout0, v3, -appBarLayout0.getDownNestedScrollRange(), 0);
            }
            if(v3 == 0) {
                this.j0(coordinatorLayout0, appBarLayout0);
            }
        }

        public void E0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, Parcelable parcelable0) {
            if(parcelable0 instanceof SavedState) {
                this.I0(((SavedState)parcelable0), true);
                super.F(coordinatorLayout0, appBarLayout0, this.o.a());
                return;
            }
            super.F(coordinatorLayout0, appBarLayout0, parcelable0);
            this.o = null;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void F(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, Parcelable parcelable0) {
            this.E0(coordinatorLayout0, ((AppBarLayout)view0), parcelable0);
        }

        public Parcelable F0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0) {
            Parcelable parcelable0 = super.G(coordinatorLayout0, appBarLayout0);
            SavedState appBarLayout$BaseBehavior$SavedState0 = this.J0(parcelable0, appBarLayout0);
            return appBarLayout$BaseBehavior$SavedState0 != null ? appBarLayout$BaseBehavior$SavedState0 : parcelable0;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public Parcelable G(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) {
            return this.F0(coordinatorLayout0, ((AppBarLayout)view0));
        }

        public boolean G0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, @NonNull View view0, View view1, int v, int v1) {
            boolean z = (v & 2) != 0 && (appBarLayout0.s() || this.o0(coordinatorLayout0, appBarLayout0, view0));
            if(z) {
                ValueAnimator valueAnimator0 = this.n;
                if(valueAnimator0 != null) {
                    valueAnimator0.cancel();
                }
            }
            this.p = null;
            this.m = v1;
            return z;
        }

        public void H0(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, View view0, int v) {
            if(this.m == 0 || v == 1) {
                this.N0(coordinatorLayout0, appBarLayout0);
                if(appBarLayout0.s()) {
                    appBarLayout0.I(appBarLayout0.L(view0));
                }
            }
            this.p = new WeakReference(view0);
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean I(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, View view2, int v, int v1) {
            return this.G0(coordinatorLayout0, ((AppBarLayout)view0), view1, view2, v, v1);
        }

        void I0(@Nullable SavedState appBarLayout$BaseBehavior$SavedState0, boolean z) {
            if(this.o == null || z) {
                this.o = appBarLayout$BaseBehavior$SavedState0;
            }
        }

        @Nullable
        SavedState J0(@Nullable Parcelable parcelable0, @NonNull AppBarLayout appBarLayout0) {
            int v = this.O();
            int v1 = appBarLayout0.getChildCount();
            boolean z = false;
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = appBarLayout0.getChildAt(v2);
                int v3 = view0.getBottom() + v;
                if(view0.getTop() + v <= 0 && v3 >= 0) {
                    if(parcelable0 == null) {
                        parcelable0 = AbsSavedState.b;
                    }
                    SavedState appBarLayout$BaseBehavior$SavedState0 = new SavedState(parcelable0);
                    appBarLayout$BaseBehavior$SavedState0.d = v == 0;
                    appBarLayout$BaseBehavior$SavedState0.c = v != 0 && -v >= appBarLayout0.getTotalScrollRange();
                    appBarLayout$BaseBehavior$SavedState0.e = v2;
                    if(v3 == ViewCompat.j0(view0) + appBarLayout0.getTopInset()) {
                        z = true;
                    }
                    appBarLayout$BaseBehavior$SavedState0.g = z;
                    appBarLayout$BaseBehavior$SavedState0.f = ((float)v3) / ((float)view0.getHeight());
                    return appBarLayout$BaseBehavior$SavedState0;
                }
            }
            return null;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void K(CoordinatorLayout coordinatorLayout0, @NonNull View view0, View view1, int v) {
            this.H0(coordinatorLayout0, ((AppBarLayout)view0), view1, v);
        }

        public void K0(@Nullable c appBarLayout$BaseBehavior$c0) {
            this.q = appBarLayout$BaseBehavior$c0;
        }

        int L0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, int v, int v1, int v2) {
            int v3 = this.b0();
            int v4 = 0;
            if(v1 == 0 || v3 < v1 || v3 > v2) {
                this.l = 0;
            }
            else {
                int v5 = MathUtils.e(v, v1, v2);
                if(v3 != v5) {
                    int v6 = appBarLayout0.m() ? this.x0(appBarLayout0, v5) : v5;
                    boolean z = this.U(v6);
                    this.l = v5 - v6;
                    if(z) {
                        while(v4 < appBarLayout0.getChildCount()) {
                            com.google.android.material.appbar.AppBarLayout.LayoutParams appBarLayout$LayoutParams0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams)appBarLayout0.getChildAt(v4).getLayoutParams();
                            com.google.android.material.appbar.AppBarLayout.c appBarLayout$c0 = appBarLayout$LayoutParams0.b();
                            if(appBarLayout$c0 != null && (appBarLayout$LayoutParams0.c() & 1) != 0) {
                                appBarLayout$c0.a(appBarLayout0, appBarLayout0.getChildAt(v4), ((float)this.O()));
                            }
                            ++v4;
                        }
                    }
                    if(!z && appBarLayout0.m()) {
                        coordinatorLayout0.k(appBarLayout0);
                    }
                    appBarLayout0.x(this.O());
                    this.O0(coordinatorLayout0, appBarLayout0, v5, (v5 >= v3 ? 1 : -1), false);
                    v4 = v3 - v5;
                }
            }
            this.j0(coordinatorLayout0, appBarLayout0);
            return v4;
        }

        private boolean M0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0) {
            List list0 = coordinatorLayout0.x(appBarLayout0);
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Behavior coordinatorLayout$Behavior0 = ((LayoutParams)((View)list0.get(v1)).getLayoutParams()).f();
                if(coordinatorLayout$Behavior0 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior)coordinatorLayout$Behavior0).Z() != 0;
                }
            }
            return false;
        }

        private void N0(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0) {
            int v = appBarLayout0.getTopInset() + appBarLayout0.getPaddingTop();
            int v1 = this.b0() - v;
            int v2 = this.t0(appBarLayout0, v1);
            if(v2 >= 0) {
                View view0 = appBarLayout0.getChildAt(v2);
                com.google.android.material.appbar.AppBarLayout.LayoutParams appBarLayout$LayoutParams0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams)view0.getLayoutParams();
                int v3 = appBarLayout$LayoutParams0.c();
                if((v3 & 17) == 17) {
                    int v4 = -view0.getTop();
                    int v5 = -view0.getBottom();
                    if(v2 == 0 && ViewCompat.Y(appBarLayout0) && ViewCompat.Y(view0)) {
                        v4 -= appBarLayout0.getTopInset();
                    }
                    if(BaseBehavior.p0(v3, 2)) {
                        v5 += ViewCompat.j0(view0);
                    }
                    else if(BaseBehavior.p0(v3, 5)) {
                        int v6 = ViewCompat.j0(view0) + v5;
                        if(v1 < v6) {
                            v4 = v6;
                        }
                        else {
                            v5 = v6;
                        }
                    }
                    if(BaseBehavior.p0(v3, 0x20)) {
                        v4 += appBarLayout$LayoutParams0.topMargin;
                        v5 -= appBarLayout$LayoutParams0.bottomMargin;
                    }
                    this.k0(coordinatorLayout0, appBarLayout0, MathUtils.e(this.m0(v1, v5, v4) + v, -appBarLayout0.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void O0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, int v, int v1, boolean z) {
            View view0 = BaseBehavior.s0(appBarLayout0, v);
            boolean z1 = false;
            if(view0 != null) {
                int v2 = ((com.google.android.material.appbar.AppBarLayout.LayoutParams)view0.getLayoutParams()).c();
                if((v2 & 1) != 0) {
                    int v3 = ViewCompat.j0(view0);
                    if(v1 <= 0 || (v2 & 12) == 0) {
                        if((v2 & 2) != 0 && -v >= view0.getBottom() - v3 - appBarLayout0.getTopInset()) {
                            z1 = true;
                        }
                    }
                    else if(-v >= view0.getBottom() - v3 - appBarLayout0.getTopInset()) {
                        z1 = true;
                    }
                }
            }
            if(appBarLayout0.s()) {
                z1 = appBarLayout0.L(this.r0(coordinatorLayout0));
            }
            if(z || appBarLayout0.I(z1) && this.M0(coordinatorLayout0, appBarLayout0)) {
                if(appBarLayout0.getBackground() != null) {
                    appBarLayout0.getBackground().jumpToCurrentState();
                }
                if(Build.VERSION.SDK_INT >= 23 && appBarLayout0.getForeground() != null) {
                    appBarLayout0.getForeground().jumpToCurrentState();
                }
                if(appBarLayout0.getStateListAnimator() != null) {
                    appBarLayout0.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        boolean W(View view0) {
            return this.n0(((AppBarLayout)view0));
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        int Z(@NonNull View view0) {
            return this.v0(((AppBarLayout)view0));
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        int a0(@NonNull View view0) {
            return this.w0(((AppBarLayout)view0));
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        int b0() {
            return this.O() + this.l;
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        void c0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) {
            this.z0(coordinatorLayout0, ((AppBarLayout)view0));
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        int f0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v, int v1, int v2) {
            return this.L0(coordinatorLayout0, ((AppBarLayout)view0), v, v1, v2);
        }

        private void j0(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0) {
            class b extends AccessibilityDelegateCompat {
                final AppBarLayout d;
                final CoordinatorLayout e;
                final BaseBehavior f;

                b(AppBarLayout appBarLayout0, CoordinatorLayout coordinatorLayout0) {
                    this.d = appBarLayout0;
                    this.e = coordinatorLayout0;
                    super();
                }

                @Override  // androidx.core.view.AccessibilityDelegateCompat
                public void g(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                    super.g(view0, accessibilityNodeInfoCompat0);
                    accessibilityNodeInfoCompat0.k1("android.widget.ScrollView");
                    if(this.d.getTotalScrollRange() == 0) {
                        return;
                    }
                    View view1 = BaseBehavior.this.u0(this.e);
                    if(view1 == null) {
                        return;
                    }
                    if(!BaseBehavior.this.q0(this.d)) {
                        return;
                    }
                    if(BaseBehavior.this.b0() != -this.d.getTotalScrollRange()) {
                        accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.r);
                        accessibilityNodeInfoCompat0.Z1(true);
                    }
                    if(BaseBehavior.this.b0() != 0) {
                        if(!view1.canScrollVertically(-1)) {
                            accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.s);
                            accessibilityNodeInfoCompat0.Z1(true);
                        }
                        else if(-this.d.getDownNestedPreScrollRange() != 0) {
                            accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.s);
                            accessibilityNodeInfoCompat0.Z1(true);
                        }
                    }
                }

                @Override  // androidx.core.view.AccessibilityDelegateCompat
                public boolean j(View view0, int v, Bundle bundle0) {
                    switch(v) {
                        case 0x1000: {
                            this.d.setExpanded(false);
                            return true;
                        }
                        case 0x2000: {
                            if(BaseBehavior.this.b0() != 0) {
                                View view1 = BaseBehavior.this.u0(this.e);
                                if(!view1.canScrollVertically(-1)) {
                                    this.d.setExpanded(true);
                                    return true;
                                }
                                int v1 = this.d.getDownNestedPreScrollRange();
                                if(-v1 != 0) {
                                    BaseBehavior.this.C0(this.e, this.d, view1, 0, -v1, new int[]{0, 0}, 1);
                                    return true;
                                }
                            }
                            return false;
                        }
                        default: {
                            return super.j(view0, v, bundle0);
                        }
                    }
                }
            }

            if(!ViewCompat.L0(coordinatorLayout0)) {
                ViewCompat.J1(coordinatorLayout0, new b(this, appBarLayout0, coordinatorLayout0));
            }
        }

        private void k0(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, int v, float f) {
            int v1 = Math.abs(this.b0() - v);
            float f1 = Math.abs(f);
            this.l0(coordinatorLayout0, appBarLayout0, v, (f1 > 0.0f ? Math.round(((float)v1) / f1 * 1000.0f) * 3 : ((int)((((float)v1) / ((float)appBarLayout0.getHeight()) + 1.0f) * 150.0f))));
        }

        private void l0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, int v, int v1) {
            class com.google.android.material.appbar.AppBarLayout.BaseBehavior.a implements ValueAnimator.AnimatorUpdateListener {
                final CoordinatorLayout a;
                final AppBarLayout b;
                final BaseBehavior c;

                com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0) {
                    this.a = coordinatorLayout0;
                    this.b = appBarLayout0;
                    super();
                }

                @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
                    int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                    BaseBehavior.this.e0(this.a, this.b, v);
                }
            }

            int v2 = this.b0();
            if(v2 == v) {
                if(this.n != null && this.n.isRunning()) {
                    this.n.cancel();
                }
                return;
            }
            ValueAnimator valueAnimator0 = this.n;
            if(valueAnimator0 == null) {
                ValueAnimator valueAnimator1 = new ValueAnimator();
                this.n = valueAnimator1;
                valueAnimator1.setInterpolator(com.google.android.material.animation.b.e);
                this.n.addUpdateListener(new com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(this, coordinatorLayout0, appBarLayout0));
            }
            else {
                valueAnimator0.cancel();
            }
            this.n.setDuration(((long)Math.min(v1, 600)));
            this.n.setIntValues(new int[]{v2, v});
            this.n.start();
        }

        private int m0(int v, int v1, int v2) {
            return v < (v1 + v2) / 2 ? v1 : v2;
        }

        boolean n0(AppBarLayout appBarLayout0) {
            c appBarLayout$BaseBehavior$c0 = this.q;
            if(appBarLayout$BaseBehavior$c0 != null) {
                return appBarLayout$BaseBehavior$c0.a(appBarLayout0);
            }
            WeakReference weakReference0 = this.p;
            if(weakReference0 != null) {
                View view0 = (View)weakReference0.get();
                return view0 != null && view0.isShown() && !view0.canScrollVertically(-1);
            }
            return true;
        }

        private boolean o0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, @NonNull View view0) {
            return appBarLayout0.o() && coordinatorLayout0.getHeight() - view0.getHeight() <= appBarLayout0.getHeight();
        }

        private static boolean p0(int v, int v1) {
            return (v & v1) == v1;
        }

        private boolean q0(AppBarLayout appBarLayout0) {
            int v = appBarLayout0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                if(((com.google.android.material.appbar.AppBarLayout.LayoutParams)appBarLayout0.getChildAt(v1).getLayoutParams()).a != 0) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        private View r0(@NonNull CoordinatorLayout coordinatorLayout0) {
            int v = coordinatorLayout0.getChildCount();
            int v1 = 0;
            while(v1 < v) {
                View view0 = coordinatorLayout0.getChildAt(v1);
                if(!(view0 instanceof NestedScrollingChild) && !(view0 instanceof AbsListView) && !(view0 instanceof ScrollView)) {
                    ++v1;
                    continue;
                }
                return view0;
            }
            return null;
        }

        @Nullable
        private static View s0(@NonNull AppBarLayout appBarLayout0, int v) {
            int v1 = Math.abs(v);
            int v2 = appBarLayout0.getChildCount();
            for(int v3 = 0; v3 < v2; ++v3) {
                View view0 = appBarLayout0.getChildAt(v3);
                if(v1 >= view0.getTop() && v1 <= view0.getBottom()) {
                    return view0;
                }
            }
            return null;
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean t(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
            return this.A0(coordinatorLayout0, ((AppBarLayout)view0), v);
        }

        private int t0(@NonNull AppBarLayout appBarLayout0, int v) {
            int v1 = appBarLayout0.getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = appBarLayout0.getChildAt(v2);
                int v3 = view0.getTop();
                int v4 = view0.getBottom();
                com.google.android.material.appbar.AppBarLayout.LayoutParams appBarLayout$LayoutParams0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams)view0.getLayoutParams();
                if(BaseBehavior.p0(appBarLayout$LayoutParams0.c(), 0x20)) {
                    v3 -= appBarLayout$LayoutParams0.topMargin;
                    v4 += appBarLayout$LayoutParams0.bottomMargin;
                }
                if(v3 <= -v && v4 >= -v) {
                    return v2;
                }
            }
            return -1;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean u(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v, int v1, int v2, int v3) {
            return this.B0(coordinatorLayout0, ((AppBarLayout)view0), v, v1, v2, v3);
        }

        @Nullable
        private View u0(CoordinatorLayout coordinatorLayout0) {
            int v = coordinatorLayout0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = coordinatorLayout0.getChildAt(v1);
                if(((LayoutParams)view0.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return view0;
                }
            }
            return null;
        }

        int v0(@NonNull AppBarLayout appBarLayout0) {
            return -appBarLayout0.getDownNestedScrollRange() + appBarLayout0.getTopInset();
        }

        int w0(@NonNull AppBarLayout appBarLayout0) {
            return appBarLayout0.getTotalScrollRange();
        }

        private int x0(@NonNull AppBarLayout appBarLayout0, int v) {
            int v1 = Math.abs(v);
            int v2 = appBarLayout0.getChildCount();
            int v3 = 0;
            for(int v4 = 0; v4 < v2; ++v4) {
                View view0 = appBarLayout0.getChildAt(v4);
                com.google.android.material.appbar.AppBarLayout.LayoutParams appBarLayout$LayoutParams0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams)view0.getLayoutParams();
                Interpolator interpolator0 = appBarLayout$LayoutParams0.d();
                if(v1 >= view0.getTop() && v1 <= view0.getBottom()) {
                    if(interpolator0 == null) {
                        break;
                    }
                    int v5 = appBarLayout$LayoutParams0.c();
                    if((v5 & 1) != 0) {
                        v3 = view0.getHeight() + appBarLayout$LayoutParams0.topMargin + appBarLayout$LayoutParams0.bottomMargin;
                        if((v5 & 2) != 0) {
                            v3 -= ViewCompat.j0(view0);
                        }
                    }
                    if(ViewCompat.Y(view0)) {
                        v3 -= appBarLayout0.getTopInset();
                    }
                    if(v3 <= 0) {
                        break;
                    }
                    int v6 = Math.round(((float)v3) * interpolator0.getInterpolation(((float)(v1 - view0.getTop())) / ((float)v3)));
                    return Integer.signum(v) * (view0.getTop() + v6);
                }
            }
            return v;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void y(CoordinatorLayout coordinatorLayout0, @NonNull View view0, View view1, int v, int v1, int[] arr_v, int v2) {
            this.C0(coordinatorLayout0, ((AppBarLayout)view0), view1, v, v1, arr_v, v2);
        }

        @VisibleForTesting
        boolean y0() {
            return this.n != null && this.n.isRunning();
        }

        void z0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0) {
            this.N0(coordinatorLayout0, appBarLayout0);
            if(appBarLayout0.s()) {
                appBarLayout0.I(appBarLayout0.L(this.r0(coordinatorLayout0)));
            }
        }
    }

    public static class com.google.android.material.appbar.AppBarLayout.Behavior extends BaseBehavior {
        public static abstract class com.google.android.material.appbar.AppBarLayout.Behavior.a extends c {
        }

        public com.google.android.material.appbar.AppBarLayout.Behavior() {
        }

        public com.google.android.material.appbar.AppBarLayout.Behavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public boolean A0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, int v) {
            return super.A0(coordinatorLayout0, appBarLayout0, v);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public boolean B0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, int v, int v1, int v2, int v3) {
            return super.B0(coordinatorLayout0, appBarLayout0, v, v1, v2, v3);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public void C0(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, View view0, int v, int v1, int[] arr_v, int v2) {
            super.C0(coordinatorLayout0, appBarLayout0, view0, v, v1, arr_v, v2);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public void D0(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
            super.D0(coordinatorLayout0, appBarLayout0, view0, v, v1, v2, v3, v4, arr_v);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public void E0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, Parcelable parcelable0) {
            super.E0(coordinatorLayout0, appBarLayout0, parcelable0);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public Parcelable F0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0) {
            return super.F0(coordinatorLayout0, appBarLayout0);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public boolean G0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, @NonNull View view0, View view1, int v, int v1) {
            return super.G0(coordinatorLayout0, appBarLayout0, view0, view1, v, v1);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public void H0(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, View view0, int v) {
            super.H0(coordinatorLayout0, appBarLayout0, view0, v);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public void K0(@Nullable c appBarLayout$BaseBehavior$c0) {
            super.K0(appBarLayout$BaseBehavior$c0);
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        public boolean L(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
            return super.L(coordinatorLayout0, view0, motionEvent0);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public int N() {
            return super.N();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public int O() {
            return super.O();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean P() {
            return super.P();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean Q() {
            return super.Q();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public void S(boolean z) {
            super.S(z);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean T(int v) {
            return super.T(v);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean U(int v) {
            return super.U(v);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public void V(boolean z) {
            super.V(z);
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        public boolean s(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
            return super.s(coordinatorLayout0, view0, motionEvent0);
        }
    }

    public static class com.google.android.material.appbar.AppBarLayout.LayoutParams extends LinearLayout.LayoutParams {
        @RestrictTo({Scope.b})
        @Retention(RetentionPolicy.SOURCE)
        public @interface com.google.android.material.appbar.AppBarLayout.LayoutParams.a {
        }

        @RestrictTo({Scope.b})
        @Retention(RetentionPolicy.SOURCE)
        public @interface com.google.android.material.appbar.AppBarLayout.LayoutParams.b {
        }

        int a;
        private com.google.android.material.appbar.AppBarLayout.c b;
        Interpolator c;
        public static final int d = 0;
        public static final int e = 1;
        public static final int f = 2;
        public static final int g = 4;
        public static final int h = 8;
        public static final int i = 16;
        public static final int j = 0x20;
        static final int k = 5;
        static final int l = 17;
        static final int m = 10;
        public static final int n = 0;
        public static final int o = 1;

        public com.google.android.material.appbar.AppBarLayout.LayoutParams(int v, int v1) {
            super(v, v1);
            this.a = 1;
        }

        public com.google.android.material.appbar.AppBarLayout.LayoutParams(int v, int v1, float f) {
            super(v, v1, f);
            this.a = 1;
        }

        public com.google.android.material.appbar.AppBarLayout.LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.a = 1;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.AppBarLayout_Layout);
            this.a = typedArray0.getInt(styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            this.f(typedArray0.getInt(styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            if(typedArray0.hasValue(styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.c = AnimationUtils.loadInterpolator(context0, typedArray0.getResourceId(2, 0));
            }
            typedArray0.recycle();
        }

        public com.google.android.material.appbar.AppBarLayout.LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.a = 1;
        }

        public com.google.android.material.appbar.AppBarLayout.LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.a = 1;
        }

        @RequiresApi(19)
        public com.google.android.material.appbar.AppBarLayout.LayoutParams(LinearLayout.LayoutParams linearLayout$LayoutParams0) {
            super(linearLayout$LayoutParams0);
            this.a = 1;
        }

        @RequiresApi(19)
        public com.google.android.material.appbar.AppBarLayout.LayoutParams(@NonNull com.google.android.material.appbar.AppBarLayout.LayoutParams appBarLayout$LayoutParams0) {
            super(appBarLayout$LayoutParams0);
            this.a = appBarLayout$LayoutParams0.a;
            this.b = appBarLayout$LayoutParams0.b;
            this.c = appBarLayout$LayoutParams0.c;
        }

        @Nullable
        private com.google.android.material.appbar.AppBarLayout.c a(int v) {
            return v != 1 ? null : new d();
        }

        @Nullable
        public com.google.android.material.appbar.AppBarLayout.c b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }

        public Interpolator d() {
            return this.c;
        }

        boolean e() {
            return (this.a & 1) == 1 && (this.a & 10) != 0;
        }

        public void f(int v) {
            this.b = this.a(v);
        }

        public void g(@Nullable com.google.android.material.appbar.AppBarLayout.c appBarLayout$c0) {
            this.b = appBarLayout$c0;
        }

        public void h(int v) {
            this.a = v;
        }

        public void i(Interpolator interpolator0) {
            this.c = interpolator0;
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ScrollingViewBehavior_Layout);
            this.d0(typedArray0.getDimensionPixelSize(styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArray0.recycle();
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean E(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Rect rect0, boolean z) {
            AppBarLayout appBarLayout0 = this.f0(coordinatorLayout0.w(view0));
            if(appBarLayout0 != null) {
                Rect rect1 = new Rect(rect0);
                rect1.offset(view0.getLeft(), view0.getTop());
                int v = coordinatorLayout0.getWidth();
                int v1 = coordinatorLayout0.getHeight();
                this.d.set(0, 0, v, v1);
                if(!this.d.contains(rect1)) {
                    appBarLayout0.D(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public int N() {
            return super.N();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public int O() {
            return super.O();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean P() {
            return super.P();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean Q() {
            return super.Q();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public void S(boolean z) {
            super.S(z);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean T(int v) {
            return super.T(v);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean U(int v) {
            return super.U(v);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public void V(boolean z) {
            super.V(z);
        }

        @Override  // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @Nullable
        View W(@NonNull List list0) {
            return this.f0(list0);
        }

        @Override  // com.google.android.material.appbar.HeaderScrollingViewBehavior
        float Y(View view0) {
            if(view0 instanceof AppBarLayout) {
                int v = ((AppBarLayout)view0).getTotalScrollRange();
                int v1 = ((AppBarLayout)view0).getDownNestedPreScrollRange();
                int v2 = ScrollingViewBehavior.g0(((AppBarLayout)view0));
                if(v1 != 0 && v + v2 <= v1) {
                    return 0.0f;
                }
                int v3 = v - v1;
                return v3 == 0 ? 0.0f : ((float)v2) / ((float)v3) + 1.0f;
            }
            return 0.0f;
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.android.material.appbar.HeaderScrollingViewBehavior
        int a0(View view0) {
            return view0 instanceof AppBarLayout ? ((AppBarLayout)view0).getTotalScrollRange() : super.a0(view0);
        }

        @Nullable
        AppBarLayout f0(@NonNull List list0) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = (View)list0.get(v1);
                if(view0 instanceof AppBarLayout) {
                    return (AppBarLayout)view0;
                }
            }
            return null;
        }

        private static int g0(@NonNull AppBarLayout appBarLayout0) {
            Behavior coordinatorLayout$Behavior0 = ((LayoutParams)appBarLayout0.getLayoutParams()).f();
            return coordinatorLayout$Behavior0 instanceof BaseBehavior ? ((BaseBehavior)coordinatorLayout$Behavior0).b0() : 0;
        }

        private void h0(@NonNull View view0, @NonNull View view1) {
            Behavior coordinatorLayout$Behavior0 = ((LayoutParams)view1.getLayoutParams()).f();
            if(coordinatorLayout$Behavior0 instanceof BaseBehavior) {
                ViewCompat.l1(view0, view1.getBottom() - view0.getTop() + ((BaseBehavior)coordinatorLayout$Behavior0).l + this.b0() - this.X(view1));
            }
        }

        private void i0(View view0, View view1) {
            if(view1 instanceof AppBarLayout && ((AppBarLayout)view1).s()) {
                ((AppBarLayout)view1).I(((AppBarLayout)view1).L(view0));
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean m(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
            return view1 instanceof AppBarLayout;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
            this.h0(view0, view1);
            this.i0(view0, view1);
            return false;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void q(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
            if(view1 instanceof AppBarLayout) {
                ViewCompat.J1(coordinatorLayout0, null);
            }
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean t(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
            return super.t(coordinatorLayout0, view0, v);
        }

        @Override  // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public boolean u(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v, int v1, int v2, int v3) {
            return super.u(coordinatorLayout0, view0, v, v1, v2, v3);
        }
    }

    public interface com.google.android.material.appbar.AppBarLayout.b {
        void a(AppBarLayout arg1, int arg2);
    }

    public static abstract class com.google.android.material.appbar.AppBarLayout.c {
        public abstract void a(@NonNull AppBarLayout arg1, @NonNull View arg2, float arg3);
    }

    public static class d extends com.google.android.material.appbar.AppBarLayout.c {
        private final Rect a;
        private final Rect b;
        private static final float c = 0.3f;

        public d() {
            this.a = new Rect();
            this.b = new Rect();
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$c
        public void a(@NonNull AppBarLayout appBarLayout0, @NonNull View view0, float f) {
            d.b(this.a, appBarLayout0, view0);
            float f1 = ((float)this.a.top) - Math.abs(f);
            if(f1 <= 0.0f) {
                float f2 = MathUtils.d(Math.abs(f1 / ((float)this.a.height())), 0.0f, 1.0f);
                float f3 = -f1 - ((float)this.a.height()) * 0.3f * (1.0f - (1.0f - f2) * (1.0f - f2));
                view0.setTranslationY(f3);
                view0.getDrawingRect(this.b);
                this.b.offset(0, ((int)(-f3)));
                if(f3 >= ((float)this.b.height())) {
                    view0.setVisibility(4);
                }
                else {
                    view0.setVisibility(0);
                }
                ViewCompat.V1(view0, this.b);
                return;
            }
            ViewCompat.V1(view0, null);
            view0.setTranslationY(0.0f);
            view0.setVisibility(0);
        }

        private static void b(Rect rect0, AppBarLayout appBarLayout0, View view0) {
            view0.getDrawingRect(rect0);
            appBarLayout0.offsetDescendantRectToMyCoords(view0, rect0);
            rect0.offset(0, -appBarLayout0.getTopInset());
        }
    }

    public interface e {
        void a(@Dimension float arg1, @ColorInt int arg2);
    }

    public interface f extends com.google.android.material.appbar.AppBarLayout.b {
        @Override  // com.google.android.material.appbar.AppBarLayout$b
        void a(AppBarLayout arg1, int arg2);
    }

    static final int A = 1;
    static final int B = 2;
    static final int C = 4;
    static final int D = 8;
    private static final int E = 0;
    private static final int F = -1;
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    @Nullable
    private WindowInsetsCompat g;
    private List h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    @IdRes
    private int m;
    @Nullable
    private WeakReference n;
    private final boolean o;
    @Nullable
    private ValueAnimator p;
    @Nullable
    private ValueAnimator.AnimatorUpdateListener q;
    private final List r;
    private final long s;
    private final TimeInterpolator t;
    private int[] u;
    @Nullable
    private Drawable v;
    @Nullable
    private Integer w;
    private final float x;
    private com.google.android.material.appbar.AppBarLayout.Behavior y;
    static final int z;

    static {
        AppBarLayout.E = style.Widget_Design_AppBarLayout;
    }

    public AppBarLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public AppBarLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.appBarLayoutStyle);
    }

    public AppBarLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        class com.google.android.material.appbar.AppBarLayout.a implements OnApplyWindowInsetsListener {
            final AppBarLayout a;

            @Override  // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat a(View view0, WindowInsetsCompat windowInsetsCompat0) {
                return AppBarLayout.this.y(windowInsetsCompat0);
            }
        }

        int v1 = AppBarLayout.E;
        super(I1.a.c(context0, attributeSet0, v, v1), attributeSet0, v);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0;
        this.r = new ArrayList();
        Context context1 = this.getContext();
        boolean z = true;
        this.setOrientation(1);
        int v2 = Build.VERSION.SDK_INT;
        if(this.getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            j.a(this);
        }
        j.c(this, attributeSet0, v, v1);
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.AppBarLayout, v, v1, new int[0]);
        ViewCompat.R1(this, typedArray0.getDrawable(styleable.AppBarLayout_android_background));
        ColorStateList colorStateList0 = com.google.android.material.resources.d.a(context1, typedArray0, styleable.AppBarLayout_liftOnScrollColor);
        if(colorStateList0 == null) {
            z = false;
        }
        this.o = z;
        ColorStateList colorStateList1 = com.google.android.material.drawable.f.g(this.getBackground());
        if(colorStateList1 != null) {
            k k0 = new k();
            k0.p0(colorStateList1);
            if(colorStateList0 == null) {
                this.q(context1, k0);
            }
            else {
                this.p(k0, colorStateList1, colorStateList0);
            }
        }
        int v3 = this.getResources().getInteger(integer.app_bar_elevation_anim_duration);
        this.s = (long)com.google.android.material.motion.j.f(context1, attr.motionDurationMedium2, v3);
        this.t = com.google.android.material.motion.j.g(context1, attr.motionEasingStandardInterpolator, com.google.android.material.animation.b.a);
        if(typedArray0.hasValue(styleable.AppBarLayout_expanded)) {
            this.E(typedArray0.getBoolean(4, false), false, false);
        }
        if(typedArray0.hasValue(styleable.AppBarLayout_elevation)) {
            j.b(this, ((float)typedArray0.getDimensionPixelSize(3, 0)));
        }
        if(v2 >= 26) {
            if(typedArray0.hasValue(styleable.AppBarLayout_android_keyboardNavigationCluster)) {
                this.setKeyboardNavigationCluster(typedArray0.getBoolean(2, false));
            }
            if(typedArray0.hasValue(styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
                this.setTouchscreenBlocksFocus(typedArray0.getBoolean(1, false));
            }
        }
        this.x = this.getResources().getDimension(dimen.design_appbar_elevation);
        this.l = typedArray0.getBoolean(styleable.AppBarLayout_liftOnScroll, false);
        this.m = typedArray0.getResourceId(styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        this.setStatusBarForeground(typedArray0.getDrawable(styleable.AppBarLayout_statusBarForeground));
        typedArray0.recycle();
        ViewCompat.m2(this, (/* 缺少LAMBDA参数 */, WindowInsetsCompat windowInsetsCompat0) -> {
            WindowInsetsCompat windowInsetsCompat1 = ViewCompat.Y(AppBarLayout.this) ? windowInsetsCompat0 : null;
            if(!ObjectsCompat.a(AppBarLayout.this.g, windowInsetsCompat1)) {
                AppBarLayout.this.g = windowInsetsCompat1;
                AppBarLayout.this.O();
                AppBarLayout.this.requestLayout();
            }
            return windowInsetsCompat0;
        });
    }

    public void A(@Nullable com.google.android.material.appbar.AppBarLayout.b appBarLayout$b0) {
        List list0 = this.h;
        if(list0 != null && appBarLayout$b0 != null) {
            list0.remove(appBarLayout$b0);
        }
    }

    public void B(f appBarLayout$f0) {
        this.A(appBarLayout$f0);
    }

    void C() {
        this.f = 0;
    }

    public void D(boolean z, boolean z1) {
        this.E(z, z1, true);
    }

    // 去混淆评级： 低(20)
    private void E(boolean z, boolean z1, boolean z2) {
        this.f = (z ? 1 : 2) | (z1 ? 4 : 0) | (z2 ? 8 : 0);
        this.requestLayout();
    }

    public boolean F(boolean z) {
        this.i = true;
        return this.G(z);
    }

    private boolean G(boolean z) {
        if(this.j != z) {
            this.j = z;
            this.refreshDrawableState();
            return true;
        }
        return false;
    }

    public boolean H(boolean z) {
        return this.J(z, true);
    }

    boolean I(boolean z) {
        return this.J(z, !this.i);
    }

    boolean J(boolean z, boolean z1) {
        if(z1 && this.k != z) {
            float f = 0.0f;
            this.k = z;
            this.refreshDrawableState();
            if(this.t()) {
                if(this.o) {
                    if(z) {
                        f = 1.0f;
                    }
                    this.N((z ? 0.0f : 1.0f), f);
                    return true;
                }
                if(this.l) {
                    float f1 = z ? 0.0f : this.x;
                    if(z) {
                        f = this.x;
                    }
                    this.N(f1, f);
                }
            }
            return true;
        }
        return false;
    }

    private boolean K() {
        return this.v != null && this.getTopInset() > 0;
    }

    boolean L(@Nullable View view0) {
        View view1 = this.i(view0);
        if(view1 != null) {
            view0 = view1;
        }
        return view0 != null && (view0.canScrollVertically(-1) || view0.getScrollY() > 0);
    }

    private boolean M() {
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            return view0.getVisibility() != 8 && !ViewCompat.Y(view0);
        }
        return false;
    }

    private void N(float f, float f1) {
        ValueAnimator valueAnimator0 = this.p;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
        }
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{f, f1});
        this.p = valueAnimator1;
        valueAnimator1.setDuration(this.s);
        this.p.setInterpolator(this.t);
        ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0 = this.q;
        if(valueAnimator$AnimatorUpdateListener0 != null) {
            this.p.addUpdateListener(valueAnimator$AnimatorUpdateListener0);
        }
        this.p.start();
    }

    private void O() {
        this.setWillNotDraw(!this.K());
    }

    public void c(@NonNull e appBarLayout$e0) {
        this.r.add(appBarLayout$e0);
    }

    @Override  // android.widget.LinearLayout
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof com.google.android.material.appbar.AppBarLayout.LayoutParams;
    }

    public void d(@Nullable com.google.android.material.appbar.AppBarLayout.b appBarLayout$b0) {
        if(this.h == null) {
            this.h = new ArrayList();
        }
        if(appBarLayout$b0 != null && !this.h.contains(appBarLayout$b0)) {
            this.h.add(appBarLayout$b0);
        }
    }

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        super.draw(canvas0);
        if(this.K()) {
            int v = canvas0.save();
            canvas0.translate(0.0f, ((float)(-this.a)));
            this.v.draw(canvas0);
            canvas0.restoreToCount(v);
        }
    }

    @Override  // android.view.ViewGroup
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        Drawable drawable0 = this.v;
        if(drawable0 != null && drawable0.isStateful() && drawable0.setState(arr_v)) {
            this.invalidateDrawable(drawable0);
        }
    }

    public void e(f appBarLayout$f0) {
        this.d(appBarLayout$f0);
    }

    public void f() {
        this.r.clear();
    }

    private void g() {
        WeakReference weakReference0 = this.n;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.n = null;
    }

    @Override  // android.widget.LinearLayout
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.j();
    }

    @Override  // android.widget.LinearLayout
    protected LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return this.j();
    }

    @Override  // android.widget.LinearLayout
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.k(attributeSet0);
    }

    @Override  // android.widget.LinearLayout
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.l(viewGroup$LayoutParams0);
    }

    @Override  // android.widget.LinearLayout
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.k(attributeSet0);
    }

    @Override  // android.widget.LinearLayout
    protected LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.l(viewGroup$LayoutParams0);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        com.google.android.material.appbar.AppBarLayout.Behavior appBarLayout$Behavior0 = new com.google.android.material.appbar.AppBarLayout.Behavior();
        this.y = appBarLayout$Behavior0;
        return appBarLayout$Behavior0;
    }

    int getDownNestedPreScrollRange() {
        int v6;
        int v = this.c;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount() - 1;
        int v2 = 0;
        while(v1 >= 0) {
            View view0 = this.getChildAt(v1);
            if(view0.getVisibility() != 8) {
                com.google.android.material.appbar.AppBarLayout.LayoutParams appBarLayout$LayoutParams0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams)view0.getLayoutParams();
                int v3 = view0.getMeasuredHeight();
                int v4 = appBarLayout$LayoutParams0.a;
                if((v4 & 5) == 5) {
                    int v5 = appBarLayout$LayoutParams0.topMargin + appBarLayout$LayoutParams0.bottomMargin;
                    if((v4 & 8) == 0) {
                        v6 = (v4 & 2) == 0 ? v5 + v3 : v5 + (v3 - ViewCompat.j0(view0));
                    }
                    else {
                        v6 = v5 + ViewCompat.j0(view0);
                    }
                    if(v1 == 0 && ViewCompat.Y(view0)) {
                        v6 = Math.min(v6, v3 - this.getTopInset());
                    }
                    v2 += v6;
                }
                else {
                    if(v2 <= 0) {
                        goto label_22;
                    }
                    break;
                }
            }
        label_22:
            --v1;
        }
        int v7 = Math.max(0, v2);
        this.c = v7;
        return v7;
    }

    int getDownNestedScrollRange() {
        int v = this.d;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = this.getChildAt(v2);
            if(view0.getVisibility() != 8) {
                com.google.android.material.appbar.AppBarLayout.LayoutParams appBarLayout$LayoutParams0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams)view0.getLayoutParams();
                int v4 = view0.getMeasuredHeight() + (appBarLayout$LayoutParams0.topMargin + appBarLayout$LayoutParams0.bottomMargin);
                int v5 = appBarLayout$LayoutParams0.a;
                if((v5 & 1) == 0) {
                    break;
                }
                v3 += v4;
                if((v5 & 2) != 0) {
                    v3 -= ViewCompat.j0(view0);
                    break;
                }
            }
        }
        int v6 = Math.max(0, v3);
        this.d = v6;
        return v6;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.m;
    }

    @Nullable
    public k getMaterialShapeBackground() {
        Drawable drawable0 = this.getBackground();
        return drawable0 instanceof k ? ((k)drawable0) : null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int v = this.getTopInset();
        int v1 = ViewCompat.j0(this);
        if(v1 != 0) {
            return v1 * 2 + v;
        }
        int v2 = this.getChildCount();
        v1 = v2 < 1 ? 0 : ViewCompat.j0(this.getChildAt(v2 - 1));
        return v1 == 0 ? this.getHeight() / 3 : v1 * 2 + v;
    }

    int getPendingAction() {
        return this.f;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    final int getTopInset() {
        return this.g == null ? 0 : this.g.r();
    }

    public final int getTotalScrollRange() {
        int v = this.b;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = this.getChildAt(v2);
            if(view0.getVisibility() != 8) {
                com.google.android.material.appbar.AppBarLayout.LayoutParams appBarLayout$LayoutParams0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams)view0.getLayoutParams();
                int v4 = view0.getMeasuredHeight();
                int v5 = appBarLayout$LayoutParams0.a;
                if((v5 & 1) == 0) {
                    break;
                }
                v3 += v4 + appBarLayout$LayoutParams0.topMargin + appBarLayout$LayoutParams0.bottomMargin;
                v3 = v2 != 0 || !ViewCompat.Y(view0) ? v3 + (v4 + appBarLayout$LayoutParams0.topMargin + appBarLayout$LayoutParams0.bottomMargin) : v3 - this.getTopInset();
                if((v5 & 2) != 0) {
                    v3 -= ViewCompat.j0(view0);
                    break;
                }
            }
        }
        int v6 = Math.max(0, v3);
        this.b = v6;
        return v6;
    }

    int getUpNestedPreScrollRange() {
        return this.getTotalScrollRange();
    }

    @Nullable
    private Integer h() {
        Drawable drawable0 = this.v;
        if(drawable0 instanceof k) {
            return ((k)drawable0).E();
        }
        ColorStateList colorStateList0 = com.google.android.material.drawable.f.g(drawable0);
        return colorStateList0 == null ? null : colorStateList0.getDefaultColor();
    }

    @Nullable
    private View i(@Nullable View view0) {
        if(this.n == null) {
            int v = this.m;
            if(v != -1) {
                View view1 = view0 == null ? null : view0.findViewById(v);
                if(view1 == null && this.getParent() instanceof ViewGroup) {
                    view1 = ((ViewGroup)this.getParent()).findViewById(this.m);
                }
                if(view1 != null) {
                    this.n = new WeakReference(view1);
                }
            }
        }
        return this.n == null ? null : ((View)this.n.get());
    }

    protected com.google.android.material.appbar.AppBarLayout.LayoutParams j() {
        return new com.google.android.material.appbar.AppBarLayout.LayoutParams(-1, -2);
    }

    public com.google.android.material.appbar.AppBarLayout.LayoutParams k(AttributeSet attributeSet0) {
        return new com.google.android.material.appbar.AppBarLayout.LayoutParams(this.getContext(), attributeSet0);
    }

    protected com.google.android.material.appbar.AppBarLayout.LayoutParams l(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams) {
            return new com.google.android.material.appbar.AppBarLayout.LayoutParams(((LinearLayout.LayoutParams)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new com.google.android.material.appbar.AppBarLayout.LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new com.google.android.material.appbar.AppBarLayout.LayoutParams(viewGroup$LayoutParams0);
    }

    boolean m() {
        return this.e;
    }

    private boolean n() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((com.google.android.material.appbar.AppBarLayout.LayoutParams)this.getChildAt(v1).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    boolean o() {
        return this.getTotalScrollRange() != 0;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.e(this);
    }

    @Override  // android.view.ViewGroup
    protected int[] onCreateDrawableState(int v) {
        if(this.u == null) {
            this.u = new int[4];
        }
        int[] arr_v = this.u;
        int[] arr_v1 = super.onCreateDrawableState(v + arr_v.length);
        boolean z = this.j;
        arr_v[0] = z ? attr.state_liftable : 0x80FBFA1C;
        arr_v[1] = !z || !this.k ? -attr.state_lifted : attr.state_lifted;
        arr_v[2] = z ? attr.state_collapsible : 0x80FBFA20;
        arr_v[3] = !z || !this.k ? -attr.state_collapsed : attr.state_collapsed;
        return View.mergeDrawableStates(arr_v1, arr_v);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g();
    }

    @Override  // android.widget.LinearLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        boolean z1 = true;
        if(ViewCompat.Y(this) && this.M()) {
            int v4 = this.getTopInset();
            for(int v5 = this.getChildCount() - 1; v5 >= 0; --v5) {
                ViewCompat.l1(this.getChildAt(v5), v4);
            }
        }
        this.r();
        this.e = false;
        int v6 = this.getChildCount();
        for(int v7 = 0; v7 < v6; ++v7) {
            if(((com.google.android.material.appbar.AppBarLayout.LayoutParams)this.getChildAt(v7).getLayoutParams()).d() != null) {
                this.e = true;
                break;
            }
        }
        Drawable drawable0 = this.v;
        if(drawable0 != null) {
            drawable0.setBounds(0, 0, this.getWidth(), this.getTopInset());
        }
        if(!this.i) {
            if(!this.l && !this.n()) {
                z1 = false;
            }
            this.G(z1);
        }
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = View.MeasureSpec.getMode(v1);
        if(v2 != 0x40000000 && ViewCompat.Y(this) && this.M()) {
            int v3 = this.getMeasuredHeight();
            switch(v2) {
                case 0x80000000: {
                    v3 = MathUtils.e(this.getMeasuredHeight() + this.getTopInset(), 0, View.MeasureSpec.getSize(v1));
                    break;
                }
                case 0: {
                    v3 += this.getTopInset();
                }
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), v3);
        }
        this.r();
    }

    private void p(k k0, @NonNull ColorStateList colorStateList0, @NonNull ColorStateList colorStateList1) {
        this.q = (ValueAnimator valueAnimator0) -> {
            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            int v = v.t(colorStateList0.getDefaultColor(), colorStateList1.getDefaultColor(), f);
            k0.p0(ColorStateList.valueOf(v));
            if(this.v != null && (this.w != null && this.w.equals(v.f(this.getContext(), attr.colorSurface)))) {
                DrawableCompat.n(this.v, v);
            }
            if(!this.r.isEmpty()) {
                for(Object object0: this.r) {
                    e appBarLayout$e0 = (e)object0;
                    if(k0.z() != null) {
                        appBarLayout$e0.a(0.0f, v);
                    }
                }
            }
        };
        ViewCompat.R1(this, k0);
    }

    private void q(Context context0, k k0) {
        k0.a0(context0);
        this.q = (ValueAnimator valueAnimator0) -> {
            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            k0.o0(f);
            Drawable drawable0 = this.v;
            if(drawable0 instanceof k) {
                ((k)drawable0).o0(f);
            }
            for(Object object0: this.r) {
                ((e)object0).a(f, k0.E());
            }
        };
        ViewCompat.R1(this, k0);
    }

    private void r() {
        SavedState appBarLayout$BaseBehavior$SavedState0 = this.y == null || this.b == -1 || this.f != 0 ? null : this.y.J0(AbsSavedState.b, this);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if(appBarLayout$BaseBehavior$SavedState0 != null) {
            this.y.I0(appBarLayout$BaseBehavior$SavedState0, false);
        }
    }

    public boolean s() {
        return this.l;
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        l.d(this, f);
    }

    public void setExpanded(boolean z) {
        this.D(z, ViewCompat.a1(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.l = z;
    }

    public void setLiftOnScrollTargetView(@Nullable View view0) {
        this.m = -1;
        if(view0 == null) {
            this.g();
            return;
        }
        this.n = new WeakReference(view0);
    }

    public void setLiftOnScrollTargetViewId(@IdRes int v) {
        this.m = v;
        this.g();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.i = z;
    }

    @Override  // android.widget.LinearLayout
    public void setOrientation(int v) {
        if(v != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    public void setStatusBarForeground(@Nullable Drawable drawable0) {
        Drawable drawable1 = null;
        Drawable drawable2 = this.v;
        if(drawable2 != drawable0) {
            if(drawable2 != null) {
                drawable2.setCallback(null);
            }
            if(drawable0 != null) {
                drawable1 = drawable0.mutate();
            }
            this.v = drawable1;
            this.w = this.h();
            Drawable drawable3 = this.v;
            if(drawable3 != null) {
                if(drawable3.isStateful()) {
                    this.v.setState(this.getDrawableState());
                }
                DrawableCompat.m(this.v, ViewCompat.e0(this));
                this.v.setVisible(this.getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            this.O();
            ViewCompat.v1(this);
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int v) {
        this.setStatusBarForeground(new ColorDrawable(v));
    }

    public void setStatusBarForegroundResource(@DrawableRes int v) {
        this.setStatusBarForeground(AppCompatResources.b(this.getContext(), v));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        j.b(this, f);
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        Drawable drawable0 = this.v;
        if(drawable0 != null) {
            drawable0.setVisible(v == 0, false);
        }
    }

    private boolean t() {
        return this.getBackground() instanceof k;
    }

    public boolean u() {
        return this.k;
    }

    // 检测为 Lambda 实现
    private void v(ColorStateList colorStateList0, ColorStateList colorStateList1, k k0, Integer integer0, ValueAnimator valueAnimator0) [...]

    @Override  // android.view.View
    protected boolean verifyDrawable(@NonNull Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.v;
    }

    // 检测为 Lambda 实现
    private void w(k k0, ValueAnimator valueAnimator0) [...]

    void x(int v) {
        this.a = v;
        if(!this.willNotDraw()) {
            ViewCompat.v1(this);
        }
        List list0 = this.h;
        if(list0 != null) {
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                com.google.android.material.appbar.AppBarLayout.b appBarLayout$b0 = (com.google.android.material.appbar.AppBarLayout.b)this.h.get(v2);
                if(appBarLayout$b0 != null) {
                    appBarLayout$b0.a(this, v);
                }
            }
        }
    }

    // 检测为 Lambda 实现
    WindowInsetsCompat y(WindowInsetsCompat windowInsetsCompat0) [...]

    public boolean z(@NonNull e appBarLayout$e0) {
        return this.r.remove(appBarLayout$e0);
    }
}

