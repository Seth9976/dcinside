package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.PjT.PjT.PjT.XX.c;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf;
import com.bytedance.sdk.openadsdk.gK.Zh;
import com.bytedance.sdk.openadsdk.ub.ReZ;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Owx;
import com.bytedance.sdk.openadsdk.utils.iZZ;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class qj extends Au {
    public interface PjT {
        void PjT(boolean arg1);
    }

    private final PjT PjT;
    private final Set ReZ;
    private final DWo Zh;

    public qj(PjT qj$PjT0, DWo dWo0, JQp[] arr_jQp) {
        super("SetF");
        HashSet hashSet0 = new HashSet();
        this.ReZ = hashSet0;
        this.PjT = qj$PjT0;
        this.Zh = dWo0;
        hashSet0.addAll(Arrays.asList(arr_jQp));
    }

    public static JSONObject PjT(int v) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            cz cz0 = ub.cr();
            jSONObject0.put("model", Build.MODEL);
            jSONObject0.put("device_city", "Asia/Shanghai");
            if(cz0.Yo("gaid")) {
                jSONObject0.put("gaid", com.bytedance.sdk.openadsdk.ltE.PjT.Zh.PjT.PjT().Zh());
            }
            jSONObject0.put("gdpr", SM.Zh().DWo());
            jSONObject0.put("pa_consent", SM.Zh().qj());
            if(cz0.Yo("mcc")) {
                jSONObject0.put("mcc", iZZ.Zh());
            }
            Context context0 = ub.PjT();
            jSONObject0.put("conn_type", wN.XX(v));
            jSONObject0.put("os", 1);
            jSONObject0.put("oversea_version_type", 1);
            jSONObject0.put("os_version", Build.VERSION.RELEASE);
            jSONObject0.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject0.put("sdk_version", "7.1.0.4");
            jSONObject0.put("language", xf.Zh());
            jSONObject0.put("time_zone", "Etc/GMT-8");
            jSONObject0.put("package_name", wN.JQp());
            jSONObject0.put("position", (wN.PjT() ? 1 : 2));
            jSONObject0.put("app_version", wN.XX());
            jSONObject0.put("vendor", Build.MANUFACTURER);
            jSONObject0.put("uuid", xf.ReZ(context0));
            String s = SM.Zh().cr();
            if(s != null) {
                jSONObject0.put("app_id", s);
            }
            long v1 = System.currentTimeMillis();
            jSONObject0.put("ts", v1 / 1000L);
            jSONObject0.put("req_sign", com.bytedance.sdk.component.utils.JQp.PjT((s == null ? "" : s + v1 / 1000L + "7.1.0.4")));
            jSONObject0.put("tcstring", xs.ReZ(context0));
            jSONObject0.put("tcf_gdpr", xs.Zh(context0));
            jSONObject0.put("lmt", DeviceUtils.ReZ());
            jSONObject0.put("locale_language", DeviceUtils.cr());
            jSONObject0.put("channel", "main");
            JSONObject jSONObject1 = cz0.JQp();
            if(jSONObject1 != null) {
                jSONObject0.put("digest", jSONObject1);
            }
            jSONObject0.put("data_time", cz0.cz());
            jSONObject0.put("app_set_id_scope", cr.Zh());
            jSONObject0.put("app_set_id", "");
            jSONObject0.put("installed_source", cr.cr());
            if(cz0.Yo("gaid")) {
                jSONObject0.put("did", xf.PjT(ub.PjT()));
            }
            jSONObject0.put("gaid", com.bytedance.sdk.openadsdk.ltE.PjT.Zh.PjT.PjT().Zh());
            jSONObject0.put("device", DeviceUtils.PjT(context0, true));
            jSONObject0.put("adx_id", SM.Zh().yIW());
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    private void PjT(String s, Map map0) {
        int v = 1;
        try {
            if(!TextUtils.isEmpty(s) && map0 != null) {
                HashMap hashMap0 = new HashMap();
                for(Object object0: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    String s1 = (String)map$Entry0.getKey();
                    if(s1 != null) {
                        hashMap0.put(s1.toLowerCase(Locale.US), map$Entry0.getValue());
                    }
                }
                int v1 = Integer.parseInt(((String)hashMap0.get("active-control")));
                long v2 = Long.parseLong(((String)hashMap0.get("ts")));
                String s2 = (String)hashMap0.get("pst");
                String s3 = c.a((s + v1 + v2));
                if(s3 != null && s3.equalsIgnoreCase(s2)) {
                    v = v1;
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        com.bytedance.sdk.openadsdk.core.settings.SM.PjT(v);
    }

    public static boolean PjT() [...] // 潜在的解密器

    public boolean PjT(@NonNull JSONObject jSONObject0) {
        this.Zh.PjT(jSONObject0);
        for(Object object0: this.ReZ) {
            JQp jQp0 = (JQp)object0;
            if(jQp0 != null) {
                jQp0.PjT(jSONObject0);
            }
        }
        return this.Zh.ReZ;
    }

    private JSONObject Zh(JSONObject jSONObject0) {
        return com.bytedance.sdk.component.utils.PjT.PjT(jSONObject0);
    }

    @Override
    public void run() {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int v = com.bytedance.sdk.component.utils.iZZ.PjT(ub.PjT(), 0L);
        if(v == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.PjT.PjT(false);
            return;
        }
        com.bytedance.sdk.openadsdk.qla.PjT.JQp jQp0 = new com.bytedance.sdk.openadsdk.qla.PjT.JQp(1);
        JSONObject jSONObject0 = qj.PjT(v);
        com.bytedance.sdk.component.XX.Zh.cr cr0 = Zh.PjT().Zh().Zh();
        try {
            String s = com.bytedance.sdk.openadsdk.Au.cr.PjT(cr0, wN.PjT("/api/ad/union/sdk/settings/", false, true));
            cr0.Zh(s);
            cr0.Zh("User-Agent", wN.ReZ());
            jQp0.PjT(s);
        }
        catch(Exception unused_ex) {
        }
        String s1 = this.Zh(jSONObject0).toString();
        if(ub.cr().tY() && com.bytedance.sdk.openadsdk.core.iZZ.PjT().cr() == 1) {
            wN.PjT("Pangle_Debug_Mode", s1, ub.PjT());
        }
        cr0.PjT(s1, ub.cr().xE());
        jQp0.PjT(cr0.JQp()).PjT();
        cr0.PjT(6);
        cr0.PjT("setting");
        ReZ.PjT(new com.bytedance.sdk.openadsdk.ub.cr() {
            final qj PjT;

            @Override  // com.bytedance.sdk.openadsdk.ub.cr
            public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                pjT0.Zh("settings_fetch");
                return pjT0;
            }
        });
        cr0.PjT(new com.bytedance.sdk.component.XX.PjT.PjT() {
            final qj Zh;

            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
                JSONObject jSONObject0;
                int v = zh0.PjT();
                String s = zh0.cr();
                if(ub.cr().tY() && com.bytedance.sdk.openadsdk.core.iZZ.PjT().cr() == 1) {
                    wN.PjT("Pangle_Debug_Mode", s, ub.PjT());
                }
                if(!zh0.cz() || TextUtils.isEmpty(s)) {
                    ReZ.ReZ(new com.bytedance.sdk.openadsdk.ub.cr() {
                        final com.bytedance.sdk.openadsdk.core.settings.qj.2 PjT;

                        @Override  // com.bytedance.sdk.openadsdk.ub.cr
                        public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                            com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                            pjT0.Zh("settings_fetch");
                            return pjT0;
                        }
                    });
                    if(reZ0 != null) {
                        Owx.PjT(reZ0.cr());
                    }
                }
                else {
                    jQp0.ReZ(s).PjT(v).PjT(true);
                    String s1 = null;
                    try {
                        jSONObject0 = null;
                        jSONObject0 = new JSONObject(s);
                    }
                    catch(JSONException unused_ex) {
                    }
                    if(jSONObject0 != null) {
                        switch(jSONObject0.optInt("cypher", -1)) {
                            case -1: {
                                break;
                            }
                            case 3: {
                                s1 = com.bytedance.sdk.component.utils.PjT.ReZ(jSONObject0.optString("message"));
                                if(!TextUtils.isEmpty(s1)) {
                                    try {
                                        jSONObject0 = new JSONObject(s1);
                                    }
                                    catch(Throwable unused_ex) {
                                    }
                                }
                                try {
                                label_15:
                                    qj.this.PjT(s1, zh0.ReZ());
                                }
                                catch(Throwable unused_ex) {
                                }
                                try {
                                    qj.this.PjT(jSONObject0);
                                    ub.cr().PjT(System.currentTimeMillis());
                                    ReZ.Zh(new com.bytedance.sdk.openadsdk.ub.cr() {
                                        final com.bytedance.sdk.openadsdk.core.settings.qj.2 PjT;

                                        @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                        public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                            com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                            pjT0.Zh("settings_fetch");
                                            return pjT0;
                                        }
                                    });
                                    Owx.Zh();
                                }
                                catch(Throwable unused_ex) {
                                }
                                qj.this.PjT.PjT(true);
                                return;
                            }
                            default: {
                                goto label_15;
                            }
                        }
                    }
                }
                jQp0.ReZ(s).PjT(v).cr(zh0.Zh()).PjT(zh0.cz());
                qj.this.PjT.PjT(false);
            }

            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
                jQp0.cr((iOException0 == null ? null : iOException0.getMessage())).PjT(false);
                qj.this.PjT.PjT(false);
                ReZ.ReZ(new com.bytedance.sdk.openadsdk.ub.cr() {
                    final com.bytedance.sdk.openadsdk.core.settings.qj.2 PjT;

                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                        pjT0.Zh("settings_fetch");
                        return pjT0;
                    }
                });
                if(reZ0 != null) {
                    Owx.PjT(reZ0.cr());
                }
            }
        });
        DeviceUtils.qj();
    }
}

