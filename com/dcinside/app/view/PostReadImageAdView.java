package com.dcinside.app.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.dcinside.app.ad.util.r;
import com.dcinside.app.ad.util.s;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.wv.f;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.igaworks.ssp.BannerAnimType;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd;
import com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener;
import com.kakao.adfit.ads.AdListener;
import com.kakao.adfit.ads.ba.BannerAdView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import rx.o;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nPostReadImageAdView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadImageAdView.kt\ncom/dcinside/app/view/PostReadImageAdView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,413:1\n1#2:414\n*E\n"})
public final class PostReadImageAdView extends LinearLayout implements f {
    static final class a implements AdListener {
        @m
        private final WeakReference a;
        @m
        private final WeakReference b;

        public a(@l PostReadImageAdView postReadImageAdView0, @l BannerAdView bannerAdView0) {
            L.p(postReadImageAdView0, "parent");
            L.p(bannerAdView0, "ad");
            super();
            this.a = new WeakReference(postReadImageAdView0);
            this.b = new WeakReference(bannerAdView0);
        }

        @Override  // com.kakao.adfit.ads.AdListener
        public void onAdClicked() {
        }

        @Override  // com.kakao.adfit.ads.AdListener
        public void onAdFailed(int v) {
            PostReadImageAdView postReadImageAdView0 = this.a == null ? null : ((PostReadImageAdView)this.a.get());
            BannerAdView bannerAdView0 = this.b == null ? null : ((BannerAdView)this.b.get());
            if(postReadImageAdView0 != null) {
                if(L.g(postReadImageAdView0.b, bannerAdView0)) {
                    BannerAdView bannerAdView1 = postReadImageAdView0.b;
                    if(bannerAdView1 != null) {
                        bannerAdView1.destroy();
                    }
                    postReadImageAdView0.b = null;
                    postReadImageAdView0.y();
                    return;
                }
                if(bannerAdView0 != null) {
                    bannerAdView0.destroy();
                }
            }
            else if(bannerAdView0 != null) {
                bannerAdView0.destroy();
            }
        }

        @Override  // com.kakao.adfit.ads.AdListener
        public void onAdLoaded() {
            BannerAdView bannerAdView0 = null;
            PostReadImageAdView postReadImageAdView0 = this.a == null ? null : ((PostReadImageAdView)this.a.get());
            WeakReference weakReference0 = this.b;
            if(weakReference0 != null) {
                bannerAdView0 = (BannerAdView)weakReference0.get();
            }
            if(postReadImageAdView0 == null) {
                if(bannerAdView0 != null) {
                    bannerAdView0.destroy();
                }
            }
            else if(!L.g(postReadImageAdView0.b, bannerAdView0) && bannerAdView0 != null) {
                bannerAdView0.destroy();
            }
        }
    }

    static final class b extends com.google.android.gms.ads.AdListener {
        @l
        private final WeakReference c;
        @l
        private final WeakReference d;

        public b(@l PostReadImageAdView postReadImageAdView0, @l AdView adView0) {
            L.p(postReadImageAdView0, "parent");
            L.p(adView0, "ad");
            super();
            this.c = new WeakReference(postReadImageAdView0);
            this.d = new WeakReference(adView0);
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@l LoadAdError loadAdError0) {
            L.p(loadAdError0, "p0");
            PostReadImageAdView postReadImageAdView0 = (PostReadImageAdView)this.c.get();
            AdView adView0 = (AdView)this.d.get();
            if(postReadImageAdView0 != null) {
                if(L.g(postReadImageAdView0.c, adView0)) {
                    AdView adView1 = postReadImageAdView0.c;
                    if(adView1 != null) {
                        adView1.destroy();
                    }
                    postReadImageAdView0.c = null;
                    postReadImageAdView0.y();
                    return;
                }
                if(adView0 != null) {
                    adView0.destroy();
                }
            }
            else if(adView0 != null) {
                adView0.destroy();
            }
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            PostReadImageAdView postReadImageAdView0 = (PostReadImageAdView)this.c.get();
            AdView adView0 = (AdView)this.d.get();
            if(postReadImageAdView0 == null) {
                if(adView0 != null) {
                    adView0.destroy();
                }
            }
            else if(!L.g(postReadImageAdView0.c, adView0) && adView0 != null) {
                adView0.destroy();
            }
        }
    }

    static final class c implements com.gomfactory.adpie.sdk.AdView.AdListener {
        @l
        private final WeakReference a;
        @l
        private final WeakReference b;

        public c(@l PostReadImageAdView postReadImageAdView0, @l com.gomfactory.adpie.sdk.AdView adView0) {
            L.p(postReadImageAdView0, "parent");
            L.p(adView0, "ad");
            super();
            this.a = new WeakReference(postReadImageAdView0);
            this.b = new WeakReference(adView0);
        }

        @Override  // com.gomfactory.adpie.sdk.AdView$AdListener
        public void onAdClicked() {
        }

        @Override  // com.gomfactory.adpie.sdk.AdView$AdListener
        public void onAdFailedToLoad(int v) {
            PostReadImageAdView postReadImageAdView0 = (PostReadImageAdView)this.a.get();
            com.gomfactory.adpie.sdk.AdView adView0 = (com.gomfactory.adpie.sdk.AdView)this.b.get();
            if(postReadImageAdView0 != null) {
                if(L.g(postReadImageAdView0.f, adView0)) {
                    com.gomfactory.adpie.sdk.AdView adView1 = postReadImageAdView0.f;
                    if(adView1 != null) {
                        adView1.destroy();
                    }
                    postReadImageAdView0.f = null;
                    postReadImageAdView0.y();
                    return;
                }
                if(adView0 != null) {
                    adView0.destroy();
                }
            }
            else if(adView0 != null) {
                adView0.destroy();
            }
        }

        @Override  // com.gomfactory.adpie.sdk.AdView$AdListener
        public void onAdLoaded() {
        }
    }

    public static final class d {
        private d() {
        }

        public d(w w0) {
        }
    }

    static final class e implements IBannerEventCallbackListener {
        @l
        private final WeakReference a;
        @l
        private final WeakReference b;

        public e(@l PostReadImageAdView postReadImageAdView0, @l AdPopcornSSPBannerAd adPopcornSSPBannerAd0) {
            L.p(postReadImageAdView0, "parent");
            L.p(adPopcornSSPBannerAd0, "ad");
            super();
            this.a = new WeakReference(postReadImageAdView0);
            this.b = new WeakReference(adPopcornSSPBannerAd0);
        }

        @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
        public void OnBannerAdClicked() {
        }

        @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
        public void OnBannerAdReceiveFailed(@m SSPErrorCode sSPErrorCode0) {
            PostReadImageAdView postReadImageAdView0 = (PostReadImageAdView)this.a.get();
            AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = (AdPopcornSSPBannerAd)this.b.get();
            if(postReadImageAdView0 != null) {
                if(L.g(postReadImageAdView0.e, adPopcornSSPBannerAd0)) {
                    AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = postReadImageAdView0.e;
                    if(adPopcornSSPBannerAd1 != null) {
                        adPopcornSSPBannerAd1.stopAd();
                    }
                    postReadImageAdView0.e = null;
                    postReadImageAdView0.y();
                    return;
                }
                if(adPopcornSSPBannerAd0 != null) {
                    adPopcornSSPBannerAd0.stopAd();
                }
            }
            else if(adPopcornSSPBannerAd0 != null) {
                adPopcornSSPBannerAd0.stopAd();
            }
        }

        @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
        public void OnBannerAdReceiveSuccess() {
        }
    }

    public final class com.dcinside.app.view.PostReadImageAdView.f {
        public static final int[] a;

        static {
            int[] arr_v = new int[Q.e.values().length];
            try {
                arr_v[Q.e.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Q.e.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Q.e.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Q.e.o.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Q.e.q.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.dcinside.app.view.PostReadImageAdView.f.a = arr_v;
        }
    }

    private int a;
    @m
    private BannerAdView b;
    @m
    private AdView c;
    @m
    private f d;
    @m
    private AdPopcornSSPBannerAd e;
    @m
    private com.gomfactory.adpie.sdk.AdView f;
    @m
    private com.dcinside.app.ad.util.c g;
    @m
    private o h;
    @m
    private String i;
    private int j;
    private int k;
    @l
    private Q.c l;
    @m
    private com.dcinside.app.read.C.a m;
    @l
    private List n;
    @l
    public static final d o = null;
    private static final int p = 0;
    private static final int q = 1;
    private static final int r = 2;

    static {
        PostReadImageAdView.o = new d(null);
    }

    @j
    public PostReadImageAdView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public PostReadImageAdView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public PostReadImageAdView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.l = new Q.c(false);
        this.n = u.H();
        this.setGravity(17);
        this.setAdViewHeight(Dk.b(0x7F070102));  // dimen:image_ad_height
        this.setBackground(vk.e(context0, 0x7F040242));  // attr:divide_n
    }

    public PostReadImageAdView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        return false;
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        this.a = 2;
        o o0 = this.h;
        if(o0 != null) {
            o0.l();
        }
        this.h = null;
        BannerAdView bannerAdView0 = this.b;
        if(bannerAdView0 != null) {
            bannerAdView0.destroy();
        }
        this.b = null;
        com.dcinside.app.ad.util.c c0 = this.g;
        if(c0 != null) {
            c0.onDestroy();
        }
        this.g = null;
        f f0 = this.d;
        if(f0 != null) {
            f0.onDestroy();
        }
        this.d = null;
        AdView adView0 = this.c;
        if(adView0 != null) {
            adView0.destroy();
        }
        this.c = null;
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = this.e;
        if(adPopcornSSPBannerAd0 != null) {
            adPopcornSSPBannerAd0.stopAd();
        }
        this.e = null;
        com.gomfactory.adpie.sdk.AdView adView1 = this.f;
        if(adView1 != null) {
            adView1.destroy();
        }
        this.f = null;
        s.c(this);
        this.setAdViewHeight(0);
        this.removeAllViews();
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
        f f0 = this.d;
        if(f0 != null) {
            f0.onPause();
        }
        com.dcinside.app.ad.util.c c0 = this.g;
        if(c0 != null) {
            c0.onPause();
        }
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = this.e;
        if(adPopcornSSPBannerAd0 != null) {
            adPopcornSSPBannerAd0.onPause();
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
        f f0 = this.d;
        if(f0 != null) {
            f0.onResume();
        }
        com.dcinside.app.ad.util.c c0 = this.g;
        if(c0 != null) {
            c0.onResume();
        }
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = this.e;
        if(adPopcornSSPBannerAd0 != null) {
            adPopcornSSPBannerAd0.onResume();
        }
    }

    public final void p(@m String s, int v, @l com.dcinside.app.type.m m0, @m com.dcinside.app.read.C.a c$a0) {
        L.p(m0, "galleryGrade");
        if(s == null) {
            this.onDestroy();
            return;
        }
        if(!L.g(this.m, c$a0)) {
            this.m = c$a0;
            this.l = new Q.c(s, v, m0);
            if(c$a0 != null && c$a0.b()) {
                this.onDestroy();
                return;
            }
            this.onDestroy();
            List list0 = jl.a.m();
            this.n = Q.a.d.a(list0);
            int v1 = 0;
            this.k = 0;
            this.i = s;
            if(c$a0 != null) {
                v1 = c$a0.a();
            }
            this.j = v1;
            this.y();
        }
    }

    private final void q(String s) {
        try {
            if(this.a != 1) {
                return;
            }
            if(this.b == null) {
                s.c(this);
                Context context0 = this.getContext();
                L.o(context0, "getContext(...)");
                BannerAdView bannerAdView0 = new BannerAdView(context0, null, 0, 6, null);
                this.b = bannerAdView0;
                bannerAdView0.setClientId(s);
                bannerAdView0.setAdListener(new a(this, bannerAdView0));
                this.addView(bannerAdView0);
                this.d = new R.a(bannerAdView0);
                bannerAdView0.loadAd();
            }
        }
        catch(Exception exception0) {
            timber.log.b.a.y(exception0);
        }
    }

    private final void r(String s) {
        try {
            if(this.a != 1) {
                return;
            }
            if(this.c == null) {
                s.c(this);
                AdView adView0 = new AdView(this.getContext());
                this.c = adView0;
                adView0.setAdUnitId(s);
                adView0.setAdSize(AdSize.MEDIUM_RECTANGLE);
                adView0.setAdListener(new b(this, adView0));
                this.addView(adView0);
                this.d = new R.b(adView0);
                adView0.loadAd(this.l.d());
            }
        }
        catch(Exception exception0) {
            timber.log.b.a.y(exception0);
        }
    }

    private final void s(String s) {
        try {
            if(this.a != 1) {
                return;
            }
            if(this.f == null) {
                s.c(this);
                com.gomfactory.adpie.sdk.AdView adView0 = new com.gomfactory.adpie.sdk.AdView(this.getContext());
                adView0.setInRecyclerView(true);
                adView0.setSlotId(s);
                adView0.setAdListener(new c(this, adView0));
                this.f = adView0;
                this.addView(adView0);
                adView0.load();
            }
        }
        catch(Exception exception0) {
            timber.log.b.a.y(exception0);
        }
    }

    private final void setAdViewHeight(int v) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, v);
        }
        else {
            viewGroup$LayoutParams0.height = v;
        }
        this.setLayoutParams(viewGroup$LayoutParams0);
    }

    private final void t(String s) {
        try {
            if(this.a != 1) {
                return;
            }
            if(this.e == null) {
                s.c(this);
                AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = new AdPopcornSSPBannerAd(this.getContext());
                adPopcornSSPBannerAd0.setBannerEventCallbackListener(new e(this, adPopcornSSPBannerAd0));
                adPopcornSSPBannerAd0.setPlacementId(s);
                adPopcornSSPBannerAd0.setBannerAnimType(BannerAnimType.NONE);
                adPopcornSSPBannerAd0.setAdSize(com.igaworks.ssp.AdSize.BANNER_300x250);
                adPopcornSSPBannerAd0.setAutoBgColor(false);
                this.e = adPopcornSSPBannerAd0;
                this.addView(adPopcornSSPBannerAd0);
                adPopcornSSPBannerAd0.loadAd();
            }
        }
        catch(Exception exception0) {
            timber.log.b.a.y(exception0);
        }
    }

    private final void u() {
        static final class g extends N implements Function1 {
            final PostReadImageAdView e;

            g(PostReadImageAdView postReadImageAdView0) {
                this.e = postReadImageAdView0;
                super(1);
            }

            public final void a(com.dcinside.app.model.c c0) {
                String s = com.dcinside.app.model.b.j.f(c0.g(), this.e.i, this.e.j);
                if(m0.a.a.i(s)) {
                    this.e.y();
                    return;
                }
                String s1 = this.e.i;
                L.m(s1);
                this.e.v(s1, this.e.j);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.c)object0));
                return S0.a;
            }
        }

        if(this.a != 1) {
            return;
        }
        this.h = uk.Pj().M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new g(this), "$tmp0");
            new g(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            timber.log.b.a.y(throwable0);
            this.onDestroy();
        });
    }

    private final void v(String s, int v) {
        if(this.a != 1) {
            return;
        }
        if(this.g == null) {
            s.c(this);
            this.setAdViewHeight(Dk.b(0x7F0703DE));  // dimen:script_no_image_height
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(new r(s, v, this, Q.d.d));
            com.dcinside.app.ad.util.c c0 = new com.dcinside.app.ad.util.c(arrayList0, null, 2, null);
            c0.c();
            this.g = c0;
        }
    }

    // 检测为 Lambda 实现
    private static final void w(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void x(PostReadImageAdView postReadImageAdView0, Throwable throwable0) [...]

    private final void y() {
        int v = this.k;
        this.k = v + 1;
        Q.a a0 = (Q.a)u.W2(this.n, v);
        Q.e e0 = a0 == null ? null : a0.c();
        switch((e0 == null ? -1 : com.dcinside.app.view.PostReadImageAdView.f.a[e0.ordinal()])) {
            case 1: {
                this.a = 1;
                this.setAdViewHeight(Dk.b(0x7F070102));  // dimen:image_ad_height
                this.u();
                return;
            }
            case 2: {
                this.a = 1;
                this.setAdViewHeight(Dk.b(0x7F070102));  // dimen:image_ad_height
                this.q(a0.a());
                return;
            }
            case 3: {
                this.a = 1;
                this.setAdViewHeight(Dk.b(0x7F070102));  // dimen:image_ad_height
                this.r(a0.a());
                return;
            }
            case 4: {
                this.a = 1;
                this.setAdViewHeight(Dk.b(0x7F070102));  // dimen:image_ad_height
                this.t(a0.a());
                return;
            }
            case 5: {
                this.a = 1;
                this.setAdViewHeight(Dk.b(0x7F070102));  // dimen:image_ad_height
                this.s(a0.a());
                return;
            }
            default: {
                this.onDestroy();
            }
        }
    }
}

