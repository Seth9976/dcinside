package com.google.crypto.tink.streamingaead;

import androidx.annotation.RequiresApi;
import com.google.crypto.tink.G;
import com.google.crypto.tink.Q;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;

final class n implements Q {
    G a;

    public n(G g0) throws GeneralSecurityException {
        if(g0.f() == null) {
            throw new GeneralSecurityException("Missing primary primitive.");
        }
        this.a = g0;
    }

    @Override  // com.google.crypto.tink.Q
    @RequiresApi(24)
    public SeekableByteChannel a(SeekableByteChannel seekableByteChannel0, byte[] arr_b) throws GeneralSecurityException, IOException {
        return new k(this.a, seekableByteChannel0, arr_b);
    }

    @Override  // com.google.crypto.tink.Q
    public OutputStream b(OutputStream outputStream0, byte[] arr_b) throws GeneralSecurityException, IOException {
        return ((Q)this.a.f().h()).b(outputStream0, arr_b);
    }

    @Override  // com.google.crypto.tink.Q
    public ReadableByteChannel c(ReadableByteChannel readableByteChannel0, byte[] arr_b) throws GeneralSecurityException, IOException {
        return new d(this.a, readableByteChannel0, arr_b);
    }

    @Override  // com.google.crypto.tink.Q
    public WritableByteChannel d(WritableByteChannel writableByteChannel0, byte[] arr_b) throws GeneralSecurityException, IOException {
        return ((Q)this.a.f().h()).d(writableByteChannel0, arr_b);
    }

    @Override  // com.google.crypto.tink.Q
    public InputStream e(InputStream inputStream0, byte[] arr_b) throws GeneralSecurityException, IOException {
        return new c(this.a, inputStream0, arr_b);
    }
}

