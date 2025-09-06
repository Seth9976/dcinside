package com.dcinside.app.wv;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView.HitTestResult;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import com.dcinside.app.main.HomeActivity;
import com.dcinside.app.perform.e;
import com.dcinside.app.perform.p.a;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Clipboards;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Zk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.zk;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class WebViews {
    public static final class c implements View.OnAttachStateChangeListener, f {
        private boolean a;
        private boolean b;
        private WeakReference c;

        public c(@Nullable VideoEnabledWebView videoEnabledWebView0) {
            this.a = true;
            this.b = true;
            this.c = new WeakReference(videoEnabledWebView0);
            if(videoEnabledWebView0 != null) {
                videoEnabledWebView0.addOnAttachStateChangeListener(this);
                videoEnabledWebView0.setTag(0x7F0B06E6, new WeakReference(this));  // id:life_cycle
            }
        }

        @Override  // com.dcinside.app.wv.f
        public boolean g() {
            WeakReference weakReference0 = this.c;
            if(weakReference0 == null) {
                return false;
            }
            VideoEnabledWebView videoEnabledWebView0 = (VideoEnabledWebView)weakReference0.get();
            return videoEnabledWebView0 != null && videoEnabledWebView0.c();
        }

        @Override  // com.dcinside.app.wv.f
        public void onDestroy() {
            WeakReference weakReference0 = this.c;
            if(weakReference0 == null) {
                return;
            }
            this.a = false;
            VideoEnabledWebView videoEnabledWebView0 = (VideoEnabledWebView)weakReference0.get();
            if(videoEnabledWebView0 != null) {
                WebViews.i(videoEnabledWebView0);
                WebViews.j(videoEnabledWebView0);
                ViewParent viewParent0 = videoEnabledWebView0.getParent();
                if(viewParent0 instanceof ViewGroup) {
                    ((ViewGroup)viewParent0).removeView(videoEnabledWebView0);
                }
                videoEnabledWebView0.setTag(0x7F0B06E6, null);  // id:life_cycle
                videoEnabledWebView0.setTag(0x7F0B02F6, null);  // id:content_wv_context_callback
                try {
                    j.h(videoEnabledWebView0);
                }
                catch(Exception unused_ex) {
                }
                videoEnabledWebView0.stopLoading();
                videoEnabledWebView0.a();
                videoEnabledWebView0.setOnCreateContextMenuListener(null);
                videoEnabledWebView0.removeOnAttachStateChangeListener(this);
                videoEnabledWebView0.setWebViewClient(null);
                videoEnabledWebView0.setWebChromeClient(null);
                videoEnabledWebView0.destroy();
            }
            this.c.clear();
            this.c = null;
        }

        @Override  // com.dcinside.app.wv.f
        public void onPause() {
            WeakReference weakReference0 = this.c;
            if(weakReference0 == null) {
                return;
            }
            this.a = false;
            WebView webView0 = (WebView)weakReference0.get();
            if(webView0 != null) {
                b.b.b(webView0, new Object[0]);
                webView0.onPause();
            }
        }

        @Override  // com.dcinside.app.wv.f
        public void onResume() {
            WeakReference weakReference0 = this.c;
            if(weakReference0 == null) {
                return;
            }
            this.a = true;
            if(this.b) {
                WebView webView0 = (WebView)weakReference0.get();
                if(webView0 != null) {
                    webView0.onResume();
                }
            }
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view0) {
            WeakReference weakReference0 = this.c;
            if(weakReference0 == null) {
                return;
            }
            this.b = true;
            if(this.a) {
                WebView webView0 = (WebView)weakReference0.get();
                if(webView0 != null) {
                    webView0.onResume();
                }
            }
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view0) {
            WeakReference weakReference0 = this.c;
            if(weakReference0 == null) {
                return;
            }
            this.b = false;
            WebView webView0 = (WebView)weakReference0.get();
            if(webView0 != null) {
                webView0.onPause();
            }
        }
    }

    public static final String CONTENT_BASE_URL = "http://www.dcinside.com/";
    public static final String a = "Mozilla/5.0 (Linux; U; Android 4.0.3; ko-kr; LG-L160L Build/IML74K) AppleWebkit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30 dcinside.app";
    public static final String b = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
    public static final String c = "<meta http-equiv=\'Content-Type\' content=\'text/html; charset=utf-8\' /><meta name=\'viewport\' content=\'user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width\' /><meta name=\'format-detection\' content=\'telephone=no\' /><link rel=\'icon\' type=\'image/png\' href=\'data:image/png;base64,iVBORw0KGgo=\' />";
    static final String d = "<style>:root {--dc-series-bg: %s;--dc-body-txt-color: %s;--dc-body-link-color: %s;--dc-og-border-color: %s;--dc-og-link-color: %s;--dc-img-note-line: %s}</style>";
    static final String e = "<style>span > a:active {color: %s;background-color: %s;}</style>";
    static final String f = "<script>document.querySelector(\'.dc_voice_folder_img_wrap\').addEventListener(\'click\', function(e) {e.stopPropagation();});document.querySelector(\'.dc_voice_folder_text\').addEventListener(\'click\', function(e) {e.stopPropagation();});</script>";
    private static final int[] g;

    static {
        WebViews.g = new int[5];
    }

    // 检测为 Lambda 实现
    public static Boolean d(Boolean boolean0) [...]

    public static String h(String s) {
        org.jsoup.nodes.f f0 = Dl.A(s);
        f0.p3().C0("<meta http-equiv=\'Content-Type\' content=\'text/html; charset=utf-8\' /><meta name=\'viewport\' content=\'user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width\' /><meta name=\'format-detection\' content=\'telephone=no\' /><link rel=\'icon\' type=\'image/png\' href=\'data:image/png;base64,iVBORw0KGgo=\' />");
        f0.c3().L0("style", "margin:0;padding:0;max-width:100%%;word-wrap:break-word;");
        return f0.toString();
    }

    public static void i(@Nullable WebView webView0) {
        if(webView0 != null) {
            Object object0 = webView0.getTag(0x7F0B10CB);  // id:web_load_data_callback
            if(object0 instanceof Runnable) {
                webView0.removeCallbacks(((Runnable)object0));
                webView0.setTag(0x7F0B10CB, null);  // id:web_load_data_callback
            }
        }
    }

    public static void j(@Nullable WebView webView0) {
        if(webView0 != null) {
            com.dcinside.app.wv.m.c m$c0 = com.dcinside.app.wv.m.c.d;
            Runnable runnable0 = (Runnable)m$c0.c(webView0);
            if(runnable0 != null) {
                webView0.removeCallbacks(runnable0);
                m$c0.e(webView0);
            }
            com.dcinside.app.wv.m.c m$c1 = com.dcinside.app.wv.m.c.e;
            Runnable runnable1 = (Runnable)m$c1.c(webView0);
            if(runnable1 != null) {
                webView0.removeCallbacks(runnable1);
                m$c1.e(webView0);
                Arrays.fill(WebViews.g, 0);
            }
        }
    }

    public static void k(WebView webView0) {
        com.dcinside.app.wv.m.c.f.e(webView0);
        webView0.loadUrl("about:blank");
    }

    @Nullable
    static String l(@Nullable WebView webView0) {
        WebView.HitTestResult webView$HitTestResult0;
        if(webView0 == null) {
            webView$HitTestResult0 = null;
        }
        else {
            try {
                webView$HitTestResult0 = webView0.getHitTestResult();
            }
            catch(Exception exception0) {
                timber.log.b.B(exception0);
                webView$HitTestResult0 = null;
            }
        }
        String s = webView$HitTestResult0 == null ? null : webView$HitTestResult0.getExtra();
        if(s == null) {
            return null;
        }
        switch(webView$HitTestResult0.getType()) {
            case 5: {
                return s.startsWith("http") ? s : null;
            }
            case 7: {
                if(s.startsWith("http://www.dcinside.com/#")) {
                    String s1 = s.substring(25);
                    return s1.startsWith("http") ? s1 : null;
                }
                Clipboards.a.b(0x7F15021B, "목록 복사", s);  // string:copy_gallery_url_to_clipboard "주소가 복사되었습니다."
                return null;
            }
            default: {
                return null;
            }
        }
    }

    // 检测为 Lambda 实现
    private static void m(WebView webView0, int v, String s, String s1) [...]

    // 检测为 Lambda 实现
    private static Object n(a p$a0) [...]

    private static Boolean o(Boolean boolean0) [...] // Inlined contents

    // 检测为 Lambda 实现
    private static void p(AppCompatActivity appCompatActivity0, String s, int v, Boolean boolean0) [...]

    // 检测为 Lambda 实现
    private static void q(AppCompatActivity appCompatActivity0, Throwable throwable0) [...]

    public static void r(WebView webView0, String s) {
        WebViews.t(webView0, "about:blank", s, -1);
    }

    public static void s(WebView webView0, String s, int v) {
        WebViews.t(webView0, "about:blank", s, v);
    }

    public static void t(WebView webView0, String s, String s1, int v) {
        Object object0 = webView0.getTag(0x7F0B10CB);  // id:web_load_data_callback
        if(object0 instanceof Runnable) {
            webView0.removeCallbacks(((Runnable)object0));
        }
        t t0 = () -> {
            try {
                webView0.stopLoading();
            }
            catch(Exception exception0) {
                timber.log.b.B(exception0);
                zk.a(exception0);
            }
            try {
                if(v >= 0) {
                    com.dcinside.app.view.tool.j.h(webView0, v);
                }
                if(m0.a.i(s1)) {
                    webView0.loadUrl("about:blank");
                    return;
                }
                webView0.loadDataWithBaseURL(s, s1, "text/html; charset=UTF-8", "utf-8", null);
                return;
            }
            catch(Exception exception1) {
            }
            timber.log.b.B(exception1);
            zk.a(exception1);
            try {
                webView0.loadUrl("about:blank");
            }
            catch(Exception exception2) {
                timber.log.b.B(exception2);
                zk.a(exception2);
            }
        };
        webView0.setTag(0x7F0B10CB, t0);  // id:web_load_data_callback
        webView0.post(t0);
    }

    public static void u(WebView webView0, String s, int v) {
        class com.dcinside.app.wv.WebViews.a implements Runnable {
            final WebView a;
            final String b;
            final int c;

            com.dcinside.app.wv.WebViews.a(WebView webView0, String s, int v) {
                this.b = s;
                this.c = v;
                super();
            }

            @Override
            public void run() {
                if(((Runnable)com.dcinside.app.wv.m.c.d.c(this.a)) != this) {
                    return;
                }
                WebViews.v(this.a, this.b, this.c);
            }
        }


        class com.dcinside.app.wv.WebViews.b implements Runnable {
            final WebView a;
            final String b;
            final int c;

            com.dcinside.app.wv.WebViews.b(WebView webView0, String s, int v) {
                this.b = s;
                this.c = v;
                super();
            }

            @Override
            public void run() {
                com.dcinside.app.wv.m.c m$c0 = com.dcinside.app.wv.m.c.e;
                if(((Runnable)m$c0.c(this.a)) != this) {
                    return;
                }
                m$c0.e(this.a);
                if(WebViews.w(1)) {
                    WebViews.v(this.a, this.b, this.c);
                }
            }
        }

        com.dcinside.app.wv.m.c m$c0 = com.dcinside.app.wv.m.c.d;
        Runnable runnable0 = (Runnable)m$c0.c(webView0);
        if(runnable0 != null) {
            webView0.removeCallbacks(runnable0);
        }
        com.dcinside.app.wv.m.c m$c1 = com.dcinside.app.wv.m.c.e;
        Runnable runnable1 = (Runnable)m$c1.c(webView0);
        if(runnable1 != null) {
            webView0.removeCallbacks(runnable1);
        }
        com.dcinside.app.wv.WebViews.a webViews$a0 = new com.dcinside.app.wv.WebViews.a(webView0, s, v);
        m$c0.f(webView0, webViews$a0);
        webView0.postDelayed(webViews$a0, 7000L);
        com.dcinside.app.wv.WebViews.b webViews$b0 = new com.dcinside.app.wv.WebViews.b(webView0, s, v);
        m$c1.f(webView0, webViews$b0);
        webView0.postDelayed(webViews$b0, 3000L);
    }

    private static void v(WebView webView0, String s, int v) {
        Arrays.fill(WebViews.g, 0);
        com.dcinside.app.wv.m.c.d.e(webView0);
        com.dcinside.app.wv.m.c.e.e(webView0);
        AppCompatActivity appCompatActivity0 = (AppCompatActivity)Al.h(webView0.getContext());
        if(appCompatActivity0 == null) {
            System.exit(0);
            return;
        }
        dl.a.q6(System.currentTimeMillis());
        e.s(appCompatActivity0).n((a p$a0) -> {
            p$a0.m(0x7F150724);  // string:open_read_when_restart_title "시스템이 응답하지 않아 본문 내용을 표시할 수 없습니다.\n앱을 재시작하시겠습니까?"
            return p$a0.d(false);
        }).x(0x1040000).z(0x7F150723).b().Z1((Boolean boolean0) -> boolean0).y5((Boolean boolean0) -> {
            if(jl.a.H0()) {
                zk.a(new com.dcinside.app.http.f("read wv does not respond"));
            }
            Intent intent0 = new Intent(appCompatActivity0, HomeActivity.class);
            intent0.setAction("com.dcinside.app.action.OPEN_READ_WHEN_RESTART");
            intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", s);
            intent0.putExtra("com.dcinside.app.extra.POST_NUMBER", v);
            PendingIntent pendingIntent0 = PendingIntent.getActivity(appCompatActivity0, 0x405, intent0, Zk.e.d());
            ((AlarmManager)appCompatActivity0.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + 1000L, pendingIntent0);
            appCompatActivity0.setResult(0);
            ActivityCompat.c(appCompatActivity0);
            System.runFinalization();
            System.exit(0);
        }, (Throwable throwable0) -> {
            ActivityCompat.c(appCompatActivity0);
            System.runFinalization();
            System.exit(0);
        });
    }

    private static boolean w(int v) {
        int[] arr_v = WebViews.g;
        System.arraycopy(arr_v, 1, arr_v, 0, arr_v.length - 1);
        arr_v[arr_v.length - 1] = v;
        if(v > 0) {
            int v2 = 0;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                if(arr_v[v1] > 0) {
                    ++v2;
                }
            }
            return v2 >= 3;
        }
        return false;
    }
}

