package com.bytedance.sdk.component.adexpress.dynamic.JQp;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.adexpress.dynamic.cr.SM;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Zh;
import com.bytedance.sdk.component.adexpress.dynamic.cr.cz;
import java.util.ArrayList;
import java.util.List;

public class JQp {
    static class PjT {
        float PjT;
        float ReZ;
        float Zh;

    }

    public Zh PjT;
    private Au ReZ;
    protected com.bytedance.sdk.component.adexpress.dynamic.JQp.Zh Zh;
    private PjT cr;

    public JQp(double f, int v, double f1, String s, xs xs0) {
        this.Zh = new com.bytedance.sdk.component.adexpress.dynamic.JQp.Zh(f, v, f1, s, xs0);
    }

    private SM PjT(Zh zh0, cz cz0, float f, float f1) {
        float f2 = zh0.PjT;
        float f3 = zh0.Zh;
        float f4 = (float)cz0.hN();
        float f5 = (float)cz0.RV();
        float f6 = (float)cz0.uQg();
        float f7 = (float)cz0.xR();
        boolean z = cz0.xu();
        boolean z1 = cz0.CY();
        boolean z2 = cz0.fA();
        boolean z3 = cz0.zYH();
        String s = cz0.kFP();
        float f8 = zh0.ReZ;
        float f9 = zh0.cr;
        if(TextUtils.equals(s, "0")) {
            if(z) {
                f2 = zh0.PjT + f4;
            }
            else if(z1) {
                f2 = zh0.PjT + f8 - f6 - f;
            }
            if(z2) {
                return new SM(f2, zh0.Zh + f5);
            }
            return z3 ? new SM(f2, zh0.Zh + f9 - f7 - f1) : new SM(f2, f3);
        }
        if(TextUtils.equals(s, "1")) {
            f2 = zh0.PjT + (f8 - f) / 2.0f;
            if(z2) {
                return new SM(f2, zh0.Zh + f5);
            }
            return z3 ? new SM(f2, zh0.Zh + f9 - f7 - f1) : new SM(f2, f3);
        }
        if(TextUtils.equals(s, "2")) {
            f3 = zh0.Zh + (f9 - f1) / 2.0f;
            if(z) {
                return new SM(zh0.PjT + f4, f3);
            }
            return z1 ? new SM(zh0.PjT + f8 - f6 - f, f3) : new SM(f2, f3);
        }
        if(TextUtils.equals(s, "3")) {
            f2 = zh0.PjT + (f8 - f) / 2.0f;
            f3 = zh0.Zh + (f9 - f1) / 2.0f;
        }
        return new SM(f2, f3);
    }

    private SM PjT(cz cz0, ReZ zh$ReZ0, ReZ zh$ReZ1) {
        float f = (float)cz0.hN();
        float f1 = (float)cz0.RV();
        float f2 = (float)cz0.uQg();
        float f3 = (float)cz0.xR();
        boolean z = cz0.CY();
        boolean z1 = cz0.fA();
        boolean z2 = cz0.zYH();
        if(!cz0.xu()) {
            if(z) {
                float f4 = this.cr.PjT;
                f = (f4 == 0.0f ? zh$ReZ0.PjT : Math.min(f4, zh$ReZ0.PjT)) - f2 - zh$ReZ1.PjT;
            }
            else {
                f = 0.0f;
            }
        }
        if(!z1) {
            if(z2) {
                return new SM(f, (this.cr.Zh == 0.0f ? zh$ReZ0.Zh : this.cr.Zh) - f3 - zh$ReZ1.Zh);
            }
            f1 = 0.0f;
        }
        return new SM(f, f1);
    }

    public Zh PjT(Zh zh0, float f) {
        SM sM3;
        float f31;
        SM sM2;
        Au au5;
        float f30;
        SM sM1;
        float f29;
        float f27;
        List list2;
        float f20;
        float f17;
        float f16;
        float f12;
        float f11;
        float f9;
        float f8;
        Au au0 = zh0.cz;
        if(au0 == null) {
            return zh0;
        }
        au0.RD();
        List list0 = au0.ub();
        if(list0 != null && list0.size() > 0) {
            cz cz0 = au0.DWo().JQp();
            float f1 = cz0.ub();
            float f2 = cz0.qla();
            float f3 = cz0.xf();
            String s = cz0.kph();
            String s1 = cz0.IJ();
            float f4 = zh0.PjT + f2;
            float f5 = zh0.ReZ - f2 - cz0.xE() - f3 * 2.0f;
            float f6 = zh0.cr - f1 - cz0.fDm() - f3 * 2.0f;
            SM sM0 = new SM(f4, zh0.Zh + f1);
            if(zh0.XX == null) {
                zh0.XX = new ArrayList();
            }
            float f7 = 0.0f;
            for(Object object0: list0) {
                ReZ zh$ReZ0 = this.Zh.PjT(((List)object0));
                if(zh$ReZ0 != null) {
                    f7 += zh$ReZ0.Zh;
                }
            }
            if(f7 >= f6) {
                f9 = 0.0f;
                f8 = 0.0f;
            }
            else if(TextUtils.equals(s1, "center")) {
                f8 = (f6 - f7) / 2.0f;
                f9 = 0.0f;
            }
            else if(TextUtils.equals(s1, "flex-end")) {
                f8 = f6 - f7;
                f9 = 0.0f;
            }
            else if(TextUtils.equals(s1, "space-around")) {
                f8 = DWo.PjT((f6 - f7) / ((float)(list0.size() + 1)));
                f9 = f8;
            }
            else {
                f9 = !TextUtils.equals(s1, "space-between") || list0.size() <= 1 ? 0.0f : DWo.PjT((f6 - f7) / ((float)(list0.size() - 1)));
                f8 = 0.0f;
            }
            sM0.Zh += f8;
            float f10 = f;
            int v = 0;
            while(v < list0.size()) {
                List list1 = (List)list0.get(v);
                ++v;
                if(v >= zh0.XX.size()) {
                    int v1 = v - zh0.XX.size() + 1;
                    f11 = f10;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        zh0.XX.add(new ArrayList());
                    }
                    f12 = f9;
                }
                else {
                    f12 = f9;
                    f11 = f10;
                }
                float f13 = 0.0f;
                for(Object object1: list1) {
                    Au au1 = (Au)object1;
                    cz cz1 = au1.DWo().JQp();
                    int v3 = cz1.Xe();
                    if(!TextUtils.equals(cz1.Yo(), "flex") && v3 != 1 && v3 != 2) {
                        ReZ zh$ReZ1 = this.Zh.PjT(au1);
                        if(zh$ReZ1 != null) {
                            f13 += zh$ReZ1.PjT;
                        }
                    }
                }
                float f14 = Math.max(f5 - f13, 0.0f);
                float f15 = 0.0f;
                for(Object object2: list1) {
                    Au au2 = (Au)object2;
                    cz cz2 = au2.DWo().JQp();
                    if(cz2.Xe() != 1 && cz2.Xe() != 2) {
                        ReZ zh$ReZ2 = this.Zh.PjT(au2);
                        if(zh$ReZ2 != null) {
                            f15 += zh$ReZ2.PjT;
                        }
                    }
                }
                if(f15 >= f5) {
                    f16 = 0.0f;
                }
                else if(TextUtils.equals(s, "center")) {
                    f16 = (f5 - f15) / 2.0f;
                }
                else if(TextUtils.equals(s, "flex-end")) {
                    f16 = f5 - f15;
                }
                else if(TextUtils.equals(s, "space-around")) {
                    f16 = DWo.PjT((f5 - f15) / ((float)(list1.size() + 1)));
                    f17 = f16;
                    goto label_103;
                }
                else if(TextUtils.equals(s, "space-between") && list1.size() > 1) {
                    f17 = DWo.PjT((f5 - f15) / (((float)list1.size()) - 1.0f));
                    f16 = 0.0f;
                    goto label_103;
                }
                f17 = 0.0f;
            label_103:
                sM0.PjT += f16;
                float f18 = 0.0f;
                for(Object object3: list1) {
                    Au au3 = (Au)object3;
                    float f19 = this.Zh.PjT(au3) == null ? 0.0f : this.Zh.PjT(au3).Zh;
                    switch(au3.DWo().JQp().Xe()) {
                        case 1: 
                        case 2: {
                            f20 = 0.0f;
                            break;
                        }
                        default: {
                            f20 = f19;
                        }
                    }
                    f18 = Math.max(f18, f20);
                }
                float f21 = f11;
                for(Object object4: list1) {
                    Au au4 = (Au)object4;
                    ReZ zh$ReZ3 = this.Zh.PjT(au4);
                    cz cz3 = au4.DWo().JQp();
                    float f22 = (float)cz3.tY();
                    float f23 = (float)cz3.MWx();
                    float f24 = (float)cz3.xH();
                    float f25 = (float)cz3.dwk();
                    float f26 = zh$ReZ3 == null ? 0.0f : zh$ReZ3.PjT;
                    if(zh$ReZ3 == null) {
                        list2 = list1;
                        f27 = 0.0f;
                    }
                    else {
                        f27 = zh$ReZ3.Zh;
                        list2 = list1;
                    }
                    float f28 = TextUtils.equals(au0.ReZ(), "root") ? ((float)v) : f21;
                    if(cz3.Xe() == 1) {
                        f29 = f28;
                        sM1 = this.PjT(zh0, cz3, f26 - f23 - f25, f27 - f22 - f24);
                    }
                    else {
                        f29 = f28;
                        sM1 = sM0;
                    }
                    if(cz3.Xe() == 2) {
                        f30 = f14;
                        au5 = au4;
                        sM2 = this.PjT(cz3, this.Zh.PjT(this.ReZ), new ReZ(f26 - f23 - f25, f27 - f22 - f24));
                    }
                    else {
                        f30 = f14;
                        au5 = au4;
                        sM2 = sM1;
                    }
                    String s2 = cz0.fK();
                    if(f18 <= f27 || TextUtils.equals(s2, "flex-start")) {
                        f31 = 0.0f;
                    }
                    else {
                        s2.hashCode();
                        if(s2.equals("center")) {
                            f31 = (f18 - f27) / 2.0f;
                        }
                        else if(s2.equals("flex-end")) {
                            f31 = f18 - f27;
                        }
                    }
                    Zh zh1 = new Zh();
                    zh1.PjT = sM2.PjT + f25;
                    zh1.Zh = sM2.Zh + f22 + f31;
                    zh1.ReZ = f26 - f23 - f25;
                    zh1.cr = f27 - f22 - f24;
                    zh1.JQp = zh0.JQp + "." + au5.ReZ();
                    zh1.Au = zh0;
                    zh1.cz = au5;
                    zh1.SM = f30;
                    list1 = list2;
                    zh1.DWo = list1;
                    au5.ReZ(zh1.PjT);
                    zh1.cz.cr(zh1.Zh);
                    zh1.cz.JQp(zh1.ReZ);
                    zh1.cz.cz(zh1.cr);
                    Zh zh2 = this.PjT(zh1, f29);
                    ((List)zh0.XX.get(v)).add(zh2);
                    switch(cz3.Xe()) {
                        case 1: {
                            sM3 = sM0;
                            break;
                        }
                        case 2: {
                            sM3 = sM0;
                            break;
                        }
                        default: {
                            sM3 = sM0;
                            sM3.PjT += f26 + f17;
                        }
                    }
                    sM0 = sM3;
                    f21 = f29;
                    f14 = f30;
                }
                sM0.PjT = f4;
                sM0.Zh += f18 + f12;
                f9 = f12;
                f10 = f21;
            }
        }
        return zh0;
    }

    public void PjT() {
        this.Zh.PjT();
    }

    public void PjT(PjT jQp$PjT0) {
        this.cr = jQp$PjT0;
    }

    public void PjT(Au au0, float f, float f1) {
        if(au0 != null) {
            this.ReZ = au0;
        }
        Au au1 = this.ReZ;
        float f2 = au1.Au();
        float f3 = au1.SM();
        float f4 = TextUtils.equals(au1.DWo().JQp().iZZ(), "fixed") ? f3 : 65536.0f;
        this.Zh.PjT();
        this.Zh.ReZ(au1, f2, f4);
        ReZ zh$ReZ0 = this.Zh.PjT(au1);
        Zh zh0 = new Zh();
        zh0.PjT = f;
        zh0.Zh = f1;
        if(zh$ReZ0 != null) {
            f2 = zh$ReZ0.PjT;
        }
        zh0.ReZ = f2;
        if(zh$ReZ0 != null) {
            f3 = zh$ReZ0.Zh;
        }
        zh0.cr = f3;
        zh0.JQp = "root";
        zh0.SM = 1280.0f;
        zh0.cz = au1;
        au1.ReZ(f);
        zh0.cz.cr(zh0.Zh);
        zh0.cz.JQp(zh0.ReZ);
        zh0.cz.cz(zh0.cr);
        Zh zh1 = this.PjT(zh0, 0.0f);
        this.PjT = zh1;
        this.PjT(zh1);
    }

    public void PjT(Zh zh0) {
        if(zh0 == null) {
            return;
        }
        zh0.cz.DWo().Zh();
        List list0 = zh0.XX;
        if(list0 != null && list0.size() > 0) {
            for(Object object0: list0) {
                List list1 = (List)object0;
                if(list1 != null && list1.size() > 0) {
                    for(Object object1: list1) {
                        this.PjT(((Zh)object1));
                    }
                }
            }
        }
    }
}

