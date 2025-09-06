package d1;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

public final class c {
    @l
    public static final c a = null;
    public static final int b = 25;

    static {
        c.a = new c();
    }

    @RequiresApi(17)
    @n
    public static final void a(@l Bitmap bitmap0, @l Bitmap bitmap1, @l Context context0, int v) {
        RenderScript renderScript1;
        L.p(bitmap0, "dest");
        L.p(bitmap1, "src");
        L.p(context0, "context");
        com.facebook.common.internal.n.d(Boolean.valueOf(v > 0 && v <= 25));
        RenderScript renderScript0 = null;
        try {
            renderScript1 = RenderScript.create(context0);
            if(renderScript1 == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        catch(Throwable throwable0) {
            goto label_27;
        }
        try {
            ScriptIntrinsicBlur scriptIntrinsicBlur0 = ScriptIntrinsicBlur.create(renderScript1, Element.U8_4(renderScript1));
            Allocation allocation0 = Allocation.createFromBitmap(renderScript1, bitmap1);
            if(allocation0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Allocation allocation1 = Allocation.createFromBitmap(renderScript1, bitmap0);
            if(allocation1 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            scriptIntrinsicBlur0.setRadius(((float)v));
            scriptIntrinsicBlur0.setInput(allocation0);
            scriptIntrinsicBlur0.forEach(allocation1);
            allocation1.copyTo(bitmap0);
            scriptIntrinsicBlur0.destroy();
            allocation0.destroy();
            allocation1.destroy();
            goto label_30;
        }
        catch(Throwable throwable0) {
            renderScript0 = renderScript1;
        }
    label_27:
        if(renderScript0 != null) {
            renderScript0.destroy();
        }
        throw throwable0;
    label_30:
        renderScript1.destroy();
    }

    @n
    public static final boolean b() [...] // Inlined contents
}

