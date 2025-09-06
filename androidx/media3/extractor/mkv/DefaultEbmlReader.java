package androidx.media3.extractor.mkv;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.ExtractorInput;
import h4.m;
import java.io.IOException;
import java.util.ArrayDeque;

final class DefaultEbmlReader implements EbmlReader {
    static final class MasterElement {
        private final int a;
        private final long b;

        private MasterElement(int v, long v1) {
            this.a = v;
            this.b = v1;
        }

        MasterElement(int v, long v1, androidx.media3.extractor.mkv.DefaultEbmlReader.1 defaultEbmlReader$10) {
            this(v, v1);
        }
    }

    private final byte[] a;
    private final ArrayDeque b;
    private final VarintReader c;
    private EbmlProcessor d;
    private int e;
    private int f;
    private long g;
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;
    private static final int k = 4;
    private static final int l = 8;
    private static final int m = 8;
    private static final int n = 4;
    private static final int o = 8;

    public DefaultEbmlReader() {
        this.a = new byte[8];
        this.b = new ArrayDeque();
        this.c = new VarintReader();
    }

    @Override  // androidx.media3.extractor.mkv.EbmlReader
    public boolean a(ExtractorInput extractorInput0) throws IOException {
        Assertions.k(this.d);
        while(true) {
            MasterElement defaultEbmlReader$MasterElement0 = (MasterElement)this.b.peek();
            if(defaultEbmlReader$MasterElement0 != null && extractorInput0.getPosition() >= defaultEbmlReader$MasterElement0.b) {
                this.d.a(((MasterElement)this.b.pop()).a);
                return true;
            }
            if(this.e == 0) {
                long v = this.c.d(extractorInput0, true, false, 4);
                if(v == -2L) {
                    v = this.c(extractorInput0);
                }
                if(v == -1L) {
                    return false;
                }
                this.f = (int)v;
                this.e = 1;
            }
            if(this.e == 1) {
                this.g = this.c.d(extractorInput0, false, true, 8);
                this.e = 2;
            }
            int v1 = this.d.g(this.f);
            switch(v1) {
                case 0: {
                    extractorInput0.r(((int)this.g));
                    this.e = 0;
                    break;
                }
                case 1: {
                    long v3 = extractorInput0.getPosition();
                    MasterElement defaultEbmlReader$MasterElement1 = new MasterElement(this.f, this.g + v3, null);
                    this.b.push(defaultEbmlReader$MasterElement1);
                    this.d.f(this.f, v3, this.g);
                    this.e = 0;
                    return true;
                }
                case 2: {
                    long v4 = this.g;
                    if(v4 > 8L) {
                        throw ParserException.a(("Invalid integer size: " + this.g), null);
                    }
                    this.d.d(this.f, this.e(extractorInput0, ((int)v4)));
                    this.e = 0;
                    return true;
                }
                case 3: {
                    long v5 = this.g;
                    if(v5 > 0x7FFFFFFFL) {
                        throw ParserException.a(("String element size: " + this.g), null);
                    }
                    this.d.e(this.f, DefaultEbmlReader.f(extractorInput0, ((int)v5)));
                    this.e = 0;
                    return true;
                }
                case 4: {
                    this.d.c(this.f, ((int)this.g), extractorInput0);
                    this.e = 0;
                    return true;
                }
                default: {
                    if(v1 != 5) {
                        throw ParserException.a(("Invalid element type " + v1), null);
                    }
                    long v2 = this.g;
                    if(v2 != 4L && v2 != 8L) {
                        throw ParserException.a(("Invalid float size: " + this.g), null);
                    }
                    this.d.b(this.f, this.d(extractorInput0, ((int)v2)));
                    this.e = 0;
                    return true;
                }
            }
        }
    }

    @Override  // androidx.media3.extractor.mkv.EbmlReader
    public void b(EbmlProcessor ebmlProcessor0) {
        this.d = ebmlProcessor0;
    }

    @m({"processor"})
    private long c(ExtractorInput extractorInput0) throws IOException {
        int v1;
        int v;
        extractorInput0.o();
        while(true) {
            extractorInput0.k(this.a, 0, 4);
            v = VarintReader.c(this.a[0]);
            if(v != -1 && v <= 4) {
                v1 = (int)VarintReader.a(this.a, v, false);
                if(!this.d.h(v1)) {
                    goto label_6;
                }
                break;
            }
        label_6:
            extractorInput0.r(1);
        }
        extractorInput0.r(v);
        return (long)v1;
    }

    private double d(ExtractorInput extractorInput0, int v) throws IOException {
        long v1 = this.e(extractorInput0, v);
        return v == 4 ? ((double)Float.intBitsToFloat(((int)v1))) : Double.longBitsToDouble(v1);
    }

    private long e(ExtractorInput extractorInput0, int v) throws IOException {
        extractorInput0.readFully(this.a, 0, v);
        long v2 = 0L;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = v2 << 8 | ((long)(this.a[v1] & 0xFF));
        }
        return v2;
    }

    private static String f(ExtractorInput extractorInput0, int v) throws IOException {
        if(v == 0) {
            return "";
        }
        byte[] arr_b = new byte[v];
        extractorInput0.readFully(arr_b, 0, v);
        while(v > 0 && arr_b[v - 1] == 0) {
            --v;
        }
        return new String(arr_b, 0, v);
    }

    @Override  // androidx.media3.extractor.mkv.EbmlReader
    public void reset() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }

    class androidx.media3.extractor.mkv.DefaultEbmlReader.1 {
    }

}

