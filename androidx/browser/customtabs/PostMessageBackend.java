package androidx.browser.customtabs;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.a})
public interface PostMessageBackend {
    boolean a(@Nullable Bundle arg1);

    void b(@NonNull Context arg1);

    boolean d(@NonNull String arg1, @Nullable Bundle arg2);
}

