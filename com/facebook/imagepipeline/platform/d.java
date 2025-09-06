package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap.Config;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import com.facebook.common.references.a;
import y4.l;
import y4.m;

public interface d {
    @m
    a a(@l com.facebook.imagepipeline.image.l arg1, @l Bitmap.Config arg2, @m Rect arg3);

    @m
    a b(@l com.facebook.imagepipeline.image.l arg1, @l Bitmap.Config arg2, @m Rect arg3, int arg4, @m ColorSpace arg5);

    @m
    a c(@l com.facebook.imagepipeline.image.l arg1, @l Bitmap.Config arg2, @m Rect arg3, @m ColorSpace arg4);

    @m
    a d(@l com.facebook.imagepipeline.image.l arg1, @l Bitmap.Config arg2, @m Rect arg3, int arg4);
}

