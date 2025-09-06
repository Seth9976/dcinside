package com.dcinside.app.write.temp;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.util.jl;
import kotlin.jvm.internal.L;
import y4.l;

public final class m extends ViewHolder {
    public m(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        int v = jl.a.L0();
        String s = view0.getContext().getString(0x7F150A1A, new Object[]{v});  // string:temporary_post_tip "- 임시 저장 글은 %1$d개까지 보관됩니다.\n- AI 이미지는 임시 저장되지 않습니다."
        L.o(s, "getString(...)");
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0B29);  // id:post_temp_max_count_msg
        if(textView0 != null) {
            textView0.setText(s);
        }
    }
}

