package com.coupang.ads.view;

import A3.o;
import J.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.coupang.ads.R.dimen;
import com.coupang.ads.R.layout;
import com.coupang.ads.custom.AdsProductGroup;
import com.coupang.ads.custom.AdsRecyclerViewProductGroup.LayoutViewHolder;
import com.coupang.ads.custom.AdsRecyclerViewProductGroup;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class AdsProductListView extends RecyclerView implements h {
    private int a;
    @l
    private final D b;

    @j
    public AdsProductListView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AdsProductListView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AdsProductListView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        static final class a extends N implements A3.a {
            final AdsProductListView e;
            final Context f;

            a(AdsProductListView adsProductListView0, Context context0) {
                this.e = adsProductListView0;
                this.f = context0;
                super(0);
            }

            @l
            public final AdsRecyclerViewProductGroup b() {
                static final class com.coupang.ads.view.AdsProductListView.a.a extends N implements o {
                    final Context e;
                    final AdsProductListView f;

                    com.coupang.ads.view.AdsProductListView.a.a(Context context0, AdsProductListView adsProductListView0) {
                        this.e = context0;
                        this.f = adsProductListView0;
                        super(2);
                    }

                    @l
                    public final LayoutViewHolder a(@l ViewGroup viewGroup0, int v) {
                        L.p(viewGroup0, "$noName_0");
                        View view0 = View.inflate(this.e, (this.f.getOrientation() == 1 ? layout.ads_view_interstitial_item_linear_vertical : layout.ads_view_interstitial_item_linear_horizontal), null);
                        L.o(view0, "view");
                        return new LayoutViewHolder(view0, new b(view0).b());
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((ViewGroup)object0), ((Number)object1).intValue());
                    }
                }

                com.coupang.ads.view.AdsProductListView.a.a adsProductListView$a$a0 = new com.coupang.ads.view.AdsProductListView.a.a(this.f, this.e);
                return new AdsRecyclerViewProductGroup(this.e, adsProductListView$a$a0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = 1;
        this.b = E.a(new a(this, context0));
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, new int[]{0x10100C4});
        L.o(typedArray0, "context.obtainStyledAttr…roid.R.attr.orientation))");
        this.a = typedArray0.getInt(0, this.a);
        typedArray0.recycle();
        this.setLayoutManager(new LinearLayoutManager(context0, 0, false));
        int v1 = context0.getResources().getDimensionPixelSize(dimen.interstitial_item_space_1);
        int v2 = context0.getResources().getDimensionPixelSize(dimen.interstitial_item_space_2);
        this.addItemDecoration(new c(v2, v1, v2));
    }

    public AdsProductListView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final int getOrientation() {
        return this.a;
    }

    private final AdsRecyclerViewProductGroup getProductsGroup() {
        return (AdsRecyclerViewProductGroup)this.b.getValue();
    }

    @Override  // J.h
    @l
    public AdsProductGroup getProductsGroup() {
        return this.getProductsGroup();
    }

    public final void setOrientation(int v) {
        this.a = v;
    }
}

