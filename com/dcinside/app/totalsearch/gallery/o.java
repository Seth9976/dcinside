package com.dcinside.app.totalsearch.gallery;

import A3.p;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.codewaves.stickyheadergrid.a.a;
import com.dcinside.app.internal.r;
import com.dcinside.app.totalsearch.TotalSearchActivity;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class o extends a {
    @l
    private final TextView a;
    @l
    private final TextView b;
    @l
    private final View c;

    public o(@l View view0) {
        @f(c = "com.dcinside.app.totalsearch.gallery.TotalGalleryHeaderHolder$1", f = "TotalGalleryHeaderHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.totalsearch.gallery.o.a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final o l;

            com.dcinside.app.totalsearch.gallery.o.a(o o0, d d0) {
                this.l = o0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.totalsearch.gallery.o.a(this.l, d0).invokeSuspend(S0.a);
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

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0FA2);  // id:total_gallery_section_name
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0F9D);  // id:total_gallery_section_count
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0F9F);  // id:total_gallery_section_more
        L.o(view3, "findViewById(...)");
        this.c = view3;
        r.M(view3, null, new com.dcinside.app.totalsearch.gallery.o.a(this, null), 1, null);
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
        Context context0 = this.itemView.getContext();
        TotalSearchActivity totalSearchActivity0 = context0 instanceof TotalSearchActivity ? ((TotalSearchActivity)context0) : null;
        if(totalSearchActivity0 == null) {
            return;
        }
        totalSearchActivity0.F2();
    }
}

