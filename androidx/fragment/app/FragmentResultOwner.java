package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;

public interface FragmentResultOwner {
    void a(@NonNull String arg1, @NonNull Bundle arg2);

    void b(@NonNull String arg1);

    void c(@NonNull String arg1, @NonNull LifecycleOwner arg2, @NonNull FragmentResultListener arg3);

    void d(@NonNull String arg1);
}

