package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.io.File;
import java.net.URL;

interface i {
    @CheckResult
    @Deprecated
    Object a(@Nullable URL arg1);

    @CheckResult
    @NonNull
    Object b(@Nullable File arg1);

    @CheckResult
    @NonNull
    Object c(@Nullable Drawable arg1);

    @CheckResult
    @NonNull
    Object d(@Nullable Object arg1);

    @CheckResult
    @NonNull
    Object e(@Nullable Uri arg1);

    @CheckResult
    @NonNull
    Object f(@Nullable byte[] arg1);

    @CheckResult
    @NonNull
    Object g(@Nullable Bitmap arg1);

    @CheckResult
    @NonNull
    Object h(@DrawableRes @Nullable @RawRes Integer arg1);

    @CheckResult
    @NonNull
    Object load(@Nullable String arg1);
}

