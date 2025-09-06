package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import J2.a.b;
import J2.c;
import K2.d;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nWebViewYouTubePlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewYouTubePlayer.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,168:1\n1#2:169\n11335#3:170\n11670#3,3:171\n*S KotlinDebug\n*F\n+ 1 WebViewYouTubePlayer.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerImpl\n*L\n59#1:170\n59#1:171,3\n*E\n"})
final class f implements c {
    @l
    private final WebView a;
    @l
    private final Handler b;
    @l
    private final Set c;

    public f(@l WebView webView0) {
        L.p(webView0, "webView");
        super();
        this.a = webView0;
        this.b = new Handler(Looper.getMainLooper());
        this.c = new LinkedHashSet();
    }

    @l
    public final Set b() {
        return this.c;
    }

    @Override  // J2.c
    public void c() {
        this.s(this.a, "playVideo", new Object[0]);
    }

    @Override  // J2.c
    public void d(boolean z) {
        this.s(this.a, "setLoop", new Object[]{Boolean.valueOf(z)});
    }

    @Override  // J2.c
    public void e() {
        this.s(this.a, "nextVideo", new Object[0]);
    }

    @Override  // J2.c
    public void f() {
        this.s(this.a, "mute", new Object[0]);
    }

    @Override  // J2.c
    public boolean g(@l d d0) {
        L.p(d0, "listener");
        return this.c.add(d0);
    }

    @Override  // J2.c
    public boolean h(@l d d0) {
        L.p(d0, "listener");
        return this.c.remove(d0);
    }

    @Override  // J2.c
    public void i(boolean z) {
        this.s(this.a, "setShuffle", new Object[]{Boolean.valueOf(z)});
    }

    @Override  // J2.c
    public void j() {
        this.s(this.a, "toggleFullscreen", new Object[0]);
    }

    @Override  // J2.c
    public void k(@l b a$b0) {
        L.p(a$b0, "playbackRate");
        Object[] arr_object = {J2.b.a(a$b0)};
        this.s(this.a, "setPlaybackRate", arr_object);
    }

    @Override  // J2.c
    public void l(@l String s, float f) {
        L.p(s, "videoId");
        this.s(this.a, "cueVideo", new Object[]{s, f});
    }

    @Override  // J2.c
    public void m(int v) {
        this.s(this.a, "playVideoAt", new Object[]{v});
    }

    @Override  // J2.c
    public void n() {
        this.s(this.a, "unMute", new Object[0]);
    }

    @Override  // J2.c
    public void o(@l String s, float f) {
        L.p(s, "videoId");
        this.s(this.a, "loadVideo", new Object[]{s, f});
    }

    @Override  // J2.c
    public void p() {
        this.s(this.a, "previousVideo", new Object[0]);
    }

    @Override  // J2.c
    public void pause() {
        this.s(this.a, "pauseVideo", new Object[0]);
    }

    @Override  // J2.c
    public void q(float f) {
        this.s(this.a, "seekTo", new Object[]{f});
    }

    @Override  // J2.c
    public void r(int v) {
        if(v < 0 || v >= 101) {
            throw new IllegalArgumentException("Volume must be between 0 and 100");
        }
        this.s(this.a, "setVolume", new Object[]{v});
    }

    private final void s(WebView webView0, String s, Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            arrayList0.add((object0 instanceof String ? '\'' + object0 + '\'' : object0.toString()));
        }
        e e0 = () -> {
            L.p(webView0, "$this_invoke");
            L.p(s, "$function");
            L.p(arrayList0, "$stringArgs");
            webView0.loadUrl("javascript:" + s + '(' + u.m3(arrayList0, ",", null, null, 0, null, null, 62, null) + ')');
        };
        this.b.post(e0);
    }

    // 检测为 Lambda 实现
    private static final void t(WebView webView0, String s, List list0) [...]

    public final void u() {
        this.c.clear();
        this.b.removeCallbacksAndMessages(null);
    }
}

