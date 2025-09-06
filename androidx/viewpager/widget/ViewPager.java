package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE})
    public @interface DecorView {
    }

    static class ItemInfo {
        Object a;
        int b;
        boolean c;
        float d;
        float e;

    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        float c;
        boolean d;
        int e;
        int f;

        public LayoutParams() {
            super(-1, -1);
            this.c = 0.0f;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.c = 0.0f;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, ViewPager.i9);
            this.b = typedArray0.getInteger(0, 0x30);
            typedArray0.recycle();
        }
    }

    class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        final ViewPager d;

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void f(View view0, AccessibilityEvent accessibilityEvent0) {
            super.f(view0, accessibilityEvent0);
            accessibilityEvent0.setClassName("androidx.viewpager.widget.ViewPager");
            accessibilityEvent0.setScrollable(this.n());
            if(accessibilityEvent0.getEventType() == 0x1000) {
                PagerAdapter pagerAdapter0 = ViewPager.this.e;
                if(pagerAdapter0 != null) {
                    accessibilityEvent0.setItemCount(pagerAdapter0.e());
                    accessibilityEvent0.setFromIndex(ViewPager.this.f);
                    accessibilityEvent0.setToIndex(ViewPager.this.f);
                }
            }
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            super.g(view0, accessibilityNodeInfoCompat0);
            accessibilityNodeInfoCompat0.k1("androidx.viewpager.widget.ViewPager");
            accessibilityNodeInfoCompat0.Z1(this.n());
            if(ViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat0.a(0x1000);
            }
            if(ViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat0.a(0x2000);
            }
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public boolean j(View view0, int v, Bundle bundle0) {
            if(super.j(view0, v, bundle0)) {
                return true;
            }
            switch(v) {
                case 0x1000: {
                    if(ViewPager.this.canScrollHorizontally(1)) {
                        ViewPager.this.setCurrentItem(ViewPager.this.f + 1);
                        return true;
                    }
                    return false;
                }
                case 0x2000: {
                    if(ViewPager.this.canScrollHorizontally(-1)) {
                        ViewPager.this.setCurrentItem(ViewPager.this.f - 1);
                        return true;
                    }
                    return false;
                }
                default: {
                    return false;
                }
            }
        }

        private boolean n() {
            PagerAdapter pagerAdapter0 = ViewPager.this.e;
            return pagerAdapter0 != null && pagerAdapter0.e() > 1;
        }
    }

    public interface OnAdapterChangeListener {
        void c(@NonNull ViewPager arg1, @Nullable PagerAdapter arg2, @Nullable PagerAdapter arg3);
    }

    public interface OnPageChangeListener {
        void a(int arg1, float arg2, @Px int arg3);

        void b(int arg1);

        void d(int arg1);
    }

    public interface PageTransformer {
        void a(@NonNull View arg1, float arg2);
    }

    class PagerObserver extends DataSetObserver {
        final ViewPager a;

        @Override  // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.j();
        }

        @Override  // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.j();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        int c;
        Parcelable d;
        ClassLoader e;

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

        SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            if(classLoader0 == null) {
                classLoader0 = this.getClass().getClassLoader();
            }
            this.c = parcel0.readInt();
            this.d = parcel0.readParcelable(classLoader0);
            this.e = classLoader0;
        }

        public SavedState(@NonNull Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override
        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.c + "}";
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.c);
            parcel0.writeParcelable(this.d, v);
        }
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void a(int v, float f, int v1) {
        }

        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void b(int v) {
        }

        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void d(int v) {
        }
    }

    static class ViewPositionComparator implements Comparator {
        public int b(View view0, View view1) {
            LayoutParams viewPager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            LayoutParams viewPager$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
            boolean z = viewPager$LayoutParams0.a;
            if(z != viewPager$LayoutParams1.a) {
                return z ? 1 : -1;
            }
            return viewPager$LayoutParams0.e - viewPager$LayoutParams1.e;
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.b(((View)object0), ((View)object1));
        }
    }

    private int A;
    private int B;
    private int C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int H;
    private VelocityTracker I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean M8;
    private boolean N;
    private boolean N8;
    private long O;
    private boolean O8;
    private EdgeEffect P;
    private int P8;
    private EdgeEffect Q;
    private List Q8;
    private OnPageChangeListener R8;
    private OnPageChangeListener S8;
    private List T8;
    private PageTransformer U8;
    private int V8;
    private int W8;
    private ArrayList X8;
    private final Runnable Y8;
    private int Z8;
    private int a;
    private static final String a9 = "ViewPager";
    private final ArrayList b;
    private static final boolean b9 = false;
    private final ItemInfo c;
    private static final boolean c9 = false;
    private final Rect d;
    private static final int d9 = 1;
    PagerAdapter e;
    private static final int e9 = 600;
    int f;
    private static final int f9 = 25;
    private int g;
    private static final int g9 = 16;
    private Parcelable h;
    private static final int h9 = 400;
    private ClassLoader i;
    static final int[] i9 = null;
    private Scroller j;
    private static final Comparator j9 = null;
    private boolean k;
    private static final Interpolator k9 = null;
    private PagerObserver l;
    private static final int l9 = -1;
    private int m;
    private static final int m9 = 2;
    private Drawable n;
    private static final int n9 = 0;
    private int o;
    private static final int o9 = 1;
    private int p;
    private static final int p9 = 2;
    private float q;
    private static final ViewPositionComparator q9 = null;
    private float r;
    public static final int r9 = 0;
    private int s;
    public static final int s9 = 1;
    private int t;
    public static final int t9 = 2;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private boolean y;
    private boolean z;

    static {
        ViewPager.i9 = new int[]{0x10100B3};
        ViewPager.j9 = new Comparator() {
            public int b(ItemInfo viewPager$ItemInfo0, ItemInfo viewPager$ItemInfo1) {
                return viewPager$ItemInfo0.b - viewPager$ItemInfo1.b;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.b(((ItemInfo)object0), ((ItemInfo)object1));
            }
        };
        ViewPager.k9 = new Interpolator() {
            @Override  // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) + 1.0f;
            }
        };
        ViewPager.q9 = new ViewPositionComparator();
    }

    public ViewPager(@NonNull Context context0) {
        super(context0);
        this.b = new ArrayList();
        this.c = new ItemInfo();
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = -3.402823E+38f;
        this.r = 3.402823E+38f;
        this.x = 1;
        this.H = -1;
        this.M8 = true;
        this.N8 = false;
        this.Y8 = new Runnable() {
            final ViewPager a;

            @Override
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.J();
            }
        };
        this.Z8 = 0;
        this.z();
    }

    public ViewPager(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = new ArrayList();
        this.c = new ItemInfo();
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = -3.402823E+38f;
        this.r = 3.402823E+38f;
        this.x = 1;
        this.H = -1;
        this.M8 = true;
        this.N8 = false;
        this.Y8 = new Runnable() {
            final ViewPager a;

            @Override
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.J();
            }
        };
        this.Z8 = 0;
        this.z();
    }

    private static boolean A(@NonNull View view0) {
        return view0.getClass().getAnnotation(DecorView.class) != null;
    }

    public boolean B() {
        return this.N;
    }

    private boolean C(float f, float f1) {
        return f < ((float)this.B) && f1 > 0.0f || f > ((float)(this.getWidth() - this.B)) && f1 < 0.0f;
    }

    @CallSuper
    protected void D(int v, float f, int v1) {
        int v9;
        if(this.P8 > 0) {
            int v3 = this.getScrollX();
            int v4 = this.getPaddingLeft();
            int v5 = this.getPaddingRight();
            int v6 = this.getWidth();
            int v7 = this.getChildCount();
            for(int v8 = 0; v8 < v7; ++v8) {
                View view0 = this.getChildAt(v8);
                LayoutParams viewPager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(viewPager$LayoutParams0.a) {
                    switch(viewPager$LayoutParams0.b & 7) {
                        case 1: {
                            v9 = v4;
                            v4 = Math.max((v6 - view0.getMeasuredWidth()) / 2, v4);
                            break;
                        }
                        case 3: {
                            v9 = view0.getWidth() + v4;
                            break;
                        }
                        case 5: {
                            int v10 = v6 - v5 - view0.getMeasuredWidth();
                            v5 += view0.getMeasuredWidth();
                            v9 = v4;
                            v4 = v10;
                            break;
                        }
                        default: {
                            v9 = v4;
                        }
                    }
                    int v11 = v4 + v3 - view0.getLeft();
                    if(v11 != 0) {
                        view0.offsetLeftAndRight(v11);
                    }
                    v4 = v9;
                }
            }
        }
        this.l(v, f, v1);
        if(this.U8 != null) {
            int v12 = this.getScrollX();
            int v13 = this.getChildCount();
            for(int v2 = 0; v2 < v13; ++v2) {
                View view1 = this.getChildAt(v2);
                if(!((LayoutParams)view1.getLayoutParams()).a) {
                    float f1 = ((float)(view1.getLeft() - v12)) / ((float)this.getClientWidth());
                    this.U8.a(view1, f1);
                }
            }
        }
        this.O8 = true;
    }

    private void E(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionIndex();
        if(motionEvent0.getPointerId(v) == this.H) {
            int v1 = v == 0 ? 1 : 0;
            this.D = motionEvent0.getX(v1);
            this.H = motionEvent0.getPointerId(v1);
            VelocityTracker velocityTracker0 = this.I;
            if(velocityTracker0 != null) {
                velocityTracker0.clear();
            }
        }
    }

    boolean F() {
        int v = this.f;
        if(v > 0) {
            this.S(v - 1, true);
            return true;
        }
        return false;
    }

    boolean G() {
        if(this.e != null && this.f < this.e.e() - 1) {
            this.S(this.f + 1, true);
            return true;
        }
        return false;
    }

    private boolean H(int v) {
        if(this.b.size() == 0) {
            if(this.M8) {
                return false;
            }
            this.O8 = false;
            this.D(0, 0.0f, 0);
            if(!this.O8) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            return false;
        }
        ItemInfo viewPager$ItemInfo0 = this.x();
        int v1 = this.getClientWidth();
        int v2 = v1 + this.m;
        int v3 = viewPager$ItemInfo0.b;
        float f = (((float)v) / ((float)v1) - viewPager$ItemInfo0.e) / (viewPager$ItemInfo0.d + ((float)this.m) / ((float)v1));
        this.O8 = false;
        this.D(v3, f, ((int)(((float)v2) * f)));
        if(!this.O8) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    private boolean I(float f) {
        boolean z2;
        boolean z1;
        float f1 = this.D - f;
        this.D = f;
        float f2 = ((float)this.getScrollX()) + f1;
        float f3 = (float)this.getClientWidth();
        float f4 = this.q * f3;
        float f5 = this.r * f3;
        boolean z = false;
        ItemInfo viewPager$ItemInfo0 = (ItemInfo)this.b.get(0);
        ItemInfo viewPager$ItemInfo1 = (ItemInfo)this.b.get(this.b.size() - 1);
        if(viewPager$ItemInfo0.b == 0) {
            z1 = true;
        }
        else {
            f4 = viewPager$ItemInfo0.e * f3;
            z1 = false;
        }
        if(viewPager$ItemInfo1.b == this.e.e() - 1) {
            z2 = true;
        }
        else {
            f5 = viewPager$ItemInfo1.e * f3;
            z2 = false;
        }
        if(f2 < f4) {
            if(z1) {
                this.P.onPull(Math.abs(f4 - f2) / f3);
                z = true;
            }
            f2 = f4;
        }
        else if(f2 > f5) {
            if(z2) {
                this.Q.onPull(Math.abs(f2 - f5) / f3);
                z = true;
            }
            f2 = f5;
        }
        this.D += f2 - ((float)(((int)f2)));
        this.scrollTo(((int)f2), this.getScrollY());
        this.H(((int)f2));
        return z;
    }

    void J() {
        this.K(this.f);
    }

    void K(int v) {
        String s;
        ItemInfo viewPager$ItemInfo3;
        ItemInfo viewPager$ItemInfo1;
        ItemInfo viewPager$ItemInfo0;
        int v1 = this.f;
        if(v1 == v) {
            viewPager$ItemInfo0 = null;
        }
        else {
            viewPager$ItemInfo0 = this.y(v1);
            this.f = v;
        }
        if(this.e == null) {
            this.a0();
            return;
        }
        if(this.w) {
            this.a0();
            return;
        }
        if(this.getWindowToken() == null) {
            return;
        }
        this.e.t(this);
        int v2 = this.x;
        int v3 = Math.max(0, this.f - v2);
        int v4 = this.e.e();
        int v5 = Math.min(v4 - 1, this.f + v2);
        if(v4 == this.a) {
            int v6 = 0;
            while(true) {
                if(v6 < this.b.size()) {
                    viewPager$ItemInfo1 = (ItemInfo)this.b.get(v6);
                    int v7 = viewPager$ItemInfo1.b;
                    int v8 = this.f;
                    if(v7 < v8) {
                        ++v6;
                        continue;
                    }
                    else if(v7 == v8) {
                        break;
                    }
                }
                viewPager$ItemInfo1 = null;
                break;
            }
            if(viewPager$ItemInfo1 == null && v4 > 0) {
                viewPager$ItemInfo1 = this.a(this.f, v6);
            }
            if(viewPager$ItemInfo1 != null) {
                int v9 = v6 - 1;
                ItemInfo viewPager$ItemInfo2 = v9 < 0 ? null : ((ItemInfo)this.b.get(v9));
                int v10 = this.getClientWidth();
                float f = v10 > 0 ? 2.0f - viewPager$ItemInfo1.d + ((float)this.getPaddingLeft()) / ((float)v10) : 0.0f;
                int v11 = this.f - 1;
                float f1 = 0.0f;
                while(v11 >= 0) {
                    if(f1 < f || v11 >= v3) {
                        if(viewPager$ItemInfo2 == null || v11 != viewPager$ItemInfo2.b) {
                            f1 += this.a(v11, v9 + 1).d;
                            ++v6;
                            if(v9 >= 0) {
                                viewPager$ItemInfo3 = (ItemInfo)this.b.get(v9);
                                goto label_66;
                            }
                        }
                        else {
                            f1 += viewPager$ItemInfo2.d;
                            --v9;
                            if(v9 >= 0) {
                                viewPager$ItemInfo3 = (ItemInfo)this.b.get(v9);
                                goto label_66;
                            }
                        }
                        viewPager$ItemInfo3 = null;
                    label_66:
                        viewPager$ItemInfo2 = viewPager$ItemInfo3;
                    }
                    else {
                        if(viewPager$ItemInfo2 == null) {
                            break;
                        }
                        if(v11 == viewPager$ItemInfo2.b && !viewPager$ItemInfo2.c) {
                            this.b.remove(v9);
                            this.e.b(this, v11, viewPager$ItemInfo2.a);
                            --v9;
                            --v6;
                            viewPager$ItemInfo3 = v9 >= 0 ? ((ItemInfo)this.b.get(v9)) : null;
                            goto label_66;
                        }
                    }
                    --v11;
                }
                float f2 = viewPager$ItemInfo1.d;
                int v12 = v6 + 1;
                if(f2 < 2.0f) {
                    ItemInfo viewPager$ItemInfo4 = v12 >= this.b.size() ? null : ((ItemInfo)this.b.get(v12));
                    float f3 = v10 > 0 ? ((float)this.getPaddingRight()) / ((float)v10) + 2.0f : 0.0f;
                    int v13 = this.f;
                    while(true) {
                        ++v13;
                        if(v13 >= v4) {
                            break;
                        }
                        if(f2 >= f3 && v13 > v5) {
                            if(viewPager$ItemInfo4 == null) {
                                break;
                            }
                            if(v13 != viewPager$ItemInfo4.b || viewPager$ItemInfo4.c) {
                                continue;
                            }
                            this.b.remove(v12);
                            this.e.b(this, v13, viewPager$ItemInfo4.a);
                            if(v12 < this.b.size()) {
                                viewPager$ItemInfo4 = (ItemInfo)this.b.get(v12);
                                continue;
                            }
                        }
                        else if(viewPager$ItemInfo4 == null || v13 != viewPager$ItemInfo4.b) {
                            ItemInfo viewPager$ItemInfo5 = this.a(v13, v12);
                            ++v12;
                            f2 += viewPager$ItemInfo5.d;
                            if(v12 < this.b.size()) {
                                viewPager$ItemInfo4 = (ItemInfo)this.b.get(v12);
                                continue;
                            }
                        }
                        else {
                            f2 += viewPager$ItemInfo4.d;
                            ++v12;
                            if(v12 < this.b.size()) {
                                viewPager$ItemInfo4 = (ItemInfo)this.b.get(v12);
                                continue;
                            }
                        }
                        viewPager$ItemInfo4 = null;
                    }
                }
                this.f(viewPager$ItemInfo1, v6, viewPager$ItemInfo0);
                this.e.q(this, this.f, viewPager$ItemInfo1.a);
            }
            this.e.d(this);
            int v14 = this.getChildCount();
            for(int v15 = 0; v15 < v14; ++v15) {
                View view0 = this.getChildAt(v15);
                LayoutParams viewPager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                viewPager$LayoutParams0.f = v15;
                if(!viewPager$LayoutParams0.a && viewPager$LayoutParams0.c == 0.0f) {
                    ItemInfo viewPager$ItemInfo6 = this.w(view0);
                    if(viewPager$ItemInfo6 != null) {
                        viewPager$LayoutParams0.c = viewPager$ItemInfo6.d;
                        viewPager$LayoutParams0.e = viewPager$ItemInfo6.b;
                    }
                }
            }
            this.a0();
            if(this.hasFocus()) {
                View view1 = this.findFocus();
                ItemInfo viewPager$ItemInfo7 = view1 == null ? null : this.v(view1);
                if(viewPager$ItemInfo7 == null || viewPager$ItemInfo7.b != this.f) {
                    for(int v16 = 0; v16 < this.getChildCount(); ++v16) {
                        View view2 = this.getChildAt(v16);
                        ItemInfo viewPager$ItemInfo8 = this.w(view2);
                        if(viewPager$ItemInfo8 != null && viewPager$ItemInfo8.b == this.f && view2.requestFocus(2)) {
                            break;
                        }
                    }
                }
            }
            return;
        }
        try {
            s = this.getResources().getResourceName(this.getId());
        }
        catch(Resources.NotFoundException unused_ex) {
            s = Integer.toHexString(this.getId());
        }
        throw new IllegalStateException("The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.a + ", found: " + v4 + " Pager id: " + s + " Pager class: " + this.getClass() + " Problematic adapter: " + this.e.getClass());
    }

    private void L(int v, int v1, int v2, int v3) {
        if(v1 > 0 && !this.b.isEmpty()) {
            if(!this.j.isFinished()) {
                this.j.setFinalX(this.getCurrentItem() * this.getClientWidth());
                return;
            }
            int v4 = this.getPaddingLeft();
            int v5 = this.getPaddingRight();
            int v6 = this.getPaddingLeft();
            int v7 = this.getPaddingRight();
            this.scrollTo(((int)(((float)this.getScrollX()) / ((float)(v1 - v6 - v7 + v3)) * ((float)(v - v4 - v5 + v2)))), this.getScrollY());
            return;
        }
        ItemInfo viewPager$ItemInfo0 = this.y(this.f);
        int v8 = (int)((viewPager$ItemInfo0 == null ? 0.0f : Math.min(viewPager$ItemInfo0.e, this.r)) * ((float)(v - this.getPaddingLeft() - this.getPaddingRight())));
        if(v8 != this.getScrollX()) {
            this.i(false);
            this.scrollTo(v8, this.getScrollY());
        }
    }

    private void M() {
        for(int v = 0; v < this.getChildCount(); ++v) {
            if(!((LayoutParams)this.getChildAt(v).getLayoutParams()).a) {
                this.removeViewAt(v);
                --v;
            }
        }
    }

    public void N(@NonNull OnAdapterChangeListener viewPager$OnAdapterChangeListener0) {
        List list0 = this.T8;
        if(list0 != null) {
            list0.remove(viewPager$OnAdapterChangeListener0);
        }
    }

    public void O(@NonNull OnPageChangeListener viewPager$OnPageChangeListener0) {
        List list0 = this.Q8;
        if(list0 != null) {
            list0.remove(viewPager$OnPageChangeListener0);
        }
    }

    private void P(boolean z) {
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean Q() {
        this.H = -1;
        this.q();
        this.P.onRelease();
        this.Q.onRelease();
        return this.P.isFinished() || this.Q.isFinished();
    }

    private void R(int v, boolean z, int v1, boolean z1) {
        ItemInfo viewPager$ItemInfo0 = this.y(v);
        int v2 = viewPager$ItemInfo0 == null ? 0 : ((int)(((float)this.getClientWidth()) * Math.max(this.q, Math.min(viewPager$ItemInfo0.e, this.r))));
        if(z) {
            this.Z(v2, 0, v1);
            if(z1) {
                this.m(v);
            }
        }
        else {
            if(z1) {
                this.m(v);
            }
            this.i(false);
            this.scrollTo(v2, 0);
            this.H(v2);
        }
    }

    public void S(int v, boolean z) {
        this.w = false;
        this.T(v, z, false);
    }

    void T(int v, boolean z, boolean z1) {
        this.U(v, z, z1, 0);
    }

    void U(int v, boolean z, boolean z1, int v1) {
        boolean z2 = false;
        if(this.e != null && this.e.e() > 0) {
            if(!z1 && this.f == v && this.b.size() != 0) {
                this.setScrollingCacheEnabled(false);
                return;
            }
            if(v < 0) {
                v = 0;
            }
            else if(v >= this.e.e()) {
                v = this.e.e() - 1;
            }
            if(v > this.f + this.x || v < this.f - this.x) {
                for(int v2 = 0; v2 < this.b.size(); ++v2) {
                    ((ItemInfo)this.b.get(v2)).c = true;
                }
            }
            if(this.f != v) {
                z2 = true;
            }
            if(this.M8) {
                this.f = v;
                if(z2) {
                    this.m(v);
                }
                this.requestLayout();
                return;
            }
            this.K(v);
            this.R(v, z, v1, z2);
            return;
        }
        this.setScrollingCacheEnabled(false);
    }

    OnPageChangeListener V(OnPageChangeListener viewPager$OnPageChangeListener0) {
        OnPageChangeListener viewPager$OnPageChangeListener1 = this.S8;
        this.S8 = viewPager$OnPageChangeListener0;
        return viewPager$OnPageChangeListener1;
    }

    public void W(boolean z, @Nullable PageTransformer viewPager$PageTransformer0) {
        this.X(z, viewPager$PageTransformer0, 2);
    }

    public void X(boolean z, @Nullable PageTransformer viewPager$PageTransformer0, int v) {
        int v1 = 1;
        boolean z1 = viewPager$PageTransformer0 != null != (this.U8 != null);
        this.U8 = viewPager$PageTransformer0;
        this.setChildrenDrawingOrderEnabled(viewPager$PageTransformer0 != null);
        if(viewPager$PageTransformer0 == null) {
            this.W8 = 0;
        }
        else {
            if(z) {
                v1 = 2;
            }
            this.W8 = v1;
            this.V8 = v;
        }
        if(z1) {
            this.J();
        }
    }

    void Y(int v, int v1) {
        this.Z(v, v1, 0);
    }

    void Z(int v, int v1, int v2) {
        int v3;
        if(this.getChildCount() == 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        if(this.j == null || this.j.isFinished()) {
            v3 = this.getScrollX();
        }
        else {
            v3 = this.k ? this.j.getCurrX() : this.j.getStartX();
            this.j.abortAnimation();
            this.setScrollingCacheEnabled(false);
        }
        int v4 = this.getScrollY();
        int v5 = v - v3;
        int v6 = v1 - v4;
        if(v5 == 0 && v6 == 0) {
            this.i(false);
            this.J();
            this.setScrollState(0);
            return;
        }
        this.setScrollingCacheEnabled(true);
        this.setScrollState(2);
        int v7 = this.getClientWidth();
        int v8 = Math.abs(v2);
        this.k = false;
        this.j.startScroll(v3, v4, v5, v6, Math.min((v8 <= 0 ? ((int)((((float)Math.abs(v5)) / (((float)v7) * 1.0f + ((float)this.m)) + 1.0f) * 100.0f)) : Math.round(Math.abs((((float)(v7 / 2)) + this.o(Math.min(1.0f, ((float)Math.abs(v5)) * 1.0f / ((float)v7))) * ((float)(v7 / 2))) / ((float)v8)) * 1000.0f) * 4), 600));
        ViewCompat.v1(this);
    }

    ItemInfo a(int v, int v1) {
        ItemInfo viewPager$ItemInfo0 = new ItemInfo();
        viewPager$ItemInfo0.b = v;
        viewPager$ItemInfo0.a = this.e.j(this, v);
        viewPager$ItemInfo0.d = 1.0f;
        if(v1 >= 0 && v1 < this.b.size()) {
            this.b.add(v1, viewPager$ItemInfo0);
            return viewPager$ItemInfo0;
        }
        this.b.add(viewPager$ItemInfo0);
        return viewPager$ItemInfo0;
    }

    private void a0() {
        if(this.W8 != 0) {
            ArrayList arrayList0 = this.X8;
            if(arrayList0 == null) {
                this.X8 = new ArrayList();
            }
            else {
                arrayList0.clear();
            }
            int v = this.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = this.getChildAt(v1);
                this.X8.add(view0);
            }
            Collections.sort(this.X8, ViewPager.q9);
        }
    }

    @Override  // android.view.ViewGroup
    public void addFocusables(ArrayList arrayList0, int v, int v1) {
        int v2 = arrayList0.size();
        int v3 = this.getDescendantFocusability();
        if(v3 != 0x60000) {
            for(int v4 = 0; v4 < this.getChildCount(); ++v4) {
                View view0 = this.getChildAt(v4);
                if(view0.getVisibility() == 0) {
                    ItemInfo viewPager$ItemInfo0 = this.w(view0);
                    if(viewPager$ItemInfo0 != null && viewPager$ItemInfo0.b == this.f) {
                        view0.addFocusables(arrayList0, v, v1);
                    }
                }
            }
        }
        if(v3 == 0x40000 && v2 != arrayList0.size() || !this.isFocusable()) {
            return;
        }
        if((v1 & 1) == 1 && this.isInTouchMode() && !this.isFocusableInTouchMode()) {
            return;
        }
        arrayList0.add(this);
    }

    @Override  // android.view.ViewGroup
    public void addTouchables(ArrayList arrayList0) {
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(view0.getVisibility() == 0) {
                ItemInfo viewPager$ItemInfo0 = this.w(view0);
                if(viewPager$ItemInfo0 != null && viewPager$ItemInfo0.b == this.f) {
                    view0.addTouchables(arrayList0);
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(!this.checkLayoutParams(viewGroup$LayoutParams0)) {
            viewGroup$LayoutParams0 = this.generateLayoutParams(viewGroup$LayoutParams0);
        }
        int v1 = ((LayoutParams)viewGroup$LayoutParams0).a | ViewPager.A(view0);
        ((LayoutParams)viewGroup$LayoutParams0).a = v1;
        if(this.u) {
            if(v1 != 0) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            ((LayoutParams)viewGroup$LayoutParams0).d = true;
            this.addViewInLayout(view0, v, viewGroup$LayoutParams0);
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    public void b(@NonNull OnAdapterChangeListener viewPager$OnAdapterChangeListener0) {
        if(this.T8 == null) {
            this.T8 = new ArrayList();
        }
        this.T8.add(viewPager$OnAdapterChangeListener0);
    }

    public void c(@NonNull OnPageChangeListener viewPager$OnPageChangeListener0) {
        if(this.Q8 == null) {
            this.Q8 = new ArrayList();
        }
        this.Q8.add(viewPager$OnPageChangeListener0);
    }

    @Override  // android.view.View
    public boolean canScrollHorizontally(int v) {
        if(this.e == null) {
            return false;
        }
        int v1 = this.getClientWidth();
        int v2 = this.getScrollX();
        return v >= 0 ? v > 0 && v2 < ((int)(((float)v1) * this.r)) : v2 > ((int)(((float)v1) * this.q));
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams && super.checkLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    public void computeScroll() {
        this.k = true;
        if(!this.j.isFinished() && this.j.computeScrollOffset()) {
            int v = this.getScrollX();
            int v1 = this.getScrollY();
            int v2 = this.j.getCurrX();
            int v3 = this.j.getCurrY();
            if(v != v2 || v1 != v3) {
                this.scrollTo(v2, v3);
                if(!this.H(v2)) {
                    this.j.abortAnimation();
                    this.scrollTo(0, v3);
                }
            }
            ViewCompat.v1(this);
            return;
        }
        this.i(true);
    }

    public boolean d(int v) {
        boolean z;
        View view0 = this.findFocus();
        if(view0 == this) {
            view0 = null;
        }
        else if(view0 != null) {
            ViewParent viewParent0 = view0.getParent();
            while(viewParent0 instanceof ViewGroup) {
                if(viewParent0 == this) {
                    goto label_20;
                }
                viewParent0 = viewParent0.getParent();
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(view0.getClass().getSimpleName());
            for(ViewParent viewParent1 = view0.getParent(); viewParent1 instanceof ViewGroup; viewParent1 = viewParent1.getParent()) {
                stringBuilder0.append(" => ");
                stringBuilder0.append(viewParent1.getClass().getSimpleName());
            }
            Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + stringBuilder0.toString());
            view0 = null;
        }
    label_20:
        View view1 = FocusFinder.getInstance().findNextFocus(this, view0, v);
        if(view1 == null || view1 == view0) {
            switch(v) {
                case 1: 
                case 17: {
                    z = this.F();
                    break;
                }
                case 2: 
                case 66: {
                    z = this.G();
                    break;
                }
                default: {
                    z = false;
                }
            }
        }
        else if(v != 17) {
            if(v != 66) {
                z = false;
            }
            else if(view0 != null && this.u(this.d, view1).left <= this.u(this.d, view0).left) {
                z = this.G();
            }
            else {
                z = view1.requestFocus();
            }
        }
        else if(view0 != null && this.u(this.d, view1).left >= this.u(this.d, view0).left) {
            z = this.F();
        }
        else {
            z = view1.requestFocus();
        }
        if(z) {
            this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(v));
        }
        return z;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return super.dispatchKeyEvent(keyEvent0) || this.s(keyEvent0);
    }

    @Override  // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        if(accessibilityEvent0.getEventType() == 0x1000) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent0);
        }
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(view0.getVisibility() == 0) {
                ItemInfo viewPager$ItemInfo0 = this.w(view0);
                if(viewPager$ItemInfo0 != null && viewPager$ItemInfo0.b == this.f && view0.dispatchPopulateAccessibilityEvent(accessibilityEvent0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        super.draw(canvas0);
        int v = this.getOverScrollMode();
        boolean z = false;
        if(v == 0 || v == 1 && (this.e != null && this.e.e() > 1)) {
            if(!this.P.isFinished()) {
                int v1 = canvas0.save();
                int v2 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
                int v3 = this.getWidth();
                canvas0.rotate(270.0f);
                canvas0.translate(((float)(this.getPaddingTop() - v2)), this.q * ((float)v3));
                this.P.setSize(v2, v3);
                z = this.P.draw(canvas0);
                canvas0.restoreToCount(v1);
            }
            if(!this.Q.isFinished()) {
                int v4 = canvas0.save();
                int v5 = this.getWidth();
                int v6 = this.getHeight();
                int v7 = this.getPaddingTop();
                int v8 = this.getPaddingBottom();
                canvas0.rotate(90.0f);
                canvas0.translate(((float)(-this.getPaddingTop())), -(this.r + 1.0f) * ((float)v5));
                this.Q.setSize(v6 - v7 - v8, v5);
                z |= this.Q.draw(canvas0);
                canvas0.restoreToCount(v4);
            }
        }
        else {
            this.P.finish();
            this.Q.finish();
        }
        if(z) {
            ViewCompat.v1(this);
        }
    }

    @Override  // android.view.ViewGroup
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable0 = this.n;
        if(drawable0 != null && drawable0.isStateful()) {
            drawable0.setState(this.getDrawableState());
        }
    }

    public boolean e() {
        if(this.y) {
            return false;
        }
        this.N = true;
        this.setScrollState(1);
        this.D = 0.0f;
        this.F = 0.0f;
        VelocityTracker velocityTracker0 = this.I;
        if(velocityTracker0 == null) {
            this.I = VelocityTracker.obtain();
        }
        else {
            velocityTracker0.clear();
        }
        long v = SystemClock.uptimeMillis();
        MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 0, 0.0f, 0.0f, 0);
        this.I.addMovement(motionEvent0);
        motionEvent0.recycle();
        this.O = v;
        return true;
    }

    private void f(ItemInfo viewPager$ItemInfo0, int v, ItemInfo viewPager$ItemInfo1) {
        int v1 = this.e.e();
        int v2 = this.getClientWidth();
        float f = v2 <= 0 ? 0.0f : ((float)this.m) / ((float)v2);
        if(viewPager$ItemInfo1 != null) {
            int v3 = viewPager$ItemInfo1.b;
            int v4 = viewPager$ItemInfo0.b;
            if(v3 < v4) {
                float f1 = viewPager$ItemInfo1.e + viewPager$ItemInfo1.d + f;
                int v5 = v3 + 1;
                int v6 = 0;
                while(v5 <= viewPager$ItemInfo0.b && v6 < this.b.size()) {
                    ItemInfo viewPager$ItemInfo2;
                    for(viewPager$ItemInfo2 = (ItemInfo)this.b.get(v6); v5 > viewPager$ItemInfo2.b && v6 < this.b.size() - 1; viewPager$ItemInfo2 = (ItemInfo)this.b.get(v6)) {
                        ++v6;
                    }
                    while(v5 < viewPager$ItemInfo2.b) {
                        f1 += f + 1.0f;
                        ++v5;
                    }
                    viewPager$ItemInfo2.e = f1;
                    f1 += viewPager$ItemInfo2.d + f;
                    ++v5;
                }
            }
            else if(v3 > v4) {
                int v7 = this.b.size() - 1;
                float f2 = viewPager$ItemInfo1.e;
                for(int v8 = v3 - 1; v8 >= viewPager$ItemInfo0.b && v7 >= 0; --v8) {
                    ItemInfo viewPager$ItemInfo3;
                    for(viewPager$ItemInfo3 = (ItemInfo)this.b.get(v7); v8 < viewPager$ItemInfo3.b && v7 > 0; viewPager$ItemInfo3 = (ItemInfo)this.b.get(v7)) {
                        --v7;
                    }
                    while(v8 > viewPager$ItemInfo3.b) {
                        f2 -= f + 1.0f;
                        --v8;
                    }
                    f2 -= viewPager$ItemInfo3.d + f;
                    viewPager$ItemInfo3.e = f2;
                }
            }
        }
        int v9 = this.b.size();
        float f3 = viewPager$ItemInfo0.e;
        int v10 = viewPager$ItemInfo0.b - 1;
        this.q = viewPager$ItemInfo0.b == 0 ? f3 : -3.402823E+38f;
        this.r = viewPager$ItemInfo0.b == v1 - 1 ? viewPager$ItemInfo0.d + f3 - 1.0f : 3.402823E+38f;
        int v11 = v - 1;
        while(v11 >= 0) {
            ItemInfo viewPager$ItemInfo4 = (ItemInfo)this.b.get(v11);
            while(true) {
                int v12 = viewPager$ItemInfo4.b;
                if(v10 <= v12) {
                    break;
                }
                f3 -= f + 1.0f;
                --v10;
            }
            f3 -= viewPager$ItemInfo4.d + f;
            viewPager$ItemInfo4.e = f3;
            if(v12 == 0) {
                this.q = f3;
            }
            --v11;
            --v10;
        }
        float f4 = viewPager$ItemInfo0.e + viewPager$ItemInfo0.d + f;
        int v13 = viewPager$ItemInfo0.b + 1;
        int v14 = v + 1;
        while(v14 < v9) {
            ItemInfo viewPager$ItemInfo5 = (ItemInfo)this.b.get(v14);
            while(true) {
                int v15 = viewPager$ItemInfo5.b;
                if(v13 >= v15) {
                    break;
                }
                f4 += f + 1.0f;
                ++v13;
            }
            if(v15 == v1 - 1) {
                this.r = viewPager$ItemInfo5.d + f4 - 1.0f;
            }
            viewPager$ItemInfo5.e = f4;
            f4 += viewPager$ItemInfo5.d + f;
            ++v14;
            ++v13;
        }
        this.N8 = false;
    }

    protected boolean g(View view0, boolean z, int v, int v1, int v2) {
        if(view0 instanceof ViewGroup) {
            int v3 = view0.getScrollX();
            int v4 = view0.getScrollY();
            for(int v5 = ((ViewGroup)view0).getChildCount() - 1; v5 >= 0; --v5) {
                View view1 = ((ViewGroup)view0).getChildAt(v5);
                int v6 = v1 + v3;
                if(v6 >= view1.getLeft() && v6 < view1.getRight()) {
                    int v7 = v2 + v4;
                    if(v7 >= view1.getTop() && v7 < view1.getBottom() && this.g(view1, true, v, v6 - view1.getLeft(), v7 - view1.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view0.canScrollHorizontally(-v);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.generateDefaultLayoutParams();
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.e;
    }

    @Override  // android.view.ViewGroup
    protected int getChildDrawingOrder(int v, int v1) {
        if(this.W8 == 2) {
            v1 = v - 1 - v1;
        }
        return ((LayoutParams)((View)this.X8.get(v1)).getLayoutParams()).f;
    }

    private int getClientWidth() {
        return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.x;
    }

    public int getPageMargin() {
        return this.m;
    }

    public void h() {
        List list0 = this.Q8;
        if(list0 != null) {
            list0.clear();
        }
    }

    private void i(boolean z) {
        boolean z1 = this.Z8 == 2;
        if(z1) {
            this.setScrollingCacheEnabled(false);
            if(!this.j.isFinished()) {
                this.j.abortAnimation();
                int v = this.getScrollX();
                int v1 = this.getScrollY();
                int v2 = this.j.getCurrX();
                int v3 = this.j.getCurrY();
                if(v != v2 || v1 != v3) {
                    this.scrollTo(v2, v3);
                    if(v2 != v) {
                        this.H(v2);
                    }
                }
            }
        }
        this.w = false;
        for(int v4 = 0; v4 < this.b.size(); ++v4) {
            ItemInfo viewPager$ItemInfo0 = (ItemInfo)this.b.get(v4);
            if(viewPager$ItemInfo0.c) {
                viewPager$ItemInfo0.c = false;
                z1 = true;
            }
        }
        if(z1) {
            if(z) {
                ViewCompat.x1(this, this.Y8);
                return;
            }
            this.Y8.run();
        }
    }

    void j() {
        int v = this.e.e();
        this.a = v;
        boolean z = this.b.size() < this.x * 2 + 1 && this.b.size() < v;
        int v1 = this.f;
        for(int v2 = 0; v2 < this.b.size(); ++v2) {
            ItemInfo viewPager$ItemInfo0 = (ItemInfo)this.b.get(v2);
        }
        Collections.sort(this.b, ViewPager.j9);
        if(z) {
            int v3 = this.getChildCount();
            for(int v4 = 0; v4 < v3; ++v4) {
                LayoutParams viewPager$LayoutParams0 = (LayoutParams)this.getChildAt(v4).getLayoutParams();
                if(!viewPager$LayoutParams0.a) {
                    viewPager$LayoutParams0.c = 0.0f;
                }
            }
            this.T(v1, false, true);
            this.requestLayout();
        }
    }

    private int k(int v, float f, int v1, int v2) {
        if(Math.abs(v2) <= this.L || Math.abs(v1) <= this.J) {
            v += (int)(f + (v < this.f ? 0.6f : 0.4f));
        }
        else if(v1 <= 0) {
            ++v;
        }
        if(this.b.size() > 0) {
            ItemInfo viewPager$ItemInfo0 = (ItemInfo)this.b.get(0);
            int v3 = Math.min(v, ((ItemInfo)this.b.get(this.b.size() - 1)).b);
            return Math.max(viewPager$ItemInfo0.b, v3);
        }
        return v;
    }

    private void l(int v, float f, int v1) {
        OnPageChangeListener viewPager$OnPageChangeListener0 = this.R8;
        if(viewPager$OnPageChangeListener0 != null) {
            viewPager$OnPageChangeListener0.a(v, f, v1);
        }
        List list0 = this.Q8;
        if(list0 != null) {
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                OnPageChangeListener viewPager$OnPageChangeListener1 = (OnPageChangeListener)this.Q8.get(v3);
                if(viewPager$OnPageChangeListener1 != null) {
                    viewPager$OnPageChangeListener1.a(v, f, v1);
                }
            }
        }
        OnPageChangeListener viewPager$OnPageChangeListener2 = this.S8;
        if(viewPager$OnPageChangeListener2 != null) {
            viewPager$OnPageChangeListener2.a(v, f, v1);
        }
    }

    private void m(int v) {
        OnPageChangeListener viewPager$OnPageChangeListener0 = this.R8;
        if(viewPager$OnPageChangeListener0 != null) {
            viewPager$OnPageChangeListener0.d(v);
        }
        List list0 = this.Q8;
        if(list0 != null) {
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                OnPageChangeListener viewPager$OnPageChangeListener1 = (OnPageChangeListener)this.Q8.get(v2);
                if(viewPager$OnPageChangeListener1 != null) {
                    viewPager$OnPageChangeListener1.d(v);
                }
            }
        }
        OnPageChangeListener viewPager$OnPageChangeListener2 = this.S8;
        if(viewPager$OnPageChangeListener2 != null) {
            viewPager$OnPageChangeListener2.d(v);
        }
    }

    private void n(int v) {
        OnPageChangeListener viewPager$OnPageChangeListener0 = this.R8;
        if(viewPager$OnPageChangeListener0 != null) {
            viewPager$OnPageChangeListener0.b(v);
        }
        List list0 = this.Q8;
        if(list0 != null) {
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                OnPageChangeListener viewPager$OnPageChangeListener1 = (OnPageChangeListener)this.Q8.get(v2);
                if(viewPager$OnPageChangeListener1 != null) {
                    viewPager$OnPageChangeListener1.b(v);
                }
            }
        }
        OnPageChangeListener viewPager$OnPageChangeListener2 = this.S8;
        if(viewPager$OnPageChangeListener2 != null) {
            viewPager$OnPageChangeListener2.b(v);
        }
    }

    float o(float f) {
        return (float)Math.sin((f - 0.5f) * 0.471239f);
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M8 = true;
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.Y8);
        if(this.j != null && !this.j.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        float f3;
        float f2;
        super.onDraw(canvas0);
        if(this.m > 0 && this.n != null && this.b.size() > 0 && this.e != null) {
            int v = this.getScrollX();
            int v1 = this.getWidth();
            float f = ((float)this.m) / ((float)v1);
            int v2 = 0;
            ItemInfo viewPager$ItemInfo0 = (ItemInfo)this.b.get(0);
            float f1 = viewPager$ItemInfo0.e;
            int v3 = this.b.size();
            int v4 = viewPager$ItemInfo0.b;
            int v5 = ((ItemInfo)this.b.get(v3 - 1)).b;
            while(v4 < v5) {
                while(true) {
                    int v6 = viewPager$ItemInfo0.b;
                    if(v4 <= v6 || v2 >= v3) {
                        break;
                    }
                    ++v2;
                    viewPager$ItemInfo0 = (ItemInfo)this.b.get(v2);
                }
                if(v4 == v6) {
                    f2 = (viewPager$ItemInfo0.e + viewPager$ItemInfo0.d) * ((float)v1);
                    f1 = viewPager$ItemInfo0.e + viewPager$ItemInfo0.d + f;
                }
                else {
                    f2 = (f1 + 1.0f) * ((float)v1);
                    f1 += f + 1.0f;
                }
                if(((float)this.m) + f2 > ((float)v)) {
                    f3 = f;
                    this.n.setBounds(Math.round(f2), this.o, Math.round(((float)this.m) + f2), this.p);
                    this.n.draw(canvas0);
                }
                else {
                    f3 = f;
                }
                if(f2 > ((float)(v + v1))) {
                    break;
                }
                ++v4;
                f = f3;
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        switch(v & 0xFF) {
            case 0: {
                break;
            }
            case 1: 
            case 3: {
                this.Q();
                return false;
            label_5:
                if(this.y) {
                    return true;
                }
                if(this.z) {
                    return false;
                }
                break;
            }
            default: {
                goto label_5;
            }
        }
        switch(v & 0xFF) {
            case 0: {
                float f = motionEvent0.getX();
                this.F = f;
                this.D = f;
                float f1 = motionEvent0.getY();
                this.G = f1;
                this.E = f1;
                this.H = motionEvent0.getPointerId(0);
                this.z = false;
                this.k = true;
                this.j.computeScrollOffset();
                if(this.Z8 != 2 || Math.abs(this.j.getFinalX() - this.j.getCurrX()) <= this.M) {
                    this.i(false);
                    this.y = false;
                }
                else {
                    this.j.abortAnimation();
                    this.w = false;
                    this.J();
                    this.y = true;
                    this.P(true);
                    this.setScrollState(1);
                }
                break;
            }
            case 2: {
                int v1 = this.H;
                if(v1 != -1) {
                    int v2 = motionEvent0.findPointerIndex(v1);
                    float f2 = motionEvent0.getX(v2);
                    float f3 = f2 - this.D;
                    float f4 = Math.abs(f3);
                    float f5 = motionEvent0.getY(v2);
                    float f6 = Math.abs(f5 - this.G);
                    int v3 = Float.compare(f3, 0.0f);
                    if(v3 != 0 && !this.C(this.D, f3) && this.g(this, false, ((int)f3), ((int)f2), ((int)f5))) {
                        this.D = f2;
                        this.E = f5;
                        this.z = true;
                        return false;
                    }
                    int v4 = this.C;
                    if(f4 > ((float)v4) && f4 * 0.5f > f6) {
                        this.y = true;
                        this.P(true);
                        this.setScrollState(1);
                        float f7 = (float)this.C;
                        this.D = v3 <= 0 ? this.F - f7 : this.F + f7;
                        this.E = f5;
                        this.setScrollingCacheEnabled(true);
                    }
                    else if(f6 > ((float)v4)) {
                        this.z = true;
                    }
                    if(this.y && this.I(f2)) {
                        ViewCompat.v1(this);
                    }
                }
                break;
            }
            default: {
                if((v & 0xFF) == 6) {
                    this.E(motionEvent0);
                }
            }
        }
        if(this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent0);
        return this.y;
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v17;
        int v15;
        int v4 = this.getChildCount();
        int v5 = v2 - v;
        int v6 = v3 - v1;
        int v7 = this.getPaddingLeft();
        int v8 = this.getPaddingTop();
        int v9 = this.getPaddingRight();
        int v10 = this.getPaddingBottom();
        int v11 = this.getScrollX();
        int v13 = 0;
        for(int v12 = 0; v12 < v4; ++v12) {
            View view0 = this.getChildAt(v12);
            if(view0.getVisibility() != 8) {
                LayoutParams viewPager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(viewPager$LayoutParams0.a) {
                    int v14 = viewPager$LayoutParams0.b & 0x70;
                    switch(viewPager$LayoutParams0.b & 7) {
                        case 1: {
                            v15 = v7;
                            v7 = Math.max((v5 - view0.getMeasuredWidth()) / 2, v7);
                            break;
                        }
                        case 3: {
                            v15 = view0.getMeasuredWidth() + v7;
                            break;
                        }
                        case 5: {
                            int v16 = v5 - v9 - view0.getMeasuredWidth();
                            v9 += view0.getMeasuredWidth();
                            v15 = v7;
                            v7 = v16;
                            break;
                        }
                        default: {
                            v15 = v7;
                        }
                    }
                    switch(v14) {
                        case 16: {
                            v17 = v8;
                            v8 = Math.max((v6 - view0.getMeasuredHeight()) / 2, v8);
                            break;
                        }
                        case 0x30: {
                            v17 = view0.getMeasuredHeight() + v8;
                            break;
                        }
                        case 80: {
                            int v18 = v6 - v10 - view0.getMeasuredHeight();
                            v10 += view0.getMeasuredHeight();
                            v17 = v8;
                            v8 = v18;
                            break;
                        }
                        default: {
                            v17 = v8;
                        }
                    }
                    view0.layout(v7 + v11, v8, view0.getMeasuredWidth() + (v7 + v11), v8 + view0.getMeasuredHeight());
                    ++v13;
                    v8 = v17;
                    v7 = v15;
                }
            }
        }
        for(int v19 = 0; v19 < v4; ++v19) {
            View view1 = this.getChildAt(v19);
            if(view1.getVisibility() != 8) {
                LayoutParams viewPager$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
                if(!viewPager$LayoutParams1.a) {
                    ItemInfo viewPager$ItemInfo0 = this.w(view1);
                    if(viewPager$ItemInfo0 != null) {
                        float f = (float)(v5 - v7 - v9);
                        int v20 = ((int)(viewPager$ItemInfo0.e * f)) + v7;
                        if(viewPager$LayoutParams1.d) {
                            viewPager$LayoutParams1.d = false;
                            view1.measure(View.MeasureSpec.makeMeasureSpec(((int)(f * viewPager$LayoutParams1.c)), 0x40000000), View.MeasureSpec.makeMeasureSpec(v6 - v8 - v10, 0x40000000));
                        }
                        view1.layout(v20, v8, view1.getMeasuredWidth() + v20, view1.getMeasuredHeight() + v8);
                    }
                }
            }
        }
        this.o = v8;
        this.p = v6 - v10;
        this.P8 = v13;
        if(this.M8) {
            this.R(this.f, false, 0, false);
        }
        this.M8 = false;
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v11;
        this.setMeasuredDimension(View.getDefaultSize(0, v), View.getDefaultSize(0, v1));
        int v3 = this.getMeasuredWidth();
        this.B = Math.min(v3 / 10, this.A);
        int v4 = v3 - this.getPaddingLeft() - this.getPaddingRight();
        int v5 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
        int v6 = this.getChildCount();
        int v7 = 0;
        while(true) {
            boolean z = true;
            int v8 = 0x40000000;
            if(v7 >= v6) {
                break;
            }
            View view0 = this.getChildAt(v7);
            if(view0.getVisibility() != 8) {
                LayoutParams viewPager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(viewPager$LayoutParams0 != null && viewPager$LayoutParams0.a) {
                    int v9 = viewPager$LayoutParams0.b & 7;
                    boolean z1 = (viewPager$LayoutParams0.b & 0x70) == 0x30 || (viewPager$LayoutParams0.b & 0x70) == 80;
                    if(v9 != 3 && v9 != 5) {
                        z = false;
                    }
                    int v10 = 0x80000000;
                    if(z1) {
                        v10 = 0x40000000;
                    }
                    else if(z) {
                        v11 = 0x40000000;
                        goto label_27;
                    }
                    v11 = 0x80000000;
                label_27:
                    int v12 = viewPager$LayoutParams0.width;
                    switch(v12) {
                        case -2: {
                            v12 = v4;
                            break;
                        }
                        case -1: {
                            v12 = v4;
                            v10 = 0x40000000;
                            break;
                        }
                        default: {
                            v10 = 0x40000000;
                        }
                    }
                    int v13 = viewPager$LayoutParams0.height;
                    switch(v13) {
                        case -2: {
                            v13 = v5;
                            v8 = v11;
                            break;
                        }
                        case -1: {
                            v13 = v5;
                        }
                    }
                    view0.measure(View.MeasureSpec.makeMeasureSpec(v12, v10), View.MeasureSpec.makeMeasureSpec(v13, v8));
                    if(z1) {
                        v5 -= view0.getMeasuredHeight();
                    }
                    else if(z) {
                        v4 -= view0.getMeasuredWidth();
                    }
                }
            }
            ++v7;
        }
        this.s = View.MeasureSpec.makeMeasureSpec(v4, 0x40000000);
        this.t = View.MeasureSpec.makeMeasureSpec(v5, 0x40000000);
        this.u = true;
        this.J();
        this.u = false;
        int v14 = this.getChildCount();
        for(int v2 = 0; v2 < v14; ++v2) {
            View view1 = this.getChildAt(v2);
            if(view1.getVisibility() != 8) {
                LayoutParams viewPager$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
                if(viewPager$LayoutParams1 == null || !viewPager$LayoutParams1.a) {
                    view1.measure(View.MeasureSpec.makeMeasureSpec(((int)(((float)v4) * viewPager$LayoutParams1.c)), 0x40000000), this.t);
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int v, Rect rect0) {
        int v4;
        int v3;
        int v2;
        int v1 = this.getChildCount();
        if((v & 2) == 0) {
            v3 = v1 - 1;
            v2 = -1;
            v4 = -1;
        }
        else {
            v2 = v1;
            v3 = 0;
            v4 = 1;
        }
        while(v3 != v2) {
            View view0 = this.getChildAt(v3);
            if(view0.getVisibility() == 0) {
                ItemInfo viewPager$ItemInfo0 = this.w(view0);
                if(viewPager$ItemInfo0 != null && viewPager$ItemInfo0.b == this.f && view0.requestFocus(v, rect0)) {
                    return true;
                }
            }
            v3 += v4;
        }
        return false;
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        PagerAdapter pagerAdapter0 = this.e;
        if(pagerAdapter0 != null) {
            pagerAdapter0.n(((SavedState)parcelable0).d, ((SavedState)parcelable0).e);
            this.T(((SavedState)parcelable0).c, false, true);
            return;
        }
        this.g = ((SavedState)parcelable0).c;
        this.h = ((SavedState)parcelable0).d;
        this.i = ((SavedState)parcelable0).e;
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.c = this.f;
        PagerAdapter pagerAdapter0 = this.e;
        if(pagerAdapter0 != null) {
            parcelable0.d = pagerAdapter0.o();
        }
        return parcelable0;
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(v != v2) {
            this.L(v, v2, this.m, this.m);
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z = false;
        if(this.N) {
            return true;
        }
        if(motionEvent0.getAction() == 0 && motionEvent0.getEdgeFlags() != 0) {
            return false;
        }
        if(this.e != null && this.e.e() != 0) {
            if(this.I == null) {
                this.I = VelocityTracker.obtain();
            }
            this.I.addMovement(motionEvent0);
            int v = motionEvent0.getAction();
            switch(v & 0xFF) {
                case 0: {
                    this.j.abortAnimation();
                    this.w = false;
                    this.J();
                    float f3 = motionEvent0.getX();
                    this.F = f3;
                    this.D = f3;
                    float f4 = motionEvent0.getY();
                    this.G = f4;
                    this.E = f4;
                    this.H = motionEvent0.getPointerId(0);
                    break;
                }
                case 1: {
                    if(this.y) {
                        VelocityTracker velocityTracker0 = this.I;
                        velocityTracker0.computeCurrentVelocity(1000, ((float)this.K));
                        int v3 = (int)velocityTracker0.getXVelocity(this.H);
                        this.w = true;
                        int v4 = this.getClientWidth();
                        int v5 = this.getScrollX();
                        ItemInfo viewPager$ItemInfo0 = this.x();
                        this.U(this.k(viewPager$ItemInfo0.b, (((float)v5) / ((float)v4) - viewPager$ItemInfo0.e) / (viewPager$ItemInfo0.d + ((float)this.m) / ((float)v4)), v3, ((int)(motionEvent0.getX(motionEvent0.findPointerIndex(this.H)) - this.F))), true, true, v3);
                        z = this.Q();
                    }
                    break;
                }
                default: {
                    switch(v & 0xFF) {
                        case 2: {
                            if(this.y) {
                            label_31:
                                if(this.y) {
                                    z = this.I(motionEvent0.getX(motionEvent0.findPointerIndex(this.H)));
                                }
                            }
                            else {
                                int v1 = motionEvent0.findPointerIndex(this.H);
                                if(v1 == -1) {
                                    z = this.Q();
                                }
                                else {
                                    float f = motionEvent0.getX(v1);
                                    float f1 = Math.abs(f - this.D);
                                    float f2 = motionEvent0.getY(v1);
                                    if(f1 > ((float)this.C) && f1 > Math.abs(f2 - this.E)) {
                                        this.y = true;
                                        this.P(true);
                                        this.D = f - this.F > 0.0f ? this.F + ((float)this.C) : this.F - ((float)this.C);
                                        this.E = f2;
                                        this.setScrollState(1);
                                        this.setScrollingCacheEnabled(true);
                                        ViewParent viewParent0 = this.getParent();
                                        if(viewParent0 != null) {
                                            viewParent0.requestDisallowInterceptTouchEvent(true);
                                        }
                                    }
                                    goto label_31;
                                }
                            }
                            break;
                        }
                        case 3: {
                            if(this.y) {
                                this.R(this.f, true, 0, false);
                                z = this.Q();
                            }
                            break;
                        }
                        case 5: {
                            int v2 = motionEvent0.getActionIndex();
                            this.D = motionEvent0.getX(v2);
                            this.H = motionEvent0.getPointerId(v2);
                            break;
                        }
                        case 6: {
                            this.E(motionEvent0);
                            this.D = motionEvent0.getX(motionEvent0.findPointerIndex(this.H));
                        }
                    }
                }
            }
            if(z) {
                ViewCompat.v1(this);
            }
            return true;
        }
        return false;
    }

    private void p(boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = z ? this.V8 : 0;
            this.getChildAt(v1).setLayerType(v2, null);
        }
    }

    private void q() {
        this.y = false;
        this.z = false;
        VelocityTracker velocityTracker0 = this.I;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.I = null;
        }
    }

    public void r() {
        if(!this.N) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if(this.e != null) {
            VelocityTracker velocityTracker0 = this.I;
            velocityTracker0.computeCurrentVelocity(1000, ((float)this.K));
            int v = (int)velocityTracker0.getXVelocity(this.H);
            this.w = true;
            int v1 = this.getClientWidth();
            int v2 = this.getScrollX();
            ItemInfo viewPager$ItemInfo0 = this.x();
            this.U(this.k(viewPager$ItemInfo0.b, (((float)v2) / ((float)v1) - viewPager$ItemInfo0.e) / viewPager$ItemInfo0.d, v, ((int)(this.D - this.F))), true, true, v);
        }
        this.q();
        this.N = false;
    }

    @Override  // android.view.ViewGroup
    public void removeView(View view0) {
        if(this.u) {
            this.removeViewInLayout(view0);
            return;
        }
        super.removeView(view0);
    }

    public boolean s(@NonNull KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 0) {
            switch(keyEvent0.getKeyCode()) {
                case 21: {
                    return keyEvent0.hasModifiers(2) ? this.F() : this.d(17);
                }
                case 22: {
                    return keyEvent0.hasModifiers(2) ? this.G() : this.d(66);
                }
                case 61: {
                    if(keyEvent0.hasNoModifiers()) {
                        return this.d(2);
                    }
                    return keyEvent0.hasModifiers(1) ? this.d(1) : false;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter0) {
        PagerAdapter pagerAdapter1 = this.e;
        if(pagerAdapter1 != null) {
            pagerAdapter1.r(null);
            this.e.t(this);
            for(int v1 = 0; v1 < this.b.size(); ++v1) {
                ItemInfo viewPager$ItemInfo0 = (ItemInfo)this.b.get(v1);
                this.e.b(this, viewPager$ItemInfo0.b, viewPager$ItemInfo0.a);
            }
            this.e.d(this);
            this.b.clear();
            this.M();
            this.f = 0;
            this.scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter2 = this.e;
        this.e = pagerAdapter0;
        this.a = 0;
        if(pagerAdapter0 != null) {
            if(this.l == null) {
                this.l = new PagerObserver(this);
            }
            this.e.r(this.l);
            this.w = false;
            boolean z = this.M8;
            this.M8 = true;
            this.a = this.e.e();
            if(this.g >= 0) {
                this.e.n(this.h, this.i);
                this.T(this.g, false, true);
                this.g = -1;
                this.h = null;
                this.i = null;
            }
            else if(z) {
                this.requestLayout();
            }
            else {
                this.J();
            }
        }
        if(this.T8 != null && !this.T8.isEmpty()) {
            int v2 = this.T8.size();
            for(int v = 0; v < v2; ++v) {
                ((OnAdapterChangeListener)this.T8.get(v)).c(this, pagerAdapter2, pagerAdapter0);
            }
        }
    }

    public void setCurrentItem(int v) {
        this.w = false;
        this.T(v, !this.M8, false);
    }

    public void setOffscreenPageLimit(int v) {
        if(v < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + v + " too small; defaulting to " + 1);
            v = 1;
        }
        if(v != this.x) {
            this.x = v;
            this.J();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener viewPager$OnPageChangeListener0) {
        this.R8 = viewPager$OnPageChangeListener0;
    }

    public void setPageMargin(int v) {
        int v1 = this.m;
        this.m = v;
        int v2 = this.getWidth();
        this.L(v2, v2, v, v1);
        this.requestLayout();
    }

    public void setPageMarginDrawable(@DrawableRes int v) {
        this.setPageMarginDrawable(ContextCompat.getDrawable(this.getContext(), v));
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable0) {
        this.n = drawable0;
        if(drawable0 != null) {
            this.refreshDrawableState();
        }
        this.setWillNotDraw(drawable0 == null);
        this.invalidate();
    }

    void setScrollState(int v) {
        if(this.Z8 == v) {
            return;
        }
        this.Z8 = v;
        if(this.U8 != null) {
            this.p(v != 0);
        }
        this.n(v);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if(this.v != z) {
            this.v = z;
        }
    }

    public void t(float f) {
        if(!this.N) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if(this.e == null) {
            return;
        }
        this.D += f;
        float f1 = ((float)this.getScrollX()) - f;
        float f2 = (float)this.getClientWidth();
        float f3 = this.q * f2;
        float f4 = this.r * f2;
        ItemInfo viewPager$ItemInfo0 = (ItemInfo)this.b.get(0);
        ItemInfo viewPager$ItemInfo1 = (ItemInfo)this.b.get(this.b.size() - 1);
        if(viewPager$ItemInfo0.b != 0) {
            f3 = viewPager$ItemInfo0.e * f2;
        }
        if(viewPager$ItemInfo1.b != this.e.e() - 1) {
            f4 = viewPager$ItemInfo1.e * f2;
        }
        if(f1 < f3) {
            f1 = f3;
        }
        else if(f1 > f4) {
            f1 = f4;
        }
        this.D += f1 - ((float)(((int)f1)));
        this.scrollTo(((int)f1), this.getScrollY());
        this.H(((int)f1));
        long v = SystemClock.uptimeMillis();
        MotionEvent motionEvent0 = MotionEvent.obtain(this.O, v, 2, this.D, 0.0f, 0);
        this.I.addMovement(motionEvent0);
        motionEvent0.recycle();
    }

    private Rect u(Rect rect0, View view0) {
        if(rect0 == null) {
            rect0 = new Rect();
        }
        if(view0 == null) {
            rect0.set(0, 0, 0, 0);
            return rect0;
        }
        rect0.left = view0.getLeft();
        rect0.right = view0.getRight();
        rect0.top = view0.getTop();
        rect0.bottom = view0.getBottom();
        for(ViewParent viewParent0 = view0.getParent(); viewParent0 instanceof ViewGroup && viewParent0 != this; viewParent0 = ((ViewGroup)viewParent0).getParent()) {
            rect0.left += ((ViewGroup)viewParent0).getLeft();
            rect0.right += ((ViewGroup)viewParent0).getRight();
            rect0.top += ((ViewGroup)viewParent0).getTop();
            rect0.bottom += ((ViewGroup)viewParent0).getBottom();
        }
        return rect0;
    }

    ItemInfo v(View view0) {
        ViewParent viewParent0;
        while((viewParent0 = view0.getParent()) != this) {
            if(viewParent0 != null && viewParent0 instanceof View) {
                view0 = (View)viewParent0;
                continue;
            }
            return null;
        }
        return this.w(view0);
    }

    @Override  // android.view.View
    protected boolean verifyDrawable(Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.n;
    }

    ItemInfo w(View view0) {
        for(int v = 0; v < this.b.size(); ++v) {
            ItemInfo viewPager$ItemInfo0 = (ItemInfo)this.b.get(v);
            if(this.e.k(view0, viewPager$ItemInfo0.a)) {
                return viewPager$ItemInfo0;
            }
        }
        return null;
    }

    private ItemInfo x() {
        int v = this.getClientWidth();
        float f = 0.0f;
        float f1 = v <= 0 ? 0.0f : ((float)this.getScrollX()) / ((float)v);
        float f2 = v <= 0 ? 0.0f : ((float)this.m) / ((float)v);
        ItemInfo viewPager$ItemInfo0 = null;
        float f3 = 0.0f;
        int v1 = -1;
        int v2 = 0;
        boolean z = true;
        while(v2 < this.b.size()) {
            ItemInfo viewPager$ItemInfo1 = (ItemInfo)this.b.get(v2);
            if(!z && viewPager$ItemInfo1.b != v1 + 1) {
                viewPager$ItemInfo1 = this.c;
                viewPager$ItemInfo1.e = f + f3 + f2;
                viewPager$ItemInfo1.b = v1 + 1;
                viewPager$ItemInfo1.d = 1.0f;
                --v2;
            }
            f = viewPager$ItemInfo1.e;
            float f4 = viewPager$ItemInfo1.d + f + f2;
            if(!z && f1 < f) {
                return viewPager$ItemInfo0;
            }
            if(f1 >= f4 && v2 != this.b.size() - 1) {
                ++v2;
                z = false;
                v1 = viewPager$ItemInfo1.b;
                f3 = viewPager$ItemInfo1.d;
                viewPager$ItemInfo0 = viewPager$ItemInfo1;
                continue;
            }
            return viewPager$ItemInfo1;
        }
        return viewPager$ItemInfo0;
    }

    ItemInfo y(int v) {
        for(int v1 = 0; v1 < this.b.size(); ++v1) {
            ItemInfo viewPager$ItemInfo0 = (ItemInfo)this.b.get(v1);
            if(viewPager$ItemInfo0.b == v) {
                return viewPager$ItemInfo0;
            }
        }
        return null;
    }

    void z() {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(0x40000);
        this.setFocusable(true);
        Context context0 = this.getContext();
        this.j = new Scroller(context0, ViewPager.k9);
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        float f = context0.getResources().getDisplayMetrics().density;
        this.C = viewConfiguration0.getScaledPagingTouchSlop();
        this.J = (int)(400.0f * f);
        this.K = viewConfiguration0.getScaledMaximumFlingVelocity();
        this.P = new EdgeEffect(context0);
        this.Q = new EdgeEffect(context0);
        this.L = (int)(25.0f * f);
        this.M = (int)(2.0f * f);
        this.A = (int)(f * 16.0f);
        ViewCompat.J1(this, new MyAccessibilityDelegate(this));
        if(ViewCompat.Z(this) == 0) {
            ViewCompat.b2(this, 1);
        }
        ViewCompat.m2(this, new OnApplyWindowInsetsListener() {
            private final Rect a;
            final ViewPager b;

            {
                this.a = new Rect();
            }

            @Override  // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat a(View view0, WindowInsetsCompat windowInsetsCompat0) {
                WindowInsetsCompat windowInsetsCompat1 = ViewCompat.m1(view0, windowInsetsCompat0);
                if(windowInsetsCompat1.A()) {
                    return windowInsetsCompat1;
                }
                Rect rect0 = this.a;
                rect0.left = windowInsetsCompat1.p();
                rect0.top = windowInsetsCompat1.r();
                rect0.right = windowInsetsCompat1.q();
                rect0.bottom = windowInsetsCompat1.o();
                int v = ViewPager.this.getChildCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    WindowInsetsCompat windowInsetsCompat2 = ViewCompat.q(ViewPager.this.getChildAt(v1), windowInsetsCompat1);
                    rect0.left = Math.min(windowInsetsCompat2.p(), rect0.left);
                    rect0.top = Math.min(windowInsetsCompat2.r(), rect0.top);
                    rect0.right = Math.min(windowInsetsCompat2.q(), rect0.right);
                    rect0.bottom = Math.min(windowInsetsCompat2.o(), rect0.bottom);
                }
                return windowInsetsCompat1.D(rect0.left, rect0.top, rect0.right, rect0.bottom);
            }
        });
    }
}

