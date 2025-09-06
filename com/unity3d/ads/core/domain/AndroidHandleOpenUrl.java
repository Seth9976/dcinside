package com.unity3d.ads.core.domain;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidHandleOpenUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidHandleOpenUrl.kt\ncom/unity3d/ads/core/domain/AndroidHandleOpenUrl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class AndroidHandleOpenUrl implements HandleOpenUrl {
    @l
    private final Context context;

    public AndroidHandleOpenUrl(@l Context context0) {
        L.p(context0, "context");
        super();
        this.context = context0;
    }

    @Override  // com.unity3d.ads.core.domain.HandleOpenUrl
    public void invoke(@l String s, @m String s1) {
        L.p(s, "url");
        Intent intent0 = new Intent();
        if(s1 == null || s1.length() <= 0) {
            s1 = null;
        }
        intent0.setPackage(s1);
        intent0.setAction("android.intent.action.VIEW");
        intent0.setData(Uri.parse(s));
        intent0.setFlags(0x10000000);
        this.context.startActivity(intent0);
    }
}

