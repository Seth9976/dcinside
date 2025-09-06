package com.bytedance.sdk.component.adexpress.cr;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ;
import com.bytedance.sdk.component.adexpress.cr;

public class PjT {
    public static Bitmap PjT(Context context0, Bitmap bitmap0, int v) {
        ScriptIntrinsicBlur scriptIntrinsicBlur0;
        Allocation allocation0;
        RenderScript renderScript0;
        Bitmap bitmap2;
        Bitmap bitmap1;
        try {
            int v1 = Build.VERSION.SDK_INT;
            if(!cr.Zh() || v1 >= 26) {
                bitmap1 = Bitmap.createScaledBitmap(bitmap0, Math.round(((float)bitmap0.getWidth()) * 0.2f), Math.round(((float)bitmap0.getHeight()) * 0.2f), false);
                bitmap2 = Bitmap.createBitmap(bitmap1);
                renderScript0 = RenderScript.create(context0);
                goto label_9;
            }
            goto label_58;
        }
        catch(Throwable unused_ex) {
            renderScript0 = null;
            allocation0 = null;
            goto label_16;
        }
    label_9:
        if(renderScript0 == null) {
            try {
                ReZ reZ0 = com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().ReZ();
                return reZ0 == null || !reZ0.ub() ? null : null;
            }
            catch(Throwable unused_ex) {
            }
            return null;
        }
        try {
            scriptIntrinsicBlur0 = ScriptIntrinsicBlur.create(renderScript0, Element.U8_4(renderScript0));
            goto label_19;
        }
        catch(Throwable unused_ex) {
            allocation0 = null;
        }
    label_16:
        scriptIntrinsicBlur0 = null;
        Allocation allocation1 = null;
        goto label_31;
        try {
        label_19:
            allocation0 = Allocation.createFromBitmap(renderScript0, bitmap1);
        }
        catch(Throwable unused_ex) {
            allocation0 = null;
            allocation1 = null;
            goto label_31;
        }
        try {
            allocation1 = null;
            allocation1 = Allocation.createFromBitmap(renderScript0, bitmap2);
            scriptIntrinsicBlur0.setRadius(((float)v));
            scriptIntrinsicBlur0.setInput(allocation0);
            scriptIntrinsicBlur0.forEach(allocation1);
            allocation1.copyTo(bitmap2);
        }
        catch(Throwable unused_ex) {
            try {
            label_31:
                ReZ reZ1 = com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().ReZ();
                if(reZ1 != null && reZ1.ub()) {
                    if(renderScript0 != null) {
                        if(Build.VERSION.SDK_INT >= 23) {
                            RenderScript.releaseAllContexts();
                        }
                        else {
                            renderScript0.destroy();
                        }
                    }
                    if(allocation0 != null) {
                        allocation0.destroy();
                    }
                    if(allocation1 != null) {
                        allocation1.destroy();
                    }
                    if(scriptIntrinsicBlur0 != null) {
                        scriptIntrinsicBlur0.destroy();
                    }
                }
                return null;
            }
            catch(Throwable unused_ex) {
            }
            return null;
        }
        try {
            ReZ reZ2 = com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().ReZ();
            if(reZ2 != null && reZ2.ub()) {
                if(v1 >= 23) {
                    RenderScript.releaseAllContexts();
                }
                else {
                    renderScript0.destroy();
                }
                if(allocation0 != null) {
                    allocation0.destroy();
                }
                allocation1.destroy();
                scriptIntrinsicBlur0.destroy();
            }
            return bitmap2;
        }
        catch(Throwable unused_ex) {
        }
        return bitmap2;
        try {
        label_58:
            ReZ reZ3 = com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().ReZ();
            if(reZ3 != null) {
                reZ3.ub();
                return null;
            }
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
        return null;
    }
}

