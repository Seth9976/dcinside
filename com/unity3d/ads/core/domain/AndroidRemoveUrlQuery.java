package com.unity3d.ads.core.domain;

import android.net.Uri;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidRemoveUrlQuery implements RemoveUrlQuery {
    @Override  // com.unity3d.ads.core.domain.RemoveUrlQuery
    @l
    public String invoke(@l String s) {
        L.p(s, "url");
        String s1 = Uri.parse(s).buildUpon().clearQuery().build().toString();
        L.o(s1, "parse(url).buildUpon().c…uery().build().toString()");
        return s1;
    }
}

