package com.dcinside.app.history.holder;

import A3.p;
import A3.q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.codewaves.stickyheadergrid.a.b;
import com.dcinside.app.history.i;
import com.dcinside.app.internal.r;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nPostHistoryPostHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostHistoryPostHolder.kt\ncom/dcinside/app/history/holder/PostHistoryPostHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n257#2,2:86\n257#2,2:88\n257#2,2:90\n257#2,2:92\n255#2:94\n1#3:95\n*S KotlinDebug\n*F\n+ 1 PostHistoryPostHolder.kt\ncom/dcinside/app/history/holder/PostHistoryPostHolder\n*L\n37#1:86,2\n41#1:88,2\n42#1:90,2\n43#1:92,2\n53#1:94\n*E\n"})
public final class e extends b {
    @l
    private final CheckBox a;
    @l
    private final TextView b;
    @l
    private final TextView c;
    @l
    private final View d;
    @l
    private final View e;

    public e(@l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.history.holder.PostHistoryPostHolder$1", f = "PostHistoryPostHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final e l;

            a(e e0, d d0) {
                this.l = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.r();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.history.holder.PostHistoryPostHolder$2", f = "PostHistoryPostHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.history.holder.e.b extends o implements p {
            int k;
            final e l;

            com.dcinside.app.history.holder.e.b(e e0, d d0) {
                this.l = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.history.holder.e.b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.q();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.history.holder.PostHistoryPostHolder$3", f = "PostHistoryPostHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final e l;

            c(e e0, d d0) {
                this.l = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.q();
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        super(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0229, viewGroup0, false));  // layout:view_post_history_item_post
        View view0 = this.itemView.findViewById(0x7F0B0A62);  // id:post_history_item_post_check
        L.o(view0, "findViewById(...)");
        this.a = (CheckBox)view0;
        View view1 = this.itemView.findViewById(0x7F0B0A63);  // id:post_history_item_post_subject
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
        View view2 = this.itemView.findViewById(0x7F0B0A64);  // id:post_history_item_post_summary
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = this.itemView.findViewById(0x7F0B0A61);  // id:post_history_item_post_archive_gray
        L.o(view3, "findViewById(...)");
        this.d = view3;
        View view4 = this.itemView.findViewById(0x7F0B0A60);  // id:post_history_item_post_archive_colored
        L.o(view4, "findViewById(...)");
        this.e = view4;
        L.o(this.itemView, "itemView");
        a e$a0 = new a(this, null);
        r.M(this.itemView, null, e$a0, 1, null);
        r.M(view3, null, new com.dcinside.app.history.holder.e.b(this, null), 1, null);
        r.M(view4, null, new c(this, null), 1, null);
    }

    public final void k(boolean z, boolean z1) {
        int v = 8;
        this.a.setVisibility((z ? 0 : 8));
        this.d.setVisibility((z || z1 ? 8 : 0));
        View view0 = this.e;
        if(!z && z1) {
            v = 0;
        }
        view0.setVisibility(v);
    }

    public final void l(boolean z) {
        L.o(this.itemView, "itemView");
        this.itemView.setVisibility((z ? 0 : 8));
    }

    @l
    public final CheckBox m() {
        return this.a;
    }

    @l
    public final TextView n() {
        return this.b;
    }

    @l
    public final TextView o() {
        return this.c;
    }

    private final void p(boolean z) {
        ViewParent viewParent0 = this.itemView.getParent();
        Integer integer0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        i i0 = recyclerView$Adapter0 instanceof i ? ((i)recyclerView$Adapter0) : null;
        if(i0 == null) {
            return;
        }
        Integer integer1 = this.getAdapterPosition();
        if(integer1.intValue() >= 0) {
            integer0 = integer1;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            int v1 = i0.z(v);
            i0.i0(v1, i0.B(v1, v), z);
        }
    }

    private final void q() {
        ViewParent viewParent0 = this.itemView.getParent();
        Integer integer0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        i i0 = recyclerView$Adapter0 instanceof i ? ((i)recyclerView$Adapter0) : null;
        if(i0 == null) {
            return;
        }
        Integer integer1 = this.getAdapterPosition();
        if(integer1.intValue() >= 0) {
            integer0 = integer1;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            int v1 = i0.z(v);
            i0.k0(v1, i0.B(v1, v));
        }
    }

    private final void r() {
        if(this.a.getVisibility() == 0) {
            boolean z = this.a.isChecked();
            this.a.setChecked(!z);
            return;
        }
        ViewParent viewParent0 = this.itemView.getParent();
        Integer integer0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        i i0 = recyclerView$Adapter0 instanceof i ? ((i)recyclerView$Adapter0) : null;
        if(i0 == null) {
            return;
        }
        Integer integer1 = this.getAdapterPosition();
        if(integer1.intValue() >= 0) {
            integer0 = integer1;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            int v1 = i0.z(v);
            i0.o0(v1, i0.B(v1, v));
        }
    }

    public final void s(boolean z) {
        @f(c = "com.dcinside.app.history.holder.PostHistoryPostHolder$setChecked$1", f = "PostHistoryPostHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.history.holder.e.d extends o implements q {
            int k;
            boolean l;
            final e m;

            com.dcinside.app.history.holder.e.d(e e0, d d0) {
                this.m = e0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m d d0) {
                com.dcinside.app.history.holder.e.d e$d0 = new com.dcinside.app.history.holder.e.d(this.m, d0);
                e$d0.l = z;
                return e$d0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.p(this.l);
                return S0.a;
            }
        }

        this.a.setOnCheckedChangeListener(null);
        this.a.setChecked(z);
        com.dcinside.app.history.holder.e.d e$d0 = new com.dcinside.app.history.holder.e.d(this, null);
        r.J(this.a, null, e$d0, 1, null);
    }
}

