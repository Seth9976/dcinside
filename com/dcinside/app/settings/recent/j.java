package com.dcinside.app.settings.recent;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.util.Dl;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nRecentOrderHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentOrderHolder.kt\ncom/dcinside/app/settings/recent/RecentOrderHolder\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,44:1\n25#2:45\n*S KotlinDebug\n*F\n+ 1 RecentOrderHolder.kt\ncom/dcinside/app/settings/recent/RecentOrderHolder\n*L\n28#1:45\n*E\n"})
public final class j extends ViewHolder {
    @l
    private final ImageView a;
    @l
    private final TextView b;
    @l
    private final View c;

    public j(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0CAC);  // id:recent_setting_item_fix
        L.o(view1, "findViewById(...)");
        this.a = (ImageView)view1;
        View view2 = view0.findViewById(0x7F0B0CAE);  // id:recent_setting_item_text
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0CAD);  // id:recent_setting_item_move
        L.o(view3, "findViewById(...)");
        this.c = view3;
        view3.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
            L.p(this, "this$0");
            L.p(view0, "<anonymous parameter 0>");
            return this.n(motionEvent0);
        });
        ((ImageView)view1).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.m();
        });
    }

    // 检测为 Lambda 实现
    private static final boolean h(j j0, View view0, MotionEvent motionEvent0) [...]

    // 检测为 Lambda 实现
    private static final void i(j j0, View view0) [...]

    @l
    public final ImageView j() {
        return this.a;
    }

    @l
    public final View k() {
        return this.c;
    }

    @l
    public final TextView l() {
        return this.b;
    }

    private final void m() {
        Context context0 = this.itemView.getContext();
        ViewParent viewParent0 = this.itemView.getParent();
        Adapter recyclerView$Adapter0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 != null) {
            Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
            if(recyclerView$Adapter1 instanceof g) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            if(((g)recyclerView$Adapter0) != null) {
                int v = this.getBindingAdapterPosition();
                L.m(context0);
                ((g)recyclerView$Adapter0).w(context0, v);
            }
        }
    }

    private final boolean n(MotionEvent motionEvent0) {
        if(motionEvent0 == null || motionEvent0.getAction() != 0 || this.getBindingAdapterPosition() < 0) {
            return false;
        }
        Context context0 = Dl.b(this.itemView);
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.settings.recent.RecentGallerySettingActivity");
        ItemTouchHelper itemTouchHelper0 = ((RecentGallerySettingActivity)context0).Y1();
        if(itemTouchHelper0 != null) {
            itemTouchHelper0.H(this);
        }
        return true;
    }
}

