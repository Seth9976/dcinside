package com.unity3d.ads.core.data.datasource;

import y4.l;

public enum AndroidKnownStore {
    GOOGLE("com.android.vending"),
    GOOGLE_MARKET("com.google.market"),
    AMAZON("com.amazon.venezia"),
    SAMSUNG("com.sec.android.app.samsungapps"),
    XIAOMI("com.xiaomi.market"),
    HUAWEI("com.huawei.appmarket"),
    OPPO("com.oppo.market"),
    VIVO("com.bbk.appstore"),
    UNKNOWN("unknown");

    @l
    private final String packageName;

    private static final AndroidKnownStore[] $values() [...] // Inlined contents

    private AndroidKnownStore(String s1) {
        this.packageName = s1;
    }

    @l
    public final String getPackageName() {
        return this.packageName;
    }
}

