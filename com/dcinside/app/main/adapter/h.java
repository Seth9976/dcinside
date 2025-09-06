package com.dcinside.app.main.adapter;

import A3.p;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.n;
import com.dcinside.app.base.e;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.B;
import com.dcinside.app.span.g;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import com.dcinside.app.view.TailTextView;
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

@s0({"SMAP\nMainBestLiveHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainBestLiveHolder.kt\ncom/dcinside/app/main/adapter/MainBestLiveHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,102:1\n1#2:103\n20#3:104\n25#4:105\n*S KotlinDebug\n*F\n+ 1 MainBestLiveHolder.kt\ncom/dcinside/app/main/adapter/MainBestLiveHolder\n*L\n95#1:104\n95#1:105\n*E\n"})
public class h extends e {
    @l
    private final ImageView a;
    @l
    private final TailTextView b;
    @l
    private final TextView c;
    @l
    private final View d;

    public h(@l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.main.adapter.MainBestLiveHolder$1", f = "MainBestLiveHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final h l;

            a(h h0, d d0) {
                this.l = h0;
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
                this.l.k();
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E0203);  // layout:view_live_best_item
        View view0 = this.itemView.findViewById(0x7F0B0732);  // id:live_best_thumbnail
        L.o(view0, "findViewById(...)");
        this.a = (ImageView)view0;
        View view1 = this.itemView.findViewById(0x7F0B0733);  // id:live_best_title
        L.o(view1, "findViewById(...)");
        this.b = (TailTextView)view1;
        View view2 = this.itemView.findViewById(0x7F0B0728);  // id:live_best_gallery_name_date
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = this.itemView.findViewById(0x7F0B0726);  // id:live_best_fix_post
        L.o(view3, "findViewById(...)");
        this.d = view3;
        L.o(this.itemView, "itemView");
        a h$a0 = new a(this, null);
        r.M(this.itemView, null, h$a0, 1, null);
    }

    public final void i(int v) {
        this.b.setTextColor(v);
    }

    private final void j(boolean z) {
        this.b.setAlpha((z ? 0.2f : 1.0f));
        this.a.setAlpha((z ? 0.2f : 1.0f));
        this.c.setAlpha((z ? 0.2f : 1.0f));
        this.d.setAlpha((z ? 0.2f : 1.0f));
    }

    private final void k() {
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

    public final void l(@m B b0, boolean z) {
        boolean z1 = true;
        if(b0 == null) {
            return;
        }
        Context context0 = this.itemView.getContext();
        String s = b0.k();
        if(TextUtils.isEmpty(s)) {
            com.dcinside.app.glide.a.l(this.a).r0(0x7F0803A3).V2(new com.bumptech.glide.load.h(new n[]{new com.bumptech.glide.load.resource.bitmap.n(), new com.bumptech.glide.load.resource.bitmap.L(0)})).q1(this.a);  // drawable:img_no_image
        }
        else {
            com.dcinside.app.glide.a.l(this.a).t0(s).V2(new com.bumptech.glide.load.h(new n[]{new com.bumptech.glide.load.resource.bitmap.n(), new com.bumptech.glide.load.resource.bitmap.L(0)})).e2(0x7F0803A3).q1(this.a);  // drawable:img_no_image
        }
        int v = b0.n() ? 0 : 8;
        this.d.setVisibility(v);
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(Dl.t(Dl.M(Dl.C(b0.l()))));
        SpannableStringBuilder spannableStringBuilder1 = new SpannableStringBuilder();
        spannableStringBuilder1.append('…');
        L.m(context0);
        g.a.c(context0, b0.c(), 0, new SpannableStringBuilder[]{spannableStringBuilder0, spannableStringBuilder1});
        com.dcinside.app.view.TailTextView.a tailTextView$a0 = new com.dcinside.app.view.TailTextView.a(spannableStringBuilder0, spannableStringBuilder1);
        this.b.setDisplayTexts(tailTextView$a0);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder().append(b0.f()).append(' ');
        spannableStringBuilder2.append('·');
        spannableStringBuilder2.append(' ');
        spannableStringBuilder2.append(b0.d());
        this.c.setText(spannableStringBuilder2);
        if(!z || !b0.a()) {
            z1 = false;
        }
        this.j(z1);
    }
}

