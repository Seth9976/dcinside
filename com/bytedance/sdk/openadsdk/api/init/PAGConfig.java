package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bytedance.sdk.component.XX.ReZ.ReZ.PjT;
import com.bytedance.sdk.component.XX.ReZ.ReZ;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.qla;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant.PAGGDPRConsentType;
import com.bytedance.sdk.openadsdk.api.PAGConstant.PAGPAConsentType;
import com.bytedance.sdk.openadsdk.core.iZZ;
import com.bytedance.sdk.openadsdk.utils.wN;
import s.b;

public final class PAGConfig implements InitConfig {
    public static class Builder {
        private String[] Au;
        private String DWo;
        private int JQp;
        private String PjT;
        private int ReZ;
        private String SM;
        private boolean XX;
        private boolean Zh;
        private int cr;
        private int cz;
        private String qj;

        public Builder() {
            this.cr = -1;
            this.JQp = -1;
            this.cz = 0;
            this.XX = false;
            this.qj = "";
        }

        public Builder appIcon(int v) {
            this.ReZ = v;
            return this;
        }

        public Builder appId(String s) {
            this.PjT = s;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig0 = new PAGConfig();
            pAGConfig0.Zh(this.PjT);
            pAGConfig0.PjT(this.ReZ);
            pAGConfig0.cr(this.cz);
            pAGConfig0.Zh(this.XX);
            pAGConfig0.Zh(this.cr);
            pAGConfig0.ReZ(this.JQp);
            pAGConfig0.PjT(this.Zh);
            pAGConfig0.ReZ(this.SM);
            pAGConfig0.PjT(this.DWo);
            pAGConfig0.cr(this.qj);
            return pAGConfig0;
        }

        public Builder debugLog(boolean z) {
            this.Zh = z;
            return this;
        }

        public Builder needClearTaskReset(String[] arr_s) {
            this.Au = arr_s;
            return this;
        }

        public Builder setAdxId(String s) {
            this.qj = s;
            return this;
        }

        public Builder setGDPRConsent(@PAGGDPRConsentType int v) {
            this.cr = v;
            return this;
        }

        public Builder setPAConsent(@PAGPAConsentType int v) {
            if(v != 0 && v != 1) {
                this.JQp = -2;
                return this;
            }
            this.JQp = v;
            return this;
        }

        public Builder setPackageName(String s) {
            this.SM = s;
            return this;
        }

        public Builder setUserData(String s) {
            this.DWo = s;
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            this.XX = z;
            return this;
        }

        public Builder titleBarTheme(int v) {
            this.cz = v;
            return this;
        }

        public Builder useTextureView(boolean z) {
            return this;
        }
    }

    private String Au;
    private static String DWo;
    private int JQp;
    private String PjT;
    private int ReZ;
    private String SM;
    private boolean XX;
    private boolean Zh;
    private int cr;
    private int cz;
    private String qj;

    public PAGConfig() {
        this.cr = -1;
        this.JQp = -1;
        this.cz = 0;
    }

    private void PjT(int v) {
        this.ReZ = v;
    }

    private void PjT(String s) {
        this.SM = s;
    }

    private void PjT(boolean z) {
        this.Zh = z;
    }

    private void ReZ(int v) {
        this.JQp = v;
    }

    private void ReZ(String s) {
        this.Au = s;
    }

    private void Zh(int v) {
        if(v < -1 || v > 1) {
            v = -1;
        }
        this.cr = v;
    }

    private void Zh(String s) {
        this.PjT = s;
    }

    private void Zh(boolean z) {
        this.XX = z;
        b.f(z);
    }

    @Deprecated
    private void cr(int v) {
        this.cz = v;
    }

    private void cr(String s) {
        this.qj = s;
    }

    public static void debugLog(boolean z) {
        if(iZZ.PjT() != null) {
            if(z) {
                iZZ.PjT().ReZ(1);
                iZZ.PjT().PjT();
                return;
            }
            iZZ.PjT().ReZ(0);
            ReZ.PjT(PjT.cr);
            qla.ReZ();
            com.bykv.vk.openvk.PjT.PjT.PjT.XX.b.e();
            RD.Zh();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.InitConfig
    public String getAdxId() {
        return this.qj;
    }

    @Override  // com.bytedance.sdk.openadsdk.InitConfig
    public int getAppIconId() {
        return this.ReZ;
    }

    @Override  // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.SM;
    }

    public boolean getDebugLog() {
        return this.Zh;
    }

    public static int getGDPRConsent() {
        if(!wN.SM("getGdpr")) {
            return -1;
        }
        int v = iZZ.PjT().Zh();
        if(v == 1) {
            return 0;
        }
        return v == 0 ? 1 : v;
    }

    @Override  // com.bytedance.sdk.openadsdk.InitConfig
    public int getGdpr() {
        return this.cr;
    }

    @Override  // com.bytedance.sdk.openadsdk.InitConfig
    public int getPA() {
        return this.JQp;
    }

    public static int getPAConsent() {
        return wN.SM("getPAConsent") ? iZZ.PjT().JQp() : -1;
    }

    // 去混淆评级： 低(20)
    @Override  // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        return TextUtils.isEmpty(this.Au) ? PAGConfig.DWo : this.Au;
    }

    @Override  // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.cz;
    }

    @Override  // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return this.XX;
    }

    @Override  // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    public static void setAppIconId(int v) {
        if(iZZ.PjT() != null) {
            iZZ.PjT().cr(v);
        }
    }

    public static void setGDPRConsent(@PAGGDPRConsentType int v) {
        wN.SM("setGdpr");
        if(v < -1 || v > 1) {
            v = -1;
        }
        iZZ.PjT().Zh(v);
    }

    public static void setPAConsent(@PAGPAConsentType int v) {
        if(!wN.SM("setPAConsent")) {
            return;
        }
        if(v != 0 && v != 1) {
            iZZ.PjT().JQp(-2);
            return;
        }
        iZZ.PjT().JQp(v);
    }

    public static void setPackageName(String s) {
        PAGConfig.DWo = s;
    }

    public static void setUserData(String s) {
        if(iZZ.PjT() != null) {
            iZZ.PjT().Zh(s);
        }
    }
}

