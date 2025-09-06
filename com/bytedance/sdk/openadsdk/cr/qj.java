package com.bytedance.sdk.openadsdk.cr;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.fDm;
import com.bytedance.sdk.openadsdk.Owx.Au;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.settings.XX;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.PjT.cz;
import com.bytedance.sdk.openadsdk.cr.cr.JQp;
import com.bytedance.sdk.openadsdk.cz.Zh;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class qj {
    class PjT {
        final qj PjT;

        private PjT() {
        }

        PjT(com.bytedance.sdk.openadsdk.cr.qj.1 qj$10) {
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        @JavascriptInterface
        public void readPercent(String s) {
            int v = 0;
            try {
                int v1 = Float.valueOf(s).intValue();
                if(v1 > 100) {
                    v = 100;
                }
                else if(v1 >= 0) {
                    v = v1;
                }
            }
            catch(Throwable unused_ex) {
            }
            qj.this.wN.set(v);
        }
    }

    private final AtomicBoolean Au;
    private final boolean Co;
    private final AtomicBoolean DWo;
    private String HG;
    private volatile long IJ;
    private long JQp;
    private boolean Jo;
    private long KM;
    private volatile long Ld;
    private int Lrd;
    private volatile long MWx;
    private final AtomicInteger OMu;
    private boolean Owx;
    public com.bytedance.sdk.openadsdk.core.widget.PjT.cz.PjT PjT;
    private long Qf;
    private int RD;
    private static final int[] ReZ;
    private final AtomicBoolean SM;
    private long Sks;
    private final AtomicInteger VY;
    private final AtomicBoolean XX;
    private final AtomicBoolean Xe;
    private long Yo;
    private long ZX;
    private boolean Zd;
    AtomicBoolean Zh;
    private volatile long cI;
    private final Owx cRA;
    private int cr;
    private int cz;
    private int dwk;
    private String fDm;
    private Au gK;
    private long iZZ;
    private JQp ig;
    private String kFP;
    private DWo kph;
    private com.bytedance.sdk.openadsdk.cr.Au ltE;
    private final AtomicBoolean oG;
    private WeakReference qZS;
    private int qj;
    private final Context qla;
    private boolean rds;
    private long tT;
    private final AtomicBoolean tY;
    private boolean ub;
    private final AtomicInteger wN;
    private cz xE;
    private volatile int xH;
    private boolean xf;
    private String xs;
    private String yIW;
    private long zZ;

    static {
        qj.ReZ = new int[]{10, 30, 50, 75, 100};
    }

    public qj(Owx owx0, WebView webView0) {
        this(owx0, webView0, false);
    }

    public qj(Owx owx0, WebView webView0, DWo dWo0, int v) {
        this(owx0, webView0);
        this.kph = dWo0;
        this.dwk = v;
    }

    public qj(Owx owx0, WebView webView0, boolean z) {
        this.cr = 0;
        this.JQp = -1L;
        this.cz = 1;
        this.XX = new AtomicBoolean(false);
        this.Au = new AtomicBoolean(false);
        this.SM = new AtomicBoolean(false);
        this.DWo = new AtomicBoolean(false);
        this.qj = -1;
        this.Owx = false;
        this.RD = 0;
        this.Zh = new AtomicBoolean(false);
        this.yIW = "landingpage";
        this.iZZ = 0L;
        this.Yo = 0L;
        this.KM = 0L;
        this.Qf = 0L;
        this.ZX = 0L;
        this.Jo = false;
        this.Co = false;
        this.wN = new AtomicInteger(0);
        this.Zd = false;
        this.rds = false;
        this.IJ = 0L;
        this.OMu = new AtomicInteger(0);
        this.VY = new AtomicInteger(0);
        this.tY = new AtomicBoolean(false);
        this.xH = 0;
        this.dwk = -1;
        this.oG = new AtomicBoolean(false);
        this.Xe = new AtomicBoolean(false);
        Context context0 = ub.PjT();
        this.qla = context0;
        this.cRA = owx0;
        if(webView0 == null) {
            return;
        }
        this.Owx = z;
        WeakReference weakReference0 = new WeakReference(webView0);
        this.qZS = weakReference0;
        WebView webView1 = (WebView)weakReference0.get();
        if(webView1 == null) {
            return;
        }
        if(owx0 != null && owx0.oG()) {
            cz cz0 = new cz(webView1, owx0, context0, this.Owx);
            this.xE = cz0;
            this.PjT = cz0.ReZ();
        }
        if(owx0 != null && owx0.HG() && xs.Gr().fK()) {
            this.ltE = new com.bytedance.sdk.openadsdk.cr.Au(owx0, webView0, this.Owx);
        }
        this.zZ = webView0 instanceof com.bytedance.sdk.component.SM.JQp ? ((com.bytedance.sdk.component.SM.JQp)webView1).PjT : System.currentTimeMillis();
        try {
            webView1.addJavascriptInterface(new PjT(this, null), "JS_LANDING_PAGE_LOG_OBJ");
        }
        catch(Exception exception0) {
            RD.PjT("LandingPageLog", "addJavascriptInterface exception", exception0);
        }
        if(owx0 != null && owx0.Tn() != null) {
            this.JQp = owx0.Tn().optLong("page_id", -1L);
        }
        this.kFP = "7863935";
    }

    public void Au() {
        if(!"landingpage".equals(this.yIW) && !"landingpage_endcard".equals(this.yIW) && !"landingpage_split_screen".equals(this.yIW) && !"landingpage_direct".equals(this.yIW) && !"aggregate_page".equals(this.yIW) && !"landingpage_split_ceiling".equals(this.yIW)) {
            return;
        }
        if(this.cz == 2 && (this.Yo > 0L || !this.ReZ())) {
            long v = System.currentTimeMillis();
            long v1 = Math.max(this.iZZ, this.Yo);
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("load_status", this.cz);
                jSONObject0.put("max_scroll_percent", this.wN.get());
                jSONObject0.put("jump_times", this.OMu.getAndSet(0));
                jSONObject0.put("click_times", this.VY.getAndSet(0));
                jSONObject0.putOpt("render_type", "h5");
                jSONObject0.putOpt("render_type_2", 0);
            }
            catch(JSONException unused_ex) {
            }
            this.DWo.set(true);
            this.PjT("stay_page", jSONObject0, Math.min(v - v1, 600000L));
            Zh.PjT().PjT("landingPause", this.cRA, this.kFP);
        }
    }

    private int DWo() {
        WebView webView0 = this.qZS == null ? null : ((WebView)this.qZS.get());
        if(webView0 != null) {
            try {
                WebBackForwardList webBackForwardList0 = webView0.copyBackForwardList();
                if(webBackForwardList0 != null && webBackForwardList0.getCurrentIndex() == 0) {
                    return 1;
                }
            }
            catch(Throwable unused_ex) {
            }
        }
        return 0;
    }

    public void JQp() {
        if(this.SM()) {
            this.Ld = SystemClock.elapsedRealtime();
            this.cz();
        }
    }

    // 去混淆评级： 中等(140)
    private void PjT(int v, String s) {

        class com.bytedance.sdk.openadsdk.cr.qj.3 implements Runnable {
            final qj ReZ;

            com.bytedance.sdk.openadsdk.cr.qj.3(WebView webView0, String s) {
            }

            @Override
            public void run() {
                fDm.PjT(this.PjT, this.Zh);
            }
        }

    }

    public static void PjT(Owx owx0, String s, long v, int v1) {
        ReZ.PjT(System.currentTimeMillis(), owx0, s, "lp_feeling_duration", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("is_lp_pre_render", v1);
                    jSONObject2.put("meta_pre_render", ((int)owx0.AK()));
                    com.bytedance.sdk.openadsdk.core.model.ub ub0 = owx0.fDm();
                    if(ub0 == null) {
                        ub0 = new com.bytedance.sdk.openadsdk.core.model.ub();
                    }
                    jSONObject2.put("pre_render_status", ub0.ReZ());
                    jSONObject2.put("pre_render_use_gecko", ub0.Zh());
                    jSONObject2.put("pre_render_add_type", ub0.PjT());
                    jSONObject1.put("pag_json_data", jSONObject2.toString());
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                    jSONObject0.put("duration", v);
                }
                catch(Throwable unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    private void PjT(String s, String s1, long v) {
        if(this.SM.compareAndSet(false, true)) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                if(s.length() > 200) {
                    int v1 = s.indexOf(38, 200);
                    int v2 = 300;
                    if(v1 == -1 || v1 > 300) {
                        v1 = s.indexOf(0x3F);
                    }
                    if(v1 != -1 && v1 <= 300) {
                        v2 = v1;
                    }
                    s = s.substring(0, v2);
                }
                jSONObject0.put("url", s);
                jSONObject0.put("type", s1);
            }
            catch(Throwable unused_ex) {
            }
            this.PjT("load_finish_progress", jSONObject0, v);
        }
    }

    private void PjT(String s, JSONObject jSONObject0) {
        this.PjT(s, jSONObject0, -1L);
    }

    private void PjT(String s, JSONObject jSONObject0, long v) {
        if(!this.Zd) {
            return;
        }
        if(this.cRA != null && !TextUtils.isEmpty(s)) {
            String s1 = this.yIW;
            com.bytedance.sdk.openadsdk.cr.qj.1 qj$10 = new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                final qj JQp;

                @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                public JSONObject PjT() {
                    JSONObject jSONObject2;
                    if(jSONObject0 != null) {
                        try {
                            boolean z = cRA.Zh(qj.this.cRA);
                            int v = 0;
                            jSONObject0.put("is_playable", ((int)z));
                            boolean z1 = com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(qj.this.cRA);
                            jSONObject0.put("usecache", ((int)z1));
                            if(z && ("load_finish".equals(s) || "load_fail".equals(s))) {
                                jSONObject0.put("playable_has_show", (this.gK == null ? -1 : this.gK.qZS()));
                            }
                            if(com.bytedance.sdk.openadsdk.xs.PjT.ReZ(qj.this.cRA)) {
                                JSONObject jSONObject0 = new JSONObject();
                                jSONObject0.put("is_lp_pre_render", qj.this.RD);
                                jSONObject0.put("pag_json_data", jSONObject0.toString());
                            }
                            if("stay_page".equals(s)) {
                                JSONObject jSONObject1 = jSONObject0;
                                if(qj.this.Lrd <= 1) {
                                    v = 1;
                                }
                                jSONObject1.put("first_page", v);
                            }
                        }
                        catch(JSONException unused_ex) {
                        }
                        try {
                            jSONObject2 = new JSONObject();
                        }
                        catch(JSONException unused_ex) {
                            return null;
                        }
                        try {
                            jSONObject2.put("ad_extra_data", jSONObject0.toString());
                            long v1 = v;
                            if(v1 > 0L) {
                                jSONObject2.put("duration", v1);
                            }
                        }
                        catch(JSONException unused_ex) {
                        }
                        return jSONObject2;
                    }
                    return null;
                }
            };
            ReZ.PjT(System.currentTimeMillis(), this.cRA, s1, s, qj$10);
        }
    }

    private void PjT(boolean z, String s) {
        if(!z) {
            return;
        }
        ReZ.PjT(new com.bytedance.sdk.component.Au.Au("sendPrefLog") {
            final qj ReZ;

            @Override
            public void run() {
                try {
                    XX xX0 = ub.cr().tT();
                    if(!qj.this.PjT(xX0, s)) {
                        return;
                    }
                    if(!TextUtils.isEmpty(xX0.ReZ)) {
                        String s = xX0.ReZ;
                        com.bytedance.sdk.component.XX.Zh.Zh zh0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().ReZ();
                        zh0.Zh(s);
                        HashMap hashMap0 = new HashMap();
                        hashMap0.put("content-type", "application/json; charset=utf-8");
                        zh0.cr(hashMap0);
                        zh0.PjT(9);
                        zh0.PjT("sendPrefLog");
                        zh0.PjT(new com.bytedance.sdk.component.XX.PjT.PjT() {
                            final com.bytedance.sdk.openadsdk.cr.qj.2 PjT;

                            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
                                try {
                                    XX.Zh = zh0.cr();
                                    qj.this.PjT(com.bytedance.sdk.openadsdk.cr.qj.2.this.Zh, com.bytedance.sdk.openadsdk.cr.qj.2.this.PjT);
                                }
                                catch(Exception exception0) {
                                    RD.PjT("LandingPageLog", "TTWebViewClient : onPageFinished", exception0);
                                }
                            }

                            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
                            }
                        });
                    }
                    return;
                }
                catch(Throwable throwable0) {
                }
                RD.Zh(throwable0.getMessage(), new Object[0]);
            }
        });
    }

    private boolean PjT(XX xX0, String s) {
        s.hashCode();
        switch(s) {
            case "0": {
                return xX0.cr;
            }
            case "1": {
                return xX0.JQp;
            }
            case "2": {
                return xX0.cz;
            }
            default: {
                return false;
            }
        }
    }

    public Owx PjT() {
        return this.cRA;
    }

    public void PjT(int v) {
        this.dwk = v;
    }

    public void PjT(long v) {
        this.Yo = v;
    }

    public void PjT(MotionEvent motionEvent0) {
        cz cz0 = this.xE;
        if(cz0 != null && this.ub) {
            cz0.PjT(motionEvent0);
        }
        int v = motionEvent0.getActionMasked();
        if(this.IJ != 0L && (v == 1 || v == 3)) {
            this.VY.incrementAndGet();
            if(!this.tY.getAndSet(true)) {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("url", this.cRA.xu());
                }
                catch(JSONException unused_ex) {
                }
                this.PjT("click_time", jSONObject0, Math.max(SystemClock.elapsedRealtime() - this.IJ, 0L));
            }
        }
    }

    public void PjT(WebView webView0, int v) {
        if(webView0 == null) {
            return;
        }
        if(this.IJ == 0L) {
            this.IJ = SystemClock.elapsedRealtime();
        }
        if(this.KM == 0L && v > 0) {
            this.KM = System.currentTimeMillis();
        }
        else if(this.Qf == 0L && v == 100) {
            this.Qf = System.currentTimeMillis();
        }
        if(this.cr != qj.ReZ.length && ("landingpage".equals(this.yIW) || "landingpage_endcard".equals(this.yIW) || "landingpage_split_screen".equals(this.yIW) || "landingpage_direct".equals(this.yIW) || "aggregate_page".equals(this.yIW))) {
            for(int v1 = this.cr; true; ++v1) {
                int[] arr_v = qj.ReZ;
                if(v1 >= arr_v.length || v < arr_v[this.cr]) {
                    break;
                }
                this.cr = v1 + 1;
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("url", webView0.getUrl());
                    long v2 = this.JQp;
                    if(v2 != -1L) {
                        jSONObject0.put("page_id", v2);
                    }
                    jSONObject0.putOpt("render_type", "h5");
                    jSONObject0.putOpt("render_type_2", 0);
                    jSONObject0.put("pct", arr_v[v1]);
                }
                catch(Exception unused_ex) {
                }
                this.PjT("progress_load_finish", jSONObject0);
            }
        }
        if(v == 100) {
            this.PjT(false, SystemClock.elapsedRealtime());
            this.PjT(webView0.getUrl(), "progress", Math.min(this.Qf - this.KM, 600000L));
        }
    }

    public void PjT(WebView webView0, int v, String s, String s1, String s2, boolean z) {
        JQp jQp0 = this.ig;
        if(jQp0 != null) {
            jQp0.PjT(null);
        }
        if((s2 == null || !s2.startsWith("image")) && this.cz != 2) {
            this.cz = 3;
        }
        this.qj = v;
        this.xs = s;
        this.fDm = s1;
        this.xf = z;
    }

    public void PjT(WebView webView0, String s, Bitmap bitmap0, boolean z, int v) {
        this.ub = z;
        ++this.Lrd;
        cz cz0 = this.xE;
        if(cz0 != null && z) {
            cz0.Zh(s);
            this.xE.Zh();
        }
        com.bytedance.sdk.openadsdk.cr.Au au0 = this.ltE;
        if(au0 != null && z) {
            au0.PjT(s, v);
        }
        WebView webView1 = this.qZS == null ? null : ((WebView)this.qZS.get());
        if(webView1 != null) {
            try {
                WebBackForwardList webBackForwardList0 = webView1.copyBackForwardList();
                if(webBackForwardList0 != null && webBackForwardList0.getCurrentIndex() > this.xH) {
                    this.OMu.incrementAndGet();
                }
                this.xH = webBackForwardList0.getCurrentIndex();
                goto label_18;
            }
            catch(Exception exception0) {
            }
            RD.PjT("LandingPageLog", "copyBackForwardList exception", exception0);
        }
    label_18:
        if(this.IJ == 0L) {
            this.IJ = SystemClock.elapsedRealtime();
        }
        JQp jQp0 = this.ig;
        if(jQp0 != null) {
            jQp0.JQp();
        }
        if(this.XX.compareAndSet(false, true)) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.putOpt("render_type", "h5");
                jSONObject0.putOpt("render_type_2", 0);
                int v1 = this.dwk;
                if(v1 >= 0) {
                    jSONObject0.putOpt("preload_status", v1);
                }
            }
            catch(Exception unused_ex) {
            }
            this.PjT("load_start", jSONObject0);
        }
    }

    public void PjT(WebView webView0, String s, boolean z) {
        boolean z1 = false;
        this.PjT(false, SystemClock.elapsedRealtime());
        cz cz0 = this.xE;
        if(cz0 != null && z) {
            cz0.PjT();
        }
        JQp jQp0 = this.ig;
        if(jQp0 != null) {
            jQp0.cz();
        }
        com.bytedance.sdk.openadsdk.cr.Au au0 = this.ltE;
        if(au0 != null && z) {
            au0.PjT(s);
        }
        if(webView0 != null && !this.Jo && this.Zd) {
            this.Jo = true;
            fDm.PjT(webView0, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log(\'LandingPageLogscroll status: (\' + scrollH + \'+\' + clientH + \')/\' + totalH + \'=\' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener(\'scroll\', function(e){\n    sendScroll();\n});");
        }
        if(!this.Au.compareAndSet(false, true)) {
            return;
        }
        if(this.cz != 3) {
            this.cz = 2;
        }
        this.iZZ = System.currentTimeMillis();
        if(this.cz == 2) {
            z1 = true;
        }
        int v = this.DWo();
        if(z1) {
            long v1 = this.Qf - this.KM;
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("error_code", this.qj);
                jSONObject0.put("error_msg", this.xs);
                jSONObject0.put("error_url", this.fDm);
                int v2 = this.dwk;
                if(v2 >= 0) {
                    jSONObject0.put("preload_status", v2);
                }
                jSONObject0.put("first_page", v);
                jSONObject0.putOpt("render_type", "h5");
                jSONObject0.putOpt("render_type_2", 0);
                jSONObject0.put("url", this.cRA.xu());
                jSONObject0.put("preload_h5_type", this.cRA.Uo());
            }
            catch(Exception unused_ex) {
            }
            this.PjT(z, "0");
            long v3 = Math.min(v1, 600000L);
            this.PjT("load_finish", jSONObject0, v3);
            if(this.SM()) {
                this.cI = SystemClock.elapsedRealtime();
                this.cz();
                ReZ.PjT(this.cRA, this.HG, this.cI - this.MWx);
            }
            this.PjT(s, "load_finish", v3);
            DWo dWo0 = this.kph;
            if(dWo0 != null) {
                dWo0.PjT(v);
            }
            return;
        }
        JSONObject jSONObject1 = new JSONObject();
        try {
            jSONObject1.put("error_code", this.qj);
            jSONObject1.put("error_msg", this.xs);
            jSONObject1.put("error_url", this.fDm);
            jSONObject1.put("first_page", v);
            int v4 = this.dwk;
            if(v4 >= 0) {
                jSONObject1.put("preload_status", v4);
            }
            jSONObject1.putOpt("render_type", "h5");
            jSONObject1.putOpt("render_type_2", 0);
            jSONObject1.put("url", this.cRA.xu());
            jSONObject1.put("preload_h5_type", this.cRA.Uo());
        }
        catch(Exception unused_ex) {
        }
        this.PjT(z, "2");
        this.PjT("load_fail", jSONObject1);
        if(this.SM()) {
            long v5 = SystemClock.elapsedRealtime();
            ReZ.PjT(this.cRA, this.HG, v5 - this.MWx, this.qj, this.xs, this.fDm);
        }
        if(this.xf) {
            jSONObject1.remove("render_type");
            jSONObject1.remove("render_type_2");
            this.PjT("load_fail_main", jSONObject1);
        }
    }

    public void PjT(com.bytedance.sdk.component.SM.cz cz0) {
        if("landingpage".equals(this.yIW) || "landingpage_endcard".equals(this.yIW) || "landingpage_split_screen".equals(this.yIW) || "landingpage_direct".equals(this.yIW) || "aggregate_page".equals(this.yIW)) {
            int v = ub.cr().HG();
            if(v == 0) {
                return;
            }
            if(new Random().nextInt(100) + 1 > v) {
                return;
            }
            if(cz0 != null && cz0.getWebView() != null && cz0.getVisibility() == 0) {
                Bitmap bitmap0 = qZS.PjT(cz0);
                if(bitmap0 != null) {
                    Owx owx0 = this.cRA;
                    if(owx0 != null) {
                        qZS.PjT(owx0, this.yIW, "landing_page_blank", bitmap0, cz0.getUrl(), this.JQp);
                    }
                }
            }
        }
    }

    public void PjT(Au au0) {
        this.gK = au0;
    }

    public void PjT(DWo dWo0) {
        this.kph = dWo0;
    }

    public void PjT(JQp jQp0) {
        this.ig = jQp0;
    }

    public void PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        cz cz0 = this.xE;
        if(cz0 != null) {
            cz0.PjT(s);
        }
        com.bytedance.sdk.openadsdk.cr.Au au0 = this.ltE;
        if(au0 != null) {
            au0.ReZ(s);
        }
        this.yIW = s;
    }

    public void PjT(String s, boolean z) {
        cz cz0 = this.xE;
        if(cz0 != null && z) {
            cz0.ReZ(s);
        }
        com.bytedance.sdk.openadsdk.cr.Au au0 = this.ltE;
        if(au0 != null && z) {
            au0.Zh(s);
        }
    }

    public void PjT(boolean z) {
        if(z) {
            this.RD = 1;
        }
    }

    public void PjT(boolean z, long v) {
        if(z) {
            this.Sks = v;
        }
        else {
            this.tT = v;
        }
        if(this.Sks > 0L && this.tT > 0L && this.ub && this.Zh.compareAndSet(false, true)) {
            qj.PjT(this.cRA, this.yIW, this.tT - this.Sks, this.RD);
        }
    }

    private String ReZ(String s) [...] // Inlined contents

    public void ReZ(boolean z) {
        this.rds = z;
    }

    public boolean ReZ() {
        return this.rds;
    }

    // 去混淆评级： 低(20)
    private boolean SM() {
        return this.rds && (this.cRA != null && this.cRA.iZF());
    }

    public void XX() {
        if(this.ZX == 0L) {
            this.ZX = System.currentTimeMillis();
        }
        this.iZZ = System.currentTimeMillis();
        if("landingpage".equals(this.yIW) || "landingpage_endcard".equals(this.yIW) || "landingpage_split_screen".equals(this.yIW) || "landingpage_direct".equals(this.yIW) || "aggregate_page".equals(this.yIW)) {
            if(this.Xe.compareAndSet(false, true)) {
                Zh.PjT().PjT("landingStart", this.cRA, this.kFP);
            }
            else {
                Zh.PjT().PjT("landingContinue", this.cRA, this.kFP);
            }
        }
        if(gK.cz(this.cRA) || gK.Zh(this.cRA)) {
            this.PjT(true, SystemClock.elapsedRealtime());
        }
    }

    public JQp Zh() {
        return this.ig;
    }

    public qj Zh(boolean z) {
        this.Zd = z;
        return this;
    }

    public void Zh(int v) {
        cz cz0 = this.xE;
        if(cz0 != null && this.ub) {
            cz0.PjT(v);
        }
    }

    public void Zh(WebView webView0, String s, boolean z) {
        com.bytedance.sdk.openadsdk.cr.Au au0 = this.ltE;
        if(au0 != null && z) {
            au0.PjT(webView0, s);
        }
    }

    public void Zh(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.HG = s;
    }

    static String cr(qj qj0) {
        return qj0.yIW;
    }

    public void cr() {
        if(this.SM()) {
            this.MWx = SystemClock.elapsedRealtime();
            ReZ.PjT(this.cRA, this.HG);
        }
    }

    public void cr(boolean z) {
        WebView webView0 = this.qZS == null ? null : ((WebView)this.qZS.get());
        if(webView0 != null) {
            try {
                webView0.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            }
            catch(Exception exception0) {
                RD.PjT("LandingPageLog", "removeJavascriptInterface exception", exception0);
            }
        }
        if(this.Au.compareAndSet(false, true)) {
            this.PjT(z, "1");
            if(this.Zd) {
                String s = this.yIW;
                long v = System.currentTimeMillis() - this.ZX;
                int v1 = this.dwk;
                int v2 = this.DWo();
                ReZ.PjT(this.cRA, s, v, v1, v2);
            }
        }
        else if(this.cz == 2 && !this.DWo.get()) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("load_status", this.cz);
                jSONObject0.put("max_scroll_percent", this.wN.get());
                jSONObject0.put("jump_times", this.OMu.getAndSet(0));
                jSONObject0.put("click_times", this.VY.getAndSet(0));
                jSONObject0.putOpt("render_type", "h5");
                jSONObject0.putOpt("render_type_2", 0);
            }
            catch(JSONException unused_ex) {
            }
            this.PjT("stay_page", jSONObject0, 0L);
        }
        if("landingpage".equals(this.yIW) || "landingpage_endcard".equals(this.yIW) || "landingpage_split_screen".equals(this.yIW) || "landingpage_direct".equals(this.yIW) || "aggregate_page".equals(this.yIW) || "landingpage_split_ceiling".equals(this.yIW)) {
            Zh.PjT().PjT("landingFinish", this.cRA, this.kFP);
        }
    }

    public void cz() {
        if(!this.SM()) {
            return;
        }
        if(this.Ld > 0L && this.cI > 0L && !this.oG.getAndSet(true)) {
            ReZ.Zh(this.cI - this.Ld, this.cRA, this.HG, null);
        }
    }
}

