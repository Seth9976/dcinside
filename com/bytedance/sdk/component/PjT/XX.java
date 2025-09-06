package com.bytedance.sdk.component.PjT;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

class XX implements PjT {
    static final class com.bytedance.sdk.component.PjT.XX.PjT {
        boolean PjT;
        String Zh;

        private com.bytedance.sdk.component.PjT.XX.PjT(boolean z, String s) {
            this.PjT = z;
            this.Zh = s;
        }

        com.bytedance.sdk.component.PjT.XX.PjT(boolean z, String s, com.bytedance.sdk.component.PjT.XX.1 xX$10) {
            this(z, s);
        }
    }

    private final boolean Au;
    private final com.bytedance.sdk.component.PjT.PjT DWo;
    private final List JQp;
    private final Au PjT;
    private final Map ReZ;
    private final boolean SM;
    private final xs XX;
    private final Owx Zh;
    private final Map cr;
    private final Set cz;

    XX(DWo dWo0, com.bytedance.sdk.component.PjT.PjT pjT0, RD rD0) {
        this.ReZ = new HashMap();
        this.cr = new HashMap();
        this.JQp = new ArrayList();
        this.cz = new HashSet();
        this.DWo = pjT0;
        this.PjT = dWo0.cr;
        Owx owx0 = new Owx(rD0, dWo0.xf, dWo0.xs);
        this.Zh = owx0;
        owx0.PjT(this);
        owx0.PjT(dWo0.xE);
        this.XX = dWo0.SM;
        this.Au = dWo0.Au;
        this.SM = dWo0.qla;
    }

    private com.bytedance.sdk.component.PjT.XX.PjT PjT(xE xE0, JQp jQp0, cz cz0) throws Exception {
        Object object0 = jQp0.PjT(this.PjT(xE0.JQp, jQp0), cz0);
        return new com.bytedance.sdk.component.PjT.XX.PjT(true, Lrd.PjT(this.PjT.PjT(object0)), null);
    }

    private com.bytedance.sdk.component.PjT.XX.PjT PjT(xE xE0, ReZ reZ0, tT tT0) throws Exception {
        com.bytedance.sdk.component.PjT.XX.2 xX$20 = new com.bytedance.sdk.component.PjT.ltE.PjT() {
            final XX Zh;

        };
        new ltE(xE0.cr, tT0, xX$20);
        return new com.bytedance.sdk.component.PjT.XX.PjT(false, "", null);
    }

    private com.bytedance.sdk.component.PjT.XX.PjT PjT(xE xE0, cr cr0, cz cz0) throws Exception {
        this.cz.add(cr0);
        cr0.PjT(this.PjT(xE0.JQp, cr0), cz0, new com.bytedance.sdk.component.PjT.cr.PjT() {
            final XX ReZ;

            @Override  // com.bytedance.sdk.component.PjT.cr$PjT
            public void PjT(Object object0) {
                if(XX.this.DWo == null) {
                    return;
                }
                XX.this.DWo.Zh(Lrd.PjT(XX.this.PjT.PjT(object0)), xE0);
                XX.this.cz.remove(cr0);
            }

            @Override  // com.bytedance.sdk.component.PjT.cr$PjT
            public void PjT(Throwable throwable0) {
                if(XX.this.DWo == null) {
                    return;
                }
                XX.this.DWo.Zh(Lrd.PjT(throwable0), xE0);
                XX.this.cz.remove(cr0);
            }
        });
        return new com.bytedance.sdk.component.PjT.XX.PjT(false, "", null);
    }

    private Object PjT(String s, Zh zh0) throws JSONException {
        Type[] arr_type = XX.PjT(zh0);
        return this.PjT.PjT(s, arr_type[0]);
    }

    private static Type[] PjT(Object object0) {
        Type type0 = object0.getClass().getGenericSuperclass();
        if(type0 == null) {
            throw new IllegalStateException("Method is not parameterized?!");
        }
        return ((ParameterizedType)type0).getActualTypeArguments();
    }

    com.bytedance.sdk.component.PjT.XX.PjT PjT(xE xE0, cz cz0) throws Exception {
        Zh zh0 = (Zh)this.ReZ.get(xE0.cr);
        try {
            if(zh0 != null) {
                tT tT0 = this.Zh(cz0.Zh, zh0);
                cz0.cr = tT0;
                if(tT0 == null) {
                    xE0.toString();
                    throw new gK(-1);
                }
                if(zh0 instanceof JQp) {
                    xE0.toString();
                    return this.PjT(xE0, ((JQp)zh0), cz0);
                }
                if(zh0 instanceof ReZ) {
                    xE0.toString();
                    return this.PjT(xE0, ((ReZ)zh0), tT0);
                }
            }
            com.bytedance.sdk.component.PjT.cr.Zh cr$Zh0 = (com.bytedance.sdk.component.PjT.cr.Zh)this.cr.get(xE0.cr);
            if(cr$Zh0 != null) {
                cr cr0 = cr$Zh0.PjT();
                cr0.PjT(xE0.cr);
                tT tT1 = this.Zh(cz0.Zh, cr0);
                cz0.cr = tT1;
                if(tT1 != null) {
                    xE0.toString();
                    return this.PjT(xE0, cr0, cz0);
                }
                xE0.toString();
                cr0.cr();
                throw new gK(-1);
            }
        }
        catch(com.bytedance.sdk.component.PjT.RD.PjT unused_ex) {
            xE0.toString();
            this.JQp.add(xE0);
            return new com.bytedance.sdk.component.PjT.XX.PjT(false, "", null);
        }
        xE0.toString();
        return null;
    }

    void PjT() {
        for(Object object0: this.cz) {
            ((cr)object0).JQp();
        }
        this.cz.clear();
        this.ReZ.clear();
        this.cr.clear();
        this.Zh.Zh(this);
    }

    void PjT(String s, JQp jQp0) {
        jQp0.PjT(s);
        this.ReZ.put(s, jQp0);
    }

    void PjT(String s, com.bytedance.sdk.component.PjT.cr.Zh cr$Zh0) {
        this.cr.put(s, cr$Zh0);
    }

    // 去混淆评级： 低(20)
    private tT Zh(String s, Zh zh0) {
        return this.SM ? tT.ReZ : this.Zh.PjT(this.Au, s, zh0);
    }
}

