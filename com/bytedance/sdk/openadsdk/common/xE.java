package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.utils.Zh;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.widget.PjT.cz.PjT;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.utils.qla;
import org.json.JSONObject;

public class xE {
    private PjT Au;
    private final Context JQp;
    private final LinearLayout PjT;
    private final Owx ReZ;
    private ImageView XX;
    private final cz Zh;
    private final String cr;
    private ImageView cz;

    public xE(Context context0, LinearLayout linearLayout0, cz cz0, Owx owx0, String s) {
        this.JQp = context0;
        this.PjT = linearLayout0;
        this.Zh = cz0;
        this.ReZ = owx0;
        this.cr = s;
        this.ReZ();
    }

    private void PjT(String s) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            if(this.Zh.getWebView() != null) {
                WebBackForwardList webBackForwardList0 = this.Zh.getWebView().copyBackForwardList();
                if(webBackForwardList0 != null) {
                    int v = webBackForwardList0.getCurrentIndex();
                    String s1 = webBackForwardList0.getItemAtIndex(v).getUrl();
                    if(TextUtils.isEmpty(s1)) {
                        s1 = this.Zh.getUrl();
                    }
                    int v1 = 1;
                    String s2 = s.equals("backward") ? webBackForwardList0.getItemAtIndex(v - 1).getUrl() : "";
                    if(s.equals("forward")) {
                        s2 = webBackForwardList0.getItemAtIndex(v + 1).getUrl();
                    }
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.putOpt("url", s1);
                    jSONObject1.putOpt("next_url", s2);
                    if(webBackForwardList0.getCurrentIndex() != 0) {
                        v1 = 0;
                    }
                    jSONObject1.putOpt("first_page", v1);
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                }
            }
        }
        catch(Exception unused_ex) {
        }
        ReZ.PjT(System.currentTimeMillis(), this.ReZ, this.cr, s, jSONObject0, null, null);
    }

    public void PjT() {
        if(this.PjT.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.PjT, "alpha", new float[]{0.0f, 1.0f}).setDuration(300L).start();
        }
    }

    public void PjT(WebView webView0, PjT cz$PjT0) {
        try {
            this.Au = cz$PjT0;
            if(this.cz != null) {
                if(webView0.canGoBack()) {
                    this.cz.setClickable(true);
                    this.cz.clearColorFilter();
                }
                else {
                    this.cz.setClickable(false);
                    this.cz.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if(this.XX != null) {
                if(webView0.canGoForward()) {
                    this.XX.setClickable(true);
                    this.XX.clearColorFilter();
                    return;
                }
                this.XX.setClickable(false);
                this.XX.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    private void ReZ() {
        this.cz = (ImageView)this.PjT.findViewById(qla.dIF);
        this.XX = (ImageView)this.PjT.findViewById(qla.hN);
        ImageView imageView0 = (ImageView)this.PjT.findViewById(qla.uQg);
        ImageView imageView1 = (ImageView)this.PjT.findViewById(qla.RV);
        this.cz.setOnClickListener(new View.OnClickListener() {
            final xE PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(xE.this.Zh != null && xE.this.Zh.SM()) {
                    if(xE.this.Au != null) {
                        xE.this.Au.PjT();
                    }
                    xE.this.PjT("backward");
                    xE.this.Zh.DWo();
                }
            }
        });
        this.XX.setOnClickListener(new View.OnClickListener() {
            final xE PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(xE.this.Zh != null && xE.this.Zh.qj()) {
                    xE.this.PjT("forward");
                    xE.this.Zh.xf();
                }
            }
        });
        imageView0.setOnClickListener(new View.OnClickListener() {
            final xE PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(xE.this.Zh != null) {
                    xE.this.Zh("refresh");
                    xE.this.Zh.Au();
                }
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            final xE PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(xE.this.Zh != null) {
                    xE.this.Zh("external_btn_click");
                    Intent intent0 = new Intent("android.intent.action.VIEW");
                    String s = xE.this.Zh.getUrl();
                    if(!TextUtils.isEmpty(s)) {
                        intent0.setData(Uri.parse(s));
                        Zh.PjT(xE.this.JQp, intent0, null);
                    }
                }
            }
        });
        com.bytedance.sdk.openadsdk.common.xE.5 xE$50 = new View.OnClickListener() {
            final xE PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
            }
        };
        this.PjT.setOnClickListener(xE$50);
        this.cz.setClickable(false);
        this.XX.setClickable(false);
        ImageView imageView2 = this.cz;
        int v = Color.parseColor("#A8FFFFFF");
        PorterDuff.Mode porterDuff$Mode0 = PorterDuff.Mode.ADD;
        imageView2.setColorFilter(v, porterDuff$Mode0);
        this.XX.setColorFilter(Color.parseColor("#A8FFFFFF"), porterDuff$Mode0);
    }

    private void Zh(String s) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            if(this.Zh.getWebView() != null) {
                WebBackForwardList webBackForwardList0 = this.Zh.getWebView().copyBackForwardList();
                if(webBackForwardList0 != null) {
                    String s1 = webBackForwardList0.getItemAtIndex(webBackForwardList0.getCurrentIndex()).getUrl();
                    if(TextUtils.isEmpty(s1)) {
                        s1 = this.Zh.getUrl();
                    }
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.putOpt("url", s1);
                    jSONObject1.putOpt("first_page", ((int)(webBackForwardList0.getCurrentIndex() == 0 ? 1 : 0)));
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                }
            }
        }
        catch(Exception unused_ex) {
        }
        ReZ.PjT(System.currentTimeMillis(), this.ReZ, this.cr, s, jSONObject0, null, null);
    }

    public void Zh() {
        if(this.PjT.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.PjT, "alpha", new float[]{1.0f, 0.0f}).setDuration(300L).start();
        }
    }
}

