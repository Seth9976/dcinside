package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.PjT.ub;
import com.bytedance.sdk.component.adexpress.JQp.Zh;
import com.bytedance.sdk.component.utils.KM.PjT;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.DWo.cr;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.Au.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.RD;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.model.tT;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.widget.JQp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.bytedance.sdk.openadsdk.xf.Au;
import com.bytedance.sdk.openadsdk.xf.XX;
import com.bytedance.sdk.openadsdk.xf.cz;
import com.bytedance.sdk.openadsdk.xf.qj;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class KM implements Zh, PjT, com.bytedance.sdk.openadsdk.DWo.Zh {
    public interface com.bytedance.sdk.openadsdk.core.KM.PjT {
        void PjT();
    }

    static class ReZ implements Runnable {
        private final fDm PjT;
        private final JSONObject Zh;

        public ReZ(fDm fDm0, JSONObject jSONObject0) {
            this.PjT = fDm0;
            this.Zh = jSONObject0;
        }

        @Override
        public void run() {
            KM.Zh(this.PjT, this.Zh);
        }
    }

    public static class com.bytedance.sdk.openadsdk.core.KM.Zh {
        public int JQp;
        public String PjT;
        public String ReZ;
        public String Zh;
        public JSONObject cr;

    }

    private static final Map Au;
    private boolean Co;
    private String DWo;
    private com.bytedance.sdk.openadsdk.core.widget.PjT.PjT IJ;
    private final com.bytedance.sdk.component.utils.KM JQp;
    private HashMap Jo;
    private qj KM;
    private com.bytedance.sdk.openadsdk.core.KM.PjT Ld;
    private cz Lrd;
    private com.bytedance.sdk.openadsdk.core.xf.cr.Zh MWx;
    private Au OMu;
    private fDm Owx;
    protected Map PjT;
    private boolean Qf;
    private JSONObject RD;
    boolean ReZ;
    private com.bytedance.sdk.openadsdk.DWo.ReZ SM;
    private cr Sks;
    private XX VY;
    private JQp XX;
    private com.bytedance.sdk.openadsdk.xf.ReZ Yo;
    private List ZX;
    private ub Zd;
    boolean Zh;
    private ReZ cI;
    private com.bytedance.sdk.openadsdk.xf.JQp cRA;
    private WeakReference cr;
    private String cz;
    private Context dwk;
    private String fDm;
    private JSONObject gK;
    private com.bytedance.sdk.openadsdk.core.Zh.cr iZZ;
    private com.bytedance.sdk.openadsdk.xf.Zh ig;
    private boolean kph;
    private com.bytedance.sdk.component.adexpress.Zh.qj ltE;
    private com.bytedance.sdk.openadsdk.cr.cr.JQp qZS;
    private WeakReference qj;
    private int qla;
    private String rds;
    private com.bytedance.sdk.openadsdk.xf.PjT tT;
    private boolean tY;
    private Owx ub;
    private boolean wN;
    private boolean xE;
    private boolean xH;
    private String xf;
    private int xs;
    private JSONObject yIW;

    static {
        ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
        KM.Au = concurrentHashMap0;
        concurrentHashMap0.put("log_event", Boolean.TRUE);
        concurrentHashMap0.put("private", Boolean.TRUE);
        concurrentHashMap0.put("dispatch_message", Boolean.TRUE);
        concurrentHashMap0.put("custom_event", Boolean.TRUE);
        concurrentHashMap0.put("log_event_v3", Boolean.TRUE);
    }

    public KM(Context context0) {
        this.xE = true;
        this.Qf = true;
        this.Co = false;
        this.wN = false;
        this.ReZ = false;
        this.kph = false;
        this.dwk = context0;
        this.JQp = new com.bytedance.sdk.component.utils.KM(Looper.getMainLooper(), this);
    }

    private boolean Au(String s) {
        if(TextUtils.isEmpty(s)) {
            return true;
        }
        return "click_other".equals(s) ? this.DWo() : true;
    }

    public void Au() {
        fDm fDm0 = this.Owx;
        if(fDm0 != null) {
            fDm0.Zh();
        }
    }

    public void Au(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        int v = jSONObject0.optInt("index");
        Owx owx0 = this.ub;
        if(owx0 instanceof RD) {
            com.bytedance.sdk.openadsdk.core.model.PjT pjT0 = ((RD)owx0).MD();
            if(pjT0 != null) {
                List list0 = pjT0.cr();
                if(v >= 0 && v < list0.size()) {
                    this.PjT(((Owx)list0.get(v)), this.rds, false);
                    com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0 = this.MWx;
                    if(zh0 != null) {
                        zh0.cr();
                    }
                }
            }
        }
    }

    private void DWo(JSONObject jSONObject0) throws Exception {
        if(!TextUtils.isEmpty(cRA.qj(this.ub))) {
            jSONObject0.put("playable_style", cRA.qj(this.ub));
        }
    }

    boolean DWo() {
        return this.ub == null ? false : this.ub.dwk() == 1;
    }

    public KM JQp(String s) {
        this.fDm = s;
        return this;
    }

    // 检测为 Lambda 实现
    public void JQp(JSONObject jSONObject0) [...]

    public void JQp(boolean z) {
        this.xH = z;
    }

    public boolean JQp() {
        return this.ub != null && this.ub.KM();
    }

    private void Lrd() {
        if(this.SM == null) {
            this.SM = com.bytedance.sdk.openadsdk.DWo.PjT.PjT(this, this.ub);
        }
    }

    // 检测为 Lambda 实现
    private void Owx() [...]

    private void Owx(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        WebView webView0 = this.fDm();
        if(webView0 != null) {
            com.bytedance.sdk.component.utils.fDm.PjT(webView0, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject0 + ")");
        }
    }

    private String PjT(String s, String s1) {
        if(gK.JQp(this.ub)) {
            return "show".equals(s1) ? wN.PjT(this.xs) : "aggregate_page";
        }
        if(cRA.JQp(this.ub)) {
            return this.cz;
        }
        if(this.Yo != null) {
            return wN.PjT(this.xs);
        }
        return this.ltE == null ? wN.Zh(this.xs) : s;
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.KM.Zh kM$Zh0, JSONObject jSONObject0) {
        if(kM$Zh0 == null) {
            return;
        }
        try {
            this.PjT(kM$Zh0.cr, new com.bytedance.sdk.openadsdk.xf.cr() {
                final KM ReZ;

                @Override  // com.bytedance.sdk.openadsdk.xf.cr
                public void PjT(boolean z, List list0) {
                    if(z) {
                        try {
                            JSONArray jSONArray0 = KM.Zh(list0);
                            jSONObject0.put("creatives", jSONArray0);
                            KM.this.Zh(kM$Zh0.Zh, jSONObject0);
                        }
                        catch(Exception unused_ex) {
                        }
                        return;
                    }
                    KM.this.Zh(kM$Zh0.Zh, jSONObject0);
                }
            });
        }
        catch(Exception unused_ex) {
        }
    }

    private void PjT(Owx owx0, String s, boolean z) {
        com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.core.Zh.PjT(com.bytedance.sdk.openadsdk.core.ub.PjT(), owx0, s, this.xs);
        pjT0.PjT(com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX.PjT(com.bytedance.sdk.openadsdk.core.ub.PjT(), owx0, s));
        if(!z) {
            pjT0.PjT(false);
        }
        pjT0.onClick(null);
    }

    private void PjT(String s, boolean z) {
        if(this.qZS != null && !TextUtils.isEmpty(s)) {
            if(z) {
                this.qZS.PjT(s);
                return;
            }
            this.qZS.Zh(s);
        }
    }

    public static void PjT(JSONObject jSONObject0, Owx owx0) throws Exception {
        String s = owx0.dIF();
        if(!TextUtils.isEmpty(s)) {
            jSONObject0.put("cid", s);
        }
        String s1 = owx0.xR();
        if(!TextUtils.isEmpty(s1)) {
            jSONObject0.put("log_extra", s1);
        }
        String s2 = owx0.SW();
        if(!TextUtils.isEmpty(s2)) {
            jSONObject0.put("download_url", s2);
        }
        jSONObject0.put("dc", (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.ub.cr().qZS()) ? com.bytedance.sdk.openadsdk.core.ub.cr().qZS() : "TX"));
        jSONObject0.put("language", xf.Zh());
        jSONObject0.put("isRTL", xs.Gr().Xe());
    }

    private void PjT(JSONObject jSONObject0, boolean z, String s) {
        if(!z) {
            return;
        }
        try {
            String s1 = jSONObject0.optString("ad_extra_data");
            if(!TextUtils.isEmpty(s1) && new JSONObject(s1).optInt("agg_request_type", -1) == 1 && "click".equals(s)) {
                JQp jQp0 = this.XX;
                if(jQp0 != null) {
                    jQp0.PjT();
                }
            }
        }
        catch(Throwable throwable0) {
            com.bytedance.sdk.component.utils.RD.PjT("TTAD.AndroidObject", "callAggClickListener faile", throwable0);
        }
    }

    private boolean PjT(String s, int v, com.bytedance.sdk.openadsdk.core.model.fDm fDm0) {
        if(!TextUtils.isEmpty(s) && (this.Jo != null && ((DWo)this.Jo.get(s)) != null)) {
            throw null;
        }
        return false;
    }

    private boolean PjT(JSONObject jSONObject0, JSONObject jSONObject1) {
        String s1;
        String s;
        int v;
        if(jSONObject0 == null) {
            s = null;
            v = -1;
            s1 = null;
        }
        else {
            v = jSONObject0.optInt("landingStyle");
            s = jSONObject0.optString("url");
            s1 = jSONObject0.optString("fallback_url");
        }
        switch(v) {
            case 1: {
                if(!ltE.PjT(s)) {
                    try {
                        jSONObject1.put("invalid_url", 1);
                    }
                    catch(JSONException jSONException0) {
                        com.bytedance.sdk.component.utils.RD.PjT("TTAD.AndroidObject", "handleUrl, EX1->: ", jSONException0);
                    }
                    return false;
                }
                return true;
            }
            case 2: {
                try {
                    if(TextUtils.isEmpty(s) && TextUtils.isEmpty(s1)) {
                        jSONObject1.put("empty_url", 1);
                        return false;
                    }
                    if(!ltE.PjT(s1)) {
                        jSONObject1.put("invalid_url", 1);
                        return false;
                    }
                    return true;
                }
                catch(JSONException jSONException1) {
                }
                break;
            }
            default: {
                return true;
            }
        }
        com.bytedance.sdk.component.utils.RD.PjT("TTAD.AndroidObject", "handleUrl, EX2->: ", jSONException1);
        return false;
    }

    public KM PjT(int v) {
        this.qla = v;
        return this;
    }

    public KM PjT(View view0) {
        this.qj = new WeakReference(view0);
        return this;
    }

    public KM PjT(com.bytedance.sdk.component.SM.cz cz0) {
        ub ub0;
        WebView webView0 = cz0.getWebView();
        if(webView0 == null) {
            return this;
        }
        try {
            ub0 = ub.PjT(webView0).PjT(new com.bytedance.sdk.openadsdk.qj.PjT()).PjT("ToutiaoJSBridge").PjT(new com.bytedance.sdk.component.PjT.xf() {
                final KM PjT;

                @Override  // com.bytedance.sdk.component.PjT.xf
                @NonNull
                public Object PjT(@NonNull String s, @NonNull Type type0) {
                    return null;
                }

                @Override  // com.bytedance.sdk.component.PjT.xf
                @NonNull
                public String PjT(@NonNull Object object0) {
                    return null;
                }
            }).PjT(SM.Zh().ltE()).Zh(true).PjT().Zh();
            this.Zd = ub0;
        }
        catch(Exception unused_ex) {
            return this;
        }
        com.bytedance.sdk.openadsdk.qj.PjT.XX.PjT(ub0, this);
        com.bytedance.sdk.openadsdk.qj.PjT.PjT.PjT(this.Zd, this);
        com.bytedance.sdk.openadsdk.qj.PjT.Zh.PjT(this.Zd, this);
        com.bytedance.sdk.openadsdk.qj.PjT.ReZ.PjT(this.Zd, this);
        com.bytedance.sdk.openadsdk.qj.PjT.cz.PjT(this.Zd, this);
        com.bytedance.sdk.openadsdk.qj.PjT.SM.PjT(this.Zd, this);
        com.bytedance.sdk.openadsdk.qj.PjT.xf.PjT(this.Zd, this);
        com.bytedance.sdk.openadsdk.qj.PjT.DWo.PjT(this.Zd, cz0);
        com.bytedance.sdk.openadsdk.qj.PjT.Au.PjT(this.Zd, this);
        com.bytedance.sdk.openadsdk.qj.PjT.JQp.PjT(this.Zd, this.RD);
        com.bytedance.sdk.openadsdk.qj.PjT.cr.PjT(this.Zd, this);
        com.bytedance.sdk.openadsdk.qj.PjT.xs.PjT(this.Zd, cz0, this, this.ub);
        com.bytedance.sdk.openadsdk.qj.PjT.qj.PjT(this.Zd, this, this.ub);
        return this;
    }

    public KM PjT(com.bytedance.sdk.component.adexpress.Zh.qj qj0) {
        this.ltE = qj0;
        return this;
    }

    public KM PjT(fDm fDm0) {
        this.Owx = fDm0;
        return this;
    }

    public KM PjT(com.bytedance.sdk.openadsdk.core.Zh.cr cr0) {
        this.iZZ = cr0;
        return this;
    }

    public KM PjT(Owx owx0) {
        this.ub = owx0;
        if(owx0 != null) {
            this.gK = owx0.Wo();
        }
        return this;
    }

    public KM PjT(JQp jQp0) {
        this.XX = jQp0;
        return this;
    }

    public KM PjT(com.bytedance.sdk.openadsdk.core.widget.PjT.PjT pjT0) {
        this.IJ = pjT0;
        return this;
    }

    public KM PjT(com.bytedance.sdk.openadsdk.cr.cr.JQp jQp0) {
        this.qZS = jQp0;
        return this;
    }

    public KM PjT(Au au0) {
        this.OMu = au0;
        return this;
    }

    public KM PjT(com.bytedance.sdk.openadsdk.xf.JQp jQp0) {
        this.cRA = jQp0;
        return this;
    }

    public KM PjT(com.bytedance.sdk.openadsdk.xf.PjT pjT0) {
        this.tT = pjT0;
        return this;
    }

    public KM PjT(com.bytedance.sdk.openadsdk.xf.ReZ reZ0) {
        this.Yo = reZ0;
        return this;
    }

    public KM PjT(XX xX0) {
        this.VY = xX0;
        return this;
    }

    public KM PjT(cz cz0) {
        this.Lrd = cz0;
        return this;
    }

    public KM PjT(qj qj0) {
        this.KM = qj0;
        return this;
    }

    public KM PjT(List list0) {
        this.ZX = list0;
        return this;
    }

    public KM PjT(Map map0) {
        this.PjT = map0;
        return this;
    }

    public KM PjT(JSONObject jSONObject0) {
        this.RD = jSONObject0;
        return this;
    }

    public KM PjT(boolean z) {
        this.Zh = z;
        return this;
    }

    public com.bytedance.sdk.openadsdk.xf.Zh PjT() {
        return this.ig;
    }

    public JSONObject PjT(com.bytedance.sdk.openadsdk.core.KM.Zh kM$Zh0, int v) throws Exception {
        JSONObject jSONObject2;
        int v1 = -1;
        boolean z = false;
        if(!"call".equals(kM$Zh0.PjT)) {
            return null;
        }
        if(SM.Zh().ltE()) {
            Log.d("TTAD.AndroidObject", "[JSB-REQ] version:" + v + " method:" + kM$Zh0.ReZ);
        }
        JSONObject jSONObject0 = new JSONObject();
        String s = kM$Zh0.ReZ;
        s.hashCode();
        switch(s) {
            case "adInfo": {
                this.SM(jSONObject0);
                break;
            }
            case "appInfo": {
                KM.Zh(jSONObject0);
                break;
            }
            case "cancel_download_app_ad": {
                break;
            }
            case "changeVideoState": {
                this.xs(kM$Zh0.cr);
                break;
            }
            case "clickEvent": {
                this.JQp(kM$Zh0.cr);
                break;
            }
            case "close": {
                this.XX();
                break;
            }
            case "download_app_ad": {
                this.kph = true;
                com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.ub, this.rds, 1, null);
                com.bytedance.sdk.openadsdk.core.Zh.cr cr0 = this.iZZ;
                if(cr0 == null) {
                    com.bytedance.sdk.openadsdk.DWo.ReZ reZ0 = this.SM;
                    if(reZ0 == null) {
                        com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.ub, this.rds, -2, null);
                    }
                    else {
                        Context context1 = this.dwk;
                        if(context1 == null) {
                            com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.ub, this.rds, -2, null);
                        }
                        else {
                            reZ0.PjT(context1, kM$Zh0.cr, this.rds);
                            com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0 = this.MWx;
                            if(zh0 != null) {
                                zh0.cr();
                            }
                        }
                    }
                }
                else {
                    cr0.PjT(this.Qf);
                }
                break;
            }
            case "dynamicTrack": {
                this.ub(kM$Zh0.cr);
                break;
            }
            case "endcard_load": {
                this.xf(kM$Zh0.cr);
                break;
            }
            case "getCloseButtonInfo": {
                jSONObject2 = this.qla();
                if(jSONObject2 != null) {
                    jSONObject0 = jSONObject2;
                }
                break;
            }
            case "getCurrentVideoState": {
                this.fDm(jSONObject0);
                break;
            }
            case "getMaterialMeta": {
                this.ltE(jSONObject0);
                break;
            }
            case "getNativeSiteCustomData": {
                if(this.ub != null && !TextUtils.isEmpty(this.ub.kph())) {
                    jSONObject0.put("data", this.ub.kph());
                }
                break;
            }
            case "getNetworkData": {
                this.PjT(kM$Zh0, jSONObject0);
                break;
            }
            case "getScreenSize": {
                com.bytedance.sdk.openadsdk.xf.PjT pjT0 = this.tT;
                if(pjT0 != null) {
                    int v2 = pjT0.Zh();
                    int v3 = this.tT.PjT();
                    jSONObject0.put("width", v2);
                    jSONObject0.put("height", v3);
                }
                break;
            }
            case "getTeMaiAds": {
                jSONObject2 = this.yIW;
                if(jSONObject2 != null) {
                    jSONObject0 = jSONObject2;
                }
                break;
            }
            case "getTemplateInfo": {
                JSONObject jSONObject3 = this.RD;
                if(jSONObject3 != null) {
                    jSONObject3.put("setting", this.Sks());
                    Owx owx0 = this.ub;
                    if(owx0 != null) {
                        this.RD.put("extension", owx0.vSp());
                    }
                }
                jSONObject0 = this.RD;
                break;
            }
            case "getVolume": {
                AudioManager audioManager0 = (AudioManager)com.bytedance.sdk.openadsdk.core.ub.PjT().getSystemService("audio");
                if(audioManager0 != null) {
                    v1 = audioManager0.getStreamVolume(3);
                }
                if(v1 <= 0) {
                    z = true;
                }
                jSONObject0.put("endcard_mute", z);
                break;
            }
            case "isViewable": {
                jSONObject0.put("viewStatus", ((int)this.wN));
                break;
            }
            case "landscape_click": {
                Context context2 = this.dwk;
                if(context2 instanceof com.bytedance.sdk.openadsdk.core.xf.cr.Zh) {
                    ((com.bytedance.sdk.openadsdk.core.xf.cr.Zh)context2).cr();
                }
                break;
            }
            case "muteVideo": {
                KM.Zh(this.Owx, kM$Zh0.cr);
                break;
            }
            case "openAdLandPageLinks": {
                JSONObject jSONObject1 = kM$Zh0.cr;
                if(this.PjT(jSONObject1, jSONObject0)) {
                    this.ReZ(jSONObject1);
                }
                break;
            }
            case "openPrivacy": {
                this.RD();
                break;
            }
            case "pauseWebView": {
                this.gK();
                break;
            }
            case "pauseWebViewTimers": {
                this.ltE();
                break;
            }
            case "playable_style": {
                this.DWo(jSONObject0);
                break;
            }
            case "removeLoading": {
                com.bytedance.sdk.openadsdk.xf.JQp jQp0 = this.cRA;
                if(jQp0 != null) {
                    jQp0.PjT();
                }
                break;
            }
            case "renderDidFinish": {
                this.qla(kM$Zh0.cr);
                break;
            }
            case "sendLog": {
                JSONObject jSONObject4 = kM$Zh0.cr;
                if(jSONObject4 != null) {
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("extJson");
                    if(jSONObject5 != null && jSONObject5.has("category") && jSONObject5.has("tag") && jSONObject5.has("label")) {
                        String s1 = jSONObject5.optString("category");
                        String s2 = jSONObject5.optString("tag");
                        String s3 = jSONObject5.optString("label");
                        long v4 = jSONObject4.optLong("value");
                        long v5 = jSONObject4.optLong("extValue");
                        try {
                            jSONObject5.putOpt("ua_policy", this.qla);
                        }
                        catch(Exception unused_ex) {
                        }
                        if("click".equals(s3)) {
                            jSONObject5 = this.RD(jSONObject5);
                        }
                        String s4 = this.PjT(s2, s3);
                        boolean z1 = gK.JQp(this.ub);
                        this.PjT(jSONObject5, z1, s3);
                        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(this.ub, s1, s4, s3, v4, v5, jSONObject5, z1);
                    }
                }
                break;
            }
            case "sendReward": {
                this.ReZ = true;
                cz cz0 = this.Lrd;
                if(cz0 != null) {
                    cz0.PjT();
                }
                break;
            }
            case "send_temai_product_ids": {
                this.gK(kM$Zh0.cr);
                break;
            }
            case "skipVideo": {
                this.Owx();
                break;
            }
            case "subscribe_app_ad": {
                this.Lrd();
                com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.ub, this.rds, 0, null);
                Context context0 = this.dwk;
                if(context0 == null) {
                    com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.ub, this.rds, -1, null);
                }
                else {
                    this.SM.PjT(context0, kM$Zh0.cr, this.xf, this.xs, this.xE);
                }
                break;
            }
            case "unsubscribe_app_ad": {
                com.bytedance.sdk.openadsdk.DWo.ReZ reZ1 = this.SM;
                if(reZ1 != null) {
                    reZ1.PjT(kM$Zh0.cr);
                }
                break;
            }
            case "webview_time_track": {
                this.qj(kM$Zh0.cr);
            }
        }
        if(v == 1 && !TextUtils.isEmpty(kM$Zh0.Zh)) {
            this.Zh(kM$Zh0.Zh, jSONObject0);
            if(SM.Zh().ltE()) {
                Log.d("TTAD.AndroidObject", "[JSB-RSP] version:" + 1 + " data=" + jSONObject0);
            }
        }
        return jSONObject0;
    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public void PjT(Message message0) {
        if(message0 == null) {
            return;
        }
        if(message0.what == 11) {
            Object object0 = message0.obj;
            if(object0 instanceof com.bytedance.sdk.openadsdk.core.KM.Zh) {
                try {
                    this.PjT(((com.bytedance.sdk.openadsdk.core.KM.Zh)object0), 1);
                }
                catch(Exception unused_ex) {
                }
            }
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.KM.PjT kM$PjT0) {
        this.Ld = kM$PjT0;
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0) {
        this.MWx = zh0;
    }

    public void PjT(com.bytedance.sdk.openadsdk.xf.Zh zh0) {
        this.ig = zh0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    public void PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            int v = jSONObject0.optInt("time");
            String s1 = jSONObject0.optString("flag");
            fDm fDm0 = this.Owx;
            if(fDm0 != null) {
                fDm0.PjT(v, s1);
            }
        }
        catch(JSONException unused_ex) {
            com.bytedance.sdk.component.utils.RD.Zh("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.DWo.Zh
    public void PjT(String s, JSONObject jSONObject0) {
        this.ReZ(s, jSONObject0);
    }

    public void PjT(JSONObject jSONObject0, com.bytedance.sdk.openadsdk.xf.cr cr0) {
        if(cr0 == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.KM.7 kM$70 = new com.bytedance.sdk.openadsdk.xf.cr() {
                final KM Zh;

                @Override  // com.bytedance.sdk.openadsdk.xf.cr
                public void PjT(boolean z, List list0) {
                    Jo.PjT(new Runnable() {
                        final com.bytedance.sdk.openadsdk.core.KM.7 ReZ;

                        @Override
                        public void run() {
                            com.bytedance.sdk.openadsdk.core.KM.7.this.PjT.PjT(z, list0);
                        }
                    });
                }
            };
            if(this.ub != null && !TextUtils.isEmpty(this.xf)) {
                int v = this.ub.XWz();
                AdSlot adSlot0 = this.ub.ig();
                tT tT0 = new tT();
                tT0.cz = true;
                if(this.ub.VY() != null || this.ub.xH() != null) {
                    tT0.Au = 2;
                }
                JSONObject jSONObject1 = this.gK == null ? new JSONObject() : this.gK;
                if(jSONObject0 != null) {
                    Iterator iterator0 = jSONObject0.keys();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        jSONObject1.put(((String)object0), jSONObject0.opt(((String)object0)));
                    }
                }
                tT0.XX = jSONObject1;
                com.bytedance.sdk.openadsdk.core.ub.ReZ().PjT(adSlot0, tT0, v, new com.bytedance.sdk.openadsdk.core.ltE.PjT() {
                    final KM Zh;

                    @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
                    public void PjT(int v, String s) {
                        kM$70.PjT(false, null);
                    }

                    @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
                    public void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0, com.bytedance.sdk.openadsdk.core.model.ReZ reZ0) {
                        if(pjT0.cr() != null && !pjT0.cr().isEmpty()) {
                            Owx owx0 = (Owx)pjT0.cr().get(0);
                            if(owx0 != null) {
                                JSONObject jSONObject0 = owx0.Wo();
                                KM.this.gK = jSONObject0;
                            }
                            kM$70.PjT(true, pjT0.cr());
                            return;
                        }
                        kM$70.PjT(false, null);
                        reZ0.PjT(-3);
                        com.bytedance.sdk.openadsdk.core.model.ReZ.PjT(reZ0);
                    }
                });
                return;
            }
            kM$70.PjT(false, null);
            return;
        }
        catch(Exception exception0) {
        }
        com.bytedance.sdk.component.utils.RD.PjT("TTAD.AndroidObject", "get ads error", exception0);
    }

    public void PjT(JSONObject jSONObject0, String s) {
        fDm fDm0 = this.Owx;
        if(fDm0 != null) {
            fDm0.PjT(s, jSONObject0);
            return;
        }
        com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0 = this.MWx;
        if(zh0 != null) {
            zh0.PjT(s, jSONObject0);
        }
    }

    public boolean PjT(Uri uri0) {
        if(uri0 == null) {
            return false;
        }
        try {
            if(!"bytedance".equals(uri0.getScheme())) {
                return false;
            }
            String s = uri0.getHost();
            if(KM.Au.containsKey(s)) {
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    private JSONObject RD(JSONObject jSONObject0) {
        if(this.PjT != null) {
            if(jSONObject0 == null) {
                jSONObject0 = new JSONObject();
            }
            try {
                JSONObject jSONObject1 = new JSONObject();
                String s = jSONObject0.optString("ad_extra_data", null);
                if(s != null) {
                    jSONObject1 = new JSONObject(s);
                }
                for(Object object0: this.PjT.entrySet()) {
                    jSONObject1.put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
                }
                jSONObject0.put("ad_extra_data", jSONObject1.toString());
                return jSONObject0;
            }
            catch(Exception exception0) {
            }
            com.bytedance.sdk.component.utils.RD.Zh(exception0.toString(), new Object[0]);
        }
        return jSONObject0;
    }

    private void RD() {
        if(this.dwk == null || TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.ub.cr().Jo())) {
            return;
        }
        TTWebsiteActivity.PjT(this.dwk, this.ub, this.rds);
    }

    private JSONObject ReZ(Owx owx0) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        jSONObject1.put("is_ad_event", "1");
        jSONObject1.put("cid", owx0.Ey());
        jSONObject1.put("req_id", owx0.ydj());
        jSONObject1.put("ad_id", owx0.dIF());
        jSONObject1.put("log_extra", owx0.xR());
        jSONObject1.put("isRTL", xs.Gr().Xe());
        jSONObject0.put("ad_info", jSONObject1);
        jSONObject0.put("endcard_creative", owx0.tR());
        return jSONObject0;
    }

    private void ReZ(String s, JSONObject jSONObject0) {
        try {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("__msg_type", "event");
            jSONObject1.put("__event_id", s);
            if(jSONObject0 != null) {
                jSONObject1.put("__params", jSONObject0);
            }
            this.Owx(jSONObject1);
        }
        catch(Exception unused_ex) {
        }
    }

    public KM ReZ(String s) {
        this.DWo = s;
        return this;
    }

    public void ReZ() {
        ub ub0 = this.Zd;
        if(ub0 == null) {
            return;
        }
        ub0.PjT();
        this.Zd = null;
    }

    public void ReZ(int v) {
        fDm fDm0 = this.Owx;
        if(fDm0 != null) {
            fDm0.Zh(v);
        }
    }

    public void ReZ(JSONObject jSONObject0) {
        com.bytedance.sdk.openadsdk.core.gK.PjT(this.ub(), this.dwk instanceof Activity, jSONObject0, this.ub, this.rds, this.xs, this.fDm(), this.XX);
    }

    public void ReZ(boolean z) {
        this.ReZ = z;
    }

    private void SM(String s) {
        if(s == null) {
            return;
        }
        if(!s.startsWith("bytedance://")) {
            return;
        }
        try {
            if(s.equals("bytedance://dispatch_message/")) {
                WebView webView0 = this.fDm();
                if(webView0 != null) {
                    com.bytedance.sdk.component.utils.fDm.PjT(webView0, "javascript:ToutiaoJSBridge._fetchQueue()");
                }
                return;
            }
            if(s.startsWith("bytedance://private/setresult/")) {
                int v = s.indexOf(38, 30);
                if(v <= 0) {
                    return;
                }
                String s1 = s.substring(v + 1);
                if(s.substring(30, v).equals("SCENE_FETCHQUEUE") && s1.length() > 0) {
                    this.XX(s1);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void SM(JSONObject jSONObject0) throws Exception {
        if(this.tY && (this.ub instanceof RD && ((RD)this.ub).ELH())) {
            JSONArray jSONArray0 = new JSONArray();
            jSONObject0.put("adInfos", jSONArray0);
            for(Object object0: ((RD)this.ub).pSa()) {
                JSONObject jSONObject1 = new JSONObject();
                KM.PjT(jSONObject1, ((Owx)object0));
                jSONArray0.put(jSONObject1);
            }
            return;
        }
        KM.PjT(jSONObject0, this.ub);
    }

    public boolean SM() {
        return this.kph;
    }

    private JSONObject Sks() {
        return KM.Zh(this.ub);
    }

    private void XX(String s) {
        com.bytedance.sdk.openadsdk.core.KM.Zh kM$Zh0;
        int v1;
        JSONArray jSONArray0;
        try {
            jSONArray0 = new JSONArray(new String(Base64.decode(s, 2)));
            int v = jSONArray0.length();
            v1 = 0;
            while(true) {
            label_3:
                if(v1 >= v) {
                    return;
                }
                kM$Zh0 = new com.bytedance.sdk.openadsdk.core.KM.Zh();
                break;
            }
        }
        catch(Exception unused_ex) {
            return;
        }
        try {
            JSONObject jSONObject0 = jSONArray0.optJSONObject(v1);
            if(jSONObject0 != null) {
                kM$Zh0.PjT = jSONObject0.optString("__msg_type", null);
                kM$Zh0.Zh = jSONObject0.optString("__callback_id", null);
                kM$Zh0.ReZ = jSONObject0.optString("func");
                kM$Zh0.cr = jSONObject0.optJSONObject("params");
                kM$Zh0.JQp = jSONObject0.optInt("JSSDK");
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            if(!TextUtils.isEmpty(kM$Zh0.PjT) && !TextUtils.isEmpty(kM$Zh0.ReZ)) {
                Message message0 = this.JQp.obtainMessage(11);
                message0.obj = kM$Zh0;
                this.JQp.sendMessage(message0);
            }
            ++v1;
            goto label_3;
        }
        catch(Exception unused_ex) {
        }
    }

    public JSONObject XX(JSONObject jSONObject0) {
        JSONObject jSONObject1 = new JSONObject();
        try {
            JSONArray jSONArray0 = new JSONArray();
            Owx owx0 = this.ub;
            if(owx0 instanceof RD) {
                List list0 = ((RD)owx0).MD().cr();
                for(int v = 0; v < list0.size(); ++v) {
                    jSONArray0.put(this.ReZ(((Owx)list0.get(v))));
                }
            }
            jSONObject1.put("creatives", jSONArray0);
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject1;
    }

    public void XX() {
        if(this.xH) {
            com.bytedance.sdk.openadsdk.xf.ReZ reZ0 = this.Yo;
            if(reZ0 != null) {
                reZ0.PjT();
                return;
            }
        }
        if(this.dwk instanceof Activity && com.bytedance.sdk.openadsdk.utils.RD.PjT(((Activity)this.dwk))) {
            ((Activity)this.dwk).finish();
        }
    }

    public static JSONArray Zh(List list0) {
        JSONArray jSONArray0 = new JSONArray();
        if(list0 == null) {
            return jSONArray0;
        }
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            jSONArray0.put(((Owx)list0.get(v1)).dDm());
        }
        return jSONArray0;
    }

    public static JSONObject Zh(Owx owx0) {
        int v = 0;
        JSONObject jSONObject0 = new JSONObject();
        if(com.bytedance.sdk.openadsdk.core.ub.cr() == null) {
            return jSONObject0;
        }
        try {
            int v1 = owx0 == null ? 0 : owx0.joj();
            int v2 = owx0 == null ? 0 : owx0.XWz();
            int v3 = owx0 == null || owx0.Zh() < 0 ? com.bytedance.sdk.openadsdk.core.ub.cr().DWo(String.valueOf(v1)) : owx0.Zh();
            int v4 = owx0 == null || owx0.PjT() < 0 ? com.bytedance.sdk.openadsdk.core.ub.cr().ltE(String.valueOf(v1)) : owx0.PjT();
            boolean z = com.bytedance.sdk.openadsdk.core.ub.cr().cz(String.valueOf(v1));
            boolean z1 = com.bytedance.sdk.openadsdk.core.ub.cr().xs(String.valueOf(v1)) == 1;
            jSONObject0.put("voice_control", (v2 == 7 || v2 == 8 ? com.bytedance.sdk.openadsdk.core.ub.cr().ub(String.valueOf(v1)) : com.bytedance.sdk.openadsdk.core.ub.cr().ReZ(String.valueOf(v1))));
            jSONObject0.put("rv_skip_time", v3);
            jSONObject0.put("fv_skip_show", z);
            jSONObject0.put("iv_skip_time", v4);
            jSONObject0.put("show_dislike", owx0 != null && owx0.jp());
            jSONObject0.put("video_adaptation", (owx0 == null ? 0 : owx0.wN()));
            if(gK.ReZ(owx0)) {
                jSONObject0.put("skip_change_to_close", true);
            }
            else {
                jSONObject0.put("skip_change_to_close", z1);
            }
            if(owx0.fd() && xs.Gr().UR()) {
                v = 1;
            }
            jSONObject0.put("bar_render_platform", v);
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    // 检测为 Lambda 实现
    private static void Zh(fDm fDm0, JSONObject jSONObject0) [...]

    private void Zh(String s, JSONObject jSONObject0) {
        try {
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("__msg_type", "callback");
            jSONObject1.put("__callback_id", s);
            if(jSONObject0 != null) {
                jSONObject1.put("__params", jSONObject0);
            }
            this.Owx(jSONObject1);
        }
        catch(Exception unused_ex) {
        }
    }

    public static void Zh(JSONObject jSONObject0) throws Exception {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: KM.xE()) {
            jSONArray0.put(((String)object0));
        }
        jSONObject0.put("appName", "open_news");
        jSONObject0.put("innerAppName", "");
        jSONObject0.put("aid", "1371");
        jSONObject0.put("sdkEdition", "7.1.0.4");
        jSONObject0.put("appVersion", com.bytedance.sdk.openadsdk.common.Zh.cr());
        jSONObject0.put("netType", com.bytedance.sdk.openadsdk.common.Zh.cz());
        jSONObject0.put("supportList", jSONArray0);
        jSONObject0.put("deviceId", com.bytedance.sdk.openadsdk.common.Zh.PjT(com.bytedance.sdk.openadsdk.core.ub.PjT()));
        if(DeviceUtils.Zh(com.bytedance.sdk.openadsdk.core.ub.PjT())) {
            jSONObject0.put("device_platform", "Android_Pad");
        }
        else {
            jSONObject0.put("device_platform", "Android");
        }
        jSONObject0.put("device_type", Build.VERSION.RELEASE);
    }

    public ub Zh() {
        return this.Zd;
    }

    public KM Zh(int v) {
        this.xs = v;
        return this;
    }

    public KM Zh(com.bytedance.sdk.component.SM.cz cz0) {
        this.cr = new WeakReference(cz0);
        return this;
    }

    public KM Zh(String s) {
        this.cz = s;
        return this;
    }

    public KM Zh(boolean z) {
        this.wN = z;
        return this;
    }

    public void Zh(@NonNull Uri uri0) {
        try {
            String s = uri0.getHost();
            if(!"log_event".equals(s) && !"custom_event".equals(s) && !"log_event_v3".equals(s)) {
                if("private".equals(s) || "dispatch_message".equals(s)) {
                    this.SM(uri0.toString());
                }
                return;
            }
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(new com.bytedance.sdk.component.Au.Au("log_event_handleUri") {
                final KM Zh;

                @Override
                public void run() {
                    String s4;
                    String s5;
                    JSONObject jSONObject2;
                    JSONObject jSONObject1;
                    long v1;
                    long v;
                    String s = uri0.getQueryParameter("category");
                    String s1 = uri0.getQueryParameter("tag");
                    KM.this.rds = s1;
                    String s2 = uri0.getQueryParameter("label");
                    if(!KM.this.Au(s2)) {
                        return;
                    }
                    try {
                        v = 0L;
                        v1 = 0L;
                        v1 = Long.parseLong(uri0.getQueryParameter("value"));
                    }
                    catch(Exception unused_ex) {
                    }
                    try {
                        v = Long.parseLong(uri0.getQueryParameter("ext_value"));
                    }
                    catch(Exception unused_ex) {
                    }
                    String s3 = uri0.getQueryParameter("extra");
                    JSONObject jSONObject0 = null;
                    if(!TextUtils.isEmpty(s3)) {
                        try {
                            jSONObject1 = new JSONObject(s3);
                        }
                        catch(Exception unused_ex) {
                            goto label_16;
                        }
                        try {
                            jSONObject1.putOpt("ua_policy", KM.this.qla);
                        }
                        catch(Exception unused_ex) {
                        }
                        jSONObject0 = jSONObject1;
                    }
                label_16:
                    if("click".equals(s2)) {
                        jSONObject0 = KM.this.RD(jSONObject0);
                    }
                    if("landing_perf_error".equals(s2) || "landing_perf_stats".equals(s2)) {
                        try {
                            jSONObject2 = new JSONObject();
                            Iterator iterator0 = uri0.getQueryParameterNames().iterator();
                            while(true) {
                            label_23:
                                if(!iterator0.hasNext()) {
                                    goto label_31;
                                }
                                Object object0 = iterator0.next();
                                s5 = (String)object0;
                                break;
                            }
                        }
                        catch(Exception unused_ex) {
                            return;
                        }
                        try {
                            if("extra".equals(s5)) {
                                jSONObject2.put("ad_extra_data", new JSONObject(uri0.getQueryParameter(s5)).optString("ad_extra_data"));
                                goto label_23;
                            }
                            jSONObject2.put(s5, uri0.getQueryParameter(s5));
                        }
                        catch(Exception unused_ex) {
                        }
                        goto label_23;
                        try {
                        label_31:
                            s4 = KM.this.cz;
                            jSONObject0 = jSONObject2;
                        }
                        catch(Exception unused_ex) {
                            return;
                        }
                    }
                    else {
                        s4 = KM.this.PjT(s1, s2);
                    }
                    com.bytedance.sdk.openadsdk.cr.ReZ.PjT(KM.this.ub, s, s4, s2, v1, v, jSONObject0, gK.JQp(KM.this.ub));
                }
            });
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            this.SM(jSONObject0);
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0.toString();
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            KM.Zh(jSONObject0);
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0.toString();
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    @JavascriptInterface
    public void changeVideoState(String s) {
        try {
            Jo.PjT(() -> if(KM.this.Owx != null && this.PjT != null) {
                try {
                    int v = this.PjT.optInt("stateType", -1);
                    KM.this.Owx.PjT(v);
                }
                catch(Exception unused_ex) {
                }
            });
        }
        catch(Exception unused_ex) {
        }

        class com.bytedance.sdk.openadsdk.core.KM.2 implements Runnable {
            final KM Zh;

            com.bytedance.sdk.openadsdk.core.KM.2(JSONObject jSONObject0) {
            }

            @Override
            public void run() {
                KM.this.xs(this.PjT);
            }
        }

    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    @JavascriptInterface
    public void chooseAdResult(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            int v = jSONObject0.optInt("video_choose");
            long v1 = jSONObject0.optLong("video_choose_duration");
            Au au0 = this.OMu;
            if(au0 != null) {
                au0.PjT(v, v1);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    @JavascriptInterface
    public void clickEvent(String s) {
        try {
            Jo.PjT(() -> {
                double f18;
                String s2;
                double f17;
                double f16;
                double f15;
                double f14;
                double f13;
                double f12;
                double f11;
                JSONObject jSONObject2;
                double f2;
                if(this.PjT == null) {
                    return;
                }
                com.bytedance.sdk.component.utils.RD.PjT("TTAD.AndroidObject", "trigger Class1 method1");
                try {
                    String s = this.PjT.optString("adId");
                    int v = this.PjT.optInt("areaType", 1);
                    String s1 = this.PjT.optString("clickAreaType");
                    JSONObject jSONObject1 = this.PjT.optJSONObject("clickInfo");
                    double f = 0.0;
                    if(jSONObject1 == null) {
                        s2 = s;
                        f18 = 0.0;
                        f12 = 0.0;
                        f2 = 0.0;
                        f13 = 0.0;
                        f14 = 0.0;
                        f15 = 0.0;
                        f16 = 0.0;
                        f17 = 0.0;
                        f11 = 0.0;
                        jSONObject2 = null;
                    }
                    else {
                        double f1 = jSONObject1.optDouble("down_x", 0.0);
                        f2 = jSONObject1.optDouble("down_y", 0.0);
                        double f3 = jSONObject1.optDouble("up_x", 0.0);
                        double f4 = jSONObject1.optDouble("up_y", 0.0);
                        double f5 = jSONObject1.optDouble("down_time", 0.0);
                        double f6 = jSONObject1.optDouble("up_time", 0.0);
                        double f7 = jSONObject1.optDouble("button_x", 0.0);
                        double f8 = jSONObject1.optDouble("button_y", 0.0);
                        double f9 = jSONObject1.optDouble("button_width", 0.0);
                        double f10 = jSONObject1.optDouble("button_height", 0.0);
                        jSONObject2 = jSONObject1.optJSONObject("rectInfo");
                        f11 = f10;
                        f = f1;
                        f12 = f3;
                        f13 = f5;
                        f14 = f6;
                        f15 = f7;
                        f16 = f8;
                        f17 = f9;
                        s2 = s;
                        f18 = f4;
                    }
                    int v1 = this.PjT.optInt("clickAreaCategory", -1);
                    com.bytedance.sdk.openadsdk.core.model.fDm fDm0 = new com.bytedance.sdk.openadsdk.core.model.fDm.PjT().cr(((float)f)).ReZ(((float)f2)).Zh(((float)f12)).PjT(((float)f18)).Zh(((long)f13)).PjT(((long)f14)).ReZ(((int)f15)).cr(((int)f16)).JQp(((int)f17)).cz(((int)f11)).PjT(s1).PjT(null).PjT(true).Zh(v).PjT(jSONObject2).PjT(v1).Zh(jSONObject1).PjT();
                    com.bytedance.sdk.component.adexpress.Zh.qj qj0 = KM.this.ltE;
                    if(qj0 != null) {
                        qj0.PjT(null, v, fDm0);
                    }
                    KM.this.PjT(s2, v, fDm0);
                }
                catch(Exception unused_ex) {
                    com.bytedance.sdk.component.adexpress.Zh.qj qj1 = KM.this.ltE;
                    if(qj1 != null) {
                        qj1.PjT(null, -1, null);
                    }
                }
            });
        }
        catch(Exception unused_ex) {
        }

        class com.bytedance.sdk.openadsdk.core.KM.3 implements Runnable {
            final KM Zh;

            com.bytedance.sdk.openadsdk.core.KM.3(JSONObject jSONObject0) {
            }

            @Override
            public void run() {
                KM.this.JQp(this.PjT);
            }
        }

    }

    public KM cr(String s) {
        this.xf = s;
        return this;
    }

    public Owx cr() {
        return this.ub;
    }

    public void cr(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        int v = jSONObject0.optInt("zoom_type", 1);
        JSONObject jSONObject1 = jSONObject0.optJSONObject("videoInfo");
        com.bytedance.sdk.component.adexpress.Zh.fDm fDm0 = new com.bytedance.sdk.component.adexpress.Zh.fDm();
        if(jSONObject1 != null) {
            double f = jSONObject1.optDouble("x");
            double f1 = jSONObject1.optDouble("y");
            double f2 = jSONObject1.optDouble("width");
            double f3 = jSONObject1.optDouble("height");
            fDm0.ReZ(f);
            fDm0.cr(f1);
            fDm0.JQp(f2);
            fDm0.cz(f3);
        }
        fDm fDm1 = this.Owx;
        if(fDm1 != null) {
            fDm1.PjT(v, fDm0);
        }
    }

    public void cr(boolean z) {
        this.tY = z;
    }

    public void cz(String s) {
        this.rds = s;
    }

    public void cz(JSONObject jSONObject0) {
        Owx owx0 = com.bytedance.sdk.openadsdk.core.Zh.PjT(jSONObject0);
        if(owx0 != null) {
            boolean z = gK.JQp(this.ub);
            this.PjT(owx0, (z ? wN.Zh(this.xs) : this.rds), !z);
        }
    }

    public boolean cz() {
        return this.ReZ;
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    @JavascriptInterface
    public void dynamicTrack(String s) {
        try {
            this.ub(new JSONObject(s));
        }
        catch(Exception unused_ex) {
        }
    }

    private WebView fDm() {
        WeakReference weakReference0 = this.cr;
        if(weakReference0 == null) {
            return null;
        }
        com.bytedance.sdk.component.SM.cz cz0 = (com.bytedance.sdk.component.SM.cz)weakReference0.get();
        return cz0 == null ? null : cz0.getWebView();
    }

    private boolean fDm(JSONObject jSONObject0) {
        fDm fDm0 = this.Owx;
        if(fDm0 != null && jSONObject0 != null) {
            double f = (double)fDm0.ReZ();
            int v = this.Owx.cr();
            try {
                jSONObject0.put("currentTime", f / 1000.0);
                jSONObject0.put("state", v);
                return true;
            }
            catch(Exception unused_ex) {
            }
        }
        return false;
    }

    private void gK() {
        qj qj0 = this.KM;
        if(qj0 == null) {
            return;
        }
        qj0.PjT();
    }

    private void gK(JSONObject jSONObject0) {
        if(jSONObject0 != null && this.Sks != null) {
            try {
                JSONArray jSONArray0 = jSONObject0.optJSONArray("temaiProductIds");
                if(jSONArray0 != null && jSONArray0.length() > 0) {
                    this.Sks.PjT(true, jSONArray0);
                    return;
                }
                this.Sks.PjT(false, null);
            }
            catch(Exception unused_ex) {
                this.Sks.PjT(false, null);
            }
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject0 = new JSONObject();
        this.fDm(jSONObject0);
        return jSONObject0.toString();
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    @JavascriptInterface
    public String getData(String s) {
        if(TextUtils.isEmpty(s)) {
            return this.RD.toString();
        }
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            JSONObject jSONObject1 = com.bytedance.sdk.openadsdk.core.Au.PjT.Zh.PjT(this.RD, jSONObject0);
            return jSONObject1 == null ? this.RD.toString() : jSONObject1.toString();
        }
        catch(Exception unused_ex) {
            return this.RD.toString();
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    @JavascriptInterface
    public String getTemplateInfo() {
        this.PjT("getTemplateInfo", true);
        try {
            JSONObject jSONObject0 = this.RD;
            if(jSONObject0 != null) {
                jSONObject0.put("setting", this.Sks());
                Owx owx0 = this.ub;
                if(owx0 != null) {
                    this.RD.put("extension", owx0.vSp());
                }
            }
            this.PjT("getTemplateInfo", false);
            return this.RD.toString();
        }
        catch(Exception unused_ex) {
            return "";
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    @JavascriptInterface
    public void initRenderFinish() {
        Jo.PjT(new Runnable() {
            final KM PjT;

            @Override
            public void run() {
                if(KM.this.IJ != null) {
                    KM.this.IJ.PjT();
                }
            }
        });
    }

    private void ltE() {
        qj qj0 = this.KM;
        if(qj0 == null) {
            return;
        }
        qj0.Zh();
    }

    private boolean ltE(JSONObject jSONObject0) {
        try {
            jSONObject0.put("creatives", KM.Zh(this.ZX));
        }
        catch(Exception unused_ex) {
        }
        return true;
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    @JavascriptInterface
    public void muteVideo(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            ReZ kM$ReZ0 = this.cI;
            if(kM$ReZ0 != null) {
                Jo.Zh(kM$ReZ0);
            }
            ReZ kM$ReZ1 = () -> if(this.Owx != null && jSONObject0 != null) {
                try {
                    this.Owx.PjT(jSONObject0.optBoolean("mute", false), (jSONObject0.has("mute") ? "jsb_web" : "jsb_def"));
                }
                catch(Exception unused_ex) {
                }
            };
            this.cI = kM$ReZ1;
            Jo.PjT(kM$ReZ1);
        }
        catch(Exception unused_ex) {
            com.bytedance.sdk.component.utils.RD.Zh("TTAD.AndroidObject", "");
        }
    }

    private void qj(JSONObject jSONObject0) {
        if(jSONObject0 != null) {
            com.bytedance.sdk.openadsdk.cr.cr.JQp jQp0 = this.qZS;
            if(jQp0 != null) {
                jQp0.Zh(jSONObject0);
            }
        }
    }

    public void qj() {
        this.tT();
    }

    private JSONObject qla() {
        try {
            View view0 = (View)this.qj.get();
            View view1 = (View)this.cr.get();
            if(view0 != null && view1 != null) {
                int[] arr_v = qZS.Zh(view0);
                int[] arr_v1 = qZS.Zh(view1);
                if(arr_v != null && arr_v1 != null) {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("x", qZS.ReZ(com.bytedance.sdk.openadsdk.core.ub.PjT(), ((float)(arr_v[0] - arr_v1[0]))));
                    jSONObject0.put("y", qZS.ReZ(com.bytedance.sdk.openadsdk.core.ub.PjT(), ((float)(arr_v[1] - arr_v1[1]))));
                    jSONObject0.put("w", qZS.ReZ(com.bytedance.sdk.openadsdk.core.ub.PjT(), ((float)view0.getWidth())));
                    jSONObject0.put("h", qZS.ReZ(com.bytedance.sdk.openadsdk.core.ub.PjT(), ((float)view0.getHeight())));
                    jSONObject0.put("isExist", true);
                    return jSONObject0;
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    private void qla(JSONObject jSONObject0) {
        double f6;
        boolean z1;
        double f1;
        double f;
        if(this.ltE != null && jSONObject0 != null) {
            com.bytedance.sdk.openadsdk.cr.cr.JQp jQp0 = this.qZS;
            if(jQp0 != null) {
                jQp0.xE();
            }
            com.bytedance.sdk.component.adexpress.Zh.fDm fDm0 = new com.bytedance.sdk.component.adexpress.Zh.fDm();
            fDm0.PjT(1);
            try {
                boolean z = jSONObject0.optBoolean("isRenderSuc");
                JSONObject jSONObject1 = jSONObject0.optJSONObject("AdSize");
                if(jSONObject1 == null) {
                    f = 0.0;
                    f1 = 0.0;
                }
                else {
                    f = jSONObject1.optDouble("width");
                    f1 = jSONObject1.optDouble("height");
                }
                JSONObject jSONObject2 = jSONObject0.optJSONObject("videoInfo");
                if(jSONObject2 == null) {
                    z1 = z;
                    f6 = f1;
                }
                else {
                    double f2 = jSONObject2.optDouble("x");
                    double f3 = jSONObject2.optDouble("y");
                    z1 = z;
                    double f4 = jSONObject2.optDouble("width");
                    double f5 = jSONObject2.optDouble("height");
                    if(this.xE(jSONObject2)) {
                        f6 = f1;
                        fDm0.PjT(((float)jSONObject2.optDouble("borderRadiusTopLeft")));
                        fDm0.Zh(((float)jSONObject2.optDouble("borderRadiusTopRight")));
                        fDm0.ReZ(((float)jSONObject2.optDouble("borderRadiusBottomLeft")));
                        fDm0.cr(((float)jSONObject2.optDouble("borderRadiusBottomRight")));
                    }
                    else {
                        f6 = f1;
                    }
                    fDm0.ReZ(f2);
                    fDm0.cr(f3);
                    fDm0.JQp(f4);
                    fDm0.cz(f5);
                }
                String s = jSONObject0.optString("msg", "");
                int v = jSONObject0.optInt("code", 101);
                fDm0.PjT(z1);
                fDm0.PjT(f);
                fDm0.Zh(f6);
                fDm0.PjT(s);
                fDm0.Zh(v);
                this.ltE.PjT(fDm0);
                if(jSONObject2 != null) {
                    Au au0 = this.OMu;
                    if(au0 != null) {
                        au0.PjT(fDm0);
                    }
                }
            }
            catch(Exception unused_ex) {
                fDm0.Zh(101);
                fDm0.PjT("");
                this.ltE.PjT(fDm0);
            }
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    @JavascriptInterface
    public void renderDidFinish(String s) {
        try {
            this.qla(new JSONObject(s));
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    @JavascriptInterface
    public void skipVideo() {
        Jo.PjT(() -> {
            fDm fDm0 = KM.this.Owx;
            if(fDm0 != null) {
                fDm0.PjT();
            }
        });

        class com.bytedance.sdk.openadsdk.core.KM.4 implements Runnable {
            final KM PjT;

            @Override
            public void run() {
                KM.this.Owx();
            }
        }

    }

    private boolean tT() {
        if(this.ub == null || this.ub.Wo() == null || cRA.Zh(this.ub) || this.Co || this.ub.Wo().optInt("parent_type") != 2) {
            return false;
        }
        switch(this.ub.XWz()) {
            case 7: 
            case 8: {
                this.Co = true;
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private Context ub() {
        if(this.cr != null && this.cr.get() != null) {
            Context context0 = com.bytedance.sdk.component.utils.Zh.PjT(((View)this.cr.get()));
            return context0 == null ? this.dwk : context0;
        }
        return this.dwk;
    }

    private void ub(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        try {
            Uri uri0 = Uri.parse(jSONObject0.optString("trackData"));
            if("bytedance".equals(uri0.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.gK.PjT(uri0, this);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.Zh
    @JavascriptInterface
    public void videoFrameChanged(String s) {
        if(this.VY == null) {
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            com.bytedance.sdk.component.adexpress.Zh.fDm fDm0 = new com.bytedance.sdk.component.adexpress.Zh.fDm();
            JSONObject jSONObject1 = jSONObject0.optJSONObject("videoInfo");
            if(jSONObject1 != null) {
                double f = jSONObject1.optDouble("x");
                double f1 = jSONObject1.optDouble("y");
                double f2 = jSONObject1.optDouble("width");
                double f3 = jSONObject1.optDouble("height");
                if(this.xE(jSONObject1)) {
                    fDm0.PjT(((float)jSONObject1.optDouble("borderRadiusTopLeft")));
                    fDm0.Zh(((float)jSONObject1.optDouble("borderRadiusTopRight")));
                    fDm0.ReZ(((float)jSONObject1.optDouble("borderRadiusBottomLeft")));
                    fDm0.cr(((float)jSONObject1.optDouble("borderRadiusBottomRight")));
                }
                fDm0.ReZ(f);
                fDm0.cr(f1);
                fDm0.JQp(f2);
                fDm0.cz(f3);
            }
            XX xX0 = this.VY;
            if(xX0 != null) {
                xX0.PjT(fDm0);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    private static List xE() {
        return Arrays.asList(new String[]{"appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds"});
    }

    // 去混淆评级： 低(40)
    private boolean xE(@NonNull JSONObject jSONObject0) {
        return jSONObject0.has("borderRadiusTopLeft") && jSONObject0.has("borderRadiusBottomLeft") && jSONObject0.has("borderRadiusTopRight") && jSONObject0.has("borderRadiusBottomRight");
    }

    private void xf(JSONObject jSONObject0) {
        com.bytedance.sdk.openadsdk.xf.ReZ reZ0 = this.Yo;
        if(reZ0 != null && jSONObject0 != null) {
            reZ0.PjT(jSONObject0.optBoolean("isRenderSuc", false), jSONObject0.optInt("code", -1), jSONObject0.optString("msg", ""));
        }
    }

    public void xf() {
        com.bytedance.sdk.openadsdk.DWo.ReZ reZ0 = this.SM;
        if(reZ0 != null) {
            reZ0.PjT();
        }
        ReZ kM$ReZ0 = this.cI;
        if(kM$ReZ0 != null) {
            Jo.Zh(kM$ReZ0);
            this.cI = null;
        }
        this.dwk = null;
        this.MWx = null;
    }

    // 检测为 Lambda 实现
    private void xs(JSONObject jSONObject0) [...]

    public void xs() {
        com.bytedance.sdk.openadsdk.core.KM.PjT kM$PjT0 = this.Ld;
        if(kM$PjT0 != null) {
            kM$PjT0.PjT();
        }
    }
}

