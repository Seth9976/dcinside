package com.dcinside.app.head;

import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nHeadHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeadHolder.kt\ncom/dcinside/app/head/HeadHolder\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n25#2:27\n1#3:28\n*S KotlinDebug\n*F\n+ 1 HeadHolder.kt\ncom/dcinside/app/head/HeadHolder\n*L\n21#1:27\n*E\n"})
public final class c extends ViewHolder {
    @l
    private final View a;
    @l
    private final TextView b;
    @l
    private final ImageView c;

    public c(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0B72);  // id:post_write_head_item_bg
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B0B73);  // id:post_write_head_item_text
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0BE1);  // id:post_write_shield_head
        L.o(view3, "findViewById(...)");
        this.c = (ImageView)view3;
        view0.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.k();
        });
    }

    // 检测为 Lambda 实现
    private static final void f(c c0, View view0) [...]

    @l
    public final View h() {
        return this.a;
    }

    @l
    public final ImageView i() {
        return this.c;
    }

    @l
    public final TextView j() {
        return this.b;
    }

    private final void k() {
        a a0;
        ViewParent viewParent0 = this.itemView.getParent();
        Integer integer0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            a0 = null;
        }
        else {
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(!(recyclerView$Adapter0 instanceof a)) {
                recyclerView$Adapter0 = null;
            }
            a0 = (a)recyclerView$Adapter0;
        }
        if(a0 != null) {
            Integer integer1 = this.getBindingAdapterPosition();
            if(integer1.intValue() >= 0) {
                integer0 = integer1;
            }
            if(integer0 != null) {
                a0.D(((int)integer0));
            }
        }
    }
}

