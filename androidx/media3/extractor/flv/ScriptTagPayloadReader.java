package androidx.media3.extractor.flv;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DiscardingTrackOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class ScriptTagPayloadReader extends TagPayloadReader {
    private long b;
    private long[] c;
    private long[] d;
    private static final String e = "onMetaData";
    private static final String f = "duration";
    private static final String g = "keyframes";
    private static final String h = "filepositions";
    private static final String i = "times";
    private static final int j = 0;
    private static final int k = 1;
    private static final int l = 2;
    private static final int m = 3;
    private static final int n = 8;
    private static final int o = 9;
    private static final int p = 10;
    private static final int q = 11;

    public ScriptTagPayloadReader() {
        super(new DiscardingTrackOutput());
        this.b = 0x8000000000000001L;
        this.c = new long[0];
        this.d = new long[0];
    }

    @Override  // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(ParsableByteArray parsableByteArray0) {
        return true;
    }

    @Override  // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(ParsableByteArray parsableByteArray0, long v) {
        if(ScriptTagPayloadReader.p(parsableByteArray0) != 2) {
            return false;
        }
        if(!"onMetaData".equals(ScriptTagPayloadReader.o(parsableByteArray0))) {
            return false;
        }
        if(parsableByteArray0.a() == 0) {
            return false;
        }
        if(ScriptTagPayloadReader.p(parsableByteArray0) != 8) {
            return false;
        }
        HashMap hashMap0 = ScriptTagPayloadReader.l(parsableByteArray0);
        Object object0 = hashMap0.get("duration");
        if(object0 instanceof Double) {
            double f = (double)(((Double)object0));
            if(f > 0.0) {
                this.b = (long)(f * 1000000.0);
            }
        }
        Object object1 = hashMap0.get("keyframes");
        if(object1 instanceof Map) {
            Object object2 = ((Map)object1).get("filepositions");
            Object object3 = ((Map)object1).get("times");
            if(object2 instanceof List && object3 instanceof List) {
                int v1 = ((List)object3).size();
                this.c = new long[v1];
                this.d = new long[v1];
                int v2 = 0;
                while(v2 < v1) {
                    Object object4 = ((List)object2).get(v2);
                    Object object5 = ((List)object3).get(v2);
                    if(object5 instanceof Double && object4 instanceof Double) {
                        this.c[v2] = (long)(((double)(((Double)object5))) * 1000000.0);
                        this.d[v2] = ((Double)object4).longValue();
                        ++v2;
                    }
                    else {
                        this.c = new long[0];
                        this.d = new long[0];
                        if(true) {
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override  // androidx.media3.extractor.flv.TagPayloadReader
    public void d() {
    }

    public long e() {
        return this.b;
    }

    public long[] f() {
        return this.d;
    }

    public long[] g() {
        return this.c;
    }

    private static Boolean h(ParsableByteArray parsableByteArray0) {
        return Boolean.valueOf(parsableByteArray0.L() == 1);
    }

    @Nullable
    private static Object i(ParsableByteArray parsableByteArray0, int v) {
        switch(v) {
            case 0: {
                return ScriptTagPayloadReader.k(parsableByteArray0);
            }
            case 1: {
                return ScriptTagPayloadReader.h(parsableByteArray0);
            }
            case 2: {
                return ScriptTagPayloadReader.o(parsableByteArray0);
            }
            case 3: {
                return ScriptTagPayloadReader.m(parsableByteArray0);
            }
            case 8: {
                return ScriptTagPayloadReader.l(parsableByteArray0);
            }
            case 10: {
                return ScriptTagPayloadReader.n(parsableByteArray0);
            }
            case 11: {
                return ScriptTagPayloadReader.j(parsableByteArray0);
            }
            default: {
                return null;
            }
        }
    }

    private static Date j(ParsableByteArray parsableByteArray0) {
        Date date0 = new Date(((long)(((double)ScriptTagPayloadReader.k(parsableByteArray0)))));
        parsableByteArray0.Z(2);
        return date0;
    }

    private static Double k(ParsableByteArray parsableByteArray0) {
        return Double.longBitsToDouble(parsableByteArray0.E());
    }

    private static HashMap l(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.P();
        HashMap hashMap0 = new HashMap(v);
        for(int v1 = 0; v1 < v; ++v1) {
            String s = ScriptTagPayloadReader.o(parsableByteArray0);
            Object object0 = ScriptTagPayloadReader.i(parsableByteArray0, ScriptTagPayloadReader.p(parsableByteArray0));
            if(object0 != null) {
                hashMap0.put(s, object0);
            }
        }
        return hashMap0;
    }

    private static HashMap m(ParsableByteArray parsableByteArray0) {
        HashMap hashMap0 = new HashMap();
        while(true) {
            String s = ScriptTagPayloadReader.o(parsableByteArray0);
            int v = ScriptTagPayloadReader.p(parsableByteArray0);
            if(v == 9) {
                break;
            }
            Object object0 = ScriptTagPayloadReader.i(parsableByteArray0, v);
            if(object0 != null) {
                hashMap0.put(s, object0);
            }
        }
        return hashMap0;
    }

    private static ArrayList n(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.P();
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = ScriptTagPayloadReader.i(parsableByteArray0, ScriptTagPayloadReader.p(parsableByteArray0));
            if(object0 != null) {
                arrayList0.add(object0);
            }
        }
        return arrayList0;
    }

    private static String o(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.R();
        parsableByteArray0.Z(v);
        return new String(parsableByteArray0.e(), parsableByteArray0.f(), v);
    }

    private static int p(ParsableByteArray parsableByteArray0) {
        return parsableByteArray0.L();
    }
}

