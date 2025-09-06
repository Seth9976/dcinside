package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface PjT {
    int PjT(@NonNull Uri arg1, @Nullable ContentValues arg2, @Nullable String arg3, @Nullable String[] arg4);

    int PjT(@NonNull Uri arg1, @Nullable String arg2, @Nullable String[] arg3);

    Cursor PjT(@NonNull Uri arg1, @Nullable String[] arg2, @Nullable String arg3, @Nullable String[] arg4, @Nullable String arg5);

    Uri PjT(@NonNull Uri arg1, @Nullable ContentValues arg2);

    @NonNull
    String PjT();

    String PjT(@NonNull Uri arg1);
}

