package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

public final class PglSSConfig {
    public static class Builder {
        private String a;
        private int b;
        private int c;
        private String d;

        public Builder() {
            this.b = -1;
            this.c = 0;
        }

        // 去混淆评级： 低(20)
        public PglSSConfig build() {
            return TextUtils.isEmpty(this.a) ? null : new PglSSConfig(this.a, this.b, this.c, this.d, null);
        }

        public Builder setAdsdkVersion(String s) {
            this.d = s;
            return this;
        }

        public Builder setAppId(String s) {
            this.a = s;
            return this;
        }

        public Builder setCollectMode(int v) {
            this.c = v;
            return this;
        }

        public Builder setOVRegionType(int v) {
            this.b = v;
            return this;
        }
    }

    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_ALLOWED_FIELDS = "fields_allowed";
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final String CUSTOMINFO_KEY_IPV6 = "key_ipv6";
    public static final String CUSTOMINFO_KEY_SEC_CONFIG_STR = "sec_config";
    public static final String CUSTOMINFO_KEY_TRANSFER_HOST = "key_transfer_host";
    public static final int OVREGION_TYPE_SG = 2;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;
    private String a;
    private final int b;
    private final int c;
    private String d;
    private Map e;

    private PglSSConfig(String s, int v, int v1, String s1) {
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = s1;
    }

    PglSSConfig(String s, int v, int v1, String s1, com.pgl.ssdk.ces.out.PglSSConfig.1 pglSSConfig$10) {
        this(s, v, v1, s1);
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAdSdkVersion() {
        return this.d;
    }

    public String getAppId() {
        return this.a;
    }

    public int getCollectMode() {
        return this.c;
    }

    public Map getCustomInfo() {
        return this.e;
    }

    public int getOVRegionType() {
        return this.b;
    }

    public void setCustomInfo(Map map0) {
        this.e = map0;
    }

    class com.pgl.ssdk.ces.out.PglSSConfig.1 {
    }

}

