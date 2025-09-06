package com.dcinside.app.ad.util;

import android.view.View;
import android.view.ViewGroup;
import com.dcinside.app.wv.VideoEnabledWebView;
import com.dcinside.app.wv.WebViews.c;
import com.dcinside.app.wv.f;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.kakao.adfit.ads.ba.BannerAdView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.T;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nAdUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdUtil.kt\ncom/dcinside/app/ad/util/AdUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n36#1,3:88\n1611#2,9:73\n1863#2:82\n1864#2:84\n1620#2:85\n1863#2,2:86\n1#3:83\n*S KotlinDebug\n*F\n+ 1 AdUtil.kt\ncom/dcinside/app/ad/util/AdUtil\n*L\n59#1:88,3\n45#1:73,9\n45#1:82\n45#1:84\n45#1:85\n46#1:86,2\n45#1:83\n*E\n"})
public final class s {
    @l
    public static final s a;

    static {
        s.a = new s();
    }

    @l
    @n
    public static final AdRequest a() {
        AdRequest adRequest0 = new Builder().build();
        L.o(adRequest0, "build(...)");
        return adRequest0;
    }

    @l
    @n
    public static final AdRequest b(@l String s) {
        L.p(s, "contentUrl");
        AdRequest adRequest0 = ((Builder)new Builder().setContentUrl(s)).build();
        L.o(adRequest0, "build(...)");
        return adRequest0;
    }

    @n
    public static final void c(@m ViewGroup viewGroup0) {
        if(viewGroup0 == null) {
            return;
        }
        kotlin.ranges.l l0 = kotlin.ranges.s.W1(0, viewGroup0.getChildCount());
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = l0.iterator();
        while(iterator0.hasNext()) {
            View view0 = viewGroup0.getChildAt(((T)iterator0).b());
            if(view0 != null) {
                arrayList0.add(view0);
            }
        }
        for(Object object0: arrayList0) {
            s.d(((View)object0));
        }
        viewGroup0.removeAllViews();
    }

    @n
    private static final void d(View view0) {
        Object object0 = null;
        if(view0 != null) {
            if(view0 instanceof NativeAdView) {
                MediaView mediaView0 = ((NativeAdView)view0).getMediaView();
                if(mediaView0 != null) {
                    mediaView0.setOnHierarchyChangeListener(null);
                }
                ((NativeAdView)view0).destroy();
                return;
            }
            if(view0 instanceof VideoEnabledWebView) {
                Object object1 = view0.getTag(0x7F0B06E6);  // id:life_cycle
                WeakReference weakReference0 = object1 instanceof WeakReference ? ((WeakReference)object1) : null;
                Object object2 = weakReference0 == null ? null : weakReference0.get();
                if(object2 instanceof c) {
                    object0 = object2;
                }
                if(((c)object0) != null) {
                    ((c)object0).onDestroy();
                }
            }
            else {
                if(view0 instanceof BannerAdView) {
                    ((BannerAdView)view0).setAdListener(null);
                    ((BannerAdView)view0).destroy();
                    return;
                }
                if(view0 instanceof AdView) {
                    ((AdView)view0).destroy();
                }
            }
        }
    }

    private final f e(View view0) {
        Object object0 = view0.getTag(0x7F0B06E6);  // id:life_cycle
        Object object1 = null;
        WeakReference weakReference0 = object0 instanceof WeakReference ? ((WeakReference)object0) : null;
        if(weakReference0 != null) {
            object1 = weakReference0.get();
        }
        L.y(2, "T");
        return (f)object1;
    }
}

