package com.dcinside.app.album;

import A3.p;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.dl;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nAlbumSortHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumSortHolder.kt\ncom/dcinside/app/album/AlbumSortHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,71:1\n774#2:72\n865#2,2:73\n1557#2:75\n1628#2,3:76\n774#2:81\n865#2,2:82\n37#3,2:79\n25#4:84\n*S KotlinDebug\n*F\n+ 1 AlbumSortHolder.kt\ncom/dcinside/app/album/AlbumSortHolder\n*L\n33#1:72\n33#1:73,2\n34#1:75\n34#1:76,3\n48#1:81\n48#1:82,2\n35#1:79,2\n64#1:84\n*E\n"})
public final class g extends ViewHolder {
    @l
    private final View a;
    @l
    private final TextView b;
    @l
    private final ImageView c;

    public g(@l View view0) {
        @f(c = "com.dcinside.app.album.AlbumSortHolder$1", f = "AlbumSortHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final g l;

            a(g g0, d d0) {
                this.l = g0;
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
                this.l.n();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.album.AlbumSortHolder$2", f = "AlbumSortHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final g l;

            b(g g0, d d0) {
                this.l = g0;
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
                this.l.n();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.album.AlbumSortHolder$3", f = "AlbumSortHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final g l;

            c(g g0, d d0) {
                this.l = g0;
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
                this.l.m();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0109);  // id:album_sort_icon
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B010A);  // id:album_sort_text
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0108);  // id:album_list_mode
        L.o(view3, "findViewById(...)");
        this.c = (ImageView)view3;
        this.r();
        r.M(view1, null, new a(this, null), 1, null);
        r.M(((TextView)view2), null, new b(this, null), 1, null);
        r.M(((ImageView)view3), null, new c(this, null), 1, null);
    }

    @l
    public final TextView k() {
        return this.b;
    }

    private final boolean l() {
        return dl.a.G2();
    }

    private final void m() {
        ViewParent viewParent0 = this.itemView.getParent();
        Adapter recyclerView$Adapter0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
        if(recyclerView$Adapter1 instanceof com.dcinside.app.album.c) {
            recyclerView$Adapter0 = recyclerView$Adapter1;
        }
        if(((com.dcinside.app.album.c)recyclerView$Adapter0) == null) {
            return;
        }
        ((com.dcinside.app.album.c)recyclerView$Adapter0).x();
        this.r();
        ((com.dcinside.app.album.c)recyclerView$Adapter0).notifyItemRangeChanged(0, ((com.dcinside.app.album.c)recyclerView$Adapter0).getItemCount());
    }

    private final void n() {
        static final class com.dcinside.app.album.g.d extends N implements Function1 {
            public static final com.dcinside.app.album.g.d e;

            static {
                com.dcinside.app.album.g.d.e = new com.dcinside.app.album.g.d();
            }

            com.dcinside.app.album.g.d() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.J(0x7F15009A);  // string:album_sort_title "정렬"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class e extends N implements Function1 {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
                super(1);
            }

            public final Boolean a(Integer integer0) {
                L.m(integer0);
                return ((int)integer0) < 0 ? false : true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Integer)object0));
            }
        }


        static final class com.dcinside.app.album.g.f extends N implements Function1 {
            final g e;

            com.dcinside.app.album.g.f(g g0) {
                this.e = g0;
                super(1);
            }

            public final void a(Integer integer0) {
                L.m(integer0);
                this.e.q(((int)integer0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        Context context0 = this.itemView.getContext();
        com.dcinside.app.base.d d0 = context0 instanceof com.dcinside.app.base.d ? ((com.dcinside.app.base.d)context0) : null;
        if(d0 == null) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: com.dcinside.app.album.m.b()) {
            if(((com.dcinside.app.album.m)object0) != com.dcinside.app.album.m.l && ((com.dcinside.app.album.m)object0) != com.dcinside.app.album.m.k) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(u.b0(arrayList0, 10));
        for(Object object1: arrayList0) {
            arrayList1.add(d0.getString(((com.dcinside.app.album.m)object1).d()));
        }
        String[] arr_s = (String[])arrayList1.toArray(new String[0]);
        com.dcinside.app.perform.e.a.w(com.dcinside.app.perform.e.e.a(d0).n(com.dcinside.app.album.g.d.e), arr_s, 0, 2, null).d().Z1((Object object0) -> {
            L.p(e.e, "$tmp0");
            return (Boolean)e.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.album.g.f(this), "$tmp0");
            new com.dcinside.app.album.g.f(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean o(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void p(Function1 function10, Object object0) [...]

    private final void q(int v) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: com.dcinside.app.album.m.b()) {
            if(((com.dcinside.app.album.m)object0) != com.dcinside.app.album.m.l && ((com.dcinside.app.album.m)object0) != com.dcinside.app.album.m.k) {
                arrayList0.add(object0);
            }
        }
        if(v >= 0 && v < arrayList0.size()) {
            int v1 = ((com.dcinside.app.album.m)arrayList0.get(v)).e();
            dl.a.w4(v1);
            Context context0 = this.itemView.getContext();
            AlbumActivity albumActivity0 = context0 instanceof AlbumActivity ? ((AlbumActivity)context0) : null;
            if(albumActivity0 == null) {
                return;
            }
            albumActivity0.Q1();
        }
    }

    private final void r() {
        int v = this.l() ? 0x7F0802B5 : 0x7F0802B4;  // drawable:ic_mode_linear
        this.c.setImageResource(v);
    }
}

