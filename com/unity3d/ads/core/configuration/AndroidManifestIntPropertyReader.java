package com.unity3d.ads.core.configuration;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidManifestIntPropertyReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidManifestIntPropertyReader.kt\ncom/unity3d/ads/core/configuration/AndroidManifestIntPropertyReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
public final class AndroidManifestIntPropertyReader {
    @l
    private final Context context;

    public AndroidManifestIntPropertyReader(@l Context context0) {
        L.p(context0, "context");
        super();
        this.context = context0;
    }

    @m
    public final Integer getPropertyByName(@l String s) {
        L.p(s, "propertyName");
        try {
            Bundle bundle0 = this.context.getPackageManager().getApplicationInfo("com.dcinside.app.android", 0x80).metaData;
            Integer integer0 = bundle0.getInt(s);
            if(bundle0.containsKey(s)) {
                return integer0;
            }
        }
        catch(Exception unused_ex) {
        }
        return null;
    }
}

