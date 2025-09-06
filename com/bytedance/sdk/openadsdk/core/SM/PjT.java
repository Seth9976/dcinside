package com.bytedance.sdk.openadsdk.core.SM;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf;
import com.bytedance.sdk.openadsdk.qla.PjT.ReZ;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import com.bytedance.sdk.openadsdk.qla.Zh;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class PjT {
    private PglSSManager PjT;
    private volatile boolean ReZ;
    private volatile boolean Zh;
    private volatile boolean cr;

    public PjT() {
        this.ReZ = true;
        this.cr = false;
        this.PjT();
    }

    private boolean Au() {
        if(!this.Zh && this.ReZ) {
            this.PjT();
        }
        return this.Zh;
    }

    private Class DWo() {
        this.ReZ = true;
        return PglSSManager.class;
    }

    public String JQp() [...] // 潜在的解密器

    public Map PjT(String s, byte[] arr_b) {
        if(this.Au()) {
            Map map0 = this.PjT.getFeatureHash(s, arr_b);
            if(map0 != null) {
                return map0;
            }
        }
        return new HashMap();
    }

    public void PjT() {
        synchronized(this) {
            try {
                if(!this.Zh) {
                    Context context0 = ub.PjT();
                    String s = SM.Zh().cr();
                    if(TextUtils.isEmpty(s)) {
                        s = SM.PjT("app_id", 0x7FFFFFFFFFFFFFFFL);
                    }
                    if(TextUtils.isEmpty(s)) {
                        return;
                    }
                    String s1 = xf.PjT(context0);
                    String s2 = com.bytedance.sdk.openadsdk.ltE.PjT.Zh.PjT.PjT().Zh();
                    PglSSConfig pglSSConfig0 = PglSSConfig.builder().setAppId(s).setOVRegionType(2).setAdsdkVersion("7.1.0.4").build();
                    HashMap hashMap0 = new HashMap();
                    Set set0 = xs.Gr().dDm();
                    if(set0 != null && !set0.isEmpty()) {
                        hashMap0.put("fields_allowed", set0);
                    }
                    String s3 = wN.xs();
                    if(!TextUtils.isEmpty(s3)) {
                        hashMap0.put("key_transfer_host", s3);
                    }
                    pglSSConfig0.setCustomInfo(hashMap0);
                    PglSSManager.init(context0, pglSSConfig0, null, null, s1, s2);
                    this.SM();
                    this.Zh = true;
                    goto label_27;
                }
                return;
            }
            catch(Throwable unused_ex) {
                this.DWo();
                this.Zh = false;
            }
        }
        try {
        label_27:
            if(this.ReZ) {
                this.ReZ(PglSSManager.getLoadError());
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("mssdk", throwable0.getMessage());
        }
    }

    public void PjT(MotionEvent motionEvent0) {
        if(!this.Zh()) {
            return;
        }
        this.SM();
        PglSSManager pglSSManager0 = this.PjT;
        if(pglSSManager0 != null) {
            pglSSManager0.checkEventVirtual(motionEvent0);
        }
    }

    public void PjT(String s) {
        if(!this.Au()) {
            return;
        }
        this.SM();
        PglSSManager pglSSManager0 = this.PjT;
        if(pglSSManager0 != null) {
            pglSSManager0.setGaid(s);
        }
    }

    public void PjT(String s, Map map0) {
        if(!this.Au()) {
            return;
        }
        this.SM();
        PglSSManager pglSSManager0 = this.PjT;
        if(pglSSManager0 != null) {
            pglSSManager0.reportNow(s, map0);
        }
    }

    public void PjT(Map map0) {
        if(!this.Au()) {
            return;
        }
        this.SM();
        if(this.PjT != null) {
            fDm.Zh().post(new Runnable() {
                final PjT Zh;

                @Override
                public void run() {
                    try {
                        PjT.this.PjT.setCustomInfo(map0);
                    }
                    catch(Throwable throwable0) {
                        RD.Zh("MSSdkImpl", new Object[]{"setCustomInfo", throwable0.getMessage()});
                    }
                }
            });
        }
    }

    private void ReZ(String s) {
        if(!this.cr && !TextUtils.isEmpty(s)) {
            com.bytedance.sdk.openadsdk.core.SM.PjT.3 pjT$30 = new Zh() {
                final PjT Zh;

                @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                public ReZ getLogStats() throws Exception {
                    return cr.Zh().PjT("secsdk_init_error").Zh(s);
                }
            };
            ub.JQp().PjT(pjT$30, false);
            this.cr = true;
        }
    }

    public void ReZ() {
        if(!this.Au()) {
            return;
        }
        this.SM();
        if(this.PjT != null) {
            fDm.Zh().post(new Runnable() {
                final PjT PjT;

                @Override
                public void run() {
                    try {
                        HashMap hashMap0 = new HashMap();
                        hashMap0.put("check_clz", ub.cr().CD());
                        PjT.this.PjT.setCustomInfo(hashMap0);
                    }
                    catch(Throwable throwable0) {
                        RD.Zh("MSSdkImpl", new Object[]{"setCustomInfo", throwable0.getMessage()});
                    }
                }
            });
        }
    }

    private void SM() {
        if(this.PjT == null) {
            this.PjT = PglSSManager.getInstance();
        }
    }

    // 去混淆评级： 低(40)
    public int XX() {
        return this.ReZ ? 1 : 5;
    }

    public void Zh(String s) {
        if(!this.Au()) {
            return;
        }
        this.SM();
        PglSSManager pglSSManager0 = this.PjT;
        if(pglSSManager0 != null) {
            pglSSManager0.setDeviceId(s);
        }
    }

    public boolean Zh() {
        return this.Zh;
    }

    public String cr() [...] // 潜在的解密器

    public long cz() {
        if(!this.Au()) {
            return 0L;
        }
        this.SM();
        return this.PjT == null ? 0L : this.PjT.getECForBidding();
    }
}

