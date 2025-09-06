package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
final class zzzn {
    public static boolean zza(Context context0) {
        DisplayManager displayManager0 = (DisplayManager)context0.getSystemService("display");
        Display display0 = displayManager0 == null ? null : displayManager0.getDisplay(0);
        if(display0 != null && display0.isHdr()) {
            int[] arr_v = display0.getHdrCapabilities().getSupportedHdrTypes();
            for(int v = 0; v < arr_v.length; ++v) {
                if(arr_v[v] == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}

