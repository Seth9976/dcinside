package com.dcinside.app.write.menu.video;

import A3.p;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Nk;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nThumbnailImageHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbnailImageHolder.kt\ncom/dcinside/app/write/menu/video/ThumbnailImageHolder\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,38:1\n25#2:39\n25#2:40\n*S KotlinDebug\n*F\n+ 1 ThumbnailImageHolder.kt\ncom/dcinside/app/write/menu/video/ThumbnailImageHolder\n*L\n24#1:39\n35#1:40\n*E\n"})
public final class d extends ViewHolder {
    @l
    private final ImageView a;
    @l
    private final View b;
    @l
    private final View c;

    public d(@l View view0) {
        @f(c = "com.dcinside.app.write.menu.video.ThumbnailImageHolder$1", f = "ThumbnailImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final d l;

            a(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
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


        @f(c = "com.dcinside.app.write.menu.video.ThumbnailImageHolder$2", f = "ThumbnailImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final d l;

            b(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
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
        View view1 = view0.findViewById(0x7F0B0F8A);  // id:thumbnail_item_image
        L.o(view1, "findViewById(...)");
        this.a = (ImageView)view1;
        View view2 = view0.findViewById(0x7F0B0F8B);  // id:thumbnail_item_image_show
        L.o(view2, "findViewById(...)");
        this.b = view2;
        View view3 = view0.findViewById(0x7F0B0F8C);  // id:thumbnail_item_selected_border
        L.o(view3, "findViewById(...)");
        this.c = view3;
        r.M(view2, null, new a(this, null), 1, null);
        r.M(view0, null, new b(this, null), 1, null);
    }

    @l
    public final ImageView h() {
        return this.a;
    }

    @l
    public final View i() {
        return this.c;
    }

    private final void j() {
        ViewParent viewParent0 = this.itemView.getParent();
        Adapter recyclerView$Adapter0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
        if(recyclerView$Adapter1 instanceof c) {
            recyclerView$Adapter0 = recyclerView$Adapter1;
        }
        if(((c)recyclerView$Adapter0) == null) {
            return;
        }
        int v = this.getBindingAdapterPosition();
        Context context0 = recyclerView0.getContext();
        L.o(context0, "getContext(...)");
        ((c)recyclerView$Adapter0).y(v, context0);
    }

    private final void k() {
        ViewParent viewParent0 = this.itemView.getParent();
        AppCompatActivity appCompatActivity0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(!(recyclerView$Adapter0 instanceof c)) {
            recyclerView$Adapter0 = null;
        }
        if(((c)recyclerView$Adapter0) == null) {
            return;
        }
        ((c)recyclerView$Adapter0).z(this.getBindingAdapterPosition());
        Context context0 = recyclerView0.getContext();
        if(context0 instanceof AppCompatActivity) {
            appCompatActivity0 = (AppCompatActivity)context0;
        }
        if(appCompatActivity0 != null) {
            View view0 = appCompatActivity0.getCurrentFocus();
            if(view0 != null) {
                view0.clearFocus();
                Nk.a.c(view0);
            }
        }
    }
}

