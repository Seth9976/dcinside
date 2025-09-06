package com.karumi.dexter;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.PermissionChecker;

class AndroidPermissionService {
    int checkSelfPermission(@NonNull Context context0, @NonNull String s) {
        return PermissionChecker.d(context0, s);
    }

    boolean isPermissionPermanentlyDenied(@Nullable Activity activity0, @NonNull String s) {
        return Build.VERSION.SDK_INT >= 23 ? !this.shouldShowRequestPermissionRationale(activity0, s) : false;
    }

    void requestPermissions(@Nullable Activity activity0, @NonNull String[] arr_s, int v) {
        if(activity0 == null) {
            return;
        }
        ActivityCompat.m(activity0, arr_s, v);
    }

    boolean shouldShowRequestPermissionRationale(@Nullable Activity activity0, @NonNull String s) {
        return activity0 == null ? false : ActivityCompat.s(activity0, s);
    }
}

