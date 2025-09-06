package com.bykv.vk.openvk.preload.geckox.utils;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.Closeable;
import java.io.IOException;

public class CloseableUtils {
    public static boolean close(Cursor cursor0) {
        if(cursor0 == null) {
            return true;
        }
        try {
            cursor0.close();
            return true;
        }
        catch(Exception exception0) {
            GeckoLogger.e("gecko-debug-tag", "close:", exception0);
            return false;
        }
    }

    public static boolean close(SQLiteDatabase sQLiteDatabase0) {
        if(sQLiteDatabase0 == null) {
            return true;
        }
        try {
            sQLiteDatabase0.close();
            return true;
        }
        catch(Exception exception0) {
            GeckoLogger.e("gecko-debug-tag", "close:", exception0);
            return false;
        }
    }

    public static boolean close(Closeable closeable0) {
        if(closeable0 == null) {
            return true;
        }
        try {
            closeable0.close();
            return true;
        }
        catch(IOException iOException0) {
            GeckoLogger.e("gecko-debug-tag", "close:", iOException0);
            return false;
        }
    }
}

