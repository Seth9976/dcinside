package com.dcinside.app.totalsearch.gallery;

import A3.p;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.codewaves.stickyheadergrid.a.b;
import com.dcinside.app.internal.r;
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
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nTotalGalleryPersonHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalGalleryPersonHolder.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryPersonHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,148:1\n257#2,2:149\n257#2,2:151\n25#3:153\n*S KotlinDebug\n*F\n+ 1 TotalGalleryPersonHolder.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryPersonHolder\n*L\n125#1:149,2\n126#1:151,2\n134#1:153\n*E\n"})
public final class v extends b {
    @l
    private View a;
    @l
    private View b;
    @l
    private ImageView c;
    @l
    private ImageView d;
    @l
    private ImageView e;
    @l
    private ImageView f;
    @l
    private TextView g;
    @l
    private TextView h;
    @l
    private TextView i;

    public v(@l View view0) {
        @f(c = "com.dcinside.app.totalsearch.gallery.TotalGalleryPersonHolder$1", f = "TotalGalleryPersonHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final v l;

            a(v v0, d d0) {
                this.l = v0;
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
        View view1 = view0.findViewById(0x7F0B0FC1);  // id:total_search_person_header
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B0FC3);  // id:total_search_person_item_block
        L.o(view2, "findViewById(...)");
        this.b = view2;
        View view3 = view0.findViewById(0x7F0B0FC6);  // id:total_search_person_item_profile_img
        L.o(view3, "findViewById(...)");
        this.c = (ImageView)view3;
        View view4 = view0.findViewById(0x7F0B0FC5);  // id:total_search_person_item_profile_error_img
        L.o(view4, "findViewById(...)");
        this.d = (ImageView)view4;
        View view5 = view0.findViewById(0x7F0B0FC2);  // id:total_search_person_icon
        L.o(view5, "findViewById(...)");
        this.e = (ImageView)view5;
        View view6 = view0.findViewById(0x7F0B0FC4);  // id:total_search_person_item_certified_icon
        L.o(view6, "findViewById(...)");
        this.f = (ImageView)view6;
        View view7 = view0.findViewById(0x7F0B0FC7);  // id:total_search_person_name
        L.o(view7, "findViewById(...)");
        this.g = (TextView)view7;
        View view8 = view0.findViewById(0x7F0B0FC8);  // id:total_search_person_profile
        L.o(view8, "findViewById(...)");
        this.h = (TextView)view8;
        View view9 = view0.findViewById(0x7F0B0FC9);  // id:total_search_person_status
        L.o(view9, "findViewById(...)");
        this.i = (TextView)view9;
        r.M(view0, null, new a(this, null), 1, null);
        view0.setTag(0x7F0B0F51, Boolean.TRUE);  // id:sticky_header_view
    }

    public final void i(@l com.dcinside.app.totalsearch.a.f a$f0, @m String s, boolean z, boolean z1) {
        SpannableStringBuilder spannableStringBuilder2;
        SpannableStringBuilder spannableStringBuilder1;
        L.p(a$f0, "data");
        Dl.z(this.g, a$f0.p(), s);
        Context context0 = this.itemView.getContext();
        int v = a$f0.m();
        int v1 = a$f0.g();
        int v2 = a$f0.h();
        int v3 = a$f0.q();
        if(!L.g(a$f0.e(), "P") || true) {
            this.h.setVisibility(8);
        }
        else {
            this.h.setVisibility(0);
            this.h.setText("");
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
        this.i.setText(spannableStringBuilder2);
        if(L.g("N", a$f0.n())) {
            this.g.setEnabled(false);
            this.b.setVisibility(0);
            this.i.setVisibility(8);
            L.m(context0);
            int v4 = vk.b(context0, 0x7F04032A);  // attr:icTintNormal
            this.g.setTextColor(vk.b(context0, 0x7F04032A));  // attr:icTintNormal
            this.f.setColorFilter(v4);
            this.e.setColorFilter(v4);
        }
        else {
            this.g.setEnabled(true);
            this.b.setVisibility(8);
            this.f.clearColorFilter();
            this.i.setVisibility(0);
            if(dl.a.q2().m()) {
                L.m(context0);
                int v5 = vk.b(context0, 0x7F0406B5);  // attr:totalSearchTitleColor
                this.g.setTextColor(v5);
                this.e.setColorFilter(v5);
            }
            else {
                TextView textView0 = this.g;
                L.m(context0);
                textView0.setTextColor(vk.b(context0, 0x7F0406B5));  // attr:totalSearchTitleColor
                this.e.setColorFilter(ContextCompat.getColor(context0, 0x7F060127));  // color:gray
            }
        }
        this.c.setVisibility(4);
        this.d.setVisibility(0);
        this.f.setVisibility((L.g("", "1") ? 0 : 8));
        this.a.setVisibility((z1 ? 0 : 8));
    }

    public static void j(v v0, com.dcinside.app.totalsearch.a.f a$f0, String s, boolean z, boolean z1, int v1, Object object0) {
        if((v1 & 8) != 0) {
            z1 = false;
        }
        v0.i(a$f0, s, z, z1);
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

