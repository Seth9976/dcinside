package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Stack;
import java.util.TreeSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o3.h;

public final class SysUtil {
    @TargetApi(21)
    @f
    static final class LollipopSysdeps {
        @f
        public static void fallocateIfSupported(FileDescriptor fileDescriptor0, long v) throws IOException {
            try {
                Os.posix_fallocate(fileDescriptor0, 0L, v);
            }
            catch(ErrnoException errnoException0) {
                if(errnoException0.errno != OsConstants.EOPNOTSUPP && (errnoException0.errno != OsConstants.ENOSYS && errnoException0.errno != OsConstants.EINVAL)) {
                    throw new IOException(errnoException0.toString(), errnoException0);
                }
            }
        }

        @f
        public static String[] getSupportedAbis() {
            String[] arr_s = Build.SUPPORTED_ABIS;
            TreeSet treeSet0 = new TreeSet();
            try {
                if(LollipopSysdeps.is64Bit()) {
                    treeSet0.add("arm64-v8a");
                    treeSet0.add("x86_64");
                }
                else {
                    treeSet0.add("armeabi-v7a");
                    treeSet0.add("x86");
                }
            }
            catch(ErrnoException errnoException0) {
                p.c("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(arr_s), errnoException0.errno, errnoException0.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                if(treeSet0.contains(s)) {
                    arrayList0.add(s);
                }
            }
            return (String[])arrayList0.toArray(new String[arrayList0.size()]);
        }

        @f
        public static boolean is64Bit() throws ErrnoException {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    @TargetApi(23)
    @f
    static final class MarshmallowSysdeps {
        private static boolean a(Context context0) throws IOException {
            ZipEntry zipEntry0;
            try(ZipFile zipFile0 = new ZipFile(new File(context0.getApplicationInfo().sourceDir))) {
                Enumeration enumeration0 = zipFile0.entries();
                do {
                    if(!enumeration0.hasMoreElements()) {
                        return false;
                    }
                    zipEntry0 = (ZipEntry)enumeration0.nextElement();
                }
                while(zipEntry0 == null || !zipEntry0.getName().endsWith(".so") || !zipEntry0.getName().contains("/lib") || zipEntry0.getName().startsWith("assets/"));
                return zipEntry0.getMethod() == 0;
            }
        }

        public static boolean b(@h Context context0) {
            return context0 != null && (context0.getApplicationInfo().flags & 0x10000000) == 0;
        }

        public static boolean c(@h Context context0, int v) {
            return v == 2 ? true : MarshmallowSysdeps.b(context0);
        }

        @f
        public static String[] getSupportedAbis() {
            String[] arr_s = Build.SUPPORTED_ABIS;
            TreeSet treeSet0 = new TreeSet();
            if(MarshmallowSysdeps.is64Bit()) {
                treeSet0.add("arm64-v8a");
                treeSet0.add("x86_64");
            }
            else {
                treeSet0.add("armeabi-v7a");
                treeSet0.add("x86");
            }
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                if(treeSet0.contains(s)) {
                    arrayList0.add(s);
                }
            }
            return (String[])arrayList0.toArray(new String[arrayList0.size()]);
        }

        @f
        public static boolean is64Bit() {
            return Process.is64Bit();
        }
    }

    private static final String a = "SysUtil";
    private static final byte b = 1;
    private static final long c = 20L;

    static int a(RandomAccessFile randomAccessFile0, InputStream inputStream0, int v, byte[] arr_b) throws IOException {
        int v1;
        for(v1 = 0; v1 < v; v1 += v2) {
            int v2 = inputStream0.read(arr_b, 0, Math.min(arr_b.length, v - v1));
            if(v2 == -1) {
                break;
            }
            randomAccessFile0.write(arr_b, 0, v2);
        }
        return v1;
    }

    public static void b(File file0) throws IOException {
        File file1 = file0.getParentFile();
        if(file1 != null && !file1.canWrite() && !file1.setWritable(true)) {
            p.c("SysUtil", "Enable write permission failed: " + file1);
        }
        if(!file0.delete() && file0.exists()) {
            throw new IOException("Could not delete file " + file0);
        }
    }

    public static void c(File file0) throws IOException {
        Stack stack0 = new Stack();
        stack0.push(file0);
        ArrayList arrayList0 = new ArrayList();
        while(!stack0.isEmpty()) {
            File file1 = (File)stack0.pop();
            if(file1.isDirectory()) {
                arrayList0.add(file1);
                File[] arr_file = file1.listFiles();
                if(arr_file != null) {
                    int v = arr_file.length;
                    for(int v1 = 0; v1 < v; ++v1) {
                        stack0.push(arr_file[v1]);
                    }
                }
            }
            else {
                SysUtil.b(file1);
            }
        }
        for(int v2 = arrayList0.size() - 1; v2 >= 0; --v2) {
            SysUtil.b(((File)arrayList0.get(v2)));
        }
    }

    public static void d(FileDescriptor fileDescriptor0, long v) throws IOException {
        LollipopSysdeps.fallocateIfSupported(fileDescriptor0, v);
    }

    public static int e(String[] arr_s, String s) {
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(s1 != null && s.equals(s1)) {
                return v;
            }
        }
        return -1;
    }

    public static void f(File file0) throws IOException {
        Stack stack0 = new Stack();
        stack0.push(file0);
        while(!stack0.isEmpty()) {
            File file1 = (File)stack0.pop();
            if(file1.isDirectory()) {
                File[] arr_file = file1.listFiles();
                if(arr_file == null) {
                    throw new IOException("cannot list directory " + file1);
                }
                int v = arr_file.length;
                for(int v1 = 0; v1 < v; ++v1) {
                    stack0.push(arr_file[v1]);
                }
            }
            else if(!file1.getPath().endsWith("_lock")) {
                try(RandomAccessFile randomAccessFile0 = new RandomAccessFile(file1, "r")) {
                    randomAccessFile0.getFD().sync();
                }
                catch(IOException iOException0) {
                    p.c("SysUtil", "Syncing failed for " + file1 + ": " + iOException0.getMessage());
                }
            }
        }
    }

    public static long g(File file0) throws IOException {
        return SysUtil.l(((long)(file0.getCanonicalFile().getPath().length() + 1)) * 2L) + 20L;
    }

    @f
    @h
    public static String getClassLoaderLdLoadLibrary() {
        ClassLoader classLoader0 = SoLoader.class.getClassLoader();
        if(classLoader0 != null && !(classLoader0 instanceof BaseDexClassLoader)) {
            throw new IllegalStateException("ClassLoader " + classLoader0.getClass().getName() + " should be of type BaseDexClassLoader");
        }
        try {
            return (String)BaseDexClassLoader.class.getMethod("getLdLibraryPath", null).invoke(((BaseDexClassLoader)classLoader0), null);
        }
        catch(Exception exception0) {
            p.d("SysUtil", "Cannot call getLdLibraryPath", exception0);
            return null;
        }
    }

    @f
    @h
    public static Method getNativeLoadRuntimeMethod() {
        int v = Build.VERSION.SDK_INT;
        if(v < 23) {
            return null;
        }
        if(v > 27) {
            return null;
        }
        try {
            Method method0 = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            method0.setAccessible(true);
            return method0;
        }
        catch(Exception exception0) {
            p.k("SysUtil", "Cannot get nativeLoad method", exception0);
            return null;
        }
    }

    public static int h(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        if(packageManager0 != null) {
            try {
                return packageManager0.getPackageInfo("com.dcinside.app.android", 0).versionCode;
            }
            catch(PackageManager.NameNotFoundException | RuntimeException unused_ex) {
            }
        }
        return 0;
    }

    public static String i(String s) {
        int v = s.lastIndexOf(46);
        return v <= 0 ? s : s.substring(0, v);
    }

    public static o j(File file0) throws IOException {
        return o.a(file0);
    }

    @h
    public static o k(File file0, File file1) throws IOException {
        o o0;
        boolean z;
        try {
            return SysUtil.j(file1);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            try {
                z = true;
                if(!file0.setWritable(true)) {
                    throw fileNotFoundException0;
                }
                o0 = SysUtil.j(file1);
            }
            catch(Throwable throwable0) {
                goto label_14;
            }
            if(!file0.setWritable(false)) {
                p.j("SysUtil", "error removing " + file0.getCanonicalPath() + " write permission");
            }
            return o0;
        }
        catch(Throwable throwable0) {
            z = false;
        }
    label_14:
        if(z && !file0.setWritable(false)) {
            p.j("SysUtil", "error removing " + file0.getCanonicalPath() + " write permission");
        }
        throw throwable0;
    }

    private static long l(long v) {
        return v + (4L - v % 4L) % 4L;
    }

    public static String[] m() {
        return Build.VERSION.SDK_INT < 23 ? LollipopSysdeps.getSupportedAbis() : MarshmallowSysdeps.getSupportedAbis();
    }

    @SuppressLint({"CatchGeneralException"})
    public static boolean n() {
        if(Build.VERSION.SDK_INT >= 23) {
            return MarshmallowSysdeps.is64Bit();
        }
        try {
            return LollipopSysdeps.is64Bit();
        }
        catch(Exception exception0) {
            p.c("SysUtil", String.format("Could not read /proc/self/exe. Err msg: %s", exception0.getMessage()));
            return false;
        }
    }

    public static boolean o(Context context0) {
        return Build.VERSION.SDK_INT < 23 ? false : MarshmallowSysdeps.b(context0);
    }

    public static boolean p(@h Context context0, int v) {
        return Build.VERSION.SDK_INT < 23 ? false : MarshmallowSysdeps.c(context0, v);
    }

    public static byte[] q(File file0, Context context0) throws IOException {
        File file1 = file0.getCanonicalFile();
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeByte(1);
            parcel0.writeString(file1.getPath());
            parcel0.writeLong(file1.lastModified());
            parcel0.writeInt(SysUtil.h(context0));
            return parcel0.marshall();
        }
        finally {
            parcel0.recycle();
        }
    }

    @h
    public static String r(@h String s) {
        if(s == null) {
            return null;
        }
        String[] arr_s = s.split(":");
        ArrayList arrayList0 = new ArrayList(arr_s.length);
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(!s1.contains("!")) {
                arrayList0.add(s1);
            }
        }
        return TextUtils.join(":", arrayList0);
    }

    public static void s(File file0) throws IOException {
        if(!file0.mkdirs() && !file0.isDirectory()) {
            throw new IOException("cannot mkdir: " + file0);
        }
    }
}

