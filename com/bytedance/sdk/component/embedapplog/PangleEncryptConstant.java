package com.bytedance.sdk.component.embedapplog;

public class PangleEncryptConstant {
    public static enum CryptDataScene {
        UNKNOWN(0),
        SETTINGS(1),
        GET_ADS(2),
        APP_LOG(3),
        STATS_LOG(4),
        REWARD_VERIFY(5),
        DISLIKE(6),
        BIDDING_TOKEN(7),
        DUAL_EVENT(8);

        private final int value;

        private CryptDataScene(int v1) {
            this.value = v1;
        }

        public int value() {
            return this.value;
        }
    }

    public static final int DECRYPT = 2;
    public static final int ENCRYPT = 1;
    public static final int REASON_BASE64 = 3;
    public static final int REASON_CRYPT = 2;
    public static final int REASON_GZIP = 1;
    public static final int REASON_PARAMS_ERROR = 4;
    public static final int REASON_SO_LOAD_FAIL = 6;
    public static final int UNKNOWN;

}

