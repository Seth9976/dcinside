package com.bytedance.sdk.openadsdk.cz;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.ReZ;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import com.bytedance.sdk.openadsdk.utils.KM;
import com.bytedance.sdk.openadsdk.xE.PjT;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class Zh {
    private int Au;
    private final Runnable DWo;
    private volatile HandlerThread JQp;
    private static volatile Zh PjT;
    private PjT ReZ;
    private volatile long SM;
    private String XX;
    private final ConcurrentHashMap Zh;
    private volatile boolean cr;
    private volatile Handler cz;

    static {
    }

    private Zh() {
        this.Zh = new ConcurrentHashMap();
        this.ReZ = null;
        this.cr = false;
        this.JQp = null;
        this.cz = null;
        this.XX = "";
        this.Au = 0;
        this.SM = 0L;
        this.DWo = new Runnable() {
            final Zh PjT;

            @Override
            public void run() {
                JSONObject jSONObject1;
                JSONObject jSONObject0;
                try {
                    jSONObject0 = new JSONObject();
                    jSONObject1 = new JSONObject();
                }
                catch(OutOfMemoryError outOfMemoryError0) {
                    RD.Zh(outOfMemoryError0.getMessage(), new Object[0]);
                    return;
                }
                try {
                    if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().JQp()) {
                        Set set0 = Zh.this.Zh.keySet();
                        if(set0.size() > Zh.this.Au) {
                            Zh.this.Au = set0.size();
                        }
                        HashSet hashSet0 = new HashSet(5);
                        ArrayList arrayList0 = new ArrayList(set0.size());
                        arrayList0.addAll(Zh.this.Zh.values());
                        Collections.sort(arrayList0);
                        for(int v = 0; v < arrayList0.size() && v < 5; ++v) {
                            hashSet0.add(((PjT)arrayList0.get(v)).Zh());
                        }
                        try {
                            for(Object object0: set0) {
                                String s = (String)object0;
                                PjT pjT0 = (PjT)Zh.this.Zh.get(s);
                                if(pjT0 != null) {
                                    JSONObject jSONObject2 = pjT0.PjT(jSONObject1);
                                    if(hashSet0.contains(s)) {
                                        jSONObject0.put(s, jSONObject2);
                                    }
                                }
                            }
                            jSONObject0.put("common", jSONObject1);
                            goto label_38;
                        }
                        catch(JSONException jSONException0) {
                        }
                        RD.Zh(jSONException0.getMessage(), new Object[0]);
                    }
                    else {
                        try {
                            if(Zh.this.ReZ != null) {
                                jSONObject0.put("common", Zh.this.ReZ.PjT(jSONObject1));
                            }
                        }
                        catch(JSONException jSONException1) {
                            RD.Zh(jSONException1.getMessage(), new Object[0]);
                        }
                    }
                    goto label_38;
                }
                catch(Throwable throwable0) {
                }
                try {
                    RD.Zh(throwable0.getMessage(), new Object[0]);
                label_38:
                    Zh.this.XX = jSONObject0.toString();
                    long v1 = (long)com.bytedance.sdk.openadsdk.cz.PjT.PjT().cr();
                    Zh.this.PjT(Zh.this.DWo, v1);
                }
                catch(OutOfMemoryError outOfMemoryError0) {
                    RD.Zh(outOfMemoryError0.getMessage(), new Object[0]);
                }
            }
        };
    }

    private void JQp() {
        if(!this.cr) {
            this.cr = true;
            long v = (long)com.bytedance.sdk.openadsdk.cz.PjT.PjT().cr();
            this.PjT(this.DWo, v);
        }
    }

    public static Zh PjT() {
        if(Zh.PjT == null) {
            Class class0 = ReZ.class;
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

    private void PjT(Runnable runnable0) {
        if(KM.PjT) {
            return;
        }
        if(runnable0 != null) {
            try {
                this.ReZ().post(runnable0);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private void PjT(Runnable runnable0, long v) {
        if(KM.PjT) {
            return;
        }
        if(runnable0 != null) {
            try {
                this.ReZ().postDelayed(runnable0, v);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    // 检测为 Lambda 实现
    private void PjT(@NonNull String s, @NonNull String s1, String s2) [...]

    public void PjT(@NonNull String s, Owx owx0) {
        if(!TextUtils.isEmpty(s) && com.bytedance.sdk.openadsdk.cz.PjT.PjT().ReZ() && Owx.JQp(owx0)) {
            if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().gK()) {
                switch(owx0.kW()) {
                    case 3: 
                    case 7: 
                    case 8: {
                        break;
                    }
                    default: {
                        return;
                    }
                }
            }
            if(!"videoPercent30".equals(s) && !"videoForceBreak".equals(s)) {
                return;
            }
            this.PjT(new Runnable() {
                final Zh ReZ;

                @Override
                public void run() {
                    String s = owx0.Ey();
                    String s1 = owx0.ydj();
                    if(TextUtils.isEmpty(s)) {
                        return;
                    }
                    Zh.this.PjT(s, s, s1);
                }
            });
        }
    }

    public void PjT(@NonNull String s, Owx owx0, String s1) {
        if(TextUtils.isEmpty(s) || !com.bytedance.sdk.openadsdk.cz.PjT.PjT().ReZ() || !"landingStart".equals(s) && !"landingFinish".equals(s) && !"landingContinue".equals(s) && !"landingPause".equals(s)) {
            return;
        }
        this.PjT(new Runnable() {
            final Zh cr;

            @Override
            public void run() {
                if(owx0 != null && !TextUtils.isEmpty(owx0.Ey())) {
                    String s = owx0.Ey();
                    Zh.this.PjT(s, s, owx0.ydj() + s1);
                }
            }
        });
    }

    public void PjT(@NonNull String s, @NonNull String s1, String s2, String s3) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && com.bytedance.sdk.openadsdk.cz.PjT.PjT().ReZ()) {
            if(!"show".equals(s) && !"click".equals(s) && !"dislike".equals(s)) {
                if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().gK() && (TextUtils.isEmpty(s3) || !"rewarded_video".equals(s3) && !"fullscreen_interstitial_ad".equals(s3) && !"open_ad".equals(s3))) {
                    return;
                }
                if("feed_play".equals(s) || "feed_pause".equals(s) || "feed_continue".equals(s) || "feed_over".equals(s) || "feed_break".equals(s) || "play_error".equals(s)) {
                    this.PjT(() -> {
                        try {
                            if(!TextUtils.isEmpty(this.PjT) && !TextUtils.isEmpty(this.Zh) && com.bytedance.sdk.openadsdk.cz.PjT.PjT().ReZ()) {
                                Zh.this.JQp();
                                if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().JQp()) {
                                    PjT pjT0 = (PjT)Zh.this.Zh.get(this.Zh);
                                    if(pjT0 == null) {
                                        pjT0 = new PjT(this.Zh);
                                    }
                                    pjT0.PjT(this.PjT, this.ReZ);
                                    Zh.this.Zh.put(this.Zh, pjT0);
                                    return;
                                }
                                if(Zh.this.ReZ == null) {
                                    Zh.this.ReZ = new PjT(this.Zh);
                                }
                                Zh.this.ReZ.PjT(this.PjT, this.ReZ);
                            }
                            return;
                        }
                        catch(OutOfMemoryError outOfMemoryError0) {
                        }
                        RD.Zh(outOfMemoryError0.getMessage(), new Object[0]);
                    });
                }
                return;
            }
            this.PjT(() -> {
                try {
                    if(!TextUtils.isEmpty(this.PjT) && !TextUtils.isEmpty(this.Zh) && com.bytedance.sdk.openadsdk.cz.PjT.PjT().ReZ()) {
                        Zh.this.JQp();
                        if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().JQp()) {
                            PjT pjT0 = (PjT)Zh.this.Zh.get(this.Zh);
                            if(pjT0 == null) {
                                pjT0 = new PjT(this.Zh);
                            }
                            pjT0.PjT(this.PjT, this.ReZ);
                            Zh.this.Zh.put(this.Zh, pjT0);
                            return;
                        }
                        if(Zh.this.ReZ == null) {
                            Zh.this.ReZ = new PjT(this.Zh);
                        }
                        Zh.this.ReZ.PjT(this.PjT, this.ReZ);
                    }
                    return;
                }
                catch(OutOfMemoryError outOfMemoryError0) {
                }
                RD.Zh(outOfMemoryError0.getMessage(), new Object[0]);
            });
        }

        class com.bytedance.sdk.openadsdk.cz.Zh.2 implements Runnable {
            final Zh cr;

            com.bytedance.sdk.openadsdk.cz.Zh.2(String s, String s1, String s2) {
            }

            @Override
            public void run() {
                Zh.this.PjT(this.PjT, this.Zh, this.ReZ);
            }
        }


        class com.bytedance.sdk.openadsdk.cz.Zh.3 implements Runnable {
            final Zh cr;

            com.bytedance.sdk.openadsdk.cz.Zh.3(String s, String s1, String s2) {
            }

            @Override
            public void run() {
                Zh.this.PjT(this.PjT, this.Zh, this.ReZ);
            }
        }

    }

    public void PjT(JSONObject jSONObject0) {
        if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().ReZ()) {
            try {
                jSONObject0.put("feature_data", this.XX);
                this.cr();
            }
            catch(JSONException jSONException0) {
                RD.Zh(jSONException0.getMessage(), new Object[0]);
            }
        }
    }

    private Handler ReZ() {
        if(this.JQp != null && this.JQp.isAlive()) {
            if(this.cz == null) {
                Class class0 = fDm.class;
                __monitor_enter(class0);
                try {
                    if(this.cz == null) {
                        this.cz = new Handler(this.JQp.getLooper());
                    }
                    __monitor_exit(class0);
                    return this.cz;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(class0);
                throw throwable0;
            }
            return this.cz;
        }
        Class class1 = fDm.class;
        __monitor_enter(class1);
        try {
            if(this.JQp == null || !this.JQp.isAlive()) {
                this.JQp = Au.PjT("csj_feature", -1);
                this.cz = new Handler(this.JQp.getLooper());
            }
            __monitor_exit(class1);
            return this.cz;
        }
        catch(Throwable throwable1) {
        }
        __monitor_exit(class1);
        throw throwable1;
    }

    public void Zh() {
        try {
            if(!com.bytedance.sdk.openadsdk.cz.PjT.PjT().ReZ()) {
                return;
            }
            this.PjT(new Runnable() {
                final Zh PjT;

                @Override
                public void run() {
                    if(com.bytedance.sdk.openadsdk.cz.PjT.PjT().JQp()) {
                        for(Object object0: Zh.this.Zh.keySet()) {
                            PjT pjT0 = (PjT)Zh.this.Zh.get(((String)object0));
                            if(pjT0 != null) {
                                pjT0.PjT();
                            }
                        }
                        return;
                    }
                    if(Zh.this.ReZ != null) {
                        Zh.this.ReZ.PjT();
                    }
                }
            });
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            RD.Zh(outOfMemoryError0.getMessage(), new Object[0]);
        }
    }

    private void cr() {
        long v = SystemClock.elapsedRealtime();
        if(v - this.SM > 10000L) {
            com.bytedance.sdk.openadsdk.qla.ReZ.PjT("track_feature_result", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
                final Zh Zh;

                @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                @Nullable
                public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                    Zh.this.SM = v;
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("msg", String.valueOf(Zh.this.Au));
                    return cr.Zh().PjT("track_feature_result").Zh(jSONObject0.toString());
                }
            });
        }
    }
}

