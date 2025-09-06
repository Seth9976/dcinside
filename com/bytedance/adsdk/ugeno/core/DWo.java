package com.bytedance.adsdk.ugeno.core;

import com.bytedance.adsdk.ugeno.Zh.ReZ;
import org.json.JSONObject;

public class DWo {
    private DWo JQp;
    private ReZ PjT;
    private JSONObject ReZ;
    private int Zh;
    private DWo cr;

    public ReZ PjT() {
        return this.PjT;
    }

    public void PjT(int v) {
        this.Zh = v;
    }

    public void PjT(ReZ reZ0) {
        this.PjT = reZ0;
    }

    public void PjT(DWo dWo0) {
        this.cr = dWo0;
    }

    public void PjT(JSONObject jSONObject0) {
        this.ReZ = jSONObject0;
    }

    public JSONObject ReZ() {
        return this.ReZ;
    }

    public int Zh() {
        return this.Zh;
    }

    public void Zh(DWo dWo0) {
        this.JQp = dWo0;
    }

    public DWo cr() {
        return this.cr;
    }

    @Override
    public String toString() {
        return "UGenEvent{mWidget=" + this.PjT + ", mEventType=" + this.Zh + ", mEvent=" + this.ReZ + '}';
    }
}

