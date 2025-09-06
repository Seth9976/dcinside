package com.google.crypto.tink;

import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;

public interface Q {
    @RequiresApi(24)
    SeekableByteChannel a(SeekableByteChannel arg1, byte[] arg2) throws GeneralSecurityException, IOException;

    OutputStream b(OutputStream arg1, byte[] arg2) throws GeneralSecurityException, IOException;

    ReadableByteChannel c(ReadableByteChannel arg1, byte[] arg2) throws GeneralSecurityException, IOException;

    WritableByteChannel d(WritableByteChannel arg1, byte[] arg2) throws GeneralSecurityException, IOException;

    InputStream e(InputStream arg1, byte[] arg2) throws GeneralSecurityException, IOException;
}

