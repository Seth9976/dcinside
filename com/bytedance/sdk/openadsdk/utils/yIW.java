package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.JQp.xE;
import java.lang.ref.WeakReference;

public class yIW implements xE {
    private final WeakReference PjT;

    public yIW(ImageView imageView0) {
        this.PjT = new WeakReference(imageView0);
    }

    @Override  // com.bytedance.sdk.component.JQp.xE
    public void PjT(int v, String s, @Nullable Throwable throwable0) {
        ImageView imageView0 = (ImageView)this.PjT.get();
        if(imageView0 == null) {
            return;
        }
        imageView0.setVisibility(8);
    }

    @Override  // com.bytedance.sdk.component.JQp.xE
    public void PjT(qj qj0) {
        ImageView imageView0 = (ImageView)this.PjT.get();
        if(imageView0 == null) {
            return;
        }
        try {
            if(qj0 != null && qj0.Zh() != null) {
                imageView0.setImageBitmap(((Bitmap)qj0.Zh()));
                return;
            }
            imageView0.setVisibility(8);
        }
        catch(Throwable unused_ex) {
            imageView0.setVisibility(8);
        }
    }
}

