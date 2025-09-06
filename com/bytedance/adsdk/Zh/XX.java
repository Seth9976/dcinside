package com.bytedance.adsdk.Zh;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.Zh.ReZ.ReZ.JQp;
import com.bytedance.adsdk.Zh.ReZ.cz;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public class XX {
    public static class PjT {
        public int JQp;
        public int PjT;
        public Map ReZ;
        public JSONArray XX;
        public Map Zh;
        public int cr;
        public String cz;

    }

    public static class ReZ {
        public int[] JQp;
        public int PjT;
        public String ReZ;
        public JSONArray XX;
        public String Zh;
        public String cr;
        public String cz;

    }

    public static class Zh {
        public String PjT;
        public JSONArray ReZ;
        public int[][] Zh;

    }

    private LongSparseArray Au;
    private Rect DWo;
    private Map JQp;
    private final gK PjT;
    private Map ReZ;
    private List SM;
    private SparseArray XX;
    private final HashSet Zh;
    private Map cr;
    private List cz;
    private boolean fDm;
    private PjT gK;
    private Zh ltE;
    private float qj;
    private int qla;
    private String ub;
    private ReZ xE;
    private float xf;
    private float xs;

    public XX() {
        this.PjT = new gK();
        this.Zh = new HashSet();
        this.qla = 0;
        this.ub = "";
    }

    public ReZ Au() {
        return this.xE;
    }

    public Zh DWo() {
        return this.ltE;
    }

    public float JQp() {
        return (float)(((long)(this.ub() / this.xs * 1000.0f)));
    }

    public float PjT(float f) {
        return this.qj + f * (this.xf - this.qj);
    }

    public JQp PjT(long v) {
        return (JQp)this.Au.get(v);
    }

    public void PjT(int v) {
        this.qla += v;
    }

    public void PjT(Rect rect0, float f, float f1, float f2, List list0, LongSparseArray longSparseArray0, Map map0, Map map1, SparseArray sparseArray0, Map map2, List list1, ReZ xX$ReZ0, String s, PjT xX$PjT0, Zh xX$Zh0) {
        this.DWo = rect0;
        this.qj = f;
        this.xf = f1;
        this.xs = f2;
        this.SM = list0;
        this.Au = longSparseArray0;
        this.ReZ = map0;
        this.cr = map1;
        this.XX = sparseArray0;
        this.JQp = map2;
        this.cz = list1;
        this.xE = xX$ReZ0;
        this.ub = s;
        this.gK = xX$PjT0;
        this.ltE = xX$Zh0;
    }

    public void PjT(String s) {
        this.Zh.add(s);
    }

    public void PjT(boolean z) {
        this.fDm = z;
    }

    public boolean PjT() {
        return this.fDm;
    }

    public cz ReZ(String s) {
        int v = this.cz.size();
        for(int v1 = 0; v1 < v; ++v1) {
            cz cz0 = (cz)this.cz.get(v1);
            if(cz0.PjT(s)) {
                return cz0;
            }
        }
        return null;
    }

    public gK ReZ() {
        return this.PjT;
    }

    public String SM() [...] // 潜在的解密器

    public float XX() {
        return this.xf;
    }

    public int Zh() {
        return this.qla;
    }

    public List Zh(String s) {
        return (List)this.ReZ.get(s);
    }

    public void Zh(boolean z) {
        this.PjT.PjT(z);
    }

    public Rect cr() {
        return this.DWo;
    }

    public float cz() {
        return this.qj;
    }

    public SparseArray fDm() {
        return this.XX;
    }

    public PjT qj() {
        return this.gK;
    }

    public Map qla() {
        return this.JQp;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("LottieComposition:\n");
        for(Object object0: this.SM) {
            stringBuilder0.append(((JQp)object0).PjT("\t"));
        }
        return stringBuilder0.toString();
    }

    public float ub() {
        return this.xf - this.qj;
    }

    public Map xE() {
        return this.cr;
    }

    public float xf() {
        return this.xs;
    }

    public List xs() {
        return this.SM;
    }
}

