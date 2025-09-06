package com.fsn.cauly;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Environment;
import android.widget.ImageView;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

public class ImageCacheManager {
    class BitmapCacheDownloaderTask extends AsyncTask {
        private String a;
        private final WeakReference b;
        final ImageCacheManager c;

        public BitmapCacheDownloaderTask(ImageView imageView0) {
            this.b = new WeakReference(imageView0);
        }

        protected Bitmap a(String[] arr_s) {
            this.a = arr_s[0];
            return ImageCacheManager.this.a(arr_s[0]);
        }

        protected void a(Bitmap bitmap0) {
            if(bitmap0 != null) {
                ImageCacheManager.c.b(this.a, bitmap0);
                WeakReference weakReference0 = this.b;
                if(weakReference0 != null) {
                    ImageView imageView0 = (ImageView)weakReference0.get();
                    if(imageView0 != null) {
                        imageView0.setImageBitmap(bitmap0);
                    }
                }
            }
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.a(((String[])arr_object));
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object object0) {
            this.a(((Bitmap)object0));
        }
    }

    public interface BitmapDownloadListener {
        void onBitmapDownloaded(Bitmap arg1);
    }

    class BitmapDownloaderTask extends AsyncTask {
        private String a;
        BitmapDownloadListener b;
        ImageView c;
        final ImageCacheManager d;

        protected Bitmap a(String[] arr_s) {
            String s = arr_s[0];
            this.a = s;
            return s == null || !s.startsWith("http") ? ImageCacheManager.this.createImageFromFile(this.a) : ImageCacheManager.this.a(this.a);
        }

        protected void a(Bitmap bitmap0) {
            BitmapDownloadListener imageCacheManager$BitmapDownloadListener0 = this.b;
            if(imageCacheManager$BitmapDownloadListener0 != null) {
                imageCacheManager$BitmapDownloadListener0.onBitmapDownloaded(bitmap0);
            }
            ImageView imageView0 = this.c;
            if(imageView0 != null) {
                imageView0.setImageBitmap(bitmap0);
            }
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.a(((String[])arr_object));
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object object0) {
            this.a(((Bitmap)object0));
        }

        public void setImageView(ImageView imageView0) {
            this.c = imageView0;
        }

        public void setListener(BitmapDownloadListener imageCacheManager$BitmapDownloadListener0) {
            this.b = imageCacheManager$BitmapDownloadListener0;
        }
    }

    static class DownloaderBitmapDrawable extends BitmapDrawable {
        private final WeakReference a;

        DownloaderBitmapDrawable(Bitmap bitmap0, BitmapCacheDownloaderTask imageCacheManager$BitmapCacheDownloaderTask0) {
            super(ImageCacheManager.b.getResources(), bitmap0);
            this.a = new WeakReference(imageCacheManager$BitmapCacheDownloaderTask0);
        }

        public BitmapCacheDownloaderTask getBitmapDownloaderTask() {
            return (BitmapCacheDownloaderTask)this.a.get();
        }
    }

    public static String FILE_NAME = "";
    static ImageCacheManager a;
    static Context b;
    static ImageCache c;
    static HashMap d;

    static {
        ImageCacheManager.d = new HashMap();
    }

    Bitmap a(String s) {
        try {
            HttpURLConnection httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(s).openConnection())));
            httpURLConnection0.setDoInput(true);
            httpURLConnection0.connect();
            return BitmapFactory.decodeStream(httpURLConnection0.getInputStream());
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    public void clearCache() {
        ImageCacheManager.c.clearCache();
    }

    public Bitmap createImageFromFile(String s) {
        Bitmap bitmap0;
        FileInputStream fileInputStream0;
        try {
            try {
                fileInputStream0 = new FileInputStream(new File(s));
                bitmap0 = BitmapFactory.decodeStream(fileInputStream0);
            }
            catch(Exception unused_ex) {
                return null;
            }
            try {
                fileInputStream0.close();
            }
            catch(Exception unused_ex) {
            }
            return bitmap0;
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
            return null;
        }
    }

    public static ImageCacheManager getInstance(Context context0) {
        synchronized(ImageCacheManager.class) {
            ImageCacheManager.b = context0;
            ImageCacheManager.FILE_NAME = Environment.getDataDirectory().toString() + "/data/" + "com.dcinside.app.android" + "/cache";
            if(ImageCacheManager.a == null) {
                ImageCacheManager.c = new ImageCache();
                ImageCacheManager.a = new ImageCacheManager();
                File file0 = new File("");
                if(!file0.exists()) {
                    file0.mkdir();
                }
            }
            return ImageCacheManager.a;
        }
    }

    public static String getName(String s) {
        return s == null || s.length() <= 0 ? null : s.substring(s.lastIndexOf("/") + 1);
    }

    public void init() {
    }

    public void setImageBitmap(String s, ImageView imageView0) {
        Bitmap bitmap0 = ImageCacheManager.c.a(s);
        if(bitmap0 != null && !bitmap0.isRecycled()) {
            imageView0.setImageBitmap(bitmap0);
            return;
        }
        BitmapCacheDownloaderTask imageCacheManager$BitmapCacheDownloaderTask0 = new BitmapCacheDownloaderTask(this, imageView0);
        imageView0.setImageDrawable(new DownloaderBitmapDrawable(null, imageCacheManager$BitmapCacheDownloaderTask0));
        imageCacheManager$BitmapCacheDownloaderTask0.execute(new String[]{s});
    }
}

