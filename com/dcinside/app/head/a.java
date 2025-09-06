package com.dcinside.app.head;

import A3.o;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.t;
import com.dcinside.app.response.PostHead;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.P;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.sequences.p;
import y4.l;
import y4.m;

@s0({"SMAP\nHeadAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeadAdapter.kt\ncom/dcinside/app/head/HeadAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 ModelExtension.kt\ncom/dcinside/app/internal/ModelExtensionKt\n*L\n1#1,163:1\n1#2:164\n147#3:165\n360#4,7:166\n257#5,2:173\n257#5,2:175\n9#6:177\n*S KotlinDebug\n*F\n+ 1 HeadAdapter.kt\ncom/dcinside/app/head/HeadAdapter\n*L\n53#1:165\n103#1:166,7\n141#1:173,2\n149#1:175,2\n155#1:177\n*E\n"})
public final class a extends Adapter {
    private final boolean a;
    private final boolean b;
    @l
    private final List c;
    private final boolean d;
    @m
    private t e;
    private int f;
    @m
    private o g;
    @m
    private List h;
    private final boolean i;

    public a(boolean z, boolean z1, @l List list0, boolean z2, @m PostHead postHead0) {
        static final class com.dcinside.app.head.a.a extends N implements Function1 {
            final a e;

            com.dcinside.app.head.a.a(a a0) {
                this.e = a0;
                super(1);
            }

            @l
            public final Boolean a(@l P p0) {
                L.p(p0, "it");
                int v = ((PostHead)p0.f()).l();
                return Boolean.valueOf(this.e.w(v));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((P)object0));
            }
        }

        Iterator iterator1;
        P p0;
        Object object0 = null;
        L.p(list0, "list");
        super();
        this.a = z;
        this.b = z1;
        this.c = list0;
        this.d = z2;
        int v = -1;
        this.f = -1;
        this.i = !list0.isEmpty();
        List list1 = p.c3(p.p0(p.k3(u.A1(list0)), new com.dcinside.app.head.a.a(this)));
        if(!list1.isEmpty()) {
            if(postHead0 == null) {
                iterator1 = list1.iterator();
            label_24:
                while(iterator1.hasNext()) {
                    Object object3 = iterator1.next();
                    if(((PostHead)((P)object3).f()).o()) {
                        object0 = object3;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
                p0 = (P)object0;
            }
            else {
                Object object1 = null;
                for(Object object2: list1) {
                    if(((PostHead)((P)object2).f()).i() == postHead0.i()) {
                        object1 = object2;
                        break;
                    }
                }
                p0 = (P)object1;
                if(p0 == null) {
                    iterator1 = list1.iterator();
                    goto label_24;
                }
            }
            if(p0 != null) {
                v = p0.e();
            }
            this.G(v);
        }
    }

    public a(boolean z, boolean z1, List list0, boolean z2, PostHead postHead0, int v, w w0) {
        if((v & 16) != 0) {
            postHead0 = null;
        }
        this(z, z1, list0, z2, postHead0);
    }

    public final boolean A() {
        return this.i;
    }

    public void B(@l c c0, int v) {
        L.p(c0, "holder");
        PostHead postHead0 = (PostHead)this.c.get(v);
        boolean z = false;
        boolean z1 = this.f == v;
        c0.j().setSelected(z1);
        c0.h().setSelected(z1);
        c0.j().setText(postHead0.m());
        float f = 1.0f;
        if(z1) {
            c0.j().setAlpha(1.0f);
            c0.h().setAlpha(1.0f);
            c0.i().setVisibility(0);
            c0.i().setImageResource((dl.a.q2().m() ? 0x7F0802E3 : 0x7F0802E4));  // drawable:ic_shield_shadow_dark
            return;
        }
        int v1 = postHead0.i();
        List list0 = this.h;
        if(list0 != null) {
            z = list0.contains(v1);
        }
        TextView textView0 = c0.j();
        if(!this.w(postHead0.l()) || z) {
            f = 0.2f;
        }
        textView0.setAlpha(f);
        c0.h().setAlpha(0.8f);
        c0.i().setVisibility(8);
    }

    @l
    public c C(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = v == 0 ? LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0241, viewGroup0, false) : LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0242, viewGroup0, false);  // layout:view_post_write_head_item_basic
        L.m(view0);
        return new c(view0);
    }

    public final void D(int v) {
        if(v < 0) {
            return;
        }
        PostHead postHead0 = (PostHead)this.c.get(v);
        if(!this.x(postHead0.l())) {
            return;
        }
        boolean z = this.h == null ? false : this.h.contains(postHead0.i());
        this.G(v);
        o o0 = this.g;
        if(o0 != null) {
            o0.invoke(postHead0, Boolean.valueOf(z));
        }
    }

    public final void E(@m o o0) {
        this.g = o0;
    }

    public final void F(@l List list0) {
        L.p(list0, "list");
        this.h = list0;
    }

    private final void G(int v) {
        int v1 = this.f;
        this.f = v;
        if(v1 != -1) {
            this.notifyItemChanged(v1);
        }
        this.notifyItemChanged(v);
    }

    public final void H(@m PostHead postHead0) {
        int v = -1;
        if(postHead0 != null) {
            int v1 = 0;
            for(Object object0: this.c) {
                if(((PostHead)object0).i() == postHead0.i()) {
                    v = v1;
                    break;
                }
                ++v1;
            }
        }
        this.G(v);
        this.notifyItemRangeChanged(0, this.getItemCount());
    }

    public final boolean I(@l PostHead postHead0) {
        L.p(postHead0, "head");
        if(this.w(postHead0.l())) {
            this.H(postHead0);
            o o0 = this.g;
            if(o0 != null) {
                o0.invoke(postHead0, Boolean.FALSE);
            }
            return true;
        }
        return false;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.c.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        PostHead postHead0 = (PostHead)this.c.get(v);
        return postHead0 == null || postHead0.i() != 999 || postHead0.l() != 9 ? 0 : 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.e = new t(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.B(((c)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.C(viewGroup0, v);
    }

    private final boolean w(int v) {
        switch(v) {
            case 1: {
                return this.a;
            }
            case 9: {
                return this.b;
            }
            default: {
                return true;
            }
        }
    }

    private final boolean x(int v) {
        Context context0 = null;
        switch(v) {
            case 1: {
                if(!this.a) {
                    t t0 = this.e;
                    if(t0 != null) {
                        RecyclerView recyclerView0 = (RecyclerView)t0.a();
                        if(recyclerView0 != null) {
                            context0 = recyclerView0.getContext();
                        }
                    }
                    Dl.D(context0, 0x7F150BAE);  // string:write_head_grant_user "@com.dcinside.app.android:string/please_login_request"
                }
                return this.a;
            }
            case 9: {
                if(!this.b) {
                    t t1 = this.e;
                    if(t1 != null) {
                        RecyclerView recyclerView1 = (RecyclerView)t1.a();
                        if(recyclerView1 != null) {
                            context0 = recyclerView1.getContext();
                        }
                    }
                    Dl.D(context0, 0x7F150BAD);  // string:write_head_grant_manager "매니저만 이용할 수 있습니다."
                }
                return this.b;
            }
            default: {
                return true;
            }
        }
    }

    public final int y() {
        return this.f;
    }

    @m
    public final PostHead z() {
        if(this.f >= 0) {
            List list0 = this.c;
            int v = this.f;
            if(list0.size() <= v) {
                list0 = null;
            }
            return list0 == null ? null : ((PostHead)list0.get(v));
        }
        return null;
    }
}

