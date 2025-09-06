package com.bytedance.sdk.component.JQp.cr.ReZ;

import com.bytedance.sdk.component.JQp.ltE;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.JQp.xE;
import java.util.List;
import java.util.Map;

public class PjT {
    private ReZ PjT;
    private ltE Zh;

    public PjT(ReZ reZ0, ltE ltE0) {
        this.PjT = reZ0;
        this.Zh = ltE0;
    }

    public void PjT(int v, String s, Throwable throwable0) {
        List list0;
        Map map0;
        String s1;
        try {
            ltE ltE0 = this.Zh;
            if(ltE0 != null) {
                ltE0.PjT("failed", this.PjT);
            }
            s1 = this.PjT.Owx();
            map0 = this.PjT.ub().XX();
            list0 = (List)map0.get(s1);
            if(list0 == null) {
                xE xE0 = this.PjT.Au();
                if(xE0 != null) {
                    xE0.PjT(v, s, throwable0);
                }
            }
            else {
                __monitor_enter(list0);
                goto label_12;
            }
            goto label_27;
        }
        catch(Throwable unused_ex) {
            return;
        }
        try {
        label_12:
            for(Object object0: list0) {
                xE xE1 = ((ReZ)object0).Au();
                if(xE1 != null) {
                    xE1.toString();
                    xE1.PjT(v, s, throwable0);
                }
            }
            list0.clear();
            map0.remove(s1);
            __monitor_exit(list0);
            goto label_27;
        }
        catch(Throwable throwable1) {
        }
        try {
            __monitor_exit(list0);
            throw throwable1;
        label_27:
            ltE ltE1 = this.Zh;
            if(ltE1 != null) {
                ltE1.Zh("failed", this.PjT);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public void PjT(qj qj0) {
        List list0;
        Map map0;
        String s;
        try {
            ltE ltE0 = this.Zh;
            if(ltE0 != null) {
                ltE0.PjT("success", this.PjT);
            }
            s = this.PjT.Owx();
            map0 = this.PjT.ub().XX();
            list0 = (List)map0.get(s);
            if(list0 == null) {
                xE xE0 = this.PjT.Au();
                if(xE0 != null) {
                    xE0.toString();
                    xE0.PjT(qj0);
                }
            }
            else {
                __monitor_enter(list0);
                goto label_13;
            }
            goto label_29;
        }
        catch(Throwable unused_ex) {
            return;
        }
        try {
        label_13:
            list0.size();
            for(Object object0: list0) {
                xE xE1 = ((ReZ)object0).Au();
                if(xE1 != null) {
                    xE1.toString();
                    xE1.PjT(qj0);
                }
            }
            list0.clear();
            map0.remove(s);
            __monitor_exit(list0);
            goto label_29;
        }
        catch(Throwable throwable0) {
        }
        try {
            __monitor_exit(list0);
            throw throwable0;
        label_29:
            ltE ltE1 = this.Zh;
            if(ltE1 != null) {
                ltE1.Zh("success", this.PjT);
            }
        }
        catch(Throwable unused_ex) {
        }
    }
}

