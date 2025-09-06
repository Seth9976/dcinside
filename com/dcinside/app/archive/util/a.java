package com.dcinside.app.archive.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.dcinside.app.util.vk;
import com.dcinside.app.wv.B;
import com.dcinside.app.wv.VideoEnabledWebView;
import com.dcinside.app.wv.WebViews;
import com.dcinside.app.wv.f;
import com.dcinside.app.wv.j;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class a extends FrameLayout {
    @m
    private VideoEnabledWebView a;
    @m
    private TextView b;
    @m
    private f c;

    public a(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        this.addView(LayoutInflater.from(context0).inflate(0x7F0E0198, this, false));  // layout:view_archive_play_voice
        this.a = (VideoEnabledWebView)this.findViewById(0x7F0B0154);  // id:archive_voice_view_web
        this.b = (TextView)this.findViewById(0x7F0B0153);  // id:archive_voice_view_title
    }

    public final void a(@l String s) {
        L.p(s, "html");
        f f0 = this.c;
        if(f0 != null) {
            f0.onDestroy();
        }
        this.c = B.a.e(this.a);
        j j0 = j.c(this.a);
        if(j0 != null) {
            j0.i();
        }
        com.dcinside.app.view.tool.j.h(this.a, 0);
        WebViews.r(this.a, s);
        VideoEnabledWebView videoEnabledWebView0 = this.a;
        if(videoEnabledWebView0 != null) {
            Context context0 = this.getContext();
            L.o(context0, "getContext(...)");
            videoEnabledWebView0.setBackgroundColor(vk.b(context0, 0x7F0406F9));  // attr:windowBackgroundSub
        }
    }

    @m
    public final f getLifecycle() {
        return this.c;
    }

    @m
    public final TextView getTitle() {
        return this.b;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        f f0 = this.c;
        if(f0 != null) {
            f0.onResume();
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f f0 = this.c;
        if(f0 != null) {
            f0.onDestroy();
        }
        this.c = null;
    }

    public final void setLifecycle(@m f f0) {
        this.c = f0;
    }

    public final void setTitle(@m TextView textView0) {
        this.b = textView0;
    }
}

