package androidx.media3.datasource;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@UnstableApi
public final class BitmapUtil {
    public static Bitmap a(byte[] arr_b, int v, @Nullable BitmapFactory.Options bitmapFactory$Options0) throws IOException {
        ExifInterface exifInterface0;
        Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, v, bitmapFactory$Options0);
        if(bitmap0 == null) {
            throw ParserException.a("Could not decode image data", new IllegalStateException());
        }
        try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b)) {
            exifInterface0 = new ExifInterface(byteArrayInputStream0);
        }
        int v1 = exifInterface0.B();
        if(v1 != 0) {
            Matrix matrix0 = new Matrix();
            matrix0.postRotate(((float)v1));
            return Bitmap.createBitmap(bitmap0, 0, 0, bitmap0.getWidth(), bitmap0.getHeight(), matrix0, false);
        }
        return bitmap0;
    }
}

