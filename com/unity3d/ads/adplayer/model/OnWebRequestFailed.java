package com.unity3d.ads.adplayer.model;

import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nWebViewEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewEvent.kt\ncom/unity3d/ads/adplayer/model/OnWebRequestFailed\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,126:1\n37#2,2:127\n*S KotlinDebug\n*F\n+ 1 WebViewEvent.kt\ncom/unity3d/ads/adplayer/model/OnWebRequestFailed\n*L\n124#1:127,2\n*E\n"})
public final class OnWebRequestFailed implements WebViewEvent {
    @l
    private final String category;
    @l
    private final String name;
    @l
    private final Object[] parameters;

    public OnWebRequestFailed(@l List list0) {
        L.p(list0, "value");
        super();
        this.category = "REQUEST";
        this.name = "FAILED";
        this.parameters = list0.toArray(new Object[0]);
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

