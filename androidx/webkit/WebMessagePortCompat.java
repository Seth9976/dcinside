package androidx.webkit;

import android.os.Handler;
import android.webkit.WebMessagePort;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationHandler;

public abstract class WebMessagePortCompat {
    public static abstract class WebMessageCallbackCompat {
        public void a(@NonNull WebMessagePortCompat webMessagePortCompat0, @Nullable WebMessageCompat webMessageCompat0) {
        }
    }

    public abstract void a();

    @NonNull
    @RequiresApi(23)
    @RestrictTo({Scope.a})
    public abstract WebMessagePort b();

    @NonNull
    @RestrictTo({Scope.a})
    public abstract InvocationHandler c();

    public abstract void d(@NonNull WebMessageCompat arg1);

    public abstract void e(@Nullable Handler arg1, @NonNull WebMessageCallbackCompat arg2);

    public abstract void f(@NonNull WebMessageCallbackCompat arg1);
}

