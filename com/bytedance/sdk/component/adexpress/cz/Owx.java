package com.bytedance.sdk.component.adexpress.cz;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.Lrd;
import org.json.JSONObject;

public class Owx extends ltE {
    private TextView PjT;

    public Owx(@NonNull Context context0, View view0, int v, int v1, int v2, JSONObject jSONObject0) {
        super(context0, view0, v, v1, v2, jSONObject0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.cz.ltE
    protected void PjT(Context context0, View view0) {
        this.addView(view0);
        this.PjT = (TextView)this.findViewById(0x7D06FFFB);
    }

    @Override  // com.bytedance.sdk.component.adexpress.cz.ltE
    public void setShakeText(String s) {
        if(this.PjT == null) {
            return;
        }
        if(TextUtils.isEmpty(s)) {
            try {
                int v = Lrd.Zh(this.PjT.getContext(), "tt_splash_default_click_shake");
                this.PjT.setText(v);
            }
            catch(Exception exception0) {
                exception0.getMessage();
            }
            return;
        }
        this.PjT.setText(s);
    }
}

