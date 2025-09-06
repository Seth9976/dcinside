package com.dcinside.app.dccon.setting.list;

import A3.p;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.e;
import com.dcinside.app.internal.r;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.m;
import z3.f;

@s0({"SMAP\nDcconListSettingHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconListSettingHolder.kt\ncom/dcinside/app/dccon/setting/list/DcconListSettingHolder\n+ 2 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,55:1\n20#2:56\n25#3:57\n*S KotlinDebug\n*F\n+ 1 DcconListSettingHolder.kt\ncom/dcinside/app/dccon/setting/list/DcconListSettingHolder\n*L\n44#1:56\n44#1:57\n*E\n"})
public final class l extends e {
    @y4.l
    @f
    public CheckBox a;
    @y4.l
    @f
    public SimpleDraweeView b;
    @y4.l
    @f
    public TextView c;
    @y4.l
    @f
    public View d;

    public l(@y4.l ViewGroup viewGroup0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.dccon.setting.list.DcconListSettingHolder$1", f = "DcconListSettingHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final l l;

            a(l l0, d d0) {
                this.l = l0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.k();
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E01BC);  // layout:view_dccon_list_setting_item
        View view0 = this.itemView.findViewById(0x7F0B0348);  // id:dccon_list_setting_item_check
        L.o(view0, "findViewById(...)");
        this.a = (CheckBox)view0;
        View view1 = this.itemView.findViewById(0x7F0B0349);  // id:dccon_list_setting_item_icon
        L.o(view1, "findViewById(...)");
        this.b = (SimpleDraweeView)view1;
        View view2 = this.itemView.findViewById(0x7F0B034B);  // id:dccon_list_setting_item_text
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = this.itemView.findViewById(0x7F0B034A);  // id:dccon_list_setting_item_move
        L.o(view3, "findViewById(...)");
        this.d = view3;
        L.o(this.itemView, "itemView");
        a l$a0 = new a(this, null);
        r.M(this.itemView, null, l$a0, 1, null);
        this.d.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
            L.p(this, "this$0");
            L.p(view0, "<anonymous parameter 0>");
            return this.l(motionEvent0);
        });
    }

    // 检测为 Lambda 实现
    private static final boolean i(l l0, View view0, MotionEvent motionEvent0) [...]

    private final void k() {
        int v = this.getAdapterPosition();
        if(v < 0) {
            return;
        }
        ViewParent viewParent0 = this.itemView.getParent();
        i i0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(recyclerView$Adapter0 instanceof i) {
            i0 = (i)recyclerView$Adapter0;
        }
        if(i0 == null) {
            return;
        }
        boolean z = this.a.isChecked();
        boolean z1 = i0.B(v, !z);
        this.a.setChecked(z1 && !z);
    }

    private final boolean l(MotionEvent motionEvent0) {
        if(motionEvent0 == null) {
            return false;
        }
        if(motionEvent0.getAction() != 0 || this.getAdapterPosition() < 0) {
            return false;
        }
        RecyclerView recyclerView0 = this.e();
        Adapter recyclerView$Adapter0 = null;
        if(recyclerView0 != null) {
            Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
            if(recyclerView$Adapter1 instanceof i) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            recyclerView$Adapter0 = (i)recyclerView$Adapter0;
        }
        if(recyclerView$Adapter0 == null) {
            return false;
        }
        ((i)recyclerView$Adapter0).x().H(this);
        return true;
    }
}

