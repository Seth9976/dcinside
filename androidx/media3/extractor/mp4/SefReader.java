package androidx.media3.extractor.mp4;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import com.google.common.base.M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

final class SefReader {
    static final class DataReference {
        public final int a;
        public final long b;
        public final int c;

        public DataReference(int v, long v1, int v2) {
            this.a = v;
            this.b = v1;
            this.c = v2;
        }
    }

    private final List a;
    private int b;
    private int c;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 0x890;
    private static final int i = 0xB00;
    private static final int j = 0xB01;
    private static final int k = 0xB03;
    private static final int l = 0xB04;
    private static final String m = "SefReader";
    private static final int n = 1397048916;
    private static final int o = 12;
    private static final int p = 8;
    private static final int q = 12;
    private static final M r;
    private static final M s;

    static {
        SefReader.r = M.h(':');
        SefReader.s = M.h('*');
    }

    public SefReader() {
        this.a = new ArrayList();
        this.b = 0;
    }

    private void a(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(8);
        extractorInput0.readFully(parsableByteArray0.e(), 0, 8);
        this.c = parsableByteArray0.w() + 8;
        if(parsableByteArray0.s() != 1397048916) {
            positionHolder0.a = 0L;
            return;
        }
        positionHolder0.a = extractorInput0.getPosition() - ((long)(this.c - 12));
        this.b = 2;
    }

    private static int b(String s) throws ParserException {
        s.hashCode();
        switch(s) {
            case "SlowMotion_Data": {
                return 0x890;
            }
            case "Super_SlowMotion_BGM": {
                return 0xB01;
            }
            case "Super_SlowMotion_Data": {
                return 0xB00;
            }
            case "Super_SlowMotion_Deflickering_On": {
                return 0xB04;
            }
            case "Super_SlowMotion_Edit_Data": {
                return 0xB03;
            }
            default: {
                throw ParserException.a("Invalid SEF name", null);
            }
        }
    }

    public int c(ExtractorInput extractorInput0, PositionHolder positionHolder0, List list0) throws IOException {
        long v = 0L;
        switch(this.b) {
            case 0: {
                long v1 = extractorInput0.getLength();
                if(v1 != -1L && v1 >= 8L) {
                    v = v1 - 8L;
                }
                positionHolder0.a = v;
                this.b = 1;
                return 1;
            }
            case 1: {
                this.a(extractorInput0, positionHolder0);
                return 1;
            }
            case 2: {
                this.d(extractorInput0, positionHolder0);
                return 1;
            }
            case 3: {
                this.e(extractorInput0, list0);
                positionHolder0.a = 0L;
                return 1;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    private void d(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        long v = extractorInput0.getLength();
        int v1 = this.c - 20;
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(v1);
        extractorInput0.readFully(parsableByteArray0.e(), 0, v1);
        for(int v2 = 0; v2 < v1 / 12; ++v2) {
            parsableByteArray0.Z(2);
            int v3 = parsableByteArray0.z();
            if(v3 == 0x890 || v3 == 0xB00 || v3 == 0xB01 || v3 == 0xB03 || v3 == 0xB04) {
                DataReference sefReader$DataReference0 = new DataReference(v3, v - ((long)this.c) - ((long)parsableByteArray0.w()), parsableByteArray0.w());
                this.a.add(sefReader$DataReference0);
            }
            else {
                parsableByteArray0.Z(8);
            }
        }
        if(this.a.isEmpty()) {
            positionHolder0.a = 0L;
            return;
        }
        this.b = 3;
        positionHolder0.a = ((DataReference)this.a.get(0)).b;
    }

    private void e(ExtractorInput extractorInput0, List list0) throws IOException {
        long v = extractorInput0.getPosition();
        int v1 = (int)(extractorInput0.getLength() - extractorInput0.getPosition() - ((long)this.c));
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(v1);
        extractorInput0.readFully(parsableByteArray0.e(), 0, v1);
        for(int v2 = 0; v2 < this.a.size(); ++v2) {
            DataReference sefReader$DataReference0 = (DataReference)this.a.get(v2);
            parsableByteArray0.Y(((int)(sefReader$DataReference0.b - v)));
            parsableByteArray0.Z(4);
            int v3 = parsableByteArray0.w();
            int v4 = SefReader.b(parsableByteArray0.I(v3));
            int v5 = sefReader$DataReference0.c - (v3 + 8);
            switch(v4) {
                case 0x890: {
                    list0.add(SefReader.f(parsableByteArray0, v5));
                    break;
                }
                case 0xB00: 
                case 0xB01: 
                case 0xB03: 
                case 0xB04: {
                    break;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
        }
    }

    private static SlowMotionData f(ParsableByteArray parsableByteArray0, int v) throws ParserException {
        ArrayList arrayList0 = new ArrayList();
        String s = parsableByteArray0.I(v);
        List list0 = SefReader.s.o(s);
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            CharSequence charSequence0 = (CharSequence)list0.get(v1);
            List list1 = SefReader.r.o(charSequence0);
            if(list1.size() != 3) {
                throw ParserException.a(null, null);
            }
            try {
                arrayList0.add(new Segment(Long.parseLong(((String)list1.get(0))), Long.parseLong(((String)list1.get(1))), 1 << Integer.parseInt(((String)list1.get(2))) - 1));
            }
            catch(NumberFormatException numberFormatException0) {
                throw ParserException.a(null, numberFormatException0);
            }
        }
        return new SlowMotionData(arrayList0);
    }

    public void g() {
        this.a.clear();
        this.b = 0;
    }
}

