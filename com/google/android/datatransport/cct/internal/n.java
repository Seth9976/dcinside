package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import c2.a;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.json.e;
import java.util.List;

@a
@AutoValue
public abstract class n {
    @NonNull
    public static n a(@NonNull List list0) {
        return new d(list0);
    }

    @NonNull
    public static com.google.firebase.encoders.a b() {
        return new e().k(b.b).l(true).j();
    }

    @NonNull
    @c2.a.a(name = "logRequest")
    public abstract List c();
}

