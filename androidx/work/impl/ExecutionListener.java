package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.impl.model.WorkGenerationalId;

@RestrictTo({Scope.b})
public interface ExecutionListener {
    void d(@NonNull WorkGenerationalId arg1, boolean arg2);
}

