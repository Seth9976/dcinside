package com.bumptech.glide.request;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.request.target.p;

public interface h {
    boolean onLoadFailed(@Nullable q arg1, @Nullable Object arg2, @NonNull p arg3, boolean arg4);

    boolean onResourceReady(@NonNull Object arg1, @NonNull Object arg2, p arg3, @NonNull a arg4, boolean arg5);
}

