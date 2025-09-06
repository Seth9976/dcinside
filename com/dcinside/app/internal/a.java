package com.dcinside.app.internal;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nBitmapExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapExtension.kt\ncom/dcinside/app/internal/BitmapExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class a {
    public static final boolean a(@l Bitmap bitmap0, @l File file0, @l Bitmap.CompressFormat bitmap$CompressFormat0, int v) {
        boolean z;
        L.p(bitmap0, "<this>");
        L.p(file0, "file");
        L.p(bitmap$CompressFormat0, "format");
        FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
        try {
            z = bitmap0.compress(bitmap$CompressFormat0, v, fileOutputStream0);
        }
        catch(Throwable throwable0) {
            c.a(fileOutputStream0, throwable0);
            throw throwable0;
        }
        c.a(fileOutputStream0, null);
        return z;
    }

    public static final boolean b(@l Bitmap bitmap0, @l OutputStream outputStream0, @l Bitmap.CompressFormat bitmap$CompressFormat0, int v) {
        boolean z;
        L.p(bitmap0, "<this>");
        L.p(outputStream0, "os");
        L.p(bitmap$CompressFormat0, "format");
        try {
            z = bitmap0.compress(bitmap$CompressFormat0, v, outputStream0);
        }
        catch(Throwable throwable0) {
            c.a(outputStream0, throwable0);
            throw throwable0;
        }
        c.a(outputStream0, null);
        return z;
    }

    public static boolean c(Bitmap bitmap0, File file0, Bitmap.CompressFormat bitmap$CompressFormat0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            bitmap$CompressFormat0 = Bitmap.CompressFormat.WEBP;
        }
        if((v1 & 4) != 0) {
            v = 0x60;
        }
        return a.a(bitmap0, file0, bitmap$CompressFormat0, v);
    }

    public static boolean d(Bitmap bitmap0, OutputStream outputStream0, Bitmap.CompressFormat bitmap$CompressFormat0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            bitmap$CompressFormat0 = Bitmap.CompressFormat.WEBP;
        }
        if((v1 & 4) != 0) {
            v = 0x60;
        }
        return a.b(bitmap0, outputStream0, bitmap$CompressFormat0, v);
    }
}

