package com.dcinside.app.gallery.search;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

public final class x extends ViewHolder {
    @l
    private final ArrayList a;
    @l
    private final ArrayList b;

    public x(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        TextView[] arr_textView = new TextView[10];
        View view1 = view0.findViewById(0x7F0B077C);  // id:major_hot_index1_rank
        L.o(view1, "findViewById(...)");
        arr_textView[0] = view1;
        View view2 = view0.findViewById(0x7F0B077F);  // id:major_hot_index2_rank
        L.o(view2, "findViewById(...)");
        arr_textView[1] = view2;
        View view3 = view0.findViewById(0x7F0B0782);  // id:major_hot_index3_rank
        L.o(view3, "findViewById(...)");
        arr_textView[2] = view3;
        View view4 = view0.findViewById(0x7F0B0785);  // id:major_hot_index4_rank
        L.o(view4, "findViewById(...)");
        arr_textView[3] = view4;
        View view5 = view0.findViewById(0x7F0B0788);  // id:major_hot_index5_rank
        L.o(view5, "findViewById(...)");
        arr_textView[4] = view5;
        View view6 = view0.findViewById(0x7F0B078B);  // id:major_hot_index6_rank
        L.o(view6, "findViewById(...)");
        arr_textView[5] = view6;
        View view7 = view0.findViewById(0x7F0B078E);  // id:major_hot_index7_rank
        L.o(view7, "findViewById(...)");
        arr_textView[6] = view7;
        View view8 = view0.findViewById(0x7F0B0791);  // id:major_hot_index8_rank
        L.o(view8, "findViewById(...)");
        arr_textView[7] = view8;
        View view9 = view0.findViewById(0x7F0B0794);  // id:major_hot_index9_rank
        L.o(view9, "findViewById(...)");
        arr_textView[8] = view9;
        View view10 = view0.findViewById(0x7F0B077A);  // id:major_hot_index10_rank
        L.o(view10, "findViewById(...)");
        arr_textView[9] = view10;
        this.a = u.s(arr_textView);
        TextView[] arr_textView1 = new TextView[10];
        View view11 = view0.findViewById(0x7F0B077B);  // id:major_hot_index1_name
        L.o(view11, "findViewById(...)");
        arr_textView1[0] = view11;
        View view12 = view0.findViewById(0x7F0B077E);  // id:major_hot_index2_name
        L.o(view12, "findViewById(...)");
        arr_textView1[1] = view12;
        View view13 = view0.findViewById(0x7F0B0781);  // id:major_hot_index3_name
        L.o(view13, "findViewById(...)");
        arr_textView1[2] = view13;
        View view14 = view0.findViewById(0x7F0B0784);  // id:major_hot_index4_name
        L.o(view14, "findViewById(...)");
        arr_textView1[3] = view14;
        View view15 = view0.findViewById(0x7F0B0787);  // id:major_hot_index5_name
        L.o(view15, "findViewById(...)");
        arr_textView1[4] = view15;
        View view16 = view0.findViewById(0x7F0B078A);  // id:major_hot_index6_name
        L.o(view16, "findViewById(...)");
        arr_textView1[5] = view16;
        View view17 = view0.findViewById(0x7F0B078D);  // id:major_hot_index7_name
        L.o(view17, "findViewById(...)");
        arr_textView1[6] = view17;
        View view18 = view0.findViewById(0x7F0B0790);  // id:major_hot_index8_name
        L.o(view18, "findViewById(...)");
        arr_textView1[7] = view18;
        View view19 = view0.findViewById(0x7F0B0793);  // id:major_hot_index9_name
        L.o(view19, "findViewById(...)");
        arr_textView1[8] = view19;
        View view20 = view0.findViewById(0x7F0B0779);  // id:major_hot_index10_name
        L.o(view20, "findViewById(...)");
        arr_textView1[9] = view20;
        this.b = u.s(arr_textView1);
    }

    @l
    public final ArrayList e() {
        return this.b;
    }

    @l
    public final ArrayList f() {
        return this.a;
    }
}

