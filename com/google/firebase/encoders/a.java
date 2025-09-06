package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Writer;

public interface a {
    void a(@NonNull Object arg1, @NonNull Writer arg2) throws IOException;

    @NonNull
    String b(@NonNull Object arg1);
}

