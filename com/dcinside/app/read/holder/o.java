package com.dcinside.app.read.holder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.dcinside.app.model.J;
import com.dcinside.app.model.Mention;
import com.dcinside.app.read.Q0;
import com.dcinside.app.span.g;
import com.dcinside.app.view.ResizeTextView;
import com.dcinside.app.wv.VideoEnabledWebView;
import kotlin.jvm.internal.L;
import y4.m;

public final class o extends l {
    @m
    private ViewGroup n;
    @y4.l
    private final ResizeTextView o;

    public o(@y4.l View view0, @m VideoEnabledWebView videoEnabledWebView0) {
        L.p(view0, "itemView");
        super(view0, videoEnabledWebView0);
        this.n = (ViewGroup)view0.findViewById(0x7F0B0D75);  // id:reply_voice
        View view1 = view0.findViewById(0x7F0B0D32);  // id:reply_mention
        L.o(view1, "findViewById(...)");
        this.o = (ResizeTextView)view1;
        if(videoEnabledWebView0 != null) {
            ViewGroup viewGroup0 = this.n;
            if(viewGroup0 != null) {
                viewGroup0.addView(videoEnabledWebView0);
            }
        }
    }

    @m
    public final ViewGroup E() {
        return this.n;
    }

    public final void F(@m Mention mention0) {
        if(mention0 == null) {
            this.o.setVisibility(8);
            return;
        }
        this.o.setVisibility(0);
        Context context0 = this.itemView.getContext();
        L.o(context0, "getContext(...)");
        boolean z = J.a(mention0);
        SpannableStringBuilder spannableStringBuilder0 = g.w(context0, Q0.d, "", "", "", z);
        this.o.setText(spannableStringBuilder0);
    }

    public final void G(@m ViewGroup viewGroup0) {
        this.n = viewGroup0;
    }
}

