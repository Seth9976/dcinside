package com.bytedance.sdk.component.adexpress.cz;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.ReZ.PjT;
import org.json.JSONObject;

public class cz extends Sks {
    private Owx PjT;

    public cz(Context context0, int v, int v1, int v2, JSONObject jSONObject0) {
        super(context0);
        this.PjT(context0, v, v1, v2, jSONObject0);
    }

    private void PjT(Context context0, int v, int v1, int v2, JSONObject jSONObject0) {
        Owx owx0 = new Owx(context0, PjT.ReZ(context0), v, v1, v2, jSONObject0);
        this.PjT = owx0;
        this.addView(owx0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(14);
        relativeLayout$LayoutParams0.addRule(12);
        this.PjT.setLayoutParams(relativeLayout$LayoutParams0);
    }

    public Owx getShakeView() {
        return this.PjT;
    }

    public void setShakeText(String s) {
        if(this.PjT == null) {
            return;
        }
        if(TextUtils.isEmpty(s)) {
            this.PjT.setShakeText("");
            return;
        }
        this.PjT.setShakeText(s);
    }
}

