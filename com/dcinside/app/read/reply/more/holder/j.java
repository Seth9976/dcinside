package com.dcinside.app.read.reply.more.holder;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.model.k0;
import com.dcinside.app.read.reply.more.ReplyMoreItem;
import com.dcinside.app.type.t;
import com.dcinside.app.util.uk;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rx.o;
import rx.schedulers.c;
import y4.l;
import y4.m;

@s0({"SMAP\nReplyMoreUserHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyMoreUserHolder.kt\ncom/dcinside/app/read/reply/more/holder/ReplyMoreUserHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,115:1\n257#2,2:116\n257#2,2:118\n257#2,2:120\n257#2,2:122\n257#2,2:124\n*S KotlinDebug\n*F\n+ 1 ReplyMoreUserHolder.kt\ncom/dcinside/app/read/reply/more/holder/ReplyMoreUserHolder\n*L\n40#1:116,2\n79#1:118,2\n80#1:120,2\n87#1:122,2\n90#1:124,2\n*E\n"})
public final class j extends ViewHolder {
    @l
    private final View a;
    @l
    private final TextView b;
    @l
    private final TextView c;
    @l
    private final ImageView d;
    @l
    private final View e;
    @l
    private final TextView f;
    @l
    private final View g;
    @m
    private o h;

    public j(@l View view0) {
        L.p(view0, "view");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0D5E);  // id:reply_more_under_ic
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B0D60);  // id:reply_more_user_name
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0D5F);  // id:reply_more_user_ip
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B0D59);  // id:reply_more_member_ic
        L.o(view4, "findViewById(...)");
        this.d = (ImageView)view4;
        View view5 = view0.findViewById(0x7F0B0D55);  // id:reply_more_gallog_ic
        L.o(view5, "findViewById(...)");
        this.e = view5;
        View view6 = view0.findViewById(0x7F0B0D61);  // id:reply_more_user_write_info
        L.o(view6, "findViewById(...)");
        this.f = (TextView)view6;
        View view7 = view0.findViewById(0x7F0B0D56);  // id:reply_more_gallog_wrap
        L.o(view7, "findViewById(...)");
        this.g = view7;
    }

    // 去混淆评级： 低(33)
    public final void h(@l ReplyMoreItem replyMoreItem0) {
        L.p(replyMoreItem0, "item");
        this.itemView.getContext();
        this.a.setVisibility((replyMoreItem0.X() ? 0 : 8));
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder("");
        if(L.g("", "1")) {
            spannableStringBuilder0.setSpan(new StyleSpan(1), 0, spannableStringBuilder0.length(), 33);
        }
        this.b.setText(spannableStringBuilder0);
        this.c.setText("");
        t.c.c(replyMoreItem0, this.d);
        this.e.setVisibility(8);
    }

    private final void i(String s, TextView textView0) {
        static final class a extends N implements Function1 {
            final TextView e;

            a(TextView textView0) {
                this.e = textView0;
                super(1);
            }

            public final void a(k0 k00) {
                Integer integer0 = k00.h();
                int v = integer0 == null ? 0 : ((int)integer0);
                Integer integer1 = k00.i();
                int v1 = integer1 == null ? 0 : ((int)integer1);
                if(v > 0 || v1 > 0) {
                    String s = this.e.getContext().getString(0x7F1507D9, new Object[]{v, v1});  // string:post_reply_gallog_count_info "글 %1$d / 댓글 %2$d"
                    L.o(s, "getString(...)");
                    this.e.setText(s);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((k0)object0));
                return S0.a;
            }
        }

        o o0 = this.h;
        if(o0 != null) {
            o0.l();
        }
        this.h = uk.Bk(s).A5(c.e()).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new a(textView0), "$tmp0");
            new a(textView0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(textView0, "$tv");
            textView0.setText("");
        });
    }

    // 检测为 Lambda 实现
    private static final void j(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void k(TextView textView0, Throwable throwable0) [...]

    @l
    public final View l() {
        return this.g;
    }
}

