package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.ReZ.ReZ;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class Qf {
    public static float PjT(View view0) {
        long v1;
        long v;
        if(view0 != null) {
            try {
                if(view0.getVisibility() == 0 && view0.getParent() != null) {
                    Rect rect0 = new Rect();
                    if(!view0.getGlobalVisibleRect(rect0)) {
                        return -1.0f;
                    }
                    v = ((long)rect0.height()) * ((long)rect0.width());
                    v1 = ((long)view0.getHeight()) * ((long)view0.getWidth());
                    return v1 <= 0L ? -1.0f : ((float)v) / ((float)v1);
                }
            }
            catch(Throwable unused_ex) {
            }
            return -1.0f;
        }
        try {
        }
        catch(Throwable unused_ex) {
        }
        return -1.0f;
    }

    private static boolean PjT(View view0, int v) {
        float f = Qf.PjT(view0);
        return f > 0.0f && f >= ((float)v) / 100.0f;
    }

    public static boolean PjT(View view0, int v, int v1) {
        try {
            if(v1 == 1) {
                while(view0 != null) {
                    if(view0.getVisibility() != 0) {
                        return false;
                    }
                    if(view0 instanceof ltE || view0 instanceof ReZ) {
                        break;
                    }
                    view0 = (View)view0.getParent();
                }
            }
            if(Qf.Zh(view0, v, v1) == 0) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    private static int ReZ(View view0, int v) {
        return v == 3 ? ((int)(((double)qZS.ReZ(view0.getContext().getApplicationContext())) * 0.7)) : 20;
    }

    private static int Zh(View view0, int v, int v1) throws Throwable {
        if(view0.getWindowVisibility() != 0) {
            return 4;
        }
        if(!Qf.Zh(view0)) {
            return 1;
        }
        if(!Qf.Zh(view0, v1)) {
            return 6;
        }
        return Qf.PjT(view0, v) ? 0 : 3;
    }

    private static boolean Zh(View view0) {
        return view0 != null && view0.isShown();
    }

    private static boolean Zh(View view0, int v) {
        int v1 = Qf.ReZ(view0, v);
        int v2 = Qf.cr(view0, v);
        return view0.getWidth() >= v1 && view0.getHeight() >= v2;
    }

    private static int cr(View view0, int v) {
        return v == 3 ? qZS.JQp(view0.getContext().getApplicationContext()) / 2 : 20;
    }
}

