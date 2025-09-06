package com.bytedance.sdk.openadsdk.cr;

import android.text.TextUtils;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.cz.PjT.cr.PjT.Zh;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.PjT.cr;
import com.bytedance.sdk.openadsdk.cr.Zh.ReZ;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class PjT implements Zh {
    public static final class com.bytedance.sdk.openadsdk.cr.PjT.PjT {
        private String Au;
        private JSONObject DWo;
        private String JQp;
        private String Owx;
        public int PjT;
        private String ReZ;
        private String SM;
        private String XX;
        private String Zh;
        private String cr;
        private String cz;
        private com.bytedance.sdk.openadsdk.cr.Zh.Zh fDm;
        private int gK;
        private boolean ltE;
        private String qj;
        private com.bytedance.sdk.openadsdk.cr.Zh.PjT qla;
        private int ub;
        private final long xE;
        private final int xf;
        private String xs;

        public com.bytedance.sdk.openadsdk.cr.PjT.PjT(long v, Owx owx0) {
            this.ub = -1;
            this.gK = -1;
            this.PjT = -1;
            if(owx0 != null) {
                this.ltE = cRA.Zh(owx0);
                this.ub = owx0.Sks();
                this.gK = owx0.RD();
                this.PjT = owx0.fK();
            }
            this.xE = v;
            this.xf = ltE.ReZ(ub.PjT());
        }

        public com.bytedance.sdk.openadsdk.cr.PjT.PjT Au(String s) {
            this.Owx = s;
            return this;
        }

        public com.bytedance.sdk.openadsdk.cr.PjT.PjT JQp(String s) {
            this.Au = s;
            return this;
        }

        public com.bytedance.sdk.openadsdk.cr.PjT.PjT PjT(String s) {
            this.xs = s;
            return this;
        }

        public com.bytedance.sdk.openadsdk.cr.PjT.PjT PjT(JSONObject jSONObject0) {
            if(jSONObject0 == null) {
                return this;
            }
            this.DWo = jSONObject0;
            return this;
        }

        public void PjT(com.bytedance.sdk.openadsdk.cr.Zh.PjT pjT0) {
            com.bytedance.sdk.openadsdk.cz.Zh.PjT().PjT(this.cr, this.Owx, this.XX, this.ReZ);
            this.qla = pjT0;
            PjT pjT1 = new PjT(this);
            try {
                com.bytedance.sdk.openadsdk.cr.Zh.Zh zh0 = this.fDm;
                if(zh0 == null) {
                    new ReZ().PjT(pjT1.Zh, this.xE);
                }
                else {
                    zh0.PjT(pjT1.Zh, this.xE);
                }
            }
            catch(Throwable unused_ex) {
            }
            if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                Jo.ReZ(new Au("dispatchEvent") {
                    final com.bytedance.sdk.openadsdk.cr.PjT.PjT Zh;

                    @Override
                    public void run() {
                        cr.PjT(pjT1);
                    }
                });
                return;
            }
            cr.PjT(pjT1);
        }

        public com.bytedance.sdk.openadsdk.cr.PjT.PjT ReZ(String s) {
            this.cr = s;
            return this;
        }

        public com.bytedance.sdk.openadsdk.cr.PjT.PjT XX(String s) {
            this.XX = s;
            return this;
        }

        public com.bytedance.sdk.openadsdk.cr.PjT.PjT Zh(String s) {
            this.ReZ = s;
            return this;
        }

        public com.bytedance.sdk.openadsdk.cr.PjT.PjT cr(String s) {
            this.JQp = s;
            return this;
        }

        public com.bytedance.sdk.openadsdk.cr.PjT.PjT cz(String s) {
            this.SM = s;
            return this;
        }
    }

    private int Au;
    private static final Set DWo;
    private long JQp;
    private String Lrd;
    private com.bytedance.sdk.openadsdk.cr.Zh.PjT Owx;
    public final String PjT;
    private String RD;
    private boolean ReZ;
    private int SM;
    private String Sks;
    private int XX;
    protected final JSONObject Zh;
    private long cr;
    private final String cz;
    private String fDm;
    private String gK;
    private String ltE;
    private static final Map qj;
    private String qla;
    private int tT;
    private String ub;
    private String xE;
    private final AtomicBoolean xf;
    private JSONObject xs;

    static {
        PjT.DWo = new HashSet(Arrays.asList(new String[]{"insight_log"}));
        PjT.qj = new HashMap() {
            {
                this.put("id", "extra_id");
                this.put("source", "extra_source");
                this.put("url", "extra_url");
                this.put("toolType", "extra_tool_type");
                this.put("storeOpenType", "store_open_type");
                this.put("errorCode", "error_code");
                this.put("md5", "extra_md5");
                this.put("areaType", "area_type");
                this.put("rectInfo", "rect_info");
            }
        };
    }

    PjT(com.bytedance.sdk.openadsdk.cr.PjT.PjT pjT$PjT0) {
        this.cz = "adiff";
        this.xf = new AtomicBoolean(false);
        this.xs = new JSONObject();
        this.PjT = TextUtils.isEmpty(pjT$PjT0.Zh) ? "c598098c-32b4-4b80-b605-1bee08cbe801" : pjT$PjT0.Zh;
        this.Owx = pjT$PjT0.qla;
        this.Sks = pjT$PjT0.cz;
        this.fDm = pjT$PjT0.ReZ;
        this.qla = pjT$PjT0.cr;
        this.xE = TextUtils.isEmpty(pjT$PjT0.JQp) ? "app_union" : pjT$PjT0.JQp;
        this.RD = pjT$PjT0.qj;
        this.ub = pjT$PjT0.Au;
        this.ltE = pjT$PjT0.SM;
        this.gK = pjT$PjT0.XX;
        this.tT = pjT$PjT0.xf;
        this.Lrd = pjT$PjT0.xs;
        this.xs = pjT$PjT0.DWo = pjT$PjT0.DWo == null ? new JSONObject() : pjT$PjT0.DWo;
        JSONObject jSONObject0 = new JSONObject();
        this.Zh = jSONObject0;
        if(!TextUtils.isEmpty(pjT$PjT0.xs)) {
            try {
                jSONObject0.put("app_log_url", pjT$PjT0.xs);
            }
            catch(JSONException jSONException0) {
                RD.Zh("AdEvent", jSONException0.getMessage());
            }
        }
        this.XX = pjT$PjT0.ub;
        this.Au = pjT$PjT0.gK;
        this.SM = pjT$PjT0.PjT;
        this.ReZ = pjT$PjT0.ltE;
        this.JQp = System.currentTimeMillis();
        this.cz();
    }

    public PjT(String s, JSONObject jSONObject0) {
        this.cz = "adiff";
        this.xf = new AtomicBoolean(false);
        this.xs = new JSONObject();
        this.PjT = s;
        this.Zh = jSONObject0;
    }

    public boolean JQp() {
        if(this.Zh == null) {
            return false;
        }
        Set set0 = ub.cr().xf();
        if(set0 == null) {
            return false;
        }
        String s = this.Zh.optString("label");
        if(TextUtils.isEmpty(s)) {
            return TextUtils.isEmpty(this.qla) ? false : set0.contains(this.qla);
        }
        return set0.contains(s);
    }

    private JSONObject PjT(JSONObject jSONObject0) {
        try {
            if(!jSONObject0.has("adiff")) {
                jSONObject0.put("adiff", this.PjT);
            }
            if(this.ReZ) {
                if(!jSONObject0.has("interaction_method")) {
                    jSONObject0.put("interaction_method", this.XX);
                }
                if(!jSONObject0.has("real_interaction_method")) {
                    jSONObject0.put("real_interaction_method", this.Au);
                }
                if(!jSONObject0.has("image_mode")) {
                    jSONObject0.put("image_mode", this.SM);
                }
            }
            if(com.bytedance.sdk.openadsdk.RD.PjT.PjT("replace_log_extra_key", false)) {
                this.Zh(jSONObject0);
            }
            jSONObject0.put("pangle_client_unique_id", "pangle-" + this.PjT + "-" + System.currentTimeMillis());
            return jSONObject0;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("AdEvent", (throwable0.getMessage() == null ? "error " : throwable0.getMessage()));
        return jSONObject0;
    }

    private static void PjT(JSONObject jSONObject0, String s) {
        try {
            if(!PjT.DWo.contains(s) && !PjT.DWo.contains(jSONObject0.get("label"))) {
                jSONObject0.putOpt("is_ad_event", "1");
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("AdEvent", new Object[]{throwable0});
        }
    }

    private boolean PjT(String s, String s1, String s2) {
        if(TextUtils.isEmpty(s) || TextUtils.equals(s, "0") || TextUtils.isEmpty(s2)) {
            return false;
        }
        s1.hashCode();
        switch(s1) {
            case "app_union": {
                return true;
            }
            case "event_v1": {
                return true;
            }
            case "event_v3": {
                return true;
            }
            case "umeng": {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT.Zh
    public long PjT() {
        return this.JQp;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT.Zh
    public JSONObject PjT(String s) {
        return this.ReZ();
    }

    public JSONObject PjT(boolean z) {
        JSONObject jSONObject0 = this.ReZ();
        try {
            if(z) {
                JSONObject jSONObject1 = new JSONObject(jSONObject0.toString());
                JSONObject jSONObject2 = jSONObject1.optJSONObject("params");
                if(jSONObject2 != null) {
                    jSONObject2.remove("app_log_url");
                    return jSONObject1;
                }
                return jSONObject1;
            }
            JSONObject jSONObject3 = new JSONObject(jSONObject0.toString());
            jSONObject3.remove("app_log_url");
            return jSONObject3;
        }
        catch(JSONException jSONException0) {
        }
        RD.Zh("AdEvent", jSONException0.getMessage());
        return jSONObject0;
    }

    public JSONObject ReZ() {
        if(this.xf.get()) {
            return this.Zh;
        }
        try {
            this.XX();
            if(this.Zh.has("ad_extra_data")) {
                Object object0 = this.Zh.opt("ad_extra_data");
                if(object0 != null) {
                    try {
                        if(object0 instanceof JSONObject) {
                            String s = this.PjT(((JSONObject)object0)).toString();
                            this.Zh.put("ad_extra_data", s);
                        }
                        else if(object0 instanceof String) {
                            String s1 = this.PjT(new JSONObject(((String)object0))).toString();
                            this.Zh.put("ad_extra_data", s1);
                        }
                        goto label_27;
                    }
                    catch(JSONException jSONException0) {
                    }
                    RD.Zh("AdEvent", new Object[]{"json error", jSONException0.getMessage()});
                }
            }
            else {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("adiff", this.PjT);
                    if(this.ReZ) {
                        jSONObject0.put("interaction_method", this.XX);
                        jSONObject0.put("real_interaction_method", this.Au);
                        jSONObject0.put("image_mode", this.SM);
                    }
                    this.Zh.put("ad_extra_data", jSONObject0.toString());
                    goto label_27;
                }
                catch(JSONException jSONException1) {
                }
                RD.Zh("AdEvent", new Object[]{"json error", jSONException1.getMessage()});
            }
        label_27:
            this.xf.set(true);
        }
        catch(Throwable unused_ex) {
        }
        return this.Zh;
    }

    private void XX() throws JSONException {
        this.Zh.putOpt("app_log_url", this.Lrd);
        this.Zh.putOpt("tag", this.fDm);
        this.Zh.putOpt("label", this.qla);
        this.Zh.putOpt("category", this.xE);
        if(!TextUtils.isEmpty(this.ub)) {
            try {
                Long long0 = Long.parseLong(this.ub);
                this.Zh.putOpt("value", long0);
            }
            catch(NumberFormatException unused_ex) {
                this.Zh.putOpt("value", 0L);
            }
        }
        if(!TextUtils.isEmpty(this.ltE)) {
            try {
                Long long1 = Long.parseLong(this.ltE);
                this.Zh.putOpt("ext_value", long1);
            }
            catch(Exception unused_ex) {
            }
        }
        if(!TextUtils.isEmpty(this.Sks)) {
            this.Zh.putOpt("log_extra", this.Sks);
        }
        if(!TextUtils.isEmpty(this.RD)) {
            try {
                Integer integer0 = Integer.parseInt(this.RD);
                this.Zh.putOpt("ua_policy", integer0);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        PjT.PjT(this.Zh, this.qla);
        try {
            this.Zh.putOpt("nt", this.tT);
        }
        catch(Exception unused_ex) {
        }
        Iterator iterator0 = this.xs.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = this.xs.opt(((String)object0));
            this.Zh.putOpt(((String)object0), object1);
        }
    }

    private void Zh(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        for(Object object0: PjT.qj.keySet()) {
            String s = (String)object0;
            try {
                if(!jSONObject0.has(s)) {
                    continue;
                }
                Object object1 = jSONObject0.opt(s);
                jSONObject0.remove(s);
                jSONObject0.put(((String)PjT.qj.get(s)), object1);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private boolean Zh(String s) {
        s.hashCode();
        switch(s) {
            case "app_union": {
                return true;
            }
            case "event_v1": {
                return true;
            }
            case "event_v3": {
                return true;
            }
            case "umeng": {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT.Zh
    public long Zh() {
        return this.cr;
    }

    public String cr() {
        return this.PjT;
    }

    private void cz() {
        JSONObject jSONObject0 = this.xs;
        if(jSONObject0 != null) {
            String s = jSONObject0.optString("value");
            String s1 = this.xs.optString("category");
            String s2 = this.xs.optString("log_extra");
            if(this.PjT(this.ub, this.xE, this.Sks)) {
                if(!TextUtils.isEmpty(s) && TextUtils.equals(s, "0")) {
                    return;
                }
                if(!TextUtils.isEmpty(s1) && !this.Zh(s1)) {
                    return;
                }
            }
            else if((TextUtils.isEmpty(s) || TextUtils.equals(s, "0")) && (TextUtils.isEmpty(this.ub) || TextUtils.equals(this.ub, "0")) || (TextUtils.isEmpty(this.xE) || !this.Zh(this.xE)) && (TextUtils.isEmpty(s1) || !this.Zh(s1)) || TextUtils.isEmpty(this.Sks) && TextUtils.isEmpty(s2)) {
                return;
            }
        }
        else if(!this.PjT(this.ub, this.xE, this.Sks)) {
            return;
        }
        this.cr = (long)cr.PjT.incrementAndGet();
    }
}

