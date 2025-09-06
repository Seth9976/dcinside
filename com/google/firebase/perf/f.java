package com.google.firebase.perf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

public interface f {
    public static final int A2 = 5;
    public static final int B2 = 40;
    public static final int C2 = 100;
    public static final int D2 = 100;

    @Nullable
    String getAttribute(@NonNull String arg1);

    @NonNull
    Map getAttributes();

    void putAttribute(@NonNull String arg1, @NonNull String arg2);

    void removeAttribute(@NonNull String arg1);
}

