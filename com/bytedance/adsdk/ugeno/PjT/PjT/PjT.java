package com.bytedance.adsdk.ugeno.PjT.PjT;

import android.graphics.Canvas;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import java.util.List;
import org.json.JSONObject;

public abstract class PjT {
    public static class com.bytedance.adsdk.ugeno.PjT.PjT.PjT.PjT {
        public static PjT PjT(ReZ reZ0, JSONObject jSONObject0) {
            if(reZ0 != null && jSONObject0 != null) {
                String s = jSONObject0.optString("type");
                s.hashCode();
                switch(s) {
                    case "ripple": {
                        return new Zh(reZ0, jSONObject0);
                    }
                    case "rub_in": {
                        return new com.bytedance.adsdk.ugeno.PjT.PjT.ReZ(reZ0, jSONObject0);
                    }
                    case "shine": {
                        return new cr(reZ0, jSONObject0);
                    }
                    case "stretch": {
                        return new JQp(reZ0, jSONObject0);
                    }
                    default: {
                        return null;
                    }
                }
            }
            return null;
        }
    }

    protected JSONObject PjT;
    private String ReZ;
    protected ReZ Zh;

    public PjT(ReZ reZ0, JSONObject jSONObject0) {
        this.PjT = jSONObject0;
        this.Zh = reZ0;
        this.PjT();
    }

    public void PjT() {
        this.ReZ = this.PjT.optString("type");
        this.Zh();
    }

    public abstract void PjT(int arg1, int arg2);

    public abstract void PjT(Canvas arg1);

    public abstract List ReZ();

    public abstract void Zh();

    public String cr() {
        return this.ReZ;
    }
}

