package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.R.attr;
import androidx.coordinatorlayout.R.style;
import androidx.coordinatorlayout.R.styleable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SynchronizedPool;
import androidx.core.view.GravityCompat;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import j..util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {
    public interface AttachedBehavior {
        @NonNull
        Behavior getBehavior();
    }

    public static abstract class Behavior {
        public Behavior() {
        }

        public Behavior(Context context0, AttributeSet attributeSet0) {
        }

        @Deprecated
        public void A(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, int v2, int v3, int v4) {
        }

        public void B(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, int v2, int v3, int v4, @NonNull int[] arr_v) {
            arr_v[0] += v2;
            arr_v[1] += v3;
            this.A(coordinatorLayout0, view0, view1, v, v1, v2, v3, v4);
        }

        @Deprecated
        public void C(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v) {
        }

        public void D(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v, int v1) {
        }

        public boolean E(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Rect rect0, boolean z) {
            return false;
        }

        public void F(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Parcelable parcelable0) {
        }

        @Nullable
        public Parcelable G(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean H(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v) [...] // Inlined contents

        public boolean I(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v, int v1) {
            return false;
        }

        @Deprecated
        public void J(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
        }

        public void K(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v) {
        }

        public boolean L(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
            return false;
        }

        public static void M(@NonNull View view0, @Nullable Object object0) {
            ((LayoutParams)view0.getLayoutParams()).r = object0;
        }

        public boolean h(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) {
            return false;
        }

        public boolean i(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Rect rect0) {
            return false;
        }

        @ColorInt
        public int j(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) [...] // Inlined contents

        @FloatRange(from = 0.0, to = 1.0)
        public float k(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) [...] // Inlined contents

        @Nullable
        public static Object l(@NonNull View view0) {
            return ((LayoutParams)view0.getLayoutParams()).r;
        }

        public boolean m(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
            return false;
        }

        @NonNull
        public WindowInsetsCompat n(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull WindowInsetsCompat windowInsetsCompat0) [...] // Inlined contents

        public void o(@NonNull LayoutParams coordinatorLayout$LayoutParams0) {
        }

        public boolean p(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
            return false;
        }

        public void q(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
        }

        public void r() {
        }

        public boolean s(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
            return false;
        }

        public boolean t(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
            return false;
        }

        public boolean u(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v, int v1, int v2, int v3) {
            return false;
        }

        public boolean v(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, float f, float f1, boolean z) {
            return false;
        }

        public boolean w(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, float f, float f1) {
            return false;
        }

        @Deprecated
        public void x(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, @NonNull int[] arr_v) {
        }

        public void y(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, @NonNull int[] arr_v, int v2) {
            if(v2 == 0) {
                this.x(coordinatorLayout0, view0, view1, v, v1, arr_v);
            }
        }

        @Deprecated
        public void z(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, int v2, int v3) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DefaultBehavior {
        Class value();
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DispatchChangeEvent {
    }

    class HierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        final CoordinatorLayout a;

        @Override  // android.view.ViewGroup$OnHierarchyChangeListener
        public void onChildViewAdded(View view0, View view1) {
            ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0 = CoordinatorLayout.this.r;
            if(viewGroup$OnHierarchyChangeListener0 != null) {
                viewGroup$OnHierarchyChangeListener0.onChildViewAdded(view0, view1);
            }
        }

        @Override  // android.view.ViewGroup$OnHierarchyChangeListener
        public void onChildViewRemoved(View view0, View view1) {
            CoordinatorLayout.this.M(2);
            ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0 = CoordinatorLayout.this.r;
            if(viewGroup$OnHierarchyChangeListener0 != null) {
                viewGroup$OnHierarchyChangeListener0.onChildViewRemoved(view0, view1);
            }
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        Behavior a;
        boolean b;
        public int c;
        public int d;
        public int e;
        int f;
        public int g;
        public int h;
        int i;
        int j;
        View k;
        View l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        final Rect q;
        Object r;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        LayoutParams(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.CoordinatorLayout_Layout);
            this.c = typedArray0.getInteger(styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f = typedArray0.getResourceId(styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.d = typedArray0.getInteger(styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.e = typedArray0.getInteger(styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.g = typedArray0.getInt(styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.h = typedArray0.getInt(styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean z = typedArray0.hasValue(styleable.CoordinatorLayout_Layout_layout_behavior);
            this.b = z;
            if(z) {
                this.a = CoordinatorLayout.P(context0, attributeSet0, typedArray0.getString(3));
            }
            typedArray0.recycle();
            Behavior coordinatorLayout$Behavior0 = this.a;
            if(coordinatorLayout$Behavior0 != null) {
                coordinatorLayout$Behavior0.o(this);
            }
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public LayoutParams(LayoutParams coordinatorLayout$LayoutParams0) {
            super(coordinatorLayout$LayoutParams0);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        boolean a() {
            return this.k == null && this.f != -1;
        }

        // 去混淆评级： 低(30)
        boolean b(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
            return view1 == this.l || this.u(view1, ViewCompat.e0(coordinatorLayout0)) || this.a != null && this.a.m(coordinatorLayout0, view0, view1);
        }

        boolean c() {
            if(this.a == null) {
                this.m = false;
            }
            return this.m;
        }

        View d(CoordinatorLayout coordinatorLayout0, View view0) {
            if(this.f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if(this.k == null || !this.v(view0, coordinatorLayout0)) {
                this.o(view0, coordinatorLayout0);
            }
            return this.k;
        }

        @IdRes
        public int e() {
            return this.f;
        }

        @Nullable
        public Behavior f() {
            return this.a;
        }

        boolean g() {
            return this.p;
        }

        Rect h() {
            return this.q;
        }

        void i() {
            this.l = null;
            this.k = null;
        }

        boolean j(CoordinatorLayout coordinatorLayout0, View view0) {
            if(this.m) {
                return true;
            }
            boolean z = this.a == null ? false : this.a.h(coordinatorLayout0, view0);
            this.m = z;
            return z;
        }

        boolean k(int v) {
            switch(v) {
                case 0: {
                    return this.n;
                }
                case 1: {
                    return this.o;
                }
                default: {
                    return false;
                }
            }
        }

        void l() {
            this.p = false;
        }

        void m(int v) {
            this.t(v, false);
        }

        void n() {
            this.m = false;
        }

        private void o(View view0, CoordinatorLayout coordinatorLayout0) {
            View view1 = coordinatorLayout0.findViewById(this.f);
            this.k = view1;
            if(view1 != null) {
                if(view1 == coordinatorLayout0) {
                    if(!coordinatorLayout0.isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    this.l = null;
                    this.k = null;
                    return;
                }
                for(ViewParent viewParent0 = view1.getParent(); viewParent0 != coordinatorLayout0 && viewParent0 != null; viewParent0 = viewParent0.getParent()) {
                    if(viewParent0 == view0) {
                        if(!coordinatorLayout0.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                        this.l = null;
                        this.k = null;
                        return;
                    }
                    if(viewParent0 instanceof View) {
                        view1 = (View)viewParent0;
                    }
                }
                this.l = view1;
                return;
            }
            if(!coordinatorLayout0.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout0.getResources().getResourceName(this.f) + " to anchor view " + view0);
            }
            this.l = null;
            this.k = null;
        }

        public void p(@IdRes int v) {
            this.i();
            this.f = v;
        }

        public void q(@Nullable Behavior coordinatorLayout$Behavior0) {
            Behavior coordinatorLayout$Behavior1 = this.a;
            if(coordinatorLayout$Behavior1 != coordinatorLayout$Behavior0) {
                if(coordinatorLayout$Behavior1 != null) {
                    coordinatorLayout$Behavior1.r();
                }
                this.a = coordinatorLayout$Behavior0;
                this.r = null;
                this.b = true;
                if(coordinatorLayout$Behavior0 != null) {
                    coordinatorLayout$Behavior0.o(this);
                }
            }
        }

        void r(boolean z) {
            this.p = z;
        }

        void s(Rect rect0) {
            this.q.set(rect0);
        }

        void t(int v, boolean z) {
            switch(v) {
                case 0: {
                    this.n = z;
                    return;
                }
                case 1: {
                    this.o = z;
                }
            }
        }

        private boolean u(View view0, int v) {
            int v1 = GravityCompat.d(((LayoutParams)view0.getLayoutParams()).g, v);
            return v1 != 0 && (GravityCompat.d(this.h, v) & v1) == v1;
        }

        private boolean v(View view0, CoordinatorLayout coordinatorLayout0) {
            if(this.k.getId() != this.f) {
                return false;
            }
            View view1 = this.k;
            ViewParent viewParent0 = view1.getParent();
            while(viewParent0 != coordinatorLayout0) {
                if(viewParent0 != null && viewParent0 != view0) {
                    if(viewParent0 instanceof View) {
                        view1 = (View)viewParent0;
                    }
                    viewParent0 = viewParent0.getParent();
                    continue;
                }
                this.l = null;
                this.k = null;
                return false;
            }
            this.l = view1;
            return true;
        }
    }

    class OnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
        final CoordinatorLayout a;

        @Override  // android.view.ViewTreeObserver$OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.M(0);
            return true;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        SparseArray c;

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

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            int v = parcel0.readInt();
            int[] arr_v = new int[v];
            parcel0.readIntArray(arr_v);
            Parcelable[] arr_parcelable = parcel0.readParcelableArray(classLoader0);
            this.c = new SparseArray(v);
            for(int v1 = 0; v1 < v; ++v1) {
                this.c.append(arr_v[v1], arr_parcelable[v1]);
            }
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            int v2 = this.c == null ? 0 : this.c.size();
            parcel0.writeInt(v2);
            int[] arr_v = new int[v2];
            Parcelable[] arr_parcelable = new Parcelable[v2];
            for(int v1 = 0; v1 < v2; ++v1) {
                arr_v[v1] = this.c.keyAt(v1);
                arr_parcelable[v1] = (Parcelable)this.c.valueAt(v1);
            }
            parcel0.writeIntArray(arr_v);
            parcel0.writeParcelableArray(arr_parcelable, v);
        }
    }

    static class ViewElevationComparator implements Comparator {
        public int b(View view0, View view1) {
            float f = ViewCompat.K0(view0);
            float f1 = ViewCompat.K0(view1);
            if(f > f1) {
                return -1;
            }
            return f < f1 ? 1 : 0;
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.b(((View)object0), ((View)object1));
        }
    }

    static final int A = 0;
    static final int B = 1;
    static final int C = 2;
    static final Comparator D = null;
    private static final Pool E = null;
    private final List a;
    private final DirectedAcyclicGraph b;
    private final List c;
    private final List d;
    private Paint e;
    private final int[] f;
    private final int[] g;
    private boolean h;
    private boolean i;
    private int[] j;
    private View k;
    private View l;
    private OnPreDrawListener m;
    private boolean n;
    private WindowInsetsCompat o;
    private boolean p;
    private Drawable q;
    ViewGroup.OnHierarchyChangeListener r;
    private OnApplyWindowInsetsListener s;
    private final NestedScrollingParentHelper t;
    static final String u = "CoordinatorLayout";
    static final String v = null;
    private static final int w = 0;
    private static final int x = 1;
    static final Class[] y;
    static final ThreadLocal z;

    static {
        Package package0 = CoordinatorLayout.class.getPackage();
        CoordinatorLayout.v = package0 == null ? null : package0.getName();
        CoordinatorLayout.D = new ViewElevationComparator();
        CoordinatorLayout.y = new Class[]{Context.class, AttributeSet.class};
        CoordinatorLayout.z = new ThreadLocal();
        CoordinatorLayout.E = new SynchronizedPool(12);
    }

    public CoordinatorLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public CoordinatorLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        super(context0, attributeSet0, v);
        this.a = new ArrayList();
        this.b = new DirectedAcyclicGraph();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = new int[2];
        this.g = new int[2];
        this.t = new NestedScrollingParentHelper(this);
        TypedArray typedArray0 = v == 0 ? context0.obtainStyledAttributes(attributeSet0, styleable.CoordinatorLayout, 0, style.Widget_Support_CoordinatorLayout) : context0.obtainStyledAttributes(attributeSet0, styleable.CoordinatorLayout, v, 0);
        if(Build.VERSION.SDK_INT >= 29) {
            if(v == 0) {
                this.saveAttributeDataForStyleable(context0, styleable.CoordinatorLayout, attributeSet0, typedArray0, 0, style.Widget_Support_CoordinatorLayout);
            }
            else {
                this.saveAttributeDataForStyleable(context0, styleable.CoordinatorLayout, attributeSet0, typedArray0, v, 0);
            }
        }
        int v2 = typedArray0.getResourceId(styleable.CoordinatorLayout_keylines, 0);
        if(v2 != 0) {
            Resources resources0 = context0.getResources();
            this.j = resources0.getIntArray(v2);
            float f = resources0.getDisplayMetrics().density;
            for(int v1 = 0; v1 < this.j.length; ++v1) {
                this.j[v1] = (int)(((float)this.j[v1]) * f);
            }
        }
        this.q = typedArray0.getDrawable(styleable.CoordinatorLayout_statusBarBackground);
        typedArray0.recycle();
        this.c0();
        super.setOnHierarchyChangeListener(new HierarchyChangeListener(this));
        if(ViewCompat.Z(this) == 0) {
            ViewCompat.b2(this, 1);
        }
    }

    private void A(View view0, int v, Rect rect0, Rect rect1, LayoutParams coordinatorLayout$LayoutParams0, int v1, int v2) {
        int v6;
        int v5;
        int v3 = GravityCompat.d(CoordinatorLayout.W(coordinatorLayout$LayoutParams0.c), v);
        int v4 = GravityCompat.d(CoordinatorLayout.X(coordinatorLayout$LayoutParams0.d), v);
        switch(v4 & 7) {
            case 1: {
                v5 = rect0.left + rect0.width() / 2;
                break;
            }
            case 5: {
                v5 = rect0.right;
                break;
            }
            default: {
                v5 = rect0.left;
            }
        }
        switch(v4 & 0x70) {
            case 16: {
                v6 = rect0.top + rect0.height() / 2;
                break;
            }
            case 80: {
                v6 = rect0.bottom;
                break;
            }
            default: {
                v6 = rect0.top;
            }
        }
        if((v3 & 7) == 1) {
            v5 -= v1 / 2;
        }
        else if((v3 & 7) != 5) {
            v5 -= v1;
        }
        if((v3 & 0x70) == 16) {
            v6 -= v2 / 2;
        }
        else if((v3 & 0x70) != 80) {
            v6 -= v2;
        }
        rect1.set(v5, v6, v1 + v5, v2 + v6);
    }

    private int B(int v) {
        int[] arr_v = this.j;
        if(arr_v == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + v);
            return 0;
        }
        if(v >= 0 && v < arr_v.length) {
            return arr_v[v];
        }
        Log.e("CoordinatorLayout", "Keyline index " + v + " out of range for " + this);
        return 0;
    }

    void C(View view0, Rect rect0) {
        rect0.set(((LayoutParams)view0.getLayoutParams()).h());
    }

    LayoutParams D(View view0) {
        LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(!coordinatorLayout$LayoutParams0.b) {
            if(view0 instanceof AttachedBehavior) {
                Behavior coordinatorLayout$Behavior0 = ((AttachedBehavior)view0).getBehavior();
                if(coordinatorLayout$Behavior0 == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                coordinatorLayout$LayoutParams0.q(coordinatorLayout$Behavior0);
                coordinatorLayout$LayoutParams0.b = true;
                return coordinatorLayout$LayoutParams0;
            }
            Class class0 = view0.getClass();
            DefaultBehavior coordinatorLayout$DefaultBehavior0 = null;
            while(class0 != null) {
                coordinatorLayout$DefaultBehavior0 = (DefaultBehavior)class0.getAnnotation(DefaultBehavior.class);
                if(coordinatorLayout$DefaultBehavior0 != null) {
                    break;
                }
                class0 = class0.getSuperclass();
            }
            if(coordinatorLayout$DefaultBehavior0 != null) {
                try {
                    coordinatorLayout$LayoutParams0.q(((Behavior)coordinatorLayout$DefaultBehavior0.value().getDeclaredConstructor(null).newInstance(null)));
                }
                catch(Exception exception0) {
                    Log.e("CoordinatorLayout", "Default behavior class " + coordinatorLayout$DefaultBehavior0.value().getName() + " could not be instantiated. Did you forget a default constructor?", exception0);
                }
            }
            coordinatorLayout$LayoutParams0.b = true;
        }
        return coordinatorLayout$LayoutParams0;
    }

    private void E(List list0) {
        list0.clear();
        boolean z = this.isChildrenDrawingOrderEnabled();
        int v = this.getChildCount();
        for(int v1 = v - 1; v1 >= 0; --v1) {
            list0.add(this.getChildAt((z ? this.getChildDrawingOrder(v, v1) : v1)));
        }
        Comparator comparator0 = CoordinatorLayout.D;
        if(comparator0 != null) {
            Collections.sort(list0, comparator0);
        }
    }

    private boolean F(View view0) {
        return this.b.j(view0);
    }

    public boolean G(@NonNull View view0, int v, int v1) {
        Rect rect0 = CoordinatorLayout.f();
        this.y(view0, rect0);
        try {
            return rect0.contains(v, v1);
        }
        finally {
            CoordinatorLayout.T(rect0);
        }
    }

    private void H(View view0, int v) {
        LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        Rect rect0 = CoordinatorLayout.f();
        rect0.set(this.getPaddingLeft() + coordinatorLayout$LayoutParams0.leftMargin, this.getPaddingTop() + coordinatorLayout$LayoutParams0.topMargin, this.getWidth() - this.getPaddingRight() - coordinatorLayout$LayoutParams0.rightMargin, this.getHeight() - this.getPaddingBottom() - coordinatorLayout$LayoutParams0.bottomMargin);
        if(this.o != null && ViewCompat.Y(this) && !ViewCompat.Y(view0)) {
            rect0.left += this.o.p();
            rect0.top += this.o.r();
            rect0.right -= this.o.q();
            rect0.bottom -= this.o.o();
        }
        Rect rect1 = CoordinatorLayout.f();
        GravityCompat.b(CoordinatorLayout.X(coordinatorLayout$LayoutParams0.c), view0.getMeasuredWidth(), view0.getMeasuredHeight(), rect0, rect1, v);
        view0.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
        CoordinatorLayout.T(rect0);
        CoordinatorLayout.T(rect1);
    }

    private void I(View view0, View view1, int v) {
        Rect rect0 = CoordinatorLayout.f();
        Rect rect1 = CoordinatorLayout.f();
        try {
            this.y(view1, rect0);
            this.z(view0, v, rect0, rect1);
            view0.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
        }
        finally {
            CoordinatorLayout.T(rect0);
            CoordinatorLayout.T(rect1);
        }
    }

    private void J(View view0, int v, int v1) {
        int v8;
        LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v2 = GravityCompat.d(CoordinatorLayout.Y(coordinatorLayout$LayoutParams0.c), v1);
        int v3 = this.getWidth();
        int v4 = this.getHeight();
        int v5 = view0.getMeasuredWidth();
        int v6 = view0.getMeasuredHeight();
        if(v1 == 1) {
            v = v3 - v;
        }
        int v7 = this.B(v) - v5;
        switch(v2 & 7) {
            case 1: {
                v7 += v5 / 2;
                break;
            }
            case 5: {
                v7 += v5;
            }
        }
        switch(v2 & 0x70) {
            case 16: {
                v8 = v6 / 2;
                break;
            }
            case 80: {
                v8 = v6;
                break;
            }
            default: {
                v8 = 0;
            }
        }
        int v9 = Math.max(this.getPaddingLeft() + coordinatorLayout$LayoutParams0.leftMargin, Math.min(v7, v3 - this.getPaddingRight() - v5 - coordinatorLayout$LayoutParams0.rightMargin));
        int v10 = Math.max(this.getPaddingTop() + coordinatorLayout$LayoutParams0.topMargin, Math.min(v8, v4 - this.getPaddingBottom() - v6 - coordinatorLayout$LayoutParams0.bottomMargin));
        view0.layout(v9, v10, v5 + v9, v6 + v10);
    }

    private void K(View view0, Rect rect0, int v) {
        int v9;
        boolean z;
        if(!ViewCompat.a1(view0)) {
            return;
        }
        if(view0.getWidth() > 0 && view0.getHeight() > 0) {
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.f();
            Rect rect1 = CoordinatorLayout.f();
            Rect rect2 = CoordinatorLayout.f();
            rect2.set(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
            if(coordinatorLayout$Behavior0 == null || !coordinatorLayout$Behavior0.i(this, view0, rect1)) {
                rect1.set(rect2);
            }
            else if(!rect2.contains(rect1)) {
                throw new IllegalArgumentException("Rect should be within the child\'s bounds. Rect:" + rect1.toShortString() + " | Bounds:" + rect2.toShortString());
            }
            CoordinatorLayout.T(rect2);
            if(rect1.isEmpty()) {
                CoordinatorLayout.T(rect1);
                return;
            }
            int v1 = GravityCompat.d(coordinatorLayout$LayoutParams0.h, v);
            int v2 = 1;
            if((v1 & 0x30) == 0x30) {
                int v3 = rect1.top - coordinatorLayout$LayoutParams0.topMargin - coordinatorLayout$LayoutParams0.j;
                int v4 = rect0.top;
                if(v3 < v4) {
                    this.a0(view0, v4 - v3);
                    z = true;
                }
                else {
                    z = false;
                }
            }
            else {
                z = false;
            }
            if((v1 & 80) == 80) {
                int v5 = this.getHeight() - rect1.bottom - coordinatorLayout$LayoutParams0.bottomMargin + coordinatorLayout$LayoutParams0.j;
                int v6 = rect0.bottom;
                if(v5 < v6) {
                    this.a0(view0, v5 - v6);
                    z = true;
                }
            }
            if(!z) {
                this.a0(view0, 0);
            }
            if((v1 & 3) == 3) {
                int v7 = rect1.left - coordinatorLayout$LayoutParams0.leftMargin - coordinatorLayout$LayoutParams0.i;
                int v8 = rect0.left;
                if(v7 < v8) {
                    this.Z(view0, v8 - v7);
                    v9 = 1;
                }
                else {
                    v9 = 0;
                }
            }
            else {
                v9 = 0;
            }
            if((v1 & 5) == 5) {
                int v10 = this.getWidth() - rect1.right - coordinatorLayout$LayoutParams0.rightMargin + coordinatorLayout$LayoutParams0.i;
                int v11 = rect0.right;
                if(v10 < v11) {
                    this.Z(view0, v10 - v11);
                }
                else {
                    v2 = v9;
                }
            }
            else {
                v2 = v9;
            }
            if(v2 == 0) {
                this.Z(view0, 0);
            }
            CoordinatorLayout.T(rect1);
        }
    }

    void L(View view0, int v) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(((LayoutParams)viewGroup$LayoutParams0).k != null) {
            Rect rect0 = CoordinatorLayout.f();
            Rect rect1 = CoordinatorLayout.f();
            Rect rect2 = CoordinatorLayout.f();
            this.y(((LayoutParams)viewGroup$LayoutParams0).k, rect0);
            boolean z = false;
            this.v(view0, false, rect1);
            int v1 = view0.getMeasuredWidth();
            int v2 = view0.getMeasuredHeight();
            this.A(view0, v, rect0, rect2, ((LayoutParams)viewGroup$LayoutParams0), v1, v2);
            if(rect2.left != rect1.left || rect2.top != rect1.top) {
                z = true;
            }
            this.i(((LayoutParams)viewGroup$LayoutParams0), rect2, v1, v2);
            int v3 = rect2.left - rect1.left;
            int v4 = rect2.top - rect1.top;
            if(v3 != 0) {
                ViewCompat.k1(view0, v3);
            }
            if(v4 != 0) {
                ViewCompat.l1(view0, v4);
            }
            if(z) {
                Behavior coordinatorLayout$Behavior0 = ((LayoutParams)viewGroup$LayoutParams0).f();
                if(coordinatorLayout$Behavior0 != null) {
                    coordinatorLayout$Behavior0.p(this, view0, ((LayoutParams)viewGroup$LayoutParams0).k);
                }
            }
            CoordinatorLayout.T(rect0);
            CoordinatorLayout.T(rect1);
            CoordinatorLayout.T(rect2);
        }
    }

    final void M(int v) {
        int v6;
        boolean z;
        int v1 = ViewCompat.e0(this);
        int v2 = this.a.size();
        Rect rect0 = CoordinatorLayout.f();
        Rect rect1 = CoordinatorLayout.f();
        Rect rect2 = CoordinatorLayout.f();
        int v3 = 0;
        while(v3 < v2) {
            View view0 = (View)this.a.get(v3);
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(v != 0 || view0.getVisibility() != 8) {
                for(int v4 = 0; v4 < v3; ++v4) {
                    View view1 = (View)this.a.get(v4);
                    if(coordinatorLayout$LayoutParams0.l == view1) {
                        this.L(view0, v1);
                    }
                }
                this.v(view0, true, rect1);
                if(coordinatorLayout$LayoutParams0.g != 0 && !rect1.isEmpty()) {
                    int v5 = GravityCompat.d(coordinatorLayout$LayoutParams0.g, v1);
                    switch(v5 & 0x70) {
                        case 0x30: {
                            rect0.top = Math.max(rect0.top, rect1.bottom);
                            break;
                        }
                        case 80: {
                            rect0.bottom = Math.max(rect0.bottom, this.getHeight() - rect1.top);
                        }
                    }
                    switch(v5 & 7) {
                        case 3: {
                            rect0.left = Math.max(rect0.left, rect1.right);
                            break;
                        }
                        case 5: {
                            rect0.right = Math.max(rect0.right, this.getWidth() - rect1.left);
                        }
                    }
                }
                if(coordinatorLayout$LayoutParams0.h != 0 && view0.getVisibility() == 0) {
                    this.K(view0, rect0, v1);
                }
                if(v == 2) {
                    v6 = v3 + 1;
                label_39:
                    while(v6 < v2) {
                        View view2 = (View)this.a.get(v6);
                        LayoutParams coordinatorLayout$LayoutParams1 = (LayoutParams)view2.getLayoutParams();
                        Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams1.f();
                        if(coordinatorLayout$Behavior0 != null && coordinatorLayout$Behavior0.m(this, view2, view0)) {
                            if(v != 0 || !coordinatorLayout$LayoutParams1.g()) {
                                if(v == 2) {
                                    coordinatorLayout$Behavior0.q(this, view2, view0);
                                    z = true;
                                }
                                else {
                                    z = coordinatorLayout$Behavior0.p(this, view2, view0);
                                }
                                if(v == 1) {
                                    coordinatorLayout$LayoutParams1.r(z);
                                }
                            }
                            else {
                                coordinatorLayout$LayoutParams1.l();
                            }
                        }
                        ++v6;
                    }
                }
                else {
                    this.C(view0, rect2);
                    if(!rect2.equals(rect1)) {
                        this.S(view0, rect1);
                        v6 = v3 + 1;
                        goto label_39;
                    }
                }
            }
            ++v3;
        }
        CoordinatorLayout.T(rect0);
        CoordinatorLayout.T(rect1);
        CoordinatorLayout.T(rect2);
    }

    public void N(@NonNull View view0, int v) {
        LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(coordinatorLayout$LayoutParams0.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view1 = coordinatorLayout$LayoutParams0.k;
        if(view1 != null) {
            this.I(view0, view1, v);
            return;
        }
        int v1 = coordinatorLayout$LayoutParams0.e;
        if(v1 >= 0) {
            this.J(view0, v1, v);
            return;
        }
        this.H(view0, v);
    }

    public void O(View view0, int v, int v1, int v2, int v3) {
        this.measureChildWithMargins(view0, v, v1, v2, v3);
    }

    static Behavior P(Context context0, AttributeSet attributeSet0, String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        if(s.startsWith(".")) {
            s = "com.dcinside.app.android" + s;
        }
        else if(s.indexOf(46) < 0) {
            String s1 = CoordinatorLayout.v;
            if(!TextUtils.isEmpty(s1)) {
                s = s1 + '.' + s;
            }
        }
        try {
            ThreadLocal threadLocal0 = CoordinatorLayout.z;
            Map map0 = (Map)threadLocal0.get();
            if(map0 == null) {
                map0 = new HashMap();
                threadLocal0.set(map0);
            }
            Constructor constructor0 = (Constructor)map0.get(s);
            if(constructor0 == null) {
                constructor0 = Class.forName(s, false, context0.getClassLoader()).getConstructor(CoordinatorLayout.y);
                constructor0.setAccessible(true);
                map0.put(s, constructor0);
            }
            return (Behavior)constructor0.newInstance(context0, attributeSet0);
        }
        catch(Exception exception0) {
        }
        throw new RuntimeException("Could not inflate Behavior subclass " + s, exception0);
    }

    private boolean Q(MotionEvent motionEvent0, int v) {
        int v1 = motionEvent0.getActionMasked();
        List list0 = this.c;
        this.E(list0);
        int v2 = list0.size();
        MotionEvent motionEvent1 = null;
        boolean z = false;
        boolean z1 = false;
        for(int v3 = 0; v3 < v2; ++v3) {
            View view0 = (View)list0.get(v3);
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.f();
            if(!z && !z1 || v1 == 0) {
                if(!z && coordinatorLayout$Behavior0 != null) {
                    switch(v) {
                        case 0: {
                            z = coordinatorLayout$Behavior0.s(this, view0, motionEvent0);
                            break;
                        }
                        case 1: {
                            z = coordinatorLayout$Behavior0.L(this, view0, motionEvent0);
                        }
                    }
                    if(z) {
                        this.k = view0;
                    }
                }
                boolean z2 = coordinatorLayout$LayoutParams0.c();
                boolean z3 = coordinatorLayout$LayoutParams0.j(this, view0);
                z1 = z3 && !z2;
                if(!z3 || z1) {
                    continue;
                }
                break;
            }
            else if(coordinatorLayout$Behavior0 != null) {
                if(motionEvent1 == null) {
                    long v4 = SystemClock.uptimeMillis();
                    motionEvent1 = MotionEvent.obtain(v4, v4, 3, 0.0f, 0.0f, 0);
                }
                switch(v) {
                    case 0: {
                        coordinatorLayout$Behavior0.s(this, view0, motionEvent1);
                        break;
                    }
                    case 1: {
                        coordinatorLayout$Behavior0.L(this, view0, motionEvent1);
                    }
                }
            }
        }
        list0.clear();
        return z;
    }

    private void R() {
        this.a.clear();
        this.b.c();
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            LayoutParams coordinatorLayout$LayoutParams0 = this.D(view0);
            coordinatorLayout$LayoutParams0.d(this, view0);
            this.b.b(view0);
            for(int v2 = 0; v2 < v; ++v2) {
                if(v2 != v1) {
                    View view1 = this.getChildAt(v2);
                    if(coordinatorLayout$LayoutParams0.b(this, view0, view1)) {
                        if(!this.b.d(view1)) {
                            this.b.b(view1);
                        }
                        this.b.a(view1, view0);
                    }
                }
            }
        }
        ArrayList arrayList0 = this.b.i();
        this.a.addAll(arrayList0);
        Collections.reverse(this.a);
    }

    void S(View view0, Rect rect0) {
        ((LayoutParams)view0.getLayoutParams()).s(rect0);
    }

    private static void T(@NonNull Rect rect0) {
        rect0.setEmpty();
        CoordinatorLayout.E.a(rect0);
    }

    void U() {
        if(this.i && this.m != null) {
            this.getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        this.n = false;
    }

    private void V(boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            Behavior coordinatorLayout$Behavior0 = ((LayoutParams)view0.getLayoutParams()).f();
            if(coordinatorLayout$Behavior0 != null) {
                long v2 = SystemClock.uptimeMillis();
                MotionEvent motionEvent0 = MotionEvent.obtain(v2, v2, 3, 0.0f, 0.0f, 0);
                if(z) {
                    coordinatorLayout$Behavior0.s(this, view0, motionEvent0);
                }
                else {
                    coordinatorLayout$Behavior0.L(this, view0, motionEvent0);
                }
                motionEvent0.recycle();
            }
        }
        for(int v3 = 0; v3 < v; ++v3) {
            ((LayoutParams)this.getChildAt(v3).getLayoutParams()).n();
        }
        this.k = null;
        this.h = false;
    }

    private static int W(int v) {
        return v == 0 ? 17 : v;
    }

    private static int X(int v) {
        if((v & 7) == 0) {
            v |= 0x800003;
        }
        return (v & 0x70) == 0 ? v | 0x30 : v;
    }

    private static int Y(int v) {
        return v == 0 ? 0x800035 : v;
    }

    private void Z(View view0, int v) {
        LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v1 = coordinatorLayout$LayoutParams0.i;
        if(v1 != v) {
            ViewCompat.k1(view0, v - v1);
            coordinatorLayout$LayoutParams0.i = v;
        }
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void a(View view0, View view1, int v, int v1) {
        this.t.c(view0, view1, v, v1);
        this.l = view1;
        int v2 = this.getChildCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            boolean z = !((LayoutParams)this.getChildAt(v3).getLayoutParams()).k(v1);
        }
    }

    private void a0(View view0, int v) {
        LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v1 = coordinatorLayout$LayoutParams0.j;
        if(v1 != v) {
            ViewCompat.l1(view0, v - v1);
            coordinatorLayout$LayoutParams0.j = v;
        }
    }

    // 检测为 Lambda 实现
    final WindowInsetsCompat b0(WindowInsetsCompat windowInsetsCompat0) [...]

    private void c0() {
        if(ViewCompat.Y(this)) {
            if(this.s == null) {
                this.s = (/* 缺少LAMBDA参数 */, WindowInsetsCompat windowInsetsCompat0) -> {
                    if(!ObjectsCompat.a(CoordinatorLayout.this.o, windowInsetsCompat0)) {
                        CoordinatorLayout.this.o = windowInsetsCompat0;
                        boolean z = false;
                        boolean z1 = windowInsetsCompat0 != null && windowInsetsCompat0.r() > 0;
                        CoordinatorLayout.this.p = z1;
                        if(!z1 && CoordinatorLayout.this.getBackground() == null) {
                            z = true;
                        }
                        CoordinatorLayout.this.setWillNotDraw(z);
                        windowInsetsCompat0 = CoordinatorLayout.this.j(windowInsetsCompat0);
                        CoordinatorLayout.this.requestLayout();
                    }
                    return windowInsetsCompat0;
                };
            }
            ViewCompat.m2(this, this.s);
            this.setSystemUiVisibility(0x500);
            return;
        }
        ViewCompat.m2(this, null);

        class androidx.coordinatorlayout.widget.CoordinatorLayout.1 implements OnApplyWindowInsetsListener {
            final CoordinatorLayout a;

            @Override  // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat a(View view0, WindowInsetsCompat windowInsetsCompat0) {
                return CoordinatorLayout.this.b0(windowInsetsCompat0);
            }
        }

    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams && super.checkLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas0, View view0, long v) {
        boolean z = ((LayoutParams)view0.getLayoutParams()).a == null;
        return super.drawChild(canvas0, view0, v);
    }

    @Override  // android.view.ViewGroup
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        Drawable drawable0 = this.q;
        if((drawable0 == null || !drawable0.isStateful() ? false : drawable0.setState(arr_v))) {
            this.invalidate();
        }
    }

    @NonNull
    private static Rect f() {
        Rect rect0 = (Rect)CoordinatorLayout.E.b();
        return rect0 == null ? new Rect() : rect0;
    }

    void g() {
        if(this.i) {
            if(this.m == null) {
                this.m = new OnPreDrawListener(this);
            }
            this.getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        this.n = true;
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.q();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.r(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.t(viewGroup$LayoutParams0);
    }

    @VisibleForTesting
    final List getDependencySortedChildren() {
        this.R();
        return DesugarCollections.unmodifiableList(this.a);
    }

    @RestrictTo({Scope.c})
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.o;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.t.a();
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.q;
    }

    @Override  // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), this.getPaddingTop() + this.getPaddingBottom());
    }

    @Override  // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), this.getPaddingLeft() + this.getPaddingRight());
    }

    private static int h(int v, int v1, int v2) {
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    private void i(LayoutParams coordinatorLayout$LayoutParams0, Rect rect0, int v, int v1) {
        int v2 = this.getWidth();
        int v3 = this.getHeight();
        int v4 = Math.max(this.getPaddingLeft() + coordinatorLayout$LayoutParams0.leftMargin, Math.min(rect0.left, v2 - this.getPaddingRight() - v - coordinatorLayout$LayoutParams0.rightMargin));
        int v5 = Math.max(this.getPaddingTop() + coordinatorLayout$LayoutParams0.topMargin, Math.min(rect0.top, v3 - this.getPaddingBottom() - v1 - coordinatorLayout$LayoutParams0.bottomMargin));
        rect0.set(v4, v5, v + v4, v1 + v5);
    }

    private WindowInsetsCompat j(WindowInsetsCompat windowInsetsCompat0) {
        if(windowInsetsCompat0.A()) {
            return windowInsetsCompat0;
        }
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(ViewCompat.Y(view0) && ((LayoutParams)view0.getLayoutParams()).f() != null && windowInsetsCompat0.A()) {
                break;
            }
        }
        return windowInsetsCompat0;
    }

    public void k(@NonNull View view0) {
        List list0 = this.b.g(view0);
        if(list0 != null && !list0.isEmpty()) {
            for(int v = 0; v < list0.size(); ++v) {
                View view1 = (View)list0.get(v);
                Behavior coordinatorLayout$Behavior0 = ((LayoutParams)view1.getLayoutParams()).f();
                if(coordinatorLayout$Behavior0 != null) {
                    coordinatorLayout$Behavior0.p(this, view1, view0);
                }
            }
        }
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void l(View view0, int v) {
        this.t.e(view0, v);
        int v1 = this.getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            View view1 = this.getChildAt(v2);
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
            if(coordinatorLayout$LayoutParams0.k(v)) {
                Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.f();
                if(coordinatorLayout$Behavior0 != null) {
                    coordinatorLayout$Behavior0.K(this, view1, view0, v);
                }
                coordinatorLayout$LayoutParams0.m(v);
                coordinatorLayout$LayoutParams0.l();
            }
        }
        this.l = null;
    }

    public boolean m(@NonNull View view0, @NonNull View view1) {
        boolean z = false;
        if(view0.getVisibility() == 0 && view1.getVisibility() == 0) {
            Rect rect0 = CoordinatorLayout.f();
            this.v(view0, view0.getParent() != this, rect0);
            Rect rect1 = CoordinatorLayout.f();
            this.v(view1, view1.getParent() != this, rect1);
            if(rect0.left <= rect1.right && rect0.top <= rect1.bottom && rect0.right >= rect1.left && rect0.bottom >= rect1.top) {
                z = true;
            }
            CoordinatorLayout.T(rect0);
            CoordinatorLayout.T(rect1);
            return z;
        }
        return false;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void n(View view0, int v, int v1, int v2, int v3, int v4) {
        this.s(view0, v, v1, v2, v3, 0, this.g);
    }

    void o() {
        int v = this.getChildCount();
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.F(this.getChildAt(v1))) {
                z = true;
                break;
            }
        }
        if(z != this.n) {
            if(z) {
                this.g();
                return;
            }
            this.U();
        }
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V(false);
        if(this.n) {
            if(this.m == null) {
                this.m = new OnPreDrawListener(this);
            }
            this.getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        if(this.o == null && ViewCompat.Y(this)) {
            ViewCompat.D1(this);
        }
        this.i = true;
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V(false);
        if(this.n && this.m != null) {
            this.getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        View view0 = this.l;
        if(view0 != null) {
            this.onStopNestedScroll(view0);
        }
        this.i = false;
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        if(this.p && this.q != null) {
            int v = this.o == null ? 0 : this.o.r();
            if(v > 0) {
                this.q.setBounds(0, 0, this.getWidth(), v);
                this.q.draw(canvas0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.V(true);
        }
        boolean z = this.Q(motionEvent0, 0);
        if(v == 1 || v == 3) {
            this.V(true);
        }
        return z;
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = ViewCompat.e0(this);
        int v5 = this.a.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            View view0 = (View)this.a.get(v6);
            if(view0.getVisibility() != 8) {
                Behavior coordinatorLayout$Behavior0 = ((LayoutParams)view0.getLayoutParams()).f();
                if(coordinatorLayout$Behavior0 == null || !coordinatorLayout$Behavior0.t(this, view0, v4)) {
                    this.N(view0, v4);
                }
            }
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v32;
        int v31;
        int v30;
        LayoutParams coordinatorLayout$LayoutParams1;
        int v29;
        int v28;
        int v23;
        int v22;
        int v18;
        this.R();
        this.o();
        int v2 = this.getPaddingLeft();
        int v3 = this.getPaddingTop();
        int v4 = this.getPaddingRight();
        int v5 = this.getPaddingBottom();
        int v6 = ViewCompat.e0(this);
        int v7 = View.MeasureSpec.getMode(v);
        int v8 = View.MeasureSpec.getSize(v);
        int v9 = View.MeasureSpec.getMode(v1);
        int v10 = View.MeasureSpec.getSize(v1);
        int v11 = this.getSuggestedMinimumWidth();
        int v12 = this.getSuggestedMinimumHeight();
        boolean z = this.o != null && ViewCompat.Y(this);
        int v13 = this.a.size();
        int v14 = v11;
        int v15 = v12;
        int v16 = 0;
        int v17 = 0;
        while(v17 < v13) {
            View view0 = (View)this.a.get(v17);
            if(view0.getVisibility() == 8) {
                v18 = v17;
            }
            else {
                LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                int v19 = coordinatorLayout$LayoutParams0.e;
                if(v19 < 0 || v7 == 0) {
                    v22 = v16;
                }
                else {
                    int v20 = this.B(v19);
                    int v21 = GravityCompat.d(CoordinatorLayout.Y(coordinatorLayout$LayoutParams0.c), v6) & 7;
                    v22 = v16;
                    if(v21 == 3 && v6 != 1 || v21 == 5 && v6 == 1) {
                        v23 = Math.max(0, v8 - v4 - v20);
                        goto label_38;
                    }
                    else if(v21 == 5 && v6 != 1 || v21 == 3 && v6 == 1) {
                        v23 = Math.max(0, v20 - v2);
                        goto label_38;
                    }
                }
                v23 = 0;
            label_38:
                if(!z || ViewCompat.Y(view0)) {
                    v28 = v;
                    v29 = v1;
                }
                else {
                    int v24 = this.o.p();
                    int v25 = this.o.q();
                    int v26 = this.o.r();
                    int v27 = this.o.o();
                    v28 = View.MeasureSpec.makeMeasureSpec(v8 - (v24 + v25), v7);
                    v29 = View.MeasureSpec.makeMeasureSpec(v10 - (v26 + v27), v9);
                }
                Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.f();
                if(coordinatorLayout$Behavior0 == null) {
                    coordinatorLayout$LayoutParams1 = coordinatorLayout$LayoutParams0;
                    v31 = v15;
                    v30 = v22;
                    v18 = v17;
                    v32 = v14;
                    this.O(view0, v28, v23, v29, 0);
                }
                else {
                    coordinatorLayout$LayoutParams1 = coordinatorLayout$LayoutParams0;
                    v30 = v22;
                    v18 = v17;
                    v31 = v15;
                    v32 = v14;
                    if(!coordinatorLayout$Behavior0.u(this, view0, v28, v23, v29, 0)) {
                        this.O(view0, v28, v23, v29, 0);
                    }
                }
                int v33 = Math.max(v32, v2 + v4 + view0.getMeasuredWidth() + coordinatorLayout$LayoutParams1.leftMargin + coordinatorLayout$LayoutParams1.rightMargin);
                int v34 = Math.max(v31, v3 + v5 + view0.getMeasuredHeight() + coordinatorLayout$LayoutParams1.topMargin + coordinatorLayout$LayoutParams1.bottomMargin);
                v16 = View.combineMeasuredStates(v30, view0.getMeasuredState());
                v14 = v33;
                v15 = v34;
            }
            v17 = v18 + 1;
        }
        this.setMeasuredDimension(View.resolveSizeAndState(v14, v, 0xFF000000 & v16), View.resolveSizeAndState(v15, v1, v16 << 16));
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view0, float f, float f1, boolean z) {
        int v = this.getChildCount();
        boolean z1 = false;
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.getChildAt(v1);
            if(view1.getVisibility() != 8) {
                LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
                if(coordinatorLayout$LayoutParams0.k(0)) {
                    Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.f();
                    if(coordinatorLayout$Behavior0 != null) {
                        z1 |= coordinatorLayout$Behavior0.v(this, view1, view0, f, f1, z);
                    }
                }
            }
        }
        if(z1) {
            this.M(1);
        }
        return z1;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view0, float f, float f1) {
        int v = this.getChildCount();
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.getChildAt(v1);
            if(view1.getVisibility() != 8) {
                LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
                if(coordinatorLayout$LayoutParams0.k(0)) {
                    Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.f();
                    if(coordinatorLayout$Behavior0 != null) {
                        z |= coordinatorLayout$Behavior0.w(this, view1, view0, f, f1);
                    }
                }
            }
        }
        return z;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view0, int v, int v1, int[] arr_v) {
        this.p(view0, v, v1, arr_v, 0);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3) {
        this.n(view0, v, v1, v2, v3, 0);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view0, View view1, int v) {
        this.a(view0, view1, v, 0);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        SparseArray sparseArray0 = ((SavedState)parcelable0).c;
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            int v2 = view0.getId();
            Behavior coordinatorLayout$Behavior0 = this.D(view0).f();
            if(v2 != -1 && coordinatorLayout$Behavior0 != null) {
                Parcelable parcelable1 = (Parcelable)sparseArray0.get(v2);
                if(parcelable1 != null) {
                    coordinatorLayout$Behavior0.F(this, view0, parcelable1);
                }
            }
        }
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray0 = new SparseArray();
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            int v2 = view0.getId();
            Behavior coordinatorLayout$Behavior0 = ((LayoutParams)view0.getLayoutParams()).f();
            if(v2 != -1 && coordinatorLayout$Behavior0 != null) {
                Parcelable parcelable1 = coordinatorLayout$Behavior0.G(this, view0);
                if(parcelable1 != null) {
                    sparseArray0.append(v2, parcelable1);
                }
            }
        }
        parcelable0.c = sparseArray0;
        return parcelable0;
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
        boolean z1;
        boolean z;
        int v = motionEvent0.getActionMasked();
        if(this.k == null) {
            z = this.Q(motionEvent0, 1);
            if(z) {
                goto label_7;
            }
            else {
                z1 = false;
            }
        }
        else {
            z = false;
        label_7:
            Behavior coordinatorLayout$Behavior0 = ((LayoutParams)this.k.getLayoutParams()).f();
            z1 = coordinatorLayout$Behavior0 == null ? false : coordinatorLayout$Behavior0.L(this, this.k, motionEvent0);
        }
        MotionEvent motionEvent1 = null;
        if(this.k == null) {
            z1 |= super.onTouchEvent(motionEvent0);
        }
        else if(z) {
            long v1 = SystemClock.uptimeMillis();
            motionEvent1 = MotionEvent.obtain(v1, v1, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEvent1);
        }
        if(motionEvent1 != null) {
            motionEvent1.recycle();
        }
        if(v == 1 || v == 3) {
            this.V(false);
        }
        return z1;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void p(View view0, int v, int v1, int[] arr_v, int v2) {
        int v3 = this.getChildCount();
        boolean z = false;
        int v5 = 0;
        int v6 = 0;
        for(int v4 = 0; v4 < v3; ++v4) {
            View view1 = this.getChildAt(v4);
            if(view1.getVisibility() != 8) {
                LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
                if(coordinatorLayout$LayoutParams0.k(v2)) {
                    Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.f();
                    if(coordinatorLayout$Behavior0 != null) {
                        this.f[0] = 0;
                        this.f[1] = 0;
                        coordinatorLayout$Behavior0.y(this, view1, view0, v, v1, this.f, v2);
                        v5 = v <= 0 ? Math.min(v5, this.f[0]) : Math.max(v5, this.f[0]);
                        v6 = v1 <= 0 ? Math.min(v6, this.f[1]) : Math.max(v6, this.f[1]);
                        z = true;
                    }
                }
            }
        }
        arr_v[0] = v5;
        arr_v[1] = v6;
        if(z) {
            this.M(1);
        }
    }

    protected LayoutParams q() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams r(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    public boolean requestChildRectangleOnScreen(View view0, Rect rect0, boolean z) {
        Behavior coordinatorLayout$Behavior0 = ((LayoutParams)view0.getLayoutParams()).f();
        return coordinatorLayout$Behavior0 == null || !coordinatorLayout$Behavior0.E(this, view0, rect0, z) ? super.requestChildRectangleOnScreen(view0, rect0, z) : true;
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if(z && !this.h) {
            this.V(false);
            this.h = true;
        }
    }

    @Override  // androidx.core.view.NestedScrollingParent3
    public void s(@NonNull View view0, int v, int v1, int v2, int v3, int v4, @NonNull int[] arr_v) {
        int v5 = this.getChildCount();
        boolean z = false;
        int v7 = 0;
        int v8 = 0;
        for(int v6 = 0; v6 < v5; ++v6) {
            View view1 = this.getChildAt(v6);
            if(view1.getVisibility() != 8) {
                LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
                if(coordinatorLayout$LayoutParams0.k(v4)) {
                    Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.f();
                    if(coordinatorLayout$Behavior0 != null) {
                        this.f[0] = 0;
                        this.f[1] = 0;
                        coordinatorLayout$Behavior0.B(this, view1, view0, v, v1, v2, v3, v4, this.f);
                        v7 = v2 <= 0 ? Math.min(v7, this.f[0]) : Math.max(v7, this.f[0]);
                        v8 = v3 <= 0 ? Math.min(v8, this.f[1]) : Math.max(v8, this.f[1]);
                        z = true;
                    }
                }
            }
        }
        arr_v[0] += v7;
        arr_v[1] += v8;
        if(z) {
            this.M(1);
        }
    }

    @Override  // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        this.c0();
    }

    @Override  // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0) {
        this.r = viewGroup$OnHierarchyChangeListener0;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable0) {
        Drawable drawable1 = null;
        Drawable drawable2 = this.q;
        if(drawable2 != drawable0) {
            if(drawable2 != null) {
                drawable2.setCallback(null);
            }
            if(drawable0 != null) {
                drawable1 = drawable0.mutate();
            }
            this.q = drawable1;
            if(drawable1 != null) {
                if(drawable1.isStateful()) {
                    this.q.setState(this.getDrawableState());
                }
                DrawableCompat.m(this.q, ViewCompat.e0(this));
                this.q.setVisible(this.getVisibility() == 0, false);
                this.q.setCallback(this);
            }
            ViewCompat.v1(this);
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int v) {
        this.setStatusBarBackground(new ColorDrawable(v));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int v) {
        this.setStatusBarBackground((v == 0 ? null : ContextCompat.getDrawable(this.getContext(), v)));
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        if(this.q != null && this.q.isVisible() != (v == 0)) {
            this.q.setVisible(v == 0, false);
        }
    }

    protected LayoutParams t(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof LayoutParams) {
            return new LayoutParams(((LayoutParams)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public boolean u(View view0, View view1, int v, int v1) {
        int v2 = this.getChildCount();
        boolean z = false;
        for(int v3 = 0; v3 < v2; ++v3) {
            View view2 = this.getChildAt(v3);
            if(view2.getVisibility() != 8) {
                LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view2.getLayoutParams();
                Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.f();
                if(coordinatorLayout$Behavior0 == null) {
                    coordinatorLayout$LayoutParams0.t(v1, false);
                }
                else {
                    boolean z1 = coordinatorLayout$Behavior0.I(this, view2, view0, view1, v, v1);
                    z |= z1;
                    coordinatorLayout$LayoutParams0.t(v1, z1);
                }
            }
        }
        return z;
    }

    void v(View view0, boolean z, Rect rect0) {
        if(!view0.isLayoutRequested() && view0.getVisibility() != 8) {
            if(z) {
                this.y(view0, rect0);
                return;
            }
            rect0.set(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
            return;
        }
        rect0.setEmpty();
    }

    @Override  // android.view.View
    protected boolean verifyDrawable(Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.q;
    }

    @NonNull
    public List w(@NonNull View view0) {
        List list0 = this.b.h(view0);
        this.d.clear();
        if(list0 != null) {
            this.d.addAll(list0);
        }
        return this.d;
    }

    @NonNull
    public List x(@NonNull View view0) {
        List list0 = this.b.g(view0);
        this.d.clear();
        if(list0 != null) {
            this.d.addAll(list0);
        }
        return this.d;
    }

    void y(View view0, Rect rect0) {
        ViewGroupUtils.a(this, view0, rect0);
    }

    void z(View view0, int v, Rect rect0, Rect rect1) {
        LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v1 = view0.getMeasuredWidth();
        int v2 = view0.getMeasuredHeight();
        this.A(view0, v, rect0, rect1, coordinatorLayout$LayoutParams0, v1, v2);
        this.i(coordinatorLayout$LayoutParams0, rect1, v1, v2);
    }
}

