package com.bytedance.sdk.openadsdk.core.settings;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class Zh {
    public int Au;
    public int Co;
    public int DWo;
    public int JQp;
    public int Jo;
    public boolean KM;
    public int Lrd;
    public int Owx;
    public String PjT;
    public boolean Qf;
    public boolean RD;
    public int ReZ;
    public int SM;
    public int Sks;
    public int XX;
    public int Yo;
    public boolean ZX;
    public int Zh;
    public int cRA;
    public int cr;
    public int cz;
    public int fDm;
    public int gK;
    public int iZZ;
    public int ltE;
    public int qj;
    public int qla;
    public List tT;
    public int ub;
    public JSONObject wN;
    public int xE;
    public int xf;
    public int xs;
    public int yIW;

    public Zh(String s, int v) {
        this.Zh = 1;
        this.ReZ = 1;
        this.cr = 2;
        this.JQp = 1;
        this.cz = 100;
        this.XX = 0;
        this.Au = 2;
        this.SM = 1;
        this.DWo = 3;
        this.qj = 30;
        this.xf = 30;
        this.xs = 1;
        this.fDm = 1;
        this.qla = 2;
        this.xE = 1500;
        this.ub = 2;
        this.gK = 3500;
        this.ltE = 0;
        this.Owx = 5;
        this.RD = false;
        this.Sks = 0;
        this.Lrd = 2;
        this.cRA = -1;
        this.yIW = 0;
        this.iZZ = 0;
        this.Yo = 5;
        this.KM = true;
        this.Qf = false;
        this.ZX = false;
        this.Jo = 0;
        this.Co = -1;
        this.wN = new JSONObject();
        this.PjT = s;
        this.ReZ = v;
    }

    public Zh(JSONObject jSONObject0) {
        this.Zh = 1;
        this.ReZ = 1;
        this.cr = 2;
        this.JQp = 1;
        this.cz = 100;
        this.XX = 0;
        this.Au = 2;
        this.SM = 1;
        this.DWo = 3;
        this.qj = 30;
        this.xf = 30;
        this.xs = 1;
        this.fDm = 1;
        this.qla = 2;
        this.xE = 1500;
        this.ub = 2;
        this.gK = 3500;
        this.ltE = 0;
        this.Owx = 5;
        this.RD = false;
        this.Sks = 0;
        this.Lrd = 2;
        this.cRA = -1;
        this.yIW = 0;
        this.iZZ = 0;
        this.Yo = 5;
        this.KM = true;
        this.Qf = false;
        this.ZX = false;
        this.Jo = 0;
        this.Co = -1;
        new JSONObject();
        this.wN = jSONObject0;
        if(jSONObject0 == null) {
            return;
        }
        this.PjT = jSONObject0.optString("code_id");
        this.Zh = jSONObject0.optInt("auto_play", 1);
        this.Co = jSONObject0.optInt("endcard_close_time", -1);
        this.ReZ = jSONObject0.optInt("voice_control", 1);
        this.cr = jSONObject0.optInt("rv_preload", 2);
        this.JQp = jSONObject0.optInt("nv_preload", 1);
        this.cz = Math.min(100, Math.max(0, jSONObject0.optInt("proportion_watching", 100)));
        this.XX = jSONObject0.optInt("skip_time_displayed", 0);
        this.Au = jSONObject0.optInt("video_skip_result", 2);
        this.SM = jSONObject0.optInt("reg_creative_control", 1);
        this.DWo = jSONObject0.optInt("play_bar_show_time", 3);
        int v = jSONObject0.optInt("rv_skip_time", 30);
        this.qj = v;
        if(v < 0) {
            this.qj = 30;
        }
        this.xs = jSONObject0.optInt("voice_control", 2);
        this.fDm = jSONObject0.optInt("if_show_win", 1);
        this.qla = jSONObject0.optInt("sp_preload", 2);
        this.xE = jSONObject0.optInt("stop_time", 1500);
        this.ub = jSONObject0.optInt("native_playable_delay", 2);
        this.gK = jSONObject0.optInt("time_out_control", -1);
        this.cRA = jSONObject0.optInt("playable_close_time", -1);
        this.ltE = jSONObject0.optInt("playable_reward_type", 0);
        this.Sks = jSONObject0.optInt("reward_is_callback", 0);
        int v1 = jSONObject0.optInt("iv_skip_time", 5);
        this.Owx = v1;
        if(v1 < 0) {
            this.Owx = 5;
        }
        this.PjT(jSONObject0.optJSONArray("parent_tpl_ids"));
        this.Lrd = jSONObject0.optInt("slot_type", 2);
        this.RD = jSONObject0.optBoolean("close_on_click", false);
        this.yIW = jSONObject0.optInt("allow_system_back", 0);
        this.iZZ = jSONObject0.optInt("splash_skip_time", 0);
        this.Yo = jSONObject0.optInt("splash_image_count_down_time", 5);
        this.Qf = jSONObject0.optBoolean("splash_count_down_time_off", false);
        this.ZX = jSONObject0.optBoolean("splash_close_on_click", false);
        int v2 = jSONObject0.optInt("splash_load_strategy", 0);
        this.Jo = v2;
        if(v2 < 0 || v2 > 1) {
            this.Jo = 0;
        }
        this.KM = jSONObject0.optBoolean("allow_mediaview_click", true);
        if(!Zh.PjT(this.ReZ)) {
            this.ReZ = 1;
        }
        if(!Zh.PjT(this.xs)) {
            this.xs = 1;
        }
        this.xf = jSONObject0.optInt("multi_rv_skip_time", 30);
    }

    private static boolean PjT(int v) {
        return v == 1 || v == 2;
    }

    public void PjT(JSONArray jSONArray0) {
        if(jSONArray0 != null && jSONArray0.length() != 0) {
            this.tT = new ArrayList();
            try {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    this.tT.add(jSONArray0.get(v).toString());
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }
}

