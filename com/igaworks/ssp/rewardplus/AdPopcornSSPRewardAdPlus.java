package com.igaworks.ssp.rewardplus;

import android.content.Context;
import com.igaworks.ssp.E;
import com.igaworks.ssp.rewardplus.listener.IRewardAdEventCallbackListener;
import com.igaworks.ssp.rewardplus.listener.IRewardAdPlusUserStatusCallbackListener;

public class AdPopcornSSPRewardAdPlus {
    public static class EVENT_RESULT_CODE {
        public static final int CLAIM_POINTBOX_FAIL = 2;
        public static final int CLAIM_POINTBOX_FAIL_6108 = 6108;
        public static final int CLAIM_POINTBOX_FAIL_6109 = 6109;
        public static final int CLAIM_POINTBOX_SUCCESS = 1;

    }

    public static class VERSION {
        public static final String V1_5 = "1.5";

    }

    public static void getRewardAdPlusUserStatus(Context context0, String s, IRewardAdPlusUserStatusCallbackListener iRewardAdPlusUserStatusCallbackListener0) {
        E.g().a(context0, s, iRewardAdPlusUserStatusCallbackListener0);
    }

    public static void openRewardAdPlusPage(Context context0, String s) {
        E.g().b(context0, s);
    }

    public static void setRewardAdPlusEventListener(IRewardAdEventCallbackListener iRewardAdEventCallbackListener0) {
        E.g().a(iRewardAdEventCallbackListener0);
    }
}

