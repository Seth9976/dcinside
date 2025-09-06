package pl.droidsonroids.relinker;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class a implements pl.droidsonroids.relinker.e.a {
    static class pl.droidsonroids.relinker.a.a {
        public ZipFile a;
        public ZipEntry b;

        public pl.droidsonroids.relinker.a.a(ZipFile zipFile0, ZipEntry zipEntry0) {
            this.a = zipFile0;
            this.b = zipEntry0;
        }
    }

    private static final int a = 5;
    private static final int b = 0x1000;

    @Override  // pl.droidsonroids.relinker.e$a
    public void a(Context context0, String[] arr_s, String s, File file0, f f0) {
        FileOutputStream fileOutputStream0;
        InputStream inputStream0;
        pl.droidsonroids.relinker.a.a a$a1;
        pl.droidsonroids.relinker.a.a a$a0 = null;
        try {
            a$a1 = this.d(context0, arr_s, s, f0);
        }
        catch(Throwable throwable0) {
            goto label_58;
        }
        if(a$a1 != null) {
            int v = 0;
            try {
                while(true) {
                label_7:
                    if(v >= 5) {
                        goto label_50;
                    }
                    f0.m("Found %s! Extracting...", new Object[]{s});
                    try {
                        if(file0.exists() || file0.createNewFile()) {
                            goto label_12;
                        }
                    }
                    catch(IOException unused_ex) {
                    }
                    break;
                }
            }
            catch(Throwable throwable0) {
                goto label_57;
            }
            ++v;
            goto label_7;
            try {
            label_12:
                inputStream0 = null;
                inputStream0 = a$a1.a.getInputStream(a$a1.b);
            }
            catch(FileNotFoundException unused_ex) {
                fileOutputStream0 = null;
                goto label_28;
            }
            catch(IOException unused_ex) {
                fileOutputStream0 = null;
                goto label_30;
            }
            catch(Throwable throwable1) {
                fileOutputStream0 = null;
                goto label_34;
            }
            try {
                fileOutputStream0 = null;
                fileOutputStream0 = new FileOutputStream(file0);
                long v1 = this.c(inputStream0, fileOutputStream0);
                fileOutputStream0.getFD().sync();
                if(v1 == file0.length()) {
                    goto label_41;
                }
                goto label_37;
            }
            catch(FileNotFoundException unused_ex) {
            }
            catch(IOException unused_ex) {
                goto label_30;
            }
            catch(Throwable throwable1) {
                goto label_33;
            }
            try {
            label_28:
                this.b(inputStream0);
                this.b(fileOutputStream0);
                ++v;
                goto label_7;
            label_30:
                this.b(inputStream0);
                this.b(fileOutputStream0);
                ++v;
                goto label_7;
            label_33:
                a$a0 = inputStream0;
            label_34:
                this.b(((Closeable)a$a0));
                this.b(fileOutputStream0);
                throw throwable1;
            label_37:
                this.b(inputStream0);
                this.b(fileOutputStream0);
                ++v;
                goto label_7;
            label_41:
                this.b(inputStream0);
                this.b(fileOutputStream0);
                file0.setReadable(true, false);
                file0.setExecutable(true, false);
                file0.setWritable(true);
            }
            catch(Throwable throwable0) {
                goto label_57;
            }
            try {
                ZipFile zipFile0 = a$a1.a;
                if(zipFile0 != null) {
                    zipFile0.close();
                }
            }
            catch(IOException unused_ex) {
            }
            return;
            try {
            label_50:
                f0.l("FATAL! Couldn\'t extract the library from the APK!");
            }
            catch(Throwable throwable0) {
                goto label_57;
            }
            try {
                ZipFile zipFile1 = a$a1.a;
                if(zipFile1 != null) {
                    zipFile1.close();
                }
            }
            catch(IOException unused_ex) {
            }
            return;
        }
        try {
            throw new c(s);
        }
        catch(Throwable throwable0) {
        label_57:
            a$a0 = a$a1;
        }
    label_58:
        if(a$a0 != null) {
            ZipFile zipFile2 = a$a0.a;
            if(zipFile2 != null) {
                try {
                    zipFile2.close();
                }
                catch(IOException unused_ex) {
                }
            }
        }
        throw throwable0;
    }

    private void b(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    private long c(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        byte[] arr_b = new byte[0x1000];
        long v = 0L;
        int v1;
        while((v1 = inputStream0.read(arr_b)) != -1) {
            outputStream0.write(arr_b, 0, v1);
            v += (long)v1;
        }
        outputStream0.flush();
        return v;
    }

    private pl.droidsonroids.relinker.a.a d(Context context0, String[] arr_s, String s, f f0) {
        ZipFile zipFile0;
        String[] arr_s1 = this.e(context0);
        for(int v = 0; v < arr_s1.length; ++v) {
            String s1 = arr_s1[v];
            int v1 = 0;
            while(true) {
                try {
                    zipFile0 = new ZipFile(new File(s1), 1);
                    break;
                }
                catch(IOException unused_ex) {
                    ++v1;
                }
            }
            for(int v2 = 0; v2 < 5; ++v2) {
                for(int v3 = 0; v3 < arr_s.length; ++v3) {
                    String s2 = "lib" + File.separatorChar + arr_s[v3] + File.separatorChar + s;
                    f0.m("Looking for %s in APK %s...", new Object[]{s2, s1});
                    ZipEntry zipEntry0 = zipFile0.getEntry(s2);
                    if(zipEntry0 != null) {
                        return new pl.droidsonroids.relinker.a.a(zipFile0, zipEntry0);
                    }
                }
            }
            try {
                zipFile0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        return null;
    }

    private String[] e(Context context0) {
        ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
        String[] arr_s = applicationInfo0.splitSourceDirs;
        if(arr_s != null && arr_s.length != 0) {
            String[] arr_s1 = new String[arr_s.length + 1];
            arr_s1[0] = applicationInfo0.sourceDir;
            System.arraycopy(arr_s, 0, arr_s1, 1, arr_s.length);
            return arr_s1;
        }
        return new String[]{applicationInfo0.sourceDir};
    }
}

