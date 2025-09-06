package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.CampaignStateOuterClass.Campaign;
import gatewayprotocol.v1.CampaignStateOuterClass.CampaignState;
import y4.l;
import y4.m;

public interface CampaignRepository {
    @m
    Campaign getCampaign(@l ByteString arg1);

    @l
    CampaignState getCampaignState();

    void removeState(@l ByteString arg1);

    void setCampaign(@l ByteString arg1, @l Campaign arg2);

    void setLoadTimestamp(@l ByteString arg1);

    void setShowTimestamp(@l ByteString arg1);
}

