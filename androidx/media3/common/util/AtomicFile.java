package androidx.media3.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@UnstableApi
public final class AtomicFile {
    static final class AtomicFileOutputStream extends OutputStream {
        private final FileOutputStream a;
        private boolean b;

        public AtomicFileOutputStream(File file0) throws FileNotFoundException {
            this.b = false;
            this.a = new FileOutputStream(file0);
        }

        @Override
        public void close() throws IOException {
            if(this.b) {
                return;
            }
            this.b = true;
            this.flush();
            try {
                this.a.getFD().sync();
            }
            catch(IOException iOException0) {
                Log.o("AtomicFile", "Failed to sync file descriptor:", iOException0);
            }
            this.a.close();
        }

        @Override
        public void flush() throws IOException {
            this.a.flush();
        }

        @Override
        public void write(int v) throws IOException {
            this.a.write(v);
        }

        @Override
        public void write(byte[] arr_b) throws IOException {
            this.a.write(arr_b);
        }

        @Override
        public void write(byte[] arr_b, int v, int v1) throws IOException {
            this.a.write(arr_b, v, v1);
        }
    }

    private final File a;
    private final File b;
    private static final String c = "AtomicFile";

    public AtomicFile(File file0) {
        this.a = file0;
        this.b = new File(file0.getPath() + ".bak");
    }

    public void a() {
        this.a.delete();
        this.b.delete();
    }

    public void b(OutputStream outputStream0) throws IOException {
        outputStream0.close();
        this.b.delete();
    }

    // 去混淆评级： 低(20)
    public boolean c() {
        return this.a.exists() || this.b.exists();
    }

    public InputStream d() throws FileNotFoundException {
        this.e();
        return new FileInputStream(this.a);
    }

    private void e() {
        if(this.b.exists()) {
            this.a.delete();
            this.b.renameTo(this.a);
        }
    }

    public OutputStream f() throws IOException {
        if(this.a.exists()) {
            if(this.b.exists()) {
                this.a.delete();
            }
            else if(!this.a.renameTo(this.b)) {
                Log.n("AtomicFile", "Couldn\'t rename file " + this.a + " to backup file " + this.b);
            }
        }
        try {
            return new AtomicFileOutputStream(this.a);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            File file0 = this.a.getParentFile();
            if(file0 != null && file0.mkdirs()) {
                try {
                    return new AtomicFileOutputStream(this.a);
                }
                catch(FileNotFoundException fileNotFoundException1) {
                    throw new IOException("Couldn\'t create " + this.a, fileNotFoundException1);
                }
            }
            throw new IOException("Couldn\'t create " + this.a, fileNotFoundException0);
        }
    }
}

