package J2;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;

@RestrictTo({Scope.b})
@s0({"SMAP\nYouTubePlayerBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YouTubePlayerBridge.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayerBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,203:1\n1855#2,2:204\n1855#2,2:206\n1855#2,2:208\n1855#2,2:210\n1855#2,2:212\n1855#2,2:214\n1855#2,2:216\n1855#2,2:218\n1855#2,2:220\n1855#2,2:222\n*S KotlinDebug\n*F\n+ 1 YouTubePlayerBridge.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayerBridge\n*L\n60#1:204,2\n68#1:206,2\n77#1:208,2\n86#1:210,2\n95#1:212,2\n101#1:214,2\n114#1:216,2\n129#1:218,2\n143#1:220,2\n149#1:222,2\n*E\n"})
public final class o {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public interface b {
        void a();

        @l
        c getInstance();

        @l
        Collection getListeners();
    }

    @l
    private final b a;
    @l
    private final Handler b;
    @l
    public static final a c = null;
    @l
    private static final String d = "UNSTARTED";
    @l
    private static final String e = "ENDED";
    @l
    private static final String f = "PLAYING";
    @l
    private static final String g = "PAUSED";
    @l
    private static final String h = "BUFFERING";
    @l
    private static final String i = "CUED";
    @l
    private static final String j = "small";
    @l
    private static final String k = "medium";
    @l
    private static final String l = "large";
    @l
    private static final String m = "hd720";
    @l
    private static final String n = "hd1080";
    @l
    private static final String o = "highres";
    @l
    private static final String p = "default";
    @l
    private static final String q = "0.25";
    @l
    private static final String r = "0.5";
    @l
    private static final String s = "1";
    @l
    private static final String t = "1.5";
    @l
    private static final String u = "2";
    @l
    private static final String v = "2";
    @l
    private static final String w = "5";
    @l
    private static final String x = "100";
    @l
    private static final String y = "101";
    @l
    private static final String z = "150";

    static {
        o.c = new a(null);
    }

    public o(@l b o$b0) {
        L.p(o$b0, "youTubePlayerOwner");
        super();
        this.a = o$b0;
        this.b = new Handler(Looper.getMainLooper());
    }

    private final J2.a.a l(String s) {
        if(v.O1(s, "small", true)) {
            return J2.a.a.b;
        }
        if(v.O1(s, "medium", true)) {
            return J2.a.a.c;
        }
        if(v.O1(s, "large", true)) {
            return J2.a.a.d;
        }
        if(v.O1(s, "hd720", true)) {
            return J2.a.a.e;
        }
        if(v.O1(s, "hd1080", true)) {
            return J2.a.a.f;
        }
        if(v.O1(s, "highres", true)) {
            return J2.a.a.g;
        }
        return v.O1(s, "default", true) ? J2.a.a.h : J2.a.a.a;
    }

    private final J2.a.b m(String s) {
        if(v.O1(s, "0.25", true)) {
            return J2.a.b.b;
        }
        if(v.O1(s, "0.5", true)) {
            return J2.a.b.c;
        }
        if(v.O1(s, "1", true)) {
            return J2.a.b.d;
        }
        if(v.O1(s, "1.5", true)) {
            return J2.a.b.e;
        }
        return v.O1(s, "2", true) ? J2.a.b.f : J2.a.b.a;
    }

    private final J2.a.c n(String s) {
        if(v.O1(s, "2", true)) {
            return J2.a.c.b;
        }
        if(v.O1(s, "5", true)) {
            return J2.a.c.c;
        }
        if(v.O1(s, "100", true)) {
            return J2.a.c.d;
        }
        if(v.O1(s, "101", true)) {
            return J2.a.c.e;
        }
        return v.O1(s, "150", true) ? J2.a.c.e : J2.a.c.a;
    }

    private final d o(String s) {
        if(v.O1(s, "UNSTARTED", true)) {
            return d.b;
        }
        if(v.O1(s, "ENDED", true)) {
            return d.c;
        }
        if(v.O1(s, "PLAYING", true)) {
            return d.d;
        }
        if(v.O1(s, "PAUSED", true)) {
            return d.e;
        }
        if(v.O1(s, "BUFFERING", true)) {
            return d.f;
        }
        return v.O1(s, "CUED", true) ? d.g : d.a;
    }

    // 检测为 Lambda 实现
    private static final void p(o o0) [...]

    // 检测为 Lambda 实现
    private static final void q(o o0, J2.a.c a$c0) [...]

    // 检测为 Lambda 实现
    private static final void r(o o0, J2.a.a a$a0) [...]

    // 检测为 Lambda 实现
    private static final void s(o o0, J2.a.b a$b0) [...]

    @JavascriptInterface
    public final boolean sendApiChange() {
        j j0 = () -> {
            L.p(this, "this$0");
            for(Object object0: this.a.getListeners()) {
                ((K2.d)object0).h(this.a.getInstance());
            }
        };
        return this.b.post(j0);
    }

    @JavascriptInterface
    public final void sendError(@l String s) {
        L.p(s, "error");
        m m0 = () -> {
            L.p(this, "this$0");
            L.p(this.n(s), "$playerError");
            for(Object object0: this.a.getListeners()) {
                ((K2.d)object0).g(this.a.getInstance(), this.n(s));
            }
        };
        this.b.post(m0);
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(@l String s) {
        L.p(s, "quality");
        f f0 = () -> {
            L.p(this, "this$0");
            L.p(this.l(s), "$playbackQuality");
            for(Object object0: this.a.getListeners()) {
                ((K2.d)object0).b(this.a.getInstance(), this.l(s));
            }
        };
        this.b.post(f0);
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(@l String s) {
        L.p(s, "rate");
        h h0 = () -> {
            L.p(this, "this$0");
            L.p(this.m(s), "$playbackRate");
            for(Object object0: this.a.getListeners()) {
                ((K2.d)object0).c(this.a.getInstance(), this.m(s));
            }
        };
        this.b.post(h0);
    }

    @JavascriptInterface
    public final boolean sendReady() {
        k k0 = () -> {
            L.p(this, "this$0");
            for(Object object0: this.a.getListeners()) {
                ((K2.d)object0).d(this.a.getInstance());
            }
        };
        return this.b.post(k0);
    }

    @JavascriptInterface
    public final void sendStateChange(@l String s) {
        L.p(s, "state");
        n n0 = () -> {
            L.p(this, "this$0");
            L.p(this.o(s), "$playerState");
            for(Object object0: this.a.getListeners()) {
                ((K2.d)object0).f(this.a.getInstance(), this.o(s));
            }
        };
        this.b.post(n0);
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(@l String s) {
        float f;
        L.p(s, "seconds");
        try {
            f = Float.parseFloat(s);
        }
        catch(NumberFormatException numberFormatException0) {
            numberFormatException0.printStackTrace();
            return;
        }
        J2.d d0 = () -> {
            L.p(this, "this$0");
            for(Object object0: this.a.getListeners()) {
                ((K2.d)object0).a(this.a.getInstance(), f);
            }
        };
        this.b.post(d0);
    }

    @JavascriptInterface
    public final void sendVideoDuration(@l String s) {
        float f;
        L.p(s, "seconds");
        try {
            if(TextUtils.isEmpty(s)) {
                s = "0";
            }
            f = Float.parseFloat(s);
        }
        catch(NumberFormatException numberFormatException0) {
            numberFormatException0.printStackTrace();
            return;
        }
        g g0 = () -> {
            L.p(this, "this$0");
            for(Object object0: this.a.getListeners()) {
                ((K2.d)object0).i(this.a.getInstance(), f);
            }
        };
        this.b.post(g0);
    }

    @JavascriptInterface
    public final boolean sendVideoId(@l String s) {
        L.p(s, "videoId");
        i i0 = () -> {
            L.p(this, "this$0");
            L.p(s, "$videoId");
            for(Object object0: this.a.getListeners()) {
                ((K2.d)object0).e(this.a.getInstance(), s);
            }
        };
        return this.b.post(i0);
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(@l String s) {
        float f;
        L.p(s, "fraction");
        try {
            f = Float.parseFloat(s);
        }
        catch(NumberFormatException numberFormatException0) {
            numberFormatException0.printStackTrace();
            return;
        }
        J2.l l0 = () -> {
            L.p(this, "this$0");
            for(Object object0: this.a.getListeners()) {
                ((K2.d)object0).j(this.a.getInstance(), f);
            }
        };
        this.b.post(l0);
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        e e0 = () -> {
            L.p(this, "this$0");
            this.a.a();
        };
        return this.b.post(e0);
    }

    // 检测为 Lambda 实现
    private static final void t(o o0) [...]

    // 检测为 Lambda 实现
    private static final void u(o o0, d a$d0) [...]

    // 检测为 Lambda 实现
    private static final void v(o o0, float f) [...]

    // 检测为 Lambda 实现
    private static final void w(o o0, float f) [...]

    // 检测为 Lambda 实现
    private static final void x(o o0, String s) [...]

    // 检测为 Lambda 实现
    private static final void y(o o0, float f) [...]

    // 检测为 Lambda 实现
    private static final void z(o o0) [...]
}

