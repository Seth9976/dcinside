package com.bytedance.sdk.openadsdk.core.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.component.adexpress.PjT.Zh.JQp;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.component.utils.XX;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.component.utils.xf;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.PjT.fDm;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.wN;
import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class xs implements cz, PjT {
    static final class com.bytedance.sdk.openadsdk.core.settings.xs.PjT {
        static final xs PjT;

        static {
            com.bytedance.sdk.openadsdk.core.settings.xs.PjT.PjT = new xs(null);
        }
    }

    Zh Au;
    private Set DWo;
    public static String JQp;
    private final Zh Lrd;
    private static final ConcurrentLinkedQueue Owx;
    public static final String PjT;
    private static final Au RD;
    public static final String ReZ;
    private static final String SM;
    private final BroadcastReceiver Sks;
    final Zh XX;
    public static final String Zh;
    private final Set cRA;
    public static String cr;
    static final ConcurrentHashMap cz;
    private final DWo fDm;
    private int gK;
    private Zh iZZ;
    private boolean ltE;
    private static final com.bytedance.sdk.component.Au.Au qj;
    private final AtomicBoolean qla;
    private final Runnable tT;
    private int ub;
    private volatile boolean xE;
    private static boolean xf;
    private final com.bytedance.sdk.openadsdk.core.settings.PjT xs;
    private final Zh yIW;

    static {
        xs.PjT = "bus_con_collect_arbitrage";
        xs.Zh = "bus_con_arbitrage_loading_timeout";
        xs.ReZ = "bus_con_arbitrage_loading_alpha";
        xs.SM = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json";
        xs.qj = new com.bytedance.sdk.component.Au.Au("TemplateReInitTask") {
            @Override
            public void run() {
                JQp.Zh().SM();
                JQp.Zh().Zh(false);
                com.bytedance.sdk.component.adexpress.PjT.Zh.Zh.Zh();
                JQp.Zh().ReZ();
            }
        };
        xs.cr = "";
        xs.JQp = "IABTCF_TCString";
        xs.xf = false;
        xs.Owx = new ConcurrentLinkedQueue();
        xs.RD = new Au();
        xs.cz = new ConcurrentHashMap();
    }

    private xs() {
        this.DWo = DesugarCollections.synchronizedSet(new HashSet());
        this.xs = new com.bytedance.sdk.openadsdk.core.settings.PjT();
        this.fDm = new DWo(new com.bytedance.sdk.openadsdk.core.settings.xf.PjT() {
            final xs PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.settings.xf$PjT
            public void PjT() {
                xs.xf = true;
                if(xs.Owx != null && xs.Owx.size() != 0) {
                    com.bytedance.sdk.openadsdk.core.settings.xf.PjT[] arr_xf$PjT = (com.bytedance.sdk.openadsdk.core.settings.xf.PjT[])xs.Owx.toArray();
                    if(arr_xf$PjT != null) {
                        for(int v = 0; v < arr_xf$PjT.length; ++v) {
                            arr_xf$PjT[v].PjT();
                        }
                    }
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.settings.xf$PjT
            public void Zh() {
                if(xs.Owx != null && !xs.Owx.isEmpty()) {
                    for(Object object0: xs.Owx) {
                        ((com.bytedance.sdk.openadsdk.core.settings.xf.PjT)object0).Zh();
                    }
                }
            }
        });
        this.qla = new AtomicBoolean(false);
        this.xE = false;
        this.ub = 5000;
        this.gK = 10;
        com.bytedance.sdk.openadsdk.core.settings.xs.9 xs$90 = new BroadcastReceiver() {
            final xs PjT;
            private final Runnable Zh;

            {
                this.Zh = new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.settings.xs.9 PjT;

                    @Override
                    public void run() {
                        Jo.Zh(new com.bytedance.sdk.component.Au.Au("LoadLocalData") {
                            final com.bytedance.sdk.openadsdk.core.settings.xs.9.1 PjT;

                            @Override
                            public void run() {
                                try {
                                    xs.this.Zh();
                                }
                                catch(Exception unused_ex) {
                                }
                            }
                        });
                    }
                };
            }

            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                if(intent0 == null) {
                    return;
                }
                Jo.Zh(new com.bytedance.sdk.component.Au.Au("setting_receiver") {
                    final com.bytedance.sdk.openadsdk.core.settings.xs.9 Zh;

                    @Override
                    public void run() {
                        String s = intent0.getAction();
                        if("_tryFetRemoDat".equals(s)) {
                            int v = intent0.getIntExtra("_source", 0);
                            boolean z = intent0.getBooleanExtra("_force", false);
                            xs.this.PjT(v, z);
                            return;
                        }
                        if("_dataChanged".equals(s)) {
                            SM.PjT().removeCallbacks(com.bytedance.sdk.openadsdk.core.settings.xs.9.this.Zh);
                            SM.PjT().postDelayed(com.bytedance.sdk.openadsdk.core.settings.xs.9.this.Zh, 10000L);
                        }
                    }
                });
            }
        };
        this.Sks = xs$90;
        this.tT = new Runnable() {
            final xs PjT;

            @Override
            public void run() {
                xs.this.cr(2);
                xs.this.uvo();
            }
        };
        this.XX = new Zh() {
            final xs PjT;

            public ConcurrentHashMap PjT(String s) {
                if(TextUtils.isEmpty(s)) {
                    return xs.cz;
                }
                ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    Iterator iterator0 = jSONObject0.keys();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        String s1 = (String)object0;
                        int v = jSONObject0.optInt(s1, 100);
                        if(!TextUtils.isEmpty(s1) && v >= 0 && v <= 100) {
                            concurrentHashMap0.put(s1, v);
                        }
                    }
                }
                catch(JSONException jSONException0) {
                    Log.i("TTAD.SdkSettings", jSONException0.getMessage());
                }
                return concurrentHashMap0;
            }

            @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$Zh
            public Object Zh(String s) {
                return this.PjT(s);
            }
        };
        this.Lrd = new Zh() {
            final xs PjT;

            public Map PjT(String s) {
                if(TextUtils.isEmpty(s)) {
                    return null;
                }
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    Map map0 = new HashMap(jSONObject0.length());
                    Iterator iterator0 = jSONObject0.keys();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        String s1 = (String)object0;
                        if(!TextUtils.isEmpty(s1)) {
                            int v = jSONObject0.optInt(s1, 100);
                            if(v >= 0 && v <= 100) {
                                map0.put(s1, v);
                            }
                            else {
                                map0.put(s1, 100);
                            }
                        }
                    }
                    return map0;
                }
                catch(Exception exception0) {
                }
                RD.Zh(("get applog rate from sp failed:" + exception0.getMessage()), new Object[0]);
                return null;
            }

            @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$Zh
            public Object Zh(String s) {
                return this.PjT(s);
            }
        };
        this.cRA = new HashSet();
        this.yIW = new Zh() {
            final xs PjT;

            public Set PjT(String s) {
                Set set0 = new HashSet();
                if(!TextUtils.isEmpty(s)) {
                    try {
                        JSONObject jSONObject0 = new JSONObject(s);
                        int v = jSONObject0.optInt("applog_count");
                        if(v >= 2 && v <= 100) {
                            xs.this.gK = v;
                        }
                        int v1 = jSONObject0.optInt("applog_interval");
                        if(v1 >= 100 && v1 <= 30000) {
                            xs.this.ub = v1;
                        }
                        JSONArray jSONArray0 = jSONObject0.getJSONArray("core_label_arr");
                        if(jSONArray0 != null) {
                            for(int v2 = 0; true; ++v2) {
                                if(v2 >= jSONArray0.length()) {
                                    break;
                                }
                                String s1 = jSONArray0.getString(v2);
                                if(!TextUtils.isEmpty(s1)) {
                                    set0.add(s1);
                                }
                            }
                        }
                        return set0.size() == 0 ? new HashSet(Arrays.asList(new String[]{"click", "show", "insight_log", "mrc_show"})) : set0;
                    }
                    catch(JSONException jSONException0) {
                    }
                    Log.i("TTAD.SdkSettings", jSONException0.getMessage());
                }
                return set0.size() == 0 ? new HashSet(Arrays.asList(new String[]{"click", "show", "insight_log", "mrc_show"})) : set0;
            }

            @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$Zh
            public Object Zh(String s) {
                return this.PjT(s);
            }
        };
        this.iZZ = new Zh() {
            final xs PjT;

            public JSONObject PjT(String s) {
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    return jSONObject0 == null ? new JSONObject() : jSONObject0;
                }
                catch(Throwable throwable0) {
                    RD.Zh("TTAD.SdkSettings", throwable0.getMessage());
                    return new JSONObject();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$Zh
            public Object Zh(String s) {
                return this.PjT(s);
            }
        };
        this.Au = new Zh() {
            final xs PjT;

            private com.bytedance.sdk.openadsdk.cr.PjT.fDm.PjT PjT(JSONObject jSONObject0) {
                return jSONObject0 == null ? null : new com.bytedance.sdk.openadsdk.cr.PjT.fDm.PjT(jSONObject0.optInt("retry_times", -1), jSONObject0.optInt("time_interval", -1));
            }

            public fDm PjT(String s) {
                fDm fDm0 = new fDm();
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    fDm0.PjT(jSONObject0.optInt("enable_strategy", 0) == 1);
                    fDm0.PjT(this.PjT(jSONObject0.optJSONObject("default")));
                    JSONObject jSONObject1 = jSONObject0.optJSONObject("adid_configs");
                    if(jSONObject1 != null) {
                        Iterator iterator0 = jSONObject1.keys();
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            fDm0.PjT(((String)object0), this.PjT(jSONObject1.getJSONObject(((String)object0))));
                        }
                    }
                }
                catch(Exception unused_ex) {
                }
                return fDm0;
            }

            @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$Zh
            public Object Zh(String s) {
                return this.PjT(s);
            }
        };
        try {
            Context context0 = ub.PjT();
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("_dataChanged");
            if(Build.VERSION.SDK_INT >= 33) {
                context0.registerReceiver(xs$90, intentFilter0, 4);
                return;
            }
            context0.registerReceiver(xs$90, intentFilter0);
            return;
        }
        catch(Exception exception0) {
        }
        RD.PjT("TTAD.SdkSettings", "", exception0);
    }

    xs(com.bytedance.sdk.openadsdk.core.settings.xs.1 xs$10) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean Au() {
        return this.fDm.PjT("if_both_open", 0) == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean Au(String s) {
        return s == null ? true : this.iZZ(s).fDm == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public String CD() {
        return this.fDm.PjT("bus_con_check_clz", "");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int CY() {
        return this.fDm.PjT("perf_con_thread_stack_size", 0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int Co() {
        return this.fDm.PjT("ivrv_downward", 0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int DWo() {
        return this.fDm.PjT("load_callback_strategy", 0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int DWo(String s) {
        return this.iZZ(s).qj;
    }

    public static cz Gr() {
        if(ub.PjT() == null) {
            IllegalStateException illegalStateException0 = new IllegalStateException("context is null");
            Log.e("TTAD.SdkSettings", "context is null", illegalStateException0);
            ApmHelper.reportCustomError("context is null", "context is null", illegalStateException0);
            return xs.RD;
        }
        return com.bytedance.sdk.openadsdk.core.settings.xs.PjT.PjT;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int HG() {
        return this.fDm.PjT("blank_detect_rate", 30);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean IJ() {
        int v = this.xs.PjT("perf_con_apm", 100);
        return v == 0 ? false : v < 0 || v >= 100 || v > ((int)(Math.random() * 100.0));
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    @Nullable
    public JSONObject JQp() {
        return (JSONObject)this.fDm.PjT("digest", null, com.bytedance.sdk.openadsdk.core.settings.JQp.PjT);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean JQp(String s) {
        switch(this.iZZ(s).JQp) {
            case 1: {
                return ltE.cr(ub.PjT());
            }
            case 2: {
                return ltE.ReZ(ub.PjT()) != 0;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public String Jo() {
        return this.fDm.PjT("policy_url", "");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int KM(String s) {
        Map map0 = (Map)this.fDm.PjT("perf_con_applog_rate", null, this.Lrd);
        if(map0 != null) {
            Integer integer0 = (Integer)map0.get(s);
            return integer0 == null || ((int)integer0) < 0 || ((int)integer0) > 100 ? 100 : ((int)integer0);
        }
        return 100;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public String KM() {
        return this.fDm.PjT("ads_url", "");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int Ld() {
        int v = this.fDm.PjT("perf_con_webview_cache_count", 0);
        return v >= 0 ? v : 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public String Lrd() {
        return this.fDm.PjT("playableLoadH5Url", "");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean Lrd(String s) {
        return this.iZZ(s).ZX;
    }

    public long Lx() {
        return this.fDm.PjT("last_req_time", 0L);
    }

    // 去混淆评级： 低(20)
    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public float MN() {
        return this.fDm.PjT("bus_con_arbitrage_loading_alpha", 1.0f);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean MWx() {
        return this.fDm.PjT("read_video_from_cache", 1) == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int Nv() {
        return this.fDm.PjT("bus_con_behavior_count", 300);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public Set OL() {
        Set set0 = Collections.emptySet();
        return (Set)this.fDm.PjT("perf_con_drop2rt_skip_label_list", set0, com.bytedance.sdk.openadsdk.core.settings.JQp.Zh);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean OMu() {
        return this.fDm.PjT("bus_con_sec_type", 0x7FFFFFFF) != 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean Owx() {
        return this.fDm.PjT("landingpage_new_style", -1) == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean Owx(String s) {
        return this.iZZ(s).RD;
    }

    public static void PjT(com.bytedance.sdk.openadsdk.core.settings.xf.PjT xf$PjT0) {
        ConcurrentLinkedQueue concurrentLinkedQueue0 = xs.Owx;
        if(!concurrentLinkedQueue0.contains(xf$PjT0)) {
            concurrentLinkedQueue0.add(xf$PjT0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int PjT(int v) {
        return this.iZZ(String.valueOf(v)).Co;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int PjT(String s) {
        return s == null ? 0 : ub.cr().iZZ(s).ltE;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int PjT(String s, boolean z) {
        if(s == null) {
            return xs.ReZ(z);
        }
        int v = this.iZZ(s).cRA;
        return v == -1 ? xs.ReZ(z) : v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public void PjT() {
        try {
            ReZ.PjT();
            this.fDm.ReZ();
            this.xs.ReZ();
            Context context0 = ub.PjT();
            int v = Build.VERSION.SDK_INT;
            File file0 = new File((v < 24 ? new File(context0.getDatabasePath("1").getParentFile().getParentFile(), "shared_prefs") : new File(context0.getDataDir(), "shared_prefs")), "tt_sdk_settings.xml");
            if(file0.exists() && file0.isFile()) {
                String s = file0.getName().replace(".xml", "");
                if(v >= 24) {
                    context0.deleteSharedPreferences(s);
                    return;
                }
                context0.getSharedPreferences(s, 0).edit().clear().apply();
                XX.ReZ(file0);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public void PjT(@TTSdkSettings.FETCH_REQUEST_SOURCE int v, boolean z) {
        if(!com.bytedance.sdk.openadsdk.core.fDm.JQp() && (v != 1 && v != 2)) {
            if(z) {
                this.ltE = true;
            }
            return;
        }
        try {
            if(TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.SM.Zh().cr())) {
                return;
            }
            if(this.ltE) {
                this.ltE = false;
                if(!z) {
                    z = true;
                }
            }
            if(!z && System.currentTimeMillis() - this.Lx() < this.fU()) {
                return;
            }
            xs.Zh(v, z);
            return;
        }
        catch(Throwable throwable0) {
        }
        ApmHelper.reportCustomError("settings request error", "settings", throwable0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public void PjT(long v) {
        this.fDm.PjT().PjT("last_req_time", v).PjT();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public void PjT(Context context0) {
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("_tryFetRemoDat");
        try {
            if(Build.VERSION.SDK_INT >= 33) {
                context0.registerReceiver(this.Sks, intentFilter0, 4);
            }
            else {
                context0.registerReceiver(this.Sks, intentFilter0);
            }
        }
        catch(Exception exception0) {
            RD.PjT("TTAD.SdkSettings", "", exception0);
        }
        if(this.xH()) {
            this.cr(1);
            this.uvo();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public void PjT(JSONObject jSONObject0, com.bytedance.sdk.openadsdk.core.settings.JQp.PjT jQp$PjT0) {
        if(jSONObject0 != null && jSONObject0.has("dyn_draw_engine_url")) {
            String s = this.fDm.PjT("dyn_draw_engine_url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json");
            String s1 = jSONObject0.optString("dyn_draw_engine_url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json");
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && !s1.equals(s)) {
                com.bytedance.sdk.openadsdk.core.fDm.Zh().postDelayed(new Runnable() {
                    final xs Zh;

                    @Override
                    public void run() {
                        if(!TextUtils.equals(xs.this.fDm.PjT("dyn_draw_engine_url", xs.SM), s1)) {
                            return;
                        }
                        JQp.Zh().ReZ();
                    }
                }, 5000L);
            }
            jQp$PjT0.PjT("dyn_draw_engine_url", s1);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.qj$PjT
    public void PjT(boolean z) {
        this.qla.set(false);
        this.uvo();
        if(z) {
            HashMap hashMap0 = new HashMap();
            Set set0 = this.dDm();
            if(set0 != null && !set0.isEmpty()) {
                hashMap0.put("fields_allowed", set0);
            }
            String s = wN.xs();
            if(!TextUtils.isEmpty(s)) {
                hashMap0.put("key_transfer_host", s);
            }
            com.bytedance.sdk.openadsdk.core.SM.Zh.Zh().PjT(hashMap0);
            xs.kWj();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean PjT(CryptDataScene pangleEncryptConstant$CryptDataScene0) {
        if(pangleEncryptConstant$CryptDataScene0 != CryptDataScene.GET_ADS && pangleEncryptConstant$CryptDataScene0 != CryptDataScene.BIDDING_TOKEN) {
            return pangleEncryptConstant$CryptDataScene0 == CryptDataScene.APP_LOG ? this.fDm.PjT("perf_con_crypt_V4_applog", false) : this.fDm.PjT("perf_con_crypt_V4", false);
        }
        return this.fDm.PjT("perf_con_crypt_V4_get_ad", false);
    }

    public static boolean QB() {
        return xs.xf;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public String Qf() {
        return this.fDm.PjT("settings_url", "");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean Qf(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        Set set0 = Collections.emptySet();
        Set set1 = (Set)this.fDm.PjT("token_adx_ids", set0, com.bytedance.sdk.openadsdk.core.settings.JQp.Zh);
        return set1 == null || set1.size() == 0 ? false : set1.contains(s);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean Qtm() {
        return this.fDm.PjT("bus_con_video_keep_screen_on", 1) == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int RD(String s) {
        return this.iZZ(s).yIW;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public long RD() {
        return this.fDm.PjT("duration", 10000L);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int RV() {
        return this.fDm.PjT("perf_con_drawable_code", 0);
    }

    // 去混淆评级： 低(20)
    private static int ReZ(boolean z) {
        return z ? 20 : 5;
    }

    public static String ReZ(Context context0) [...] // 潜在的解密器

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int ReZ(int v) {
        return this.iZZ(String.valueOf(v)).SM;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public String ReZ() {
        return this.fDm.PjT("aes_key", "");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean ReZ(String s) {
        return this.iZZ(s).ReZ == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int SM(String s) {
        return s == null ? 1500 : this.iZZ(s).xE;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public String SM() {
        return this.fDm.PjT("ab_test_version", "");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int Sks() {
        return this.fDm.PjT("max", 50);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int Sks(String s) {
        return this.iZZ(s).iZZ;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean UR() {
        return this.fDm.PjT("bus_con_rewardedfull_link", 0) == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean VY() {
        return this.fDm.PjT("bus_con_dislike_report_raw", false);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean Vs() {
        return this.fDm.PjT("bus_con_url_check", 1) != 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int Wo() {
        return this.fDm.PjT("perf_con_close_button_delay_check_time", -1);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int XX(String s) {
        return this.iZZ(s).gK;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public void XX() {
        this.fDm.PjT().PjT("tt_sdk_settings").PjT("ab_test_param").PjT();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean Xe() {
        return com.bytedance.sdk.component.adexpress.cr.Zh.PjT(ub.PjT()) ? this.fDm.PjT("support_rtl", false) : false;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int Xtz() {
        int v = this.fDm.PjT("bus_con_token_thread_count", 4);
        return v <= 0 || v > 30 ? 4 : v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean Yo() {
        return this.fDm.Zh();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean Yo(@NonNull String s) {
        Set set0 = Collections.emptySet();
        Set set1 = (Set)this.fDm.PjT("privacy_fields_allowed", set0, com.bytedance.sdk.openadsdk.core.settings.JQp.Zh);
        if(set1.isEmpty()) {
            switch(wN.gK()) {
                case 1: {
                    return true;
                }
                case 2: 
                case 3: {
                    return "mcc".equals(s) || "mnc".equals(s);
                }
                default: {
                    return false;
                }
            }
        }
        return set1.contains(s);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public String ZX() {
        return this.fDm.PjT("app_log_url", "");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int Zd() {
        return this.fDm.PjT("isGdprUser", -1);
    }

    public static int Zh(Context context0) {
        if(context0 != null) {
            SharedPreferences sharedPreferences0 = xs.cr(context0);
            return sharedPreferences0 == null || sharedPreferences0.getInt("IABTCF_CmpSdkID", 0x80000000) == 0x80000000 && sharedPreferences0.getInt("IABTCF_CmpSdkVersion", 0x80000000) == 0x80000000 ? -2 : sharedPreferences0.getInt("IABTCF_gdprApplies", -1);
        }
        return -2;
    }

    private static void Zh(int v, boolean z) {
        Context context0 = ub.PjT();
        if(context0 != null) {
            try {
                Intent intent0 = new Intent();
                intent0.setPackage("com.dcinside.app.android");
                intent0.setAction("_tryFetRemoDat");
                intent0.putExtra("_force", z);
                intent0.putExtra("_source", v);
                context0.sendBroadcast(intent0);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int Zh(int v) {
        return this.iZZ(String.valueOf(v)).Zh;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int Zh(String s) {
        Map map0 = (Map)this.fDm.PjT("perf_con_stats_rate", xs.cz, this.XX);
        if(map0 != null) {
            Integer integer0 = (Integer)map0.get(s);
            return integer0 == null || ((int)integer0) < 0 || ((int)integer0) > 100 ? 100 : ((int)integer0);
        }
        return 100;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    @WorkerThread
    public void Zh() {
        synchronized(this) {
            SystemClock.elapsedRealtime();
            boolean z = this.xE;
            this.xs.PjT(this.xE);
            this.fDm.PjT(this.xE);
            ReZ.PjT(!z);
            this.xE = true;
            SystemClock.elapsedRealtime();
            if(!z) {
                com.bytedance.sdk.openadsdk.core.fDm.Zh().postDelayed(new Runnable() {
                    final xs PjT;

                    @Override
                    public void run() {
                        com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT().Zh();
                    }
                }, 1000L);
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public void Zh(JSONObject jSONObject0, com.bytedance.sdk.openadsdk.core.settings.JQp.PjT jQp$PjT0) {
        if(!jSONObject0.has("is_gdpr_user")) {
            return;
        }
        int v = -1;
        int v1 = jSONObject0.optInt("is_gdpr_user", -1);
        if(v1 == -1 || v1 == 0 || v1 == 1) {
            v = v1;
        }
        jQp$PjT0.PjT("isGdprUser", v);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean ZsT() {
        return this.fDm.PjT("token_enable", 0) == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int cI() {
        int v = this.fDm.PjT("perf_con_webview_cache_count_v3", 0);
        return v >= 0 ? v : 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int cRA() {
        int v = this.fDm.PjT("fetch_tpl_timeout_ctrl", 3000);
        return v <= 0 ? 3000 : v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int cRA(String s) {
        return this.iZZ(s).Jo;
    }

    @Nullable
    private static SharedPreferences cr(Context context0) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context0);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int cr() {
        return this.fDm.PjT("max_tpl_cnts", 100);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public void cr(@TTSdkSettings.FETCH_REQUEST_SOURCE int v) {
        this.PjT(v, false);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean cr(String s) {
        return this.iZZ(s).KM;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public long cz() {
        return this.fDm.PjT("data_time", 0L);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean cz(String s) {
        return this.iZZ(s).XX == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public Set dDm() {
        Set set0 = Collections.emptySet();
        return (Set)this.fDm.PjT("privacy_fields_allowed", set0, com.bytedance.sdk.openadsdk.core.settings.JQp.Zh);
    }

    private String dG() {
        return this.fDm.PjT("force_language", "");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean dIF() {
        return this.fDm.PjT("perf_con_use_new_thread_pool", 0) == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean dwk() {
        return this.fDm.PjT("global_rate", 1.0f) == 1.0f;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean fA() {
        return this.fDm.PjT("bus_con_adshow_check_enable", true);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int fDm() {
        this.vSp();
        return this.ub;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean fDm(String s) {
        return this.xs(s) != 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean fK() {
        return this.fDm.PjT(xs.PjT, false);
    }

    public long fU() {
        long v = this.fDm.PjT("req_inter_min", 600000L);
        return v < 0L || v > 86400000L ? 600000L : v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int gK() {
        return this.fDm.PjT("loadedCallbackOpportunity", 0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public JSONObject gK(String s) {
        String s1 = this.fDm.PjT("core_settings", "");
        JSONObject jSONObject0 = null;
        try {
            jSONObject0 = new JSONObject(s1);
            jSONObject0.put("ad_slot_setting", this.iZZ(s).wN);
        }
        catch(JSONException jSONException0) {
            RD.Zh("TTAD.SdkSettings", new Object[]{"getCoreSettingJsonObj", jSONException0.getMessage()});
        }
        return jSONObject0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int hN() {
        int v = this.fDm.PjT("bus_con_auto_click_delay", 3000);
        return v <= 0 ? 3000 : v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    @NonNull
    public com.bytedance.sdk.openadsdk.core.settings.Zh iZZ(String s) {
        return ReZ.PjT(s);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public void iZZ() {
        String s = this.dG();
        if(!TextUtils.isEmpty(s)) {
            if(s.equals("zh-Hant")) {
                xf.PjT(ub.PjT(), "zh", "tw");
            }
            else {
                xf.PjT(ub.PjT(), s, null);
            }
            try {
                TTAdDislikeToast.onResourceUpdated();
            }
            catch(Throwable throwable0) {
                RD.Zh("TTAD.SdkSettings", throwable0.getMessage());
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int ig() {
        return this.fDm.PjT("vbtt", 5);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public String ix() {
        return this.fDm.PjT("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean jK() {
        return this.fDm.PjT("perf_con_is_new_net_thread", 0) == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public void jp() {
        com.bytedance.sdk.openadsdk.core.settings.JQp.PjT jQp$PjT0 = this.fDm.PjT();
        jQp$PjT0.PjT("settings_url", "");
        jQp$PjT0.PjT();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int kFP() {
        return this.fDm.PjT("bus_con_send_log_type", 1);
    }

    public static void kWj() {
        if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            return;
        }
        Context context0 = ub.PjT();
        if(context0 != null) {
            try {
                Intent intent0 = new Intent();
                intent0.setPackage("com.dcinside.app.android");
                intent0.setAction("_dataChanged");
                context0.sendBroadcast(intent0);
            }
            catch(Throwable throwable0) {
                RD.PjT("TTAD.SdkSettings", "", throwable0);
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int kph() {
        int v = this.fDm.PjT("privacy_personalized_ad", 0x7FFFFFFF);
        if(v != 0x7FFFFFFF) {
            return v;
        }
        int v1 = wN.gK();
        if(v1 != 1 && v1 != 2) {
            return v1 == 3 ? 1 : 0;
        }
        return 2;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int ltE(String s) {
        return this.iZZ(s).Owx;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public String ltE() {
        return this.fDm.PjT("ab_test_param", "");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int na() {
        return this.fDm.PjT(xs.Zh, 10000);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public String[] oG() {
        try {
            if(this.DWo == null || this.DWo.size() == 0) {
                JSONArray jSONArray0 = new JSONArray(this.fDm.PjT("gecko_hosts", null));
                if(jSONArray0.length() != 0) {
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        this.DWo.add(jSONArray0.getString(v));
                    }
                }
                Set set0 = DWo.PjT(this.DWo);
                this.DWo = set0;
                return set0 == null || set0.size() == 0 ? null : ((String[])this.DWo.toArray(new String[0]));
            }
            return (String[])this.DWo.toArray(new String[0]);
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean oMU() {
        return this.fDm.PjT("privacy_app_reg", true);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public String qZS() {
        return this.fDm.PjT("dc", "TX");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int qj() {
        return this.fDm.PjT("splash_video_load_strategy", 0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int qj(String s) {
        return this.iZZ(s).xf;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int qla(String s) {
        return this.iZZ(s).DWo;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean qla() {
        return this.fDm.PjT("allow_blind_mode_request_ad", false);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean rds() {
        int v = this.fDm.PjT("privacy_ad_enable", 0x7FFFFFFF);
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        switch(wN.gK()) {
            case 1: 
            case 2: 
            case 3: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int tT(String s) {
        return this.iZZ(s).Yo;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public com.bytedance.sdk.openadsdk.core.settings.XX tT() {
        com.bytedance.sdk.openadsdk.core.settings.xs.8 xs$80 = new Zh() {
            final xs PjT;

            public com.bytedance.sdk.openadsdk.core.settings.XX PjT(String s) {
                return new com.bytedance.sdk.openadsdk.core.settings.XX(s);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$Zh
            public Object Zh(String s) {
                return this.PjT(s);
            }
        };
        return (com.bytedance.sdk.openadsdk.core.settings.XX)this.fDm.PjT("insert_js_config", com.bytedance.sdk.openadsdk.core.settings.XX.PjT, xs$80);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean tY() {
        return this.fDm.PjT("privacy_debug_unlock", 1) != 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public fDm uQg() {
        return (fDm)this.fDm.PjT("perf_con_track_url_strategy", fDm.PjT, this.Au);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean ub() {
        return this.fDm.PjT("ad_revenue_enable", true);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean ub(String s) {
        if(s == null) {
            return true;
        }
        return DeviceUtils.DWo(ub.PjT()) == 0 ? true : this.iZZ(s).xs == 1;
    }

    // 去混淆评级： 低(30)
    void uvo() {
    }

    private Set vSp() {
        return (Set)this.fDm.PjT("perf_con_applog_send", this.cRA, this.yIW);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean wKV() {
        return this.fDm.PjT("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public String wN() {
        return this.fDm.PjT("dyn_draw_engine_url", xs.SM);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean xE() {
        return this.fDm.PjT("support_gzip", false);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean xE(String s) {
        return this.iZZ(s).Sks == 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean xH() {
        return this.xE;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public JSONObject xR() {
        JSONObject jSONObject0 = new JSONObject();
        return (JSONObject)this.fDm.PjT("perf_con_thread_pool_config", jSONObject0, this.iZZ);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public Set xf() {
        return this.vSp();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean xf(String s) {
        try {
            if(this.iZZ(s).tT != null) {
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int xs() {
        this.vSp();
        return this.gK;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int xs(String s) {
        return this.iZZ(String.valueOf(s)).Au;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean xu() {
        return this.fDm.PjT("perf_con_apm_native", 0x7FFFFFFF) == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public int yIW() {
        int v = this.fDm.PjT("fetch_tpl_second", 0);
        return v <= 0 ? 0 : v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean yIW(String s) {
        return ub.cr().iZZ(s).qla == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public boolean yks() {
        return this.fDm.PjT("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public long zYH() {
        return this.fDm.PjT("perf_con_adlog_expire_time", 0L);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.cz
    public JSONObject zZ() {
        return (JSONObject)this.fDm.PjT("video_cache_config", null, com.bytedance.sdk.openadsdk.core.settings.JQp.PjT);
    }
}

