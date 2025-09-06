package androidx.browser.browseractions;

import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.content.FileProvider;
import androidx.core.util.AtomicFile;
import com.google.common.util.concurrent.t0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestrictTo({Scope.a})
@Deprecated
public final class BrowserServiceFileProvider extends FileProvider {
    static class FileCleanupTask extends AsyncTask {
        private final Context a;
        private static final long b;
        private static final long c;
        private static final long d;

        static {
            TimeUnit timeUnit0 = TimeUnit.DAYS;
            FileCleanupTask.b = timeUnit0.toMillis(7L);
            FileCleanupTask.c = timeUnit0.toMillis(7L);
            FileCleanupTask.d = timeUnit0.toMillis(1L);
        }

        FileCleanupTask(Context context0) {
            this.a = context0.getApplicationContext();
        }

        protected Void a(Void[] arr_void) {
            SharedPreferences sharedPreferences0 = this.a.getSharedPreferences("com.dcinside.app.android.image_provider", 0);
            if(!FileCleanupTask.c(sharedPreferences0)) {
                return null;
            }
            synchronized(BrowserServiceFileProvider.A) {
                File file0 = new File(this.a.getFilesDir(), "image_provider");
                if(!file0.exists()) {
                    return null;
                }
                File[] arr_file = file0.listFiles();
                long v1 = System.currentTimeMillis() - FileCleanupTask.b;
                boolean z = true;
                for(int v2 = 0; v2 < arr_file.length; ++v2) {
                    File file1 = arr_file[v2];
                    if(FileCleanupTask.b(file1) && file1.lastModified() < v1 && !file1.delete()) {
                        Log.e("BrowserServiceFP", "Fail to delete image: " + file1.getAbsoluteFile());
                        z = false;
                    }
                }
                SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                sharedPreferences$Editor0.putLong("last_cleanup_time", (z ? System.currentTimeMillis() : System.currentTimeMillis() - FileCleanupTask.c + FileCleanupTask.d));
                sharedPreferences$Editor0.apply();
                return null;
            }
        }

        private static boolean b(File file0) {
            return file0.getName().endsWith("..png");
        }

        private static boolean c(SharedPreferences sharedPreferences0) {
            return System.currentTimeMillis() > sharedPreferences0.getLong("last_cleanup_time", System.currentTimeMillis()) + FileCleanupTask.c;
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.a(((Void[])arr_object));
        }
    }

    static class FileSaveTask extends AsyncTask {
        private final Context a;
        private final String b;
        private final Bitmap c;
        private final Uri d;
        private final ResolvableFuture e;

        FileSaveTask(Context context0, String s, Bitmap bitmap0, Uri uri0, ResolvableFuture resolvableFuture0) {
            this.a = context0.getApplicationContext();
            this.b = s;
            this.c = bitmap0;
            this.d = uri0;
            this.e = resolvableFuture0;
        }

        protected Void a(String[] arr_s) {
            this.d();
            return null;
        }

        protected void b(Void void0) {
            new FileCleanupTask(this.a).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }

        private void c(File file0) {
            FileOutputStream fileOutputStream0;
            if(Build.VERSION.SDK_INT >= 22) {
                AtomicFile atomicFile0 = new AtomicFile(file0);
                try {
                    fileOutputStream0 = null;
                    fileOutputStream0 = atomicFile0.h();
                    this.c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream0);
                    fileOutputStream0.close();
                    atomicFile0.c(fileOutputStream0);
                    this.e.r(this.d);
                }
                catch(IOException iOException0) {
                    atomicFile0.b(fileOutputStream0);
                    this.e.s(iOException0);
                }
                return;
            }
            try {
                FileOutputStream fileOutputStream1 = new FileOutputStream(file0);
                this.c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream1);
                fileOutputStream1.close();
                this.e.r(this.d);
            }
            catch(IOException iOException1) {
                this.e.s(iOException1);
            }
        }

        private void d() {
            File file0 = new File(this.a.getFilesDir(), "image_provider");
            synchronized(BrowserServiceFileProvider.A) {
                if(!file0.exists() && !file0.mkdir()) {
                    IOException iOException0 = new IOException("Could not create file directory.");
                    this.e.s(iOException0);
                    return;
                }
                File file1 = new File(file0, this.b + ".png");
                if(file1.exists()) {
                    this.e.r(this.d);
                }
                else {
                    this.c(file1);
                }
                file1.setLastModified(System.currentTimeMillis());
            }
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.a(((String[])arr_object));
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object object0) {
            this.b(((Void)object0));
        }
    }

    static Object A = null;
    private static final String s = "BrowserServiceFP";
    private static final String t = ".image_provider";
    private static final String u = "content";
    private static final String v = "image_provider";
    private static final String w = "image_provider_images/";
    private static final String x = ".png";
    private static final String y = "image_provider_uris";
    private static final String z = "last_cleanup_time";

    static {
        BrowserServiceFileProvider.A = new Object();
    }

    // 去混淆评级： 低(20)
    private static Uri m(Context context0, String s) {
        return new Uri.Builder().scheme("content").authority("com.dcinside.app.android.image_provider").path("image_provider_images/" + s + ".png").build();
    }

    public static void n(@NonNull Intent intent0, @Nullable List list0, @NonNull Context context0) {
        if(list0 != null && list0.size() != 0) {
            ContentResolver contentResolver0 = context0.getContentResolver();
            intent0.addFlags(1);
            ClipData clipData0 = ClipData.newUri(contentResolver0, "image_provider_uris", ((Uri)list0.get(0)));
            for(int v = 1; v < list0.size(); ++v) {
                clipData0.addItem(new ClipData.Item(((Uri)list0.get(v))));
            }
            intent0.setClipData(clipData0);
        }
    }

    @NonNull
    public static t0 o(@NonNull ContentResolver contentResolver0, @NonNull Uri uri0) {
        t0 t00 = ResolvableFuture.w();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    ParcelFileDescriptor parcelFileDescriptor0 = contentResolver0.openFileDescriptor(uri0, "r");
                    if(parcelFileDescriptor0 == null) {
                        FileNotFoundException fileNotFoundException0 = new FileNotFoundException();
                        ((ResolvableFuture)t00).s(fileNotFoundException0);
                        return;
                    }
                    Bitmap bitmap0 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor0.getFileDescriptor());
                    parcelFileDescriptor0.close();
                    if(bitmap0 == null) {
                        IOException iOException1 = new IOException("File could not be decoded.");
                        ((ResolvableFuture)t00).s(iOException1);
                        return;
                    }
                    ((ResolvableFuture)t00).r(bitmap0);
                    return;
                }
                catch(IOException iOException0) {
                }
                ((ResolvableFuture)t00).s(iOException0);
            }
        });
        return t00;
    }

    @NonNull
    @UiThread
    public static ResolvableFuture p(@NonNull Context context0, @NonNull Bitmap bitmap0, @NonNull String s, int v) {
        String s1 = s + "_" + Integer.toString(v);
        Uri uri0 = BrowserServiceFileProvider.m(context0, s1);
        ResolvableFuture resolvableFuture0 = ResolvableFuture.w();
        new FileSaveTask(context0, s1, bitmap0, uri0, resolvableFuture0).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return resolvableFuture0;
    }
}

