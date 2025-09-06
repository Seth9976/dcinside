package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.PjT.PjT.PjT.XX.b;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.qla;
import com.bytedance.sdk.openadsdk.AdSlot.Builder;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.core.settings.cz;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.cz.Zh;
import com.bytedance.sdk.openadsdk.ub.ReZ;
import com.bytedance.sdk.openadsdk.ub.Zh.PjT;
import com.bytedance.sdk.openadsdk.ub.cr;
import com.bytedance.sdk.openadsdk.utils.XX;
import com.bytedance.sdk.openadsdk.utils.cRA;
import com.bytedance.sdk.openadsdk.utils.iZZ;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@Deprecated
public class Yo implements yIW {
    private static final Map JQp;
    boolean PjT;
    String ReZ;
    boolean Zh;
    String cr;
    private int cz;

    static {
        Yo.JQp = new HashMap(12) {
            {
                int v = 12;  // 捕获的参数
                this.put(1, "abtest");
                this.put(2, "user_data");
                this.put(3, "gaid");
                this.put(4, "apk-sign");
                this.put(5, "app_set_id_scope");
                this.put(6, "app_set_id");
                this.put(7, "installed_source");
                this.put(8, "app_running_time");
                this.put(9, "vendor");
                this.put(10, "model");
                this.put(11, "user_agent_device");
                this.put(12, "user_agent_webview");
                this.put(13, "sys_compiling_time");
                this.put(14, "sec_did");
                this.put(15, "url");
                this.put(16, "X-Argus");
                this.put(17, "X-Ladon");
                this.put(18, "X-Khronos");
                this.put(19, "X-Gorgon");
                this.put(20, "pangle_m");
                this.put(21, "screen_height");
                this.put(22, "screen_width");
                this.put(23, "rom_version");
                this.put(24, "carrier_name");
                this.put(25, "os_version");
                this.put(26, "conn_type");
                this.put(27, "boot");
                this.put(28, "feature_data");
                this.put(29, "t_ver");
                this.put(30, "aab");
                this.put(0x1F, "w_ver");
                this.put(0x20, "is_fold");
                this.put(33, "abi");
            }
        };
    }

    public Yo() {
        this.PjT = false;
        this.Zh = false;
        this.ReZ = "com.union_test.internationad";
        this.cr = "8025677";
        this.cz = 0;
    }

    public static void Au() {
        try {
            ReZ.ReZ(new cr() {
                @Override  // com.bytedance.sdk.openadsdk.ub.cr
                public PjT generatorModel() {
                    PjT pjT0 = new PjT();
                    pjT0.Zh("bidding_token");
                    return pjT0;
                }
            });
        }
        catch(Throwable throwable0) {
            RD.Zh("TTAdManagerImpl", throwable0.getMessage());
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public int JQp() {
        return SM.Zh().qj();
    }

    public Yo JQp(String s) {
        SM.Zh().ReZ(s);
        return this;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public yIW JQp(int v) {
        SM.Zh().JQp(v);
        return this;
    }

    private JSONObject PjT(JSONObject jSONObject0, boolean z) {
        JSONObject jSONObject1;
        if(z) {
            jSONObject1 = PangleEncryptManager.encryptType4(jSONObject0, new com.bytedance.sdk.openadsdk.core.RD(CryptDataScene.BIDDING_TOKEN));
            Sks.PjT(jSONObject1);
            return jSONObject1 == null ? new JSONObject() : jSONObject1;
        }
        jSONObject1 = com.bytedance.sdk.component.utils.PjT.PjT(jSONObject0);
        return jSONObject1 == null ? new JSONObject() : jSONObject1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public yIW PjT() {
        qla.PjT("PangleSDK-7104");
        b.c("PangleSDK-7104");
        RD.PjT("PangleSDK-7104");
        qla.Zh();
        com.bytedance.sdk.component.XX.PjT.PjT();
        b.a();
        RD.PjT();
        return this;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public yIW PjT(int v) {
        SM.Zh().cz(v);
        return this;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public yIW PjT(String s) {
        return this.cr(s);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public String PjT(PAGBiddingRequest pAGBiddingRequest0) {
        int v;
        wN.DWo("getBiddingToken");
        com.bytedance.sdk.openadsdk.core.SM.ReZ.PjT();
        try {
            Yo.cz();
            String s = pAGBiddingRequest0 == null || pAGBiddingRequest0.getAdxId() == null ? "" : pAGBiddingRequest0.getAdxId();
            if(!TextUtils.equals(s, SM.Zh().yIW())) {
                if(this.SM() && !ub.cr().Qf(s)) {
                    Yo.Au();
                    return "";
                }
            }
            else if(!ub.cr().ZsT()) {
                Yo.Au();
                return "";
            }
            if(SM.Zh().xf()) {
                Yo.Au();
                return "";
            }
            JSONObject jSONObject0 = new JSONObject();
            boolean z = false;
            jSONObject0.put("is_init", 0);
            String s1 = ub.cr().SM();
            String s2 = ub.cr().ltE();
            if(s1 != null && s2 != null) {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("version", s1);
                jSONObject1.put("param", s2);
                jSONObject0.put("abtest", jSONObject1);
            }
            jSONObject0.put("language", xf.Zh());
            jSONObject0.put("ad_sdk_version", "7.1.0.4");
            jSONObject0.put("package_name", wN.JQp());
            if(pAGBiddingRequest0 != null) {
                jSONObject0.put("user_data", Owx.PjT((TextUtils.isEmpty(pAGBiddingRequest0.getSlotId()) ? null : new Builder().setCodeId(pAGBiddingRequest0.getSlotId()).build())));
            }
            jSONObject0.put("ts", System.currentTimeMillis() / 1000L);
            jSONObject0.put("adx_id", s);
            if(jSONObject0.toString().getBytes().length <= 2680) {
                cz cz0 = ub.cr();
                if(cz0.Yo("gaid")) {
                    jSONObject0.put("gaid", com.bytedance.sdk.openadsdk.ltE.PjT.Zh.PjT.PjT().Zh());
                }
                if(pAGBiddingRequest0 != null) {
                    jSONObject0.put("banner", this.Zh(pAGBiddingRequest0));
                }
                jSONObject0.put("app_reg", ((int)cz0.oMU()));
                Context context0 = ub.PjT();
                jSONObject0.put("apk-sign", "");
                jSONObject0.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.cr.Zh());
                jSONObject0.put("app_set_id", "");
                jSONObject0.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.cr.cr());
                jSONObject0.put("app_running_time", (System.currentTimeMillis() - fDm.PjT()) / 1000L);
                jSONObject0.put("rewardedfull_link", ((int)xs.Gr().UR()));
                jSONObject0.put("js_render_ver", "");
                jSONObject0.put("js_render_v3_ver", "");
                jSONObject0.put("vendor", Build.MANUFACTURER);
                jSONObject0.put("model", Build.MODEL);
                jSONObject0.put("user_agent_device", "unKnow");
                jSONObject0.put("user_agent_webview", wN.ReZ());
                jSONObject0.put("sys_compiling_time", xf.Zh(context0));
                jSONObject0.put("screen_height", qZS.JQp(context0));
                jSONObject0.put("screen_width", qZS.ReZ(context0));
                jSONObject0.put("rom_version", cRA.PjT());
                jSONObject0.put("carrier_name", iZZ.PjT());
                jSONObject0.put("os_version", Build.VERSION.RELEASE);
                jSONObject0.put("conn_type", wN.xf(context0));
                if(cz0.Yo("boot")) {
                    jSONObject0.put("boot", "1757081380450");
                }
                wN.PjT(jSONObject0);
                com.bytedance.sdk.openadsdk.core.SM.ReZ.PjT(jSONObject0);
                XX.PjT(jSONObject0, context0);
                v = Yo.JQp.size();
            }
            else {
                v = 2;
            }
            while(v > 0 && jSONObject0.toString().getBytes().length > 2680) {
                jSONObject0.remove(((String)Yo.JQp.get(v)));
                --v;
            }
            Zh.PjT().PjT(jSONObject0);
            if(xs.QB() && xs.Gr().PjT(CryptDataScene.BIDDING_TOKEN)) {
                z = true;
            }
            JSONObject jSONObject2 = this.PjT(jSONObject0, z);
            while(v > 0 && jSONObject2.toString().getBytes().length > 0x1000) {
                jSONObject0.remove(((String)Yo.JQp.get(v)));
                jSONObject2 = this.PjT(jSONObject0, z);
                --v;
            }
            Yo.XX();
            return jSONObject2.toString();
        }
        catch(Throwable unused_ex) {
            Yo.Au();
            return "";
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public boolean PjT(String s, int v, String s1, String s2, String s3) {
        if(!this.ReZ.equals("com.dcinside.app.android") || !this.cr.equals(SM.Zh().cr()) || TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            Method method0 = com.bytedance.sdk.component.utils.Yo.PjT("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", new Class[]{String.class, Integer.TYPE, String.class, String.class, String.class});
            if(method0 != null) {
                method0.invoke(null, s, v, s1, s2, s3);
            }
        }
        catch(Throwable unused_ex) {
        }
        return true;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public yIW ReZ(int v) {
        this.cz = v;
        return this;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public yIW ReZ(String s) {
        SM.Zh().Au(s);
        return this;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public String ReZ() {
        return "7.1.0.4";
    }

    // 去混淆评级： 低(20)
    private boolean SM() {
        return "TX".equals(xs.Gr().qZS()) || TextUtils.isEmpty(xs.Gr().qZS());
    }

    public static void XX() {
        try {
            ReZ.Zh(new cr() {
                @Override  // com.bytedance.sdk.openadsdk.ub.cr
                public PjT generatorModel() {
                    PjT pjT0 = new PjT();
                    pjT0.Zh("bidding_token");
                    return pjT0;
                }
            });
        }
        catch(Throwable throwable0) {
            RD.Zh("TTAdManagerImpl", throwable0.getMessage());
        }
    }

    private JSONObject Zh(PAGBiddingRequest pAGBiddingRequest0) {
        try {
            PAGBannerSize pAGBannerSize0 = pAGBiddingRequest0.getBannerSize();
            if(pAGBannerSize0 != null) {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("width", pAGBannerSize0.getWidth());
                if(pAGBannerSize0.getType() == 3) {
                    jSONObject0.put("height", pAGBannerSize0.getMaxHeight());
                }
                else {
                    jSONObject0.put("height", pAGBannerSize0.getHeight());
                }
                jSONObject0.put("type", pAGBannerSize0.getType());
                return jSONObject0;
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public int Zh() {
        return SM.Zh().DWo();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public yIW Zh(int v) {
        SM.Zh().cr(v);
        return this;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public yIW Zh(String s) {
        return this.JQp(s);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public int cr() {
        return this.cz;
    }

    public Yo cr(String s) {
        SM.Zh().PjT(s);
        return this;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.yIW
    public yIW cr(int v) {
        SM.Zh().ReZ(v);
        return this;
    }

    public static void cz() {
        try {
            ReZ.PjT(new cr() {
                @Override  // com.bytedance.sdk.openadsdk.ub.cr
                public PjT generatorModel() {
                    PjT pjT0 = new PjT();
                    pjT0.Zh("bidding_token");
                    return pjT0;
                }
            });
        }
        catch(Throwable throwable0) {
            RD.Zh("TTAdManagerImpl", throwable0.getMessage());
        }
    }
}

