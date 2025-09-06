package androidx.core.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AtomicFile {
    private final File a;
    private final File b;
    private final File c;
    private static final String d = "AtomicFile";

    public AtomicFile(File file0) {
        this.a = file0;
        this.b = new File(file0.getPath() + ".new");
        this.c = new File(file0.getPath() + ".bak");
    }

    public void a() {
        this.a.delete();
        this.b.delete();
        this.c.delete();
    }

    public void b(FileOutputStream fileOutputStream0) {
        if(fileOutputStream0 == null) {
            return;
        }
        if(!AtomicFile.i(fileOutputStream0)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream0.close();
        }
        catch(IOException iOException0) {
            Log.e("AtomicFile", "Failed to close file output stream", iOException0);
        }
        if(!this.b.delete()) {
            Log.e("AtomicFile", "Failed to delete new file " + this.b);
        }
    }

    public void c(FileOutputStream fileOutputStream0) {
        if(fileOutputStream0 == null) {
            return;
        }
        if(!AtomicFile.i(fileOutputStream0)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream0.close();
        }
        catch(IOException iOException0) {
            Log.e("AtomicFile", "Failed to close file output stream", iOException0);
        }
        AtomicFile.g(this.b, this.a);
    }

    public File d() {
        return this.a;
    }

    public FileInputStream e() throws FileNotFoundException {
        if(this.c.exists()) {
            AtomicFile.g(this.c, this.a);
        }
        if(this.b.exists() && this.a.exists() && !this.b.delete()) {
            Log.e("AtomicFile", "Failed to delete outdated new file " + this.b);
        }
        return new FileInputStream(this.a);
    }

    public byte[] f() throws IOException {
        try(FileInputStream fileInputStream0 = this.e()) {
            byte[] arr_b = new byte[fileInputStream0.available()];
            int v = 0;
            int v1;
            while((v1 = fileInputStream0.read(arr_b, v, arr_b.length - v)) > 0) {
                v += v1;
                int v2 = fileInputStream0.available();
                if(v2 <= arr_b.length - v) {
                    continue;
                }
                byte[] arr_b1 = new byte[v2 + v];
                System.arraycopy(arr_b, 0, arr_b1, 0, v);
                arr_b = arr_b1;
            }
            return arr_b;
        }
    }

    private static void g(File file0, File file1) {
        if(file1.isDirectory() && !file1.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file1);
        }
        if(!file0.renameTo(file1)) {
            Log.e("AtomicFile", "Failed to rename " + file0 + " to " + file1);
        }
    }

    public FileOutputStream h() throws IOException {
        if(this.c.exists()) {
            AtomicFile.g(this.c, this.a);
        }
        try {
            return new FileOutputStream(this.b);
        }
        catch(FileNotFoundException unused_ex) {
            if(this.b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.b);
                }
                catch(FileNotFoundException fileNotFoundException0) {
                    throw new IOException("Failed to create new file " + this.b, fileNotFoundException0);
                }
            }
            throw new IOException("Failed to create directory for " + this.b);
        }
    }

    private static boolean i(FileOutputStream fileOutputStream0) {
        try {
            fileOutputStream0.getFD().sync();
            return true;
        }
        catch(IOException unused_ex) {
            return false;
        }
    }
}

