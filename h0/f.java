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

@s0({"SMAP\nNewPostHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewPostHolder.kt\ncom/dcinside/app/push/holder/NewPostHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
public final class f extends ViewHolder {
    @l
    private TextView a;
    @l
    private TextView b;
    @l
    private TextView c;
    @l
    private TextView d;
    @l
    private TextView e;
    @l
    private TextView f;
    @l
    private View g;
    @l
    private TextView h;
    @l
    private TextView i;
    @l
    private View j;
    @l
    private TextView k;
    @l
    private View l;
    @l
    private TextView m;
    @l
    private View n;
    @l
    private View o;
    @l
    private CheckBox p;

    public f(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0910);  // id:new_post_type_text
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B090F);  // id:new_post_type_notice
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0902);  // id:new_post_keyword
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B090B);  // id:new_post_recommend
        L.o(view4, "findViewById(...)");
        this.d = (TextView)view4;
        View view5 = view0.findViewById(0x7F0B090C);  // id:new_post_title
        L.o(view5, "findViewById(...)");
        this.e = (TextView)view5;
        View view6 = view0.findViewById(0x7F0B0913);  // id:new_post_unread_text
        L.o(view6, "findViewById(...)");
        this.f = (TextView)view6;
        View view7 = view0.findViewById(0x7F0B0912);  // id:new_post_unread_icon
        L.o(view7, "findViewById(...)");
        this.g = view7;
        View view8 = view0.findViewById(0x7F0B0911);  // id:new_post_unread_count
        L.o(view8, "findViewById(...)");
        this.h = (TextView)view8;
        View view9 = view0.findViewById(0x7F0B0900);  // id:new_post_gall_name
        L.o(view9, "findViewById(...)");
        this.i = (TextView)view9;
        View view10 = view0.findViewById(0x7F0B08FD);  // id:new_post_divider1
        L.o(view10, "findViewById(...)");
        this.j = view10;
        View view11 = view0.findViewById(0x7F0B090A);  // id:new_post_nickname
        L.o(view11, "findViewById(...)");
        this.k = (TextView)view11;
        View view12 = view0.findViewById(0x7F0B08FE);  // id:new_post_divider2
        L.o(view12, "findViewById(...)");
        this.l = view12;
        View view13 = view0.findViewById(0x7F0B08F9);  // id:new_post_date
        L.o(view13, "findViewById(...)");
        this.m = (TextView)view13;
        View view14 = view0.findViewById(0x7F0B0903);  // id:new_post_last_divider
        L.o(view14, "findViewById(...)");
        this.n = view14;
        View view15 = view0.findViewById(0x7F0B0904);  // id:new_post_last_text
        L.o(view15, "findViewById(...)");
        this.o = view15;
        View view16 = view0.findViewById(0x7F0B0901);  // id:new_post_item_check
        L.o(view16, "findViewById(...)");
        this.p = (CheckBox)view16;
        ((CheckBox)view16).setOnCheckedChangeListener((CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            this.x(z);
        });
    }

    public final void A(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.m = textView0;
    }

    public final void B(@l View view0) {
        L.p(view0, "<set-?>");
        this.l = view0;
    }

    public final void C(@l View view0) {
        L.p(view0, "<set-?>");
        this.j = view0;
    }

    public final void D(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.i = textView0;
    }

    public final void E(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.c = textView0;
    }

    public final void F(@l View view0) {
        L.p(view0, "<set-?>");
        this.n = view0;
    }

    public final void G(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.k = textView0;
    }

    public final void H(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.d = textView0;
    }

    public final void I(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.e = textView0;
    }

    public final void J(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.a = textView0;
    }

    public final void K(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.b = textView0;
    }

    public final void L(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.h = textView0;
    }

    public final void M(@l View view0) {
        L.p(view0, "<set-?>");
        this.g = view0;
    }

    public final void N(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.f = textView0;
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
        return this.m;
    }

    @l
    public final View j() {
        return this.l;
    }

    @l
    public final View k() {
        return this.j;
    }

    @l
    public final TextView l() {
        return this.i;
    }

    @l
    public final TextView m() {
        return this.c;
    }

    @l
    public final View n() {
        return this.n;
    }

    @l
    public final TextView o() {
        return this.k;
    }

    @l
    public final TextView p() {
        return this.d;
    }

    @l
    public final TextView q() {
        return this.e;
    }

    @l
    public final TextView r() {
        return this.a;
    }

    @l
    public final TextView s() {
        return this.b;
    }

    @l
    public final TextView t() {
        return this.h;
    }

    @l
    public final View u() {
        return this.g;
    }

    @l
    public final TextView v() {
        return this.f;
    }

    // 检测为 Lambda 实现
    private static final void w(f f0, CompoundButton compoundButton0, boolean z) [...]

    private final void x(boolean z) {
        try {
            if(this.getAdapterPosition() >= 0) {
                ViewParent viewParent0 = this.itemView.getParent();
                L.n(viewParent0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                Adapter recyclerView$Adapter0 = ((RecyclerView)viewParent0).getAdapter();
                L.n(recyclerView$Adapter0, "null cannot be cast to non-null type com.dcinside.app.push.adapter.NoticePushAdapter");
                ((c)recyclerView$Adapter0).K(this.getAdapterPosition(), z);
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

