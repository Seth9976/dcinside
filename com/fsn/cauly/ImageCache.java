package com.fsn.cauly;

import android.graphics.Bitmap;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ImageCache implements Serializable {
    static final class SynchronizedBitmap implements Serializable {
        private final Bitmap a;

        public SynchronizedBitmap(Bitmap bitmap0) {
            this.a = bitmap0;
        }

        public Bitmap get() {
            return this.a;
        }
    }

    private final Map a;

    public ImageCache() {
        this.a = new HashMap();
    }

    Bitmap a(String s) {
        SynchronizedBitmap imageCache$SynchronizedBitmap0 = (SynchronizedBitmap)this.a.get(s);
        return imageCache$SynchronizedBitmap0 == null ? null : imageCache$SynchronizedBitmap0.get();
    }

    void b(String s, Bitmap bitmap0) {
        SynchronizedBitmap imageCache$SynchronizedBitmap0 = new SynchronizedBitmap(bitmap0);
        this.a.put(s, imageCache$SynchronizedBitmap0);
    }

    public void clearCache() {
        this.a.clear();
    }

    public static boolean fromImageCache(String s, ImageCache imageCache0) {
        try {
            ImageCache.saveObject(imageCache0, s);
            return true;
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public static Object readObject(String s) {
        ObjectInputStream objectInputStream0 = new ObjectInputStream(new FileInputStream(s));
        Object object0 = objectInputStream0.readObject();
        objectInputStream0.close();
        return object0;
    }

    public static void saveObject(Object object0, String s) {
        ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(new FileOutputStream(s));
        objectOutputStream0.writeObject(object0);
        objectOutputStream0.flush();
        objectOutputStream0.close();
    }

    public static ImageCache toImageCache(String s) {
        try {
            return (ImageCache)ImageCache.readObject(s);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

