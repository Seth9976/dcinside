package androidx.recyclerview.widget;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

public final class ConcatAdapter extends Adapter {
    public static final class Config {
        public static final class Builder {
            private boolean a;
            private StableIdMode b;

            public Builder() {
                this.a = Config.c.a;
                this.b = Config.c.b;
            }

            @NonNull
            public Config a() {
                return new Config(this.a, this.b);
            }

            @NonNull
            public Builder b(boolean z) {
                this.a = z;
                return this;
            }

            @NonNull
            public Builder c(@NonNull StableIdMode concatAdapter$Config$StableIdMode0) {
                this.b = concatAdapter$Config$StableIdMode0;
                return this;
            }
        }

        public static enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS;

            private static StableIdMode[] a() [...] // Inlined contents
        }

        public final boolean a;
        @NonNull
        public final StableIdMode b;
        @NonNull
        public static final Config c;

        static {
            Config.c = new Config(true, StableIdMode.a);
        }

        Config(boolean z, @NonNull StableIdMode concatAdapter$Config$StableIdMode0) {
            this.a = z;
            this.b = concatAdapter$Config$StableIdMode0;
        }
    }

    private final ConcatAdapterController a;
    static final String b = "ConcatAdapter";

    public ConcatAdapter(@NonNull Config concatAdapter$Config0, @NonNull List list0) {
        this.a = new ConcatAdapterController(this, concatAdapter$Config0);
        for(Object object0: list0) {
            this.w(((Adapter)object0));
        }
        super.setHasStableIds(this.a.x());
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull Config concatAdapter$Config0, @NonNull Adapter[] arr_recyclerView$Adapter) {
        this(concatAdapter$Config0, Arrays.asList(arr_recyclerView$Adapter));
    }

    public ConcatAdapter(@NonNull List list0) {
        this(Config.c, list0);
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull Adapter[] arr_recyclerView$Adapter) {
        this(Config.c, arr_recyclerView$Adapter);
    }

    public boolean A(@NonNull Adapter recyclerView$Adapter0) {
        return this.a.J(recyclerView$Adapter0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int findRelativeAdapterPositionIn(@NonNull Adapter recyclerView$Adapter0, @NonNull ViewHolder recyclerView$ViewHolder0, int v) {
        return this.a.t(recyclerView$Adapter0, recyclerView$ViewHolder0, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.u();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public long getItemId(int v) {
        return this.a.r(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return this.a.s(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView0) {
        this.a.A(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0, int v) {
        this.a.B(recyclerView$ViewHolder0, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup0, int v) {
        return this.a.C(viewGroup0, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView0) {
        this.a.D(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public boolean onFailedToRecycleView(@NonNull ViewHolder recyclerView$ViewHolder0) {
        return this.a.E(recyclerView$ViewHolder0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewAttachedToWindow(@NonNull ViewHolder recyclerView$ViewHolder0) {
        this.a.F(recyclerView$ViewHolder0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewDetachedFromWindow(@NonNull ViewHolder recyclerView$ViewHolder0) {
        this.a.G(recyclerView$ViewHolder0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewRecycled(@NonNull ViewHolder recyclerView$ViewHolder0) {
        this.a.H(recyclerView$ViewHolder0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void setStateRestorationPolicy(@NonNull StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy0) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    public boolean v(int v, @NonNull Adapter recyclerView$Adapter0) {
        return this.a.h(v, recyclerView$Adapter0);
    }

    public boolean w(@NonNull Adapter recyclerView$Adapter0) {
        return this.a.i(recyclerView$Adapter0);
    }

    @NonNull
    public List x() {
        return DesugarCollections.unmodifiableList(this.a.q());
    }

    @NonNull
    public Pair y(int v) {
        return this.a.v(v);
    }

    void z(@NonNull StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy0) {
        super.setStateRestorationPolicy(recyclerView$Adapter$StateRestorationPolicy0);
    }
}

