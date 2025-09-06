package com.dcinside.app.read.holder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import com.dcinside.app.model.Q;
import com.dcinside.app.read.C;
import com.dcinside.app.read.tools.s;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.vk;
import com.dcinside.app.wv.B;
import com.dcinside.app.wv.VideoEnabledWebView;
import com.dcinside.app.wv.WebViews;
import com.dcinside.app.wv.f;
import com.dcinside.app.wv.m.a;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class c extends b implements f {
    @m
    private f b;
    @m
    private VideoEnabledWebView c;

    public c(@l View view0) {
        L.p(view0, "itemView");
        super(view0, null);
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        return this.b == null ? false : this.b.g();
    }

    public final void h(@l C c0, @l Q q0, @l s s0, int v) {
        L.p(c0, "item");
        L.p(q0, "postInfo");
        L.p(s0, "webControls");
        VideoEnabledWebView videoEnabledWebView0 = this.c;
        if(videoEnabledWebView0 == null) {
        label_7:
            this.k(c0, s0, v);
            if(jl.a.V()) {
                String s1 = q0.G0();
                int v1 = q0.c1();
                VideoEnabledWebView videoEnabledWebView1 = this.c;
                if(videoEnabledWebView1 != null) {
                    WebViews.u(videoEnabledWebView1, s1, v1);
                }
            }
            Context context0 = this.itemView.getContext();
            a.a.e(context0);
            WebViews.k(this.c);
            WebViews.t(this.c, "http://www.dcinside.com/", c0.b(), v);
        }
        else {
            Object object0 = com.dcinside.app.wv.m.c.b.c(videoEnabledWebView0);
            if(object0 == null || !L.g(object0, c0.k())) {
                goto label_7;
            }
        }
    }

    @m
    public final VideoEnabledWebView i() {
        return this.c;
    }

    private final VideoEnabledWebView j(C c0, s s0, int v) {
        Context context0 = this.itemView.getContext();
        VideoEnabledWebView videoEnabledWebView0 = new VideoEnabledWebView(context0);
        videoEnabledWebView0.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        videoEnabledWebView0.setId(0x7F0B0C24);  // id:read_content_wv_primary
        L.m(context0);
        videoEnabledWebView0.setBackgroundColor(vk.b(context0, 0x1010054));
        videoEnabledWebView0.setTag(0x7F0B02F6, s0);  // id:content_wv_context_callback
        com.dcinside.app.wv.m.c.c.f(videoEnabledWebView0, v);
        com.dcinside.app.wv.m.c.g.f(videoEnabledWebView0, Boolean.TRUE);
        com.dcinside.app.wv.m.c.b.f(videoEnabledWebView0, c0.k());
        this.b = B.a.f(videoEnabledWebView0, true);
        return videoEnabledWebView0;
    }

    private final void k(C c0, s s0, int v) {
        VideoEnabledWebView videoEnabledWebView0 = this.c;
        if(videoEnabledWebView0 != null) {
            videoEnabledWebView0.destroy();
        }
        ViewGroup viewGroup0 = null;
        ViewGroup viewGroup1 = this.itemView instanceof ViewGroup ? ((ViewGroup)this.itemView) : null;
        if(viewGroup1 != null) {
            viewGroup1.removeAllViews();
        }
        VideoEnabledWebView videoEnabledWebView1 = this.j(c0, s0, v);
        this.c = videoEnabledWebView1;
        View view0 = this.itemView;
        if(view0 instanceof ViewGroup) {
            viewGroup0 = (ViewGroup)view0;
        }
        if(viewGroup0 != null) {
            viewGroup0.addView(videoEnabledWebView1);
        }
    }

    public final void l(@m VideoEnabledWebView videoEnabledWebView0) {
        this.c = videoEnabledWebView0;
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        f f0 = this.b;
        if(f0 != null) {
            f0.onDestroy();
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
        f f0 = this.b;
        if(f0 != null) {
            f0.onPause();
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
        f f0 = this.b;
        if(f0 != null) {
            f0.onResume();
        }
    }
}

