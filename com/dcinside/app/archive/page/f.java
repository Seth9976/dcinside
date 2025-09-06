package com.dcinside.app.archive.page;

import A3.o;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.realm.d0;
import com.dcinside.app.span.g;
import com.dcinside.app.span.h;
import com.dcinside.app.util.Bk;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.r1;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nPostArchiveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostArchiveFragment.kt\ncom/dcinside/app/archive/page/PostArchiveFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
public final class f extends e {
    @Override  // com.dcinside.app.archive.page.e
    public int B0() {
        return 0;
    }

    public final void S0() {
        Adapter recyclerView$Adapter0 = this.C0().getAdapter();
        AppCompatActivity appCompatActivity0 = null;
        a a0 = recyclerView$Adapter0 instanceof a ? ((a)recyclerView$Adapter0) : null;
        if(a0 == null) {
            return;
        }
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 instanceof AppCompatActivity) {
            appCompatActivity0 = (AppCompatActivity)fragmentActivity0;
        }
        if(appCompatActivity0 == null) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.addAll(a0.x());
        Intent intent0 = new Intent();
        intent0.putStringArrayListExtra("extra_post_append_list", arrayList0);
        intent0.putExtra("extra_post_append_mode_type", "type_post_archive");
        appCompatActivity0.setResult(-1, intent0);
        appCompatActivity0.finish();
    }

    private final boolean T0(String s) {
        Adapter recyclerView$Adapter0 = this.C0().getAdapter();
        a a0 = recyclerView$Adapter0 instanceof a ? ((a)recyclerView$Adapter0) : null;
        return a0 == null ? false : u.W1(a0.x(), s);
    }

    @Override  // com.dcinside.app.archive.page.e
    @l
    public Function1 t0() {
        @s0({"SMAP\nPostArchiveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostArchiveFragment.kt\ncom/dcinside/app/archive/page/PostArchiveFragment$funcArchiveList$1\n+ 2 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,127:1\n37#2:128\n*S KotlinDebug\n*F\n+ 1 PostArchiveFragment.kt\ncom/dcinside/app/archive/page/PostArchiveFragment$funcArchiveList$1\n*L\n62#1:128\n*E\n"})
        static final class com.dcinside.app.archive.page.f.a extends N implements Function1 {
            public static final com.dcinside.app.archive.page.f.a e;

            static {
                com.dcinside.app.archive.page.f.a.e = new com.dcinside.app.archive.page.f.a();
            }

            com.dcinside.app.archive.page.f.a() {
                super(1);
            }

            public final RealmQuery a(@l F0 f00) {
                L.p(f00, "it");
                RealmQuery realmQuery0 = f00.C4(d0.class);
                L.o(realmQuery0, "this.where(T::class.java)");
                RealmQuery realmQuery1 = realmQuery0.g2("time", r1.c);
                L.o(realmQuery1, "sort(...)");
                return realmQuery1;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((F0)object0));
            }
        }

        return com.dcinside.app.archive.page.f.a.e;
    }

    @Override  // com.dcinside.app.archive.page.e
    @l
    public o u0() {
        @s0({"SMAP\nPostArchiveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostArchiveFragment.kt\ncom/dcinside/app/archive/page/PostArchiveFragment$funcBindHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,127:1\n1#2:128\n257#3,2:129\n257#3,2:131\n*S KotlinDebug\n*F\n+ 1 PostArchiveFragment.kt\ncom/dcinside/app/archive/page/PostArchiveFragment$funcBindHolder$1\n*L\n71#1:129,2\n104#1:131,2\n*E\n"})
        static final class b extends N implements o {
            final f e;

            b(f f0) {
                this.e = f0;
                super(2);
            }

            public final void a(@l ViewHolder recyclerView$ViewHolder0, @l d0 d00) {
                String s5;
                String s3;
                L.p(recyclerView$ViewHolder0, "holder");
                L.p(d00, "item");
                if(recyclerView$ViewHolder0 instanceof i) {
                    h h0 = this.e.x0();
                    String s = d00.V5();
                    String s1 = d00.a6();
                    String s2 = d00.S5();
                    if(s2 == null) {
                        s3 = "";
                    }
                    else {
                        s3 = Bk.l(s2);
                        if(s3 == null) {
                            s3 = "";
                        }
                    }
                    int v = 8;
                    ((i)recyclerView$ViewHolder0).n().setVisibility((this.e.E0() ? 0 : 8));
                    CheckBox checkBox0 = ((i)recyclerView$ViewHolder0).n();
                    String s4 = d00.W5();
                    checkBox0.setChecked(this.e.T0(s4));
                    TextView textView0 = ((i)recyclerView$ViewHolder0).s();
                    switch(this.e.z0()) {
                        case 0: 
                        case 1: {
                            String s6 = d00.Y5();
                            if(s6 == null) {
                                s6 = "";
                            }
                            s5 = g.n(s6, h0);
                            break;
                        }
                        default: {
                            s5 = d00.Y5();
                            if(s5 == null) {
                                s5 = "";
                            }
                        }
                    }
                    textView0.setText(s5);
                    TextView textView1 = ((i)recyclerView$ViewHolder0).q();
                    switch(this.e.z0()) {
                        case 0: 
                        case 4: {
                            if(s == null) {
                                s = "";
                            }
                            s = g.n(s, h0);
                            break;
                        }
                        default: {
                            if(s == null) {
                                s = "";
                            }
                        }
                    }
                    textView1.setText(s);
                    TextView textView2 = ((i)recyclerView$ViewHolder0).r();
                    switch(this.e.z0()) {
                        case 0: 
                        case 3: {
                            if(s1 == null) {
                                s1 = "";
                            }
                            s1 = g.n(s1, h0);
                            break;
                        }
                        default: {
                            if(s1 == null) {
                                s1 = "";
                            }
                        }
                    }
                    textView2.setText(s1);
                    if(s3.length() > 0) {
                        ((i)recyclerView$ViewHolder0).o().setText(s3);
                        ((i)recyclerView$ViewHolder0).l().setVisibility(0);
                    }
                    else {
                        ((i)recyclerView$ViewHolder0).l().setVisibility(8);
                    }
                    View view0 = ((i)recyclerView$ViewHolder0).p();
                    if(!this.e.E0()) {
                        v = 0;
                    }
                    view0.setVisibility(v);
                }
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((ViewHolder)object0), ((d0)object1));
                return S0.a;
            }
        }

        return new b(this);
    }

    @Override  // com.dcinside.app.archive.page.e
    @l
    public o v0() {
        static final class c extends N implements o {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(2);
            }

            @l
            public final i a(@l LayoutInflater layoutInflater0, @l ViewGroup viewGroup0) {
                L.p(layoutInflater0, "inflater");
                L.p(viewGroup0, "parent");
                View view0 = layoutInflater0.inflate(0x7F0E0199, viewGroup0, false);  // layout:view_archive_post_item
                L.o(view0, "inflate(...)");
                return new i(view0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((LayoutInflater)object0), ((ViewGroup)object1));
            }
        }

        return c.e;
    }

    @Override  // com.dcinside.app.archive.page.e
    @l
    public Function1 w0() {
        static final class d extends N implements Function1 {
            final f e;

            d(f f0) {
                this.e = f0;
                super(1);
            }

            @l
            public final RealmQuery a(@l RealmQuery realmQuery0) {
                RealmQuery realmQuery1;
                L.p(realmQuery0, "it");
                String s = this.e.y0();
                if(s == null) {
                    s = "";
                }
                switch(this.e.z0()) {
                    case 1: {
                        realmQuery1 = realmQuery0.u("subject", s);
                        L.m(realmQuery1);
                        return realmQuery1;
                    }
                    case 2: {
                        realmQuery1 = realmQuery0.i0("galleryId", "");
                        L.m(realmQuery1);
                        return realmQuery1;
                    }
                    case 3: {
                        realmQuery1 = realmQuery0.u("writeUserName", s);
                        L.m(realmQuery1);
                        return realmQuery1;
                    }
                    case 4: {
                        realmQuery1 = realmQuery0.u("galleryName", s);
                        L.m(realmQuery1);
                        return realmQuery1;
                    }
                    default: {
                        realmQuery1 = realmQuery0.u("galleryName", s).d2().u("subject", s).d2().u("writeUserName", s);
                        L.m(realmQuery1);
                        return realmQuery1;
                    }
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((RealmQuery)object0));
            }
        }

        return new d(this);
    }
}

