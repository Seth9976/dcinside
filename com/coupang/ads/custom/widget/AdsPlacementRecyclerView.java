package com.coupang.ads.custom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.coupang.ads.R.styleable;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.dto.AdsProductPage;
import com.coupang.ads.tools.p;
import com.coupang.ads.tools.q;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.collections.u;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class AdsPlacementRecyclerView extends RecyclerView implements AdsWidgetPlacement {
    public static final class VH extends ViewHolder {
        @l
        private final LinkedList placements;
        @l
        private final LinkedList products;

        public VH(@l View view0, @l LinkedList linkedList0, @l LinkedList linkedList1) {
            L.p(view0, "rootView");
            L.p(linkedList0, "products");
            L.p(linkedList1, "placements");
            super(view0);
            this.products = linkedList0;
            this.placements = linkedList1;
        }

        public VH(View view0, LinkedList linkedList0, LinkedList linkedList1, int v, w w0) {
            if((v & 2) != 0) {
                linkedList0 = new LinkedList();
            }
            if((v & 4) != 0) {
                linkedList1 = new LinkedList();
            }
            this(view0, linkedList0, linkedList1);
        }

        @l
        public final LinkedList getPlacements() {
            return this.placements;
        }

        @l
        public final LinkedList getProducts() {
            return this.products;
        }
    }

    @m
    private AdsProductPage adsProductPage;
    @LayoutRes
    private int layoutResId;
    @l
    private final com.coupang.ads.custom.widget.AdsPlacementRecyclerView.myAdapter.1 myAdapter;

    @j
    public AdsPlacementRecyclerView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 2, null);
    }

    @j
    public AdsPlacementRecyclerView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0, 0);
        this.myAdapter = new Adapter() {
            @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
            public int getItemCount() {
                if(AdsPlacementRecyclerView.this.layoutResId != 0) {
                    AdsProductPage adsProductPage0 = AdsPlacementRecyclerView.this.getAdsProductPage();
                    if(adsProductPage0 != null) {
                        ArrayList arrayList0 = adsProductPage0.getAdsProductList();
                        return arrayList0 == null ? 0 : arrayList0.size();
                    }
                }
                return 0;
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
            public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
                this.onBindViewHolder(((VH)recyclerView$ViewHolder0), v);
            }

            public void onBindViewHolder(@l VH adsPlacementRecyclerView$VH0, int v) {
                L.p(adsPlacementRecyclerView$VH0, "holder");
                AdsPlacementRecyclerView adsPlacementRecyclerView0 = AdsPlacementRecyclerView.this;
                for(Object object0: adsPlacementRecyclerView$VH0.getProducts()) {
                    AdsProductPage adsProductPage0 = adsPlacementRecyclerView0.getAdsProductPage();
                    AdsProductWidgetModel adsProductWidgetModel0 = null;
                    if(adsProductPage0 != null) {
                        ArrayList arrayList0 = adsProductPage0.getAdsProductList();
                        if(arrayList0 != null) {
                            AdsProduct adsProduct0 = (AdsProduct)u.W2(arrayList0, v);
                            if(adsProduct0 != null) {
                                adsProductWidgetModel0 = new AdsProductWidgetModel(adsProduct0);
                            }
                        }
                    }
                    ((AdsWidgetProduct)object0).setAdsProductWidgetModel(adsProductWidgetModel0);
                }
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
            public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
                return this.onCreateViewHolder(viewGroup0, v);
            }

            @l
            public VH onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
                L.p(viewGroup0, "parent");
                View view0 = LayoutInflater.from(this).inflate(AdsPlacementRecyclerView.this.layoutResId, viewGroup0, false);
                L.o(view0, "from(context).inflate(layoutResId, parent, false)");
                VH adsPlacementRecyclerView$VH0 = new VH(view0, null, null, 6, null);
                com.coupang.ads.custom.widget.AdsPlacementRecyclerView.myAdapter.1.onCreateViewHolder.1.1 adsPlacementRecyclerView$myAdapter$1$onCreateViewHolder$1$10 = new Function1() {
                    final VH $this_apply;

                    {
                        this.$this_apply = adsPlacementRecyclerView$VH0;
                        super(1);
                    }

                    @l
                    public final p invoke(@l View view0) {
                        L.p(view0, "v");
                        if(view0 instanceof AdsWidgetProduct) {
                            this.$this_apply.getProducts().add(view0);
                            return p.c;
                        }
                        if(view0 instanceof AdsWidgetPlacement) {
                            this.$this_apply.getPlacements().add(view0);
                            return p.c;
                        }
                        return p.a;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.invoke(((View)object0));
                    }
                };
                q.f(adsPlacementRecyclerView$VH0.itemView, false, adsPlacementRecyclerView$myAdapter$1$onCreateViewHolder$1$10);
                return adsPlacementRecyclerView$VH0;
            }
        };
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.AdsPlacementRecyclerView, 0, 0);
        L.o(typedArray0, "context.obtainStyledAttr…           0, 0\n        )");
        try {
            this.layoutResId = typedArray0.getResourceId(styleable.AdsPlacementRecyclerView_child_layout, this.layoutResId);
        }
        catch(Throwable throwable0) {
            f0.a(throwable0);
        }
        typedArray0.recycle();
        this.setAdapter(this.myAdapter);
    }

    public AdsPlacementRecyclerView(Context context0, AttributeSet attributeSet0, int v, w w0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override  // com.coupang.ads.custom.widget.AdsWidgetPlacement
    @m
    public AdsProductPage getAdsProductPage() {
        return this.adsProductPage;
    }

    @Override  // com.coupang.ads.custom.widget.AdsWidgetPlacement
    public void setAdsProductPage(@m AdsProductPage adsProductPage0) {
        this.adsProductPage = adsProductPage0;
        this.myAdapter.notifyDataSetChanged();
    }
}

