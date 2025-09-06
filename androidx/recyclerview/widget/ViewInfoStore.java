package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;

class ViewInfoStore {
    static class InfoRecord {
        int a;
        @Nullable
        ItemHolderInfo b;
        @Nullable
        ItemHolderInfo c;
        static final int d = 1;
        static final int e = 2;
        static final int f = 4;
        static final int g = 8;
        static final int h = 3;
        static final int i = 12;
        static final int j = 14;
        static Pool k;

        static {
            InfoRecord.k = new SimplePool(20);
        }

        static void a() {
            while(InfoRecord.k.b() != null) {
            }
        }

        static InfoRecord b() {
            InfoRecord viewInfoStore$InfoRecord0 = (InfoRecord)InfoRecord.k.b();
            return viewInfoStore$InfoRecord0 == null ? new InfoRecord() : viewInfoStore$InfoRecord0;
        }

        static void c(InfoRecord viewInfoStore$InfoRecord0) {
            viewInfoStore$InfoRecord0.a = 0;
            viewInfoStore$InfoRecord0.b = null;
            viewInfoStore$InfoRecord0.c = null;
            InfoRecord.k.a(viewInfoStore$InfoRecord0);
        }
    }

    interface ProcessCallback {
        void a(ViewHolder arg1, @Nullable ItemHolderInfo arg2, ItemHolderInfo arg3);

        void b(ViewHolder arg1);

        void c(ViewHolder arg1, @NonNull ItemHolderInfo arg2, @Nullable ItemHolderInfo arg3);

        void d(ViewHolder arg1, @NonNull ItemHolderInfo arg2, @NonNull ItemHolderInfo arg3);
    }

    @VisibleForTesting
    final SimpleArrayMap a;
    @VisibleForTesting
    final LongSparseArray b;
    private static final boolean c = false;

    ViewInfoStore() {
        this.a = new SimpleArrayMap();
        this.b = new LongSparseArray();
    }

    void a(ViewHolder recyclerView$ViewHolder0, ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0) {
        InfoRecord viewInfoStore$InfoRecord0 = (InfoRecord)this.a.get(recyclerView$ViewHolder0);
        if(viewInfoStore$InfoRecord0 == null) {
            viewInfoStore$InfoRecord0 = InfoRecord.b();
            this.a.put(recyclerView$ViewHolder0, viewInfoStore$InfoRecord0);
        }
        viewInfoStore$InfoRecord0.a |= 2;
        viewInfoStore$InfoRecord0.b = recyclerView$ItemAnimator$ItemHolderInfo0;
    }

    void b(ViewHolder recyclerView$ViewHolder0) {
        InfoRecord viewInfoStore$InfoRecord0 = (InfoRecord)this.a.get(recyclerView$ViewHolder0);
        if(viewInfoStore$InfoRecord0 == null) {
            viewInfoStore$InfoRecord0 = InfoRecord.b();
            this.a.put(recyclerView$ViewHolder0, viewInfoStore$InfoRecord0);
        }
        viewInfoStore$InfoRecord0.a |= 1;
    }

    void c(long v, ViewHolder recyclerView$ViewHolder0) {
        this.b.n(v, recyclerView$ViewHolder0);
    }

    void d(ViewHolder recyclerView$ViewHolder0, ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0) {
        InfoRecord viewInfoStore$InfoRecord0 = (InfoRecord)this.a.get(recyclerView$ViewHolder0);
        if(viewInfoStore$InfoRecord0 == null) {
            viewInfoStore$InfoRecord0 = InfoRecord.b();
            this.a.put(recyclerView$ViewHolder0, viewInfoStore$InfoRecord0);
        }
        viewInfoStore$InfoRecord0.c = recyclerView$ItemAnimator$ItemHolderInfo0;
        viewInfoStore$InfoRecord0.a |= 8;
    }

    void e(ViewHolder recyclerView$ViewHolder0, ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0) {
        InfoRecord viewInfoStore$InfoRecord0 = (InfoRecord)this.a.get(recyclerView$ViewHolder0);
        if(viewInfoStore$InfoRecord0 == null) {
            viewInfoStore$InfoRecord0 = InfoRecord.b();
            this.a.put(recyclerView$ViewHolder0, viewInfoStore$InfoRecord0);
        }
        viewInfoStore$InfoRecord0.b = recyclerView$ItemAnimator$ItemHolderInfo0;
        viewInfoStore$InfoRecord0.a |= 4;
    }

    void f() {
        this.a.clear();
        this.b.b();
    }

    ViewHolder g(long v) {
        return (ViewHolder)this.b.g(v);
    }

    boolean h(ViewHolder recyclerView$ViewHolder0) {
        InfoRecord viewInfoStore$InfoRecord0 = (InfoRecord)this.a.get(recyclerView$ViewHolder0);
        return viewInfoStore$InfoRecord0 != null && (viewInfoStore$InfoRecord0.a & 1) != 0;
    }

    boolean i(ViewHolder recyclerView$ViewHolder0) {
        InfoRecord viewInfoStore$InfoRecord0 = (InfoRecord)this.a.get(recyclerView$ViewHolder0);
        return viewInfoStore$InfoRecord0 != null && (viewInfoStore$InfoRecord0.a & 4) != 0;
    }

    void j() {
        InfoRecord.a();
    }

    public void k(ViewHolder recyclerView$ViewHolder0) {
        this.p(recyclerView$ViewHolder0);
    }

    private ItemHolderInfo l(ViewHolder recyclerView$ViewHolder0, int v) {
        ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0;
        int v1 = this.a.e(recyclerView$ViewHolder0);
        if(v1 < 0) {
            return null;
        }
        InfoRecord viewInfoStore$InfoRecord0 = (InfoRecord)this.a.l(v1);
        if(viewInfoStore$InfoRecord0 != null) {
            int v2 = viewInfoStore$InfoRecord0.a;
            if((v2 & v) != 0) {
                int v3 = ~v & v2;
                viewInfoStore$InfoRecord0.a = v3;
                if(v == 4) {
                    recyclerView$ItemAnimator$ItemHolderInfo0 = viewInfoStore$InfoRecord0.b;
                }
                else if(v == 8) {
                    recyclerView$ItemAnimator$ItemHolderInfo0 = viewInfoStore$InfoRecord0.c;
                }
                else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if((v3 & 12) == 0) {
                    this.a.i(v1);
                    InfoRecord.c(viewInfoStore$InfoRecord0);
                }
                return recyclerView$ItemAnimator$ItemHolderInfo0;
            }
        }
        return null;
    }

    @Nullable
    ItemHolderInfo m(ViewHolder recyclerView$ViewHolder0) {
        return this.l(recyclerView$ViewHolder0, 8);
    }

    @Nullable
    ItemHolderInfo n(ViewHolder recyclerView$ViewHolder0) {
        return this.l(recyclerView$ViewHolder0, 4);
    }

    void o(ProcessCallback viewInfoStore$ProcessCallback0) {
        for(int v = this.a.size() - 1; v >= 0; --v) {
            ViewHolder recyclerView$ViewHolder0 = (ViewHolder)this.a.g(v);
            InfoRecord viewInfoStore$InfoRecord0 = (InfoRecord)this.a.i(v);
            int v1 = viewInfoStore$InfoRecord0.a;
            if((v1 & 3) == 3) {
                viewInfoStore$ProcessCallback0.b(recyclerView$ViewHolder0);
            }
            else if((v1 & 1) != 0) {
                ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0 = viewInfoStore$InfoRecord0.b;
                if(recyclerView$ItemAnimator$ItemHolderInfo0 == null) {
                    viewInfoStore$ProcessCallback0.b(recyclerView$ViewHolder0);
                }
                else {
                    viewInfoStore$ProcessCallback0.c(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0, viewInfoStore$InfoRecord0.c);
                }
            }
            else if((v1 & 14) == 14) {
                viewInfoStore$ProcessCallback0.a(recyclerView$ViewHolder0, viewInfoStore$InfoRecord0.b, viewInfoStore$InfoRecord0.c);
            }
            else if((v1 & 12) == 12) {
                viewInfoStore$ProcessCallback0.d(recyclerView$ViewHolder0, viewInfoStore$InfoRecord0.b, viewInfoStore$InfoRecord0.c);
            }
            else if((v1 & 4) != 0) {
                viewInfoStore$ProcessCallback0.c(recyclerView$ViewHolder0, viewInfoStore$InfoRecord0.b, null);
            }
            else if((v1 & 8) != 0) {
                viewInfoStore$ProcessCallback0.a(recyclerView$ViewHolder0, viewInfoStore$InfoRecord0.b, viewInfoStore$InfoRecord0.c);
            }
            InfoRecord.c(viewInfoStore$InfoRecord0);
        }
    }

    void p(ViewHolder recyclerView$ViewHolder0) {
        InfoRecord viewInfoStore$InfoRecord0 = (InfoRecord)this.a.get(recyclerView$ViewHolder0);
        if(viewInfoStore$InfoRecord0 == null) {
            return;
        }
        viewInfoStore$InfoRecord0.a &= -2;
    }

    void q(ViewHolder recyclerView$ViewHolder0) {
        for(int v = this.b.w() - 1; v >= 0; --v) {
            if(recyclerView$ViewHolder0 == this.b.x(v)) {
                this.b.s(v);
                break;
            }
        }
        InfoRecord viewInfoStore$InfoRecord0 = (InfoRecord)this.a.remove(recyclerView$ViewHolder0);
        if(viewInfoStore$InfoRecord0 != null) {
            InfoRecord.c(viewInfoStore$InfoRecord0);
        }
    }
}

