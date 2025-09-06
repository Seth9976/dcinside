package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.adsdk.ugeno.ReZ.Zh;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.adsdk.ugeno.cr.PjT.PjT;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class SM {
    private JQp Au;
    private Au DWo;
    private xf JQp;
    private Context PjT;
    private ReZ ReZ;
    private String SM;
    private xs XX;
    private JSONObject Zh;
    private cz cr;
    private qla cz;
    private boolean fDm;
    private boolean qj;
    private List qla;
    private boolean xf;
    private PjT xs;

    public SM(Context context0) {
        this.qj = true;
        this.xf = false;
        this.PjT = context0;
    }

    private void PjT(ReZ reZ0) {
        if(reZ0 == null) {
            return;
        }
        JSONObject jSONObject0 = reZ0.Lrd();
        Iterator iterator0 = jSONObject0.keys();
        com.bytedance.adsdk.ugeno.Zh.PjT pjT0 = reZ0.ZX();
        com.bytedance.adsdk.ugeno.Zh.PjT.PjT pjT$PjT0 = pjT0 == null ? null : pjT0.DWo();
        this.Zh(reZ0);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            String s1 = Zh.PjT(jSONObject0.optString(s), this.Zh);
            reZ0.PjT(s, s1);
            if(pjT$PjT0 != null) {
                pjT$PjT0.PjT(this.PjT, s, s1);
            }
        }
        reZ0.PjT(this.cr);
        reZ0.PjT(this.JQp);
        reZ0.PjT(this.XX);
        if(reZ0 instanceof com.bytedance.adsdk.ugeno.Zh.PjT) {
            List list0 = ((com.bytedance.adsdk.ugeno.Zh.PjT)reZ0).SM();
            if(list0 != null && list0.size() > 0) {
                for(Object object1: list0) {
                    this.PjT(((ReZ)object1));
                }
            }
        }
        if(pjT$PjT0 != null) {
            reZ0.PjT(pjT$PjT0.PjT());
        }
        reZ0.Zh();
    }

    public ReZ PjT(com.bytedance.adsdk.ugeno.core.JQp.PjT jQp$PjT0, ReZ reZ0) {
        com.bytedance.adsdk.ugeno.Zh.PjT.PjT pjT$PjT0 = null;
        if(!JQp.PjT(jQp$PjT0)) {
            return null;
        }
        String s = jQp$PjT0.ReZ();
        com.bytedance.adsdk.ugeno.core.Zh zh0 = cr.PjT(s);
        if(zh0 == null) {
            this.fDm = true;
            if(this.qla == null) {
                this.qla = new ArrayList();
            }
            this.qla.add(s);
            s = "View";
            jQp$PjT0.PjT("View");
            zh0 = cr.PjT("View");
            Log.d("UGTemplateEngine", "unknown component; use view widget");
            if(zh0 == null) {
                Log.d("UGTemplateEngine", "not found component View");
                return null;
            }
        }
        ReZ reZ1 = zh0.PjT(this.PjT);
        if(reZ1 == null) {
            return null;
        }
        JSONObject jSONObject0 = jQp$PjT0.cr();
        reZ1.JQp(Zh.PjT(jQp$PjT0.PjT(), this.Zh));
        reZ1.cz(s);
        reZ1.ReZ(jSONObject0);
        reZ1.PjT(jQp$PjT0);
        reZ1.Zh(this.Zh);
        JQp jQp0 = this.Au;
        if(jQp0 == null) {
            reZ1.PjT(true);
        }
        else {
            reZ1.PjT(jQp0.cr());
        }
        reZ1.PjT(this.DWo);
        reZ1.PjT(this.xs);
        Iterator iterator0 = jSONObject0.keys();
        if(reZ0 instanceof com.bytedance.adsdk.ugeno.Zh.PjT) {
            pjT$PjT0 = ((com.bytedance.adsdk.ugeno.Zh.PjT)reZ0).DWo();
            reZ1.PjT(((com.bytedance.adsdk.ugeno.Zh.PjT)reZ0));
        }
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s1 = (String)object0;
            String s2 = Zh.PjT(jSONObject0.optString(s1), this.Zh);
            reZ1.PjT(s1, s2);
            if(pjT$PjT0 != null) {
                pjT$PjT0.PjT(this.PjT, s1, s2);
            }
        }
        if(pjT$PjT0 != null) {
            reZ1.PjT(pjT$PjT0.PjT());
        }
        if(reZ1 instanceof com.bytedance.adsdk.ugeno.Zh.PjT) {
            List list0 = jQp$PjT0.JQp();
            if(list0 != null && list0.size() > 0) {
                if(TextUtils.equals(reZ1.Co(), "Swiper") && list0.size() != 1) {
                    Log.e("UGTemplateEngine", "Swiper must be only one widget");
                }
                for(Object object1: list0) {
                    ReZ reZ2 = this.PjT(((com.bytedance.adsdk.ugeno.core.JQp.PjT)object1), reZ1);
                    if(reZ2 != null && !reZ2.MWx()) {
                        ((com.bytedance.adsdk.ugeno.Zh.PjT)reZ1).PjT(reZ2, reZ2.iZZ());
                    }
                }
                this.ReZ = reZ1;
                return reZ1;
            }
            if(TextUtils.equals(reZ1.Co(), "RecyclerLayout")) {
                List list1 = this.Au.ReZ();
                if(list1 != null && list1.size() > 0) {
                    for(Object object2: list1) {
                        ReZ reZ3 = this.PjT(((com.bytedance.adsdk.ugeno.core.JQp.PjT)object2), reZ1);
                        if(reZ3 != null && reZ3.Zd()) {
                            ((com.bytedance.adsdk.ugeno.Zh.PjT)reZ1).PjT(reZ3);
                        }
                    }
                }
            }
            return reZ1;
        }
        this.ReZ = reZ1;
        return reZ1;
    }

    public ReZ PjT(com.bytedance.adsdk.ugeno.core.JQp.PjT jQp$PjT0, JSONObject jSONObject0, JSONObject jSONObject1) {
        this.Zh = jSONObject0;
        qla qla0 = this.cz;
        if(qla0 != null) {
            qla0.PjT();
        }
        this.xs = new PjT();
        if(this.JQp instanceof com.bytedance.adsdk.ugeno.core.PjT.Zh) {
            throw null;
        }
        this.ReZ = this.PjT(jQp$PjT0, null);
        qla qla1 = this.cz;
        if(qla1 != null) {
            qla1.Zh();
            this.ReZ.PjT(this.cz);
        }
        this.PjT(this.ReZ);
        return this.ReZ;
    }

    public ReZ PjT(JSONObject jSONObject0) {
        qla qla0 = this.cz;
        if(qla0 != null) {
            qla0.PjT();
        }
        JQp jQp0 = new JQp(jSONObject0, this.Zh);
        this.Au = jQp0;
        if(this.JQp instanceof com.bytedance.adsdk.ugeno.core.PjT.Zh) {
            throw null;
        }
        this.ReZ = this.Zh(jQp0.PjT(), null);
        qla qla1 = this.cz;
        if(qla1 != null) {
            qla1.Zh();
            this.ReZ.PjT(this.cz);
        }
        return this.ReZ;
    }

    public ReZ PjT(JSONObject jSONObject0, JSONObject jSONObject1, JSONObject jSONObject2) {
        this.Zh = jSONObject1;
        qla qla0 = this.cz;
        if(qla0 != null) {
            qla0.PjT();
        }
        this.Au = new JQp(jSONObject0, jSONObject1, jSONObject2);
        this.xs = new PjT();
        if(this.JQp instanceof com.bytedance.adsdk.ugeno.core.PjT.Zh) {
            throw null;
        }
        this.ReZ = this.PjT(this.Au.PjT(), null);
        qla qla1 = this.cz;
        if(qla1 != null) {
            qla1.Zh();
            this.ReZ.PjT(this.cz);
        }
        this.PjT(this.ReZ);
        return this.ReZ;
    }

    public void PjT(ReZ reZ0, JSONObject jSONObject0) {
        if(reZ0 == null) {
            return;
        }
        if(reZ0 instanceof com.bytedance.adsdk.ugeno.Zh.PjT) {
            reZ0.PjT(jSONObject0);
            List list0 = ((com.bytedance.adsdk.ugeno.Zh.PjT)reZ0).SM();
            if(list0 != null && list0.size() > 0) {
                for(Object object0: list0) {
                    this.PjT(((ReZ)object0), jSONObject0);
                }
            }
            return;
        }
        reZ0.PjT(jSONObject0);
    }

    public void PjT(xf xf0) {
        com.bytedance.adsdk.ugeno.core.PjT.PjT pjT0 = com.bytedance.adsdk.ugeno.JQp.PjT().JQp();
        if(pjT0 == null) {
            this.JQp = xf0;
            return;
        }
        if(pjT0.PjT(xf0) != null) {
            throw null;
        }
        this.JQp = xf0;
    }

    public void PjT(xs xs0) {
        this.XX = xs0;
    }

    public void PjT(String s, Au au0) {
        this.DWo = au0;
        this.SM = s;
        if(au0 != null) {
            this.Zh = au0.PjT();
        }
    }

    public boolean PjT() {
        return this.fDm;
    }

    private void Zh(ReZ reZ0) {
        try {
            if(reZ0.Qf() && reZ0.KM() != null && reZ0.KM().cz() != null) {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("i18n", reZ0.KM().cz());
                this.Zh.put("xNode", jSONObject0);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public ReZ Zh(com.bytedance.adsdk.ugeno.core.JQp.PjT jQp$PjT0, ReZ reZ0) {
        com.bytedance.adsdk.ugeno.Zh.PjT.PjT pjT$PjT0 = null;
        if(!JQp.PjT(jQp$PjT0)) {
            return null;
        }
        String s = jQp$PjT0.ReZ();
        com.bytedance.adsdk.ugeno.core.Zh zh0 = cr.PjT(s);
        if(zh0 == null) {
            Log.d("UGTemplateEngine", "not found component " + s);
            this.fDm = true;
            if(this.qla == null) {
                this.qla = new ArrayList();
            }
            this.qla.add(s);
            return null;
        }
        ReZ reZ1 = zh0.PjT(this.PjT);
        if(reZ1 == null) {
            return null;
        }
        reZ1.JQp(Zh.PjT(jQp$PjT0.PjT(), this.Zh));
        reZ1.cz(s);
        reZ1.ReZ(jQp$PjT0.cr());
        reZ1.PjT(jQp$PjT0);
        reZ1.PjT(this.DWo);
        if(reZ0 instanceof com.bytedance.adsdk.ugeno.Zh.PjT) {
            reZ1.PjT(((com.bytedance.adsdk.ugeno.Zh.PjT)reZ0));
            pjT$PjT0 = ((com.bytedance.adsdk.ugeno.Zh.PjT)reZ0).DWo();
        }
        Iterator iterator0 = jQp$PjT0.cr().keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s1 = (String)object0;
            String s2 = Zh.PjT(jQp$PjT0.cr().optString(s1), this.Zh);
            reZ1.PjT(s1, s2);
            if(pjT$PjT0 != null) {
                pjT$PjT0.PjT(this.PjT, s1, s2);
            }
        }
        if(reZ1 instanceof com.bytedance.adsdk.ugeno.Zh.PjT) {
            List list0 = jQp$PjT0.JQp();
            if(list0 != null && list0.size() > 0) {
                if(TextUtils.equals(reZ1.Co(), "Swiper") && list0.size() != 1) {
                    Log.e("UGTemplateEngine", "Swiper must be only one widget");
                }
                for(Object object1: list0) {
                    ReZ reZ2 = this.Zh(((com.bytedance.adsdk.ugeno.core.JQp.PjT)object1), reZ1);
                    if(reZ2 != null && reZ2.Zd()) {
                        ((com.bytedance.adsdk.ugeno.Zh.PjT)reZ1).PjT(reZ2);
                    }
                }
                goto label_56;
            }
            if(TextUtils.equals(reZ1.Co(), "RecyclerLayout")) {
                List list1 = this.Au.ReZ();
                if(list1 != null && list1.size() > 0) {
                    for(Object object2: list1) {
                        ReZ reZ3 = this.Zh(((com.bytedance.adsdk.ugeno.core.JQp.PjT)object2), reZ1);
                        if(reZ3 != null && reZ3.Zd()) {
                            ((com.bytedance.adsdk.ugeno.Zh.PjT)reZ1).PjT(reZ3);
                        }
                    }
                }
            }
            return reZ1;
        }
    label_56:
        if(pjT$PjT0 != null) {
            reZ1.PjT(pjT$PjT0.PjT());
        }
        this.ReZ = reZ1;
        return reZ1;
    }

    public List Zh() {
        return this.qla;
    }

    public void Zh(JSONObject jSONObject0) {
        qla qla0 = this.cz;
        if(qla0 != null) {
            qla0.ReZ();
        }
        this.Zh = jSONObject0;
        this.PjT(this.ReZ, jSONObject0);
        this.PjT(this.ReZ);
        if(this.cz != null) {
            fDm fDm0 = new fDm();
            fDm0.PjT(0);
            fDm0.PjT(this.ReZ);
            this.cz.PjT(fDm0);
        }
    }
}

