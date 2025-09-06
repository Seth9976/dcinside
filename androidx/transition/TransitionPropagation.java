package androidx.transition;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class TransitionPropagation {
    public abstract void a(@NonNull TransitionValues arg1);

    @SuppressLint({"NullableCollection"})
    @Nullable
    public abstract String[] b();

    public abstract long c(@NonNull ViewGroup arg1, @NonNull Transition arg2, @Nullable TransitionValues arg3, @Nullable TransitionValues arg4);
}

