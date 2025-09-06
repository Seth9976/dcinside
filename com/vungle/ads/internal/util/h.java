package com.vungle.ads.internal.util;

import android.os.Build.VERSION;
import android.webkit.URLUtil;
import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.text.f;
import okhttp3.HttpUrl;
import y4.l;
import y4.m;
import z3.n;

public final class h {
    public interface a {
        @l
        ObjectInputStream provideObjectInputStream(@m InputStream arg1) throws IOException, ClassNotFoundException;
    }

    @l
    public static final h INSTANCE;
    private static final String TAG;
    @l
    private static final List allowedClasses;
    @l
    private static a objectInputStreamProvider;

    static {
        h.INSTANCE = new h();
        h.objectInputStreamProvider = (InputStream inputStream0) -> new t(inputStream0, h.allowedClasses);
        h.TAG = "h";
        h.allowedClasses = u.O(new Class[]{LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class});
    }

    public final void closeQuietly(@m Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    @n
    public static final void delete(@m File file0) {
        if(file0 != null) {
            try {
                if(file0.exists()) {
                    if(file0.isDirectory()) {
                        h.deleteContents(file0);
                    }
                    if(!file0.delete()) {
                        L.o("h", "TAG");
                        p.Companion.d("h", "Failed to delete file: " + file0);
                        return;
                    }
                }
                return;
            }
            catch(Exception exception0) {
            }
            L.o("h", "TAG");
            p.Companion.e("h", "Failed to delete file: " + exception0.getLocalizedMessage());
        }
    }

    @n
    public static final void deleteAndLogIfFailed(@l File file0) {
        L.p(file0, "file");
        try {
            if(Build.VERSION.SDK_INT >= 26) {
                Files.delete(file0.toPath());
                return;
            }
            if(!file0.delete()) {
                L.o("h", "TAG");
                p.Companion.e("h", "Cannot delete " + file0.getName());
            }
        }
        catch(Exception exception0) {
            L.o("h", "TAG");
            p.Companion.e("h", "Cannot delete " + file0.getName(), exception0);
        }
    }

    @n
    public static final void deleteContents(@l File file0) {
        L.p(file0, "folder");
        File[] arr_file = file0.listFiles();
        if(arr_file == null) {
            return;
        }
        for(int v = 0; v < arr_file.length; ++v) {
            h.delete(arr_file[v]);
        }
    }

    @l
    public final List getAllowedClasses$vungle_ads_release() {
        return h.allowedClasses;
    }

    @VisibleForTesting
    public static void getAllowedClasses$vungle_ads_release$annotations() {
    }

    private final String getIndentString(int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append("|  ");
        }
        String s = stringBuilder0.toString();
        L.o(s, "sb.toString()");
        return s;
    }

    @VisibleForTesting
    @l
    public final a getObjectInputStreamProvider() {
        return h.objectInputStreamProvider;
    }

    @l
    public final String guessFileName(@l String s, @m String s1) {
        L.p(s, "url");
        String s2 = URLUtil.guessFileName(s, null, s1);
        L.o(s2, "guessFileName(url, null, ext)");
        return s2;
    }

    public static String guessFileName$default(h h0, String s, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        return h0.guessFileName(s, s1);
    }

    public final boolean isValidUrl(@m String s) {
        return s != null && s.length() != 0 && HttpUrl.Companion.parse(s) != null;
    }

    // 检测为 Lambda 实现
    private static final ObjectInputStream objectInputStreamProvider$lambda-0(InputStream inputStream0) [...]

    @n
    public static final void printDirectoryTree(@m File file0) {
    }

    private final void printDirectoryTree(File file0, int v, StringBuilder stringBuilder0) {
        if(file0 == null) {
            return;
        }
        if(!file0.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory");
        }
        stringBuilder0.append(this.getIndentString(v));
        stringBuilder0.append("+--");
        stringBuilder0.append(file0.getName());
        stringBuilder0.append("/\n");
        File[] arr_file = file0.listFiles();
        if(arr_file == null) {
            return;
        }
        for(int v1 = 0; v1 < arr_file.length; ++v1) {
            File file1 = arr_file[v1];
            if(file1.isDirectory()) {
                this.printDirectoryTree(file1, v + 1, stringBuilder0);
            }
            else {
                L.o(file1, "file");
                this.printFile(file1, v + 1, stringBuilder0);
            }
        }
    }

    private final void printFile(File file0, int v, StringBuilder stringBuilder0) {
        stringBuilder0.append(this.getIndentString(v));
        stringBuilder0.append("+--");
        stringBuilder0.append(file0.getName());
        stringBuilder0.append('\n');
    }

    @m
    @n
    public static final Object readSerializable(@l File file0) {
        Object object0;
        ObjectInputStream objectInputStream0;
        FileInputStream fileInputStream0;
        L.p(file0, "file");
        Closeable closeable0 = null;
        if(!file0.exists()) {
            return null;
        }
        try {
            fileInputStream0 = null;
            fileInputStream0 = new FileInputStream(file0);
            objectInputStream0 = null;
            objectInputStream0 = h.objectInputStreamProvider.provideObjectInputStream(fileInputStream0);
        }
        catch(IOException iOException0) {
            objectInputStream0 = null;
            goto label_24;
        }
        catch(ClassNotFoundException classNotFoundException0) {
            objectInputStream0 = null;
            goto label_28;
        }
        catch(Exception exception0) {
            objectInputStream0 = null;
            goto label_32;
        }
        catch(Throwable throwable0) {
            h.INSTANCE.closeQuietly(closeable0);
            h.INSTANCE.closeQuietly(fileInputStream0);
            throw throwable0;
        }
        try {
            object0 = objectInputStream0.readObject();
            goto label_43;
        }
        catch(IOException iOException0) {
        }
        catch(ClassNotFoundException classNotFoundException0) {
            goto label_28;
        }
        catch(Exception exception0) {
            goto label_32;
        }
        catch(Throwable throwable0) {
            closeable0 = objectInputStream0;
            h.INSTANCE.closeQuietly(closeable0);
            h.INSTANCE.closeQuietly(fileInputStream0);
            throw throwable0;
        }
        try {
        label_24:
            L.o("h", "TAG");
            p.Companion.e("h", "IOException: " + iOException0.getMessage());
            goto label_34;
        label_28:
            L.o("h", "TAG");
            p.Companion.e("h", "ClassNotFoundException: " + classNotFoundException0.getMessage());
            goto label_34;
        label_32:
            L.o("h", "TAG");
            p.Companion.e("h", "cannot read serializable " + exception0.getMessage());
        }
        catch(Throwable throwable0) {
            closeable0 = objectInputStream0;
            h.INSTANCE.closeQuietly(closeable0);
            h.INSTANCE.closeQuietly(fileInputStream0);
            throw throwable0;
        }
    label_34:
        h.INSTANCE.closeQuietly(objectInputStream0);
        h.INSTANCE.closeQuietly(fileInputStream0);
        try {
            h.delete(file0);
        }
        catch(IOException unused_ex) {
        }
        return null;
    label_43:
        h.INSTANCE.closeQuietly(objectInputStream0);
        h.INSTANCE.closeQuietly(fileInputStream0);
        return object0;
    }

    @m
    public final String readString(@l File file0) {
        L.p(file0, "file");
        if(!file0.exists()) {
            return null;
        }
        try {
            return kotlin.io.m.B(file0, null, 1, null);
        }
        catch(IOException iOException0) {
            L.o("h", "TAG");
            p.Companion.e("h", "IOException: " + iOException0.getMessage());
            return null;
        }
        catch(Exception exception0) {
            L.o("h", "TAG");
            p.Companion.e("h", "cannot read string " + exception0.getMessage());
            return null;
        }
    }

    @VisibleForTesting
    public final void setObjectInputStreamProvider(@l a h$a0) {
        L.p(h$a0, "<set-?>");
        h.objectInputStreamProvider = h$a0;
    }

    public final long size(@m File file0) {
        long v = 0L;
        if(file0 != null && file0.exists()) {
            if(file0.isDirectory()) {
                File[] arr_file = file0.listFiles();
                if(arr_file != null && arr_file.length != 0) {
                    for(int v1 = 0; v1 < arr_file.length; ++v1) {
                        v += this.size(arr_file[v1]);
                    }
                }
                return v;
            }
            return file0.length();
        }
        return 0L;
    }

    @n
    public static final void writeSerializable(@l File file0, @m Serializable serializable0) {
        ObjectOutputStream objectOutputStream0;
        Closeable closeable1;
        Closeable closeable0;
        L.p(file0, "file");
        if(file0.exists()) {
            h.deleteAndLogIfFailed(file0);
        }
        if(serializable0 == null) {
            return;
        }
        try {
            closeable0 = null;
            closeable1 = null;
            closeable1 = new FileOutputStream(file0);
            objectOutputStream0 = null;
            objectOutputStream0 = new ObjectOutputStream(((OutputStream)closeable1));
        }
        catch(IOException iOException0) {
            objectOutputStream0 = null;
            goto label_22;
        }
        catch(Throwable throwable0) {
            h.INSTANCE.closeQuietly(closeable0);
            h.INSTANCE.closeQuietly(closeable1);
            throw throwable0;
        }
        try {
            objectOutputStream0.writeObject(serializable0);
            objectOutputStream0.reset();
            goto label_36;
        }
        catch(IOException iOException0) {
            closeable0 = closeable1;
            try {
            label_22:
                L.o("h", "TAG");
                p.Companion.e("h", iOException0.getMessage());
            }
            catch(Throwable throwable0) {
                closeable1 = closeable0;
                closeable0 = objectOutputStream0;
                h.INSTANCE.closeQuietly(closeable0);
                h.INSTANCE.closeQuietly(closeable1);
                throw throwable0;
            }
            h.INSTANCE.closeQuietly(objectOutputStream0);
            h.INSTANCE.closeQuietly(closeable0);
            return;
        }
        catch(Throwable throwable0) {
        }
        closeable0 = objectOutputStream0;
        h.INSTANCE.closeQuietly(closeable0);
        h.INSTANCE.closeQuietly(closeable1);
        throw throwable0;
    label_36:
        h.INSTANCE.closeQuietly(objectOutputStream0);
        h.INSTANCE.closeQuietly(closeable1);
    }

    public final void writeString(@l File file0, @m String s) {
        L.p(file0, "file");
        if(s == null) {
            return;
        }
        try {
            kotlin.io.m.H(file0, s, f.b);
        }
        catch(IOException iOException0) {
            L.o("h", "TAG");
            p.Companion.e("h", iOException0.getMessage());
        }
    }
}

