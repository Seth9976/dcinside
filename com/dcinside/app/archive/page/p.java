package com.dcinside.app.archive.page;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.archive.util.u;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.A0;
import com.dcinside.app.rx.bus.s0;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import io.realm.F0;
import io.realm.d1;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class p extends ViewHolder {
    private final boolean a;
    @l
    private TextView b;
    @l
    private TextView c;
    @l
    private TextView d;
    @l
    private TextView e;
    @l
    private TextView f;
    @l
    private View g;
    @l
    private View h;
    @l
    private View i;

    public p(@l View view0, boolean z) {
        @f(c = "com.dcinside.app.archive.page.VoiceArchiveHolder$1", f = "VoiceArchiveHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements A3.p {
            int k;
            final p l;

            a(p p0, d d0) {
                this.l = p0;
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
                this.l.y();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.archive.page.VoiceArchiveHolder$2", f = "VoiceArchiveHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements A3.p {
            int k;
            Object l;
            final p m;

            b(p p0, d d0) {
                this.m = p0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                b p$b0 = new b(this.m, d0);
                p$b0.l = view0;
                return p$b0.invokeSuspend(S0.a);
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
                this.m.u(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.archive.page.VoiceArchiveHolder$3", f = "VoiceArchiveHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements A3.p {
            int k;
            Object l;
            final p m;

            c(p p0, d d0) {
                this.m = p0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                c p$c0 = new c(this.m, d0);
                p$c0.l = view0;
                return p$c0.invokeSuspend(S0.a);
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
                this.m.x(((View)this.l));
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        this.a = z;
        View view1 = view0.findViewById(0x7F0B1092);  // id:voice_archive_item_memo
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B1096);  // id:voice_archive_item_subject
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B1091);  // id:voice_archive_item_gallery
        L.o(view3, "findViewById(...)");
        this.d = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B1093);  // id:voice_archive_item_name
        L.o(view4, "findViewById(...)");
        this.e = (TextView)view4;
        View view5 = view0.findViewById(0x7F0B108F);  // id:voice_archive_item_date
        L.o(view5, "findViewById(...)");
        this.f = (TextView)view5;
        View view6 = view0.findViewById(0x7F0B1095);  // id:voice_archive_item_sub_div1
        L.o(view6, "findViewById(...)");
        this.g = view6;
        View view7 = view0.findViewById(0x7F0B1097);  // id:voice_archive_prev_play
        L.o(view7, "findViewById(...)");
        this.h = view7;
        View view8 = view0.findViewById(0x7F0B1090);  // id:voice_archive_item_delete
        L.o(view8, "findViewById(...)");
        this.i = view8;
        r.M(this.h, null, new a(this, null), 1, null);
        r.M(this.i, null, new b(this, null), 1, null);
        this.i.setVisibility((z ? 8 : 0));
        r.M(view0, null, new c(this, null), 1, null);
    }

    // 检测为 Lambda 实现
    private static final void A(p p0, Throwable throwable0) [...]

    public final void B(@l View view0) {
        L.p(view0, "<set-?>");
        this.g = view0;
    }

    public final void C(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.f = textView0;
    }

    public final void D(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.d = textView0;
    }

    public final void E(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.b = textView0;
    }

    public final void F(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.e = textView0;
    }

    public final void G(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.c = textView0;
    }

    @l
    public final View n() {
        return this.g;
    }

    private final A0 o() {
        try {
            int v = this.getAdapterPosition();
            if(v < 0) {
                return null;
            }
            ViewParent viewParent0 = this.itemView.getParent();
            L.n(viewParent0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            Adapter recyclerView$Adapter0 = ((RecyclerView)viewParent0).getAdapter();
            L.n(recyclerView$Adapter0, "null cannot be cast to non-null type com.dcinside.app.archive.page.ArchiveAdapter<*, *>");
            d1 d10 = ((com.dcinside.app.archive.page.a)recyclerView$Adapter0).w(v);
            L.n(d10, "null cannot be cast to non-null type com.dcinside.app.realm.VoiceArchive");
            return (A0)d10;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @l
    public final TextView p() {
        return this.f;
    }

    @l
    public final TextView q() {
        return this.d;
    }

    @l
    public final TextView r() {
        return this.b;
    }

    @l
    public final TextView s() {
        return this.e;
    }

    @l
    public final TextView t() {
        return this.c;
    }

    private final void u(View view0) {
        static final class com.dcinside.app.archive.page.p.d extends N implements Function1 {
            public static final com.dcinside.app.archive.page.p.d e;

            static {
                com.dcinside.app.archive.page.p.d.e = new com.dcinside.app.archive.page.p.d();
            }

            com.dcinside.app.archive.page.p.d() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1500A4);  // string:alert_delete_post_archive "보관함에서 삭제하시겠습니까?"
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

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class com.dcinside.app.archive.page.p.f extends N implements Function1 {
            final p e;
            final g f;
            final View g;

            com.dcinside.app.archive.page.p.f(p p0, g g0, View view0) {
                this.e = p0;
                this.f = g0;
                this.g = view0;
                super(1);
            }

            public final void b(Boolean boolean0) {
                A0 a00 = this.e.o();
                if(a00 == null || !a00.s()) {
                    Dl.D(this.g.getContext(), 0x7F150869);  // string:realm_in_delete "데이터 처리중입니다.\n잠시 후 다시 시도해주세요."
                }
                else {
                    F0 f00 = this.f.F1();
                    if(f00 != null) {
                        f00.Y3((F0 f00) -> a00.z5());
                    }
                }
            }

            // 检测为 Lambda 实现
            private static final void c(A0 a00, F0 f00) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((Boolean)object0));
                return S0.a;
            }
        }

        Context context0 = Dl.b(view0);
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.base.RealmBaseActivity");
        com.dcinside.app.perform.e.e.a(((g)context0)).n(com.dcinside.app.archive.page.p.d.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(e.e, "$tmp0");
            return (Boolean)e.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.archive.page.p.f(this, ((g)context0), view0), "$tmp0");
            new com.dcinside.app.archive.page.p.f(this, ((g)context0), view0).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean v(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void w(Function1 function10, Object object0) [...]

    private final void x(View view0) {
        A0 a00 = this.o();
        if(a00 != null && a00.s()) {
            if(this.a) {
                Context context0 = Dl.b(view0);
                L.n(context0, "null cannot be cast to non-null type android.app.Activity");
                Intent intent0 = new Intent();
                intent0.putExtra("source", a00.W5());
                ((Activity)context0).setResult(-1, intent0);
                ((Activity)context0).finish();
                return;
            }
            Xk.k(((AppCompatActivity)Dl.b(view0)), a00.S5(), a00.V5(), false, false, false, 56, null);
            return;
        }
        Dl.D(view0.getContext(), 0x7F150869);  // string:realm_in_delete "데이터 처리중입니다.\n잠시 후 다시 시도해주세요."
    }

    private final void y() {
        static final class com.dcinside.app.archive.page.p.g extends N implements Function1 {
            final g e;
            final A0 f;

            com.dcinside.app.archive.page.p.g(g g0, A0 a00) {
                this.e = g0;
                this.f = a00;
                super(1);
            }

            public final void b(String s) {
                String s1 = this.f.S5();
                int v = this.f.V5();
                Xk.k(this.e, s1, v, false, false, false, 56, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        Context context0 = Dl.b(this.itemView);
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.base.RealmBaseActivity");
        A0 a00 = this.o();
        if(a00 == null) {
            return;
        }
        if(a00.s()) {
            com.dcinside.app.rx.bus.c.a(((g)context0), new s0(a00));
            u.J(((g)context0), a00).y5((Object object0) -> {
                L.p(new com.dcinside.app.archive.page.p.g(((g)context0), a00), "$tmp0");
                new com.dcinside.app.archive.page.p.g(((g)context0), a00).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                Dl.G(this.itemView.getContext(), throwable0.getMessage());
            });
        }
    }

    // 检测为 Lambda 实现
    private static final void z(Function1 function10, Object object0) [...]
}

