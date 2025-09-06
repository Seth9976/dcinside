package com.dcinside.app.push.adapter;

import A3.p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.push.i;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import g0.c;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nGalleryPushItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryPushItemAdapter.kt\ncom/dcinside/app/push/adapter/GalleryPushItemAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n257#2,2:160\n257#2,2:162\n257#2,2:164\n1557#3:166\n1628#3,3:167\n1557#3:170\n1628#3,2:171\n1557#3:173\n1628#3,3:174\n1630#3:177\n1557#3:178\n1628#3,3:179\n230#3,2:182\n230#3,2:184\n*S KotlinDebug\n*F\n+ 1 GalleryPushItemAdapter.kt\ncom/dcinside/app/push/adapter/GalleryPushItemAdapter\n*L\n53#1:160,2\n57#1:162,2\n63#1:164,2\n95#1:166\n95#1:167,3\n104#1:170\n104#1:171,2\n105#1:173\n105#1:174,3\n104#1:177\n117#1:178\n117#1:179,3\n126#1:182,2\n143#1:184,2\n*E\n"})
public final class b extends Adapter {
    static final class a {
        @m
        private final String a;
        @m
        private final String b;
        @m
        private final String c;

        public a(@m String s, @m String s1, @m String s2) {
            this.a = s;
            this.b = s1;
            this.c = s2;
        }

        public a(String s, String s1, String s2, int v, w w0) {
            if((v & 4) != 0) {
                s2 = null;
            }
            this(s, s1, s2);
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
        public final String c() {
            return this.c;
        }

        @l
        public final a d(@m String s, @m String s1, @m String s2) {
            return new a(s, s1, s2);
        }

        public static a e(a b$a0, String s, String s1, String s2, int v, Object object0) {
            if((v & 1) != 0) {
                s = b$a0.a;
            }
            if((v & 2) != 0) {
                s1 = b$a0.b;
            }
            if((v & 4) != 0) {
                s2 = b$a0.c;
            }
            return b$a0.d(s, s1, s2);
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
            return this.b;
        }

        @m
        public final String g() {
            return this.a;
        }

        @m
        public final String h() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            int v2 = this.b == null ? 0 : this.b.hashCode();
            String s = this.c;
            if(s != null) {
                v = s.hashCode();
            }
            return (v1 * 0x1F + v2) * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "PushDataItem(name=" + this.a + ", galleryId=" + this.b + ", userId=" + this.c + ")";
        }
    }

    public final class com.dcinside.app.push.adapter.b.b {
        public static final int[] a;

        static {
            int[] arr_v = new int[com.dcinside.app.type.m.values().length];
            try {
                arr_v[com.dcinside.app.type.m.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.type.m.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.type.m.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.type.m.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.dcinside.app.push.adapter.b.b.a = arr_v;
        }
    }

    @l
    private ArrayList a;
    @l
    private c b;

    public b() {
        this.a = new ArrayList();
        this.b = c.h;
    }

    public final void A(@m String s, boolean z) {
        for(Object object0: this.a) {
            a b$a0 = (a)object0;
            if(L.g((z ? b$a0.g() : b$a0.f()), s)) {
                this.a.remove(b$a0);
                this.notifyDataSetChanged();
                return;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void B(@m String s) {
        for(Object object0: this.a) {
            a b$a0 = (a)object0;
            if(L.g(b$a0.h(), s)) {
                this.a.remove(b$a0);
                this.notifyDataSetChanged();
                return;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void C(@l String s) {
        L.p(s, "value");
        a b$a0 = new a(s, null, null, 4, null);
        this.a.add(b$a0);
        this.notifyDataSetChanged();
    }

    public void D(@l h0.b b0, int v) {
        @f(c = "com.dcinside.app.push.adapter.GalleryPushItemAdapter$onBindViewHolder$1", f = "GalleryPushItemAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.adapter.b.c extends o implements p {
            int k;
            final b l;
            final Context m;
            final a n;

            com.dcinside.app.push.adapter.b.c(b b0, Context context0, a b$a0, d d0) {
                this.l = b0;
                this.m = context0;
                this.n = b$a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.push.adapter.b.c(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                L.o(this.m, "$context");
                this.l.z(this.m, this.n);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.push.adapter.GalleryPushItemAdapter$onBindViewHolder$2", f = "GalleryPushItemAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.adapter.b.d extends o implements p {
            int k;
            final b l;
            final Context m;
            final a n;

            com.dcinside.app.push.adapter.b.d(b b0, Context context0, a b$a0, d d0) {
                this.l = b0;
                this.m = context0;
                this.n = b$a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.push.adapter.b.d(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                L.o(this.m, "$context");
                this.l.y(this.m, this.n);
                return S0.a;
            }
        }

        L.p(b0, "holder");
        Context context0 = b0.itemView.getContext();
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        if(this.b == c.k) {
            b0.i().setText(context0.getString(0x7F1503D0, new Object[]{Dl.M(((a)object0).g()), ((a)object0).h()}));  // string:gallery_push_user_data "%1$s(%2$s)"
            b0.i().setMaxLines(0x7FFFFFFF);
            b0.h().setVisibility(8);
            r.M(b0.e(), null, new com.dcinside.app.push.adapter.b.c(this, context0, ((a)object0), null), 1, null);
            return;
        }
        b0.i().setText(((a)object0).g());
        int v1 = com.dcinside.app.push.adapter.b.b.a[com.dcinside.app.type.m.d.b(((a)object0).f()).ordinal()];
        if(v1 == 1 || v1 == 2) {
            b0.h().setVisibility(8);
        }
        else {
            switch(v1) {
                case 3: {
                    b0.h().setImageResource(0x7F080415);  // drawable:mini_gall_ic
                    b0.h().setVisibility(0);
                    break;
                }
                case 4: {
                    int v2 = Dk.b(0x7F0703C6);  // dimen:person_icon_padding
                    b0.h().setPadding(0, v2, v2, 0);
                    b0.h().setImageResource(0x7F0804A8);  // drawable:person_gall_ic
                    b0.h().setVisibility(0);
                }
            }
        }
        r.M(b0.e(), null, new com.dcinside.app.push.adapter.b.d(this, context0, ((a)object0), null), 1, null);
    }

    @l
    public h0.b E(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01D9, viewGroup0, false);  // layout:view_gallery_push_item
        L.m(view0);
        return new h0.b(view0);
    }

    public final void F(@l List list0) {
        L.p(list0, "list");
        this.a.clear();
        ArrayList arrayList0 = new ArrayList(u.b0(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(new a(((String)object0), null, null, 4, null));
        }
        this.a.addAll(arrayList0);
        this.notifyDataSetChanged();
    }

    public final void G(@m List list0) {
        this.a.clear();
        if(list0 == null) {
            return;
        }
        ArrayList arrayList0 = new ArrayList(u.b0(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(new a(((g0.f.b)object0).e(), ((g0.f.b)object0).d(), null, 4, null));
        }
        this.a.addAll(arrayList0);
    }

    public final void H(@m List list0) {
        ArrayList arrayList1;
        this.b = c.k;
        if(list0 != null) {
            ArrayList arrayList0 = new ArrayList(u.b0(list0, 10));
            for(Object object0: list0) {
                g0.f.b f$b0 = (g0.f.b)object0;
                List list1 = f$b0.l();
                if(list1 == null) {
                    arrayList1 = null;
                }
                else {
                    arrayList1 = new ArrayList(u.b0(list1, 10));
                    for(Object object1: list1) {
                        arrayList1.add(Boolean.valueOf(this.a.add(new a(((g0.f.d)object1).a(), f$b0.d(), ((g0.f.d)object1).b()))));
                    }
                }
                arrayList0.add(arrayList1);
            }
        }
        this.notifyDataSetChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.D(((h0.b)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.E(viewGroup0, v);
    }

    public final void x() {
        this.a.clear();
        this.notifyDataSetChanged();
    }

    private final void y(Context context0, a b$a0) {
        if(context0 instanceof i) {
            String s = b$a0.g();
            String s1 = "";
            if(s == null) {
                s = "";
            }
            String s2 = b$a0.f();
            if(s2 != null) {
                s1 = s2;
            }
            ((i)context0).h(s, s1);
        }
    }

    private final void z(Context context0, a b$a0) {
        if(context0 instanceof i) {
            String s = b$a0.h();
            String s1 = "";
            if(s == null) {
                s = "";
            }
            String s2 = b$a0.f();
            if(s2 != null) {
                s1 = s2;
            }
            ((i)context0).F(s, s1);
        }
    }
}

