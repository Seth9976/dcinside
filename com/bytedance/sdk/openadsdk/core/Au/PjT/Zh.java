package com.bytedance.sdk.openadsdk.core.Au.PjT;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.DWo.cz.ReZ;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.model.Owx.PjT;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.RD;
import com.bytedance.sdk.openadsdk.core.model.Yo;
import com.bytedance.sdk.openadsdk.core.model.ub;
import com.bytedance.sdk.openadsdk.core.model.xE;
import com.bytedance.sdk.openadsdk.core.xf;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import v.c;

public class Zh {
    public static String PjT = "https://pag_open_icon_id/appicon.png";
    private static String Zh = "";

    static {
    }

    // 去混淆评级： 低(20)
    public static String PjT() [...] // 潜在的解密器

    private static String PjT(PjT owx$PjT0) {
        return owx$PjT0 == null ? "" : owx$PjT0.DWo();
    }

    public static String PjT(Owx owx0, String s) {
        if(owx0 == null) {
            return null;
        }
        List list0 = owx0.CY();
        if(list0 != null && list0.size() > 0) {
            for(Object object0: list0) {
                xE xE0 = (xE)object0;
                if(xE0 != null && TextUtils.equals(s, xE0.PjT())) {
                    return xE0.XX();
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public static Map PjT(Owx owx0) {
        Map map0 = null;
        if(owx0 == null) {
            return null;
        }
        List list0 = owx0.CY();
        if(list0 != null && list0.size() > 0) {
            map0 = new HashMap();
            for(Object object0: list0) {
                xE xE0 = (xE)object0;
                if(xE0 != null) {
                    map0.put(xE0.PjT(), xE0.XX());
                }
            }
            xE xE1 = owx0.Xe();
            if(xE1 != null) {
                map0.put(xE1.PjT(), xE1.XX());
            }
        }
        return map0;
    }

    public static JSONObject PjT(float f, float f1, boolean z, @NonNull Owx owx0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("platform", "android");
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("width", ((double)f));
            jSONObject1.put("height", ((double)f1));
            if(z) {
                jSONObject1.put("isLandscape", true);
            }
            jSONObject0.put("AdSize", jSONObject1);
            if(owx0 instanceof RD && ((RD)owx0).ELH()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject0.put("choose_ui_data", jSONObject2);
                com.bytedance.sdk.openadsdk.core.model.PjT.PjT pjT$PjT0 = ((RD)owx0).ZBe();
                JSONObject jSONObject3 = pjT$PjT0.Zh();
                if(TextUtils.isEmpty(pjT$PjT0.SM())) {
                    jSONObject3.put("data", Zh.Zh(pjT$PjT0));
                }
                jSONObject2.put("tpl_info", jSONObject3);
                JSONArray jSONArray0 = new JSONArray();
                jSONObject0.put("creatives", jSONArray0);
                for(Object object0: ((RD)owx0).pSa()) {
                    Owx owx1 = (Owx)object0;
                    JSONObject jSONObject4 = Zh.PjT(false, owx1);
                    if(jSONObject4 != null) {
                        jSONObject4.put("template_Plugin", Zh.Zh(owx1.VY()));
                        jSONObject4.put("diff_template_Plugin", Zh.PjT(owx1.VY()));
                        jSONArray0.put(jSONObject4);
                    }
                }
                return jSONObject0;
            }
            jSONObject0.put("creative", Zh.PjT(false, owx0));
            jSONObject0.put("template_Plugin", Zh.Zh(owx0.VY()));
            jSONObject0.put("diff_template_Plugin", Zh.PjT(owx0.VY()));
            return jSONObject0;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public static JSONObject PjT(float f, float f1, boolean z, @NonNull Owx owx0, String s, ReZ reZ0) {
        Zh.Zh = "";
        JSONObject jSONObject0 = null;
        if(owx0 == null) {
            return null;
        }
        try {
            jSONObject0 = owx0.dDm();
            Zh.PjT(jSONObject0, owx0, s);
            JSONObject jSONObject1 = KM.Zh(owx0);
            jSONObject1.put("language", xf.Zh());
            jSONObject0.put("xSetting", jSONObject1);
            jSONObject0.put("xAdInfo", Zh.PjT(s, Zh.Zh(owx0), owx0));
            JSONObject jSONObject2 = new JSONObject();
            KM.Zh(jSONObject2);
            jSONObject2.put("platform", "android");
            jSONObject0.put("xAppInfo", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", ((double)f));
            jSONObject3.put("height", ((double)f1));
            if(z) {
                jSONObject3.put("isLandscape", true);
            }
            jSONObject0.put("xSize", jSONObject3);
            if(reZ0 != null) {
                reZ0.PjT("adv3");
            }
            Yo yo0 = owx0.xH();
            if(yo0 != null) {
                String s1 = yo0.cr();
                if(TextUtils.isEmpty(s1)) {
                    String s2 = com.bytedance.sdk.openadsdk.core.DWo.PjT.Zh.PjT().PjT("adv3", yo0.PjT(), yo0.Zh());
                    if(TextUtils.isEmpty(s2)) {
                        String s3 = "local db data is null id is " + yo0.PjT() + " md5 is " + yo0.Zh();
                        Zh.Zh = s3;
                        if(reZ0 != null) {
                            reZ0.PjT(3, s3, "net");
                            return jSONObject0;
                        }
                    }
                    else {
                        jSONObject0.put("xTemplate", new JSONObject(s2));
                        Zh.Zh = "getTemplate success by db data";
                        if(reZ0 != null) {
                            reZ0.Zh("local");
                            return jSONObject0;
                        }
                    }
                }
                else {
                    jSONObject0.put("xTemplate", new JSONObject(s1));
                    Zh.Zh = "getTemplate success by local data";
                    if(reZ0 != null) {
                        reZ0.Zh("local");
                        return jSONObject0;
                    }
                }
            }
        }
        catch(Exception exception0) {
            String s4 = "load template exception " + exception0.getMessage();
            Zh.Zh = s4;
            if(reZ0 != null) {
                reZ0.PjT(3, s4, "net");
            }
        }
        return jSONObject0;
    }

    private static JSONObject PjT(String s, JSONObject jSONObject0, Owx owx0) {
        if(owx0 == null) {
            return jSONObject0;
        }
        try {
            if("open_ad".equals(s)) {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("app_name", "");
                int v = SM.Zh().SM();
                if(v != 0) {
                    int v1 = owx0.ZX();
                    if(9 == v1) {
                        jSONObject1.put("app_icon", "https://pag_open_icon_id/appicon.png");
                    }
                    else if(10 == v1) {
                        jSONObject1.put("app_icon", "@" + v);
                    }
                }
                jSONObject0.put("open_app_info", jSONObject1);
            }
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    public static JSONObject PjT(JSONObject jSONObject0, JSONObject jSONObject1) {
        if(jSONObject1 == null) {
            return jSONObject0;
        }
        JSONObject jSONObject2 = new JSONObject();
        if(jSONObject0 == null) {
            return jSONObject2;
        }
        try {
            JSONArray jSONArray0 = jSONObject1.optJSONArray("keys");
            if(jSONArray0 != null && jSONArray0.length() > 0) {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    String s = jSONArray0.optString(v);
                    if(jSONObject0.has(s)) {
                        jSONObject2.put(s, jSONObject0.opt(s));
                    }
                }
                jSONObject2.put("xSetting", jSONObject0.opt("xSetting"));
                jSONObject2.put("xAdInfo", jSONObject0.opt("xAdInfo"));
                jSONObject2.put("xAppInfo", jSONObject0.opt("xAppInfo"));
                jSONObject2.put("xSize", jSONObject0.opt("xSize"));
                jSONObject2.put("xTemplate", jSONObject0.opt("xTemplate"));
                return jSONObject2;
            }
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    public static JSONObject PjT(boolean z, @NonNull Owx owx0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("button_text", owx0.Nv());
            if(owx0.Xe() != null) {
                if(owx0.Xe() == null || TextUtils.isEmpty(owx0.Xe().PjT())) {
                    jSONObject0.put("icon", "");
                }
                else {
                    jSONObject0.put("icon", owx0.Xe().PjT());
                }
            }
            JSONArray jSONArray0 = new JSONArray();
            if(owx0.CY() != null) {
                for(int v = 0; v < owx0.CY().size(); ++v) {
                    xE xE0 = (xE)owx0.CY().get(v);
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("height", xE0.ReZ());
                    jSONObject1.put("width", xE0.Zh());
                    jSONObject1.put("url", xE0.PjT());
                    jSONArray0.put(jSONObject1);
                }
            }
            jSONObject0.put("image", jSONArray0);
            jSONObject0.put("image_mode", owx0.fK());
            jSONObject0.put("interaction_type", owx0.cI());
            jSONObject0.put("interaction_method", owx0.Sks());
            jSONObject0.put("is_compliance_template", true);
            jSONObject0.put("title", owx0.Xtz());
            jSONObject0.put("description", owx0.ix());
            jSONObject0.put("source", owx0.Ld());
            JSONObject jSONObject2 = new JSONObject();
            ub ub0 = owx0.fDm();
            if(ub0 == null) {
                ub0 = new ub();
            }
            jSONObject2.put("ceiling_time", ub0.cr());
            jSONObject2.put("ceiling_ratio", ub0.JQp());
            jSONObject2.put("expand_ratio", ub0.cz());
            jSONObject0.put("interaction_params", jSONObject2);
            if(owx0.uQg() != null) {
                jSONObject0.put("comment_num", owx0.uQg().JQp());
                jSONObject0.put("score", owx0.uQg().cr());
                jSONObject0.put("app_size", owx0.uQg().cz());
                jSONObject0.put("app", owx0.uQg().Au());
            }
            c c0 = owx0.MWx();
            if(c0 != null) {
                JSONObject jSONObject3 = c0.G();
                jSONObject3.put("video_duration", c0.C() * ((double)c0.t()));
                jSONObject0.put("video", jSONObject3);
            }
            if(owx0.VY() != null) {
                jSONObject0.put("dynamic_creative", owx0.VY().qj());
            }
            return jSONObject0;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    private static void PjT(JSONObject jSONObject0, Owx owx0, String s) {
        if(owx0 != null && jSONObject0 != null) {
            try {
                if(jSONObject0.has("h265_video")) {
                    jSONObject0.remove("h265_video");
                }
                if(jSONObject0.has("video")) {
                    c c0 = owx0.MWx();
                    if(c0 != null) {
                        JSONObject jSONObject1 = c0.G();
                        if(jSONObject1 != null) {
                            if("open_ad".equals(s)) {
                                jSONObject1.put("video_duration", com.bytedance.sdk.openadsdk.core.ub.cr().tT(String.valueOf(owx0.joj())));
                            }
                            else {
                                jSONObject1.put("video_duration", c0.C() * ((double)c0.t()));
                            }
                        }
                        jSONObject0.put("video", jSONObject1);
                    }
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    private static String Zh(PjT owx$PjT0) {
        if(owx$PjT0 != null) {
            String s = owx$PjT0.SM();
            if(TextUtils.isEmpty(s)) {
                com.bytedance.sdk.component.adexpress.PjT.ReZ.Zh zh0 = com.bytedance.sdk.component.adexpress.PjT.Zh.Zh.ReZ(owx$PjT0.cz());
                return zh0 == null ? s : zh0.JQp();
            }
            return s;
        }
        return "";
    }

    private static JSONObject Zh(Owx owx0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            KM.PjT(jSONObject0, owx0);
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    public static boolean Zh() [...] // Inlined contents
}

