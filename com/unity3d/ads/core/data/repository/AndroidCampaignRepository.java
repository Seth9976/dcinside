package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.CampaignStateKt.Dsl;
import gatewayprotocol.v1.CampaignStateOuterClass.Campaign;
import gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder;
import gatewayprotocol.v1.CampaignStateOuterClass.CampaignState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidCampaignRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCampaignRepository.kt\ncom/unity3d/ads/core/data/repository/AndroidCampaignRepository\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 CampaignKt.kt\ngatewayprotocol/v1/CampaignKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 CampaignStateKt.kt\ngatewayprotocol/v1/CampaignStateKtKt\n+ 7 CampaignStateKt.kt\ngatewayprotocol/v1/CampaignStateKt$Dsl\n*L\n1#1,50:1\n230#2,5:51\n230#2,5:58\n206#3:56\n206#3:63\n1#4:57\n1#4:64\n1#4:76\n3190#5,10:65\n10#6:75\n203#7,2:77\n104#7,2:79\n*S KotlinDebug\n*F\n+ 1 AndroidCampaignRepository.kt\ncom/unity3d/ads/core/data/repository/AndroidCampaignRepository\n*L\n19#1:51,5\n33#1:58,5\n24#1:56\n38#1:63\n24#1:57\n38#1:64\n45#1:76\n43#1:65,10\n45#1:75\n46#1:77,2\n47#1:79,2\n*E\n"})
public final class AndroidCampaignRepository implements CampaignRepository {
    @l
    private final E campaigns;
    @l
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public AndroidCampaignRepository(@l GetSharedDataTimestamps getSharedDataTimestamps0) {
        L.p(getSharedDataTimestamps0, "getSharedDataTimestamps");
        super();
        this.getSharedDataTimestamps = getSharedDataTimestamps0;
        this.campaigns = W.a(Y.z());
    }

    @Override  // com.unity3d.ads.core.data.repository.CampaignRepository
    @m
    public Campaign getCampaign(@l ByteString byteString0) {
        L.p(byteString0, "opportunityId");
        return (Campaign)((Map)this.campaigns.getValue()).get(byteString0.toStringUtf8());
    }

    @Override  // com.unity3d.ads.core.data.repository.CampaignRepository
    @l
    public CampaignState getCampaignState() {
        Iterable iterable0 = ((Map)this.campaigns.getValue()).values();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: iterable0) {
            if(((Campaign)object0).hasShowTimestamp()) {
                arrayList0.add(object0);
            }
            else {
                arrayList1.add(object0);
            }
        }
        V v0 = new V(arrayList0, arrayList1);
        Builder campaignStateOuterClass$CampaignState$Builder0 = CampaignState.newBuilder();
        L.o(campaignStateOuterClass$CampaignState$Builder0, "newBuilder()");
        Dsl campaignStateKt$Dsl0 = Dsl.Companion._create(campaignStateOuterClass$CampaignState$Builder0);
        campaignStateKt$Dsl0.addAllShownCampaigns(campaignStateKt$Dsl0.getShownCampaigns(), ((List)v0.a()));
        campaignStateKt$Dsl0.addAllLoadedCampaigns(campaignStateKt$Dsl0.getLoadedCampaigns(), ((List)v0.b()));
        return campaignStateKt$Dsl0._build();
    }

    @Override  // com.unity3d.ads.core.data.repository.CampaignRepository
    public void removeState(@l ByteString byteString0) {
        L.p(byteString0, "opportunityId");
        E e0 = this.campaigns;
        do {
            Object object0 = e0.getValue();
            String s = byteString0.toStringUtf8();
            L.o(s, "opportunityId.toStringUtf8()");
        }
        while(!e0.compareAndSet(object0, Y.a0(((Map)object0), s)));
    }

    @Override  // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setCampaign(@l ByteString byteString0, @l Campaign campaignStateOuterClass$Campaign0) {
        L.p(byteString0, "opportunityId");
        L.p(campaignStateOuterClass$Campaign0, "campaign");
        E e0 = this.campaigns;
        do {
            Object object0 = e0.getValue();
        }
        while(!e0.compareAndSet(object0, Y.o0(((Map)object0), r0.a(byteString0.toStringUtf8(), campaignStateOuterClass$Campaign0))));
    }

    @Override  // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setLoadTimestamp(@l ByteString byteString0) {
        L.p(byteString0, "opportunityId");
        Campaign campaignStateOuterClass$Campaign0 = this.getCampaign(byteString0);
        if(campaignStateOuterClass$Campaign0 != null) {
            com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = campaignStateOuterClass$Campaign0.toBuilder();
            L.o(generatedMessageLite$Builder0, "this.toBuilder()");
            gatewayprotocol.v1.CampaignKt.Dsl campaignKt$Dsl0 = gatewayprotocol.v1.CampaignKt.Dsl.Companion._create(((gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder)generatedMessageLite$Builder0));
            campaignKt$Dsl0.setLoadTimestamp(this.getSharedDataTimestamps.invoke());
            this.setCampaign(byteString0, campaignKt$Dsl0._build());
        }
    }

    @Override  // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setShowTimestamp(@l ByteString byteString0) {
        L.p(byteString0, "opportunityId");
        Campaign campaignStateOuterClass$Campaign0 = this.getCampaign(byteString0);
        if(campaignStateOuterClass$Campaign0 != null) {
            com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = campaignStateOuterClass$Campaign0.toBuilder();
            L.o(generatedMessageLite$Builder0, "this.toBuilder()");
            gatewayprotocol.v1.CampaignKt.Dsl campaignKt$Dsl0 = gatewayprotocol.v1.CampaignKt.Dsl.Companion._create(((gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder)generatedMessageLite$Builder0));
            campaignKt$Dsl0.setShowTimestamp(this.getSharedDataTimestamps.invoke());
            this.setCampaign(byteString0, campaignKt$Dsl0._build());
        }
    }
}

