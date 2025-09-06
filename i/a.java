package I;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;

@s0({"SMAP\nGetFilePathFromUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetFilePathFromUri.kt\ncom/canhub/cropper/utils/GetFilePathFromUriKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public final class a {
    private static final void a(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        byte[] arr_b = new byte[0x2000];
        int v;
        while((v = inputStream0.read(arr_b)) > 0) {
            outputStream0.write(arr_b, 0, v);
        }
    }

    private static final String b(Context context0, Uri uri0) {
        if(L.g(uri0.getScheme(), "content")) {
            return MimeTypeMap.getSingleton().getExtensionFromMimeType(context0.getContentResolver().getType(uri0));
        }
        String s = uri0.getPath();
        return s == null ? null : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(s)).toString());
    }

    private static final File c(Context context0, Uri uri0, boolean z) {
        FileOutputStream fileOutputStream0;
        String s = a.b(context0, uri0);
        String s1 = "";
        if(s == null) {
            s = "";
        }
        String s2 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        if(z) {
            s1 = s2;
        }
        File file0 = new File(context0.getCacheDir(), "temp_file_" + s1 + "." + s);
        file0.createNewFile();
        InputStream inputStream0 = null;
        try {
            try {
                fileOutputStream0 = null;
                fileOutputStream0 = new FileOutputStream(file0);
                inputStream0 = context0.getContentResolver().openInputStream(uri0);
                if(inputStream0 != null) {
                    a.a(inputStream0, fileOutputStream0);
                }
                fileOutputStream0.flush();
                goto label_30;
            }
            catch(Exception exception0) {
            }
            exception0.printStackTrace();
            if(inputStream0 != null) {
                goto label_22;
            }
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
    label_22:
        inputStream0.close();
    label_23:
        if(fileOutputStream0 == null) {
            return file0;
        label_25:
            if(inputStream0 != null) {
                inputStream0.close();
            }
            if(fileOutputStream0 != null) {
                fileOutputStream0.close();
            }
            throw throwable0;
        label_30:
            if(inputStream0 != null) {
                inputStream0.close();
            }
        }
        fileOutputStream0.close();
        return file0;
    }

    @l
    public static final String d(@l Context context0, @l Uri uri0, boolean z) {
        String s1;
        L.p(context0, "context");
        L.p(uri0, "uri");
        String s = uri0.getPath();
        if(s != null && v.W2(s, "file://", false, 2, null)) {
            s1 = uri0.getPath();
            L.m(s1);
            return s1;
        }
        s1 = a.c(context0, uri0, z).getPath();
        L.m(s1);
        return s1;
    }
}

