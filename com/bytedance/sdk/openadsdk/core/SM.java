package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.PjT.PjT.PjT.XX.a;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.ReZ.DWo;
import com.bytedance.sdk.openadsdk.core.xf.ReZ.ReZ;
import com.bytedance.sdk.openadsdk.multipro.Zh;
import com.bytedance.sdk.openadsdk.multipro.cr.cr;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.Lrd;
import com.bytedance.sdk.openadsdk.utils.wN;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SM {
    static class PjT {
        private static final SM PjT;

        static {
            PjT.PjT = new SM(null);
        }
    }

    private boolean Au;
    @Nullable
    private String DWo;
    private String JQp;
    private String Owx;
    public static xs PjT = null;
    private ReZ RD;
    private boolean ReZ;
    @Nullable
    private String SM;
    private volatile ConcurrentHashMap Sks;
    private int XX;
    public static final Set Zh = null;
    @NonNull
    private String cr;
    @NonNull
    private String cz;
    private Bitmap fDm;
    private String gK;
    private boolean ltE;
    private int qj;
    private Integer qla;
    private static boolean ub = false;
    private Integer xE;
    private boolean xf;
    private boolean xs;

    static {
        SM.Zh = new HashSet() {
            {
                this.add("8025677");
                this.add("5001121");
            }
        };
    }

    private SM() {
        this.ReZ = false;
        this.qj = 0;
        this.xf = true;
        this.xs = false;
        this.fDm = null;
        this.qla = null;
        this.xE = -1;
        this.Sks = null;
        try {
            a.a(ub.PjT());
        }
        catch(Throwable unused_ex) {
        }
    }

    SM(com.bytedance.sdk.openadsdk.core.SM.1 sM$10) {
    }

    @NonNull
    public String Au() [...] // 潜在的解密器

    public void Au(String s) {
        if(Zh.ReZ()) {
            cr.PjT("sp_global_file", "adx_id", s);
        }
        this.gK = s;
    }

    private static void DWo(String s) {
        if(TextUtils.isEmpty(s)) {
            xs xs0 = SM.PjT;
            if(xs0 != null) {
                xs0.fail(4000, "appid cannot be empty");
            }
        }
        RD.Zh("TTAD.GlobalInfo", "appid cannot be empty");
    }

    public int DWo() {
        Integer integer0 = this.qla;
        return integer0 == null ? cr.PjT("sp_global_privacy", "tt_gdpr", -1) : ((int)integer0);
    }

    public static int JQp() {
        try {
            String s = SM.PjT("domain_index", 0x7FFFFFFFFFFFFFFFL);
            if(!TextUtils.isEmpty(s)) {
                return (int)Integer.valueOf(s);
            }
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
        return 0;
    }

    public com.bytedance.sdk.openadsdk.core.ReZ.cr.PjT JQp(String s) {
        try {
            return this.Sks == null || s == null ? null : ((com.bytedance.sdk.openadsdk.core.ReZ.cr.PjT)this.Sks.get(s));
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public void JQp(int v) {
        this.xE = v;
    }

    public static boolean Lrd() [...] // 潜在的解密器

    public boolean Owx() {
        return "5001121".contains(this.cr);
    }

    private String PjT(Context context0) [...] // 潜在的解密器

    public static String PjT(String s, long v) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            JSONObject jSONObject0 = SM.xf(s);
            if(jSONObject0 == null) {
                return null;
            }
            if(System.currentTimeMillis() - jSONObject0.getLong("time") <= v) {
                return jSONObject0.getString("value");
            }
        }
        catch(JSONException jSONException0) {
            RD.Zh("TTAD.GlobalInfo", jSONException0.getMessage());
        }
        return null;
    }

    public static void PjT(int v) {
        if(v >= 0) {
            SM.PjT("domain_index", String.valueOf(v));
        }
    }

    public static void PjT(xs xs0) {
        SM.PjT = xs0;
    }

    // 检测为 Lambda 实现
    private void PjT(Integer integer0, int v) [...]

    public static void PjT(String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("value", s1);
                jSONObject0.put("time", System.currentTimeMillis());
                cr.PjT("sp_global_file", s, jSONObject0.toString());
            }
            catch(JSONException jSONException0) {
                RD.Zh("TTAD.GlobalInfo", jSONException0.getMessage());
            }
        }
    }

    public void PjT(@NonNull String s) {
        SM.DWo(s);
        this.cr = s;
        if(!TextUtils.isEmpty(s)) {
            SM.PjT("app_id", s);
            com.bytedance.sdk.openadsdk.core.settings.xs.Gr().cr(7);
        }
    }

    public void PjT(String s, com.bytedance.sdk.openadsdk.core.ReZ.cr.PjT cr$PjT0) {
        Class class0;
        try {
            if(!TextUtils.isEmpty(s) && cr$PjT0 != null) {
                if(Zh.ReZ()) {
                    DWo.PjT(6, s, cr$PjT0);
                    return;
                }
                try {
                    if(this.Sks == null) {
                        class0 = SM.class;
                        __monitor_enter(class0);
                        goto label_7;
                    }
                    goto label_14;
                }
                catch(Exception unused_ex) {
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return;
        try {
        label_7:
            if(this.Sks == null) {
                this.Sks = new ConcurrentHashMap();
            }
            __monitor_exit(class0);
            goto label_14;
        }
        catch(Throwable throwable0) {
        }
        try {
            try {
                __monitor_exit(class0);
                throw throwable0;
            label_14:
                if(this.Sks != null) {
                    this.Sks.put(s, cr$PjT0);
                }
            }
            catch(Exception unused_ex) {
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public void PjT(boolean z) {
        this.ltE = z;
    }

    public boolean PjT() {
        return this.ltE;
    }

    public boolean RD() {
        return "com.union_test.internationad".equals(wN.JQp());
    }

    public void ReZ(int v) {
        if(Zh.ReZ()) {
            cr.PjT("sp_global_icon_id", "icon_id", v);
        }
        this.XX = v;
    }

    public void ReZ(@Nullable String s) {
        SM.qj(s);
        if(Jo.cz()) {
            fDm.Zh().post(() -> {
                if(TextUtils.isEmpty(SM.this.DWo)) {
                    goto label_32;
                }
                else {
                    try {
                        HashMap hashMap0 = new HashMap();
                        JSONArray jSONArray0 = new JSONArray(SM.this.DWo);
                        for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                            JSONObject jSONObject0 = jSONArray0.optJSONObject(v1);
                            if(jSONObject0 != null) {
                                String s1 = jSONObject0.optString("name");
                                if(!TextUtils.isEmpty(s1)) {
                                    hashMap0.put(s1, jSONObject0);
                                }
                            }
                        }
                        JSONArray jSONArray1 = new JSONArray(this.PjT);
                        for(int v = 0; v < jSONArray1.length(); ++v) {
                            JSONObject jSONObject1 = jSONArray1.optJSONObject(v);
                            if(jSONObject1 != null) {
                                String s2 = jSONObject1.optString("name");
                                String s3 = jSONObject1.optString("value");
                                if(!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3)) {
                                    hashMap0.put(s2, jSONObject1);
                                }
                            }
                        }
                        Collection collection0 = hashMap0.values();
                        JSONArray jSONArray2 = new JSONArray();
                        for(Object object0: collection0) {
                            jSONArray2.put(((JSONObject)object0));
                        }
                        SM.this.DWo = jSONArray2.toString();
                        goto label_33;
                    label_32:
                        SM.this.DWo = this.PjT;
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            label_33:
                if(Zh.ReZ()) {
                    cr.PjT("sp_global_file", "extra_data", SM.this.DWo);
                }
            });
            return;
        }
        this.SM(s);

        class com.bytedance.sdk.openadsdk.core.SM.3 implements Runnable {
            final SM Zh;

            com.bytedance.sdk.openadsdk.core.SM.3(String s) {
            }

            @Override
            public void run() {
                SM.this.SM(this.PjT);
            }
        }

    }

    public void ReZ(boolean z) {
        this.ReZ = z;
    }

    public boolean ReZ() {
        return cr.PjT("sp_global_file", "sdk_activate_init", true);
    }

    // 检测为 Lambda 实现
    private void SM(String s) [...]

    // 去混淆评级： 低(20)
    public int SM() {
        return Zh.ReZ() ? cr.PjT("sp_global_icon_id", "icon_id", 0) : this.XX;
    }

    public String Sks() [...] // 潜在的解密器

    // 去混淆评级： 中等(70)
    public static boolean XX(String s) {
        return TextUtils.isEmpty(s) ? false : Lrd.PjT && !s.contains("sp_full_screen_video") && !s.contains("sp_reward_video") && !s.contains("tt_openad") && !s.contains("pag_sp_bad_par");
    }

    public String XX() [...] // 潜在的解密器

    @NonNull
    public static SM Zh() {
        return PjT.PjT;
    }

    public static void Zh(int v) {
        if(v >= 0) {
            SM.PjT("config_fail_times", String.valueOf(v));
        }
    }

    public void Zh(String s) {
        this.JQp = s;
        if(!TextUtils.isEmpty(s)) {
            SM.PjT("mediation_info", s);
        }
    }

    public void Zh(boolean z) {
        cr.PjT("sp_global_file", "sdk_activate_init", Boolean.valueOf(z));
    }

    public static void cRA() {
        if(Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            SM.ub = true;
        }
    }

    public static Pair cr(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            JSONObject jSONObject0 = SM.xf(s);
            if(jSONObject0 == null) {
                return null;
            }
            long v = jSONObject0.getLong("time");
            return new Pair(jSONObject0.getString("value"), v);
        }
        catch(JSONException jSONException0) {
            RD.Zh("TTAD.GlobalInfo", jSONException0.getMessage());
            return null;
        }
    }

    @Nullable
    public String cr() {
        if(TextUtils.isEmpty(this.cr)) {
            String s = SM.PjT("app_id", 0x7FFFFFFFFFFFFFFFL);
            if(!TextUtils.isEmpty(s)) {
                this.cr = s;
            }
        }
        return this.cr;
    }

    public void cr(int v) {
        switch(v) {
            case 0: {
                v = 1;
                break;
            }
            case 1: {
                v = 0;
            }
        }
        if(v == 0 || v == 1 || v == -1) {
            Integer integer0 = this.qla;
            if(integer0 != null && ((int)integer0) == v) {
                return;
            }
            this.qla = v;
            if(!Jo.cz()) {
                this.PjT(integer0, v);
                return;
            }
            fDm.Zh().post(() -> {
                if(this.PjT == null) {
                    if(cr.PjT("sp_global_privacy", "tt_gdpr", -1) != this.Zh) {
                        cr.PjT("sp_global_privacy", "tt_gdpr", this.Zh);
                        com.bytedance.sdk.openadsdk.core.settings.xs.Gr().PjT(4, true);
                    }
                    return;
                }
                cr.PjT("sp_global_privacy", "tt_gdpr", this.Zh);
                com.bytedance.sdk.openadsdk.core.settings.xs.Gr().PjT(4, true);
            });
        }

        class com.bytedance.sdk.openadsdk.core.SM.2 implements Runnable {
            final SM ReZ;

            com.bytedance.sdk.openadsdk.core.SM.2(Integer integer0, int v) {
            }

            @Override
            public void run() {
                SM.this.PjT(this.PjT, this.Zh);
            }
        }

    }

    public static int cz() {
        try {
            String s = SM.PjT("config_fail_times", 0x7FFFFFFFFFFFFFFFL);
            if(!TextUtils.isEmpty(s)) {
                return (int)Integer.valueOf(s);
            }
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
        return 0;
    }

    public void cz(int v) {
        if(Zh.ReZ()) {
            cr.PjT("sp_global_file", "title_bar_theme", v);
        }
        this.qj = v;
    }

    public void cz(String s) {
        try {
            if(!TextUtils.isEmpty(s)) {
                if(Zh.ReZ()) {
                    DWo.PjT(6, s);
                    return;
                }
                if(this.Sks != null) {
                    this.Sks.remove(s);
                }
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    // 去混淆评级： 低(20)
    @Nullable
    public String fDm() {
        return Zh.ReZ() ? cr.Zh("sp_global_file", "keywords", null) : this.SM;
    }

    // 去混淆评级： 低(20)
    public Bitmap gK() {
        return Zh.ReZ() ? com.bytedance.sdk.component.utils.cr.PjT(cr.Zh("sp_global_file", "pause_icon", null)) : this.fDm;
    }

    public boolean ltE() {
        return SM.Zh.contains(this.cr);
    }

    private static void qj(String s) {
        if(!TextUtils.isEmpty(s) && s.length() > 1000) {
            xs xs0 = SM.PjT;
            if(xs0 != null) {
                xs0.fail(4000, "Data is very long, the longest is 1000");
            }
            RD.Zh("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
        }
    }

    public int qj() {
        return (int)this.xE;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public String qla() {
        return Zh.ReZ() ? cr.Zh("sp_global_file", "extra_data", null) : this.DWo;
    }

    public void tT() {
        try {
            if(this.Sks != null && this.Sks.size() == 0) {
                this.Sks = null;
            }
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
    }

    public boolean ub() [...] // 潜在的解密器

    public ReZ xE() {
        if(this.RD == null) {
            this.RD = new ReZ(10, 8);
        }
        return this.RD;
    }

    private static JSONObject xf(String s) {
        String s1 = cr.Zh("sp_global_file", s, null);
        if(TextUtils.isEmpty(s1)) {
            return null;
        }
        try {
            return new JSONObject(s1);
        }
        catch(JSONException jSONException0) {
            RD.Zh("TTAD.GlobalInfo", jSONException0.getMessage());
            return null;
        }
    }

    public boolean xf() {
        return ((int)this.xE) < -1 || ((int)this.xE) > 1;
    }

    // 去混淆评级： 低(20)
    public boolean xs() {
        return Zh.ReZ() ? cr.PjT("sp_global_file", "is_paid", false) : this.Au;
    }

    // 去混淆评级： 低(40)
    public String yIW() {
        return Zh.ReZ() ? "" : this.gK;
    }
}

