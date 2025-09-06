package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import y4.l;

public final class IconKt {
    @RequiresApi(26)
    @l
    public static final Icon a(@l Bitmap bitmap0) {
        return Icon.createWithAdaptiveBitmap(bitmap0);
    }

    @RequiresApi(26)
    @l
    public static final Icon b(@l Bitmap bitmap0) {
        return Icon.createWithBitmap(bitmap0);
    }

    @RequiresApi(26)
    @l
    public static final Icon c(@l Uri uri0) {
        return Icon.createWithContentUri(uri0);
    }

    @RequiresApi(26)
    @l
    public static final Icon d(@l byte[] arr_b) {
        return Icon.createWithData(arr_b, 0, arr_b.length);
    }
}

