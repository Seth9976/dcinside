package com.fsn.cauly.blackdragoncore.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;

public class m {
    public static Bitmap a(Context context0, String s) {
        InputStream inputStream0;
        Bitmap bitmap0 = null;
        try {
            inputStream0 = null;
            inputStream0 = m.b(context0, s);
            bitmap0 = BitmapFactory.decodeStream(inputStream0);
            goto label_19;
        }
        catch(Exception exception0) {
            goto label_9;
        }
        catch(Throwable throwable0) {
        }
        goto label_14;
        try {
            try {
                bitmap0 = BitmapFactory.decodeStream(inputStream0);
                goto label_19;
            }
            catch(Exception exception0) {
            }
        label_9:
            exception0.printStackTrace();
        }
        catch(Throwable throwable0) {
            goto label_13;
        }
        try {
            inputStream0.close();
            return null;
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
            return bitmap0;
        }
    label_13:
        bitmap0 = inputStream0;
        try {
        label_14:
            ((InputStream)bitmap0).close();
        }
        catch(IOException iOException1) {
            iOException1.printStackTrace();
        }
        throw throwable0;
        try {
        label_19:
            inputStream0.close();
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
        }
        return bitmap0;
    }

    public static InputStream b(Context context0, String s) {
        try {
            return context0.getResources().getAssets().open(s, 3);
        }
        catch(IOException unused_ex) {
            return null;
        }
    }
}

