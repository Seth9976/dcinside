package com.unity3d.services.core.misc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.core.log.DeviceLog;

public class ViewUtilities {
    public static float dpFromPx(Context context0, float f) {
        return f / context0.getResources().getDisplayMetrics().density;
    }

    public static float pxFromDp(Context context0, float f) {
        return f * context0.getResources().getDisplayMetrics().density;
    }

    public static void removeViewFromParent(View view0) {
        if(view0 != null && view0.getParent() != null) {
            try {
                ((ViewGroup)view0.getParent()).removeView(view0);
            }
            catch(Exception exception0) {
                DeviceLog.exception("Error while removing view from it\'s parent", exception0);
            }
        }
    }

    public static void setBackground(View view0, Drawable drawable0) {
        try {
            view0.setBackground(drawable0);
        }
        catch(Exception exception0) {
            DeviceLog.exception("Couldn\'t runsetBackground", exception0);
        }
    }
}

