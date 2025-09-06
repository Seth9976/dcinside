package com.bytedance.sdk.openadsdk.SM;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.JQp.xE;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.lang.ref.WeakReference;

public class ReZ implements xE {
    private final WeakReference PjT;
    private xE ReZ;
    private final String Zh;

    private ReZ(ImageView imageView0) {
        this.Zh = "ImageLoaderToViewWrapper";
        this.PjT = new WeakReference(imageView0);
    }

    private ReZ(ImageView imageView0, xE xE0) {
        this.Zh = "ImageLoaderToViewWrapper";
        this.PjT = new WeakReference(imageView0);
        this.ReZ = xE0;
    }

    public static xE PjT(Owx owx0, String s, ImageView imageView0) {
        return new Zh(owx0, s, new ReZ(imageView0));
    }

    public static xE PjT(Owx owx0, String s, ImageView imageView0, xE xE0) {
        return new Zh(owx0, s, new ReZ(imageView0, xE0));
    }

    @Override  // com.bytedance.sdk.component.JQp.xE
    public void PjT(int v, String s, @Nullable Throwable throwable0) {
        xE xE0 = this.ReZ;
        if(xE0 != null) {
            xE0.PjT(v, s, throwable0);
        }
    }

    @Override  // com.bytedance.sdk.component.JQp.xE
    public void PjT(qj qj0) {
        ImageView imageView0 = (ImageView)this.PjT.get();
        if(imageView0 != null && qj0.Zh() instanceof Bitmap) {
            Bitmap bitmap0 = (Bitmap)qj0.Zh();
            if(Jo.cz()) {
                imageView0.setImageBitmap(bitmap0);
            }
            else {
                fDm.ReZ().post(new Runnable() {
                    final ReZ ReZ;

                    @Override
                    public void run() {
                        imageView0.setImageBitmap(bitmap0);
                    }
                });
            }
            xE xE0 = this.ReZ;
            if(xE0 != null) {
                xE0.PjT(qj0);
            }
        }
    }
}

