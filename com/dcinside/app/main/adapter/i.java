package com.dcinside.app.main.adapter;

import A3.p;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.n;
import com.dcinside.app.base.e;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.B;
import com.dcinside.app.type.g;
import com.dcinside.app.type.q;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.TailTextView;
import kotlin.J;
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

@s0({"SMAP\nMainBestLiveRankingHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainBestLiveRankingHolder.kt\ncom/dcinside/app/main/adapter/MainBestLiveRankingHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,163:1\n1#2:164\n20#3:165\n25#4:166\n*S KotlinDebug\n*F\n+ 1 MainBestLiveRankingHolder.kt\ncom/dcinside/app/main/adapter/MainBestLiveRankingHolder\n*L\n156#1:165\n156#1:166\n*E\n"})
public final class i extends e {
    public final class b {
        public static final int[] a;
        public static final int[] b;

        static {
            int[] arr_v = new int[q.values().length];
            try {
                arr_v[q.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[q.f.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[q.g.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
            int[] arr_v1 = new int[g.values().length];
            try {
                arr_v1[g.j.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[g.D.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[g.x.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[g.t.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.b = arr_v1;
        }
    }

    @l
    private final ImageView a;
    @l
    private final TailTextView b;
    @l
    private final TextView c;
    @l
    private final View d;
    @l
    private final TextView e;

    public i(@l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.main.adapter.MainBestLiveRankingHolder$1", f = "MainBestLiveRankingHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final i l;

            a(i i0, d d0) {
                this.l = i0;
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
        super(viewGroup0, 0x7F0E0205);  // layout:view_live_best_ranking_item
        View view0 = this.itemView.findViewById(0x7F0B0730);  // id:live_best_ranking_thumbnail
        L.o(view0, "findViewById(...)");
        this.a = (ImageView)view0;
        View view1 = this.itemView.findViewById(0x7F0B0731);  // id:live_best_ranking_title
        L.o(view1, "findViewById(...)");
        this.b = (TailTextView)view1;
        View view2 = this.itemView.findViewById(0x7F0B072E);  // id:live_best_ranking_gallery_name_date
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = this.itemView.findViewById(0x7F0B072D);  // id:live_best_ranking_fix_post
        L.o(view3, "findViewById(...)");
        this.d = view3;
        View view4 = this.itemView.findViewById(0x7F0B072F);  // id:live_best_ranking_rank
        L.o(view4, "findViewById(...)");
        this.e = (TextView)view4;
        L.o(this.itemView, "itemView");
        a i$a0 = new a(this, null);
        r.M(this.itemView, null, i$a0, 1, null);
    }

    public final void i(int v) {
        this.b.setTextColor(v);
    }

    private final void j(boolean z) {
        this.a.setAlpha((z ? 0.2f : 1.0f));
        this.b.setAlpha((z ? 0.2f : 1.0f));
        this.c.setAlpha((z ? 0.2f : 1.0f));
        this.d.setAlpha((z ? 0.2f : 1.0f));
        this.e.setAlpha((z ? 0.2f : 1.0f));
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

    public final void l(@m B b0, @l q q0, @m Integer integer0, boolean z) {
        int v2;
        int v;
        boolean z1 = true;
        L.p(q0, "sortType");
        if(b0 == null) {
            return;
        }
        Context context0 = this.itemView.getContext();
        String s = b0.k();
        if(TextUtils.isEmpty(s)) {
            com.dcinside.app.glide.a.l(this.a).r0(0x7F0803A3).V2(new h(new n[]{new com.bumptech.glide.load.resource.bitmap.n(), new com.bumptech.glide.load.resource.bitmap.L(0)})).q1(this.a);  // drawable:img_no_image
        }
        else {
            com.dcinside.app.glide.a.l(this.a).t0(s).V2(new h(new n[]{new com.bumptech.glide.load.resource.bitmap.n(), new com.bumptech.glide.load.resource.bitmap.L(0)})).e2(0x7F0803A3).q1(this.a);  // drawable:img_no_image
        }
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(Dl.t(Dl.M(Dl.C(b0.l()))));
        SpannableStringBuilder spannableStringBuilder1 = new SpannableStringBuilder();
        spannableStringBuilder1.append('…');
        L.m(context0);
        com.dcinside.app.span.g.a.c(context0, b0.c(), 0, new SpannableStringBuilder[]{spannableStringBuilder0, spannableStringBuilder1});
        com.dcinside.app.view.TailTextView.a tailTextView$a0 = new com.dcinside.app.view.TailTextView.a(spannableStringBuilder0, spannableStringBuilder1);
        this.b.setDisplayTexts(tailTextView$a0);
        switch(q0) {
            case 1: {
                v = b0.g();
                break;
            }
            case 2: {
                v = b0.j();
                break;
            }
            case 3: {
                v = b0.c();
                break;
            }
            default: {
                throw new J();
            }
        }
        String s1 = String.valueOf(v);
        boolean z2 = (integer0 == null ? 99 : ((int)integer0)) <= 3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if(q0 != q.g) {
            spannableStringBuilder2.append(context0.getString(q0.e()));
            spannableStringBuilder2.append(' ');
            spannableStringBuilder2.append(s1);
            int v1 = spannableStringBuilder2.length();
            if(z2) {
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context0, 0x7F06001A)), 0, v1, 33);  // color:accent1
            }
            if(z2) {
                v2 = ContextCompat.getColor(context0, 0x7F06001A);  // color:accent1
            }
            else {
                v2 = dl.a.q2().m() ? ContextCompat.getColor(context0, 0x7F060446) : vk.b(context0, 0x7F04012E);  // color:rank_dark_bg
            }
            int v3 = 36;
            if(z2) {
                switch(dl.a.q2()) {
                    case 1: 
                    case 2: {
                        v3 = 51;
                        break;
                    }
                    case 3: 
                    case 4: {
                        break;
                    }
                    default: {
                        v3 = 13;
                    }
                }
            }
            else {
                dl dl0 = dl.a;
                if(dl0.q2().m()) {
                    switch(dl0.q2()) {
                        case 1: 
                        case 2: {
                            break;
                        }
                        default: {
                            v3 = 26;
                        }
                    }
                }
                else {
                    v3 = dl0.q2().p() ? 26 : 13;
                }
            }
            spannableStringBuilder2.setSpan(new BackgroundColorSpan(Color.argb(v3, Color.red(v2), Color.green(v2), Color.blue(v2))), 0, v1, 33);
            spannableStringBuilder2.append(' ');
            spannableStringBuilder2.append('·');
            spannableStringBuilder2.append(' ');
        }
        spannableStringBuilder2.append(b0.f());
        spannableStringBuilder2.append(' ');
        spannableStringBuilder2.append('·');
        spannableStringBuilder2.append(' ');
        spannableStringBuilder2.append(b0.d());
        this.c.setText(spannableStringBuilder2);
        int v4 = b0.n() ? 0 : 8;
        this.d.setVisibility(v4);
        if(integer0 != null) {
            this.e.setActivated(z2);
            this.e.setText(String.valueOf(integer0.intValue()));
        }
        if(!z || !b0.a()) {
            z1 = false;
        }
        this.j(z1);
    }
}

