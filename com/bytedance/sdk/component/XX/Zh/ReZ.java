package com.bytedance.sdk.component.XX.Zh;

import android.text.TextUtils;
import com.bytedance.sdk.component.Zh.PjT.Zh;
import com.bytedance.sdk.component.Zh.PjT.cr;
import com.bytedance.sdk.component.Zh.PjT.qj;
import com.bytedance.sdk.component.Zh.PjT.xs.PjT;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public abstract class ReZ {
    protected String Au;
    String JQp;
    protected qj ReZ;
    protected boolean SM;
    protected final Map XX;
    protected String cr;
    int cz;

    public ReZ(qj qj0) {
        this.cr = null;
        this.XX = new HashMap();
        this.Au = null;
        this.SM = false;
        this.ReZ = qj0;
        try {
            this.ReZ("477d051f-0c77-4a2d-9258-88448f8bcec6");
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
    }

    public void PjT(int v) {
        this.cz = v;
    }

    protected void PjT(PjT xs$PjT0) {
        if(xs$PjT0 == null) {
            return;
        }
        if(this.XX.size() > 0) {
            for(Object object0: this.XX.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s = (String)map$Entry0.getKey();
                if(!TextUtils.isEmpty(s)) {
                    String s1 = (String)map$Entry0.getValue();
                    if(s1 == null) {
                        s1 = "";
                    }
                    xs$PjT0.Zh(s, s1);
                }
            }
        }
    }

    public void PjT(String s) {
        this.JQp = s;
    }

    public String ReZ() {
        return this.cr;
    }

    public void ReZ(String s) {
        this.cr = s;
    }

    public void Zh() {
        if(this.cr != null) {
            qj qj0 = this.ReZ;
            if(qj0 != null) {
                cr cr0 = qj0.PjT();
                __monitor_enter(cr0);
                try {
                    for(Object object0: cr0.ReZ()) {
                        Zh zh0 = (Zh)object0;
                        if(this.cr.equals(zh0.PjT().PjT())) {
                            zh0.ReZ();
                        }
                    }
                    for(Object object1: cr0.cr()) {
                        Zh zh1 = (Zh)object1;
                        if(this.cr.equals(zh1.PjT().PjT())) {
                            zh1.ReZ();
                        }
                    }
                    __monitor_exit(cr0);
                    return;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(cr0);
                throw throwable0;
            }
        }
    }

    public void Zh(String s) {
        this.Au = s;
    }

    public void Zh(String s, String s1) {
        this.XX.put(s, s1);
    }

    public String cr() {
        return this.Au;
    }

    public void cr(Map map0) {
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                Object object1 = ((Map.Entry)object0).getKey();
                Object object2 = ((Map.Entry)object0).getValue();
                this.XX.put(object1, object2);
            }
        }
    }
}

