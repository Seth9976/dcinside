package androidx.core.net;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uri.kt\nandroidx/core/net/UriKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class UriKt {
    @l
    public static final File a(@l Uri uri0) {
        if(!L.g(uri0.getScheme(), "file")) {
            throw new IllegalArgumentException(("Uri lacks \'file\' scheme: " + uri0).toString());
        }
        String s = uri0.getPath();
        if(s == null) {
            throw new IllegalArgumentException(("Uri path is null: " + uri0).toString());
        }
        return new File(s);
    }

    @l
    public static final Uri b(@l File file0) {
        return Uri.fromFile(file0);
    }

    @l
    public static final Uri c(@l String s) {
        return Uri.parse(s);
    }
}

