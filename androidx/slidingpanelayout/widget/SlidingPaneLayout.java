package androidx.slidingpanelayout.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper.Callback;
import androidx.customview.widget.ViewDragHelper;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import androidx.window.layout.FoldingFeature.Orientation;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.j;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SlidingPaneLayout extends ViewGroup implements Openable {
    class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final Rect d;
        final SlidingPaneLayout e;

        AccessibilityDelegate() {
            this.d = new Rect();
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void f(View view0, AccessibilityEvent accessibilityEvent0) {
            super.f(view0, accessibilityEvent0);
            accessibilityEvent0.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat1 = AccessibilityNodeInfoCompat.R0(accessibilityNodeInfoCompat0);
            super.g(view0, accessibilityNodeInfoCompat1);
            this.n(accessibilityNodeInfoCompat0, accessibilityNodeInfoCompat1);
            accessibilityNodeInfoCompat0.k1("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            accessibilityNodeInfoCompat0.c2(view0);
            ViewParent viewParent0 = ViewCompat.q0(view0);
            if(viewParent0 instanceof View) {
                accessibilityNodeInfoCompat0.R1(((View)viewParent0));
            }
            int v = SlidingPaneLayout.this.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = SlidingPaneLayout.this.getChildAt(v1);
                if(!this.o(view1) && view1.getVisibility() == 0) {
                    ViewCompat.b2(view1, 1);
                    accessibilityNodeInfoCompat0.c(view1);
                }
            }
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public boolean i(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
            return this.o(view0) ? false : super.i(viewGroup0, view0, accessibilityEvent0);
        }

        private void n(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat1) {
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
            accessibilityNodeInfoCompat0.N1(accessibilityNodeInfoCompat1.Q());
        }

        public boolean o(View view0) {
            return SlidingPaneLayout.this.m(view0);
        }
    }

    class DisableLayerRunnable implements Runnable {
        final View a;
        final SlidingPaneLayout b;

        DisableLayerRunnable(View view0) {
            this.a = view0;
        }

        @Override
        public void run() {
            if(this.a.getParent() == SlidingPaneLayout.this) {
                this.a.setLayerType(0, null);
                SlidingPaneLayout.this.l(this.a);
            }
            SlidingPaneLayout.this.t.remove(this);
        }
    }

    class DragHelperCallback extends Callback {
        final SlidingPaneLayout a;

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int a(View view0, int v, int v1) {
            LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)SlidingPaneLayout.this.f.getLayoutParams();
            if(SlidingPaneLayout.this.n()) {
                int v2 = SlidingPaneLayout.this.getWidth() - (SlidingPaneLayout.this.getPaddingRight() + slidingPaneLayout$LayoutParams0.rightMargin + SlidingPaneLayout.this.f.getWidth());
                return Math.max(Math.min(v, v2), v2 - SlidingPaneLayout.this.i);
            }
            int v3 = SlidingPaneLayout.this.getPaddingLeft() + slidingPaneLayout$LayoutParams0.leftMargin;
            return Math.min(Math.max(v, v3), SlidingPaneLayout.this.i + v3);
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int b(View view0, int v, int v1) {
            return view0.getTop();
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int d(View view0) {
            return SlidingPaneLayout.this.i;
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void f(int v, int v1) {
            if(!this.n()) {
                return;
            }
            SlidingPaneLayout.this.p.d(SlidingPaneLayout.this.f, v1);
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void h(int v, int v1) {
            if(!this.n()) {
                return;
            }
            SlidingPaneLayout.this.p.d(SlidingPaneLayout.this.f, v1);
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void i(View view0, int v) {
            SlidingPaneLayout.this.v();
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void j(int v) {
            if(SlidingPaneLayout.this.p.F() == 0) {
                SlidingPaneLayout slidingPaneLayout0 = SlidingPaneLayout.this;
                if(slidingPaneLayout0.g == 1.0f) {
                    slidingPaneLayout0.A(slidingPaneLayout0.f);
                    SlidingPaneLayout.this.f(SlidingPaneLayout.this.f);
                    SlidingPaneLayout.this.q = false;
                    return;
                }
                slidingPaneLayout0.g(slidingPaneLayout0.f);
                SlidingPaneLayout.this.q = true;
            }
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void k(View view0, int v, int v1, int v2, int v3) {
            SlidingPaneLayout.this.q(v);
            SlidingPaneLayout.this.invalidate();
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void l(View view0, float f, float f1) {
            int v2;
            LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(SlidingPaneLayout.this.n()) {
                int v = SlidingPaneLayout.this.getPaddingRight() + slidingPaneLayout$LayoutParams0.rightMargin;
                if(f < 0.0f || f == 0.0f && SlidingPaneLayout.this.g > 0.5f) {
                    v += SlidingPaneLayout.this.i;
                }
                int v1 = SlidingPaneLayout.this.f.getWidth();
                v2 = SlidingPaneLayout.this.getWidth() - v - v1;
            }
            else {
                int v3 = SlidingPaneLayout.this.getPaddingLeft();
                v2 = slidingPaneLayout$LayoutParams0.leftMargin + v3;
                int v4 = Float.compare(f, 0.0f);
                if(v4 > 0 || v4 == 0 && SlidingPaneLayout.this.g > 0.5f) {
                    v2 += SlidingPaneLayout.this.i;
                }
            }
            int v5 = view0.getTop();
            SlidingPaneLayout.this.p.V(v2, v5);
            SlidingPaneLayout.this.invalidate();
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public boolean m(View view0, int v) {
            return this.n() ? ((LayoutParams)view0.getLayoutParams()).b : false;
        }

        private boolean n() {
            SlidingPaneLayout slidingPaneLayout0 = SlidingPaneLayout.this;
            if(slidingPaneLayout0.j) {
                return false;
            }
            if(slidingPaneLayout0.getLockMode() == 3) {
                return false;
            }
            return !SlidingPaneLayout.this.isOpen() || SlidingPaneLayout.this.getLockMode() != 1 ? SlidingPaneLayout.this.isOpen() || SlidingPaneLayout.this.getLockMode() != 2 : false;
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public float a;
        boolean b;
        boolean c;
        Paint d;
        private static final int[] e;

        static {
            LayoutParams.e = new int[]{0x1010181};
        }

        public LayoutParams() {
            super(-1, -1);
            this.a = 0.0f;
        }

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.a = 0.0f;
        }

        public LayoutParams(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.a = 0.0f;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, LayoutParams.e);
            this.a = typedArray0.getFloat(0, 0.0f);
            typedArray0.recycle();
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.a = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.a = 0.0f;
        }

        public LayoutParams(@NonNull LayoutParams slidingPaneLayout$LayoutParams0) {
            super(slidingPaneLayout$LayoutParams0);
            this.a = slidingPaneLayout$LayoutParams0.a;
        }
    }

    public interface PanelSlideListener {
        void a(@NonNull View arg1);

        void b(@NonNull View arg1);

        void c(@NonNull View arg1, float arg2);
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        boolean c;
        int d;

        static {
            SavedState.CREATOR = new Parcelable.ClassLoaderCreator() {
                public SavedState a(Parcel parcel0) {
                    return new SavedState(parcel0, null);
                }

                public SavedState b(Parcel parcel0, ClassLoader classLoader0) {
                    return new SavedState(parcel0, null);
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

        SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.c = parcel0.readInt() != 0;
            this.d = parcel0.readInt();
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(((int)this.c));
            parcel0.writeInt(this.d);
        }
    }

    public static class SimplePanelSlideListener implements PanelSlideListener {
        @Override  // androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener
        public void a(@NonNull View view0) {
        }

        @Override  // androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener
        public void b(@NonNull View view0) {
        }

        @Override  // androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener
        public void c(@NonNull View view0, float f) {
        }
    }

    static class TouchBlocker extends FrameLayout {
        TouchBlocker(View view0) {
            super(view0.getContext());
            this.addView(view0);
        }

        @Override  // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent0) {
            return true;
        }

        @Override  // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent0) {
            return true;
        }
    }

    private boolean A;
    private static final String B = "SlidingPaneLayout";
    private static final int C = 400;
    private static final String D = "androidx.slidingpanelayout.widget.SlidingPaneLayout";
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 3;
    private static boolean I;
    private int a;
    private int b;
    private Drawable c;
    private Drawable d;
    private boolean e;
    View f;
    float g;
    private float h;
    int i;
    boolean j;
    private int k;
    private float l;
    private float m;
    private final List n;
    @Nullable
    private PanelSlideListener o;
    final ViewDragHelper p;
    boolean q;
    private boolean r;
    private final Rect s;
    final ArrayList t;
    private int u;
    FoldingFeature v;
    private OnFoldingFeatureChangeListener w;
    private FoldingFeatureObserver x;
    private Method y;
    private Field z;

    static {
        SlidingPaneLayout.I = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public SlidingPaneLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public SlidingPaneLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = 0;
        this.g = 1.0f;
        this.n = new CopyOnWriteArrayList();
        this.r = true;
        this.s = new Rect();
        this.t = new ArrayList();
        this.w = new OnFoldingFeatureChangeListener() {
            final SlidingPaneLayout a;

            @Override  // androidx.slidingpanelayout.widget.FoldingFeatureObserver$OnFoldingFeatureChangeListener
            public void a(@NonNull FoldingFeature foldingFeature0) {
                SlidingPaneLayout.this.v = foldingFeature0;
                ChangeBounds changeBounds0 = new ChangeBounds();
                changeBounds0.C0(300L);
                changeBounds0.E0(PathInterpolatorCompat.b(0.2f, 0.0f, 0.0f, 1.0f));
                TransitionManager.b(SlidingPaneLayout.this, changeBounds0);
                SlidingPaneLayout.this.requestLayout();
            }
        };
        float f = context0.getResources().getDisplayMetrics().density;
        this.setWillNotDraw(false);
        ViewCompat.J1(this, new AccessibilityDelegate(this));
        ViewCompat.b2(this, 1);
        ViewDragHelper viewDragHelper0 = ViewDragHelper.p(this, 0.5f, new DragHelperCallback(this));
        this.p = viewDragHelper0;
        viewDragHelper0.U(f * 400.0f);
        this.setFoldingFeatureObserver(new FoldingFeatureObserver(j.a(context0), ContextCompat.getMainExecutor(context0)));
    }

    void A(View view0) {
        int v8;
        int v7;
        int v6;
        int v5;
        boolean z = this.n();
        int v = z ? this.getWidth() - this.getPaddingRight() : this.getPaddingLeft();
        int v1 = z ? this.getPaddingLeft() : this.getWidth() - this.getPaddingRight();
        int v2 = this.getPaddingTop();
        int v3 = this.getHeight();
        int v4 = this.getPaddingBottom();
        if(view0 == null || !SlidingPaneLayout.B(view0)) {
            v5 = 0;
            v6 = 0;
            v7 = 0;
            v8 = 0;
        }
        else {
            v5 = view0.getLeft();
            v6 = view0.getRight();
            v7 = view0.getTop();
            v8 = view0.getBottom();
        }
        int v9 = this.getChildCount();
        for(int v10 = 0; v10 < v9; ++v10) {
            View view1 = this.getChildAt(v10);
            if(view1 == view0) {
                break;
            }
            if(view1.getVisibility() != 8) {
                view1.setVisibility((Math.max((z ? v1 : v), view1.getLeft()) < v5 || Math.max(v2, view1.getTop()) < v7 || Math.min((z ? v : v1), view1.getRight()) > v6 || Math.min(v3 - v4, view1.getBottom()) > v8 ? 0 : 4));
            }
        }
    }

    private static boolean B(View view0) {
        return view0.isOpaque();
    }

    public void a(@NonNull PanelSlideListener slidingPaneLayout$PanelSlideListener0) {
        this.n.add(slidingPaneLayout$PanelSlideListener0);
    }

    @Override  // android.view.ViewGroup
    public void addView(@NonNull View view0, int v, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.getChildCount() == 1) {
            super.addView(new TouchBlocker(view0), v, viewGroup$LayoutParams0);
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    protected boolean b(View view0, boolean z, int v, int v1, int v2) {
        if(view0 instanceof ViewGroup) {
            int v3 = view0.getScrollX();
            int v4 = view0.getScrollY();
            for(int v5 = ((ViewGroup)view0).getChildCount() - 1; v5 >= 0; --v5) {
                View view1 = ((ViewGroup)view0).getChildAt(v5);
                int v6 = v1 + v3;
                if(v6 >= view1.getLeft() && v6 < view1.getRight()) {
                    int v7 = v2 + v4;
                    if(v7 >= view1.getTop() && v7 < view1.getBottom() && this.b(view1, true, v, v6 - view1.getLeft(), v7 - view1.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z ? view0.canScrollHorizontally((this.n() ? v : -v)) : false;
    }

    @Deprecated
    public boolean c() {
        return this.e;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams && super.checkLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // androidx.customview.widget.Openable
    public void close() {
        this.d();
    }

    @Override  // android.view.View
    public void computeScroll() {
        if(this.p.o(true)) {
            if(!this.e) {
                this.p.a();
                return;
            }
            ViewCompat.v1(this);
        }
    }

    public boolean d() {
        return this.e(0);
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        int v4;
        int v3;
        super.draw(canvas0);
        Drawable drawable0 = this.n() ? this.d : this.c;
        View view0 = this.getChildCount() <= 1 ? null : this.getChildAt(1);
        if(view0 != null && drawable0 != null) {
            int v = view0.getTop();
            int v1 = view0.getBottom();
            int v2 = drawable0.getIntrinsicWidth();
            if(this.n()) {
                v3 = view0.getRight();
                v4 = v2 + v3;
            }
            else {
                int v5 = view0.getLeft();
                v4 = v5;
                v3 = v5 - v2;
            }
            drawable0.setBounds(v3, v, v4, v1);
            drawable0.draw(canvas0);
        }
    }

    @Override  // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas0, View view0, long v) {
        if((this.n() ^ this.isOpen()) == 0) {
            this.p.T(2);
            Insets insets1 = this.getSystemGestureInsets();
            if(insets1 != null) {
                this.p.S(Math.max(this.p.A(), insets1.c));
            }
        }
        else {
            this.p.T(1);
            Insets insets0 = this.getSystemGestureInsets();
            if(insets0 != null) {
                this.p.S(Math.max(this.p.A(), insets0.a));
            }
        }
        LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v1 = canvas0.save();
        if(this.e && !slidingPaneLayout$LayoutParams0.b && this.f != null) {
            canvas0.getClipBounds(this.s);
            if(this.n()) {
                this.s.left = Math.max(this.s.left, this.f.getRight());
            }
            else {
                this.s.right = Math.min(this.s.right, this.f.getLeft());
            }
            canvas0.clipRect(this.s);
        }
        boolean z = super.drawChild(canvas0, view0, v);
        canvas0.restoreToCount(v1);
        return z;
    }

    private boolean e(int v) {
        if(!this.e) {
            this.q = false;
        }
        if(!this.r && !this.y(1.0f, v)) {
            return false;
        }
        this.q = false;
        return true;
    }

    void f(@NonNull View view0) {
        for(Object object0: this.n) {
            ((PanelSlideListener)object0).b(view0);
        }
        this.sendAccessibilityEvent(0x20);
    }

    void g(@NonNull View view0) {
        for(Object object0: this.n) {
            ((PanelSlideListener)object0).a(view0);
        }
        this.sendAccessibilityEvent(0x20);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    @ColorInt
    @Deprecated
    public int getCoveredFadeColor() {
        return this.b;
    }

    public final int getLockMode() {
        return this.u;
    }

    @Px
    public int getParallaxDistance() {
        return this.k;
    }

    @ColorInt
    @Deprecated
    public int getSliderFadeColor() {
        return this.a;
    }

    private Insets getSystemGestureInsets() {
        if(SlidingPaneLayout.I) {
            WindowInsetsCompat windowInsetsCompat0 = ViewCompat.t0(this);
            return windowInsetsCompat0 == null ? null : windowInsetsCompat0.n();
        }
        return null;
    }

    void h(@NonNull View view0) {
        for(Object object0: this.n) {
            ((PanelSlideListener)object0).c(view0, this.g);
        }
    }

    @Nullable
    private static Activity i(Context context0) {
        while(context0 instanceof ContextWrapper) {
            if(context0 instanceof Activity) {
                return (Activity)context0;
            }
            context0 = ((ContextWrapper)context0).getBaseContext();
        }
        return null;
    }

    @Override  // androidx.customview.widget.Openable
    public boolean isOpen() {
        return !this.e || this.g == 0.0f;
    }

    private static Rect j(@NonNull FoldingFeature foldingFeature0, View view0) {
        int[] arr_v = new int[2];
        view0.getLocationInWindow(arr_v);
        int v = arr_v[0];
        Rect rect0 = new Rect(v, arr_v[1], view0.getWidth() + v, arr_v[1] + view0.getWidth());
        Rect rect1 = new Rect(foldingFeature0.getBounds());
        boolean z = rect1.intersect(rect0);
        if(rect1.width() == 0 && rect1.height() == 0 || !z) {
            return null;
        }
        rect1.offset(-arr_v[0], -arr_v[1]);
        return rect1;
    }

    // 去混淆评级： 低(20)
    private static int k(View view0) {
        return view0 instanceof TouchBlocker ? ViewCompat.k0(((TouchBlocker)view0).getChildAt(0)) : ViewCompat.k0(view0);
    }

    void l(View view0) {
        ViewCompat.h2(view0, ((LayoutParams)view0.getLayoutParams()).d);
    }

    boolean m(View view0) {
        if(view0 == null) {
            return false;
        }
        LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.e && slidingPaneLayout$LayoutParams0.c && this.g > 0.0f;
    }

    boolean n() {
        return ViewCompat.e0(this) == 1;
    }

    public boolean o() {
        return this.e;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r = true;
        if(this.x != null) {
            Activity activity0 = SlidingPaneLayout.i(this.getContext());
            if(activity0 != null) {
                this.x.e(activity0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r = true;
        FoldingFeatureObserver foldingFeatureObserver0 = this.x;
        if(foldingFeatureObserver0 != null) {
            foldingFeatureObserver0.g();
        }
        int v = this.t.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((DisableLayerRunnable)this.t.get(v1)).run();
        }
        this.t.clear();
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(!this.e && v == 0 && this.getChildCount() > 1) {
            View view0 = this.getChildAt(1);
            if(view0 != null) {
                int v1 = (int)motionEvent0.getX();
                int v2 = (int)motionEvent0.getY();
                this.q = this.p.L(view0, v1, v2);
            }
        }
        if(this.e && (!this.j || v == 0)) {
            if(v != 1 && v != 3) {
                switch(v) {
                    case 0: {
                        this.j = false;
                        float f = motionEvent0.getX();
                        float f1 = motionEvent0.getY();
                        this.l = f;
                        this.m = f1;
                        return !this.p.L(this.f, ((int)f), ((int)f1)) || !this.m(this.f) ? this.p.W(motionEvent0) : this.p.W(motionEvent0) || true;
                    }
                    case 2: {
                        float f2 = motionEvent0.getX();
                        float f3 = motionEvent0.getY();
                        float f4 = Math.abs(f2 - this.l);
                        if(f4 > ((float)this.p.E()) && Math.abs(f3 - this.m) > f4) {
                            this.p.c();
                            this.j = true;
                            return false;
                        }
                        return this.p.W(motionEvent0);
                    }
                    default: {
                        return this.p.W(motionEvent0);
                    }
                }
            }
            this.p.c();
            return false;
        }
        this.p.c();
        return super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v20;
        int v19;
        int v17;
        int v11;
        boolean z1 = this.n();
        int v4 = v2 - v;
        int v5 = z1 ? this.getPaddingRight() : this.getPaddingLeft();
        int v6 = z1 ? this.getPaddingLeft() : this.getPaddingRight();
        int v7 = this.getPaddingTop();
        int v8 = this.getChildCount();
        if(this.r) {
            this.g = !this.e || !this.q ? 1.0f : 0.0f;
        }
        int v9 = v5;
        int v10 = 0;
        while(v10 < v8) {
            View view0 = this.getChildAt(v10);
            if(view0.getVisibility() == 8) {
                v11 = v9;
            }
            else {
                LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                int v12 = view0.getMeasuredWidth();
                if(slidingPaneLayout$LayoutParams0.b) {
                    int v13 = v4 - v6;
                    int v14 = Math.min(v5, v13) - v9 - (slidingPaneLayout$LayoutParams0.leftMargin + slidingPaneLayout$LayoutParams0.rightMargin);
                    this.i = v14;
                    int v15 = z1 ? slidingPaneLayout$LayoutParams0.rightMargin : slidingPaneLayout$LayoutParams0.leftMargin;
                    slidingPaneLayout$LayoutParams0.c = v9 + v15 + v14 + v12 / 2 > v13;
                    int v16 = (int)(((float)v14) * this.g);
                    this.g = ((float)v16) / ((float)v14);
                    v11 = v9 + (v15 + v16);
                }
                else {
                    if(this.e) {
                        int v18 = this.k;
                        if(v18 != 0) {
                            v17 = (int)((1.0f - this.g) * ((float)v18));
                            v11 = v5;
                            goto label_36;
                        }
                    }
                    v11 = v5;
                }
                v17 = 0;
            label_36:
                if(z1) {
                    v19 = v4 - v11 + v17;
                    v20 = v19 - v12;
                }
                else {
                    v20 = v11 - v17;
                    v19 = v20 + v12;
                }
                view0.layout(v20, v7, v19, view0.getMeasuredHeight() + v7);
                int v21 = this.v == null || this.v.getOrientation() != Orientation.c || !this.v.a() ? 0 : this.v.getBounds().width();
                v5 += view0.getWidth() + Math.abs(v21);
            }
            ++v10;
            v9 = v11;
        }
        if(this.r) {
            if(this.e && this.k != 0) {
                this.t(this.g);
            }
            this.A(this.f);
        }
        this.r = false;
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v20;
        int v19;
        int v14;
        int v7;
        int v6;
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = View.MeasureSpec.getMode(v1);
        int v5 = View.MeasureSpec.getSize(v1);
        switch(v4) {
            case 0x80000000: {
                v7 = v5 - this.getPaddingTop() - this.getPaddingBottom();
                v6 = 0;
                break;
            }
            case 0x40000000: {
                v6 = v5 - this.getPaddingTop() - this.getPaddingBottom();
                v7 = v6;
                break;
            }
            default: {
                v6 = 0;
                v7 = 0;
            }
        }
        int v8 = Math.max(v3 - this.getPaddingLeft() - this.getPaddingRight(), 0);
        int v9 = this.getChildCount();
        if(v9 > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f = null;
        int v10 = v8;
        int v11 = 0;
        boolean z = false;
        float f = 0.0f;
        while(v11 < v9) {
            View view0 = this.getChildAt(v11);
            LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(view0.getVisibility() == 8) {
                slidingPaneLayout$LayoutParams0.c = false;
            }
            else {
                float f1 = slidingPaneLayout$LayoutParams0.a;
                if(f1 > 0.0f) {
                    f += f1;
                    if(slidingPaneLayout$LayoutParams0.width != 0) {
                        goto label_32;
                    }
                }
                else {
                label_32:
                    int v12 = Math.max(v8 - (slidingPaneLayout$LayoutParams0.leftMargin + slidingPaneLayout$LayoutParams0.rightMargin), 0);
                    int v13 = slidingPaneLayout$LayoutParams0.width;
                    if(v13 == -2) {
                        v14 = View.MeasureSpec.makeMeasureSpec(v12, (v2 == 0 ? 0 : 0x80000000));
                    }
                    else {
                        v14 = v13 == -1 ? View.MeasureSpec.makeMeasureSpec(v12, v2) : View.MeasureSpec.makeMeasureSpec(v13, 0x40000000);
                    }
                    view0.measure(v14, ViewGroup.getChildMeasureSpec(v1, this.getPaddingTop() + this.getPaddingBottom(), slidingPaneLayout$LayoutParams0.height));
                    int v15 = view0.getMeasuredWidth();
                    int v16 = view0.getMeasuredHeight();
                    if(v16 > v6) {
                        switch(v4) {
                            case 0x80000000: {
                                v6 = Math.min(v16, v7);
                                break;
                            }
                            case 0: {
                                v6 = v16;
                            }
                        }
                    }
                    v10 -= v15;
                    if(v11 != 0) {
                        slidingPaneLayout$LayoutParams0.b = v10 < 0;
                        z |= v10 < 0;
                        if(v10 < 0) {
                            this.f = view0;
                        }
                    }
                }
            }
            ++v11;
        }
        if(z || f > 0.0f) {
            for(int v17 = 0; v17 < v9; ++v17) {
                View view1 = this.getChildAt(v17);
                if(view1.getVisibility() != 8) {
                    LayoutParams slidingPaneLayout$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
                    int v18 = slidingPaneLayout$LayoutParams1.width != 0 || slidingPaneLayout$LayoutParams1.a <= 0.0f ? view1.getMeasuredWidth() : 0;
                    if(z) {
                        v19 = v8 - (slidingPaneLayout$LayoutParams1.leftMargin + slidingPaneLayout$LayoutParams1.rightMargin);
                        v20 = View.MeasureSpec.makeMeasureSpec(v19, 0x40000000);
                    }
                    else if(slidingPaneLayout$LayoutParams1.a > 0.0f) {
                        v19 = v18 + ((int)(slidingPaneLayout$LayoutParams1.a * ((float)Math.max(0, v10)) / f));
                        v20 = View.MeasureSpec.makeMeasureSpec(v19, 0x40000000);
                    }
                    else {
                        v19 = v18;
                        v20 = 0;
                    }
                    int v21 = SlidingPaneLayout.p(view1, v1, this.getPaddingTop() + this.getPaddingBottom());
                    if(v18 != v19) {
                        view1.measure(v20, v21);
                        int v22 = view1.getMeasuredHeight();
                        if(v22 > v6) {
                            switch(v4) {
                                case 0x80000000: {
                                    v6 = Math.min(v22, v7);
                                    break;
                                }
                                case 0: {
                                    v6 = v22;
                                }
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList0 = this.z();
        if(arrayList0 != null && !z) {
            for(int v23 = 0; v23 < v9; ++v23) {
                View view2 = this.getChildAt(v23);
                if(view2.getVisibility() != 8) {
                    Rect rect0 = (Rect)arrayList0.get(v23);
                    LayoutParams slidingPaneLayout$LayoutParams2 = (LayoutParams)view2.getLayoutParams();
                    int v24 = slidingPaneLayout$LayoutParams2.leftMargin + slidingPaneLayout$LayoutParams2.rightMargin;
                    int v25 = View.MeasureSpec.makeMeasureSpec(view2.getMeasuredHeight(), 0x40000000);
                    view2.measure(View.MeasureSpec.makeMeasureSpec(rect0.width(), 0x80000000), v25);
                    if((view2.getMeasuredWidthAndState() & 0x1000000) == 1 || SlidingPaneLayout.k(view2) != 0 && rect0.width() < SlidingPaneLayout.k(view2)) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(v8 - v24, 0x40000000), v25);
                        if(v23 != 0) {
                            slidingPaneLayout$LayoutParams2.b = true;
                            this.f = view2;
                            z = true;
                        }
                    }
                    else {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(rect0.width(), 0x40000000), v25);
                    }
                }
            }
        }
        this.setMeasuredDimension(v3, v6 + this.getPaddingTop() + this.getPaddingBottom());
        this.e = z;
        if(this.p.F() != 0 && !z) {
            this.p.a();
        }
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        if(((SavedState)parcelable0).c) {
            this.r();
        }
        else {
            this.d();
        }
        this.q = ((SavedState)parcelable0).c;
        this.setLockMode(((SavedState)parcelable0).d);
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.c = this.o() ? this.isOpen() : this.q;
        parcelable0.d = this.u;
        return parcelable0;
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(v != v2) {
            this.r = true;
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        if(!this.e) {
            return super.onTouchEvent(motionEvent0);
        }
        this.p.M(motionEvent0);
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                this.l = f;
                this.m = f1;
                return true;
            }
            case 1: {
                if(this.m(this.f)) {
                    float f2 = motionEvent0.getX();
                    float f3 = motionEvent0.getY();
                    float f4 = f2 - this.l;
                    float f5 = f3 - this.m;
                    int v = this.p.E();
                    if(f4 * f4 + f5 * f5 < ((float)(v * v)) && this.p.L(this.f, ((int)f2), ((int)f3))) {
                        this.e(0);
                        return true;
                    }
                }
                return true;
            }
            default: {
                return true;
            }
        }
    }

    @Override  // androidx.customview.widget.Openable
    public void open() {
        this.r();
    }

    private static int p(@NonNull View view0, int v, int v1) {
        LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return slidingPaneLayout$LayoutParams0.width != 0 || slidingPaneLayout$LayoutParams0.a <= 0.0f ? View.MeasureSpec.makeMeasureSpec(view0.getMeasuredHeight(), 0x40000000) : ViewGroup.getChildMeasureSpec(v, v1, slidingPaneLayout$LayoutParams0.height);
    }

    void q(int v) {
        if(this.f == null) {
            this.g = 0.0f;
            return;
        }
        boolean z = this.n();
        LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)this.f.getLayoutParams();
        int v1 = this.f.getWidth();
        if(z) {
            v = this.getWidth() - v - v1;
        }
        float f = ((float)(v - ((z ? this.getPaddingRight() : this.getPaddingLeft()) + (z ? slidingPaneLayout$LayoutParams0.rightMargin : slidingPaneLayout$LayoutParams0.leftMargin)))) / ((float)this.i);
        this.g = f;
        if(this.k != 0) {
            this.t(f);
        }
        this.h(this.f);
    }

    public boolean r() {
        return this.s(0);
    }

    @Override  // android.view.ViewGroup
    public void removeView(@NonNull View view0) {
        if(view0.getParent() instanceof TouchBlocker) {
            super.removeView(((View)view0.getParent()));
            return;
        }
        super.removeView(view0);
    }

    @Override  // android.view.ViewGroup
    public void requestChildFocus(View view0, View view1) {
        super.requestChildFocus(view0, view1);
        if(!this.isInTouchMode() && !this.e) {
            this.q = view0 == this.f;
        }
    }

    private boolean s(int v) {
        if(!this.e) {
            this.q = true;
        }
        if(!this.r && !this.y(0.0f, v)) {
            return false;
        }
        this.q = true;
        return true;
    }

    @Deprecated
    public void setCoveredFadeColor(@ColorInt int v) {
        this.b = v;
    }

    private void setFoldingFeatureObserver(FoldingFeatureObserver foldingFeatureObserver0) {
        this.x = foldingFeatureObserver0;
        foldingFeatureObserver0.f(this.w);
    }

    public final void setLockMode(int v) {
        this.u = v;
    }

    @Deprecated
    public void setPanelSlideListener(@Nullable PanelSlideListener slidingPaneLayout$PanelSlideListener0) {
        PanelSlideListener slidingPaneLayout$PanelSlideListener1 = this.o;
        if(slidingPaneLayout$PanelSlideListener1 != null) {
            this.u(slidingPaneLayout$PanelSlideListener1);
        }
        if(slidingPaneLayout$PanelSlideListener0 != null) {
            this.a(slidingPaneLayout$PanelSlideListener0);
        }
        this.o = slidingPaneLayout$PanelSlideListener0;
    }

    public void setParallaxDistance(@Px int v) {
        this.k = v;
        this.requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable0) {
        this.setShadowDrawableLeft(drawable0);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable0) {
        this.c = drawable0;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable0) {
        this.d = drawable0;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int v) {
        this.setShadowDrawableLeft(this.getResources().getDrawable(v));
    }

    public void setShadowResourceLeft(int v) {
        this.setShadowDrawableLeft(ContextCompat.getDrawable(this.getContext(), v));
    }

    public void setShadowResourceRight(int v) {
        this.setShadowDrawableRight(ContextCompat.getDrawable(this.getContext(), v));
    }

    @Deprecated
    public void setSliderFadeColor(@ColorInt int v) {
        this.a = v;
    }

    private void t(float f) {
        boolean z = this.n();
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(view0 != this.f) {
                int v2 = (int)((1.0f - this.h) * ((float)this.k));
                this.h = f;
                view0.offsetLeftAndRight((z ? -(v2 - ((int)((1.0f - f) * ((float)this.k)))) : v2 - ((int)((1.0f - f) * ((float)this.k)))));
            }
        }
    }

    public void u(@NonNull PanelSlideListener slidingPaneLayout$PanelSlideListener0) {
        this.n.remove(slidingPaneLayout$PanelSlideListener0);
    }

    void v() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(view0.getVisibility() == 4) {
                view0.setVisibility(0);
            }
        }
    }

    @Deprecated
    public void w() {
        this.d();
    }

    @Deprecated
    public void x() {
        this.r();
    }

    boolean y(float f, int v) {
        int v3;
        if(!this.e) {
            return false;
        }
        boolean z = this.n();
        LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)this.f.getLayoutParams();
        if(z) {
            int v1 = this.getPaddingRight() + slidingPaneLayout$LayoutParams0.rightMargin;
            int v2 = this.f.getWidth();
            v3 = (int)(((float)this.getWidth()) - (((float)v1) + f * ((float)this.i) + ((float)v2)));
        }
        else {
            v3 = (int)(((float)(this.getPaddingLeft() + slidingPaneLayout$LayoutParams0.leftMargin)) + f * ((float)this.i));
        }
        View view0 = this.f;
        int v4 = view0.getTop();
        if(this.p.X(view0, v3, v4)) {
            this.v();
            ViewCompat.v1(this);
            return true;
        }
        return false;
    }

    private ArrayList z() {
        if(this.v == null || !this.v.a() || this.v.getBounds().left == 0) {
            return null;
        }
        if(this.v.getBounds().top == 0) {
            Rect rect0 = SlidingPaneLayout.j(this.v, this);
            if(rect0 == null) {
                return null;
            }
            Rect rect1 = new Rect(this.getPaddingLeft(), this.getPaddingTop(), Math.max(this.getPaddingLeft(), rect0.left), this.getHeight() - this.getPaddingBottom());
            int v = this.getWidth() - this.getPaddingRight();
            return new ArrayList(Arrays.asList(new Rect[]{rect1, new Rect(Math.min(v, rect0.right), this.getPaddingTop(), v, this.getHeight() - this.getPaddingBottom())}));
        }
        return null;
    }
}

