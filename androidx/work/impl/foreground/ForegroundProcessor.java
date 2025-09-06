package androidx.work.impl.foreground;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;

@RestrictTo({Scope.b})
public interface ForegroundProcessor {
    void a(@NonNull String arg1, @NonNull ForegroundInfo arg2);
}

