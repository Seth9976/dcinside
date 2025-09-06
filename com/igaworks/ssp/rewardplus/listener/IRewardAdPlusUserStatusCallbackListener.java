package com.igaworks.ssp.rewardplus.listener;

import java.util.List;

public interface IRewardAdPlusUserStatusCallbackListener {
    void OnRewardAdPlusUserMediaStatus(boolean arg1, int arg2, List arg3);

    void OnRewardAdPlusUserPlacementStatus(boolean arg1, String arg2, int arg3, int arg4);
}

