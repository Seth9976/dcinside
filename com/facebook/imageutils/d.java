package com.facebook.imageutils;

import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;
import x0.a;
import y4.l;
import y4.m;
import z3.n;

public final class d {
    @l
    public static final d a = null;
    @l
    private static final String b = "HeifExifUtil";

    static {
        d.a = new d();
    }

    @n
    public static final int a(@m InputStream inputStream0) {
        if(inputStream0 == null) {
            a.i("HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
            return 0;
        }
        try {
            return new ExifInterface(inputStream0).l("Orientation", 1);
        }
        catch(IOException iOException0) {
            a.n("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", iOException0);
            return 0;
        }
    }
}

