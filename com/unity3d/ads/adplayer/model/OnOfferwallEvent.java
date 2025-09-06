package com.unity3d.ads.adplayer.model;

import com.unity3d.services.ads.offerwall.OfferwallEvent;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nWebViewEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewEvent.kt\ncom/unity3d/ads/adplayer/model/OnOfferwallEvent\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,126:1\n26#2:127\n*S KotlinDebug\n*F\n+ 1 WebViewEvent.kt\ncom/unity3d/ads/adplayer/model/OnOfferwallEvent\n*L\n58#1:127\n*E\n"})
public final class OnOfferwallEvent implements WebViewEvent {
    @l
    private final String category;
    @l
    private final String name;
    @l
    private final Object[] parameters;

    public OnOfferwallEvent(@l OfferwallEvent offerwallEvent0) {
        L.p(offerwallEvent0, "offerwallEvent");
        super();
        this.category = "OFFERWALL";
        this.name = offerwallEvent0.name();
        this.parameters = new Object[0];
    }

    @Override  // com.unity3d.ads.adplayer.model.WebViewEvent
    @l
    public String getCategory() {
        return this.category;
    }

    @Override  // com.unity3d.ads.adplayer.model.WebViewEvent
    @l
    public String getName() {
        return this.name;
    }

    @Override  // com.unity3d.ads.adplayer.model.WebViewEvent
    @l
    public Object[] getParameters() {
        return this.parameters;
    }
}

