package com.dcinside.app.main.showgallery;

import A3.p;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.O;
import y4.m;

@s0({"SMAP\nShowAllGalleryItemHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowAllGalleryItemHolder.kt\ncom/dcinside/app/main/showgallery/ShowAllGalleryItemHolder\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,51:1\n25#2:52\n25#2:53\n25#2:72\n177#3,9:54\n177#3,9:63\n177#3,9:73\n*S KotlinDebug\n*F\n+ 1 ShowAllGalleryItemHolder.kt\ncom/dcinside/app/main/showgallery/ShowAllGalleryItemHolder\n*L\n27#1:52\n36#1:53\n46#1:72\n37#1:54,9\n38#1:63,9\n47#1:73,9\n*E\n"})
public final class l extends ViewHolder {
    @y4.l
    private final TextView a;
    @y4.l
    private final ImageView b;
    @y4.l
    private final View c;
    @y4.l
    private final View d;

    public l(@y4.l View view0) {
        @f(c = "com.dcinside.app.main.showgallery.ShowAllGalleryItemHolder$1", f = "ShowAllGalleryItemHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final l l;

            a(l l0, d d0) {
                this.l = l0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.i();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.showgallery.ShowAllGalleryItemHolder$2", f = "ShowAllGalleryItemHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final l l;

            b(l l0, d d0) {
                this.l = l0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.n();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.showgallery.ShowAllGalleryItemHolder$3", f = "ShowAllGalleryItemHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final l l;

            c(l l0, d d0) {
                this.l = l0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.o();
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0117);  // id:all_gallery_item_text
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0116);  // id:all_gallery_item_mini_icon
        L.o(view2, "findViewById(...)");
        this.b = (ImageView)view2;
        View view3 = view0.findViewById(0x7F0B0114);  // id:all_gallery_item_delete
        L.o(view3, "findViewById(...)");
        this.c = view3;
        View view4 = view0.findViewById(0x7F0B0115);  // id:all_gallery_item_icon
        L.o(view4, "findViewById(...)");
        this.d = view4;
        r.M(view3, null, new a(this, null), 1, null);
        r.M(view0, null, new b(this, null), 1, null);
        r.S(view0, null, false, new c(this, null), 3, null);
    }

    private final void i() {
        int v = this.getBindingAdapterPosition();
        ViewParent viewParent0 = this.itemView.getParent();
        com.dcinside.app.realm.m m0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.main.showgallery.m)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.main.showgallery.m)recyclerView$Adapter0) == null) {
            return;
        }
        List list0 = ((com.dcinside.app.main.showgallery.m)recyclerView$Adapter0).z();
        com.dcinside.app.realm.s0 s00 = list0 == null ? null : ((com.dcinside.app.realm.s0)list0.get(v));
        List list1 = ((com.dcinside.app.main.showgallery.m)recyclerView$Adapter0).w();
        if(list1 != null) {
            m0 = (com.dcinside.app.realm.m)list1.get(v);
        }
        ((com.dcinside.app.main.showgallery.m)recyclerView$Adapter0).v().invoke(r0.a(s00, m0));
    }

    @y4.l
    public final View j() {
        return this.c;
    }

    @y4.l
    public final TextView k() {
        return this.a;
    }

    @y4.l
    public final ImageView l() {
        return this.b;
    }

    @y4.l
    public final View m() {
        return this.d;
    }

    private final void n() {
        com.dcinside.app.realm.s0 s00;
        int v = this.getBindingAdapterPosition();
        ViewParent viewParent0 = this.itemView.getParent();
        com.dcinside.app.realm.m m0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.main.showgallery.m)) {
            recyclerView$Adapter0 = null;
        }
        com.dcinside.app.main.showgallery.m m1 = (com.dcinside.app.main.showgallery.m)recyclerView$Adapter0;
        if(m1 == null) {
            return;
        }
        try {
            List list0 = m1.z();
            s00 = null;
            if(list0 != null) {
                s00 = (com.dcinside.app.realm.s0)list0.get(v);
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            List list1 = m1.w();
            if(list1 != null) {
                m0 = (com.dcinside.app.realm.m)list1.get(v);
            }
        }
        catch(Exception unused_ex) {
        }
        if(s00 == null && m0 == null) {
            return;
        }
        m1.y().invoke(r0.a(s00, m0));
    }

    private final void o() {
        int v = this.getBindingAdapterPosition();
        ViewParent viewParent0 = this.itemView.getParent();
        com.dcinside.app.realm.s0 s00 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.main.showgallery.m)) {
            recyclerView$Adapter0 = null;
        }
        com.dcinside.app.main.showgallery.m m0 = (com.dcinside.app.main.showgallery.m)recyclerView$Adapter0;
        if(m0 == null) {
            return;
        }
        try {
            List list0 = m0.z();
            if(list0 != null) {
                s00 = (com.dcinside.app.realm.s0)list0.get(v);
            }
        }
        catch(Exception unused_ex) {
        }
        if(s00 == null) {
            return;
        }
        m0.x().invoke(s00);
    }
}

