package com.igaworks.ssp;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;

public abstract class h0 {
    public static int a(Context context0, String s, String s1) {
        try {
            return context0.getResources().getIdentifier(s, s1, "com.dcinside.app.android");
        }
        catch(Exception unused_ex) {
            return 0;
        }
    }

    public static Bitmap a(Context context0, String s) {
        if(s != null && !s.equals("")) {
            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.RGB_565;
            bitmapFactory$Options0.inSampleSize = 1;
            try {
                int v = context0.getResources().getIdentifier((s.contains(".") ? s.substring(0, s.lastIndexOf(".")) : s), "mipmap", "com.dcinside.app.android");
                if(v > 0) {
                    InputStream inputStream0 = context0.getResources().openRawResource(v);
                    Bitmap bitmap0 = BitmapFactory.decodeStream(inputStream0, null, bitmapFactory$Options0);
                    if(inputStream0 != null) {
                        try {
                            inputStream0.close();
                            return bitmap0;
                        }
                        catch(IOException iOException0) {
                            iOException0.printStackTrace();
                        }
                    }
                    return bitmap0;
                }
            }
            catch(Exception unused_ex) {
            }
            try {
                InputStream inputStream1 = context0.getResources().getAssets().open("igaworks/ssp/res/" + s);
                Bitmap bitmap1 = BitmapFactory.decodeStream(inputStream1, null, bitmapFactory$Options0);
                if(inputStream1 != null) {
                    inputStream1.close();
                }
                return bitmap1;
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }
}

