package com.dcinside.app.view.popupmenu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.util.Dk;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@SuppressLint({"RestrictedApi"})
public final class q extends a0 {
    public static abstract class a extends ViewHolder {
        public a(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
        }

        public abstract void e(@l com.dcinside.app.view.popupmenu.k.a arg1);
    }

    public static final class b extends a {
        public b(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
        }

        @Override  // com.dcinside.app.view.popupmenu.q$a
        public void e(@l com.dcinside.app.view.popupmenu.k.a k$a0) {
            L.p(k$a0, "popupMenuItem");
            Function1 function10 = ((com.dcinside.app.view.popupmenu.k.b)k$a0).h();
            L.o(this.itemView, "itemView");
            function10.invoke(this.itemView);
        }
    }

    @s0({"SMAP\nPopupMenuAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopupMenuAdapter.kt\ncom/dcinside/app/view/popupmenu/PopupMenuAdapter$ItemViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,201:1\n1#2:202\n327#3,4:203\n*S KotlinDebug\n*F\n+ 1 PopupMenuAdapter.kt\ncom/dcinside/app/view/popupmenu/PopupMenuAdapter$ItemViewHolder\n*L\n178#1:203,4\n*E\n"})
    public static final class c extends a {
        @l
        private TextView a;
        @l
        private AppCompatImageView b;
        @l
        private AppCompatImageView c;

        public c(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
            View view1 = view0.findViewById(0x7F0B089B);  // id:mpm_popup_menu_item_label
            L.o(view1, "findViewById(...)");
            this.a = (TextView)view1;
            View view2 = view0.findViewById(0x7F0B089A);  // id:mpm_popup_menu_item_icon
            L.o(view2, "findViewById(...)");
            this.b = (AppCompatImageView)view2;
            View view3 = view0.findViewById(0x7F0B089C);  // id:mpm_popup_menu_item_new_icon
            L.o(view3, "findViewById(...)");
            this.c = (AppCompatImageView)view3;
        }

        @Override  // com.dcinside.app.view.popupmenu.q$a
        public void e(@l com.dcinside.app.view.popupmenu.k.a k$a0) {
            L.p(k$a0, "popupMenuItem");
            this.a.setText(((com.dcinside.app.view.popupmenu.k.c)k$a0).p());
            if(((com.dcinside.app.view.popupmenu.k.c)k$a0).m() != 0 || ((com.dcinside.app.view.popupmenu.k.c)k$a0).o() != null) {
                switch(((com.dcinside.app.view.popupmenu.k.c)k$a0).m()) {
                    case 0x7F080236: {  // drawable:ic_browser_bold
                        c.h(this, 15, 0, 2, null);
                        break;
                    }
                    case 0x7F08024D: {  // drawable:ic_delete
                        c.h(this, 16, 0, 2, null);
                        break;
                    }
                    case 0x7F0802AB: {  // drawable:ic_menu_post_best_bold
                        c.h(this, 17, 0, 2, null);
                        break;
                    }
                    case 0x7F0802AC: {  // drawable:ic_menu_post_report_bold
                        c.h(this, 16, 0, 2, null);
                        break;
                    }
                    case 0x7F0802AD: {  // drawable:ic_menu_post_save_bold
                        c.h(this, 16, 0, 2, null);
                        break;
                    }
                    case 0x7F0802B6: {  // drawable:ic_modify
                        this.f(16, 0);
                        break;
                    }
                    case 0x7F080251:   // drawable:ic_expand_picker
                    case 0x7F0802D6:   // drawable:ic_remove_item
                    case 0x7F0802EE:   // drawable:ic_split_0
                    case 0x7F0802EF: {  // drawable:ic_split_1
                        c.h(this, ((int)(((double)(this.a.getTextSize() / this.itemView.getContext().getResources().getDisplayMetrics().density)) * 1.1)), 0, 2, null);
                        break;
                    }
                    default: {
                        c.h(this, 16, 0, 2, null);
                    }
                }
                AppCompatImageView appCompatImageView0 = this.b;
                appCompatImageView0.setVisibility(0);
                appCompatImageView0.setImageResource(((com.dcinside.app.view.popupmenu.k.c)k$a0).m());
                Drawable drawable0 = ((com.dcinside.app.view.popupmenu.k.c)k$a0).o();
                if(drawable0 != null) {
                    appCompatImageView0.setImageDrawable(drawable0);
                }
                if(((com.dcinside.app.view.popupmenu.k.c)k$a0).n() != 0) {
                    appCompatImageView0.setSupportImageTintList(ColorStateList.valueOf(((com.dcinside.app.view.popupmenu.k.c)k$a0).n()));
                }
            }
            else {
                this.b.setVisibility(8);
            }
            if(((com.dcinside.app.view.popupmenu.k.c)k$a0).s() == 0) {
                this.c.setVisibility(8);
            }
            else {
                AppCompatImageView appCompatImageView1 = this.c;
                appCompatImageView1.setVisibility(0);
                appCompatImageView1.setImageResource(((com.dcinside.app.view.popupmenu.k.c)k$a0).s());
            }
            if(((com.dcinside.app.view.popupmenu.k.c)k$a0).q() != 0) {
                this.a.setTextColor(((com.dcinside.app.view.popupmenu.k.c)k$a0).q());
            }
        }

        private final void f(int v, int v1) {
            int v2 = Dk.d(v);
            AppCompatImageView appCompatImageView0 = this.b;
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = appCompatImageView0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = this.b.getLayoutParams();
            viewGroup$LayoutParams1.width = v2;
            viewGroup$LayoutParams1.height = v2;
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMarginStart(v1);
            appCompatImageView0.setLayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
        }

        static void h(c q$c0, int v, int v1, int v2, Object object0) {
            if((v2 & 2) != 0) {
                v1 = 0;
            }
            q$c0.f(v, v1);
        }
    }

    public static final class d extends ViewHolder {
        @l
        private TextView a;
        @l
        private View b;

        public d(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
            View view1 = view0.findViewById(0x7F0B089E);  // id:mpm_popup_menu_section_header_label
            L.o(view1, "findViewById(...)");
            this.a = (TextView)view1;
            View view2 = view0.findViewById(0x7F0B089F);  // id:mpm_popup_menu_section_separator
            L.o(view2, "findViewById(...)");
            this.b = view2;
        }

        @l
        public final TextView e() {
            return this.a;
        }

        @l
        public final View f() {
            return this.b;
        }

        public final void h(@l TextView textView0) {
            L.p(textView0, "<set-?>");
            this.a = textView0;
        }

        public final void i(@l View view0) {
            L.p(view0, "<set-?>");
            this.b = view0;
        }
    }

    @l
    private final List h;
    @l
    private final Function1 i;
    @l
    private final ContextThemeWrapper j;

    public q(@l Context context0, @l List list0, @l Function1 function10) {
        L.p(context0, "context");
        L.p(list0, "sections");
        L.p(function10, "onItemClickedCallback");
        super();
        this.h = list0;
        this.i = function10;
        this.setHasStableIds(true);
        this.j = new ContextThemeWrapper(context0, context0.getTheme());
    }

    @Override  // com.dcinside.app.view.popupmenu.a0
    protected int A(int v, int v1) {
        com.dcinside.app.view.popupmenu.k.a k$a0 = (com.dcinside.app.view.popupmenu.k.a)((com.dcinside.app.view.popupmenu.k.d)this.h.get(v)).e().get(v1);
        return k$a0 instanceof com.dcinside.app.view.popupmenu.k.b ? ((com.dcinside.app.view.popupmenu.k.b)k$a0).g() : super.A(v, v1);
    }

    @Override  // com.dcinside.app.view.popupmenu.a0
    public void D(ViewHolder recyclerView$ViewHolder0, int v, int v1) {
        this.O(((a)recyclerView$ViewHolder0), v, v1);
    }

    @Override  // com.dcinside.app.view.popupmenu.a0
    public void E(ViewHolder recyclerView$ViewHolder0, int v) {
        this.Q(((d)recyclerView$ViewHolder0), v);
    }

    @Override  // com.dcinside.app.view.popupmenu.a0
    public ViewHolder F(ViewGroup viewGroup0, int v) {
        return this.R(viewGroup0, v);
    }

    @Override  // com.dcinside.app.view.popupmenu.a0
    public ViewHolder G(ViewGroup viewGroup0, int v) {
        return this.S(viewGroup0, v);
    }

    private final o L() {
        com.dcinside.app.view.popupmenu.k.a k$a0;
        com.dcinside.app.view.popupmenu.k.d k$d0 = (com.dcinside.app.view.popupmenu.k.d)u.G2(this.h);
        com.dcinside.app.view.popupmenu.k.c k$c0 = null;
        if(k$d0 == null) {
            k$a0 = null;
        }
        else {
            List list0 = k$d0.e();
            k$a0 = list0 == null ? null : ((com.dcinside.app.view.popupmenu.k.a)u.G2(list0));
        }
        if(k$a0 instanceof com.dcinside.app.view.popupmenu.k.c) {
            k$c0 = (com.dcinside.app.view.popupmenu.k.c)k$a0;
        }
        if(k$c0 != null) {
            o o0 = k$c0.r();
            return o0 == null ? o.a : o0;
        }
        return o.a;
    }

    private final boolean N(com.dcinside.app.view.popupmenu.k.a k$a0) {
        com.dcinside.app.view.popupmenu.k.c k$c0 = k$a0 instanceof com.dcinside.app.view.popupmenu.k.c ? ((com.dcinside.app.view.popupmenu.k.c)k$a0) : null;
        return k$c0 == null ? true : k$c0.t();
    }

    protected void O(@l a q$a0, int v, int v1) {
        L.p(q$a0, "holder");
        com.dcinside.app.view.popupmenu.k.a k$a0 = (com.dcinside.app.view.popupmenu.k.a)((com.dcinside.app.view.popupmenu.k.d)this.h.get(v)).e().get(v1);
        q$a0.e(k$a0);
        p p0 = (View view0) -> {
            L.p(k$a0, "$popupMenuItem");
            L.p(this, "this$0");
            Function1 function10 = k$a0.a();
            Context context0 = view0 == null ? null : view0.getContext();
            L.m(context0);
            function10.invoke(context0);
            if(this.N(k$a0)) {
                this.i.invoke(k$a0);
            }
        };
        q$a0.itemView.setOnClickListener(p0);
    }

    // 检测为 Lambda 实现
    private static final void P(com.dcinside.app.view.popupmenu.k.a k$a0, q q0, View view0) [...]

    protected void Q(@l d q$d0, int v) {
        L.p(q$d0, "holder");
        String s = ((com.dcinside.app.view.popupmenu.k.d)this.h.get(v)).f();
        int v1 = 8;
        if(s == null) {
            q$d0.e().setVisibility(8);
        }
        else {
            q$d0.e().setVisibility(0);
            q$d0.e().setText(s);
        }
        View view0 = q$d0.f();
        if(v != 0) {
            v1 = 0;
        }
        view0.setVisibility(v1);
    }

    @l
    protected a R(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        if(v == -2) {
            int v1 = this.L() == o.a ? 0x7F0E0144 : 0x7F0E0145;  // layout:mpm_popup_menu_item
            View view0 = LayoutInflater.from(this.j).inflate(v1, viewGroup0, false);
            L.m(view0);
            return new c(view0);
        }
        View view1 = LayoutInflater.from(this.j).inflate(v, viewGroup0, false);
        L.m(view1);
        return new b(view1);
    }

    @l
    protected d S(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(this.j).inflate(0x7F0E0146, viewGroup0, false);  // layout:mpm_popup_menu_section_header
        L.m(view0);
        return new d(view0);
    }

    @Override  // com.dcinside.app.view.popupmenu.a0
    protected int x(int v) {
        return ((com.dcinside.app.view.popupmenu.k.d)this.h.get(v)).e().size();
    }

    @Override  // com.dcinside.app.view.popupmenu.a0
    protected int y() {
        return this.h.size();
    }
}

