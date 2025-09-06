package com.gomfactory.adpie.sdk.ui.webview;

import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.common.AdRequest;
import com.gomfactory.adpie.sdk.network.NetworkServiceManager;
import com.gomfactory.adpie.sdk.pref.Preference;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import java.util.Date;

public class AdWebView extends WebView {
    class WebViewClientClass extends WebViewClient {
        private WebViewClientClass() {
        }

        WebViewClientClass(com.gomfactory.adpie.sdk.ui.webview.AdWebView.1 adWebView$10) {
        }

        @Override  // android.webkit.WebViewClient
        public void onLoadResource(WebView webView0, String s) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("AdWebView", "WebViewClient - onLoadResource : " + s);
            }
            super.onLoadResource(webView0, s);
        }

        @Override  // android.webkit.WebViewClient
        public void onPageFinished(WebView webView0, String s) {
            try {
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    if(AdWebView.this.mStartDate == null) {
                        AdPieLog.d("AdWebView", "WebViewClient - onPageFinished : " + s);
                    }
                    else {
                        AdPieLog.d("AdWebView", "WebViewClient - onPageFinished : " + s + ", delayTime : " + (new Date().getTime() - AdWebView.this.mStartDate.getTime()) / 1000L);
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            if(!AdWebView.this.mIsFinished) {
                try {
                    AdWebView.this.mIsFinished = true;
                    AdWebView.this.removeCallback();
                    if(AdWebView.this.mWebViewEventListener != null) {
                        AdWebView.this.mWebViewEventListener.onPageFinished();
                    }
                }
                catch(Exception exception0) {
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.e("AdWebView", exception0);
                    }
                }
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onReceivedError(WebView webView0, int v, String s, String s1) {
            try {
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("AdWebView", "WebViewClient - onReceivedError : " + s1 + ", errorCode : " + v);
                }
            }
            catch(Exception unused_ex) {
            }
            super.onReceivedError(webView0, v, s, s1);
        }

        @Override  // android.webkit.WebViewClient
        @RequiresApi(api = 23)
        public void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
            try {
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("AdWebView", "WebViewClient - onReceivedError : " + webResourceRequest0.getUrl().toString() + ", errorCode : " + webResourceError0.getErrorCode());
                }
            }
            catch(Exception unused_ex) {
            }
            super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
        }

        @Override  // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
            if(Build.VERSION.SDK_INT < 26) {
                return false;
            }
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("AdWebView", "WebViewClient - onRenderProcessGone");
            }
            super.onRenderProcessGone(webView0, renderProcessGoneDetail0);
            if(webView0 != null) {
                try {
                    if(webView0.getParent() instanceof ViewGroup) {
                        ((ViewGroup)webView0.getParent()).removeView(webView0);
                    }
                    webView0.onPause();
                    webView0.destroy();
                }
                catch(Exception unused_ex) {
                }
            }
            return true;
        }

        @Override  // android.webkit.WebViewClient
        @RequiresApi(api = 24)
        public boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
            String s = webResourceRequest0.getUrl().toString();
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("AdWebView", "WebViewClient - shouldOverrideUrlLoading[N] : " + s);
            }
            AdWebView.this.goToBrowser(webView0, s);
            return true;
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("AdWebView", "WebViewClient - shouldOverrideUrlLoading : " + s);
            }
            AdWebView.this.goToBrowser(webView0, s);
            return true;
        }
    }

    public class WebViewClientInChromeClient extends WebViewClientClass {
        public WebViewClientInChromeClient() {
            super(null);
        }

        @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewClientClass
        public void onLoadResource(WebView webView0, String s) {
            super.onLoadResource(webView0, s);
        }

        @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewClientClass
        public void onPageFinished(WebView webView0, String s) {
        }

        @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewClientClass
        public void onReceivedError(WebView webView0, int v, String s, String s1) {
            super.onReceivedError(webView0, v, s, s1);
        }

        @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewClientClass
        @RequiresApi(api = 23)
        public void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
            super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
        }

        @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewClientClass
        public boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
            return super.onRenderProcessGone(webView0, renderProcessGoneDetail0);
        }

        @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewClientClass
        @RequiresApi(api = 24)
        public boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
            return super.shouldOverrideUrlLoading(webView0, webResourceRequest0);
        }

        @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewClientClass
        public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
            return super.shouldOverrideUrlLoading(webView0, s);
        }
    }

    public interface WebViewEventListener {
        void onPageDelayed();

        void onPageFinished();

        void onUserClick(String arg1);
    }

    public static final String TAG = "AdWebView";
    private Context mContext;
    private Handler mHandler;
    private String mHtmlData;
    private boolean mIsDestroyed;
    private boolean mIsFinished;
    private boolean mIsWebviewLoadingSkip;
    private int mMonitoring;
    private Date mStartDate;
    private WebViewEventListener mWebViewEventListener;
    private boolean mWebViewPressed;

    static {
    }

    public AdWebView(Context context0) {
        super(context0);
        this.mContext = context0;
        this.init();
    }

    @Override  // android.webkit.WebView
    public void destroy() {
        this.onPause();
        this.removeCallback();
        this.mWebViewEventListener = null;
        if(this.mIsDestroyed) {
            return;
        }
        if(this.getParent() instanceof ViewGroup) {
            ((ViewGroup)this.getParent()).removeView(this);
        }
        this.mIsDestroyed = true;
        this.removeAllViews();
        super.destroy();
    }

    private void goToBrowser(WebView webView0, String s) {
        try {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("AdWebView", "goToBrowser - url : " + s + ", monitoring : " + this.mMonitoring);
            }
            if(webView0 != null) {
                webView0.stopLoading();
            }
            if(!this.mWebViewPressed) {
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("AdWebView", "block goToBrowser - url : " + s + ", monitoring : " + this.mMonitoring);
                }
                switch(this.mMonitoring) {
                    case 1: {
                        this.sendAutoScriptCode(s);
                        goto label_13;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        this.sendAutoScriptCode(s);
                        break;
                    }
                    default: {
                        goto label_13;
                    }
                }
                return;
            }
        label_13:
            WebViewEventListener adWebView$WebViewEventListener0 = this.mWebViewEventListener;
            if(adWebView$WebViewEventListener0 != null) {
                adWebView$WebViewEventListener0.onUserClick(s);
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.e("AdWebView", exception0);
        }
    }

    private void init() {
        this.mIsFinished = false;
        this.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.setBackgroundColor(0);
        int v = Build.VERSION.SDK_INT;
        this.setLayerType(2, null);
        this.setScrollBarStyle(0x2000000);
        this.setVerticalScrollBarEnabled(false);
        this.setHorizontalScrollBarEnabled(false);
        this.setOnTouchListener(new View.OnTouchListener() {
            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("AdWebView", "Touch :  " + motionEvent0.getAction());
                }
                if(motionEvent0.getAction() == 1) {
                    AdWebView.this.mWebViewPressed = true;
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            AdWebView.this.mWebViewPressed = false;
                        }
                    }, 1000L);
                }
                return motionEvent0.getAction() == 2;
            }
        });
        this.getSettings().setJavaScriptEnabled(true);
        this.getSettings().setSupportMultipleWindows(true);
        this.getSettings().setDefaultTextEncodingName("utf-8");
        this.getSettings().setAllowFileAccess(false);
        this.getSettings().setAllowContentAccess(false);
        if(v < 30) {
            this.getSettings().setAllowUniversalAccessFromFileURLs(false);
            this.getSettings().setAllowFileAccessFromFileURLs(false);
        }
        this.getSettings().setMixedContentMode(0);
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        this.getSettings().setBuiltInZoomControls(false);
        this.getSettings().setSupportZoom(false);
        this.getSettings().setDomStorageEnabled(true);
        this.setWebViewClient(new WebViewClientClass(this, null));
        this.setWebChromeClient(new WebChromeClient() {
            @Override  // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView0, boolean z, boolean z1, Message message0) {
                try {
                    WebView webView1 = new WebView(AdWebView.this.mContext);
                    webView1.setWebViewClient(new WebViewClientInChromeClient(AdWebView.this));
                    ((WebView.WebViewTransport)message0.obj).setWebView(webView1);
                    message0.sendToTarget();
                }
                catch(Exception unused_ex) {
                }
                return true;
            }

            @Override  // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView0, String s, String s1, JsResult jsResult0) {
                jsResult0.cancel();
                return true;
            }

            @Override  // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView0, int v) {
                super.onProgressChanged(webView0, v);
            }
        });
    }

    public void loadData(String s, long v) {
        this.mHtmlData = s;
        this.removeCallback();
        if(this.mIsWebviewLoadingSkip) {
            this.mIsFinished = true;
            WebViewEventListener adWebView$WebViewEventListener0 = this.mWebViewEventListener;
            if(adWebView$WebViewEventListener0 != null) {
                adWebView$WebViewEventListener0.onPageFinished();
            }
        }
        else if(v > 0L) {
            Handler handler0 = new Handler(Looper.getMainLooper());
            this.mHandler = handler0;
            handler0.postDelayed(new Runnable() {
                @Override
                public void run() {
                    if(!AdWebView.this.mIsFinished) {
                        AdWebView.this.mIsFinished = true;
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("AdWebView", "Webview loading time is delayed.");
                        }
                        if(AdWebView.this.mWebViewEventListener != null) {
                            AdWebView.this.mWebViewEventListener.onPageFinished();
                        }
                    }
                }
            }, v);
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            this.mStartDate = new Date();
        }
        this.loadDataWithBaseURL(null, s, "text/html", "UTF-8", null);
    }

    private void removeCallback() {
        Handler handler0 = this.mHandler;
        if(handler0 != null) {
            handler0.removeCallbacks(null);
            this.mHandler = null;
        }
    }

    private void sendAutoScriptCode(String s) {
        String s2;
        AdRequest adRequest0;
        try {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("AdWebView", "sendAutoScriptCode : " + s);
            }
            adRequest0 = (AdRequest)AdPieSDK.getInstance().getCommonHeader().clone();
            adRequest0.setAppID(AdPieSDK.getInstance().getAppId());
        }
        catch(Exception exception0) {
            goto label_19;
        }
        try {
            String s1 = Preference.getStringValue(this.mContext, "SSP_URL", "");
            if(TextUtils.isEmpty(s1)) {
                s1 = "https://ssp.adpies.com/ssp/request";
            }
            s2 = s1.replace("/request", "/trace");
        }
        catch(Exception unused_ex) {
            s2 = null;
        }
        try {
            adRequest0.setRequestURL(s2, true);
            Uri.Builder uri$Builder0 = Uri.parse(adRequest0.toString()).buildUpon();
            uri$Builder0.appendQueryParameter("tracetype", "1");
            uri$Builder0.appendQueryParameter("abus_link", s);
            uri$Builder0.appendQueryParameter("abus_adm", this.mHtmlData);
            com.gomfactory.adpie.sdk.ui.webview.AdWebView.4 adWebView$40 = new Handler(Looper.getMainLooper()) {
                @Override  // android.os.Handler
                public void handleMessage(Message message0) {
                    switch(message0.what) {
                        case -1: {
                            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                AdPieLog.d("AdWebView", "HTTP Connection : ERROR " + (message0.obj == null ? "" : message0.obj.toString()));
                                return;
                            }
                            break;
                        }
                        case 200: {
                            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                AdPieLog.d("AdWebView", "HTTP Connection : Success");
                                return;
                            }
                            break;
                        }
                    }
                }
            };
            NetworkServiceManager.getInstance().post(adRequest0.getRequestURL(), uri$Builder0.build().getEncodedQuery(), adWebView$40);
            return;
        }
        catch(Exception exception0) {
        }
    label_19:
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.e("AdWebView", exception0);
        }
    }

    public void setMonitoring(int v) {
        this.mMonitoring = v;
    }

    public void setWebViewEventListener(WebViewEventListener adWebView$WebViewEventListener0) {
        this.mWebViewEventListener = adWebView$WebViewEventListener0;
    }

    public void setWebviewLoadingSkip(int v) {
        this.mIsWebviewLoadingSkip = v == 1;
    }
}

