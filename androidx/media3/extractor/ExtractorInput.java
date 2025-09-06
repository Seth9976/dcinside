package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
public interface ExtractorInput extends DataReader {
    boolean d(int arg1, boolean arg2) throws IOException;

    boolean e(byte[] arg1, int arg2, int arg3, boolean arg4) throws IOException;

    int g(int arg1) throws IOException;

    long getLength();

    long getPosition();

    void h(long arg1, Throwable arg2) throws Throwable;

    int i(byte[] arg1, int arg2, int arg3) throws IOException;

    void k(byte[] arg1, int arg2, int arg3) throws IOException;

    boolean n(byte[] arg1, int arg2, int arg3, boolean arg4) throws IOException;

    void o();

    long p();

    void q(int arg1) throws IOException;

    void r(int arg1) throws IOException;

    @Override  // androidx.media3.common.DataReader
    int read(byte[] arg1, int arg2, int arg3) throws IOException;

    void readFully(byte[] arg1, int arg2, int arg3) throws IOException;

    boolean s(int arg1, boolean arg2) throws IOException;
}

