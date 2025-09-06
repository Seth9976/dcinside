package com.bytedance.sdk.openadsdk.core.DWo.PjT;

import android.text.TextUtils;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

public class Zh {
    public interface PjT {
        void PjT(int arg1, String arg2, String arg3);

        void PjT(JSONObject arg1, String arg2);
    }

    private static volatile Zh PjT;

    // 去混淆评级： 低(20)
    private com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT PjT(String s, String s1) {
        return TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) ? null : ReZ.PjT().PjT(s, s1);
    }

    public static Zh PjT() {
        if(Zh.PjT == null) {
            Class class0 = Zh.class;
            __monitor_enter(class0);
            try {
                if(Zh.PjT == null) {
                    Zh.PjT = new Zh();
                }
                __monitor_exit(class0);
                return Zh.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return Zh.PjT;
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT pjT0) {
        pjT0.PjT(System.currentTimeMillis());
        Jo.PjT(new Au("updateTmplTime") {
            final Zh Zh;

            @Override
            public void run() {
                ReZ.PjT().PjT(pjT0);
            }
        }, 10);
    }

    private void PjT(String s, String s1, String s2, String s3, PjT zh$PjT0) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
            com.bytedance.sdk.component.XX.Zh.Zh zh0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().ReZ();
            zh0.Zh(s);
            zh0.PjT(7);
            zh0.PjT("load_ug_t");
            zh0.PjT(new com.bytedance.sdk.component.XX.PjT.PjT() {
                final Zh cz;

                @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
                    if(zh0 == null) {
                        return;
                    }
                    if(zh0.cz()) {
                        String s = zh0.cr();
                        if(TextUtils.isEmpty(s)) {
                            PjT zh$PjT0 = zh$PjT0;
                            if(zh$PjT0 != null) {
                                zh$PjT0.PjT(3, "net data is null", "net");
                            }
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT pjT0 = new com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT().PjT(s1).Zh(s2).ReZ(s).JQp(s3).cr(s).PjT(System.currentTimeMillis());
                        ReZ.PjT().PjT(pjT0);
                        Zh.this.Zh();
                        if(zh$PjT0 != null) {
                            try {
                                JSONObject jSONObject0 = new JSONObject(s);
                                zh$PjT0.PjT(jSONObject0, "net");
                                return;
                            }
                            catch(JSONException unused_ex) {
                                zh$PjT0.PjT(2, "parse json exception data is" + s, "net");
                            }
                        }
                        return;
                    }
                    PjT zh$PjT1 = zh$PjT0;
                    if(zh$PjT1 != null) {
                        zh$PjT1.PjT(3, "net code error code is " + zh0.PjT() + " message is " + zh0.Zh(), "net");
                    }
                }

                @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
                    PjT zh$PjT0 = zh$PjT0;
                    if(zh$PjT0 != null) {
                        zh$PjT0.PjT(3, "net error " + iOException0.getMessage(), "net");
                    }
                }
            });
            return;
        }
        if(zh$PjT0 != null) {
            zh$PjT0.PjT(1, "template url or id  or md5 is empty", "net");
        }
    }

    private void PjT(String s, String s1, String s2, String s3, String s4) {
        if(this.PjT(s, s2) != null) {
            if(!TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s2)) {
                this.Zh(s1, s2, s4, s3, s);
            }
            return;
        }
        if(TextUtils.isEmpty(s3)) {
            this.PjT(s1, s, s2, s4, null);
            return;
        }
        this.Zh(s1, s2, s4, s3, s);
    }

    public String PjT(String s, String s1, String s2) {
        com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT pjT0 = this.PjT(s + "_" + s1, s2);
        if(pjT0 == null) {
            return null;
        }
        this.PjT(pjT0);
        return pjT0.JQp();
    }

    // 去混淆评级： 低(20)
    public Set PjT(String s) {
        return TextUtils.isEmpty(s) ? null : ReZ.PjT().PjT(s);
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.DWo.XX.PjT pjT0, String s) {
        if(pjT0 == null) {
            return;
        }
        if(TextUtils.isEmpty(pjT0.PjT())) {
            return;
        }
        String s1 = s + "_" + pjT0.PjT();
        String s2 = pjT0.ReZ();
        String s3 = pjT0.Zh();
        String s4 = pjT0.cr();
        String s5 = pjT0.JQp();
        if(TextUtils.isEmpty(s5)) {
            if(s.equals("ad")) {
                s5 = SM.Zh().cr();
            }
            else if(s.equals("adv3")) {
                s5 = SM.Zh().cr() + "_v3";
            }
        }
        Jo.PjT(new Au("saveUGenTemplate") {
            final Zh cz;

            @Override
            public void run() {
                Zh.this.PjT(s1, s2, s3, s4, s5);
            }
        }, 10);
    }

    public void PjT(String s, String s1, String s2, String s3, String s4, PjT zh$PjT0) {
        if(!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3)) {
            String s5 = s + "_" + s2;
            com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT pjT0 = this.PjT(s5, s3);
            if(pjT0 != null && !TextUtils.isEmpty(pjT0.JQp())) {
                this.PjT(pjT0);
                if(zh$PjT0 != null) {
                    try {
                        zh$PjT0.PjT(new JSONObject(pjT0.JQp()), "local");
                        return;
                    }
                    catch(JSONException unused_ex) {
                        zh$PjT0.PjT(2, "parse json exception data is " + pjT0.JQp(), "local");
                    }
                }
                return;
            }
            this.PjT(s1, s5, s3, s4, new PjT() {
                final Zh Zh;

                @Override  // com.bytedance.sdk.openadsdk.core.DWo.PjT.Zh$PjT
                public void PjT(int v, String s, String s1) {
                    PjT zh$PjT0 = zh$PjT0;
                    if(zh$PjT0 != null) {
                        zh$PjT0.PjT(v, s, s1);
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.core.DWo.PjT.Zh$PjT
                public void PjT(JSONObject jSONObject0, String s) {
                    PjT zh$PjT0 = zh$PjT0;
                    if(zh$PjT0 != null) {
                        zh$PjT0.PjT(jSONObject0, s);
                    }
                }
            });
            return;
        }
        if(zh$PjT0 != null) {
            zh$PjT0.PjT(1, "id  or md5 is empty", "net");
        }
    }

    public void PjT(Set set0) {
        try {
            ReZ.PjT().PjT(set0);
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
    }

    private void Zh() {
        int v = ub.cr().cr();
        if(v <= 0) {
            v = 100;
        }
        List list0 = ReZ.PjT().Zh();
        if(list0 != null && !list0.isEmpty() && v < list0.size()) {
            int v1 = (int)(((float)list0.size()) - ((float)v) * 0.75f);
            if(v1 <= 0) {
                return;
            }
            TreeMap treeMap0 = new TreeMap();
            for(Object object0: list0) {
                treeMap0.put(((com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT)object0).cr(), ((com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT)object0));
            }
            HashSet hashSet0 = new HashSet();
            int v2 = 0;
            for(Object object1: treeMap0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(map$Entry0 != null && v2 < v1) {
                    ++v2;
                    com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT pjT0 = (com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT)map$Entry0.getValue();
                    if(pjT0 != null) {
                        hashSet0.add(pjT0.PjT());
                    }
                }
            }
            this.PjT(hashSet0);
            return;
        }
        if(list0 != null) {
            list0.size();
        }
    }

    private void Zh(String s, String s1, String s2, String s3, String s4) {
        com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT pjT0 = new com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT();
        pjT0.ReZ(s).JQp(s2).cr(s3).Zh(s1).PjT(s4).PjT(System.currentTimeMillis());
        ReZ.PjT().PjT(pjT0);
        this.Zh();
    }
}

