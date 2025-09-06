package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

public interface Text {
    @RecentlyNonNull
    Rect getBoundingBox();

    @RecentlyNonNull
    List getComponents();

    @RecentlyNonNull
    Point[] getCornerPoints();

    @RecentlyNonNull
    String getLanguage();

    @RecentlyNonNull
    String getValue();
}

