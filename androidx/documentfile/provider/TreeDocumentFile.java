package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

@RequiresApi(21)
class TreeDocumentFile extends DocumentFile {
    private Context c;
    private Uri d;

    TreeDocumentFile(@Nullable DocumentFile documentFile0, Context context0, Uri uri0) {
        super(documentFile0);
        this.c = context0;
        this.d = uri0;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean a() {
        return DocumentsContractApi19.a(this.c, this.d);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean b() {
        return DocumentsContractApi19.b(this.c, this.d);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    @Nullable
    public DocumentFile c(String s) {
        Uri uri0 = TreeDocumentFile.x(this.c, this.d, "vnd.android.document/directory", s);
        return uri0 != null ? new TreeDocumentFile(this, this.c, uri0) : null;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    @Nullable
    public DocumentFile d(String s, String s1) {
        Uri uri0 = TreeDocumentFile.x(this.c, this.d, s, s1);
        return uri0 != null ? new TreeDocumentFile(this, this.c, uri0) : null;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.c.getContentResolver(), this.d);
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean f() {
        return DocumentsContractApi19.d(this.c, this.d);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    @Nullable
    public String k() {
        return DocumentsContractApi19.f(this.c, this.d);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    @Nullable
    public String m() {
        return DocumentsContractApi19.h(this.c, this.d);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public Uri n() {
        return this.d;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean o() {
        return DocumentsContractApi19.i(this.c, this.d);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean q() {
        return DocumentsContractApi19.j(this.c, this.d);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean r() {
        return DocumentsContractApi19.k(this.c, this.d);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public long s() {
        return DocumentsContractApi19.l(this.c, this.d);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public long t() {
        return DocumentsContractApi19.m(this.c, this.d);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public DocumentFile[] u() {
        ContentResolver contentResolver0 = this.c.getContentResolver();
        Uri uri0 = DocumentsContract.buildChildDocumentsUriUsingTree(this.d, DocumentsContract.getDocumentId(this.d));
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = contentResolver0.query(uri0, new String[]{"document_id"}, null, null, null);
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(0);
                arrayList0.add(DocumentsContract.buildDocumentUriUsingTree(this.d, s));
            }
        }
        catch(Exception exception0) {
            Log.w("DocumentFile", "Failed query: " + exception0);
        }
        finally {
            TreeDocumentFile.w(cursor0);
        }
        Uri[] arr_uri = (Uri[])arrayList0.toArray(new Uri[arrayList0.size()]);
        DocumentFile[] arr_documentFile = new DocumentFile[arr_uri.length];
        for(int v = 0; v < arr_uri.length; ++v) {
            arr_documentFile[v] = new TreeDocumentFile(this, this.c, arr_uri[v]);
        }
        return arr_documentFile;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean v(String s) {
        try {
            Uri uri0 = DocumentsContract.renameDocument(this.c.getContentResolver(), this.d, s);
            if(uri0 != null) {
                this.d = uri0;
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    private static void w(@Nullable AutoCloseable autoCloseable0) {
        if(autoCloseable0 != null) {
            try {
                autoCloseable0.close();
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Exception unused_ex) {
                return;
            }
            throw runtimeException0;
        }
    }

    @Nullable
    private static Uri x(Context context0, Uri uri0, String s, String s1) {
        try {
            return DocumentsContract.createDocument(context0.getContentResolver(), uri0, s, s1);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

