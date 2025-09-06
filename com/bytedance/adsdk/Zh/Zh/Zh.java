package com.bytedance.adsdk.Zh.Zh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.Zh.DWo;
import com.bytedance.adsdk.Zh.cr;
import com.bytedance.adsdk.Zh.cz.cz;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class Zh {
    private final Map JQp;
    private static final Object PjT;
    private final String ReZ;
    private final Context Zh;
    private cr cr;

    static {
        Zh.PjT = new Object();
    }

    public Zh(Drawable.Callback drawable$Callback0, String s, cr cr0, Map map0) {
        this.ReZ = TextUtils.isEmpty(s) || s.charAt(s.length() - 1) == 0x2F ? s : s + '/';
        this.JQp = map0;
        this.PjT(cr0);
        if(!(drawable$Callback0 instanceof View)) {
            this.Zh = null;
            return;
        }
        this.Zh = ((View)drawable$Callback0).getContext().getApplicationContext();
    }

    public Bitmap PjT(String s) {
        InputStream inputStream0;
        DWo dWo0 = (DWo)this.JQp.get(s);
        if(dWo0 == null) {
            return null;
        }
        Bitmap bitmap0 = dWo0.qj();
        if(bitmap0 != null) {
            return bitmap0;
        }
        cr cr0 = this.cr;
        if(cr0 != null) {
            return cr0.PjT(dWo0);
        }
        Context context0 = this.Zh;
        if(context0 == null) {
            return null;
        }
        String s1 = dWo0.SM();
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inScaled = true;
        bitmapFactory$Options0.inDensity = 0xA0;
        if(s1.startsWith("data:") && s1.indexOf("base64,") > 0) {
            try {
                byte[] arr_b = Base64.decode(s1.substring(s1.indexOf(44) + 1), 0);
                return this.Zh(s, BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0));
            }
            catch(IllegalArgumentException unused_ex) {
                return null;
            }
        }
        try {
            if(TextUtils.isEmpty(this.ReZ)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            inputStream0 = context0.getAssets().open(this.ReZ + s1);
        }
        catch(IOException unused_ex) {
            return null;
        }
        try {
            Bitmap bitmap1 = BitmapFactory.decodeStream(inputStream0, null, bitmapFactory$Options0);
            return bitmap1 == null ? null : this.Zh(s, cz.PjT(bitmap1, dWo0.PjT(), dWo0.Zh()));
        }
        catch(IllegalArgumentException unused_ex) {
            return null;
        }
    }

    public Bitmap PjT(String s, Bitmap bitmap0) {
        if(bitmap0 == null) {
            DWo dWo0 = (DWo)this.JQp.get(s);
            dWo0.PjT(null);
            return dWo0.qj();
        }
        Bitmap bitmap1 = ((DWo)this.JQp.get(s)).qj();
        this.Zh(s, bitmap0);
        return bitmap1;
    }

    public void PjT(cr cr0) {
        this.cr = cr0;
    }

    // 去混淆评级： 低(30)
    public boolean PjT(Context context0) {
        return context0 == null && this.Zh == null || this.Zh.equals(context0);
    }

    private Bitmap Zh(String s, Bitmap bitmap0) {
        synchronized(Zh.PjT) {
            ((DWo)this.JQp.get(s)).PjT(bitmap0);
            return bitmap0;
        }
    }
}

