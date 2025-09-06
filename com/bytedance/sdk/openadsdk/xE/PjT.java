package com.bytedance.sdk.openadsdk.xE;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.RD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

public class PjT implements Comparable {
    private final ArrayList Au;
    private int DWo;
    private int JQp;
    private final ArrayList PjT;
    private int ReZ;
    private final HashMap SM;
    private int XX;
    private final String Zh;
    private final ArrayList cr;
    private final ArrayList cz;
    private long fDm;
    private int qj;
    private final ArrayList qla;
    private final HashMap xf;
    private int xs;

    public PjT(String s) {
        this.PjT = new ArrayList();
        this.cr = new ArrayList();
        this.cz = new ArrayList();
        this.Au = new ArrayList();
        this.SM = new HashMap();
        this.DWo = 0;
        this.qj = 0;
        this.xf = new HashMap();
        this.xs = 0;
        this.qla = new ArrayList();
        this.Zh = s;
    }

    private void PjT(String s, JSONObject jSONObject0, ArrayList arrayList0, int[] arr_v, long v, JSONObject jSONObject1) throws JSONException {
        int v1 = arrayList0.size() - 1;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            int v4 = arr_v[v2];
            while(v1 >= 0 && ((long)(((Long)arrayList0.get(v1)))) >= v - ((long)v4) * 60000L) {
                ++v3;
                --v1;
            }
            if(v3 != 0) {
                jSONObject0.put(s + v4, v3);
                int v5 = jSONObject1.optInt(s + v4) + v3;
                if(v5 != 0) {
                    jSONObject1.put(s + v4, v5);
                }
            }
        }
        while(v1 >= 0) {
            arrayList0.remove(0);
            --v1;
        }
    }

    private void PjT(@NonNull JSONObject jSONObject0, JSONObject jSONObject1) throws JSONException {
        long v = SystemClock.elapsedRealtime();
        int[] arr_v = com.bytedance.sdk.openadsdk.cz.PjT.PjT().SM();
        this.PjT("show_c_", jSONObject0, this.PjT, arr_v, v, jSONObject1);
        int[] arr_v1 = com.bytedance.sdk.openadsdk.cz.PjT.PjT().DWo();
        this.PjT("click_c_", jSONObject0, this.cr, arr_v1, v, jSONObject1);
        int[] arr_v2 = com.bytedance.sdk.openadsdk.cz.PjT.PjT().qj();
        this.PjT("v_play_c_", jSONObject0, this.cz, arr_v2, v, jSONObject1);
        int[] arr_v3 = com.bytedance.sdk.openadsdk.cz.PjT.PjT().xE();
        this.PjT("dislike_c_", jSONObject0, this.Au, arr_v3, v, jSONObject1);
        if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().cz()) {
            int v1 = this.ReZ;
            if(v1 != 0) {
                jSONObject0.put("show_c_s", v1);
                int v2 = jSONObject1.optInt("show_c_s") + this.ReZ;
                if(v2 != 0) {
                    jSONObject1.put("show_c_s", v2);
                }
            }
        }
        if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().XX()) {
            int v3 = this.JQp;
            if(v3 != 0) {
                jSONObject0.put("click_c_s", v3);
                int v4 = jSONObject1.optInt("click_c_s") + this.JQp;
                if(v4 != 0) {
                    jSONObject1.put("click_c_s", v4);
                }
            }
        }
        if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().Au()) {
            int v5 = this.XX;
            if(v5 != 0) {
                jSONObject0.put("v_play_c_s", v5);
                int v6 = jSONObject1.optInt("v_play_c_s") + this.XX;
                if(v6 != 0) {
                    jSONObject1.put("v_play_c_s", v6);
                }
            }
        }
    }

    public int PjT(PjT pjT0) {
        return pjT0.ReZ - this.ReZ;
    }

    public JSONObject PjT(JSONObject jSONObject0) {
        JSONObject jSONObject1 = new JSONObject();
        try {
            this.PjT(jSONObject1, jSONObject0);
            this.Zh(jSONObject1, jSONObject0);
        }
        catch(Throwable throwable0) {
            RD.Zh(throwable0.getMessage(), new Object[0]);
        }
        return jSONObject1;
    }

    public void PjT() {
        this.fDm = SystemClock.elapsedRealtime();
        this.qj = 0;
        this.JQp = 0;
        this.ReZ = 0;
        this.xs = 0;
        this.DWo = 0;
        this.XX = 0;
    }

    public void PjT(@NonNull String s, @Nullable String s1) {
        s.hashCode();
        switch(s) {
            case "click": {
                if(this.qla.contains(s1)) {
                    return;
                }
                if(this.qla.size() > 50) {
                    this.qla.subList(0, 25).clear();
                }
                this.qla.add(s1);
                Long long3 = SystemClock.elapsedRealtime();
                this.cr.add(long3);
                if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().XX()) {
                    ++this.JQp;
                    return;
                }
                break;
            }
            case "dislike": {
                Long long1 = SystemClock.elapsedRealtime();
                this.Au.add(long1);
                return;
            }
            case "feed_break": {
                goto label_67;
            }
            case "feed_continue": {
                if(!TextUtils.isEmpty(s1)) {
                    Zh zh4 = (Zh)this.SM.get(s1);
                    if(zh4 != null) {
                        zh4.cr(SystemClock.elapsedRealtime());
                    }
                    return;
                }
                break;
            }
            case "feed_over": {
                goto label_67;
            }
            case "feed_pause": {
                if(!TextUtils.isEmpty(s1)) {
                    Zh zh5 = (Zh)this.SM.get(s1);
                    if(zh5 != null) {
                        zh5.ReZ(SystemClock.elapsedRealtime());
                    }
                    return;
                }
                break;
            }
            case "feed_play": {
                Long long0 = SystemClock.elapsedRealtime();
                this.cz.add(long0);
                if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().Au()) {
                    ++this.XX;
                }
                if(!TextUtils.isEmpty(s1) && ((Zh)this.SM.get(s1)) == null) {
                    Zh zh1 = new Zh();
                    this.SM.put(s1, zh1);
                    zh1.PjT(SystemClock.elapsedRealtime());
                }
                return;
            }
            case "landingContinue": {
                if(!TextUtils.isEmpty(s1)) {
                    Zh zh2 = (Zh)this.xf.get(s1);
                    if(zh2 != null) {
                        zh2.cr(SystemClock.elapsedRealtime());
                        return;
                    }
                }
                break;
            }
            case "landingFinish": {
                if(!TextUtils.isEmpty(s1)) {
                    Zh zh6 = (Zh)this.xf.get(s1);
                    if(zh6 != null && zh6.PjT() != Zh.JQp) {
                        zh6.Zh(SystemClock.elapsedRealtime());
                        if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().fDm()) {
                            this.xs = (int)(((long)this.xs) + zh6.PjT(this.fDm, SystemClock.elapsedRealtime()));
                        }
                        return;
                    }
                }
                break;
            }
            case "landingPause": {
                if(!TextUtils.isEmpty(s1)) {
                    Zh zh3 = (Zh)this.xf.get(s1);
                    if(zh3 != null) {
                        zh3.ReZ(SystemClock.elapsedRealtime());
                    }
                    return;
                }
                break;
            }
            case "landingStart": {
                if(!TextUtils.isEmpty(s1) && ((Zh)this.xf.get(s1)) == null) {
                    Zh zh0 = new Zh();
                    this.xf.put(s1, zh0);
                    zh0.PjT(SystemClock.elapsedRealtime());
                }
                return;
            }
            case "play_error": 
            case "videoForceBreak": {
            label_67:
                if(!TextUtils.isEmpty(s1)) {
                    Zh zh7 = (Zh)this.SM.get(s1);
                    if(zh7 != null && zh7.PjT() != Zh.JQp) {
                        zh7.Zh(SystemClock.elapsedRealtime());
                        if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().qla()) {
                            this.DWo = (int)(((long)this.DWo) + zh7.PjT(this.fDm, SystemClock.elapsedRealtime()));
                        }
                        return;
                    }
                }
                break;
            }
            case "show": {
                Long long2 = SystemClock.elapsedRealtime();
                this.PjT.add(long2);
                if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().cz()) {
                    ++this.ReZ;
                    return;
                }
                break;
            }
            case "videoPercent30": {
                if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().ub()) {
                    ++this.qj;
                    return;
                }
                break;
            }
        }
    }

    private void Zh(@NonNull JSONObject jSONObject0, JSONObject jSONObject1) throws JSONException {
        HashSet hashSet4;
        HashSet hashSet2;
        long v = SystemClock.elapsedRealtime();
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        int[] arr_v = com.bytedance.sdk.openadsdk.cz.PjT.PjT().xf();
        if(arr_v != null) {
            int v1 = 0;
            while(v1 < arr_v.length) {
                int v2 = arr_v[v1];
                long v3 = v - ((long)v2) * 60000L;
                long v4 = 0L;
                for(Object object0: this.xf.keySet()) {
                    String s = (String)object0;
                    Zh zh0 = (Zh)this.xf.get(s);
                    if(zh0 != null) {
                        long v5 = zh0.PjT(v3, v);
                        v4 += v5;
                        if(v5 <= 0L && v1 == arr_v.length - 1) {
                            hashSet0.add(s);
                        }
                    }
                }
                if(v4 == 0L) {
                    hashSet2 = hashSet1;
                }
                else {
                    jSONObject0.put("lp_stay_t_" + v2, v4);
                    hashSet2 = hashSet1;
                    long v6 = ((long)jSONObject1.optInt("lp_stay_t_" + v2)) + v4;
                    if(v6 != 0L) {
                        jSONObject1.put("lp_stay_t_" + v2, v6);
                    }
                }
                ++v1;
                hashSet1 = hashSet2;
            }
        }
        HashSet hashSet3 = hashSet1;
        int[] arr_v1 = com.bytedance.sdk.openadsdk.cz.PjT.PjT().xs();
        if(arr_v1 != null) {
            for(int v7 = 0; v7 < arr_v1.length; ++v7) {
                int v8 = arr_v1[v7];
                long v9 = v - ((long)v8) * 60000L;
                int v10 = 0;
                long v11 = 0L;
                for(Object object1: this.SM.keySet()) {
                    String s1 = (String)object1;
                    Zh zh1 = (Zh)this.SM.get(s1);
                    if(zh1 == null) {
                        hashSet4 = hashSet3;
                    }
                    else {
                        long v12 = zh1.PjT(v9, v);
                        v11 += v12;
                        if(v12 > 20000L) {
                            ++v10;
                        }
                        if(v12 <= 0L && v7 == arr_v1.length - 1) {
                            hashSet4 = hashSet3;
                            hashSet4.add(s1);
                        }
                    }
                    hashSet3 = hashSet4;
                }
                if(v11 != 0L) {
                    jSONObject0.put("v_stay_t_" + v8, v11);
                    long v13 = ((long)jSONObject1.optInt("v_stay_t_" + v8)) + v11;
                    if(v13 != 0L) {
                        jSONObject1.put("v_stay_t_" + v8, v13);
                    }
                }
                if(v10 != 0) {
                    jSONObject0.put("v_20s_play_c_" + v8, v10);
                    int v14 = jSONObject1.optInt("v_20s_play_c_" + v8) + v10;
                    if(v14 != 0) {
                        jSONObject1.put("v_20s_play_c_" + v8, v14);
                    }
                }
            }
        }
        if(!hashSet0.isEmpty()) {
            for(Object object2: hashSet0) {
                this.xf.remove(((String)object2));
            }
        }
        if(!hashSet3.isEmpty()) {
            for(Object object3: hashSet3) {
                this.SM.remove(((String)object3));
            }
        }
        if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().qla()) {
            int v15 = this.DWo;
            if(v15 != 0) {
                jSONObject0.put("v_stay_t_s", v15);
                int v16 = jSONObject1.optInt("v_stay_t_s") + this.DWo;
                if(v16 != 0) {
                    jSONObject1.put("v_stay_t_s", v16);
                }
            }
        }
        if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().fDm()) {
            int v17 = this.xs;
            if(v17 != 0) {
                jSONObject0.put("lp_stay_t_s", v17);
                int v18 = jSONObject1.optInt("lp_stay_t_s") + this.xs;
                if(v18 != 0) {
                    jSONObject1.put("lp_stay_t_s", v18);
                }
            }
        }
        if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().ub()) {
            int v19 = this.qj;
            if(v19 != 0) {
                jSONObject0.put("v_30p_play_c_s", v19);
                int v20 = jSONObject1.optInt("v_30p_play_c_s") + this.qj;
                if(v20 != 0) {
                    jSONObject1.put("v_30p_play_c_s", v20);
                }
            }
        }
    }

    public String Zh() {
        return this.Zh;
    }

    @Override
    public int compareTo(Object object0) {
        return this.PjT(((PjT)object0));
    }
}

