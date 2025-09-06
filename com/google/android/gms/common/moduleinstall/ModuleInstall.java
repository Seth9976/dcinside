package com.google.android.gms.common.moduleinstall;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.moduleinstall.internal.zay;

public final class ModuleInstall {
    @NonNull
    public static ModuleInstallClient getClient(@NonNull Activity activity0) {
        return new zay(activity0);
    }

    @NonNull
    public static ModuleInstallClient getClient(@NonNull Context context0) {
        return new zay(context0);
    }
}

