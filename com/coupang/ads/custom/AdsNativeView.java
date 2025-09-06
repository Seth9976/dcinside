package com.coupang.ads.custom;

import J.b;
import J.f;
import J.i;
import L.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.dto.AdsProductPage;
import com.coupang.ads.dto.DTO;
import com.coupang.ads.tools.h;
import com.coupang.ads.view.base.AdsBaseView;
import com.coupang.ads.viewmodels.AdsViewModel;
import kotlin.e0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public class AdsNativeView extends AdsBaseView {
    @l
    private final com.coupang.ads.custom.AdsNativeView.adsOnClickListener.1 adsOnClickListener;
    @m
    private AdsPlacementLayout adsPlacementLayout;
    @m
    private i extOnAdsClickListener;

    @j
    public AdsNativeView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AdsNativeView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AdsNativeView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.adsOnClickListener = new i() {
            public final class WhenMappings {
                public static final int[] $EnumSwitchMapping$0;

                static {
                    int[] arr_v = new int[f.values().length];
                    arr_v[f.f.ordinal()] = 1;
                    arr_v[f.h.ordinal()] = 2;
                    arr_v[f.d.ordinal()] = 3;
                    arr_v[f.c.ordinal()] = 4;
                    arr_v[f.e.ordinal()] = 5;
                    arr_v[f.g.ordinal()] = 6;
                    WhenMappings.$EnumSwitchMapping$0 = arr_v;
                }
            }

            @Override  // J.i
            public void onClickPlacement(@m View view0, @l f f0, @m AdsProductPage adsProductPage0, @m AdsProduct adsProduct0) {
                L.p(f0, "viewType");
                if(adsProduct0 != null) {
                    switch(f0) {
                        case 1: 
                        case 3: 
                        case 4: 
                        case 5: {
                            AdsNativeView.this.onProductClick(adsProduct0);
                            break;
                        }
                        case 6: {
                            if(view0 != null) {
                                Context context0 = view0.getContext();
                                if(context0 != null && adsProductPage0 != null) {
                                    h.b(adsProductPage0, context0);
                                }
                            }
                        }
                    }
                }
                AdsNativeView.this.onAdsPlacementClick(view0, f0, adsProductPage0, adsProduct0);
            }

            @Override  // J.i
            public void onClickProduct(@m View view0, @l f f0, @m AdsProduct adsProduct0) {
                L.p(f0, "viewType");
                if(adsProduct0 != null) {
                    switch(f0) {
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: {
                            AdsNativeView.this.onProductClick(adsProduct0);
                        }
                    }
                }
                AdsNativeView.this.onAdsProductClick(view0, f0, adsProduct0);
            }
        };
    }

    public AdsNativeView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // com.coupang.ads.view.base.AdsBaseView
    public void _$_clearFindViewByIdCache() {
    }

    @Override  // com.coupang.ads.view.base.AdsBaseView
    public void bindViewModel(@m LifecycleOwner lifecycleOwner0, @l AdsViewModel adsViewModel0) {
        L.p(adsViewModel0, "viewModel");
        if(adsViewModel0.getRequest().getCreativeSize() != b.l) {
            throw new com.coupang.ads.b(adsViewModel0.getRequest(), "AdCreativeSize should be Native", null, 0, 12, null);
        }
        super.bindViewModel(lifecycleOwner0, adsViewModel0);
    }

    @m
    public final AdsPlacementLayout getAdsPlacementLayout() {
        return this.adsPlacementLayout;
    }

    @m
    public final i getExtOnAdsClickListener() {
        return this.extOnAdsClickListener;
    }

    public void onAdsPlacementClick(@m View view0, @l f f0, @m AdsProductPage adsProductPage0, @m AdsProduct adsProduct0) {
        L.p(f0, "viewType");
        i i0 = this.extOnAdsClickListener;
        if(i0 != null) {
            i0.onClickProduct(view0, f0, adsProduct0);
        }
    }

    public void onAdsProductClick(@m View view0, @l f f0, @m AdsProduct adsProduct0) {
        L.p(f0, "viewType");
        i i0 = this.extOnAdsClickListener;
        if(i0 != null) {
            i0.onClickProduct(view0, f0, adsProduct0);
        }
    }

    @Override  // com.coupang.ads.view.base.AdsBaseView
    public void onBindModelData(@l DTO dTO0) {
        L.p(dTO0, "data");
        AdsProductPage adsProductPage0 = com.coupang.ads.dto.b.c(dTO0);
        if(adsProductPage0 != null) {
            h.e(adsProductPage0);
        }
        AdsPlacementLayout adsPlacementLayout0 = this.adsPlacementLayout;
        if(adsPlacementLayout0 != null) {
            adsPlacementLayout0.setAdsProductPage(adsProductPage0);
        }
        this.onBindProductPage(adsProductPage0);
    }

    public void onBindProductPage(@m AdsProductPage adsProductPage0) {
    }

    private final void onProductClick(AdsProduct adsProduct0) {
        String s = adsProduct0.getClickUrl();
        if(s != null) {
            if(s.length() <= 0) {
                s = null;
            }
            if(s != null) {
                com.coupang.ads.clog.b.a.a("AdsBaseBannerView", "onSendClickEvent " + s);
                Context context0 = this.getContext();
                L.o(context0, "context");
                h.a(adsProduct0, context0);
            }
        }
        a a0 = this.getAdsListener();
        if(a0 != null) {
            a0.onAdClicked();
        }
    }

    public final void setAdsPlacementLayout(@m AdsPlacementLayout adsPlacementLayout0) {
        this.adsPlacementLayout = adsPlacementLayout0;
        if(adsPlacementLayout0 != null) {
            AdsViewModel adsViewModel0 = this.getViewModel();
            if(adsViewModel0 != null) {
                MutableLiveData mutableLiveData0 = adsViewModel0.getDataResult();
                if(mutableLiveData0 != null) {
                    e0 e00 = (e0)mutableLiveData0.f();
                    if(e00 != null) {
                        Object object0 = e00.l();
                        if(e0.i(object0)) {
                            object0 = null;
                        }
                        if(((DTO)object0) != null) {
                            adsPlacementLayout0.setAdsProductPage(com.coupang.ads.dto.b.c(((DTO)object0)));
                        }
                    }
                }
            }
            adsPlacementLayout0.setOnAdsClickListener(this.adsOnClickListener);
        }
    }

    public final void setExtOnAdsClickListener(@m i i0) {
        this.extOnAdsClickListener = i0;
    }
}

