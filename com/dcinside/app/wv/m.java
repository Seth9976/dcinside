package com.dcinside.app.wv;

import android.content.Context;
import android.webkit.WebView;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import com.dcinside.app.post.c0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public final class m {
    public static final class a {
        @l
        public static final a a;

        static {
            a.a = new a();
        }

        public final void a(@y4.m Context context0, @IntRange(from = 0L, to = 100L) int v) {
            if(context0 instanceof c0) {
                ((c0)context0).q3(v);
            }
        }

        public final void b(@y4.m WebView webView0, @IntRange(from = 0L, to = 100L) int v) {
            if(webView0 == null) {
                return;
            }
            Context context0 = webView0.getContext();
            if(context0 instanceof c0 && webView0.getId() == 0x7F0B0C24 && L.g("http://www.dcinside.com/", c.f.c(webView0))) {  // id:read_content_wv_primary
                ((c0)context0).q3(v);
            }
        }

        public final void c(@y4.m WebView webView0, @y4.m String s) {
            if(webView0 == null) {
                return;
            }
            if(webView0.getId() == 0x7F0B0C24 && L.g("http://www.dcinside.com/", s)) {  // id:read_content_wv_primary
                c.f.f(webView0, s);
            }
        }

        public final boolean d(@y4.m WebView webView0) {
            if(webView0 == null) {
                return false;
            }
            Context context0 = webView0.getContext();
            return !(context0 instanceof c0) || webView0.getId() != 0x7F0B0C24 || !L.g("http://www.dcinside.com/", c.f.c(webView0)) ? false : ((c0)context0).b4();  // id:read_content_wv_primary
        }

        public final void e(@y4.m Context context0) {
            if(context0 instanceof c0) {
                ((c0)context0).r3();
            }
        }
    }

    public static enum b {
        STOP_VOICE_IFRAME("javascript:stopVoiceIframe()"),
        CHANGE_FONT_SIZE("javascript:bodyFontSize(%d)"),
        CONTENT_HEIGHT("javascript:wvContentHeight(%d)"),
        SCROLL_CONTENT("javascript:onDcScrollContent(%.1f, %.1f, %d)"),
        POLL_HEIGHT_CHANGE("javascript:onDcVoteHeightChanged(%s, %d, %s)"),
        CAPTURE_WEB_CONTENT("javascript:captureImageGif()"),
        BLUR_REMOVE("javascript:onDcBlurDisable()"),
        CALL_SCRIPT("%s"),
        QUICK_BLOCK("javascript:showQuickAvoidPopup()"),
        IMG_NOTE("javascript:onDcImgNoteShow(%s, %s)");

        @l
        private final String a;
        private static final b[] l;
        private static final kotlin.enums.a m;

        static {
            b.l = arr_m$b;
            L.p(arr_m$b, "entries");
            b.m = new d(arr_m$b);
        }

        private b(String s1) {
            this.a = s1;
        }

        private static final b[] a() [...] // Inlined contents

        public final void b(@l WebView webView0, @l Object[] arr_object) {
            L.p(webView0, "wv");
            L.p(arr_object, "objects");
            if(arr_object.length != 0) {
                Locale locale0 = Locale.KOREA;
                Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
                Object[] arr_object2 = Arrays.copyOf(arr_object1, arr_object1.length);
                String s = String.format(locale0, this.a, arr_object2);
                L.o(s, "format(...)");
                webView0.loadUrl(s);
                return;
            }
            webView0.loadUrl(this.a);
        }

        @l
        public static kotlin.enums.a c() {
            return b.m;
        }

        @l
        public final String d() {
            return this.a;
        }
    }

    public static enum c {
        READ_HASH(0x7F0B0C5F),  // id:read_item_load_hash
        MIN_HEIGHT(0x7F0B1114),  // id:wv_min_height
        LOST1(0x7F0B10CC),  // id:web_monitor_read_lost_issue
        LOST2(0x7F0B10CD),  // id:web_monitor_read_lost_issue2
        READ_URL(0x7F0B0C25),  // id:read_content_wv_url
        VOICE_SHARE_IN_POST(0x7F0B10C6);  // id:voice_share_is_post

        private final int a;
        private static final c[] h;
        private static final kotlin.enums.a i;

        static {
            c.h = arr_m$c;
            L.p(arr_m$c, "entries");
            c.i = new d(arr_m$c);
        }

        private c(@IdRes int v1) {
            this.a = v1;
        }

        private static final c[] a() [...] // Inlined contents

        public final boolean b(@l WebView webView0) {
            L.p(webView0, "wv");
            return webView0.getTag(this.a) != null;
        }

        @y4.m
        public final Object c(@l WebView webView0) {
            L.p(webView0, "wv");
            Object object0 = webView0.getTag(this.a);
            return object0 == null ? null : object0;
        }

        @l
        public static kotlin.enums.a d() {
            return c.i;
        }

        public final void e(@l WebView webView0) {
            L.p(webView0, "wv");
            webView0.setTag(this.a, null);
        }

        public final void f(@l WebView webView0, @l Object object0) {
            L.p(webView0, "wv");
            L.p(object0, "value");
            webView0.setTag(this.a, object0);
        }

        public static void g(c m$c0, WebView webView0, Object object0, int v, Object object1) {
            if(object1 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: set");
            }
            if((v & 2) != 0) {
                object0 = Boolean.TRUE;
            }
            m$c0.f(webView0, object0);
        }
    }

}

