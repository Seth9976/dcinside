package com.dcinside.app.view.dccon;

import A3.p;
import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.e;
import com.dcinside.app.internal.r;
import com.dcinside.app.rx.bus.c;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class w extends Adapter implements b {
    public static final class a extends e {
        @l
        private SimpleDraweeView a;

        public a(@l ViewGroup viewGroup0) {
            @f(c = "com.dcinside.app.view.dccon.DcconPickerAdapter$PageHolder$1", f = "DcconPickerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @s0({"SMAP\nDcconPickerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconPickerAdapter.kt\ncom/dcinside/app/view/dccon/DcconPickerAdapter$PageHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,131:1\n1#2:132\n20#3:133\n25#4:134\n*S KotlinDebug\n*F\n+ 1 DcconPickerAdapter.kt\ncom/dcinside/app/view/dccon/DcconPickerAdapter$PageHolder$1\n*L\n117#1:133\n117#1:134\n*E\n"})
            static final class com.dcinside.app.view.dccon.w.a.a extends o implements p {
                int k;
                Object l;
                final a m;

                com.dcinside.app.view.dccon.w.a.a(a w$a0, d d0) {
                    this.m = w$a0;
                    super(3, d0);
                }

                @m
                public final Object a(@l O o0, @l View view0, @m d d0) {
                    com.dcinside.app.view.dccon.w.a.a w$a$a0 = new com.dcinside.app.view.dccon.w.a.a(this.m, d0);
                    w$a$a0.l = view0;
                    return w$a$a0.invokeSuspend(S0.a);
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
                    View view0 = (View)this.l;
                    RecyclerView recyclerView0 = this.m.e();
                    Adapter recyclerView$Adapter0 = null;
                    if(recyclerView0 != null) {
                        Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
                        if(recyclerView$Adapter1 instanceof w) {
                            recyclerView$Adapter0 = recyclerView$Adapter1;
                        }
                        recyclerView$Adapter0 = (w)recyclerView$Adapter0;
                    }
                    if(recyclerView$Adapter0 != null) {
                        ((w)recyclerView$Adapter0).y(view0);
                    }
                    return S0.a;
                }
            }


            @f(c = "com.dcinside.app.view.dccon.DcconPickerAdapter$PageHolder$2", f = "DcconPickerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @s0({"SMAP\nDcconPickerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconPickerAdapter.kt\ncom/dcinside/app/view/dccon/DcconPickerAdapter$PageHolder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,131:1\n1#2:132\n20#3:133\n25#4:134\n*S KotlinDebug\n*F\n+ 1 DcconPickerAdapter.kt\ncom/dcinside/app/view/dccon/DcconPickerAdapter$PageHolder$2\n*L\n120#1:133\n120#1:134\n*E\n"})
            static final class com.dcinside.app.view.dccon.w.a.b extends o implements p {
                int k;
                Object l;
                final a m;

                com.dcinside.app.view.dccon.w.a.b(a w$a0, d d0) {
                    this.m = w$a0;
                    super(3, d0);
                }

                @m
                public final Object a(@l O o0, @l View view0, @m d d0) {
                    com.dcinside.app.view.dccon.w.a.b w$a$b0 = new com.dcinside.app.view.dccon.w.a.b(this.m, d0);
                    w$a$b0.l = view0;
                    return w$a$b0.invokeSuspend(S0.a);
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
                    View view0 = (View)this.l;
                    RecyclerView recyclerView0 = this.m.e();
                    Adapter recyclerView$Adapter0 = null;
                    if(recyclerView0 != null) {
                        Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
                        if(recyclerView$Adapter1 instanceof w) {
                            recyclerView$Adapter0 = recyclerView$Adapter1;
                        }
                        recyclerView$Adapter0 = (w)recyclerView$Adapter0;
                    }
                    if(recyclerView$Adapter0 != null) {
                        ((w)recyclerView$Adapter0).z(view0);
                    }
                    return S0.a;
                }
            }

            L.p(viewGroup0, "parent");
            super(viewGroup0, 0x7F0E01BA);  // layout:view_dccon_item
            View view0 = this.itemView.findViewById(0x7F0B0346);  // id:dccon_item_pick
            L.o(view0, "findViewById(...)");
            this.a = (SimpleDraweeView)view0;
            r.M(((SimpleDraweeView)view0), null, new com.dcinside.app.view.dccon.w.a.a(this, null), 1, null);
            r.S(this.a, null, true, new com.dcinside.app.view.dccon.w.a.b(this, null), 1, null);
        }

        @l
        public final SimpleDraweeView h() {
            return this.a;
        }

        public final void i(@l SimpleDraweeView simpleDraweeView0) {
            L.p(simpleDraweeView0, "<set-?>");
            this.a = simpleDraweeView0;
        }
    }

    private final boolean a;
    @l
    private List b;
    @m
    private A3.a c;
    @m
    private LocalBroadcastManager d;
    @l
    private final com.dcinside.app.view.dccon.a e;

    public w(boolean z) {
        this.a = z;
        this.b = u.H();
        this.e = new com.dcinside.app.view.dccon.a(this);
    }

    public final void A(@m Context context0) {
        if(context0 == null) {
            return;
        }
        LocalBroadcastManager localBroadcastManager0 = LocalBroadcastManager.b(context0);
        this.d = localBroadcastManager0;
        if(localBroadcastManager0 != null) {
            IntentFilter intentFilter0 = new IntentFilter("com.dcinside.app.action.BIG_DCCON_CHANGE");
            localBroadcastManager0.c(this.e, intentFilter0);
        }
    }

    public final void B(@m List list0) {
        if(list0 == null) {
            list0 = u.H();
        }
        this.b = list0;
        this.notifyItemRangeChanged(0, this.getItemCount());
    }

    public final void C(@l A3.a a0) {
        L.p(a0, "onClick");
        this.c = a0;
    }

    public final void D() {
        LocalBroadcastManager localBroadcastManager0 = this.d;
        if(localBroadcastManager0 != null) {
            localBroadcastManager0.f(this.e);
        }
        this.d = null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return ((com.dcinside.app.model.p)this.b.get(v)).q();
    }

    @Override  // com.dcinside.app.view.dccon.b
    public void k(boolean z) {
        if(this.getItemCount() < 1) {
            return;
        }
        this.notifyItemChanged(0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        com.dcinside.app.model.p p0 = (com.dcinside.app.model.p)this.b.get(v);
        if(recyclerView$ViewHolder0 instanceof J) {
            ((J)recyclerView$ViewHolder0).n(p0);
            return;
        }
        SimpleDraweeView simpleDraweeView0 = ((a)recyclerView$ViewHolder0).h();
        simpleDraweeView0.setController(((com.facebook.drawee.backends.pipeline.f)((com.facebook.drawee.backends.pipeline.f)com.facebook.drawee.backends.pipeline.d.j().j0(p0.r()).U(simpleDraweeView0.getController())).I(true)).e());
        simpleDraweeView0.setTag(0x7F0B0345, p0);  // id:dccon_holder_ic_picked
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(v == -999) {
            View view0 = layoutInflater0.inflate(0x7F0E01BB, viewGroup0, false);  // layout:view_dccon_item_title
            L.m(view0);
            return new J(view0, this.a);
        }
        return new a(viewGroup0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewRecycled(@l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView$ViewHolder0, "holder");
        super.onViewRecycled(recyclerView$ViewHolder0);
        if(recyclerView$ViewHolder0 instanceof a) {
            SimpleDraweeView simpleDraweeView0 = ((a)recyclerView$ViewHolder0).h();
            com.dcinside.app.image.o.a.a(simpleDraweeView0);
        }
    }

    @l
    public final com.dcinside.app.model.p v(int v) {
        return (com.dcinside.app.model.p)this.b.get(v);
    }

    @l
    public final com.dcinside.app.view.dccon.a w() {
        return this.e;
    }

    public final void x() {
        A3.a a0 = this.c;
        if(a0 != null) {
            a0.invoke();
        }
    }

    public final void y(@l View view0) {
        L.p(view0, "v");
        Object object0 = view0.getTag(0x7F0B0345);  // id:dccon_holder_ic_picked
        com.dcinside.app.model.p p0 = object0 instanceof com.dcinside.app.model.p ? ((com.dcinside.app.model.p)object0) : null;
        if(p0 == null) {
            return;
        }
        Context context0 = view0.getContext();
        L.o(context0, "getContext(...)");
        c.a(context0, new com.dcinside.app.rx.bus.o(p0, false, 2, null));
    }

    public final void z(@l View view0) {
        L.p(view0, "v");
        Object object0 = view0.getTag(0x7F0B0345);  // id:dccon_holder_ic_picked
        com.dcinside.app.model.p p0 = object0 instanceof com.dcinside.app.model.p ? ((com.dcinside.app.model.p)object0) : null;
        if(p0 == null) {
            return;
        }
        Context context0 = view0.getContext();
        L.o(context0, "getContext(...)");
        c.a(context0, new com.dcinside.app.rx.bus.o(p0, true));
    }
}

