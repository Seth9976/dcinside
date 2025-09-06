package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.annotation.Nullable;
import androidx.core.os.TraceCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class GapWorker implements Runnable {
    @SuppressLint({"VisibleForTests"})
    static class LayoutPrefetchRegistryImpl implements LayoutPrefetchRegistry {
        int a;
        int b;
        int[] c;
        int d;

        @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager$LayoutPrefetchRegistry
        public void a(int v, int v1) {
            if(v < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if(v1 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int v2 = this.d;
            int[] arr_v = this.c;
            if(arr_v == null) {
                int[] arr_v1 = new int[4];
                this.c = arr_v1;
                Arrays.fill(arr_v1, -1);
            }
            else if(v2 * 2 >= arr_v.length) {
                int[] arr_v2 = new int[v2 * 4];
                this.c = arr_v2;
                System.arraycopy(arr_v, 0, arr_v2, 0, arr_v.length);
            }
            int[] arr_v3 = this.c;
            arr_v3[v2 * 2] = v;
            arr_v3[v2 * 2 + 1] = v1;
            ++this.d;
        }

        void b() {
            int[] arr_v = this.c;
            if(arr_v != null) {
                Arrays.fill(arr_v, -1);
            }
            this.d = 0;
        }

        void c(RecyclerView recyclerView0, boolean z) {
            this.d = 0;
            int[] arr_v = this.c;
            if(arr_v != null) {
                Arrays.fill(arr_v, -1);
            }
            LayoutManager recyclerView$LayoutManager0 = recyclerView0.mLayout;
            if(recyclerView0.mAdapter != null && recyclerView$LayoutManager0 != null && recyclerView$LayoutManager0.a1()) {
                if(!z) {
                    if(!recyclerView0.hasPendingAdapterUpdates()) {
                        recyclerView$LayoutManager0.K(this.a, this.b, recyclerView0.mState, this);
                    }
                }
                else if(!recyclerView0.mAdapterHelper.q()) {
                    recyclerView$LayoutManager0.L(recyclerView0.mAdapter.getItemCount(), this);
                }
                int v = this.d;
                if(v > recyclerView$LayoutManager0.m) {
                    recyclerView$LayoutManager0.m = v;
                    recyclerView$LayoutManager0.n = z;
                    recyclerView0.mRecycler.Q();
                }
            }
        }

        boolean d(int v) {
            if(this.c != null) {
                int v1 = this.d * 2;
                for(int v2 = 0; v2 < v1; v2 += 2) {
                    if(this.c[v2] == v) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int v, int v1) {
            this.a = v;
            this.b = v1;
        }
    }

    static class Task {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    ArrayList a;
    long b;
    long c;
    private final ArrayList d;
    static final ThreadLocal e;
    static Comparator f;

    static {
        GapWorker.e = new ThreadLocal();
        GapWorker.f = new Comparator() {
            public int b(Task gapWorker$Task0, Task gapWorker$Task1) {
                RecyclerView recyclerView0 = gapWorker$Task0.d;
                if((recyclerView0 == null ? 1 : 0) != (gapWorker$Task1.d == null ? 1 : 0)) {
                    return recyclerView0 == null ? 1 : -1;
                }
                boolean z = gapWorker$Task0.a;
                if(z != gapWorker$Task1.a) {
                    return z ? -1 : 1;
                }
                int v = gapWorker$Task1.b - gapWorker$Task0.b;
                if(v != 0) {
                    return v;
                }
                int v1 = gapWorker$Task0.c - gapWorker$Task1.c;
                return v1 == 0 ? 0 : v1;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.b(((Task)object0), ((Task)object1));
            }
        };
    }

    GapWorker() {
        this.a = new ArrayList();
        this.d = new ArrayList();
    }

    public void a(RecyclerView recyclerView0) {
        if(RecyclerView.sDebugAssertionsEnabled && this.a.contains(recyclerView0)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.a.add(recyclerView0);
    }

    private void b() {
        Task gapWorker$Task0;
        int v = this.a.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            RecyclerView recyclerView0 = (RecyclerView)this.a.get(v1);
            if(recyclerView0.getWindowVisibility() == 0) {
                recyclerView0.mPrefetchRegistry.c(recyclerView0, false);
                v2 += recyclerView0.mPrefetchRegistry.d;
            }
        }
        this.d.ensureCapacity(v2);
        int v4 = 0;
        for(int v3 = 0; v3 < v; ++v3) {
            RecyclerView recyclerView1 = (RecyclerView)this.a.get(v3);
            if(recyclerView1.getWindowVisibility() == 0) {
                LayoutPrefetchRegistryImpl gapWorker$LayoutPrefetchRegistryImpl0 = recyclerView1.mPrefetchRegistry;
                int v5 = Math.abs(gapWorker$LayoutPrefetchRegistryImpl0.a) + Math.abs(gapWorker$LayoutPrefetchRegistryImpl0.b);
                for(int v6 = 0; v6 < gapWorker$LayoutPrefetchRegistryImpl0.d * 2; v6 += 2) {
                    if(v4 >= this.d.size()) {
                        gapWorker$Task0 = new Task();
                        this.d.add(gapWorker$Task0);
                    }
                    else {
                        gapWorker$Task0 = (Task)this.d.get(v4);
                    }
                    int[] arr_v = gapWorker$LayoutPrefetchRegistryImpl0.c;
                    int v7 = arr_v[v6 + 1];
                    gapWorker$Task0.a = v7 <= v5;
                    gapWorker$Task0.b = v5;
                    gapWorker$Task0.c = v7;
                    gapWorker$Task0.d = recyclerView1;
                    gapWorker$Task0.e = arr_v[v6];
                    ++v4;
                }
            }
        }
        Collections.sort(this.d, GapWorker.f);
    }

    private void c(Task gapWorker$Task0, long v) {
        ViewHolder recyclerView$ViewHolder0 = this.i(gapWorker$Task0.d, gapWorker$Task0.e, (gapWorker$Task0.a ? 0x7FFFFFFFFFFFFFFFL : v));
        if(recyclerView$ViewHolder0 != null && recyclerView$ViewHolder0.mNestedRecyclerView != null && recyclerView$ViewHolder0.isBound() && !recyclerView$ViewHolder0.isInvalid()) {
            this.h(((RecyclerView)recyclerView$ViewHolder0.mNestedRecyclerView.get()), v);
        }
    }

    private void d(long v) {
        for(int v1 = 0; v1 < this.d.size(); ++v1) {
            Task gapWorker$Task0 = (Task)this.d.get(v1);
            if(gapWorker$Task0.d == null) {
                break;
            }
            this.c(gapWorker$Task0, v);
            gapWorker$Task0.a();
        }
    }

    static boolean e(RecyclerView recyclerView0, int v) {
        int v1 = recyclerView0.mChildHelper.j();
        for(int v2 = 0; v2 < v1; ++v2) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(recyclerView0.mChildHelper.i(v2));
            if(recyclerView$ViewHolder0.mPosition == v && !recyclerView$ViewHolder0.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    void f(RecyclerView recyclerView0, int v, int v1) {
        if(recyclerView0.isAttachedToWindow()) {
            if(RecyclerView.sDebugAssertionsEnabled && !this.a.contains(recyclerView0)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if(this.b == 0L) {
                this.b = 3728077653600L;
                recyclerView0.post(this);
            }
        }
        recyclerView0.mPrefetchRegistry.e(v, v1);
    }

    void g(long v) {
        this.b();
        this.d(v);
    }

    private void h(@Nullable RecyclerView recyclerView0, long v) {
        if(recyclerView0 == null) {
            return;
        }
        if(recyclerView0.mDataSetHasChangedAfterLayout && recyclerView0.mChildHelper.j() != 0) {
            recyclerView0.removeAndRecycleViews();
        }
        LayoutPrefetchRegistryImpl gapWorker$LayoutPrefetchRegistryImpl0 = recyclerView0.mPrefetchRegistry;
        gapWorker$LayoutPrefetchRegistryImpl0.c(recyclerView0, true);
        if(gapWorker$LayoutPrefetchRegistryImpl0.d != 0) {
            try {
                Trace.beginSection((v == 0x7FFFFFFFFFFFFFFFL ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame"));
                recyclerView0.mState.k(recyclerView0.mAdapter);
                for(int v2 = 0; v2 < gapWorker$LayoutPrefetchRegistryImpl0.d * 2; v2 += 2) {
                    this.i(recyclerView0, gapWorker$LayoutPrefetchRegistryImpl0.c[v2], v);
                }
            }
            finally {
                Trace.endSection();
            }
        }
    }

    private ViewHolder i(RecyclerView recyclerView0, int v, long v1) {
        if(GapWorker.e(recyclerView0, v)) {
            return null;
        }
        try {
            Recycler recyclerView$Recycler0 = recyclerView0.mRecycler;
            if(v1 == 0x7FFFFFFFFFFFFFFFL && TraceCompat.e()) {
                Trace.beginSection("RV Prefetch forced - needed next frame");
            }
            recyclerView0.onEnterLayoutOrScroll();
            ViewHolder recyclerView$ViewHolder0 = recyclerView$Recycler0.O(v, false, v1);
            if(recyclerView$ViewHolder0 != null) {
                if(!recyclerView$ViewHolder0.isBound() || recyclerView$ViewHolder0.isInvalid()) {
                    recyclerView$Recycler0.a(recyclerView$ViewHolder0, false);
                }
                else {
                    recyclerView$Recycler0.H(recyclerView$ViewHolder0.itemView);
                }
            }
            return recyclerView$ViewHolder0;
        }
        finally {
            recyclerView0.onExitLayoutOrScroll(false);
            Trace.endSection();
        }
    }

    public void j(RecyclerView recyclerView0) {
        boolean z = this.a.remove(recyclerView0);
        if(RecyclerView.sDebugAssertionsEnabled && !z) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override
    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if(!this.a.isEmpty()) {
                int v = this.a.size();
                long v2 = 0L;
                for(int v1 = 0; v1 < v; ++v1) {
                    RecyclerView recyclerView0 = (RecyclerView)this.a.get(v1);
                    if(recyclerView0.getWindowVisibility() == 0) {
                        v2 = Math.max(recyclerView0.getDrawingTime(), v2);
                    }
                }
                if(v2 != 0L) {
                    this.g(TimeUnit.MILLISECONDS.toNanos(v2) + this.c);
                    goto label_18;
                }
            }
            goto label_21;
        }
        catch(Throwable throwable0) {
        }
        this.b = 0L;
        Trace.endSection();
        throw throwable0;
    label_18:
        this.b = 0L;
        Trace.endSection();
        return;
    label_21:
        this.b = 0L;
        Trace.endSection();
    }
}

