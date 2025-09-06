package com.dcinside.app.youtube;

import A3.p;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.e;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class r extends e {
    @l
    private final ImageView a;
    @l
    private final TextView b;
    @l
    private final TextView c;
    @l
    private final TextView d;

    public r(@l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.youtube.YoutubeSearchItemHolder$1", f = "YoutubeSearchItemHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final r l;

            a(r r0, d d0) {
                this.l = r0;
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
                this.l.p();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.youtube.YoutubeSearchItemHolder$2", f = "YoutubeSearchItemHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final r l;

            b(r r0, d d0) {
                this.l = r0;
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
                this.l.o();
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E02C5);  // layout:view_youtube_search_item
        View view0 = this.itemView.findViewById(0x7F0B111F);  // id:youtube_search_item_thumbnail
        L.o(view0, "findViewById(...)");
        this.a = (ImageView)view0;
        View view1 = this.itemView.findViewById(0x7F0B1120);  // id:youtube_search_item_title
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
        View view2 = this.itemView.findViewById(0x7F0B111D);  // id:youtube_search_item_channel
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = this.itemView.findViewById(0x7F0B1121);  // id:youtube_search_item_view_count
        L.o(view3, "findViewById(...)");
        this.d = (TextView)view3;
        com.dcinside.app.internal.r.M(((ImageView)view0), null, new a(this, null), 1, null);
        L.o(this.itemView, "itemView");
        b r$b0 = new b(this, null);
        com.dcinside.app.internal.r.M(this.itemView, null, r$b0, 1, null);
    }

    @l
    public final TextView j() {
        return this.c;
    }

    @l
    public final ImageView k() {
        return this.a;
    }

    @l
    public final TextView l() {
        return this.b;
    }

    @l
    public final TextView m() {
        return this.d;
    }

    private final void n(Throwable throwable0) {
        timber.log.b.a.y(throwable0);
        Context context0 = Dl.b(this.itemView);
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.youtube.YoutubeSearchActivity");
        Dl.G(((YoutubeSearchActivity)context0), throwable0.getMessage());
    }

    private final void o() {
        ViewParent viewParent0 = this.itemView.getParent();
        L.n(viewParent0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        com.dcinside.app.youtube.o o0 = (com.dcinside.app.youtube.o)((RecyclerView)viewParent0).getAdapter();
        if(o0 != null) {
            L.o(this.itemView, "itemView");
            int v = this.getAdapterPosition();
            o0.I(this.itemView, v);
        }
    }

    private final void p() {
        try {
            int v = this.getAdapterPosition();
            if(v < 0) {
                return;
            }
            ViewParent viewParent0 = this.itemView.getParent();
            YoutubeSearchActivity youtubeSearchActivity0 = null;
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            com.dcinside.app.youtube.o o0 = recyclerView$Adapter0 instanceof com.dcinside.app.youtube.o ? ((com.dcinside.app.youtube.o)recyclerView$Adapter0) : null;
            if(o0 == null) {
                return;
            }
            Context context0 = Al.h(recyclerView0.getContext());
            if(context0 instanceof YoutubeSearchActivity) {
                youtubeSearchActivity0 = (YoutubeSearchActivity)context0;
            }
            if(youtubeSearchActivity0 == null) {
                return;
            }
            Object object0 = o0.D().get(v);
            L.o(object0, "get(...)");
            String s = ((Item)object0).a().a();
            L.m(s);
            com.dcinside.app.youtube.a.a.a(youtubeSearchActivity0, s);
            return;
        }
        catch(Exception exception0) {
        }
        this.n(exception0);
    }
}

