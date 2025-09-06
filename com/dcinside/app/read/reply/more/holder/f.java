package com.dcinside.app.read.reply.more.holder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.model.J;
import com.dcinside.app.model.Mention;
import com.dcinside.app.read.Q0;
import com.dcinside.app.span.g;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class f extends ViewHolder {
    @l
    private final TextView a;

    public f(@l View view0) {
        L.p(view0, "view");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0D5D);  // id:reply_more_text
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
    }

    public final void e(@l String s, @m Mention mention0) {
        L.p(s, "commentMemo");
        if(mention0 != null) {
            Context context0 = this.itemView.getContext();
            String s1 = Dl.c("").toString();
            if(s1.length() > 10) {
                String s2 = s1.substring(0, 10);
                L.o(s2, "substring(...)");
                s1 = s2 + "…";
            }
            L.m(context0);
            boolean z = J.a(mention0);
            SpannableStringBuilder spannableStringBuilder0 = g.w(context0, Q0.d, s1, "", "", z);
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(vk.b(context0, 0x7F040200)), 0, spannableStringBuilder0.length(), 33);  // attr:dcPostReadSubColor
            spannableStringBuilder0.setSpan(new AbsoluteSizeSpan(0), 0, spannableStringBuilder0.length(), 33);
            spannableStringBuilder0.append(' ');
            spannableStringBuilder0.append(s);
            this.a.setText(spannableStringBuilder0);
            return;
        }
        this.a.setText(s);
    }
}

