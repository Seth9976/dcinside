package com.bytedance.sdk.openadsdk.component.reward;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.utils.wN;
import org.json.JSONObject;

public class qj {
    public interface PjT {
        void PjT();
    }

    private boolean JQp;
    private final PjT PjT;
    private long ReZ;
    private long Zh;
    private long cr;
    private boolean cz;

    public qj(PjT qj$PjT0) {
        this.JQp = true;
        this.PjT = qj$PjT0;
        int v = com.bytedance.sdk.openadsdk.RD.PjT.PjT("reward_callback_fallback", 0);
        if(v != 0) {
            this.JQp = false;
            if(v == 2) {
                this.cz = true;
            }
        }
    }

    public static void PjT(Owx owx0, boolean z, int v) {
        ReZ.PjT(System.currentTimeMillis(), owx0, wN.PjT(owx0), (z ? "reward_callback" : "reward_fail_callback"), new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
            public JSONObject PjT() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("reason", v);
                    jSONObject1.put("pag_json_data", jSONObject2);
                    jSONObject0.put("ad_extra_data", jSONObject1.toString());
                }
                catch(Exception unused_ex) {
                }
                return jSONObject0;
            }
        });
    }

    public void PjT() {
        if(this.JQp) {
            return;
        }
        if(this.ReZ > 0L) {
            this.cr += SystemClock.elapsedRealtime() - this.ReZ;
            this.ReZ = 0L;
        }
    }

    public void PjT(long v) {
        if(v <= this.Zh) {
            return;
        }
        this.Zh = v;
    }

    public void ReZ() {
        this.JQp = true;
    }

    public void Zh() {
        if(this.JQp) {
            return;
        }
        this.ReZ = SystemClock.elapsedRealtime();
    }

    public void cr() {
        if(this.PjT != null) {
            long v = this.cr;
            long v1 = this.ReZ <= 0L ? 0L : SystemClock.elapsedRealtime() - this.ReZ;
            if(this.JQp) {
                return;
            }
            if(!this.cz && (v + v1) / 1000L < this.Zh) {
                return;
            }
            this.PjT.PjT();
        }
    }
}

