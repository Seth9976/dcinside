package com.dcinside.app.main.login;

import A3.p;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
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

@s0({"SMAP\nSimpleLoginHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleLoginHolder.kt\ncom/dcinside/app/main/login/SimpleLoginHolder\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,48:1\n25#2:49\n25#2:50\n25#2:51\n*S KotlinDebug\n*F\n+ 1 SimpleLoginHolder.kt\ncom/dcinside/app/main/login/SimpleLoginHolder\n*L\n34#1:49\n39#1:50\n44#1:51\n*E\n"})
public final class q extends ViewHolder {
    @l
    private final View a;
    @l
    private final ImageView b;
    @l
    private final TextView c;
    @l
    private final TextView d;
    @l
    private final TextView e;
    @l
    private final ImageView f;
    @l
    private final ImageView g;
    @l
    private final ImageView h;
    @l
    private final TextView i;

    public q(@l View view0) {
        @f(c = "com.dcinside.app.main.login.SimpleLoginHolder$1", f = "SimpleLoginHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final q l;

            a(q q0, d d0) {
                this.l = q0;
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
                this.l.k();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.login.SimpleLoginHolder$2", f = "SimpleLoginHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final q l;

            b(q q0, d d0) {
                this.l = q0;
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
                this.l.k();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.login.SimpleLoginHolder$3", f = "SimpleLoginHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final q l;

            c(q q0, d d0) {
                this.l = q0;
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
                this.l.j();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.login.SimpleLoginHolder$4", f = "SimpleLoginHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.main.login.q.d extends o implements p {
            int k;
            final q l;

            com.dcinside.app.main.login.q.d(q q0, d d0) {
                this.l = q0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.main.login.q.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.i();
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B06CA);  // id:item_simple_login_image_change
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B06C6);  // id:item_simple_login_icon
        L.o(view2, "findViewById(...)");
        this.b = (ImageView)view2;
        View view3 = view0.findViewById(0x7F0B06C3);  // id:item_simple_login_default
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B06CC);  // id:item_simple_login_nickname
        L.o(view4, "findViewById(...)");
        this.d = (TextView)view4;
        View view5 = view0.findViewById(0x7F0B06C9);  // id:item_simple_login_id
        L.o(view5, "findViewById(...)");
        this.e = (TextView)view5;
        View view6 = view0.findViewById(0x7F0B06C5);  // id:item_simple_login_gallog
        L.o(view6, "findViewById(...)");
        this.f = (ImageView)view6;
        View view7 = view0.findViewById(0x7F0B06CE);  // id:item_simple_login_selected_icon
        L.o(view7, "findViewById(...)");
        this.g = (ImageView)view7;
        View view8 = view0.findViewById(0x7F0B06C4);  // id:item_simple_login_delete_icon
        L.o(view8, "findViewById(...)");
        this.h = (ImageView)view8;
        View view9 = view0.findViewById(0x7F0B06CD);  // id:item_simple_login_otp_text
        L.o(view9, "findViewById(...)");
        this.i = (TextView)view9;
        r.M(((ImageView)view2), null, new a(this, null), 1, null);
        r.M(((TextView)view3), null, new b(this, null), 1, null);
        r.M(((ImageView)view8), null, new c(this, null), 1, null);
        r.M(view0, null, new com.dcinside.app.main.login.q.d(this, null), 1, null);
    }

    private final void i() {
        ViewParent viewParent0 = this.itemView.getParent();
        Adapter recyclerView$Adapter0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 != null) {
            Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
            if(recyclerView$Adapter1 instanceof t) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            recyclerView$Adapter0 = (t)recyclerView$Adapter0;
        }
        if(recyclerView$Adapter0 != null) {
            ((t)recyclerView$Adapter0).z(this.getBindingAdapterPosition());
        }
    }

    private final void j() {
        ViewParent viewParent0 = this.itemView.getParent();
        Adapter recyclerView$Adapter0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 != null) {
            Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
            if(recyclerView$Adapter1 instanceof t) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            recyclerView$Adapter0 = (t)recyclerView$Adapter0;
        }
        if(recyclerView$Adapter0 != null) {
            ((t)recyclerView$Adapter0).D(this.getBindingAdapterPosition());
        }
    }

    private final void k() {
        ViewParent viewParent0 = this.itemView.getParent();
        Adapter recyclerView$Adapter0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 != null) {
            Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
            if(recyclerView$Adapter1 instanceof t) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            recyclerView$Adapter0 = (t)recyclerView$Adapter0;
        }
        if(recyclerView$Adapter0 != null) {
            ((t)recyclerView$Adapter0).E(this.getBindingAdapterPosition());
        }
    }

    @l
    public final TextView l() {
        return this.i;
    }

    @l
    public final ImageView m() {
        return this.h;
    }

    @l
    public final ImageView n() {
        return this.f;
    }

    @l
    public final View o() {
        return this.a;
    }

    @l
    public final TextView p() {
        return this.c;
    }

    @l
    public final ImageView q() {
        return this.b;
    }

    @l
    public final TextView r() {
        return this.d;
    }

    @l
    public final ImageView s() {
        return this.g;
    }

    @l
    public final TextView t() {
        return this.e;
    }
}

