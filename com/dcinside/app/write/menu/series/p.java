package com.dcinside.app.write.menu.series;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.g0;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import io.realm.g1;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class p extends Adapter {
    @SuppressLint({"ClickableViewAccessibility"})
    public static final class a extends ViewHolder {
        @l
        private final TextView a;
        @l
        private final TextView b;
        @l
        private final View c;
        @l
        private final TextView d;
        @l
        private final View e;

        public a(@l View view0) {
            @f(c = "com.dcinside.app.write.menu.series.SeriesListAdapter$SeriesItemHolder$1", f = "SeriesListAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class com.dcinside.app.write.menu.series.p.a.a extends o implements A3.p {
                int k;
                final a l;

                com.dcinside.app.write.menu.series.p.a.a(a p$a0, d d0) {
                    this.l = p$a0;
                    super(3, d0);
                }

                @m
                public final Object a(@l O o0, @l View view0, @m d d0) {
                    return new com.dcinside.app.write.menu.series.p.a.a(this.l, d0).invokeSuspend(S0.a);
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
                    this.l.l();
                    return S0.a;
                }
            }


            @f(c = "com.dcinside.app.write.menu.series.SeriesListAdapter$SeriesItemHolder$2", f = "SeriesListAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends o implements A3.p {
                int k;
                final a l;

                b(a p$a0, d d0) {
                    this.l = p$a0;
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
                    this.l.m();
                    return S0.a;
                }
            }

            L.p(view0, "itemView");
            super(view0);
            View view1 = view0.findViewById(0x7F0B0E1F);  // id:series_item_subject
            L.o(view1, "findViewById(...)");
            this.a = (TextView)view1;
            View view2 = view0.findViewById(0x7F0B0E1B);  // id:series_item_date
            L.o(view2, "findViewById(...)");
            this.b = (TextView)view2;
            View view3 = view0.findViewById(0x7F0B0E1C);  // id:series_item_more
            L.o(view3, "findViewById(...)");
            this.c = view3;
            View view4 = view0.findViewById(0x7F0B0E1E);  // id:series_item_post_count
            L.o(view4, "findViewById(...)");
            this.d = (TextView)view4;
            View view5 = view0.findViewById(0x7F0B0E1D);  // id:series_item_popup_anchor
            L.o(view5, "findViewById(...)");
            this.e = view5;
            r.M(view3, null, new com.dcinside.app.write.menu.series.p.a.a(this, null), 1, null);
            r.M(view0, null, new b(this, null), 1, null);
        }

        @l
        public final TextView h() {
            return this.d;
        }

        @l
        public final TextView i() {
            return this.b;
        }

        @l
        public final View j() {
            return this.c;
        }

        @l
        public final TextView k() {
            return this.a;
        }

        private final void l() {
            ViewParent viewParent0 = this.itemView.getParent();
            SeriesListActivity seriesListActivity0 = null;
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            p p0 = recyclerView$Adapter0 instanceof p ? ((p)recyclerView$Adapter0) : null;
            if(p0 == null) {
                return;
            }
            Context context0 = Dl.b(this.itemView);
            g0 g00 = p0.v(this.getBindingAdapterPosition());
            if(context0 instanceof SeriesListActivity) {
                seriesListActivity0 = (SeriesListActivity)context0;
            }
            if(seriesListActivity0 != null) {
                seriesListActivity0.n2(g00, this.e);
            }
        }

        private final void m() {
            ViewParent viewParent0 = this.itemView.getParent();
            SeriesListActivity seriesListActivity0 = null;
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            p p0 = recyclerView$Adapter0 instanceof p ? ((p)recyclerView$Adapter0) : null;
            if(p0 == null) {
                return;
            }
            Context context0 = Dl.b(this.itemView);
            g0 g00 = p0.v(this.getBindingAdapterPosition());
            if(context0 instanceof SeriesListActivity) {
                seriesListActivity0 = (SeriesListActivity)context0;
            }
            if(seriesListActivity0 != null) {
                seriesListActivity0.m2(g00.Q5());
            }
        }
    }

    @l
    private ArrayList a;

    public p() {
        this.a = new ArrayList();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.w(((a)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.x(viewGroup0, v);
    }

    @l
    public final g0 v(int v) {
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        return (g0)object0;
    }

    public void w(@l a p$a0, int v) {
        L.p(p$a0, "holder");
        Context context0 = p$a0.itemView.getContext();
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        p$a0.k().setText(((g0)object0).S5());
        p$a0.i().setText(Bk.J(((g0)object0).Q5()));
        int v1 = ((g0)object0).R5().size();
        L.m(context0);
        String s = String.format("#%06X", Arrays.copyOf(new Object[]{((int)(vk.b(context0, 0x7F04012E) & 0xFFFFFF))}, 1));  // attr:colorAccent
        L.o(s, "format(...)");
        String s1 = context0.getString(0x7F150941, new Object[]{s, v1});  // string:series_count_color "(<font color=%1$s>%2$d</font>)"
        L.o(s1, "getString(...)");
        p$a0.h().setText(Dl.c(s1));
    }

    @l
    public a x(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E027A, viewGroup0, false);  // layout:view_series_item
        L.m(view0);
        return new a(view0);
    }

    public final void y(@l g1 g10) {
        L.p(g10, "items");
        this.a.clear();
        this.a.addAll(g10);
        this.notifyDataSetChanged();
    }
}

