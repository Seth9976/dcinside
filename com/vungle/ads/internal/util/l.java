package com.vungle.ads.internal.util;

import A3.o;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.m;

public final class l {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @y4.l
        public final l getInstance() {
            return l.instance;
        }
    }

    @y4.l
    public static final a Companion = null;
    @y4.l
    private static final String FILE_SCHEME = "file://";
    private static final String TAG;
    @y4.l
    private static final l instance;
    @m
    private Executor ioExecutor;

    static {
        l.Companion = new a(null);
        l.TAG = "l";
        l.instance = new l();
    }

    public final void displayImage(@m String s, @y4.l Function1 function10) {
        L.p(function10, "onImageLoaded");
        if(this.ioExecutor == null) {
            L.o("l", "TAG");
            p.Companion.w("l", "ImageLoader not initialized.");
            return;
        }
        if(s != null && s.length() != 0) {
            Executor executor0 = this.ioExecutor;
            if(executor0 != null) {
                executor0.execute(() -> {
                    L.p(function10, "$onImageLoaded");
                    if(!v.v2(s, "file://", false, 2, null)) {
                        return;
                    }
                    String s1 = s.substring(7);
                    L.o(s1, "this as java.lang.String).substring(startIndex)");
                    Bitmap bitmap0 = BitmapFactory.decodeFile(s1);
                    if(bitmap0 != null) {
                        function10.invoke(bitmap0);
                        return;
                    }
                    L.o("l", "TAG");
                    p.Companion.w("l", "decode bitmap failed.");
                });
            }
            return;
        }
        L.o("l", "TAG");
        p.Companion.w("l", "the uri is required.");
    }

    // 检测为 Lambda 实现
    private static final void displayImage$lambda-0(String s, Function1 function10) [...]

    public final void getImageSize(@m String s, @y4.l o o0) {
        L.p(o0, "onImageSizeLoaded");
        if(this.ioExecutor == null) {
            L.o("l", "TAG");
            p.Companion.w("l", "ImageLoader not initialized.");
            return;
        }
        if(s != null && s.length() != 0) {
            Executor executor0 = this.ioExecutor;
            if(executor0 != null) {
                executor0.execute(() -> {
                    L.p(o0, "$onImageSizeLoaded");
                    if(!v.v2(s, "file://", false, 2, null)) {
                        return;
                    }
                    String s1 = s.substring(7);
                    L.o(s1, "this as java.lang.String).substring(startIndex)");
                    BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                    bitmapFactory$Options0.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(s1, bitmapFactory$Options0);
                    o0.invoke(bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight);
                });
            }
            return;
        }
        L.o("l", "TAG");
        p.Companion.w("l", "the uri is required.");
    }

    // 检测为 Lambda 实现
    private static final void getImageSize$lambda-1(String s, o o0) [...]

    public final void init(@y4.l Executor executor0) {
        L.p(executor0, "ioExecutor");
        this.ioExecutor = executor0;
    }
}

