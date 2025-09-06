package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

@UnstableApi
public interface TrackOutput {
    public static final class CryptoData {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;

        public CryptoData(int v, byte[] arr_b, int v1, int v2) {
            this.a = v;
            this.b = arr_b;
            this.c = v1;
            this.d = v2;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return CryptoData.class == class0 && (this.a == ((CryptoData)object0).a && this.c == ((CryptoData)object0).c && this.d == ((CryptoData)object0).d && Arrays.equals(this.b, ((CryptoData)object0).b));
            }
            return false;
        }

        @Override
        public int hashCode() {
            int v = Arrays.hashCode(this.b);
            return ((this.a * 0x1F + v) * 0x1F + this.c) * 0x1F + this.d;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface SampleDataPart {
    }

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    void a(ParsableByteArray arg1, int arg2, int arg3);

    void b(ParsableByteArray arg1, int arg2);

    int c(DataReader arg1, int arg2, boolean arg3, int arg4) throws IOException;

    void d(Format arg1);

    int e(DataReader arg1, int arg2, boolean arg3) throws IOException;

    void f(long arg1, int arg2, int arg3, int arg4, @Nullable CryptoData arg5);
}

