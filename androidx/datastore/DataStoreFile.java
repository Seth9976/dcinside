package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@i(name = "DataStoreFile")
public final class DataStoreFile {
    @l
    public static final File a(@l Context context0, @l String s) {
        L.p(context0, "<this>");
        L.p(s, "fileName");
        return new File(context0.getApplicationContext().getFilesDir(), "datastore/" + s);
    }
}

