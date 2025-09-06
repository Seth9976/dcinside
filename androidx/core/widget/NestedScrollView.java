package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.R.attr;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollFeedbackProviderCompat;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements NestedScrollingChild3, NestedScrollingParent3, ScrollingView {
    static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void f(View view0, AccessibilityEvent accessibilityEvent0) {
            super.f(view0, accessibilityEvent0);
            accessibilityEvent0.setClassName("android.widget.ScrollView");
            accessibilityEvent0.setScrollable(((NestedScrollView)view0).getScrollRange() > 0);
            accessibilityEvent0.setScrollX(((NestedScrollView)view0).getScrollX());
            accessibilityEvent0.setScrollY(((NestedScrollView)view0).getScrollY());
            AccessibilityRecordCompat.N(accessibilityEvent0, ((NestedScrollView)view0).getScrollX());
            AccessibilityRecordCompat.P(accessibilityEvent0, ((NestedScrollView)view0).getScrollRange());
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            super.g(view0, accessibilityNodeInfoCompat0);
            accessibilityNodeInfoCompat0.k1("android.widget.ScrollView");
            if(((NestedScrollView)view0).isEnabled()) {
                int v = ((NestedScrollView)view0).getScrollRange();
                if(v > 0) {
                    accessibilityNodeInfoCompat0.Z1(true);
                    if(((NestedScrollView)view0).getScrollY() > 0) {
                        accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.s);
                        accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.D);
                    }
                    if(((NestedScrollView)view0).getScrollY() < v) {
                        accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.r);
                        accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.F);
                    }
                }
            }
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public boolean j(View view0, int v, Bundle bundle0) {
            if(super.j(view0, v, bundle0)) {
                return true;
            }
            if(!((NestedScrollView)view0).isEnabled()) {
                return false;
            }
            int v1 = ((NestedScrollView)view0).getHeight();
            Rect rect0 = new Rect();
            if(((NestedScrollView)view0).getMatrix().isIdentity() && ((NestedScrollView)view0).getGlobalVisibleRect(rect0)) {
                v1 = rect0.height();
            }
            switch(v) {
                case 0x2000: 
                case 0x1020038: {
                    int v5 = ((NestedScrollView)view0).getPaddingBottom();
                    int v6 = ((NestedScrollView)view0).getPaddingTop();
                    int v7 = Math.max(((NestedScrollView)view0).getScrollY() - (v1 - v5 - v6), 0);
                    if(v7 != ((NestedScrollView)view0).getScrollY()) {
                        ((NestedScrollView)view0).Z(0, v7, true);
                        return true;
                    }
                    return false;
                }
                case 0x1000: 
                case 0x102003A: {
                    int v2 = ((NestedScrollView)view0).getPaddingBottom();
                    int v3 = ((NestedScrollView)view0).getPaddingTop();
                    int v4 = Math.min(((NestedScrollView)view0).getScrollY() + (v1 - v2 - v3), ((NestedScrollView)view0).getScrollRange());
                    if(v4 != ((NestedScrollView)view0).getScrollY()) {
                        ((NestedScrollView)view0).Z(0, v4, true);
                        return true;
                    }
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
    }

    @RequiresApi(21)
    static class Api21Impl {
        static boolean a(ViewGroup viewGroup0) {
            return viewGroup0.getClipToPadding();
        }
    }

    @RequiresApi(35)
    static final class Api35Impl {
        public static void a(View view0, float f) {
            try {
                view0.setFrameContentVelocity(f);
            }
            catch(LinkageError unused_ex) {
            }
        }
    }

    class DifferentialMotionFlingTargetImpl implements DifferentialMotionFlingTarget {
        final NestedScrollView a;

        @Override  // androidx.core.view.DifferentialMotionFlingTarget
        public float a() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override  // androidx.core.view.DifferentialMotionFlingTarget
        public boolean b(float f) {
            if(f == 0.0f) {
                return false;
            }
            this.c();
            NestedScrollView.this.r(((int)f));
            return true;
        }

        @Override  // androidx.core.view.DifferentialMotionFlingTarget
        public void c() {
            NestedScrollView.this.d.abortAnimation();
        }
    }

    public interface OnScrollChangeListener {
        void a(NestedScrollView arg1, int arg2, int arg3, int arg4, int arg5);
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR;
        public int a;

        static {
            SavedState.CREATOR = new Parcelable.Creator() {
                public SavedState a(Parcel parcel0) {
                    return new SavedState(parcel0);
                }

                public SavedState[] b(int v) {
                    return new SavedState[v];
                }

                @Override  // android.os.Parcelable$Creator
                public Object createFromParcel(Parcel parcel0) {
                    return this.a(parcel0);
                }

                @Override  // android.os.Parcelable$Creator
                public Object[] newArray(int v) {
                    return this.b(v);
                }
            };
        }

        SavedState(Parcel parcel0) {
            super(parcel0);
            this.a = parcel0.readInt();
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
        }

        @Override  // android.view.View$BaseSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.a);
        }
    }

    private float A;
    private OnScrollChangeListener B;
    @VisibleForTesting
    final DifferentialMotionFlingTargetImpl C;
    @VisibleForTesting
    DifferentialMotionFlingController D;
    static final int E = 0xFA;
    static final float F = 0.5f;
    private static final String G = "NestedScrollView";
    private static final int H = 0xFA;
    private static final float I = 0.015f;
    private static final float J = 0.35f;
    private static final float K = 0.0f;
    private static final float L = 4.0f;
    private static final int M = -1;
    private static final AccessibilityDelegate N;
    private static final int[] O;
    private final float a;
    private long b;
    private final Rect c;
    private OverScroller d;
    @RestrictTo({Scope.a})
    @VisibleForTesting
    public EdgeEffect e;
    @RestrictTo({Scope.a})
    @VisibleForTesting
    public EdgeEffect f;
    @VisibleForTesting
    ScrollFeedbackProviderCompat g;
    private int h;
    private boolean i;
    private boolean j;
    private View k;
    private boolean l;
    private VelocityTracker m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final int[] t;
    private final int[] u;
    private int v;
    private int w;
    private SavedState x;
    private final NestedScrollingParentHelper y;
    private final NestedScrollingChildHelper z;

    static {
        NestedScrollView.K = 2.358202f;
        NestedScrollView.N = new AccessibilityDelegate();
        NestedScrollView.O = new int[]{0x101017A};
    }

    public NestedScrollView(Context context0) {
        this(context0, null);
    }

    public NestedScrollView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c = new Rect();
        this.i = true;
        this.j = false;
        this.k = null;
        this.l = false;
        this.o = true;
        this.s = -1;
        this.t = new int[2];
        this.u = new int[2];
        DifferentialMotionFlingTargetImpl nestedScrollView$DifferentialMotionFlingTargetImpl0 = new DifferentialMotionFlingTargetImpl(this);
        this.C = nestedScrollView$DifferentialMotionFlingTargetImpl0;
        this.D = new DifferentialMotionFlingController(this.getContext(), nestedScrollView$DifferentialMotionFlingTargetImpl0);
        this.e = EdgeEffectCompat.a(context0, attributeSet0);
        this.f = EdgeEffectCompat.a(context0, attributeSet0);
        this.a = context0.getResources().getDisplayMetrics().density * 51890.199219f;
        this.y();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, NestedScrollView.O, v, 0);
        this.setFillViewport(typedArray0.getBoolean(0, false));
        typedArray0.recycle();
        this.y = new NestedScrollingParentHelper(this);
        this.z = new NestedScrollingChildHelper(this);
        this.setNestedScrollingEnabled(true);
        ViewCompat.J1(this, NestedScrollView.N);
    }

    private void A(int v, int v1) {
        this.h = v;
        this.s = v1;
        this.startNestedScroll(2, 0);
    }

    public boolean B() {
        return this.n;
    }

    private boolean C(View view0) {
        return !this.F(view0, 0, this.getHeight());
    }

    public boolean D() {
        return this.o;
    }

    private static boolean E(View view0, View view1) {
        if(view0 == view1) {
            return true;
        }
        ViewParent viewParent0 = view0.getParent();
        return viewParent0 instanceof ViewGroup && NestedScrollView.E(((View)viewParent0), view1);
    }

    private boolean F(View view0, int v, int v1) {
        view0.getDrawingRect(this.c);
        this.offsetDescendantRectToMyCoords(view0, this.c);
        return this.c.bottom + v >= this.getScrollY() && this.c.top - v <= this.getScrollY() + v1;
    }

    private void G(int v, int v1, int[] arr_v) {
        int v2 = this.getScrollY();
        this.scrollBy(0, v);
        int v3 = this.getScrollY() - v2;
        if(arr_v != null) {
            arr_v[1] += v3;
        }
        this.z.e(0, v3, 0, v - v3, null, v1, arr_v);
    }

    private void H(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionIndex();
        if(motionEvent0.getPointerId(v) == this.s) {
            int v1 = v == 0 ? 1 : 0;
            this.h = (int)motionEvent0.getY(v1);
            this.s = motionEvent0.getPointerId(v1);
            VelocityTracker velocityTracker0 = this.m;
            if(velocityTracker0 != null) {
                velocityTracker0.clear();
            }
        }
    }

    boolean I(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, boolean z) {
        boolean z2;
        boolean z1;
        int v8 = this.getOverScrollMode();
        int v9 = v2 + v;
        int v10 = v8 == 0 || v8 == 1 && this.computeHorizontalScrollRange() > this.computeHorizontalScrollExtent() ? v6 : 0;
        int v11 = v3 + v1;
        int v12 = v8 == 0 || v8 == 1 && this.computeVerticalScrollRange() > this.computeVerticalScrollExtent() ? v7 : 0;
        int v13 = v10 + v4;
        int v14 = v12 + v5;
        if(v9 > v13) {
            v9 = v13;
            z1 = true;
        }
        else if(v9 < -v10) {
            v9 = -v10;
            z1 = true;
        }
        else {
            z1 = false;
        }
        if(v11 > v14) {
            v11 = v14;
            z2 = true;
        }
        else if(v11 < -v12) {
            v11 = -v12;
            z2 = true;
        }
        else {
            z2 = false;
        }
        if(z2 && !this.hasNestedScrollingParent(1)) {
            this.d.springBack(v9, v11, 0, 0, 0, this.getScrollRange());
        }
        this.onOverScrolled(v9, v11, z1, z2);
        return z1 || z2;
    }

    public boolean J(int v) {
        int v1 = this.getHeight();
        if(v == 130) {
            this.c.top = this.getScrollY() + v1;
            int v2 = this.getChildCount();
            if(v2 > 0) {
                View view0 = this.getChildAt(v2 - 1);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
                int v3 = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin + this.getPaddingBottom();
                Rect rect0 = this.c;
                if(rect0.top + v1 > v3) {
                    rect0.top = v3 - v1;
                }
            }
        }
        else {
            this.c.top = this.getScrollY() - v1;
            Rect rect1 = this.c;
            if(rect1.top < 0) {
                rect1.top = 0;
            }
        }
        int v4 = v1 + this.c.top;
        this.c.bottom = v4;
        return this.N(v, this.c.top, v4);
    }

    private void K() {
        VelocityTracker velocityTracker0 = this.m;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.m = null;
        }
    }

    private int L(int v, float f) {
        float f4;
        float f1 = f / ((float)this.getWidth());
        float f2 = ((float)v) / ((float)this.getHeight());
        float f3 = 0.0f;
        if(EdgeEffectCompat.d(this.e) != 0.0f) {
            f4 = -EdgeEffectCompat.j(this.e, -f2, f1);
            if(EdgeEffectCompat.d(this.e) == 0.0f) {
                this.e.onRelease();
            }
            f3 = f4;
        }
        else if(EdgeEffectCompat.d(this.f) != 0.0f) {
            f4 = EdgeEffectCompat.j(this.f, f2, 1.0f - f1);
            if(EdgeEffectCompat.d(this.f) == 0.0f) {
                this.f.onRelease();
            }
            f3 = f4;
        }
        int v1 = Math.round(f3 * ((float)this.getHeight()));
        if(v1 != 0) {
            this.invalidate();
        }
        return v1;
    }

    private void M(boolean z) {
        if(z) {
            this.startNestedScroll(2, 1);
        }
        else {
            this.stopNestedScroll(1);
        }
        this.w = this.getScrollY();
        this.postInvalidateOnAnimation();
    }

    private boolean N(int v, int v1, int v2) {
        int v3 = this.getHeight();
        int v4 = this.getScrollY();
        int v5 = v3 + v4;
        boolean z = false;
        View view0 = this.q(v == 33, v1, v2);
        if(view0 == null) {
            view0 = this;
        }
        if(v1 < v4 || v2 > v5) {
            this.O((v == 33 ? v2 - v5 : v1 - v4), 0, 1, true);
            z = true;
        }
        if(view0 != this.findFocus()) {
            view0.requestFocus(v);
        }
        return z;
    }

    private int O(int v, int v1, int v2, boolean z) {
        return this.P(v, -1, null, v1, v2, z);
    }

    @VisibleForTesting
    int P(int v, int v1, MotionEvent motionEvent0, int v2, int v3, boolean z) {
        int v6;
        int v5;
        if(v3 == 1) {
            this.startNestedScroll(2, 1);
        }
        int v4 = 0;
        if(this.dispatchNestedPreScroll(0, v, this.u, this.t, v3)) {
            v5 = v - this.u[1];
            v6 = this.t[1];
        }
        else {
            v5 = v;
            v6 = 0;
        }
        int v7 = this.getScrollY();
        int v8 = this.getScrollRange();
        boolean z1 = this.e() && !z;
        int v9 = !this.I(0, v5, 0, v7, 0, v8, 0, 0, true) || this.hasNestedScrollingParent(v3) ? 0 : 1;
        int v10 = this.getScrollY() - v7;
        if(motionEvent0 != null && v10 != 0) {
            this.getScrollFeedbackProvider().c(motionEvent0.getDeviceId(), motionEvent0.getSource(), v1, v10);
        }
        this.u[1] = 0;
        this.dispatchNestedScroll(0, v10, 0, v5 - v10, this.t, v3, this.u);
        int v11 = v6 + this.t[1];
        int v12 = v5 - this.u[1];
        int v13 = v7 + v12;
        if(v13 >= 0) {
            if(v13 > v8 && z1) {
                EdgeEffectCompat.j(this.f, ((float)v12) / ((float)this.getHeight()), 1.0f - ((float)v2) / ((float)this.getWidth()));
                if(motionEvent0 != null) {
                    this.getScrollFeedbackProvider().b(motionEvent0.getDeviceId(), motionEvent0.getSource(), v1, false);
                }
                if(!this.e.isFinished()) {
                    this.e.onRelease();
                }
            }
        }
        else if(z1) {
            EdgeEffectCompat.j(this.e, ((float)(-v12)) / ((float)this.getHeight()), ((float)v2) / ((float)this.getWidth()));
            if(motionEvent0 != null) {
                this.getScrollFeedbackProvider().b(motionEvent0.getDeviceId(), motionEvent0.getSource(), v1, true);
            }
            if(!this.f.isFinished()) {
                this.f.onRelease();
            }
        }
        if(!this.e.isFinished() || !this.f.isFinished()) {
            this.postInvalidateOnAnimation();
        }
        else {
            v4 = v9;
        }
        if(v4 != 0 && v3 == 0) {
            VelocityTracker velocityTracker0 = this.m;
            if(velocityTracker0 != null) {
                velocityTracker0.clear();
            }
        }
        if(v3 == 1) {
            this.stopNestedScroll(1);
            this.e.onRelease();
            this.f.onRelease();
        }
        return v11;
    }

    private void Q(View view0) {
        view0.getDrawingRect(this.c);
        this.offsetDescendantRectToMyCoords(view0, this.c);
        int v = this.h(this.c);
        if(v != 0) {
            this.scrollBy(0, v);
        }
    }

    private boolean R(Rect rect0, boolean z) {
        int v = this.h(rect0);
        if(v != 0) {
            if(z) {
                this.scrollBy(0, v);
                return true;
            }
            this.T(0, v);
        }
        return v != 0;
    }

    private boolean S(EdgeEffect edgeEffect0, int v) {
        return v <= 0 ? this.v(-v) < EdgeEffectCompat.d(edgeEffect0) * ((float)this.getHeight()) : true;
    }

    public final void T(int v, int v1) {
        this.V(v, v1, 0xFA, false);
    }

    public final void U(int v, int v1, int v2) {
        this.V(v, v1, v2, false);
    }

    private void V(int v, int v1, int v2, boolean z) {
        if(this.getChildCount() == 0) {
            return;
        }
        if(AnimationUtils.currentAnimationTimeMillis() - this.b > 0xFAL) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            int v3 = view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin;
            int v4 = this.getHeight();
            int v5 = this.getPaddingTop();
            int v6 = this.getPaddingBottom();
            int v7 = this.getScrollY();
            this.d.startScroll(this.getScrollX(), v7, 0, Math.max(0, Math.min(v1 + v7, Math.max(0, v3 - (v4 - v5 - v6)))) - v7, v2);
            this.M(z);
        }
        else {
            if(!this.d.isFinished()) {
                this.b();
            }
            this.scrollBy(v, v1);
        }
        this.b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void W(int v, int v1) {
        this.Y(v, v1, 0xFA, false);
    }

    public final void X(int v, int v1, int v2) {
        this.Y(v, v1, v2, false);
    }

    void Y(int v, int v1, int v2, boolean z) {
        this.V(v - this.getScrollX(), v1 - this.getScrollY(), v2, z);
    }

    void Z(int v, int v1, boolean z) {
        this.Y(v, v1, 0xFA, z);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void a(View view0, View view1, int v, int v1) {
        this.y.c(view0, view1, v, v1);
        this.startNestedScroll(2, v1);
    }

    private boolean a0(MotionEvent motionEvent0) {
        boolean z;
        if(EdgeEffectCompat.d(this.e) == 0.0f) {
            z = false;
        }
        else {
            EdgeEffectCompat.j(this.e, 0.0f, motionEvent0.getX() / ((float)this.getWidth()));
            z = true;
        }
        if(EdgeEffectCompat.d(this.f) != 0.0f) {
            EdgeEffectCompat.j(this.f, 0.0f, 1.0f - motionEvent0.getX() / ((float)this.getWidth()));
            return true;
        }
        return z;
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0, v);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0, viewGroup$LayoutParams0);
    }

    private void b() {
        this.d.abortAnimation();
        this.stopNestedScroll(1);
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    @RestrictTo({Scope.c})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    @RestrictTo({Scope.c})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    @RestrictTo({Scope.c})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override  // android.view.View
    public void computeScroll() {
        if(this.d.isFinished()) {
            return;
        }
        this.d.computeScrollOffset();
        int v = this.d.getCurrY();
        int v1 = this.i(v - this.w);
        this.w = v;
        this.u[1] = 0;
        this.dispatchNestedPreScroll(0, v1, this.u, null, 1);
        int v2 = v1 - this.u[1];
        int v3 = this.getScrollRange();
        if(Build.VERSION.SDK_INT >= 35) {
            Api35Impl.a(this, Math.abs(this.d.getCurrVelocity()));
        }
        if(v2 != 0) {
            int v4 = this.getScrollY();
            this.I(0, v2, this.getScrollX(), v4, 0, v3, 0, 0, false);
            int v5 = this.getScrollY() - v4;
            int v6 = v2 - v5;
            this.u[1] = 0;
            this.dispatchNestedScroll(0, v5, 0, v6, this.t, 1, this.u);
            v2 = v6 - this.u[1];
        }
        if(v2 != 0) {
            int v7 = this.getOverScrollMode();
            if(v7 == 0 || v7 == 1 && v3 > 0) {
                if(v2 >= 0) {
                    if(this.f.isFinished()) {
                        this.f.onAbsorb(((int)this.d.getCurrVelocity()));
                    }
                }
                else if(this.e.isFinished()) {
                    this.e.onAbsorb(((int)this.d.getCurrVelocity()));
                }
            }
            this.b();
        }
        if(!this.d.isFinished()) {
            this.postInvalidateOnAnimation();
            return;
        }
        this.stopNestedScroll(1);
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    @RestrictTo({Scope.c})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    @RestrictTo({Scope.c})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    @RestrictTo({Scope.c})
    public int computeVerticalScrollRange() {
        int v = this.getChildCount();
        int v1 = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
        if(v == 0) {
            return v1;
        }
        View view0 = this.getChildAt(0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        int v2 = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin;
        int v3 = this.getScrollY();
        int v4 = Math.max(0, v2 - v1);
        if(v3 < 0) {
            return v2 - v3;
        }
        return v3 <= v4 ? v2 : v2 + (v3 - v4);
    }

    public boolean d(int v) {
        View view0 = this.findFocus();
        if(view0 == this) {
            view0 = null;
        }
        View view1 = FocusFinder.getInstance().findNextFocus(this, view0, v);
        int v1 = this.getMaxScrollAmount();
        if(view1 == null || !this.F(view1, v1, this.getHeight())) {
            if(v == 33 && this.getScrollY() < v1) {
                v1 = this.getScrollY();
            }
            else if(v == 130 && this.getChildCount() > 0) {
                View view2 = this.getChildAt(0);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view2.getLayoutParams();
                v1 = Math.min(view2.getBottom() + frameLayout$LayoutParams0.bottomMargin - (this.getScrollY() + this.getHeight() - this.getPaddingBottom()), v1);
            }
            if(v1 == 0) {
                return false;
            }
            if(v != 130) {
                v1 = -v1;
            }
            this.O(v1, 0, 1, true);
        }
        else {
            view1.getDrawingRect(this.c);
            this.offsetDescendantRectToMyCoords(view1, this.c);
            this.O(this.h(this.c), 0, 1, true);
            view1.requestFocus(v);
        }
        if(view0 != null && view0.isFocused() && this.C(view0)) {
            int v2 = this.getDescendantFocusability();
            this.setDescendantFocusability(0x20000);
            this.requestFocus();
            this.setDescendantFocusability(v2);
        }
        return true;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return super.dispatchKeyEvent(keyEvent0) || this.o(keyEvent0);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f1, boolean z) {
        return this.z.a(f, f1, z);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f1) {
        return this.z.b(f, f1);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int v, int v1, int[] arr_v, int[] arr_v1) {
        return this.dispatchNestedPreScroll(v, v1, arr_v, arr_v1, 0);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int v, int v1, int[] arr_v, int[] arr_v1, int v2) {
        return this.z.d(v, v1, arr_v, arr_v1, v2);
    }

    @Override  // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v, int v4, int[] arr_v1) {
        this.z.e(v, v1, v2, v3, arr_v, v4, arr_v1);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v) {
        return this.z.f(v, v1, v2, v3, arr_v);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v, int v4) {
        return this.z.g(v, v1, v2, v3, arr_v, v4);
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        int v6;
        super.draw(canvas0);
        int v = this.getScrollY();
        int v1 = 0;
        if(!this.e.isFinished()) {
            int v2 = canvas0.save();
            int v3 = this.getWidth();
            int v4 = this.getHeight();
            int v5 = Math.min(0, v);
            if(Api21Impl.a(this)) {
                v3 -= this.getPaddingLeft() + this.getPaddingRight();
                v6 = this.getPaddingLeft();
            }
            else {
                v6 = 0;
            }
            if(Api21Impl.a(this)) {
                v4 -= this.getPaddingTop() + this.getPaddingBottom();
                v5 += this.getPaddingTop();
            }
            canvas0.translate(((float)v6), ((float)v5));
            this.e.setSize(v3, v4);
            if(this.e.draw(canvas0)) {
                this.postInvalidateOnAnimation();
            }
            canvas0.restoreToCount(v2);
        }
        if(!this.f.isFinished()) {
            int v7 = canvas0.save();
            int v8 = this.getWidth();
            int v9 = this.getHeight();
            int v10 = Math.max(this.getScrollRange(), v) + v9;
            if(Api21Impl.a(this)) {
                v8 -= this.getPaddingLeft() + this.getPaddingRight();
                v1 = this.getPaddingLeft();
            }
            if(Api21Impl.a(this)) {
                v9 -= this.getPaddingTop() + this.getPaddingBottom();
                v10 -= this.getPaddingBottom();
            }
            canvas0.translate(((float)(v1 - v8)), ((float)v10));
            canvas0.rotate(180.0f, ((float)v8), 0.0f);
            this.f.setSize(v8, v9);
            if(this.f.draw(canvas0)) {
                this.postInvalidateOnAnimation();
            }
            canvas0.restoreToCount(v7);
        }
    }

    private boolean e() {
        int v = this.getOverScrollMode();
        return v == 0 || v == 1 && this.getScrollRange() > 0;
    }

    private boolean f() {
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            return view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin > this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
        }
        return false;
    }

    private static int g(int v, int v1, int v2) {
        if(v1 < v2 && v >= 0) {
            return v1 + v <= v2 ? v : v2 - v1;
        }
        return 0;
    }

    @Override  // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if(this.getChildCount() == 0) {
            return 0.0f;
        }
        View view0 = this.getChildAt(0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        int v = this.getVerticalFadingEdgeLength();
        int v1 = this.getHeight();
        int v2 = this.getPaddingBottom();
        int v3 = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin - this.getScrollY() - (v1 - v2);
        return v3 >= v ? 1.0f : ((float)v3) / ((float)v);
    }

    public int getMaxScrollAmount() {
        return (int)(((float)this.getHeight()) * 0.5f);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.y.a();
    }

    private ScrollFeedbackProviderCompat getScrollFeedbackProvider() {
        if(this.g == null) {
            this.g = ScrollFeedbackProviderCompat.a(this);
        }
        return this.g;
    }

    int getScrollRange() {
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            return Math.max(0, view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin - (this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()));
        }
        return 0;
    }

    @Override  // android.view.View
    protected float getTopFadingEdgeStrength() {
        if(this.getChildCount() == 0) {
            return 0.0f;
        }
        int v = this.getVerticalFadingEdgeLength();
        int v1 = this.getScrollY();
        return v1 >= v ? 1.0f : ((float)v1) / ((float)v);
    }

    @VisibleForTesting
    float getVerticalScrollFactorCompat() {
        if(this.A == 0.0f) {
            TypedValue typedValue0 = new TypedValue();
            Context context0 = this.getContext();
            if(!context0.getTheme().resolveAttribute(0x101004D, typedValue0, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.A = typedValue0.getDimension(context0.getResources().getDisplayMetrics());
            return this.A;
        }
        return this.A;
    }

    protected int h(Rect rect0) {
        if(this.getChildCount() == 0) {
            return 0;
        }
        int v = this.getHeight();
        int v1 = this.getScrollY();
        int v2 = v1 + v;
        int v3 = this.getVerticalFadingEdgeLength();
        if(rect0.top > 0) {
            v1 += v3;
        }
        View view0 = this.getChildAt(0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        int v4 = rect0.bottom >= view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin ? v2 : v2 - v3;
        int v5 = rect0.bottom;
        if(v5 > v4 && rect0.top > v1) {
            return rect0.height() <= v ? Math.min(rect0.bottom - v4, view0.getBottom() + frameLayout$LayoutParams0.bottomMargin - v2) : Math.min(rect0.top - v1, view0.getBottom() + frameLayout$LayoutParams0.bottomMargin - v2);
        }
        if(rect0.top < v1 && v5 < v4) {
            return rect0.height() <= v ? Math.max(-(v1 - rect0.top), -this.getScrollY()) : Math.max(-(v4 - rect0.bottom), -this.getScrollY());
        }
        return 0;
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.hasNestedScrollingParent(0);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int v) {
        return this.z.l(v);
    }

    int i(int v) {
        int v1 = this.getHeight();
        if(v > 0 && EdgeEffectCompat.d(this.e) != 0.0f) {
            int v2 = Math.round(((float)(-v1)) / 4.0f * EdgeEffectCompat.j(this.e, ((float)(-v)) * 4.0f / ((float)v1), 0.5f));
            if(v2 != v) {
                this.e.finish();
            }
            return v - v2;
        }
        if(v < 0 && EdgeEffectCompat.d(this.f) != 0.0f) {
            int v3 = Math.round(((float)v1) / 4.0f * EdgeEffectCompat.j(this.f, ((float)v) * 4.0f / ((float)v1), 0.5f));
            if(v3 != v) {
                this.f.finish();
            }
            return v - v3;
        }
        return v;
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.z.m();
    }

    private void j(int v) {
        if(v != 0) {
            if(this.o) {
                this.T(0, v);
                return;
            }
            this.scrollBy(0, v);
        }
    }

    private boolean k(int v) {
        if(EdgeEffectCompat.d(this.e) != 0.0f) {
            if(this.S(this.e, v)) {
                this.e.onAbsorb(v);
                return true;
            }
            this.r(-v);
            return true;
        }
        if(EdgeEffectCompat.d(this.f) != 0.0f) {
            if(this.S(this.f, -v)) {
                this.f.onAbsorb(-v);
                return true;
            }
            this.r(-v);
            return true;
        }
        return false;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void l(View view0, int v) {
        this.y.e(view0, v);
        this.stopNestedScroll(v);
    }

    private void m() {
        this.s = -1;
        this.l = false;
        this.K();
        this.stopNestedScroll(0);
        this.e.onRelease();
        this.f.onRelease();
    }

    @Override  // android.view.ViewGroup
    protected void measureChild(View view0, int v, int v1) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        view0.measure(ViewGroup.getChildMeasureSpec(v, this.getPaddingLeft() + this.getPaddingRight(), viewGroup$LayoutParams0.width), 0);
    }

    @Override  // android.view.ViewGroup
    protected void measureChildWithMargins(View view0, int v, int v1, int v2, int v3) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        view0.measure(ViewGroup.getChildMeasureSpec(v, this.getPaddingLeft() + this.getPaddingRight() + viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin + v1, viewGroup$MarginLayoutParams0.width), View.MeasureSpec.makeMeasureSpec(viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin, 0));
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void n(View view0, int v, int v1, int v2, int v3, int v4) {
        this.G(v3, v4, null);
    }

    public boolean o(KeyEvent keyEvent0) {
        this.c.setEmpty();
        int v = 130;
        if(!this.f()) {
            if(this.isFocused() && keyEvent0.getKeyCode() != 4) {
                View view0 = this.findFocus();
                if(view0 == this) {
                    view0 = null;
                }
                View view1 = FocusFinder.getInstance().findNextFocus(this, view0, 130);
                return view1 != null && view1 != this && view1.requestFocus(130);
            }
            return false;
        }
        if(keyEvent0.getAction() == 0) {
            switch(keyEvent0.getKeyCode()) {
                case 19: {
                    return keyEvent0.isAltPressed() ? this.t(33) : this.d(33);
                }
                case 20: {
                    return keyEvent0.isAltPressed() ? this.t(130) : this.d(130);
                }
                case 62: {
                    if(keyEvent0.isShiftPressed()) {
                        v = 33;
                    }
                    this.J(v);
                    return false;
                }
                case 92: {
                    return this.t(33);
                }
                case 93: {
                    return this.t(130);
                }
                case 0x7A: {
                    this.J(33);
                    return false;
                }
                case 0x7B: {
                    this.J(130);
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = false;
    }

    @Override  // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        int v1;
        float f;
        int v;
        if(motionEvent0.getAction() == 8 && !this.l) {
            if(MotionEventCompat.l(motionEvent0, 2)) {
                v = 9;
                f = motionEvent0.getAxisValue(9);
                v1 = (int)motionEvent0.getX();
            }
            else if(MotionEventCompat.l(motionEvent0, 0x400000)) {
                float f1 = motionEvent0.getAxisValue(26);
                v1 = this.getWidth() / 2;
                f = f1;
                v = 26;
            }
            else {
                v = 0;
                v1 = 0;
                f = 0.0f;
            }
            if(f != 0.0f) {
                this.P(-((int)(f * this.getVerticalScrollFactorCompat())), v, motionEvent0, v1, 1, MotionEventCompat.l(motionEvent0, 0x2002));
                if(v != 0) {
                    this.D.g(motionEvent0, v);
                }
                return true;
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        boolean z = true;
        if(v == 2 && this.l) {
            return true;
        }
        if((v & 0xFF) == 0) {
            int v4 = (int)motionEvent0.getY();
            if(!this.w(((int)motionEvent0.getX()), v4)) {
                if(!this.a0(motionEvent0) && this.d.isFinished()) {
                    z = false;
                }
                this.l = z;
                this.K();
                return this.l;
            }
            this.h = v4;
            this.s = motionEvent0.getPointerId(0);
            this.x();
            this.m.addMovement(motionEvent0);
            this.d.computeScrollOffset();
            if(!this.a0(motionEvent0) && this.d.isFinished()) {
                z = false;
            }
            this.l = z;
            this.startNestedScroll(2, 0);
        }
        else {
            switch(v & 0xFF) {
                case 1: {
                    goto label_8;
                }
                case 2: {
                    goto label_17;
                }
            }
            switch(v & 0xFF) {
                case 3: {
                label_8:
                    this.l = false;
                    this.s = -1;
                    this.K();
                    if(this.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                        this.postInvalidateOnAnimation();
                    }
                    this.stopNestedScroll(0);
                    return this.l;
                }
                case 6: {
                    this.H(motionEvent0);
                    return this.l;
                }
                default: {
                    return this.l;
                }
            }
        label_17:
            int v1 = this.s;
            if(v1 != -1) {
                int v2 = motionEvent0.findPointerIndex(v1);
                if(v2 == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + v1 + " in onInterceptTouchEvent");
                    return this.l;
                }
                int v3 = (int)motionEvent0.getY(v2);
                if(Math.abs(v3 - this.h) > this.p && (2 & this.getNestedScrollAxes()) == 0) {
                    this.l = true;
                    this.h = v3;
                    this.z();
                    this.m.addMovement(motionEvent0);
                    this.v = 0;
                    ViewParent viewParent0 = this.getParent();
                    if(viewParent0 != null) {
                        viewParent0.requestDisallowInterceptTouchEvent(true);
                        return this.l;
                    }
                }
            }
        }
        return this.l;
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        int v4 = 0;
        this.i = false;
        if(this.k != null && NestedScrollView.E(this.k, this)) {
            this.Q(this.k);
        }
        this.k = null;
        if(!this.j) {
            if(this.x != null) {
                this.scrollTo(this.getScrollX(), this.x.a);
                this.x = null;
            }
            if(this.getChildCount() > 0) {
                View view0 = this.getChildAt(0);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
                v4 = view0.getMeasuredHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin;
            }
            int v5 = this.getPaddingTop();
            int v6 = this.getPaddingBottom();
            int v7 = this.getScrollY();
            int v8 = NestedScrollView.g(v7, v3 - v1 - v5 - v6, v4);
            if(v8 != v7) {
                this.scrollTo(this.getScrollX(), v8);
            }
        }
        this.scrollTo(this.getScrollX(), this.getScrollY());
        this.j = true;
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(!this.n) {
            return;
        }
        if(View.MeasureSpec.getMode(v1) == 0) {
            return;
        }
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            int v2 = view0.getMeasuredHeight();
            int v3 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom() - frameLayout$LayoutParams0.topMargin - frameLayout$LayoutParams0.bottomMargin;
            if(v2 < v3) {
                view0.measure(ViewGroup.getChildMeasureSpec(v, this.getPaddingLeft() + this.getPaddingRight() + frameLayout$LayoutParams0.leftMargin + frameLayout$LayoutParams0.rightMargin, frameLayout$LayoutParams0.width), View.MeasureSpec.makeMeasureSpec(v3, 0x40000000));
            }
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view0, float f, float f1, boolean z) {
        if(!z) {
            this.dispatchNestedFling(0.0f, f1, true);
            this.r(((int)f1));
            return true;
        }
        return false;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view0, float f, float f1) {
        return this.dispatchNestedPreFling(f, f1);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view0, int v, int v1, int[] arr_v) {
        this.p(view0, v, v1, arr_v, 0);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3) {
        this.G(v3, 0, null);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view0, View view1, int v) {
        this.a(view0, view1, v, 0);
    }

    @Override  // android.view.View
    protected void onOverScrolled(int v, int v1, boolean z, boolean z1) {
        super.scrollTo(v, v1);
    }

    @Override  // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int v, Rect rect0) {
        switch(v) {
            case 1: {
                v = 33;
                break;
            }
            case 2: {
                v = 130;
            }
        }
        View view0 = rect0 == null ? FocusFinder.getInstance().findNextFocus(this, null, v) : FocusFinder.getInstance().findNextFocusFromRect(this, rect0, v);
        if(view0 == null) {
            return false;
        }
        return this.C(view0) ? false : view0.requestFocus(v, rect0);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        this.x = (SavedState)parcelable0;
        this.requestLayout();
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.a = this.getScrollY();
        return parcelable0;
    }

    @Override  // android.view.View
    protected void onScrollChanged(int v, int v1, int v2, int v3) {
        super.onScrollChanged(v, v1, v2, v3);
        OnScrollChangeListener nestedScrollView$OnScrollChangeListener0 = this.B;
        if(nestedScrollView$OnScrollChangeListener0 != null) {
            nestedScrollView$OnScrollChangeListener0.a(this, v, v1, v2, v3);
        }
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        View view0 = this.findFocus();
        if(view0 != null && this != view0 && this.F(view0, 0, v3)) {
            view0.getDrawingRect(this.c);
            this.offsetDescendantRectToMyCoords(view0, this.c);
            this.j(this.h(this.c));
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view0, View view1, int v) {
        return this.u(view0, view1, v, 0);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view0) {
        this.l(view0, 0);
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        this.z();
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.v = 0;
        }
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.offsetLocation(0.0f, ((float)this.v));
        switch(v) {
            case 0: {
                if(this.getChildCount() == 0) {
                    return false;
                }
                if(this.l) {
                    ViewParent viewParent0 = this.getParent();
                    if(viewParent0 != null) {
                        viewParent0.requestDisallowInterceptTouchEvent(true);
                    }
                }
                if(!this.d.isFinished()) {
                    this.b();
                }
                this.A(((int)motionEvent0.getY()), motionEvent0.getPointerId(0));
                break;
            }
            case 1: {
                VelocityTracker velocityTracker0 = this.m;
                velocityTracker0.computeCurrentVelocity(1000, ((float)this.r));
                int v1 = (int)velocityTracker0.getYVelocity(this.s);
                if(Math.abs(v1) < this.q) {
                    if(this.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                        this.postInvalidateOnAnimation();
                    }
                }
                else if(!this.k(v1) && !this.dispatchNestedPreFling(0.0f, ((float)(-v1)))) {
                    this.dispatchNestedFling(0.0f, ((float)(-v1)), true);
                    this.r(-v1);
                }
                this.m();
                break;
            }
            case 2: {
                int v2 = motionEvent0.findPointerIndex(this.s);
                if(v2 == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.s + " in onTouchEvent");
                }
                else {
                    int v3 = (int)motionEvent0.getY(v2);
                    int v4 = this.h - v3;
                    int v5 = v4 - this.L(v4, motionEvent0.getX(v2));
                    if(!this.l && Math.abs(v5) > this.p) {
                        ViewParent viewParent1 = this.getParent();
                        if(viewParent1 != null) {
                            viewParent1.requestDisallowInterceptTouchEvent(true);
                        }
                        this.l = true;
                        v5 = v5 <= 0 ? v5 + this.p : v5 - this.p;
                    }
                    if(this.l) {
                        int v6 = this.P(v5, 1, motionEvent0, ((int)motionEvent0.getX(v2)), 0, false);
                        this.h = v3 - v6;
                        this.v += v6;
                    }
                }
                break;
            }
            case 3: {
                if(this.l && this.getChildCount() > 0 && this.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                    this.postInvalidateOnAnimation();
                }
                this.m();
                break;
            }
            case 5: {
                int v7 = motionEvent0.getActionIndex();
                this.h = (int)motionEvent0.getY(v7);
                this.s = motionEvent0.getPointerId(v7);
                break;
            }
            case 6: {
                this.H(motionEvent0);
                this.h = (int)motionEvent0.getY(motionEvent0.findPointerIndex(this.s));
            }
        }
        VelocityTracker velocityTracker1 = this.m;
        if(velocityTracker1 != null) {
            velocityTracker1.addMovement(motionEvent1);
        }
        motionEvent1.recycle();
        return true;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void p(View view0, int v, int v1, int[] arr_v, int v2) {
        this.dispatchNestedPreScroll(v, v1, arr_v, null, v2);
    }

    private View q(boolean z, int v, int v1) {
        ArrayList arrayList0 = this.getFocusables(2);
        int v2 = arrayList0.size();
        View view0 = null;
        int v4 = 0;
        for(int v3 = 0; v3 < v2; ++v3) {
            View view1 = (View)arrayList0.get(v3);
            int v5 = view1.getTop();
            int v6 = view1.getBottom();
            if(v < v6 && v5 < v1) {
                int v7 = v >= v5 || v6 >= v1 ? 0 : 1;
                if(view0 == null) {
                    view0 = view1;
                    v4 = v7;
                }
                else {
                    boolean z1 = z && v5 < view0.getTop() || !z && v6 > view0.getBottom();
                    if(v4 == 0) {
                        if(v7 != 0) {
                            view0 = view1;
                            v4 = 1;
                        }
                        else if(z1) {
                            view0 = view1;
                        }
                    }
                    else if(v7 != 0 && z1) {
                        view0 = view1;
                    }
                }
            }
        }
        return view0;
    }

    public void r(int v) {
        if(this.getChildCount() > 0) {
            this.d.fling(this.getScrollX(), this.getScrollY(), 0, v, 0, 0, 0x80000000, 0x7FFFFFFF, 0, 0);
            this.M(true);
            if(Build.VERSION.SDK_INT >= 35) {
                Api35Impl.a(this, Math.abs(this.d.getCurrVelocity()));
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void requestChildFocus(View view0, View view1) {
        if(this.i) {
            this.k = view1;
        }
        else {
            this.Q(view1);
        }
        super.requestChildFocus(view0, view1);
    }

    @Override  // android.view.ViewGroup
    public boolean requestChildRectangleOnScreen(View view0, Rect rect0, boolean z) {
        rect0.offset(view0.getLeft() - view0.getScrollX(), view0.getTop() - view0.getScrollY());
        return this.R(rect0, z);
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if(z) {
            this.K();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.i = true;
        super.requestLayout();
    }

    @Override  // androidx.core.view.NestedScrollingParent3
    public void s(View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        this.G(v3, v4, arr_v);
    }

    @Override  // android.view.View
    public void scrollTo(int v, int v1) {
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            int v2 = NestedScrollView.g(v, this.getWidth() - this.getPaddingLeft() - this.getPaddingRight(), view0.getWidth() + frameLayout$LayoutParams0.leftMargin + frameLayout$LayoutParams0.rightMargin);
            int v3 = NestedScrollView.g(v1, this.getHeight() - this.getPaddingTop() - this.getPaddingBottom(), view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin);
            if(v2 != this.getScrollX() || v3 != this.getScrollY()) {
                super.scrollTo(v2, v3);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if(z != this.n) {
            this.n = z;
            this.requestLayout();
        }
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.z.p(z);
    }

    public void setOnScrollChangeListener(OnScrollChangeListener nestedScrollView$OnScrollChangeListener0) {
        this.B = nestedScrollView$OnScrollChangeListener0;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.o = z;
    }

    @Override  // android.widget.FrameLayout
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int v) {
        return this.startNestedScroll(v, 0);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int v, int v1) {
        return this.z.s(v, v1);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.stopNestedScroll(0);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int v) {
        this.z.u(v);
    }

    public boolean t(int v) {
        int v1 = this.getHeight();
        this.c.top = 0;
        this.c.bottom = v1;
        if(v == 130) {
            int v2 = this.getChildCount();
            if(v2 > 0) {
                View view0 = this.getChildAt(v2 - 1);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
                this.c.bottom = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin + this.getPaddingBottom();
                this.c.top = this.c.bottom - v1;
            }
        }
        return this.N(v, this.c.top, this.c.bottom);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public boolean u(View view0, View view1, int v, int v1) {
        return (v & 2) != 0;
    }

    private float v(int v) {
        return (float)(((double)(this.a * 0.015f)) * Math.exp(((double)NestedScrollView.K) / (((double)NestedScrollView.K) - 1.0) * Math.log(((float)Math.abs(v)) * 0.35f / (this.a * 0.015f))));
    }

    private boolean w(int v, int v1) {
        if(this.getChildCount() > 0) {
            int v2 = this.getScrollY();
            View view0 = this.getChildAt(0);
            return v1 >= view0.getTop() - v2 && v1 < view0.getBottom() - v2 && v >= view0.getLeft() && v < view0.getRight();
        }
        return false;
    }

    private void x() {
        VelocityTracker velocityTracker0 = this.m;
        if(velocityTracker0 == null) {
            this.m = VelocityTracker.obtain();
            return;
        }
        velocityTracker0.clear();
    }

    private void y() {
        this.d = new OverScroller(this.getContext());
        this.setFocusable(true);
        this.setDescendantFocusability(0x40000);
        this.setWillNotDraw(false);
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(this.getContext());
        this.p = viewConfiguration0.getScaledTouchSlop();
        this.q = viewConfiguration0.getScaledMinimumFlingVelocity();
        this.r = viewConfiguration0.getScaledMaximumFlingVelocity();
    }

    private void z() {
        if(this.m == null) {
            this.m = VelocityTracker.obtain();
        }
    }
}

