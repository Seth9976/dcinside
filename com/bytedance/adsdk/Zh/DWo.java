package com.bytedance.adsdk.Zh;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

public class DWo {
    public static class PjT {
        public int JQp;
        public int PjT;
        public String ReZ;
        public String XX;
        public int Zh;
        public String cr;
        public int cz;

    }

    private final String Au;
    private final JSONArray DWo;
    private final String JQp;
    private final int PjT;
    private final String ReZ;
    private final int[][] SM;
    private final List XX;
    private final int Zh;
    private final String cr;
    private final String cz;
    private Bitmap qj;

    public DWo(int v, int v1, String s, String s1, String s2, String s3, List list0, String s4, int[][] arr2_v, JSONArray jSONArray0) {
        this.PjT = v;
        this.Zh = v1;
        this.ReZ = s;
        this.cr = s1;
        this.JQp = s2;
        this.cz = s3;
        this.XX = list0;
        this.Au = s4;
        this.SM = arr2_v;
        this.DWo = jSONArray0;
    }

    public String Au() {
        return this.ReZ;
    }

    public String DWo() {
        return this.JQp;
    }

    public String JQp() {
        return this.Au;
    }

    public int PjT() {
        return this.PjT;
    }

    public void PjT(Bitmap bitmap0) {
        this.qj = bitmap0;
    }

    public List ReZ() {
        return this.XX;
    }

    public String SM() {
        return this.cr;
    }

    public JSONArray XX() {
        return this.DWo;
    }

    public int Zh() {
        return this.Zh;
    }

    public String cr() {
        return this.cz;
    }

    public int[][] cz() {
        return this.SM;
    }

    public Bitmap qj() {
        return this.qj;
    }
}

