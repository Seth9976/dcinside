package com.bytedance.sdk.openadsdk.api.reward;

public class PAGRewardItem {
    private final int PjT;
    private final String Zh;

    public PAGRewardItem(int v, String s) {
        this.PjT = v;
        this.Zh = s;
    }

    public int getRewardAmount() {
        return this.PjT;
    }

    public String getRewardName() {
        return this.Zh;
    }
}

