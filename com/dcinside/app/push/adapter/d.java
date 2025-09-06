package com.dcinside.app.push.adapter;

import A3.p;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.push.GalleryPushSettingActivity;
import com.dcinside.app.push.SettingPushGalleryActivity;
import g0.c;
import g0.f.b;
import h0.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nPushKeywordAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushKeywordAdapter.kt\ncom/dcinside/app/push/adapter/PushKeywordAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1863#2,2:105\n1863#2:107\n1611#2,9:108\n1863#2:117\n1864#2:119\n1620#2:120\n1864#2:121\n1#3:118\n*S KotlinDebug\n*F\n+ 1 PushKeywordAdapter.kt\ncom/dcinside/app/push/adapter/PushKeywordAdapter\n*L\n78#1:105,2\n92#1:107\n93#1:108,9\n93#1:117\n93#1:119\n93#1:120\n92#1:121\n93#1:118\n*E\n"})
public final class d extends Adapter {
    static final class a {
        @m
        private final String a;
        @m
        private final String b;
        @m
        private final List c;

        public a(@m String s, @m String s1, @m List list0) {
            this.a = s;
            this.b = s1;
            this.c = list0;
        }

        @m
        public final String a() {
            return this.a;
        }

        @m
        public final String b() {
            return this.b;
        }

        @m
        public final List c() {
            return this.c;
        }

        @l
        public final a d(@m String s, @m String s1, @m List list0) {
            return new a(s, s1, list0);
        }

        public static a e(a d$a0, String s, String s1, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                s = d$a0.a;
            }
            if((v & 2) != 0) {
                s1 = d$a0.b;
            }
            if((v & 4) != 0) {
                list0 = d$a0.c;
            }
            return d$a0.d(s, s1, list0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            if(!L.g(this.a, ((a)object0).a)) {
                return false;
            }
            return L.g(this.b, ((a)object0).b) ? L.g(this.c, ((a)object0).c) : false;
        }

        @m
        public final String f() {
            return this.a;
        }

        @m
        public final String g() {
            return this.b;
        }

        @m
        public final List h() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            int v2 = this.b == null ? 0 : this.b.hashCode();
            List list0 = this.c;
            if(list0 != null) {
                v = list0.hashCode();
            }
            return (v1 * 0x1F + v2) * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "GalleryKeyword(gallId=" + this.a + ", gallName=" + this.b + ", keywords=" + this.c + ")";
        }
    }

    @l
    private ArrayList a;
    @l
    private c b;

    public d() {
        this.a = new ArrayList();
        this.b = c.i;
    }

    private final void A(Context context0, String s, String s1) {
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        GalleryPushSettingActivity.B.a(appCompatActivity0, s, s1, "galleryKeywordAction");
    }

    private final void B(Context context0, String s, String s1) {
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        SettingPushGalleryActivity.y.c(appCompatActivity0, s, s1);
    }

    public final void C(@l List list0) {
        L.p(list0, "list");
        this.a.clear();
        for(Object object0: list0) {
            a d$a0 = new a(((b)object0).d(), ((b)object0).e(), ((b)object0).f());
            this.a.add(d$a0);
        }
        this.b = c.i;
        this.notifyDataSetChanged();
    }

    public final void D(@l List list0) {
        L.p(list0, "list");
        this.a.clear();
        for(Object object0: list0) {
            b f$b0 = (b)object0;
            List list1 = f$b0.l();
            if(list1 != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: list1) {
                    String s = ((g0.f.d)object1).b();
                    if(s != null) {
                        arrayList0.add(s);
                    }
                }
                a d$a0 = new a(f$b0.d(), f$b0.e(), arrayList0);
                this.a.add(d$a0);
            }
        }
        this.b = c.k;
        this.notifyDataSetChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.y(((g)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.z(viewGroup0, v);
    }

    public void y(@l g g0, int v) {
        @f(c = "com.dcinside.app.push.adapter.PushKeywordAdapter$onBindViewHolder$1", f = "PushKeywordAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.adapter.d.b extends o implements p {
            int k;
            final d l;
            final Context m;
            final String n;
            final String o;

            com.dcinside.app.push.adapter.d.b(d d0, Context context0, String s, String s1, kotlin.coroutines.d d1) {
                this.l = d0;
                this.m = context0;
                this.n = s;
                this.o = s1;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.push.adapter.d.b(this.l, this.m, this.n, this.o, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                if(this.l.b == c.i) {
                    L.o(this.m, "$context");
                    this.l.A(this.m, this.n, this.o);
                    return S0.a;
                }
                L.o(this.m, "$context");
                this.l.B(this.m, this.n, this.o);
                return S0.a;
            }
        }

        L.p(g0, "holder");
        Context context0 = g0.itemView.getContext();
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        String s = ((a)object0).g();
        String s1 = s == null ? "" : s;
        String s2 = ((a)object0).f();
        List list0 = ((a)object0).h();
        String s3 = list0 == null ? null : TextUtils.join(", ", list0);
        g0.e().setText(s1);
        g0.h().setText(s3);
        List list1 = ((a)object0).h();
        g0.f().setText(String.valueOf((list1 == null ? null : list1.size())));
        L.o(g0.itemView, "itemView");
        com.dcinside.app.push.adapter.d.b d$b0 = new com.dcinside.app.push.adapter.d.b(this, context0, (s2 == null ? "" : s2), s1, null);
        r.M(g0.itemView, null, d$b0, 1, null);
    }

    @l
    public g z(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0245, viewGroup0, false);  // layout:view_push_keyword_item
        L.m(view0);
        return new g(view0);
    }
}

