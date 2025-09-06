package com.bytedance.sdk.component.adexpress.PjT.PjT;

import android.content.ContentValues;
import android.database.Cursor;

public interface Zh {
    int PjT(String arg1, ContentValues arg2, String arg3, String[] arg4);

    int PjT(String arg1, String arg2, String[] arg3);

    Cursor PjT(String arg1, String[] arg2, String arg3, String[] arg4, String arg5, String arg6, String arg7);

    void PjT(String arg1, ContentValues arg2);
}

