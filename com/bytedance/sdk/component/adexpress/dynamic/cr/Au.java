package com.bytedance.sdk.component.adexpress.dynamic.cr;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class Au {
    private float Au;
    private List DWo;
    private float JQp;
    private String PjT;
    private float ReZ;
    private JQp SM;
    private float XX;
    private float Zh;
    private float cr;
    private float cz;
    private boolean fDm;
    private Au qj;
    private Map qla;
    private Map xE;
    private List xf;
    private String xs;

    public Au() {
        this.qla = new HashMap();
        this.xE = new HashMap();
    }

    public float Au() {
        return this.cz;
    }

    public JQp DWo() {
        return this.SM;
    }

    public float JQp() {
        return this.JQp;
    }

    public void JQp(float f) {
        this.cz = f;
    }

    public boolean Lrd() {
        return this.SM.JQp().RV() < 0 || this.SM.JQp().xR() < 0 || this.SM.JQp().hN() < 0 || this.SM.JQp().uQg() < 0;
    }

    public Map Owx() {
        return this.qla;
    }

    public String PjT() {
        return this.xs;
    }

    public String PjT(int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.SM.Zh());
        stringBuilder0.append(":");
        stringBuilder0.append(this.PjT);
        if(this.SM.JQp() != null) {
            stringBuilder0.append(":");
            stringBuilder0.append(this.SM.JQp().fU());
        }
        stringBuilder0.append(":");
        stringBuilder0.append(v);
        return stringBuilder0.toString();
    }

    public void PjT(float f) {
        this.cr = f;
    }

    public void PjT(Au au0) {
        this.qj = au0;
    }

    public void PjT(JQp jQp0) {
        this.SM = jQp0;
    }

    public void PjT(String s) {
        this.xs = s;
    }

    public void PjT(String s, String s1) {
        this.qla.put(s, s1);
    }

    public void PjT(List list0) {
        this.DWo = list0;
    }

    public void PjT(JSONArray jSONArray0) {
        if(jSONArray0 != null) {
            try {
                if(jSONArray0.length() != 0) {
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
                        this.xE.put(jSONObject0.optInt("id"), jSONObject0.optString("value"));
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public void PjT(boolean z) {
        this.fDm = z;
    }

    public void RD() {
        if(this.xf != null && this.xf.size() > 0) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.xf) {
                List list0 = (List)object0;
                if(list0 != null && list0.size() > 0) {
                    arrayList0.add(list0);
                }
            }
            this.xf = arrayList0;
        }
    }

    public String ReZ() {
        return this.PjT;
    }

    public void ReZ(float f) {
        this.Zh = f;
    }

    public void ReZ(String s) {
        this.SM.JQp().cz(s);
    }

    public float SM() {
        return this.XX;
    }

    public boolean Sks() {
        return TextUtils.equals(this.SM.JQp().Yo(), "flex");
    }

    public float XX() {
        return this.ReZ;
    }

    public void XX(float f) {
        this.Au = f;
    }

    public Map Zh() {
        return this.xE;
    }

    public void Zh(float f) {
        this.JQp = f;
    }

    public void Zh(String s) {
        this.PjT = s;
    }

    public void Zh(List list0) {
        this.xf = list0;
    }

    public float cr() {
        return this.cr;
    }

    public void cr(float f) {
        this.ReZ = f;
    }

    public float cz() {
        return this.Zh;
    }

    public void cz(float f) {
        this.XX = f;
    }

    public int fDm() {
        cz cz0 = this.SM.JQp();
        return cz0.tY() + cz0.xH();
    }

    public boolean gK() {
        return this.DWo == null || this.DWo.size() <= 0;
    }

    public boolean ltE() {
        return this.fDm;
    }

    public List qj() {
        return this.DWo;
    }

    public float qla() {
        cz cz0 = this.SM.JQp();
        return ((float)this.xs()) + cz0.qla() + cz0.xE() + cz0.xf() * 2.0f;
    }

    public String tT() {
        return this.SM.JQp().tT();
    }

    @Override
    public String toString() {
        return "DynamicLayoutUnit{id=\'" + this.PjT + '\'' + ", x=" + this.Zh + ", y=" + this.ReZ + ", width=" + this.cz + ", height=" + this.XX + ", remainWidth=" + this.Au + ", rootBrick=" + this.SM + ", childrenBrickUnits=" + this.DWo + '}';
    }

    public List ub() {
        return this.xf;
    }

    public float xE() {
        cz cz0 = this.SM.JQp();
        return ((float)this.fDm()) + cz0.ub() + cz0.fDm() + cz0.xf() * 2.0f;
    }

    public Au xf() {
        return this.qj;
    }

    public int xs() {
        cz cz0 = this.SM.JQp();
        return cz0.dwk() + cz0.MWx();
    }
}

