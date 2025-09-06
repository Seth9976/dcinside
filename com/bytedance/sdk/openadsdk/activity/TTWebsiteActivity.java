package com.bytedance.sdk.openadsdk.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.component.SM.cz.PjT;
import com.bytedance.sdk.component.utils.Zh;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.common.ub;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.JQp.cz;
import com.bytedance.sdk.openadsdk.core.Jo;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.cr.ReZ;

public class TTWebsiteActivity extends TTBaseActivity {
    private String PjT;
    private WebView ReZ;
    private ub Zh;

    public TTWebsiteActivity() {
        this.PjT = null;
    }

    public static void PjT(Context context0, Owx owx0, String s) {
        if(context0 == null) {
            return;
        }
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "open_policy");
        if(!TextUtils.isEmpty(owx0.pz().ReZ())) {
            Intent intent0 = new Intent(context0, TTWebsiteActivity.class);
            intent0.putExtra("_extra_meta", owx0.oMU().toString());
            intent0.putExtra("_extra_glo_d", owx0.FaL());
            intent0.putExtra("_privacy_url", owx0.pz().ReZ());
            intent0.putExtra("_privacy_title", owx0.pz().cr());
            Zh.PjT(context0, intent0, null);
        }
    }

    @Override  // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        com.bytedance.sdk.openadsdk.core.ub.Zh(this.getApplicationContext());
        this.finish();

        class com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.1 implements View.OnClickListener {
            final TTWebsiteActivity PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(TTWebsiteActivity.this.ReZ.canGoBack()) {
                    TTWebsiteActivity.this.ReZ.goBack();
                    return;
                }
                TTWebsiteActivity.this.finish();
            }
        }


        class com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.2 implements View.OnClickListener {
            final TTWebsiteActivity PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                TTWebsiteActivity.this.finish();
            }
        }


        class com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.3 implements View.OnClickListener {
            final TTWebsiteActivity PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                Intent intent0 = new Intent("android.intent.action.VIEW");
                String s = TTWebsiteActivity.this.ReZ.getUrl();
                if(!TextUtils.isEmpty(s)) {
                    intent0.setData(Uri.parse(s));
                    Zh.PjT(TTWebsiteActivity.this, intent0, null);
                }
            }
        }


        class com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.4 implements View.OnClickListener {
            final TTWebsiteActivity Zh;

            com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.4(String s) {
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(TTWebsiteActivity.this.Zh == null) {
                    ub ub0 = new ub(TTWebsiteActivity.this);
                    TTWebsiteActivity.this.Zh = ub0;
                    TTWebsiteActivity.this.Zh.PjT(this.PjT);
                    TTWebsiteActivity.this.Zh.setCanceledOnTouchOutside(false);
                }
                TTWebsiteActivity.this.Zh.show();
            }
        }


        class com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.5 extends WebChromeClient {
            final TTWebsiteActivity ReZ;

            com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.5(cz cz0, cr cr0) {
            }

            @Override  // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView0, int v) {
                super.onProgressChanged(webView0, v);
                if(this.PjT != null && !TTWebsiteActivity.this.isFinishing()) {
                    if(v == 100) {
                        this.PjT.setVisibility(8);
                        if(webView0.canGoBack()) {
                            this.Zh.setVisibility(0);
                            this.Zh.setClickable(true);
                            return;
                        }
                        this.Zh.setVisibility(4);
                        this.Zh.setClickable(false);
                        return;
                    }
                    this.PjT.setVisibility(0);
                    this.PjT.setProgress(v);
                }
            }
        }


        class com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.6 extends PjT {
            final TTWebsiteActivity PjT;

            @Override  // android.webkit.WebViewClient
            public void onPageFinished(WebView webView0, String s) {
                super.onPageFinished(webView0, s);
            }

            @Override  // android.webkit.WebViewClient
            public void onReceivedError(WebView webView0, int v, String s, String s1) {
                super.onReceivedError(webView0, v, s, s1);
            }

            @Override  // android.webkit.WebViewClient
            @RequiresApi(api = 23)
            public void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
                super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
                webResourceError0.getErrorCode();
            }

            @Override  // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
                super.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
            }

            @Override  // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
                try {
                    Uri uri0 = Uri.parse(s);
                    if(!ltE.PjT(s)) {
                        try {
                            Intent intent0 = new Intent("android.intent.action.VIEW");
                            intent0.setData(uri0);
                            intent0.addFlags(0x10000000);
                            Zh.PjT(TTWebsiteActivity.this, intent0, null);
                        }
                        catch(Throwable unused_ex) {
                        }
                        return true;
                    }
                }
                catch(Throwable unused_ex) {
                }
                return super.shouldOverrideUrlLoading(webView0, s);
            }
        }

    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        Jo.PjT(this.ReZ);
        super.onDestroy();
    }
}

