package com.bytedance.sdk.openadsdk.ReZ;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager.Stub;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DWo {
    public interface PjT {
        void PjT(List arg1);
    }

    public interface ReZ {
        void PjT(FilterWord arg1);
    }

    public interface Zh {
        void PjT(int arg1);
    }

    public interface cr {
        void PjT(String arg1);
    }

    private final Set Au;
    private final Set DWo;
    public static int JQp;
    public static FilterWord PjT;
    public static int ReZ;
    private final Set SM;
    private final Set XX;
    public static int Zh;
    public static int cr;
    protected IListenerManager cz;
    private String fDm;
    private FilterWord gK;
    private String qj;
    private String qla;
    private int ub;
    private int xE;
    private String xf;
    private String xs;

    static {
        DWo.PjT = new FilterWord("", "");
        DWo.Zh = 1;
        DWo.ReZ = 2;
        DWo.cr = 3;
        DWo.JQp = 4;
    }

    public DWo() {
        this.XX = new HashSet();
        this.Au = new HashSet();
        this.SM = new HashSet();
        this.DWo = new HashSet();
    }

    public int Au() {
        return this.xE;
    }

    private void DWo() {
        for(Object object0: this.XX) {
            ((ReZ)object0).PjT(this.gK);
        }
    }

    private void JQp(String s) {
        Jo.ReZ(new Au("Reward_executeMultiProcessCallback") {
            final DWo Zh;

            @Override
            public void run() {
                try {
                    if(!TextUtils.isEmpty(DWo.this.xs)) {
                        DWo.this.PjT(6).executeDisLikeClosedCallback(DWo.this.xs, s);
                    }
                }
                catch(Throwable throwable0) {
                    RD.PjT("TTDislikeManager", "executeRewardVideoCallback execute throw Exception : ", throwable0);
                }
            }
        }, 5);
    }

    public void JQp() {
        for(Object object0: this.Au) {
            ((Zh)object0).PjT(DWo.ReZ);
        }
    }

    public static void PjT(int v, String s) {
        if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            return;
        }
        Jo.ReZ(new Au("DislikeClosed_unregisterMultiProcessListener") {
            @Override
            public void run() {
                com.bytedance.sdk.openadsdk.multipro.aidl.PjT pjT0 = com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT();
                if(v == 6) {
                    try {
                        IListenerManager iListenerManager0 = Stub.asInterface(pjT0.PjT(6));
                        if(iListenerManager0 != null) {
                            iListenerManager0.unregisterDisLikeClosedListener(s);
                        }
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
            }
        }, 5);
    }

    public static void PjT(int v, String s, com.bytedance.sdk.openadsdk.core.ReZ.cr.PjT cr$PjT0) {
        if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            return;
        }
        Jo.ReZ(new Au("DislikeClosed_registerMultiProcessListener") {
            @Override
            public void run() {
                com.bytedance.sdk.openadsdk.multipro.aidl.PjT pjT0 = com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT();
                if(v == 6 && cr$PjT0 != null) {
                    try {
                        com.bytedance.sdk.openadsdk.multipro.aidl.Zh.Zh zh0 = new com.bytedance.sdk.openadsdk.multipro.aidl.Zh.Zh(s, cr$PjT0);
                        IListenerManager iListenerManager0 = Stub.asInterface(pjT0.PjT(6));
                        if(iListenerManager0 != null) {
                            iListenerManager0.registerDisLikeClosedListener(s, zh0);
                        }
                    }
                    catch(RemoteException remoteException0) {
                        RD.Zh("TTDislikeManager", remoteException0.getMessage());
                    }
                }
            }
        }, 5);
    }

    protected IListenerManager PjT(int v) {
        if(this.cz == null) {
            this.cz = Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT().PjT(v));
        }
        return this.cz;
    }

    public void PjT() {
        this.XX.clear();
        this.Au.clear();
        this.SM.clear();
        this.DWo.clear();
    }

    public void PjT(int v, int v1) {
        this.xE = v;
        this.ub = v1;
    }

    public void PjT(FilterWord filterWord0) {
        this.gK = filterWord0;
        this.DWo();
    }

    public void PjT(PjT dWo$PjT0) {
        this.DWo.add(dWo$PjT0);
    }

    public void PjT(ReZ dWo$ReZ0) {
        this.XX.add(dWo$ReZ0);
    }

    public void PjT(Zh dWo$Zh0) {
        this.Au.add(dWo$Zh0);
    }

    public void PjT(cr dWo$cr0) {
        this.SM.add(dWo$cr0);
    }

    public void PjT(String s) {
        this.qj = s;
    }

    public void PjT(List list0) {
        for(Object object0: this.DWo) {
            ((PjT)object0).PjT(list0);
        }
    }

    public void ReZ(String s) {
        this.fDm = s;
        for(Object object0: this.SM) {
            ((cr)object0).PjT(this.fDm);
        }
    }

    public boolean ReZ() {
        return this.gK != null && !this.gK.equals(DWo.PjT);
    }

    public boolean SM() {
        return this.xE < this.ub;
    }

    public String XX() {
        return this.fDm;
    }

    public FilterWord Zh() {
        return this.gK;
    }

    public void Zh(String s) {
        this.xf = s;
    }

    public void cr() {
        if(!this.ReZ() && !TextUtils.isEmpty(this.fDm)) {
            this.gK = new FilterWord("0:00", this.fDm);
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(this.gK);
        if(!TextUtils.isEmpty(this.qj)) {
            if(TextUtils.isEmpty(this.fDm)) {
                com.bytedance.sdk.openadsdk.ReZ.Zh.PjT().PjT(this.qj, arrayList0, this.xf);
            }
            else {
                com.bytedance.sdk.openadsdk.ReZ.Zh.PjT().PjT(this.qj, arrayList0, this.qla, this.fDm, this.xf);
            }
        }
        if(!TextUtils.isEmpty(this.xs)) {
            if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                this.JQp("onItemClickClosed");
            }
            else {
                com.bytedance.sdk.openadsdk.core.ReZ.cr.PjT cr$PjT0 = SM.Zh().JQp(this.xs);
                if(cr$PjT0 != null) {
                    cr$PjT0.PjT();
                    SM.Zh().cz(this.xs);
                }
            }
        }
        for(Object object0: this.Au) {
            ((Zh)object0).PjT(DWo.Zh);
        }
        this.PjT(DWo.PjT);
        this.ReZ("");
    }

    public void cr(String s) {
        this.qla = s;
    }

    public void cz() {
        for(Object object0: this.Au) {
            ((Zh)object0).PjT(DWo.JQp);
        }
    }
}

