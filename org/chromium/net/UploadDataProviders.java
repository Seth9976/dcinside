package org.chromium.net;

import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class UploadDataProviders {
    static final class c extends UploadDataProvider {
        private final ByteBuffer a;

        private c(ByteBuffer byteBuffer0) {
            this.a = byteBuffer0;
        }

        c(ByteBuffer byteBuffer0, a uploadDataProviders$a0) {
            this(byteBuffer0);
        }

        @Override  // org.chromium.net.UploadDataProvider
        public long getLength() {
            return (long)this.a.limit();
        }

        @Override  // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink0, ByteBuffer byteBuffer0) {
            if(!byteBuffer0.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            if(byteBuffer0.remaining() >= this.a.remaining()) {
                byteBuffer0.put(this.a);
            }
            else {
                this.a.limit(this.a.position() + byteBuffer0.remaining());
                byteBuffer0.put(this.a);
                this.a.limit(this.a.limit());
            }
            uploadDataSink0.onReadSucceeded(false);
        }

        @Override  // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink0) {
            this.a.position(0);
            uploadDataSink0.onRewindSucceeded();
        }
    }

    interface d {
        FileChannel b() throws IOException;
    }

    static final class e extends UploadDataProvider {
        private volatile FileChannel a;
        private final d b;
        private final Object c;

        private e(d uploadDataProviders$d0) {
            this.c = new Object();
            this.b = uploadDataProviders$d0;
        }

        e(d uploadDataProviders$d0, a uploadDataProviders$a0) {
            this(uploadDataProviders$d0);
        }

        private FileChannel a() throws IOException {
            if(this.a == null) {
                Object object0 = this.c;
                synchronized(object0) {
                    if(this.a == null) {
                        this.a = this.b.b();
                    }
                }
            }
            return this.a;
        }

        @Override  // org.chromium.net.UploadDataProvider
        public void close() throws IOException {
            FileChannel fileChannel0 = this.a;
            if(fileChannel0 != null) {
                fileChannel0.close();
            }
        }

        @Override  // org.chromium.net.UploadDataProvider
        public long getLength() throws IOException {
            return this.a().size();
        }

        @Override  // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink0, ByteBuffer byteBuffer0) throws IOException {
            if(!byteBuffer0.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            FileChannel fileChannel0 = this.a();
            for(int v = 0; v == 0; v = v1) {
                int v1 = fileChannel0.read(byteBuffer0);
                if(v1 == -1) {
                    break;
                }
            }
            uploadDataSink0.onReadSucceeded(false);
        }

        @Override  // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink0) throws IOException {
            this.a().position(0L);
            uploadDataSink0.onRewindSucceeded();
        }
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor0) {
        static final class b implements d {
            final ParcelFileDescriptor a;

            b(ParcelFileDescriptor parcelFileDescriptor0) {
                this.a = parcelFileDescriptor0;
                super();
            }

            @Override  // org.chromium.net.UploadDataProviders$d
            public FileChannel b() throws IOException {
                if(this.a.getStatSize() != -1L) {
                    return new ParcelFileDescriptor.AutoCloseInputStream(this.a).getChannel();
                }
                this.a.close();
                throw new IllegalArgumentException("Not a file: " + this.a);
            }
        }

        return new e(new b(parcelFileDescriptor0), null);
    }

    public static UploadDataProvider create(File file0) {
        static final class a implements d {
            final File a;

            a(File file0) {
                this.a = file0;
                super();
            }

            @Override  // org.chromium.net.UploadDataProviders$d
            public FileChannel b() throws IOException {
                return new FileInputStream(this.a).getChannel();
            }
        }

        return new e(new a(file0), null);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer0) {
        return new c(byteBuffer0.slice(), null);
    }

    public static UploadDataProvider create(byte[] arr_b) {
        return UploadDataProviders.create(arr_b, 0, arr_b.length);
    }

    public static UploadDataProvider create(byte[] arr_b, int v, int v1) {
        return new c(ByteBuffer.wrap(arr_b, v, v1).slice(), null);
    }
}

