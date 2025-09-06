package com.dcinside.app.gif;

import Y.M2;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.gif.frame.Frame;
import com.dcinside.app.gif.view.GifThumbView;
import com.dcinside.app.image.s;
import com.dcinside.app.util.Dl;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.X;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nGifImageSelectAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifImageSelectAdapter.kt\ncom/dcinside/app/gif/GifImageSelectAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"})
public final class c extends Adapter {
    @s0({"SMAP\nGifImageSelectAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifImageSelectAdapter.kt\ncom/dcinside/app/gif/GifImageSelectAdapter$GifViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"})
    public final class a extends ViewHolder {
        @l
        private final M2 a;
        @m
        private I0 b;
        final c c;

        public a(@l M2 m20) {
            L.p(m20, "binding");
            this.c = c0;
            super(m20.b());
            this.a = m20;
        }

        public final void e(float f, float f1) {
            this.a.b.setAlpha(f);
            this.a.b.setTranslationY(f1);
        }

        @m
        public final Object f(long v, @l d d0) {
            @f(c = "com.dcinside.app.gif.GifImageSelectAdapter$GifViewHolder", f = "GifImageSelectAdapter.kt", i = {0}, l = {0x80, 0x81}, m = "bindThumbLaunch", n = {"$this$bindThumbLaunch_u24lambda_u242"}, s = {"L$0"})
            static final class com.dcinside.app.gif.c.a.a extends kotlin.coroutines.jvm.internal.d {
                Object k;
                Object l;
                final a m;
                int n;

                com.dcinside.app.gif.c.a.a(a c$a0, d d0) {
                    this.m = c$a0;
                    super(d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.n |= 0x80000000;
                    return this.m.f(0L, this);
                }
            }


            @f(c = "com.dcinside.app.gif.GifImageSelectAdapter$GifViewHolder$bindThumbLaunch$2$1", f = "GifImageSelectAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @s0({"SMAP\nGifImageSelectAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifImageSelectAdapter.kt\ncom/dcinside/app/gif/GifImageSelectAdapter$GifViewHolder$bindThumbLaunch$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"})
            static final class b extends o implements A3.o {
                int k;
                final String l;
                final GifThumbView m;

                b(String s, GifThumbView gifThumbView0, d d0) {
                    this.l = s;
                    this.m = gifThumbView0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new b(this.l, this.m, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((b)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    S0 s00;
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    String s = this.l;
                    if(s == null) {
                        s00 = null;
                    }
                    else {
                        L.m(this.m);
                        s.i(this.m, s).b().apply();
                        s00 = S0.a;
                    }
                    if(s00 == null) {
                        L.o(this.m, "$this_run");
                        s.e(this.m, 0x7F08044F).apply();  // drawable:not_import_img
                    }
                    return S0.a;
                }
            }

            String s;
            GifThumbView gifThumbView0;
            com.dcinside.app.gif.c.a.a c$a$a0;
            if(d0 instanceof com.dcinside.app.gif.c.a.a) {
                c$a$a0 = (com.dcinside.app.gif.c.a.a)d0;
                int v1 = c$a$a0.n;
                if((v1 & 0x80000000) == 0) {
                    c$a$a0 = new com.dcinside.app.gif.c.a.a(this, d0);
                }
                else {
                    c$a$a0.n = v1 ^ 0x80000000;
                }
            }
            else {
                c$a$a0 = new com.dcinside.app.gif.c.a.a(this, d0);
            }
            Object object0 = c$a$a0.l;
            Object object1 = kotlin.coroutines.intrinsics.b.l();
            switch(c$a$a0.n) {
                case 0: {
                    f0.n(object0);
                    gifThumbView0 = this.a.b;
                    c c0 = this.c;
                    L.m(gifThumbView0);
                    s.b(gifThumbView0);
                    com.dcinside.app.gif.maker.d d1 = c0.b;
                    if(d1 == null) {
                        s = null;
                    }
                    else {
                        X x0 = d1.p(c0.d, v);
                        c$a$a0.k = gifThumbView0;
                        c$a$a0.n = 1;
                        Object object2 = x0.o(c$a$a0);
                        if(object2 == object1) {
                            return object1;
                        }
                        s = ((Frame)object2).c();
                    }
                    break;
                }
                case 1: {
                    GifThumbView gifThumbView1 = (GifThumbView)c$a$a0.k;
                    f0.n(object0);
                    s = ((Frame)object0).c();
                    gifThumbView0 = gifThumbView1;
                    break;
                }
                case 2: {
                    f0.n(object0);
                    return S0.a;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            b c$a$b0 = new b(s, gifThumbView0, null);
            c$a$a0.k = null;
            c$a$a0.n = 2;
            return i.h(h0.e(), c$a$b0, c$a$a0) == object1 ? object1 : S0.a;
        }

        @m
        public final I0 h() {
            return this.b;
        }

        public final void i() {
            I0 i00 = this.b;
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
            L.o(this.a.b, "gifImageSource");
            s.b(this.a.b);
        }

        public final void j(@m I0 i00) {
            this.b = i00;
        }
    }

    @l
    private final LifecycleCoroutineScope a;
    @m
    private com.dcinside.app.gif.maker.d b;
    @l
    private List c;
    private boolean d;

    public c(@l LifecycleCoroutineScope lifecycleCoroutineScope0) {
        L.p(lifecycleCoroutineScope0, "scope");
        super();
        this.a = lifecycleCoroutineScope0;
        this.c = new ArrayList();
    }

    // 检测为 Lambda 实现
    private static final void A(c c0, ViewHolder recyclerView$ViewHolder0, View view0) [...]

    private final void B(Context context0, int v) {
        com.dcinside.app.gif.maker.d d0 = this.b;
        if(d0 != null) {
            long v1 = ((Number)this.c.get(v)).longValue();
            if(d0.o(v1)) {
                if(d0.l().size() <= 2) {
                    Dl.D(context0, 0x7F1503E3);  // string:gif_make_image_least "최소 2장 이상의 파일은 선택되어야합니다."
                    return;
                }
                d0.f(v1);
            }
            else {
                d0.x(v1);
            }
            this.notifyItemChanged(v);
        }
    }

    public final void C(@l List list0) {
        L.p(list0, "newFrames");
        DiffResult diffUtil$DiffResult0 = DiffUtil.b(new com.dcinside.app.gif.a(this.c, list0));
        L.o(diffUtil$DiffResult0, "calculateDiff(...)");
        this.c.clear();
        this.c.addAll(list0);
        diffUtil$DiffResult0.e(this);
    }

    public final void D(boolean z, @m com.dcinside.app.gif.maker.d d0) {
        this.d = z;
        this.b = d0;
        this.notifyItemRangeInserted(0, this.getItemCount());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b == null ? 0 : this.c.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        @f(c = "com.dcinside.app.gif.GifImageSelectAdapter$onBindViewHolder$2", f = "GifImageSelectAdapter.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gif.c.b extends o implements A3.o {
            int k;
            final ViewHolder l;
            final long m;

            com.dcinside.app.gif.c.b(ViewHolder recyclerView$ViewHolder0, long v, d d0) {
                this.l = recyclerView$ViewHolder0;
                this.m = v;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.dcinside.app.gif.c.b(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.gif.c.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return ((a)this.l).f(this.m, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(recyclerView$ViewHolder0, "holder");
        long v1 = this.y(v);
        if(recyclerView$ViewHolder0 instanceof a) {
            I0 i00 = ((a)recyclerView$ViewHolder0).h();
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
            com.dcinside.app.gif.b b0 = (View view0) -> {
                L.p(this, "this$0");
                L.p(recyclerView$ViewHolder0, "$holder");
                Context context0 = recyclerView$ViewHolder0.itemView.getContext();
                L.o(context0, "getContext(...)");
                this.B(context0, ((a)recyclerView$ViewHolder0).getBindingAdapterPosition());
            };
            recyclerView$ViewHolder0.itemView.setOnClickListener(b0);
            if(this.b == null || !this.b.o(v1)) {
                ((a)recyclerView$ViewHolder0).e(0.5f, 0.5f);
            }
            else {
                ((a)recyclerView$ViewHolder0).e(1.0f, 0.0f);
            }
            com.dcinside.app.gif.c.b c$b0 = new com.dcinside.app.gif.c.b(recyclerView$ViewHolder0, v1, null);
            ((a)recyclerView$ViewHolder0).j(k.f(this.a, h0.c(), null, c$b0, 2, null));
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        M2 m20 = M2.d(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
        L.o(m20, "inflate(...)");
        return new a(this, m20);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewRecycled(@l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof a) {
            ((a)recyclerView$ViewHolder0).i();
        }
    }

    public final void release() {
        this.b = null;
        this.c.clear();
        this.notifyItemRangeRemoved(0, this.getItemCount());
    }

    private final long y(int v) {
        return ((Number)this.c.get(v)).longValue();
    }

    public final int z(int v) {
        com.dcinside.app.gif.maker.d d0 = this.b;
        if(d0 != null) {
            TreeSet treeSet0 = d0.l();
            if(treeSet0 != null) {
                Long long0 = (Long)treeSet0.higher(this.c.get(v));
                if(long0 == null) {
                    long0 = (Long)u.h4(treeSet0);
                }
                Integer integer0 = u.d3(this.c, long0);
                if(integer0.intValue() < 0) {
                    integer0 = null;
                }
                return integer0 == null ? 0 : ((int)integer0);
            }
        }
        return 0;
    }
}

