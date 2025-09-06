package com.dcinside.app.view.colorpicker;

import A3.p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.perform.e;
import com.dcinside.app.rx.bus.X;
import com.dcinside.app.rx.bus.Y;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class f extends Adapter {
    public static final class a extends ViewHolder {
        @l
        private final View a;

        public a(@l View view0) {
            L.p(view0, "view");
            super(view0);
            View view1 = view0.findViewById(0x7F0B02D2);  // id:color_picker_recent_item
            L.o(view1, "findViewById(...)");
            this.a = view1;
        }

        @l
        public final View e() {
            return this.a;
        }
    }

    private int a;
    @l
    private List b;
    private int c;
    private int d;

    public f() {
        this.b = u.H();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.c;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return this.w(v) == null ? 0 : 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.colorpicker.RecentColorListAdapter$onBindViewHolder$1", f = "RecentColorListAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final ViewHolder l;
            final Integer m;

            b(ViewHolder recyclerView$ViewHolder0, Integer integer0, d d0) {
                this.l = recyclerView$ViewHolder0;
                this.m = integer0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, this.m, d0).invokeSuspend(S0.a);
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
                Context context0 = Al.h(this.l.itemView.getContext());
                if(context0 != null) {
                    c.a(context0, new X(this.m));
                }
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.colorpicker.RecentColorListAdapter$onBindViewHolder$2", f = "RecentColorListAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.colorpicker.f.c extends o implements p {
            int k;
            final ViewHolder l;
            final f m;
            final int n;

            com.dcinside.app.view.colorpicker.f.c(ViewHolder recyclerView$ViewHolder0, f f0, int v, d d0) {
                this.l = recyclerView$ViewHolder0;
                this.m = f0;
                this.n = v;
                super(3, d0);
            }

            @m
            public final Object g(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.colorpicker.f.c(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
            }

            // 检测为 Lambda 实现
            private static final Boolean h(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void i(Function1 function10, Object object0) [...]

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.g(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class com.dcinside.app.view.colorpicker.f.c.a extends N implements Function1 {
                    public static final com.dcinside.app.view.colorpicker.f.c.a e;

                    static {
                        com.dcinside.app.view.colorpicker.f.c.a.e = new com.dcinside.app.view.colorpicker.f.c.a();
                    }

                    com.dcinside.app.view.colorpicker.f.c.a() {
                        super(1);
                    }

                    @m
                    public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                        L.p(p$a0, "it");
                        return p$a0.m(0x7F15045C);  // string:history_delete_msg "삭제하시겠습니까?"
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((com.dcinside.app.perform.p.a)object0));
                    }
                }


                static final class com.dcinside.app.view.colorpicker.f.c.b extends N implements Function1 {
                    public static final com.dcinside.app.view.colorpicker.f.c.b e;

                    static {
                        com.dcinside.app.view.colorpicker.f.c.b.e = new com.dcinside.app.view.colorpicker.f.c.b();
                    }

                    com.dcinside.app.view.colorpicker.f.c.b() {
                        super(1);
                    }

                    public final Boolean a(Boolean boolean0) {
                        return boolean0;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((Boolean)object0));
                    }
                }


                static final class com.dcinside.app.view.colorpicker.f.c.c extends N implements Function1 {
                    final ViewHolder e;
                    final f f;
                    final int g;

                    com.dcinside.app.view.colorpicker.f.c.c(ViewHolder recyclerView$ViewHolder0, f f0, int v) {
                        this.e = recyclerView$ViewHolder0;
                        this.f = f0;
                        this.g = v;
                        super(1);
                    }

                    public final void a(Boolean boolean0) {
                        Context context0 = Al.h(this.e.itemView.getContext());
                        if(context0 != null) {
                            c.a(context0, new Y(this.f.d + this.g));
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Boolean)object0));
                        return S0.a;
                    }
                }

                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Context context0 = Dl.b(this.l.itemView);
                L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                e.e.a(((AppCompatActivity)context0)).n(com.dcinside.app.view.colorpicker.f.c.a.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> ((Boolean)com.dcinside.app.view.colorpicker.f.c.b.e.invoke(object0))).x5((Object object0) -> new com.dcinside.app.view.colorpicker.f.c.c(this.l, this.m, this.n).invoke(object0));
                return S0.a;
            }
        }

        L.p(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof a) {
            Integer integer0 = this.w(v);
            Drawable drawable0 = ((a)recyclerView$ViewHolder0).e().getBackground();
            GradientDrawable gradientDrawable0 = drawable0 instanceof GradientDrawable ? ((GradientDrawable)drawable0) : null;
            if(gradientDrawable0 != null) {
                gradientDrawable0.setColor((integer0 == null ? -1 : ((int)integer0)));
            }
            L.o(recyclerView$ViewHolder0.itemView, "itemView");
            b f$b0 = new b(recyclerView$ViewHolder0, integer0, null);
            r.M(recyclerView$ViewHolder0.itemView, null, f$b0, 1, null);
            L.o(recyclerView$ViewHolder0.itemView, "itemView");
            com.dcinside.app.view.colorpicker.f.c f$c0 = new com.dcinside.app.view.colorpicker.f.c(recyclerView$ViewHolder0, this, v, null);
            r.S(recyclerView$ViewHolder0.itemView, null, false, f$c0, 3, null);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01B1, viewGroup0, false);  // layout:view_color_picker_save_item
        L.m(view0);
        return new a(view0);
    }

    private final Integer w(int v) {
        return (Integer)this.b.get(this.d + v);
    }

    public final void x(int v, @l List list0) {
        L.p(list0, "colors");
        this.a = v;
        this.d = v * 10;
        this.c = Math.min(Math.max(list0.size() - this.d, 0), 10);
        this.b = list0;
        this.notifyItemRangeChanged(0, this.getItemCount());
    }
}

