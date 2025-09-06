package com.unity3d.ads.core.domain;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nCommonGetFileExtensionFromUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonGetFileExtensionFromUrl.kt\ncom/unity3d/ads/core/domain/CommonGetFileExtensionFromUrl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
public final class CommonGetFileExtensionFromUrl implements GetFileExtensionFromUrl {
    @l
    private final RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(@l RemoveUrlQuery removeUrlQuery0) {
        L.p(removeUrlQuery0, "removeUrlQuery");
        super();
        this.removeUrlQuery = removeUrlQuery0;
    }

    @l
    public final RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    @Override  // com.unity3d.ads.core.domain.GetFileExtensionFromUrl
    @m
    public String invoke(@l String s) {
        L.p(s, "url");
        String s1 = this.removeUrlQuery.invoke(s);
        if(s1 == null) {
            return null;
        }
        String s2 = v.u5(s1, '/', null, 2, null);
        if(v.V2(s2, '.', false, 2, null)) {
            String s3 = v.u5(s2, '.', null, 2, null);
            return s3.length() == 0 ? null : s3;
        }
        return null;
    }
}

