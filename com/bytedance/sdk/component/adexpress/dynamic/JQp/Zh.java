package com.bytedance.sdk.component.adexpress.dynamic.JQp;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.adexpress.dynamic.cr.JQp;
import com.bytedance.sdk.component.adexpress.dynamic.cr.cz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class Zh {
    static class PjT implements Cloneable {
        float PjT;
        float ReZ;
        boolean Zh;

        @Override
        public Object clone() {
            try {
                return (PjT)super.clone();
            }
            catch(CloneNotSupportedException unused_ex) {
                return null;
            }
        }
    }

    static class ReZ {
        float PjT;
        float Zh;

        public ReZ() {
        }

        public ReZ(float f, float f1) {
            this.PjT = f;
            this.Zh = f1;
        }

        @Override
        public String toString() {
            return "UnitSize{width=" + this.PjT + ", height=" + this.Zh + '}';
        }
    }

    static class com.bytedance.sdk.component.adexpress.dynamic.JQp.Zh.Zh {
        float JQp;
        float PjT;
        int ReZ;
        int Zh;
        double cr;

        static JSONObject PjT(com.bytedance.sdk.component.adexpress.dynamic.JQp.Zh.Zh zh$Zh0) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("fontSize", ((double)zh$Zh0.PjT));
                jSONObject0.put("letterSpacing", zh$Zh0.Zh);
                jSONObject0.put("lineHeight", zh$Zh0.cr);
                jSONObject0.put("maxWidth", ((double)zh$Zh0.JQp));
                jSONObject0.put("fontWeight", zh$Zh0.ReZ);
            }
            catch(JSONException unused_ex) {
            }
            return jSONObject0;
        }
    }

    private String Au;
    private double JQp;
    public Map PjT;
    public Map ReZ;
    private xs SM;
    private double XX;
    public Map Zh;
    private double cr;
    private int cz;

    public Zh(double f, int v, double f1, String s, xs xs0) {
        this.PjT = new HashMap();
        this.Zh = new HashMap();
        this.ReZ = new HashMap();
        this.cr = Math.random();
        this.JQp = f;
        this.cz = v;
        this.XX = f1;
        this.Au = s;
        this.SM = xs0;
    }

    private ReZ JQp(Au au0, float f, float f1) {
        String s = au0.ReZ() + "_" + f + "_" + f1;
        if(this.ReZ.containsKey(s)) {
            return (ReZ)this.ReZ.get(s);
        }
        ReZ zh$ReZ0 = this.cz(au0, f, f1);
        this.ReZ.put(s, zh$ReZ0);
        return zh$ReZ0;
    }

    private String JQp(Au au0) {
        return au0.ReZ();
    }

    private ReZ PjT(String s, com.bytedance.sdk.component.adexpress.dynamic.JQp.Zh.Zh zh$Zh0, boolean z, boolean z1, int v, Au au0) {
        return qj.PjT(s, au0.DWo().Zh(), com.bytedance.sdk.component.adexpress.dynamic.JQp.Zh.Zh.PjT(zh$Zh0).toString(), z, z1, v, au0, this.JQp, this.cz, this.XX, this.Au, this.SM);
    }

    private void PjT(Au au0, ReZ zh$ReZ0) {
        String s = this.JQp(au0);
        this.PjT.put(s, zh$ReZ0);
    }

    private void PjT(List list0, float f, float f1) {
        if(list0 != null && list0.size() > 0) {
            int v1 = 0;
            for(Object object0: list0) {
                if(this.PjT(((List)object0), false)) {
                    v1 = 1;
                }
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: list0) {
                PjT zh$PjT0 = new PjT();
                boolean z = this.PjT(((List)object1), ((boolean)(v1 ^ 1)));
                zh$PjT0.PjT = z ? 1.0f : this.Zh(((List)object1), f, f1).Zh;
                zh$PjT0.Zh = !z;
                arrayList0.add(zh$PjT0);
            }
            List list1 = DWo.PjT(f1, arrayList0);
            for(int v = 0; v < list0.size(); ++v) {
                if(((PjT)arrayList0.get(v)).PjT != ((PjT)list1.get(v)).PjT) {
                    List list2 = (List)list0.get(v);
                    this.ReZ(list2);
                    this.Zh(list2, f, ((PjT)list1.get(v)).PjT);
                }
            }
        }
    }

    private void PjT(List list0, float f, List list1) {
        float f1 = 0.0f;
        for(Object object0: list0) {
            PjT zh$PjT0 = (PjT)object0;
            if(zh$PjT0.Zh) {
                f1 += zh$PjT0.PjT;
            }
        }
        if(f1 > f) {
            int v2 = 0;
            for(int v1 = 0; v1 < list1.size(); ++v1) {
                if(((PjT)list0.get(v1)).Zh && ((Au)list1.get(v1)).Sks()) {
                    ++v2;
                }
            }
            if(v2 > 0) {
                double f2 = Math.ceil((f1 - f) / ((float)v2) * 1000.0f);
                for(int v = 0; v < list1.size(); ++v) {
                    PjT zh$PjT1 = (PjT)list0.get(v);
                    if(zh$PjT1.Zh && ((Au)list1.get(v)).Sks()) {
                        zh$PjT1.PjT -= (float)(f2 / 1000.0);
                    }
                }
            }
        }
    }

    private void PjT(List list0, ReZ zh$ReZ0) {
        String s = this.cr(list0);
        this.Zh.put(s, zh$ReZ0);
    }

    private boolean PjT(List list0, boolean z) {
        for(Object object0: list0) {
            cz cz0 = ((Au)object0).DWo().JQp();
            String s = cz0.iZZ();
            if(TextUtils.equals(s, "flex") || z && (TextUtils.equals(cz0.Yo(), "flex") && TextUtils.equals(cz0.iZZ(), "scale") && ((int)(((Integer)JQp.PjT.get(((Au)object0).DWo().Zh())))) == 7 || TextUtils.equals(s, "flex"))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        for(Object object1: list0) {
            if(this.ReZ(((Au)object1))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public ReZ PjT(Au au0) {
        String s = this.JQp(au0);
        return (ReZ)this.PjT.get(s);
    }

    public ReZ PjT(Au au0, float f, float f1) {
        if(TextUtils.isEmpty(au0.DWo().ReZ()) && au0.DWo().JQp().wKV() == null) {
            return new ReZ(0.0f, 0.0f);
        }
        if(TextUtils.equals(au0.DWo().Zh(), "creative-playable-bait")) {
            return new ReZ(0.0f, 0.0f);
        }
        float f2 = au0.Au();
        float f3 = au0.SM();
        cz cz0 = au0.DWo().JQp();
        String s = cz0.Yo();
        String s1 = cz0.iZZ();
        float f4 = (float)au0.xs();
        float f5 = (float)au0.fDm();
        float f6 = au0.qla();
        float f7 = au0.xE();
        if(TextUtils.equals(s, "fixed")) {
            f = Math.min(f2, f);
            if(TextUtils.equals(s1, "auto")) {
                f3 = this.Zh(au0, f - f6, f1 - f7).Zh + f7;
            }
        }
        else if(TextUtils.equals(s, "auto")) {
            ReZ zh$ReZ0 = this.Zh(au0, f - f6, f1 - f7);
            f = zh$ReZ0.PjT + f6;
            if(TextUtils.equals(s1, "auto")) {
                f3 = zh$ReZ0.Zh + f7;
            }
        }
        else if(!TextUtils.equals(s, "flex")) {
            f = f2;
        }
        else if(TextUtils.equals(s1, "auto")) {
            f3 = this.Zh(au0, f - f6, f1 - f7).Zh + f7;
        }
        if(TextUtils.equals(s1, "scale")) {
            float f8 = ((float)Math.round((f - f4) / f3)) + f5;
            if(f8 > f1) {
                f = ((float)Math.round((f1 - f5) * f3)) + f4;
            }
            else {
                f1 = f8;
            }
        }
        else if(TextUtils.equals(s1, "fixed")) {
            f1 = Math.min(f3 + f5, f1);
        }
        else if(!TextUtils.equals(s1, "flex")) {
            f1 = f3;
        }
        ReZ zh$ReZ1 = new ReZ();
        zh$ReZ1.PjT = f;
        zh$ReZ1.Zh = f1;
        return zh$ReZ1;
    }

    public ReZ PjT(List list0) {
        String s = this.cr(list0);
        return (ReZ)this.Zh.get(s);
    }

    public void PjT() {
        this.ReZ.clear();
        this.PjT.clear();
        this.Zh.clear();
    }

    private ReZ ReZ(List list0, float f, float f1) {
        float f2;
        this.cr(list0);
        ReZ zh$ReZ0 = new ReZ();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: list0) {
            Au au0 = (Au)object0;
            cz cz0 = au0.DWo().JQp();
            switch(cz0.Xe()) {
                case 1: 
                case 2: {
                    arrayList0.add(au0);
                }
            }
            if(cz0.Xe() != 1 && cz0.Xe() != 2) {
                arrayList1.add(au0);
            }
        }
        for(Object object1: arrayList0) {
            this.ReZ(((Au)object1), f, f1);
        }
        if(arrayList1.size() <= 0) {
            return zh$ReZ0;
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: arrayList1) {
            arrayList2.add(this.ReZ(((Au)object2), f, f1).PjT);
        }
        ArrayList arrayList3 = new ArrayList();
        for(int v1 = 0; true; ++v1) {
            f2 = 0.0f;
            if(v1 >= arrayList1.size()) {
                break;
            }
            Au au1 = (Au)arrayList1.get(v1);
            String s = au1.DWo().JQp().Yo();
            float f3 = au1.Au();
            boolean z = TextUtils.equals(s, "flex");
            if(TextUtils.equals(s, "auto")) {
                z = false;
                List list1 = au1.ub();
                if(list1 != null && list1.size() > 0) {
                    for(Object object3: list1) {
                        if(this.Zh(((List)object3))) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            PjT zh$PjT0 = new PjT();
            if(!z) {
                f3 = (float)(((Float)arrayList2.get(v1)));
            }
            zh$PjT0.PjT = f3;
            zh$PjT0.Zh = !z;
            if(z) {
                f2 = (float)(((Float)arrayList2.get(v1)));
            }
            zh$PjT0.ReZ = f2;
            arrayList3.add(zh$PjT0);
        }
        this.PjT(arrayList3, f, arrayList1);
        List list2 = DWo.PjT(f, arrayList3);
        float f4 = 0.0f;
        for(int v2 = 0; v2 < arrayList1.size(); ++v2) {
            f4 += ((PjT)list2.get(v2)).PjT;
            if(((float)(((Float)arrayList2.get(v2)))) != ((PjT)list2.get(v2)).PjT) {
                this.cr(((Au)arrayList1.get(v2)));
            }
        }
        int v3 = 0;
        boolean z1 = false;
        for(Object object4: arrayList1) {
            ++v3;
            if(!this.Zh(((Au)object4))) {
                z1 = false;
                break;
            }
            if(v3 == arrayList1.size()) {
                z1 = true;
            }
        }
        if(z1) {
            f2 = f1;
        }
        ArrayList arrayList4 = new ArrayList();
        for(int v4 = 0; v4 < arrayList1.size(); ++v4) {
            Au au2 = (Au)arrayList1.get(v4);
            ReZ zh$ReZ1 = this.ReZ(au2, ((PjT)list2.get(v4)).PjT, f1);
            if(!this.Zh(au2)) {
                f2 = Math.max(f2, zh$ReZ1.Zh);
            }
            arrayList4.add(zh$ReZ1);
        }
        ArrayList arrayList5 = new ArrayList();
        for(Object object5: arrayList4) {
            arrayList5.add(((ReZ)object5).Zh);
        }
        if(!z1) {
            for(int v = 0; v < arrayList1.size(); ++v) {
                Au au3 = (Au)arrayList1.get(v);
                if(this.Zh(au3) && ((float)(((Float)arrayList5.get(v)))) != f2) {
                    this.cr(au3);
                    this.ReZ(au3, ((PjT)list2.get(v)).PjT, f2);
                }
            }
        }
        zh$ReZ0.PjT = f4;
        zh$ReZ0.Zh = f2;
        return zh$ReZ0;
    }

    private void ReZ(List list0) {
        if(list0 != null && list0.size() > 0) {
            String s = this.cr(list0);
            this.Zh.remove(s);
            for(Object object0: list0) {
                this.cr(((Au)object0));
            }
        }
    }

    private boolean ReZ(Au au0) {
        if(au0.gK()) {
            return false;
        }
        if(!TextUtils.equals(au0.DWo().JQp().iZZ(), "auto")) {
            return false;
        }
        List list0 = au0.ub();
        if(list0 != null && list0.size() > 0) {
            if(list0.size() == 1) {
                for(Object object0: ((List)list0.get(0))) {
                    if(!this.Zh(((Au)object0))) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
                return true;
            }
            for(Object object1: list0) {
                if(this.PjT(((List)object1), true)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public ReZ ReZ(Au au0, float f, float f1) {
        if(au0 == null) {
            return null;
        }
        ReZ zh$ReZ0 = this.PjT(au0);
        if(zh$ReZ0 == null || zh$ReZ0.PjT == 0.0f && zh$ReZ0.Zh == 0.0f) {
            zh$ReZ0 = this.cr(au0, f, f1);
            this.PjT(au0, zh$ReZ0);
        }
        return zh$ReZ0;
    }

    private ReZ Zh(List list0, float f, float f1) {
        ReZ zh$ReZ0 = this.PjT(list0);
        if(zh$ReZ0 == null || zh$ReZ0.PjT == 0.0f && zh$ReZ0.Zh == 0.0f) {
            zh$ReZ0 = this.ReZ(list0, f, f1);
            this.PjT(list0, zh$ReZ0);
        }
        return zh$ReZ0;
    }

    private boolean Zh(Au au0) {
        if(au0 == null) {
            return false;
        }
        return TextUtils.equals(au0.DWo().JQp().iZZ(), "flex") ? true : this.ReZ(au0);
    }

    private boolean Zh(List list0) {
        boolean z;
        for(Object object0: list0) {
            if(TextUtils.equals(((Au)object0).DWo().JQp().Yo(), "flex")) {
                return true;
            }
            if(false) {
                break;
            }
        }
        Iterator iterator1 = list0.iterator();
    alab1:
        while(true) {
            z = false;
            while(true) {
                if(!iterator1.hasNext()) {
                    break alab1;
                }
                Object object1 = iterator1.next();
                Au au0 = (Au)object1;
                if(TextUtils.equals(au0.DWo().JQp().Yo(), "auto")) {
                    List list1 = au0.ub();
                    if(list1 != null) {
                        int v = 0;
                        Iterator iterator2 = list1.iterator();
                    label_16:
                        if(iterator2.hasNext()) {
                            Object object2 = iterator2.next();
                            List list2 = (List)object2;
                            ++v;
                            if(this.Zh(list2)) {
                                if(v != list2.size()) {
                                    goto label_16;
                                }
                                z = true;
                                goto label_16;
                            }
                            break;
                        }
                    }
                }
            }
        }
        return z;
    }

    public ReZ Zh(Au au0, float f, float f1) {
        ReZ zh$ReZ0 = new ReZ();
        if(au0.DWo().JQp() == null) {
            return zh$ReZ0;
        }
        ReZ zh$ReZ1 = this.JQp(au0, f, f1);
        zh$ReZ0.PjT = Math.min(zh$ReZ1.PjT, f);
        zh$ReZ0.Zh = Math.min(zh$ReZ1.Zh, f1);
        return zh$ReZ0;
    }

    private String cr(List list0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < list0.size(); ++v) {
            String s = ((Au)list0.get(v)).ReZ();
            if(v < list0.size() - 1) {
                stringBuilder0.append(s);
                stringBuilder0.append("-");
            }
            else {
                stringBuilder0.append(s);
            }
        }
        return stringBuilder0.toString();
    }

    private void cr(Au au0) {
        String s = this.JQp(au0);
        this.PjT.remove(s);
        List list0 = au0.ub();
        if(list0 != null && list0.size() > 0) {
            for(Object object0: list0) {
                this.ReZ(((List)object0));
            }
        }
    }

    public ReZ cr(Au au0, float f, float f1) {
        float f7;
        ReZ zh$ReZ0 = new ReZ();
        float f2 = 0.0f;
        if(f1 > 0.0f && f > 0.0f) {
            if(au0.gK()) {
                return this.PjT(au0, f, f1);
            }
            float f3 = au0.SM();
            float f4 = au0.qla();
            float f5 = au0.xE();
            cz cz0 = au0.DWo().JQp();
            String s = cz0.Yo();
            String s1 = cz0.iZZ();
            float f6 = (TextUtils.equals(s, "flex") || TextUtils.equals(s, "auto") ? f : Math.min(au0.Au(), f)) - f4;
            if(TextUtils.equals(s1, "scale")) {
                f7 = ((float)Math.round(f6 / f3)) + f5;
                if(f7 > f1) {
                    f6 = (float)Math.round((f1 - f5) * f3);
                    f7 = f1;
                }
            }
            else {
                f7 = TextUtils.equals(s1, "auto") || TextUtils.equals(s1, "flex") ? f1 : Math.min(f3, f1);
            }
            float f8 = f7 - f5;
            List list0 = au0.ub();
            float f9 = 0.0f;
            float f10 = 0.0f;
            for(Object object0: list0) {
                ReZ zh$ReZ1 = this.Zh(((List)object0), f6, f8);
                if(this.Zh(((List)object0))) {
                    ++f2;
                }
                else {
                    f9 = Math.max(f9, zh$ReZ1.PjT);
                }
                if(au0.DWo().Zh().equals("carousel")) {
                    f10 = Math.max(au0.SM(), zh$ReZ1.Zh);
                }
                else {
                    f10 += zh$ReZ1.Zh;
                }
            }
            if(TextUtils.equals(s, "auto")) {
                if(f2 == ((float)list0.size())) {
                    f6 = f;
                }
                else {
                    for(Object object1: list0) {
                        this.ReZ(((List)object1));
                        this.Zh(((List)object1), f9, f8);
                    }
                    f6 = f9;
                }
            }
            if(!TextUtils.equals(s1, "auto")) {
                if((TextUtils.equals(s1, "fixed") || TextUtils.equals(s1, "flex")) && f8 < f10) {
                    this.PjT(list0, f6, f8);
                }
            }
            else if(f10 <= f1) {
                f8 = f10;
            }
            else {
                this.PjT(list0, f6, f8);
            }
            zh$ReZ0.PjT = Math.min(f6 + f4, f);
            zh$ReZ0.Zh = Math.min(f8 + f5, f1);
            return zh$ReZ0;
        }
        zh$ReZ0.PjT = 0.0f;
        zh$ReZ0.Zh = 0.0f;
        return zh$ReZ0;
    }

    private ReZ cz(Au au0, float f, float f1) {
        new ReZ();
        cz cz0 = au0.DWo().JQp();
        au0.DWo().ReZ();
        com.bytedance.sdk.component.adexpress.dynamic.JQp.Zh.Zh zh$Zh0 = new com.bytedance.sdk.component.adexpress.dynamic.JQp.Zh.Zh();
        zh$Zh0.PjT = cz0.gK();
        zh$Zh0.Zh = cz0.cI();
        zh$Zh0.ReZ = cz0.HG();
        zh$Zh0.cr = cz0.Ld();
        zh$Zh0.JQp = f;
        return this.PjT(au0.DWo().ReZ(), zh$Zh0, cz0.OMu(), cz0.zZ(), cz0.VY(), au0);
    }
}

