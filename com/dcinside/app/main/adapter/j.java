package com.dcinside.app.main.adapter;

import A3.p;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.e;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.B;
import com.dcinside.app.span.b;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
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

@s0({"SMAP\nMainBestPickHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainBestPickHolder.kt\ncom/dcinside/app/main/adapter/MainBestPickHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,62:1\n1#2:63\n20#3:64\n25#4:65\n*S KotlinDebug\n*F\n+ 1 MainBestPickHolder.kt\ncom/dcinside/app/main/adapter/MainBestPickHolder\n*L\n55#1:64\n55#1:65\n*E\n"})
public class j extends e {
    @l
    private final TextView a;
    @l
    private final TextView b;
    @l
    private final TextView c;

    public j(@l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.main.adapter.MainBestPickHolder$1", f = "MainBestPickHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final j l;

            a(j j0, d d0) {
                this.l = j0;
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
                this.l.j();
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E019E);  // layout:view_best_pick_item
        View view0 = this.itemView.findViewById(0x7F0B01AE);  // id:best_pick_title
        L.o(view0, "findViewById(...)");
        this.a = (TextView)view0;
        View view1 = this.itemView.findViewById(0x7F0B01AA);  // id:best_pick_comment
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
        View view2 = this.itemView.findViewById(0x7F0B01AC);  // id:best_pick_gallery_name_date
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        L.o(this.itemView, "itemView");
        a j$a0 = new a(this, null);
        r.M(this.itemView, null, j$a0, 1, null);
    }

    public final void i(int v) {
        this.a.setTextColor(v);
    }

    private final void j() {
        com.dcinside.app.main.adapter.f f0;
        Integer integer0 = this.getBindingAdapterPosition();
        AppCompatActivity appCompatActivity0 = null;
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            RecyclerView recyclerView0 = this.e();
            if(recyclerView0 == null) {
                f0 = null;
            }
            else {
                Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
                if(!(recyclerView$Adapter0 instanceof com.dcinside.app.main.adapter.f)) {
                    recyclerView$Adapter0 = null;
                }
                f0 = (com.dcinside.app.main.adapter.f)recyclerView$Adapter0;
            }
            if(f0 == null) {
                return;
            }
            B b0 = f0.C(v).b();
            if(b0 == null) {
                return;
            }
            Context context0 = Al.h(this.itemView.getContext());
            if(context0 instanceof AppCompatActivity) {
                appCompatActivity0 = (AppCompatActivity)context0;
            }
            if(appCompatActivity0 == null) {
                return;
            }
            String s = b0.h();
            if(s == null) {
                return;
            }
            new com.dcinside.app.util.Xk.a(s, b0.i(), 0, null, false, false, true, false, false, false, null, false, null, null, 0x3FBC, null).a(appCompatActivity0);
        }
    }

    public final void k(@m B b0) {
        if(b0 == null) {
            return;
        }
        Context context0 = this.itemView.getContext();
        String s = Dl.t(Dl.M(Dl.C(b0.l())));
        this.a.setText(s);
        this.b.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder().append(b0.f()).append(' ');
        L.m(spannableStringBuilder0);
        L.m(context0);
        com.dcinside.app.internal.l.a(spannableStringBuilder0, "**", new b(context0, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
        spannableStringBuilder0.append(' ');
        spannableStringBuilder0.append(b0.d());
        this.c.setText(spannableStringBuilder0);
    }
}

