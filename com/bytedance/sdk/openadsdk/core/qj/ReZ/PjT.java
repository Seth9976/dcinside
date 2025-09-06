package com.bytedance.sdk.openadsdk.core.qj.ReZ;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.HashSet;
import java.util.Set;

public class PjT {
    public static enum com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT {
        NONE,
        IMAGE,
        JAVASCRIPT;

    }

    public static enum Zh {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE;

    }

    public static final Set PjT;
    public static Set Zh;

    static {
        PjT.PjT = new HashSet() {
            {
                this.add("image/jpeg");
                this.add("image/png");
                this.add("image/bmp");
                this.add("image/gif");
                this.add("image/jpg");
            }
        };
        PjT.Zh = new HashSet() {
            {
                this.add("application/x-javascript");
            }
        };
    }

    @NonNull
    public static Point PjT(Context context0, int v, int v1, Zh pjT$Zh0) {
        if(context0 == null) {
            context0 = ub.PjT();
        }
        Point point0 = new Point(v, v1);
        Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
        int v2 = display0.getWidth();
        int v3 = display0.getHeight();
        int v4 = qZS.Zh(context0, ((float)v));
        int v5 = qZS.Zh(context0, ((float)v1));
        if(v4 <= v2 && v5 <= v3) {
            return point0;
        }
        Point point1 = new Point();
        if(Zh.PjT == pjT$Zh0) {
            point1.x = Math.min(v2, v4);
            point1.y = Math.min(v3, v5);
        }
        else {
            float f = ((float)v4) / ((float)v2);
            float f1 = ((float)v5) / ((float)v3);
            if(f >= f1) {
                point1.x = v2;
                point1.y = (int)(((float)v5) / f);
            }
            else {
                point1.x = (int)(((float)v4) / f1);
                point1.y = v3;
            }
        }
        int v6 = point1.x;
        if(v6 >= 0 && point1.y >= 0) {
            point1.x = qZS.ReZ(context0, ((float)v6));
            point1.y = qZS.ReZ(context0, ((float)point1.y));
            return point1;
        }
        return point0;
    }
}

