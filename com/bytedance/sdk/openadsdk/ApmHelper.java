package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.ICrashCallback;
import com.apm.insight.MonitorCrash;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ApmHelper {
    static class PjT {
        public final String PjT;
        public final Throwable ReZ;
        public final String Zh;

        public PjT(String s, String s1, Throwable throwable0) {
            this.PjT = s;
            this.Zh = s1;
            this.ReZ = throwable0;
        }
    }

    interface Zh {
        void PjT(String arg1, String arg2, Throwable arg3);
    }

    private static boolean JQp = false;
    private static volatile boolean PjT = false;
    private static String ReZ;
    private static PjT XX;
    private static final AtomicBoolean Zh;
    private static boolean cr;
    private static Zh cz;

    static {
        ApmHelper.Zh = new AtomicBoolean(false);
        ApmHelper.JQp = false;
    }

    static boolean JQp() [...] // 潜在的解密器

    static PjT PjT(PjT apmHelper$PjT0) {
        ApmHelper.XX = apmHelper$PjT0;
        return apmHelper$PjT0;
    }

    static Zh PjT(Zh apmHelper$Zh0) {
        ApmHelper.cz = apmHelper$Zh0;
        return apmHelper$Zh0;
    }

    static String PjT(String s) {
        ApmHelper.ReZ = s;
        return s;
    }

    static void PjT(String s, String s1) {
        ApmHelper.ReZ(s, s1);
    }

    static boolean PjT() [...] // 潜在的解密器

    private static JSONObject ReZ(String s) {
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("sdk_version", "7.1.0.4");
            jSONObject2.put("host_app_id", ApmHelper.ReZ);
            jSONObject1.putOpt("custom", jSONObject2);
            jSONObject1.put("os", "Android");
            jSONObject1.put("os_version", Build.VERSION.RELEASE);
            jSONObject1.put("device_model", Build.MODEL);
            jSONObject1.put("device_brand", Build.BRAND);
            jSONObject1.put("sdk_version_name", "0.0.5");
            jSONObject1.put("aid", "10000001");
            jSONObject1.put("update_version_code", 7104);
            jSONObject1.put("bd_did", s);
            jSONObject0.putOpt("apm_id", "20000001");
            jSONObject0.putOpt("header", jSONObject1);
            jSONObject0.putOpt("local_time", System.currentTimeMillis());
            JSONArray jSONArray0 = new JSONArray();
            jSONArray0.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject0.putOpt("launch", jSONArray0);
        }
        catch(JSONException jSONException0) {
            RD.Zh("ApmHelper", jSONException0.getMessage());
        }
        return jSONObject0;
    }

    private static void ReZ(String s, String s1) {
        ApmHelper.Zh(s, s1);
    }

    private static Map SM() {
        Map map0 = new HashMap();
        Owx owx0 = com.bytedance.sdk.openadsdk.utils.Zh.PjT();
        if(owx0 != null) {
            ((HashMap)map0).put("adType", String.valueOf(owx0.kW()));
            ((HashMap)map0).put("aid", String.valueOf(owx0.HGd()));
            ((HashMap)map0).put("cid", owx0.dIF());
            ((HashMap)map0).put("reqId", owx0.ydj());
            ((HashMap)map0).put("rit", owx0.cRA("-1"));
            int v = owx0.ZX();
            if(owx0.iZZ() != 2) {
                v = -1;
            }
            ((HashMap)map0).put("render_type", String.valueOf(v));
        }
        return map0;
    }

    static Zh XX() {
        return ApmHelper.cz;
    }

    private static void Zh(String s, String s1) {
        if(!TextUtils.isEmpty(s1)) {
            JSONObject jSONObject0 = ApmHelper.ReZ(s);
            ub.ReZ().PjT(jSONObject0, "https://" + s1 + "/monitor/collect/c/session?version_code=7104&device_platform=android&aid=10000001");
        }
    }

    static boolean Zh() [...] // 潜在的解密器

    static boolean Zh(boolean z) {
        ApmHelper.PjT = z;
        return z;
    }

    static String cr() {
        return ApmHelper.ReZ;
    }

    private static void cr(String s) {
        Owx owx0 = com.bytedance.sdk.openadsdk.utils.Zh.PjT();
        if(owx0 != null) {
            String s1 = wN.PjT(owx0);
            if(TextUtils.isEmpty(s1)) {
                return;
            }
            ReZ.PjT(System.currentTimeMillis(), owx0, s1, "sdk_crash_info", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                public JSONObject PjT() {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        JSONObject jSONObject1 = new JSONObject();
                        jSONObject1.put("type", s);
                        jSONObject1.put("material", com.bytedance.sdk.component.utils.PjT.PjT(owx0.dDm()).toString());
                        jSONObject0.put("ad_extra_data", jSONObject1.toString());
                    }
                    catch(JSONException unused_ex) {
                    }
                    return jSONObject0;
                }
            });
        }
    }

    static PjT cz() {
        return ApmHelper.XX;
    }

    @NonNull
    public static Pair generateRequestHeader() {
        String s = "";
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("gaid", com.bytedance.sdk.openadsdk.ltE.PjT.Zh.PjT.PjT().Zh());
            jSONObject0.put("ipv6", "");
            jSONObject0.put("region", ub.cr().qZS());
        }
        catch(JSONException unused_ex) {
        }
        JSONObject jSONObject1 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject0, new com.bytedance.sdk.openadsdk.core.RD(CryptDataScene.UNKNOWN));
        if(jSONObject1 != null) {
            int v = jSONObject1.optInt("cypher");
            if(v == 4) {
                return new Pair("4", jSONObject1.optString("message"));
            }
            if(v == 3) {
                return new Pair("3", jSONObject1.optString("message"));
            }
            s = jSONObject0.toString();
        }
        return new Pair("0", s);
    }

    public static void initApm(Context context0, InitConfig initConfig0) {
        if(!ApmHelper.Zh.compareAndSet(false, true)) {
            return;
        }
        if(ApmHelper.PjT) {
            return;
        }
        Jo.PjT(new Au("init-apm") {
            // 去混淆评级： 低(20)
            @Override
            public void run() {
                ApmHelper.cr = ub.cr().IJ();
                wN.xs();
                ApmHelper.Zh.set(false);

                class com.bytedance.sdk.openadsdk.ApmHelper.1.1 implements CustomRequestHeader {
                    final com.bytedance.sdk.openadsdk.ApmHelper.1 PjT;

                    @Override  // com.apm.insight.CustomRequestHeader
                    public void addRequestHeader(HttpURLConnection httpURLConnection0) {
                        Pair pair0 = ApmHelper.generateRequestHeader();
                        httpURLConnection0.setRequestProperty("cypher", ((String)pair0.first));
                        httpURLConnection0.setRequestProperty("transfer-param", ((String)pair0.second));
                    }
                }


                class com.bytedance.sdk.openadsdk.ApmHelper.1.2 implements AttachUserData {
                    final com.bytedance.sdk.openadsdk.ApmHelper.1 Zh;

                    com.bytedance.sdk.openadsdk.ApmHelper.1.2(MonitorCrash monitorCrash0) {
                    }

                    @Override  // com.apm.insight.AttachUserData
                    @Nullable
                    public Map getUserData(CrashType crashType0) {
                        Map map0 = ApmHelper.SM();
                        if(map0.containsKey("render_type")) {
                            String s = (String)map0.get("render_type");
                            this.PjT.addTags("render_type", s);
                            return map0;
                        }
                        this.PjT.addTags("render_type", "-2");
                        return map0;
                    }
                }


                class com.bytedance.sdk.openadsdk.ApmHelper.1.3 implements Zh {
                    final com.bytedance.sdk.openadsdk.ApmHelper.1 Zh;

                    com.bytedance.sdk.openadsdk.ApmHelper.1.3(MonitorCrash monitorCrash0) {
                    }

                    @Override  // com.bytedance.sdk.openadsdk.ApmHelper$Zh
                    public void PjT(String s, String s1, Throwable throwable0) {
                        this.PjT.reportCustomErr(s, s1, throwable0);
                    }
                }


                class com.bytedance.sdk.openadsdk.ApmHelper.1.4 implements ICrashCallback {
                    final com.bytedance.sdk.openadsdk.ApmHelper.1 PjT;

                    @Override  // com.apm.insight.ICrashCallback
                    public void onCrash(@NonNull CrashType crashType0, @Nullable String s, @Nullable Thread thread0) {
                        ApmHelper.cr(crashType0.getName());
                        ApmHelper.JQp = true;
                    }
                }

            }
        });
    }

    public static boolean isIsInit() [...] // 潜在的解密器

    public static void reportCustomError(String s, String s1, Throwable throwable0) {
        Zh apmHelper$Zh0 = ApmHelper.cz;
        if(apmHelper$Zh0 != null) {
            apmHelper$Zh0.PjT(s, s1, throwable0);
            return;
        }
        ApmHelper.XX = new PjT(s, s1, throwable0);
    }

    public static void reportPvFromBackGround() {
        if(ApmHelper.cr) {
            ApmHelper.Zh(xf.PjT(ub.PjT()), wN.xs());
        }
    }
}

