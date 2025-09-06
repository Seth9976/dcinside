package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.DocumentsContract;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;
import java.util.List;

public final class DocumentsContractCompat {
    public static final class DocumentCompat {
        public static final int a = 0x200;

    }

    @RequiresApi(21)
    static class DocumentsContractApi21Impl {
        static Uri a(String s, String s1) {
            return DocumentsContract.buildChildDocumentsUri(s, s1);
        }

        static Uri b(Uri uri0, String s) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri0, s);
        }

        static Uri c(Uri uri0, String s) {
            return DocumentsContract.buildDocumentUriUsingTree(uri0, s);
        }

        public static Uri d(String s, String s1) {
            return DocumentsContract.buildTreeDocumentUri(s, s1);
        }

        static Uri e(ContentResolver contentResolver0, Uri uri0, String s, String s1) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver0, uri0, s, s1);
        }

        static String f(Uri uri0) {
            return DocumentsContract.getTreeDocumentId(uri0);
        }

        static Uri g(ContentResolver contentResolver0, Uri uri0, String s) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver0, uri0, s);
        }
    }

    @RequiresApi(24)
    static class DocumentsContractApi24Impl {
        static boolean a(Uri uri0) {
            return DocumentsContract.isTreeUri(uri0);
        }

        static boolean b(ContentResolver contentResolver0, Uri uri0, Uri uri1) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver0, uri0, uri1);
        }
    }

    private static final String a = "tree";

    public static Uri a(String s, String s1) {
        return DocumentsContractApi21Impl.a(s, s1);
    }

    public static Uri b(Uri uri0, String s) {
        return DocumentsContractApi21Impl.b(uri0, s);
    }

    public static Uri c(String s, String s1) {
        return DocumentsContract.buildDocumentUri(s, s1);
    }

    public static Uri d(Uri uri0, String s) {
        return DocumentsContractApi21Impl.c(uri0, s);
    }

    public static Uri e(String s, String s1) {
        return DocumentsContractApi21Impl.d(s, s1);
    }

    public static Uri f(ContentResolver contentResolver0, Uri uri0, String s, String s1) throws FileNotFoundException {
        return DocumentsContractApi21Impl.e(contentResolver0, uri0, s, s1);
    }

    public static String g(Uri uri0) {
        return DocumentsContract.getDocumentId(uri0);
    }

    public static String h(Uri uri0) {
        return DocumentsContractApi21Impl.f(uri0);
    }

    public static boolean i(Context context0, Uri uri0) {
        return DocumentsContract.isDocumentUri(context0, uri0);
    }

    public static boolean j(Uri uri0) {
        if(Build.VERSION.SDK_INT < 24) {
            List list0 = uri0.getPathSegments();
            return list0.size() >= 2 && "tree".equals(list0.get(0));
        }
        return DocumentsContractApi24Impl.a(uri0);
    }

    public static boolean k(ContentResolver contentResolver0, Uri uri0, Uri uri1) throws FileNotFoundException {
        return Build.VERSION.SDK_INT < 24 ? DocumentsContract.deleteDocument(contentResolver0, uri0) : DocumentsContractApi24Impl.b(contentResolver0, uri0, uri1);
    }

    public static Uri l(ContentResolver contentResolver0, Uri uri0, String s) throws FileNotFoundException {
        return DocumentsContractApi21Impl.g(contentResolver0, uri0, s);
    }
}

