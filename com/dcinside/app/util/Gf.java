package com.dcinside.app.util;

import com.dcinside.app.write.menu.video.VideoInfoData;
import rx.functions.p;

public final class gf implements p {
    public final String a;
    public final VideoInfoData b;

    public gf(String s, VideoInfoData videoInfoData0) {
        this.a = s;
        this.b = videoInfoData0;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.Rw(this.a, this.b, ((String)object0));
    }
}

