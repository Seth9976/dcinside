package com.canhub.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class d {
    public static final class a {
        @m
        private final Bitmap a;
        private final int b;

        public a(@m Bitmap bitmap0, int v) {
            this.a = bitmap0;
            this.b = v;
        }

        @m
        public final Bitmap a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }
    }

    public static final class b {
        @m
        private final Bitmap a;
        private final int b;
        private final boolean c;
        private final boolean d;

        public b(@m Bitmap bitmap0, int v, boolean z, boolean z1) {
            this.a = bitmap0;
            this.b = v;
            this.c = z;
            this.d = z1;
        }

        @m
        public final Bitmap a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        public final boolean d() {
            return this.d;
        }
    }

    public final class c {
        public static final int[] a;

        static {
            int[] arr_v = new int[Bitmap.CompressFormat.values().length];
            try {
                arr_v[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            c.a = arr_v;
        }
    }

    @l
    public static final d a = null;
    @l
    private static final Rect b = null;
    @l
    private static final RectF c = null;
    private static final int d = 0x800;
    @l
    private static final String e = "wt";
    @l
    private static final RectF f;
    @l
    private static final float[] g;
    @l
    private static final float[] h;
    private static int i;
    @m
    private static Pair j;

    static {
        d.a = new d();
        d.b = new Rect();
        d.c = new RectF();
        d.f = new RectF();
        d.g = new float[6];
        d.h = new float[6];
    }

    public final float A(@l float[] arr_f) {
        L.p(arr_f, "points");
        return Math.min(Math.min(Math.min(arr_f[0], arr_f[2]), arr_f[4]), arr_f[6]);
    }

    public final float B(@l float[] arr_f) {
        L.p(arr_f, "points");
        return Math.max(Math.max(Math.max(arr_f[0], arr_f[2]), arr_f[4]), arr_f[6]);
    }

    public final float C(@l float[] arr_f) {
        L.p(arr_f, "points");
        return Math.min(Math.min(Math.min(arr_f[1], arr_f[3]), arr_f[5]), arr_f[7]);
    }

    public final float D(@l float[] arr_f) {
        L.p(arr_f, "points");
        return this.B(arr_f) - this.A(arr_f);
    }

    @l
    public final b E(@m Bitmap bitmap0, @l Context context0, @l Uri uri0) {
        ExifInterface exifInterface1;
        L.p(context0, "context");
        L.p(uri0, "uri");
        ExifInterface exifInterface0 = null;
        try {
            InputStream inputStream0 = context0.getContentResolver().openInputStream(uri0);
            if(inputStream0 != null) {
                try {
                    exifInterface1 = new ExifInterface(inputStream0);
                }
                catch(Throwable throwable0) {
                    kotlin.io.c.a(inputStream0, throwable0);
                    throw throwable0;
                }
                kotlin.io.c.a(inputStream0, null);
                exifInterface0 = exifInterface1;
                return exifInterface0 == null ? new b(bitmap0, 0, false, false) : this.F(bitmap0, exifInterface0);
            }
        }
        catch(Throwable unused_ex) {
        }
        return exifInterface0 == null ? new b(bitmap0, 0, false, false) : this.F(bitmap0, exifInterface0);
    }

    @l
    public final b F(@m Bitmap bitmap0, @l ExifInterface exifInterface0) {
        int v1;
        L.p(exifInterface0, "exif");
        boolean z = true;
        int v = exifInterface0.l("Orientation", 1);
        switch(v) {
            case 3: {
                v1 = 180;
                break;
            }
            case 5: {
                v1 = 90;
                break;
            }
            default: {
                if(v == 6 || v == 7) {
                    v1 = 90;
                }
                else if(v != 8) {
                    v1 = 0;
                }
                else {
                    v1 = 270;
                }
            }
        }
        if(v != 4 && v != 7) {
            z = false;
        }
        return new b(bitmap0, v1, v == 2 || v == 5, z);
    }

    @l
    public final Bitmap G(@m Bitmap bitmap0, int v, int v1, @l k cropImageView$k0) {
        Bitmap bitmap1;
        L.p(cropImageView$k0, "options");
        if(v > 0 && v1 > 0) {
            k cropImageView$k1 = k.d;
            if(cropImageView$k0 == cropImageView$k1 || cropImageView$k0 == k.c || cropImageView$k0 == k.e) {
                try {
                    if(cropImageView$k0 == k.e) {
                        L.m(bitmap0);
                        bitmap1 = Bitmap.createScaledBitmap(bitmap0, v, v1, false);
                    }
                    else {
                        L.m(bitmap0);
                        int v2 = bitmap0.getWidth();
                        int v3 = bitmap0.getHeight();
                        float f = Math.max(((float)v2) / ((float)v), ((float)v3) / ((float)v1));
                        bitmap1 = f > 1.0f || cropImageView$k0 == cropImageView$k1 ? Bitmap.createScaledBitmap(bitmap0, ((int)(((float)v2) / f)), ((int)(((float)v3) / f)), false) : null;
                    }
                    if(bitmap1 != null) {
                        if(!L.g(bitmap1, bitmap0)) {
                            bitmap0.recycle();
                        }
                        return bitmap1;
                    }
                    goto label_19;
                }
                catch(Exception exception0) {
                }
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", exception0);
            }
        }
    label_19:
        L.m(bitmap0);
        return bitmap0;
    }

    private final Bitmap H(Bitmap bitmap0, int v, boolean z, boolean z1) {
        if(v > 0 || z || z1) {
            Matrix matrix0 = new Matrix();
            matrix0.setRotate(((float)v));
            matrix0.postScale(((float)(z ? -1 : 1)), ((float)(z1 ? -1 : 1)));
            Bitmap bitmap1 = Bitmap.createBitmap(bitmap0, 0, 0, bitmap0.getWidth(), bitmap0.getHeight(), matrix0, false);
            L.o(bitmap1, "createBitmap(...)");
            if(!L.g(bitmap1, bitmap0)) {
                bitmap0.recycle();
            }
            return bitmap1;
        }
        return bitmap0;
    }

    public final void I(@m Pair pair0) {
        d.j = pair0;
    }

    @l
    public final Uri J(@l Context context0, @l Bitmap bitmap0, @l Bitmap.CompressFormat bitmap$CompressFormat0, int v, @m Uri uri0) throws FileNotFoundException {
        L.p(context0, "context");
        L.p(bitmap0, "bitmap");
        L.p(bitmap$CompressFormat0, "compressFormat");
        if(uri0 == null) {
            uri0 = this.a(context0, bitmap$CompressFormat0);
        }
        OutputStream outputStream0 = context0.getContentResolver().openOutputStream(uri0, "wt");
        L.m(outputStream0);
        try {
            bitmap0.compress(bitmap$CompressFormat0, v, outputStream0);
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(outputStream0, throwable0);
            throw throwable0;
        }
        kotlin.io.c.a(outputStream0, null);
        return uri0;
    }

    @m
    public final Uri K(@l Context context0, @m Bitmap bitmap0, @m Uri uri0) {
        L.p(context0, "context");
        try {
            L.m(bitmap0);
            return this.J(context0, bitmap0, Bitmap.CompressFormat.JPEG, 0x5F, uri0);
        }
        catch(Exception exception0) {
            Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", exception0);
            return null;
        }
    }

    private final Uri a(Context context0, Bitmap.CompressFormat bitmap$CompressFormat0) {
        String s;
        try {
            switch(c.a[bitmap$CompressFormat0.ordinal()]) {
                case 1: {
                    s = ".jpg";
                    break;
                }
                case 2: {
                    s = ".png";
                    break;
                }
                default: {
                    s = ".webp";
                }
            }
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Failed to create temp file for output image", iOException0);
        }
        if(Build.VERSION.SDK_INT >= 29) {
            try {
                File file0 = File.createTempFile("cropped", s, context0.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                L.m(file0);
                return I.d.b(context0, file0);
            }
            catch(Exception exception0) {
                try {
                    Log.e("AIC", exception0.getMessage());
                    File file1 = File.createTempFile("cropped", s, context0.getCacheDir());
                    L.m(file1);
                    return I.d.b(context0, file1);
                }
                catch(IOException iOException0) {
                }
            }
        }
        else {
            return Uri.fromFile(File.createTempFile("cropped", s, context0.getCacheDir()));
        }
        throw new RuntimeException("Failed to create temp file for output image", iOException0);
    }

    private final int b(int v, int v1) {
        if(d.i == 0) {
            d.i = this.r();
        }
        int v2 = 1;
        if(d.i > 0) {
            while(v1 / v2 > d.i || v / v2 > d.i) {
                v2 *= 2;
            }
        }
        return v2;
    }

    private final int c(int v, int v1, int v2, int v3) {
        int v4 = 1;
        if(v1 > v3 || v > v2) {
            while(v1 / 2 / v4 > v3 && v / 2 / v4 > v2) {
                v4 *= 2;
            }
        }
        return v4;
    }

    @l
    public final a d(@l Context context0, @m Uri uri0, @l float[] arr_f, int v, int v1, int v2, boolean z, int v3, int v4, int v5, int v6, boolean z1, boolean z2) {
        L.p(context0, "context");
        L.p(arr_f, "cropPoints");
        int v7;
        for(v7 = 1; true; v7 *= 2) {
            try {
                L.m(uri0);
                return this.e(context0, uri0, arr_f, v, v1, v2, z, v3, v4, v5, v6, z1, z2, v7);
            }
            catch(OutOfMemoryError outOfMemoryError0) {
            }
            if(v7 * 2 > 16) {
                break;
            }
        }
        throw new RuntimeException("Failed to handle OOM by sampling (" + v7 * 2 + "): " + uri0 + "\r\n" + outOfMemoryError0.getMessage(), outOfMemoryError0);
    }

    private final a e(Context context0, Uri uri0, float[] arr_f, int v, int v1, int v2, boolean z, int v3, int v4, int v5, int v6, boolean z1, boolean z2, int v7) {
        Bitmap bitmap1;
        int v10;
        Bitmap bitmap0;
        Rect rect0 = this.y(arr_f, v1, v2, z, v3, v4);
        int v8 = v5 <= 0 ? rect0.width() : v5;
        int v9 = v6 <= 0 ? rect0.height() : v6;
        try {
            bitmap0 = null;
            a d$a0 = this.m(context0, uri0, rect0, v8, v9, v7);
            v10 = 1;
            bitmap0 = d$a0.a();
            v10 = d$a0.b();
        }
        catch(Exception unused_ex) {
        }
        if(bitmap0 != null) {
            try {
                bitmap1 = this.H(bitmap0, v, z1, z2);
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                bitmap0.recycle();
                throw outOfMemoryError0;
            }
            if(v % 90 != 0) {
                try {
                    bitmap1 = this.i(bitmap1, arr_f, rect0, v, z, v3, v4);
                    return new a(bitmap1, v10);
                }
                catch(OutOfMemoryError outOfMemoryError0) {
                    bitmap0 = bitmap1;
                }
                bitmap0.recycle();
                throw outOfMemoryError0;
            }
            return new a(bitmap1, v10);
        }
        return this.f(context0, uri0, arr_f, v, z, v3, v4, v7, rect0, v8, v9, z1, z2);
    }

    private final a f(Context context0, Uri uri0, float[] arr_f, int v, boolean z, int v1, int v2, int v3, Rect rect0, int v4, int v5, boolean z1, boolean z2) {
        Bitmap bitmap1;
        int v6;
        BitmapFactory.Options bitmapFactory$Options0;
        Bitmap bitmap0 = null;
        try {
            bitmapFactory$Options0 = new BitmapFactory.Options();
            v6 = v3 * this.c(rect0.width(), rect0.height(), v4, v5);
            bitmapFactory$Options0.inSampleSize = v6;
            ContentResolver contentResolver0 = context0.getContentResolver();
            L.o(contentResolver0, "getContentResolver(...)");
            bitmap1 = this.j(contentResolver0, uri0, bitmapFactory$Options0);
            if(bitmap1 != null) {
                goto label_8;
            }
            return new a(bitmap0, v6);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            goto label_27;
        }
        catch(Exception exception0) {
            throw new com.canhub.cropper.e.d(uri0, exception0.getMessage());
        }
        try {
        label_8:
            float[] arr_f1 = new float[arr_f.length];
            System.arraycopy(arr_f, 0, arr_f1, 0, arr_f.length);
            for(int v7 = 0; v7 < arr_f.length; ++v7) {
                arr_f1[v7] /= (float)bitmapFactory$Options0.inSampleSize;
            }
            bitmap0 = this.h(bitmap1, arr_f1, v, z, v1, v2, 1.0f, z1, z2);
            goto label_21;
        }
        catch(Throwable throwable0) {
        }
        try {
            if(!L.g(null, bitmap1)) {
                bitmap1.recycle();
            }
            throw throwable0;
        label_21:
            if(!L.g(bitmap0, bitmap1)) {
                bitmap1.recycle();
                return new a(bitmap0, v6);
            label_27:
                if(bitmap0 == null) {
                    throw outOfMemoryError0;
                }
                goto label_28;
            }
            return new a(bitmap0, v6);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            goto label_27;
        }
        catch(Exception exception0) {
            throw new com.canhub.cropper.e.d(uri0, exception0.getMessage());
        }
    label_28:
        bitmap0.recycle();
        throw outOfMemoryError0;
    }

    @l
    public final a g(@m Bitmap bitmap0, @l float[] arr_f, int v, boolean z, int v1, int v2, boolean z1, boolean z2) {
        L.p(arr_f, "cropPoints");
        int v3 = 1;
        do {
            try {
                L.m(bitmap0);
                return new a(this.h(bitmap0, arr_f, v, z, v1, v2, 1.0f / ((float)v3), z1, z2), v3);
            }
            catch(OutOfMemoryError outOfMemoryError0) {
            }
            v3 *= 2;
        }
        while(v3 <= 8);
        throw outOfMemoryError0;
    }

    private final Bitmap h(Bitmap bitmap0, float[] arr_f, int v, boolean z, int v1, int v2, float f, boolean z1, boolean z2) {
        Rect rect0 = this.y(arr_f, bitmap0.getWidth(), bitmap0.getHeight(), z, v1, v2);
        Matrix matrix0 = new Matrix();
        matrix0.setRotate(((float)v), ((float)bitmap0.getWidth()) / 2.0f, ((float)bitmap0.getHeight()) / 2.0f);
        float f1 = z1 ? -f : f;
        if(z2) {
            f = -f;
        }
        matrix0.postScale(f1, f);
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap0, rect0.left, rect0.top, rect0.width(), rect0.height(), matrix0, true);
        L.o(bitmap1, "createBitmap(...)");
        if(L.g(bitmap1, bitmap0)) {
            bitmap1 = bitmap0.copy(bitmap0.getConfig(), false);
        }
        return v % 90 == 0 ? bitmap1 : this.i(bitmap1, arr_f, rect0, v, z, v1, v2);
    }

    private final Bitmap i(Bitmap bitmap0, float[] arr_f, Rect rect0, int v, boolean z, int v1, int v2) {
        int v8;
        int v7;
        int v6;
        if(v % 90 != 0) {
            double f = Math.toRadians(v);
            int v3 = v < 90 || 0xB5 <= v && v < 270 ? rect0.left : rect0.right;
            int v4 = 0;
            for(int v5 = 0; true; v5 += 2) {
                if(v5 >= arr_f.length) {
                    v8 = 0;
                    v6 = 0;
                    v7 = 0;
                    break;
                }
                float f1 = arr_f[v5];
                if(f1 >= ((float)(v3 - 1)) && f1 <= ((float)(v3 + 1))) {
                    v4 = (int)Math.abs(Math.sin(f) * ((double)(((float)rect0.bottom) - arr_f[v5 + 1])));
                    v6 = (int)Math.abs(Math.cos(f) * ((double)(arr_f[v5 + 1] - ((float)rect0.top))));
                    v7 = (int)Math.abs(((double)(arr_f[v5 + 1] - ((float)rect0.top))) / Math.sin(f));
                    v8 = (int)Math.abs(((double)(((float)rect0.bottom) - arr_f[v5 + 1])) / Math.cos(f));
                    break;
                }
            }
            rect0.set(v4, v6, v7 + v4, v8 + v6);
            if(z) {
                this.n(rect0, v1, v2);
            }
            Bitmap bitmap1 = Bitmap.createBitmap(bitmap0, rect0.left, rect0.top, rect0.width(), rect0.height());
            if(!L.g(bitmap0, bitmap1)) {
                bitmap0.recycle();
            }
            return bitmap1;
        }
        return bitmap0;
    }

    private final Bitmap j(ContentResolver contentResolver0, Uri uri0, BitmapFactory.Options bitmapFactory$Options0) throws FileNotFoundException {
        Bitmap bitmap0;
        InputStream inputStream0;
        while(true) {
            inputStream0 = contentResolver0.openInputStream(uri0);
            try {
                try {
                    bitmap0 = BitmapFactory.decodeStream(inputStream0, d.b, bitmapFactory$Options0);
                    break;
                }
                catch(OutOfMemoryError unused_ex) {
                }
                bitmapFactory$Options0.inSampleSize *= 2;
            }
            catch(Throwable throwable0) {
                kotlin.io.c.a(inputStream0, throwable0);
                throw throwable0;
            }
            kotlin.io.c.a(inputStream0, null);
            if(bitmapFactory$Options0.inSampleSize > 0x200) {
                throw new com.canhub.cropper.e.c(uri0);
            }
        }
        kotlin.io.c.a(inputStream0, null);
        return bitmap0;
    }

    private final BitmapFactory.Options k(ContentResolver contentResolver0, Uri uri0) throws FileNotFoundException {
        BitmapFactory.Options bitmapFactory$Options0;
        InputStream inputStream0 = contentResolver0.openInputStream(uri0);
        try {
            bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStream0, d.b, bitmapFactory$Options0);
            bitmapFactory$Options0.inJustDecodeBounds = false;
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(inputStream0, throwable0);
            throw throwable0;
        }
        kotlin.io.c.a(inputStream0, null);
        return bitmapFactory$Options0;
    }

    @l
    public final a l(@l Context context0, @l Uri uri0, int v, int v1) {
        L.p(context0, "context");
        L.p(uri0, "uri");
        try {
            ContentResolver contentResolver0 = context0.getContentResolver();
            L.m(contentResolver0);
            BitmapFactory.Options bitmapFactory$Options0 = this.k(contentResolver0, uri0);
            int v2 = bitmapFactory$Options0.outWidth;
            if(v2 == -1 && bitmapFactory$Options0.outHeight == -1) {
                throw new RuntimeException("File is not a picture");
            }
            bitmapFactory$Options0.inSampleSize = Math.max(this.c(v2, bitmapFactory$Options0.outHeight, v, v1), this.b(bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight));
            return new a(this.j(contentResolver0, uri0, bitmapFactory$Options0), bitmapFactory$Options0.inSampleSize);
        }
        catch(Exception exception0) {
        }
        throw new com.canhub.cropper.e.d(uri0, exception0.getMessage());
    }

    private final a m(Context context0, Uri uri0, Rect rect0, int v, int v1, int v2) {
        a d$a0;
        BitmapRegionDecoder bitmapRegionDecoder0;
        InputStream inputStream0;
        BitmapFactory.Options bitmapFactory$Options0;
        try {
            bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inSampleSize = v2 * this.c(rect0.width(), rect0.height(), v, v1);
            inputStream0 = context0.getContentResolver().openInputStream(uri0);
        }
        catch(Exception exception0) {
            throw new com.canhub.cropper.e.d(uri0, exception0.getMessage());
        }
        if(Build.VERSION.SDK_INT >= 0x1F) {
            L.m(inputStream0);
            bitmapRegionDecoder0 = BitmapRegionDecoder.newInstance(inputStream0);
        }
        else {
            L.m(inputStream0);
            bitmapRegionDecoder0 = BitmapRegionDecoder.newInstance(inputStream0, false);
        }
        while(true) {
            try {
                try {
                label_9:
                    L.m(bitmapRegionDecoder0);
                    d$a0 = new a(bitmapRegionDecoder0.decodeRegion(rect0, bitmapFactory$Options0), bitmapFactory$Options0.inSampleSize);
                    goto label_25;
                }
                catch(OutOfMemoryError unused_ex) {
                }
                int v3 = bitmapFactory$Options0.inSampleSize * 2;
                bitmapFactory$Options0.inSampleSize = v3;
                if(v3 > 0x200) {
                    goto label_15;
                }
                goto label_9;
            }
            catch(Throwable throwable1) {
                goto label_22;
            }
        label_15:
            if(bitmapRegionDecoder0 != null) {
                try {
                    bitmapRegionDecoder0.recycle();
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            try {
                kotlin.io.c.a(inputStream0, null);
            }
            catch(Exception exception0) {
                throw new com.canhub.cropper.e.d(uri0, exception0.getMessage());
            }
            return new a(null, 1);
            try {
            label_22:
                if(bitmapRegionDecoder0 != null) {
                    bitmapRegionDecoder0.recycle();
                }
                throw throwable1;
            label_25:
                bitmapRegionDecoder0.recycle();
                goto label_32;
            }
            catch(Throwable throwable0) {
            }
            break;
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable2) {
            try {
                kotlin.io.c.a(inputStream0, throwable0);
                throw throwable2;
            label_32:
                kotlin.io.c.a(inputStream0, null);
                return d$a0;
            }
            catch(Exception exception0) {
            }
        }
        throw new com.canhub.cropper.e.d(uri0, exception0.getMessage());
    }

    private final void n(Rect rect0, int v, int v1) {
        if(v == v1 && rect0.width() != rect0.height()) {
            if(rect0.height() > rect0.width()) {
                rect0.bottom -= rect0.height() - rect0.width();
                return;
            }
            rect0.right -= rect0.width() - rect0.height();
        }
    }

    @l
    public final Rect o() {
        return d.b;
    }

    @l
    public final RectF p() {
        return d.c;
    }

    @m
    public final Pair q() {
        return d.j;
    }

    private final int r() {
        try {
            EGL eGL0 = EGLContext.getEGL();
            L.n(eGL0, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
            EGLDisplay eGLDisplay0 = ((EGL10)eGL0).eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            ((EGL10)eGL0).eglInitialize(eGLDisplay0, new int[2]);
            int[] arr_v = new int[1];
            ((EGL10)eGL0).eglGetConfigs(eGLDisplay0, null, 0, arr_v);
            int v = arr_v[0];
            EGLConfig[] arr_eGLConfig = new EGLConfig[v];
            ((EGL10)eGL0).eglGetConfigs(eGLDisplay0, arr_eGLConfig, v, arr_v);
            int[] arr_v1 = new int[1];
            int v1 = arr_v[0];
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                ((EGL10)eGL0).eglGetConfigAttrib(eGLDisplay0, arr_eGLConfig[v2], 0x302C, arr_v1);
                int v4 = arr_v1[0];
                if(v3 < v4) {
                    v3 = v4;
                }
            }
            ((EGL10)eGL0).eglTerminate(eGLDisplay0);
            return Math.max(v3, 0x800);
        }
        catch(Exception unused_ex) {
            return 0x800;
        }
    }

    @l
    public final float[] s() {
        return d.g;
    }

    @l
    public final float[] t() {
        return d.h;
    }

    @l
    public final RectF u() {
        return d.f;
    }

    public final float v(@l float[] arr_f) {
        L.p(arr_f, "points");
        return Math.max(Math.max(Math.max(arr_f[1], arr_f[3]), arr_f[5]), arr_f[7]);
    }

    public final float w(@l float[] arr_f) {
        L.p(arr_f, "points");
        return (this.B(arr_f) + this.A(arr_f)) / 2.0f;
    }

    public final float x(@l float[] arr_f) {
        L.p(arr_f, "points");
        return (this.v(arr_f) + this.C(arr_f)) / 2.0f;
    }

    @l
    public final Rect y(@l float[] arr_f, int v, int v1, boolean z, int v2, int v3) {
        L.p(arr_f, "cropPoints");
        Rect rect0 = new Rect(kotlin.math.b.L0(Math.max(0.0f, this.A(arr_f))), kotlin.math.b.L0(Math.max(0.0f, this.C(arr_f))), kotlin.math.b.L0(Math.min(v, this.B(arr_f))), kotlin.math.b.L0(Math.min(v1, this.v(arr_f))));
        if(z) {
            this.n(rect0, v2, v3);
        }
        return rect0;
    }

    public final float z(@l float[] arr_f) {
        L.p(arr_f, "points");
        return this.v(arr_f) - this.C(arr_f);
    }
}

