package androidx.security.crypto;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.crypto.tink.Q;
import com.google.crypto.tink.integration.android.a.b;
import com.google.crypto.tink.integration.android.a;
import com.google.crypto.tink.streamingaead.l;
import com.google.crypto.tink.t;
import com.google.crypto.tink.u;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

public final class EncryptedFile {
    public static final class Builder {
        File a;
        final FileEncryptionScheme b;
        final Context c;
        final String d;
        String e;
        String f;
        private static final Object g;

        static {
            Builder.g = new Object();
        }

        @SuppressLint({"StreamFiles"})
        public Builder(@NonNull Context context0, @NonNull File file0, @NonNull MasterKey masterKey0, @NonNull FileEncryptionScheme encryptedFile$FileEncryptionScheme0) {
            this.e = "__androidx_security_crypto_encrypted_file_pref__";
            this.f = "__androidx_security_crypto_encrypted_file_keyset__";
            this.a = file0;
            this.b = encryptedFile$FileEncryptionScheme0;
            this.c = context0.getApplicationContext();
            this.d = masterKey0.b();
        }

        @Deprecated
        public Builder(@NonNull File file0, @NonNull Context context0, @NonNull String s, @NonNull FileEncryptionScheme encryptedFile$FileEncryptionScheme0) {
            this.e = "__androidx_security_crypto_encrypted_file_pref__";
            this.f = "__androidx_security_crypto_encrypted_file_keyset__";
            this.a = file0;
            this.b = encryptedFile$FileEncryptionScheme0;
            this.c = context0.getApplicationContext();
            this.d = s;
        }

        @NonNull
        public EncryptedFile a() throws GeneralSecurityException, IOException {
            a a0;
            l.b();
            b a$b0 = new b().m(this.b.b()).p(this.c, this.f, this.e).o("android-keystore://" + this.d);
            synchronized(Builder.g) {
                a0 = a$b0.f();
            }
            Q q0 = (Q)a0.l().y(Q.class);
            return new EncryptedFile(this.a, this.f, q0, this.c);
        }

        @NonNull
        public Builder b(@NonNull String s) {
            this.f = s;
            return this;
        }

        @NonNull
        public Builder c(@NonNull String s) {
            this.e = s;
            return this;
        }
    }

    static final class EncryptedFileInputStream extends FileInputStream {
        private final InputStream a;
        private final Object b;

        EncryptedFileInputStream(FileDescriptor fileDescriptor0, InputStream inputStream0) {
            super(fileDescriptor0);
            this.b = new Object();
            this.a = inputStream0;
        }

        @Override
        public int available() throws IOException {
            return this.a.available();
        }

        @Override
        public void close() throws IOException {
            this.a.close();
        }

        @Override
        public FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override
        public void mark(int v) {
            synchronized(this.b) {
                this.a.mark(v);
            }
        }

        @Override
        public boolean markSupported() {
            return this.a.markSupported();
        }

        @Override
        public int read() throws IOException {
            return this.a.read();
        }

        @Override
        public int read(@NonNull byte[] arr_b) throws IOException {
            return this.a.read(arr_b);
        }

        @Override
        public int read(@NonNull byte[] arr_b, int v, int v1) throws IOException {
            return this.a.read(arr_b, v, v1);
        }

        @Override
        public void reset() throws IOException {
            synchronized(this.b) {
                this.a.reset();
            }
        }

        @Override
        public long skip(long v) throws IOException {
            return this.a.skip(v);
        }
    }

    static final class EncryptedFileOutputStream extends FileOutputStream {
        private final OutputStream a;

        EncryptedFileOutputStream(FileDescriptor fileDescriptor0, OutputStream outputStream0) {
            super(fileDescriptor0);
            this.a = outputStream0;
        }

        @Override
        public void close() throws IOException {
            this.a.close();
        }

        @Override
        public void flush() throws IOException {
            this.a.flush();
        }

        @Override
        @NonNull
        public FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override
        public void write(int v) throws IOException {
            this.a.write(v);
        }

        @Override
        public void write(@NonNull byte[] arr_b) throws IOException {
            this.a.write(arr_b);
        }

        @Override
        public void write(@NonNull byte[] arr_b, int v, int v1) throws IOException {
            this.a.write(arr_b, v, v1);
        }
    }

    public static enum FileEncryptionScheme {
        AES256_GCM_HKDF_4KB("AES256_GCM_HKDF_4KB");

        private final String a;

        private FileEncryptionScheme(String s1) {
            this.a = s1;
        }

        private static FileEncryptionScheme[] a() [...] // Inlined contents

        t b() throws GeneralSecurityException {
            return u.a(this.a);
        }
    }

    final File a;
    final Context b;
    final String c;
    final Q d;
    private static final String e = "__androidx_security_crypto_encrypted_file_pref__";
    private static final String f = "__androidx_security_crypto_encrypted_file_keyset__";

    EncryptedFile(@NonNull File file0, @NonNull String s, @NonNull Q q0, @NonNull Context context0) {
        this.a = file0;
        this.b = context0;
        this.c = s;
        this.d = q0;
    }

    @NonNull
    public FileInputStream a() throws GeneralSecurityException, IOException, FileNotFoundException {
        if(!this.a.exists()) {
            throw new FileNotFoundException("file doesn\'t exist: " + this.a.getName());
        }
        FileInputStream fileInputStream0 = new FileInputStream(this.a);
        byte[] arr_b = this.a.getName().getBytes(StandardCharsets.UTF_8);
        InputStream inputStream0 = this.d.e(fileInputStream0, arr_b);
        return new EncryptedFileInputStream(fileInputStream0.getFD(), inputStream0);
    }

    @NonNull
    public FileOutputStream b() throws GeneralSecurityException, IOException {
        if(this.a.exists()) {
            throw new IOException("output file already exists, please use a new file: " + this.a.getName());
        }
        FileOutputStream fileOutputStream0 = new FileOutputStream(this.a);
        byte[] arr_b = this.a.getName().getBytes(StandardCharsets.UTF_8);
        OutputStream outputStream0 = this.d.b(fileOutputStream0, arr_b);
        return new EncryptedFileOutputStream(fileOutputStream0.getFD(), outputStream0);
    }
}

