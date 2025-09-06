package com.gomfactory.adpie.sdk;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.DisplayUtil;
import java.net.URISyntaxException;

public class InAppBrowser extends Activity {
    class WebViewClientClass extends WebViewClient {
        private WebViewClientClass() {
        }

        WebViewClientClass(com.gomfactory.adpie.sdk.InAppBrowser.1 inAppBrowser$10) {
        }

        public boolean checkDeepLink(WebView webView0, String s) {
            String s2;
            Uri uri0;
            if(TextUtils.isEmpty(s)) {
                return false;
            }
            try {
                String s1 = Uri.parse(s).getScheme();
                uri0 = Uri.parse(s);
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("InAppBrowser", "url : " + s + ", scheme : " + s1);
                }
                if(s1.equalsIgnoreCase("http") || s1.equalsIgnoreCase("https")) {
                    return false;
                }
                if(uri0.getScheme().equalsIgnoreCase("intent")) {
                    try {
                        s2 = null;
                        Intent intent0 = Intent.parseUri(s, 1);
                        s2 = intent0.getStringExtra("browser_fallback_url");
                        InAppBrowser.this.startActivity(intent0);
                        InAppBrowser.this.finish();
                        return true;
                    }
                    catch(ActivityNotFoundException activityNotFoundException0) {
                        AdPieLog.e("InAppBrowser", activityNotFoundException0);
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("InAppBrowser", "fallbackUrl : " + s2);
                        }
                        if(!TextUtils.isEmpty(s2)) {
                            webView0.loadUrl(s2);
                            return true;
                        }
                        return false;
                    }
                    catch(URISyntaxException uRISyntaxException0) {
                        Log.e("InAppBrowser", "Can\'t resolve intent://", uRISyntaxException0);
                        AdPieLog.e("InAppBrowser", uRISyntaxException0);
                        return false;
                    }
                }
                if(s1.equalsIgnoreCase("market")) {
                    try {
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("InAppBrowser", ":::checkDeepLink:::Open Google Play Store. " + s);
                        }
                        Intent intent1 = new Intent("android.intent.action.VIEW");
                        intent1.setData(Uri.parse(s));
                        intent1.setPackage("com.android.vending");
                        InAppBrowser.this.startActivity(intent1);
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("InAppBrowser", ":::checkDeepLink:::You have successfully opened Google Play Store. " + s);
                        }
                        InAppBrowser.this.finish();
                        return true;
                    }
                    catch(ActivityNotFoundException activityNotFoundException1) {
                    }
                    AdPieLog.e("InAppBrowser", activityNotFoundException1);
                    goto label_39;
                }
                goto label_57;
            }
            catch(Exception exception0) {
                AdPieLog.e("InAppBrowser", exception0);
                return false;
            }
            try {
            label_39:
                String s3 = String.format("https://play.google.com/store/apps/details?%s", uri0.getQuery());
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("InAppBrowser", ":::checkDeepLink:::Open Google Play Store. " + s3);
                }
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(s3));
                intent2.setPackage("com.android.vending");
                InAppBrowser.this.startActivity(intent2);
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("InAppBrowser", ":::checkDeepLink:::You have successfully opened Google Play Store. " + s3);
                }
                InAppBrowser.this.finish();
                return true;
            }
            catch(ActivityNotFoundException activityNotFoundException2) {
            }
            catch(Exception exception1) {
                goto label_55;
            }
            try {
                AdPieLog.e("InAppBrowser", activityNotFoundException2);
                return false;
            label_55:
                AdPieLog.e("InAppBrowser", exception1);
                return false;
                try {
                label_57:
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("InAppBrowser", ":::checkDeepLink:::Start intent. " + s);
                    }
                    Intent intent3 = Intent.parseUri(s, 1);
                    InAppBrowser.this.startActivity(intent3);
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("InAppBrowser", ":::checkDeepLink:::You have successfully started intent. " + s);
                    }
                    InAppBrowser.this.finish();
                    return true;
                }
                catch(ActivityNotFoundException activityNotFoundException3) {
                }
                AdPieLog.e("InAppBrowser", activityNotFoundException3);
                return true;
            }
            catch(Exception exception0) {
            }
            AdPieLog.e("InAppBrowser", exception0);
            return false;
        }

        @Override  // android.webkit.WebViewClient
        public void onLoadResource(WebView webView0, String s) {
            super.onLoadResource(webView0, s);
        }

        @Override  // android.webkit.WebViewClient
        public void onPageFinished(WebView webView0, String s) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("InAppBrowser", "WebViewClient - onPageFinished : " + s);
            }
            InAppBrowser.this.changeButtonColor();
            CookieManager.getInstance().flush();
        }

        @Override  // android.webkit.WebViewClient
        public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
            super.onPageStarted(webView0, s, bitmap0);
        }

        @Override  // android.webkit.WebViewClient
        public void onReceivedError(WebView webView0, int v, String s, String s1) {
            try {
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("InAppBrowser", "WebViewClient - onReceivedError : " + s1 + ", errorCode : " + v);
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
                    AdPieLog.d("InAppBrowser", "WebViewClient - onReceivedError : " + webResourceRequest0.getUrl().toString() + ", errorCode : " + webResourceError0.getErrorCode());
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
                AdPieLog.d("InAppBrowser", "WebViewClient - onRenderProcessGone");
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
                AdPieLog.d("InAppBrowser", "WebViewClient - shouldOverrideUrlLoading[N] : " + s);
            }
            return this.checkDeepLink(webView0, s);
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("InAppBrowser", "WebViewClient - shouldOverrideUrlLoading : " + s);
            }
            return this.checkDeepLink(webView0, s);
        }
    }

    private static final String TAG = "InAppBrowser";
    private ImageButton mBackButton;
    private ImageButton mCloseButton;
    private ImageButton mForwardButton;
    private ImageButton mRefreshButton;
    private WebView mWebView;

    static {
    }

    // 去混淆评级： 低(20)
    static String access$200() [...] // 潜在的解密器

    public void changeButtonColor() {
        try {
            if(this.mWebView == null || !this.mWebView.canGoBack()) {
                this.mBackButton.getDrawable().setColorFilter(0xFFCCCCCC, PorterDuff.Mode.SRC_IN);
            }
            else {
                this.mBackButton.getDrawable().setColorFilter(0xFF000000, PorterDuff.Mode.SRC_IN);
            }
            if(this.mWebView != null && this.mWebView.canGoForward()) {
                this.mForwardButton.getDrawable().setColorFilter(0xFF000000, PorterDuff.Mode.SRC_IN);
                return;
            }
            this.mForwardButton.getDrawable().setColorFilter(0xFFCCCCCC, PorterDuff.Mode.SRC_IN);
            return;
        }
        catch(Exception exception0) {
        }
        AdPieLog.e("InAppBrowser", exception0);
    }

    public ViewGroup getButtonViewGroup(ImageButton imageButton0) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
        ViewGroup viewGroup0 = new RelativeLayout(this);
        viewGroup0.setLayoutParams(linearLayout$LayoutParams0);
        viewGroup0.addView(imageButton0);
        return viewGroup0;
    }

    public ImageButton getImageButton(String s) {
        ImageButton imageButton0 = new ImageButton(this);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(DisplayUtil.dpToPx(this, 0x20), DisplayUtil.dpToPx(this, 0x20));
        linearLayout$LayoutParams0.gravity = 16;
        imageButton0.setLayoutParams(linearLayout$LayoutParams0);
        try {
            byte[] arr_b = Base64.decode(s, 0);
            imageButton0.setImageBitmap(BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length));
        }
        catch(Exception exception0) {
            AdPieLog.e("InAppBrowser", exception0);
        }
        return imageButton0;
    }

    private View getLayout() {
        View view0 = new LinearLayout(this);
        view0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        ((LinearLayout)view0).setWeightSum(10.0f);
        ((LinearLayout)view0).setOrientation(1);
        this.mWebView = new WebView(this);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, 0);
        linearLayout$LayoutParams0.weight = 10.0f;
        this.mWebView.setLayoutParams(linearLayout$LayoutParams0);
        ((ViewGroup)view0).addView(this.mWebView);
        View view1 = new View(this);
        view1.setLayoutParams(new ViewGroup.LayoutParams(-1, DisplayUtil.dpToPx(this, 1)));
        view1.setBackgroundColor(-12303292);
        ((ViewGroup)view0).addView(view1);
        LinearLayout linearLayout0 = new LinearLayout(this);
        linearLayout0.setOrientation(0);
        linearLayout0.setId(DisplayUtil.generateViewId());
        linearLayout0.setWeightSum(3.0f);
        int v = DisplayUtil.dpToPx(this, 5);
        int v1 = DisplayUtil.dpToPx(this, 20);
        linearLayout0.setPadding(v1, v, v1, v);
        linearLayout0.setLayoutParams(new LinearLayout.LayoutParams(-1, DisplayUtil.dpToPx(this, 42)));
        linearLayout0.setBackgroundColor(Color.parseColor("#f7f7f7"));
        ((ViewGroup)view0).addView(linearLayout0);
        this.mBackButton = this.getImageButton("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAQAAAD9CzEMAAAAYUlEQVRYw+2RSQqAMBAE+1FRv+ZBGPHBxh+4nHKOUCGErr5XwYxkjKkltLP6+93B6r9trP7SYr311ltf9H8G63sI4Cdq8OQxEzOdyC0SkxPdJBKdOPnEKpGJEEiwemPG5AF4BwlIS7wyAgAAAABJRU5ErkJggg==");
        this.mForwardButton = this.getImageButton("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAQAAAD9CzEMAAAAa0lEQVRYw+2WsQ2AMBDEbqgQVqP7jYENnoYBQMghgfP3dhNFJxlj7hIKVp9KLrEoz4MSRSuf2OjE5EQ3idoisdOJ+a+JfHBBBy4lug7EcO9obH2l9ehnN1n/mr7Qenh44dMRH78N5rsx3+QAyRMJKNqTa7MAAAAASUVORK5CYII=");
        this.mRefreshButton = this.getImageButton("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAQAAAD9CzEMAAABmElEQVRYw+2XsU4CQRRFj8hCA8bECMZYUBgqv8JoYdAvsLDR0k9AYmsjIlv4DVpR2lAY7CyMHY0IgcKoiWBMrNbCYVx1Yd8sUJjsnWaTvXPvzOyb995CiBAhZIixjk2VOj161KlSZg3Lg1kwF1/ApovjMV45JfVL3jETj3PIm6d4f3Q5IOaSd8zWfj1UvD+umNfyBgYrNF0iTWxyLJMgQZZNzui43jaw9bMQaR70lDa7TP9hWOzz5LEf4dnX9IQKyYG8OarBDAqaXiIylGlxa26Q0mFZ8ZF3L8XAoKTPPmksLzCI8qKoewHkBQaritjyiBx/eYFBURHLgeQFBpeKuBFIXmBwp4jZSaXmZ2WQ/LcGEz8iyUceCbIwHQHSi/Yz5bXl+5anim/sqBmPRMeb7L4wq6tbUbYek3QNEc4Vu0daumV5wZnS+3XIm7QrspI5w4Wrt7BMYsm/6EfZ1rHj0GHRNFwHtS1xMuQ4cok7NILde2njdcNS0Evn3zp+kJfFfpDmt8sxmfG37+/cU+OELRLhf02IEDJ8ApJOgej0XVvVAAAAAElFTkSuQmCC");
        this.mCloseButton = this.getImageButton("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAQAAAD9CzEMAAAAl0lEQVRYw+2WSw6AIAwFX+IZuSIJZ2RRF67EX0FmoemsYV4AbSsFQfBfFmUl9+qkrKVPX2SqzoikKlPpicgymTNi05tMWR1Hrs4I/8qhjcN63+ZX+mfBa/29ZIr+WjRNfy6bqj8Kp+vbCEC/j0D0bQSgxwPgK4IfGf5M4R8NLhVwsYPLNdxw4JaJN318bMEHL3x0DILgW6zbiArszHKr4QAAAABJRU5ErkJggg==");
        linearLayout0.addView(this.getButtonViewGroup(this.mBackButton));
        linearLayout0.addView(this.getPaddingView());
        linearLayout0.addView(this.getButtonViewGroup(this.mForwardButton));
        linearLayout0.addView(this.getPaddingView());
        linearLayout0.addView(this.getButtonViewGroup(this.mRefreshButton));
        linearLayout0.addView(this.getPaddingView());
        linearLayout0.addView(this.getButtonViewGroup(this.mCloseButton));
        return view0;
    }

    public View getPaddingView() {
        View view0 = new View(this);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(0, DisplayUtil.dpToPx(this, 1));
        linearLayout$LayoutParams0.weight = 1.0f;
        view0.setLayoutParams(linearLayout$LayoutParams0);
        return view0;
    }

    public void initButton() {
        this.mBackButton.setBackgroundColor(0);
        this.mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(InAppBrowser.this.mWebView != null && InAppBrowser.this.mWebView.canGoBack()) {
                    InAppBrowser.this.mWebView.goBack();
                }
            }
        });
        this.mForwardButton.setBackgroundColor(0);
        this.mForwardButton.setOnClickListener(new View.OnClickListener() {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(InAppBrowser.this.mWebView != null && InAppBrowser.this.mWebView.canGoForward()) {
                    InAppBrowser.this.mWebView.goForward();
                }
            }
        });
        this.mRefreshButton.setBackgroundColor(0);
        this.mRefreshButton.setOnClickListener(new View.OnClickListener() {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(InAppBrowser.this.mWebView != null) {
                    InAppBrowser.this.mWebView.reload();
                }
            }
        });
        this.mCloseButton.setBackgroundColor(0);
        this.mCloseButton.setOnClickListener(new View.OnClickListener() {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                InAppBrowser.this.finish();
            }
        });
    }

    @Override  // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        if(Build.VERSION.SDK_INT >= 27) {
            this.setShowWhenLocked(true);
        }
        else {
            this.getWindow().addFlags(0x80000);
        }
        this.setContentView(this.getLayout());
        this.initButton();
        this.changeButtonColor();
        this.settingWebView();
        this.mWebView.loadUrl(this.getIntent().getStringExtra("url"));
    }

    @Override  // android.app.Activity
    protected void onPause() {
        WebView webView0 = this.mWebView;
        if(webView0 != null) {
            webView0.onPause();
        }
        super.onPause();
    }

    @Override  // android.app.Activity
    protected void onResume() {
        super.onResume();
        WebView webView0 = this.mWebView;
        if(webView0 != null) {
            webView0.onResume();
        }
    }

    public void settingWebView() {
        try {
            WebView webView0 = this.mWebView;
            if(webView0 != null) {
                WebSettings webSettings0 = webView0.getSettings();
                webSettings0.setJavaScriptEnabled(true);
                webSettings0.setBuiltInZoomControls(true);
                webSettings0.setSupportZoom(true);
                webSettings0.setLoadWithOverviewMode(true);
                webSettings0.setUseWideViewPort(true);
                webSettings0.setDomStorageEnabled(true);
                webSettings0.setMixedContentMode(0);
                webSettings0.setCacheMode(1);
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    WebView.setWebContentsDebuggingEnabled(true);
                }
                this.mWebView.setWebViewClient(new WebViewClientClass(this, null));
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

