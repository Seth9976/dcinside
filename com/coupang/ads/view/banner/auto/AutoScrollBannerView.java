package com.coupang.ads.view.banner.auto;

import J.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.viewpager.widget.ViewPager;
import com.coupang.ads.R.id;
import com.coupang.ads.R.layout;
import com.coupang.ads.clog.b;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.dto.AdsProductPage;
import com.coupang.ads.dto.DTO;
import com.coupang.ads.dto.Impression;
import com.coupang.ads.tools.h;
import com.coupang.ads.view.base.AdsBaseView;
import com.coupang.ads.viewmodels.AdsRequest;
import com.coupang.ads.viewmodels.AdsViewModel;
import io.reactivex.B;
import io.reactivex.disposables.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.v;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import y4.l;
import y4.m;
import z3.j;

public final class AutoScrollBannerView extends AdsBaseView {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private c a;
    private boolean b;
    @l
    private HashMap c;
    @m
    private AdsProductPage d;
    private Drawable[] e;
    @l
    private final com.coupang.ads.view.a f;
    private final ViewPager g;
    @l
    public static final a h = null;
    @l
    public static final String i = "AutoScrollBannerView";

    static {
        AutoScrollBannerView.h = new a(null);
    }

    @j
    public AutoScrollBannerView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AutoScrollBannerView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AutoScrollBannerView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.b = true;
        this.c = new HashMap();
        View.inflate(context0, layout.ads_view_banner_scroll, this);
        this.f = new com.coupang.ads.view.a(this);
        ViewPager viewPager0 = (ViewPager)this.findViewById(id.banner_view_pager);
        if(this.e != null) {
            b.a.a("AutoScrollBannerView", "ext background init");
            PagerAdapter pagerAdapter0 = viewPager0.getAdapter();
            Drawable[] arr_drawable = null;
            com.coupang.ads.view.banner.auto.a a0 = pagerAdapter0 instanceof com.coupang.ads.view.banner.auto.a ? ((com.coupang.ads.view.banner.auto.a)pagerAdapter0) : null;
            if(a0 != null) {
                Drawable[] arr_drawable1 = this.e;
                if(arr_drawable1 == null) {
                    L.S("extBackground");
                }
                else {
                    arr_drawable = arr_drawable1;
                }
                a0.A(arr_drawable);
            }
        }
        this.g = viewPager0;
    }

    public AutoScrollBannerView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
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

    public final boolean getAutoPlay() {
        return this.b;
    }

    @m
    public final AdsProductPage getOriginalData() {
        return this.d;
    }

    @l
    public final HashMap getRecordMap() {
        return this.c;
    }

    @m
    public final c getSubscribe() {
        return this.a;
    }

    private final void h(ArrayList arrayList0) {
        public static final class com.coupang.ads.view.banner.auto.AutoScrollBannerView.b implements OnPageChangeListener {
            final AutoScrollBannerView a;

            com.coupang.ads.view.banner.auto.AutoScrollBannerView.b(AutoScrollBannerView autoScrollBannerView0) {
                this.a = autoScrollBannerView0;
                super();
            }

            @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
            public void a(int v, float f, int v1) {
            }

            @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
            public void b(int v) {
            }

            @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
            public void d(int v) {
                this.a.m(v);
            }
        }

        this.c.clear();
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                arrayList1.add(new e(((AdsProduct)object0)));
            }
            ViewPager viewPager0 = this.g;
            Context context0 = this.getContext();
            L.o(context0, "context");
            com.coupang.ads.view.banner.auto.a a0 = new com.coupang.ads.view.banner.auto.a(arrayList1, context0);
            if(this.e != null) {
                b.a.a("AutoScrollBannerView", "ext background init");
                Drawable[] arr_drawable = this.e;
                if(arr_drawable == null) {
                    L.S("extBackground");
                    arr_drawable = null;
                }
                a0.A(arr_drawable);
            }
            viewPager0.setAdapter(a0);
            com.coupang.ads.view.banner.auto.AutoScrollBannerView.b autoScrollBannerView$b0 = new com.coupang.ads.view.banner.auto.AutoScrollBannerView.b(this);
            this.g.c(autoScrollBannerView$b0);
            this.g.setCurrentItem(0);
            this.m(0);
            this.i();
            this.n();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void i() {
        com.coupang.ads.view.banner.auto.c c0 = (View view0, MotionEvent motionEvent0) -> {
            L.p(this, "this$0");
            switch(motionEvent0.getAction()) {
                case 0: {
                    this.r();
                    return false;
                }
                case 1: {
                    this.n();
                    return false;
                }
                default: {
                    return false;
                }
            }
        };
        this.g.setOnTouchListener(c0);
    }

    // 检测为 Lambda 实现
    private static final boolean j(AutoScrollBannerView autoScrollBannerView0, View view0, MotionEvent motionEvent0) [...]

    @k(message = "This function may case view leakage", replaceWith = @c0(expression = "bindViewModel", imports = {}))
    public final void k(long v, @m String s, @m String s1, @m String s2) {
        AdsViewModel adsViewModel0 = new AdsViewModel(new AdsRequest(String.valueOf(v), J.b.j, d.b, s, s1, s2));
        adsViewModel0.loadAdData();
        this.bindViewModel(this, adsViewModel0);
    }

    public static void l(AutoScrollBannerView autoScrollBannerView0, long v, String s, String s1, String s2, int v1, Object object0) {
        autoScrollBannerView0.k(v, ((v1 & 2) == 0 ? s : null), ((v1 & 4) == 0 ? s1 : null), ((v1 & 8) == 0 ? s2 : null));
    }

    public final void m(int v) {
        public static final class com.coupang.ads.view.banner.auto.AutoScrollBannerView.c implements Callback {
            final AutoScrollBannerView a;
            final String b;

            com.coupang.ads.view.banner.auto.AutoScrollBannerView.c(AutoScrollBannerView autoScrollBannerView0, String s) {
                this.a = autoScrollBannerView0;
                this.b = s;
                super();
            }

            @Override  // okhttp3.Callback
            public void onFailure(@l Call call0, @l IOException iOException0) {
                L.p(call0, "call");
                L.p(iOException0, "e");
            }

            @Override  // okhttp3.Callback
            public void onResponse(@l Call call0, @l Response response0) {
                L.p(call0, "call");
                L.p(response0, "response");
                this.a.getRecordMap().put(this.b, "true");
            }
        }

        String s2;
        AdsProductPage adsProductPage0 = this.d;
        if(adsProductPage0 != null) {
            ArrayList arrayList0 = adsProductPage0.getAdsProductList();
            if(arrayList0 != null) {
                try {
                    AdsProduct adsProduct0 = (AdsProduct)u.W2(arrayList0, v % arrayList0.size());
                    String s = null;
                    if(adsProduct0 != null) {
                        Impression impression0 = adsProduct0.getImpression();
                        if(impression0 != null) {
                            String s1 = impression0.getImpressionUrl();
                            if(s1 != null) {
                                if(s1.length() > 0 && !v.P1(((String)this.getRecordMap().get(s1)), "true", false, 2, null)) {
                                    com.coupang.ads.view.banner.auto.AutoScrollBannerView.c autoScrollBannerView$c0 = new com.coupang.ads.view.banner.auto.AutoScrollBannerView.c(this, s1);
                                    com.coupang.ads.e.a.c(s1, autoScrollBannerView$c0);
                                }
                                s = s1;
                            }
                        }
                    }
                    s2 = s;
                }
                catch(Throwable throwable0) {
                    s2 = e0.b(f0.a(throwable0));
                }
                String s3 = (String)com.coupang.ads.tools.l.a(s2, "AutoScrollBannerView");
            }
        }
    }

    private final void n() {
        if(this.b) {
            c c0 = this.a;
            if(c0 != null) {
                c0.dispose();
            }
            this.a = B.g3(3L, TimeUnit.SECONDS).J5(io.reactivex.schedulers.b.d()).b4(io.reactivex.android.schedulers.b.c()).E5((Long long0) -> {
                L.p(this, "this$0");
                this.g.setCurrentItem(this.g.getCurrentItem() + 1);
            });
        }
    }

    // 检测为 Lambda 实现
    private static final void o(AutoScrollBannerView autoScrollBannerView0, Long long0) [...]

    @Override  // com.coupang.ads.view.base.AdsBaseView
    public void onBindModelData(@l DTO dTO0) {
        L.p(dTO0, "data");
        AdsProductPage adsProductPage0 = com.coupang.ads.dto.b.c(dTO0);
        if(adsProductPage0 != null) {
            this.setOriginalData(adsProductPage0);
            this.h(adsProductPage0.getAdsProductList());
            this.f.k(adsProductPage0);
            h.e(adsProductPage0);
            this.requestLayout();
        }
    }

    @Override  // com.coupang.ads.view.base.AdsBaseView
    protected void onDetachedFromWindow() {
        this.r();
        super.onDetachedFromWindow();
    }

    @Override  // android.view.ViewGroup
    public void onViewRemoved(@m View view0) {
        this.r();
        super.onViewRemoved(view0);
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if(z) {
            this.n();
            return;
        }
        this.r();
    }

    public final void p() {
        this.b = true;
        this.n();
    }

    public final void q() {
        this.b = false;
        this.r();
    }

    private final void r() {
        c c0 = this.a;
        if(c0 != null) {
            c0.dispose();
        }
    }

    public final void setAutoPlay(boolean z) {
        this.b = z;
    }

    @Override  // android.view.View
    public void setBackground(@m Drawable drawable0) {
        b.a.a("AutoScrollBannerView", "ext setBackground " + drawable0);
        this.e = new Drawable[]{drawable0};
        Drawable[] arr_drawable = null;
        PagerAdapter pagerAdapter0 = this.g == null ? null : this.g.getAdapter();
        com.coupang.ads.view.banner.auto.a a0 = pagerAdapter0 instanceof com.coupang.ads.view.banner.auto.a ? ((com.coupang.ads.view.banner.auto.a)pagerAdapter0) : null;
        if(a0 != null) {
            Drawable[] arr_drawable1 = this.e;
            if(arr_drawable1 == null) {
                L.S("extBackground");
            }
            else {
                arr_drawable = arr_drawable1;
            }
            a0.A(arr_drawable);
        }
    }

    public final void setOriginalData(@m AdsProductPage adsProductPage0) {
        this.d = adsProductPage0;
    }

    public final void setRecordMap(@l HashMap hashMap0) {
        L.p(hashMap0, "<set-?>");
        this.c = hashMap0;
    }

    public final void setSubscribe(@m c c0) {
        this.a = c0;
    }
}

