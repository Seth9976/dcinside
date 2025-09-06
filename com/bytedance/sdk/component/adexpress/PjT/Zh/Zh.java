package com.bytedance.sdk.component.adexpress.PjT.Zh;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT;
import com.bytedance.sdk.component.adexpress.cr.cr;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class Zh {
    static Object PjT;

    static {
        Zh.PjT = new Object();
    }

    public static boolean JQp() {
        return JQp.Zh().JQp();
    }

    private static boolean JQp(String s) {
        if(Zh.JQp()) {
            PjT pjT0 = Zh.cr();
            if(pjT0 != null) {
                List list0 = pjT0.cz();
                if(list0 != null) {
                    for(Object object0: list0) {
                        if(((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0) != null && TextUtils.equals(s, ((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0).PjT())) {
                            return true;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static com.bytedance.sdk.component.adexpress.PjT.ReZ.Zh PjT(String s) {
        return XX.PjT().PjT(s);
    }

    public static com.bytedance.sdk.component.adexpress.PjT.Zh.PjT PjT(String s, com.bytedance.sdk.component.adexpress.cr.SM.PjT sM$PjT0, String s1, String s2) {
        File file0;
        com.bytedance.sdk.component.adexpress.PjT.Zh.PjT pjT0 = new com.bytedance.sdk.component.adexpress.PjT.Zh.PjT();
        if(TextUtils.isEmpty(s2)) {
            file0 = null;
        }
        else {
            file0 = Zh.Zh(s2, s);
            if(file0 != null) {
                pjT0.PjT(1);
            }
        }
        if(file0 == null) {
            file0 = Zh.XX(s);
            if(file0 != null) {
                pjT0.PjT(3);
            }
        }
        if(file0 == null) {
            file0 = Zh.cz(s);
            if(file0 != null) {
                pjT0.PjT(2);
            }
        }
        if(TextUtils.isEmpty(s2)) {
            if(!Zh.JQp(s)) {
                pjT0.PjT(6);
            }
        }
        else if(!Zh.PjT(s, s2)) {
            pjT0.PjT(4);
        }
        if(file0 != null) {
            try {
                pjT0.PjT(new WebResourceResponse(sM$PjT0.PjT(), "utf-8", new FileInputStream(file0)));
            }
            catch(Throwable unused_ex) {
            }
        }
        return pjT0;
    }

    public static void PjT() {
        JQp.Zh();
    }

    private static void PjT(com.bytedance.sdk.component.adexpress.PjT.ReZ.Zh zh0) {
        cr.PjT(new Au("updateTmplTime") {
            @Override
            public void run() {
                synchronized(Zh.PjT) {
                    cz.PjT().PjT(zh0, true);
                }
            }
        }, 10);
    }

    public static void PjT(com.bytedance.sdk.component.adexpress.PjT.ReZ.cr cr0) {
        XX.PjT().PjT(cr0, cr0.cz);
    }

    private static boolean PjT(String s, String s1) {
        if(Zh.JQp()) {
            PjT pjT0 = Zh.cr();
            if(pjT0 != null) {
                Map map0 = pjT0.PjT();
                if(map0.size() != 0) {
                    PjT pjT1 = (PjT)map0.get(s1);
                    if(pjT1 != null) {
                        for(Object object0: pjT1.cz()) {
                            if(((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0) != null && TextUtils.equals(s, ((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0).PjT())) {
                                return true;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return false;
        }
        Object object0 = jSONObject0.opt("template_Plugin");
        return object0 != null && !TextUtils.isEmpty(object0.toString());
    }

    public static com.bytedance.sdk.component.adexpress.PjT.ReZ.Zh ReZ(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.PjT.ReZ.Zh zh0 = XX.PjT().PjT(s);
        if(zh0 != null) {
            zh0.PjT(System.currentTimeMillis());
            Zh.PjT(zh0);
        }
        return zh0;
    }

    public static String ReZ() [...] // 潜在的解密器

    public static boolean ReZ(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return false;
        }
        try {
            JSONArray jSONArray0 = jSONObject0.optJSONArray("creatives");
            if(jSONArray0 != null && jSONArray0.length() > 0) {
                for(int v = 0; true; ++v) {
                    if(v >= jSONArray0.length()) {
                        return true;
                    }
                    JSONObject jSONObject1 = jSONArray0.optJSONObject(v);
                    if(jSONObject1 == null) {
                        return false;
                    }
                    Object object0 = jSONObject1.opt("template_Plugin");
                    if(object0 == null || TextUtils.isEmpty(object0.toString())) {
                        return false;
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    private static File XX(String s) {
        com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.Zh pjT$Zh0 = Zh.cr().JQp();
        if(pjT$Zh0 == null) {
            return null;
        }
        List list0 = pjT$Zh0.Zh();
        if(list0 != null && list0.size() > 0) {
            for(Object object0: list0) {
                Pair pair0 = (Pair)object0;
                if(pair0.second != null && ((String)pair0.second).equals(s)) {
                    return new File(JQp.Au(), ((String)pair0.first));
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    private static File Zh(String s, String s1) {
        PjT pjT0 = Zh.cr();
        if(pjT0 != null && Zh.JQp()) {
            Map map0 = pjT0.PjT();
            if(map0.size() == 0) {
                return null;
            }
            PjT pjT1 = (PjT)map0.get(s);
            if(pjT1 != null) {
                for(Object object0: pjT1.cz()) {
                    com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT pjT$PjT0 = (com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0;
                    if(pjT$PjT0.PjT() != null && pjT$PjT0.PjT().equals(s1)) {
                        String s2 = com.bytedance.sdk.component.utils.JQp.PjT(pjT$PjT0.PjT());
                        File file0 = new File(JQp.Au(), s2);
                        return pjT$PjT0.Zh() == null || !pjT$PjT0.Zh().equals(com.bytedance.sdk.component.utils.JQp.PjT(file0)) ? null : file0;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    public static Set Zh(String s) {
        return XX.PjT().Zh(s);
    }

    public static void Zh() {
        try {
            com.bytedance.sdk.component.adexpress.PjT.Zh.Au.cr();
            File file0 = JQp.Au();
            if(file0 != null && file0.exists()) {
                if(file0.getParentFile() != null) {
                    com.bytedance.sdk.component.utils.XX.ReZ(file0.getParentFile());
                    return;
                }
                com.bytedance.sdk.component.utils.XX.ReZ(file0);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public static boolean Zh(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return false;
        }
        Object object0 = jSONObject0.opt("xTemplate");
        return object0 != null && !TextUtils.isEmpty(object0.toString());
    }

    public static PjT cr() {
        return JQp.Zh().cz();
    }

    public static String cr(String s) {
        PjT pjT0 = Zh.cr();
        if(pjT0 == null) {
            return null;
        }
        if(!TextUtils.isEmpty(s)) {
            Map map0 = pjT0.PjT();
            if(map0 != null && map0.size() > 0) {
                PjT pjT1 = (PjT)map0.get(s);
                return pjT1 == null ? null : pjT1.cr();
            }
            return null;
        }
        return Zh.cz();
    }

    private static File cz(String s) {
        if(Zh.JQp()) {
            for(Object object0: Zh.cr().cz()) {
                com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT pjT$PjT0 = (com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0;
                if(pjT$PjT0.PjT() != null && pjT$PjT0.PjT().equals(s)) {
                    String s1 = com.bytedance.sdk.component.utils.JQp.PjT(pjT$PjT0.PjT());
                    File file0 = new File(JQp.Au(), s1);
                    return pjT$PjT0.Zh() == null || !pjT$PjT0.Zh().equals(com.bytedance.sdk.component.utils.JQp.PjT(file0)) ? null : file0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    @Deprecated
    private static String cz() {
        PjT pjT0 = Zh.cr();
        return pjT0 == null ? null : pjT0.cr();
    }
}

