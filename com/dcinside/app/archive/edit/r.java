package com.dcinside.app.archive.edit;

import android.view.View;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nArchiveEditHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveEditHolder.kt\ncom/dcinside/app/archive/edit/ArchiveEditHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class r extends ViewHolder {
    @l
    private final TextView a;
    @l
    private final CheckBox b;
    @l
    private final TextView c;
    @l
    private final TextView d;

    public r(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0133);  // id:archive_edit_item_folder
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0132);  // id:archive_edit_item_check
        L.o(view2, "findViewById(...)");
        this.b = (CheckBox)view2;
        View view3 = view0.findViewById(0x7F0B0134);  // id:archive_edit_item_subject
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B0135);  // id:archive_edit_item_summary
        L.o(view4, "findViewById(...)");
        this.d = (TextView)view4;
        ((CheckBox)view2).setOnCheckedChangeListener((CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            this.n(z);
        });
        view0.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            boolean z = this.b.isChecked();
            this.b.setChecked(!z);
        });
    }

    // 检测为 Lambda 实现
    private static final void h(r r0, View view0) [...]

    @l
    public final CheckBox i() {
        return this.b;
    }

    @l
    public final TextView j() {
        return this.a;
    }

    @l
    public final TextView k() {
        return this.c;
    }

    @l
    public final TextView l() {
        return this.d;
    }

    // 检测为 Lambda 实现
    private static final void m(r r0, CompoundButton compoundButton0, boolean z) [...]

    private final void n(boolean z) {
        try {
            if(this.getAdapterPosition() >= 0) {
                ViewParent viewParent0 = this.itemView.getParent();
                L.n(viewParent0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                Adapter recyclerView$Adapter0 = ((RecyclerView)viewParent0).getAdapter();
                L.n(recyclerView$Adapter0, "null cannot be cast to non-null type com.dcinside.app.archive.edit.ArchiveEditAdapter");
                ((o)recyclerView$Adapter0).z(this.getAdapterPosition(), z);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

