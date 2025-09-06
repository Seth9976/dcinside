package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

public abstract class zag implements DialogInterface.OnClickListener {
    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        try {
            this.zaa();
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            Log.e("DialogRedirect", "Failed to start resolution intent.", activityNotFoundException0);
        }
        finally {
            dialogInterface0.dismiss();
        }
    }

    protected abstract void zaa();

    public static zag zab(Activity activity0, @Nullable Intent intent0, int v) {
        return new zad(intent0, activity0, v);
    }

    public static zag zac(@NonNull Fragment fragment0, @Nullable Intent intent0, int v) {
        return new zae(intent0, fragment0, v);
    }

    public static zag zad(@NonNull LifecycleFragment lifecycleFragment0, @Nullable Intent intent0, int v) {
        return new zaf(intent0, lifecycleFragment0, 2);
    }
}

