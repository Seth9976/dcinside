package androidx.media3.extractor.text;

import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface SubtitleParser {
    public interface Factory {
        public static final Factory a;

        static {
            Factory.a = new Factory() {
                @Override  // androidx.media3.extractor.text.SubtitleParser$Factory
                public boolean a(Format format0) {
                    return false;
                }

                @Override  // androidx.media3.extractor.text.SubtitleParser$Factory
                public int b(Format format0) {
                    return 1;
                }

                @Override  // androidx.media3.extractor.text.SubtitleParser$Factory
                public SubtitleParser c(Format format0) {
                    throw new IllegalStateException("This SubtitleParser.Factory doesn\'t support any formats.");
                }
            };
        }

        boolean a(Format arg1);

        int b(Format arg1);

        SubtitleParser c(Format arg1);
    }

    public static class OutputOptions {
        public final long a;
        public final boolean b;
        private static final OutputOptions c;

        static {
            OutputOptions.c = new OutputOptions(0x8000000000000001L, false);
        }

        private OutputOptions(long v, boolean z) {
            this.a = v;
            this.b = z;
        }

        public static OutputOptions b() {
            return OutputOptions.c;
        }

        public static OutputOptions c(long v) {
            return new OutputOptions(v, true);
        }

        public static OutputOptions d(long v) {
            return new OutputOptions(v, false);
        }
    }

    void a(byte[] arg1, int arg2, int arg3, OutputOptions arg4, Consumer arg5);

    int b();

    void c(byte[] arg1, OutputOptions arg2, Consumer arg3);

    Subtitle d(byte[] arg1, int arg2, int arg3);

    void reset();
}

