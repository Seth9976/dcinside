package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import j..util.DesugarCollections;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

@UnstableApi
public interface TsPayloadReader {
    public static final class DvbSubtitleInfo {
        public final String a;
        public final int b;
        public final byte[] c;

        public DvbSubtitleInfo(String s, int v, byte[] arr_b) {
            this.a = s;
            this.b = v;
            this.c = arr_b;
        }
    }

    public static final class EsInfo {
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @Target({ElementType.TYPE_USE})
        public @interface AudioType {
        }

        public final int a;
        @Nullable
        public final String b;
        public final int c;
        public final List d;
        public final byte[] e;
        public static final int f = 0;
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;

        public EsInfo(int v, @Nullable String s, int v1, @Nullable List list0, byte[] arr_b) {
            this.a = v;
            this.b = s;
            this.c = v1;
            this.d = list0 == null ? Collections.emptyList() : DesugarCollections.unmodifiableList(list0);
            this.e = arr_b;
        }

        public int a() {
            switch(this.c) {
                case 2: {
                    return 0x800;
                }
                case 3: {
                    return 0x200;
                }
                default: {
                    return 0;
                }
            }
        }
    }

    public interface Factory {
        @Nullable
        TsPayloadReader a(int arg1, EsInfo arg2);

        SparseArray b();
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Flags {
    }

    public static final class TrackIdGenerator {
        private final String a;
        private final int b;
        private final int c;
        private int d;
        private String e;
        private static final int f = 0x80000000;

        public TrackIdGenerator(int v, int v1) {
            this(0x80000000, v, v1);
        }

        public TrackIdGenerator(int v, int v1, int v2) {
            this.a = v == 0x80000000 ? "" : v + "/";
            this.b = v1;
            this.c = v2;
            this.d = 0x80000000;
            this.e = "";
        }

        public void a() {
            this.d = this.d == 0x80000000 ? this.b : this.d + this.c;
            this.e = this.a + this.d;
        }

        public String b() {
            this.d();
            return this.e;
        }

        public int c() {
            this.d();
            return this.d;
        }

        private void d() {
            if(this.d == 0x80000000) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;

    void a(ParsableByteArray arg1, int arg2) throws ParserException;

    void b();

    void c(TimestampAdjuster arg1, ExtractorOutput arg2, TrackIdGenerator arg3);
}

