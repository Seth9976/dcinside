package com.igaworks.ssp;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import jeb.synthetic.FIN;

public class o extends Thread {
    public String a;
    public String b;
    private WeakReference c;
    private c d;
    private d e;
    private boolean f;
    private boolean g;
    private o h;
    private boolean i;
    private boolean j;
    private Context k;
    private int l;
    private int m;
    private final String n;
    private static Handler o;

    static {
        o.o = new Handler(Looper.getMainLooper());
    }

    public o(Context context0, String s, ImageView imageView0, d n$d0, int v, int v1) {
        this.i = false;
        this.j = false;
        this.n = "/igaw/video";
        this.k = context0;
        this.b = s;
        this.c = new WeakReference(imageView0);
        this.e = n$d0;
        this.f = true;
        this.g = false;
        this.h = this;
        this.i = false;
        this.j = false;
        this.l = v;
        this.m = v1;
    }

    public o(Context context0, String s, d n$d0, int v, int v1) {
        this.i = false;
        this.n = "/igaw/video";
        this.k = context0;
        this.b = s;
        this.f = true;
        this.g = false;
        this.h = this;
        this.j = true;
        this.e = n$d0;
        this.l = v;
        this.m = v1;
    }

    public static Bitmap a(Context context0, String s, int v, int v1) {
        Thread thread0;
        Throwable throwable5;
        Bitmap bitmap0;
        int v4;
        ByteArrayInputStream byteArrayInputStream1;
        ByteArrayInputStream byteArrayInputStream0;
        int v2;
        Throwable throwable1;
        InputStream inputStream1;
        HttpURLConnection httpURLConnection0;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        InputStream inputStream0 = null;
        try {
            httpURLConnection0 = null;
            httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(s).openConnection())));
        }
        catch(Exception exception0) {
            inputStream1 = null;
            goto label_166;
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            inputStream1 = null;
            goto label_177;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_191;
        }
        try {
            httpURLConnection0.setRequestMethod("GET");
            httpURLConnection0.setDoInput(true);
            httpURLConnection0.setReadTimeout(5000);
            httpURLConnection0.setConnectTimeout(3000);
            inputStream1 = null;
            inputStream1 = o.a(httpURLConnection0);
            goto label_27;
        }
        catch(Exception exception0) {
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            goto label_177;
        }
        catch(Throwable throwable2) {
            throwable1 = throwable2;
            goto label_191;
        }
        inputStream1 = null;
        goto label_166;
        try {
        label_27:
            v2 = httpURLConnection0.getContentLength();
            if(v2 < 0x300000) {
                byte[] arr_b = new byte[0x400];
                int v3;
                while((v3 = inputStream1.read(arr_b)) > -1) {
                    byteArrayOutputStream0.write(arr_b, 0, v3);
                }
                byteArrayOutputStream0.flush();
                byteArrayInputStream0 = new ByteArrayInputStream(byteArrayOutputStream0.toByteArray());
                byteArrayInputStream1 = new ByteArrayInputStream(byteArrayOutputStream0.toByteArray());
                goto label_37;
            }
            goto label_163;
        }
        catch(Exception exception0) {
            goto label_166;
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            goto label_177;
        }
        catch(Throwable throwable3) {
            goto label_189;
        }
        try {
            try {
            label_37:
                b.a(Thread.currentThread(), "downloadBitmap : " + s);
                BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                Bitmap.Config bitmap$Config0 = Bitmap.Config.RGB_565;
                bitmapFactory$Options0.inPreferredConfig = bitmap$Config0;
                b.a(Thread.currentThread(), "downloadBitmap imageViewWidth : " + v);
                b.a(Thread.currentThread(), "downloadBitmap imageViewHeight : " + v1);
                if(v == 0 || v1 == 0) {
                    v4 = 1;
                }
                else {
                    bitmapFactory$Options0.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(byteArrayInputStream0, null, bitmapFactory$Options0);
                    bitmapFactory$Options0.inJustDecodeBounds = false;
                    v4 = n.a(bitmapFactory$Options0, v, v1);
                }
                b.a(Thread.currentThread(), "downloadBitmap sampleSize : " + v4);
                BitmapFactory.Options bitmapFactory$Options1 = new BitmapFactory.Options();
                bitmapFactory$Options1.inPreferredConfig = bitmap$Config0;
                bitmapFactory$Options1.inSampleSize = v4;
                bitmapFactory$Options1.inTempStorage = new byte[0x8000];
                bitmapFactory$Options1.inDither = true;
                bitmap0 = BitmapFactory.decodeStream(byteArrayInputStream1, null, bitmapFactory$Options1);
                o.a(context0, s, bitmap0);
                goto label_101;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(OutOfMemoryError outOfMemoryError1) {
                goto label_75;
            }
            runtimeException0.printStackTrace();
            System.gc();
        }
        catch(Throwable throwable4) {
            throwable5 = throwable4;
            goto label_93;
        }
        try {
            try {
                inputStream1.close();
                byteArrayInputStream0.close();
                byteArrayInputStream1.close();
                byteArrayOutputStream0.close();
                goto label_85;
            }
            catch(IOException iOException0) {
                thread0 = Thread.currentThread();
                goto label_84;
            }
        }
        catch(RuntimeException runtimeException1) {
            goto label_110;
        }
        catch(OutOfMemoryError outOfMemoryError2) {
            goto label_121;
        }
        catch(Throwable throwable6) {
            goto label_139;
        }
        try {
        label_75:
            outOfMemoryError1.printStackTrace();
            System.gc();
        }
        catch(Throwable throwable4) {
            throwable5 = throwable4;
            goto label_93;
        }
        try {
            try {
                inputStream1.close();
                byteArrayInputStream0.close();
                byteArrayInputStream1.close();
                byteArrayOutputStream0.close();
                goto label_85;
            }
            catch(IOException iOException0) {
                thread0 = Thread.currentThread();
            }
        label_84:
            b.a(thread0, iOException0);
        }
        catch(RuntimeException runtimeException1) {
            goto label_110;
        }
        catch(OutOfMemoryError outOfMemoryError2) {
            goto label_121;
        }
        catch(Throwable throwable6) {
            goto label_139;
        }
        try {
            try {
            label_85:
                inputStream1.close();
                byteArrayInputStream0.close();
                byteArrayInputStream1.close();
                byteArrayOutputStream0.close();
            }
            catch(IOException iOException1) {
                b.a(Thread.currentThread(), iOException1);
            }
            goto label_130;
        }
        catch(Exception exception0) {
            goto label_166;
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            goto label_177;
        }
        catch(Throwable throwable3) {
            goto label_189;
        }
        try {
            try {
                try {
                label_93:
                    inputStream1.close();
                    byteArrayInputStream0.close();
                    byteArrayInputStream1.close();
                    byteArrayOutputStream0.close();
                }
                catch(IOException iOException2) {
                    b.a(Thread.currentThread(), iOException2);
                }
                throw throwable5;
                try {
                label_101:
                    inputStream1.close();
                    byteArrayInputStream0.close();
                    byteArrayInputStream1.close();
                    byteArrayOutputStream0.close();
                }
                catch(IOException iOException3) {
                    b.a(Thread.currentThread(), iOException3);
                }
                goto label_148;
            }
            catch(RuntimeException runtimeException1) {
            }
            catch(OutOfMemoryError outOfMemoryError2) {
                goto label_121;
            }
        label_110:
            runtimeException1.printStackTrace();
            System.gc();
        }
        catch(Throwable throwable6) {
            goto label_139;
        }
        try {
            try {
                inputStream1.close();
                byteArrayInputStream0.close();
                byteArrayInputStream1.close();
                byteArrayOutputStream0.close();
            }
            catch(IOException iOException4) {
                b.a(Thread.currentThread(), iOException4);
            }
            goto label_130;
        }
        catch(Exception exception0) {
            goto label_166;
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            goto label_177;
        }
        catch(Throwable throwable3) {
            goto label_189;
        }
        try {
        label_121:
            outOfMemoryError2.printStackTrace();
            System.gc();
        }
        catch(Throwable throwable6) {
            goto label_139;
        }
        try {
            try {
                inputStream1.close();
                byteArrayInputStream0.close();
                byteArrayInputStream1.close();
                byteArrayOutputStream0.close();
            }
            catch(IOException iOException5) {
                b.a(Thread.currentThread(), iOException5);
            }
        label_130:
            httpURLConnection0.disconnect();
        }
        catch(Exception exception0) {
            goto label_166;
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            goto label_177;
        }
        catch(Throwable throwable3) {
            goto label_189;
        }
        try {
            inputStream1.close();
            byteArrayOutputStream0.close();
        }
        catch(IOException iOException6) {
            b.a(Thread.currentThread(), iOException6);
        }
        httpURLConnection0.disconnect();
        return null;
        try {
            try {
            label_139:
                inputStream1.close();
                byteArrayInputStream0.close();
                byteArrayInputStream1.close();
                byteArrayOutputStream0.close();
            }
            catch(IOException iOException7) {
                b.a(Thread.currentThread(), iOException7);
            }
            httpURLConnection0.disconnect();
            throw throwable6;
            try {
            label_148:
                inputStream1.close();
                byteArrayInputStream0.close();
                byteArrayInputStream1.close();
                byteArrayOutputStream0.close();
            }
            catch(IOException iOException8) {
                b.a(Thread.currentThread(), iOException8);
            }
            httpURLConnection0.disconnect();
        }
        catch(Exception exception0) {
            goto label_166;
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            goto label_177;
        }
        catch(Throwable throwable3) {
            goto label_189;
        }
        try {
            inputStream1.close();
            byteArrayOutputStream0.close();
        }
        catch(IOException iOException9) {
            b.a(Thread.currentThread(), iOException9);
        }
        httpURLConnection0.disconnect();
        return bitmap0;
        try {
        label_163:
            b.a(Thread.currentThread(), "bitmap size exceed 3MB : " + v2);
            goto label_200;
        }
        catch(Exception exception0) {
            try {
            label_166:
                exception0.printStackTrace();
                if(inputStream1 != null) {
                    goto label_168;
                }
                goto label_169;
            }
            catch(Throwable throwable3) {
                goto label_189;
            }
            try {
            label_168:
                inputStream1.close();
            label_169:
                byteArrayOutputStream0.close();
            }
            catch(IOException iOException10) {
                b.a(Thread.currentThread(), iOException10);
            }
            if(httpURLConnection0 != null) {
                httpURLConnection0.disconnect();
                return null;
            }
            return null;
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            try {
            label_177:
                outOfMemoryError0.printStackTrace();
                System.gc();
                if(inputStream1 != null) {
                    goto label_180;
                }
                goto label_181;
            }
            catch(Throwable throwable3) {
                goto label_189;
            }
            try {
            label_180:
                inputStream1.close();
            label_181:
                byteArrayOutputStream0.close();
            }
            catch(IOException iOException11) {
                b.a(Thread.currentThread(), iOException11);
            }
            if(httpURLConnection0 != null) {
                httpURLConnection0.disconnect();
            }
            return null;
        }
        catch(Throwable throwable3) {
        label_189:
            throwable1 = throwable3;
            inputStream0 = inputStream1;
        }
        try {
        label_191:
            if(inputStream0 != null) {
                inputStream0.close();
            }
            byteArrayOutputStream0.close();
        }
        catch(IOException iOException12) {
            b.a(Thread.currentThread(), iOException12);
        }
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        throw throwable1;
    label_200:
        if(inputStream1 == null) {
            goto label_202;
        }
        else {
            try {
                inputStream1.close();
            label_202:
                byteArrayOutputStream0.close();
                goto label_206;
            }
            catch(IOException iOException13) {
            }
        }
        b.a(Thread.currentThread(), iOException13);
    label_206:
        httpURLConnection0.disconnect();
        return null;
    }

    private o a(ImageView imageView0) {
        return imageView0 == null ? null : this.d.a();
    }

    // This method was un-flattened
    private static InputStream a(URLConnection uRLConnection0) {
        InputStream inputStream0 = null;
        int v = 0;
        try {
            while(true) {
                if(uRLConnection0 instanceof HttpURLConnection) {
                    ((HttpURLConnection)uRLConnection0).setInstanceFollowRedirects(false);
                }
                inputStream0 = uRLConnection0.getInputStream();
                if(!(uRLConnection0 instanceof HttpURLConnection)) {
                    break;
                }
                int v1 = ((HttpURLConnection)uRLConnection0).getResponseCode();
                if(v1 < 300 || v1 > 307 || v1 == 306 || v1 == 304) {
                    break;
                }
                URL uRL0 = ((HttpURLConnection)uRLConnection0).getURL();
                String s = ((HttpURLConnection)uRLConnection0).getHeaderField("Location");
                URL uRL1 = s == null ? null : new URL(uRL0, s);
                ((HttpURLConnection)uRLConnection0).disconnect();
                if(uRL1 != null && (uRL1.getProtocol().equals("http") || uRL1.getProtocol().equals("https")) && v < 5) {
                    uRLConnection0 = (URLConnection)FirebasePerfUrlConnection.instrument(uRL1.openConnection());
                    ++v;
                    continue;
                }
                return null;
            }
            return inputStream0;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        return inputStream0;
    }

    private static String a(String s) {
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
            messageDigest0.update(s.getBytes());
            byte[] arr_b = messageDigest0.digest();
            return String.format("%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X", ((byte)arr_b[0]), ((byte)arr_b[1]), ((byte)arr_b[2]), ((byte)arr_b[3]), ((byte)arr_b[4]), ((byte)arr_b[5]), ((byte)arr_b[6]), ((byte)arr_b[7]), ((byte)arr_b[8]), ((byte)arr_b[9]), ((byte)arr_b[10]), ((byte)arr_b[11]), ((byte)arr_b[12]), ((byte)arr_b[13]), ((byte)arr_b[14]), ((byte)arr_b[15]));
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    private static void a(Context context0, String s, Bitmap bitmap0) {
        OutputStream outputStream1;
        OutputStream outputStream0 = null;
        try {
            File file0 = new File(context0.getCacheDir() + "/igaw/image");
            if(!file0.exists()) {
                file0.mkdirs();
            }
            String s1 = o.a(s);
            if(s1 == null || s1.length() <= 0) {
                goto label_36;
            }
            else {
                File file1 = new File(file0, s1);
                if(file1.exists()) {
                    file1.delete();
                    file1.createNewFile();
                }
                outputStream1 = new FileOutputStream(file1);
                goto label_11;
            }
            return;
        }
        catch(Exception exception0) {
            goto label_21;
        }
        catch(Throwable throwable0) {
            goto label_19;
        }
        try {
        label_11:
            outputStream0 = outputStream1;
            bitmap0.compress(Bitmap.CompressFormat.PNG, 100, outputStream1);
            outputStream0 = outputStream1;
            goto label_36;
        }
        catch(Exception exception1) {
            try {
                while(true) {
                    exception1.printStackTrace();
                    goto label_26;
                    try {
                    label_19:
                        break;
                    label_21:
                        exception1 = exception0;
                    }
                    catch(Exception exception0) {
                        goto label_21;
                    }
                }
            }
            catch(Throwable throwable0) {
            }
            throwable1 = throwable0;
            outputStream1 = outputStream0;
            goto label_30;
        label_26:
            if(outputStream0 != null) {
                try {
                    outputStream0.close();
                }
                catch(Exception exception2) {
                    exception2.printStackTrace();
                }
                return;
            }
            return;
        }
        catch(Throwable throwable1) {
        }
    label_30:
        if(outputStream1 != null) {
            try {
                outputStream1.close();
            }
            catch(Exception exception3) {
                exception3.printStackTrace();
            }
        }
        throw throwable1;
    label_36:
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(Exception exception2) {
                exception2.printStackTrace();
            }
        }
    }

    private void a(String s, InputStream inputStream0, int v) {
        Exception exception1;
        OutputStream outputStream0;
        File file2;
        File file0;
        try {
            try {
                file0 = null;
                File file1 = new File(this.k.getCacheDir() + "/igaw/video");
                if(!file1.exists()) {
                    file1.mkdirs();
                }
                String s1 = o.a(s);
                if(s1 == null || s1.length() <= 0) {
                    goto label_26;
                }
                else {
                    file2 = new File(file1, s1);
                    goto label_7;
                }
                goto label_27;
            }
            catch(Exception exception0) {
                goto label_45;
            }
            try {
            label_7:
                if(file2.exists()) {
                    file2.delete();
                }
                outputStream0 = new FileOutputStream(file2);
                goto label_14;
            }
            catch(Exception exception0) {
            }
            exception1 = exception0;
            goto label_38;
        }
        catch(Throwable throwable0) {
            goto label_57;
        }
        try {
        label_14:
            byte[] arr_b = new byte[0x400];
            int v1;
            while((v1 = inputStream0.read(arr_b)) > 0) {
                outputStream0.write(arr_b, 0, v1);
            }
            file0 = file2;
            goto label_27;
        }
        catch(Exception exception1) {
            file0 = outputStream0;
            goto label_38;
        }
        catch(Throwable throwable1) {
            goto label_59;
        }
        try {
        label_26:
            outputStream0 = null;
        }
        catch(Exception exception0) {
            goto label_45;
        }
        catch(Throwable throwable0) {
            goto label_57;
        }
    label_27:
        if(file0 == null) {
        label_66:
            if(outputStream0 != null) {
                try {
                    outputStream0.flush();
                    outputStream0.close();
                }
                catch(Exception exception5) {
                    exception5.printStackTrace();
                }
            }
        }
        else {
            try {
                if(file0.length() != ((long)v)) {
                    file0.delete();
                }
                goto label_66;
            }
            catch(Exception exception2) {
                File file3 = file0;
                file0 = outputStream0;
                exception0 = exception2;
                File file4 = file3;
                while(true) {
                    file2 = file4;
                    exception1 = exception0;
                    try {
                    label_38:
                        exception1.printStackTrace();
                        if(file2 == null) {
                            break;
                        }
                        file2.delete();
                        break;
                        try {
                            goto label_57;
                        label_45:
                            file4 = null;
                        }
                        catch(Exception exception0) {
                            goto label_45;
                        }
                    }
                    catch(Throwable throwable0) {
                        goto label_57;
                    }
                }
                if(file0 != null) {
                    try {
                        ((OutputStream)file0).flush();
                        ((OutputStream)file0).close();
                    }
                    catch(Exception exception3) {
                        exception3.printStackTrace();
                    }
                    return;
                }
                return;
            }
            catch(Throwable throwable2) {
                file0 = outputStream0;
                throwable0 = throwable2;
            }
        label_57:
            throwable1 = throwable0;
            outputStream0 = file0;
        label_59:
            if(outputStream0 != null) {
                try {
                    outputStream0.flush();
                    outputStream0.close();
                }
                catch(Exception exception4) {
                    exception4.printStackTrace();
                }
            }
            throw throwable1;
        }
    }

    public void a(Bitmap bitmap0) {
        class a implements Runnable {
            final Bitmap a;
            final o b;

            a(Bitmap bitmap0) {
                this.a = bitmap0;
                super();
            }

            @Override
            public void run() {
                if(!o.this.g) {
                    try {
                        if(o.this.f) {
                            if(this.a != null && !o.this.i) {
                                n.a.put(o.this.b, this.a);
                            }
                            if(o.this.e != null) {
                                o.this.e.a(this.a);
                                return;
                            }
                        }
                        else if(o.this.c != null) {
                            ImageView imageView0 = (ImageView)o.this.c.get();
                            o o0 = o.this.a(imageView0);
                            if(o.this.h == o0) {
                                if(!o.this.i) {
                                    n.a.put(o.this.b, this.a);
                                }
                                Bitmap bitmap0 = this.a;
                                if(bitmap0 != null) {
                                    imageView0.setImageBitmap(bitmap0);
                                    return;
                                }
                            }
                            else if(this.a != null && !o.this.i) {
                                n.a.put(o.this.b, this.a);
                                return;
                            }
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    exception0.printStackTrace();
                }
            }
        }

        try {
            if(o.o == null) {
                o.o = new Handler(Looper.getMainLooper());
            }
            o.o.post(new a(this, bitmap0));
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
    }

    public void a(c n$c0) {
        this.d = n$c0;
    }

    public void a(boolean z) {
        this.g = z;
    }

    public void b(String s) {
        int v2;
        try {
            HttpURLConnection httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(s).openConnection())));
            httpURLConnection0.setRequestMethod("GET");
            httpURLConnection0.setDoInput(true);
            httpURLConnection0.setReadTimeout(5000);
            httpURLConnection0.setConnectTimeout(3000);
            InputStream inputStream0 = o.a(httpURLConnection0);
            int v = httpURLConnection0.getContentLength();
            if(inputStream0 != null) {
                try {
                    v2 = FIN.finallyOpen$NT();
                    this.a(s, inputStream0, v);
                    goto label_15;
                }
                catch(OutOfMemoryError outOfMemoryError0) {
                    try {
                        outOfMemoryError0.printStackTrace();
                        System.gc();
                    label_15:
                        FIN.finallyCodeBegin$NT(v2);
                        inputStream0.close();
                        FIN.finallyCodeEnd$NT(v2);
                        goto label_22;
                    }
                    catch(OutOfMemoryError outOfMemoryError1) {
                    }
                }
                finally {
                    inputStream0.close();
                    httpURLConnection0.disconnect();
                }
                outOfMemoryError1.printStackTrace();
                System.gc();
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    label_22:
        d n$d0 = this.e;
        if(n$d0 != null) {
            n$d0.a(null);
        }
    }

    @Override
    public void run() {
        super.run();
        if(this.j) {
            this.b(this.b);
            return;
        }
        this.a(o.a(this.k, this.b, this.l, this.m));
    }
}

