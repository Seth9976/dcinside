package com.bytedance.sdk.openadsdk.core.qj.Zh;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.iZZ;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.wN;
import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class ReZ {
    public static class PjT {
        private final String PjT;
        private boolean ReZ;
        private com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.ReZ Zh;

        public PjT(String s) {
            this.Zh = com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.ReZ.PjT;
            this.ReZ = false;
            this.PjT = s;
        }

        public PjT PjT(boolean z) {
            this.ReZ = z;
            return this;
        }

        public ReZ PjT() {
            return new ReZ(this.PjT, this.Zh, Boolean.valueOf(this.ReZ));
        }
    }

    static enum com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.ReZ {
        TRACKING_URL,
        QUARTILE_EVENT;

    }

    public static class Zh {
        String PjT;
        float ReZ;
        Owx Zh;

        public Zh(String s, Owx owx0) {
            this(s, owx0, -1.0f);
        }

        public Zh(String s, Owx owx0, float f) {
            this.PjT = s;
            this.Zh = owx0;
            this.ReZ = f;
        }
    }

    private static final Map JQp;
    private final String PjT;
    private boolean ReZ;
    private com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.ReZ Zh;
    private boolean cr;
    private static final AtomicBoolean cz;

    static {
        ReZ.JQp = new ConcurrentHashMap();
        ReZ.cz = new AtomicBoolean(false);
        iZZ.PjT(new com.bytedance.sdk.component.utils.iZZ.PjT() {
            @Override  // com.bytedance.sdk.component.utils.iZZ$PjT
            public void PjT(Context context0, Intent intent0, boolean z, int v) {
                if(v != 0 && ReZ.JQp.size() > 0) {
                    ReZ.Zh();
                }
            }
        }, ub.PjT());
    }

    protected ReZ(String s, com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.ReZ reZ$ReZ0, Boolean boolean0) {
        this.PjT = s;
        this.Zh = reZ$ReZ0;
        this.ReZ = boolean0.booleanValue();
    }

    public boolean JQp() {
        return this.cr;
    }

    public static List PjT(@NonNull List list0, @Nullable com.bytedance.sdk.openadsdk.core.qj.PjT.PjT pjT0, @Nullable long v, @Nullable String s) {
        if(list0 == null) {
            return new ArrayList();
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            ReZ reZ0 = (ReZ)object0;
            if(reZ0 != null && (!reZ0.JQp() || reZ0.cr())) {
                arrayList0.add(reZ0.ReZ());
                reZ0.j_();
            }
        }
        return new com.bytedance.sdk.openadsdk.core.qj.ReZ.ReZ(arrayList0).PjT(pjT0).PjT(v).PjT(s).PjT();
    }

    public static List PjT(JSONArray jSONArray0) {
        return ReZ.PjT(jSONArray0, false);
    }

    public static List PjT(JSONArray jSONArray0, boolean z) {
        List list0 = new ArrayList();
        if(jSONArray0 != null) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                String s = jSONArray0.optString(v);
                if(!TextUtils.isEmpty(s)) {
                    list0.add(new PjT(s).PjT(z).PjT());
                }
            }
        }
        return list0;
    }

    public static JSONArray PjT(List list0) {
        JSONArray jSONArray0 = new JSONArray();
        for(int v = 0; v < list0.size(); ++v) {
            jSONArray0.put(((ReZ)list0.get(v)).ReZ());
        }
        return jSONArray0;
    }

    private static void PjT(String s, Zh reZ$Zh0, boolean z) {
        com.bytedance.sdk.component.XX.Zh.Zh zh0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().ReZ();
        if(zh0 == null) {
            return;
        }
        zh0.PjT(true);
        zh0.Zh(s);
        zh0.PjT(new com.bytedance.sdk.component.XX.PjT.PjT() {
            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
                boolean z;
                String s1;
                String s = null;
                if(reZ$Zh0 != null && reZ$Zh0.Zh != null) {
                    if(zh0 == null || !zh0.cz()) {
                        if(zh0 != null) {
                            s = zh0.PjT() + ":" + zh0.Zh();
                            if(!z && (zh0.PjT() <= 300 || zh0.PjT() >= 400)) {
                                ReZ.JQp.put(s, reZ$Zh0);
                            }
                        }
                        s1 = s;
                        z = false;
                    }
                    else {
                        s1 = null;
                        z = true;
                    }
                    ReZ.Zh(z, s1, wN.ReZ(reZ$Zh0.Zh.XWz()), reZ$Zh0, s, z);
                    if(zh0 != null && zh0.PjT() == 200 && ReZ.JQp.size() > 0) {
                        ReZ.Zh();
                    }
                }
            }

            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
                Zh reZ$Zh0 = reZ$Zh0;
                if(reZ$Zh0 != null) {
                    Owx owx0 = reZ$Zh0.Zh;
                    if(owx0 != null) {
                        ReZ.Zh(false, (iOException0 == null ? null : iOException0.getMessage()), wN.ReZ(owx0.XWz()), reZ$Zh0, s, z);
                    }
                }
                if(!z && reZ$Zh0 != null) {
                    ReZ.JQp.put(s, reZ$Zh0);
                }
            }
        });
    }

    public static void PjT(@NonNull List list0, @Nullable com.bytedance.sdk.openadsdk.core.qj.PjT.PjT pjT0, @Nullable long v, @Nullable String s, Zh reZ$Zh0) {
        ReZ.PjT(ReZ.PjT(list0, pjT0, v, s), reZ$Zh0);
    }

    public static void PjT(List list0, Zh reZ$Zh0) {
        for(int v = 0; v < list0.size(); ++v) {
            String s = (String)list0.get(v);
            if(!TextUtils.isEmpty(s)) {
                ReZ.PjT(s, reZ$Zh0, false);
            }
        }
    }

    public static List ReZ(JSONArray jSONArray0) {
        List list0 = new ArrayList();
        if(jSONArray0 != null) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
                if(jSONObject0 != null) {
                    list0.add(new com.bytedance.sdk.openadsdk.core.qj.Zh.PjT.PjT(jSONObject0.optString("content"), jSONObject0.optLong("trackingMilliseconds", 0L)).PjT());
                }
            }
        }
        return list0;
    }

    public String ReZ() {
        return this.PjT;
    }

    public static List Zh(JSONArray jSONArray0) {
        List list0 = new ArrayList();
        if(jSONArray0 != null) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
                if(jSONObject0 != null) {
                    list0.add(new com.bytedance.sdk.openadsdk.core.qj.Zh.Zh.PjT(jSONObject0.optString("content"), ((float)jSONObject0.optDouble("trackingFraction", 0.0))).PjT());
                }
            }
        }
        return list0;
    }

    private static void Zh() {
        if(ReZ.cz.compareAndSet(false, true)) {
            HashSet hashSet0 = new HashSet(ReZ.JQp.entrySet());
            ReZ.JQp.clear();
            for(Object object0: hashSet0) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0 != null) {
                    ReZ.PjT(((String)map$Entry0.getKey()), ((Zh)map$Entry0.getValue()), true);
                }
            }
            ReZ.cz.set(false);
        }
    }

    public static void Zh(@NonNull List list0, @Nullable com.bytedance.sdk.openadsdk.core.qj.PjT.PjT pjT0, @Nullable long v, @Nullable String s) {
        ReZ.PjT(list0, pjT0, v, s, null);
    }

    private static void Zh(boolean z, String s, String s1, Zh reZ$Zh0, String s2, boolean z1) {
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(new Au("dsp_track_link_result") {
            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("type", reZ$Zh0.PjT);
                    jSONObject0.put("success", z);
                    if(!TextUtils.isEmpty(s)) {
                        jSONObject0.put("description", s);
                    }
                    jSONObject0.put("url", s2);
                    float f = reZ$Zh0.ReZ;
                    if(f >= 0.0f) {
                        jSONObject0.put("progress", ((double)Math.round(f * 100.0f)) / 100.0);
                    }
                    if(z1) {
                        jSONObject0.put("retry", true);
                    }
                }
                catch(Throwable unused_ex) {
                }
                com.bytedance.sdk.openadsdk.cr.ReZ.Zh(reZ$Zh0.Zh, s1, "dsp_track_link_result", jSONObject0);
            }
        });
    }

    public boolean cr() {
        return this.ReZ;
    }

    public void j_() {
        this.cr = true;
    }
}

