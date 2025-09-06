package androidx.browser.trusted;

import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;

public final class Token {
    @NonNull
    private final TokenContents a;
    private static final String b = "Token";

    private Token(@NonNull TokenContents tokenContents0) {
        this.a = tokenContents0;
    }

    @Nullable
    public static Token a(@NonNull String s, @NonNull PackageManager packageManager0) {
        List list0 = PackageIdentityUtils.b(s, packageManager0);
        if(list0 == null) {
            return null;
        }
        try {
            return new Token(TokenContents.c(s, list0));
        }
        catch(IOException iOException0) {
            Log.e("Token", "Exception when creating token.", iOException0);
            return null;
        }
    }

    @NonNull
    public static Token b(@NonNull byte[] arr_b) {
        return new Token(TokenContents.e(arr_b));
    }

    public boolean c(@NonNull String s, @NonNull PackageManager packageManager0) {
        return PackageIdentityUtils.d(s, packageManager0, this.a);
    }

    @NonNull
    public byte[] d() {
        return this.a.j();
    }
}

