package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Map;
import org.json.JSONObject;

public class AdSlot {
    public static class Builder {
        private String Au;
        private int DWo;
        private int JQp;
        private Map Owx;
        private String PjT;
        private int RD;
        private int ReZ;
        private String SM;
        private int Sks;
        private final int XX;
        private int Zh;
        private final boolean cr;
        private final String cz;
        private String fDm;
        private String gK;
        private boolean ltE;
        private float qj;
        private String qla;
        private String ub;
        private String xE;
        private float xf;
        private boolean xs;

        public Builder() {
            this.Zh = 640;
            this.ReZ = 320;
            this.cr = true;
            this.JQp = 1;
            this.cz = "";
            this.XX = 0;
            this.SM = "defaultUser";
            this.ltE = true;
            this.Owx = null;
            this.Sks = 1;
        }

        public AdSlot build() {
            AdSlot adSlot0 = new AdSlot(null);
            adSlot0.PjT = this.PjT;
            adSlot0.cz = this.JQp;
            adSlot0.XX = true;
            adSlot0.Zh = this.Zh;
            adSlot0.ReZ = this.ReZ;
            float f = this.qj;
            if(f <= 0.0f) {
                adSlot0.cr = (float)this.Zh;
                adSlot0.JQp = (float)this.ReZ;
            }
            else {
                adSlot0.cr = f;
                adSlot0.JQp = this.xf;
            }
            adSlot0.Au = "";
            adSlot0.SM = 0;
            adSlot0.DWo = this.Au;
            adSlot0.qj = this.SM;
            adSlot0.xf = this.DWo;
            adSlot0.xs = this.ltE;
            adSlot0.fDm = this.xs;
            adSlot0.qla = this.fDm;
            adSlot0.xE = this.qla;
            adSlot0.ub = this.xE;
            adSlot0.gK = this.ub;
            adSlot0.ltE = this.gK;
            adSlot0.yIW = this.Owx;
            adSlot0.tT = this.RD;
            adSlot0.Lrd = this.Sks;
            return adSlot0;
        }

        public Builder isExpressAd(boolean z) {
            this.xs = z;
            return this;
        }

        public Builder setAdCount(int v) {
            if(v <= 0) {
                v = 1;
            }
            if(v > 20) {
                v = 20;
            }
            this.JQp = v;
            return this;
        }

        public Builder setAdId(String s) {
            this.qla = s;
            return this;
        }

        public Builder setBannerType(int v) {
            this.Sks = v;
            return this;
        }

        public Builder setCodeId(String s) {
            this.PjT = s;
            return this;
        }

        public Builder setCreativeId(String s) {
            this.xE = s;
            return this;
        }

        public Builder setDurationSlotType(int v) {
            this.RD = v;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f1) {
            this.qj = f;
            this.xf = f1;
            return this;
        }

        public Builder setExt(String s) {
            this.ub = s;
            return this;
        }

        public Builder setImageAcceptedSize(int v, int v1) {
            this.Zh = v;
            this.ReZ = v1;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.ltE = z;
            return this;
        }

        public Builder setMediaExtra(String s) {
            this.Au = s;
            return this;
        }

        public Builder setNativeAdType(int v) {
            this.DWo = v;
            return this;
        }

        public Builder setRequestExtraMap(Map map0) {
            this.Owx = map0;
            return this;
        }

        @Deprecated
        public Builder setRewardAmount(int v) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String s) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public Builder setUserData(String s) {
            this.gK = s;
            return this;
        }

        public Builder setUserID(String s) {
            this.SM = s;
            return this;
        }

        public Builder withBid(String s) {
            if(TextUtils.isEmpty(s)) {
                return this;
            }
            this.fDm = s;
            return this;
        }
    }

    public static final int ANCHORED_BANNER = 2;
    private String Au;
    private String DWo;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    private float JQp;
    private int Lrd;
    private int Owx;
    private String PjT;
    private int RD;
    private int ReZ;
    private int SM;
    private int Sks;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private boolean XX;
    private int Zh;
    private boolean cRA;
    private float cr;
    private int cz;
    private boolean fDm;
    private String gK;
    private String ltE;
    private String qj;
    private String qla;
    private int tT;
    private String ub;
    private String xE;
    private int xf;
    private boolean xs;
    private Map yIW;

    private AdSlot() {
        this.xs = true;
        this.fDm = false;
        this.Owx = 0;
        this.RD = 0;
        this.Sks = 0;
        this.Lrd = 1;
    }

    AdSlot(com.bytedance.sdk.openadsdk.AdSlot.1 adSlot$10) {
    }

    public int getAdCount() {
        return this.cz;
    }

    public String getAdId() {
        return this.xE;
    }

    public int getBannerType() {
        return this.Lrd;
    }

    public String getBidAdm() {
        return this.qla;
    }

    public String getCodeId() {
        return this.PjT;
    }

    public String getCreativeId() {
        return this.ub;
    }

    public int getDurationSlotType() {
        return this.tT;
    }

    public float getExpressViewAcceptedHeight() {
        return this.JQp;
    }

    public float getExpressViewAcceptedWidth() {
        return this.cr;
    }

    public String getExt() {
        return this.gK;
    }

    public int getImgAcceptedHeight() {
        return this.ReZ;
    }

    public int getImgAcceptedWidth() {
        return this.Zh;
    }

    public int getIsRotateBanner() {
        return this.Owx;
    }

    public String getMediaExtra() {
        return this.DWo;
    }

    public int getNativeAdType() {
        return this.xf;
    }

    public static int getPosition(int v) {
        switch(v) {
            case 1: {
                return 2;
            }
            case 2: {
                return 4;
            }
            default: {
                return v == 3 || v == 4 || (v == 7 || v == 8) ? 5 : 3;
            }
        }
    }

    @Nullable
    public Map getRequestExtraMap() {
        return this.yIW;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.SM;
    }

    @Deprecated
    public String getRewardName() {
        return this.Au;
    }

    public int getRotateOrder() {
        return this.Sks;
    }

    public int getRotateTime() {
        return this.RD;
    }

    public static AdSlot getSlot(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        Builder adSlot$Builder0 = new Builder();
        try {
            int v = jSONObject0.optInt("mImgAcceptedWidth", 640);
            int v1 = jSONObject0.optInt("mImgAcceptedHeight", 320);
            double f = jSONObject0.optDouble("mExpressViewAcceptedWidth", 0.0);
            double f1 = jSONObject0.optDouble("mExpressViewAcceptedHeight", 0.0);
            adSlot$Builder0.setCodeId(jSONObject0.optString("mCodeId", null));
            adSlot$Builder0.setAdCount(jSONObject0.optInt("mAdCount", 1));
            adSlot$Builder0.setIsAutoPlay(jSONObject0.optBoolean("mIsAutoPlay"));
            adSlot$Builder0.setImageAcceptedSize(v, v1);
            adSlot$Builder0.setExpressViewAcceptedSize(f.floatValue(), f1.floatValue());
            adSlot$Builder0.setSupportDeepLink(jSONObject0.optBoolean("mSupportDeepLink", false));
            adSlot$Builder0.setRewardName(jSONObject0.optString("mRewardName", null));
            adSlot$Builder0.setRewardAmount(jSONObject0.optInt("mRewardAmount"));
            adSlot$Builder0.setMediaExtra(jSONObject0.optString("mMediaExtra", null));
            adSlot$Builder0.setUserID(jSONObject0.optString("mUserID", null));
            adSlot$Builder0.setNativeAdType(jSONObject0.optInt("mNativeAdType"));
            adSlot$Builder0.isExpressAd(jSONObject0.optBoolean("mIsExpressAd"));
            adSlot$Builder0.withBid(jSONObject0.optString("mBidAdm"));
            adSlot$Builder0.setAdId(jSONObject0.optString("mAdId"));
            adSlot$Builder0.setCreativeId(jSONObject0.optString("mCreativeId"));
            adSlot$Builder0.setExt(jSONObject0.optString("mExt"));
            adSlot$Builder0.setMediaExtra(jSONObject0.optString("mMediaExtra"));
            adSlot$Builder0.setBannerType(jSONObject0.optInt("mBannerType"));
        }
        catch(Exception unused_ex) {
        }
        AdSlot adSlot0 = adSlot$Builder0.build();
        adSlot0.setDurationSlotType(jSONObject0.optInt("mDurationSlotType"));
        return adSlot0;
    }

    public String getUserData() {
        return this.ltE;
    }

    public String getUserID() {
        return this.qj;
    }

    public boolean isAutoPlay() {
        return this.xs;
    }

    public boolean isExpressAd() {
        return this.fDm;
    }

    public boolean isPreload() {
        return this.cRA;
    }

    public boolean isSupportDeepLink() {
        return this.XX;
    }

    public void setAdCount(int v) {
        this.cz = v;
    }

    public void setDurationSlotType(int v) {
        this.tT = v;
    }

    public void setExpressViewAccepted(float f, float f1) {
        this.cr = f;
        this.JQp = f1;
    }

    public void setIsRotateBanner(int v) {
        this.Owx = v;
    }

    public void setNativeAdType(int v) {
        this.xf = v;
    }

    public void setPreload(boolean z) {
        this.cRA = z;
    }

    public void setRotateOrder(int v) {
        this.Sks = v;
    }

    public void setRotateTime(int v) {
        this.RD = v;
    }

    public void setUserData(String s) {
        this.ltE = s;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("mCodeId", this.PjT);
            jSONObject0.put("mAdCount", this.cz);
            jSONObject0.put("mIsAutoPlay", this.xs);
            jSONObject0.put("mImgAcceptedWidth", this.Zh);
            jSONObject0.put("mImgAcceptedHeight", this.ReZ);
            jSONObject0.put("mExpressViewAcceptedWidth", ((double)this.cr));
            jSONObject0.put("mExpressViewAcceptedHeight", ((double)this.JQp));
            jSONObject0.put("mSupportDeepLink", this.XX);
            jSONObject0.put("mRewardName", this.Au);
            jSONObject0.put("mRewardAmount", this.SM);
            jSONObject0.put("mMediaExtra", this.DWo);
            jSONObject0.put("mUserID", this.qj);
            jSONObject0.put("mNativeAdType", this.xf);
            jSONObject0.put("mIsExpressAd", this.fDm);
            jSONObject0.put("mAdId", this.xE);
            jSONObject0.put("mCreativeId", this.ub);
            jSONObject0.put("mExt", this.gK);
            jSONObject0.put("mBidAdm", this.qla);
            jSONObject0.put("mUserData", this.ltE);
            jSONObject0.put("mDurationSlotType", this.tT);
            jSONObject0.put("mBannerType", this.Lrd);
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    class com.bytedance.sdk.openadsdk.AdSlot.1 {
    }

}

