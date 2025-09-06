package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import java.io.EOFException;
import java.io.IOException;
import w4.d;

@UnstableApi
public final class ExtractorUtil {
    @d
    public static void a(boolean z, @Nullable String s) throws ParserException {
        if(!z) {
            throw ParserException.a(s, null);
        }
    }

    public static boolean b(ExtractorInput extractorInput0, byte[] arr_b, int v, int v1, boolean z) throws IOException {
        try {
            return extractorInput0.n(arr_b, v, v1, z);
        }
        catch(EOFException eOFException0) {
            if(!z) {
                throw eOFException0;
            }
            return false;
        }
    }

    public static int c(ExtractorInput extractorInput0, byte[] arr_b, int v, int v1) throws IOException {
        int v2;
        for(v2 = 0; v2 < v1; v2 += v3) {
            int v3 = extractorInput0.i(arr_b, v + v2, v1 - v2);
            if(v3 == -1) {
                break;
            }
        }
        return v2;
    }

    public static boolean d(ExtractorInput extractorInput0, byte[] arr_b, int v, int v1) throws IOException {
        try {
            extractorInput0.readFully(arr_b, v, v1);
            return true;
        }
        catch(EOFException unused_ex) {
            return false;
        }
    }

    public static boolean e(ExtractorInput extractorInput0, int v) throws IOException {
        try {
            extractorInput0.r(v);
            return true;
        }
        catch(EOFException unused_ex) {
            return false;
        }
    }
}

