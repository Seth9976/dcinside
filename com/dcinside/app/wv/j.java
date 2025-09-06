package com.dcinside.app.wv;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.auth.LoginActivity;
import com.dcinside.app.image.f0;
import com.dcinside.app.read.tools.a;
import com.dcinside.app.read.tools.s;
import com.dcinside.app.read.x;
import com.dcinside.app.rx.bus.H;
import com.dcinside.app.rx.bus.L;
import com.dcinside.app.rx.bus.M;
import com.dcinside.app.rx.bus.N;
import com.dcinside.app.rx.bus.O;
import com.dcinside.app.rx.bus.a0;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.d;
import com.dcinside.app.rx.bus.l;
import com.dcinside.app.rx.bus.m;
import com.dcinside.app.rx.bus.q0;
import com.dcinside.app.rx.bus.r;
import com.dcinside.app.rx.bus.t0;
import com.dcinside.app.rx.bus.v;
import com.dcinside.app.rx.bus.w;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.dl;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.S0;
import org.json.JSONObject;
import timber.log.b;

public final class j implements Handler.Callback {
    private WeakReference a;
    private Handler b;
    private boolean c;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 4;
    private static final int i = 5;
    private static final int j = 6;
    private static final int k = 7;
    private static final int l = 8;
    private static final int m = 9;
    private static final int n = 10;
    private static final int o = 11;
    private static final String p = "EXTRA_IMAGE_IDX";

    private j(WebView webView0) {
        this.b = new Handler(Looper.getMainLooper(), this);
        this.c = false;
        this.a = new WeakReference(webView0);
    }

    @JavascriptInterface
    public void acceptBlockImageShown(String s, String s1) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        WebView webView0 = (WebView)weakReference0.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        if(!(viewParent0 instanceof ViewGroup)) {
            return;
        }
        Context context0 = ((ViewGroup)viewParent0).getContext();
        if(context0 instanceof AppCompatActivity) {
            c.a(context0, new d(s, s1));
        }
    }

    @SuppressLint({"AddJavascriptInterface"})
    public static j b(WebView webView0) {
        j j0 = (j)webView0.getTag(0x7F0B1113);  // id:wv_callback
        if(j0 == null) {
            synchronized(j.class) {
                j0 = (j)webView0.getTag(0x7F0B1113);  // id:wv_callback
                if(j0 == null) {
                    j0 = new j(webView0);
                    webView0.setTag(0x7F0B1113, j0);  // id:wv_callback
                    webView0.addJavascriptInterface(j0, "DcJsCallback");
                }
            }
        }
        return j0;
    }

    @JavascriptInterface
    public void blockDccon(String s, String s1, boolean z) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        WebView webView0 = (WebView)weakReference0.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        if(!(viewParent0 instanceof ViewGroup)) {
            return;
        }
        Context context0 = ((ViewGroup)viewParent0).getContext();
        if(context0 instanceof AppCompatActivity) {
            c.a(context0, new l(Long.parseLong(s1), s, z, 0));
        }
    }

    @JavascriptInterface
    public void buyDccon(String s) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        WebView webView0 = (WebView)weakReference0.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        if(!(viewParent0 instanceof ViewGroup)) {
            return;
        }
        Context context0 = ((ViewGroup)viewParent0).getContext();
        if(context0 instanceof AppCompatActivity) {
            c.a(context0, new m(s));
        }
    }

    @Nullable
    public static j c(WebView webView0) {
        return (j)webView0.getTag(0x7F0B1113);  // id:wv_callback
    }

    @JavascriptInterface
    public void closeWebPage() {
        Handler handler0 = this.b;
        if(handler0 != null) {
            handler0.sendEmptyMessage(7);
        }
    }

    public void d(boolean z, int v, int v1) {
        try {
            Handler handler0 = this.b;
            if(handler0 == null) {
                return;
            }
            if(z) {
                Message message0 = handler0.obtainMessage(1, v1, 0);
                this.b.sendMessageDelayed(message0, ((long)v));
                return;
            }
            if(!handler0.hasMessages(0)) {
                Message message1 = this.b.obtainMessage(0, v1, 0);
                this.b.sendMessageDelayed(message1, ((long)v));
            }
        }
        catch(Exception exception0) {
            b.B(exception0);
        }
    }

    @JavascriptInterface
    public boolean dcJsCallbackBlurClear() {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return true;
        }
        WebView webView0 = (WebView)weakReference0.get();
        if(webView0 == null) {
            return true;
        }
        s s0 = (s)webView0.getTag(0x7F0B02F6);  // id:content_wv_context_callback
        return s0 == null ? false : s0.d0();
    }

    @JavascriptInterface
    public void dcJsCallbackCaptureAvailable() {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        if(((WebView)weakReference0.get()) == null) {
            return;
        }
        this.c = true;
    }

    @JavascriptInterface
    public void dcJsCallbackImgNoteOpen(String s, String s1) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        WebView webView0 = (WebView)weakReference0.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        if(!(viewParent0 instanceof ViewGroup)) {
            return;
        }
        Context context0 = ((ViewGroup)viewParent0).getContext();
        if(context0 instanceof AppCompatActivity) {
            c.a(context0, new v(s, s1, -1));
        }
    }

    @JavascriptInterface
    public void dcJsCallbackImgNoteRequest(String s, boolean z) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        WebView webView0 = (WebView)weakReference0.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        if(!(viewParent0 instanceof ViewGroup)) {
            return;
        }
        Context context0 = ((ViewGroup)viewParent0).getContext();
        if(context0 instanceof AppCompatActivity) {
            c.a(context0, new w(s, z));
        }
    }

    @JavascriptInterface
    public void dcJsCallbackZoomEnd() {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        WebView webView0 = (WebView)weakReference0.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        if(!(viewParent0 instanceof ViewGroup)) {
            return;
        }
        Context context0 = ((ViewGroup)viewParent0).getContext();
        if(context0 instanceof AppCompatActivity) {
            c.a(context0, new L());
        }
    }

    @JavascriptInterface
    public void dcJsCallbackZoomStart() {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        WebView webView0 = (WebView)weakReference0.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        if(!(viewParent0 instanceof ViewGroup)) {
            return;
        }
        Context context0 = ((ViewGroup)viewParent0).getContext();
        if(context0 instanceof AppCompatActivity) {
            c.a(context0, new M());
        }
    }

    @JavascriptInterface
    public void downloadDccon(String s, String s1) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        WebView webView0 = (WebView)weakReference0.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        if(!(viewParent0 instanceof ViewGroup)) {
            return;
        }
        Context context0 = ((ViewGroup)viewParent0).getContext();
        if(context0 instanceof AppCompatActivity) {
            c.a(context0, new r(s1, s));
        }
    }

    public boolean e() {
        return this.c;
    }

    // 检测为 Lambda 实现
    private static S0 f(Integer integer0, Integer integer1, Intent intent0) [...]

    public void g() {
        try {
            this.i();
            this.b = null;
            WeakReference weakReference0 = this.a;
            if(weakReference0 != null) {
                WebView webView0 = (WebView)weakReference0.get();
                if(webView0 != null) {
                    webView0.removeJavascriptInterface("DcJsCallback");
                    webView0.setTag(0x7F0B1113, null);  // id:wv_callback
                }
                this.a.clear();
                this.a = null;
            }
        }
        catch(Exception exception0) {
            b.B(exception0);
        }
    }

    @JavascriptInterface
    public String getDisplayTopAndBottom() {
        RecyclerView recyclerView0;
        try {
            WebView webView0 = (WebView)this.a.get();
            if(webView0 == null) {
                return "";
            }
            if(!(webView0 instanceof VideoEnabledWebView)) {
                recyclerView0 = (RecyclerView)webView0.getParent();
            }
            else if(((VideoEnabledWebView)webView0).getWeakParentRecyclerView() == null) {
                recyclerView0 = null;
            }
            else {
                recyclerView0 = (RecyclerView)((VideoEnabledWebView)webView0).getWeakParentRecyclerView().get();
            }
            if(recyclerView0 == null) {
                return "";
            }
            int v = webView0.getTop();
            int v1 = recyclerView0.getBottom();
            int v2 = recyclerView0.getTop();
            return new JSONObject().put("top", ((double)Dk.l(Math.max(0.0f - ((float)v), 0.0f)))).put("bot", ((double)Dk.l(((float)(v1 - v2 - v)) + 100.0f))).toString();
        }
        catch(Exception exception0) {
        }
        b.B(exception0);
        return "";
    }

    public static void h(WebView webView0) {
        j j0 = (j)webView0.getTag(0x7F0B1113);  // id:wv_callback
        if(j0 != null) {
            j0.g();
        }
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(@y4.l Message message0) {
        try {
            WeakReference weakReference0 = this.a;
            if(weakReference0 == null) {
                return false;
            }
            WebView webView0 = (WebView)weakReference0.get();
            switch(message0.what) {
                case 0: 
                case 1: {
                    if(webView0 != null) {
                        com.dcinside.app.wv.m.b.d.b(webView0, new Object[]{message0.arg1});
                    }
                    return true;
                }
                case 2: {
                    Bundle bundle0 = message0.getData();
                    if(webView0 != null && bundle0 != null) {
                        a a0 = (a)webView0.getTag(0x7F0B02F6);  // id:content_wv_context_callback
                        if(a0 == null) {
                            return true;
                        }
                        String s = a0.a(bundle0.getInt("EXTRA_IMAGE_IDX", -1));
                        if(s == null) {
                            s = WebViews.l(webView0);
                        }
                        if(s == null || s.isEmpty() || !(webView0.getParent() instanceof ViewGroup)) {
                            return true;
                        }
                        a0.c(s, false, f0.a);
                    }
                    return true;
                }
                case 3: {
                    ViewParent viewParent0 = webView0.getParent();
                    if(!(viewParent0 instanceof ViewGroup)) {
                        return true;
                    }
                    c.a(((ViewGroup)viewParent0).getContext(), new H(3));
                    return true;
                }
                case 4: {
                    Integer integer0 = (Integer)com.dcinside.app.wv.m.c.c.c(webView0);
                    int v = integer0 == null ? 0 : ((int)integer0);
                    Integer integer1 = (Integer)com.dcinside.app.wv.m.c.b.c(webView0);
                    if((integer1 == null ? 0 : ((int)integer1)) == message0.arg1) {
                        int v1 = Math.max(Math.max(message0.arg2, Dk.d(webView0.getContentHeight())), v);
                        if(webView0.getHeight() != v1) {
                            com.dcinside.app.view.tool.j.h(webView0, v1);
                        }
                    }
                    return true;
                }
                case 5: {
                    ViewParent viewParent1 = webView0.getParent();
                    if(!(viewParent1 instanceof ViewGroup)) {
                        return true;
                    }
                    Context context0 = Al.h(((ViewGroup)viewParent1).getContext());
                    if(!(context0 instanceof AppCompatActivity)) {
                        return true;
                    }
                    c.a(context0, new q0(1, new Object[]{com.dcinside.app.internal.c.b(message0.obj.toString())}));
                    return true;
                }
                case 6: {
                    if(webView0 == null) {
                        return true;
                    }
                    ViewParent viewParent2 = webView0.getParent();
                    if(!(viewParent2 instanceof RecyclerView)) {
                        return true;
                    }
                    Context context1 = ((RecyclerView)viewParent2).getContext();
                    ViewHolder recyclerView$ViewHolder0 = ((RecyclerView)viewParent2).findContainingViewHolder(webView0);
                    if(recyclerView$ViewHolder0 instanceof com.dcinside.app.read.holder.l) {
                        int v2 = recyclerView$ViewHolder0.getBindingAdapterPosition();
                        if(v2 < 0) {
                            return true;
                        }
                        x x0 = (x)((RecyclerView)viewParent2).getAdapter();
                        if(x0 == null) {
                            return true;
                        }
                        com.dcinside.app.response.j j0 = x0.Q(v2).g();
                        if(j0 != null && !j0.i0()) {
                            c.a(context1, new a0(1, v2, j0, true));
                        }
                    }
                    return true;
                }
                case 7: {
                    ViewParent viewParent3 = webView0.getParent();
                    if(!(viewParent3 instanceof ViewGroup)) {
                        return true;
                    }
                    Context context2 = ((ViewGroup)viewParent3).getContext();
                    if(context2 instanceof AppCompatActivity) {
                        ((AppCompatActivity)context2).finish();
                    }
                    return true;
                }
                case 8: {
                    String s1 = message0.obj.toString();
                    if(webView0 != null) {
                        com.dcinside.app.wv.m.b.i.b(webView0, new Object[]{s1});
                    }
                    return true;
                }
                case 9: {
                    if(webView0 != null) {
                        ViewParent viewParent4 = webView0.getParent();
                        if(!(viewParent4 instanceof ViewGroup)) {
                            return true;
                        }
                        c.a(((ViewGroup)viewParent4).getContext(), new O(message0.obj.toString()));
                    }
                    return true;
                }
                case 10: {
                    this.hideImageNumGuide();
                    return true;
                }
                case 11: {
                    if(webView0 != null) {
                        int v3 = Dk.d(message0.arg1);
                        int v4 = Math.max(v3, 1);
                        if(webView0.getHeight() != v4) {
                            com.dcinside.app.view.tool.j.h(webView0, v4);
                        }
                        com.dcinside.app.ad.naver.b b0 = (com.dcinside.app.ad.naver.b)webView0.getTag(0x7F0B02F6);  // id:content_wv_context_callback
                        if(b0 == null) {
                            return true;
                        }
                        b0.onAdLoaded(v3);
                    }
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        catch(Exception exception0) {
        }
        b.B(exception0);
        return false;
    }

    @JavascriptInterface
    public void hideImageNumGuide() {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        WebView webView0 = (WebView)weakReference0.get();
        if(webView0 == null) {
            return;
        }
        webView0.getParent();
        dl.a.e5(3);
    }

    public void i() {
        Handler handler0 = this.b;
        if(handler0 != null) {
            handler0.removeCallbacksAndMessages(null);
        }
    }

    private void j(boolean z) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        WebView webView0 = (WebView)weakReference0.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        if(viewParent0 != null) {
            viewParent0 = viewParent0.getParent();
        }
        if(viewParent0 instanceof RecyclerView) {
            ((RecyclerView)viewParent0).suppressLayout(z);
        }
    }

    @JavascriptInterface
    public void jsLog(@Nullable String s) {
        b.l("jsLog: %s", new Object[]{s});
    }

    @JavascriptInterface
    public void naver_ad_frame(int v) {
        Handler handler0 = this.b;
        if(handler0 != null) {
            Message message0 = handler0.obtainMessage(11, v, 0);
            this.b.sendMessageDelayed(message0, 200L);
        }
    }

    @JavascriptInterface
    public void nestedTouchEnd() {
        this.j(false);
    }

    @JavascriptInterface
    public void nestedTouchStart() {
        this.j(true);
    }

    @JavascriptInterface
    public void onArchiveReply(String s) {
        Handler handler0 = this.b;
        if(handler0 != null) {
            handler0.obtainMessage(5, s).sendToTarget();
        }
    }

    @JavascriptInterface
    public void onDownloadVoice(String s) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        WebView webView0 = (WebView)weakReference0.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        if(!(viewParent0 instanceof ViewGroup)) {
            return;
        }
        Context context0 = Al.h(((ViewGroup)viewParent0).getContext());
        if(context0 instanceof AppCompatActivity) {
            c.a(context0, new q0(2, new Object[]{s}));
        }
    }

    @JavascriptInterface
    public void onHeight(int v, float f) {
        Handler handler0 = this.b;
        if(handler0 != null) {
            handler0.obtainMessage(4, v, ((int)f)).sendToTarget();
        }
    }

    @JavascriptInterface
    public void onImageClicked(int v) {
        if(this.b != null) {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("EXTRA_IMAGE_IDX", v - 1);
            Message message0 = this.b.obtainMessage(2);
            message0.setData(bundle0);
            message0.sendToTarget();
        }
    }

    @JavascriptInterface
    public void onLoadResource(int v, int v1, int v2) {
        try {
            WeakReference weakReference0 = this.a;
            if(weakReference0 == null) {
                return;
            }
            WebView webView0 = (WebView)weakReference0.get();
            if(webView0 != null && webView0.getTag(0x7F0B10CA) == null) {  // id:web_fixed_size
                if(!(webView0 instanceof VideoEnabledWebView)) {
                    this.onHeight(v, ((float)v1));
                    return;
                }
                com.dcinside.app.wv.c c0 = ((VideoEnabledWebView)webView0).getContentClient();
                if(c0 != null && c0.a() == v) {
                    this.onHeight(v, ((float)v1));
                }
            }
        }
        catch(Exception exception0) {
            b.B(exception0);
        }
    }

    @JavascriptInterface
    public void onVoiceBodyClicked() {
        Handler handler0 = this.b;
        if(handler0 != null) {
            handler0.sendEmptyMessage(6);
        }
    }

    @JavascriptInterface
    public void onWinnerta() {
        Handler handler0 = this.b;
        if(handler0 != null) {
            handler0.sendEmptyMessage(3);
        }
    }

    @JavascriptInterface
    public void showVoteImg(String s) {
        Handler handler0 = this.b;
        if(handler0 != null) {
            Message message0 = handler0.obtainMessage(9, s);
            this.b.sendMessageDelayed(message0, 150L);
        }
    }

    @JavascriptInterface
    public int topOfView() {
        RecyclerView recyclerView0 = null;
        WebView webView0 = this.a == null ? null : ((WebView)this.a.get());
        if(webView0 == null) {
            return 0;
        }
        if(!(webView0 instanceof VideoEnabledWebView)) {
            recyclerView0 = (RecyclerView)webView0.getParent();
        }
        else if(((VideoEnabledWebView)webView0).getWeakParentRecyclerView() != null) {
            return ((RecyclerView)((VideoEnabledWebView)webView0).getWeakParentRecyclerView().get()) == null ? 0 : webView0.getTop();
        }
        return recyclerView0 == null ? 0 : webView0.getTop();
    }

    @JavascriptInterface
    public void voice_share(String s) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        WebView webView0 = (WebView)weakReference0.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        if(!(viewParent0 instanceof ViewGroup)) {
            return;
        }
        Context context0 = Al.h(((ViewGroup)viewParent0).getContext());
        if(context0 instanceof AppCompatActivity) {
            Boolean boolean0 = (Boolean)com.dcinside.app.wv.m.c.g.c(webView0);
            c.a(context0, new t0(s, (boolean0 == null ? false : boolean0.booleanValue())));
        }
    }

    @JavascriptInterface
    public void votefinish_pw(String s, String s1) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        ViewParent viewParent0 = ((WebView)weakReference0.get()).getParent();
        if(!(viewParent0 instanceof ViewGroup)) {
            return;
        }
        Context context0 = ((ViewGroup)viewParent0).getContext();
        if(context0 instanceof AppCompatActivity) {
            c.a(context0, new N(s1, s));
        }
    }

    @JavascriptInterface
    public void voteframe(String s, int v) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        WebView webView0 = (WebView)weakReference0.get();
        if(webView0 == null) {
            return;
        }
        Object object0 = com.dcinside.app.wv.m.c.b.c(webView0);
        String s1 = String.format(Locale.KOREA, "javascript:onDcVoteHeightChanged(%s, %d, %s)", s, v, object0);
        Handler handler0 = this.b;
        if(handler0 != null) {
            Message message0 = handler0.obtainMessage(8, s1);
            this.b.sendMessageDelayed(message0, 150L);
        }
    }

    @JavascriptInterface
    public void votelogin() {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        ViewParent viewParent0 = ((WebView)weakReference0.get()).getParent();
        if(!(viewParent0 instanceof ViewGroup)) {
            return;
        }
        Context context0 = ((ViewGroup)viewParent0).getContext();
        if(context0 instanceof AppCompatActivity) {
            com.dcinside.app.base.d.z1(((AppCompatActivity)context0), LoginActivity.N1(((AppCompatActivity)context0), false), 0x403, (Integer integer0, Integer integer1, Intent intent0) -> S0.a);
        }
    }
}

