package com.bytedance.sdk.openadsdk.xs;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.openadsdk.XX.Zh;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.model.yIW;
import com.bytedance.sdk.openadsdk.core.qla;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.PjT.JQp;
import com.bytedance.sdk.openadsdk.core.widget.PjT.ReZ;
import com.bytedance.sdk.openadsdk.core.widget.PjT.cr;
import com.bytedance.sdk.openadsdk.cr.qj;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import org.json.JSONObject;

public class PjT {
    private LinkedHashMap JQp;
    private static volatile PjT PjT = null;
    private static int ReZ = 2;
    private final Handler Zh;
    private static long cr = 3600000L;

    static {
    }

    public PjT() {
        PjT.ReZ = com.bytedance.sdk.openadsdk.RD.PjT.PjT("pre_render_count", 2);
        long v = (long)com.bytedance.sdk.openadsdk.RD.PjT.PjT("pre_render_duration", 3600000);
        PjT.cr = v;
        if(PjT.ReZ <= 0) {
            PjT.ReZ = 2;
        }
        if(v <= 0L) {
            PjT.cr = 3600000L;
        }
        this.JQp = new LinkedHashMap();
        this.Zh = new Handler(Looper.getMainLooper(), new Handler.Callback() {
            final PjT PjT;

            @Override  // android.os.Handler$Callback
            public boolean handleMessage(@NonNull Message message0) {
                int v = message0.what;
                if(PjT.this.JQp != null) {
                    SoftReference softReference0 = (SoftReference)PjT.this.JQp.get(v);
                    if(softReference0 != null) {
                        cz cz0 = (cz)softReference0.get();
                        yIW yIW0 = new yIW();
                        PjT.this.PjT(v, 2, yIW0, (cz0 == null ? "" : cz0.getTag()));
                    }
                }
                return false;
            }
        });
    }

    public static PjT PjT() {
        if(PjT.PjT == null) {
            Class class0 = PjT.class;
            __monitor_enter(class0);
            try {
                if(PjT.PjT == null) {
                    PjT.PjT = new PjT();
                }
                __monitor_exit(class0);
                return PjT.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return PjT.PjT;
    }

    private void PjT(int v, int v1, Owx owx0, String s) {
        if(this.JQp != null && this.JQp.containsKey(v)) {
            this.JQp.remove(v);
        }
        Handler handler0 = this.Zh;
        if(handler0 != null) {
            handler0.removeMessages(v);
        }
        PjT.PjT(owx0, s, v1);
    }

    // 检测为 Lambda 实现
    private void PjT(int v, Owx owx0, String s, boolean z) [...]

    private void PjT(cz cz0, String s) {
        if(cz0 == null) {
            return;
        }
        ReZ.PjT(ub.PjT()).PjT(false).Zh(false).PjT(cz0.getWebView());
        cz0.setMixedContentMode(0);
        com.bytedance.sdk.openadsdk.utils.Owx.PjT(cz0, s);
    }

    public static void PjT(Owx owx0, String s, float f, String s1) {
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(System.currentTimeMillis(), owx0, s, s1, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("duration", ((double)f));
                }
                catch(Throwable unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    public static void PjT(Owx owx0, String s, int v) {
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(System.currentTimeMillis(), owx0, s, "web_delete_pre_render", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("reason", v);
                    jSONObject1.put("pag_json_data", jSONObject2.toString());
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                }
                catch(Throwable unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    public void PjT(Owx owx0) {
        String s1;
        if(owx0 != null && PjT.ReZ(owx0)) {
            com.bytedance.sdk.openadsdk.core.model.ub ub0 = owx0.fDm();
            if(ub0 == null) {
                ub0 = new com.bytedance.sdk.openadsdk.core.model.ub();
            }
            owx0.AK();
            if(!owx0.AK()) {
                return;
            }
            String s = owx0.xu();
            if(TextUtils.isEmpty(s)) {
                return;
            }
            int v = s.hashCode();
            if(gK.Zh(owx0)) {
                s1 = "landingpage_split_screen";
            }
            else if(gK.cr(owx0)) {
                s1 = "landingpage_direct";
            }
            else {
                s1 = gK.ReZ(owx0) ? "landingpage_split_ceiling" : "";
            }
            if(this.JQp != null && this.JQp.containsKey(v)) {
                return;
            }
            HashMap hashMap0 = new HashMap();
            hashMap0.put(owx0.MN(), owx0);
            if(ub0.Zh() == 2) {
                Zh.PjT().PjT(hashMap0, () -> {
                    Jo.PjT(new Runnable() {
                        final PjT JQp;

                        private JQp PjT(@NonNull cz cz0, qj qj0) {
                            JQp jQp0 = new JQp(ub.PjT(), null, this.Zh.dIF(), qj0, true) {
                                final com.bytedance.sdk.openadsdk.xs.PjT.3 Zh;

                                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                                public void onPageFinished(WebView webView0, String s) {
                                    cz cz0 = cz0;
                                    if(cz0 != null) {
                                        cz0.setPreFinish(true);
                                    }
                                    super.onPageFinished(webView0, s);
                                }

                                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                                public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
                                    cz cz0 = cz0;
                                    if(cz0 != null) {
                                        cz0.setPreStart(true);
                                    }
                                    super.onPageStarted(webView0, s, bitmap0);
                                }

                                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                                public void onReceivedError(WebView webView0, int v, String s, String s1) {
                                    String s2 = JQp.cr(s1);
                                    boolean z = false;
                                    boolean z1 = s2 != null && s2.startsWith("image");
                                    if(s2 != null && s2.startsWith("mp4")) {
                                        z = true;
                                    }
                                    if(!z1 && !z && !cz0.ReZ()) {
                                        PjT.this.PjT(com.bytedance.sdk.openadsdk.xs.PjT.3.this.Zh, 4, com.bytedance.sdk.openadsdk.xs.PjT.3.this.PjT, com.bytedance.sdk.openadsdk.xs.PjT.3.this.ReZ);
                                    }
                                    super.onReceivedError(webView0, v, s, s1);
                                }

                                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                                public void onReceivedSslError(WebView webView0, SslErrorHandler sslErrorHandler0, SslError sslError0) {
                                    if(sslErrorHandler0 != null) {
                                        PjT.this.PjT(com.bytedance.sdk.openadsdk.xs.PjT.3.this.Zh, 4, com.bytedance.sdk.openadsdk.xs.PjT.3.this.PjT, com.bytedance.sdk.openadsdk.xs.PjT.3.this.ReZ);
                                    }
                                    super.onReceivedSslError(webView0, sslErrorHandler0, sslError0);
                                }

                                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                                public WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
                                    try {
                                        if(!com.bytedance.sdk.openadsdk.xs.PjT.3.this.cr) {
                                            return super.shouldInterceptRequest(webView0, s);
                                        }
                                        cz cz0 = cz0;
                                        if(cz0 != null) {
                                            ++cz0.PjT;
                                        }
                                        WebResourceResponseModel webResourceResponseModel0 = Zh.PjT().PjT(Zh.PjT().Zh(), com.bytedance.sdk.openadsdk.xs.PjT.3.this.PjT.MN(), s);
                                        if(webResourceResponseModel0 != null && webResourceResponseModel0.getWebResourceResponse() != null) {
                                            cz cz1 = cz0;
                                            if(cz1 != null) {
                                                ++cz1.Zh;
                                            }
                                            return webResourceResponseModel0.getWebResourceResponse();
                                        }
                                        if(cz0 != null && webResourceResponseModel0 != null && webResourceResponseModel0.getMsg() == 2) {
                                            ++cz0.ReZ;
                                        }
                                        return super.shouldInterceptRequest(webView0, s);
                                    }
                                    catch(Throwable unused_ex) {
                                        return super.shouldInterceptRequest(webView0, s);
                                    }
                                }

                                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                                public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
                                    return super.shouldOverrideUrlLoading(webView0, s);
                                }
                            };
                            jQp0.PjT(this.Zh);
                            jQp0.PjT(this.ReZ);
                            return jQp0;
                        }

                        @Override
                        public void run() {
                            if(PjT.this.JQp != null && PjT.this.JQp.size() >= 2) {
                                Object object0 = PjT.this.JQp.entrySet().iterator().next();
                                SoftReference softReference0 = (SoftReference)((Map.Entry)object0).getValue();
                                if(softReference0 != null) {
                                    cz cz0 = (cz)softReference0.get();
                                    int v = (int)(((Integer)((Map.Entry)object0).getKey()));
                                    PjT.this.PjT(v, 1, this.Zh, (cz0 == null ? "" : cz0.getTag()));
                                }
                            }
                            if(PjT.this.Zh != null) {
                                Message message0 = Message.obtain();
                                message0.what = this.PjT;
                                PjT.this.Zh.sendMessageDelayed(message0, 3600000L);
                            }
                            int v1 = 0;
                            SoftReference softReference1 = new SoftReference(new cz(ub.PjT(), false));
                            cz cz1 = (cz)softReference1.get();
                            if(cz1 == null) {
                                return;
                            }
                            cz1.setLayerType(2, null);
                            qZS.PjT(cz1, 4);
                            cz1.setTag(this.ReZ);
                            cz1.setLandingPage(true);
                            com.bytedance.sdk.openadsdk.core.model.ub ub0 = this.Zh.fDm();
                            int v2 = ub0 == null ? 3 : ub0.PjT();
                            if(v2 == 2) {
                                int v3 = qZS.ReZ(ub.PjT());
                                int v4 = qZS.JQp(ub.PjT());
                                int v5 = this.Zh.jK();
                                if(v5 != 1) {
                                    if(v5 == 2) {
                                        if(v3 < v4) {
                                            cz1.layout(0, 0, v4, v3);
                                        }
                                        else {
                                            cz1.layout(0, 0, v3, v4);
                                        }
                                    }
                                }
                                else if(v3 >= v4) {
                                    cz1.layout(0, 0, v4, v3);
                                }
                                else {
                                    cz1.layout(0, 0, v3, v4);
                                }
                            }
                            else if(v2 == 1) {
                                com.bytedance.sdk.openadsdk.utils.PjT pjT0 = qla.PjT().JQp();
                                if(pjT0 != null) {
                                    Activity activity0 = pjT0.Zh();
                                    if(activity0 != null) {
                                        pjT0.PjT(new com.bytedance.sdk.component.adexpress.PjT() {
                                            final com.bytedance.sdk.openadsdk.xs.PjT.3 ReZ;

                                            @Override  // com.bytedance.sdk.component.adexpress.PjT
                                            public void PjT(Activity activity0) {
                                                if(activity0.hashCode() != 0 && activity0 != null && activity0.hashCode() == activity0.hashCode() && !cz1.ReZ()) {
                                                    PjT.this.PjT(com.bytedance.sdk.openadsdk.xs.PjT.3.this.Zh, 5, com.bytedance.sdk.openadsdk.xs.PjT.3.this.PjT, com.bytedance.sdk.openadsdk.xs.PjT.3.this.ReZ);
                                                }
                                            }
                                        });
                                        FrameLayout frameLayout0 = (FrameLayout)activity0.findViewById(0x1020002);
                                        if(frameLayout0 != null) {
                                            frameLayout0.addView(cz1);
                                        }
                                    }
                                }
                            }
                            int v6 = Zh.PjT().PjT(Zh.PjT().Zh(), this.Zh.MN());
                            qj qj0 = new qj(this.Zh, cz1.getWebView());
                            if(v6 > 0) {
                                v1 = 2;
                            }
                            qj0.PjT(v1);
                            qj0.PjT(true);
                            qj0.Zh(true);
                            cz1.setWebViewClient(this.PjT(cz1, qj0));
                            cz1.setWebChromeClient(new cr(null, qj0) {
                                final com.bytedance.sdk.openadsdk.xs.PjT.3 Zh;

                                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.cr
                                public void onProgressChanged(WebView webView0, int v) {
                                    super.onProgressChanged(webView0, v);
                                    if(v == 100) {
                                        cz1.setPreProgressHundred(true);
                                    }
                                }
                            });
                            String s = this.Zh.xu();
                            PjT.this.PjT(cz1, s);
                            float f = ((double)(((double)(System.currentTimeMillis() / 1000L)) - this.Zh.kNB())).floatValue();
                            PjT.PjT(this.Zh, this.ReZ, f, "web_start_pre_render");
                            if(PjT.this.JQp != null) {
                                PjT.this.JQp.put(this.PjT, softReference1);
                            }
                        }
                    });
                }, true);
                return;
            }
            switch(ub0.Zh()) {
                case 0: {
                    this.PjT(v, owx0, s1, false);
                    break;
                }
                case 1: {
                    Zh.PjT().PjT(hashMap0, null, true);
                    this.PjT(v, owx0, s1, true);
                }
            }
        }

        class com.bytedance.sdk.openadsdk.xs.PjT.2 implements com.bytedance.sdk.openadsdk.XX.Zh.PjT {
            final PjT cr;

            com.bytedance.sdk.openadsdk.xs.PjT.2(int v, Owx owx0, String s) {
            }

            @Override  // com.bytedance.sdk.openadsdk.XX.Zh$PjT
            public void PjT() {
                PjT.this.PjT(this.PjT, this.Zh, this.ReZ, true);
            }
        }

    }

    static long ReZ() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    public static boolean ReZ(Owx owx0) {
        return gK.cz(owx0) || gK.Zh(owx0) || gK.ReZ(owx0);
    }

    static int Zh() [...] // 潜在的解密器

    public cz Zh(Owx owx0) {
        cz cz0 = null;
        if(owx0 != null && !TextUtils.isEmpty(owx0.xu())) {
            String s = owx0.xu();
            if(TextUtils.isEmpty(s)) {
                return null;
            }
            int v = s.hashCode();
            SoftReference softReference0 = (SoftReference)this.JQp.get(v);
            if(softReference0 != null && softReference0.get() != null) {
                cz0 = (cz)softReference0.get();
                PjT.PjT(owx0, cz0.getTag(), ((double)(((double)(System.currentTimeMillis() / 1000L)) - owx0.kNB())).floatValue(), "web_use_pre_render");
                this.PjT(v, 3, owx0, cz0.getTag());
            }
        }
        return cz0;
    }
}

