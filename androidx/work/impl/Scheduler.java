package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.impl.model.WorkSpec;

@RestrictTo({Scope.b})
public interface Scheduler {
    public static final int s1 = 50;
    public static final int t1 = 200;

    boolean a();

    void b(@NonNull String arg1);

    void c(@NonNull WorkSpec[] arg1);
}

