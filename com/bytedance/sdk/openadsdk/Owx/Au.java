package com.bytedance.sdk.openadsdk.Owx;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore.Images.Media;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class Au {
    public static enum PjT {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME;

    }

    private boolean AjB;
    private final Handler Au;
    private String CD;
    private int CY;
    private long Co;
    private Runnable DWo;
    private boolean GP;
    private float Gr;
    private String HG;
    private int HGd;
    private String IJ;
    private String It;
    public final String JQp;
    private String JU;
    private long Jo;
    private boolean KLT;
    private long KM;
    private boolean KP;
    private int Ld;
    private boolean Lmo;
    private boolean Lrd;
    private int Lx;
    private JSONObject MN;
    private int MWx;
    private String NR;
    private Context Nv;
    private String OL;
    private String OMu;
    private List OnL;
    private boolean Os;
    private String Owx;
    public final String PjT;
    private int QB;
    private long Qf;
    private String Qtm;
    private String RD;
    private com.bytedance.sdk.openadsdk.Owx.PjT RV;
    private boolean RXa;
    public final String ReZ;
    private Runnable SM;
    private boolean Sks;
    private volatile boolean Tn;
    private String UR;
    private int VY;
    private int VZ;
    private String Vs;
    private boolean WHM;
    private Map Wo;
    private volatile boolean XWz;
    private final String XX;
    private int Xe;
    private int Xtz;
    private int Yo;
    private long ZX;
    private long Zd;
    public final String Zh;
    private float ZsT;
    private int cI;
    private String cRA;
    public final String cr;
    private final String cz;
    private String dDm;
    private int dG;
    @Nullable
    private WebView dIF;
    private int dwk;
    private long fA;
    private Runnable fDm;
    private int fK;
    private int fU;
    private String gH;
    private boolean gK;
    private int hLk;
    private WeakReference hN;
    private String hx;
    private long iZZ;
    private long ig;
    private PjT ix;
    private JSONObject jK;
    private String jp;
    private int kFP;
    private ViewTreeObserver.OnGlobalLayoutListener kW;
    private float kWj;
    private String kph;
    private Set ltE;
    private int na;
    private int oG;
    private JSONObject oMU;
    private int pBJ;
    private long qZS;
    private Runnable qj;
    private Zh qla;
    private String rds;
    private int sjb;
    private boolean tT;
    private int tY;
    private cz uQg;
    private boolean ub;
    private int uvo;
    private int vSp;
    private JSONObject wKV;
    private long wN;
    private boolean xE;
    private boolean xH;
    private ReZ xR;
    private final Handler xf;
    private boolean xi;
    private Runnable xs;
    private int xu;
    private long yIW;
    private int yks;
    private long zYH;
    private boolean zZ;

    private Au(Context context0, int v, ReZ reZ0, com.bytedance.sdk.openadsdk.Owx.PjT pjT0) {
        this.cz = "playable_stuck_check_ping";
        this.XX = "playable_apply_media_permission_callback";
        this.Au = new Handler(Looper.getMainLooper());
        this.xf = new Handler(Looper.getMainLooper());
        this.xE = true;
        this.ub = true;
        this.gK = true;
        this.PjT = "PL_sdk_playable_global_viewable";
        this.Zh = "PL_sdk_page_screen_blank";
        this.ReZ = "PL_sdk_playable_destroy_analyze_summary";
        this.cr = "PL_sdk_playable_hardware_dialog_cancel";
        this.JQp = "PL_sdk_playable_hardware_dialog_setting";
        this.ltE = new HashSet(Arrays.asList(new String[]{"adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"}));
        this.Owx = null;
        this.RD = "embeded_ad";
        this.Sks = true;
        this.tT = true;
        this.Lrd = false;
        this.cRA = "";
        this.yIW = 10L;
        this.iZZ = 10L;
        this.Yo = 700;
        this.KM = 0L;
        this.Qf = 0L;
        this.ZX = -1L;
        this.Jo = -1L;
        this.Co = -1L;
        this.wN = -1L;
        this.qZS = -1L;
        this.Zd = -1L;
        this.ig = -1L;
        this.rds = "";
        this.kph = "";
        this.IJ = "";
        this.OMu = "";
        this.VY = 0;
        this.tY = 0;
        this.xH = false;
        this.dwk = 0;
        this.MWx = -1;
        this.Ld = 0;
        this.cI = 0;
        this.oG = 0;
        this.HG = null;
        this.zZ = false;
        this.Xe = 0;
        this.kFP = 0;
        this.xu = 0;
        this.CY = 0;
        this.fA = 0L;
        this.zYH = 0L;
        this.yks = -2;
        this.Xtz = 0;
        this.fK = 0;
        this.na = 0;
        this.MN = new JSONObject();
        this.Wo = new HashMap();
        this.jK = new JSONObject();
        this.dDm = "";
        this.ZsT = 0.0f;
        this.kWj = 0.0f;
        this.xi = false;
        this.RXa = false;
        this.GP = false;
        this.OnL = new ArrayList();
        this.Os = true;
        this.Tn = true;
        this.XWz = true;
        this.kW = new ViewTreeObserver.OnGlobalLayoutListener() {
            final Au PjT;

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view0 = (View)Au.this.hN.get();
                    if(view0 == null) {
                        return;
                    }
                    Au.this.Zh(view0);
                }
                catch(Throwable unused_ex) {
                }
            }
        };
        this.HGd = -1;
        this.yks = v;
        this.ix = PjT.PjT;
        this.PjT(context0, reZ0, pjT0);
    }

    private Au(Context context0, WebView webView0, ReZ reZ0, com.bytedance.sdk.openadsdk.Owx.PjT pjT0, PjT au$PjT0) {
        this.cz = "playable_stuck_check_ping";
        this.XX = "playable_apply_media_permission_callback";
        this.Au = new Handler(Looper.getMainLooper());
        this.xf = new Handler(Looper.getMainLooper());
        this.xE = true;
        this.ub = true;
        this.gK = true;
        this.PjT = "PL_sdk_playable_global_viewable";
        this.Zh = "PL_sdk_page_screen_blank";
        this.ReZ = "PL_sdk_playable_destroy_analyze_summary";
        this.cr = "PL_sdk_playable_hardware_dialog_cancel";
        this.JQp = "PL_sdk_playable_hardware_dialog_setting";
        this.ltE = new HashSet(Arrays.asList(new String[]{"adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"}));
        this.Owx = null;
        this.RD = "embeded_ad";
        this.Sks = true;
        this.tT = true;
        this.Lrd = false;
        this.cRA = "";
        this.yIW = 10L;
        this.iZZ = 10L;
        this.Yo = 700;
        this.KM = 0L;
        this.Qf = 0L;
        this.ZX = -1L;
        this.Jo = -1L;
        this.Co = -1L;
        this.wN = -1L;
        this.qZS = -1L;
        this.Zd = -1L;
        this.ig = -1L;
        this.rds = "";
        this.kph = "";
        this.IJ = "";
        this.OMu = "";
        this.VY = 0;
        this.tY = 0;
        this.xH = false;
        this.dwk = 0;
        this.MWx = -1;
        this.Ld = 0;
        this.cI = 0;
        this.oG = 0;
        this.HG = null;
        this.zZ = false;
        this.Xe = 0;
        this.kFP = 0;
        this.xu = 0;
        this.CY = 0;
        this.fA = 0L;
        this.zYH = 0L;
        this.yks = -2;
        this.Xtz = 0;
        this.fK = 0;
        this.na = 0;
        this.MN = new JSONObject();
        this.Wo = new HashMap();
        this.jK = new JSONObject();
        this.dDm = "";
        this.ZsT = 0.0f;
        this.kWj = 0.0f;
        this.xi = false;
        this.RXa = false;
        this.GP = false;
        this.OnL = new ArrayList();
        this.Os = true;
        this.Tn = true;
        this.XWz = true;
        this.kW = new ViewTreeObserver.OnGlobalLayoutListener() {
            final Au PjT;

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view0 = (View)Au.this.hN.get();
                    if(view0 == null) {
                        return;
                    }
                    Au.this.Zh(view0);
                }
                catch(Throwable unused_ex) {
                }
            }
        };
        this.HGd = -1;
        this.yks = 0;
        this.ix = au$PjT0;
        this.dIF = webView0;
        SM.PjT(webView0);
        this.PjT(webView0);
        this.PjT(context0, reZ0, pjT0);
    }

    public JSONObject Au(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return new JSONObject();
        }
        int v = jSONObject0.optInt("type", 0);
        JSONObject jSONObject1 = new JSONObject();
        try {
            switch(v) {
                case 1: {
                    if(Build.VERSION.SDK_INT >= 23) {
                        jSONObject1.put("result", JQp.Zh(this.Nv, "android.permission.RECORD_AUDIO"));
                        return jSONObject1;
                    }
                    jSONObject1.put("result", false);
                    break;
                }
                case 2: {
                    if(Build.VERSION.SDK_INT >= 23) {
                        jSONObject1.put("result", JQp.Zh(this.Nv, "android.permission.CAMERA"));
                        return jSONObject1;
                    }
                    jSONObject1.put("result", false);
                    return jSONObject1;
                }
                case 3: {
                    if(Build.VERSION.SDK_INT >= 23) {
                        jSONObject1.put("result", JQp.PjT(this.Nv));
                        return jSONObject1;
                    }
                    jSONObject1.put("result", false);
                    return jSONObject1;
                }
                default: {
                    return jSONObject1;
                }
            }
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject1;
    }

    public void Au(String s) {
        this.Xtz = 1;
        JSONObject jSONObject0 = new JSONObject();
        try {
            long v = System.currentTimeMillis();
            this.Co = v;
            jSONObject0.put("playable_page_show_duration", (this.Jo == -1L ? 0L : v - this.Jo));
        }
        catch(Throwable unused_ex) {
        }
        this.ReZ("PL_sdk_html_load_start", jSONObject0);
        this.Tn = true;
        this.XWz = true;
        if(this.Os) {
            this.KM();
            this.Tn = false;
            this.XWz = false;
        }
        if(this.ub) {
            try {
                StringBuffer stringBuffer0 = new StringBuffer();
                StringBuffer stringBuffer1 = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                if(JQp.PjT(this.Nv, JQp.xf)) {
                    stringBuffer0.append("Microphone_");
                    stringBuffer1.append("1");
                    if(JQp.Zh(this.Nv, "android.permission.RECORD_AUDIO")) {
                        stringBuffer2.append("1");
                    }
                    else {
                        stringBuffer2.append("0");
                    }
                }
                else {
                    stringBuffer1.append("0");
                    stringBuffer2.append("0");
                }
                if(JQp.PjT(this.Nv, JQp.qj)) {
                    stringBuffer0.append("Magetometer_");
                    stringBuffer1.append("1");
                    stringBuffer2.append("1");
                }
                else {
                    stringBuffer1.append("0");
                    stringBuffer2.append("0");
                }
                if(JQp.PjT(this.Nv, JQp.DWo)) {
                    stringBuffer0.append("Accelerometer_");
                    stringBuffer1.append("1");
                    stringBuffer2.append("1");
                }
                else {
                    stringBuffer1.append("0");
                    stringBuffer2.append("0");
                }
                if(JQp.PjT(this.Nv, JQp.SM)) {
                    stringBuffer0.append("Gyro_");
                    stringBuffer1.append("1");
                    stringBuffer2.append("1");
                }
                else {
                    stringBuffer1.append("0");
                    stringBuffer2.append("0");
                }
                if(JQp.PjT(this.Nv, JQp.Au)) {
                    stringBuffer0.append("Camera_");
                    stringBuffer1.append("1");
                    if(JQp.Zh(this.Nv, "android.permission.CAMERA")) {
                        stringBuffer2.append("1");
                    }
                    else {
                        stringBuffer2.append("0");
                    }
                }
                else {
                    stringBuffer1.append("0");
                    stringBuffer2.append("0");
                }
                if(JQp.PjT(this.Nv, JQp.XX)) {
                    stringBuffer0.append("Photo");
                    stringBuffer1.append("1");
                    if(JQp.PjT(this.Nv)) {
                        stringBuffer2.append("1");
                    }
                    else {
                        stringBuffer2.append("0");
                    }
                }
                else {
                    stringBuffer1.append("0");
                    stringBuffer2.append("0");
                }
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("playable_available_hardware_name", stringBuffer0.toString());
                jSONObject1.put("playable_available_hardware_code", stringBuffer1.toString());
                jSONObject1.put("playable_available_hardware_auth_code", stringBuffer2.toString());
                this.ReZ("PL_sdk_hardware_detect", jSONObject1);
                this.ub = false;
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public boolean Au() {
        return this.KP;
    }

    public void Co() {
        this.fK = 0;
        this.na = 0;
        this.Gr = 0.0f;
        this.fU = 0;
        this.Lx = 0;
        this.uvo = 0;
        this.QB = 0;
        this.pBJ = 0;
        this.sjb = 0;
        this.dG = 0;
        this.vSp = 0;
        this.hLk = 0;
        this.VZ = 0;
    }

    public JSONObject DWo() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("send_click", this.WHM);
            return jSONObject0;
        }
        catch(Throwable unused_ex) {
            return new JSONObject();
        }
    }

    public void DWo(String s) {
        com.bytedance.sdk.openadsdk.Owx.Au.2 au$20 = () -> {
            int v = Au.this.VY;
            Au.this.VY = v + 1;
            return v;
        };
        this.Au.post(au$20);

        class com.bytedance.sdk.openadsdk.Owx.Au.2 implements Runnable {
            final Au PjT;

            @Override
            public void run() {
                Au.xf(Au.this);
            }
        }

    }

    private void IJ() {
        this.qla.PjT(System.currentTimeMillis());
        Handler handler0 = this.xf;
        if(handler0 != null) {
            int v = this.yks;
            if(v == 0) {
                Runnable runnable0 = this.xs;
                if(runnable0 != null) {
                    handler0.post(runnable0);
                    this.qla.PjT(500);
                    return;
                }
                goto label_9;
            }
            else {
            label_9:
                if(v == 1 || v == 2) {
                    Runnable runnable1 = this.fDm;
                    if(runnable1 != null) {
                        handler0.post(runnable1);
                    }
                }
            }
            this.qla.PjT(500);
        }
    }

    private void JQp(String s, JSONObject jSONObject0) {
        try {
            switch(this.yks) {
                case 1: 
                case 2: {
                    jSONObject0.put("playable_url", this.ReZ(this.hx, this.gH));
                    break;
                }
                case 3: 
                case 4: {
                    jSONObject0.put("playable_url", this.cr(this.It, this.JU));
                }
            }
            jSONObject0.put("playable_render_type", this.yks);
            if(this.RV != null) {
                if(this.yks == 0 && (this.ix != PjT.PjT || this.xf(this.Qtm))) {
                    this.RV.PjT(jSONObject0);
                    return;
                }
                if(this.yks != 0) {
                    this.RV.PjT(jSONObject0);
                }
            }
        }
        catch(JSONException unused_ex) {
        }
    }

    public Au JQp(String s) {
        this.NR = s;
        return this;
    }

    public Au JQp(boolean z) {
        this.Os = z;
        return this;
    }

    public String JQp() {
        return this.UR;
    }

    public void JQp(JSONObject jSONObject0) {
        this.wKV = jSONObject0;
        ++this.oG;
        this.Jo();
        this.Au.removeCallbacks(this.qj);
        if(!this.tT) {
            return;
        }
        this.Zd = System.currentTimeMillis();
        this.fA = System.currentTimeMillis();
        this.zYH = 0L;
        int v = this.yks;
        if(v == 0) {
            WebView webView0 = this.dIF;
            if(webView0 != null) {
                webView0.evaluateJavascript("javascript:typeof playable_callJS === \'function\' && playable_callJS()", new ValueCallback() {
                    final Au PjT;

                    public void PjT(String s) {
                        Au.this.zYH = System.currentTimeMillis();
                    }

                    @Override  // android.webkit.ValueCallback
                    public void onReceiveValue(Object object0) {
                        this.PjT(((String)object0));
                    }
                });
            }
        }
        else if(v == 1 || v == 2) {
            this.PjT("playable_stuck_check_ping", new JSONObject());
        }
        this.Au.postDelayed(this.qj, ((long)this.Yo));
    }

    public void Jo() {
        try {
            Zh zh0 = this.qla;
            if(zh0 != null) {
                zh0.PjT();
            }
            Handler handler0 = this.xf;
            if(handler0 != null) {
                handler0.removeCallbacksAndMessages(null);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public void KM() {
        if(this.yks == 0 || this.yks == 1 || this.yks == 2) {
            if(this.Tn) {
                this.Au.postDelayed(this.SM, this.yIW * 1000L);
            }
            if(this.XWz && this.xf(this.Qtm) || (this.yks == 1 || this.yks == 2)) {
                this.Au.postDelayed(this.DWo, this.iZZ * 1000L);
            }
        }
    }

    public void Lrd() {
        this.zZ = true;
    }

    public JSONObject Owx() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("devicePixelRatio", ((double)this.Gr));
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("width", this.fU);
            jSONObject1.put("height", this.Lx);
            jSONObject0.put("screen", jSONObject1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("x", this.QB);
            jSONObject2.put("y", this.uvo);
            jSONObject2.put("width", this.pBJ);
            jSONObject2.put("height", this.sjb);
            jSONObject0.put("webview", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.vSp);
            jSONObject3.put("y", this.dG);
            jSONObject3.put("width", this.hLk);
            jSONObject3.put("height", this.VZ);
            jSONObject0.put("visible", jSONObject3);
        }
        catch(Throwable unused_ex) {
        }
        return jSONObject0;
    }

    public static Au PjT(Context context0, @Nullable WebView webView0, ReZ reZ0, com.bytedance.sdk.openadsdk.Owx.PjT pjT0) {
        if(reZ0 != null && pjT0 != null) {
            return webView0 == null ? new Au(context0, 0, reZ0, pjT0) : new Au(context0, webView0, reZ0, pjT0, PjT.PjT);
        }
        return null;
    }

    private void PjT(Context context0, ReZ reZ0, com.bytedance.sdk.openadsdk.Owx.PjT pjT0) {
        this.Owx = "f1d1ce3b-1405-471e-82f2-54b21a94f58b";
        this.Nv = context0;
        this.RV = pjT0;
        this.xR = reZ0;
        DWo.PjT(pjT0);
        this.uQg = new cz(this);
        this.rds();
        if(this.dIF == null) {
            this.HGd = 4;
            com.bytedance.sdk.openadsdk.Owx.Au.4 au$40 = () -> {
                Au.this.Jo();
                Au.this.ReZ(5, "webview is null");
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("playable_code", 5);
                    jSONObject0.put("playable_msg", "webview is null");
                }
                catch(Throwable unused_ex) {
                }
                Au.this.ReZ("PL_sdk_global_faild", jSONObject0);
            };
            this.Au.post(au$40);
        }

        class com.bytedance.sdk.openadsdk.Owx.Au.4 implements Runnable {
            final Au PjT;

            @Override
            public void run() {
                Au.this.PjT(5, "webview is null");
            }
        }

    }

    public Context PjT() {
        return this.Nv;
    }

    public Au PjT(float f) {
        this.Gr = f;
        return this;
    }

    public Au PjT(long v) {
        if(v <= 0L) {
            this.yIW = 10L;
            return this;
        }
        this.yIW = v;
        return this;
    }

    public Au PjT(String s) {
        this.UR = s;
        return this;
    }

    public Au PjT(String s, String s1) {
        this.Wo.put(s, s1);
        return this;
    }

    public Au PjT(boolean z) {
        try {
            this.KP = z;
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("endcard_mute", this.KP);
            this.PjT("volumeChange", jSONObject0);
        }
        catch(Throwable unused_ex) {
        }
        return this;
    }

    public void PjT(int v) {
        this.HGd = v;
    }

    // 检测为 Lambda 实现
    protected void PjT(int v, String s) [...]

    public void PjT(int v, String s, String s1) {
        this.Xtz = -1;
        this.OL = s1;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("playable_code", v);
            jSONObject0.put("playable_msg", s);
            jSONObject0.put("playable_fail_url", s1);
            jSONObject0.put("playable_has_show", this.qZS());
        }
        catch(Throwable unused_ex) {
        }
        this.ReZ("PL_sdk_html_load_error", jSONObject0);
        if(this.Sks) {
            this.Sks = false;
            this.Tn = false;
            this.XWz = false;
            this.Au.removeCallbacks(this.SM);
            this.Au.removeCallbacks(this.DWo);
            this.PjT(1, "ContainerLoadFail");
        }
    }

    public void PjT(View view0) {
        if(view0 == null) {
            return;
        }
        try {
            this.hN = new WeakReference(view0);
            this.Zh(view0);
            view0.getViewTreeObserver().addOnGlobalLayoutListener(this.kW);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void PjT(String s, JSONObject jSONObject0) {
        ReZ reZ0 = this.xR;
        if(reZ0 != null) {
            reZ0.PjT(s, jSONObject0);
        }
    }

    public void PjT(JSONObject jSONObject0) {
        if(this.RV != null && jSONObject0 != null) {
            String s = jSONObject0.optString("resource_base64");
            if(TextUtils.isEmpty(s)) {
                return;
            }
            int v = jSONObject0.optInt("resource_type", -1);
            String s1 = jSONObject0.optString("resource_name", "playable_media");
            if(v == 1) {
                this.Zh(s1, s);
            }
        }
    }

    public void PjT(boolean z, String s, int v) {
        if(z) {
            this.Xtz = -1;
            this.OL = s;
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("playable_code", v);
                jSONObject0.put("playable_msg", "url load error");
                jSONObject0.put("playable_fail_url", s);
                jSONObject0.put("playable_has_show", this.qZS());
            }
            catch(Throwable unused_ex) {
            }
            this.ReZ("PL_sdk_html_load_error", jSONObject0);
            if(this.Sks) {
                this.Sks = false;
                this.Tn = false;
                this.XWz = false;
                this.Au.removeCallbacks(this.SM);
                this.Au.removeCallbacks(this.DWo);
                this.PjT(1, "ContainerLoadFail");
            }
        }
    }

    public void Qf() {
        this.XWz = false;
        this.Au.removeCallbacks(this.DWo);
        try {
            JSONObject jSONObject0 = new JSONObject();
            if(this.Co > 0L) {
                jSONObject0.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.Co);
            }
            else {
                jSONObject0.put("playable_jssdk_load_success_duration", 0L);
            }
            this.ReZ("PL_sdk_jssdk_load_success", jSONObject0);
        }
        catch(JSONException unused_ex) {
        }
    }

    public void RD() {
        com.bytedance.sdk.openadsdk.Owx.PjT pjT0 = this.RV;
        if(pjT0 != null) {
            pjT0.Zh();
        }
    }

    private String ReZ(String s, String s1) {
        String s4;
        String s3;
        if(TextUtils.isEmpty(this.jp) && !TextUtils.isEmpty(this.dDm)) {
            Uri uri0 = Uri.parse(this.dDm);
            String s2 = uri0.getHost();
            if("lynxview".equalsIgnoreCase(s2) || s2 != null && s2.contains("lynxview")) {
                s3 = uri0.getQueryParameter("surl");
                s4 = uri0.getQueryParameter("playable_hash");
            }
            else {
                s3 = "";
                s4 = "";
            }
            Uri.Builder uri$Builder0 = new Uri.Builder().scheme(uri0.getScheme()).authority(s2).appendQueryParameter("surl", s3);
            if(!TextUtils.isEmpty(s4)) {
                uri$Builder0.appendQueryParameter("playable_hash", s4);
            }
            this.jp = uri$Builder0.toString();
        }
        return this.jp;
    }

    private void ReZ(int v, String s) {
        com.bytedance.sdk.openadsdk.Owx.PjT pjT0 = this.RV;
        if(pjT0 != null) {
            pjT0.PjT(v, s);
        }
    }

    public Au ReZ(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("playable_style", s);
            this.oMU = jSONObject0;
        }
        catch(Throwable unused_ex) {
        }
        return this;
    }

    public Au ReZ(JSONObject jSONObject0) {
        this.jK = jSONObject0;
        return this;
    }

    public Au ReZ(boolean z) {
        if(this.HGd == -1) {
            return this;
        }
        if(this.Lmo == z) {
            return this;
        }
        this.Lmo = z;
        JSONObject jSONObject0 = new JSONObject();
        if(!this.Lmo) {
            try {
                jSONObject0.put("playable_background_show_type", this.kFP);
            }
            catch(JSONException unused_ex) {
            }
        }
        this.ReZ((this.Lmo ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false"), jSONObject0);
        if(this.Jo == -1L && this.Lmo) {
            this.Jo = System.currentTimeMillis();
            JSONObject jSONObject1 = new JSONObject();
            try {
                jSONObject1.put("render_type", (this.HGd == 1 ? 1 : 2));
                int v = this.HGd;
                if(v != -1) {
                    jSONObject1.put("webview_state", v);
                }
            }
            catch(JSONException unused_ex) {
            }
            this.ReZ("PL_sdk_page_show", jSONObject1);
        }
        if(this.Jo != -1L && !this.Lmo && !this.xi) {
            this.xi = true;
        }
        if(this.Lmo) {
            this.ZX = System.currentTimeMillis();
        }
        else if(this.ZX != -1L) {
            this.KM += System.currentTimeMillis() - this.ZX;
            this.ZX = -1L;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("viewStatus", this.Lmo);
            this.PjT("viewableChange", jSONObject2);
        }
        catch(Throwable unused_ex) {
        }
        if(this.Lmo) {
            this.ZX();
            return this;
        }
        this.Jo();
        return this;
    }

    public JSONObject ReZ() {
        return this.oMU;
    }

    public void ReZ(String s, JSONObject jSONObject0) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        try {
            if(!this.xH && this.tY > 0) {
                this.xH = true;
            }
            if("PL_sdk_html_load_start".equals(s) || "PL_sdk_html_load_finish".equals(s) || "PL_sdk_html_load_error".equals(s)) {
                jSONObject0.put("usecache", ((int)this.AjB));
            }
            jSONObject0.put("playable_event", s);
            jSONObject0.put("playable_ts", System.currentTimeMillis());
            jSONObject0.put("playable_viewable", this.Lmo);
            jSONObject0.put("playable_session_id", this.Owx);
            int v = this.yks;
            if(v == 0) {
                if(this.ix != PjT.PjT && !this.xf(this.Qtm)) {
                    this.kph();
                }
                jSONObject0.put("playable_url", this.Qtm);
            }
            else if(v == 3 || v == 4) {
                jSONObject0.put("playable_url", this.cr(this.It, this.JU));
            }
            else if(v == 1 || v == 2) {
                jSONObject0.put("playable_url", this.ReZ(this.hx, this.gH));
            }
            String s1 = "";
            jSONObject0.put("playable_full_url", this.dDm);
            jSONObject0.put("playable_replay_count", this.dwk);
            jSONObject0.put("playable_is_prerender", this.KLT);
            jSONObject0.put("playable_is_preload", this.xH);
            jSONObject0.put("playable_render_type", this.yks);
            jSONObject0.put("playable_scenes_type", this.ix.ordinal());
            jSONObject0.put("playable_gecko_key", (TextUtils.isEmpty(this.hx) ? "" : this.hx));
            if(!TextUtils.isEmpty(this.gH)) {
                s1 = this.gH;
            }
            jSONObject0.put("playable_gecko_channel", s1);
            jSONObject0.put("playable_sdk_version", "6.6.0");
            jSONObject0.put("playable_minigamelite_id", this.It);
            jSONObject0.put("playable_minigamelite_schema", this.JU);
            jSONObject0.put("playable_is_debug", this.RXa);
            jSONObject0.put("playable_retry_count", this.Ld);
            jSONObject0.put("playable_enter_from", this.cI);
            jSONObject0.put("playable_sequence", this.oG);
            jSONObject0.put("playable_current_section", this.HG);
            jSONObject0.put("is_playable_finish", this.zZ);
            jSONObject0.put("playable_card_session", this.rds);
            jSONObject0.put("playable_video_session", this.kph);
            jSONObject0.put("playable_network_type", this.xE());
            jSONObject0.put("playable_lynx_version", this.cRA);
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("ad_extra_data", jSONObject0);
            jSONObject1.put("tag", this.RD);
            jSONObject1.put("nt", 4);
            jSONObject1.put("category", "umeng");
            jSONObject1.put("is_ad_event", "1");
            jSONObject1.put("refer", "playable");
            jSONObject1.put("value", this.jK.opt("cid"));
            jSONObject1.put("log_extra", this.jK.opt("log_extra"));
            if(this.yks != -2 && this.yks != -1) {
                if(this.RV != null) {
                    if(this.OnL != null && !this.OnL.isEmpty()) {
                        for(Object object0: this.OnL) {
                            JSONObject jSONObject2 = ((JSONObject)object0).optJSONObject("ad_extra_data");
                            if(jSONObject2 != null) {
                                jSONObject2.put("playable_render_type", this.yks);
                                jSONObject2.put("playable_url", this.Qtm);
                            }
                            this.RV.PjT(jSONObject2);
                        }
                        this.OnL.clear();
                    }
                    if(this.yks == 0 && (this.ix != PjT.PjT || this.xf(this.Qtm))) {
                        this.RV.PjT(jSONObject0);
                        return;
                    }
                    if(this.yks != 0) {
                        this.RV.PjT(jSONObject0);
                    }
                }
                return;
            }
            if(this.OnL == null) {
                this.OnL = new ArrayList();
            }
            this.OnL.add(jSONObject1);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void SM(String s) {
        boolean z = this.Xtz == -1;
        this.Xtz = 2;
        if(!z) {
            this.OL = s;
            JSONObject jSONObject0 = new JSONObject();
            try {
                long v = System.currentTimeMillis();
                this.wN = v;
                jSONObject0.put("playable_html_load_start_duration", (this.Co == -1L ? 0L : v - this.Co));
                jSONObject0.put("playable_has_show", this.qZS());
            }
            catch(Throwable unused_ex) {
            }
            this.ReZ("PL_sdk_html_load_finish", jSONObject0);
        }
        this.Tn = false;
        this.Au.removeCallbacks(this.SM);
        try {
            if(this.yks == 0) {
                if(this.xE) {
                    WebView webView0 = this.dIF;
                    if(webView0 != null) {
                        this.xE = false;
                        webView0.evaluateJavascript("function playable_callJS(){return \"Android call the JS method is callJS\";}", new ValueCallback() {
                            final Au PjT;

                            @Override  // android.webkit.ValueCallback
                            public void onReceiveValue(Object object0) {
                            }
                        });
                    }
                }
                this.ZX();
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public void SM(JSONObject jSONObject0) {
        if(jSONObject0 != null) {
            boolean z = jSONObject0.optBoolean("success", true);
            if(z) {
                this.Xtz = 3;
                this.ZX();
            }
            else {
                this.Xtz = -2;
            }
            if(!z && this.Sks) {
                this.Sks = false;
                this.Tn = false;
                this.XWz = false;
                this.Au.removeCallbacks(this.SM);
                this.Au.removeCallbacks(this.DWo);
                this.PjT(4, "CaseRenderFail");
            }
        }
    }

    public boolean SM() {
        return this.Lmo;
    }

    public void Sks() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            if(this.qZS > 0L) {
                jSONObject0.put("playable_material_interactable_duration", System.currentTimeMillis() - this.qZS);
            }
            else {
                jSONObject0.put("playable_material_interactable_duration", 0L);
            }
            if(this.Co > 0L) {
                long v = System.currentTimeMillis() - this.Co;
                this.ig = v;
                jSONObject0.put("playable_material_interactable_load_duration", v);
            }
            else {
                jSONObject0.put("playable_material_interactable_load_duration", 0L);
            }
            this.ReZ("PL_sdk_material_interactable", jSONObject0);
        }
        catch(JSONException unused_ex) {
        }
    }

    public Au XX(String s) {
        try {
            this.dDm = s;
            Uri uri0 = Uri.parse(s);
            String s1 = uri0.getScheme();
            if("http".equalsIgnoreCase(s1) || "https".equalsIgnoreCase(s1)) {
                this.Zh(0);
                if(s != null) {
                    int v1 = s.indexOf("?");
                    if(v1 != -1) {
                        s = s.substring(0, v1);
                    }
                }
            }
            else {
                String s2 = uri0.getHost();
                if("webview".equalsIgnoreCase(s2) || s2 != null && s2.contains("webview")) {
                    this.Zh(0);
                    String s3 = uri0.getQueryParameter("url");
                    if(!TextUtils.isEmpty(s3)) {
                        String s4 = Uri.decode(s3);
                        if(s4 != null) {
                            int v = s4.indexOf("?");
                            s = v == -1 ? s4 : s4.substring(0, v);
                        }
                    }
                }
                else if("lynxview".equalsIgnoreCase(s2) || s2 != null && s2.contains("lynxview")) {
                    if(this.yks == -1) {
                        this.Zh(2);
                    }
                    else {
                        this.Zh(1);
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        this.Qtm = s;
        return this;
    }

    public String XX() {
        return this.NR;
    }

    public JSONObject XX(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return new JSONObject();
        }
        int v = jSONObject0.optInt("type", 0);
        JSONObject jSONObject1 = new JSONObject();
        switch(v) {
            case 1: {
                return this.xf();
            }
            case 2: {
                return this.xs();
            }
            case 3: {
                return this.fDm();
            }
            default: {
                return jSONObject1;
            }
        }
    }

    public void Yo() {
        this.zYH = System.currentTimeMillis();
        if(this.yks == 1 || this.yks == 2) {
            Zh zh0 = this.qla;
            if(zh0 != null) {
                zh0.PjT(System.currentTimeMillis());
            }
        }
    }

    public void ZX() {
        if(!this.tT) {
            return;
        }
        this.Zd = System.currentTimeMillis();
        if(this.ix == PjT.cr) {
            if(this.Lmo && this.Xtz == 3) {
                if(this.qla != null && this.qla.Zh()) {
                    this.IJ();
                    return;
                }
                if(this.qla == null) {
                    this.qla = new Zh(this, this.Yo);
                    this.IJ();
                }
            }
        }
        else if(this.Lmo && this.Xtz == 2) {
            if(this.qla != null && this.qla.Zh()) {
                this.IJ();
                return;
            }
            if(this.qla == null) {
                this.qla = new Zh(this, this.Yo);
                this.IJ();
            }
        }
    }

    public String Zd() [...] // Inlined contents

    private void Zh(View view0) {
        if(view0 == null) {
            return;
        }
        try {
            if(this.fK == view0.getWidth() && this.na == view0.getHeight()) {
                return;
            }
            this.fK = view0.getWidth();
            this.na = view0.getHeight();
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("width", this.fK);
            jSONObject0.put("height", this.na);
            this.PjT("resize", jSONObject0);
            this.MN = jSONObject0;
        }
        catch(Throwable unused_ex) {
        }
    }

    public Au Zh(int v) {
        this.yks = v;
        return this;
    }

    public Au Zh(long v) {
        if(v <= 0L) {
            this.iZZ = 10L;
            return this;
        }
        this.iZZ = v;
        return this;
    }

    public Au Zh(String s) {
        this.CD = s;
        return this;
    }

    public Au Zh(boolean z) {
        this.KLT = z;
        return this;
    }

    public Map Zh() {
        return this.Wo;
    }

    public void Zh(int v, String s) {
        this.MWx = v;
        if(this.wKV == null) {
            this.wKV = new JSONObject();
        }
        try {
            this.wKV.put("playable_stuck_type", v);
            this.wKV.put("playable_stuck_reason", s);
            if(this.Zd > 0L) {
                this.wKV.put("playable_stuck_duration", System.currentTimeMillis() - this.Zd);
            }
            else {
                this.wKV.put("playable_stuck_duration", 0L);
            }
        }
        catch(Throwable unused_ex) {
        }
        this.ReZ("PL_sdk_page_stuck", this.wKV);
        this.Jo();
        if(this.RV != null && v == 2) {
            this.wKV = new JSONObject();
        }
    }

    public void Zh(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        Bitmap bitmap0 = JQp.PjT(s1);
        if(bitmap0 != null) {
            MediaStore.Images.Media.insertImage(this.Nv.getContentResolver(), bitmap0, s, "");
        }
    }

    protected void Zh(String s, JSONObject jSONObject0) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.JQp(s, jSONObject0);
    }

    public void Zh(JSONObject jSONObject0) {
        if(this.RV != null) {
            try {
                jSONObject0.optBoolean("isPrevent", false);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public void cRA() {
    }

    private String cr(String s, String s1) {
        String s2 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", s, Uri.encode(s1));
        this.Qtm = s2;
        return s2;
    }

    public Au cr(String s) {
        this.Vs = s;
        return this;
    }

    public Au cr(boolean z) {
        try {
            this.WHM = z;
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("send_click", this.WHM);
            this.PjT("change_playable_click", jSONObject0);
        }
        catch(Throwable unused_ex) {
        }
        return this;
    }

    public String cr() {
        return this.CD;
    }

    // 去混淆评级： 中等(60)
    public JSONObject cr(String s, JSONObject jSONObject0) {
        return this.uQg.PjT(s, jSONObject0);
    }

    public void cr(JSONObject jSONObject0) {
        if(jSONObject0 != null) {
            this.HG = jSONObject0.optString("section");
        }
    }

    public Au cz(String s) {
        this.RD = s;
        return this;
    }

    public String cz() {
        return this.Vs;
    }

    public void cz(JSONObject jSONObject0) {
        this.Zh(2, (jSONObject0 == null ? "The material directly invokes the exception pocket mask on the client" : jSONObject0.optString("error_msg", "The material directly invokes the exception pocket mask on the client")));
    }

    public void cz(boolean z) {
        this.AjB = z;
    }

    public JSONObject fDm() {
        try {
            boolean z = Build.VERSION.SDK_INT >= 33;
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("isHasRead", false);
            jSONObject0.put("isHasWrite", z);
            jSONObject0.put("result", false);
            return jSONObject0;
        }
        catch(Throwable unused_ex) {
            return new JSONObject();
        }
    }

    public JSONObject gK() {
        if(this.MN.isNull("width")) {
            View view0 = (View)this.hN.get();
            if(view0 == null) {
                return this.MN;
            }
            this.Zh(view0);
        }
        return this.MN;
    }

    public void iZZ() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            if(this.qZS > 0L) {
                jSONObject0.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.qZS);
            }
            else {
                jSONObject0.put("playable_material_first_frame_show_duration", 0L);
            }
            if(this.Co > 0L) {
                jSONObject0.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.Co);
            }
            else {
                jSONObject0.put("playable_material_first_frame_load_duration", 0L);
            }
            this.ReZ("PL_sdk_material_first_frame_show", jSONObject0);
        }
        catch(JSONException unused_ex) {
        }
    }

    public int ig() {
        return this.HGd;
    }

    private void kph() {
        if(this.jK == null || (this.Qtm == null || this.Qtm.contains("/cid_"))) {
            return;
        }
        String s = this.jK.optString("cid");
        if(!TextUtils.isEmpty(s)) {
            String s1 = Uri.parse(this.Qtm).getHost();
            if(TextUtils.isEmpty(s1)) {
                this.Qtm = this.Qtm + "/cid_" + s;
                return;
            }
            this.Qtm = this.Qtm.replace(s1, s1 + "/cid_" + s);
        }
    }

    public JSONObject ltE() {
        return this.jK;
    }

    public int qZS() {
        return this.Jo == -1L || !this.Lmo ? 1 : 2;
    }

    public Set qj() {
        return this.uQg.PjT();
    }

    public void qj(String s) {
        com.bytedance.sdk.openadsdk.Owx.Au.3 au$30 = () -> {
            int v = Au.this.tY;
            Au.this.tY = v + 1;
            return v;
        };
        this.Au.post(au$30);

        class com.bytedance.sdk.openadsdk.Owx.Au.3 implements Runnable {
            final Au PjT;

            @Override
            public void run() {
                Au.xs(Au.this);
            }
        }

    }

    public JSONObject qla() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("scene_type", this.ix.ordinal());
            jSONObject0.put("safe_area_top_height", ((double)this.ZsT));
            jSONObject0.put("safe_area_bottom_height", ((double)this.kWj));
            jSONObject0.put("playable_enter_from", this.cI);
            jSONObject0.put("playable_retry_count", this.Ld);
            jSONObject0.put("playable_card_session", this.rds);
            jSONObject0.put("playable_video_session", this.kph);
            jSONObject0.put("playable_network_type", this.xE());
            jSONObject0.put("aweme_id", this.OMu);
            return jSONObject0;
        }
        catch(Throwable unused_ex) {
            return new JSONObject();
        }
    }

    private void rds() {
        this.qla = new Zh(this, this.Yo);
        this.SM = new Runnable() {
            final Au PjT;

            @Override
            public void run() {
                if(Au.this.Sks) {
                    Au.this.Sks = false;
                    Au.this.Au.removeCallbacks(Au.this.DWo);
                    Au.this.PjT(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.DWo = new Runnable() {
            final Au PjT;

            @Override
            public void run() {
                if(Au.this.Sks) {
                    Au.this.Sks = false;
                    Au.this.Tn = false;
                    Au.this.Au.removeCallbacks(Au.this.SM);
                    Au.this.PjT(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.xs = new Runnable() {
            final Au PjT;

            @Override
            public void run() {
                if(Au.this.dIF != null) {
                    Au.this.dIF.evaluateJavascript("javascript:typeof playable_callJS === \'function\' && playable_callJS()", new ValueCallback() {
                        final com.bytedance.sdk.openadsdk.Owx.Au.7 PjT;

                        public void PjT(String s) {
                            if(Au.this.qla != null) {
                                Au.this.qla.PjT(System.currentTimeMillis());
                            }
                        }

                        @Override  // android.webkit.ValueCallback
                        public void onReceiveValue(Object object0) {
                            this.PjT(((String)object0));
                        }
                    });
                }
                if(Au.this.xf != null) {
                    Au.this.xf.postDelayed(this, 500L);
                }
            }
        };
        this.fDm = new Runnable() {
            final Au PjT;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                Au.this.PjT("playable_stuck_check_ping", jSONObject0);
                if(Au.this.xf != null) {
                    Au.this.xf.postDelayed(this, 500L);
                }
            }
        };
        this.qj = new Runnable() {
            final Au PjT;

            @Override
            public void run() {
                if(Au.this.zYH > 0L) {
                    if(Au.this.zYH - Au.this.fA <= ((long)Au.this.Yo)) {
                        Au.this.ZX();
                        Au.this.fA = 0L;
                        Au.this.zYH = 0L;
                        return;
                    }
                    Au.this.Zh(1, "Clicking on the hot zone causes the program to freeze.");
                    return;
                }
                Au.this.Zh(1, "Clicking on the hot zone causes the program to freeze.");
            }
        };
    }

    public void tT() {
        this.MWx = 2;
    }

    public com.bytedance.sdk.openadsdk.Owx.PjT ub() {
        return this.RV;
    }

    public void wN() {
        if(this.GP) {
            return;
        }
        this.GP = true;
        this.Qf = 0L;
        this.ub = true;
        this.Co();
        try {
            View view0 = (View)this.hN.get();
            if(view0 != null) {
                view0.getViewTreeObserver().removeOnGlobalLayoutListener(this.kW);
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            this.uQg.Zh();
        }
        catch(Throwable unused_ex) {
        }
        try {
            Zh zh0 = this.qla;
            if(zh0 != null) {
                zh0.PjT();
                this.qla = null;
            }
            Handler handler0 = this.xf;
            if(handler0 != null) {
                handler0.removeCallbacksAndMessages(null);
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            if(!TextUtils.isEmpty(this.Qtm)) {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("playable_all_times", this.VY);
                jSONObject0.put("playable_hit_times", this.tY);
                int v = this.VY;
                if(v > 0) {
                    jSONObject0.put("playable_hit_ratio", ((double)this.tY) / (((double)v) * 1.0));
                }
                else {
                    jSONObject0.put("playable_hit_ratio", 0);
                }
                this.ReZ("PL_sdk_preload_times", jSONObject0);
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            if(!TextUtils.isEmpty(this.Qtm)) {
                if(this.ZX != -1L) {
                    this.KM += System.currentTimeMillis() - this.ZX;
                    this.ZX = -1L;
                }
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("playable_user_play_duration", this.KM);
                this.ReZ("PL_sdk_user_play_duration", jSONObject1);
            }
        }
        catch(Throwable unused_ex) {
        }
        this.Tn = false;
        this.XWz = false;
        this.Au.removeCallbacks(this.SM);
        this.Au.removeCallbacks(this.DWo);
        this.Au.removeCallbacksAndMessages(null);
    }

    public String xE() {
        if(TextUtils.isEmpty(this.IJ)) {
            com.bytedance.sdk.openadsdk.Owx.PjT pjT0 = this.RV;
            if(pjT0 != null) {
                this.IJ = pjT0.PjT().toString();
            }
        }
        return this.IJ;
    }

    // 检测为 Lambda 实现
    static int xf(Au au0) [...]

    // 去混淆评级： 低(40)
    private boolean xf(String s) {
        return !TextUtils.isEmpty(s) && (s.contains("/union-fe/playable/") || s.contains("/union-fe-sg/playable/") || s.contains("/union-fe-i18n/playable/"));
    }

    public JSONObject xf() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("result", false);
            return jSONObject0;
        }
        catch(Throwable unused_ex) {
            return new JSONObject();
        }
    }

    // 检测为 Lambda 实现
    static int xs(Au au0) [...]

    public JSONObject xs() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("result", false);
            return jSONObject0;
        }
        catch(Throwable unused_ex) {
            return new JSONObject();
        }
    }

    public void yIW() {
    }
}

