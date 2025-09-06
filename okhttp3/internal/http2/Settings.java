package okhttp3.internal.http2;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class Settings {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public static final int COUNT = 10;
    @l
    public static final Companion Companion = null;
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 0xFFFF;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    @l
    private final int[] values;

    static {
        Settings.Companion = new Companion(null);
    }

    public Settings() {
        this.values = new int[10];
    }

    public final void clear() {
        this.set = 0;
        kotlin.collections.l.T1(this.values, 0, 0, 0, 6, null);
    }

    public final int get(int v) {
        return this.values[v];
    }

    public final boolean getEnablePush(boolean z) {
        return (this.set & 4) == 0 ? z : this.values[2] == 1;
    }

    public final int getHeaderTableSize() {
        return (this.set & 2) == 0 ? -1 : this.values[1];
    }

    public final int getInitialWindowSize() {
        return (this.set & 0x80) == 0 ? 0xFFFF : this.values[7];
    }

    public final int getMaxConcurrentStreams() {
        return (this.set & 16) == 0 ? 0x7FFFFFFF : this.values[4];
    }

    public final int getMaxFrameSize(int v) {
        return (this.set & 0x20) == 0 ? v : this.values[5];
    }

    public final int getMaxHeaderListSize(int v) {
        return (this.set & 0x40) == 0 ? v : this.values[6];
    }

    public final boolean isSet(int v) {
        return (1 << v & this.set) != 0;
    }

    public final void merge(@l Settings settings0) {
        L.p(settings0, "other");
        for(int v = 0; v < 10; ++v) {
            if(settings0.isSet(v)) {
                this.set(v, settings0.get(v));
            }
        }
    }

    @l
    public final Settings set(int v, int v1) {
        if(v >= 0) {
            int[] arr_v = this.values;
            if(v < arr_v.length) {
                this.set |= 1 << v;
                arr_v[v] = v1;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.set);
    }
}

