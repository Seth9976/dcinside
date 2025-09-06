package androidx.room.util;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@RestrictTo({Scope.c})
@s0({"SMAP\nFileUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUtil.kt\nandroidx/room/util/FileUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
@i(name = "FileUtil")
public final class FileUtil {
    @SuppressLint({"LambdaLast"})
    public static final void a(@l ReadableByteChannel readableByteChannel0, @l FileChannel fileChannel0) throws IOException {
        L.p(readableByteChannel0, "input");
        L.p(fileChannel0, "output");
        try {
            if(Build.VERSION.SDK_INT > 23) {
                fileChannel0.transferFrom(readableByteChannel0, 0L, 0x7FFFFFFFFFFFFFFFL);
            }
            else {
                InputStream inputStream0 = Channels.newInputStream(readableByteChannel0);
                OutputStream outputStream0 = Channels.newOutputStream(fileChannel0);
                byte[] arr_b = new byte[0x1000];
                int v1;
                while((v1 = inputStream0.read(arr_b)) > 0) {
                    outputStream0.write(arr_b, 0, v1);
                }
            }
            fileChannel0.force(false);
        }
        finally {
            readableByteChannel0.close();
            fileChannel0.close();
        }
    }
}

