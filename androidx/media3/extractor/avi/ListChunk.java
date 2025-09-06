package androidx.media3.extractor.avi;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import com.google.common.collect.u5;

final class ListChunk implements AviChunk {
    public final O2 a;
    private final int b;

    private ListChunk(int v, O2 o20) {
        this.b = v;
        this.a = o20;
    }

    @Nullable
    private static AviChunk a(int v, int v1, ParsableByteArray parsableByteArray0) {
        switch(v) {
            case 0x66727473: {
                return StreamFormatChunk.d(v1, parsableByteArray0);
            }
            case 1751742049: {
                return AviMainHeaderChunk.b(parsableByteArray0);
            }
            case 0x68727473: {
                return AviStreamHeaderChunk.d(parsableByteArray0);
            }
            case 0x6E727473: {
                return StreamNameChunk.a(parsableByteArray0);
            }
            default: {
                return null;
            }
        }
    }

    @Nullable
    public AviChunk b(Class class0) {
        u5 u50 = this.a.i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            AviChunk aviChunk0 = (AviChunk)object0;
            if(aviChunk0.getClass() == class0) {
                return aviChunk0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public static ListChunk c(int v, ParsableByteArray parsableByteArray0) {
        a o2$a0 = new a();
        int v1 = parsableByteArray0.g();
        int v2 = -2;
        while(parsableByteArray0.a() > 8) {
            int v3 = parsableByteArray0.w();
            int v4 = parsableByteArray0.f() + parsableByteArray0.w();
            parsableByteArray0.X(v4);
            AviChunk aviChunk0 = v3 == 0x5453494C ? ListChunk.c(parsableByteArray0.w(), parsableByteArray0) : ListChunk.a(v3, v2, parsableByteArray0);
            if(aviChunk0 != null) {
                if(aviChunk0.getType() == 0x68727473) {
                    v2 = ((AviStreamHeaderChunk)aviChunk0).c();
                }
                o2$a0.j(aviChunk0);
            }
            parsableByteArray0.Y(v4);
            parsableByteArray0.X(v1);
        }
        return new ListChunk(v, o2$a0.n());
    }

    @Override  // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return this.b;
    }
}

