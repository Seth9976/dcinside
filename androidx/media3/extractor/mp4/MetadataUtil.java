package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.Id3Util;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.collect.O2;

final class MetadataUtil {
    private static final int A = 0x70676170;
    private static final int B = 0x736F736E;
    private static final int C = 0x74767368;
    private static final int D = 757935405;
    private static final int E = 3;
    private static final int F = 0xA9;
    private static final int G = 0xFD;
    private static final String a = "MetadataUtil";
    private static final int b = 7233901;
    private static final int c = 0x74726B;
    private static final int d = 6516084;
    private static final int e = 0x646179;
    private static final int f = 4280916;
    private static final int g = 0x746F6F;
    private static final int h = 0x616C62;
    private static final int i = 0x636F6D;
    private static final int j = 7828084;
    private static final int k = 7108978;
    private static final int l = 0x67656E;
    private static final int m = 0x636F7672;
    private static final int n = 0x676E7265;
    private static final int o = 0x677270;
    private static final int p = 0x6469736B;
    private static final int q = 0x74726B6E;
    private static final int r = 0x746D706F;
    private static final int s = 0x6370696C;
    private static final int t = 1631670868;
    private static final int u = 0x736F6E6D;
    private static final int v = 0x736F616C;
    private static final int w = 0x736F6172;
    private static final int x = 0x736F6161;
    private static final int y = 0x736F636F;
    private static final int z = 1920233063;

    @Nullable
    private static CommentFrame a(int v, ParsableByteArray parsableByteArray0) {
        int v1 = parsableByteArray0.s();
        if(parsableByteArray0.s() == 1684108385) {
            parsableByteArray0.Z(8);
            String s = parsableByteArray0.G(v1 - 16);
            return new CommentFrame("und", s, s);
        }
        Log.n("MetadataUtil", "Failed to parse comment attribute: " + Atom.a(v));
        return null;
    }

    @Nullable
    private static ApicFrame b(ParsableByteArray parsableByteArray0) {
        String s;
        int v = parsableByteArray0.s();
        if(parsableByteArray0.s() == 1684108385) {
            int v1 = Atom.b(parsableByteArray0.s());
            if(v1 == 13) {
                s = "image/jpeg";
            }
            else {
                s = v1 == 14 ? "image/png" : null;
            }
            if(s == null) {
                Log.n("MetadataUtil", "Unrecognized cover art flags: " + v1);
                return null;
            }
            parsableByteArray0.Z(4);
            byte[] arr_b = new byte[v - 16];
            parsableByteArray0.n(arr_b, 0, v - 16);
            return new ApicFrame(s, null, 3, arr_b);
        }
        Log.n("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    @Nullable
    public static Entry c(ParsableByteArray parsableByteArray0) {
        Entry metadata$Entry26;
        Entry metadata$Entry25;
        Entry metadata$Entry24;
        Entry metadata$Entry23;
        Entry metadata$Entry22;
        Entry metadata$Entry21;
        Entry metadata$Entry20;
        Entry metadata$Entry19;
        Entry metadata$Entry18;
        Entry metadata$Entry17;
        Entry metadata$Entry16;
        Entry metadata$Entry15;
        Entry metadata$Entry14;
        Entry metadata$Entry13;
        Entry metadata$Entry12;
        Entry metadata$Entry11;
        Entry metadata$Entry10;
        Entry metadata$Entry9;
        Entry metadata$Entry8;
        Entry metadata$Entry7;
        Entry metadata$Entry6;
        Entry metadata$Entry5;
        Entry metadata$Entry4;
        Entry metadata$Entry3;
        Entry metadata$Entry2;
        Entry metadata$Entry1;
        Entry metadata$Entry0;
        int v = parsableByteArray0.f() + parsableByteArray0.s();
        int v1 = parsableByteArray0.s();
        try {
            if((v1 >> 24 & 0xFF) == 0xA9 || (v1 >> 24 & 0xFF) == 0xFD) {
                goto label_56;
            }
            else {
                switch(v1) {
                    case 757935405: {
                        goto label_53;
                    }
                    case 1631670868: {
                        goto label_23;
                    }
                    case 0x636F7672: {
                        goto label_20;
                    }
                    case 0x6370696C: {
                        goto label_17;
                    }
                    case 0x6469736B: {
                        goto label_8;
                    }
                    case 0x676E7265: {
                        metadata$Entry0 = MetadataUtil.i(parsableByteArray0);
                        goto label_6;
                    }
                    case 0x70676170: {
                        goto label_44;
                    }
                    case 1920233063: {
                        goto label_41;
                    }
                    case 0x736F6161: {
                        goto label_35;
                    }
                    case 0x736F616C: {
                        goto label_29;
                    }
                    case 0x736F6172: {
                        goto label_32;
                    }
                    case 0x736F636F: {
                        goto label_38;
                    }
                    case 0x736F6E6D: {
                        goto label_26;
                    }
                    case 0x736F736E: {
                        goto label_47;
                    }
                    case 0x746D706F: {
                        goto label_14;
                    }
                    case 0x74726B6E: {
                        goto label_11;
                    }
                    case 0x74767368: {
                        goto label_50;
                    }
                }
            }
            goto label_88;
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
    label_6:
        parsableByteArray0.Y(v);
        return metadata$Entry0;
        try {
        label_8:
            metadata$Entry1 = MetadataUtil.d(0x6469736B, "TPOS", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry1;
        try {
        label_11:
            metadata$Entry2 = MetadataUtil.d(0x74726B6E, "TRCK", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry2;
        try {
        label_14:
            metadata$Entry3 = MetadataUtil.f(0x746D706F, "TBPM", parsableByteArray0, true, false);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry3;
        try {
        label_17:
            metadata$Entry4 = MetadataUtil.f(0x6370696C, "TCMP", parsableByteArray0, true, true);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry4;
        try {
        label_20:
            metadata$Entry5 = MetadataUtil.b(parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry5;
        try {
        label_23:
            metadata$Entry6 = MetadataUtil.j(1631670868, "TPE2", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry6;
        try {
        label_26:
            metadata$Entry7 = MetadataUtil.j(0x736F6E6D, "TSOT", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry7;
        try {
        label_29:
            metadata$Entry8 = MetadataUtil.j(0x736F616C, "TSOA", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry8;
        try {
        label_32:
            metadata$Entry9 = MetadataUtil.j(0x736F6172, "TSOP", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry9;
        try {
        label_35:
            metadata$Entry10 = MetadataUtil.j(0x736F6161, "TSO2", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry10;
        try {
        label_38:
            metadata$Entry11 = MetadataUtil.j(0x736F636F, "TSOC", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry11;
        try {
        label_41:
            metadata$Entry12 = MetadataUtil.f(1920233063, "ITUNESADVISORY", parsableByteArray0, false, false);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry12;
        try {
        label_44:
            metadata$Entry13 = MetadataUtil.f(0x70676170, "ITUNESGAPLESS", parsableByteArray0, false, true);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry13;
        try {
        label_47:
            metadata$Entry14 = MetadataUtil.j(0x736F736E, "TVSHOWSORT", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry14;
        try {
        label_50:
            metadata$Entry15 = MetadataUtil.j(0x74767368, "TVSHOW", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry15;
        try {
        label_53:
            metadata$Entry16 = MetadataUtil.g(parsableByteArray0, v);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry16;
        try {
        label_56:
            switch(0xFFFFFF & v1) {
                case 4280916: {
                    metadata$Entry17 = MetadataUtil.j(v1, "TPE1", parsableByteArray0);
                    break;
                }
                case 0x616C62: {
                    goto label_61;
                }
                case 6516084: {
                    goto label_64;
                }
                case 0x646179: {
                    goto label_70;
                }
                case 0x67656E: {
                    goto label_73;
                }
                case 0x677270: {
                    goto label_76;
                }
                case 7108978: {
                    goto label_79;
                }
                case 0x746F6F: {
                    goto label_85;
                }
                case 7233901: 
                case 0x74726B: {
                    goto label_82;
                }
                case 0x636F6D: 
                case 7828084: {
                    goto label_67;
                }
                default: {
                    goto label_88;
                }
            }
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry17;
        try {
        label_61:
            metadata$Entry18 = MetadataUtil.j(v1, "TALB", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry18;
        try {
        label_64:
            metadata$Entry19 = MetadataUtil.a(v1, parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry19;
        try {
        label_67:
            metadata$Entry20 = MetadataUtil.j(v1, "TCOM", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry20;
        try {
        label_70:
            metadata$Entry21 = MetadataUtil.j(v1, "TDRC", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry21;
        try {
        label_73:
            metadata$Entry22 = MetadataUtil.j(v1, "TCON", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry22;
        try {
        label_76:
            metadata$Entry23 = MetadataUtil.j(v1, "TIT1", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry23;
        try {
        label_79:
            metadata$Entry24 = MetadataUtil.j(v1, "USLT", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry24;
        try {
        label_82:
            metadata$Entry25 = MetadataUtil.j(v1, "TIT2", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry25;
        try {
        label_85:
            metadata$Entry26 = MetadataUtil.j(v1, "TSSE", parsableByteArray0);
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return metadata$Entry26;
        try {
        label_88:
            Log.b("MetadataUtil", "Skipped unknown metadata entry: " + Atom.a(v1));
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v);
            throw throwable0;
        }
        parsableByteArray0.Y(v);
        return null;
    }

    @Nullable
    private static TextInformationFrame d(int v, String s, ParsableByteArray parsableByteArray0) {
        int v1 = parsableByteArray0.s();
        if(parsableByteArray0.s() == 1684108385 && v1 >= 22) {
            parsableByteArray0.Z(10);
            int v2 = parsableByteArray0.R();
            if(v2 > 0) {
                String s1 = "" + v2;
                int v3 = parsableByteArray0.R();
                if(v3 > 0) {
                    s1 = s1 + "/" + v3;
                }
                return new TextInformationFrame(s, null, O2.B(s1));
            }
        }
        Log.n("MetadataUtil", "Failed to parse index/count attribute: " + Atom.a(v));
        return null;
    }

    private static int e(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.s();
        if(parsableByteArray0.s() == 1684108385) {
            parsableByteArray0.Z(8);
            switch(v - 16) {
                case 1: {
                    return parsableByteArray0.L();
                }
                case 2: {
                    return parsableByteArray0.R();
                }
                case 3: {
                    return parsableByteArray0.O();
                }
                case 4: {
                    if((parsableByteArray0.k() & 0x80) == 0) {
                        return parsableByteArray0.P();
                    }
                }
            }
        }
        Log.n("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    private static Id3Frame f(int v, String s, ParsableByteArray parsableByteArray0, boolean z, boolean z1) {
        int v1 = MetadataUtil.e(parsableByteArray0);
        if(z1) {
            v1 = Math.min(1, v1);
        }
        if(v1 >= 0) {
            return z ? new TextInformationFrame(s, null, O2.B(Integer.toString(v1))) : new CommentFrame("und", s, Integer.toString(v1));
        }
        Log.n("MetadataUtil", "Failed to parse uint8 attribute: " + Atom.a(v));
        return null;
    }

    @Nullable
    private static Id3Frame g(ParsableByteArray parsableByteArray0, int v) {
        String s = null;
        String s1 = null;
        int v1 = -1;
        int v2 = -1;
        while(parsableByteArray0.f() < v) {
            int v3 = parsableByteArray0.f();
            int v4 = parsableByteArray0.s();
            int v5 = parsableByteArray0.s();
            parsableByteArray0.Z(4);
            if(v5 == 1835360622) {
                s = parsableByteArray0.G(v4 - 12);
            }
            else {
                switch(v5) {
                    case 1684108385: {
                        v1 = v3;
                        v2 = v4;
                        parsableByteArray0.Z(v4 - 12);
                        continue;
                    }
                    case 0x6E616D65: {
                        break;
                    }
                    default: {
                        parsableByteArray0.Z(v4 - 12);
                        continue;
                    }
                }
                s1 = parsableByteArray0.G(v4 - 12);
            }
        }
        if(s != null && s1 != null && v1 != -1) {
            parsableByteArray0.Y(v1);
            parsableByteArray0.Z(16);
            return new InternalFrame(s, s1, parsableByteArray0.G(v2 - 16));
        }
        return null;
    }

    @Nullable
    public static MdtaMetadataEntry h(ParsableByteArray parsableByteArray0, int v, String s) {
        int v1;
        while((v1 = parsableByteArray0.f()) < v) {
            int v2 = parsableByteArray0.s();
            if(parsableByteArray0.s() == 1684108385) {
                int v3 = parsableByteArray0.s();
                int v4 = parsableByteArray0.s();
                byte[] arr_b = new byte[v2 - 16];
                parsableByteArray0.n(arr_b, 0, v2 - 16);
                return new MdtaMetadataEntry(s, arr_b, v4, v3);
            }
            parsableByteArray0.Y(v1 + v2);
        }
        return null;
    }

    @Nullable
    private static TextInformationFrame i(ParsableByteArray parsableByteArray0) {
        String s = Id3Util.a(MetadataUtil.e(parsableByteArray0) - 1);
        if(s != null) {
            return new TextInformationFrame("TCON", null, O2.B(s));
        }
        Log.n("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    @Nullable
    private static TextInformationFrame j(int v, String s, ParsableByteArray parsableByteArray0) {
        int v1 = parsableByteArray0.s();
        if(parsableByteArray0.s() == 1684108385) {
            parsableByteArray0.Z(8);
            return new TextInformationFrame(s, null, O2.B(parsableByteArray0.G(v1 - 16)));
        }
        Log.n("MetadataUtil", "Failed to parse text attribute: " + Atom.a(v));
        return null;
    }

    public static void k(int v, GaplessInfoHolder gaplessInfoHolder0, Builder format$Builder0) {
        if(v == 1 && gaplessInfoHolder0.a()) {
            format$Builder0.V(gaplessInfoHolder0.a).W(gaplessInfoHolder0.b);
        }
    }

    public static void l(int v, @Nullable Metadata metadata0, Builder format$Builder0, Metadata[] arr_metadata) {
        Metadata metadata1 = new Metadata(new Entry[0]);
        if(metadata0 != null) {
            for(int v2 = 0; v2 < metadata0.f(); ++v2) {
                Entry metadata$Entry0 = metadata0.e(v2);
                if(metadata$Entry0 instanceof MdtaMetadataEntry) {
                    if(!((MdtaMetadataEntry)metadata$Entry0).a.equals("com.android.capture.fps")) {
                        metadata1 = metadata1.a(new Entry[]{((MdtaMetadataEntry)metadata$Entry0)});
                    }
                    else if(v == 2) {
                        metadata1 = metadata1.a(new Entry[]{((MdtaMetadataEntry)metadata$Entry0)});
                    }
                }
            }
        }
        for(int v1 = 0; v1 < arr_metadata.length; ++v1) {
            metadata1 = metadata1.c(arr_metadata[v1]);
        }
        if(metadata1.f() > 0) {
            format$Builder0.h0(metadata1);
        }
    }
}

