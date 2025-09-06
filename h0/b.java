package h0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class b extends ViewHolder {
    @l
    private TextView a;
    @l
    private View b;
    @l
    private ImageView c;
    @l
    private ImageView d;

    public b(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B04F8);  // id:gallery_push_item_name
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B04F9);  // id:gallery_push_item_name_delete
        L.o(view2, "findViewById(...)");
        this.b = view2;
        View view3 = view0.findViewById(0x7F0B04F7);  // id:gallery_push_item_mini_ico
        L.o(view3, "findViewById(...)");
        this.c = (ImageView)view3;
        View view4 = view0.findViewById(0x7F0B04FA);  // id:gallery_push_item_name_delete_icon
        L.o(view4, "findViewById(...)");
        this.d = (ImageView)view4;
    }

    @l
    public final View e() {
        return this.b;
    }

    @l
    public final ImageView f() {
        return this.d;
    }

    @l
    public final ImageView h() {
        return this.c;
    }

    @l
    public final TextView i() {
        return this.a;
    }

    public final void j(@l View view0) {
        L.p(view0, "<set-?>");
        this.b = view0;
    }

    public final void k(@l ImageView imageView0) {
        L.p(imageView0, "<set-?>");
        this.d = imageView0;
    }

    public final void l(@l ImageView imageView0) {
        L.p(imageView0, "<set-?>");
        this.c = imageView0;
    }

    public final void m(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.a = textView0;
    }
}

