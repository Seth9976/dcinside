package com.bytedance.sdk.component.SM;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import com.bytedance.sdk.component.SM.PjT.PjT;
import com.bytedance.sdk.component.utils.RD;
import org.json.JSONObject;

public class cr extends ReZ {
    private float Au;
    private String DWo;
    private final cz JQp;
    private final View.OnTouchListener PjT;
    private final long ReZ;
    private float SM;
    private long XX;
    private final int Zh;
    private final Context cr;
    private View.OnTouchListener cz;

    public cr(Context context0, View.OnTouchListener view$OnTouchListener0, int v, long v1, cz cz0) {
        this.XX = -1L;
        this.cr = context0;
        this.PjT = view$OnTouchListener0;
        this.Zh = v;
        this.ReZ = v1;
        this.JQp = cz0;
    }

    private void PjT(int v, float f, float f1) {
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        try {
            jSONObject1.put("is_interceptor", v);
            jSONObject1.put("click_x", ((double)f));
            jSONObject1.put("click_y", ((double)f1));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("lp_click_type", this.Zh);
            jSONObject2.put("lp_click_interval", this.ReZ);
            jSONObject1.put("pag_json_data", jSONObject2.toString());
            jSONObject0.put("ad_extra_data", jSONObject1.toString());
        }
        catch(Throwable throwable0) {
            RD.PjT("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", throwable0);
        }
        if(PjT.PjT().Zh() != null) {
            PjT.PjT().Zh().PjT((this.JQp == null ? null : this.JQp.getMaterialMeta()), this.DWo, "click_interval_intercept", jSONObject0);
        }
    }

    private boolean PjT(long v) {
        long v1 = this.XX;
        if(v1 == -1L) {
            this.XX = v;
            return false;
        }
        int v2 = this.Zh;
        if(v2 == 1) {
            if(v - v1 <= this.ReZ) {
                return true;
            }
            this.XX = v;
            return false;
        }
        if(v2 == 2) {
            if(v - v1 <= this.ReZ) {
                this.XX = v;
                return true;
            }
            this.XX = v;
        }
        return false;
    }

    @Override  // com.bytedance.sdk.component.SM.ReZ
    public void PjT(View.OnTouchListener view$OnTouchListener0) {
        this.cz = view$OnTouchListener0;
    }

    public void PjT(String s) {
        this.DWo = s;
    }

    @Override  // android.view.View$OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        motionEvent0.getX();
        motionEvent0.getY();
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        switch(v) {
            case 0: {
                this.Au = f;
                this.SM = f1;
                break;
            }
            case 1: {
                if(this.PjT(f, f1, this.Au, this.SM, this.cr)) {
                    if(this.PjT(SystemClock.elapsedRealtime())) {
                        motionEvent0.setAction(3);
                        this.PjT(1, f, f1);
                    }
                    else {
                        this.PjT(0, f, f1);
                    }
                }
            }
        }
        View.OnTouchListener view$OnTouchListener0 = this.PjT;
        if(view$OnTouchListener0 != null) {
            view$OnTouchListener0.onTouch(view0, motionEvent0);
        }
        View.OnTouchListener view$OnTouchListener1 = this.cz;
        if(view$OnTouchListener1 != null) {
            view$OnTouchListener1.onTouch(view0, motionEvent0);
        }
        return false;
    }
}

