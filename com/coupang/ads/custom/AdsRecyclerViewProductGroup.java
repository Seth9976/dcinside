package com.coupang.ads.custom;

import A3.o;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class AdsRecyclerViewProductGroup implements AdsProductGroup {
    public static final class LayoutViewHolder extends ViewHolder {
        @l
        private final AdsProductLayout layout;

        public LayoutViewHolder(@l View view0, @l AdsProductLayout adsProductLayout0) {
            L.p(view0, "rootView");
            L.p(adsProductLayout0, "layout");
            super(view0);
            this.layout = adsProductLayout0;
        }

        @l
        public final AdsProductLayout getLayout() {
            return this.layout;
        }
    }

    @l
    private final com.coupang.ads.custom.AdsRecyclerViewProductGroup.adapter.1 adapter;
    @m
    private BinderCallback binderCallback;
    @m
    private AdsProductLayout lastProductLayout;
    @l
    private final o layoutCreator;
    private int productCount;
    @l
    private final RecyclerView recyclerView;

    public AdsRecyclerViewProductGroup(@l RecyclerView recyclerView0, @l o o0) {
        L.p(recyclerView0, "recyclerView");
        L.p(o0, "layoutCreator");
        super();
        this.recyclerView = recyclerView0;
        this.layoutCreator = o0;
        this.adapter = new Adapter() {
            @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
            public int getItemCount() {
                return AdsRecyclerViewProductGroup.this.productCount;
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
            public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
                this.onBindViewHolder(((LayoutViewHolder)recyclerView$ViewHolder0), v);
            }

            public void onBindViewHolder(@l LayoutViewHolder adsRecyclerViewProductGroup$LayoutViewHolder0, int v) {
                L.p(adsRecyclerViewProductGroup$LayoutViewHolder0, "holder");
                BinderCallback adsProductGroup$BinderCallback0 = AdsRecyclerViewProductGroup.this.binderCallback;
                if(adsProductGroup$BinderCallback0 != null) {
                    adsProductGroup$BinderCallback0.onBind(v, adsRecyclerViewProductGroup$LayoutViewHolder0.getLayout());
                }
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
            public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
                return this.onCreateViewHolder(viewGroup0, v);
            }

            @l
            public LayoutViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
                L.p(viewGroup0, "parent");
                Object object0 = AdsRecyclerViewProductGroup.this.getLayoutCreator().invoke(viewGroup0, v);
                AdsRecyclerViewProductGroup adsRecyclerViewProductGroup0 = AdsRecyclerViewProductGroup.this;
                BinderCallback adsProductGroup$BinderCallback0 = adsRecyclerViewProductGroup0.binderCallback;
                if(adsProductGroup$BinderCallback0 != null) {
                    adsProductGroup$BinderCallback0.onProductLayoutCreated(((LayoutViewHolder)object0).getLayout());
                }
                adsRecyclerViewProductGroup0.lastProductLayout = ((LayoutViewHolder)object0).getLayout();
                return (LayoutViewHolder)object0;
            }
        };
    }

    @Override  // com.coupang.ads.custom.AdsProductGroup
    @m
    public AdsProductLayout getFocusProductLayout() {
        ViewHolder recyclerView$ViewHolder0;
        LayoutManager recyclerView$LayoutManager0 = this.recyclerView.getLayoutManager();
        LayoutViewHolder adsRecyclerViewProductGroup$LayoutViewHolder0 = null;
        LinearLayoutManager linearLayoutManager0 = recyclerView$LayoutManager0 instanceof LinearLayoutManager ? ((LinearLayoutManager)recyclerView$LayoutManager0) : null;
        if(linearLayoutManager0 == null) {
            recyclerView$ViewHolder0 = null;
        }
        else {
            View view0 = linearLayoutManager0.i0(linearLayoutManager0.s());
            recyclerView$ViewHolder0 = view0 == null ? null : this.getRecyclerView().getChildViewHolder(view0);
        }
        if(recyclerView$ViewHolder0 instanceof LayoutViewHolder) {
            adsRecyclerViewProductGroup$LayoutViewHolder0 = (LayoutViewHolder)recyclerView$ViewHolder0;
        }
        return adsRecyclerViewProductGroup$LayoutViewHolder0 == null ? this.lastProductLayout : adsRecyclerViewProductGroup$LayoutViewHolder0.getLayout();
    }

    @l
    public final o getLayoutCreator() {
        return this.layoutCreator;
    }

    @l
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Override  // com.coupang.ads.custom.AdsProductGroup
    public void onAdLoaded(int v) {
        this.productCount = v;
        this.adapter.notifyDataSetChanged();
    }

    @Override  // com.coupang.ads.custom.AdsProductGroup
    public void setCallback(@m BinderCallback adsProductGroup$BinderCallback0) {
        this.binderCallback = adsProductGroup$BinderCallback0;
        this.recyclerView.setAdapter(this.adapter);
    }
}

