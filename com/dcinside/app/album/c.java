package com.dcinside.app.album;

import A3.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.image.o;
import com.dcinside.app.image.s;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import com.dcinside.app.util.dl;
import com.futuremind.recyclerviewfastscroll.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nAlbumAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumAdapter.kt\ncom/dcinside/app/album/AlbumAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,136:1\n147#2:137\n*S KotlinDebug\n*F\n+ 1 AlbumAdapter.kt\ncom/dcinside/app/album/AlbumAdapter\n*L\n21#1:137\n*E\n"})
public final class c extends Adapter implements b {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final boolean a;
    private final boolean b;
    @l
    private t c;
    @l
    private List d;
    @m
    private A3.a e;
    private int f;
    @l
    public static final a g = null;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;

    static {
        c.g = new a(null);
    }

    public c(@l AlbumActivity albumActivity0, boolean z, boolean z1) {
        L.p(albumActivity0, "activity");
        super();
        this.a = z;
        this.b = z1;
        this.c = new t(albumActivity0);
        this.d = new ArrayList();
        this.f = 1;
    }

    public final void A(int v) {
        this.f = v;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.d.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        if(v == 0) {
            return 0;
        }
        return this.f == 1 ? 1 : 2;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        String s1;
        L.p(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof g) {
            int v1 = dl.a.E0();
            int v2 = com.dcinside.app.album.m.d.b(v1).d();
            ((g)recyclerView$ViewHolder0).k().setText(recyclerView$ViewHolder0.itemView.getContext().getString(v2));
            return;
        }
        if(recyclerView$ViewHolder0 instanceof d) {
            Album album0 = (Album)this.d.get(v);
            String s = album0.h();
            int v3 = this.getItemViewType(v) == 1 ? 6 : 18;
            if(s == null) {
                ImageView imageView0 = ((d)recyclerView$ViewHolder0).e();
                o.a.g(imageView0, 0x7F0803EB, v3).apply();  // drawable:loading_img
            }
            else {
                s.k(((d)recyclerView$ViewHolder0).e(), s, v3);
            }
            if(this.b) {
                s1 = String.valueOf(album0.i());
            }
            else {
                s1 = this.a ? String.valueOf(album0.g() - album0.f() + album0.i()) : String.valueOf(album0.g());
            }
            ((d)recyclerView$ViewHolder0).f().setText(album0.c());
            ((d)recyclerView$ViewHolder0).h().setText(s1);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        @f(c = "com.dcinside.app.album.AlbumAdapter$onCreateViewHolder$1", f = "AlbumAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.album.c.b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final c l;
            final d m;

            com.dcinside.app.album.c.b(c c0, d d0, kotlin.coroutines.d d1) {
                this.l = c0;
                this.m = d0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.album.c.b(this.l, this.m, d0).invokeSuspend(S0.a);
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
                this.l.w(this.m);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.album.AlbumAdapter$onCreateViewHolder$2", f = "AlbumAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.album.c.c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final c l;
            final d m;

            com.dcinside.app.album.c.c(c c0, d d0, kotlin.coroutines.d d1) {
                this.l = c0;
                this.m = d0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.album.c.c(this.l, this.m, d0).invokeSuspend(S0.a);
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
                this.l.w(this.m);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.album.AlbumAdapter$onCreateViewHolder$3", f = "AlbumAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.album.c.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final c l;
            final d m;

            com.dcinside.app.album.c.d(c c0, d d0, kotlin.coroutines.d d1) {
                this.l = c0;
                this.m = d0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.album.c.d(this.l, this.m, d0).invokeSuspend(S0.a);
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
                this.l.w(this.m);
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 0: {
                View view1 = layoutInflater0.inflate(0x7F0E0284, viewGroup0, false);  // layout:view_sort_album_item
                L.m(view1);
                return new g(view1);
            }
            case 1: {
                View view2 = layoutInflater0.inflate(0x7F0E0190, viewGroup0, false);  // layout:view_album_item_linear
                L.m(view2);
                ViewHolder recyclerView$ViewHolder1 = new d(view2);
                L.o(recyclerView$ViewHolder1.itemView, "itemView");
                com.dcinside.app.album.c.b c$b0 = new com.dcinside.app.album.c.b(this, ((d)recyclerView$ViewHolder1), null);
                r.M(recyclerView$ViewHolder1.itemView, null, c$b0, 1, null);
                return recyclerView$ViewHolder1;
            }
            case 2: {
                View view3 = layoutInflater0.inflate(0x7F0E018F, viewGroup0, false);  // layout:view_album_item_grid
                L.m(view3);
                ViewHolder recyclerView$ViewHolder2 = new d(view3);
                L.o(recyclerView$ViewHolder2.itemView, "itemView");
                com.dcinside.app.album.c.c c$c0 = new com.dcinside.app.album.c.c(this, ((d)recyclerView$ViewHolder2), null);
                r.M(recyclerView$ViewHolder2.itemView, null, c$c0, 1, null);
                return recyclerView$ViewHolder2;
            }
            default: {
                View view0 = layoutInflater0.inflate(0x7F0E0190, viewGroup0, false);  // layout:view_album_item_linear
                L.m(view0);
                ViewHolder recyclerView$ViewHolder0 = new d(view0);
                L.o(recyclerView$ViewHolder0.itemView, "itemView");
                com.dcinside.app.album.c.d c$d0 = new com.dcinside.app.album.c.d(this, ((d)recyclerView$ViewHolder0), null);
                r.M(recyclerView$ViewHolder0.itemView, null, c$d0, 1, null);
                return recyclerView$ViewHolder0;
            }
        }
    }

    @Override  // com.futuremind.recyclerviewfastscroll.b
    @l
    public String p(int v) {
        return "";
    }

    private final void w(d d0) {
        int v = d0.getBindingAdapterPosition();
        if(v < 0) {
            return;
        }
        Album album0 = (Album)this.d.get(v);
        AlbumActivity albumActivity0 = (AlbumActivity)this.c.a();
        if(albumActivity0 != null) {
            albumActivity0.N1(album0);
        }
    }

    public final void x() {
        A3.a a0 = this.e;
        if(a0 != null) {
            a0.invoke();
        }
    }

    public final void y(@l List list0) {
        L.p(list0, "items");
        if(this.getItemCount() > 0) {
            this.d.clear();
        }
        this.d.addAll(list0);
        this.d.add(0, new Album(0L, 0L, null, null, null, 0, 0, 0, 0xFF, null));
        this.notifyDataSetChanged();
    }

    public final void z(@l A3.a a0) {
        L.p(a0, "onClick");
        this.e = a0;
    }
}

