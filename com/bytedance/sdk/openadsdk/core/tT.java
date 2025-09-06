package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import j..util.concurrent.ConcurrentHashMap;

public class tT {
    private int JQp;
    public static ConcurrentHashMap PjT;
    private String ReZ;
    private String Zh;
    private int cr;
    private String cz;

    static {
        tT.PjT = new ConcurrentHashMap();
    }

    public tT() {
        this.Zh = "";
        this.ReZ = "";
    }

    public int JQp() {
        return this.JQp;
    }

    public String PjT() {
        return this.cz;
    }

    public void PjT(int v) {
        this.cr = v;
    }

    public void PjT(Owx owx0) {
        if(owx0 != null) {
            String s = owx0.ydj();
            if(!TextUtils.isEmpty(s)) {
                this.cz = s;
            }
            String s1 = owx0.xu();
            if(TextUtils.isEmpty(s1) && owx0.uvo()) {
                s1 = owx0.QB().SM();
            }
            if(!TextUtils.isEmpty(s1)) {
                String[] arr_s = s1.split("/");
                if(arr_s.length >= 3) {
                    this.Zh = arr_s[2];
                }
            }
            if(owx0.uQg() != null && false) {
                this.ReZ = "";
            }
        }
    }

    public static void ReZ(int v) {
        if(v == 0) {
            return;
        }
        if(tT.PjT == null) {
            tT.PjT = new ConcurrentHashMap();
        }
        if(tT.PjT.containsKey(v)) {
            tT tT0 = (tT)tT.PjT.get(v);
            if(tT0 != null) {
                tT0.Zh(1);
            }
        }
    }

    public static void ReZ(Owx owx0) {
        if(owx0 == null) {
            return;
        }
        int v = owx0.joj();
        Integer integer0 = v;
        if(v == 0) {
            return;
        }
        if(tT.PjT == null) {
            tT.PjT = new ConcurrentHashMap();
        }
        if(tT.PjT.containsKey(integer0)) {
            tT tT0 = (tT)tT.PjT.get(integer0);
            if(tT0 != null) {
                tT0.PjT(1);
            }
        }
    }

    public String ReZ() [...] // 潜在的解密器

    public static void Zh(Owx owx0) {
        if(owx0 != null && !TextUtils.isEmpty(owx0.xR())) {
            int v = owx0.joj();
            Integer integer0 = v;
            if(v == 0) {
                return;
            }
            if(tT.PjT == null) {
                tT.PjT = new ConcurrentHashMap();
            }
            tT tT0 = tT.PjT.containsKey(integer0) ? ((tT)tT.PjT.get(integer0)) : null;
            if(tT0 == null) {
                tT0 = new tT();
            }
            String s = owx0.ydj();
            if(TextUtils.isEmpty(s) || !s.equals(tT0.PjT())) {
                tT0.cz();
                tT0.PjT(owx0);
                tT.PjT.put(integer0, tT0);
            }
        }
    }

    public String Zh() {
        return this.Zh;
    }

    public void Zh(int v) {
        this.JQp = v;
    }

    public int cr() {
        return this.cr;
    }

    private void cz() {
        this.Zh = "";
        this.ReZ = "";
        this.cr = 0;
        this.JQp = 0;
    }
}

