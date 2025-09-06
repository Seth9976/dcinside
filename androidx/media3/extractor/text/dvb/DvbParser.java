package androidx.media3.extractor.text.dvb;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue.Builder;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser.OutputOptions;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.e;
import com.google.common.collect.O2;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
public final class DvbParser implements SubtitleParser {
    static final class ClutDefinition {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public ClutDefinition(int v, int[] arr_v, int[] arr_v1, int[] arr_v2) {
            this.a = v;
            this.b = arr_v;
            this.c = arr_v1;
            this.d = arr_v2;
        }
    }

    static final class DisplayDefinition {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public DisplayDefinition(int v, int v1, int v2, int v3, int v4, int v5) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
            this.e = v4;
            this.f = v5;
        }
    }

    static final class ObjectData {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public ObjectData(int v, boolean z, byte[] arr_b, byte[] arr_b1) {
            this.a = v;
            this.b = z;
            this.c = arr_b;
            this.d = arr_b1;
        }
    }

    static final class PageComposition {
        public final int a;
        public final int b;
        public final int c;
        public final SparseArray d;

        public PageComposition(int v, int v1, int v2, SparseArray sparseArray0) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = sparseArray0;
        }
    }

    static final class PageRegion {
        public final int a;
        public final int b;

        public PageRegion(int v, int v1) {
            this.a = v;
            this.b = v1;
        }
    }

    static final class RegionComposition {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final SparseArray k;

        public RegionComposition(int v, boolean z, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, SparseArray sparseArray0) {
            this.a = v;
            this.b = z;
            this.c = v1;
            this.d = v2;
            this.e = v3;
            this.f = v4;
            this.g = v5;
            this.h = v6;
            this.i = v7;
            this.j = v8;
            this.k = sparseArray0;
        }

        public void a(RegionComposition dvbParser$RegionComposition0) {
            SparseArray sparseArray0 = dvbParser$RegionComposition0.k;
            for(int v = 0; v < sparseArray0.size(); ++v) {
                int v1 = sparseArray0.keyAt(v);
                RegionObject dvbParser$RegionObject0 = (RegionObject)sparseArray0.valueAt(v);
                this.k.put(v1, dvbParser$RegionObject0);
            }
        }
    }

    static final class RegionObject {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public RegionObject(int v, int v1, int v2, int v3, int v4, int v5) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
            this.e = v4;
            this.f = v5;
        }
    }

    static final class SubtitleService {
        public final int a;
        public final int b;
        public final SparseArray c;
        public final SparseArray d;
        public final SparseArray e;
        public final SparseArray f;
        public final SparseArray g;
        @Nullable
        public DisplayDefinition h;
        @Nullable
        public PageComposition i;

        public SubtitleService(int v, int v1) {
            this.a = v;
            this.b = v1;
            this.c = new SparseArray();
            this.d = new SparseArray();
            this.e = new SparseArray();
            this.f = new SparseArray();
            this.g = new SparseArray();
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

    private static final byte[] A = null;
    private static final byte[] B = null;
    private static final byte[] C = null;
    private final Paint a;
    private final Paint b;
    private final Canvas c;
    private final DisplayDefinition d;
    private final ClutDefinition e;
    private final SubtitleService f;
    private Bitmap g;
    public static final int h = 2;
    private static final String i = "DvbParser";
    private static final int j = 16;
    private static final int k = 17;
    private static final int l = 18;
    private static final int m = 19;
    private static final int n = 20;
    private static final int o = 0;
    private static final int p = 2;
    private static final int q = 3;
    private static final int r = 0;
    private static final int s = 1;
    private static final int t = 16;
    private static final int u = 17;
    private static final int v = 18;
    private static final int w = 0x20;
    private static final int x = 33;
    private static final int y = 34;
    private static final int z = 0xF0;

    static {
        DvbParser.A = new byte[]{0, 7, 8, 15};
        DvbParser.B = new byte[]{0, 0x77, -120, -1};
        DvbParser.C = new byte[]{0, 17, 34, 51, 68, 85, 102, 0x77, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public DvbParser(List list0) {
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(((byte[])list0.get(0)));
        int v = parsableByteArray0.R();
        int v1 = parsableByteArray0.R();
        Paint paint0 = new Paint();
        this.a = paint0;
        paint0.setStyle(Paint.Style.FILL_AND_STROKE);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint0.setPathEffect(null);
        Paint paint1 = new Paint();
        this.b = paint1;
        paint1.setStyle(Paint.Style.FILL);
        paint1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint1.setPathEffect(null);
        this.c = new Canvas();
        this.d = new DisplayDefinition(0x2CF, 0x23F, 0, 0x2CF, 0, 0x23F);
        this.e = new ClutDefinition(0, DvbParser.f(), DvbParser.g(), DvbParser.h());
        this.f = new SubtitleService(v, v1);
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void a(byte[] arr_b, int v, int v1, OutputOptions subtitleParser$OutputOptions0, Consumer consumer0) {
        ParsableBitArray parsableBitArray0 = new ParsableBitArray(arr_b, v1 + v);
        parsableBitArray0.q(v);
        consumer0.accept(this.o(parsableBitArray0));
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public int b() {
        return 2;
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void c(byte[] arr_b, OutputOptions subtitleParser$OutputOptions0, Consumer consumer0) {
        e.a(this, arr_b, subtitleParser$OutputOptions0, consumer0);
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public Subtitle d(byte[] arr_b, int v, int v1) {
        return e.b(this, arr_b, v, v1);
    }

    private static byte[] e(int v, int v1, ParsableBitArray parsableBitArray0) {
        byte[] arr_b = new byte[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_b[v2] = (byte)parsableBitArray0.h(v1);
        }
        return arr_b;
    }

    private static int[] f() {
        return new int[]{0, -1, 0xFF000000, 0xFF7F7F7F};
    }

    private static int[] g() {
        int[] arr_v = new int[16];
        arr_v[0] = 0;
        for(int v = 1; true; ++v) {
            int v1 = 0x7F;
            if(v >= 16) {
                break;
            }
            if(v < 8) {
                arr_v[v] = 0xFF000000 | ((v & 1) == 0 ? 0 : 0xFF) << 16 | ((v & 2) == 0 ? 0 : 0xFF) << 8 | ((v & 4) == 0 ? 0 : 0xFF);
            }
            else {
                if((v & 4) == 0) {
                    v1 = 0;
                }
                arr_v[v] = 0xFF000000 | ((v & 1) == 0 ? 0 : 0x7F) << 16 | ((v & 2) == 0 ? 0 : 0x7F) << 8 | v1;
            }
        }
        return arr_v;
    }

    private static int[] h() {
        int[] arr_v = new int[0x100];
        arr_v[0] = 0;
        for(int v = 0; true; ++v) {
            int v1 = 0xFF;
            if(v >= 0x100) {
                break;
            }
            if(v < 8) {
                if((v & 4) == 0) {
                    v1 = 0;
                }
                arr_v[v] = 0x3F000000 | ((v & 1) == 0 ? 0 : 0xFF) << 16 | ((v & 2) == 0 ? 0 : 0xFF) << 8 | v1;
            }
            else {
                int v2 = 43;
                int v3 = 170;
                int v4 = 85;
                switch(v & 0x88) {
                    case 0: {
                        if((v & 4) == 0) {
                            v4 = 0;
                        }
                        if((v & 0x40) == 0) {
                            v3 = 0;
                        }
                        arr_v[v] = 0xFF000000 | ((v & 1) == 0 ? 0 : 85) + ((v & 16) == 0 ? 0 : 170) << 16 | ((v & 2) == 0 ? 0 : 85) + ((v & 0x20) == 0 ? 0 : 170) << 8 | v4 + v3;
                        break;
                    }
                    case 8: {
                        if((v & 4) == 0) {
                            v4 = 0;
                        }
                        if((v & 0x40) == 0) {
                            v3 = 0;
                        }
                        arr_v[v] = 0x7F000000 | ((v & 1) == 0 ? 0 : 85) + ((v & 16) == 0 ? 0 : 170) << 16 | ((v & 2) == 0 ? 0 : 85) + ((v & 0x20) == 0 ? 0 : 170) << 8 | v4 + v3;
                        break;
                    }
                    default: {
                        switch(v & 0x88) {
                            case 0x80: {
                                if((v & 4) == 0) {
                                    v2 = 0;
                                }
                                if((v & 0x40) == 0) {
                                    v4 = 0;
                                }
                                arr_v[v] = 0xFF000000 | ((v & 1) == 0 ? 0 : 43) + 0x7F + ((v & 16) == 0 ? 0 : 85) << 16 | ((v & 2) == 0 ? 0 : 43) + 0x7F + ((v & 0x20) == 0 ? 0 : 85) << 8 | v2 + 0x7F + v4;
                                break;
                            }
                            case 0x88: {
                                if((v & 4) == 0) {
                                    v2 = 0;
                                }
                                if((v & 0x40) == 0) {
                                    v4 = 0;
                                }
                                arr_v[v] = 0xFF000000 | ((v & 1) == 0 ? 0 : 43) + ((v & 16) == 0 ? 0 : 85) << 16 | ((v & 2) == 0 ? 0 : 43) + ((v & 0x20) == 0 ? 0 : 85) << 8 | v2 + v4;
                            }
                        }
                    }
                }
            }
        }
        return arr_v;
    }

    private static int i(int v, int v1, int v2, int v3) [...] // Inlined contents

    private static int j(ParsableBitArray parsableBitArray0, int[] arr_v, @Nullable byte[] arr_b, int v, int v1, @Nullable Paint paint0, Canvas canvas0) {
        int v3;
        boolean z;
        int v5;
        int v4;
        do {
            int v2 = parsableBitArray0.h(2);
            if(v2 == 0) {
                if(parsableBitArray0.g()) {
                    v4 = parsableBitArray0.h(3) + 3;
                    v5 = parsableBitArray0.h(2);
                }
                else if(parsableBitArray0.g()) {
                    z = false;
                    v2 = 0;
                    v3 = 1;
                    goto label_35;
                }
                else {
                    switch(parsableBitArray0.h(2)) {
                        case 0: {
                            v2 = 0;
                            z = true;
                            v3 = 0;
                            goto label_35;
                        }
                        case 1: {
                            z = false;
                            v2 = 0;
                            v3 = 2;
                            goto label_35;
                        }
                        case 2: {
                            v4 = parsableBitArray0.h(4) + 12;
                            v5 = parsableBitArray0.h(2);
                            break;
                        }
                        case 3: {
                            v4 = parsableBitArray0.h(8) + 29;
                            v5 = parsableBitArray0.h(2);
                            break;
                        }
                        default: {
                            z = false;
                            v2 = 0;
                            v3 = 0;
                            goto label_35;
                        }
                    }
                }
                z = false;
                v3 = v4;
                v2 = v5;
            }
            else {
                z = false;
                v3 = 1;
            }
        label_35:
            if(v3 != 0 && paint0 != null) {
                if(arr_b != null) {
                    v2 = arr_b[v2];
                }
                paint0.setColor(arr_v[v2]);
                canvas0.drawRect(((float)v), ((float)v1), ((float)(v + v3)), ((float)(v1 + 1)), paint0);
            }
            v += v3;
        }
        while(!z);
        return v;
    }

    private static int k(ParsableBitArray parsableBitArray0, int[] arr_v, @Nullable byte[] arr_b, int v, int v1, @Nullable Paint paint0, Canvas canvas0) {
        int v6;
        int v5;
        int v3;
        boolean z;
        do {
            int v2 = parsableBitArray0.h(4);
            if(v2 != 0) {
                z = false;
                v3 = 1;
            }
            else if(parsableBitArray0.g()) {
                if(parsableBitArray0.g()) {
                    switch(parsableBitArray0.h(2)) {
                        case 0: {
                            z = false;
                            v2 = 0;
                            v3 = 1;
                            goto label_41;
                        }
                        case 1: {
                            z = false;
                            v2 = 0;
                            v3 = 2;
                            goto label_41;
                        }
                        case 2: {
                            v5 = parsableBitArray0.h(4) + 9;
                            v6 = parsableBitArray0.h(4);
                            break;
                        }
                        case 3: {
                            v5 = parsableBitArray0.h(8) + 25;
                            v6 = parsableBitArray0.h(4);
                            break;
                        }
                        default: {
                            z = false;
                            v2 = 0;
                            v3 = 0;
                            goto label_41;
                        }
                    }
                }
                else {
                    v5 = parsableBitArray0.h(2) + 4;
                    v6 = parsableBitArray0.h(4);
                }
                z = false;
                v3 = v5;
                v2 = v6;
            }
            else {
                int v4 = parsableBitArray0.h(3);
                if(v4 == 0) {
                    v2 = 0;
                    z = true;
                    v3 = 0;
                }
                else {
                    z = false;
                    v3 = v4 + 2;
                    v2 = 0;
                }
            }
        label_41:
            if(v3 != 0 && paint0 != null) {
                if(arr_b != null) {
                    v2 = arr_b[v2];
                }
                paint0.setColor(arr_v[v2]);
                canvas0.drawRect(((float)v), ((float)v1), ((float)(v + v3)), ((float)(v1 + 1)), paint0);
            }
            v += v3;
        }
        while(!z);
        return v;
    }

    private static int l(ParsableBitArray parsableBitArray0, int[] arr_v, @Nullable byte[] arr_b, int v, int v1, @Nullable Paint paint0, Canvas canvas0) {
        int v3;
        boolean z;
        do {
            int v2 = parsableBitArray0.h(8);
            if(v2 != 0) {
                z = false;
                v3 = 1;
            }
            else if(parsableBitArray0.g()) {
                z = false;
                v3 = parsableBitArray0.h(7);
                v2 = parsableBitArray0.h(8);
            }
            else {
                int v4 = parsableBitArray0.h(7);
                if(v4 == 0) {
                    v2 = 0;
                    z = true;
                    v3 = 0;
                }
                else {
                    z = false;
                    v3 = v4;
                    v2 = 0;
                }
            }
            if(v3 != 0 && paint0 != null) {
                if(arr_b != null) {
                    v2 = arr_b[v2];
                }
                paint0.setColor(arr_v[v2]);
                canvas0.drawRect(((float)v), ((float)v1), ((float)(v + v3)), ((float)(v1 + 1)), paint0);
            }
            v += v3;
        }
        while(!z);
        return v;
    }

    private static void m(byte[] arr_b, int[] arr_v, int v, int v1, int v2, @Nullable Paint paint0, Canvas canvas0) {
        byte[] arr_b5;
        byte[] arr_b4;
        ParsableBitArray parsableBitArray0 = new ParsableBitArray(arr_b);
        int v3 = v1;
        int v4 = v2;
        byte[] arr_b1 = null;
        byte[] arr_b2 = null;
        byte[] arr_b3 = null;
        while(parsableBitArray0.b() != 0) {
            int v5 = parsableBitArray0.h(8);
            if(v5 == 0xF0) {
                v4 += 2;
                v3 = v1;
            }
            else {
                switch(v5) {
                    case 16: {
                        if(v == 3) {
                            arr_b4 = arr_b1 == null ? DvbParser.B : arr_b1;
                        }
                        else if(v == 2) {
                            arr_b4 = arr_b3 == null ? DvbParser.A : arr_b3;
                        }
                        else {
                            arr_b4 = null;
                        }
                        v3 = DvbParser.j(parsableBitArray0, arr_v, arr_b4, v3, v4, paint0, canvas0);
                        parsableBitArray0.c();
                        break;
                    }
                    case 17: {
                        if(v == 3) {
                            arr_b5 = arr_b2 == null ? DvbParser.C : arr_b2;
                        }
                        else {
                            arr_b5 = null;
                        }
                        v3 = DvbParser.k(parsableBitArray0, arr_v, arr_b5, v3, v4, paint0, canvas0);
                        parsableBitArray0.c();
                        break;
                    }
                    case 18: {
                        v3 = DvbParser.l(parsableBitArray0, arr_v, null, v3, v4, paint0, canvas0);
                        break;
                    }
                    case 0x20: {
                        arr_b3 = DvbParser.e(4, 4, parsableBitArray0);
                        break;
                    }
                    case 33: {
                        arr_b1 = DvbParser.e(4, 8, parsableBitArray0);
                        break;
                    }
                    case 34: {
                        arr_b2 = DvbParser.e(16, 8, parsableBitArray0);
                    }
                }
            }
        }
    }

    private static void n(ObjectData dvbParser$ObjectData0, ClutDefinition dvbParser$ClutDefinition0, int v, int v1, int v2, @Nullable Paint paint0, Canvas canvas0) {
        int[] arr_v;
        switch(v) {
            case 2: {
                arr_v = dvbParser$ClutDefinition0.c;
                break;
            }
            case 3: {
                arr_v = dvbParser$ClutDefinition0.d;
                break;
            }
            default: {
                arr_v = dvbParser$ClutDefinition0.b;
            }
        }
        DvbParser.m(dvbParser$ObjectData0.c, arr_v, v, v1, v2, paint0, canvas0);
        DvbParser.m(dvbParser$ObjectData0.d, arr_v, v, v1, v2 + 1, paint0, canvas0);
    }

    private CuesWithTiming o(ParsableBitArray parsableBitArray0) {
        int v10;
        SparseArray sparseArray2;
        int v8;
        while(parsableBitArray0.b() >= 0x30 && parsableBitArray0.h(8) == 15) {
            DvbParser.u(parsableBitArray0, this.f);
        }
        SubtitleService dvbParser$SubtitleService0 = this.f;
        PageComposition dvbParser$PageComposition0 = dvbParser$SubtitleService0.i;
        if(dvbParser$PageComposition0 == null) {
            return new CuesWithTiming(O2.A(), 0x8000000000000001L, 0x8000000000000001L);
        }
        DisplayDefinition dvbParser$DisplayDefinition0 = dvbParser$SubtitleService0.h == null ? this.d : dvbParser$SubtitleService0.h;
        Bitmap bitmap0 = this.g;
        if(bitmap0 == null) {
        label_14:
            Bitmap bitmap1 = Bitmap.createBitmap(dvbParser$DisplayDefinition0.a + 1, dvbParser$DisplayDefinition0.b + 1, Bitmap.Config.ARGB_8888);
            this.g = bitmap1;
            this.c.setBitmap(bitmap1);
        }
        else {
            int v = bitmap0.getWidth();
            if(dvbParser$DisplayDefinition0.a + 1 == v) {
                int v1 = this.g.getHeight();
                if(dvbParser$DisplayDefinition0.b + 1 != v1) {
                    goto label_14;
                }
            }
            else {
                goto label_14;
            }
        }
        ArrayList arrayList0 = new ArrayList();
        SparseArray sparseArray0 = dvbParser$PageComposition0.d;
        for(int v2 = 0; v2 < sparseArray0.size(); ++v2) {
            this.c.save();
            PageRegion dvbParser$PageRegion0 = (PageRegion)sparseArray0.valueAt(v2);
            int v3 = sparseArray0.keyAt(v2);
            RegionComposition dvbParser$RegionComposition0 = (RegionComposition)this.f.c.get(v3);
            int v4 = dvbParser$PageRegion0.a + dvbParser$DisplayDefinition0.c;
            int v5 = dvbParser$PageRegion0.b + dvbParser$DisplayDefinition0.e;
            this.c.clipRect(v4, v5, Math.min(dvbParser$RegionComposition0.c + v4, dvbParser$DisplayDefinition0.d), Math.min(dvbParser$RegionComposition0.d + v5, dvbParser$DisplayDefinition0.f));
            ClutDefinition dvbParser$ClutDefinition0 = (ClutDefinition)this.f.d.get(dvbParser$RegionComposition0.g);
            if(dvbParser$ClutDefinition0 == null) {
                ClutDefinition dvbParser$ClutDefinition1 = (ClutDefinition)this.f.f.get(dvbParser$RegionComposition0.g);
                dvbParser$ClutDefinition0 = dvbParser$ClutDefinition1 == null ? this.e : dvbParser$ClutDefinition1;
            }
            SparseArray sparseArray1 = dvbParser$RegionComposition0.k;
            int v6 = 0;
            while(v6 < sparseArray1.size()) {
                int v7 = sparseArray1.keyAt(v6);
                RegionObject dvbParser$RegionObject0 = (RegionObject)sparseArray1.valueAt(v6);
                ObjectData dvbParser$ObjectData0 = (ObjectData)this.f.e.get(v7);
                ObjectData dvbParser$ObjectData1 = dvbParser$ObjectData0 == null ? ((ObjectData)this.f.g.get(v7)) : dvbParser$ObjectData0;
                if(dvbParser$ObjectData1 == null) {
                    v8 = v6;
                    sparseArray2 = sparseArray1;
                }
                else {
                    v8 = v6;
                    sparseArray2 = sparseArray1;
                    DvbParser.n(dvbParser$ObjectData1, dvbParser$ClutDefinition0, dvbParser$RegionComposition0.f, dvbParser$RegionObject0.c + v4, v5 + dvbParser$RegionObject0.d, (dvbParser$ObjectData1.b ? null : this.a), this.c);
                }
                v6 = v8 + 1;
                sparseArray1 = sparseArray2;
            }
            if(dvbParser$RegionComposition0.b) {
                int v9 = dvbParser$RegionComposition0.f;
                if(v9 == 3) {
                    v10 = dvbParser$ClutDefinition0.d[dvbParser$RegionComposition0.h];
                }
                else {
                    v10 = v9 == 2 ? dvbParser$ClutDefinition0.c[dvbParser$RegionComposition0.i] : dvbParser$ClutDefinition0.b[dvbParser$RegionComposition0.j];
                }
                this.b.setColor(v10);
                this.c.drawRect(((float)v4), ((float)v5), ((float)(dvbParser$RegionComposition0.c + v4)), ((float)(dvbParser$RegionComposition0.d + v5)), this.b);
            }
            arrayList0.add(new Builder().r(Bitmap.createBitmap(this.g, v4, v5, dvbParser$RegionComposition0.c, dvbParser$RegionComposition0.d)).w(((float)v4) / ((float)dvbParser$DisplayDefinition0.a)).x(0).t(((float)v5) / ((float)dvbParser$DisplayDefinition0.b), 0).u(0).z(((float)dvbParser$RegionComposition0.c) / ((float)dvbParser$DisplayDefinition0.a)).s(((float)dvbParser$RegionComposition0.d) / ((float)dvbParser$DisplayDefinition0.b)).a());
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.c.restore();
        }
        return new CuesWithTiming(arrayList0, 0x8000000000000001L, 0x8000000000000001L);
    }

    private static ClutDefinition p(ParsableBitArray parsableBitArray0, int v) {
        int v9;
        int v8;
        int v7;
        int v6;
        int v5;
        int[] arr_v3;
        int v1 = parsableBitArray0.h(8);
        parsableBitArray0.s(8);
        int v2 = v - 2;
        int[] arr_v = DvbParser.f();
        int[] arr_v1 = DvbParser.g();
        int[] arr_v2 = DvbParser.h();
        while(v2 > 0) {
            int v3 = parsableBitArray0.h(8);
            int v4 = parsableBitArray0.h(8);
            if((v4 & 0x80) == 0) {
                arr_v3 = (v4 & 0x40) == 0 ? arr_v2 : arr_v1;
            }
            else {
                arr_v3 = arr_v;
            }
            if((v4 & 1) == 0) {
                int v10 = parsableBitArray0.h(6);
                int v11 = parsableBitArray0.h(4);
                v7 = parsableBitArray0.h(4) << 4;
                v9 = v2 - 4;
                v8 = parsableBitArray0.h(2) << 6;
                v5 = v10 << 2;
                v6 = v11 << 4;
            }
            else {
                v5 = parsableBitArray0.h(8);
                v6 = parsableBitArray0.h(8);
                v7 = parsableBitArray0.h(8);
                v8 = parsableBitArray0.h(8);
                v9 = v2 - 6;
            }
            if(v5 == 0) {
                v6 = 0;
                v7 = 0;
                v8 = 0xFF;
            }
            arr_v3[v3] = ((int)(((byte)(~v8 & 0xFF)))) << 24 | Util.w(((int)(((double)v5) + 1.402 * ((double)(v6 - 0x80)))), 0, 0xFF) << 16 | Util.w(((int)(((double)v5) - 0.34414 * ((double)(v7 - 0x80)) - ((double)(v6 - 0x80)) * 0.71414)), 0, 0xFF) << 8 | Util.w(((int)(((double)v5) + ((double)(v7 - 0x80)) * 1.772)), 0, 0xFF);
            v2 = v9;
        }
        return new ClutDefinition(v1, arr_v, arr_v1, arr_v2);
    }

    private static DisplayDefinition q(ParsableBitArray parsableBitArray0) {
        parsableBitArray0.s(4);
        boolean z = parsableBitArray0.g();
        parsableBitArray0.s(3);
        int v = parsableBitArray0.h(16);
        int v1 = parsableBitArray0.h(16);
        return z ? new DisplayDefinition(v, v1, parsableBitArray0.h(16), parsableBitArray0.h(16), parsableBitArray0.h(16), parsableBitArray0.h(16)) : new DisplayDefinition(v, v1, 0, v, 0, v1);
    }

    private static ObjectData r(ParsableBitArray parsableBitArray0) {
        int v = parsableBitArray0.h(16);
        parsableBitArray0.s(4);
        int v1 = parsableBitArray0.h(2);
        boolean z = parsableBitArray0.g();
        parsableBitArray0.s(1);
        byte[] arr_b = Util.f;
        if(v1 == 1) {
            parsableBitArray0.s(parsableBitArray0.h(8) * 16);
            return new ObjectData(v, z, arr_b, arr_b);
        }
        if(v1 == 0) {
            int v2 = parsableBitArray0.h(16);
            int v3 = parsableBitArray0.h(16);
            if(v2 > 0) {
                arr_b = new byte[v2];
                parsableBitArray0.k(arr_b, 0, v2);
            }
            if(v3 > 0) {
                byte[] arr_b1 = new byte[v3];
                parsableBitArray0.k(arr_b1, 0, v3);
                return new ObjectData(v, z, arr_b, arr_b1);
            }
        }
        return new ObjectData(v, z, arr_b, arr_b);
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void reset() {
        this.f.a();
    }

    private static PageComposition s(ParsableBitArray parsableBitArray0, int v) {
        int v1 = parsableBitArray0.h(8);
        int v2 = parsableBitArray0.h(4);
        int v3 = parsableBitArray0.h(2);
        parsableBitArray0.s(2);
        int v4 = v - 2;
        SparseArray sparseArray0 = new SparseArray();
        while(v4 > 0) {
            int v5 = parsableBitArray0.h(8);
            parsableBitArray0.s(8);
            v4 -= 6;
            sparseArray0.put(v5, new PageRegion(parsableBitArray0.h(16), parsableBitArray0.h(16)));
        }
        return new PageComposition(v1, v2, v3, sparseArray0);
    }

    private static RegionComposition t(ParsableBitArray parsableBitArray0, int v) {
        int v17;
        int v16;
        int v1 = parsableBitArray0.h(8);
        parsableBitArray0.s(4);
        boolean z = parsableBitArray0.g();
        parsableBitArray0.s(3);
        int v2 = parsableBitArray0.h(16);
        int v3 = parsableBitArray0.h(16);
        int v4 = parsableBitArray0.h(3);
        int v5 = parsableBitArray0.h(3);
        parsableBitArray0.s(2);
        int v6 = parsableBitArray0.h(8);
        int v7 = parsableBitArray0.h(8);
        int v8 = parsableBitArray0.h(4);
        int v9 = parsableBitArray0.h(2);
        parsableBitArray0.s(2);
        int v10 = v - 10;
        SparseArray sparseArray0 = new SparseArray();
        while(v10 > 0) {
            int v11 = parsableBitArray0.h(16);
            int v12 = parsableBitArray0.h(2);
            int v13 = parsableBitArray0.h(2);
            int v14 = parsableBitArray0.h(12);
            parsableBitArray0.s(4);
            int v15 = parsableBitArray0.h(12);
            if(v12 == 1 || v12 == 2) {
                v10 -= 8;
                v16 = parsableBitArray0.h(8);
                v17 = parsableBitArray0.h(8);
            }
            else {
                v10 -= 6;
                v16 = 0;
                v17 = 0;
            }
            sparseArray0.put(v11, new RegionObject(v12, v13, v14, v15, v16, v17));
        }
        return new RegionComposition(v1, z, v2, v3, v4, v5, v6, v7, v8, v9, sparseArray0);
    }

    private static void u(ParsableBitArray parsableBitArray0, SubtitleService dvbParser$SubtitleService0) {
        int v = parsableBitArray0.h(8);
        int v1 = parsableBitArray0.h(16);
        int v2 = parsableBitArray0.h(16);
        int v3 = parsableBitArray0.d();
        if(v2 * 8 > parsableBitArray0.b()) {
            Log.n("DvbParser", "Data field length exceeds limit");
            parsableBitArray0.s(parsableBitArray0.b());
            return;
        }
        switch(v) {
            case 16: {
                if(v1 == dvbParser$SubtitleService0.a) {
                    PageComposition dvbParser$PageComposition0 = dvbParser$SubtitleService0.i;
                    PageComposition dvbParser$PageComposition1 = DvbParser.s(parsableBitArray0, v2);
                    if(dvbParser$PageComposition1.c != 0) {
                        dvbParser$SubtitleService0.i = dvbParser$PageComposition1;
                        dvbParser$SubtitleService0.c.clear();
                        dvbParser$SubtitleService0.d.clear();
                        dvbParser$SubtitleService0.e.clear();
                    }
                    else if(dvbParser$PageComposition0 != null && dvbParser$PageComposition0.b != dvbParser$PageComposition1.b) {
                        dvbParser$SubtitleService0.i = dvbParser$PageComposition1;
                    }
                }
                break;
            }
            case 17: {
                PageComposition dvbParser$PageComposition2 = dvbParser$SubtitleService0.i;
                if(v1 == dvbParser$SubtitleService0.a && dvbParser$PageComposition2 != null) {
                    RegionComposition dvbParser$RegionComposition0 = DvbParser.t(parsableBitArray0, v2);
                    if(dvbParser$PageComposition2.c == 0) {
                        RegionComposition dvbParser$RegionComposition1 = (RegionComposition)dvbParser$SubtitleService0.c.get(dvbParser$RegionComposition0.a);
                        if(dvbParser$RegionComposition1 != null) {
                            dvbParser$RegionComposition0.a(dvbParser$RegionComposition1);
                        }
                    }
                    dvbParser$SubtitleService0.c.put(dvbParser$RegionComposition0.a, dvbParser$RegionComposition0);
                }
                break;
            }
            case 18: {
                if(v1 == dvbParser$SubtitleService0.a) {
                    ClutDefinition dvbParser$ClutDefinition0 = DvbParser.p(parsableBitArray0, v2);
                    dvbParser$SubtitleService0.d.put(dvbParser$ClutDefinition0.a, dvbParser$ClutDefinition0);
                }
                else if(v1 == dvbParser$SubtitleService0.b) {
                    ClutDefinition dvbParser$ClutDefinition1 = DvbParser.p(parsableBitArray0, v2);
                    dvbParser$SubtitleService0.f.put(dvbParser$ClutDefinition1.a, dvbParser$ClutDefinition1);
                }
                break;
            }
            case 19: {
                if(v1 == dvbParser$SubtitleService0.a) {
                    ObjectData dvbParser$ObjectData0 = DvbParser.r(parsableBitArray0);
                    dvbParser$SubtitleService0.e.put(dvbParser$ObjectData0.a, dvbParser$ObjectData0);
                }
                else if(v1 == dvbParser$SubtitleService0.b) {
                    ObjectData dvbParser$ObjectData1 = DvbParser.r(parsableBitArray0);
                    dvbParser$SubtitleService0.g.put(dvbParser$ObjectData1.a, dvbParser$ObjectData1);
                }
                break;
            }
            case 20: {
                if(v1 == dvbParser$SubtitleService0.a) {
                    dvbParser$SubtitleService0.h = DvbParser.q(parsableBitArray0);
                }
            }
        }
        parsableBitArray0.t(v3 + v2 - parsableBitArray0.d());
    }
}

