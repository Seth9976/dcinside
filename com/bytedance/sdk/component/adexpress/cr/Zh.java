package com.bytedance.sdk.component.adexpress.cr;

import android.content.Context;
import android.text.TextUtils;

public class Zh {
    public static boolean PjT(Context context0) {
        return context0 == null ? false : TextUtils.getLayoutDirectionFromLocale(context0.getResources().getConfiguration().locale) == 1 && (context0.getApplicationInfo().flags & 0x400000) == 0x400000;
    }
}

