package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View.BaseSavedState;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener;
import androidx.recyclerview.widget.RecyclerView.Recycler;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.R.styleable;
import androidx.viewpager2.adapter.StatefulAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ViewPager2 extends ViewGroup {
    abstract class AccessibilityProvider {
        final ViewPager2 a;

        private AccessibilityProvider() {
        }

        AccessibilityProvider(androidx.viewpager2.widget.ViewPager2.1 viewPager2$10) {
        }

        boolean a() {
            return false;
        }

        boolean b(int v) {
            return false;
        }

        boolean c(int v, Bundle bundle0) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(@Nullable Adapter recyclerView$Adapter0) {
        }

        void f(@Nullable Adapter recyclerView$Adapter0) {
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        void h(@NonNull CompositeOnPageChangeCallback compositeOnPageChangeCallback0, @NonNull RecyclerView recyclerView0) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo0) {
        }

        void j(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        }

        void k(@NonNull View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        }

        boolean l(int v) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean m(int v, Bundle bundle0) {
            throw new IllegalStateException("Not implemented.");
        }

        void n() {
        }

        CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        void p(@NonNull AccessibilityEvent accessibilityEvent0) {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        void t() {
        }
    }

    class BasicAccessibilityProvider extends AccessibilityProvider {
        final ViewPager2 b;

        BasicAccessibilityProvider() {
            super(null);
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public boolean b(int v) {
            return (v == 0x1000 || v == 0x2000) && !ViewPager2.this.l();
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public boolean d() [...] // Inlined contents

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public void j(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            if(!ViewPager2.this.l()) {
                accessibilityNodeInfoCompat0.W0(AccessibilityActionCompat.s);
                accessibilityNodeInfoCompat0.W0(AccessibilityActionCompat.r);
                accessibilityNodeInfoCompat0.Z1(false);
            }
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public boolean l(int v) {
            if(!this.b(v)) {
                throw new IllegalStateException();
            }
            return false;
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public CharSequence o() {
            return "androidx.viewpager.widget.ViewPager";
        }
    }

    static abstract class DataSetChangeObserver extends AdapterDataObserver {
        private DataSetChangeObserver() {
        }

        DataSetChangeObserver(androidx.viewpager2.widget.ViewPager2.1 viewPager2$10) {
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public abstract void f();

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public final void g(int v, int v1) {
            this.f();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public final void h(int v, int v1, @Nullable Object object0) {
            this.f();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public final void i(int v, int v1) {
            this.f();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public final void k(int v, int v1, int v2) {
            this.f();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public final void l(int v, int v1) {
            this.f();
        }
    }

    class LinearLayoutManagerImpl extends LinearLayoutManager {
        final ViewPager2 O;

        LinearLayoutManagerImpl(Context context0) {
            super(context0);
        }

        @Override  // androidx.recyclerview.widget.LinearLayoutManager
        protected void D2(@NonNull State recyclerView$State0, @NonNull int[] arr_v) {
            int v = ViewPager2.this.getOffscreenPageLimit();
            if(v == -1) {
                super.D2(recyclerView$State0, arr_v);
                return;
            }
            int v1 = ViewPager2.this.getPageSize() * v;
            arr_v[0] = v1;
            arr_v[1] = v1;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
        public boolean R1(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, int v, @Nullable Bundle bundle0) {
            return ViewPager2.this.t.b(v) ? ViewPager2.this.t.l(v) : super.R1(recyclerView$Recycler0, recyclerView$State0, v, bundle0);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
        public boolean f2(@NonNull RecyclerView recyclerView0, @NonNull View view0, @NonNull Rect rect0, boolean z, boolean z1) {
            return false;
        }

        @Override  // androidx.recyclerview.widget.LinearLayoutManager
        public void x1(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            super.x1(recyclerView$Recycler0, recyclerView$State0, accessibilityNodeInfoCompat0);
            ViewPager2.this.t.j(accessibilityNodeInfoCompat0);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
        public void z1(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            ViewPager2.this.t.k(view0, accessibilityNodeInfoCompat0);
        }
    }

    @IntRange(from = 1L)
    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffscreenPageLimit {
    }

    public static abstract class OnPageChangeCallback {
        public void a(int v) {
        }

        public void b(int v, float f, @Px int v1) {
        }

        public void c(int v) {
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    class PageAwareAccessibilityProvider extends AccessibilityProvider {
        private final AccessibilityViewCommand b;
        private final AccessibilityViewCommand c;
        private AdapterDataObserver d;
        final ViewPager2 e;

        PageAwareAccessibilityProvider() {
            super(null);
            this.b = new AccessibilityViewCommand() {
                final PageAwareAccessibilityProvider a;

                @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean a(@NonNull View view0, @Nullable CommandArguments accessibilityViewCommand$CommandArguments0) {
                    PageAwareAccessibilityProvider.this.x(((ViewPager2)view0).getCurrentItem() + 1);
                    return true;
                }
            };
            this.c = new AccessibilityViewCommand() {
                final PageAwareAccessibilityProvider a;

                @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean a(@NonNull View view0, @Nullable CommandArguments accessibilityViewCommand$CommandArguments0) {
                    PageAwareAccessibilityProvider.this.x(((ViewPager2)view0).getCurrentItem() - 1);
                    return true;
                }
            };
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public boolean a() [...] // Inlined contents

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public boolean c(int v, Bundle bundle0) {
            return v == 0x1000 || v == 0x2000;
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public void e(@Nullable Adapter recyclerView$Adapter0) {
            this.y();
            if(recyclerView$Adapter0 != null) {
                recyclerView$Adapter0.registerAdapterDataObserver(this.d);
            }
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public void f(@Nullable Adapter recyclerView$Adapter0) {
            if(recyclerView$Adapter0 != null) {
                recyclerView$Adapter0.unregisterAdapterDataObserver(this.d);
            }
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public String g() {
            return "androidx.viewpager.widget.ViewPager";
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public void h(@NonNull CompositeOnPageChangeCallback compositeOnPageChangeCallback0, @NonNull RecyclerView recyclerView0) {
            recyclerView0.setImportantForAccessibility(2);
            this.d = new DataSetChangeObserver() {
                final PageAwareAccessibilityProvider a;

                {
                    PageAwareAccessibilityProvider.this = viewPager2$PageAwareAccessibilityProvider0;
                    super(null);
                }

                @Override  // androidx.viewpager2.widget.ViewPager2$DataSetChangeObserver
                public void f() {
                    PageAwareAccessibilityProvider.this.y();
                }
            };
            if(ViewPager2.this.getImportantForAccessibility() == 0) {
                ViewPager2.this.setImportantForAccessibility(1);
            }
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public void i(AccessibilityNodeInfo accessibilityNodeInfo0) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.t2(accessibilityNodeInfo0);
            this.u(accessibilityNodeInfoCompat0);
            this.w(accessibilityNodeInfoCompat0);
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        void k(@NonNull View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            this.v(view0, accessibilityNodeInfoCompat0);
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public boolean m(int v, Bundle bundle0) {
            if(!this.c(v, bundle0)) {
                throw new IllegalStateException();
            }
            this.x((v == 0x2000 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1));
            return true;
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public void n() {
            this.y();
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public void p(@NonNull AccessibilityEvent accessibilityEvent0) {
            accessibilityEvent0.setSource(ViewPager2.this);
            accessibilityEvent0.setClassName(this.g());
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public void q() {
            this.y();
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public void r() {
            this.y();
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public void s() {
            this.y();
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$AccessibilityProvider
        public void t() {
            this.y();
        }

        private void u(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            int v1;
            int v = 1;
            if(ViewPager2.this.getAdapter() == null) {
                v1 = 0;
                v = 0;
            }
            else if(ViewPager2.this.getOrientation() == 1) {
                v = ViewPager2.this.getAdapter().getItemCount();
                v1 = 1;
            }
            else {
                v1 = ViewPager2.this.getAdapter().getItemCount();
            }
            accessibilityNodeInfoCompat0.m1(CollectionInfoCompat.h(v, v1, false, 0));
        }

        private void v(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            accessibilityNodeInfoCompat0.n1(CollectionItemInfoCompat.j((ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.g.K0(view0) : 0), 1, (ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.g.K0(view0) : 0), 1, false, false));
        }

        private void w(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            Adapter recyclerView$Adapter0 = ViewPager2.this.getAdapter();
            if(recyclerView$Adapter0 == null) {
                return;
            }
            int v = recyclerView$Adapter0.getItemCount();
            if(v != 0 && ViewPager2.this.l()) {
                if(ViewPager2.this.d > 0) {
                    accessibilityNodeInfoCompat0.a(0x2000);
                }
                if(ViewPager2.this.d < v - 1) {
                    accessibilityNodeInfoCompat0.a(0x1000);
                }
                accessibilityNodeInfoCompat0.Z1(true);
            }
        }

        void x(int v) {
            if(ViewPager2.this.l()) {
                ViewPager2.this.t(v, true);
            }
        }

        void y() {
            ViewPager2 viewPager20 = ViewPager2.this;
            int v = 0x1020048;
            ViewCompat.z1(viewPager20, 0x1020048);
            ViewCompat.z1(viewPager20, 0x1020049);
            ViewCompat.z1(viewPager20, 0x1020046);
            ViewCompat.z1(viewPager20, 0x1020047);
            if(ViewPager2.this.getAdapter() == null) {
                return;
            }
            int v1 = ViewPager2.this.getAdapter().getItemCount();
            if(v1 == 0) {
                return;
            }
            if(!ViewPager2.this.l()) {
                return;
            }
            if(ViewPager2.this.getOrientation() == 0) {
                boolean z = ViewPager2.this.k();
                if(z) {
                    v = 0x1020049;
                }
                if(ViewPager2.this.d < v1 - 1) {
                    ViewCompat.C1(viewPager20, new AccessibilityActionCompat((z ? 0x1020048 : 0x1020049), null), null, this.b);
                }
                if(ViewPager2.this.d > 0) {
                    ViewCompat.C1(viewPager20, new AccessibilityActionCompat(v, null), null, this.c);
                }
            }
            else {
                if(ViewPager2.this.d < v1 - 1) {
                    ViewCompat.C1(viewPager20, new AccessibilityActionCompat(0x1020047, null), null, this.b);
                }
                if(ViewPager2.this.d > 0) {
                    ViewCompat.C1(viewPager20, new AccessibilityActionCompat(0x1020046, null), null, this.c);
                }
            }
        }
    }

    public interface PageTransformer {
        void a(@NonNull View arg1, float arg2);
    }

    class PagerSnapHelperImpl extends PagerSnapHelper {
        final ViewPager2 h;

        // 去混淆评级： 低(20)
        @Override  // androidx.recyclerview.widget.PagerSnapHelper
        @Nullable
        public View h(LayoutManager recyclerView$LayoutManager0) {
            return ViewPager2.this.j() ? null : super.h(recyclerView$LayoutManager0);
        }
    }

    class RecyclerViewImpl extends RecyclerView {
        final ViewPager2 a;

        RecyclerViewImpl(@NonNull Context context0) {
            super(context0);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.recyclerview.widget.RecyclerView
        @RequiresApi(23)
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.t.d() ? ViewPager2.this.t.o() : super.getAccessibilityClassName();
        }

        @Override  // android.view.View
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent0) {
            super.onInitializeAccessibilityEvent(accessibilityEvent0);
            accessibilityEvent0.setFromIndex(ViewPager2.this.d);
            accessibilityEvent0.setToIndex(ViewPager2.this.d);
            ViewPager2.this.t.p(accessibilityEvent0);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.recyclerview.widget.RecyclerView
        public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
            return ViewPager2.this.l() && super.onInterceptTouchEvent(motionEvent0);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.recyclerview.widget.RecyclerView
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent0) {
            return ViewPager2.this.l() && super.onTouchEvent(motionEvent0);
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR;
        int a;
        int b;
        Parcelable c;

        static {
            SavedState.CREATOR = new Parcelable.ClassLoaderCreator() {
                public SavedState a(Parcel parcel0) {
                    return this.b(parcel0, null);
                }

                public SavedState b(Parcel parcel0, ClassLoader classLoader0) {
                    return Build.VERSION.SDK_INT < 24 ? new SavedState(parcel0) : new SavedState(parcel0, classLoader0);
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

        SavedState(Parcel parcel0) {
            super(parcel0);
            this.a(parcel0, null);
        }

        @SuppressLint({"ClassVerificationFailure"})
        @RequiresApi(24)
        SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.a(parcel0, classLoader0);
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        private void a(Parcel parcel0, ClassLoader classLoader0) {
            this.a = parcel0.readInt();
            this.b = parcel0.readInt();
            this.c = parcel0.readParcelable(classLoader0);
        }

        @Override  // android.view.View$BaseSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.a);
            parcel0.writeInt(this.b);
            parcel0.writeParcelable(this.c, v);
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollState {
    }

    static class SmoothScrollToPosition implements Runnable {
        private final int a;
        private final RecyclerView b;

        SmoothScrollToPosition(int v, RecyclerView recyclerView0) {
            this.a = v;
            this.b = recyclerView0;
        }

        @Override
        public void run() {
            this.b.smoothScrollToPosition(this.a);
        }
    }

    static boolean A = true;
    private final Rect a;
    private final Rect b;
    private CompositeOnPageChangeCallback c;
    int d;
    boolean e;
    private AdapterDataObserver f;
    LinearLayoutManager g;
    private int h;
    private Parcelable i;
    RecyclerView j;
    private PagerSnapHelper k;
    ScrollEventAdapter l;
    private CompositeOnPageChangeCallback m;
    private FakeDrag n;
    private PageTransformerAdapter o;
    private ItemAnimator p;
    private boolean q;
    private boolean r;
    private int s;
    AccessibilityProvider t;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public static final int z = -1;

    static {
    }

    public ViewPager2(@NonNull Context context0) {
        super(context0);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new CompositeOnPageChangeCallback(3);
        this.e = false;
        this.f = new DataSetChangeObserver() {
            final ViewPager2 a;

            {
                ViewPager2.this = viewPager20;
                super(null);
            }

            @Override  // androidx.viewpager2.widget.ViewPager2$DataSetChangeObserver
            public void f() {
                ViewPager2.this.e = true;
                ViewPager2.this.l.l();
            }
        };
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        this.h(context0, null);
    }

    public ViewPager2(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new CompositeOnPageChangeCallback(3);
        this.e = false;
        this.f = new DataSetChangeObserver() {
            final ViewPager2 a;

            {
                ViewPager2.this = viewPager20;
                super(null);
            }

            @Override  // androidx.viewpager2.widget.ViewPager2$DataSetChangeObserver
            public void f() {
                ViewPager2.this.e = true;
                ViewPager2.this.l.l();
            }
        };
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        this.h(context0, attributeSet0);
    }

    public ViewPager2(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new CompositeOnPageChangeCallback(3);
        this.e = false;
        this.f = new DataSetChangeObserver() {
            final ViewPager2 a;

            {
                ViewPager2.this = viewPager20;
                super(null);
            }

            @Override  // androidx.viewpager2.widget.ViewPager2$DataSetChangeObserver
            public void f() {
                ViewPager2.this.e = true;
                ViewPager2.this.l.l();
            }
        };
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        this.h(context0, attributeSet0);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(21)
    public ViewPager2(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new CompositeOnPageChangeCallback(3);
        this.e = false;
        this.f = new DataSetChangeObserver() {
            final ViewPager2 a;

            {
                ViewPager2.this = viewPager20;
                super(null);
            }

            @Override  // androidx.viewpager2.widget.ViewPager2$DataSetChangeObserver
            public void f() {
                ViewPager2.this.e = true;
                ViewPager2.this.l.l();
            }
        };
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        this.h(context0, attributeSet0);
    }

    public void a(@NonNull ItemDecoration recyclerView$ItemDecoration0) {
        this.j.addItemDecoration(recyclerView$ItemDecoration0);
    }

    public void b(@NonNull ItemDecoration recyclerView$ItemDecoration0, int v) {
        this.j.addItemDecoration(recyclerView$ItemDecoration0, v);
    }

    public boolean c() {
        return this.n.b();
    }

    @Override  // android.view.View
    public boolean canScrollHorizontally(int v) {
        return this.j.canScrollHorizontally(v);
    }

    @Override  // android.view.View
    public boolean canScrollVertically(int v) {
        return this.j.canScrollVertically(v);
    }

    public boolean d() {
        return this.n.d();
    }

    @Override  // android.view.ViewGroup
    protected void dispatchRestoreInstanceState(SparseArray sparseArray0) {
        Parcelable parcelable0 = (Parcelable)sparseArray0.get(this.getId());
        if(parcelable0 instanceof SavedState) {
            int v = ((SavedState)parcelable0).a;
            sparseArray0.put(this.j.getId(), ((Parcelable)sparseArray0.get(v)));
            sparseArray0.remove(v);
        }
        super.dispatchRestoreInstanceState(sparseArray0);
        this.r();
    }

    private OnChildAttachStateChangeListener e() {
        return new OnChildAttachStateChangeListener() {
            final ViewPager2 a;

            @Override  // androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener
            public void a(@NonNull View view0) {
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener
            public void b(@NonNull View view0) {
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(recyclerView$LayoutParams0.width != -1 || recyclerView$LayoutParams0.height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        };
    }

    public boolean f(@SuppressLint({"SupportAnnotationUsage"}) @Px float f) {
        return this.n.e(f);
    }

    @NonNull
    public ItemDecoration g(int v) {
        return this.j.getItemDecorationAt(v);
    }

    @Override  // android.view.ViewGroup
    @RequiresApi(23)
    public CharSequence getAccessibilityClassName() {
        return this.t.a() ? this.t.g() : super.getAccessibilityClassName();
    }

    @Nullable
    public Adapter getAdapter() {
        return this.j.getAdapter();
    }

    public int getCurrentItem() {
        return this.d;
    }

    public int getItemDecorationCount() {
        return this.j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.s;
    }

    public int getOrientation() {
        return this.g.b3() == 1 ? 1 : 0;
    }

    int getPageSize() {
        RecyclerView recyclerView0 = this.j;
        return this.getOrientation() == 0 ? recyclerView0.getWidth() - recyclerView0.getPaddingLeft() - recyclerView0.getPaddingRight() : recyclerView0.getHeight() - recyclerView0.getPaddingTop() - recyclerView0.getPaddingBottom();
    }

    public int getScrollState() {
        return this.l.f();
    }

    private void h(Context context0, AttributeSet attributeSet0) {
        PageAwareAccessibilityProvider viewPager2$PageAwareAccessibilityProvider0 = ViewPager2.A ? new PageAwareAccessibilityProvider(this) : new BasicAccessibilityProvider(this);
        this.t = viewPager2$PageAwareAccessibilityProvider0;
        RecyclerViewImpl viewPager2$RecyclerViewImpl0 = new RecyclerViewImpl(this, context0);
        this.j = viewPager2$RecyclerViewImpl0;
        viewPager2$RecyclerViewImpl0.setId(View.generateViewId());
        this.j.setDescendantFocusability(0x20000);
        LinearLayoutManagerImpl viewPager2$LinearLayoutManagerImpl0 = new LinearLayoutManagerImpl(this, context0);
        this.g = viewPager2$LinearLayoutManagerImpl0;
        this.j.setLayoutManager(viewPager2$LinearLayoutManagerImpl0);
        this.j.setScrollingTouchSlop(1);
        this.u(context0, attributeSet0);
        this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.j.addOnChildAttachStateChangeListener(this.e());
        ScrollEventAdapter scrollEventAdapter0 = new ScrollEventAdapter(this);
        this.l = scrollEventAdapter0;
        this.n = new FakeDrag(this, scrollEventAdapter0, this.j);
        PagerSnapHelperImpl viewPager2$PagerSnapHelperImpl0 = new PagerSnapHelperImpl(this);
        this.k = viewPager2$PagerSnapHelperImpl0;
        viewPager2$PagerSnapHelperImpl0.b(this.j);
        this.j.addOnScrollListener(this.l);
        CompositeOnPageChangeCallback compositeOnPageChangeCallback0 = new CompositeOnPageChangeCallback(3);
        this.m = compositeOnPageChangeCallback0;
        this.l.p(compositeOnPageChangeCallback0);
        androidx.viewpager2.widget.ViewPager2.2 viewPager2$20 = new OnPageChangeCallback() {
            final ViewPager2 a;

            @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
            public void a(int v) {
                if(v == 0) {
                    ViewPager2.this.y();
                }
            }

            @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
            public void c(int v) {
                ViewPager2 viewPager20 = ViewPager2.this;
                if(viewPager20.d != v) {
                    viewPager20.d = v;
                    viewPager20.t.r();
                }
            }
        };
        androidx.viewpager2.widget.ViewPager2.3 viewPager2$30 = new OnPageChangeCallback() {
            final ViewPager2 a;

            @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
            public void c(int v) {
                ViewPager2.this.clearFocus();
                if(ViewPager2.this.hasFocus()) {
                    ViewPager2.this.j.requestFocus(2);
                }
            }
        };
        this.m.d(viewPager2$20);
        this.m.d(viewPager2$30);
        this.t.h(this.m, this.j);
        this.m.d(this.c);
        PageTransformerAdapter pageTransformerAdapter0 = new PageTransformerAdapter(this.g);
        this.o = pageTransformerAdapter0;
        this.m.d(pageTransformerAdapter0);
        this.attachViewToParent(this.j, 0, this.j.getLayoutParams());
    }

    public void i() {
        this.j.invalidateItemDecorations();
    }

    public boolean j() {
        return this.n.f();
    }

    boolean k() {
        return this.g.A0() == 1;
    }

    public boolean l() {
        return this.r;
    }

    private void m(@Nullable Adapter recyclerView$Adapter0) {
        if(recyclerView$Adapter0 != null) {
            recyclerView$Adapter0.registerAdapterDataObserver(this.f);
        }
    }

    public void n(@NonNull OnPageChangeCallback viewPager2$OnPageChangeCallback0) {
        this.c.d(viewPager2$OnPageChangeCallback0);
    }

    public void o(@NonNull ItemDecoration recyclerView$ItemDecoration0) {
        this.j.removeItemDecoration(recyclerView$ItemDecoration0);
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        this.t.i(accessibilityNodeInfo0);
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.j.getMeasuredWidth();
        int v5 = this.j.getMeasuredHeight();
        this.a.left = this.getPaddingLeft();
        this.a.right = v2 - v - this.getPaddingRight();
        this.a.top = this.getPaddingTop();
        this.a.bottom = v3 - v1 - this.getPaddingBottom();
        Gravity.apply(0x800033, v4, v5, this.a, this.b);
        this.j.layout(this.b.left, this.b.top, this.b.right, this.b.bottom);
        if(this.e) {
            this.y();
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        this.measureChild(this.j, v, v1);
        int v2 = this.j.getMeasuredWidth();
        int v3 = this.j.getMeasuredHeight();
        int v4 = this.j.getMeasuredState();
        int v5 = this.getPaddingLeft();
        int v6 = this.getPaddingRight();
        int v7 = this.getPaddingTop();
        int v8 = this.getPaddingBottom();
        int v9 = Math.max(v2 + (v5 + v6), this.getSuggestedMinimumWidth());
        int v10 = Math.max(v3 + (v7 + v8), this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSizeAndState(v9, v, v4), View.resolveSizeAndState(v10, v1, v4 << 16));
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        this.h = ((SavedState)parcelable0).b;
        this.i = ((SavedState)parcelable0).c;
    }

    @Override  // android.view.View
    @Nullable
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.a = this.j.getId();
        parcelable0.b = this.h == -1 ? this.d : this.h;
        Parcelable parcelable1 = this.i;
        if(parcelable1 != null) {
            parcelable0.c = parcelable1;
            return parcelable0;
        }
        Adapter recyclerView$Adapter0 = this.j.getAdapter();
        if(recyclerView$Adapter0 instanceof StatefulAdapter) {
            parcelable0.c = ((StatefulAdapter)recyclerView$Adapter0).a();
        }
        return parcelable0;
    }

    // 去混淆评级： 低(40)
    @Override  // android.view.ViewGroup
    public void onViewAdded(View view0) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public void p(int v) {
        this.j.removeItemDecorationAt(v);
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.View
    public boolean performAccessibilityAction(int v, @Nullable Bundle bundle0) {
        return this.t.c(v, bundle0) ? this.t.m(v, bundle0) : super.performAccessibilityAction(v, bundle0);
    }

    public void q() {
        if(this.o.d() == null) {
            return;
        }
        double f = this.l.e();
        float f1 = (float)(f - ((double)(((int)f))));
        int v = Math.round(((float)this.getPageSize()) * f1);
        this.o.b(((int)f), f1, v);
    }

    private void r() {
        if(this.h == -1) {
            return;
        }
        Adapter recyclerView$Adapter0 = this.getAdapter();
        if(recyclerView$Adapter0 == null) {
            return;
        }
        Parcelable parcelable0 = this.i;
        if(parcelable0 != null) {
            if(recyclerView$Adapter0 instanceof StatefulAdapter) {
                ((StatefulAdapter)recyclerView$Adapter0).s(parcelable0);
            }
            this.i = null;
        }
        int v = Math.max(0, Math.min(this.h, recyclerView$Adapter0.getItemCount() - 1));
        this.d = v;
        this.h = -1;
        this.j.scrollToPosition(v);
        this.t.n();
    }

    public void s(int v, boolean z) {
        if(this.j()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        this.t(v, z);
    }

    public void setAdapter(@Nullable Adapter recyclerView$Adapter0) {
        Adapter recyclerView$Adapter1 = this.j.getAdapter();
        this.t.f(recyclerView$Adapter1);
        this.w(recyclerView$Adapter1);
        this.j.setAdapter(recyclerView$Adapter0);
        this.d = 0;
        this.r();
        this.t.e(recyclerView$Adapter0);
        this.m(recyclerView$Adapter0);
    }

    public void setCurrentItem(int v) {
        this.s(v, true);
    }

    @Override  // android.view.View
    public void setLayoutDirection(int v) {
        super.setLayoutDirection(v);
        this.t.q();
    }

    public void setOffscreenPageLimit(int v) {
        if(v < 1 && v != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.s = v;
        this.j.requestLayout();
    }

    public void setOrientation(int v) {
        this.g.s3(v);
        this.t.s();
    }

    public void setPageTransformer(@Nullable PageTransformer viewPager2$PageTransformer0) {
        if(viewPager2$PageTransformer0 != null) {
            if(!this.q) {
                this.p = this.j.getItemAnimator();
                this.q = true;
            }
            this.j.setItemAnimator(null);
        }
        else if(this.q) {
            this.j.setItemAnimator(this.p);
            this.p = null;
            this.q = false;
        }
        if(viewPager2$PageTransformer0 == this.o.d()) {
            return;
        }
        this.o.e(viewPager2$PageTransformer0);
        this.q();
    }

    public void setUserInputEnabled(boolean z) {
        this.r = z;
        this.t.t();
    }

    void t(int v, boolean z) {
        Adapter recyclerView$Adapter0 = this.getAdapter();
        if(recyclerView$Adapter0 == null) {
            if(this.h != -1) {
                this.h = Math.max(v, 0);
            }
            return;
        }
        if(recyclerView$Adapter0.getItemCount() <= 0) {
            return;
        }
        int v1 = Math.min(Math.max(v, 0), recyclerView$Adapter0.getItemCount() - 1);
        if(v1 == this.d && this.l.i()) {
            return;
        }
        int v2 = this.d;
        if(v1 == v2 && z) {
            return;
        }
        double f = (double)v2;
        this.d = v1;
        this.t.r();
        if(!this.l.i()) {
            f = this.l.e();
        }
        this.l.n(v1, z);
        if(!z) {
            this.j.scrollToPosition(v1);
            return;
        }
        if(Math.abs(((double)v1) - f) > 3.0) {
            this.j.scrollToPosition((((double)v1) > f ? v1 - 3 : v1 + 3));
            this.j.post(new SmoothScrollToPosition(v1, this.j));
            return;
        }
        this.j.smoothScrollToPosition(v1);
    }

    private void u(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ViewPager2);
        ViewCompat.H1(this, context0, styleable.ViewPager2, attributeSet0, typedArray0, 0, 0);
        try {
            this.setOrientation(typedArray0.getInt(styleable.ViewPager2_android_orientation, 0));
        }
        finally {
            typedArray0.recycle();
        }
    }

    void v() {
        View view0 = this.k.h(this.g);
        if(view0 == null) {
            return;
        }
        int[] arr_v = this.k.c(this.g, view0);
        int v = arr_v[0];
        if(v != 0 || arr_v[1] != 0) {
            this.j.smoothScrollBy(v, arr_v[1]);
        }
    }

    private void w(@Nullable Adapter recyclerView$Adapter0) {
        if(recyclerView$Adapter0 != null) {
            recyclerView$Adapter0.unregisterAdapterDataObserver(this.f);
        }
    }

    public void x(@NonNull OnPageChangeCallback viewPager2$OnPageChangeCallback0) {
        this.c.e(viewPager2$OnPageChangeCallback0);
    }

    void y() {
        PagerSnapHelper pagerSnapHelper0 = this.k;
        if(pagerSnapHelper0 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View view0 = pagerSnapHelper0.h(this.g);
        if(view0 == null) {
            return;
        }
        int v = this.g.K0(view0);
        if(v != this.d && this.getScrollState() == 0) {
            this.m.c(v);
        }
        this.e = false;
    }
}

