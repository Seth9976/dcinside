package com.igaworks.ssp;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.WeakHashMap;

public abstract class n {
    public static class c extends ColorDrawable {
        private final WeakReference a;

        public c(o o0) {
            super(0);
            this.a = new WeakReference(o0);
        }

        public o a() {
            return (o)this.a.get();
        }
    }

    public interface d {
        void a(Bitmap arg1);
    }

    public static WeakHashMap a;
    public static ArrayList b;
    public static int c;

    static {
        n.a = new WeakHashMap();
        n.b = new ArrayList();
        n.c = 1;
    }

    public static int a(BitmapFactory.Options bitmapFactory$Options0, int v, int v1) {
        int v2 = bitmapFactory$Options0.outHeight;
        int v3 = bitmapFactory$Options0.outWidth;
        int v4 = n.c;
        if(v2 > v1 || v3 > v) {
            while(v2 / 2 / v4 > v1 && v3 / 2 / v4 > v) {
                v4 *= 2;
            }
        }
        b.c(Thread.currentThread(), "calculateInSampleSize : " + v4);
        return v4;
    }

    private static Bitmap a(Context context0, String s, int v, int v1, boolean z) {
        try {
            String s1 = n.a(context0, s, false);
            if(s1 == null) {
                return null;
            }
            b.c(Thread.currentThread(), "getBitmap : " + s);
            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.RGB_565;
            if(v == 0 || v1 == 0) {
                bitmapFactory$Options0.inSampleSize = n.c;
            }
            else {
                bitmapFactory$Options0.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(s1, bitmapFactory$Options0);
                bitmapFactory$Options0.inJustDecodeBounds = false;
                bitmapFactory$Options0.inSampleSize = n.a(bitmapFactory$Options0, v, v1);
            }
            return BitmapFactory.decodeFile(s1, bitmapFactory$Options0);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
        }
        catch(Exception unused_ex) {
            return null;
        }
        outOfMemoryError0.printStackTrace();
        try {
            Iterator iterator0 = n.a.keySet().iterator();
            if(iterator0 != null && iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Bitmap bitmap0 = (Bitmap)n.a.get(((String)object0));
                if(bitmap0 != null) {
                    bitmap0.recycle();
                    n.a.remove(((String)object0));
                }
            }
            System.gc();
            return z ? null : n.a(context0, s, v, v1, true);
        }
        catch(Exception unused_ex) {
            System.gc();
        }
        return null;
    }

    private static o a(ImageView imageView0) {
        if(imageView0 != null) {
            Drawable drawable0 = imageView0.getDrawable();
            return drawable0 instanceof c ? ((c)drawable0).a() : null;
        }
        return null;
    }

    public static String a(Context context0, String s, boolean z) {
        try {
            File file0 = z ? new File(context0.getCacheDir() + "/igaw/video") : new File(context0.getCacheDir() + "/igaw/image");
            if(!file0.exists()) {
                file0.mkdirs();
            }
            String s1 = n.a(s);
            if(s1 != null && s1.length() > 0) {
                File file1 = new File(file0, s1);
                return file1.exists() ? file1.getAbsolutePath() : null;
            }
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    public static String a(String s) {
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

    public static void a(Context context0) {
        class a implements Comparator {
            a() {
                super();
            }

            public int a(File file0, File file1) {
                if(file0.lastModified() > file1.lastModified()) {
                    return 1;
                }
                return file0.lastModified() == file1.lastModified() ? 0 : -1;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.a(((File)object0), ((File)object1));
            }
        }

        try {
            WeakHashMap weakHashMap0 = n.a;
            if(weakHashMap0 != null) {
                Object[] arr_object = weakHashMap0.keySet().toArray();
                for(int v1 = 0; v1 < arr_object.length; ++v1) {
                    Object object0 = arr_object[v1];
                    if(((Bitmap)n.a.get(object0)) != null) {
                        n.a.remove(object0);
                    }
                }
                n.a.clear();
            }
            ArrayList arrayList0 = n.b;
            if(arrayList0 != null) {
                arrayList0.clear();
            }
        }
        catch(Exception unused_ex) {
            WeakHashMap weakHashMap1 = n.a;
            if(weakHashMap1 != null) {
                weakHashMap1.clear();
            }
            ArrayList arrayList1 = n.b;
            if(arrayList1 != null) {
                arrayList1.clear();
            }
        }
        try {
            File file0 = new File(context0.getCacheDir() + "/igaw/image");
            if(!file0.exists()) {
                return;
            }
            if(file0.listFiles().length > 150) {
                int v2 = file0.listFiles().length;
                b.c(Thread.currentThread(), "Delete local image file : " + v2);
                File[] arr_file = file0.listFiles();
                Arrays.sort(arr_file, new a());
                for(int v = 0; v < arr_file.length; ++v) {
                    File file1 = arr_file[v];
                    if(file1.isFile()) {
                        Calendar.getInstance().setTimeInMillis(file1.lastModified());
                        file1.delete();
                        --v2;
                        if(v2 > 140) {
                            continue;
                        }
                        break;
                    }
                }
                b.c(Thread.currentThread(), "Delete local image file : " + v2);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public static void a(Context context0, String s, ImageView imageView0, int v, int v1, d n$d0) {
        boolean z;
        try {
            if(n.a == null) {
                n.a = new WeakHashMap();
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            return;
        }
        try {
            if(n.b == null) {
                n.b = new ArrayList();
            }
            int v2 = n.b.indexOf(s);
            if(v2 >= 0) {
                n.b.remove(v2);
            }
            n.b.add(0, s);
        }
        catch(Exception unused_ex) {
        }
        try {
            Bitmap bitmap0 = (Bitmap)n.a.get(s);
            if(bitmap0 == null) {
                bitmap0 = n.a(context0, s, v, v1, false);
                if(bitmap0 != null) {
                    n.a.put(s, bitmap0);
                }
                z = true;
            }
            else {
                z = false;
            }
            if(bitmap0 == null) {
                if(n.a(s, imageView0)) {
                    if(n.a.size() > 10) {
                        n.a.clear();
                    }
                    imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
                    o o0 = new o(context0, s, imageView0, n$d0, v, v1);
                    c n$c0 = new c(o0);
                    imageView0.setBackgroundColor(0);
                    o0.a(n$c0);
                    o0.start();
                }
            }
            else if(n$d0 != null) {
                n$d0.a(bitmap0);
            }
            if(z && n.a.size() > 10) {
                goto label_32;
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
        return;
        try {
        label_32:
            int v3 = n.b.size();
            if(((Bitmap)n.a.get(n.b.get(v3 - 1))) != null) {
                n.a.remove(n.b.get(v3 - 1));
            }
            n.b.remove(v3 - 1);
            return;
        }
        catch(Exception exception1) {
        }
        try {
            exception1.printStackTrace();
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
    }

    public static void a(Context context0, String s, d n$d0) {
        try {
            if(n.a(context0, s, true) != null) {
                if(n$d0 != null) {
                    n$d0.a(null);
                    return;
                }
                return;
            }
            new o(context0, s, n$d0, 0, 0).start();
        }
        catch(Exception unused_ex) {
            if(n$d0 != null) {
                n$d0.a(null);
            }
        }
    }

    private static boolean a(String s, ImageView imageView0) {
        o o0 = n.a(imageView0);
        if(o0 != null) {
            if(o0.a != null && o0.a.equals(s)) {
                return false;
            }
            o0.a(true);
        }
        return true;
    }

    public static void b(Context context0) {
        class com.igaworks.ssp.n.b implements Comparator {
            com.igaworks.ssp.n.b() {
                super();
            }

            public int a(File file0, File file1) {
                if(file0.lastModified() > file1.lastModified()) {
                    return 1;
                }
                return file0.lastModified() == file1.lastModified() ? 0 : -1;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.a(((File)object0), ((File)object1));
            }
        }

        try {
            File file0 = new File(context0.getCacheDir() + "/igaw/video");
            if(!file0.exists()) {
                return;
            }
            if(file0.listFiles().length > 5) {
                int v = file0.listFiles().length;
                b.c(Thread.currentThread(), "Delete local video file : " + v);
                File[] arr_file = file0.listFiles();
                Arrays.sort(arr_file, new com.igaworks.ssp.n.b());
                for(int v1 = 0; v1 < arr_file.length; ++v1) {
                    File file1 = arr_file[v1];
                    if(file1.isFile()) {
                        Calendar.getInstance().setTimeInMillis(file1.lastModified());
                        file1.delete();
                        --v;
                        if(v > 5) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public static void b(Context context0, String s, ImageView imageView0, int v, int v1, d n$d0) {
        boolean z;
        try {
            if(n.a == null) {
                n.a = new WeakHashMap();
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            return;
        }
        try {
            if(n.b == null) {
                n.b = new ArrayList();
            }
            int v2 = n.b.indexOf(s);
            if(v2 >= 0) {
                n.b.remove(v2);
            }
            n.b.add(0, s);
        }
        catch(Exception unused_ex) {
        }
        try {
            Bitmap bitmap0 = (Bitmap)n.a.get(s);
            if(bitmap0 == null) {
                bitmap0 = n.a(context0, s, v, v1, false);
                if(bitmap0 != null) {
                    n.a.put(s, bitmap0);
                }
                z = true;
            }
            else {
                z = false;
            }
            if(bitmap0 == null) {
                if(n.a(s, imageView0)) {
                    if(n.a.size() > 10) {
                        n.a.clear();
                    }
                    o o0 = new o(context0, s, imageView0, n$d0, v, v1);
                    c n$c0 = new c(o0);
                    imageView0.setBackgroundColor(0);
                    o0.a(n$c0);
                    o0.start();
                }
            }
            else if(n$d0 != null) {
                n$d0.a(bitmap0);
            }
            if(z && n.a.size() > 10) {
                goto label_31;
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
        return;
        try {
        label_31:
            int v3 = n.b.size();
            if(((Bitmap)n.a.get(n.b.get(v3 - 1))) != null) {
                n.a.remove(n.b.get(v3 - 1));
            }
            n.b.remove(v3 - 1);
            return;
        }
        catch(Exception exception1) {
        }
        try {
            exception1.printStackTrace();
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
    }
}

