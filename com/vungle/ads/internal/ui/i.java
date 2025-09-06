package com.vungle.ads.internal.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.widget.ImageView;
import kotlin.jvm.internal.L;
import y4.l;

public class i extends ImageView {
    public i(@l Context context0, @l String s) {
        L.p(context0, "context");
        L.p(s, "watermark");
        super(context0);
        byte[] arr_b = Base64.decode(s, 0);
        L.o(arr_b, "overlayBytes");
        Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(context0.getResources(), bitmap0);
        bitmapDrawable0.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        bitmapDrawable0.setTargetDensity(context0.getResources().getDisplayMetrics());
        this.setBackground(bitmapDrawable0);
        this.setClickable(false);
        this.setFocusable(false);
    }
}

