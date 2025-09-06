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
import com.dcinside.app.history.i;
import com.dcinside.app.internal.r;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class a extends com.codewaves.stickyheadergrid.a.a {
    @l
    private final CheckBox a;
    @l
    private final TextView b;
    @l
    private final TextView c;
    @l
    private final TextView d;

    public a(@l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.history.holder.PostHistoryEditHolder$1", f = "PostHistoryEditHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.history.holder.a.a extends o implements p {
            int k;
            final a l;

            com.dcinside.app.history.holder.a.a(a a0, d d0) {
                this.l = a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.history.holder.a.a(this.l, d0).invokeSuspend(S0.a);
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


        @f(c = "com.dcinside.app.history.holder.PostHistoryEditHolder$2", f = "PostHistoryEditHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final a l;

            b(a a0, d d0) {
                this.l = a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.p();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.history.holder.PostHistoryEditHolder$3", f = "PostHistoryEditHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final a l;

            c(a a0, d d0) {
                this.l = a0;
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
        super(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0225, viewGroup0, false));  // layout:view_post_history_item_edit
        View view0 = this.itemView.findViewById(0x7F0B0A58);  // id:post_history_item_edit_check
        L.o(view0, "findViewById(...)");
        this.a = (CheckBox)view0;
        View view1 = this.itemView.findViewById(0x7F0B0A5B);  // id:post_history_item_edit_title
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
        View view2 = this.itemView.findViewById(0x7F0B0A57);  // id:post_history_item_edit_archive
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = this.itemView.findViewById(0x7F0B0A59);  // id:post_history_item_edit_delete
        L.o(view3, "findViewById(...)");
        this.d = (TextView)view3;
        r.M(((TextView)view1), null, new com.dcinside.app.history.holder.a.a(this, null), 1, null);
        r.M(((TextView)view2), null, new b(this, null), 1, null);
        r.M(((TextView)view3), null, new c(this, null), 1, null);
    }

    @l
    public final TextView l() {
        return this.c;
    }

    @l
    public final TextView m() {
        return this.d;
    }

    @l
    public final TextView n() {
        return this.b;
    }

    private final void o(boolean z) {
        ViewParent viewParent0 = this.itemView.getParent();
        i i0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(recyclerView$Adapter0 instanceof i) {
            i0 = (i)recyclerView$Adapter0;
        }
        if(i0 == null) {
            return;
        }
        i0.j0(z);
    }

    private final void p() {
        ViewParent viewParent0 = this.itemView.getParent();
        i i0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(recyclerView$Adapter0 instanceof i) {
            i0 = (i)recyclerView$Adapter0;
        }
        if(i0 == null) {
            return;
        }
        i0.l0();
    }

    private final void q() {
        ViewParent viewParent0 = this.itemView.getParent();
        i i0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(recyclerView$Adapter0 instanceof i) {
            i0 = (i)recyclerView$Adapter0;
        }
        if(i0 == null) {
            return;
        }
        i0.m0();
    }

    private final void r() {
        boolean z = this.a.isChecked();
        this.a.setChecked(!z);
    }

    public final void s(boolean z) {
        @f(c = "com.dcinside.app.history.holder.PostHistoryEditHolder$setChecked$1", f = "PostHistoryEditHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.history.holder.a.d extends o implements q {
            int k;
            boolean l;
            final a m;

            com.dcinside.app.history.holder.a.d(a a0, d d0) {
                this.m = a0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m d d0) {
                com.dcinside.app.history.holder.a.d a$d0 = new com.dcinside.app.history.holder.a.d(this.m, d0);
                a$d0.l = z;
                return a$d0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.o(this.l);
                return S0.a;
            }
        }

        this.a.setOnCheckedChangeListener(null);
        this.a.setChecked(z);
        com.dcinside.app.history.holder.a.d a$d0 = new com.dcinside.app.history.holder.a.d(this, null);
        r.J(this.a, null, a$d0, 1, null);
    }
}

