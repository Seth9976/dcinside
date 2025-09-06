package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RequiresApi;
import java.io.File;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(21)
public final class Api21Impl {
    @l
    public static final Api21Impl a;

    static {
        Api21Impl.a = new Api21Impl();
    }

    @l
    public final File a(@l Context context0) {
        L.p(context0, "context");
        File file0 = context0.getNoBackupFilesDir();
        L.o(file0, "context.noBackupFilesDir");
        return file0;
    }
}

