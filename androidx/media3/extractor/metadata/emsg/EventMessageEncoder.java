package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.util.UnstableApi;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

@UnstableApi
public final class EventMessageEncoder {
    private final ByteArrayOutputStream a;
    private final DataOutputStream b;

    public EventMessageEncoder() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0x200);
        this.a = byteArrayOutputStream0;
        this.b = new DataOutputStream(byteArrayOutputStream0);
    }

    public byte[] a(EventMessage eventMessage0) {
        this.a.reset();
        try {
            EventMessageEncoder.b(this.b, eventMessage0.a);
            EventMessageEncoder.b(this.b, (eventMessage0.b == null ? "" : eventMessage0.b));
            this.b.writeLong(eventMessage0.c);
            this.b.writeLong(eventMessage0.d);
            this.b.write(eventMessage0.e);
            this.b.flush();
            return this.a.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    private static void b(DataOutputStream dataOutputStream0, String s) throws IOException {
        dataOutputStream0.writeBytes(s);
        dataOutputStream0.writeByte(0);
    }
}

