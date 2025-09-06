package I;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import kotlin.io.b;
import kotlin.jvm.internal.L;
import y4.l;

public final class d {
    @l
    public static final String a(@l Context context0) {
        L.p(context0, "<this>");
        return "com.dcinside.app.android.cropper.fileprovider";
    }

    @l
    public static final Uri b(@l Context context0, @l File file0) {
        Uri uri2;
        Uri uri1;
        FileOutputStream fileOutputStream0;
        FileInputStream fileInputStream0;
        File file1;
        L.p(context0, "context");
        L.p(file0, "file");
        String s = d.a(context0);
        try {
            Log.i("AIC", "Try get URI for scope storage - content://");
            Uri uri0 = FileProvider.h(context0, s, file0);
            L.o(uri0, "getUriForFile(...)");
            return uri0;
        }
        catch(Exception exception0) {
            try {
                Log.e("AIC", exception0.getMessage());
                Log.w("AIC", "ANR Risk -- Copying the file the location cache to avoid \'external-files-path\' bug for N+ devices");
                file1 = new File(new File(context0.getCacheDir(), "CROP_LIB_CACHE"), file0.getName());
                fileInputStream0 = null;
            }
            catch(Exception exception1) {
                goto label_54;
            }
            try {
                fileInputStream0 = new FileInputStream(file0);
            }
            catch(Exception exception2) {
                fileOutputStream0 = null;
                goto label_28;
            }
            catch(Throwable throwable0) {
                fileOutputStream0 = null;
                goto label_45;
            }
            try {
                fileOutputStream0 = null;
                fileOutputStream0 = new FileOutputStream(file1);
                b.l(fileInputStream0, fileOutputStream0, 0, 2, null);
                Log.i("AIC", "Completed Android N+ file copy. Attempting to return the cached file");
                uri1 = FileProvider.h(context0, s, file1);
                L.o(uri1, "getUriForFile(...)");
                goto label_50;
            }
            catch(Exception exception2) {
            }
            catch(Throwable throwable0) {
                goto label_45;
            }
            try {
            label_28:
                Log.e("AIC", exception2.getMessage());
                Log.i("AIC", "Trying to provide URI manually");
                String s1 = "content://" + s + "/files/my_images/";
                if(Build.VERSION.SDK_INT >= 26) {
                    Files.createDirectories(Paths.get(s1, new String[0]), new FileAttribute[0]);
                }
                else {
                    File file2 = new File(s1);
                    if(!file2.exists()) {
                        file2.mkdirs();
                    }
                }
                uri2 = Uri.parse((s1 + file0.getName()));
                L.o(uri2, "parse(...)");
                if(fileInputStream0 != null) {
                    goto label_40;
                }
                goto label_41;
            }
            catch(Throwable throwable0) {
                goto label_45;
            }
            try {
            label_40:
                fileInputStream0.close();
            label_41:
                if(fileOutputStream0 != null) {
                    fileOutputStream0.close();
                }
                return uri2;
            label_45:
                if(fileInputStream0 != null) {
                    fileInputStream0.close();
                }
                if(fileOutputStream0 != null) {
                    fileOutputStream0.close();
                }
                throw throwable0;
            label_50:
                fileInputStream0.close();
                fileOutputStream0.close();
                return uri1;
            }
            catch(Exception exception1) {
            label_54:
                Log.e("AIC", exception1.getMessage());
                if(Build.VERSION.SDK_INT < 29) {
                    File file3 = context0.getExternalCacheDir();
                    if(file3 != null) {
                        try {
                            Log.i("AIC", "Use External storage, do not work for OS 29 and above");
                            Uri uri3 = Uri.fromFile(new File(file3.getPath(), file0.getAbsolutePath()));
                            L.o(uri3, "fromFile(...)");
                            return uri3;
                        }
                        catch(Exception exception3) {
                            Log.e("AIC", exception3.getMessage());
                        }
                    }
                }
                Log.i("AIC", "Try get URI using file://");
                Uri uri4 = Uri.fromFile(file0);
                L.o(uri4, "fromFile(...)");
                return uri4;
            }
        }
    }
}

