package androidx.webkit.internal;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public class AssetHelper {
    @NonNull
    private Context a;
    public static final String b = "text/plain";

    public AssetHelper(@NonNull Context context0) {
        this.a = context0;
    }

    @NonNull
    public static String a(@NonNull File file0) throws IOException {
        String s = file0.getCanonicalPath();
        return s.endsWith("/") ? s : s + "/";
    }

    @Nullable
    public static File b(@NonNull File file0, @NonNull String s) throws IOException {
        String s1 = AssetHelper.a(file0);
        String s2 = new File(file0, s).getCanonicalPath();
        return s2.startsWith(s1) ? new File(s2) : null;
    }

    @NonNull
    public static File c(@NonNull Context context0) {
        return Build.VERSION.SDK_INT < 24 ? context0.getCacheDir().getParentFile() : ApiHelperForN.e(context0);
    }

    private int d(@NonNull String s, @NonNull String s1) {
        return this.a.getResources().getIdentifier(s1, s, "com.dcinside.app.android");
    }

    private int e(int v) {
        TypedValue typedValue0 = new TypedValue();
        this.a.getResources().getValue(v, typedValue0, true);
        return typedValue0.type;
    }

    @NonNull
    public static String f(@NonNull String s) {
        String s1 = MimeUtil.a(s);
        return s1 == null ? "text/plain" : s1;
    }

    @NonNull
    private static InputStream g(@NonNull String s, @NonNull InputStream inputStream0) throws IOException {
        return s.endsWith(".svgz") ? new GZIPInputStream(inputStream0) : inputStream0;
    }

    @NonNull
    public InputStream h(@NonNull String s) throws IOException {
        String s1 = AssetHelper.k(s);
        return AssetHelper.g(s1, this.a.getAssets().open(s1, 2));
    }

    @NonNull
    public static InputStream i(@NonNull File file0) throws FileNotFoundException, IOException {
        FileInputStream fileInputStream0 = new FileInputStream(file0);
        return AssetHelper.g(file0.getPath(), fileInputStream0);
    }

    @NonNull
    public InputStream j(@NonNull String s) throws Resources.NotFoundException, IOException {
        String s1 = AssetHelper.k(s);
        String[] arr_s = s1.split("/", -1);
        if(arr_s.length != 2) {
            throw new IllegalArgumentException("Incorrect resource path: " + s1);
        }
        String s2 = arr_s[0];
        String s3 = arr_s[1];
        int v = s3.lastIndexOf(46);
        if(v != -1) {
            s3 = s3.substring(0, v);
        }
        int v1 = this.d(s2, s3);
        int v2 = this.e(v1);
        if(v2 != 3) {
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", s1, v2));
        }
        return AssetHelper.g(s1, this.a.getResources().openRawResource(v1));
    }

    @NonNull
    private static String k(@NonNull String s) {
        return s.length() <= 1 || s.charAt(0) != 0x2F ? s : s.substring(1);
    }
}

