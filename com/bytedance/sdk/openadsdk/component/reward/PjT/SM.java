package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.utils.HomeWatcherReceiver;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.Owx.Au;
import com.bytedance.sdk.openadsdk.Owx.XX.PjT;
import com.bytedance.sdk.openadsdk.Owx.XX;
import com.bytedance.sdk.openadsdk.Owx.cr;
import com.bytedance.sdk.openadsdk.common.Zh;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.DWo;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.bytedance.sdk.openadsdk.utils.xs;
import com.bytedance.sdk.openadsdk.xf.JQp;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class SM implements Handler.Callback {
    private boolean Au;
    private static final PjT DWo;
    int JQp;
    private volatile boolean Lrd;
    private boolean Owx;
    protected final AtomicBoolean PjT;
    private HomeWatcherReceiver RD;
    boolean ReZ;
    private boolean SM;
    private Au Sks;
    int XX;
    boolean Zh;
    private boolean cRA;
    long cr;
    int cz;
    private final String fDm;
    private int gK;
    private final JQp iZZ;
    private DWo ltE;
    private volatile boolean qj;
    private final com.bytedance.sdk.openadsdk.component.reward.PjT.PjT qla;
    private boolean tT;
    private gK ub;
    private final Handler xE;
    private final Activity xf;
    @NonNull
    private final Owx xs;
    private boolean yIW;

    static {
        SM.DWo = new PjT() {
        };
    }

    public SM(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        this.Au = true;
        this.PjT = new AtomicBoolean(false);
        this.xE = new Handler(this);
        this.Zh = false;
        this.ReZ = false;
        this.cr = 0L;
        this.JQp = 0;
        this.cz = 0;
        this.XX = 0;
        this.gK = 1;
        this.Owx = true;
        this.iZZ = new JQp() {
            final SM PjT;

            @Override  // com.bytedance.sdk.openadsdk.xf.JQp
            public void PjT() {
                if(SM.this.qla.rds.isFinishing()) {
                    return;
                }
                if(!SM.this.qla.Zh.Os()) {
                    return;
                }
                if(cRA.xE(SM.this.qla.Zh)) {
                    SM.this.xE.removeMessages(800);
                    Message message0 = SM.PjT(1, 0);
                    SM.this.xE.sendMessage(message0);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.xf.JQp
            public void PjT(int v) {
            }

            @Override  // com.bytedance.sdk.openadsdk.xf.JQp
            public void Zh() {
            }
        };
        this.qla = pjT0;
        this.xf = pjT0.rds;
        this.fDm = pjT0.JQp;
        this.xs = pjT0.Zh;
        this.Au = cRA.XX(pjT0.Zh);
    }

    public boolean Au() {
        return this.qj;
    }

    public int DWo() {
        return this.JQp;
    }

    public void JQp() {
        if(!this.Au) {
            return;
        }
        if(this.cr > 0L) {
            return;
        }
        this.cr = System.currentTimeMillis();
        Message message0 = this.xE.obtainMessage(900, this.SM(), 0);
        this.xE.sendMessage(message0);
        this.ReZ(true);
    }

    public void JQp(int v) {
        this.JQp = v;
    }

    public void JQp(boolean z) {
        if(!this.Au) {
            return;
        }
        Au au0 = this.Sks;
        if(au0 != null) {
            au0.PjT(z);
        }
    }

    @NonNull
    private static cr Owx() {
        switch(Zh.cz()) {
            case "2g": {
                return cr.PjT;
            }
            case "3g": {
                return cr.Zh;
            }
            case "4g": {
                return cr.ReZ;
            }
            case "5g": {
                return cr.cr;
            }
            case "wifi": {
                return cr.JQp;
            }
            default: {
                return cr.XX;
            }
        }
    }

    public static Message PjT(int v, int v1) {
        Message message0 = Message.obtain();
        message0.what = 800;
        message0.arg1 = v;
        if(v == 3) {
            message0.arg2 = v1;
        }
        return message0;
    }

    private void PjT(Context context0) {
        if(!this.Au) {
            return;
        }
        try {
            this.RD.PjT(null);
            context0.getApplicationContext().unregisterReceiver(this.RD);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void PjT() {
        if(!this.Au) {
            return;
        }
        if(this.tT) {
            return;
        }
        this.tT = true;
        this.ub = this.qla.Jo;
        this.gK = this.qla.cI;
        this.RD();
        if(this.Sks() && cRA.gK(this.xs) && cRA.xE(this.xs)) {
            Message message0 = this.xE.obtainMessage(800, 2, 12);
            long v = cRA.Owx(this.xs);
            this.xE.sendMessageDelayed(message0, v * 1000L);
        }
    }

    public void PjT(int v) {
        if(!this.Au) {
            return;
        }
        if(v == 5) {
            this.SM = true;
            if(cRA.tT(this.xs)) {
                this.xE.removeMessages(900);
                this.qla.OMu.sendEmptyMessage(600);
            }
        }
        Message message0 = SM.PjT(v, 0);
        this.xE.sendMessage(message0);
    }

    public void PjT(int v, Owx owx0, boolean z) {
        if(!this.Au) {
            return;
        }
        if(owx0 == null) {
            return;
        }
        this.cz = owx0.Gr();
        this.XX = ub.cr().PjT(String.valueOf(v), z);
    }

    public void PjT(int v, String s, String s1) {
        if(!this.Au) {
            return;
        }
        try {
            Au au0 = this.Sks;
            if(au0 != null) {
                au0.cz(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(this.xs));
                this.Sks.PjT(v, s, s1);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void PjT(long v) {
        if(!this.Au) {
            return;
        }
        Message message0 = Message.obtain();
        message0.what = 900;
        message0.arg1 = this.DWo();
        this.xE.sendMessageDelayed(message0, v);
    }

    public void PjT(DownloadListener downloadListener0) {
        if(!this.Au) {
            return;
        }
        cz cz0 = this.ub.qj();
        if(cz0 == null) {
            return;
        }
        String s = this.tT();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        KM kM0 = this.ub.xs();
        String s1 = this.xs.dIF();
        cz0.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.PjT.JQp(this.xf, kM0, s1, null, false) {
            final SM PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onPageFinished(WebView webView0, String s) {
                if(SM.this.Owx) {
                    ReZ.PjT(System.currentTimeMillis(), SM.this.xs, SM.this.fDm, "loading_h5_success");
                }
                super.onPageFinished(webView0, s);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onReceivedError(WebView webView0, int v, String s, String s1) {
                super.onReceivedError(webView0, v, s, s1);
                SM.this.Owx = false;
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
                super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
                SM.this.Owx = false;
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
                super.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
                SM.this.Owx = false;
            }
        });
        cz0.a_(s);
        cz0.setDisplayZoomControls(false);
        cz0.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.PjT.cr(this.ub.xs(), this.ub.fDm()));
        cz0.setDownloadListener(downloadListener0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void PjT(com.bytedance.sdk.openadsdk.core.Zh.JQp jQp0) {
        if(!this.Au) {
            return;
        }
        if(this.ltE != null && this.ltE.getDownloadButton() != null && (cRA.gK(this.xs) || cRA.tT(this.xs))) {
            this.ltE.getDownloadButton().setOnClickListener(jQp0);
            this.ltE.getDownloadButton().setOnTouchListener(jQp0);
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.xf.cz cz0, boolean z) {
        if(!this.Au) {
            return;
        }
        if(cRA.XX(this.xs) && this.qla.VY) {
            if(com.bytedance.sdk.openadsdk.core.SM.Zh().ltE()) {
                XX.PjT(SM.DWo);
            }
            com.bytedance.sdk.openadsdk.component.reward.PjT.SM.2 sM$20 = new com.bytedance.sdk.openadsdk.Owx.PjT() {
                final SM Zh;

                @Override  // com.bytedance.sdk.openadsdk.Owx.PjT
                public cr PjT() {
                    return SM.Owx();
                }

                @Override  // com.bytedance.sdk.openadsdk.Owx.PjT
                public void PjT(int v, String s) {
                    super.PjT(v, s);
                    if(SM.this.ltE != null && SM.this.ltE.isShown()) {
                        SM.this.xE.sendMessage(SM.PjT(3, v + 10));
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.Owx.PjT
                public void PjT(JSONObject jSONObject0) {
                    ReZ.Zh(SM.this.xs, SM.this.fDm, "playable_track", jSONObject0);
                }

                @Override  // com.bytedance.sdk.openadsdk.Owx.PjT
                public void Zh() {
                    SM.this.qla.Jo.xf().ReZ(true);
                    com.bytedance.sdk.openadsdk.xf.cz cz0 = cz0;
                    if(cz0 != null) {
                        cz0.PjT();
                    }
                }
            };
            com.bytedance.sdk.openadsdk.component.reward.PjT.SM.3 sM$30 = new com.bytedance.sdk.openadsdk.Owx.ReZ() {
                final SM PjT;

                @Override  // com.bytedance.sdk.openadsdk.Owx.ReZ
                public void PjT(String s, JSONObject jSONObject0) {
                    SM.this.qla.Jo.xf().PjT(s, jSONObject0);
                }
            };
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("cid", this.xs.dIF());
                jSONObject0.put("log_extra", this.xs.xR());
                Au au0 = Au.PjT(ub.PjT(), this.qla.Jo.DWo().getWebView(), sM$30, sM$20).XX(this.qla.Jo.cRA()).JQp(Zh.PjT(ub.PjT())).PjT("open_news").ReZ(jSONObject0).PjT("sdkEdition", "7.1.0.4").Zh("").cr(Zh.cr()).cr(false).PjT(z).PjT(cRA.Owx(this.xs)).Zh(cRA.Owx(this.xs)).JQp(cRA.gK(this.xs));
                this.Sks = au0;
            }
            catch(Exception unused_ex) {
                if(this.Sks == null) {
                    com.bytedance.sdk.openadsdk.qla.ReZ.PjT("PlayablePlugin_init", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
                        final SM PjT;

                        @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                        public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                            new JSONObject().put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("PlayablePlugin_init").Zh("{\"PlayablePlugin_is_null\":true}");
                        }
                    });
                }
                goto label_22;
            }
            catch(Throwable throwable0) {
                if(this.Sks == null) {
                    com.bytedance.sdk.openadsdk.qla.ReZ.PjT("PlayablePlugin_init", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
                        final SM PjT;

                        @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                        public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                            new JSONObject().put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("PlayablePlugin_init").Zh("{\"PlayablePlugin_is_null\":true}");
                        }
                    });
                }
                throw throwable0;
            }
            if(au0 == null) {
                com.bytedance.sdk.openadsdk.qla.ReZ.PjT("PlayablePlugin_init", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
                    final SM PjT;

                    @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                    public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                        new JSONObject().put("PlayablePlugin_is_null", true);
                        return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("PlayablePlugin_init").Zh("{\"PlayablePlugin_is_null\":true}");
                    }
                });
            }
        label_22:
            if(this.Sks != null && !TextUtils.isEmpty(cRA.qj(this.xs))) {
                this.Sks.ReZ(cRA.qj(this.xs));
            }
            Au au1 = this.Sks;
            if(au1 != null) {
                Set set0 = au1.qj();
                WeakReference weakReference0 = new WeakReference(this.Sks);
                for(Object object0: set0) {
                    String s = (String)object0;
                    if(!"subscribe_app_ad".equals(s) && !"adInfo".equals(s) && !"webview_time_track".equals(s) && !"download_app_ad".equals(s)) {
                        com.bytedance.sdk.component.PjT.ub ub0 = this.qla.Jo.xf().Zh();
                        if(ub0 != null) {
                            ub0.PjT(s, new com.bytedance.sdk.component.PjT.JQp() {
                                final SM Zh;

                                @Override  // com.bytedance.sdk.component.PjT.JQp
                                public Object PjT(@NonNull Object object0, @NonNull com.bytedance.sdk.component.PjT.cz cz0) throws Exception {
                                    return this.PjT(((JSONObject)object0), cz0);
                                }

                                public JSONObject PjT(@NonNull JSONObject jSONObject0, @NonNull com.bytedance.sdk.component.PjT.cz cz0) {
                                    try {
                                        Au au0 = (Au)weakReference0.get();
                                        return au0 == null ? null : au0.cr(this.PjT(), jSONObject0);
                                    }
                                    catch(Throwable unused_ex) {
                                        return null;
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    public void PjT(String s) {
        if(!this.Au) {
            return;
        }
        if(!this.ReZ) {
            return;
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("duration", System.currentTimeMillis() - this.cr);
        }
        catch(JSONException jSONException0) {
            RD.PjT("TTAD.RFPM", "sendPlayableEvent error", jSONException0);
        }
        ReZ.Zh(this.xs, this.fDm, s, jSONObject0);
        if("return_foreground".equals(s)) {
            this.ReZ = false;
        }
    }

    public void PjT(JSONObject jSONObject0) {
        try {
            if(!this.Au) {
                return;
            }
            if(jSONObject0 != null) {
                jSONObject0.put("duration", System.currentTimeMillis() - this.cr);
            }
        }
        catch(JSONException jSONException0) {
            RD.PjT("TTAD.RFPM", "endShow json error", jSONException0);
        }
    }

    public void PjT(boolean z) {
        if(!this.Au) {
            return;
        }
        if(z) {
            this.ub.DWo().setDomStorageEnabled(true);
        }
    }

    public void PjT(boolean z, String s, int v) {
        if(!this.Au) {
            return;
        }
        try {
            Au au0 = this.Sks;
            if(au0 != null) {
                au0.cz(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(this.xs));
                this.Sks.PjT(z, s, v);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void RD() {
        if(!this.Au) {
            return;
        }
        this.ltE = (DWo)this.qla.ig.findViewById(qla.dnv);
    }

    public int ReZ(int v) {
        return this.XX - (this.cz - v);
    }

    public void ReZ() {
        if(!this.Au) {
            return;
        }
        if(this.yIW) {
            return;
        }
        this.yIW = true;
        this.ReZ(false);
        this.PjT(this.xf.getApplicationContext());
        Au au0 = this.Sks;
        if(au0 != null) {
            au0.wN();
        }
        this.xE.removeCallbacksAndMessages(null);
    }

    public void ReZ(String s) {
        Au au0 = this.Sks;
        if(au0 == null || !this.Au) {
            return;
        }
        au0.cz(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(this.xs));
        this.Sks.Au(s);
    }

    public void ReZ(boolean z) {
        if(!this.Au) {
            return;
        }
        this.qj = z;
        if(!z) {
            this.xE.removeMessages(900);
        }
    }

    public int SM() {
        return this.cz;
    }

    private boolean Sks() {
        if(this.ltE == null) {
            return false;
        }
        if(this.xs.Os() && cRA.gK(this.xs)) {
            this.ltE.Zh(this.xs, this.gK);
            return true;
        }
        this.ltE.ReZ();
        return false;
    }

    public void XX() {
        if(!this.Au) {
            return;
        }
        if(this.ltE.isShown()) {
            return;
        }
        DWo dWo0 = this.ltE;
        if(dWo0 != null) {
            dWo0.Zh(this.xs, this.gK);
            int v = this.qla.Jo.DWo() == null ? 0 : this.qla.Jo.DWo().getProgress();
            this.ltE.setProgress(v);
        }
        Au au0 = this.Sks;
        if(au0 != null) {
            au0.KM();
        }
    }

    public void Zh() {
        if(!this.Au) {
            return;
        }
        if(this.PjT.getAndSet(true)) {
            return;
        }
        this.ub.wN();
        if(cRA.Au(this.xs)) {
            this.ub.XX();
        }
    }

    public void Zh(int v) {
        if(!this.Au) {
            return;
        }
        DWo dWo0 = this.ltE;
        if(dWo0 != null) {
            dWo0.setProgress(v);
        }
    }

    public void Zh(String s) {
        Au au0 = this.Sks;
        if(au0 != null) {
            if(!this.Au) {
                return;
            }
            au0.cz(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(this.xs));
            this.Sks.SM(s);
        }
        if(this.qla()) {
            this.qla.Jo.JQp(true);
            this.qla.ZX.PjT(true);
            this.qla.xH = true;
        }
    }

    public void Zh(boolean z) {
        if(!this.Au) {
            return;
        }
        if(z) {
            try {
                if(!TextUtils.isEmpty(this.ub.cRA()) && this.ub.tT() != 0) {
                    com.bytedance.sdk.openadsdk.qla.ReZ.PjT().PjT(this.ub.cRA(), this.ub.tT(), this.ub.Lrd());
                }
            label_5:
                if(z) {
                    goto label_6;
                }
                return;
            }
            catch(Throwable unused_ex) {
            }
        }
        goto label_5;
        try {
        label_6:
            if(!TextUtils.isEmpty(this.ub.cRA())) {
                com.bytedance.sdk.openadsdk.qla.ReZ.PjT().Zh(this.ub.cRA());
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public void cr() {
        if(!this.Au) {
            return;
        }
        try {
            HomeWatcherReceiver homeWatcherReceiver0 = new HomeWatcherReceiver();
            this.RD = homeWatcherReceiver0;
            homeWatcherReceiver0.PjT(new com.bytedance.sdk.component.utils.HomeWatcherReceiver.PjT() {
                final SM PjT;

                @Override  // com.bytedance.sdk.component.utils.HomeWatcherReceiver$PjT
                public void PjT() {
                    SM.this.ReZ = true;
                }

                @Override  // com.bytedance.sdk.component.utils.HomeWatcherReceiver$PjT
                public void Zh() {
                    SM.this.ReZ = true;
                }
            });
            IntentFilter intentFilter0 = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            this.xf.getApplicationContext().registerReceiver(this.RD, intentFilter0);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void cr(int v) {
        this.JQp = v - 1;
    }

    public void cr(boolean z) {
        if(!this.Au) {
            return;
        }
        Au au0 = this.Sks;
        if(au0 != null) {
            au0.ReZ(z);
        }
    }

    public void cz() {
        if(!this.Au) {
            return;
        }
        if(!cRA.Au(this.xs) && this.ltE.isShown()) {
            xs xs0 = this.qla.Xtz;
            if(xs0 != null) {
                xs0.PjT(((long)(this.SM() * 1000)));
            }
        }
        if(cRA.ltE(this.xs) && this.ltE.isShown()) {
            this.qla.qZS.Zh(this.qla.wKV);
        }
        DWo dWo0 = this.ltE;
        if(dWo0 != null) {
            dWo0.ReZ();
        }
        if(this.PjT.getAndSet(true)) {
            return;
        }
        if(this.qla.Jo.Zd()) {
            Au au0 = this.Sks;
            if(au0 != null) {
                au0.PjT(1);
            }
        }
        if(cRA.XX(this.xs) && cRA.tT(this.xs)) {
            gK gK0 = this.qla.Jo;
            if(gK0 != null && !gK0.Zd()) {
                int v = this.qla.Jo.gK() ? 3 : 2;
                Au au1 = this.Sks;
                if(au1 != null) {
                    au1.PjT(v);
                }
                if(cRA.gK(this.qla.Zh)) {
                    boolean z = this.qla.Zh.Sky();
                    this.PjT(this.qla.cz, this.qla.Zh, z);
                    this.JQp();
                    this.qla.kph.qj();
                }
                this.qla.qZS.PjT(false);
                this.qla.Jo.qZS();
                this.Lrd = true;
                this.qla.wN.ReZ(false);
                this.qla.cRA.JQp(true);
                this.qla.xH = true;
                if(cRA.ltE(this.xs)) {
                    this.xE.removeMessages(900);
                    this.qla.wN.cr(false);
                    com.bytedance.sdk.component.utils.KM kM0 = this.qla.OMu;
                    if(kM0 != null) {
                        kM0.removeMessages(1);
                        this.qla.OMu.sendEmptyMessageDelayed(600, 1000L);
                    }
                }
                Au au2 = this.Sks;
                if(au2 != null) {
                    au2.ReZ(true);
                }
                return;
            }
            this.qla.qZS.PjT(this.qla.wKV);
        }
    }

    public void cz(boolean z) {
        if(!this.Au) {
            return;
        }
        if(z && !this.qla.cRA.XX()) {
            Au au0 = this.Sks;
            if(au0 != null) {
                au0.PjT(1);
            }
            boolean z1 = cRA.gK(this.xs);
            if((z1 || cRA.tT(this.xs)) && this.xs.Os() && !cRA.xE(this.xs)) {
                Message message0 = this.xE.obtainMessage(800, 0, 0);
                this.xE.sendMessageDelayed(message0, 1000L);
            }
            if(z1) {
                this.qla.cRA.Au();
                this.qla.Jo.Zh(true);
                this.qla.Jo.ReZ(true);
                ReZ.PjT(System.currentTimeMillis(), this.qla.Zh, this.fDm, "py_loading_success");
            }
        }
    }

    public JQp fDm() {
        return this.iZZ;
    }

    public Au gK() {
        return this.Sks;
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(Message message0) {
        int v = message0.what;
        if(v == 900) {
            if(this.qj && cRA.gK(this.qla.Zh)) {
                int v1 = message0.arg1;
                if(v1 > 0) {
                    this.qla.wN.cr(true);
                    int v2 = this.qla.cRA.Zh(v1);
                    if(v2 == v1) {
                        this.qla.wN.PjT(String.valueOf(v1), null);
                    }
                    else if(v2 > 0) {
                        String s = Lrd.PjT(this.qla.rds.getApplicationContext(), "tt_skip_ad_time_text");
                        this.qla.wN.PjT(String.valueOf(v1), String.format(s, v2));
                    }
                    else if(!cRA.Au(this.xs) || this.qla()) {
                        this.qla.ltE.set(true);
                        this.qla.wKV.qla();
                    }
                    else {
                        String s1 = Lrd.PjT(this.qla.rds.getApplicationContext(), "tt_reward_screen_skip_tx");
                        this.qla.wN.PjT(String.valueOf(v1), s1);
                        this.qla.wN.JQp(true);
                    }
                    Message message1 = Message.obtain();
                    message1.what = 900;
                    message1.arg1 = v1 - 1;
                    this.xE.sendMessageDelayed(message1, 1000L);
                    this.cr(v1);
                }
                else {
                    if(!cRA.Au(this.xs) || cRA.tT(this.xs) && this.qla.cRA.XX()) {
                        this.qla.wN.cr(false);
                        this.qla.ltE.set(true);
                        this.qla.wKV.qla();
                    }
                    else {
                        this.qla.wN.ReZ();
                        this.qla.wN.JQp(true);
                    }
                    if(!this.SM) {
                        this.cRA = true;
                    }
                }
                this.qla.kph.fDm();
                return true;
            }
            return true;
        }
        if(v != 800 || this.ltE != null && (!this.ltE.isShown() || this.ltE.cr())) {
            return true;
        }
        JSONObject jSONObject0 = new JSONObject();
        long v3 = 0L;
        try {
            jSONObject0.put("remove_loading_page_type", message0.arg1);
            int v4 = message0.arg2;
            if(v4 != 0) {
                jSONObject0.put("remove_loading_page_reason", v4);
            }
            String s2 = cRA.xf(this.xs);
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.qla;
            if(pjT0 != null) {
                gK gK0 = pjT0.Jo;
                if(gK0 != null) {
                    String s3 = gK0.cRA();
                    if(!TextUtils.isEmpty(s3)) {
                        s2 = s3;
                    }
                }
            }
            jSONObject0.put("playable_url", s2);
            DWo dWo0 = this.ltE;
            if(dWo0 != null) {
                v3 = dWo0.getDisplayDuration();
            }
            jSONObject0.put("duration", v3);
        }
        catch(JSONException jSONException0) {
            RD.PjT("TTAD.RFPM", "handleMessage json error", jSONException0);
        }
        ReZ.PjT(this.qla.Zh, this.qla.JQp, "remove_loading_page", jSONObject0, v3);
        this.xE.removeMessages(800);
        if(!this.xf.isFinishing()) {
            this.qla.cRA.JQp();
        }
        return true;
    }

    public void qj() {
        if(!this.Au) {
            return;
        }
        if(this.Sks != null && qZS.cr(this.qla.Jo.DWo())) {
            this.Sks.ReZ(true);
        }
    }

    public boolean qla() {
        return this.Lrd;
    }

    private String tT() {
        String s = ub.cr().Lrd();
        if(!TextUtils.isEmpty(s) && this.xs.uQg() != null) {
            double f = this.xs.uQg().cr();
            int v = this.xs.uQg().JQp();
            String s1 = this.xs.Xe() == null || TextUtils.isEmpty(this.xs.Xe().PjT()) ? "" : this.xs.Xe().PjT();
            String s2 = this.xs.dIF();
            String s3 = this.xs.Xtz();
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("appname=");
            stringBuilder0.append("");
            stringBuilder0.append("&stars=");
            stringBuilder0.append(f);
            stringBuilder0.append("&comments=");
            stringBuilder0.append(v);
            stringBuilder0.append("&icon=");
            stringBuilder0.append(URLEncoder.encode(s1));
            stringBuilder0.append("&downloading=true&id=");
            stringBuilder0.append(URLEncoder.encode(s2));
            stringBuilder0.append("&packageName=");
            stringBuilder0.append("");
            stringBuilder0.append("&downloadUrl=");
            stringBuilder0.append("");
            stringBuilder0.append("&name=");
            stringBuilder0.append("");
            stringBuilder0.append("&orientation=");
            stringBuilder0.append((this.gK == 1 ? "portrait" : "landscape"));
            stringBuilder0.append("&apptitle=");
            stringBuilder0.append(URLEncoder.encode(s3));
            return s + "?" + stringBuilder0;
        }
        return s;
    }

    public boolean ub() {
        return this.ltE != null && this.ltE.isShown();
    }

    public boolean xE() {
        return this.cRA;
    }

    public void xf() {
        if(!this.Au) {
            return;
        }
        Au au0 = this.Sks;
        if(au0 != null) {
            au0.ReZ(false);
        }
        this.xE.removeMessages(900);
    }

    public void xs() {
        if(!this.Au) {
            return;
        }
        this.xE.removeMessages(900);
        this.xE.removeMessages(600);
    }
}

