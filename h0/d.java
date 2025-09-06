package h0;

import android.view.View;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.push.adapter.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nMyActivePostHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyActivePostHolder.kt\ncom/dcinside/app/push/holder/MyActivePostHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class d extends ViewHolder {
    @l
    private View a;
    @l
    private View b;
    @l
    private TextView c;
    @l
    private TextView d;
    @l
    private TextView e;
    @l
    private View f;
    @l
    private TextView g;
    @l
    private TextView h;
    @l
    private TextView i;
    @l
    private View j;
    @l
    private View k;
    @l
    private TextView l;
    @l
    private TextView m;
    @l
    private View n;
    @l
    private View o;
    @l
    private CheckBox p;

    public d(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B06B7);  // id:item_my_active_reply
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B06B3);  // id:item_my_active_like
        L.o(view2, "findViewById(...)");
        this.b = view2;
        View view3 = view0.findViewById(0x7F0B06B4);  // id:item_my_active_like_count
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B06B8);  // id:item_my_active_subject
        L.o(view4, "findViewById(...)");
        this.d = (TextView)view4;
        View view5 = view0.findViewById(0x7F0B06BC);  // id:item_my_active_unread_text
        L.o(view5, "findViewById(...)");
        this.e = (TextView)view5;
        View view6 = view0.findViewById(0x7F0B06BB);  // id:item_my_active_unread_icon
        L.o(view6, "findViewById(...)");
        this.f = view6;
        View view7 = view0.findViewById(0x7F0B06BA);  // id:item_my_active_unread_count
        L.o(view7, "findViewById(...)");
        this.g = (TextView)view7;
        View view8 = view0.findViewById(0x7F0B06AA);  // id:item_my_active_contents
        L.o(view8, "findViewById(...)");
        this.h = (TextView)view8;
        View view9 = view0.findViewById(0x7F0B06AF);  // id:item_my_active_gall_name
        L.o(view9, "findViewById(...)");
        this.i = (TextView)view9;
        View view10 = view0.findViewById(0x7F0B06AD);  // id:item_my_active_divider1
        L.o(view10, "findViewById(...)");
        this.j = view10;
        View view11 = view0.findViewById(0x7F0B06AE);  // id:item_my_active_divider2
        L.o(view11, "findViewById(...)");
        this.k = view11;
        View view12 = view0.findViewById(0x7F0B06B6);  // id:item_my_active_nickname
        L.o(view12, "findViewById(...)");
        this.l = (TextView)view12;
        View view13 = view0.findViewById(0x7F0B06AB);  // id:item_my_active_date
        L.o(view13, "findViewById(...)");
        this.m = (TextView)view13;
        View view14 = view0.findViewById(0x7F0B06B1);  // id:item_my_active_last_divider
        L.o(view14, "findViewById(...)");
        this.n = view14;
        View view15 = view0.findViewById(0x7F0B06B2);  // id:item_my_active_last_text
        L.o(view15, "findViewById(...)");
        this.o = view15;
        View view16 = view0.findViewById(0x7F0B06B0);  // id:item_my_active_item_check
        L.o(view16, "findViewById(...)");
        this.p = (CheckBox)view16;
        ((CheckBox)view16).setOnCheckedChangeListener((CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            this.x(z);
        });
    }

    public final void A(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.h = textView0;
    }

    public final void B(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.m = textView0;
    }

    public final void C(@l View view0) {
        L.p(view0, "<set-?>");
        this.k = view0;
    }

    public final void D(@l View view0) {
        L.p(view0, "<set-?>");
        this.j = view0;
    }

    public final void E(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.i = textView0;
    }

    public final void F(@l View view0) {
        L.p(view0, "<set-?>");
        this.n = view0;
    }

    public final void G(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.c = textView0;
    }

    public final void H(@l View view0) {
        L.p(view0, "<set-?>");
        this.b = view0;
    }

    public final void I(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.l = textView0;
    }

    public final void J(@l View view0) {
        L.p(view0, "<set-?>");
        this.a = view0;
    }

    public final void K(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.d = textView0;
    }

    public final void L(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.g = textView0;
    }

    public final void M(@l View view0) {
        L.p(view0, "<set-?>");
        this.f = view0;
    }

    public final void N(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.e = textView0;
    }

    @l
    public final CheckBox f() {
        return this.p;
    }

    @l
    public final View h() {
        return this.o;
    }

    @l
    public final TextView i() {
        return this.h;
    }

    @l
    public final TextView j() {
        return this.m;
    }

    @l
    public final View k() {
        return this.k;
    }

    @l
    public final View l() {
        return this.j;
    }

    @l
    public final TextView m() {
        return this.i;
    }

    @l
    public final View n() {
        return this.n;
    }

    @l
    public final TextView o() {
        return this.c;
    }

    @l
    public final View p() {
        return this.b;
    }

    @l
    public final TextView q() {
        return this.l;
    }

    @l
    public final View r() {
        return this.a;
    }

    @l
    public final TextView s() {
        return this.d;
    }

    @l
    public final TextView t() {
        return this.g;
    }

    @l
    public final View u() {
        return this.f;
    }

    @l
    public final TextView v() {
        return this.e;
    }

    // 检测为 Lambda 实现
    private static final void w(d d0, CompoundButton compoundButton0, boolean z) [...]

    private final void x(boolean z) {
        try {
            int v = this.getBindingAdapterPosition();
            if(v >= 0) {
                ViewParent viewParent0 = this.itemView.getParent();
                L.n(viewParent0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                Adapter recyclerView$Adapter0 = ((RecyclerView)viewParent0).getAdapter();
                L.n(recyclerView$Adapter0, "null cannot be cast to non-null type com.dcinside.app.push.adapter.NoticePushAdapter");
                ((c)recyclerView$Adapter0).K(v, z);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public final void y(@l CheckBox checkBox0) {
        L.p(checkBox0, "<set-?>");
        this.p = checkBox0;
    }

    public final void z(@l View view0) {
        L.p(view0, "<set-?>");
        this.o = view0;
    }
}

