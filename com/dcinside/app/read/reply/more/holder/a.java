package com.dcinside.app.read.reply.more.holder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.read.reply.more.BlockState;
import com.dcinside.app.read.reply.more.ReplyMoreItem;
import com.dcinside.app.realm.f;
import com.dcinside.app.span.g;
import com.dcinside.app.util.vk;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nReplyMoreBlockHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyMoreBlockHolder.kt\ncom/dcinside/app/read/reply/more/holder/ReplyMoreBlockHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,167:1\n257#2,2:168\n257#2,2:170\n257#2,2:172\n257#2,2:174\n257#2,2:176\n257#2,2:178\n257#2,2:180\n257#2,2:182\n257#2,2:184\n257#2,2:186\n257#2,2:188\n257#2,2:190\n257#2,2:192\n257#2,2:194\n257#2,2:196\n257#2,2:198\n*S KotlinDebug\n*F\n+ 1 ReplyMoreBlockHolder.kt\ncom/dcinside/app/read/reply/more/holder/ReplyMoreBlockHolder\n*L\n56#1:168,2\n66#1:170,2\n70#1:172,2\n79#1:174,2\n81#1:176,2\n90#1:178,2\n92#1:180,2\n93#1:182,2\n97#1:184,2\n98#1:186,2\n99#1:188,2\n101#1:190,2\n104#1:192,2\n105#1:194,2\n139#1:196,2\n140#1:198,2\n*E\n"})
public final class a extends ViewHolder {
    public static final class com.dcinside.app.read.reply.more.holder.a.a {
        private com.dcinside.app.read.reply.more.holder.a.a() {
        }

        public com.dcinside.app.read.reply.more.holder.a.a(w w0) {
        }
    }

    @l
    private final View a;
    @l
    private final View b;
    @l
    private final View c;
    @l
    private final TextView d;
    @l
    private final TextView e;
    @l
    private final TextView f;
    @l
    private final TextView g;
    @l
    private final TextView h;
    @l
    private final TextView i;
    @l
    private final TextView j;
    @l
    private final TextView k;
    @l
    private final TextView l;
    private final TextView m;
    @l
    private final View n;
    @l
    private final View o;
    @l
    private final TextView p;
    @l
    private final TextView q;
    @l
    private final TextView r;
    @l
    private final TextView s;
    @l
    private final TextView t;
    @l
    private final TextView u;
    private final int v;
    @l
    public static final com.dcinside.app.read.reply.more.holder.a.a w = null;
    @l
    public static final String x = "전체";
    @l
    public static final String y = "그룹";

    static {
        a.w = new com.dcinside.app.read.reply.more.holder.a.a(null);
    }

    public a(@l View view0) {
        L.p(view0, "view");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0D46);  // id:reply_more_block_name_group
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B0D3E);  // id:reply_more_block_ip_group
        L.o(view2, "findViewById(...)");
        this.b = view2;
        View view3 = view0.findViewById(0x7F0B0D39);  // id:reply_more_block_id_group
        L.o(view3, "findViewById(...)");
        this.c = view3;
        View view4 = view0.findViewById(0x7F0B0D48);  // id:reply_more_block_name_value
        L.o(view4, "findViewById(...)");
        this.d = (TextView)view4;
        View view5 = view0.findViewById(0x7F0B0D45);  // id:reply_more_block_name_gall
        L.o(view5, "findViewById(...)");
        this.e = (TextView)view5;
        View view6 = view0.findViewById(0x7F0B0D44);  // id:reply_more_block_name_all
        L.o(view6, "findViewById(...)");
        this.f = (TextView)view6;
        View view7 = view0.findViewById(0x7F0B0D40);  // id:reply_more_block_ip_value
        L.o(view7, "findViewById(...)");
        this.g = (TextView)view7;
        View view8 = view0.findViewById(0x7F0B0D3D);  // id:reply_more_block_ip_gall
        L.o(view8, "findViewById(...)");
        this.h = (TextView)view8;
        View view9 = view0.findViewById(0x7F0B0D3C);  // id:reply_more_block_ip_all
        L.o(view9, "findViewById(...)");
        this.i = (TextView)view9;
        View view10 = view0.findViewById(0x7F0B0D3B);  // id:reply_more_block_id_value
        L.o(view10, "findViewById(...)");
        this.j = (TextView)view10;
        View view11 = view0.findViewById(0x7F0B0D38);  // id:reply_more_block_id_gall
        L.o(view11, "findViewById(...)");
        this.k = (TextView)view11;
        View view12 = view0.findViewById(0x7F0B0D37);  // id:reply_more_block_id_all
        L.o(view12, "findViewById(...)");
        this.l = (TextView)view12;
        this.m = (TextView)view0.findViewById(0x7F0B0D36);  // id:reply_more_block_dccon_title
        View view13 = view0.findViewById(0x7F0B0D51);  // id:reply_more_dccon_wrap
        L.o(view13, "findViewById(...)");
        this.n = view13;
        View view14 = view0.findViewById(0x7F0B0D54);  // id:reply_more_double_dccon_wrap
        L.o(view14, "findViewById(...)");
        this.o = view14;
        View view15 = view0.findViewById(0x7F0B0D34);  // id:reply_more_block_dccon
        L.o(view15, "findViewById(...)");
        this.p = (TextView)view15;
        View view16 = view0.findViewById(0x7F0B0D35);  // id:reply_more_block_dccon_group
        L.o(view16, "findViewById(...)");
        this.q = (TextView)view16;
        View view17 = view0.findViewById(0x7F0B0D41);  // id:reply_more_block_left_dccon
        L.o(view17, "findViewById(...)");
        this.r = (TextView)view17;
        View view18 = view0.findViewById(0x7F0B0D42);  // id:reply_more_block_left_group
        L.o(view18, "findViewById(...)");
        this.s = (TextView)view18;
        View view19 = view0.findViewById(0x7F0B0D49);  // id:reply_more_block_right_dccon
        L.o(view19, "findViewById(...)");
        this.t = (TextView)view19;
        View view20 = view0.findViewById(0x7F0B0D4A);  // id:reply_more_block_right_group
        L.o(view20, "findViewById(...)");
        this.u = (TextView)view20;
        Context context0 = view0.getContext();
        L.o(context0, "getContext(...)");
        this.v = vk.b(context0, 0x7F04012E);  // attr:colorAccent
    }

    public final void e(@l ReplyMoreItem replyMoreItem0, @l BlockState blockState0, @l BlockState blockState1, @m f f0, @m f f1) {
        L.p(replyMoreItem0, "item");
        L.p(blockState0, "gallBlockState");
        L.p(blockState1, "allBlockState");
        this.itemView.getContext();
        V v0 = replyMoreItem0.D();
        V v1 = replyMoreItem0.N();
        this.a.setVisibility(8);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        if(replyMoreItem0.O() != 10000004 && ((CharSequence)v0.e()).length() == 0) {
            L.o(this.m, "blockDcconTitle");
            this.m.setVisibility(8);
            this.n.setVisibility(8);
            this.o.setVisibility(8);
            return;
        }
        L.o(this.m, "blockDcconTitle");
        this.m.setVisibility(0);
        if(((CharSequence)v1.e()).length() > 0) {
            this.o.setVisibility(0);
            this.n.setVisibility(8);
            com.dcinside.app.realm.f.a f$a0 = f.i;
            if(f$a0.f(((String)v0.e()))) {
                this.r.setText("해당 디시콘\n차단 해제");
                this.r.setSelected(true);
            }
            else {
                this.r.setText("해당\n디시콘 차단");
                this.r.setSelected(false);
            }
            if(f0 == null || f0.Q5().size() < f0.U5()) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("디시콘\n그룹 차단");
                SpannableStringBuilder spannableStringBuilder3 = g.f(g.a, spannableStringBuilder2, "그룹", this.v, false, 8, null);
                this.s.setText(spannableStringBuilder3);
                this.s.setSelected(false);
            }
            else {
                SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder("디시콘 그룹\n차단 해제");
                SpannableStringBuilder spannableStringBuilder1 = g.f(g.a, spannableStringBuilder0, "그룹", this.v, false, 8, null);
                this.s.setText(spannableStringBuilder1);
                this.s.setSelected(true);
            }
            if(f$a0.f(((String)v1.e()))) {
                this.t.setText("해당 디시콘\n차단 해제");
                this.t.setSelected(true);
            }
            else {
                this.t.setText("해당\n디시콘 차단");
                this.t.setSelected(false);
            }
            if(f1 != null && f1.Q5().size() >= f1.U5()) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("디시콘 그룹\n차단 해제");
                SpannableStringBuilder spannableStringBuilder5 = g.f(g.a, spannableStringBuilder4, "그룹", this.v, false, 8, null);
                this.u.setText(spannableStringBuilder5);
                this.u.setSelected(true);
                return;
            }
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder("디시콘\n그룹 차단");
            SpannableStringBuilder spannableStringBuilder7 = g.f(g.a, spannableStringBuilder6, "그룹", this.v, false, 8, null);
            this.u.setText(spannableStringBuilder7);
            this.u.setSelected(false);
            return;
        }
        this.o.setVisibility(8);
        this.n.setVisibility(0);
        if(f.i.f(((String)v0.e()))) {
            this.p.setText("해당 디시콘 차단 해제");
            this.p.setSelected(true);
        }
        else {
            this.p.setText("해당 디시콘 차단");
            this.p.setSelected(false);
        }
        if(f0 != null && f0.Q5().size() >= f0.U5()) {
            SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("디시콘 그룹 차단 해제");
            SpannableStringBuilder spannableStringBuilder9 = g.f(g.a, spannableStringBuilder8, "그룹", this.v, false, 8, null);
            this.q.setText(spannableStringBuilder9);
            this.q.setSelected(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder("디시콘 그룹 차단");
        SpannableStringBuilder spannableStringBuilder11 = g.f(g.a, spannableStringBuilder10, "그룹", this.v, false, 8, null);
        this.q.setText(spannableStringBuilder11);
        this.q.setSelected(false);
    }

    @l
    public final TextView f() {
        return this.p;
    }

    @l
    public final TextView h() {
        return this.q;
    }

    @l
    public final TextView i() {
        return this.r;
    }

    @l
    public final TextView j() {
        return this.s;
    }

    @l
    public final TextView k() {
        return this.t;
    }

    @l
    public final TextView l() {
        return this.u;
    }

    @l
    public final TextView m() {
        return this.l;
    }

    @l
    public final TextView n() {
        return this.k;
    }

    @l
    public final TextView o() {
        return this.i;
    }

    @l
    public final TextView p() {
        return this.h;
    }

    @l
    public final TextView q() {
        return this.f;
    }

    @l
    public final TextView r() {
        return this.e;
    }
}

