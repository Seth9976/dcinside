package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.InputStream;
import java.util.List;
import jeb.synthetic.TWR;

public class SkiaImageDecoder implements ImageDecoder {
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private final Bitmap.Config bitmapConfig;

    @Keep
    public SkiaImageDecoder() {
        this(null);
    }

    public SkiaImageDecoder(@Nullable Bitmap.Config bitmap$Config0) {
        Bitmap.Config bitmap$Config1 = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if(bitmap$Config0 != null) {
            this.bitmapConfig = bitmap$Config0;
            return;
        }
        if(bitmap$Config1 != null) {
            this.bitmapConfig = bitmap$Config1;
            return;
        }
        this.bitmapConfig = Bitmap.Config.RGB_565;
    }

    @Override  // com.davemorrissey.labs.subscaleview.decoder.ImageDecoder
    @NonNull
    public Bitmap decode(Context context0, @NonNull Uri uri0) throws Exception {
        Bitmap bitmap1;
        InputStream inputStream0;
        Bitmap bitmap0;
        String s = uri0.toString();
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inPreferredConfig = this.bitmapConfig;
        if(s.startsWith("android.resource://")) {
            String s1 = uri0.getAuthority();
            Resources resources0 = "com.dcinside.app.android".equals(s1) ? context0.getResources() : context0.getPackageManager().getResourcesForApplication(s1);
            List list0 = uri0.getPathSegments();
            int v = list0.size();
            int v1 = 0;
            if(v == 2 && ((String)list0.get(0)).equals("drawable")) {
                v1 = resources0.getIdentifier(((String)list0.get(1)), "drawable", s1);
            }
            else if(v == 1 && TextUtils.isDigitsOnly(((CharSequence)list0.get(0)))) {
                try {
                    v1 = Integer.parseInt(((String)list0.get(0)));
                }
                catch(NumberFormatException unused_ex) {
                }
            }
            bitmap0 = BitmapFactory.decodeResource(context0.getResources(), v1, bitmapFactory$Options0);
        }
        else if(s.startsWith("file:///android_asset/")) {
            bitmap0 = BitmapFactory.decodeStream(context0.getAssets().open(s.substring(22)), null, bitmapFactory$Options0);
        }
        else if(s.startsWith("file://")) {
            bitmap0 = BitmapFactory.decodeFile(s.substring(7), bitmapFactory$Options0);
        }
        else {
            try {
                inputStream0 = context0.getContentResolver().openInputStream(uri0);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(null, throwable0);
                throw throwable0;
            }
            try {
                bitmap1 = BitmapFactory.decodeStream(inputStream0, null, bitmapFactory$Options0);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(inputStream0, throwable0);
                throw throwable0;
            }
            if(inputStream0 != null) {
                try {
                    inputStream0.close();
                }
                catch(Exception unused_ex) {
                }
            }
            bitmap0 = bitmap1;
        }
        if(bitmap0 == null) {
            throw new RuntimeException("Skia image region decoder returned null bitmap - image format may not be supported");
        }
        return bitmap0;
    }
}

