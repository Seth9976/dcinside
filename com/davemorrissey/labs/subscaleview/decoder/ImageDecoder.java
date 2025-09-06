package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;

public interface ImageDecoder {
    @NonNull
    Bitmap decode(Context arg1, @NonNull Uri arg2) throws Exception;
}

