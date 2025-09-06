package com.dcinside.app.ad.naver;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.codewaves.stickyheadergrid.a.b;
import com.dcinside.app.ad.util.c;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.jl;
import com.dcinside.app.wv.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSmallNaverScriptAdHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallNaverScriptAdHolder.kt\ncom/dcinside/app/ad/naver/SmallNaverScriptAdHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1#2:76\n1#2:87\n1611#3,9:77\n1863#3:86\n1864#3:88\n1620#3:89\n*S KotlinDebug\n*F\n+ 1 SmallNaverScriptAdHolder.kt\ncom/dcinside/app/ad/naver/SmallNaverScriptAdHolder\n*L\n46#1:87\n46#1:77,9\n46#1:86\n46#1:88\n46#1:89\n*E\n"})
public final class e extends b implements f {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[Q.e.values().length];
            try {
                arr_v[Q.e.r.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    private boolean a;
    @m
    private c b;
    @l
    private String c;

    public e(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        this.c = "";
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        return false;
    }

    private final List h(LifecycleOwner lifecycleOwner0, ViewGroup viewGroup0, String s, String s1, com.dcinside.app.ad.naver.a a0) {
        List list0 = jl.a.v();
        List list1 = Q.a.d.a(list0);
        d d0 = new d("search", null, s1, null, null, null, s, "on", 58, null);
        List list2 = new ArrayList();
        Iterator iterator0 = list1.iterator();
        while(iterator0.hasNext()) {
            com.dcinside.app.ad.util.l l0 = null;
            Object object0 = iterator0.next();
            if(a.a[((Q.a)object0).c().ordinal()] == 1) {
                l0 = new com.dcinside.app.ad.util.l(lifecycleOwner0, viewGroup0, d0, a0);
            }
            else if(a0 != null) {
                com.dcinside.app.ad.naver.a.a.a(a0, 0, 1, null);
            }
            if(l0 != null) {
                list2.add(l0);
            }
        }
        return list2;
    }

    static List i(e e0, LifecycleOwner lifecycleOwner0, ViewGroup viewGroup0, String s, String s1, com.dcinside.app.ad.naver.a a0, int v, Object object0) {
        if((v & 8) != 0) {
            s1 = "";
        }
        return e0.h(lifecycleOwner0, viewGroup0, s, s1, a0);
    }

    public final void j(@l LifecycleOwner lifecycleOwner0, @l String s, @l String s1, @m com.dcinside.app.ad.naver.a a0) {
        L.p(lifecycleOwner0, "lifecycleOwner");
        L.p(s, "keywords");
        L.p(s1, "galleryId");
        if(this.a) {
            return;
        }
        if(L.g(s, this.c)) {
            return;
        }
        this.c = s;
        ViewGroup viewGroup0 = this.itemView instanceof ViewGroup ? ((ViewGroup)this.itemView) : null;
        if(viewGroup0 == null) {
            return;
        }
        c c0 = this.b;
        if(c0 != null) {
            c0.onDestroy();
        }
        viewGroup0.setVisibility(4);
        viewGroup0.setMinimumHeight(Dk.d(jl.a.w()));
        c c1 = new c(this.h(lifecycleOwner0, viewGroup0, s, s1, a0), null, 2, null);
        c1.c();
        this.b = c1;
    }

    public static void k(e e0, LifecycleOwner lifecycleOwner0, String s, String s1, com.dcinside.app.ad.naver.a a0, int v, Object object0) {
        if((v & 4) != 0) {
            s1 = "";
        }
        if((v & 8) != 0) {
            a0 = null;
        }
        e0.j(lifecycleOwner0, s, s1, a0);
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        this.a = true;
        c c0 = this.b;
        if(c0 != null) {
            c0.onDestroy();
        }
        this.b = null;
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

