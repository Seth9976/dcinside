package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.NonNull;

public interface ImageRegionDecoder {
    @NonNull
    Bitmap decodeRegion(@NonNull Rect arg1, int arg2);

    @NonNull
    Point init(Context arg1, @NonNull Uri arg2) throws Exception;

    boolean isReady();

    void recycle();
}

