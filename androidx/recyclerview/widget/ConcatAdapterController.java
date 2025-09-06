package androidx.recyclerview.widget;

import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

class ConcatAdapterController implements Callback {
    static class WrapperAndLocalPosition {
        NestedAdapterWrapper a;
        int b;
        boolean c;

    }

    private final ConcatAdapter a;
    private final ViewTypeStorage b;
    private List c;
    private final IdentityHashMap d;
    private List e;
    private WrapperAndLocalPosition f;
    @NonNull
    private final StableIdMode g;
    private final StableIdStorage h;

    ConcatAdapterController(ConcatAdapter concatAdapter0, Config concatAdapter$Config0) {
        this.c = new ArrayList();
        this.d = new IdentityHashMap();
        this.e = new ArrayList();
        this.f = new WrapperAndLocalPosition();
        this.a = concatAdapter0;
        this.b = concatAdapter$Config0.a ? new IsolatedViewTypeStorage() : new SharedIdRangeViewTypeStorage();
        StableIdMode concatAdapter$Config$StableIdMode0 = concatAdapter$Config0.b;
        this.g = concatAdapter$Config$StableIdMode0;
        if(concatAdapter$Config$StableIdMode0 == StableIdMode.a) {
            this.h = new NoStableIdStorage();
            return;
        }
        if(concatAdapter$Config$StableIdMode0 == StableIdMode.b) {
            this.h = new IsolatedStableIdStorage();
            return;
        }
        if(concatAdapter$Config$StableIdMode0 != StableIdMode.c) {
            throw new IllegalArgumentException("unknown stable id mode");
        }
        this.h = new SharedPoolStableIdStorage();
    }

    public void A(RecyclerView recyclerView0) {
        if(this.z(recyclerView0)) {
            return;
        }
        this.c.add(new WeakReference(recyclerView0));
        for(Object object0: this.e) {
            ((NestedAdapterWrapper)object0).c.onAttachedToRecyclerView(recyclerView0);
        }
    }

    public void B(ViewHolder recyclerView$ViewHolder0, int v) {
        WrapperAndLocalPosition concatAdapterController$WrapperAndLocalPosition0 = this.n(v);
        this.d.put(recyclerView$ViewHolder0, concatAdapterController$WrapperAndLocalPosition0.a);
        concatAdapterController$WrapperAndLocalPosition0.a.e(recyclerView$ViewHolder0, concatAdapterController$WrapperAndLocalPosition0.b);
        this.I(concatAdapterController$WrapperAndLocalPosition0);
    }

    public ViewHolder C(ViewGroup viewGroup0, int v) {
        return this.b.a(v).f(viewGroup0, v);
    }

    public void D(RecyclerView recyclerView0) {
        for(int v = this.c.size() - 1; v >= 0; --v) {
            WeakReference weakReference0 = (WeakReference)this.c.get(v);
            if(weakReference0.get() == null) {
                this.c.remove(v);
            }
            else if(weakReference0.get() == recyclerView0) {
                this.c.remove(v);
                break;
            }
        }
        for(Object object0: this.e) {
            ((NestedAdapterWrapper)object0).c.onDetachedFromRecyclerView(recyclerView0);
        }
    }

    public boolean E(ViewHolder recyclerView$ViewHolder0) {
        NestedAdapterWrapper nestedAdapterWrapper0 = (NestedAdapterWrapper)this.d.get(recyclerView$ViewHolder0);
        if(nestedAdapterWrapper0 == null) {
            throw new IllegalStateException("Cannot find wrapper for " + recyclerView$ViewHolder0 + ", seems like it is not bound by this adapter: " + this);
        }
        this.d.remove(recyclerView$ViewHolder0);
        return nestedAdapterWrapper0.c.onFailedToRecycleView(recyclerView$ViewHolder0);
    }

    public void F(ViewHolder recyclerView$ViewHolder0) {
        this.w(recyclerView$ViewHolder0).c.onViewAttachedToWindow(recyclerView$ViewHolder0);
    }

    public void G(ViewHolder recyclerView$ViewHolder0) {
        this.w(recyclerView$ViewHolder0).c.onViewDetachedFromWindow(recyclerView$ViewHolder0);
    }

    public void H(ViewHolder recyclerView$ViewHolder0) {
        NestedAdapterWrapper nestedAdapterWrapper0 = (NestedAdapterWrapper)this.d.get(recyclerView$ViewHolder0);
        if(nestedAdapterWrapper0 == null) {
            throw new IllegalStateException("Cannot find wrapper for " + recyclerView$ViewHolder0 + ", seems like it is not bound by this adapter: " + this);
        }
        nestedAdapterWrapper0.c.onViewRecycled(recyclerView$ViewHolder0);
        this.d.remove(recyclerView$ViewHolder0);
    }

    private void I(WrapperAndLocalPosition concatAdapterController$WrapperAndLocalPosition0) {
        concatAdapterController$WrapperAndLocalPosition0.c = false;
        concatAdapterController$WrapperAndLocalPosition0.a = null;
        concatAdapterController$WrapperAndLocalPosition0.b = -1;
        this.f = concatAdapterController$WrapperAndLocalPosition0;
    }

    boolean J(Adapter recyclerView$Adapter0) {
        int v = this.y(recyclerView$Adapter0);
        if(v == -1) {
            return false;
        }
        NestedAdapterWrapper nestedAdapterWrapper0 = (NestedAdapterWrapper)this.e.get(v);
        int v1 = this.m(nestedAdapterWrapper0);
        this.e.remove(v);
        this.a.notifyItemRangeRemoved(v1, nestedAdapterWrapper0.b());
        for(Object object0: this.c) {
            RecyclerView recyclerView0 = (RecyclerView)((WeakReference)object0).get();
            if(recyclerView0 != null) {
                recyclerView$Adapter0.onDetachedFromRecyclerView(recyclerView0);
            }
        }
        nestedAdapterWrapper0.a();
        this.j();
        return true;
    }

    @Override  // androidx.recyclerview.widget.NestedAdapterWrapper$Callback
    public void a(@NonNull NestedAdapterWrapper nestedAdapterWrapper0, int v, int v1, @Nullable Object object0) {
        int v2 = this.m(nestedAdapterWrapper0);
        this.a.notifyItemRangeChanged(v + v2, v1, object0);
    }

    @Override  // androidx.recyclerview.widget.NestedAdapterWrapper$Callback
    public void b(@NonNull NestedAdapterWrapper nestedAdapterWrapper0, int v, int v1) {
        int v2 = this.m(nestedAdapterWrapper0);
        this.a.notifyItemMoved(v + v2, v1 + v2);
    }

    @Override  // androidx.recyclerview.widget.NestedAdapterWrapper$Callback
    public void c(NestedAdapterWrapper nestedAdapterWrapper0) {
        this.j();
    }

    @Override  // androidx.recyclerview.widget.NestedAdapterWrapper$Callback
    public void d(@NonNull NestedAdapterWrapper nestedAdapterWrapper0, int v, int v1) {
        int v2 = this.m(nestedAdapterWrapper0);
        this.a.notifyItemRangeChanged(v + v2, v1);
    }

    @Override  // androidx.recyclerview.widget.NestedAdapterWrapper$Callback
    public void e(@NonNull NestedAdapterWrapper nestedAdapterWrapper0, int v, int v1) {
        int v2 = this.m(nestedAdapterWrapper0);
        this.a.notifyItemRangeRemoved(v + v2, v1);
    }

    @Override  // androidx.recyclerview.widget.NestedAdapterWrapper$Callback
    public void f(@NonNull NestedAdapterWrapper nestedAdapterWrapper0, int v, int v1) {
        int v2 = this.m(nestedAdapterWrapper0);
        this.a.notifyItemRangeInserted(v + v2, v1);
    }

    @Override  // androidx.recyclerview.widget.NestedAdapterWrapper$Callback
    public void g(@NonNull NestedAdapterWrapper nestedAdapterWrapper0) {
        this.a.notifyDataSetChanged();
        this.j();
    }

    boolean h(int v, Adapter recyclerView$Adapter0) {
        if(v < 0 || v > this.e.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.e.size() + ". Given:" + v);
        }
        if(this.x()) {
            Preconditions.b(recyclerView$Adapter0.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        }
        else if(recyclerView$Adapter0.hasStableIds()) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        if(this.o(recyclerView$Adapter0) != null) {
            return false;
        }
        StableIdLookup stableIdStorage$StableIdLookup0 = this.h.a();
        NestedAdapterWrapper nestedAdapterWrapper0 = new NestedAdapterWrapper(recyclerView$Adapter0, this, this.b, stableIdStorage$StableIdLookup0);
        this.e.add(v, nestedAdapterWrapper0);
        for(Object object0: this.c) {
            RecyclerView recyclerView0 = (RecyclerView)((WeakReference)object0).get();
            if(recyclerView0 != null) {
                recyclerView$Adapter0.onAttachedToRecyclerView(recyclerView0);
            }
        }
        if(nestedAdapterWrapper0.b() > 0) {
            int v1 = this.m(nestedAdapterWrapper0);
            this.a.notifyItemRangeInserted(v1, nestedAdapterWrapper0.b());
        }
        this.j();
        return true;
    }

    boolean i(Adapter recyclerView$Adapter0) {
        return this.h(this.e.size(), recyclerView$Adapter0);
    }

    private void j() {
        StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy0 = this.l();
        if(recyclerView$Adapter$StateRestorationPolicy0 != this.a.getStateRestorationPolicy()) {
            this.a.z(recyclerView$Adapter$StateRestorationPolicy0);
        }
    }

    public boolean k() {
        for(Object object0: this.e) {
            if(!((NestedAdapterWrapper)object0).c.canRestoreState()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private StateRestorationPolicy l() {
        for(Object object0: this.e) {
            StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy0 = ((NestedAdapterWrapper)object0).c.getStateRestorationPolicy();
            StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy1 = StateRestorationPolicy.c;
            if(recyclerView$Adapter$StateRestorationPolicy0 == recyclerView$Adapter$StateRestorationPolicy1) {
                return recyclerView$Adapter$StateRestorationPolicy1;
            }
            if(recyclerView$Adapter$StateRestorationPolicy0 == StateRestorationPolicy.b && ((NestedAdapterWrapper)object0).b() == 0) {
                return recyclerView$Adapter$StateRestorationPolicy1;
            }
            if(false) {
                break;
            }
        }
        return StateRestorationPolicy.a;
    }

    private int m(NestedAdapterWrapper nestedAdapterWrapper0) {
        int v = 0;
        for(Object object0: this.e) {
            if(((NestedAdapterWrapper)object0) == nestedAdapterWrapper0) {
                break;
            }
            v += ((NestedAdapterWrapper)object0).b();
        }
        return v;
    }

    @NonNull
    private WrapperAndLocalPosition n(int v) {
        WrapperAndLocalPosition concatAdapterController$WrapperAndLocalPosition0 = this.f;
        if(concatAdapterController$WrapperAndLocalPosition0.c) {
            concatAdapterController$WrapperAndLocalPosition0 = new WrapperAndLocalPosition();
        }
        else {
            concatAdapterController$WrapperAndLocalPosition0.c = true;
        }
        int v1 = v;
        for(Object object0: this.e) {
            NestedAdapterWrapper nestedAdapterWrapper0 = (NestedAdapterWrapper)object0;
            if(nestedAdapterWrapper0.b() > v1) {
                concatAdapterController$WrapperAndLocalPosition0.a = nestedAdapterWrapper0;
                concatAdapterController$WrapperAndLocalPosition0.b = v1;
                break;
            }
            v1 -= nestedAdapterWrapper0.b();
        }
        if(concatAdapterController$WrapperAndLocalPosition0.a == null) {
            throw new IllegalArgumentException("Cannot find wrapper for " + v);
        }
        return concatAdapterController$WrapperAndLocalPosition0;
    }

    @Nullable
    private NestedAdapterWrapper o(Adapter recyclerView$Adapter0) {
        int v = this.y(recyclerView$Adapter0);
        return v == -1 ? null : ((NestedAdapterWrapper)this.e.get(v));
    }

    @Nullable
    public Adapter p(ViewHolder recyclerView$ViewHolder0) {
        NestedAdapterWrapper nestedAdapterWrapper0 = (NestedAdapterWrapper)this.d.get(recyclerView$ViewHolder0);
        return nestedAdapterWrapper0 == null ? null : nestedAdapterWrapper0.c;
    }

    public List q() {
        if(this.e.isEmpty()) {
            return Collections.emptyList();
        }
        List list0 = new ArrayList(this.e.size());
        for(Object object0: this.e) {
            list0.add(((NestedAdapterWrapper)object0).c);
        }
        return list0;
    }

    public long r(int v) {
        WrapperAndLocalPosition concatAdapterController$WrapperAndLocalPosition0 = this.n(v);
        long v1 = concatAdapterController$WrapperAndLocalPosition0.a.c(concatAdapterController$WrapperAndLocalPosition0.b);
        this.I(concatAdapterController$WrapperAndLocalPosition0);
        return v1;
    }

    public int s(int v) {
        WrapperAndLocalPosition concatAdapterController$WrapperAndLocalPosition0 = this.n(v);
        int v1 = concatAdapterController$WrapperAndLocalPosition0.a.d(concatAdapterController$WrapperAndLocalPosition0.b);
        this.I(concatAdapterController$WrapperAndLocalPosition0);
        return v1;
    }

    public int t(Adapter recyclerView$Adapter0, ViewHolder recyclerView$ViewHolder0, int v) {
        NestedAdapterWrapper nestedAdapterWrapper0 = (NestedAdapterWrapper)this.d.get(recyclerView$ViewHolder0);
        if(nestedAdapterWrapper0 == null) {
            return -1;
        }
        int v1 = v - this.m(nestedAdapterWrapper0);
        int v2 = nestedAdapterWrapper0.c.getItemCount();
        if(v1 < 0 || v1 >= v2) {
            throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + v1 + " which is out of bounds for the adapter with size " + v2 + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + recyclerView$ViewHolder0 + "adapter:" + recyclerView$Adapter0);
        }
        return nestedAdapterWrapper0.c.findRelativeAdapterPositionIn(recyclerView$Adapter0, recyclerView$ViewHolder0, v1);
    }

    public int u() {
        int v = 0;
        for(Object object0: this.e) {
            v += ((NestedAdapterWrapper)object0).b();
        }
        return v;
    }

    public Pair v(int v) {
        WrapperAndLocalPosition concatAdapterController$WrapperAndLocalPosition0 = this.n(v);
        Pair pair0 = new Pair(concatAdapterController$WrapperAndLocalPosition0.a.c, concatAdapterController$WrapperAndLocalPosition0.b);
        this.I(concatAdapterController$WrapperAndLocalPosition0);
        return pair0;
    }

    @NonNull
    private NestedAdapterWrapper w(ViewHolder recyclerView$ViewHolder0) {
        NestedAdapterWrapper nestedAdapterWrapper0 = (NestedAdapterWrapper)this.d.get(recyclerView$ViewHolder0);
        if(nestedAdapterWrapper0 == null) {
            throw new IllegalStateException("Cannot find wrapper for " + recyclerView$ViewHolder0 + ", seems like it is not bound by this adapter: " + this);
        }
        return nestedAdapterWrapper0;
    }

    public boolean x() {
        return this.g != StableIdMode.a;
    }

    private int y(Adapter recyclerView$Adapter0) {
        int v = this.e.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((NestedAdapterWrapper)this.e.get(v1)).c == recyclerView$Adapter0) {
                return v1;
            }
        }
        return -1;
    }

    private boolean z(RecyclerView recyclerView0) {
        for(Object object0: this.c) {
            if(((WeakReference)object0).get() == recyclerView0) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

