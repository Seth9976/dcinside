package com.dcinside.app.archive.page;

import A3.o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.realm.A0;
import com.dcinside.app.span.g;
import com.dcinside.app.span.h;
import com.dcinside.app.util.Bk;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.r1;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

public final class k extends e {
    @Override  // com.dcinside.app.archive.page.e
    public int B0() {
        return 1;
    }

    @Override  // com.dcinside.app.archive.page.e
    @l
    public Function1 t0() {
        @s0({"SMAP\nVoiceArchiveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceArchiveFragment.kt\ncom/dcinside/app/archive/page/VoiceArchiveFragment$funcArchiveList$1\n+ 2 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,114:1\n37#2:115\n*S KotlinDebug\n*F\n+ 1 VoiceArchiveFragment.kt\ncom/dcinside/app/archive/page/VoiceArchiveFragment$funcArchiveList$1\n*L\n56#1:115\n*E\n"})
        static final class a extends N implements Function1 {
            public static final a e;

            static {
                a.e = new a();
            }

            a() {
                super(1);
            }

            public final RealmQuery a(@l F0 f00) {
                L.p(f00, "it");
                RealmQuery realmQuery0 = f00.C4(A0.class);
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

        return a.e;
    }

    @Override  // com.dcinside.app.archive.page.e
    @l
    public o u0() {
        @s0({"SMAP\nVoiceArchiveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceArchiveFragment.kt\ncom/dcinside/app/archive/page/VoiceArchiveFragment$funcBindHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"})
        static final class b extends N implements o {
            final k e;

            b(k k0) {
                this.e = k0;
                super(2);
            }

            public final void a(@l ViewHolder recyclerView$ViewHolder0, @l A0 a00) {
                String s6;
                String s4;
                String s3;
                L.p(recyclerView$ViewHolder0, "holder");
                L.p(a00, "item");
                if(recyclerView$ViewHolder0 instanceof p) {
                    h h0 = this.e.x0();
                    String s = a00.T5();
                    String s1 = a00.Z5();
                    String s2 = a00.Q5();
                    if(s2 == null) {
                        s3 = "";
                    }
                    else {
                        s3 = Bk.l(s2);
                        if(s3 == null) {
                            s3 = "";
                        }
                    }
                    TextView textView0 = ((p)recyclerView$ViewHolder0).r();
                    switch(this.e.z0()) {
                        case 0: 
                        case 2: {
                            String s5 = a00.U5();
                            if(s5 == null) {
                                s5 = "";
                            }
                            s4 = g.n(s5, h0);
                            break;
                        }
                        default: {
                            s4 = a00.U5();
                            if(s4 == null) {
                                s4 = "";
                            }
                        }
                    }
                    textView0.setText(s4);
                    TextView textView1 = ((p)recyclerView$ViewHolder0).t();
                    switch(this.e.z0()) {
                        case 0: 
                        case 3: {
                            String s7 = a00.X5();
                            if(s7 == null) {
                                s7 = "";
                            }
                            s6 = g.n(s7, h0);
                            break;
                        }
                        default: {
                            s6 = a00.X5();
                            if(s6 == null) {
                                s6 = "";
                            }
                        }
                    }
                    textView1.setText(s6);
                    TextView textView2 = ((p)recyclerView$ViewHolder0).q();
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
                    textView2.setText(s);
                    TextView textView3 = ((p)recyclerView$ViewHolder0).s();
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
                    textView3.setText(s1);
                    if(s3.length() > 0) {
                        ((p)recyclerView$ViewHolder0).p().setText(s3);
                        ((p)recyclerView$ViewHolder0).n().setVisibility(0);
                        return;
                    }
                    ((p)recyclerView$ViewHolder0).n().setVisibility(8);
                }
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((ViewHolder)object0), ((A0)object1));
                return S0.a;
            }
        }

        return new b(this);
    }

    @Override  // com.dcinside.app.archive.page.e
    @l
    public o v0() {
        static final class c extends N implements o {
            final k e;

            c(k k0) {
                this.e = k0;
                super(2);
            }

            @l
            public final p a(@l LayoutInflater layoutInflater0, @l ViewGroup viewGroup0) {
                L.p(layoutInflater0, "inflater");
                L.p(viewGroup0, "parent");
                View view0 = layoutInflater0.inflate(0x7F0E019C, viewGroup0, false);  // layout:view_archive_voice_item
                L.m(view0);
                return new p(view0, this.e.D0());
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((LayoutInflater)object0), ((ViewGroup)object1));
            }
        }

        return new c(this);
    }

    @Override  // com.dcinside.app.archive.page.e
    @l
    public Function1 w0() {
        static final class d extends N implements Function1 {
            final k e;

            d(k k0) {
                this.e = k0;
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
                        realmQuery1 = realmQuery0.u("memo", s);
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
                        realmQuery1 = realmQuery0.u("galleryName", s).d2().u("subject", s).d2().u("writeUserName", s).d2().u("memo", s);
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

