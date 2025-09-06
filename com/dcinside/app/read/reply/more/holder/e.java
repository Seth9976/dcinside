package com.dcinside.app.read.reply.more.holder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.t;
import com.dcinside.app.model.J;
import com.dcinside.app.model.Mention;
import com.dcinside.app.read.Q0;
import com.dcinside.app.span.g;
import com.dcinside.app.util.Dl;
import com.facebook.drawee.backends.pipeline.d;
import com.facebook.drawee.backends.pipeline.f;
import com.facebook.drawee.controller.c;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nReplyMoreReplyDcconHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyMoreReplyDcconHolder.kt\ncom/dcinside/app/read/reply/more/holder/ReplyMoreReplyDcconHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,67:1\n257#2,2:68\n*S KotlinDebug\n*F\n+ 1 ReplyMoreReplyDcconHolder.kt\ncom/dcinside/app/read/reply/more/holder/ReplyMoreReplyDcconHolder\n*L\n25#1:68,2\n*E\n"})
public final class e extends ViewHolder {
    @s0({"SMAP\nReplyMoreReplyDcconHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyMoreReplyDcconHolder.kt\ncom/dcinside/app/read/reply/more/holder/ReplyMoreReplyDcconHolder$ReplyMoreControllerListener\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,67:1\n147#2:68\n*S KotlinDebug\n*F\n+ 1 ReplyMoreReplyDcconHolder.kt\ncom/dcinside/app/read/reply/more/holder/ReplyMoreReplyDcconHolder$ReplyMoreControllerListener\n*L\n54#1:68\n*E\n"})
    static final class a extends c {
        private final boolean b;
        @l
        private final t c;

        public a(@l e e0, boolean z) {
            L.p(e0, "holder");
            super();
            this.b = z;
            this.c = new t(e0);
        }

        @Override  // com.facebook.drawee.controller.c
        public void d(@m String s, @m Throwable throwable0) {
            super.d(s, throwable0);
            e e0 = (e)this.c.a();
            if(e0 == null) {
                return;
            }
            if(this.b) {
                e0.a.setVisibility(4);
                return;
            }
            e0.b.setVisibility(4);
        }
    }

    @l
    private final SimpleDraweeView a;
    @l
    private final SimpleDraweeView b;
    @l
    private final TextView c;

    public e(@l View view0) {
        L.p(view0, "view");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0D57);  // id:reply_more_left_dccon
        L.o(view1, "findViewById(...)");
        this.a = (SimpleDraweeView)view1;
        View view2 = view0.findViewById(0x7F0B0D5B);  // id:reply_more_right_dccon
        L.o(view2, "findViewById(...)");
        this.b = (SimpleDraweeView)view2;
        View view3 = view0.findViewById(0x7F0B0D50);  // id:reply_more_dccon_mention
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
    }

    public final void h(@l String s, @l String s1, @m Mention mention0) {
        L.p(s, "leftDcconUrl");
        L.p(s1, "rightDcconUrl");
        this.c.setVisibility((mention0 == null ? 0 : 8));
        if(mention0 != null) {
            String s2 = Dl.c("").toString();
            if(s2.length() > 10) {
                String s3 = s2.substring(0, 10);
                L.o(s3, "substring(...)");
                s2 = s3 + "…";
            }
            Context context0 = this.itemView.getContext();
            L.o(context0, "getContext(...)");
            boolean z = J.a(mention0);
            SpannableStringBuilder spannableStringBuilder0 = g.w(context0, Q0.d, s2, "", "", z);
            this.c.setText(spannableStringBuilder0);
        }
        if(s.length() > 0) {
            com.facebook.drawee.controller.a a0 = ((f)((f)((f)d.j().j0(s).U(this.a.getController())).L(new a(this, true))).I(true)).e();
            this.a.setController(a0);
            if(s1.length() > 0) {
                com.facebook.drawee.controller.a a1 = ((f)((f)((f)d.j().j0(s1).U(this.b.getController())).L(new a(this, false))).I(true)).e();
                this.b.setController(a1);
            }
        }
    }
}

