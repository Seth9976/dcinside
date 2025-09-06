package com.dcinside.app.main.adapter;

import Q.d;
import Q.e;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.ad.util.c;
import com.dcinside.app.ad.util.i;
import com.dcinside.app.ad.util.r;
import com.dcinside.app.ad.util.s;
import com.dcinside.app.util.jl;
import com.dcinside.app.wv.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nMainAdHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainAdHolder.kt\ncom/dcinside/app/main/adapter/MainAdHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1#2:63\n1#2:74\n1611#3,9:64\n1863#3:73\n1864#3:75\n1620#3:76\n*S KotlinDebug\n*F\n+ 1 MainAdHolder.kt\ncom/dcinside/app/main/adapter/MainAdHolder\n*L\n32#1:74\n32#1:64,9\n32#1:73\n32#1:75\n32#1:76\n*E\n"})
public final class a extends ViewHolder implements f {
    public final class com.dcinside.app.main.adapter.a.a {
        public static final int[] a;

        static {
            int[] arr_v = new int[e.values().length];
            try {
                arr_v[e.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.c.ordinal()] = 3;
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
            com.dcinside.app.main.adapter.a.a.a = arr_v;
        }
    }

    @m
    private c a;

    public a(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        c c0 = new c(this.e(), null, 2, null);
        c0.c();
        this.a = c0;
    }

    private final List e() {
        r r0;
        L.n(this.itemView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup0 = (ViewGroup)this.itemView;
        List list0 = jl.a.j();
        Iterable iterable0 = Q.a.d.a(list0);
        List list1 = new ArrayList();
        for(Object object0: iterable0) {
            Q.a a0 = (Q.a)object0;
            switch(a0.c()) {
                case 1: {
                    r0 = new r("", -1, viewGroup0, d.a);
                    break;
                }
                case 2: {
                    r0 = new com.dcinside.app.ad.util.d(viewGroup0, a0.a());
                    break;
                }
                case 3: {
                    r0 = new com.dcinside.app.ad.util.e(viewGroup0, a0.a(), new Q.c(true));
                    break;
                }
                case 4: {
                    r0 = new i(viewGroup0, a0.a());
                    break;
                }
                case 5: {
                    r0 = new com.dcinside.app.ad.util.f(viewGroup0, a0.a());
                    break;
                }
                default: {
                    r0 = null;
                }
            }
            if(r0 != null) {
                list1.add(r0);
            }
        }
        return list1;
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        return false;
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        c c0 = this.a;
        if(c0 != null) {
            c0.onDestroy();
        }
        ViewGroup viewGroup0 = null;
        this.a = null;
        View view0 = this.itemView;
        if(view0 instanceof ViewGroup) {
            viewGroup0 = (ViewGroup)view0;
        }
        s.c(viewGroup0);
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

