package h0;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class g extends ViewHolder {
    @l
    private TextView a;
    @l
    private TextView b;
    @l
    private TextView c;

    public g(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B06BF);  // id:item_push_gallery_name
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B06C0);  // id:item_push_keywords
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B06C1);  // id:item_push_keywords_count
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
    }

    @l
    public final TextView e() {
        return this.a;
    }

    @l
    public final TextView f() {
        return this.c;
    }

    @l
    public final TextView h() {
        return this.b;
    }

    public final void i(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.a = textView0;
    }

    public final void j(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.c = textView0;
    }

    public final void k(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.b = textView0;
    }
}

