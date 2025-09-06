package com.bytedance.sdk.component.adexpress.PjT.Zh;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.PjT.PjT.PjT;
import com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ;
import com.bytedance.sdk.component.adexpress.PjT.ReZ.Zh;
import com.bytedance.sdk.component.adexpress.PjT.ReZ.cr;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class XX {
    private static volatile XX PjT;
    private AtomicBoolean Zh;

    private XX() {
        this.Zh = new AtomicBoolean(false);
    }

    public static XX PjT() {
        if(XX.PjT == null) {
            Class class0 = XX.class;
            __monitor_enter(class0);
            try {
                if(XX.PjT == null) {
                    XX.PjT = new XX();
                }
                __monitor_exit(class0);
                return XX.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return XX.PjT;
    }

    private void PjT(String s, String s1, String s2) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        JSONObject jSONObject0 = this.ReZ(s);
        if(jSONObject0 != null) {
            String s3 = jSONObject0.optString("md5");
            String s4 = jSONObject0.optString("version");
            String s5 = jSONObject0.optString("data");
            if(!TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s4) && !TextUtils.isEmpty(s5)) {
                Zh zh0 = new Zh().PjT(s1).Zh(s2).ReZ(s3).cr(s).JQp(s5).cz(s4).PjT(System.currentTimeMillis());
                cz.PjT().PjT(zh0, false);
                this.Zh();
                if(Au.PjT(s4)) {
                    zh0.cz(s4);
                    JQp.Zh().PjT(true);
                }
            }
        }
    }

    private void PjT(String s, String s1, String s2, String s3, String s4, String s5) {
        synchronized(this) {
            if(this.PjT(s) != null) {
                if(!TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s2)) {
                    this.Zh(s5, s, s2, s1, s3, s4);
                    goto label_17;
                }
                return;
            }
            else if(TextUtils.isEmpty(s3)) {
                this.PjT(s1, s5, s);
            }
            else if(TextUtils.isEmpty(s2)) {
                this.PjT(s1, s5, s);
            }
            else {
                this.Zh(s5, s, s2, s1, s3, s4);
            }
        label_17:
            boolean z = Au.PjT(s4);
            if(!com.bytedance.sdk.component.adexpress.PjT.Zh.Zh.JQp() || z) {
                JQp.Zh().PjT(true);
            }
        }
    }

    // 去混淆评级： 低(20)
    public Zh PjT(String s) {
        return TextUtils.isEmpty(s) ? null : cz.PjT().PjT(s);
    }

    public void PjT(cr cr0, String s) {
        if(cr0 == null) {
            return;
        }
        String s1 = cr0.PjT;
        String s2 = cr0.ReZ;
        String s3 = cr0.Zh;
        String s4 = cr0.cr;
        String s5 = cr0.JQp;
        String s6 = PjT.PjT().ReZ() == null ? "" : PjT.PjT().ReZ().Au();
        String s7 = TextUtils.isEmpty(s) ? s6 : s;
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.cr.cr.PjT(new com.bytedance.sdk.component.Au.Au("saveTemplate") {
            final XX XX;

            @Override
            public void run() {
                XX.this.PjT(s1, s2, s3, s4, s5, s7);
            }
        }, 10);
    }

    public void PjT(Set set0) {
        try {
            cz.PjT().PjT(set0);
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
    }

    private JSONObject ReZ(String s) {
        ReZ reZ0 = PjT.PjT().ReZ();
        if(reZ0 == null) {
            return null;
        }
        com.bytedance.sdk.component.XX.Zh.Zh zh0 = reZ0.XX();
        zh0.Zh(s);
        com.bytedance.sdk.component.XX.Zh zh1 = zh0.PjT();
        if(zh1 != null) {
            try {
                return !zh1.cz() || zh1.cr() == null ? null : new JSONObject(zh1.cr());
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    private void Zh() {
        if(PjT.PjT().ReZ() == null) {
            return;
        }
        int v = PjT.PjT().ReZ().PjT();
        if(v <= 0) {
            v = 100;
        }
        List list0 = cz.PjT().Zh();
        if(list0 != null && !list0.isEmpty() && v < list0.size()) {
            TreeMap treeMap0 = new TreeMap();
            for(Object object0: list0) {
                treeMap0.put(((Zh)object0).XX(), ((Zh)object0));
            }
            HashSet hashSet0 = new HashSet();
            int v1 = (int)(((float)list0.size()) - ((float)v) * 0.75f);
            int v2 = 0;
            for(Object object1: treeMap0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(map$Entry0 != null && v2 < v1) {
                    ++v2;
                    ((Long)map$Entry0.getKey()).longValue();
                    Zh zh0 = (Zh)map$Entry0.getValue();
                    if(zh0 != null) {
                        hashSet0.add(zh0.Zh());
                    }
                }
            }
            this.PjT(hashSet0);
            this.Zh.set(false);
            return;
        }
        if(list0 != null) {
            list0.size();
        }
    }

    private void Zh(String s, String s1, String s2, String s3, String s4, String s5) {
        Zh zh0 = new Zh().PjT(s).Zh(s1).ReZ(s2).cr(s3).JQp(s4).cz(s5).PjT(System.currentTimeMillis());
        cz.PjT().PjT(zh0, false);
        this.Zh();
    }

    // 去混淆评级： 低(20)
    public Set Zh(String s) {
        return TextUtils.isEmpty(s) ? null : cz.PjT().Zh(s);
    }
}

