package com.bytedance.sdk.component.cz.PjT.cz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.sdk.component.cz.PjT.Au;
import com.bytedance.sdk.component.cz.PjT.JQp.JQp;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

public class ReZ implements Zh {
    @SuppressLint({"StaticFieldLeak"})
    class PjT extends JQp {
        final ReZ PjT;
        private final String ReZ;
        private final cr Zh;
        private final Map cr;

        private PjT(cr cr0, String s, Map map0) {
            super("AdsStats");
            this.Zh = cr0;
            this.ReZ = s;
            this.cr = map0;
        }

        PjT(cr cr0, String s, Map map0, com.bytedance.sdk.component.cz.PjT.cz.ReZ.1 reZ$10) {
            this(cr0, s, map0);
        }

        // 去混淆评级： 低(30)
        boolean PjT(String s) {
            return !TextUtils.isEmpty(s) && (s.startsWith("http://") || s.startsWith("https://"));
        }

        // 去混淆评级： 低(20)
        private String ReZ(String s) {
            if(!TextUtils.isEmpty(s)) {
                if(s.contains("{TS}") || s.contains("__TS__")) {
                    s = s.replace("{TS}", "1757088991183").replace("__TS__", "1757088991184");
                }
                return !s.contains("{UID}") && !s.contains("__UID__") || TextUtils.isEmpty(this.ReZ) ? s : s.replace("{UID}", this.ReZ).replace("__UID__", this.ReZ);
            }
            return s;
        }

        String Zh(String s) {
            if(!TextUtils.isEmpty(s)) {
                try {
                    s = s.replace("[ss_random]", "2856938422177060751");
                    return s.replace("[ss_timestamp]", "1757088992614");
                }
                catch(Exception unused_ex) {
                }
            }
            return s;
        }

        @Override
        public void run() {
            com.bytedance.sdk.component.cz.PjT.JQp.cr cr0;
            com.bytedance.sdk.component.cz.PjT.JQp jQp0 = Au.XX().xE();
            if(jQp0 == null || Au.XX().cz() == null || !jQp0.ReZ()) {
                return;
            }
            if(!this.PjT(this.Zh.Zh())) {
                return;
            }
            if(this.Zh.cr() >= jQp0.ReZ(this.Zh.cz())) {
                ReZ.this.Zh.ReZ(this.Zh);
                return;
            }
            try {
                jQp0.xs();
                if(this.Zh.qj()) {
                    ReZ.this.Zh.PjT(this.Zh);
                }
                if(!jQp0.PjT(ReZ.this.PjT())) {
                    return;
                }
                long v = System.currentTimeMillis();
                String s = this.Zh.Zh();
                if(jQp0.cz() == 0) {
                    s = this.ReZ(this.Zh.Zh());
                    if(this.Zh.ReZ()) {
                        s = this.Zh(s);
                    }
                }
                com.bytedance.sdk.component.cz.PjT.JQp.ReZ reZ0 = jQp0.DWo();
                if(reZ0 == null) {
                    return;
                }
                reZ0.PjT("User-Agent", jQp0.SM());
                reZ0.PjT("csj_client_source_from", "1");
                if(this.cr != null) {
                    JSONObject jSONObject0 = new JSONObject();
                    for(Object object0: this.cr.entrySet()) {
                        jSONObject0.put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
                    }
                    reZ0.PjT("csj_extra_info", jSONObject0.toString());
                }
                reZ0.PjT(s);
                try {
                    cr0 = null;
                    cr0 = reZ0.PjT();
                    jQp0.PjT(cr0.PjT());
                }
                catch(Throwable unused_ex) {
                }
                this.Zh.PjT(this.Zh.cr() + 1);
                if(cr0 != null && cr0.PjT()) {
                    ReZ.this.Zh.ReZ(this.Zh);
                    jQp0.PjT(true, 200, System.currentTimeMillis() - v, this.Zh);
                    return;
                }
                if(cr0 != null) {
                    int v1 = cr0.Zh();
                    this.Zh.Zh(v1);
                    String s1 = cr0.ReZ();
                    this.Zh.ReZ(s1);
                }
                if(cr0 != null && cr0.Zh() == 0x2290) {
                    cr0.ReZ();
                    ReZ.this.Zh.ReZ(this.Zh);
                }
                else if(this.Zh.cr() >= jQp0.ReZ(this.Zh.cz())) {
                    ReZ.this.Zh.ReZ(this.Zh);
                }
                else {
                    ReZ.this.Zh.Zh(this.Zh);
                }
                jQp0.PjT(false, this.Zh.Au(), System.currentTimeMillis() - v, this.Zh);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private final Context PjT;
    private final com.bytedance.sdk.component.cz.PjT.cz.JQp Zh;

    public ReZ(Context context0, com.bytedance.sdk.component.cz.PjT.cz.JQp jQp0) {
        this.PjT = context0;
        this.Zh = jQp0;
    }

    private void PjT(List list0, String s, boolean z) {
        if(list0 != null && list0.size() != 0) {
            com.bytedance.sdk.component.cz.PjT.JQp jQp0 = Au.XX().xE();
            for(Object object0: list0) {
                cr cr0 = (cr)object0;
                if(jQp0 != null && jQp0.cr() != null) {
                    cr0.PjT(z);
                    PjT reZ$PjT0 = new PjT(this, cr0, s, null, null);
                    jQp0.cr().execute(reZ$PjT0);
                }
            }
        }
    }

    public Context PjT() {
        return this.PjT == null ? Au.XX().cz() : this.PjT;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cz.Zh
    public Runnable PjT(cr cr0, String s, Map map0) {
        return cr0 != null && !TextUtils.isEmpty(cr0.PjT()) ? new Runnable() {
            final ReZ cr;

            @Override
            public void run() {
                if(ReZ.this.Zh.PjT(cr0.PjT()) != null) {
                    new PjT(ReZ.this, cr0, s, map0, null).run();
                }
            }
        } : null;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cz.Zh
    public void PjT(String s, List list0, boolean z, Map map0, int v, String s1) {
        com.bytedance.sdk.component.cz.PjT.JQp jQp0 = Au.XX().xE();
        if(jQp0 == null || Au.XX().cz() == null || jQp0.cr() == null || !jQp0.ReZ()) {
            return;
        }
        if(list0 != null && list0.size() != 0) {
            for(Object object0: list0) {
                PjT reZ$PjT0 = new PjT(this, new cr("dd49f094-d9b1-4d30-8cf0-4a7c8c4578da_" + System.currentTimeMillis(), ((String)object0), z, v, s1), s, map0, null);
                jQp0.cr().execute(reZ$PjT0);
            }
        }
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cz.Zh
    public void PjT(String s, boolean z) {
        com.bytedance.sdk.component.cz.PjT.JQp jQp0 = Au.XX().xE();
        if(jQp0 == null || Au.XX().cz() == null || !jQp0.ReZ()) {
            return;
        }
        com.bytedance.sdk.component.cz.PjT.cz.ReZ.2 reZ$20 = new JQp("trackFailedUrls") {
            final ReZ ReZ;

            @Override
            public void run() {
                List list0 = ReZ.this.Zh.PjT();
                ReZ.this.PjT(list0, s, z);
            }
        };
        reZ$20.PjT(1);
        if(jQp0.cr() != null) {
            jQp0.cr().execute(reZ$20);
        }
    }

    private static Random ReZ() {
        if(Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            }
            catch(Throwable unused_ex) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    static Random Zh() {
        return ReZ.ReZ();
    }
}

