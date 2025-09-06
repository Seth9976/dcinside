package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O2;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
public final class DefaultTsPayloadReaderFactory implements Factory {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Flags {
    }

    private final int a;
    private final List b;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 8;
    public static final int g = 16;
    public static final int h = 0x20;
    public static final int i = 0x40;
    private static final int j = 0x86;

    public DefaultTsPayloadReaderFactory() {
        this(0);
    }

    public DefaultTsPayloadReaderFactory(int v) {
        this(v, O2.A());
    }

    public DefaultTsPayloadReaderFactory(int v, List list0) {
        this.a = v;
        this.b = list0;
    }

    @Override  // androidx.media3.extractor.ts.TsPayloadReader$Factory
    @Nullable
    public TsPayloadReader a(int v, EsInfo tsPayloadReader$EsInfo0) {
        switch(v) {
            case 3: 
            case 4: {
                int v1 = tsPayloadReader$EsInfo0.a();
                return new PesReader(new MpegAudioReader(tsPayloadReader$EsInfo0.b, v1));
            }
            case 15: {
                if(!this.f(2)) {
                    int v2 = tsPayloadReader$EsInfo0.a();
                    return new PesReader(new AdtsReader(false, tsPayloadReader$EsInfo0.b, v2));
                }
                return null;
            }
            case 16: {
                return new PesReader(new H263Reader(this.d(tsPayloadReader$EsInfo0)));
            }
            case 17: {
                if(!this.f(2)) {
                    int v3 = tsPayloadReader$EsInfo0.a();
                    return new PesReader(new LatmReader(tsPayloadReader$EsInfo0.b, v3));
                }
                return null;
            }
            case 21: {
                return new PesReader(new Id3Reader());
            }
            case 27: {
                return !this.f(4) ? new PesReader(new H264Reader(this.c(tsPayloadReader$EsInfo0), this.f(1), this.f(8))) : null;
            }
            case 36: {
                return new PesReader(new H265Reader(this.c(tsPayloadReader$EsInfo0)));
            }
            case 45: {
                return new PesReader(new MpeghReader());
            }
            case 89: {
                return new PesReader(new DvbSubtitleReader(tsPayloadReader$EsInfo0.d));
            }
            case 2: 
            case 0x80: {
                return new PesReader(new H262Reader(this.d(tsPayloadReader$EsInfo0)));
            }
            case 130: {
                if(!this.f(0x40)) {
                    return null;
                }
                break;
            }
            case 0x86: {
                return !this.f(16) ? new SectionReader(new PassthroughSectionPayloadReader("application/x-scte35")) : null;
            }
            case 0x81: 
            case 0x87: {
                int v4 = tsPayloadReader$EsInfo0.a();
                return new PesReader(new Ac3Reader(tsPayloadReader$EsInfo0.b, v4));
            }
            case 0x88: 
            case 0x8A: {
                break;
            }
            case 0x8B: {
                int v5 = tsPayloadReader$EsInfo0.a();
                return new PesReader(new DtsReader(tsPayloadReader$EsInfo0.b, v5, 5408));
            }
            case 0xAC: {
                int v6 = tsPayloadReader$EsInfo0.a();
                return new PesReader(new Ac4Reader(tsPayloadReader$EsInfo0.b, v6));
            }
            case 0x101: {
                return new SectionReader(new PassthroughSectionPayloadReader("application/vnd.dvb.ait"));
            }
            default: {
                return null;
            }
        }
        int v7 = tsPayloadReader$EsInfo0.a();
        return new PesReader(new DtsReader(tsPayloadReader$EsInfo0.b, v7, 0x1000));
    }

    @Override  // androidx.media3.extractor.ts.TsPayloadReader$Factory
    public SparseArray b() {
        return new SparseArray();
    }

    private SeiReader c(EsInfo tsPayloadReader$EsInfo0) {
        return new SeiReader(this.e(tsPayloadReader$EsInfo0));
    }

    private UserDataReader d(EsInfo tsPayloadReader$EsInfo0) {
        return new UserDataReader(this.e(tsPayloadReader$EsInfo0));
    }

    private List e(EsInfo tsPayloadReader$EsInfo0) {
        List list1;
        String s1;
        int v6;
        if(this.f(0x20)) {
            return this.b;
        }
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(tsPayloadReader$EsInfo0.e);
        List list0 = this.b;
        while(parsableByteArray0.a() > 0) {
            int v = parsableByteArray0.L();
            int v1 = parsableByteArray0.L();
            int v2 = parsableByteArray0.f();
            if(v == 0x86) {
                list0 = new ArrayList();
                int v3 = parsableByteArray0.L();
                for(int v4 = 0; v4 < (v3 & 0x1F); ++v4) {
                    String s = parsableByteArray0.I(3);
                    int v5 = parsableByteArray0.L();
                    boolean z = true;
                    boolean z1 = (v5 & 0x80) != 0;
                    if(z1) {
                        v6 = v5 & 0x3F;
                        s1 = "application/cea-708";
                    }
                    else {
                        s1 = "application/cea-608";
                        v6 = 1;
                    }
                    int v7 = (byte)parsableByteArray0.L();
                    parsableByteArray0.Z(1);
                    if(z1) {
                        if((v7 & 0x40) == 0) {
                            z = false;
                        }
                        list1 = CodecSpecificDataUtil.b(z);
                    }
                    else {
                        list1 = null;
                    }
                    list0.add(new Builder().o0(s1).e0(s).L(v6).b0(list1).K());
                }
            }
            parsableByteArray0.Y(v2 + v1);
        }
        return list0;
    }

    private boolean f(int v) {
        return (v & this.a) != 0;
    }
}

