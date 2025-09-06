package com.dcinside.app.youtube;

import A3.p;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.kl;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import rx.g;
import rx.subjects.b;
import y4.l;
import y4.m;

@s0({"SMAP\nYoutubeSearchItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YoutubeSearchItemAdapter.kt\ncom/dcinside/app/youtube/YoutubeSearchItemAdapter\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,221:1\n177#2,9:222\n*S KotlinDebug\n*F\n+ 1 YoutubeSearchItemAdapter.kt\ncom/dcinside/app/youtube/YoutubeSearchItemAdapter\n*L\n124#1:222,9\n*E\n"})
public final class o extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final b a;
    @l
    private final SimpleDateFormat b;
    @l
    private final ArrayList c;
    private boolean d;
    private int e;
    @m
    private rx.o f;
    @m
    private WeakReference g;
    @l
    public static final a h = null;
    @l
    private static final String i = "selected";
    @l
    private static final String j = "list";
    @l
    private static final String k = "done";
    private static final int l = 0;
    private static final int m = 1;

    static {
        o.h = new a(null);
    }

    public o(@m Bundle bundle0) {
        this.a = b.C7();
        this.b = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'", Locale.getDefault());
        ArrayList arrayList0 = new ArrayList();
        this.c = arrayList0;
        this.e = -1;
        if(bundle0 != null) {
            this.e = bundle0.getInt("selected", -1);
            this.d = bundle0.getBoolean("done");
            ArrayList arrayList1 = bundle0.getParcelableArrayList("list");
            if(arrayList1 != null && !arrayList1.isEmpty() == 1) {
                arrayList0.addAll(arrayList1);
            }
        }
    }

    public final void A(@l List list0) {
        L.p(list0, "items");
        if(!list0.isEmpty()) {
            this.c.addAll(this.c.size() - 1, list0);
            this.d = false;
            this.notifyDataSetChanged();
            return;
        }
        int v = this.c.size();
        if(v - 1 >= 0) {
            Object object0 = this.c.get(v - 1);
            L.o(object0, "get(...)");
            if(((Item)object0).a() == null) {
                this.c.remove(v - 1);
            }
        }
        this.d = true;
        this.notifyDataSetChanged();
    }

    private final void B(s s0, boolean z) {
        if(z) {
            s0.i().setVisibility(0);
            s0.h().setVisibility(8);
            return;
        }
        s0.i().setVisibility(8);
        s0.h().setVisibility(0);
    }

    public final void C() {
        this.e = -1;
        this.c.clear();
        Item youtubeSearchResult$Item0 = new Item();
        this.c.add(youtubeSearchResult$Item0);
        this.d = false;
        this.notifyDataSetChanged();
    }

    @l
    public final ArrayList D() {
        return this.c;
    }

    public final int E() {
        return this.e;
    }

    private final void F() {
        Context context0;
        try {
            WeakReference weakReference0 = this.g;
            com.dcinside.app.post.q.a q$a0 = null;
            if(weakReference0 == null) {
                context0 = null;
            }
            else {
                RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
                context0 = recyclerView0 == null ? null : recyclerView0.getContext();
            }
            if(context0 instanceof com.dcinside.app.post.q.a) {
                q$a0 = (com.dcinside.app.post.q.a)context0;
            }
            if(q$a0 != null) {
                q$a0.E();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public final void G(boolean z) {
        this.a.onNext(Boolean.valueOf(z));
    }

    public final void H(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        bundle0.putInt("selected", this.e);
        bundle0.putBoolean("done", this.d);
        bundle0.putParcelableArrayList("list", this.c);
    }

    public final void I(@l View view0, int v) {
        L.p(view0, "v");
        WeakReference weakReference0 = this.g;
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                int v1 = this.e;
                if(v1 != v) {
                    this.e = v;
                    Context context0 = Al.h(recyclerView0.getContext());
                    L.n(context0, "null cannot be cast to non-null type com.dcinside.app.youtube.YoutubeSearchActivity");
                    ((YoutubeSearchActivity)context0).invalidateOptionsMenu();
                    if(v1 >= 0) {
                        LinearLayoutManager linearLayoutManager0 = (LinearLayoutManager)recyclerView0.getLayoutManager();
                        if(linearLayoutManager0 != null && (linearLayoutManager0.s() <= v1 && v1 <= linearLayoutManager0.i())) {
                            View view1 = linearLayoutManager0.c0(v1);
                            if(view1 != null) {
                                view1.setSelected(false);
                            }
                        }
                    }
                    if(v >= 0) {
                        view0.setSelected(true);
                    }
                }
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.c.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public long getItemId(int v) {
        return ((Item)this.c.get(v)).a() == null ? 0x7FFFFFFFFFFFFFFFL : ((long)v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return ((Item)this.c.get(v)).a() == null ? 1 : 0;
    }

    public final boolean isDone() {
        return this.d;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.g = new WeakReference(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof r) {
            Object object0 = this.c.get(v);
            L.o(object0, "get(...)");
            Snippet youtubeSearchResult$Snippet0 = ((Item)object0).c();
            CharSequence charSequence0 = youtubeSearchResult$Snippet0.e();
            ((r)recyclerView$ViewHolder0).l().setText(youtubeSearchResult$Snippet0.g());
            ((r)recyclerView$ViewHolder0).j().setText(youtubeSearchResult$Snippet0.d());
            recyclerView$ViewHolder0.itemView.setSelected(this.e == v);
            ImageView imageView0 = ((r)recyclerView$ViewHolder0).k();
            com.dcinside.app.image.o.a.e(imageView0, youtubeSearchResult$Snippet0.f().a().c()).apply();
            try {
                Date date0 = this.b.parse(((String)charSequence0));
                long v1 = System.currentTimeMillis();
                if(date0 != null) {
                    CharSequence charSequence1 = DateUtils.getRelativeTimeSpanString(date0.getTime(), v1, 60000L);
                    if(charSequence1 != null) {
                        charSequence0 = charSequence1;
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            ((r)recyclerView$ViewHolder0).m().setText(charSequence0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        @f(c = "com.dcinside.app.youtube.YoutubeSearchItemAdapter$onCreateViewHolder$1", f = "YoutubeSearchItemAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.youtube.o.b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final o l;

            com.dcinside.app.youtube.o.b(o o0, d d0) {
                this.l = o0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.youtube.o.b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.F();
                return S0.a;
            }
        }


        public static final class c implements View.OnAttachStateChangeListener {
            final o a;
            final s b;

            c(o o0, s s0) {
                this.a = o0;
                this.b = s0;
                super();
            }

            // 检测为 Lambda 实现
            private static final g c(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void d(Function1 function10, Object object0) [...]

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(@l View view0) {
                static final class com.dcinside.app.youtube.o.c.a extends N implements Function1 {
                    public static final com.dcinside.app.youtube.o.c.a e;

                    static {
                        com.dcinside.app.youtube.o.c.a.e = new com.dcinside.app.youtube.o.c.a();
                    }

                    com.dcinside.app.youtube.o.c.a() {
                        super(1);
                    }

                    public final g a(Boolean boolean0) {
                        L.m(boolean0);
                        return boolean0.booleanValue() ? g.s6(0L, TimeUnit.MILLISECONDS) : g.s6(500L, TimeUnit.MILLISECONDS);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((Boolean)object0));
                    }
                }


                static final class com.dcinside.app.youtube.o.c.b extends N implements Function1 {
                    final o e;
                    final s f;

                    com.dcinside.app.youtube.o.c.b(o o0, s s0) {
                        this.e = o0;
                        this.f = s0;
                        super(1);
                    }

                    public final void a(Boolean boolean0) {
                        L.m(boolean0);
                        this.e.B(this.f, boolean0.booleanValue());
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Boolean)object0));
                        return S0.a;
                    }
                }

                L.p(view0, "v");
                kl.b(new rx.o[]{this.a.f});
                rx.o o0 = this.a.a.t1((Object object0) -> {
                    L.p(com.dcinside.app.youtube.o.c.a.e, "$tmp0");
                    return (g)com.dcinside.app.youtube.o.c.a.e.invoke(object0);
                }).M3(rx.android.schedulers.a.c()).x5((Object object0) -> {
                    L.p(new com.dcinside.app.youtube.o.c.b(this.a, this.b), "$tmp0");
                    new com.dcinside.app.youtube.o.c.b(this.a, this.b).invoke(object0);
                });
                this.a.f = o0;
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@l View view0) {
                L.p(view0, "v");
                rx.o o0 = this.a.f;
                L.m(o0);
                o0.l();
            }
        }

        L.p(viewGroup0, "parent");
        if(v == 0) {
            return new r(viewGroup0);
        }
        ViewHolder recyclerView$ViewHolder0 = new s(viewGroup0);
        if(this.a.L7()) {
            Object object0 = this.a.G7();
            L.o(object0, "getValue(...)");
            this.B(((s)recyclerView$ViewHolder0), ((Boolean)object0).booleanValue());
        }
        else {
            this.B(((s)recyclerView$ViewHolder0), false);
        }
        L.o(recyclerView$ViewHolder0.itemView, "itemView");
        com.dcinside.app.youtube.o.b o$b0 = new com.dcinside.app.youtube.o.b(this, null);
        com.dcinside.app.internal.r.M(recyclerView$ViewHolder0.itemView, null, o$b0, 1, null);
        c o$c0 = new c(this, ((s)recyclerView$ViewHolder0));
        recyclerView$ViewHolder0.itemView.addOnAttachStateChangeListener(o$c0);
        return recyclerView$ViewHolder0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.g = null;
    }
}

