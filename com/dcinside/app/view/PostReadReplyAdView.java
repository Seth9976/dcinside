package com.dcinside.app.view;

import Q.e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;
import com.dcinside.app.ad.util.c;
import com.dcinside.app.ad.util.d;
import com.dcinside.app.ad.util.i;
import com.dcinside.app.ad.util.s;
import com.dcinside.app.read.c0;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.jl;
import com.dcinside.app.wv.f;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd.Image;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.kakao.adfit.ads.na.AdFitMediaView;
import com.kakao.adfit.ads.na.AdFitNativeAdBinder;
import com.kakao.adfit.ads.na.AdFitNativeAdLayout.Builder;
import com.kakao.adfit.ads.na.AdFitNativeAdView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nPostReadReplyAdView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadReplyAdView.kt\ncom/dcinside/app/view/PostReadReplyAdView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1611#2,9:206\n1863#2:215\n1864#2:217\n1620#2:218\n1#3:216\n1#3:219\n*S KotlinDebug\n*F\n+ 1 PostReadReplyAdView.kt\ncom/dcinside/app/view/PostReadReplyAdView\n*L\n69#1:206,9\n69#1:215\n69#1:217\n69#1:218\n69#1:216\n*E\n"})
public final class PostReadReplyAdView extends FrameLayout implements ViewGroup.OnHierarchyChangeListener, f {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[e.values().length];
            try {
                arr_v[e.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.n.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.p.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @m
    private com.dcinside.app.read.C.a a;
    @m
    private c b;
    private boolean c;

    @j
    public PostReadReplyAdView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public PostReadReplyAdView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public PostReadReplyAdView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public PostReadReplyAdView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final void a(AdFitNativeAdBinder adFitNativeAdBinder0) {
        this.setVisibility(0);
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.getContext());
        if(this.getChildCount() > 0) {
            s.c(this);
        }
        View view0 = layoutInflater0.inflate(0x7F0E0251, this, false);  // layout:view_read_reply_native_adfit
        AdFitNativeAdView adFitNativeAdView0 = view0 instanceof AdFitNativeAdView ? ((AdFitNativeAdView)view0) : null;
        if(adFitNativeAdView0 == null) {
            return;
        }
        this.addView(adFitNativeAdView0);
        Builder adFitNativeAdLayout$Builder0 = new Builder(adFitNativeAdView0);
        View view1 = adFitNativeAdView0.findViewById(0x7F0B0C7C);  // id:read_reply_native_adfit_title
        L.o(view1, "findViewById(...)");
        Builder adFitNativeAdLayout$Builder1 = adFitNativeAdLayout$Builder0.setTitleView(((TextView)view1));
        View view2 = adFitNativeAdView0.findViewById(0x7F0B0C79);  // id:read_reply_native_adfit_icon
        L.o(view2, "findViewById(...)");
        Builder adFitNativeAdLayout$Builder2 = adFitNativeAdLayout$Builder1.setProfileIconView(((ImageView)view2));
        View view3 = adFitNativeAdView0.findViewById(0x7F0B0C77);  // id:read_reply_native_adfit_desc
        L.o(view3, "findViewById(...)");
        Builder adFitNativeAdLayout$Builder3 = adFitNativeAdLayout$Builder2.setProfileNameView(((TextView)view3)).setMediaView(((AdFitMediaView)adFitNativeAdView0.findViewById(0x7F0B0C7A)));  // id:read_reply_native_adfit_media
        View view4 = adFitNativeAdView0.findViewById(0x7F0B0C75);  // id:read_reply_native_adfit_action
        L.o(view4, "findViewById(...)");
        adFitNativeAdBinder0.bind(adFitNativeAdLayout$Builder3.setCallToActionButton(((Button)view4)).build());
    }

    private final void b(NativeAd nativeAd0) {
        this.setVisibility(0);
        String s = nativeAd0.getCallToAction();
        String s1 = nativeAd0.getHeadline();
        String s2 = "";
        if(s1 == null) {
            s1 = "";
        }
        Image nativeAd$Image0 = nativeAd0.getIcon();
        String s3 = nativeAd0.getBody();
        if(s3 != null) {
            s2 = s3;
        }
        View view0 = LayoutInflater.from(this.getContext()).inflate(0x7F0E0252, this, false);  // layout:view_read_reply_native_admob
        NativeAdView nativeAdView0 = view0 instanceof NativeAdView ? ((NativeAdView)view0) : null;
        if(nativeAdView0 == null) {
            return;
        }
        View view1 = nativeAdView0.findViewById(0x7F0B0C84);  // id:read_reply_native_title
        ((TextView)view1).setText(s1);
        nativeAdView0.setHeadlineView(view1);
        View view2 = nativeAdView0.findViewById(0x7F0B0C7F);  // id:read_reply_native_desc
        ((TextView)view2).setText(s2);
        nativeAdView0.setBodyView(view2);
        View view3 = nativeAdView0.findViewById(0x7F0B0C82);  // id:read_reply_native_media
        L.o(view3, "findViewById(...)");
        ((MediaView)view3).setOnHierarchyChangeListener(this);
        nativeAdView0.setMediaView(((MediaView)view3));
        View view4 = nativeAdView0.findViewById(0x7F0B0C81);  // id:read_reply_native_icon
        ImageView imageView0 = (ImageView)view4;
        try {
            if(nativeAd$Image0 == null) {
                L.m(imageView0);
                com.dcinside.app.image.s.b(imageView0);
                imageView0.setImageResource(0);
            }
            else {
                L.m(imageView0);
                com.dcinside.app.image.s.f(imageView0, nativeAd$Image0.getUri()).apply();
            }
        }
        catch(Exception unused_ex) {
            L.m(imageView0);
            com.dcinside.app.image.s.b(imageView0);
            imageView0.setImageResource(0);
        }
        nativeAdView0.setIconView(view4);
        View view5 = nativeAdView0.findViewById(0x7F0B0C74);  // id:read_reply_native_action
        ((TextView)view5).setText(s);
        nativeAdView0.setCallToActionView(view5);
        nativeAdView0.setNativeAd(nativeAd0);
        if(this.getChildCount() > 0) {
            this.removeAllViews();
        }
        this.addView(nativeAdView0);
    }

    private final List c(boolean z, Q.c c0) {
        d d0;
        List list1;
        if(z) {
            List list0 = jl.a.l();
            list1 = Q.a.d.a(list0);
        }
        else {
            List list2 = jl.a.k();
            list1 = Q.a.d.a(list2);
        }
        List list3 = new ArrayList();
        for(Object object0: list1) {
            Q.a a0 = (Q.a)object0;
            switch(a0.c()) {
                case 1: {
                    d0 = new d(this, a0.a());
                    break;
                }
                case 2: {
                    d0 = new com.dcinside.app.ad.util.e(this, a0.a(), c0);
                    break;
                }
                case 3: {
                    d0 = new i(this, a0.a());
                    break;
                }
                case 4: {
                    d0 = new com.dcinside.app.ad.util.f(this, a0.a());
                    break;
                }
                default: {
                    d0 = null;
                }
            }
            if(d0 != null) {
                list3.add(d0);
            }
        }
        return list3;
    }

    public final void d(@m com.dcinside.app.read.C.a c$a0, boolean z, @l Q.c c0) {
        L.p(c0, "adHost");
        if(this.c) {
            return;
        }
        if(!L.g(this.a, c$a0)) {
            this.a = c$a0;
            c c1 = this.b;
            if(c1 != null) {
                c1.onDestroy();
            }
            this.setMinimumHeight(Dk.b(0x7F070058));  // dimen:ad_minimum_height
            this.setLayoutParams(new ViewGroup.LayoutParams(-1, this.getMinimumHeight()));
            c c2 = new c(this.c(z, c0), null, 2, null);
            c2.c();
            this.b = c2;
            return;
        }
        c c3 = this.b;
        if(c3 != null) {
            com.dcinside.app.ad.util.a a0 = c3.b();
            if(a0 != null && a0.a()) {
                c c4 = this.b;
                if(c4 != null) {
                    c4.onDestroy();
                }
                c c5 = new c(this.c(z, c0), null, 2, null);
                c5.c();
                this.b = c5;
                return;
            }
        }
        c c6 = this.b;
        if(c6 != null) {
            c6.onResume();
        }
    }

    public static void e(PostReadReplyAdView postReadReplyAdView0, com.dcinside.app.read.C.a c$a0, boolean z, Q.c c0, int v, Object object0) {
        if((v & 1) != 0) {
            c$a0 = null;
        }
        postReadReplyAdView0.d(c$a0, z, c0);
    }

    public final void f(@m c0 c00) {
        if(this.c) {
            return;
        }
        if(c00 == null) {
            return;
        }
        if(this.getChildCount() > 0 && !c00.r()) {
            return;
        }
        if(!c00.m()) {
            c00 = null;
        }
        if(c00 == null) {
            if(this.getChildCount() > 0) {
                this.removeAllViews();
            }
            return;
        }
        if(c00.k() != null) {
            NativeAd nativeAd0 = c00.k();
            if(nativeAd0 != null) {
                this.b(nativeAd0);
            }
        }
        else if(c00.j() != null) {
            AdFitNativeAdBinder adFitNativeAdBinder0 = c00.j();
            if(adFitNativeAdBinder0 != null) {
                this.a(adFitNativeAdBinder0);
            }
        }
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        return false;
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public void onChildViewAdded(@m View view0, @m View view1) {
        ImageView imageView0 = null;
        ViewGroup viewGroup0 = view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
        if(viewGroup0 != null) {
            viewGroup0.setOnHierarchyChangeListener(null);
        }
        if(view1 instanceof ImageView) {
            imageView0 = (ImageView)view1;
        }
        if(imageView0 != null) {
            imageView0.setAdjustViewBounds(true);
            imageView0.setScaleType(ImageView.ScaleType.FIT_START);
        }
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public void onChildViewRemoved(@m View view0, @m View view1) {
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        this.c = true;
        c c0 = this.b;
        if(c0 != null) {
            c0.onDestroy();
        }
        this.b = null;
        s.c(this);
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
        c c0 = this.b;
        if(c0 != null) {
            c0.onPause();
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
        c c0 = this.b;
        if(c0 != null) {
            c0.onResume();
        }
    }
}

