package com.dcinside.app.read.reply.more.holder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.model.J;
import com.dcinside.app.model.Mention;
import com.dcinside.app.read.Q0;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.view.tool.j;
import com.dcinside.app.wv.WebViews;
import com.dcinside.app.wv.m.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nReplyMoreReplyVoiceHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyMoreReplyVoiceHolder.kt\ncom/dcinside/app/read/reply/more/holder/ReplyMoreReplyVoiceHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,63:1\n257#2,2:64\n257#2,2:66\n*S KotlinDebug\n*F\n+ 1 ReplyMoreReplyVoiceHolder.kt\ncom/dcinside/app/read/reply/more/holder/ReplyMoreReplyVoiceHolder\n*L\n35#1:64,2\n37#1:66,2\n*E\n"})
public final class g extends ViewHolder {
    @m
    private final WebView a;
    @l
    private final TextView b;
    @l
    private final ViewGroup c;
    @l
    private final TextView d;

    public g(@l View view0, @m WebView webView0) {
        L.p(view0, "view");
        super(view0);
        this.a = webView0;
        View view1 = view0.findViewById(0x7F0B0D63);  // id:reply_more_voice_memo
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0D62);  // id:reply_more_voice
        L.o(view2, "findViewById(...)");
        this.c = (ViewGroup)view2;
        View view3 = view0.findViewById(0x7F0B0D64);  // id:reply_more_voice_mention
        L.o(view3, "findViewById(...)");
        this.d = (TextView)view3;
        if(webView0 != null) {
            ((ViewGroup)view2).addView(webView0);
        }
    }

    public final void e(@l String s, @l String s1, int v, @m Mention mention0) {
        L.p(s, "memo");
        L.p(s1, "voiceSource");
        int v1 = 8;
        this.b.setVisibility((s.length() <= 0 ? 0 : 8));
        this.b.setText(s);
        TextView textView0 = this.d;
        if(mention0 != null) {
            v1 = 0;
        }
        textView0.setVisibility(v1);
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
            SpannableStringBuilder spannableStringBuilder0 = com.dcinside.app.span.g.w(context0, Q0.d, s2, "", "", z);
            this.d.setText(spannableStringBuilder0);
        }
        WebView webView0 = this.a;
        if(webView0 == null) {
            return;
        }
        c m$c0 = c.b;
        Object object0 = m$c0.c(webView0);
        if(object0 == null || !L.g(object0, v)) {
            m$c0.f(webView0, v);
            c.g.f(webView0, Boolean.TRUE);
            int v2 = Dk.b(0x7F07040C);  // dimen:voice_web_height
            j.h(this.a, v2);
            com.dcinside.app.wv.j j0 = com.dcinside.app.wv.j.c(webView0);
            if(j0 != null) {
                j0.i();
            }
            WebViews.r(webView0, s1);
        }
    }
}

