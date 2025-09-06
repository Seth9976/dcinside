package androidx.documentfile.provider;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class RawDocumentFile extends DocumentFile {
    private File c;

    RawDocumentFile(@Nullable DocumentFile documentFile0, File file0) {
        super(documentFile0);
        this.c = file0;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean a() {
        return this.c.canRead();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean b() {
        return this.c.canWrite();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    @Nullable
    public DocumentFile c(String s) {
        File file0 = new File(this.c, s);
        return !file0.isDirectory() && !file0.mkdir() ? null : new RawDocumentFile(this, file0);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    @Nullable
    public DocumentFile d(String s, String s1) {
        String s2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(s);
        if(s2 != null) {
            s1 = s1 + "." + s2;
        }
        File file0 = new File(this.c, s1);
        try {
            file0.createNewFile();
            return new RawDocumentFile(this, file0);
        }
        catch(IOException iOException0) {
            Log.w("DocumentFile", "Failed to createFile: " + iOException0);
            return null;
        }
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean e() {
        RawDocumentFile.w(this.c);
        return this.c.delete();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean f() {
        return this.c.exists();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public String k() {
        return this.c.getName();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.documentfile.provider.DocumentFile
    @Nullable
    public String m() {
        return this.c.isDirectory() ? null : RawDocumentFile.x(this.c.getName());
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public Uri n() {
        return Uri.fromFile(this.c);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean o() {
        return this.c.isDirectory();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean q() {
        return this.c.isFile();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean r() {
        return false;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public long s() {
        return this.c.lastModified();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public long t() {
        return this.c.length();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public DocumentFile[] u() {
        ArrayList arrayList0 = new ArrayList();
        File[] arr_file = this.c.listFiles();
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                arrayList0.add(new RawDocumentFile(this, arr_file[v]));
            }
        }
        return (DocumentFile[])arrayList0.toArray(new DocumentFile[arrayList0.size()]);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean v(String s) {
        File file0 = new File(this.c.getParentFile(), s);
        if(this.c.renameTo(file0)) {
            this.c = file0;
            return true;
        }
        return false;
    }

    private static boolean w(File file0) {
        File[] arr_file = file0.listFiles();
        boolean z = true;
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                if(file1.isDirectory()) {
                    z &= RawDocumentFile.w(file1);
                }
                if(!file1.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file1);
                    z = false;
                }
            }
        }
        return z;
    }

    private static String x(String s) {
        int v = s.lastIndexOf(46);
        if(v >= 0) {
            String s1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s.substring(v + 1).toLowerCase());
            return s1 == null ? "application/octet-stream" : s1;
        }
        return "application/octet-stream";
    }
}

