package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.R.attr;
import androidx.recyclerview.R.dimen;
import androidx.recyclerview.R.styleable;
import j..util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

public class RecyclerView extends ViewGroup implements NestedScrollingChild2, NestedScrollingChild3, ScrollingView {
    public static abstract class Adapter {
        public static enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT;

            private static StateRestorationPolicy[] a() [...] // Inlined contents
        }

        private boolean mHasStableIds;
        private final AdapterDataObservable mObservable;
        private StateRestorationPolicy mStateRestorationPolicy;

        public Adapter() {
            this.mObservable = new AdapterDataObservable();
            this.mHasStableIds = false;
            this.mStateRestorationPolicy = StateRestorationPolicy.a;
        }

        public final void bindViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0, int v) {
            boolean z = recyclerView$ViewHolder0.mBindingAdapter == null;
            if(z) {
                recyclerView$ViewHolder0.mPosition = v;
                if(this.hasStableIds()) {
                    recyclerView$ViewHolder0.mItemId = this.getItemId(v);
                }
                recyclerView$ViewHolder0.setFlags(1, 0x207);
                if(TraceCompat.e()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", recyclerView$ViewHolder0.mItemViewType));
                }
            }
            recyclerView$ViewHolder0.mBindingAdapter = this;
            if(RecyclerView.sDebugAssertionsEnabled) {
                if(recyclerView$ViewHolder0.itemView.getParent() == null && recyclerView$ViewHolder0.itemView.isAttachedToWindow() != recyclerView$ViewHolder0.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + recyclerView$ViewHolder0.isTmpDetached() + ", attached to window: " + recyclerView$ViewHolder0.itemView.isAttachedToWindow() + ", holder: " + recyclerView$ViewHolder0);
                }
                if(recyclerView$ViewHolder0.itemView.getParent() == null && recyclerView$ViewHolder0.itemView.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + recyclerView$ViewHolder0);
                }
            }
            this.onBindViewHolder(recyclerView$ViewHolder0, v, recyclerView$ViewHolder0.getUnmodifiedPayloads());
            if(z) {
                recyclerView$ViewHolder0.clearPayload();
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = recyclerView$ViewHolder0.itemView.getLayoutParams();
                if(viewGroup$LayoutParams0 instanceof LayoutParams) {
                    ((LayoutParams)viewGroup$LayoutParams0).c = true;
                }
                Trace.endSection();
            }
        }

        boolean canRestoreState() {
            switch(this.mStateRestorationPolicy.ordinal()) {
                case 1: {
                    return this.getItemCount() > 0;
                }
                case 2: {
                    return false;
                }
                default: {
                    return true;
                }
            }
        }

        @NonNull
        public final ViewHolder createViewHolder(@NonNull ViewGroup viewGroup0, int v) {
            try {
                if(TraceCompat.e()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", v));
                }
                ViewHolder recyclerView$ViewHolder0 = this.onCreateViewHolder(viewGroup0, v);
                if(recyclerView$ViewHolder0.itemView.getParent() == null) {
                    recyclerView$ViewHolder0.mItemViewType = v;
                    return recyclerView$ViewHolder0;
                }
            }
            finally {
                Trace.endSection();
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter recyclerView$Adapter0, @NonNull ViewHolder recyclerView$ViewHolder0, int v) {
            return recyclerView$Adapter0 == this ? v : -1;
        }

        public abstract int getItemCount();

        public long getItemId(int v) {
            return -1L;
        }

        public int getItemViewType(int v) {
            return 0;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int v) {
            this.mObservable.d(v, 1);
        }

        public final void notifyItemChanged(int v, @Nullable Object object0) {
            this.mObservable.e(v, 1, object0);
        }

        public final void notifyItemInserted(int v) {
            this.mObservable.f(v, 1);
        }

        public final void notifyItemMoved(int v, int v1) {
            this.mObservable.c(v, v1);
        }

        public final void notifyItemRangeChanged(int v, int v1) {
            this.mObservable.d(v, v1);
        }

        public final void notifyItemRangeChanged(int v, int v1, @Nullable Object object0) {
            this.mObservable.e(v, v1, object0);
        }

        public final void notifyItemRangeInserted(int v, int v1) {
            this.mObservable.f(v, v1);
        }

        public final void notifyItemRangeRemoved(int v, int v1) {
            this.mObservable.g(v, v1);
        }

        public final void notifyItemRemoved(int v) {
            this.mObservable.g(v, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView0) {
        }

        public abstract void onBindViewHolder(@NonNull ViewHolder arg1, int arg2);

        public void onBindViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0, int v, @NonNull List list0) {
            this.onBindViewHolder(recyclerView$ViewHolder0, v);
        }

        @NonNull
        public abstract ViewHolder onCreateViewHolder(@NonNull ViewGroup arg1, int arg2);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView0) {
        }

        public boolean onFailedToRecycleView(@NonNull ViewHolder recyclerView$ViewHolder0) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull ViewHolder recyclerView$ViewHolder0) {
        }

        public void onViewDetachedFromWindow(@NonNull ViewHolder recyclerView$ViewHolder0) {
        }

        public void onViewRecycled(@NonNull ViewHolder recyclerView$ViewHolder0) {
        }

        public void registerAdapterDataObserver(@NonNull AdapterDataObserver recyclerView$AdapterDataObserver0) {
            this.mObservable.registerObserver(recyclerView$AdapterDataObserver0);
        }

        public void setHasStableIds(boolean z) {
            if(this.hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy0) {
            this.mStateRestorationPolicy = recyclerView$Adapter$StateRestorationPolicy0;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(@NonNull AdapterDataObserver recyclerView$AdapterDataObserver0) {
            this.mObservable.unregisterObserver(recyclerView$AdapterDataObserver0);
        }
    }

    static class AdapterDataObservable extends Observable {
        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for(int v = this.mObservers.size() - 1; v >= 0; --v) {
                ((AdapterDataObserver)this.mObservers.get(v)).f();
            }
        }

        public void c(int v, int v1) {
            for(int v2 = this.mObservers.size() - 1; v2 >= 0; --v2) {
                ((AdapterDataObserver)this.mObservers.get(v2)).k(v, v1, 1);
            }
        }

        public void d(int v, int v1) {
            this.e(v, v1, null);
        }

        public void e(int v, int v1, @Nullable Object object0) {
            for(int v2 = this.mObservers.size() - 1; v2 >= 0; --v2) {
                ((AdapterDataObserver)this.mObservers.get(v2)).h(v, v1, object0);
            }
        }

        public void f(int v, int v1) {
            for(int v2 = this.mObservers.size() - 1; v2 >= 0; --v2) {
                ((AdapterDataObserver)this.mObservers.get(v2)).i(v, v1);
            }
        }

        public void g(int v, int v1) {
            for(int v2 = this.mObservers.size() - 1; v2 >= 0; --v2) {
                ((AdapterDataObserver)this.mObservers.get(v2)).l(v, v1);
            }
        }

        public void h() {
            for(int v = this.mObservers.size() - 1; v >= 0; --v) {
                ((AdapterDataObserver)this.mObservers.get(v)).m();
            }
        }
    }

    public static abstract class AdapterDataObserver {
        public void f() {
        }

        public void g(int v, int v1) {
        }

        public void h(int v, int v1, @Nullable Object object0) {
            this.g(v, v1);
        }

        public void i(int v, int v1) {
        }

        public void k(int v, int v1, int v2) {
        }

        public void l(int v, int v1) {
        }

        public void m() {
        }
    }

    @RequiresApi(35)
    static final class Api35Impl {
        @DoNotInline
        public static void a(View view0, float f) {
            try {
                view0.setFrameContentVelocity(f);
            }
            catch(LinkageError unused_ex) {
            }
        }
    }

    public interface ChildDrawingOrderCallback {
        int a(int arg1, int arg2);
    }

    public static class EdgeEffectFactory {
        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;

        @NonNull
        protected EdgeEffect a(@NonNull RecyclerView recyclerView0, int v) {
            return new EdgeEffect(recyclerView0.getContext());
        }
    }

    public static abstract class ItemAnimator {
        @Retention(RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        public interface ItemAnimatorFinishedListener {
            void a();
        }

        interface ItemAnimatorListener {
            void a(@NonNull ViewHolder arg1);
        }

        public static class ItemHolderInfo {
            public int a;
            public int b;
            public int c;
            public int d;
            public int e;

            @NonNull
            public ItemHolderInfo a(@NonNull ViewHolder recyclerView$ViewHolder0) {
                return this.b(recyclerView$ViewHolder0, 0);
            }

            @NonNull
            public ItemHolderInfo b(@NonNull ViewHolder recyclerView$ViewHolder0, int v) {
                this.a = recyclerView$ViewHolder0.itemView.getLeft();
                this.b = recyclerView$ViewHolder0.itemView.getTop();
                this.c = recyclerView$ViewHolder0.itemView.getRight();
                this.d = recyclerView$ViewHolder0.itemView.getBottom();
                return this;
            }
        }

        private ItemAnimatorListener a;
        private ArrayList b;
        private long c;
        private long d;
        private long e;
        private long f;
        public static final int g = 2;
        public static final int h = 8;
        public static final int i = 4;
        public static final int j = 0x800;
        public static final int k = 0x1000;

        public ItemAnimator() {
            this.a = null;
            this.b = new ArrayList();
            this.c = 120L;
            this.d = 120L;
            this.e = 0xFAL;
            this.f = 0xFAL;
        }

        void A(ItemAnimatorListener recyclerView$ItemAnimator$ItemAnimatorListener0) {
            this.a = recyclerView$ItemAnimator$ItemAnimatorListener0;
        }

        public void B(long v) {
            this.e = v;
        }

        public void C(long v) {
            this.d = v;
        }

        public abstract boolean a(@NonNull ViewHolder arg1, @Nullable ItemHolderInfo arg2, @NonNull ItemHolderInfo arg3);

        public abstract boolean b(@NonNull ViewHolder arg1, @NonNull ViewHolder arg2, @NonNull ItemHolderInfo arg3, @NonNull ItemHolderInfo arg4);

        public abstract boolean c(@NonNull ViewHolder arg1, @NonNull ItemHolderInfo arg2, @Nullable ItemHolderInfo arg3);

        public abstract boolean d(@NonNull ViewHolder arg1, @NonNull ItemHolderInfo arg2, @NonNull ItemHolderInfo arg3);

        static int e(ViewHolder recyclerView$ViewHolder0) {
            int v = recyclerView$ViewHolder0.mFlags;
            if(recyclerView$ViewHolder0.isInvalid()) {
                return 4;
            }
            if((v & 4) == 0) {
                int v1 = recyclerView$ViewHolder0.getOldPosition();
                int v2 = recyclerView$ViewHolder0.getAbsoluteAdapterPosition();
                return v1 == -1 || v2 == -1 || v1 == v2 ? v & 14 : v & 14 | 0x800;
            }
            return v & 14;
        }

        public boolean f(@NonNull ViewHolder recyclerView$ViewHolder0) {
            return true;
        }

        public boolean g(@NonNull ViewHolder recyclerView$ViewHolder0, @NonNull List list0) {
            return this.f(recyclerView$ViewHolder0);
        }

        public final void h(@NonNull ViewHolder recyclerView$ViewHolder0) {
            ItemAnimatorListener recyclerView$ItemAnimator$ItemAnimatorListener0 = this.a;
            if(recyclerView$ItemAnimator$ItemAnimatorListener0 != null) {
                recyclerView$ItemAnimator$ItemAnimatorListener0.a(recyclerView$ViewHolder0);
            }
        }

        public final void i(@NonNull ViewHolder recyclerView$ViewHolder0) {
        }

        public final void j() {
            int v = this.b.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((ItemAnimatorFinishedListener)this.b.get(v1)).a();
            }
            this.b.clear();
        }

        public abstract void k(@NonNull ViewHolder arg1);

        public abstract void l();

        public long m() {
            return this.c;
        }

        public long n() {
            return this.f;
        }

        public long o() {
            return this.e;
        }

        public long p() {
            return this.d;
        }

        public abstract boolean q();

        public final boolean r(@Nullable ItemAnimatorFinishedListener recyclerView$ItemAnimator$ItemAnimatorFinishedListener0) {
            boolean z = this.q();
            if(recyclerView$ItemAnimator$ItemAnimatorFinishedListener0 != null) {
                if(!z) {
                    recyclerView$ItemAnimator$ItemAnimatorFinishedListener0.a();
                    return false;
                }
                this.b.add(recyclerView$ItemAnimator$ItemAnimatorFinishedListener0);
            }
            return z;
        }

        @NonNull
        public ItemHolderInfo s() {
            return new ItemHolderInfo();
        }

        public void t(@NonNull ViewHolder recyclerView$ViewHolder0) {
        }

        public void u(@NonNull ViewHolder recyclerView$ViewHolder0) {
        }

        @NonNull
        public ItemHolderInfo v(@NonNull State recyclerView$State0, @NonNull ViewHolder recyclerView$ViewHolder0) {
            return this.s().a(recyclerView$ViewHolder0);
        }

        @NonNull
        public ItemHolderInfo w(@NonNull State recyclerView$State0, @NonNull ViewHolder recyclerView$ViewHolder0, int v, @NonNull List list0) {
            return this.s().a(recyclerView$ViewHolder0);
        }

        public abstract void x();

        public void y(long v) {
            this.c = v;
        }

        public void z(long v) {
            this.f = v;
        }
    }

    class ItemAnimatorRestoreListener implements ItemAnimatorListener {
        final RecyclerView a;

        @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorListener
        public void a(ViewHolder recyclerView$ViewHolder0) {
            recyclerView$ViewHolder0.setIsRecyclable(true);
            if(recyclerView$ViewHolder0.mShadowedHolder != null && recyclerView$ViewHolder0.mShadowingHolder == null) {
                recyclerView$ViewHolder0.mShadowedHolder = null;
            }
            recyclerView$ViewHolder0.mShadowingHolder = null;
            if(!recyclerView$ViewHolder0.shouldBeKeptAsChild() && !RecyclerView.this.removeAnimatingView(recyclerView$ViewHolder0.itemView) && recyclerView$ViewHolder0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(recyclerView$ViewHolder0.itemView, false);
            }
        }
    }

    public static abstract class ItemDecoration {
        @Deprecated
        public void c(@NonNull Rect rect0, int v, @NonNull RecyclerView recyclerView0) {
            rect0.set(0, 0, 0, 0);
        }

        public void d(@NonNull Rect rect0, @NonNull View view0, @NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
            this.c(rect0, ((LayoutParams)view0.getLayoutParams()).d(), recyclerView0);
        }

        @Deprecated
        public void e(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0) {
        }

        public void f(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
        }

        @Deprecated
        public void g(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0) {
        }

        public void k(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
        }
    }

    public static abstract class LayoutManager {
        public interface LayoutPrefetchRegistry {
            void a(int arg1, int arg2);
        }

        public static class Properties {
            public int a;
            public int b;
            public boolean c;
            public boolean d;

        }

        ChildHelper a;
        RecyclerView b;
        private final Callback c;
        private final Callback d;
        ViewBoundsCheck e;
        ViewBoundsCheck f;
        @Nullable
        SmoothScroller g;
        boolean h;
        boolean i;
        boolean j;
        private boolean k;
        private boolean l;
        int m;
        boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        public LayoutManager() {
            androidx.recyclerview.widget.RecyclerView.LayoutManager.1 recyclerView$LayoutManager$10 = new Callback() {
                final LayoutManager a;

                @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public View a(int v) {
                    return LayoutManager.this.i0(v);
                }

                @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public int b() {
                    return LayoutManager.this.G0();
                }

                @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public int c() {
                    int v = LayoutManager.this.H0();
                    return LayoutManager.this.R0() - v;
                }

                @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public int d(View view0) {
                    LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                    return LayoutManager.this.r0(view0) - recyclerView$LayoutParams0.leftMargin;
                }

                @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public int e(View view0) {
                    LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                    return LayoutManager.this.u0(view0) + recyclerView$LayoutParams0.rightMargin;
                }
            };
            this.c = recyclerView$LayoutManager$10;
            androidx.recyclerview.widget.RecyclerView.LayoutManager.2 recyclerView$LayoutManager$20 = new Callback() {
                final LayoutManager a;

                @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public View a(int v) {
                    return LayoutManager.this.i0(v);
                }

                @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public int b() {
                    return LayoutManager.this.J0();
                }

                @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public int c() {
                    int v = LayoutManager.this.E0();
                    return LayoutManager.this.x0() - v;
                }

                @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public int d(View view0) {
                    LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                    return LayoutManager.this.v0(view0) - recyclerView$LayoutParams0.topMargin;
                }

                @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public int e(View view0) {
                    LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                    return LayoutManager.this.p0(view0) + recyclerView$LayoutParams0.bottomMargin;
                }
            };
            this.d = recyclerView$LayoutManager$20;
            this.e = new ViewBoundsCheck(recyclerView$LayoutManager$10);
            this.f = new ViewBoundsCheck(recyclerView$LayoutManager$20);
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = true;
        }

        public void A(String s) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null) {
                recyclerView0.assertInLayoutOrScroll(s);
            }
        }

        public int A0() {
            return this.b.getLayoutDirection();
        }

        @Nullable
        public View A1(@NonNull View view0, int v) [...] // Inlined contents

        public void A2(@NonNull View view0) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            recyclerView$ViewHolder0.stopIgnoring();
            recyclerView$ViewHolder0.resetInternal();
            recyclerView$ViewHolder0.addFlags(4);
        }

        @SuppressLint({"UnknownNullness"})
        public void B(String s) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null) {
                recyclerView0.assertNotInLayoutOrScroll(s);
            }
        }

        public int B0(@NonNull View view0) {
            return ((LayoutParams)view0.getLayoutParams()).b.left;
        }

        public void B1(@NonNull RecyclerView recyclerView0, int v, int v1) {
        }

        void B2() {
            SmoothScroller recyclerView$SmoothScroller0 = this.g;
            if(recyclerView$SmoothScroller0 != null) {
                recyclerView$SmoothScroller0.s();
            }
        }

        public void C(@NonNull View view0) {
            this.D(view0, -1);
        }

        @Px
        public int C0() {
            return ViewCompat.j0(this.b);
        }

        public void C1(@NonNull RecyclerView recyclerView0) {
        }

        public boolean C2() {
            return false;
        }

        public void D(@NonNull View view0, int v) {
            this.E(view0, v, ((LayoutParams)view0.getLayoutParams()));
        }

        @Px
        public int D0() {
            return ViewCompat.k0(this.b);
        }

        public void D1(@NonNull RecyclerView recyclerView0, int v, int v1, int v2) {
        }

        public void E(@NonNull View view0, int v, LayoutParams recyclerView$LayoutParams0) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            if(recyclerView$ViewHolder0.isRemoved()) {
                this.b.mViewInfoStore.b(recyclerView$ViewHolder0);
            }
            else {
                this.b.mViewInfoStore.p(recyclerView$ViewHolder0);
            }
            this.a.c(view0, v, recyclerView$LayoutParams0, recyclerView$ViewHolder0.isRemoved());
        }

        @Px
        public int E0() {
            return this.b == null ? 0 : this.b.getPaddingBottom();
        }

        public void E1(@NonNull RecyclerView recyclerView0, int v, int v1) {
        }

        public void F(@NonNull View view0, @NonNull Rect rect0) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 == null) {
                rect0.set(0, 0, 0, 0);
                return;
            }
            rect0.set(recyclerView0.getItemDecorInsetsForChild(view0));
        }

        @Px
        public int F0() {
            return this.b == null ? 0 : ViewCompat.o0(this.b);
        }

        public void F1(@NonNull RecyclerView recyclerView0, int v, int v1) {
        }

        public boolean G() {
            return false;
        }

        @Px
        public int G0() {
            return this.b == null ? 0 : this.b.getPaddingLeft();
        }

        public void G1(@NonNull RecyclerView recyclerView0, int v, int v1, @Nullable Object object0) {
            this.F1(recyclerView0, v, v1);
        }

        public boolean H() {
            return false;
        }

        @Px
        public int H0() {
            return this.b == null ? 0 : this.b.getPaddingRight();
        }

        @SuppressLint({"UnknownNullness"})
        public void H1(Recycler recyclerView$Recycler0, State recyclerView$State0) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public boolean I(LayoutParams recyclerView$LayoutParams0) {
            return recyclerView$LayoutParams0 != null;
        }

        @Px
        public int I0() {
            return this.b == null ? 0 : ViewCompat.p0(this.b);
        }

        @SuppressLint({"UnknownNullness"})
        public void I1(State recyclerView$State0) {
        }

        public static int J(int v, int v1, int v2) {
            int v3 = View.MeasureSpec.getMode(v);
            int v4 = View.MeasureSpec.getSize(v);
            switch(v3) {
                case 0x80000000: {
                    return Math.min(v4, Math.max(v1, v2));
                }
                case 0x40000000: {
                    return v4;
                }
                default: {
                    return Math.max(v1, v2);
                }
            }
        }

        @Px
        public int J0() {
            return this.b == null ? 0 : this.b.getPaddingTop();
        }

        public void J1(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, int v, int v1) {
            this.b.defaultOnMeasure(v, v1);
        }

        @SuppressLint({"UnknownNullness"})
        public void K(int v, int v1, State recyclerView$State0, LayoutPrefetchRegistry recyclerView$LayoutManager$LayoutPrefetchRegistry0) {
        }

        public int K0(@NonNull View view0) {
            return ((LayoutParams)view0.getLayoutParams()).d();
        }

        // 去混淆评级： 低(20)
        @Deprecated
        public boolean K1(@NonNull RecyclerView recyclerView0, @NonNull View view0, @Nullable View view1) {
            return this.f1() || recyclerView0.isComputingLayout();
        }

        @SuppressLint({"UnknownNullness"})
        public void L(int v, LayoutPrefetchRegistry recyclerView$LayoutManager$LayoutPrefetchRegistry0) {
        }

        public static Properties L0(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
            Properties recyclerView$LayoutManager$Properties0 = new Properties();
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.RecyclerView, v, v1);
            recyclerView$LayoutManager$Properties0.a = typedArray0.getInt(styleable.RecyclerView_android_orientation, 1);
            recyclerView$LayoutManager$Properties0.b = typedArray0.getInt(styleable.RecyclerView_spanCount, 1);
            recyclerView$LayoutManager$Properties0.c = typedArray0.getBoolean(styleable.RecyclerView_reverseLayout, false);
            recyclerView$LayoutManager$Properties0.d = typedArray0.getBoolean(styleable.RecyclerView_stackFromEnd, false);
            typedArray0.recycle();
            return recyclerView$LayoutManager$Properties0;
        }

        public boolean L1(@NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0, @NonNull View view0, @Nullable View view1) {
            return this.K1(recyclerView0, view0, view1);
        }

        public int M(@NonNull State recyclerView$State0) {
            return 0;
        }

        public int M0(@NonNull View view0) {
            return ((LayoutParams)view0.getLayoutParams()).b.right;
        }

        @SuppressLint({"UnknownNullness"})
        public void M1(Parcelable parcelable0) {
        }

        public int N(@NonNull State recyclerView$State0) {
            return 0;
        }

        public int N0(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0) {
            return this.b == null || this.b.mAdapter == null || !this.H() ? 1 : this.b.mAdapter.getItemCount();
        }

        @Nullable
        public Parcelable N1() {
            return null;
        }

        public int O(@NonNull State recyclerView$State0) {
            return 0;
        }

        public int O0(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0) [...] // Inlined contents

        public void O1(int v) {
        }

        public int P(@NonNull State recyclerView$State0) {
            return 0;
        }

        public int P0(@NonNull View view0) {
            return ((LayoutParams)view0.getLayoutParams()).b.top;
        }

        void P1(SmoothScroller recyclerView$SmoothScroller0) {
            if(this.g == recyclerView$SmoothScroller0) {
                this.g = null;
            }
        }

        public int Q(@NonNull State recyclerView$State0) {
            return 0;
        }

        public void Q0(@NonNull View view0, boolean z, @NonNull Rect rect0) {
            if(z) {
                Rect rect1 = ((LayoutParams)view0.getLayoutParams()).b;
                rect0.set(-rect1.left, -rect1.top, view0.getWidth() + rect1.right, view0.getHeight() + rect1.bottom);
            }
            else {
                rect0.set(0, 0, view0.getWidth(), view0.getHeight());
            }
            if(this.b != null) {
                Matrix matrix0 = view0.getMatrix();
                if(matrix0 != null && !matrix0.isIdentity()) {
                    RectF rectF0 = this.b.mTempRectF;
                    rectF0.set(rect0);
                    matrix0.mapRect(rectF0);
                    rect0.set(((int)Math.floor(rectF0.left)), ((int)Math.floor(rectF0.top)), ((int)Math.ceil(rectF0.right)), ((int)Math.ceil(rectF0.bottom)));
                }
            }
            rect0.offset(view0.getLeft(), view0.getTop());
        }

        boolean Q1(int v, @Nullable Bundle bundle0) {
            return this.R1(this.b.mRecycler, this.b.mState, v, bundle0);
        }

        public int R(@NonNull State recyclerView$State0) {
            return 0;
        }

        @Px
        public int R0() {
            return this.q;
        }

        public boolean R1(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, int v, @Nullable Bundle bundle0) {
            float f;
            int v4;
            int v3;
            if(this.b == null) {
                return false;
            }
            int v1 = this.x0();
            int v2 = this.R0();
            Rect rect0 = new Rect();
            if(this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect0)) {
                v1 = rect0.height();
                v2 = rect0.width();
            }
            switch(v) {
                case 0x1000: {
                    v3 = this.b.canScrollVertically(1) ? v1 - this.J0() - this.E0() : 0;
                    v4 = this.b.canScrollHorizontally(1) ? v2 - this.G0() - this.H0() : 0;
                    break;
                }
                case 0x2000: {
                    v3 = this.b.canScrollVertically(-1) ? -(v1 - this.J0() - this.E0()) : 0;
                    v4 = this.b.canScrollHorizontally(-1) ? -(v2 - this.G0() - this.H0()) : 0;
                    break;
                }
                default: {
                    v3 = 0;
                    v4 = 0;
                }
            }
            if(v3 == 0 && v4 == 0) {
                return false;
            }
            if(bundle0 == null) {
                f = 1.0f;
            }
            else {
                f = bundle0.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if(f < 0.0f) {
                    if(RecyclerView.sDebugAssertionsEnabled) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                    }
                    return false;
                }
            }
            if(Float.compare(f, Infinityf) == 0) {
                RecyclerView recyclerView0 = this.b;
                Adapter recyclerView$Adapter0 = recyclerView0.mAdapter;
                if(recyclerView$Adapter0 == null) {
                    return false;
                }
                switch(v) {
                    case 0x1000: {
                        recyclerView0.smoothScrollToPosition(recyclerView$Adapter0.getItemCount() - 1);
                        return true;
                    }
                    case 0x2000: {
                        recyclerView0.smoothScrollToPosition(0);
                        return true;
                    }
                    default: {
                        return true;
                    }
                }
            }
            if(Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                v4 = (int)(((float)v4) * f);
                v3 = (int)(((float)v3) * f);
            }
            this.b.smoothScrollBy(v4, v3, null, 0x80000000, true);
            return true;
        }

        public void S(@NonNull Recycler recyclerView$Recycler0) {
            for(int v = this.j0() - 1; v >= 0; --v) {
                this.i2(recyclerView$Recycler0, v, this.i0(v));
            }
        }

        public int S0() {
            return this.o;
        }

        boolean S1(@NonNull View view0, int v, @Nullable Bundle bundle0) {
            return false;
        }

        public void T(@NonNull View view0, @NonNull Recycler recyclerView$Recycler0) {
            this.i2(recyclerView$Recycler0, this.a.m(view0), view0);
        }

        boolean T0() {
            int v = this.j0();
            for(int v1 = 0; v1 < v; ++v1) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.i0(v1).getLayoutParams();
                if(viewGroup$LayoutParams0.width < 0 && viewGroup$LayoutParams0.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean T1(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull View view0, int v, @Nullable Bundle bundle0) [...] // Inlined contents

        public void U(int v, @NonNull Recycler recyclerView$Recycler0) {
            this.i2(recyclerView$Recycler0, v, this.i0(v));
        }

        public boolean U0() {
            return this.b != null && this.b.hasFocus();
        }

        public void U1(Runnable runnable0) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null) {
                ViewCompat.x1(recyclerView0, runnable0);
            }
        }

        public void V(@NonNull View view0) {
            int v = this.a.m(view0);
            if(v >= 0) {
                this.X(v, view0);
            }
        }

        public void V0(@NonNull View view0) {
            if(view0.getParent() != this.b || this.b.indexOfChild(view0) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.b.exceptionLabel());
            }
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            recyclerView$ViewHolder0.addFlags(0x80);
            this.b.mViewInfoStore.q(recyclerView$ViewHolder0);
        }

        public void V1() {
            for(int v = this.j0() - 1; v >= 0; --v) {
                this.a.q(v);
            }
        }

        public void W(int v) {
            this.X(v, this.i0(v));
        }

        public boolean W0() {
            return this.i;
        }

        public void W1(@NonNull Recycler recyclerView$Recycler0) {
            for(int v = this.j0() - 1; v >= 0; --v) {
                if(!RecyclerView.getChildViewHolderInt(this.i0(v)).shouldIgnore()) {
                    this.Z1(v, recyclerView$Recycler0);
                }
            }
        }

        private void X(int v, @NonNull View view0) {
            this.a.d(v);
        }

        public boolean X0() {
            return this.j;
        }

        void X1(Recycler recyclerView$Recycler0) {
            int v = recyclerView$Recycler0.k();
            for(int v1 = v - 1; v1 >= 0; --v1) {
                View view0 = recyclerView$Recycler0.o(v1);
                ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
                if(!recyclerView$ViewHolder0.shouldIgnore()) {
                    recyclerView$ViewHolder0.setIsRecyclable(false);
                    if(recyclerView$ViewHolder0.isTmpDetached()) {
                        this.b.removeDetachedView(view0, false);
                    }
                    ItemAnimator recyclerView$ItemAnimator0 = this.b.mItemAnimator;
                    if(recyclerView$ItemAnimator0 != null) {
                        recyclerView$ItemAnimator0.k(recyclerView$ViewHolder0);
                    }
                    recyclerView$ViewHolder0.setIsRecyclable(true);
                    recyclerView$Recycler0.E(view0);
                }
            }
            recyclerView$Recycler0.f();
            if(v > 0) {
                this.b.invalidate();
            }
        }

        void Y(RecyclerView recyclerView0) {
            this.i = true;
            this.q1(recyclerView0);
        }

        public boolean Y0() {
            return this.b != null && this.b.isFocused();
        }

        public void Y1(@NonNull View view0, @NonNull Recycler recyclerView$Recycler0) {
            this.c2(view0);
            recyclerView$Recycler0.H(view0);
        }

        void Z(RecyclerView recyclerView0, Recycler recyclerView$Recycler0) {
            this.i = false;
            this.s1(recyclerView0, recyclerView$Recycler0);
        }

        private boolean Z0(RecyclerView recyclerView0, int v, int v1) {
            View view0 = recyclerView0.getFocusedChild();
            if(view0 == null) {
                return false;
            }
            int v2 = this.G0();
            int v3 = this.J0();
            int v4 = this.H0();
            int v5 = this.E0();
            Rect rect0 = this.b.mTempRect;
            this.q0(view0, rect0);
            return rect0.left - v < this.R0() - v4 && rect0.right - v > v2 && rect0.top - v1 < this.x0() - v5 && rect0.bottom - v1 > v3;
        }

        public void Z1(int v, @NonNull Recycler recyclerView$Recycler0) {
            View view0 = this.i0(v);
            this.d2(v);
            recyclerView$Recycler0.H(view0);
        }

        @SuppressLint({"UnknownNullness"})
        public void a0(View view0) {
            ItemAnimator recyclerView$ItemAnimator0 = this.b.mItemAnimator;
            if(recyclerView$ItemAnimator0 != null) {
                recyclerView$ItemAnimator0.k(RecyclerView.getChildViewHolderInt(view0));
            }
        }

        public final boolean a1() {
            return this.l;
        }

        public boolean a2(Runnable runnable0) {
            return this.b == null ? false : this.b.removeCallbacks(runnable0);
        }

        @Nullable
        public View b0(@NonNull View view0) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 == null) {
                return null;
            }
            View view1 = recyclerView0.findContainingItemView(view0);
            if(view1 == null) {
                return null;
            }
            return this.a.n(view1) ? null : view1;
        }

        public boolean b1(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0) [...] // Inlined contents

        public void b2(@NonNull View view0) {
            this.b.removeDetachedView(view0, false);
        }

        @Nullable
        public View c0(int v) {
            int v1 = this.j0();
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = this.i0(v2);
                ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
                if(recyclerView$ViewHolder0 != null && recyclerView$ViewHolder0.getLayoutPosition() == v && !recyclerView$ViewHolder0.shouldIgnore() && (this.b.mState.j() || !recyclerView$ViewHolder0.isRemoved())) {
                    return view0;
                }
            }
            return null;
        }

        public boolean c1() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void c2(View view0) {
            this.a.p(view0);
        }

        @SuppressLint({"UnknownNullness"})
        public abstract LayoutParams d0();

        public boolean d1() {
            return this.k;
        }

        public void d2(int v) {
            if(this.i0(v) != null) {
                this.a.q(v);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams e0(Context context0, AttributeSet attributeSet0) {
            return new LayoutParams(context0, attributeSet0);
        }

        private static boolean e1(int v, int v1, int v2) {
            int v3 = View.MeasureSpec.getMode(v1);
            int v4 = View.MeasureSpec.getSize(v1);
            if(v2 > 0 && v != v2) {
                return false;
            }
            switch(v3) {
                case 0x80000000: {
                    return v4 >= v;
                }
                case 0: {
                    return true;
                }
                default: {
                    return v3 == 0x40000000 ? v4 == v : false;
                }
            }
        }

        public boolean e2(@NonNull RecyclerView recyclerView0, @NonNull View view0, @NonNull Rect rect0, boolean z) {
            return this.f2(recyclerView0, view0, rect0, z, false);
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams f0(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            if(viewGroup$LayoutParams0 instanceof LayoutParams) {
                return new LayoutParams(((LayoutParams)viewGroup$LayoutParams0));
            }
            return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
        }

        public boolean f1() {
            return this.g != null && this.g.i();
        }

        public boolean f2(@NonNull RecyclerView recyclerView0, @NonNull View view0, @NonNull Rect rect0, boolean z, boolean z1) {
            int[] arr_v = this.m0(view0, rect0);
            int v = arr_v[0];
            int v1 = arr_v[1];
            if(z1 && !this.Z0(recyclerView0, v, v1) || v == 0 && v1 == 0) {
                return false;
            }
            if(z) {
                recyclerView0.scrollBy(v, v1);
                return true;
            }
            recyclerView0.smoothScrollBy(v, v1);
            return true;
        }

        public int g0() [...] // Inlined contents

        // 去混淆评级： 低(20)
        public boolean g1(@NonNull View view0, boolean z, boolean z1) {
            boolean z2 = this.e.b(view0, 0x6003) && this.f.b(view0, 0x6003);
            return z ? z2 : !z2;
        }

        public void g2() {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null) {
                recyclerView0.requestLayout();
            }
        }

        public int getItemCount() {
            Adapter recyclerView$Adapter0 = this.b == null ? null : this.b.getAdapter();
            return recyclerView$Adapter0 == null ? 0 : recyclerView$Adapter0.getItemCount();
        }

        public int h0(@NonNull View view0) {
            return ((LayoutParams)view0.getLayoutParams()).b.bottom;
        }

        public void h1(@NonNull View view0, int v, int v1, int v2, int v3) {
            Rect rect0 = ((LayoutParams)view0.getLayoutParams()).b;
            view0.layout(v + rect0.left, v1 + rect0.top, v2 - rect0.right, v3 - rect0.bottom);
        }

        public void h2() {
            this.h = true;
        }

        @Nullable
        public View i0(int v) {
            return this.a == null ? null : this.a.f(v);
        }

        public void i1(@NonNull View view0, int v, int v1, int v2, int v3) {
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            view0.layout(v + recyclerView$LayoutParams0.b.left + recyclerView$LayoutParams0.leftMargin, v1 + recyclerView$LayoutParams0.b.top + recyclerView$LayoutParams0.topMargin, v2 - recyclerView$LayoutParams0.b.right - recyclerView$LayoutParams0.rightMargin, v3 - recyclerView$LayoutParams0.b.bottom - recyclerView$LayoutParams0.bottomMargin);
        }

        private void i2(Recycler recyclerView$Recycler0, int v, View view0) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            if(recyclerView$ViewHolder0.shouldIgnore()) {
                if(RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "ignoring view " + recyclerView$ViewHolder0);
                }
                return;
            }
            if(recyclerView$ViewHolder0.isInvalid() && !recyclerView$ViewHolder0.isRemoved() && !this.b.mAdapter.hasStableIds()) {
                this.d2(v);
                recyclerView$Recycler0.I(recyclerView$ViewHolder0);
                return;
            }
            this.W(v);
            recyclerView$Recycler0.J(view0);
            this.b.mViewInfoStore.k(recyclerView$ViewHolder0);
        }

        public int j0() {
            return this.a == null ? 0 : this.a.g();
        }

        public void j1(@NonNull View view0, int v, int v1) {
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            Rect rect0 = this.b.getItemDecorInsetsForChild(view0);
            int v2 = v + (rect0.left + rect0.right);
            int v3 = v1 + (rect0.top + rect0.bottom);
            int v4 = LayoutManager.k0(this.R0(), this.S0(), this.G0() + this.H0() + v2, recyclerView$LayoutParams0.width, this.G());
            int v5 = LayoutManager.k0(this.x0(), this.y0(), this.J0() + this.E0() + v3, recyclerView$LayoutParams0.height, this.H());
            if(this.v2(view0, v4, v5, recyclerView$LayoutParams0)) {
                view0.measure(v4, v5);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public int j2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
            return 0;
        }

        public static int k0(int v, int v1, int v2, int v3, boolean z) {
            int v4 = Math.max(0, v - v2);
            if(z) {
                if(v3 < 0) {
                    return v3 == -1 && (v1 == 0x80000000 || v1 == 0x40000000) ? View.MeasureSpec.makeMeasureSpec(v4, v1) : 0;
                }
            }
            else if(v3 < 0) {
                switch(v3) {
                    case -2: {
                        return v1 == 0x80000000 || v1 == 0x40000000 ? View.MeasureSpec.makeMeasureSpec(v4, 0x80000000) : View.MeasureSpec.makeMeasureSpec(v4, 0);
                    }
                    case -1: {
                        return View.MeasureSpec.makeMeasureSpec(v4, v1);
                    }
                    default: {
                        return 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
        }

        public void k1(@NonNull View view0, int v, int v1) {
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            Rect rect0 = this.b.getItemDecorInsetsForChild(view0);
            int v2 = v + (rect0.left + rect0.right);
            int v3 = v1 + (rect0.top + rect0.bottom);
            int v4 = LayoutManager.k0(this.R0(), this.S0(), this.G0() + this.H0() + recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin + v2, recyclerView$LayoutParams0.width, this.G());
            int v5 = LayoutManager.k0(this.x0(), this.y0(), this.J0() + this.E0() + recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin + v3, recyclerView$LayoutParams0.height, this.H());
            if(this.v2(view0, v4, v5, recyclerView$LayoutParams0)) {
                view0.measure(v4, v5);
            }
        }

        public void k2(int v) {
            if(RecyclerView.sVerboseLoggingEnabled) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        @Deprecated
        public static int l0(int v, int v1, int v2, boolean z) {
            int v3 = Math.max(0, v - v1);
            if(z) {
                return v2 < 0 ? 0 : View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
            }
            if(v2 < 0) {
                switch(v2) {
                    case -2: {
                        return View.MeasureSpec.makeMeasureSpec(v3, 0x80000000);
                    }
                    case -1: {
                        return View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
                    }
                    default: {
                        return 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
        }

        public void l1(int v, int v1) {
            View view0 = this.i0(v);
            if(view0 == null) {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + v + this.b.toString());
            }
            this.W(v);
            this.D(view0, v1);
        }

        @SuppressLint({"UnknownNullness"})
        public int l2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
            return 0;
        }

        private int[] m0(View view0, Rect rect0) {
            int v = this.G0();
            int v1 = this.J0();
            int v2 = this.H0();
            int v3 = this.E0();
            int v4 = view0.getLeft() + rect0.left - view0.getScrollX();
            int v5 = view0.getTop() + rect0.top - view0.getScrollY();
            int v6 = v4 - v;
            int v7 = Math.min(0, v6);
            int v8 = v5 - v1;
            int v9 = Math.min(0, v8);
            int v10 = rect0.width() + v4 - (this.R0() - v2);
            int v11 = Math.max(0, v10);
            int v12 = Math.max(0, rect0.height() + v5 - (this.x0() - v3));
            if(this.A0() != 1) {
                if(v7 == 0) {
                    v7 = Math.min(v6, v11);
                }
                v11 = v7;
            }
            else if(v11 == 0) {
                v11 = Math.max(v7, v10);
            }
            if(v9 == 0) {
                v9 = Math.min(v8, v12);
            }
            return new int[]{v11, v9};
        }

        public void m1(@Px int v) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null) {
                recyclerView0.offsetChildrenHorizontal(v);
            }
        }

        @Deprecated
        public void m2(boolean z) {
            this.j = z;
        }

        public boolean n0() {
            return this.b != null && this.b.mClipToPadding;
        }

        public void n1(@Px int v) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null) {
                recyclerView0.offsetChildrenVertical(v);
            }
        }

        void n2(RecyclerView recyclerView0) {
            this.p2(View.MeasureSpec.makeMeasureSpec(recyclerView0.getWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(recyclerView0.getHeight(), 0x40000000));
        }

        public int o0(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0) {
            return this.b == null || this.b.mAdapter == null || !this.G() ? 1 : this.b.mAdapter.getItemCount();
        }

        public void o1(@Nullable Adapter recyclerView$Adapter0, @Nullable Adapter recyclerView$Adapter1) {
        }

        public final void o2(boolean z) {
            if(z != this.l) {
                this.l = z;
                this.m = 0;
                RecyclerView recyclerView0 = this.b;
                if(recyclerView0 != null) {
                    recyclerView0.mRecycler.Q();
                }
            }
        }

        public int p0(@NonNull View view0) {
            return view0.getBottom() + this.h0(view0);
        }

        public boolean p1(@NonNull RecyclerView recyclerView0, @NonNull ArrayList arrayList0, int v, int v1) [...] // Inlined contents

        void p2(int v, int v1) {
            this.q = View.MeasureSpec.getSize(v);
            int v2 = View.MeasureSpec.getMode(v);
            this.o = v2;
            if(v2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(v1);
            int v3 = View.MeasureSpec.getMode(v1);
            this.p = v3;
            if(v3 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.r = 0;
            }
        }

        public void q0(@NonNull View view0, @NonNull Rect rect0) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view0, rect0);
        }

        @CallSuper
        public void q1(RecyclerView recyclerView0) {
        }

        public void q2(int v, int v1) {
            this.b.setMeasuredDimension(v, v1);
        }

        public int r0(@NonNull View view0) {
            return view0.getLeft() - this.B0(view0);
        }

        @Deprecated
        public void r1(RecyclerView recyclerView0) {
        }

        public void r2(Rect rect0, int v, int v1) {
            int v2 = rect0.width();
            int v3 = this.G0();
            int v4 = this.H0();
            int v5 = rect0.height();
            int v6 = this.J0();
            int v7 = this.E0();
            this.q2(LayoutManager.J(v, v2 + v3 + v4, this.D0()), LayoutManager.J(v1, v5 + v6 + v7, this.C0()));
        }

        public int s0(@NonNull View view0) {
            Rect rect0 = ((LayoutParams)view0.getLayoutParams()).b;
            return view0.getMeasuredHeight() + rect0.top + rect0.bottom;
        }

        @SuppressLint({"UnknownNullness"})
        @CallSuper
        public void s1(RecyclerView recyclerView0, Recycler recyclerView$Recycler0) {
        }

        void s2(int v, int v1) {
            int v2 = this.j0();
            if(v2 == 0) {
                this.b.defaultOnMeasure(v, v1);
                return;
            }
            int v3 = 0x80000000;
            int v4 = 0x80000000;
            int v5 = 0x7FFFFFFF;
            int v6 = 0x7FFFFFFF;
            for(int v7 = 0; v7 < v2; ++v7) {
                View view0 = this.i0(v7);
                Rect rect0 = this.b.mTempRect;
                this.q0(view0, rect0);
                int v8 = rect0.left;
                if(v8 < v5) {
                    v5 = v8;
                }
                int v9 = rect0.right;
                if(v9 > v3) {
                    v3 = v9;
                }
                int v10 = rect0.top;
                if(v10 < v6) {
                    v6 = v10;
                }
                int v11 = rect0.bottom;
                if(v11 > v4) {
                    v4 = v11;
                }
            }
            this.b.mTempRect.set(v5, v6, v3, v4);
            this.r2(this.b.mTempRect, v, v1);
        }

        public int t0(@NonNull View view0) {
            Rect rect0 = ((LayoutParams)view0.getLayoutParams()).b;
            return view0.getMeasuredWidth() + rect0.left + rect0.right;
        }

        @Nullable
        public View t1(@NonNull View view0, int v, @NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0) {
            return null;
        }

        public void t2(boolean z) {
            this.k = z;
        }

        public int u0(@NonNull View view0) {
            return view0.getRight() + this.M0(view0);
        }

        public void u1(@NonNull AccessibilityEvent accessibilityEvent0) {
            this.v1(this.b.mRecycler, this.b.mState, accessibilityEvent0);
        }

        void u2(RecyclerView recyclerView0) {
            if(recyclerView0 == null) {
                this.b = null;
                this.a = null;
                this.q = 0;
                this.r = 0;
            }
            else {
                this.b = recyclerView0;
                this.a = recyclerView0.mChildHelper;
                this.q = recyclerView0.getWidth();
                this.r = recyclerView0.getHeight();
            }
            this.o = 0x40000000;
            this.p = 0x40000000;
        }

        @SuppressLint({"UnknownNullness"})
        public void v(View view0) {
            this.w(view0, -1);
        }

        public int v0(@NonNull View view0) {
            return view0.getTop() - this.P0(view0);
        }

        public void v1(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull AccessibilityEvent accessibilityEvent0) {
            boolean z = true;
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null && accessibilityEvent0 != null) {
                if(!recyclerView0.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent0.setScrollable(z);
                Adapter recyclerView$Adapter0 = this.b.mAdapter;
                if(recyclerView$Adapter0 != null) {
                    accessibilityEvent0.setItemCount(recyclerView$Adapter0.getItemCount());
                }
            }
        }

        // 去混淆评级： 低(40)
        boolean v2(View view0, int v, int v1, LayoutParams recyclerView$LayoutParams0) {
            return view0.isLayoutRequested() || !this.k || !LayoutManager.e1(view0.getWidth(), v, recyclerView$LayoutParams0.width) || !LayoutManager.e1(view0.getHeight(), v1, recyclerView$LayoutParams0.height);
        }

        @SuppressLint({"UnknownNullness"})
        public void w(View view0, int v) {
            this.z(view0, v, true);
        }

        @Nullable
        public View w0() {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 == null) {
                return null;
            }
            View view0 = recyclerView0.getFocusedChild();
            return view0 == null || this.a.n(view0) ? null : view0;
        }

        void w1(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            this.x1(this.b.mRecycler, this.b.mState, accessibilityNodeInfoCompat0);
        }

        boolean w2() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void x(View view0) {
            this.y(view0, -1);
        }

        @Px
        public int x0() {
            return this.r;
        }

        public void x1(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            if(this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat0.a(0x2000);
                accessibilityNodeInfoCompat0.Z1(true);
                accessibilityNodeInfoCompat0.A1(true);
            }
            if(this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat0.a(0x1000);
                accessibilityNodeInfoCompat0.Z1(true);
                accessibilityNodeInfoCompat0.A1(true);
            }
            accessibilityNodeInfoCompat0.m1(CollectionInfoCompat.h(this.N0(recyclerView$Recycler0, recyclerView$State0), this.o0(recyclerView$Recycler0, recyclerView$State0), false, 0));
        }

        // 去混淆评级： 低(30)
        boolean x2(View view0, int v, int v1, LayoutParams recyclerView$LayoutParams0) {
            return !this.k || !LayoutManager.e1(view0.getMeasuredWidth(), v, recyclerView$LayoutParams0.width) || !LayoutManager.e1(view0.getMeasuredHeight(), v1, recyclerView$LayoutParams0.height);
        }

        @SuppressLint({"UnknownNullness"})
        public void y(View view0, int v) {
            this.z(view0, v, false);
        }

        public int y0() {
            return this.p;
        }

        void y1(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            if(recyclerView$ViewHolder0 != null && !recyclerView$ViewHolder0.isRemoved() && !this.a.n(recyclerView$ViewHolder0.itemView)) {
                this.z1(this.b.mRecycler, this.b.mState, view0, accessibilityNodeInfoCompat0);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void y2(RecyclerView recyclerView0, State recyclerView$State0, int v) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        private void z(View view0, int v, boolean z) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            if(z || recyclerView$ViewHolder0.isRemoved()) {
                this.b.mViewInfoStore.b(recyclerView$ViewHolder0);
            }
            else {
                this.b.mViewInfoStore.p(recyclerView$ViewHolder0);
            }
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(recyclerView$ViewHolder0.wasReturnedFromScrap() || recyclerView$ViewHolder0.isScrap()) {
                if(recyclerView$ViewHolder0.isScrap()) {
                    recyclerView$ViewHolder0.unScrap();
                }
                else {
                    recyclerView$ViewHolder0.clearReturnedFromScrapFlag();
                }
                this.a.c(view0, v, view0.getLayoutParams(), false);
            }
            else if(view0.getParent() == this.b) {
                int v1 = this.a.m(view0);
                if(v == -1) {
                    v = this.a.g();
                }
                if(v1 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view0) + this.b.exceptionLabel());
                }
                if(v1 != v) {
                    this.b.mLayout.l1(v1, v);
                }
            }
            else {
                this.a.a(view0, v, false);
                recyclerView$LayoutParams0.c = true;
                if(this.g != null && this.g.i()) {
                    this.g.l(view0);
                }
            }
            if(recyclerView$LayoutParams0.d) {
                if(RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + recyclerView$LayoutParams0.a);
                }
                recyclerView$ViewHolder0.itemView.invalidate();
                recyclerView$LayoutParams0.d = false;
            }
        }

        public int z0(@NonNull View view0) {
            return RecyclerView.getChildViewHolderInt(view0).getItemViewType();
        }

        // 去混淆评级： 低(20)
        public void z1(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            accessibilityNodeInfoCompat0.n1(CollectionItemInfoCompat.j((this.H() ? this.K0(view0) : 0), 1, (this.G() ? this.K0(view0) : 0), 1, false, false));
        }

        @SuppressLint({"UnknownNullness"})
        public void z2(SmoothScroller recyclerView$SmoothScroller0) {
            if(this.g != null && recyclerView$SmoothScroller0 != this.g && this.g.i()) {
                this.g.s();
            }
            this.g = recyclerView$SmoothScroller0;
            recyclerView$SmoothScroller0.r(this.b, this);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        ViewHolder a;
        final Rect b;
        boolean c;
        boolean d;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(LayoutParams recyclerView$LayoutParams0) {
            super(recyclerView$LayoutParams0);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public int a() {
            return this.a.getAbsoluteAdapterPosition();
        }

        public int b() {
            return this.a.getBindingAdapterPosition();
        }

        @Deprecated
        public int c() {
            return this.a.getBindingAdapterPosition();
        }

        public int d() {
            return this.a.getLayoutPosition();
        }

        @Deprecated
        public int e() {
            return this.a.getPosition();
        }

        public boolean f() {
            return this.a.isUpdated();
        }

        public boolean g() {
            return this.a.isRemoved();
        }

        public boolean h() {
            return this.a.isInvalid();
        }

        public boolean i() {
            return this.a.needsUpdate();
        }
    }

    public interface OnChildAttachStateChangeListener {
        void a(@NonNull View arg1);

        void b(@NonNull View arg1);
    }

    public static abstract class OnFlingListener {
        public abstract boolean a(int arg1, int arg2);
    }

    public interface OnItemTouchListener {
        void h(@NonNull RecyclerView arg1, @NonNull MotionEvent arg2);

        boolean i(@NonNull RecyclerView arg1, @NonNull MotionEvent arg2);

        void j(boolean arg1);
    }

    public static abstract class OnScrollListener {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView0, int v) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView0, int v, int v1) {
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public static class RecycledViewPool {
        static class ScrapData {
            final ArrayList a;
            int b;
            long c;
            long d;

            ScrapData() {
                this.a = new ArrayList();
                this.b = 5;
                this.c = 0L;
                this.d = 0L;
            }
        }

        SparseArray a;
        int b;
        Set c;
        private static final int d = 5;

        public RecycledViewPool() {
            this.a = new SparseArray();
            this.b = 0;
            this.c = Collections.newSetFromMap(new IdentityHashMap());
        }

        void a() {
            ++this.b;
        }

        void b(@NonNull Adapter recyclerView$Adapter0) {
            this.c.add(recyclerView$Adapter0);
        }

        public void c() {
            for(int v = 0; v < this.a.size(); ++v) {
                ScrapData recyclerView$RecycledViewPool$ScrapData0 = (ScrapData)this.a.valueAt(v);
                for(Object object0: recyclerView$RecycledViewPool$ScrapData0.a) {
                    PoolingContainer.b(((ViewHolder)object0).itemView);
                }
                recyclerView$RecycledViewPool$ScrapData0.a.clear();
            }
        }

        void d() {
            --this.b;
        }

        void e(@NonNull Adapter recyclerView$Adapter0, boolean z) {
            this.c.remove(recyclerView$Adapter0);
            if(this.c.size() == 0 && !z) {
                for(int v = 0; v < this.a.size(); ++v) {
                    ArrayList arrayList0 = ((ScrapData)this.a.get(this.a.keyAt(v))).a;
                    for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                        PoolingContainer.b(((ViewHolder)arrayList0.get(v1)).itemView);
                    }
                }
            }
        }

        void f(int v, long v1) {
            ScrapData recyclerView$RecycledViewPool$ScrapData0 = this.j(v);
            recyclerView$RecycledViewPool$ScrapData0.d = this.m(recyclerView$RecycledViewPool$ScrapData0.d, v1);
        }

        void g(int v, long v1) {
            ScrapData recyclerView$RecycledViewPool$ScrapData0 = this.j(v);
            recyclerView$RecycledViewPool$ScrapData0.c = this.m(recyclerView$RecycledViewPool$ScrapData0.c, v1);
        }

        @Nullable
        public ViewHolder h(int v) {
            ScrapData recyclerView$RecycledViewPool$ScrapData0 = (ScrapData)this.a.get(v);
            if(recyclerView$RecycledViewPool$ScrapData0 != null && !recyclerView$RecycledViewPool$ScrapData0.a.isEmpty()) {
                ArrayList arrayList0 = recyclerView$RecycledViewPool$ScrapData0.a;
                for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                    if(!((ViewHolder)arrayList0.get(v1)).isAttachedToTransitionOverlay()) {
                        return (ViewHolder)arrayList0.remove(v1);
                    }
                }
            }
            return null;
        }

        public int i(int v) {
            return this.j(v).a.size();
        }

        private ScrapData j(int v) {
            ScrapData recyclerView$RecycledViewPool$ScrapData0 = (ScrapData)this.a.get(v);
            if(recyclerView$RecycledViewPool$ScrapData0 == null) {
                recyclerView$RecycledViewPool$ScrapData0 = new ScrapData();
                this.a.put(v, recyclerView$RecycledViewPool$ScrapData0);
            }
            return recyclerView$RecycledViewPool$ScrapData0;
        }

        void k(Adapter recyclerView$Adapter0, Adapter recyclerView$Adapter1, boolean z) {
            if(recyclerView$Adapter0 != null) {
                this.d();
            }
            if(!z && this.b == 0) {
                this.c();
            }
            if(recyclerView$Adapter1 != null) {
                this.a();
            }
        }

        public void l(ViewHolder recyclerView$ViewHolder0) {
            int v = recyclerView$ViewHolder0.getItemViewType();
            ArrayList arrayList0 = this.j(v).a;
            if(((ScrapData)this.a.get(v)).b <= arrayList0.size()) {
                PoolingContainer.b(recyclerView$ViewHolder0.itemView);
                return;
            }
            if(RecyclerView.sDebugAssertionsEnabled && arrayList0.contains(recyclerView$ViewHolder0)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            recyclerView$ViewHolder0.resetInternal();
            arrayList0.add(recyclerView$ViewHolder0);
        }

        long m(long v, long v1) {
            return v == 0L ? v1 : v / 4L * 3L + v1 / 4L;
        }

        public void n(int v, int v1) {
            ScrapData recyclerView$RecycledViewPool$ScrapData0 = this.j(v);
            recyclerView$RecycledViewPool$ScrapData0.b = v1;
            ArrayList arrayList0 = recyclerView$RecycledViewPool$ScrapData0.a;
            while(arrayList0.size() > v1) {
                arrayList0.remove(arrayList0.size() - 1);
            }
        }

        int o() {
            int v1 = 0;
            for(int v = 0; v < this.a.size(); ++v) {
                ArrayList arrayList0 = ((ScrapData)this.a.valueAt(v)).a;
                if(arrayList0 != null) {
                    v1 += arrayList0.size();
                }
            }
            return v1;
        }

        boolean p(int v, long v1, long v2) {
            long v3 = this.j(v).d;
            return v3 == 0L || v1 + v3 < v2;
        }

        boolean q(int v, long v1, long v2) {
            long v3 = this.j(v).c;
            return v3 == 0L || v1 + v3 < v2;
        }
    }

    public final class Recycler {
        final ArrayList a;
        ArrayList b;
        final ArrayList c;
        private final List d;
        private int e;
        int f;
        RecycledViewPool g;
        private ViewCacheExtension h;
        final RecyclerView i;
        static final int j = 2;

        public Recycler() {
            ArrayList arrayList0 = new ArrayList();
            this.a = arrayList0;
            this.b = null;
            this.c = new ArrayList();
            this.d = DesugarCollections.unmodifiableList(arrayList0);
            this.e = 2;
            this.f = 2;
        }

        void A() {
            this.v();
        }

        void B() {
            for(int v = 0; v < this.c.size(); ++v) {
                PoolingContainer.b(((ViewHolder)this.c.get(v)).itemView);
            }
            this.C(RecyclerView.this.mAdapter);
        }

        private void C(Adapter recyclerView$Adapter0) {
            this.D(recyclerView$Adapter0, false);
        }

        private void D(Adapter recyclerView$Adapter0, boolean z) {
            RecycledViewPool recyclerView$RecycledViewPool0 = this.g;
            if(recyclerView$RecycledViewPool0 != null) {
                recyclerView$RecycledViewPool0.e(recyclerView$Adapter0, z);
            }
        }

        void E(View view0) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            recyclerView$ViewHolder0.mScrapContainer = null;
            recyclerView$ViewHolder0.mInChangeScrap = false;
            recyclerView$ViewHolder0.clearReturnedFromScrapFlag();
            this.I(recyclerView$ViewHolder0);
        }

        void F() {
            for(int v = this.c.size() - 1; v >= 0; --v) {
                this.G(v);
            }
            this.c.clear();
            if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.b();
            }
        }

        void G(int v) {
            if(RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "Recycling cached view at index " + v);
            }
            ViewHolder recyclerView$ViewHolder0 = (ViewHolder)this.c.get(v);
            if(RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + recyclerView$ViewHolder0);
            }
            this.a(recyclerView$ViewHolder0, true);
            this.c.remove(v);
        }

        public void H(@NonNull View view0) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            if(recyclerView$ViewHolder0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view0, false);
            }
            if(recyclerView$ViewHolder0.isScrap()) {
                recyclerView$ViewHolder0.unScrap();
            }
            else if(recyclerView$ViewHolder0.wasReturnedFromScrap()) {
                recyclerView$ViewHolder0.clearReturnedFromScrapFlag();
            }
            this.I(recyclerView$ViewHolder0);
            if(RecyclerView.this.mItemAnimator != null && !recyclerView$ViewHolder0.isRecyclable()) {
                RecyclerView.this.mItemAnimator.k(recyclerView$ViewHolder0);
            }
        }

        void I(ViewHolder recyclerView$ViewHolder0) {
            boolean z4;
            boolean z = false;
            boolean z1 = true;
            if(!recyclerView$ViewHolder0.isScrap() && recyclerView$ViewHolder0.itemView.getParent() == null) {
                if(recyclerView$ViewHolder0.isTmpDetached()) {
                    throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + recyclerView$ViewHolder0 + RecyclerView.this.exceptionLabel());
                }
                if(recyclerView$ViewHolder0.shouldIgnore()) {
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
                }
                boolean z2 = recyclerView$ViewHolder0.doesTransientStatePreventRecycling();
                Adapter recyclerView$Adapter0 = RecyclerView.this.mAdapter;
                boolean z3 = recyclerView$Adapter0 != null && z2 && recyclerView$Adapter0.onFailedToRecycleView(recyclerView$ViewHolder0);
                if(RecyclerView.sDebugAssertionsEnabled && this.c.contains(recyclerView$ViewHolder0)) {
                    throw new IllegalArgumentException("cached view received recycle internal? " + recyclerView$ViewHolder0 + RecyclerView.this.exceptionLabel());
                }
                if(z3 || recyclerView$ViewHolder0.isRecyclable()) {
                    if(this.f <= 0 || recyclerView$ViewHolder0.hasAnyOfTheFlags(0x20E)) {
                        z4 = false;
                    }
                    else {
                        int v = this.c.size();
                        if(v >= this.f && v > 0) {
                            this.G(0);
                            --v;
                        }
                        if(RecyclerView.ALLOW_THREAD_GAP_WORK && v > 0 && !RecyclerView.this.mPrefetchRegistry.d(recyclerView$ViewHolder0.mPosition)) {
                            int v1;
                            for(v1 = v - 1; v1 >= 0; --v1) {
                                int v2 = ((ViewHolder)this.c.get(v1)).mPosition;
                                if(!RecyclerView.this.mPrefetchRegistry.d(v2)) {
                                    break;
                                }
                            }
                            v = v1 + 1;
                        }
                        this.c.add(v, recyclerView$ViewHolder0);
                        z4 = true;
                    }
                    if(z4) {
                        z = true;
                        z1 = false;
                    }
                    else {
                        this.a(recyclerView$ViewHolder0, true);
                    }
                }
                else {
                    if(RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.exceptionLabel());
                    }
                    z1 = false;
                }
                RecyclerView.this.mViewInfoStore.q(recyclerView$ViewHolder0);
                if(!z && !z1 && z2) {
                    PoolingContainer.b(recyclerView$ViewHolder0.itemView);
                    recyclerView$ViewHolder0.mBindingAdapter = null;
                    recyclerView$ViewHolder0.mOwnerRecyclerView = null;
                }
                return;
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Scrapped or attached views may not be recycled. isScrap:");
            stringBuilder0.append(recyclerView$ViewHolder0.isScrap());
            stringBuilder0.append(" isAttached:");
            if(recyclerView$ViewHolder0.itemView.getParent() != null) {
                z = true;
            }
            stringBuilder0.append(z);
            stringBuilder0.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(stringBuilder0.toString());
        }

        void J(View view0) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            if(!recyclerView$ViewHolder0.hasAnyOfTheFlags(12) && recyclerView$ViewHolder0.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(recyclerView$ViewHolder0)) {
                if(this.b == null) {
                    this.b = new ArrayList();
                }
                recyclerView$ViewHolder0.setScrapContainer(this, true);
                this.b.add(recyclerView$ViewHolder0);
                return;
            }
            if(recyclerView$ViewHolder0.isInvalid() && !recyclerView$ViewHolder0.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
            recyclerView$ViewHolder0.setScrapContainer(this, false);
            this.a.add(recyclerView$ViewHolder0);
        }

        void K(RecycledViewPool recyclerView$RecycledViewPool0) {
            this.C(RecyclerView.this.mAdapter);
            RecycledViewPool recyclerView$RecycledViewPool1 = this.g;
            if(recyclerView$RecycledViewPool1 != null) {
                recyclerView$RecycledViewPool1.d();
            }
            this.g = recyclerView$RecycledViewPool0;
            if(recyclerView$RecycledViewPool0 != null && RecyclerView.this.getAdapter() != null) {
                this.g.a();
            }
            this.v();
        }

        void L(ViewCacheExtension recyclerView$ViewCacheExtension0) {
            this.h = recyclerView$ViewCacheExtension0;
        }

        public void M(int v) {
            this.e = v;
            this.Q();
        }

        private boolean N(@NonNull ViewHolder recyclerView$ViewHolder0, int v, int v1, long v2) {
            recyclerView$ViewHolder0.mBindingAdapter = null;
            recyclerView$ViewHolder0.mOwnerRecyclerView = RecyclerView.this;
            boolean z = false;
            if(v2 != 0x7FFFFFFFFFFFFFFFL && !this.g.p(recyclerView$ViewHolder0.getItemViewType(), 3755461685900L, v2)) {
                return false;
            }
            if(recyclerView$ViewHolder0.isTmpDetached()) {
                int v3 = RecyclerView.this.getChildCount();
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = recyclerView$ViewHolder0.itemView.getLayoutParams();
                RecyclerView.this.attachViewToParent(recyclerView$ViewHolder0.itemView, v3, viewGroup$LayoutParams0);
                z = true;
            }
            RecyclerView.this.mAdapter.bindViewHolder(recyclerView$ViewHolder0, v);
            if(z) {
                RecyclerView.this.detachViewFromParent(recyclerView$ViewHolder0.itemView);
            }
            this.g.f(recyclerView$ViewHolder0.getItemViewType(), 1094000L);
            this.b(recyclerView$ViewHolder0);
            if(RecyclerView.this.mState.j()) {
                recyclerView$ViewHolder0.mPreLayoutPosition = v1;
            }
            return true;
        }

        @Nullable
        ViewHolder O(int v, boolean z, long v1) {
            LayoutParams recyclerView$LayoutParams0;
            boolean z3;
            boolean z2;
            ViewHolder recyclerView$ViewHolder0;
            boolean z1 = true;
            if(v < 0 || v >= RecyclerView.this.mState.d()) {
                throw new IndexOutOfBoundsException("Invalid item position " + v + "(" + v + "). Item count:" + RecyclerView.this.mState.d() + RecyclerView.this.exceptionLabel());
            }
            if(RecyclerView.this.mState.j()) {
                recyclerView$ViewHolder0 = this.i(v);
                z2 = recyclerView$ViewHolder0 == null ? false : true;
            }
            else {
                recyclerView$ViewHolder0 = null;
                z2 = false;
            }
            if(recyclerView$ViewHolder0 == null) {
                recyclerView$ViewHolder0 = this.n(v, z);
                if(recyclerView$ViewHolder0 != null) {
                    if(this.R(recyclerView$ViewHolder0)) {
                        z2 = true;
                    }
                    else {
                        if(!z) {
                            recyclerView$ViewHolder0.addFlags(4);
                            if(recyclerView$ViewHolder0.isScrap()) {
                                RecyclerView.this.removeDetachedView(recyclerView$ViewHolder0.itemView, false);
                                recyclerView$ViewHolder0.unScrap();
                            }
                            else if(recyclerView$ViewHolder0.wasReturnedFromScrap()) {
                                recyclerView$ViewHolder0.clearReturnedFromScrapFlag();
                            }
                            this.I(recyclerView$ViewHolder0);
                        }
                        recyclerView$ViewHolder0 = null;
                    }
                }
            }
            if(recyclerView$ViewHolder0 == null) {
                int v2 = RecyclerView.this.mAdapterHelper.n(v);
                if(v2 < 0 || v2 >= RecyclerView.this.mAdapter.getItemCount()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + v + "(offset:" + v2 + ").state:" + RecyclerView.this.mState.d() + RecyclerView.this.exceptionLabel());
                }
                int v3 = RecyclerView.this.mAdapter.getItemViewType(v2);
                if(RecyclerView.this.mAdapter.hasStableIds()) {
                    recyclerView$ViewHolder0 = this.m(RecyclerView.this.mAdapter.getItemId(v2), v3, z);
                    if(recyclerView$ViewHolder0 != null) {
                        recyclerView$ViewHolder0.mPosition = v2;
                        z2 = true;
                    }
                }
                if(recyclerView$ViewHolder0 == null) {
                    ViewCacheExtension recyclerView$ViewCacheExtension0 = this.h;
                    if(recyclerView$ViewCacheExtension0 != null) {
                        View view0 = recyclerView$ViewCacheExtension0.a(this, v, v3);
                        if(view0 != null) {
                            recyclerView$ViewHolder0 = RecyclerView.this.getChildViewHolder(view0);
                            if(recyclerView$ViewHolder0 == null) {
                                throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + RecyclerView.this.exceptionLabel());
                            }
                            if(recyclerView$ViewHolder0.shouldIgnore()) {
                                throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + RecyclerView.this.exceptionLabel());
                            }
                        }
                    }
                }
                if(recyclerView$ViewHolder0 == null) {
                    if(RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + v + ") fetching from shared pool");
                    }
                    recyclerView$ViewHolder0 = this.j().h(v3);
                    if(recyclerView$ViewHolder0 != null) {
                        recyclerView$ViewHolder0.resetInternal();
                        if(RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                            this.s(recyclerView$ViewHolder0);
                        }
                    }
                }
                if(recyclerView$ViewHolder0 == null) {
                    if(v1 != 0x7FFFFFFFFFFFFFFFL && !this.g.q(v3, 3756681284400L, v1)) {
                        return null;
                    }
                    recyclerView$ViewHolder0 = RecyclerView.this.mAdapter.createViewHolder(RecyclerView.this, v3);
                    if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView recyclerView0 = RecyclerView.findNestedRecyclerView(recyclerView$ViewHolder0.itemView);
                        if(recyclerView0 != null) {
                            recyclerView$ViewHolder0.mNestedRecyclerView = new WeakReference(recyclerView0);
                        }
                    }
                    this.g.g(v3, 416100L);
                    if(RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                    }
                }
            }
            if(z2 && !RecyclerView.this.mState.j() && recyclerView$ViewHolder0.hasAnyOfTheFlags(0x2000)) {
                recyclerView$ViewHolder0.setFlags(0, 0x2000);
                if(RecyclerView.this.mState.k) {
                    int v4 = ItemAnimator.e(recyclerView$ViewHolder0);
                    ItemAnimator recyclerView$ItemAnimator0 = RecyclerView.this.mItemAnimator;
                    List list0 = recyclerView$ViewHolder0.getUnmodifiedPayloads();
                    ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0 = recyclerView$ItemAnimator0.w(RecyclerView.this.mState, recyclerView$ViewHolder0, v4 | 0x1000, list0);
                    RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0);
                }
            }
            if(RecyclerView.this.mState.j() && recyclerView$ViewHolder0.isBound()) {
                recyclerView$ViewHolder0.mPreLayoutPosition = v;
                z3 = false;
            }
            else if(!recyclerView$ViewHolder0.isBound() || recyclerView$ViewHolder0.needsUpdate() || recyclerView$ViewHolder0.isInvalid()) {
                if(RecyclerView.sDebugAssertionsEnabled && recyclerView$ViewHolder0.isRemoved()) {
                    throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + recyclerView$ViewHolder0 + RecyclerView.this.exceptionLabel());
                }
                z3 = this.N(recyclerView$ViewHolder0, RecyclerView.this.mAdapterHelper.n(v), v, v1);
            }
            else {
                z3 = false;
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = recyclerView$ViewHolder0.itemView.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                recyclerView$LayoutParams0 = (LayoutParams)RecyclerView.this.generateDefaultLayoutParams();
                recyclerView$ViewHolder0.itemView.setLayoutParams(recyclerView$LayoutParams0);
            }
            else if(RecyclerView.this.checkLayoutParams(viewGroup$LayoutParams0)) {
                recyclerView$LayoutParams0 = (LayoutParams)viewGroup$LayoutParams0;
            }
            else {
                recyclerView$LayoutParams0 = (LayoutParams)RecyclerView.this.generateLayoutParams(viewGroup$LayoutParams0);
                recyclerView$ViewHolder0.itemView.setLayoutParams(recyclerView$LayoutParams0);
            }
            recyclerView$LayoutParams0.a = recyclerView$ViewHolder0;
            if(!z2 || !z3) {
                z1 = false;
            }
            recyclerView$LayoutParams0.d = z1;
            return recyclerView$ViewHolder0;
        }

        void P(ViewHolder recyclerView$ViewHolder0) {
            if(recyclerView$ViewHolder0.mInChangeScrap) {
                this.b.remove(recyclerView$ViewHolder0);
            }
            else {
                this.a.remove(recyclerView$ViewHolder0);
            }
            recyclerView$ViewHolder0.mScrapContainer = null;
            recyclerView$ViewHolder0.mInChangeScrap = false;
            recyclerView$ViewHolder0.clearReturnedFromScrapFlag();
        }

        void Q() {
            LayoutManager recyclerView$LayoutManager0 = RecyclerView.this.mLayout;
            this.f = this.e + (recyclerView$LayoutManager0 == null ? 0 : recyclerView$LayoutManager0.m);
            for(int v = this.c.size() - 1; v >= 0 && this.c.size() > this.f; --v) {
                this.G(v);
            }
        }

        boolean R(ViewHolder recyclerView$ViewHolder0) {
            if(recyclerView$ViewHolder0.isRemoved()) {
                if(RecyclerView.sDebugAssertionsEnabled && !RecyclerView.this.mState.j()) {
                    throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.exceptionLabel());
                }
                return RecyclerView.this.mState.j();
            }
            if(recyclerView$ViewHolder0.mPosition < 0 || recyclerView$ViewHolder0.mPosition >= RecyclerView.this.mAdapter.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + recyclerView$ViewHolder0 + RecyclerView.this.exceptionLabel());
            }
            return RecyclerView.this.mState.j() || RecyclerView.this.mAdapter.getItemViewType(recyclerView$ViewHolder0.mPosition) == recyclerView$ViewHolder0.getItemViewType() ? !RecyclerView.this.mAdapter.hasStableIds() || recyclerView$ViewHolder0.getItemId() == RecyclerView.this.mAdapter.getItemId(recyclerView$ViewHolder0.mPosition) : false;
        }

        void S(int v, int v1) {
            for(int v2 = this.c.size() - 1; v2 >= 0; --v2) {
                ViewHolder recyclerView$ViewHolder0 = (ViewHolder)this.c.get(v2);
                if(recyclerView$ViewHolder0 != null && (recyclerView$ViewHolder0.mPosition >= v && recyclerView$ViewHolder0.mPosition < v1 + v)) {
                    recyclerView$ViewHolder0.addFlags(2);
                    this.G(v2);
                }
            }
        }

        void a(@NonNull ViewHolder recyclerView$ViewHolder0, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(recyclerView$ViewHolder0);
            View view0 = recyclerView$ViewHolder0.itemView;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate0 = RecyclerView.this.mAccessibilityDelegate;
            if(recyclerViewAccessibilityDelegate0 != null) {
                AccessibilityDelegateCompat accessibilityDelegateCompat0 = recyclerViewAccessibilityDelegate0.n();
                ViewCompat.J1(view0, (accessibilityDelegateCompat0 instanceof ItemDelegate ? ((ItemDelegate)accessibilityDelegateCompat0).n(view0) : null));
            }
            if(z) {
                this.h(recyclerView$ViewHolder0);
            }
            recyclerView$ViewHolder0.mBindingAdapter = null;
            recyclerView$ViewHolder0.mOwnerRecyclerView = null;
            this.j().l(recyclerView$ViewHolder0);
        }

        private void b(ViewHolder recyclerView$ViewHolder0) {
            if(RecyclerView.this.isAccessibilityEnabled()) {
                View view0 = recyclerView$ViewHolder0.itemView;
                if(view0.getImportantForAccessibility() == 0) {
                    view0.setImportantForAccessibility(1);
                }
                RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate0 = RecyclerView.this.mAccessibilityDelegate;
                if(recyclerViewAccessibilityDelegate0 == null) {
                    return;
                }
                AccessibilityDelegateCompat accessibilityDelegateCompat0 = recyclerViewAccessibilityDelegate0.n();
                if(accessibilityDelegateCompat0 instanceof ItemDelegate) {
                    ((ItemDelegate)accessibilityDelegateCompat0).o(view0);
                }
                ViewCompat.J1(view0, accessibilityDelegateCompat0);
            }
        }

        public void c(@NonNull View view0, int v) {
            LayoutParams recyclerView$LayoutParams0;
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            if(recyclerView$ViewHolder0 == null) {
                throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.exceptionLabel());
            }
            int v1 = RecyclerView.this.mAdapterHelper.n(v);
            if(v1 < 0 || v1 >= RecyclerView.this.mAdapter.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + v + "(offset:" + v1 + ").state:" + RecyclerView.this.mState.d() + RecyclerView.this.exceptionLabel());
            }
            this.N(recyclerView$ViewHolder0, v1, v, 0x7FFFFFFFFFFFFFFFL);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = recyclerView$ViewHolder0.itemView.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                recyclerView$LayoutParams0 = (LayoutParams)RecyclerView.this.generateDefaultLayoutParams();
                recyclerView$ViewHolder0.itemView.setLayoutParams(recyclerView$LayoutParams0);
            }
            else if(RecyclerView.this.checkLayoutParams(viewGroup$LayoutParams0)) {
                recyclerView$LayoutParams0 = (LayoutParams)viewGroup$LayoutParams0;
            }
            else {
                recyclerView$LayoutParams0 = (LayoutParams)RecyclerView.this.generateLayoutParams(viewGroup$LayoutParams0);
                recyclerView$ViewHolder0.itemView.setLayoutParams(recyclerView$LayoutParams0);
            }
            boolean z = true;
            recyclerView$LayoutParams0.c = true;
            recyclerView$LayoutParams0.a = recyclerView$ViewHolder0;
            if(recyclerView$ViewHolder0.itemView.getParent() != null) {
                z = false;
            }
            recyclerView$LayoutParams0.d = z;
        }

        public void d() {
            this.a.clear();
            this.F();
        }

        void e() {
            int v = this.c.size();
            for(int v2 = 0; v2 < v; ++v2) {
                ((ViewHolder)this.c.get(v2)).clearOldPosition();
            }
            int v3 = this.a.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                ((ViewHolder)this.a.get(v4)).clearOldPosition();
            }
            ArrayList arrayList0 = this.b;
            if(arrayList0 != null) {
                int v5 = arrayList0.size();
                for(int v1 = 0; v1 < v5; ++v1) {
                    ((ViewHolder)this.b.get(v1)).clearOldPosition();
                }
            }
        }

        void f() {
            this.a.clear();
            ArrayList arrayList0 = this.b;
            if(arrayList0 != null) {
                arrayList0.clear();
            }
        }

        public int g(int v) {
            if(v < 0 || v >= RecyclerView.this.mState.d()) {
                throw new IndexOutOfBoundsException("invalid position " + v + ". State item count is " + RecyclerView.this.mState.d() + RecyclerView.this.exceptionLabel());
            }
            return RecyclerView.this.mState.j() ? RecyclerView.this.mAdapterHelper.n(v) : v;
        }

        void h(@NonNull ViewHolder recyclerView$ViewHolder0) {
            RecyclerListener recyclerView$RecyclerListener0 = RecyclerView.this.mRecyclerListener;
            if(recyclerView$RecyclerListener0 != null) {
                recyclerView$RecyclerListener0.a(recyclerView$ViewHolder0);
            }
            int v = RecyclerView.this.mRecyclerListeners.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((RecyclerListener)RecyclerView.this.mRecyclerListeners.get(v1)).a(recyclerView$ViewHolder0);
            }
            Adapter recyclerView$Adapter0 = RecyclerView.this.mAdapter;
            if(recyclerView$Adapter0 != null) {
                recyclerView$Adapter0.onViewRecycled(recyclerView$ViewHolder0);
            }
            RecyclerView recyclerView0 = RecyclerView.this;
            if(recyclerView0.mState != null) {
                recyclerView0.mViewInfoStore.q(recyclerView$ViewHolder0);
            }
            if(RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + recyclerView$ViewHolder0);
            }
        }

        ViewHolder i(int v) {
            ArrayList arrayList0 = this.b;
            if(arrayList0 != null) {
                int v1 = arrayList0.size();
                if(v1 != 0) {
                    for(int v3 = 0; v3 < v1; ++v3) {
                        ViewHolder recyclerView$ViewHolder0 = (ViewHolder)this.b.get(v3);
                        if(!recyclerView$ViewHolder0.wasReturnedFromScrap() && recyclerView$ViewHolder0.getLayoutPosition() == v) {
                            recyclerView$ViewHolder0.addFlags(0x20);
                            return recyclerView$ViewHolder0;
                        }
                    }
                    if(RecyclerView.this.mAdapter.hasStableIds()) {
                        int v4 = RecyclerView.this.mAdapterHelper.n(v);
                        if(v4 > 0 && v4 < RecyclerView.this.mAdapter.getItemCount()) {
                            long v5 = RecyclerView.this.mAdapter.getItemId(v4);
                            for(int v2 = 0; v2 < v1; ++v2) {
                                ViewHolder recyclerView$ViewHolder1 = (ViewHolder)this.b.get(v2);
                                if(!recyclerView$ViewHolder1.wasReturnedFromScrap() && recyclerView$ViewHolder1.getItemId() == v5) {
                                    recyclerView$ViewHolder1.addFlags(0x20);
                                    return recyclerView$ViewHolder1;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }

        RecycledViewPool j() {
            if(this.g == null) {
                this.g = new RecycledViewPool();
                this.v();
            }
            return this.g;
        }

        int k() {
            return this.a.size();
        }

        @NonNull
        public List l() {
            return this.d;
        }

        ViewHolder m(long v, int v1, boolean z) {
            for(int v2 = this.a.size() - 1; v2 >= 0; --v2) {
                ViewHolder recyclerView$ViewHolder0 = (ViewHolder)this.a.get(v2);
                if(recyclerView$ViewHolder0.getItemId() == v && !recyclerView$ViewHolder0.wasReturnedFromScrap()) {
                    if(v1 == recyclerView$ViewHolder0.getItemViewType()) {
                        recyclerView$ViewHolder0.addFlags(0x20);
                        if(recyclerView$ViewHolder0.isRemoved() && !RecyclerView.this.mState.j()) {
                            recyclerView$ViewHolder0.setFlags(2, 14);
                        }
                        return recyclerView$ViewHolder0;
                    }
                    if(!z) {
                        this.a.remove(v2);
                        RecyclerView.this.removeDetachedView(recyclerView$ViewHolder0.itemView, false);
                        this.E(recyclerView$ViewHolder0.itemView);
                    }
                }
            }
            for(int v3 = this.c.size() - 1; v3 >= 0; --v3) {
                ViewHolder recyclerView$ViewHolder1 = (ViewHolder)this.c.get(v3);
                if(recyclerView$ViewHolder1.getItemId() == v && !recyclerView$ViewHolder1.isAttachedToTransitionOverlay()) {
                    if(v1 == recyclerView$ViewHolder1.getItemViewType()) {
                        if(!z) {
                            this.c.remove(v3);
                        }
                        return recyclerView$ViewHolder1;
                    }
                    if(!z) {
                        this.G(v3);
                        return null;
                    }
                }
            }
            return null;
        }

        ViewHolder n(int v, boolean z) {
            int v1 = this.a.size();
            for(int v3 = 0; v3 < v1; ++v3) {
                ViewHolder recyclerView$ViewHolder0 = (ViewHolder)this.a.get(v3);
                if(!recyclerView$ViewHolder0.wasReturnedFromScrap() && recyclerView$ViewHolder0.getLayoutPosition() == v && !recyclerView$ViewHolder0.isInvalid() && (RecyclerView.this.mState.h || !recyclerView$ViewHolder0.isRemoved())) {
                    recyclerView$ViewHolder0.addFlags(0x20);
                    return recyclerView$ViewHolder0;
                }
            }
            if(!z) {
                View view0 = RecyclerView.this.mChildHelper.e(v);
                if(view0 != null) {
                    ViewHolder recyclerView$ViewHolder1 = RecyclerView.getChildViewHolderInt(view0);
                    RecyclerView.this.mChildHelper.s(view0);
                    int v4 = RecyclerView.this.mChildHelper.m(view0);
                    if(v4 == -1) {
                        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + recyclerView$ViewHolder1 + RecyclerView.this.exceptionLabel());
                    }
                    RecyclerView.this.mChildHelper.d(v4);
                    this.J(view0);
                    recyclerView$ViewHolder1.addFlags(0x2020);
                    return recyclerView$ViewHolder1;
                }
            }
            int v5 = this.c.size();
            for(int v2 = 0; v2 < v5; ++v2) {
                ViewHolder recyclerView$ViewHolder2 = (ViewHolder)this.c.get(v2);
                if(!recyclerView$ViewHolder2.isInvalid() && recyclerView$ViewHolder2.getLayoutPosition() == v && !recyclerView$ViewHolder2.isAttachedToTransitionOverlay()) {
                    if(!z) {
                        this.c.remove(v2);
                    }
                    if(RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + v + ") found match in cache: " + recyclerView$ViewHolder2);
                    }
                    return recyclerView$ViewHolder2;
                }
            }
            return null;
        }

        View o(int v) {
            return ((ViewHolder)this.a.get(v)).itemView;
        }

        @NonNull
        public View p(int v) {
            return this.q(v, false);
        }

        View q(int v, boolean z) {
            return this.O(v, z, 0x7FFFFFFFFFFFFFFFL).itemView;
        }

        private void r(ViewGroup viewGroup0, boolean z) {
            for(int v = viewGroup0.getChildCount() - 1; v >= 0; --v) {
                View view0 = viewGroup0.getChildAt(v);
                if(view0 instanceof ViewGroup) {
                    this.r(((ViewGroup)view0), true);
                }
            }
            if(!z) {
                return;
            }
            if(viewGroup0.getVisibility() == 4) {
                viewGroup0.setVisibility(0);
                viewGroup0.setVisibility(4);
                return;
            }
            int v1 = viewGroup0.getVisibility();
            viewGroup0.setVisibility(4);
            viewGroup0.setVisibility(v1);
        }

        private void s(ViewHolder recyclerView$ViewHolder0) {
            View view0 = recyclerView$ViewHolder0.itemView;
            if(view0 instanceof ViewGroup) {
                this.r(((ViewGroup)view0), false);
            }
        }

        void t() {
            int v = this.c.size();
            for(int v1 = 0; v1 < v; ++v1) {
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)((ViewHolder)this.c.get(v1)).itemView.getLayoutParams();
                if(recyclerView$LayoutParams0 != null) {
                    recyclerView$LayoutParams0.c = true;
                }
            }
        }

        void u() {
            int v = this.c.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ViewHolder recyclerView$ViewHolder0 = (ViewHolder)this.c.get(v1);
                if(recyclerView$ViewHolder0 != null) {
                    recyclerView$ViewHolder0.addFlags(6);
                    recyclerView$ViewHolder0.addChangePayload(null);
                }
            }
            Adapter recyclerView$Adapter0 = RecyclerView.this.mAdapter;
            if(recyclerView$Adapter0 == null || !recyclerView$Adapter0.hasStableIds()) {
                this.F();
            }
        }

        private void v() {
            if(this.g != null && (RecyclerView.this.mAdapter != null && RecyclerView.this.isAttachedToWindow())) {
                this.g.b(RecyclerView.this.mAdapter);
            }
        }

        void w(int v, int v1) {
            int v2 = this.c.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                ViewHolder recyclerView$ViewHolder0 = (ViewHolder)this.c.get(v3);
                if(recyclerView$ViewHolder0 != null && recyclerView$ViewHolder0.mPosition >= v) {
                    if(RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + v3 + " holder " + recyclerView$ViewHolder0 + " now at position " + (recyclerView$ViewHolder0.mPosition + v1));
                    }
                    recyclerView$ViewHolder0.offsetPosition(v1, false);
                }
            }
        }

        void x(int v, int v1) {
            int v4;
            int v3;
            int v2;
            if(v < v1) {
                v2 = -1;
                v3 = v;
                v4 = v1;
            }
            else {
                v2 = 1;
                v4 = v;
                v3 = v1;
            }
            int v5 = this.c.size();
            for(int v6 = 0; v6 < v5; ++v6) {
                ViewHolder recyclerView$ViewHolder0 = (ViewHolder)this.c.get(v6);
                if(recyclerView$ViewHolder0 != null) {
                    int v7 = recyclerView$ViewHolder0.mPosition;
                    if(v7 >= v3 && v7 <= v4) {
                        if(v7 == v) {
                            recyclerView$ViewHolder0.offsetPosition(v1 - v, false);
                        }
                        else {
                            recyclerView$ViewHolder0.offsetPosition(v2, false);
                        }
                        if(RecyclerView.sVerboseLoggingEnabled) {
                            Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + v6 + " holder " + recyclerView$ViewHolder0);
                        }
                    }
                }
            }
        }

        void y(int v, int v1, boolean z) {
            for(int v2 = this.c.size() - 1; v2 >= 0; --v2) {
                ViewHolder recyclerView$ViewHolder0 = (ViewHolder)this.c.get(v2);
                if(recyclerView$ViewHolder0 != null) {
                    int v3 = recyclerView$ViewHolder0.mPosition;
                    if(v3 >= v + v1) {
                        if(RecyclerView.sVerboseLoggingEnabled) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + v2 + " holder " + recyclerView$ViewHolder0 + " now at position " + (recyclerView$ViewHolder0.mPosition - v1));
                        }
                        recyclerView$ViewHolder0.offsetPosition(-v1, z);
                    }
                    else if(v3 >= v) {
                        recyclerView$ViewHolder0.addFlags(8);
                        this.G(v2);
                    }
                }
            }
        }

        void z(Adapter recyclerView$Adapter0, Adapter recyclerView$Adapter1, boolean z) {
            this.d();
            this.D(recyclerView$Adapter0, true);
            this.j().k(recyclerView$Adapter0, recyclerView$Adapter1, z);
            this.v();
        }
    }

    public interface RecyclerListener {
        void a(@NonNull ViewHolder arg1);
    }

    class RecyclerViewDataObserver extends AdapterDataObserver {
        final RecyclerView a;

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public void f() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView.this.mState.g = true;
            RecyclerView.this.processDataSetCompletelyChanged(true);
            if(!RecyclerView.this.mAdapterHelper.q()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public void h(int v, int v1, Object object0) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if(RecyclerView.this.mAdapterHelper.s(v, v1, object0)) {
                this.n();
            }
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public void i(int v, int v1) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if(RecyclerView.this.mAdapterHelper.t(v, v1)) {
                this.n();
            }
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public void k(int v, int v1, int v2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if(RecyclerView.this.mAdapterHelper.u(v, v1, v2)) {
                this.n();
            }
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public void l(int v, int v1) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if(RecyclerView.this.mAdapterHelper.v(v, v1)) {
                this.n();
            }
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public void m() {
            RecyclerView recyclerView0 = RecyclerView.this;
            if(recyclerView0.mPendingSavedState == null) {
                return;
            }
            if(recyclerView0.mAdapter != null && recyclerView0.mAdapter.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        void n() {
            RecyclerView recyclerView0 = RecyclerView.this;
            if(recyclerView0.mHasFixedSize && recyclerView0.mIsAttached) {
                ViewCompat.x1(recyclerView0, recyclerView0.mUpdateChildViewsRunnable);
                return;
            }
            recyclerView0.mAdapterUpdateDuringMeasure = true;
            recyclerView0.requestLayout();
        }
    }

    @RestrictTo({Scope.a})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        Parcelable c;

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
                classLoader0 = LayoutManager.class.getClassLoader();
            }
            this.c = parcel0.readParcelable(classLoader0);
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        void c(SavedState recyclerView$SavedState0) {
            this.c = recyclerView$SavedState0.c;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeParcelable(this.c, 0);
        }
    }

    public static class SimpleOnItemTouchListener implements OnItemTouchListener {
        @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
        public void h(@NonNull RecyclerView recyclerView0, @NonNull MotionEvent motionEvent0) {
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
        public boolean i(@NonNull RecyclerView recyclerView0, @NonNull MotionEvent motionEvent0) {
            return false;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
        public void j(boolean z) {
        }
    }

    public static abstract class SmoothScroller {
        public static class Action {
            private int a;
            private int b;
            private int c;
            private int d;
            private Interpolator e;
            private boolean f;
            private int g;
            public static final int h = 0x80000000;

            public Action(@Px int v, @Px int v1) {
                this(v, v1, 0x80000000, null);
            }

            public Action(@Px int v, @Px int v1, int v2) {
                this(v, v1, v2, null);
            }

            public Action(@Px int v, @Px int v1, int v2, @Nullable Interpolator interpolator0) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = v;
                this.b = v1;
                this.c = v2;
                this.e = interpolator0;
            }

            public int a() {
                return this.c;
            }

            @Px
            public int b() {
                return this.a;
            }

            @Px
            public int c() {
                return this.b;
            }

            @Nullable
            public Interpolator d() {
                return this.e;
            }

            boolean e() {
                return this.d >= 0;
            }

            public void f(int v) {
                this.d = v;
            }

            void g(RecyclerView recyclerView0) {
                int v = this.d;
                if(v >= 0) {
                    this.d = -1;
                    recyclerView0.jumpToPositionForSmoothScroller(v);
                    this.f = false;
                    return;
                }
                if(this.f) {
                    this.m();
                    recyclerView0.mViewFlinger.e(this.a, this.b, this.c, this.e);
                    int v1 = this.g + 1;
                    this.g = v1;
                    if(v1 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                    return;
                }
                this.g = 0;
            }

            public void h(int v) {
                this.f = true;
                this.c = v;
            }

            public void i(@Px int v) {
                this.f = true;
                this.a = v;
            }

            public void j(@Px int v) {
                this.f = true;
                this.b = v;
            }

            public void k(@Nullable Interpolator interpolator0) {
                this.f = true;
                this.e = interpolator0;
            }

            public void l(@Px int v, @Px int v1, int v2, @Nullable Interpolator interpolator0) {
                this.a = v;
                this.b = v1;
                this.c = v2;
                this.e = interpolator0;
                this.f = true;
            }

            private void m() {
                if(this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if(this.c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }

        public interface ScrollVectorProvider {
            @Nullable
            PointF g(int arg1);
        }

        private int a;
        private RecyclerView b;
        private LayoutManager c;
        private boolean d;
        private boolean e;
        private View f;
        private final Action g;
        private boolean h;

        public SmoothScroller() {
            this.a = -1;
            this.g = new Action(0, 0);
        }

        @Nullable
        public PointF a(int v) {
            LayoutManager recyclerView$LayoutManager0 = this.e();
            if(recyclerView$LayoutManager0 instanceof ScrollVectorProvider) {
                return ((ScrollVectorProvider)recyclerView$LayoutManager0).g(v);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + ScrollVectorProvider.class.getCanonicalName());
            return null;
        }

        public View b(int v) {
            return this.b.mLayout.c0(v);
        }

        public int c() {
            return this.b.mLayout.j0();
        }

        public int d(View view0) {
            return this.b.getChildLayoutPosition(view0);
        }

        @Nullable
        public LayoutManager e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        @Deprecated
        public void g(int v) {
            this.b.scrollToPosition(v);
        }

        public boolean h() {
            return this.d;
        }

        public boolean i() {
            return this.e;
        }

        protected void j(@NonNull PointF pointF0) {
            float f = (float)Math.sqrt(pointF0.x * pointF0.x + pointF0.y * pointF0.y);
            pointF0.x /= f;
            pointF0.y /= f;
        }

        void k(int v, int v1) {
            RecyclerView recyclerView0 = this.b;
            if(this.a == -1 || recyclerView0 == null) {
                this.s();
            }
            if(this.d && this.f == null && this.c != null) {
                PointF pointF0 = this.a(this.a);
                if(pointF0 != null) {
                    float f = pointF0.x;
                    if(f != 0.0f || pointF0.y != 0.0f) {
                        recyclerView0.scrollStep(((int)Math.signum(f)), ((int)Math.signum(pointF0.y)), null);
                    }
                }
            }
            this.d = false;
            View view0 = this.f;
            if(view0 != null) {
                if(this.d(view0) == this.a) {
                    this.p(this.f, recyclerView0.mState, this.g);
                    this.g.g(recyclerView0);
                    this.s();
                }
                else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if(this.e) {
                this.m(v, v1, recyclerView0.mState, this.g);
                boolean z = this.g.e();
                this.g.g(recyclerView0);
                if(z && this.e) {
                    this.d = true;
                    recyclerView0.mViewFlinger.d();
                }
            }
        }

        protected void l(View view0) {
            if(this.d(view0) == this.f()) {
                this.f = view0;
                if(RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        protected abstract void m(@Px int arg1, @Px int arg2, @NonNull State arg3, @NonNull Action arg4);

        protected abstract void n();

        protected abstract void o();

        protected abstract void p(@NonNull View arg1, @NonNull State arg2, @NonNull Action arg3);

        public void q(int v) {
            this.a = v;
        }

        void r(RecyclerView recyclerView0, LayoutManager recyclerView$LayoutManager0) {
            recyclerView0.mViewFlinger.f();
            if(this.h) {
                Log.w("RecyclerView", "An instance of " + this.getClass().getSimpleName() + " was started more than once. Each instance of" + this.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.b = recyclerView0;
            this.c = recyclerView$LayoutManager0;
            int v = this.a;
            if(v == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView0.mState.a = v;
            this.e = true;
            this.d = true;
            this.f = this.b(this.f());
            this.n();
            this.b.mViewFlinger.d();
            this.h = true;
        }

        protected final void s() {
            if(!this.e) {
                return;
            }
            this.e = false;
            this.o();
            this.b.mState.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            this.c.P1(this);
            this.c = null;
            this.b = null;
        }
    }

    public static class State {
        int a;
        private SparseArray b;
        int c;
        int d;
        int e;
        int f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        int m;
        long n;
        int o;
        int p;
        int q;
        static final int r = 1;
        static final int s = 2;
        static final int t = 4;

        public State() {
            this.a = -1;
            this.c = 0;
            this.d = 0;
            this.e = 1;
            this.f = 0;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
        }

        void a(int v) {
            if((this.e & v) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(v) + " but it is " + Integer.toBinaryString(this.e));
            }
        }

        public boolean b() {
            return this.g;
        }

        public Object c(int v) {
            return this.b == null ? null : this.b.get(v);
        }

        // 去混淆评级： 低(20)
        public int d() {
            return this.h ? this.c - this.d : this.f;
        }

        public int e() {
            return this.p;
        }

        public int f() {
            return this.q;
        }

        public int g() {
            return this.a;
        }

        public boolean h() {
            return this.a != -1;
        }

        public boolean i() {
            return this.j;
        }

        public boolean j() {
            return this.h;
        }

        void k(Adapter recyclerView$Adapter0) {
            this.e = 1;
            this.f = recyclerView$Adapter0.getItemCount();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void l(int v, Object object0) {
            if(this.b == null) {
                this.b = new SparseArray();
            }
            this.b.put(v, object0);
        }

        public void m(int v) {
            SparseArray sparseArray0 = this.b;
            if(sparseArray0 == null) {
                return;
            }
            sparseArray0.remove(v);
        }

        public boolean n() {
            return this.l;
        }

        public boolean o() {
            return this.k;
        }

        @Override
        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.b + ", mItemCount=" + this.f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    static class StretchEdgeEffectFactory extends EdgeEffectFactory {
        @Override  // androidx.recyclerview.widget.RecyclerView$EdgeEffectFactory
        @NonNull
        protected EdgeEffect a(@NonNull RecyclerView recyclerView0, int v) {
            return new EdgeEffect(recyclerView0.getContext());
        }
    }

    public static abstract class ViewCacheExtension {
        @Nullable
        public abstract View a(@NonNull Recycler arg1, int arg2, int arg3);
    }

    class ViewFlinger implements Runnable {
        private int a;
        private int b;
        OverScroller c;
        Interpolator d;
        private boolean e;
        private boolean f;
        final RecyclerView g;

        ViewFlinger() {
            this.d = RecyclerView.sQuinticInterpolator;
            this.e = false;
            this.f = false;
            this.c = new OverScroller(recyclerView0.getContext(), RecyclerView.sQuinticInterpolator);
        }

        private int a(int v, int v1) {
            int v2 = Math.abs(v);
            int v3 = Math.abs(v1);
            boolean z = v2 > v3;
            int v4 = z ? RecyclerView.this.getWidth() : RecyclerView.this.getHeight();
            if(!z) {
                v2 = v3;
            }
            return Math.min(((int)((((float)v2) / ((float)v4) + 1.0f) * 300.0f)), 2000);
        }

        public void b(int v, int v1) {
            RecyclerView.this.setScrollState(2);
            this.b = 0;
            this.a = 0;
            Interpolator interpolator0 = RecyclerView.sQuinticInterpolator;
            if(this.d != interpolator0) {
                this.d = interpolator0;
                this.c = new OverScroller(RecyclerView.this.getContext(), interpolator0);
            }
            this.c.fling(0, 0, v, v1, 0x80000000, 0x7FFFFFFF, 0x80000000, 0x7FFFFFFF);
            this.d();
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            ViewCompat.x1(RecyclerView.this, this);
        }

        void d() {
            if(this.e) {
                this.f = true;
                return;
            }
            this.c();
        }

        public void e(int v, int v1, int v2, @Nullable Interpolator interpolator0) {
            if(v2 == 0x80000000) {
                v2 = this.a(v, v1);
            }
            if(interpolator0 == null) {
                interpolator0 = RecyclerView.sQuinticInterpolator;
            }
            if(this.d != interpolator0) {
                this.d = interpolator0;
                this.c = new OverScroller(RecyclerView.this.getContext(), interpolator0);
            }
            this.b = 0;
            this.a = 0;
            RecyclerView.this.setScrollState(2);
            this.c.startScroll(0, 0, v, v1, v2);
            if(Build.VERSION.SDK_INT < 23) {
                this.c.computeScrollOffset();
            }
            this.d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.c.abortAnimation();
        }

        @Override
        public void run() {
            int v12;
            int v7;
            int v6;
            RecyclerView recyclerView0 = RecyclerView.this;
            if(recyclerView0.mLayout == null) {
                this.f();
                return;
            }
            this.f = false;
            this.e = true;
            recyclerView0.consumePendingUpdateOperations();
            OverScroller overScroller0 = this.c;
            if(overScroller0.computeScrollOffset()) {
                int v = overScroller0.getCurrX();
                int v1 = overScroller0.getCurrY();
                int v2 = v - this.a;
                int v3 = v1 - this.b;
                this.a = v;
                this.b = v1;
                int v4 = RecyclerView.this.consumeFlingInHorizontalStretch(v2);
                int v5 = RecyclerView.this.consumeFlingInVerticalStretch(v3);
                RecyclerView.this.mReusableIntPair[0] = 0;
                RecyclerView.this.mReusableIntPair[1] = 0;
                if(RecyclerView.this.dispatchNestedPreScroll(v4, v5, RecyclerView.this.mReusableIntPair, null, 1)) {
                    v4 -= RecyclerView.this.mReusableIntPair[0];
                    v5 -= RecyclerView.this.mReusableIntPair[1];
                }
                if(RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(v4, v5);
                }
                RecyclerView recyclerView1 = RecyclerView.this;
                if(recyclerView1.mAdapter == null) {
                    v7 = 0;
                    v6 = 0;
                }
                else {
                    recyclerView1.mReusableIntPair[0] = 0;
                    recyclerView1.mReusableIntPair[1] = 0;
                    recyclerView1.scrollStep(v4, v5, recyclerView1.mReusableIntPair);
                    v6 = RecyclerView.this.mReusableIntPair[0];
                    v7 = RecyclerView.this.mReusableIntPair[1];
                    v4 -= v6;
                    v5 -= v7;
                    SmoothScroller recyclerView$SmoothScroller0 = RecyclerView.this.mLayout.g;
                    if(recyclerView$SmoothScroller0 != null && !recyclerView$SmoothScroller0.h() && recyclerView$SmoothScroller0.i()) {
                        int v8 = RecyclerView.this.mState.d();
                        if(v8 == 0) {
                            recyclerView$SmoothScroller0.s();
                        }
                        else {
                            if(recyclerView$SmoothScroller0.f() >= v8) {
                                recyclerView$SmoothScroller0.q(v8 - 1);
                            }
                            recyclerView$SmoothScroller0.k(v6, v7);
                        }
                    }
                }
                if(!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView.this.mReusableIntPair[0] = 0;
                RecyclerView.this.mReusableIntPair[1] = 0;
                RecyclerView.this.dispatchNestedScroll(v6, v7, v4, v5, null, 1, RecyclerView.this.mReusableIntPair);
                RecyclerView recyclerView2 = RecyclerView.this;
                int v9 = v4 - recyclerView2.mReusableIntPair[0];
                int v10 = v5 - recyclerView2.mReusableIntPair[1];
                if(v6 != 0 || v7 != 0) {
                    recyclerView2.dispatchOnScrolled(v6, v7);
                }
                if(!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller0.getCurrX() == overScroller0.getFinalX();
                boolean z1 = overScroller0.getCurrY() == overScroller0.getFinalY();
                boolean z2 = overScroller0.isFinished() || (z || v9 != 0) && (z1 || v10 != 0);
                SmoothScroller recyclerView$SmoothScroller1 = RecyclerView.this.mLayout.g;
                if(recyclerView$SmoothScroller1 != null && recyclerView$SmoothScroller1.h() || !z2) {
                    this.d();
                    RecyclerView recyclerView3 = RecyclerView.this;
                    GapWorker gapWorker0 = recyclerView3.mGapWorker;
                    if(gapWorker0 != null) {
                        gapWorker0.f(recyclerView3, v6, v7);
                    }
                }
                else {
                    if(RecyclerView.this.getOverScrollMode() != 2) {
                        int v11 = (int)overScroller0.getCurrVelocity();
                        if(v9 < 0) {
                            v12 = -v11;
                        }
                        else {
                            v12 = v9 <= 0 ? 0 : v11;
                        }
                        if(v10 < 0) {
                            v11 = -v11;
                        }
                        else if(v10 <= 0) {
                            v11 = 0;
                        }
                        RecyclerView.this.absorbGlows(v12, v11);
                    }
                    if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.b();
                    }
                }
                if(Build.VERSION.SDK_INT >= 35) {
                    float f = Math.abs(overScroller0.getCurrVelocity());
                    Api35Impl.a(RecyclerView.this, f);
                }
            }
            SmoothScroller recyclerView$SmoothScroller2 = RecyclerView.this.mLayout.g;
            if(recyclerView$SmoothScroller2 != null && recyclerView$SmoothScroller2.h()) {
                recyclerView$SmoothScroller2.k(0, 0);
            }
            this.e = false;
            if(this.f) {
                this.c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 0x400;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 0x200;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 0x1000;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 0x2000;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 0x80;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 0x800;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 0x20;
        static final int FLAG_TMP_DETACHED = 0x100;
        static final int FLAG_UPDATE = 2;
        private static final List FULLUPDATE_PAYLOADS = null;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        @NonNull
        public final View itemView;
        Adapter mBindingAdapter;
        int mFlags;
        boolean mInChangeScrap;
        private int mIsRecyclableCount;
        long mItemId;
        int mItemViewType;
        WeakReference mNestedRecyclerView;
        int mOldPosition;
        RecyclerView mOwnerRecyclerView;
        List mPayloads;
        @VisibleForTesting
        int mPendingAccessibilityState;
        int mPosition;
        int mPreLayoutPosition;
        Recycler mScrapContainer;
        ViewHolder mShadowedHolder;
        ViewHolder mShadowingHolder;
        List mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        static {
            ViewHolder.FULLUPDATE_PAYLOADS = Collections.emptyList();
        }

        public ViewHolder(@NonNull View view0) {
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mItemViewType = -1;
            this.mPreLayoutPosition = -1;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            this.mPayloads = null;
            this.mUnmodifiedPayloads = null;
            this.mIsRecyclableCount = 0;
            this.mScrapContainer = null;
            this.mInChangeScrap = false;
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            if(view0 == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view0;
        }

        void addChangePayload(Object object0) {
            if(object0 == null) {
                this.addFlags(0x400);
                return;
            }
            if((0x400 & this.mFlags) == 0) {
                this.d();
                this.mPayloads.add(object0);
            }
        }

        void addFlags(int v) {
            this.mFlags |= v;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List list0 = this.mPayloads;
            if(list0 != null) {
                list0.clear();
            }
            this.mFlags &= 0xFFFFFBFF;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= 0xFFFFFEFF;
        }

        private void d() {
            if(this.mPayloads == null) {
                ArrayList arrayList0 = new ArrayList();
                this.mPayloads = arrayList0;
                this.mUnmodifiedPayloads = DesugarCollections.unmodifiableList(arrayList0);
            }
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.R0(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int v, int v1, boolean z) {
            this.addFlags(8);
            this.offsetPosition(v1, z);
            this.mPosition = v;
        }

        public final int getAbsoluteAdapterPosition() {
            return this.mOwnerRecyclerView == null ? -1 : this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return this.getBindingAdapterPosition();
        }

        @Nullable
        public final Adapter getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            if(this.mBindingAdapter == null) {
                return -1;
            }
            RecyclerView recyclerView0 = this.mOwnerRecyclerView;
            if(recyclerView0 == null) {
                return -1;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(recyclerView$Adapter0 == null) {
                return -1;
            }
            int v = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this);
            return v == -1 ? -1 : recyclerView$Adapter0.findRelativeAdapterPositionIn(this.mBindingAdapter, this, v);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            return this.mPreLayoutPosition == -1 ? this.mPosition : this.mPreLayoutPosition;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            return this.mPreLayoutPosition == -1 ? this.mPosition : this.mPreLayoutPosition;
        }

        List getUnmodifiedPayloads() {
            return (this.mFlags & 0x400) != 0 || (this.mPayloads == null || this.mPayloads.size() == 0) ? ViewHolder.FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int v) {
            return (v & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 0x200) != 0 || this.isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !ViewCompat.R0(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 0x100) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int v, boolean z) {
            if(this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if(this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if(z) {
                this.mPreLayoutPosition += v;
            }
            this.mPosition += v;
            if(this.itemView.getLayoutParams() != null) {
                ((LayoutParams)this.itemView.getLayoutParams()).c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView0) {
            int v = this.mPendingAccessibilityState;
            this.mWasImportantForAccessibilityBeforeHidden = v == -1 ? this.itemView.getImportantForAccessibility() : v;
            recyclerView0.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView0) {
            recyclerView0.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            if(RecyclerView.sDebugAssertionsEnabled && this.isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            this.clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if(this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int v, int v1) {
            this.mFlags = v & v1 | this.mFlags & ~v1;
        }

        public final void setIsRecyclable(boolean z) {
            int v = z ? this.mIsRecyclableCount - 1 : this.mIsRecyclableCount + 1;
            this.mIsRecyclableCount = v;
            if(v < 0) {
                this.mIsRecyclableCount = 0;
                if(RecyclerView.sDebugAssertionsEnabled) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            else if(!z && v == 1) {
                this.mFlags |= 16;
            }
            else if(z && v == 0) {
                this.mFlags &= -17;
            }
            if(RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
            }
        }

        void setScrapContainer(Recycler recyclerView$Recycler0, boolean z) {
            this.mScrapContainer = recyclerView$Recycler0;
            this.mInChangeScrap = z;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & 0x80) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= 0xFFFFFF7F;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder((this.getClass().isAnonymousClass() ? "ViewHolder" : this.getClass().getSimpleName()) + "{" + Integer.toHexString(this.hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if(this.isScrap()) {
                stringBuilder0.append(" scrap ");
                stringBuilder0.append((this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]"));
            }
            if(this.isInvalid()) {
                stringBuilder0.append(" invalid");
            }
            if(!this.isBound()) {
                stringBuilder0.append(" unbound");
            }
            if(this.needsUpdate()) {
                stringBuilder0.append(" update");
            }
            if(this.isRemoved()) {
                stringBuilder0.append(" removed");
            }
            if(this.shouldIgnore()) {
                stringBuilder0.append(" ignored");
            }
            if(this.isTmpDetached()) {
                stringBuilder0.append(" tmpDetached");
            }
            if(!this.isRecyclable()) {
                stringBuilder0.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if(this.isAdapterPositionUnknown()) {
                stringBuilder0.append(" undefined adapter position");
            }
            if(this.itemView.getParent() == null) {
                stringBuilder0.append(" no parent");
            }
            stringBuilder0.append("}");
            return stringBuilder0.toString();
        }

        void unScrap() {
            this.mScrapContainer.P(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 0x20) != 0;
        }
    }

    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = false;
    static final boolean ALLOW_THREAD_GAP_WORK = false;
    private static final float DECELERATION_RATE = 0.0f;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final long FOREVER_NS = 0x7FFFFFFFFFFFFFFFL;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = null;
    static final String LOW_RES_ROTARY_ENCODER_FEATURE = "android.hardware.rotaryencoder.lowres";
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = null;
    public static final long NO_ID = -1L;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = 0x80000000;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    AdapterHelper mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    ChildHelper mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    @VisibleForTesting
    DifferentialMotionFlingController mDifferentialMotionFlingController;
    private final DifferentialMotionFlingTarget mDifferentialMotionFlingTarget;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    @NonNull
    private EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;
    @VisibleForTesting
    boolean mFirstLayoutComplete;
    GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private OnItemTouchListener mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    @VisibleForTesting
    LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    @VisibleForTesting
    boolean mLowResRotaryEncoderFeature;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final RecyclerViewDataObserver mObserver;
    private List mOnChildAttachStateListeners;
    private OnFlingListener mOnFlingListener;
    private final ArrayList mOnItemTouchListeners;
    @VisibleForTesting
    final List mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final Recycler mRecycler;
    RecyclerListener mRecyclerListener;
    final List mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    float mScaledHorizontalScrollFactor;
    float mScaledVerticalScrollFactor;
    private OnScrollListener mScrollListener;
    private List mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private NestedScrollingChildHelper mScrollingChildHelper;
    final State mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final ViewFlinger mViewFlinger;
    private final ProcessCallback mViewInfoProcessCallback;
    final ViewInfoStore mViewInfoStore;
    static boolean sDebugAssertionsEnabled = false;
    static final StretchEdgeEffectFactory sDefaultEdgeEffectFactory = null;
    static final Interpolator sQuinticInterpolator = null;
    static boolean sVerboseLoggingEnabled = false;

    static {
        RecyclerView.NESTED_SCROLLING_ATTRS = new int[]{0x1010436};
        RecyclerView.DECELERATION_RATE = 2.358202f;
        RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST = false;
        RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC = Build.VERSION.SDK_INT >= 23;
        RecyclerView.ALLOW_THREAD_GAP_WORK = true;
        RecyclerView.LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        RecyclerView.sQuinticInterpolator = new Interpolator() {
            @Override  // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) + 1.0f;
            }
        };
        RecyclerView.sDefaultEdgeEffectFactory = new StretchEdgeEffectFactory();
    }

    public RecyclerView(@NonNull Context context0) {
        this(context0, null);
    }

    public RecyclerView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.recyclerViewStyle);
    }

    public RecyclerView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.mObserver = new RecyclerViewDataObserver(this);
        this.mRecycler = new Recycler(this);
        this.mViewInfoStore = new ViewInfoStore();
        this.mUpdateChildViewsRunnable = new Runnable() {
            final RecyclerView a;

            @Override
            public void run() {
                if(RecyclerView.this.mFirstLayoutComplete && !RecyclerView.this.isLayoutRequested()) {
                    RecyclerView recyclerView0 = RecyclerView.this;
                    if(!recyclerView0.mIsAttached) {
                        recyclerView0.requestLayout();
                        return;
                    }
                    if(recyclerView0.mLayoutSuppressed) {
                        recyclerView0.mLayoutWasDefered = true;
                        return;
                    }
                    recyclerView0.consumePendingUpdateOperations();
                }
            }
        };
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList();
        this.mOnItemTouchListeners = new ArrayList();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = RecyclerView.sDefaultEdgeEffectFactory;
        this.mItemAnimator = new DefaultItemAnimator();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = 1.401298E-45f;
        this.mScaledVerticalScrollFactor = 1.401298E-45f;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new ViewFlinger(this);
        this.mPrefetchRegistry = RecyclerView.ALLOW_THREAD_GAP_WORK ? new LayoutPrefetchRegistryImpl() : null;
        this.mState = new State();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new ItemAnimatorRestoreListener(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new Runnable() {
            final RecyclerView a;

            @Override
            public void run() {
                ItemAnimator recyclerView$ItemAnimator0 = RecyclerView.this.mItemAnimator;
                if(recyclerView$ItemAnimator0 != null) {
                    recyclerView$ItemAnimator0.x();
                }
                RecyclerView.this.mPostedAnimatorRunner = false;
            }
        };
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new ProcessCallback() {
            final RecyclerView a;

            @Override  // androidx.recyclerview.widget.ViewInfoStore$ProcessCallback
            public void a(ViewHolder recyclerView$ViewHolder0, ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1) {
                RecyclerView.this.animateAppearance(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0, recyclerView$ItemAnimator$ItemHolderInfo1);
            }

            @Override  // androidx.recyclerview.widget.ViewInfoStore$ProcessCallback
            public void b(ViewHolder recyclerView$ViewHolder0) {
                RecyclerView.this.mLayout.Y1(recyclerView$ViewHolder0.itemView, RecyclerView.this.mRecycler);
            }

            @Override  // androidx.recyclerview.widget.ViewInfoStore$ProcessCallback
            public void c(ViewHolder recyclerView$ViewHolder0, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, @Nullable ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1) {
                RecyclerView.this.mRecycler.P(recyclerView$ViewHolder0);
                RecyclerView.this.animateDisappearance(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0, recyclerView$ItemAnimator$ItemHolderInfo1);
            }

            @Override  // androidx.recyclerview.widget.ViewInfoStore$ProcessCallback
            public void d(ViewHolder recyclerView$ViewHolder0, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1) {
                recyclerView$ViewHolder0.setIsRecyclable(false);
                RecyclerView recyclerView0 = RecyclerView.this;
                if(recyclerView0.mDataSetHasChangedAfterLayout) {
                    if(recyclerView0.mItemAnimator.b(recyclerView$ViewHolder0, recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0, recyclerView$ItemAnimator$ItemHolderInfo1)) {
                        RecyclerView.this.postAnimationRunner();
                    }
                }
                else if(recyclerView0.mItemAnimator.d(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0, recyclerView$ItemAnimator$ItemHolderInfo1)) {
                    RecyclerView.this.postAnimationRunner();
                }
            }
        };
        androidx.recyclerview.widget.RecyclerView.5 recyclerView$50 = new DifferentialMotionFlingTarget() {
            final RecyclerView a;

            @Override  // androidx.core.view.DifferentialMotionFlingTarget
            public float a() {
                if(RecyclerView.this.mLayout.H()) {
                    return -RecyclerView.this.mScaledVerticalScrollFactor;
                }
                return RecyclerView.this.mLayout.G() ? -RecyclerView.this.mScaledHorizontalScrollFactor : 0.0f;
            }

            @Override  // androidx.core.view.DifferentialMotionFlingTarget
            public boolean b(float f) {
                int v1;
                int v;
                if(RecyclerView.this.mLayout.H()) {
                    v = (int)f;
                    v1 = 0;
                }
                else {
                    v1 = RecyclerView.this.mLayout.G() ? ((int)f) : 0;
                    v = 0;
                }
                if(v1 == 0 && v == 0) {
                    return false;
                }
                RecyclerView.this.stopScroll();
                return RecyclerView.this.flingNoThresholdCheck(v1, v);
            }

            @Override  // androidx.core.view.DifferentialMotionFlingTarget
            public void c() {
                RecyclerView.this.stopScroll();
            }
        };
        this.mDifferentialMotionFlingTarget = recyclerView$50;
        this.mDifferentialMotionFlingController = new DifferentialMotionFlingController(this.getContext(), recyclerView$50);
        this.setScrollContainer(true);
        this.setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        this.mTouchSlop = viewConfiguration0.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = ViewConfigurationCompat.f(viewConfiguration0, context0);
        this.mScaledVerticalScrollFactor = ViewConfigurationCompat.k(viewConfiguration0, context0);
        this.mMinFlingVelocity = viewConfiguration0.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration0.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context0.getResources().getDisplayMetrics().density * 51890.199219f;
        this.setWillNotDraw(this.getOverScrollMode() == 2);
        this.mItemAnimator.A(this.mItemAnimatorListener);
        this.initAdapterManager();
        this.w();
        this.v();
        if(this.getImportantForAccessibility() == 0) {
            this.setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.RecyclerView, v, 0);
        ViewCompat.H1(this, context0, styleable.RecyclerView, attributeSet0, typedArray0, v, 0);
        String s = typedArray0.getString(styleable.RecyclerView_layoutManager);
        if(typedArray0.getInt(styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            this.setDescendantFocusability(0x40000);
        }
        this.mClipToPadding = typedArray0.getBoolean(styleable.RecyclerView_android_clipToPadding, true);
        boolean z = typedArray0.getBoolean(styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z;
        if(z) {
            this.initFastScroller(((StateListDrawable)typedArray0.getDrawable(styleable.RecyclerView_fastScrollVerticalThumbDrawable)), typedArray0.getDrawable(styleable.RecyclerView_fastScrollVerticalTrackDrawable), ((StateListDrawable)typedArray0.getDrawable(styleable.RecyclerView_fastScrollHorizontalThumbDrawable)), typedArray0.getDrawable(styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArray0.recycle();
        this.mLowResRotaryEncoderFeature = context0.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        this.f(context0, s, attributeSet0, v, 0);
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, RecyclerView.NESTED_SCROLLING_ATTRS, v, 0);
        ViewCompat.H1(this, context0, RecyclerView.NESTED_SCROLLING_ATTRS, attributeSet0, typedArray1, v, 0);
        boolean z1 = typedArray1.getBoolean(0, true);
        typedArray1.recycle();
        this.setNestedScrollingEnabled(z1);
        PoolingContainer.h(this, true);
    }

    private boolean A() {
        return this.mItemAnimator != null && this.mLayout.C2();
    }

    private void B() {
        if(this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.z();
            if(this.mDispatchItemsChangedEvent) {
                this.mLayout.C1(this);
            }
        }
        if(this.A()) {
            this.mAdapterHelper.x();
        }
        else {
            this.mAdapterHelper.k();
        }
        boolean z = true;
        boolean z1 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((this.mDataSetHasChangedAfterLayout || z1 || this.mLayout.h) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.hasStableIds()));
        State recyclerView$State0 = this.mState;
        if(!recyclerView$State0.k || !z1 || this.mDataSetHasChangedAfterLayout || !this.A()) {
            z = false;
        }
        recyclerView$State0.l = z;
    }

    private void C(float f, float f1, float f2, float f3) {
        int v1;
        int v = 1;
        if(f1 < 0.0f) {
            this.ensureLeftGlow();
            EdgeEffectCompat.j(this.mLeftGlow, -f1 / ((float)this.getWidth()), 1.0f - f2 / ((float)this.getHeight()));
            v1 = 1;
        }
        else if(f1 > 0.0f) {
            this.ensureRightGlow();
            EdgeEffectCompat.j(this.mRightGlow, f1 / ((float)this.getWidth()), f2 / ((float)this.getHeight()));
            v1 = 1;
        }
        else {
            v1 = 0;
        }
        if(f3 < 0.0f) {
            this.ensureTopGlow();
            EdgeEffectCompat.j(this.mTopGlow, -f3 / ((float)this.getHeight()), f / ((float)this.getWidth()));
        }
        else if(f3 > 0.0f) {
            this.ensureBottomGlow();
            EdgeEffectCompat.j(this.mBottomGlow, f3 / ((float)this.getHeight()), 1.0f - f / ((float)this.getWidth()));
        }
        else {
            v = v1;
        }
        if(v != 0 || f1 != 0.0f || f3 != 0.0f) {
            this.postInvalidateOnAnimation();
        }
    }

    private void D() {
        if(this.mPreserveFocusAfterLayout && this.mAdapter != null && this.hasFocus() && this.getDescendantFocusability() != 0x60000 && (this.getDescendantFocusability() != 0x20000 || !this.isFocused())) {
            if(!this.isFocused()) {
                View view0 = this.getFocusedChild();
                if(!this.mChildHelper.n(view0)) {
                    return;
                }
            }
            View view1 = null;
            ViewHolder recyclerView$ViewHolder0 = this.mState.n == -1L || !this.mAdapter.hasStableIds() ? null : this.findViewHolderForItemId(this.mState.n);
            if(recyclerView$ViewHolder0 != null && !this.mChildHelper.n(recyclerView$ViewHolder0.itemView) && recyclerView$ViewHolder0.itemView.hasFocusable()) {
                view1 = recyclerView$ViewHolder0.itemView;
            }
            else if(this.mChildHelper.g() > 0) {
                view1 = this.o();
            }
            if(view1 != null) {
                int v = this.mState.o;
                if(((long)v) != -1L) {
                    View view2 = view1.findViewById(v);
                    if(view2 != null && view2.isFocusable()) {
                        view1 = view2;
                    }
                }
                view1.requestFocus();
            }
        }
    }

    private void E() {
        boolean z;
        EdgeEffect edgeEffect0 = this.mLeftGlow;
        if(edgeEffect0 == null) {
            z = false;
        }
        else {
            edgeEffect0.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect1 = this.mTopGlow;
        if(edgeEffect1 != null) {
            edgeEffect1.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if(edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mBottomGlow;
        if(edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if(z) {
            this.postInvalidateOnAnimation();
        }
    }

    private int F(int v, float f) {
        float f1 = f / ((float)this.getHeight());
        float f2 = ((float)v) / ((float)this.getWidth());
        float f3 = 0.0f;
        if(this.mLeftGlow != null && EdgeEffectCompat.d(this.mLeftGlow) != 0.0f) {
            if(this.canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            }
            else {
                float f4 = EdgeEffectCompat.j(this.mLeftGlow, -f2, 1.0f - f1);
                if(EdgeEffectCompat.d(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f3 = -f4;
            }
            this.invalidate();
            return Math.round(f3 * ((float)this.getWidth()));
        }
        if(this.mRightGlow != null && EdgeEffectCompat.d(this.mRightGlow) != 0.0f) {
            if(this.canScrollHorizontally(1)) {
                this.mRightGlow.onRelease();
            }
            else {
                float f5 = EdgeEffectCompat.j(this.mRightGlow, f2, f1);
                if(EdgeEffectCompat.d(this.mRightGlow) == 0.0f) {
                    this.mRightGlow.onRelease();
                }
                f3 = f5;
            }
            this.invalidate();
        }
        return Math.round(f3 * ((float)this.getWidth()));
    }

    private int G(int v, float f) {
        float f1 = f / ((float)this.getWidth());
        float f2 = ((float)v) / ((float)this.getHeight());
        float f3 = 0.0f;
        if(this.mTopGlow != null && EdgeEffectCompat.d(this.mTopGlow) != 0.0f) {
            if(this.canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            }
            else {
                float f4 = EdgeEffectCompat.j(this.mTopGlow, -f2, f1);
                if(EdgeEffectCompat.d(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f3 = -f4;
            }
            this.invalidate();
            return Math.round(f3 * ((float)this.getHeight()));
        }
        if(this.mBottomGlow != null && EdgeEffectCompat.d(this.mBottomGlow) != 0.0f) {
            if(this.canScrollVertically(1)) {
                this.mBottomGlow.onRelease();
            }
            else {
                float f5 = EdgeEffectCompat.j(this.mBottomGlow, f2, 1.0f - f1);
                if(EdgeEffectCompat.d(this.mBottomGlow) == 0.0f) {
                    this.mBottomGlow.onRelease();
                }
                f3 = f5;
            }
            this.invalidate();
        }
        return Math.round(f3 * ((float)this.getHeight()));
    }

    private void H(@NonNull View view0, @Nullable View view1) {
        View view2 = view1 == null ? view0 : view1;
        int v = view2.getWidth();
        int v1 = view2.getHeight();
        this.mTempRect.set(0, 0, v, v1);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view2.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof LayoutParams && !((LayoutParams)viewGroup$LayoutParams0).c) {
            this.mTempRect.left -= ((LayoutParams)viewGroup$LayoutParams0).b.left;
            this.mTempRect.right += ((LayoutParams)viewGroup$LayoutParams0).b.right;
            this.mTempRect.top -= ((LayoutParams)viewGroup$LayoutParams0).b.top;
            this.mTempRect.bottom += ((LayoutParams)viewGroup$LayoutParams0).b.bottom;
        }
        if(view1 != null) {
            this.offsetDescendantRectToMyCoords(view1, this.mTempRect);
            this.offsetRectIntoDescendantCoords(view0, this.mTempRect);
        }
        this.mLayout.f2(this, view0, this.mTempRect, !this.mFirstLayoutComplete, view1 == null);
    }

    private void I() {
        this.mState.n = -1L;
        this.mState.m = -1;
        this.mState.o = -1;
    }

    private void J() {
        VelocityTracker velocityTracker0 = this.mVelocityTracker;
        if(velocityTracker0 != null) {
            velocityTracker0.clear();
        }
        this.stopNestedScroll(0);
        this.E();
    }

    private void K() {
        int v;
        ViewHolder recyclerView$ViewHolder0 = null;
        View view0 = !this.mPreserveFocusAfterLayout || !this.hasFocus() || this.mAdapter == null ? null : this.getFocusedChild();
        if(view0 != null) {
            recyclerView$ViewHolder0 = this.findContainingViewHolder(view0);
        }
        if(recyclerView$ViewHolder0 == null) {
            this.I();
            return;
        }
        this.mState.n = this.mAdapter.hasStableIds() ? recyclerView$ViewHolder0.getItemId() : -1L;
        State recyclerView$State0 = this.mState;
        if(this.mDataSetHasChangedAfterLayout) {
            v = -1;
        }
        else {
            v = recyclerView$ViewHolder0.isRemoved() ? recyclerView$ViewHolder0.mOldPosition : recyclerView$ViewHolder0.getAbsoluteAdapterPosition();
        }
        recyclerView$State0.m = v;
        this.mState.o = this.q(recyclerView$ViewHolder0.itemView);
    }

    private void L(@Nullable Adapter recyclerView$Adapter0, boolean z, boolean z1) {
        Adapter recyclerView$Adapter1 = this.mAdapter;
        if(recyclerView$Adapter1 != null) {
            recyclerView$Adapter1.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if(!z || z1) {
            this.removeAndRecycleViews();
        }
        this.mAdapterHelper.z();
        Adapter recyclerView$Adapter2 = this.mAdapter;
        this.mAdapter = recyclerView$Adapter0;
        if(recyclerView$Adapter0 != null) {
            recyclerView$Adapter0.registerAdapterDataObserver(this.mObserver);
            recyclerView$Adapter0.onAttachedToRecyclerView(this);
        }
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.o1(recyclerView$Adapter2, this.mAdapter);
        }
        this.mRecycler.z(recyclerView$Adapter2, this.mAdapter, z);
        this.mState.g = true;
    }

    private boolean M(@NonNull EdgeEffect edgeEffect0, int v, int v1) {
        return v <= 0 ? this.s(-v) < EdgeEffectCompat.d(edgeEffect0) * ((float)v1) : true;
    }

    private void N(int v) {
        boolean z = this.mLayout.G();
        if(this.mLayout.H()) {
            z |= 2;
        }
        this.startNestedScroll(((int)z), v);
    }

    private boolean O(MotionEvent motionEvent0) {
        boolean z;
        if(this.mLeftGlow == null || EdgeEffectCompat.d(this.mLeftGlow) == 0.0f || this.canScrollHorizontally(-1)) {
            z = false;
        }
        else {
            EdgeEffectCompat.j(this.mLeftGlow, 0.0f, 1.0f - motionEvent0.getY() / ((float)this.getHeight()));
            z = true;
        }
        if(this.mRightGlow != null && EdgeEffectCompat.d(this.mRightGlow) != 0.0f && !this.canScrollHorizontally(1)) {
            EdgeEffectCompat.j(this.mRightGlow, 0.0f, motionEvent0.getY() / ((float)this.getHeight()));
            z = true;
        }
        if(this.mTopGlow != null && EdgeEffectCompat.d(this.mTopGlow) != 0.0f && !this.canScrollVertically(-1)) {
            EdgeEffectCompat.j(this.mTopGlow, 0.0f, motionEvent0.getX() / ((float)this.getWidth()));
            z = true;
        }
        if(this.mBottomGlow != null && EdgeEffectCompat.d(this.mBottomGlow) != 0.0f && !this.canScrollVertically(1)) {
            EdgeEffectCompat.j(this.mBottomGlow, 0.0f, 1.0f - motionEvent0.getX() / ((float)this.getWidth()));
            return true;
        }
        return z;
    }

    private void P() {
        this.mViewFlinger.f();
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.B2();
        }
    }

    void absorbGlows(int v, int v1) {
        if(v < 0) {
            this.ensureLeftGlow();
            if(this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-v);
            }
        }
        else if(v > 0) {
            this.ensureRightGlow();
            if(this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(v);
            }
        }
        if(v1 < 0) {
            this.ensureTopGlow();
            if(this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-v1);
            }
        }
        else if(v1 > 0) {
            this.ensureBottomGlow();
            if(this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(v1);
            }
        }
        if(v != 0 || v1 != 0) {
            this.postInvalidateOnAnimation();
        }
    }

    @Override  // android.view.ViewGroup
    public void addFocusables(ArrayList arrayList0, int v, int v1) {
        super.addFocusables(arrayList0, v, v1);
    }

    public void addItemDecoration(@NonNull ItemDecoration recyclerView$ItemDecoration0) {
        this.addItemDecoration(recyclerView$ItemDecoration0, -1);
    }

    public void addItemDecoration(@NonNull ItemDecoration recyclerView$ItemDecoration0, int v) {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.B("Cannot add item decoration during a scroll  or layout");
        }
        if(this.mItemDecorations.isEmpty()) {
            this.setWillNotDraw(false);
        }
        if(v < 0) {
            this.mItemDecorations.add(recyclerView$ItemDecoration0);
        }
        else {
            this.mItemDecorations.add(v, recyclerView$ItemDecoration0);
        }
        this.markItemDecorInsetsDirty();
        this.requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener recyclerView$OnChildAttachStateChangeListener0) {
        if(this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(recyclerView$OnChildAttachStateChangeListener0);
    }

    public void addOnItemTouchListener(@NonNull OnItemTouchListener recyclerView$OnItemTouchListener0) {
        this.mOnItemTouchListeners.add(recyclerView$OnItemTouchListener0);
    }

    public void addOnScrollListener(@NonNull OnScrollListener recyclerView$OnScrollListener0) {
        if(this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(recyclerView$OnScrollListener0);
    }

    public void addRecyclerListener(@NonNull RecyclerListener recyclerView$RecyclerListener0) {
        Preconditions.b(recyclerView$RecyclerListener0 != null, "\'listener\' arg cannot be null.");
        this.mRecyclerListeners.add(recyclerView$RecyclerListener0);
    }

    void animateAppearance(@NonNull ViewHolder recyclerView$ViewHolder0, @Nullable ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1) {
        recyclerView$ViewHolder0.setIsRecyclable(false);
        if(this.mItemAnimator.a(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0, recyclerView$ItemAnimator$ItemHolderInfo1)) {
            this.postAnimationRunner();
        }
    }

    void animateDisappearance(@NonNull ViewHolder recyclerView$ViewHolder0, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, @Nullable ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1) {
        this.b(recyclerView$ViewHolder0);
        recyclerView$ViewHolder0.setIsRecyclable(false);
        if(this.mItemAnimator.c(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0, recyclerView$ItemAnimator$ItemHolderInfo1)) {
            this.postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String s) {
        if(!this.isComputingLayout()) {
            throw s == null ? new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + this.exceptionLabel()) : new IllegalStateException(s + this.exceptionLabel());
        }
    }

    void assertNotInLayoutOrScroll(String s) {
        if(this.isComputingLayout()) {
            throw s == null ? new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + this.exceptionLabel()) : new IllegalStateException(s);
        }
        if(this.mDispatchScrollCounter > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + this.exceptionLabel()));
        }
    }

    private void b(ViewHolder recyclerView$ViewHolder0) {
        View view0 = recyclerView$ViewHolder0.itemView;
        boolean z = view0.getParent() == this;
        ViewHolder recyclerView$ViewHolder1 = this.getChildViewHolder(view0);
        this.mRecycler.P(recyclerView$ViewHolder1);
        if(recyclerView$ViewHolder0.isTmpDetached()) {
            this.mChildHelper.c(view0, -1, view0.getLayoutParams(), true);
            return;
        }
        if(!z) {
            this.mChildHelper.b(view0, true);
            return;
        }
        this.mChildHelper.k(view0);
    }

    private void c(@NonNull ViewHolder recyclerView$ViewHolder0, @NonNull ViewHolder recyclerView$ViewHolder1, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1, boolean z, boolean z1) {
        recyclerView$ViewHolder0.setIsRecyclable(false);
        if(z) {
            this.b(recyclerView$ViewHolder0);
        }
        if(recyclerView$ViewHolder0 != recyclerView$ViewHolder1) {
            if(z1) {
                this.b(recyclerView$ViewHolder1);
            }
            recyclerView$ViewHolder0.mShadowedHolder = recyclerView$ViewHolder1;
            this.b(recyclerView$ViewHolder0);
            this.mRecycler.P(recyclerView$ViewHolder0);
            recyclerView$ViewHolder1.setIsRecyclable(false);
            recyclerView$ViewHolder1.mShadowingHolder = recyclerView$ViewHolder0;
        }
        if(this.mItemAnimator.b(recyclerView$ViewHolder0, recyclerView$ViewHolder1, recyclerView$ItemAnimator$ItemHolderInfo0, recyclerView$ItemAnimator$ItemHolderInfo1)) {
            this.postAnimationRunner();
        }
    }

    boolean canReuseUpdatedViewHolder(ViewHolder recyclerView$ViewHolder0) {
        return this.mItemAnimator == null || this.mItemAnimator.g(recyclerView$ViewHolder0, recyclerView$ViewHolder0.getUnmodifiedPayloads());
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams && this.mLayout.I(((LayoutParams)viewGroup$LayoutParams0));
    }

    static void clearNestedRecyclerViewIfNotNested(@NonNull ViewHolder recyclerView$ViewHolder0) {
        WeakReference weakReference0 = recyclerView$ViewHolder0.mNestedRecyclerView;
        if(weakReference0 != null) {
            for(View view0 = (View)weakReference0.get(); view0 != null; view0 = viewParent0 instanceof View ? ((View)viewParent0) : null) {
                if(view0 == recyclerView$ViewHolder0.itemView) {
                    return;
                }
                ViewParent viewParent0 = view0.getParent();
            }
            recyclerView$ViewHolder0.mNestedRecyclerView = null;
        }
    }

    void clearOldPositions() {
        int v = this.mChildHelper.j();
        for(int v1 = 0; v1 < v; ++v1) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.i(v1));
            if(!recyclerView$ViewHolder0.shouldIgnore()) {
                recyclerView$ViewHolder0.clearOldPosition();
            }
        }
        this.mRecycler.e();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List list0 = this.mOnChildAttachStateListeners;
        if(list0 != null) {
            list0.clear();
        }
    }

    public void clearOnScrollListeners() {
        List list0 = this.mScrollListeners;
        if(list0 != null) {
            list0.clear();
        }
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    public int computeHorizontalScrollExtent() {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            return 0;
        }
        return recyclerView$LayoutManager0.G() ? this.mLayout.M(this.mState) : 0;
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    public int computeHorizontalScrollOffset() {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            return 0;
        }
        return recyclerView$LayoutManager0.G() ? this.mLayout.N(this.mState) : 0;
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    public int computeHorizontalScrollRange() {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            return 0;
        }
        return recyclerView$LayoutManager0.G() ? this.mLayout.O(this.mState) : 0;
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    public int computeVerticalScrollExtent() {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            return 0;
        }
        return recyclerView$LayoutManager0.H() ? this.mLayout.P(this.mState) : 0;
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    public int computeVerticalScrollOffset() {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            return 0;
        }
        return recyclerView$LayoutManager0.H() ? this.mLayout.Q(this.mState) : 0;
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    public int computeVerticalScrollRange() {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            return 0;
        }
        return recyclerView$LayoutManager0.H() ? this.mLayout.R(this.mState) : 0;
    }

    void considerReleasingGlowsOnScroll(int v, int v1) {
        boolean z;
        if(this.mLeftGlow == null || this.mLeftGlow.isFinished() || v <= 0) {
            z = false;
        }
        else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        if(this.mRightGlow != null && !this.mRightGlow.isFinished() && v < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        if(this.mTopGlow != null && !this.mTopGlow.isFinished() && v1 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        if(this.mBottomGlow != null && !this.mBottomGlow.isFinished() && v1 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if(z) {
            this.postInvalidateOnAnimation();
        }
    }

    int consumeFlingInHorizontalStretch(int v) {
        return this.e(v, this.mLeftGlow, this.mRightGlow, this.getWidth());
    }

    int consumeFlingInVerticalStretch(int v) {
        return this.e(v, this.mTopGlow, this.mBottomGlow, this.getHeight());
    }

    void consumePendingUpdateOperations() {
        if(this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if(!this.mAdapterHelper.q()) {
                return;
            }
            if(this.mAdapterHelper.p(4) && !this.mAdapterHelper.p(11)) {
                Trace.beginSection("RV PartialInvalidate");
                this.startInterceptRequestLayout();
                this.onEnterLayoutOrScroll();
                this.mAdapterHelper.x();
                if(!this.mLayoutWasDefered) {
                    if(this.u()) {
                        this.dispatchLayout();
                    }
                    else {
                        this.mAdapterHelper.j();
                    }
                }
                this.stopInterceptRequestLayout(true);
                this.onExitLayoutOrScroll();
                Trace.endSection();
                return;
            }
            if(this.mAdapterHelper.q()) {
                Trace.beginSection("RV FullInvalidate");
                this.dispatchLayout();
                Trace.endSection();
            }
            return;
        }
        Trace.beginSection("RV FullInvalidate");
        this.dispatchLayout();
        Trace.endSection();
    }

    private void d() {
        this.J();
        this.setScrollState(0);
    }

    void defaultOnMeasure(int v, int v1) {
        this.setMeasuredDimension(LayoutManager.J(v, this.getPaddingLeft() + this.getPaddingRight(), ViewCompat.k0(this)), LayoutManager.J(v1, this.getPaddingTop() + this.getPaddingBottom(), ViewCompat.j0(this)));
    }

    void dispatchChildAttached(View view0) {
        ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
        Adapter recyclerView$Adapter0 = this.mAdapter;
        if(recyclerView$Adapter0 != null && recyclerView$ViewHolder0 != null) {
            recyclerView$Adapter0.onViewAttachedToWindow(recyclerView$ViewHolder0);
        }
        List list0 = this.mOnChildAttachStateListeners;
        if(list0 != null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                ((OnChildAttachStateChangeListener)this.mOnChildAttachStateListeners.get(v)).b(view0);
            }
        }
    }

    void dispatchChildDetached(View view0) {
        ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
        Adapter recyclerView$Adapter0 = this.mAdapter;
        if(recyclerView$Adapter0 != null && recyclerView$ViewHolder0 != null) {
            recyclerView$Adapter0.onViewDetachedFromWindow(recyclerView$ViewHolder0);
        }
        List list0 = this.mOnChildAttachStateListeners;
        if(list0 != null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                ((OnChildAttachStateChangeListener)this.mOnChildAttachStateListeners.get(v)).a(view0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(@Nullable KeyEvent keyEvent0) {
        if(super.dispatchKeyEvent(keyEvent0)) {
            return true;
        }
        LayoutManager recyclerView$LayoutManager0 = this.getLayoutManager();
        int v = 0;
        if(recyclerView$LayoutManager0 == null) {
            return false;
        }
        if(recyclerView$LayoutManager0.H()) {
            int v1 = keyEvent0.getKeyCode();
            switch(v1) {
                case 92: 
                case 93: {
                    int v2 = this.getMeasuredHeight();
                    if(v1 == 93) {
                        this.smoothScrollBy(0, v2, null, 0x80000000);
                        return true;
                    }
                    this.smoothScrollBy(0, -v2, null, 0x80000000);
                    return true;
                }
                case 0x7A: 
                case 0x7B: {
                    boolean z = recyclerView$LayoutManager0.c1();
                    if(v1 != 0x7A) {
                        if(!z) {
                            v = this.getAdapter().getItemCount();
                        }
                    }
                    else if(z) {
                        v = this.getAdapter().getItemCount();
                    }
                    this.smoothScrollToPosition(v);
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        if(recyclerView$LayoutManager0.G()) {
            int v3 = keyEvent0.getKeyCode();
            switch(v3) {
                case 92: 
                case 93: {
                    int v4 = this.getMeasuredWidth();
                    if(v3 == 93) {
                        this.smoothScrollBy(v4, 0, null, 0x80000000);
                        return true;
                    }
                    this.smoothScrollBy(-v4, 0, null, 0x80000000);
                    return true;
                }
                case 0x7A: 
                case 0x7B: {
                    boolean z1 = recyclerView$LayoutManager0.c1();
                    if(v3 != 0x7A) {
                        if(!z1) {
                            v = this.getAdapter().getItemCount();
                        }
                    }
                    else if(z1) {
                        v = this.getAdapter().getItemCount();
                    }
                    this.smoothScrollToPosition(v);
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    void dispatchLayout() {
        if(this.mAdapter == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if(this.mLayout == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.mState.j = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && (this.mLastAutoMeasureNonExactMeasuredWidth != this.getWidth() || this.mLastAutoMeasureNonExactMeasuredHeight != this.getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if(this.mState.e == 1) {
            this.i();
            this.mLayout.n2(this);
            this.j();
        }
        else if(this.mAdapterHelper.r() || z || this.mLayout.R0() != this.getWidth() || this.mLayout.x0() != this.getHeight()) {
            this.mLayout.n2(this);
            this.j();
        }
        else {
            this.mLayout.n2(this);
        }
        this.k();
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f1, boolean z) {
        return this.getScrollingChildHelper().a(f, f1, z);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f1) {
        return this.getScrollingChildHelper().b(f, f1);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int v, int v1, int[] arr_v, int[] arr_v1) {
        return this.getScrollingChildHelper().c(v, v1, arr_v, arr_v1);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int v, int v1, int[] arr_v, int[] arr_v1, int v2) {
        return this.getScrollingChildHelper().d(v, v1, arr_v, arr_v1, v2);
    }

    @Override  // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v, int v4, @NonNull int[] arr_v1) {
        this.getScrollingChildHelper().e(v, v1, v2, v3, arr_v, v4, arr_v1);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v) {
        return this.getScrollingChildHelper().f(v, v1, v2, v3, arr_v);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v, int v4) {
        return this.getScrollingChildHelper().g(v, v1, v2, v3, arr_v, v4);
    }

    void dispatchOnScrollStateChanged(int v) {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.O1(v);
        }
        this.onScrollStateChanged(v);
        OnScrollListener recyclerView$OnScrollListener0 = this.mScrollListener;
        if(recyclerView$OnScrollListener0 != null) {
            recyclerView$OnScrollListener0.onScrollStateChanged(this, v);
        }
        List list0 = this.mScrollListeners;
        if(list0 != null) {
            for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
                ((OnScrollListener)this.mScrollListeners.get(v1)).onScrollStateChanged(this, v);
            }
        }
    }

    void dispatchOnScrolled(int v, int v1) {
        ++this.mDispatchScrollCounter;
        int v2 = this.getScrollX();
        int v3 = this.getScrollY();
        this.onScrollChanged(v2, v3, v2 - v, v3 - v1);
        OnScrollListener recyclerView$OnScrollListener0 = this.mScrollListener;
        if(recyclerView$OnScrollListener0 != null) {
            recyclerView$OnScrollListener0.onScrolled(this, v, v1);
        }
        List list0 = this.mScrollListeners;
        if(list0 != null) {
            for(int v4 = list0.size() - 1; v4 >= 0; --v4) {
                ((OnScrollListener)this.mScrollListeners.get(v4)).onScrolled(this, v, v1);
            }
        }
        --this.mDispatchScrollCounter;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        for(int v = this.mPendingAccessibilityImportanceChange.size() - 1; v >= 0; --v) {
            ViewHolder recyclerView$ViewHolder0 = (ViewHolder)this.mPendingAccessibilityImportanceChange.get(v);
            if(recyclerView$ViewHolder0.itemView.getParent() == this && !recyclerView$ViewHolder0.shouldIgnore()) {
                int v1 = recyclerView$ViewHolder0.mPendingAccessibilityState;
                if(v1 != -1) {
                    recyclerView$ViewHolder0.itemView.setImportantForAccessibility(v1);
                    recyclerView$ViewHolder0.mPendingAccessibilityState = -1;
                }
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override  // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        this.onPopulateAccessibilityEvent(accessibilityEvent0);
        return true;
    }

    @Override  // android.view.ViewGroup
    protected void dispatchRestoreInstanceState(SparseArray sparseArray0) {
        this.dispatchThawSelfOnly(sparseArray0);
    }

    @Override  // android.view.ViewGroup
    protected void dispatchSaveInstanceState(SparseArray sparseArray0) {
        this.dispatchFreezeSelfOnly(sparseArray0);
    }

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        int v6;
        int v3;
        super.draw(canvas0);
        int v = this.mItemDecorations.size();
        int v1 = 0;
        for(int v2 = 0; true; ++v2) {
            v3 = 1;
            if(v2 >= v) {
                break;
            }
            ((ItemDecoration)this.mItemDecorations.get(v2)).k(canvas0, this, this.mState);
        }
        if(this.mLeftGlow == null || this.mLeftGlow.isFinished()) {
            v6 = 0;
        }
        else {
            int v4 = canvas0.save();
            int v5 = this.mClipToPadding ? this.getPaddingBottom() : 0;
            canvas0.rotate(270.0f);
            canvas0.translate(((float)(v5 - this.getHeight())), 0.0f);
            v6 = this.mLeftGlow == null || !this.mLeftGlow.draw(canvas0) ? 0 : 1;
            canvas0.restoreToCount(v4);
        }
        if(this.mTopGlow != null && !this.mTopGlow.isFinished()) {
            int v7 = canvas0.save();
            if(this.mClipToPadding) {
                canvas0.translate(((float)this.getPaddingLeft()), ((float)this.getPaddingTop()));
            }
            v6 |= (this.mTopGlow == null || !this.mTopGlow.draw(canvas0) ? 0 : 1);
            canvas0.restoreToCount(v7);
        }
        if(this.mRightGlow != null && !this.mRightGlow.isFinished()) {
            int v8 = canvas0.save();
            int v9 = this.getWidth();
            int v10 = this.mClipToPadding ? this.getPaddingTop() : 0;
            canvas0.rotate(90.0f);
            canvas0.translate(((float)v10), ((float)(-v9)));
            v6 |= (this.mRightGlow == null || !this.mRightGlow.draw(canvas0) ? 0 : 1);
            canvas0.restoreToCount(v8);
        }
        if(this.mBottomGlow != null && !this.mBottomGlow.isFinished()) {
            int v11 = canvas0.save();
            canvas0.rotate(180.0f);
            if(this.mClipToPadding) {
                canvas0.translate(((float)(-this.getWidth() + this.getPaddingRight())), ((float)(-this.getHeight() + this.getPaddingBottom())));
            }
            else {
                canvas0.translate(((float)(-this.getWidth())), ((float)(-this.getHeight())));
            }
            if(this.mBottomGlow != null && this.mBottomGlow.draw(canvas0)) {
                v1 = 1;
            }
            v6 |= v1;
            canvas0.restoreToCount(v11);
        }
        if(v6 != 0 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.q()) {
            v3 = v6;
        }
        if(v3 != 0) {
            this.postInvalidateOnAnimation();
        }
    }

    @Override  // android.view.ViewGroup
    public boolean drawChild(@NonNull Canvas canvas0, View view0, long v) {
        return super.drawChild(canvas0, view0, v);
    }

    private int e(int v, EdgeEffect edgeEffect0, EdgeEffect edgeEffect1, int v1) {
        if(v > 0 && edgeEffect0 != null && EdgeEffectCompat.d(edgeEffect0) != 0.0f) {
            int v2 = Math.round(((float)(-v1)) / 4.0f * EdgeEffectCompat.j(edgeEffect0, ((float)(-v)) * 4.0f / ((float)v1), 0.5f));
            if(v2 != v) {
                edgeEffect0.finish();
            }
            return v - v2;
        }
        if(v < 0 && edgeEffect1 != null && EdgeEffectCompat.d(edgeEffect1) != 0.0f) {
            int v3 = Math.round(((float)v1) / 4.0f * EdgeEffectCompat.j(edgeEffect1, ((float)v) * 4.0f / ((float)v1), 0.5f));
            if(v3 != v) {
                edgeEffect1.finish();
            }
            return v - v3;
        }
        return v;
    }

    void ensureBottomGlow() {
        if(this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffect0 = this.mEdgeEffectFactory.a(this, 3);
        this.mBottomGlow = edgeEffect0;
        if(this.mClipToPadding) {
            edgeEffect0.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    void ensureLeftGlow() {
        if(this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffect0 = this.mEdgeEffectFactory.a(this, 0);
        this.mLeftGlow = edgeEffect0;
        if(this.mClipToPadding) {
            edgeEffect0.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }

    void ensureRightGlow() {
        if(this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffect0 = this.mEdgeEffectFactory.a(this, 2);
        this.mRightGlow = edgeEffect0;
        if(this.mClipToPadding) {
            edgeEffect0.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }

    void ensureTopGlow() {
        if(this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffect0 = this.mEdgeEffectFactory.a(this, 1);
        this.mTopGlow = edgeEffect0;
        if(this.mClipToPadding) {
            edgeEffect0.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + this.getContext();
    }

    private void f(Context context0, String s, AttributeSet attributeSet0, int v, int v1) {
        Constructor constructor0;
        Object[] arr_object;
        if(s != null) {
            String s1 = s.trim();
            if(!s1.isEmpty()) {
                String s2 = this.r(context0, s1);
                try {
                    Class class0 = Class.forName(s2, false, (this.isInEditMode() ? this.getClass().getClassLoader() : context0.getClassLoader())).asSubclass(LayoutManager.class);
                    try {
                        arr_object = null;
                        constructor0 = class0.getConstructor(RecyclerView.LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        arr_object = new Object[]{context0, attributeSet0, v, v1};
                    }
                    catch(NoSuchMethodException noSuchMethodException0) {
                        try {
                            constructor0 = class0.getConstructor(null);
                        }
                        catch(NoSuchMethodException noSuchMethodException1) {
                            noSuchMethodException1.initCause(noSuchMethodException0);
                            throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Error creating LayoutManager " + s2, noSuchMethodException1);
                        }
                    }
                    constructor0.setAccessible(true);
                    this.setLayoutManager(((LayoutManager)constructor0.newInstance(arr_object)));
                    return;
                }
                catch(ClassNotFoundException classNotFoundException0) {
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Could not instantiate the LayoutManager: " + s2, invocationTargetException0);
                }
                catch(InstantiationException instantiationException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Could not instantiate the LayoutManager: " + s2, instantiationException0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Cannot access non-public constructor " + s2, illegalAccessException0);
                }
                catch(ClassCastException classCastException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Class is not a LayoutManager " + s2, classCastException0);
                }
                throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Unable to find LayoutManager " + s2, classNotFoundException0);
            }
        }
    }

    final void fillRemainingScrollValues(State recyclerView$State0) {
        if(this.getScrollState() == 2) {
            OverScroller overScroller0 = this.mViewFlinger.c;
            recyclerView$State0.p = overScroller0.getFinalX() - overScroller0.getCurrX();
            recyclerView$State0.q = overScroller0.getFinalY() - overScroller0.getCurrY();
            return;
        }
        recyclerView$State0.p = 0;
        recyclerView$State0.q = 0;
    }

    @Nullable
    public View findChildViewUnder(float f, float f1) {
        for(int v = this.mChildHelper.g() - 1; v >= 0; --v) {
            View view0 = this.mChildHelper.f(v);
            float f2 = view0.getTranslationX();
            float f3 = view0.getTranslationY();
            if(f >= ((float)view0.getLeft()) + f2 && f <= ((float)view0.getRight()) + f2 && f1 >= ((float)view0.getTop()) + f3 && f1 <= ((float)view0.getBottom()) + f3) {
                return view0;
            }
        }
        return null;
    }

    @Nullable
    public View findContainingItemView(@NonNull View view0) {
        ViewParent viewParent0;
        for(viewParent0 = view0.getParent(); viewParent0 != null && viewParent0 != this && viewParent0 instanceof View; viewParent0 = view0.getParent()) {
            view0 = (View)viewParent0;
        }
        return viewParent0 == this ? view0 : null;
    }

    @Nullable
    public ViewHolder findContainingViewHolder(@NonNull View view0) {
        View view1 = this.findContainingItemView(view0);
        return view1 == null ? null : this.getChildViewHolder(view1);
    }

    @Nullable
    static RecyclerView findNestedRecyclerView(@NonNull View view0) {
        if(!(view0 instanceof ViewGroup)) {
            return null;
        }
        if(view0 instanceof RecyclerView) {
            return (RecyclerView)view0;
        }
        int v = ((ViewGroup)view0).getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            RecyclerView recyclerView0 = RecyclerView.findNestedRecyclerView(((ViewGroup)view0).getChildAt(v1));
            if(recyclerView0 != null) {
                return recyclerView0;
            }
        }
        return null;
    }

    @Nullable
    public ViewHolder findViewHolderForAdapterPosition(int v) {
        ViewHolder recyclerView$ViewHolder0 = null;
        if(this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int v1 = this.mChildHelper.j();
        for(int v2 = 0; v2 < v1; ++v2) {
            ViewHolder recyclerView$ViewHolder1 = RecyclerView.getChildViewHolderInt(this.mChildHelper.i(v2));
            if(recyclerView$ViewHolder1 != null && !recyclerView$ViewHolder1.isRemoved() && this.getAdapterPositionInRecyclerView(recyclerView$ViewHolder1) == v) {
                if(this.mChildHelper.n(recyclerView$ViewHolder1.itemView)) {
                    recyclerView$ViewHolder0 = recyclerView$ViewHolder1;
                    continue;
                }
                return recyclerView$ViewHolder1;
            }
        }
        return recyclerView$ViewHolder0;
    }

    public ViewHolder findViewHolderForItemId(long v) {
        ViewHolder recyclerView$ViewHolder0 = null;
        if(this.mAdapter != null && this.mAdapter.hasStableIds()) {
            int v1 = this.mChildHelper.j();
            for(int v2 = 0; v2 < v1; ++v2) {
                ViewHolder recyclerView$ViewHolder1 = RecyclerView.getChildViewHolderInt(this.mChildHelper.i(v2));
                if(recyclerView$ViewHolder1 != null && !recyclerView$ViewHolder1.isRemoved() && recyclerView$ViewHolder1.getItemId() == v) {
                    if(this.mChildHelper.n(recyclerView$ViewHolder1.itemView)) {
                        recyclerView$ViewHolder0 = recyclerView$ViewHolder1;
                        continue;
                    }
                    return recyclerView$ViewHolder1;
                }
            }
        }
        return recyclerView$ViewHolder0;
    }

    @Nullable
    public ViewHolder findViewHolderForLayoutPosition(int v) {
        return this.findViewHolderForPosition(v, false);
    }

    @Nullable
    @Deprecated
    public ViewHolder findViewHolderForPosition(int v) {
        return this.findViewHolderForPosition(v, false);
    }

    @Nullable
    ViewHolder findViewHolderForPosition(int v, boolean z) {
        int v1 = this.mChildHelper.j();
        ViewHolder recyclerView$ViewHolder0 = null;
        int v2 = 0;
        while(v2 < v1) {
            ViewHolder recyclerView$ViewHolder1 = RecyclerView.getChildViewHolderInt(this.mChildHelper.i(v2));
            if(recyclerView$ViewHolder1 != null && !recyclerView$ViewHolder1.isRemoved()) {
                if(z) {
                    if(recyclerView$ViewHolder1.mPosition == v) {
                        goto label_10;
                    }
                    else {
                        goto label_14;
                    }
                    goto label_9;
                }
                else {
                label_9:
                    if(recyclerView$ViewHolder1.getLayoutPosition() == v) {
                    label_10:
                        if(this.mChildHelper.n(recyclerView$ViewHolder1.itemView)) {
                            recyclerView$ViewHolder0 = recyclerView$ViewHolder1;
                            goto label_14;
                        }
                        return recyclerView$ViewHolder1;
                    }
                }
            }
        label_14:
            ++v2;
        }
        return recyclerView$ViewHolder0;
    }

    public boolean fling(int v, int v1) {
        return this.p(v, v1, this.mMinFlingVelocity, this.mMaxFlingVelocity);
    }

    boolean flingNoThresholdCheck(int v, int v1) {
        return this.p(v, v1, 0, 0x7FFFFFFF);
    }

    @Override  // android.view.ViewGroup
    public View focusSearch(View view0, int v) {
        View view1;
        int v1 = 1;
        boolean z = this.mAdapter != null && this.mLayout != null && !this.isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder focusFinder0 = FocusFinder.getInstance();
        if(!z || v != 1 && v != 2) {
            View view2 = focusFinder0.findNextFocus(this, view0, v);
            if(view2 != null || !z) {
                view1 = view2;
            }
            else {
                this.consumePendingUpdateOperations();
                if(this.findContainingItemView(view0) == null) {
                    return null;
                }
                this.startInterceptRequestLayout();
                view1 = this.mLayout.t1(view0, v, this.mRecycler, this.mState);
                this.stopInterceptRequestLayout(false);
            }
        }
        else {
            int v2 = !this.mLayout.H() || focusFinder0.findNextFocus(this, view0, (v == 2 ? 130 : 33)) != null ? 0 : 1;
            if(v2 == 0 && this.mLayout.G()) {
                if(focusFinder0.findNextFocus(this, view0, (((this.mLayout.A0() == 1 ? 1 : 0) ^ (v == 2 ? 1 : 0)) == 0 ? 17 : 66)) != null) {
                    v1 = 0;
                }
                v2 = v1;
            }
            if(v2 != 0) {
                this.consumePendingUpdateOperations();
                if(this.findContainingItemView(view0) == null) {
                    return null;
                }
                this.startInterceptRequestLayout();
                this.mLayout.t1(view0, v, this.mRecycler, this.mState);
                this.stopInterceptRequestLayout(false);
            }
            view1 = focusFinder0.findNextFocus(this, view0, v);
        }
        if(view1 != null && !view1.hasFocusable()) {
            if(this.getFocusedChild() == null) {
                return super.focusSearch(view0, v);
            }
            this.H(view1, null);
            return view0;
        }
        return this.x(view0, view1, v) ? view1 : super.focusSearch(view0, v);
    }

    private boolean g(int v, int v1) {
        this.n(this.mMinMaxLayoutPositions);
        return this.mMinMaxLayoutPositions[0] != v || this.mMinMaxLayoutPositions[1] != v1;
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + this.exceptionLabel());
        }
        return recyclerView$LayoutManager0.d0();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + this.exceptionLabel());
        }
        return recyclerView$LayoutManager0.e0(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + this.exceptionLabel());
        }
        return recyclerView$LayoutManager0.f0(viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.mAdapter;
    }

    // 去混淆评级： 低(20)
    int getAdapterPositionInRecyclerView(ViewHolder recyclerView$ViewHolder0) {
        return recyclerView$ViewHolder0.hasAnyOfTheFlags(0x20C) || !recyclerView$ViewHolder0.isBound() ? -1 : this.mAdapterHelper.f(recyclerView$ViewHolder0.mPosition);
    }

    @Override  // android.view.View
    public int getBaseline() {
        return this.mLayout == null ? super.getBaseline() : -1;
    }

    // 去混淆评级： 低(20)
    long getChangedHolderKey(ViewHolder recyclerView$ViewHolder0) {
        return this.mAdapter.hasStableIds() ? recyclerView$ViewHolder0.getItemId() : ((long)recyclerView$ViewHolder0.mPosition);
    }

    public int getChildAdapterPosition(@NonNull View view0) {
        ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
        return recyclerView$ViewHolder0 == null ? -1 : recyclerView$ViewHolder0.getAbsoluteAdapterPosition();
    }

    @Override  // android.view.ViewGroup
    protected int getChildDrawingOrder(int v, int v1) {
        return this.mChildDrawingOrderCallback == null ? super.getChildDrawingOrder(v, v1) : this.mChildDrawingOrderCallback.a(v, v1);
    }

    public long getChildItemId(@NonNull View view0) {
        if(this.mAdapter != null && this.mAdapter.hasStableIds()) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            return recyclerView$ViewHolder0 == null ? -1L : recyclerView$ViewHolder0.getItemId();
        }
        return -1L;
    }

    public int getChildLayoutPosition(@NonNull View view0) {
        ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
        return recyclerView$ViewHolder0 == null ? -1 : recyclerView$ViewHolder0.getLayoutPosition();
    }

    @Deprecated
    public int getChildPosition(@NonNull View view0) {
        return this.getChildAdapterPosition(view0);
    }

    public ViewHolder getChildViewHolder(@NonNull View view0) {
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 != null && viewParent0 != this) {
            throw new IllegalArgumentException("View " + view0 + " is not a direct child of " + this);
        }
        return RecyclerView.getChildViewHolderInt(view0);
    }

    static ViewHolder getChildViewHolderInt(View view0) {
        return view0 == null ? null : ((LayoutParams)view0.getLayoutParams()).a;
    }

    @Override  // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @Nullable
    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view0, @NonNull Rect rect0) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view0, rect0);
    }

    static void getDecoratedBoundsWithMarginsInt(View view0, Rect rect0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        rect0.set(view0.getLeft() - recyclerView$LayoutParams0.b.left - recyclerView$LayoutParams0.leftMargin, view0.getTop() - recyclerView$LayoutParams0.b.top - recyclerView$LayoutParams0.topMargin, view0.getRight() + recyclerView$LayoutParams0.b.right + recyclerView$LayoutParams0.rightMargin, view0.getBottom() + recyclerView$LayoutParams0.b.bottom + recyclerView$LayoutParams0.bottomMargin);
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(!recyclerView$LayoutParams0.c) {
            return recyclerView$LayoutParams0.b;
        }
        if(this.mState.j() && (recyclerView$LayoutParams0.f() || recyclerView$LayoutParams0.h())) {
            return recyclerView$LayoutParams0.b;
        }
        Rect rect0 = recyclerView$LayoutParams0.b;
        rect0.set(0, 0, 0, 0);
        int v = this.mItemDecorations.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.mTempRect.set(0, 0, 0, 0);
            ((ItemDecoration)this.mItemDecorations.get(v1)).d(this.mTempRect, view0, this, this.mState);
            rect0.left += this.mTempRect.left;
            rect0.top += this.mTempRect.top;
            rect0.right += this.mTempRect.right;
            rect0.bottom += this.mTempRect.bottom;
        }
        recyclerView$LayoutParams0.c = false;
        return rect0;
    }

    @NonNull
    public ItemDecoration getItemDecorationAt(int v) {
        int v1 = this.getItemDecorationCount();
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException(v + " is an invalid index for size " + v1);
        }
        return (ItemDecoration)this.mItemDecorations.get(v);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable
    public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    // 去混淆评级： 低(20)
    long getNanoTime() [...] // 潜在的解密器

    @Nullable
    public OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public RecycledViewPool getRecycledViewPool() {
        return this.mRecycler.j();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if(this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new NestedScrollingChildHelper(this);
        }
        return this.mScrollingChildHelper;
    }

    private void h() {
        int v = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if(v != 0 && this.isAccessibilityEnabled()) {
            AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain();
            accessibilityEvent0.setEventType(0x800);
            AccessibilityEventCompat.k(accessibilityEvent0, v);
            this.sendAccessibilityEventUnchecked(accessibilityEvent0);
        }
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.getScrollingChildHelper().k();
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int v) {
        return this.getScrollingChildHelper().l(v);
    }

    // 去混淆评级： 低(30)
    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.q();
    }

    private void i() {
        boolean z = true;
        this.mState.a(1);
        this.fillRemainingScrollValues(this.mState);
        this.mState.j = false;
        this.startInterceptRequestLayout();
        this.mViewInfoStore.f();
        this.onEnterLayoutOrScroll();
        this.B();
        this.K();
        State recyclerView$State0 = this.mState;
        if(!recyclerView$State0.k || !this.mItemsChanged) {
            z = false;
        }
        recyclerView$State0.i = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        recyclerView$State0.h = recyclerView$State0.l;
        recyclerView$State0.f = this.mAdapter.getItemCount();
        this.n(this.mMinMaxLayoutPositions);
        if(this.mState.k) {
            int v = this.mChildHelper.g();
            for(int v1 = 0; v1 < v; ++v1) {
                ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.f(v1));
                if(!recyclerView$ViewHolder0.shouldIgnore() && (!recyclerView$ViewHolder0.isInvalid() || this.mAdapter.hasStableIds())) {
                    ItemAnimator recyclerView$ItemAnimator0 = this.mItemAnimator;
                    int v2 = ItemAnimator.e(recyclerView$ViewHolder0);
                    List list0 = recyclerView$ViewHolder0.getUnmodifiedPayloads();
                    ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0 = recyclerView$ItemAnimator0.w(this.mState, recyclerView$ViewHolder0, v2, list0);
                    this.mViewInfoStore.e(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0);
                    if(this.mState.i && recyclerView$ViewHolder0.isUpdated() && !recyclerView$ViewHolder0.isRemoved() && !recyclerView$ViewHolder0.shouldIgnore() && !recyclerView$ViewHolder0.isInvalid()) {
                        long v3 = this.getChangedHolderKey(recyclerView$ViewHolder0);
                        this.mViewInfoStore.c(v3, recyclerView$ViewHolder0);
                    }
                }
            }
        }
        if(this.mState.l) {
            this.saveOldPositions();
            boolean z1 = this.mState.g;
            this.mState.g = false;
            this.mLayout.H1(this.mRecycler, this.mState);
            this.mState.g = z1;
            for(int v4 = 0; v4 < this.mChildHelper.g(); ++v4) {
                ViewHolder recyclerView$ViewHolder1 = RecyclerView.getChildViewHolderInt(this.mChildHelper.f(v4));
                if(!recyclerView$ViewHolder1.shouldIgnore() && !this.mViewInfoStore.i(recyclerView$ViewHolder1)) {
                    int v5 = ItemAnimator.e(recyclerView$ViewHolder1);
                    boolean z2 = recyclerView$ViewHolder1.hasAnyOfTheFlags(0x2000);
                    if(!z2) {
                        v5 |= 0x1000;
                    }
                    ItemAnimator recyclerView$ItemAnimator1 = this.mItemAnimator;
                    List list1 = recyclerView$ViewHolder1.getUnmodifiedPayloads();
                    ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1 = recyclerView$ItemAnimator1.w(this.mState, recyclerView$ViewHolder1, v5, list1);
                    if(z2) {
                        this.recordAnimationInfoIfBouncedHiddenView(recyclerView$ViewHolder1, recyclerView$ItemAnimator$ItemHolderInfo1);
                    }
                    else {
                        this.mViewInfoStore.a(recyclerView$ViewHolder1, recyclerView$ItemAnimator$ItemHolderInfo1);
                    }
                }
            }
        }
        this.clearOldPositions();
        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
        this.mState.e = 2;
    }

    void initAdapterManager() {
        this.mAdapterHelper = new AdapterHelper(new androidx.recyclerview.widget.AdapterHelper.Callback() {
            final RecyclerView a;

            @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
            public void a(int v, int v1) {
                RecyclerView.this.offsetPositionRecordsForMove(v, v1);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
            public void b(UpdateOp adapterHelper$UpdateOp0) {
                this.i(adapterHelper$UpdateOp0);
            }

            @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
            public void c(UpdateOp adapterHelper$UpdateOp0) {
                this.i(adapterHelper$UpdateOp0);
            }

            @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
            public ViewHolder d(int v) {
                ViewHolder recyclerView$ViewHolder0 = RecyclerView.this.findViewHolderForPosition(v, true);
                if(recyclerView$ViewHolder0 == null) {
                    return null;
                }
                if(RecyclerView.this.mChildHelper.n(recyclerView$ViewHolder0.itemView)) {
                    if(RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
                    }
                    return null;
                }
                return recyclerView$ViewHolder0;
            }

            @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
            public void e(int v, int v1) {
                RecyclerView.this.offsetPositionRecordsForInsert(v, v1);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
            public void f(int v, int v1) {
                RecyclerView.this.offsetPositionRecordsForRemove(v, v1, true);
                RecyclerView.this.mItemsAddedOrRemoved = true;
                RecyclerView.this.mState.d += v1;
            }

            @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
            public void g(int v, int v1) {
                RecyclerView.this.offsetPositionRecordsForRemove(v, v1, false);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
            public void h(int v, int v1, Object object0) {
                RecyclerView.this.viewRangeUpdate(v, v1, object0);
                RecyclerView.this.mItemsChanged = true;
            }

            void i(UpdateOp adapterHelper$UpdateOp0) {
                switch(adapterHelper$UpdateOp0.a) {
                    case 1: {
                        RecyclerView.this.mLayout.B1(RecyclerView.this, adapterHelper$UpdateOp0.b, adapterHelper$UpdateOp0.d);
                        return;
                    }
                    case 2: {
                        RecyclerView.this.mLayout.E1(RecyclerView.this, adapterHelper$UpdateOp0.b, adapterHelper$UpdateOp0.d);
                        return;
                    }
                    case 4: {
                        RecyclerView.this.mLayout.G1(RecyclerView.this, adapterHelper$UpdateOp0.b, adapterHelper$UpdateOp0.d, adapterHelper$UpdateOp0.c);
                        return;
                    }
                    case 8: {
                        RecyclerView.this.mLayout.D1(RecyclerView.this, adapterHelper$UpdateOp0.b, adapterHelper$UpdateOp0.d, 1);
                    }
                }
            }
        });
    }

    @VisibleForTesting
    void initFastScroller(StateListDrawable stateListDrawable0, Drawable drawable0, StateListDrawable stateListDrawable1, Drawable drawable1) {
        if(stateListDrawable0 == null || drawable0 == null || stateListDrawable1 == null || drawable1 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + this.exceptionLabel());
        }
        Resources resources0 = this.getContext().getResources();
        new FastScroller(this, stateListDrawable0, drawable0, stateListDrawable1, drawable1, resources0.getDimensionPixelSize(dimen.fastscroll_default_thickness), resources0.getDimensionPixelSize(dimen.fastscroll_minimum_range), resources0.getDimensionPixelOffset(dimen.fastscroll_margin));
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if(this.mItemDecorations.size() == 0) {
            return;
        }
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.B("Cannot invalidate item decorations during a scroll or layout");
        }
        this.markItemDecorInsetsDirty();
        this.requestLayout();
    }

    boolean isAccessibilityEnabled() {
        return this.mAccessibilityManager != null && this.mAccessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        return this.mItemAnimator != null && this.mItemAnimator.q();
    }

    @Override  // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return this.isLayoutSuppressed();
    }

    @Override  // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.getScrollingChildHelper().m();
    }

    private void j() {
        this.startInterceptRequestLayout();
        this.onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.k();
        this.mState.f = this.mAdapter.getItemCount();
        this.mState.d = 0;
        if(this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable0 = this.mPendingSavedState.c;
            if(parcelable0 != null) {
                this.mLayout.M1(parcelable0);
            }
            this.mPendingSavedState = null;
        }
        this.mState.h = false;
        this.mLayout.H1(this.mRecycler, this.mState);
        this.mState.g = false;
        this.mState.k = this.mState.k && this.mItemAnimator != null;
        this.mState.e = 4;
        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
    }

    void jumpToPositionForSmoothScroller(int v) {
        if(this.mLayout == null) {
            return;
        }
        this.setScrollState(2);
        this.mLayout.k2(v);
        this.awakenScrollBars();
    }

    private void k() {
        this.mState.a(4);
        this.startInterceptRequestLayout();
        this.onEnterLayoutOrScroll();
        this.mState.e = 1;
        if(this.mState.k) {
            for(int v = this.mChildHelper.g() - 1; v >= 0; --v) {
                ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.f(v));
                if(!recyclerView$ViewHolder0.shouldIgnore()) {
                    long v1 = this.getChangedHolderKey(recyclerView$ViewHolder0);
                    ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0 = this.mItemAnimator.v(this.mState, recyclerView$ViewHolder0);
                    ViewHolder recyclerView$ViewHolder1 = this.mViewInfoStore.g(v1);
                    if(recyclerView$ViewHolder1 == null || recyclerView$ViewHolder1.shouldIgnore()) {
                        this.mViewInfoStore.d(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0);
                    }
                    else {
                        boolean z = this.mViewInfoStore.h(recyclerView$ViewHolder1);
                        boolean z1 = this.mViewInfoStore.h(recyclerView$ViewHolder0);
                        if(!z || recyclerView$ViewHolder1 != recyclerView$ViewHolder0) {
                            ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1 = this.mViewInfoStore.n(recyclerView$ViewHolder1);
                            this.mViewInfoStore.d(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0);
                            ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo2 = this.mViewInfoStore.m(recyclerView$ViewHolder0);
                            if(recyclerView$ItemAnimator$ItemHolderInfo1 == null) {
                                this.t(v1, recyclerView$ViewHolder0, recyclerView$ViewHolder1);
                            }
                            else {
                                this.c(recyclerView$ViewHolder1, recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo1, recyclerView$ItemAnimator$ItemHolderInfo2, z, z1);
                            }
                        }
                        else {
                            this.mViewInfoStore.d(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0);
                        }
                    }
                }
            }
            this.mViewInfoStore.o(this.mViewInfoProcessCallback);
        }
        this.mLayout.X1(this.mRecycler);
        this.mState.c = this.mState.f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mState.k = false;
        this.mState.l = false;
        this.mLayout.h = false;
        ArrayList arrayList0 = this.mRecycler.b;
        if(arrayList0 != null) {
            arrayList0.clear();
        }
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0.n) {
            recyclerView$LayoutManager0.m = 0;
            recyclerView$LayoutManager0.n = false;
            this.mRecycler.Q();
        }
        this.mLayout.I1(this.mState);
        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
        this.mViewInfoStore.f();
        if(this.g(this.mMinMaxLayoutPositions[0], this.mMinMaxLayoutPositions[1])) {
            this.dispatchOnScrolled(0, 0);
        }
        this.D();
        this.I();
    }

    private boolean l(MotionEvent motionEvent0) {
        OnItemTouchListener recyclerView$OnItemTouchListener0 = this.mInterceptingOnItemTouchListener;
        if(recyclerView$OnItemTouchListener0 == null) {
            return motionEvent0.getAction() == 0 ? false : this.m(motionEvent0);
        }
        recyclerView$OnItemTouchListener0.h(this, motionEvent0);
        switch(motionEvent0.getAction()) {
            case 1: 
            case 3: {
                this.mInterceptingOnItemTouchListener = null;
                return true;
            }
            default: {
                return true;
            }
        }
    }

    private boolean m(MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        int v1 = this.mOnItemTouchListeners.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            OnItemTouchListener recyclerView$OnItemTouchListener0 = (OnItemTouchListener)this.mOnItemTouchListeners.get(v2);
            if(recyclerView$OnItemTouchListener0.i(this, motionEvent0) && v != 3) {
                this.mInterceptingOnItemTouchListener = recyclerView$OnItemTouchListener0;
                return true;
            }
        }
        return false;
    }

    void markItemDecorInsetsDirty() {
        int v = this.mChildHelper.j();
        for(int v1 = 0; v1 < v; ++v1) {
            ((LayoutParams)this.mChildHelper.i(v1).getLayoutParams()).c = true;
        }
        this.mRecycler.t();
    }

    void markKnownViewsInvalid() {
        int v = this.mChildHelper.j();
        for(int v1 = 0; v1 < v; ++v1) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.i(v1));
            if(recyclerView$ViewHolder0 != null && !recyclerView$ViewHolder0.shouldIgnore()) {
                recyclerView$ViewHolder0.addFlags(6);
            }
        }
        this.markItemDecorInsetsDirty();
        this.mRecycler.u();
    }

    private void n(int[] arr_v) {
        int v = this.mChildHelper.g();
        if(v == 0) {
            arr_v[0] = -1;
            arr_v[1] = -1;
            return;
        }
        int v1 = 0x7FFFFFFF;
        int v2 = 0x80000000;
        for(int v3 = 0; v3 < v; ++v3) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.f(v3));
            if(!recyclerView$ViewHolder0.shouldIgnore()) {
                int v4 = recyclerView$ViewHolder0.getLayoutPosition();
                if(v4 < v1) {
                    v1 = v4;
                }
                if(v4 > v2) {
                    v2 = v4;
                }
            }
        }
        arr_v[0] = v1;
        arr_v[1] = v2;
    }

    public void nestedScrollBy(int v, int v1) {
        this.y(v, v1, null, 1);
    }

    @Nullable
    private View o() {
        int v = this.mState.m == -1 ? 0 : this.mState.m;
        int v1 = this.mState.d();
        for(int v2 = v; v2 < v1; ++v2) {
            ViewHolder recyclerView$ViewHolder0 = this.findViewHolderForAdapterPosition(v2);
            if(recyclerView$ViewHolder0 == null) {
                break;
            }
            if(recyclerView$ViewHolder0.itemView.hasFocusable()) {
                return recyclerView$ViewHolder0.itemView;
            }
        }
        for(int v3 = Math.min(v1, v) - 1; v3 >= 0; --v3) {
            ViewHolder recyclerView$ViewHolder1 = this.findViewHolderForAdapterPosition(v3);
            if(recyclerView$ViewHolder1 == null) {
                return null;
            }
            if(recyclerView$ViewHolder1.itemView.hasFocusable()) {
                return recyclerView$ViewHolder1.itemView;
            }
        }
        return null;
    }

    public void offsetChildrenHorizontal(@Px int v) {
        int v1 = this.mChildHelper.g();
        for(int v2 = 0; v2 < v1; ++v2) {
            this.mChildHelper.f(v2).offsetLeftAndRight(v);
        }
    }

    public void offsetChildrenVertical(@Px int v) {
        int v1 = this.mChildHelper.g();
        for(int v2 = 0; v2 < v1; ++v2) {
            this.mChildHelper.f(v2).offsetTopAndBottom(v);
        }
    }

    void offsetPositionRecordsForInsert(int v, int v1) {
        int v2 = this.mChildHelper.j();
        for(int v3 = 0; v3 < v2; ++v3) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.i(v3));
            if(recyclerView$ViewHolder0 != null && !recyclerView$ViewHolder0.shouldIgnore() && recyclerView$ViewHolder0.mPosition >= v) {
                if(RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + v3 + " holder " + recyclerView$ViewHolder0 + " now at position " + (recyclerView$ViewHolder0.mPosition + v1));
                }
                recyclerView$ViewHolder0.offsetPosition(v1, false);
                this.mState.g = true;
            }
        }
        this.mRecycler.w(v, v1);
        this.requestLayout();
    }

    void offsetPositionRecordsForMove(int v, int v1) {
        int v5;
        int v4;
        int v3;
        int v2 = this.mChildHelper.j();
        if(v < v1) {
            v3 = -1;
            v4 = v;
            v5 = v1;
        }
        else {
            v5 = v;
            v4 = v1;
            v3 = 1;
        }
        for(int v6 = 0; v6 < v2; ++v6) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.i(v6));
            if(recyclerView$ViewHolder0 != null && (recyclerView$ViewHolder0.mPosition >= v4 && recyclerView$ViewHolder0.mPosition <= v5)) {
                if(RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + v6 + " holder " + recyclerView$ViewHolder0);
                }
                if(recyclerView$ViewHolder0.mPosition == v) {
                    recyclerView$ViewHolder0.offsetPosition(v1 - v, false);
                }
                else {
                    recyclerView$ViewHolder0.offsetPosition(v3, false);
                }
                this.mState.g = true;
            }
        }
        this.mRecycler.x(v, v1);
        this.requestLayout();
    }

    void offsetPositionRecordsForRemove(int v, int v1, boolean z) {
        int v2 = this.mChildHelper.j();
        for(int v3 = 0; v3 < v2; ++v3) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.i(v3));
            if(recyclerView$ViewHolder0 != null && !recyclerView$ViewHolder0.shouldIgnore()) {
                int v4 = recyclerView$ViewHolder0.mPosition;
                if(v4 >= v + v1) {
                    if(RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + v3 + " holder " + recyclerView$ViewHolder0 + " now at position " + (recyclerView$ViewHolder0.mPosition - v1));
                    }
                    recyclerView$ViewHolder0.offsetPosition(-v1, z);
                    this.mState.g = true;
                }
                else if(v4 >= v) {
                    if(RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + v3 + " holder " + recyclerView$ViewHolder0 + " now REMOVED");
                    }
                    recyclerView$ViewHolder0.flagRemovedAndOffsetPosition(v - 1, -v1, z);
                    this.mState.g = true;
                }
            }
        }
        this.mRecycler.y(v, v1, z);
        this.requestLayout();
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z = true;
        this.mIsAttached = true;
        if(!this.mFirstLayoutComplete || this.isLayoutRequested()) {
            z = false;
        }
        this.mFirstLayoutComplete = z;
        this.mRecycler.A();
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.Y(this);
        }
        this.mPostedAnimatorRunner = false;
        if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal0 = GapWorker.e;
            GapWorker gapWorker0 = (GapWorker)threadLocal0.get();
            this.mGapWorker = gapWorker0;
            if(gapWorker0 == null) {
                this.mGapWorker = new GapWorker();
                Display display0 = ViewCompat.U(this);
                if(this.isInEditMode() || display0 == null) {
                    f = 60.0f;
                }
                else {
                    f = display0.getRefreshRate();
                    if(f < 30.0f) {
                        f = 60.0f;
                    }
                }
                GapWorker gapWorker1 = this.mGapWorker;
                gapWorker1.c = (long)(1000000000.0f / f);
                threadLocal0.set(gapWorker1);
            }
            this.mGapWorker.a(this);
        }
    }

    public void onChildAttachedToWindow(@NonNull View view0) {
    }

    public void onChildDetachedFromWindow(@NonNull View view0) {
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ItemAnimator recyclerView$ItemAnimator0 = this.mItemAnimator;
        if(recyclerView$ItemAnimator0 != null) {
            recyclerView$ItemAnimator0.l();
        }
        this.stopScroll();
        this.mIsAttached = false;
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.Z(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        this.removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.j();
        this.mRecycler.B();
        PoolingContainer.c(this);
        if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
            GapWorker gapWorker0 = this.mGapWorker;
            if(gapWorker0 != null) {
                gapWorker0.j(this);
                this.mGapWorker = null;
            }
        }
    }

    @Override  // android.view.View
    public void onDraw(@NonNull Canvas canvas0) {
        super.onDraw(canvas0);
        int v = this.mItemDecorations.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ItemDecoration)this.mItemDecorations.get(v1)).f(canvas0, this, this.mState);
        }
    }

    void onEnterLayoutOrScroll() {
        ++this.mLayoutOrScrollCounter;
    }

    void onExitLayoutOrScroll() {
        this.onExitLayoutOrScroll(true);
    }

    void onExitLayoutOrScroll(boolean z) {
        int v = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = v;
        if(v < 1) {
            if(RecyclerView.sDebugAssertionsEnabled && v < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + this.exceptionLabel());
            }
            this.mLayoutOrScrollCounter = 0;
            if(z) {
                this.h();
                this.dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    @Override  // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        int v;
        boolean z;
        float f2;
        float f = 0.0f;
        if(this.mLayout == null) {
            return false;
        }
        if(this.mLayoutSuppressed) {
            return false;
        }
        if(motionEvent0.getAction() == 8) {
            if((motionEvent0.getSource() & 2) != 0) {
                float f1 = this.mLayout.H() ? -motionEvent0.getAxisValue(9) : 0.0f;
                if(this.mLayout.G()) {
                    f2 = motionEvent0.getAxisValue(10);
                    z = false;
                    f = f1;
                    v = 0;
                }
                else {
                    f = f1;
                    v = 0;
                    f2 = 0.0f;
                    z = false;
                }
            }
            else if((motionEvent0.getSource() & 0x400000) == 0) {
                v = 0;
                f2 = 0.0f;
                z = false;
            }
            else {
                v = 26;
                f2 = motionEvent0.getAxisValue(26);
                if(this.mLayout.H()) {
                    f = -f2;
                    f2 = 0.0f;
                }
                else if(!this.mLayout.G()) {
                    f2 = 0.0f;
                }
                z = this.mLowResRotaryEncoderFeature;
            }
            int v1 = (int)(f * this.mScaledVerticalScrollFactor);
            int v2 = (int)(f2 * this.mScaledHorizontalScrollFactor);
            if(z) {
                OverScroller overScroller0 = this.mViewFlinger.c;
                int v3 = overScroller0.getFinalY();
                int v4 = overScroller0.getCurrY();
                this.smoothScrollBy(v2 + (overScroller0.getFinalX() - overScroller0.getCurrX()), v1 + (v3 - v4), null, 0x80000000, true);
            }
            else {
                this.y(v2, v1, motionEvent0, 1);
            }
            if(v != 0 && !z) {
                this.mDifferentialMotionFlingController.g(motionEvent0, v);
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        if(this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if(this.m(motionEvent0)) {
            this.d();
            return true;
        }
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            return false;
        }
        boolean z = recyclerView$LayoutManager0.G();
        boolean z1 = this.mLayout.H();
        if(this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent0);
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        switch(v) {
            case 0: {
                if(this.mIgnoreMotionEventTillDown) {
                    this.mIgnoreMotionEventTillDown = false;
                }
                this.mScrollPointerId = motionEvent0.getPointerId(0);
                float f = motionEvent0.getX();
                this.mLastTouchX = (int)(f + 0.5f);
                this.mInitialTouchX = (int)(f + 0.5f);
                float f1 = motionEvent0.getY();
                this.mLastTouchY = (int)(f1 + 0.5f);
                this.mInitialTouchY = (int)(f1 + 0.5f);
                if(this.O(motionEvent0) || this.mScrollState == 2) {
                    this.getParent().requestDisallowInterceptTouchEvent(true);
                    this.setScrollState(1);
                    this.stopNestedScroll(1);
                }
                this.mNestedOffsets[1] = 0;
                this.mNestedOffsets[0] = 0;
                this.N(0);
                return this.mScrollState == 1;
            }
            case 1: {
                this.mVelocityTracker.clear();
                this.stopNestedScroll(0);
                return this.mScrollState == 1;
            }
            case 2: {
                int v2 = motionEvent0.findPointerIndex(this.mScrollPointerId);
                if(v2 < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                float f2 = motionEvent0.getX(v2);
                float f3 = motionEvent0.getY(v2);
                if(this.mScrollState != 1) {
                    int v3 = ((int)(f3 + 0.5f)) - this.mInitialTouchY;
                    if(!z || Math.abs(((int)(f2 + 0.5f)) - this.mInitialTouchX) <= this.mTouchSlop) {
                        z2 = false;
                    }
                    else {
                        this.mLastTouchX = (int)(f2 + 0.5f);
                        z2 = true;
                    }
                    if(z1 && Math.abs(v3) > this.mTouchSlop) {
                        this.mLastTouchY = (int)(f3 + 0.5f);
                        z2 = true;
                    }
                    if(z2) {
                        this.setScrollState(1);
                        return this.mScrollState == 1;
                    }
                }
                return this.mScrollState == 1;
            }
            case 3: {
                this.d();
                return this.mScrollState == 1;
            }
            case 5: {
                this.mScrollPointerId = motionEvent0.getPointerId(v1);
                float f4 = motionEvent0.getX(v1);
                this.mLastTouchX = (int)(f4 + 0.5f);
                this.mInitialTouchX = (int)(f4 + 0.5f);
                float f5 = motionEvent0.getY(v1);
                this.mLastTouchY = (int)(f5 + 0.5f);
                this.mInitialTouchY = (int)(f5 + 0.5f);
                return this.mScrollState == 1;
            }
            case 6: {
                this.z(motionEvent0);
                return this.mScrollState == 1;
            }
            default: {
                return this.mScrollState == 1;
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        Trace.beginSection("RV OnLayout");
        this.dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        boolean z = false;
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            this.defaultOnMeasure(v, v1);
            return;
        }
        if(recyclerView$LayoutManager0.X0()) {
            int v2 = View.MeasureSpec.getMode(v);
            int v3 = View.MeasureSpec.getMode(v1);
            this.mLayout.J1(this.mRecycler, this.mState, v, v1);
            if(v2 == 0x40000000 && v3 == 0x40000000) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if(!z && this.mAdapter != null) {
                if(this.mState.e == 1) {
                    this.i();
                }
                this.mLayout.p2(v, v1);
                this.mState.j = true;
                this.j();
                this.mLayout.s2(v, v1);
                if(this.mLayout.w2()) {
                    this.mLayout.p2(View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000));
                    this.mState.j = true;
                    this.j();
                    this.mLayout.s2(v, v1);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = this.getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = this.getMeasuredHeight();
                return;
            }
            return;
        }
        if(this.mHasFixedSize) {
            this.mLayout.J1(this.mRecycler, this.mState, v, v1);
            return;
        }
        if(this.mAdapterUpdateDuringMeasure) {
            this.startInterceptRequestLayout();
            this.onEnterLayoutOrScroll();
            this.B();
            this.onExitLayoutOrScroll();
            State recyclerView$State0 = this.mState;
            if(recyclerView$State0.l) {
                recyclerView$State0.h = true;
            }
            else {
                this.mAdapterHelper.k();
                this.mState.h = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            this.stopInterceptRequestLayout(false);
        }
        else if(this.mState.l) {
            this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
            return;
        }
        Adapter recyclerView$Adapter0 = this.mAdapter;
        this.mState.f = recyclerView$Adapter0 == null ? 0 : recyclerView$Adapter0.getItemCount();
        this.startInterceptRequestLayout();
        this.mLayout.J1(this.mRecycler, this.mState, v, v1);
        this.stopInterceptRequestLayout(false);
        this.mState.h = false;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int v, Rect rect0) {
        return this.isComputingLayout() ? false : super.onRequestFocusInDescendants(v, rect0);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        this.mPendingSavedState = (SavedState)parcelable0;
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.requestLayout();
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        SavedState recyclerView$SavedState0 = this.mPendingSavedState;
        if(recyclerView$SavedState0 != null) {
            ((SavedState)parcelable0).c(recyclerView$SavedState0);
            return parcelable0;
        }
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            parcelable0.c = recyclerView$LayoutManager0.N1();
            return parcelable0;
        }
        parcelable0.c = null;
        return parcelable0;
    }

    public void onScrollStateChanged(int v) {
    }

    public void onScrolled(@Px int v, @Px int v1) {
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(v != v2 || v1 != v3) {
            this.invalidateGlows();
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        if(!this.mLayoutSuppressed && !this.mIgnoreMotionEventTillDown) {
            if(this.l(motionEvent0)) {
                this.d();
                return true;
            }
            LayoutManager recyclerView$LayoutManager0 = this.mLayout;
            if(recyclerView$LayoutManager0 == null) {
                return false;
            }
            boolean z = recyclerView$LayoutManager0.G();
            boolean z1 = this.mLayout.H();
            if(this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            int v = motionEvent0.getActionMasked();
            int v1 = motionEvent0.getActionIndex();
            if(v == 0) {
                this.mNestedOffsets[1] = 0;
                this.mNestedOffsets[0] = 0;
            }
            MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
            motionEvent1.offsetLocation(((float)this.mNestedOffsets[0]), ((float)this.mNestedOffsets[1]));
            switch(v) {
                case 0: {
                    this.mScrollPointerId = motionEvent0.getPointerId(0);
                    float f = motionEvent0.getX();
                    this.mLastTouchX = (int)(f + 0.5f);
                    this.mInitialTouchX = (int)(f + 0.5f);
                    float f1 = motionEvent0.getY();
                    this.mLastTouchY = (int)(f1 + 0.5f);
                    this.mInitialTouchY = (int)(f1 + 0.5f);
                    this.N(0);
                    this.mVelocityTracker.addMovement(motionEvent1);
                    break;
                }
                case 1: {
                    this.mVelocityTracker.addMovement(motionEvent1);
                    this.mVelocityTracker.computeCurrentVelocity(1000, ((float)this.mMaxFlingVelocity));
                    float f2 = z ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                    float f3 = z1 ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                    if(f2 == 0.0f && f3 == 0.0f || !this.fling(((int)f2), ((int)f3))) {
                        this.setScrollState(0);
                    }
                    this.J();
                    break;
                }
                case 2: {
                    int v2 = motionEvent0.findPointerIndex(this.mScrollPointerId);
                    if(v2 < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    float f4 = motionEvent0.getX(v2);
                    float f5 = motionEvent0.getY(v2);
                    int v3 = this.mLastTouchX - ((int)(f4 + 0.5f));
                    int v4 = this.mLastTouchY - ((int)(f5 + 0.5f));
                    if(this.mScrollState != 1) {
                        if(z) {
                            v3 = v3 <= 0 ? Math.min(0, v3 + this.mTouchSlop) : Math.max(0, v3 - this.mTouchSlop);
                            z2 = v3 == 0 ? false : true;
                        }
                        else {
                            z2 = false;
                        }
                        if(z1) {
                            v4 = v4 <= 0 ? Math.min(0, v4 + this.mTouchSlop) : Math.max(0, v4 - this.mTouchSlop);
                            if(v4 != 0) {
                                z2 = true;
                            }
                        }
                        if(z2) {
                            this.setScrollState(1);
                        }
                    }
                    if(this.mScrollState == 1) {
                        this.mReusableIntPair[0] = 0;
                        this.mReusableIntPair[1] = 0;
                        int v5 = v3 - this.F(v3, motionEvent0.getY());
                        int v6 = v4 - this.G(v4, motionEvent0.getX());
                        if(this.dispatchNestedPreScroll((z ? v5 : 0), (z1 ? v6 : 0), this.mReusableIntPair, this.mScrollOffset, 0)) {
                            v5 -= this.mReusableIntPair[0];
                            v6 -= this.mReusableIntPair[1];
                            this.mNestedOffsets[0] += this.mScrollOffset[0];
                            this.mNestedOffsets[1] += this.mScrollOffset[1];
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        this.mLastTouchX = ((int)(f4 + 0.5f)) - this.mScrollOffset[0];
                        this.mLastTouchY = ((int)(f5 + 0.5f)) - this.mScrollOffset[1];
                        if(this.scrollByInternal((z ? v5 : 0), (z1 ? v6 : 0), motionEvent0, 0)) {
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        GapWorker gapWorker0 = this.mGapWorker;
                        if(gapWorker0 != null && (v5 != 0 || v6 != 0)) {
                            gapWorker0.f(this, v5, v6);
                        }
                    }
                    this.mVelocityTracker.addMovement(motionEvent1);
                    break;
                }
                case 3: {
                    this.d();
                    this.mVelocityTracker.addMovement(motionEvent1);
                    break;
                }
                case 5: {
                    this.mScrollPointerId = motionEvent0.getPointerId(v1);
                    float f6 = motionEvent0.getX(v1);
                    this.mLastTouchX = (int)(f6 + 0.5f);
                    this.mInitialTouchX = (int)(f6 + 0.5f);
                    float f7 = motionEvent0.getY(v1);
                    this.mLastTouchY = (int)(f7 + 0.5f);
                    this.mInitialTouchY = (int)(f7 + 0.5f);
                    this.mVelocityTracker.addMovement(motionEvent1);
                    break;
                }
                case 6: {
                    this.z(motionEvent0);
                    this.mVelocityTracker.addMovement(motionEvent1);
                    break;
                }
                default: {
                    this.mVelocityTracker.addMovement(motionEvent1);
                }
            }
            motionEvent1.recycle();
            return true;
        }
        return false;
    }

    private boolean p(int v, int v1, int v2, int v3) {
        int v5;
        int v4;
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if(this.mLayoutSuppressed) {
            return false;
        }
        boolean z = recyclerView$LayoutManager0.G();
        boolean z1 = this.mLayout.H();
        if(!z || Math.abs(v) < v2) {
            v = 0;
        }
        if(!z1 || Math.abs(v1) < v2) {
            v1 = 0;
        }
        if(v == 0 && v1 == 0) {
            return false;
        }
        if(v == 0) {
            v4 = 0;
        }
        else if(this.mLeftGlow != null && EdgeEffectCompat.d(this.mLeftGlow) != 0.0f) {
            if(this.M(this.mLeftGlow, -v, this.getWidth())) {
                this.mLeftGlow.onAbsorb(-v);
                v = 0;
            }
            v4 = v;
            v = 0;
        }
        else if(this.mRightGlow == null || EdgeEffectCompat.d(this.mRightGlow) == 0.0f) {
            v4 = 0;
        }
        else {
            if(this.M(this.mRightGlow, v, this.getWidth())) {
                this.mRightGlow.onAbsorb(v);
                v = 0;
            }
            v4 = v;
            v = 0;
        }
        if(v1 == 0) {
            v5 = 0;
            v1 = 0;
        }
        else if(this.mTopGlow != null && EdgeEffectCompat.d(this.mTopGlow) != 0.0f) {
            if(this.M(this.mTopGlow, -v1, this.getHeight())) {
                this.mTopGlow.onAbsorb(-v1);
                v1 = 0;
            }
            v5 = 0;
        }
        else if(this.mBottomGlow == null || EdgeEffectCompat.d(this.mBottomGlow) == 0.0f) {
            v5 = v1;
            v1 = 0;
        }
        else {
            if(this.M(this.mBottomGlow, v1, this.getHeight())) {
                this.mBottomGlow.onAbsorb(v1);
                v1 = 0;
            }
            v5 = 0;
        }
        if(v4 != 0 || v1 != 0) {
            v4 = Math.max(-v3, Math.min(v4, v3));
            v1 = Math.max(-v3, Math.min(v1, v3));
            this.N(1);
            this.mViewFlinger.b(v4, v1);
        }
        if(v == 0 && v5 == 0) {
            return v4 != 0 || v1 != 0;
        }
        if(!this.dispatchNestedPreFling(((float)v), ((float)v5))) {
            boolean z2 = z || z1;
            this.dispatchNestedFling(((float)v), ((float)v5), z2);
            if(this.mOnFlingListener != null && this.mOnFlingListener.a(v, v5)) {
                return true;
            }
            if(z2) {
                this.N(1);
                this.mViewFlinger.b(Math.max(-v3, Math.min(v, v3)), Math.max(-v3, Math.min(v5, v3)));
                return true;
            }
        }
        return false;
    }

    void postAnimationRunner() {
        if(!this.mPostedAnimatorRunner && this.mIsAttached) {
            ViewCompat.x1(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent |= z;
        this.mDataSetHasChangedAfterLayout = true;
        this.markKnownViewsInvalid();
    }

    private int q(View view0) {
        int v = view0.getId();
        while(!view0.isFocused() && view0 instanceof ViewGroup && view0.hasFocus()) {
            view0 = ((ViewGroup)view0).getFocusedChild();
            if(view0.getId() != -1) {
                v = view0.getId();
            }
        }
        return v;
    }

    private String r(Context context0, String s) {
        if(s.charAt(0) == 46) {
            return "com.dcinside.app.android" + s;
        }
        return s.contains(".") ? s : RecyclerView.class.getPackage().getName() + '.' + s;
    }

    void recordAnimationInfoIfBouncedHiddenView(ViewHolder recyclerView$ViewHolder0, ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0) {
        recyclerView$ViewHolder0.setFlags(0, 0x2000);
        if(this.mState.i && recyclerView$ViewHolder0.isUpdated() && !recyclerView$ViewHolder0.isRemoved() && !recyclerView$ViewHolder0.shouldIgnore()) {
            long v = this.getChangedHolderKey(recyclerView$ViewHolder0);
            this.mViewInfoStore.c(v, recyclerView$ViewHolder0);
        }
        this.mViewInfoStore.e(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0);
    }

    void removeAndRecycleViews() {
        ItemAnimator recyclerView$ItemAnimator0 = this.mItemAnimator;
        if(recyclerView$ItemAnimator0 != null) {
            recyclerView$ItemAnimator0.l();
        }
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.W1(this.mRecycler);
            this.mLayout.X1(this.mRecycler);
        }
        this.mRecycler.d();
    }

    boolean removeAnimatingView(View view0) {
        this.startInterceptRequestLayout();
        boolean z = this.mChildHelper.r(view0);
        if(z) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            this.mRecycler.P(recyclerView$ViewHolder0);
            this.mRecycler.I(recyclerView$ViewHolder0);
            if(RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "after removing animated view: " + view0 + ", " + this);
            }
        }
        this.stopInterceptRequestLayout(!z);
        return z;
    }

    @Override  // android.view.ViewGroup
    protected void removeDetachedView(View view0, boolean z) {
        ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
        if(recyclerView$ViewHolder0 != null) {
            if(recyclerView$ViewHolder0.isTmpDetached()) {
                recyclerView$ViewHolder0.clearTmpDetachFlag();
                view0.clearAnimation();
                this.dispatchChildDetached(view0);
                super.removeDetachedView(view0, z);
                return;
            }
            if(!recyclerView$ViewHolder0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + recyclerView$ViewHolder0 + this.exceptionLabel());
            }
        }
        else if(RecyclerView.sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view0 + this.exceptionLabel());
        }
        view0.clearAnimation();
        this.dispatchChildDetached(view0);
        super.removeDetachedView(view0, z);
    }

    public void removeItemDecoration(@NonNull ItemDecoration recyclerView$ItemDecoration0) {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.B("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(recyclerView$ItemDecoration0);
        if(this.mItemDecorations.isEmpty()) {
            this.setWillNotDraw(this.getOverScrollMode() == 2);
        }
        this.markItemDecorInsetsDirty();
        this.requestLayout();
    }

    public void removeItemDecorationAt(int v) {
        int v1 = this.getItemDecorationCount();
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException(v + " is an invalid index for size " + v1);
        }
        this.removeItemDecoration(this.getItemDecorationAt(v));
    }

    public void removeOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener recyclerView$OnChildAttachStateChangeListener0) {
        List list0 = this.mOnChildAttachStateListeners;
        if(list0 == null) {
            return;
        }
        list0.remove(recyclerView$OnChildAttachStateChangeListener0);
    }

    public void removeOnItemTouchListener(@NonNull OnItemTouchListener recyclerView$OnItemTouchListener0) {
        this.mOnItemTouchListeners.remove(recyclerView$OnItemTouchListener0);
        if(this.mInterceptingOnItemTouchListener == recyclerView$OnItemTouchListener0) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull OnScrollListener recyclerView$OnScrollListener0) {
        List list0 = this.mScrollListeners;
        if(list0 != null) {
            list0.remove(recyclerView$OnScrollListener0);
        }
    }

    public void removeRecyclerListener(@NonNull RecyclerListener recyclerView$RecyclerListener0) {
        this.mRecyclerListeners.remove(recyclerView$RecyclerListener0);
    }

    void repositionShadowingViews() {
        int v = this.mChildHelper.g();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.mChildHelper.f(v1);
            ViewHolder recyclerView$ViewHolder0 = this.getChildViewHolder(view0);
            if(recyclerView$ViewHolder0 != null) {
                ViewHolder recyclerView$ViewHolder1 = recyclerView$ViewHolder0.mShadowingHolder;
                if(recyclerView$ViewHolder1 != null) {
                    View view1 = recyclerView$ViewHolder1.itemView;
                    int v2 = view0.getLeft();
                    int v3 = view0.getTop();
                    if(v2 != view1.getLeft() || v3 != view1.getTop()) {
                        view1.layout(v2, v3, view1.getWidth() + v2, view1.getHeight() + v3);
                    }
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void requestChildFocus(View view0, View view1) {
        if(!this.mLayout.L1(this, this.mState, view0, view1) && view1 != null) {
            this.H(view0, view1);
        }
        super.requestChildFocus(view0, view1);
    }

    @Override  // android.view.ViewGroup
    public boolean requestChildRectangleOnScreen(View view0, Rect rect0, boolean z) {
        return this.mLayout.e2(this, view0, rect0, z);
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int v = this.mOnItemTouchListeners.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((OnItemTouchListener)this.mOnItemTouchListeners.get(v1)).j(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if(this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
            return;
        }
        this.mLayoutWasDefered = true;
    }

    private float s(int v) {
        return (float)(((double)(this.mPhysicalCoef * 0.015f)) * Math.exp(((double)RecyclerView.DECELERATION_RATE) / (((double)RecyclerView.DECELERATION_RATE) - 1.0) * Math.log(((float)Math.abs(v)) * 0.35f / (this.mPhysicalCoef * 0.015f))));
    }

    void saveOldPositions() {
        int v = this.mChildHelper.j();
        for(int v1 = 0; v1 < v; ++v1) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.i(v1));
            if(RecyclerView.sDebugAssertionsEnabled && recyclerView$ViewHolder0.mPosition == -1 && !recyclerView$ViewHolder0.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + this.exceptionLabel());
            }
            if(!recyclerView$ViewHolder0.shouldIgnore()) {
                recyclerView$ViewHolder0.saveOldPosition();
            }
        }
    }

    @Override  // android.view.View
    public void scrollBy(int v, int v1) {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if(this.mLayoutSuppressed) {
            return;
        }
        boolean z = recyclerView$LayoutManager0.G();
        boolean z1 = this.mLayout.H();
        if(z || z1) {
            if(!z) {
                v = 0;
            }
            if(!z1) {
                v1 = 0;
            }
            this.scrollByInternal(v, v1, null, 0);
        }
    }

    boolean scrollByInternal(int v, int v1, MotionEvent motionEvent0, int v2) {
        int v8;
        int v7;
        int v6;
        int v5;
        this.consumePendingUpdateOperations();
        if(this.mAdapter == null) {
            v5 = 0;
            v6 = 0;
            v7 = 0;
            v8 = 0;
        }
        else {
            this.mReusableIntPair[0] = 0;
            this.mReusableIntPair[1] = 0;
            this.scrollStep(v, v1, this.mReusableIntPair);
            int v3 = this.mReusableIntPair[0];
            int v4 = v1 - this.mReusableIntPair[1];
            v5 = this.mReusableIntPair[1];
            v6 = v3;
            v7 = v - v3;
            v8 = v4;
        }
        if(!this.mItemDecorations.isEmpty()) {
            this.invalidate();
        }
        this.mReusableIntPair[0] = 0;
        this.mReusableIntPair[1] = 0;
        this.dispatchNestedScroll(v6, v5, v7, v8, this.mScrollOffset, v2, this.mReusableIntPair);
        int v9 = this.mReusableIntPair[0];
        int v10 = this.mReusableIntPair[1];
        int v11 = this.mLastTouchX;
        int v12 = this.mScrollOffset[0];
        this.mLastTouchX = v11 - v12;
        int v13 = this.mLastTouchY;
        int v14 = this.mScrollOffset[1];
        this.mLastTouchY = v13 - v14;
        this.mNestedOffsets[0] += v12;
        this.mNestedOffsets[1] += v14;
        if(this.getOverScrollMode() != 2) {
            if(motionEvent0 != null && !MotionEventCompat.l(motionEvent0, 0x2002)) {
                this.C(motionEvent0.getX(), ((float)(v7 - v9)), motionEvent0.getY(), ((float)(v8 - v10)));
                if(Build.VERSION.SDK_INT >= 0x1F && MotionEventCompat.l(motionEvent0, 0x400000)) {
                    this.E();
                }
            }
            this.considerReleasingGlowsOnScroll(v, v1);
        }
        if(v6 != 0 || v5 != 0) {
            this.dispatchOnScrolled(v6, v5);
        }
        if(!this.awakenScrollBars()) {
            this.invalidate();
        }
        return v9 != 0 || v10 != 0 || v6 != 0 || v5 != 0;
    }

    void scrollStep(int v, int v1, @Nullable int[] arr_v) {
        this.startInterceptRequestLayout();
        this.onEnterLayoutOrScroll();
        Trace.beginSection("RV Scroll");
        this.fillRemainingScrollValues(this.mState);
        int v2 = v == 0 ? 0 : this.mLayout.j2(v, this.mRecycler, this.mState);
        int v3 = v1 == 0 ? 0 : this.mLayout.l2(v1, this.mRecycler, this.mState);
        Trace.endSection();
        this.repositionShadowingViews();
        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
        if(arr_v != null) {
            arr_v[0] = v2;
            arr_v[1] = v3;
        }
    }

    @Override  // android.view.View
    public void scrollTo(int v, int v1) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int v) {
        if(this.mLayoutSuppressed) {
            return;
        }
        this.stopScroll();
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        recyclerView$LayoutManager0.k2(v);
        this.awakenScrollBars();
    }

    @Override  // android.view.View
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent0) {
        if(this.shouldDeferAccessibilityEvent(accessibilityEvent0)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent0);
    }

    public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate0) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate0;
        ViewCompat.J1(this, recyclerViewAccessibilityDelegate0);
    }

    public void setAdapter(@Nullable Adapter recyclerView$Adapter0) {
        this.setLayoutFrozen(false);
        this.L(recyclerView$Adapter0, false, true);
        this.processDataSetCompletelyChanged(false);
        this.requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback recyclerView$ChildDrawingOrderCallback0) {
        if(recyclerView$ChildDrawingOrderCallback0 == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = recyclerView$ChildDrawingOrderCallback0;
        this.setChildrenDrawingOrderEnabled(recyclerView$ChildDrawingOrderCallback0 != null);
    }

    @VisibleForTesting
    boolean setChildImportantForAccessibilityInternal(ViewHolder recyclerView$ViewHolder0, int v) {
        if(this.isComputingLayout()) {
            recyclerView$ViewHolder0.mPendingAccessibilityState = v;
            this.mPendingAccessibilityImportanceChange.add(recyclerView$ViewHolder0);
            return false;
        }
        recyclerView$ViewHolder0.itemView.setImportantForAccessibility(v);
        return true;
    }

    @Override  // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if(z != this.mClipToPadding) {
            this.invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if(this.mFirstLayoutComplete) {
            this.requestLayout();
        }
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        RecyclerView.sDebugAssertionsEnabled = z;
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory recyclerView$EdgeEffectFactory0) {
        Preconditions.l(recyclerView$EdgeEffectFactory0);
        this.mEdgeEffectFactory = recyclerView$EdgeEffectFactory0;
        this.invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(@Nullable ItemAnimator recyclerView$ItemAnimator0) {
        ItemAnimator recyclerView$ItemAnimator1 = this.mItemAnimator;
        if(recyclerView$ItemAnimator1 != null) {
            recyclerView$ItemAnimator1.l();
            this.mItemAnimator.A(null);
        }
        this.mItemAnimator = recyclerView$ItemAnimator0;
        if(recyclerView$ItemAnimator0 != null) {
            recyclerView$ItemAnimator0.A(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int v) {
        this.mRecycler.M(v);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        this.suppressLayout(z);
    }

    public void setLayoutManager(@Nullable LayoutManager recyclerView$LayoutManager0) {
        if(recyclerView$LayoutManager0 == this.mLayout) {
            return;
        }
        this.stopScroll();
        if(this.mLayout == null) {
            this.mRecycler.d();
        }
        else {
            ItemAnimator recyclerView$ItemAnimator0 = this.mItemAnimator;
            if(recyclerView$ItemAnimator0 != null) {
                recyclerView$ItemAnimator0.l();
            }
            this.mLayout.W1(this.mRecycler);
            this.mLayout.X1(this.mRecycler);
            this.mRecycler.d();
            if(this.mIsAttached) {
                this.mLayout.Z(this, this.mRecycler);
            }
            this.mLayout.u2(null);
            this.mLayout = null;
        }
        this.mChildHelper.o();
        this.mLayout = recyclerView$LayoutManager0;
        if(recyclerView$LayoutManager0 != null) {
            if(recyclerView$LayoutManager0.b != null) {
                throw new IllegalArgumentException("LayoutManager " + recyclerView$LayoutManager0 + " is already attached to a RecyclerView:" + recyclerView$LayoutManager0.b.exceptionLabel());
            }
            recyclerView$LayoutManager0.u2(this);
            if(this.mIsAttached) {
                this.mLayout.Y(this);
            }
        }
        this.mRecycler.Q();
        this.requestLayout();
    }

    @Override  // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition0) {
        if(layoutTransition0 != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.getScrollingChildHelper().p(z);
    }

    public void setOnFlingListener(@Nullable OnFlingListener recyclerView$OnFlingListener0) {
        this.mOnFlingListener = recyclerView$OnFlingListener0;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener recyclerView$OnScrollListener0) {
        this.mScrollListener = recyclerView$OnScrollListener0;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(@Nullable RecycledViewPool recyclerView$RecycledViewPool0) {
        this.mRecycler.K(recyclerView$RecycledViewPool0);
    }

    @Deprecated
    public void setRecyclerListener(@Nullable RecyclerListener recyclerView$RecyclerListener0) {
        this.mRecyclerListener = recyclerView$RecyclerListener0;
    }

    void setScrollState(int v) {
        if(v == this.mScrollState) {
            return;
        }
        if(RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "setting scroll state to " + v + " from " + this.mScrollState, new Exception());
        }
        this.mScrollState = v;
        if(v != 2) {
            this.P();
        }
        this.dispatchOnScrollStateChanged(v);
    }

    public void setScrollingTouchSlop(int v) {
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(this.getContext());
        switch(v) {
            case 0: {
                break;
            }
            case 1: {
                this.mTouchSlop = viewConfiguration0.getScaledPagingTouchSlop();
                return;
            }
            default: {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + v + "; using default value");
                break;
            }
        }
        this.mTouchSlop = viewConfiguration0.getScaledTouchSlop();
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        RecyclerView.sVerboseLoggingEnabled = z;
    }

    public void setViewCacheExtension(@Nullable ViewCacheExtension recyclerView$ViewCacheExtension0) {
        this.mRecycler.L(recyclerView$ViewCacheExtension0);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        int v = 0;
        if(this.isComputingLayout()) {
            int v1 = accessibilityEvent0 == null ? 0 : AccessibilityEventCompat.d(accessibilityEvent0);
            if(v1 != 0) {
                v = v1;
            }
            this.mEatenAccessibilityChangeFlags |= v;
            return true;
        }
        return false;
    }

    public void smoothScrollBy(@Px int v, @Px int v1) {
        this.smoothScrollBy(v, v1, null);
    }

    public void smoothScrollBy(@Px int v, @Px int v1, @Nullable Interpolator interpolator0) {
        this.smoothScrollBy(v, v1, interpolator0, 0x80000000);
    }

    public void smoothScrollBy(@Px int v, @Px int v1, @Nullable Interpolator interpolator0, int v2) {
        this.smoothScrollBy(v, v1, interpolator0, v2, false);
    }

    void smoothScrollBy(@Px int v, @Px int v1, @Nullable Interpolator interpolator0, int v2, boolean z) {
        int v3 = 0;
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if(this.mLayoutSuppressed) {
            return;
        }
        if(!recyclerView$LayoutManager0.G()) {
            v = 0;
        }
        if(!this.mLayout.H()) {
            v1 = 0;
        }
        if(v != 0 || v1 != 0) {
            if(v2 != 0x80000000 && v2 <= 0) {
                this.scrollBy(v, v1);
                return;
            }
            if(z) {
                if(v != 0) {
                    v3 = 1;
                }
                if(v1 != 0) {
                    v3 |= 2;
                }
                this.startNestedScroll(v3, 1);
            }
            this.mViewFlinger.e(v, v1, v2, interpolator0);
        }
    }

    public void smoothScrollToPosition(int v) {
        if(this.mLayoutSuppressed) {
            return;
        }
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        recyclerView$LayoutManager0.y2(this, this.mState, v);
    }

    void startInterceptRequestLayout() {
        int v = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = v;
        if(v == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int v) {
        return this.getScrollingChildHelper().r(v);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int v, int v1) {
        return this.getScrollingChildHelper().s(v, v1);
    }

    void stopInterceptRequestLayout(boolean z) {
        if(this.mInterceptRequestLayoutDepth < 1) {
            if(RecyclerView.sDebugAssertionsEnabled) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + this.exceptionLabel());
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if(!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if(this.mInterceptRequestLayoutDepth == 1) {
            if(z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                this.dispatchLayout();
            }
            if(!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        --this.mInterceptRequestLayoutDepth;
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.getScrollingChildHelper().t();
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int v) {
        this.getScrollingChildHelper().u(v);
    }

    public void stopScroll() {
        this.setScrollState(0);
        this.P();
    }

    @Override  // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if(z != this.mLayoutSuppressed) {
            this.assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if(!z) {
                this.mLayoutSuppressed = false;
                if(this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    this.requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long v = SystemClock.uptimeMillis();
            this.onTouchEvent(MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            this.stopScroll();
        }
    }

    public void swapAdapter(@Nullable Adapter recyclerView$Adapter0, boolean z) {
        this.setLayoutFrozen(false);
        this.L(recyclerView$Adapter0, true, z);
        this.processDataSetCompletelyChanged(true);
        this.requestLayout();
    }

    private void t(long v, ViewHolder recyclerView$ViewHolder0, ViewHolder recyclerView$ViewHolder1) {
        int v1 = this.mChildHelper.g();
        for(int v2 = 0; v2 < v1; ++v2) {
            ViewHolder recyclerView$ViewHolder2 = RecyclerView.getChildViewHolderInt(this.mChildHelper.f(v2));
            if(recyclerView$ViewHolder2 != recyclerView$ViewHolder0 && this.getChangedHolderKey(recyclerView$ViewHolder2) == v) {
                throw this.mAdapter == null || !this.mAdapter.hasStableIds() ? new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + recyclerView$ViewHolder2 + " \n View Holder 2:" + recyclerView$ViewHolder0 + this.exceptionLabel()) : new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + recyclerView$ViewHolder2 + " \n View Holder 2:" + recyclerView$ViewHolder0 + this.exceptionLabel());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + recyclerView$ViewHolder1 + " cannot be found but it is necessary for " + recyclerView$ViewHolder0 + this.exceptionLabel());
    }

    private boolean u() {
        int v = this.mChildHelper.g();
        for(int v1 = 0; v1 < v; ++v1) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.f(v1));
            if(recyclerView$ViewHolder0 != null && !recyclerView$ViewHolder0.shouldIgnore() && recyclerView$ViewHolder0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void v() {
        if(ViewCompat.a0(this) == 0) {
            ViewCompat.d2(this, 8);
        }
    }

    void viewRangeUpdate(int v, int v1, Object object0) {
        int v2 = this.mChildHelper.j();
        for(int v3 = 0; v3 < v2; ++v3) {
            View view0 = this.mChildHelper.i(v3);
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            if(recyclerView$ViewHolder0 != null && !recyclerView$ViewHolder0.shouldIgnore() && (recyclerView$ViewHolder0.mPosition >= v && recyclerView$ViewHolder0.mPosition < v + v1)) {
                recyclerView$ViewHolder0.addFlags(2);
                recyclerView$ViewHolder0.addChangePayload(object0);
                ((LayoutParams)view0.getLayoutParams()).c = true;
            }
        }
        this.mRecycler.S(v, v1);
    }

    private void w() {
        this.mChildHelper = new ChildHelper(new androidx.recyclerview.widget.ChildHelper.Callback() {
            final RecyclerView a;

            @Override  // androidx.recyclerview.widget.ChildHelper$Callback
            public View a(int v) {
                return RecyclerView.this.getChildAt(v);
            }

            @Override  // androidx.recyclerview.widget.ChildHelper$Callback
            public void b(View view0) {
                ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
                if(recyclerView$ViewHolder0 != null) {
                    recyclerView$ViewHolder0.onEnteredHiddenState(RecyclerView.this);
                }
            }

            @Override  // androidx.recyclerview.widget.ChildHelper$Callback
            public int c() {
                return RecyclerView.this.getChildCount();
            }

            @Override  // androidx.recyclerview.widget.ChildHelper$Callback
            public ViewHolder d(View view0) {
                return RecyclerView.getChildViewHolderInt(view0);
            }

            @Override  // androidx.recyclerview.widget.ChildHelper$Callback
            public void e(View view0, int v) {
                RecyclerView.this.addView(view0, v);
                RecyclerView.this.dispatchChildAttached(view0);
            }

            @Override  // androidx.recyclerview.widget.ChildHelper$Callback
            public void f() {
                int v = this.c();
                for(int v1 = 0; v1 < v; ++v1) {
                    View view0 = this.a(v1);
                    RecyclerView.this.dispatchChildDetached(view0);
                    view0.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }

            @Override  // androidx.recyclerview.widget.ChildHelper$Callback
            public void g(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
                ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
                if(recyclerView$ViewHolder0 != null) {
                    if(!recyclerView$ViewHolder0.isTmpDetached() && !recyclerView$ViewHolder0.shouldIgnore()) {
                        throw new IllegalArgumentException("Called attach on a child which is not detached: " + recyclerView$ViewHolder0 + RecyclerView.this.exceptionLabel());
                    }
                    if(RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "reAttach " + recyclerView$ViewHolder0);
                    }
                    recyclerView$ViewHolder0.clearTmpDetachFlag();
                }
                else if(!RecyclerView.sDebugAssertionsEnabled) {
                }
                else {
                    throw new IllegalArgumentException("No ViewHolder found for child: " + view0 + ", index: " + v + RecyclerView.this.exceptionLabel());
                }
                RecyclerView.this.attachViewToParent(view0, v, viewGroup$LayoutParams0);
            }

            @Override  // androidx.recyclerview.widget.ChildHelper$Callback
            public void h(int v) {
                View view0 = this.a(v);
                if(view0 != null) {
                    ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
                    if(recyclerView$ViewHolder0 == null) {
                        RecyclerView.this.detachViewFromParent(v);
                        return;
                    }
                    if(recyclerView$ViewHolder0.isTmpDetached() && !recyclerView$ViewHolder0.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + recyclerView$ViewHolder0 + RecyclerView.this.exceptionLabel());
                    }
                    if(RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "tmpDetach " + recyclerView$ViewHolder0);
                    }
                    recyclerView$ViewHolder0.addFlags(0x100);
                }
                else if(!RecyclerView.sDebugAssertionsEnabled) {
                }
                else {
                    throw new IllegalArgumentException("No view at offset " + v + RecyclerView.this.exceptionLabel());
                }
                RecyclerView.this.detachViewFromParent(v);
            }

            @Override  // androidx.recyclerview.widget.ChildHelper$Callback
            public int i(View view0) {
                return RecyclerView.this.indexOfChild(view0);
            }

            @Override  // androidx.recyclerview.widget.ChildHelper$Callback
            public void j(View view0) {
                ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
                if(recyclerView$ViewHolder0 != null) {
                    recyclerView$ViewHolder0.onLeftHiddenState(RecyclerView.this);
                }
            }

            @Override  // androidx.recyclerview.widget.ChildHelper$Callback
            public void k(int v) {
                View view0 = RecyclerView.this.getChildAt(v);
                if(view0 != null) {
                    RecyclerView.this.dispatchChildDetached(view0);
                    view0.clearAnimation();
                }
                RecyclerView.this.removeViewAt(v);
            }
        });
    }

    private boolean x(View view0, View view1, int v) {
        int v9;
        if(view1 == null || view1 == this || view1 == view0 || this.findContainingItemView(view1) == null) {
            return false;
        }
        if(view0 == null) {
            return true;
        }
        if(this.findContainingItemView(view0) == null) {
            return true;
        }
        int v1 = view0.getWidth();
        int v2 = view0.getHeight();
        this.mTempRect.set(0, 0, v1, v2);
        int v3 = view1.getWidth();
        int v4 = view1.getHeight();
        this.mTempRect2.set(0, 0, v3, v4);
        this.offsetDescendantRectToMyCoords(view0, this.mTempRect);
        this.offsetDescendantRectToMyCoords(view1, this.mTempRect2);
        int v5 = -1;
        int v6 = this.mLayout.A0() == 1 ? -1 : 1;
        Rect rect0 = this.mTempRect;
        int v7 = rect0.left;
        Rect rect1 = this.mTempRect2;
        int v8 = rect1.left;
        if(v7 >= v8 && rect0.right > v8 || rect0.right >= rect1.right) {
            v9 = rect0.right <= rect1.right && v7 < rect1.right || v7 <= v8 ? 0 : -1;
        }
        else {
            v9 = 1;
        }
        int v10 = rect0.top;
        int v11 = rect1.top;
        if((v10 < v11 || rect0.bottom <= v11) && rect0.bottom < rect1.bottom) {
            v5 = 1;
        }
        else if(rect0.bottom <= rect1.bottom && v10 < rect1.bottom || v10 <= v11) {
            v5 = 0;
        }
        switch(v) {
            case 1: {
                return v5 < 0 || v5 == 0 && v9 * v6 < 0;
            }
            case 2: {
                return v5 > 0 || v5 == 0 && v9 * v6 > 0;
            }
            case 17: {
                return v9 < 0;
            }
            case 33: {
                return v5 < 0;
            }
            case 66: {
                return v9 > 0;
            }
            case 130: {
                return v5 > 0;
            }
            default: {
                throw new IllegalArgumentException("Invalid direction: " + v + this.exceptionLabel());
            }
        }
    }

    private void y(int v, int v1, @Nullable MotionEvent motionEvent0, int v2) {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if(this.mLayoutSuppressed) {
            return;
        }
        int v3 = 0;
        this.mReusableIntPair[0] = 0;
        this.mReusableIntPair[1] = 0;
        boolean z = recyclerView$LayoutManager0.G();
        boolean z1 = this.mLayout.H();
        int v4 = z1 ? z | 2 : z;
        float f = motionEvent0 == null ? ((float)this.getHeight()) / 2.0f : motionEvent0.getY();
        float f1 = motionEvent0 == null ? ((float)this.getWidth()) / 2.0f : motionEvent0.getX();
        int v5 = v - this.F(v, f);
        int v6 = v1 - this.G(v1, f1);
        this.startNestedScroll(v4, v2);
        if(this.dispatchNestedPreScroll((z ? v5 : 0), (z1 ? v6 : 0), this.mReusableIntPair, this.mScrollOffset, v2)) {
            v5 -= this.mReusableIntPair[0];
            v6 -= this.mReusableIntPair[1];
        }
        if(z1) {
            v3 = v6;
        }
        this.scrollByInternal((z ? v5 : 0), v3, motionEvent0, v2);
        GapWorker gapWorker0 = this.mGapWorker;
        if(gapWorker0 != null && (v5 != 0 || v6 != 0)) {
            gapWorker0.f(this, v5, v6);
        }
        this.stopNestedScroll(v2);
    }

    private void z(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionIndex();
        if(motionEvent0.getPointerId(v) == this.mScrollPointerId) {
            int v1 = v == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent0.getPointerId(v1);
            float f = motionEvent0.getX(v1);
            this.mLastTouchX = (int)(f + 0.5f);
            this.mInitialTouchX = (int)(f + 0.5f);
            float f1 = motionEvent0.getY(v1);
            this.mLastTouchY = (int)(f1 + 0.5f);
            this.mInitialTouchY = (int)(f1 + 0.5f);
        }
    }
}

