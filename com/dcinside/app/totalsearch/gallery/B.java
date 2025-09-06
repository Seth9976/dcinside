package com.dcinside.app.totalsearch.gallery;

import A3.p;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.vk;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nTotalGalleryContentHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalGalleryContentHolder.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryContentHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,198:1\n176#2,2:199\n257#2,2:201\n176#2,2:203\n25#3:205\n*S KotlinDebug\n*F\n+ 1 TotalGalleryContentHolder.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryContentHolder\n*L\n156#1:199,2\n168#1:201,2\n171#1:203,2\n183#1:205\n*E\n"})
public final class b extends com.codewaves.stickyheadergrid.a.b {
    @l
    private View a;
    @l
    private ImageView b;
    @l
    private ImageView c;
    @l
    private ImageView d;
    @l
    private TextView e;
    @l
    private TextView f;
    @l
    private TextView g;
    @l
    private ImageView h;
    @l
    private ImageView i;

    public b(@l View view0, boolean z) {
        @f(c = "com.dcinside.app.totalsearch.gallery.TotalGalleryContentHolder$1", f = "TotalGalleryContentHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final b l;

            a(b b0, d d0) {
                this.l = b0;
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

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0FB1);  // id:total_search_gallery_item_block
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B0FB4);  // id:total_search_gallery_item_minor_icon
        L.o(view2, "findViewById(...)");
        this.b = (ImageView)view2;
        View view3 = view0.findViewById(0x7F0B0FB3);  // id:total_search_gallery_item_mini_icon
        L.o(view3, "findViewById(...)");
        this.c = (ImageView)view3;
        View view4 = view0.findViewById(0x7F0B0FB2);  // id:total_search_gallery_item_certified_icon
        L.o(view4, "findViewById(...)");
        this.d = (ImageView)view4;
        View view5 = view0.findViewById(0x7F0B0FB7);  // id:total_search_gallery_item_text
        L.o(view5, "findViewById(...)");
        this.e = (TextView)view5;
        View view6 = view0.findViewById(0x7F0B0FB5);  // id:total_search_gallery_item_profile
        L.o(view6, "findViewById(...)");
        this.f = (TextView)view6;
        View view7 = view0.findViewById(0x7F0B0FB6);  // id:total_search_gallery_item_status
        L.o(view7, "findViewById(...)");
        this.g = (TextView)view7;
        View view8 = view0.findViewById(0x7F0B0FB9);  // id:total_search_gallery_profile_img
        L.o(view8, "findViewById(...)");
        this.h = (ImageView)view8;
        View view9 = view0.findViewById(0x7F0B0FB8);  // id:total_search_gallery_profile_error_img
        L.o(view9, "findViewById(...)");
        this.i = (ImageView)view9;
        if(!z) {
            r.M(view0, null, new a(this, null), 1, null);
        }
    }

    public b(View view0, boolean z, int v, w w0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(view0, z);
    }

    public final void i(@l com.dcinside.app.totalsearch.a.f a$f0, @m String s, boolean z, boolean z1) {
        SpannableStringBuilder spannableStringBuilder2;
        SpannableStringBuilder spannableStringBuilder1;
        L.p(a$f0, "data");
        Dl.z(this.e, a$f0.p(), s);
        Context context0 = this.itemView.getContext();
        int v = a$f0.m();
        int v1 = a$f0.g();
        int v2 = a$f0.h();
        int v3 = a$f0.q();
        com.dcinside.app.type.m m0 = com.dcinside.app.type.m.j;
        if(L.g(a$f0.e(), "P")) {
            this.f.setVisibility(8);
            if(z1) {
                this.h.setVisibility(8);
                this.i.setVisibility(8);
            }
            else {
                this.h.setVisibility(8);
                this.i.setVisibility(0);
            }
        }
        else {
            this.f.setVisibility(8);
            this.h.setVisibility(8);
            this.i.setVisibility(8);
        }
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
        if(v > 0) {
            spannableStringBuilder0.append(context0.getString(0x7F150A6E, new Object[]{v}));  // string:total_search_gallery_rank "%d위"
        }
        if(v1 > 0) {
            if(spannableStringBuilder0.length() > 0) {
                spannableStringBuilder0.append(' ');
                spannableStringBuilder0.append(' ');
                L.m(context0);
                spannableStringBuilder1 = spannableStringBuilder0;
                com.dcinside.app.internal.l.a(spannableStringBuilder1, "**", new com.dcinside.app.span.b(context0, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
                spannableStringBuilder1.append(' ');
                spannableStringBuilder1.append(' ');
            }
            else {
                spannableStringBuilder1 = spannableStringBuilder0;
            }
            spannableStringBuilder1.append(context0.getString(0x7F150A6C, new Object[]{Dl.a.format(v1)}));  // string:total_search_gallery_member_count "멤버 %s"
        }
        else {
            spannableStringBuilder1 = spannableStringBuilder0;
        }
        if(z) {
            spannableStringBuilder2 = spannableStringBuilder1;
        }
        else {
            if(spannableStringBuilder1.length() > 0) {
                spannableStringBuilder1.append(' ');
                spannableStringBuilder1.append(' ');
                L.m(context0);
                spannableStringBuilder2 = spannableStringBuilder1;
                com.dcinside.app.internal.l.a(spannableStringBuilder2, "**", new com.dcinside.app.span.b(context0, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
                spannableStringBuilder2.append(' ');
                spannableStringBuilder2.append(' ');
            }
            else {
                spannableStringBuilder2 = spannableStringBuilder1;
            }
            spannableStringBuilder2.append(context0.getString(0x7F150A6D, new Object[]{Dl.a.format(v2), Dl.a.format(v3)}));  // string:total_search_gallery_post_status "새글 %1$s/%2$s"
        }
        this.g.setText(spannableStringBuilder2);
        if(L.g("N", a$f0.n())) {
            this.e.setEnabled(false);
            this.a.setVisibility(0);
            this.g.setVisibility(8);
            L.m(context0);
            int v4 = vk.b(context0, 0x7F04032A);  // attr:icTintNormal
            this.e.setTextColor(v4);
            this.c.setColorFilter(v4);
            this.d.setColorFilter(v4);
            this.b.setColorFilter(v4, PorterDuff.Mode.MULTIPLY);
        }
        else {
            this.e.setEnabled(true);
            this.d.clearColorFilter();
            this.a.setVisibility(8);
            this.g.setVisibility(0);
            if(dl.a.q2().m()) {
                L.m(context0);
                int v5 = vk.b(context0, 0x7F0406B5);  // attr:totalSearchTitleColor
                this.e.setTextColor(v5);
                this.c.setColorFilter(v5);
                this.b.setColorFilter(v5, PorterDuff.Mode.MULTIPLY);
            }
            else {
                TextView textView0 = this.e;
                L.m(context0);
                textView0.setTextColor(vk.b(context0, 0x7F0406B5));  // attr:totalSearchTitleColor
                this.c.setColorFilter(ContextCompat.getColor(context0, 0x7F060127));  // color:gray
                this.b.setColorFilter(ContextCompat.getColor(context0, 0x7F060127), PorterDuff.Mode.MULTIPLY);  // color:gray
            }
        }
        String s1 = a$f0.e();
        if(L.g(s1, "G")) {
            this.c.setVisibility(8);
            this.b.setVisibility(8);
            this.d.setVisibility(8);
            return;
        }
        if(L.g(s1, "M")) {
            this.c.setVisibility(8);
            this.b.setVisibility(0);
            this.d.setVisibility(8);
            return;
        }
        if(L.g(s1, "N")) {
            this.c.setImageResource(0x7F080415);  // drawable:mini_gall_ic
            this.c.setPadding(0, 0, 0, 0);
            this.c.setVisibility(0);
            this.b.setVisibility(8);
            this.d.setVisibility(8);
            return;
        }
        if(L.g(s1, m0.h())) {
            this.c.setImageResource(0x7F0804A8);  // drawable:person_gall_ic
            int v6 = Dk.b(0x7F0703C5);  // dimen:person_icon_left_padding
            int v7 = Dk.b(0x7F0703C6);  // dimen:person_icon_padding
            this.c.setPadding(v6, v7, v7, v7);
            this.c.setVisibility(0);
            this.b.setVisibility(8);
            this.d.setVisibility((L.g("", "1") ? 0 : 8));
            return;
        }
        this.c.setPadding(0, 0, 0, 0);
        this.c.setVisibility(8);
        this.b.setVisibility(8);
        this.d.setVisibility(8);
    }

    public static void j(b b0, com.dcinside.app.totalsearch.a.f a$f0, String s, boolean z, boolean z1, int v, Object object0) {
        if((v & 8) != 0) {
            z1 = false;
        }
        b0.i(a$f0, s, z, z1);
    }

    private final void k() {
        try {
            ViewParent viewParent0 = this.itemView.getParent();
            Adapter recyclerView$Adapter0 = null;
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Context context0 = Dl.b(recyclerView0);
            AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
            if(appCompatActivity0 == null) {
                return;
            }
            Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
            if(recyclerView$Adapter1 instanceof com.dcinside.app.totalsearch.gallery.a) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            if(((com.dcinside.app.totalsearch.gallery.a)recyclerView$Adapter0) == null) {
                return;
            }
            int v = this.getBindingAdapterPosition();
            int v1 = ((com.dcinside.app.totalsearch.gallery.a)recyclerView$Adapter0).z(v);
            int v2 = ((com.dcinside.app.totalsearch.gallery.a)recyclerView$Adapter0).B(v1, v);
            List list0 = ((com.dcinside.app.totalsearch.gallery.a)recyclerView$Adapter0).g0();
            if(list0 == null) {
                return;
            }
            List list1 = ((y)list0.get(v1)).a();
            if(list1 != null) {
                com.dcinside.app.totalsearch.a.f a$f0 = (com.dcinside.app.totalsearch.a.f)list1.get(v2);
                if(a$f0 != null) {
                    String s = a$f0.f();
                    if(s == null) {
                        return;
                    }
                    new com.dcinside.app.util.Xk.a(s, 0, 0, null, true, false, false, false, false, false, null, false, null, null, 0x3FEE, null).a(appCompatActivity0);
                    return;
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
        timber.log.b.a.y(exception0);
        Dl.G(this.itemView.getContext(), exception0.getMessage());
    }
}

