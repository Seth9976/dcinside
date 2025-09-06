package com.dcinside.app.util;

import A3.o;
import com.dcinside.app.write.menu.video.VideoInfoData;
import kotlin.jvm.functions.Function1;

public final class n1 implements Function1 {
    public final VideoInfoData a;

    public n1(VideoInfoData videoInfoData0) {
        this.a = videoInfoData0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.GE(this.a, ((o)object0));
    }
}

