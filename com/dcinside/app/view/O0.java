package com.dcinside.app.view;

import Q.e;
import S.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dcinside.app.ad.util.c;
import com.dcinside.app.ad.util.d;
import com.dcinside.app.ad.util.i;
import com.dcinside.app.ad.util.k;
import com.dcinside.app.image.s;
import com.dcinside.app.util.jl;
import com.dcinside.app.wv.f;
import com.google.android.gms.ads.nativead.NativeAd.Image;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nPostReadTopAdView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadTopAdView.kt\ncom/dcinside/app/view/PostReadTopAdView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1611#2,9:151\n1863#2:160\n1864#2:162\n1620#2:163\n1#3:161\n1#3:164\n*S KotlinDebug\n*F\n+ 1 PostReadTopAdView.kt\ncom/dcinside/app/view/PostReadTopAdView\n*L\n45#1:151,9\n45#1:160\n45#1:162\n45#1:163\n45#1:161\n*E\n"})
public final class o0 extends LinearLayout implements f, Function1 {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[e.values().length];
            try {
                arr_v[e.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.g.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.n.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.p.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @m
    private c a;
    @m
    private com.dcinside.app.read.C.a b;

    public o0(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        this.setGravity(17);
    }

    private final void a(S.c c0) {
        NativeAd nativeAd0 = c0.c();
        String s = nativeAd0.getCallToAction();
        String s1 = "";
        if(s == null) {
            s = "";
        }
        String s2 = nativeAd0.getHeadline();
        if(s2 == null) {
            s2 = "";
        }
        String s3 = nativeAd0.getBody();
        if(s3 != null) {
            s1 = s3;
        }
        View view0 = c0.a(this, 0x7F0E0256);  // layout:view_read_top_native
        L.m(view0);
        this.addView(((NativeAdView)view0));
        TextView textView0 = (TextView)((NativeAdView)view0).findViewById(0x7F0B0C97);  // id:read_top_native_title
        if(textView0 == null) {
            textView0 = null;
        }
        else {
            textView0.setText(s2);
        }
        ((NativeAdView)view0).setHeadlineView(textView0);
        TextView textView1 = (TextView)((NativeAdView)view0).findViewById(0x7F0B0C93);  // id:read_top_native_desc
        if(textView1 == null) {
            textView1 = null;
        }
        else {
            textView1.setText(s1);
        }
        ((NativeAdView)view0).setBodyView(textView1);
        Image nativeAd$Image0 = nativeAd0.getIcon();
        ImageView imageView0 = (ImageView)((NativeAdView)view0).findViewById(0x7F0B0C95);  // id:read_top_native_icon
        if(nativeAd$Image0 != null && nativeAd$Image0.getDrawable() != null) {
            imageView0.setVisibility(0);
            L.m(imageView0);
            s.b(imageView0);
            imageView0.setImageDrawable(nativeAd$Image0.getDrawable());
            ((NativeAdView)view0).setIconView(imageView0);
        }
        else if(nativeAd$Image0 == null || nativeAd$Image0.getUri() == null) {
            imageView0.setVisibility(8);
            L.m(imageView0);
            s.b(imageView0);
            imageView0.setImageDrawable(null);
        }
        else {
            imageView0.setVisibility(0);
            L.m(imageView0);
            s.f(imageView0, nativeAd$Image0.getUri()).apply();
            ((NativeAdView)view0).setIconView(imageView0);
        }
        View view1 = ((NativeAdView)view0).findViewById(0x7F0B0C91);  // id:read_top_native_action
        L.o(view1, "findViewById(...)");
        ((TextView)view1).setText(s);
        ((NativeAdView)view0).setCallToActionView(((TextView)view1));
        ((NativeAdView)view0).setNativeAd(nativeAd0);
    }

    private final List b(Q.c c0) {
        k k0;
        Context context0 = this.getContext();
        List list0 = jl.a.n();
        Iterable iterable0 = Q.a.d.a(list0);
        List list1 = new ArrayList();
        for(Object object0: iterable0) {
            Q.a a0 = (Q.a)object0;
            switch(a0.c()) {
                case 1: {
                    L.m(context0);
                    k0 = new k(context0, a0.a(), this, c0, 0, 16, null);
                    break;
                }
                case 2: {
                    k0 = new com.dcinside.app.ad.util.e(this, a0.a(), c0);
                    break;
                }
                case 3: {
                    k0 = new d(this, a0.a());
                    break;
                }
                case 4: {
                    k0 = new i(this, a0.a());
                    break;
                }
                case 5: {
                    k0 = new com.dcinside.app.ad.util.f(this, a0.a());
                    break;
                }
                default: {
                    k0 = null;
                }
            }
            if(k0 != null) {
                list1.add(k0);
            }
        }
        return list1;
    }

    public void c(@l b b0) {
        L.p(b0, "ad");
        com.dcinside.app.ad.util.s.c(this);
        if(b0 instanceof S.c) {
            this.a(((S.c)b0));
        }
    }

    public final void d(@m com.dcinside.app.read.C.a c$a0, @l Q.c c0) {
        L.p(c0, "adHost");
        if(!L.g(this.b, c$a0)) {
            this.b = c$a0;
            if(c$a0 != null && !c$a0.d() && c$a0.b()) {
                com.dcinside.app.ad.util.s.c(this);
                c c1 = this.a;
                if(c1 != null) {
                    c1.onDestroy();
                }
                this.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                this.setMinimumHeight(0);
                c c2 = new c(this.b(c0), null, 2, null);
                c2.c();
                this.a = c2;
                return;
            }
            c c3 = this.a;
            if(c3 != null) {
                c3.onDestroy();
            }
            this.a = null;
            com.dcinside.app.ad.util.s.c(this);
            this.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
            this.setMinimumHeight(0);
        }
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        return false;
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.c(((b)object0));
        return S0.a;
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        c c0 = this.a;
        if(c0 != null) {
            c0.onDestroy();
        }
        this.a = null;
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
        c c0 = this.a;
        if(c0 != null) {
            c0.onPause();
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
        c c0 = this.a;
        if(c0 != null) {
            c0.onResume();
        }
    }
}

