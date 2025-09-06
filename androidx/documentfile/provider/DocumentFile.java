package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

public abstract class DocumentFile {
    @Nullable
    private final DocumentFile a;
    static final String b = "DocumentFile";

    DocumentFile(@Nullable DocumentFile documentFile0) {
        this.a = documentFile0;
    }

    public abstract boolean a();

    public abstract boolean b();

    @Nullable
    public abstract DocumentFile c(@NonNull String arg1);

    @Nullable
    public abstract DocumentFile d(@NonNull String arg1, @NonNull String arg2);

    public abstract boolean e();

    public abstract boolean f();

    @Nullable
    public DocumentFile g(@NonNull String s) {
        DocumentFile[] arr_documentFile = this.u();
        for(int v = 0; v < arr_documentFile.length; ++v) {
            DocumentFile documentFile0 = arr_documentFile[v];
            if(s.equals(documentFile0.k())) {
                return documentFile0;
            }
        }
        return null;
    }

    @NonNull
    public static DocumentFile h(@NonNull File file0) {
        return new RawDocumentFile(null, file0);
    }

    @Nullable
    public static DocumentFile i(@NonNull Context context0, @NonNull Uri uri0) {
        return new SingleDocumentFile(null, context0, uri0);
    }

    @Nullable
    public static DocumentFile j(@NonNull Context context0, @NonNull Uri uri0) {
        String s = DocumentsContract.getTreeDocumentId(uri0);
        if(DocumentsContract.isDocumentUri(context0, uri0)) {
            s = DocumentsContract.getDocumentId(uri0);
        }
        return new TreeDocumentFile(null, context0, DocumentsContract.buildDocumentUriUsingTree(uri0, s));
    }

    @Nullable
    public abstract String k();

    @Nullable
    public DocumentFile l() {
        return this.a;
    }

    @Nullable
    public abstract String m();

    @NonNull
    public abstract Uri n();

    public abstract boolean o();

    public static boolean p(@NonNull Context context0, @Nullable Uri uri0) {
        return DocumentsContract.isDocumentUri(context0, uri0);
    }

    public abstract boolean q();

    public abstract boolean r();

    public abstract long s();

    public abstract long t();

    @NonNull
    public abstract DocumentFile[] u();

    public abstract boolean v(@NonNull String arg1);
}

