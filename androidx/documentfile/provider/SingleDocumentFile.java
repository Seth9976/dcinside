package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class SingleDocumentFile extends DocumentFile {
    private Context c;
    private Uri d;

    SingleDocumentFile(@Nullable DocumentFile documentFile0, Context context0, Uri uri0) {
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
    public DocumentFile c(String s) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public DocumentFile d(String s, String s1) {
        throw new UnsupportedOperationException();
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
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public boolean v(String s) {
        throw new UnsupportedOperationException();
    }
}

