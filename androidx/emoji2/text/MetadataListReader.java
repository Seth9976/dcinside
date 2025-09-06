package androidx.emoji2.text;

import android.content.res.AssetManager;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@AnyThread
@RequiresApi(19)
@RestrictTo({Scope.a})
class MetadataListReader {
    static class ByteBufferReader implements OpenTypeReader {
        @NonNull
        private final ByteBuffer c;

        ByteBufferReader(@NonNull ByteBuffer byteBuffer0) {
            this.c = byteBuffer0;
            byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        }

        @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
        public void g(int v) throws IOException {
            this.c.position(this.c.position() + v);
        }

        @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
        public long getPosition() {
            return (long)this.c.position();
        }

        @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
        public int h() throws IOException {
            return this.c.getInt();
        }

        @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
        public long i() throws IOException {
            return MetadataListReader.e(this.c.getInt());
        }

        @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
        public int readUnsignedShort() throws IOException {
            return MetadataListReader.f(this.c.getShort());
        }
    }

    static class InputStreamOpenTypeReader implements OpenTypeReader {
        @NonNull
        private final byte[] c;
        @NonNull
        private final ByteBuffer d;
        @NonNull
        private final InputStream e;
        private long f;

        InputStreamOpenTypeReader(@NonNull InputStream inputStream0) {
            this.f = 0L;
            this.e = inputStream0;
            byte[] arr_b = new byte[4];
            this.c = arr_b;
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
            this.d = byteBuffer0;
            byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        }

        private void a(@IntRange(from = 0L, to = 4L) int v) throws IOException {
            if(this.e.read(this.c, 0, v) != v) {
                throw new IOException("read failed");
            }
            this.f += (long)v;
        }

        @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
        public void g(int v) throws IOException {
            while(v > 0) {
                int v1 = (int)this.e.skip(((long)v));
                if(v1 < 1) {
                    throw new IOException("Skip didn\'t move at least 1 byte forward");
                }
                v -= v1;
                this.f += (long)v1;
            }
        }

        @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
        public long getPosition() {
            return this.f;
        }

        @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
        public int h() throws IOException {
            this.d.position(0);
            this.a(4);
            return this.d.getInt();
        }

        @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
        public long i() throws IOException {
            this.d.position(0);
            this.a(4);
            return MetadataListReader.e(this.d.getInt());
        }

        @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
        public int readUnsignedShort() throws IOException {
            this.d.position(0);
            this.a(2);
            return MetadataListReader.f(this.d.getShort());
        }
    }

    static class OffsetInfo {
        private final long a;
        private final long b;

        OffsetInfo(long v, long v1) {
            this.a = v;
            this.b = v1;
        }

        long a() {
            return this.b;
        }

        long b() {
            return this.a;
        }
    }

    interface OpenTypeReader {
        public static final int a = 2;
        public static final int b = 4;

        void g(int arg1) throws IOException;

        long getPosition();

        int h() throws IOException;

        long i() throws IOException;

        int readUnsignedShort() throws IOException;
    }

    private static final int a = 0x456D6A69;
    private static final int b = 1701669481;
    private static final int c = 0x6D657461;

    private static OffsetInfo a(OpenTypeReader metadataListReader$OpenTypeReader0) throws IOException {
        long v3;
        metadataListReader$OpenTypeReader0.g(4);
        int v = metadataListReader$OpenTypeReader0.readUnsignedShort();
        if(v > 100) {
            throw new IOException("Cannot read metadata.");
        }
        metadataListReader$OpenTypeReader0.g(6);
        int v1 = 0;
        for(int v2 = 0; true; ++v2) {
            v3 = -1L;
            if(v2 >= v) {
                break;
            }
            int v4 = metadataListReader$OpenTypeReader0.h();
            metadataListReader$OpenTypeReader0.g(4);
            v3 = metadataListReader$OpenTypeReader0.i();
            metadataListReader$OpenTypeReader0.g(4);
            if(0x6D657461 == v4) {
                break;
            }
        }
        if(v3 != -1L) {
            metadataListReader$OpenTypeReader0.g(((int)(v3 - metadataListReader$OpenTypeReader0.getPosition())));
            metadataListReader$OpenTypeReader0.g(12);
            long v5 = metadataListReader$OpenTypeReader0.i();
            while(((long)v1) < v5) {
                int v6 = metadataListReader$OpenTypeReader0.h();
                long v7 = metadataListReader$OpenTypeReader0.i();
                long v8 = metadataListReader$OpenTypeReader0.i();
                if(0x456D6A69 != v6 && 1701669481 != v6) {
                    ++v1;
                    continue;
                }
                return new OffsetInfo(v7 + v3, v8);
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static MetadataList b(AssetManager assetManager0, String s) throws IOException {
        try(InputStream inputStream0 = assetManager0.open(s)) {
            return MetadataListReader.c(inputStream0);
        }
    }

    static MetadataList c(InputStream inputStream0) throws IOException {
        InputStreamOpenTypeReader metadataListReader$InputStreamOpenTypeReader0 = new InputStreamOpenTypeReader(inputStream0);
        OffsetInfo metadataListReader$OffsetInfo0 = MetadataListReader.a(metadataListReader$InputStreamOpenTypeReader0);
        metadataListReader$InputStreamOpenTypeReader0.g(((int)(metadataListReader$OffsetInfo0.b() - metadataListReader$InputStreamOpenTypeReader0.getPosition())));
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(((int)metadataListReader$OffsetInfo0.a()));
        int v = inputStream0.read(byteBuffer0.array());
        if(((long)v) != metadataListReader$OffsetInfo0.a()) {
            throw new IOException("Needed " + metadataListReader$OffsetInfo0.a() + " bytes, got " + v);
        }
        return MetadataList.G(byteBuffer0);
    }

    static MetadataList d(ByteBuffer byteBuffer0) throws IOException {
        ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
        byteBuffer1.position(((int)MetadataListReader.a(new ByteBufferReader(byteBuffer1)).b()));
        return MetadataList.G(byteBuffer1);
    }

    static long e(int v) {
        return ((long)v) & 0xFFFFFFFFL;
    }

    static int f(short v) {
        return v & 0xFFFF;
    }
}

