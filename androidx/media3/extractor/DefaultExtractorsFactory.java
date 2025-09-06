package androidx.media3.extractor;

import O1.a;
import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.FileTypes;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.amr.AmrExtractor;
import androidx.media3.extractor.avi.AviExtractor;
import androidx.media3.extractor.avif.AvifExtractor;
import androidx.media3.extractor.bmp.BmpExtractor;
import androidx.media3.extractor.flac.FlacExtractor;
import androidx.media3.extractor.flv.FlvExtractor;
import androidx.media3.extractor.heif.HeifExtractor;
import androidx.media3.extractor.jpeg.JpegExtractor;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.ogg.OggExtractor;
import androidx.media3.extractor.png.PngExtractor;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleParser.Factory;
import androidx.media3.extractor.text.SubtitleTranscodingExtractor;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.extractor.wav.WavExtractor;
import androidx.media3.extractor.webp.WebpExtractor;
import com.google.common.collect.O2;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.FIN;

@UnstableApi
public final class DefaultExtractorsFactory implements ExtractorsFactory {
    static final class ExtensionLoader {
        public interface ConstructorSupplier {
            @Nullable
            Constructor getConstructor() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException;
        }

        private final ConstructorSupplier a;
        private final AtomicBoolean b;
        @GuardedBy("extensionLoaded")
        @Nullable
        private Constructor c;

        public ExtensionLoader(ConstructorSupplier defaultExtractorsFactory$ExtensionLoader$ConstructorSupplier0) {
            this.a = defaultExtractorsFactory$ExtensionLoader$ConstructorSupplier0;
            this.b = new AtomicBoolean(false);
        }

        @Nullable
        public Extractor a(Object[] arr_object) {
            Constructor constructor0 = this.b();
            if(constructor0 == null) {
                return null;
            }
            try {
                return (Extractor)constructor0.newInstance(arr_object);
            }
            catch(Exception exception0) {
                throw new IllegalStateException("Unexpected error creating extractor", exception0);
            }
        }

        @Nullable
        private Constructor b() {
            AtomicBoolean atomicBoolean0 = this.b;
            __monitor_enter(atomicBoolean0);
            int v = FIN.finallyOpen$NT();
            if(this.b.get()) {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(atomicBoolean0);
                FIN.finallyCodeEnd$NT(v);
                return this.c;
            }
            try {
                Constructor constructor0 = this.a.getConstructor();
                FIN.finallyExec$NT(v);
                return constructor0;
            }
            catch(ClassNotFoundException unused_ex) {
                this.b.set(true);
                FIN.finallyExec$NT(v);
                return this.c;
            }
            catch(Exception exception0) {
                FIN.finallyExec$NT(v);
                throw new RuntimeException("Error instantiating extension", exception0);
            }
        }
    }

    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    @Nullable
    private O2 m;
    private int n;
    private boolean o;
    private Factory p;
    private int q;
    private static final int[] r;
    private static final ExtensionLoader s;
    private static final ExtensionLoader t;

    static {
        DefaultExtractorsFactory.r = new int[]{5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
        DefaultExtractorsFactory.s = new ExtensionLoader(() -> {
            Object object0 = Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null);
            return Boolean.TRUE.equals(object0) ? Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(Integer.TYPE) : null;
        });
        DefaultExtractorsFactory.t = new ExtensionLoader(() -> Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(Extractor.class).getConstructor(null));
    }

    public DefaultExtractorsFactory() {
        this.k = 1;
        this.n = 112800;
        this.p = new DefaultSubtitleParserFactory();
        this.o = true;
    }

    @Override  // androidx.media3.extractor.ExtractorsFactory
    @a
    public ExtractorsFactory a(Factory subtitleParser$Factory0) {
        return this.u(subtitleParser$Factory0);
    }

    @Override  // androidx.media3.extractor.ExtractorsFactory
    @Deprecated
    public ExtractorsFactory b(boolean z) {
        return this.h(z);
    }

    @Override  // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] c(Uri uri0, Map map0) {
        synchronized(this) {
            int[] arr_v = DefaultExtractorsFactory.r;
            ArrayList arrayList0 = new ArrayList(arr_v.length);
            int v1 = FileTypes.b(map0);
            if(v1 != -1) {
                this.g(v1, arrayList0);
            }
            int v2 = FileTypes.c(uri0);
            if(v2 != -1 && v2 != v1) {
                this.g(v2, arrayList0);
            }
            for(int v4 = 0; v4 < arr_v.length; ++v4) {
                int v5 = arr_v[v4];
                if(v5 != v1 && v5 != v2) {
                    this.g(v5, arrayList0);
                }
            }
            Extractor[] arr_extractor = new Extractor[arrayList0.size()];
            for(int v3 = 0; v3 < arrayList0.size(); ++v3) {
                Extractor extractor0 = (Extractor)arrayList0.get(v3);
                if(this.o && !(extractor0.c() instanceof FragmentedMp4Extractor) && !(extractor0.c() instanceof Mp4Extractor) && !(extractor0.c() instanceof TsExtractor) && !(extractor0.c() instanceof AviExtractor) && !(extractor0.c() instanceof MatroskaExtractor)) {
                    extractor0 = new SubtitleTranscodingExtractor(extractor0, this.p);
                }
                arr_extractor[v3] = extractor0;
            }
            return arr_extractor;
        }
    }

    @Override  // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] d() {
        synchronized(this) {
            return this.c(Uri.EMPTY, new HashMap());
        }
    }

    private void g(int v, List list0) {
        int v1 = 2;
        int v2 = 0;
        switch(v) {
            case 0: {
                list0.add(new Ac3Extractor());
                return;
            }
            case 1: {
                list0.add(new Ac4Extractor());
                return;
            }
            case 2: {
                int v3 = this.d | this.b;
                if(!this.c) {
                    v1 = 0;
                }
                list0.add(new AdtsExtractor(v3 | v1));
                return;
            }
            case 3: {
                int v4 = this.e | this.b;
                if(!this.c) {
                    v1 = 0;
                }
                list0.add(new AmrExtractor(v4 | v1));
                return;
            }
            case 4: {
                Extractor extractor0 = DefaultExtractorsFactory.s.a(new Object[]{this.f});
                if(extractor0 != null) {
                    list0.add(extractor0);
                    return;
                }
                list0.add(new FlacExtractor(this.f));
                return;
            }
            case 5: {
                list0.add(new FlvExtractor());
                return;
            }
            case 6: {
                Factory subtitleParser$Factory0 = this.p;
                int v5 = this.g;
                if(this.o) {
                    v1 = 0;
                }
                list0.add(new MatroskaExtractor(subtitleParser$Factory0, v1 | v5));
                return;
            }
            case 7: {
                int v6 = this.j | this.b;
                if(!this.c) {
                    v1 = 0;
                }
                list0.add(new Mp3Extractor(v6 | v1));
                return;
            }
            case 8: {
                list0.add(new FragmentedMp4Extractor(this.p, this.i | (this.o ? 0 : 0x20)));
                Factory subtitleParser$Factory1 = this.p;
                int v7 = this.h;
                if(!this.o) {
                    v2 = 16;
                }
                list0.add(new Mp4Extractor(subtitleParser$Factory1, v7 | v2));
                return;
            }
            case 9: {
                list0.add(new OggExtractor());
                return;
            }
            case 10: {
                list0.add(new PsExtractor());
                return;
            }
            case 11: {
                if(this.m == null) {
                    this.m = O2.A();
                }
                list0.add(new TsExtractor(this.k, !this.o, this.p, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(this.l, this.m), this.n));
                return;
            }
            case 12: {
                list0.add(new WavExtractor());
                return;
            }
            case 14: {
                list0.add(new JpegExtractor(this.q));
                return;
            }
            case 15: {
                Extractor extractor1 = DefaultExtractorsFactory.t.a(new Object[0]);
                if(extractor1 != null) {
                    list0.add(extractor1);
                    return;
                }
                break;
            }
            case 16: {
                list0.add(new AviExtractor(true ^ this.o, this.p));
                return;
            }
            case 17: {
                list0.add(new PngExtractor());
                return;
            }
            case 18: {
                list0.add(new WebpExtractor());
                return;
            }
            case 19: {
                list0.add(new BmpExtractor());
                return;
            }
            case 20: {
                if((this.h & 2) == 0 && (this.h & 4) == 0) {
                    list0.add(new HeifExtractor());
                    return;
                }
                break;
            }
            case 21: {
                list0.add(new AvifExtractor());
            }
        }
    }

    @Deprecated
    public DefaultExtractorsFactory h(boolean z) {
        synchronized(this) {
            this.o = z;
        }
        return this;
    }

    // 检测为 Lambda 实现
    @Nullable
    private static Constructor i() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException [...]

    // 检测为 Lambda 实现
    private static Constructor j() throws ClassNotFoundException, NoSuchMethodException [...]

    @a
    public DefaultExtractorsFactory k(int v) {
        synchronized(this) {
            this.d = v;
        }
        return this;
    }

    @a
    public DefaultExtractorsFactory l(int v) {
        synchronized(this) {
            this.e = v;
        }
        return this;
    }

    @a
    public DefaultExtractorsFactory m(boolean z) {
        synchronized(this) {
            this.c = z;
        }
        return this;
    }

    @a
    public DefaultExtractorsFactory n(boolean z) {
        synchronized(this) {
            this.b = z;
        }
        return this;
    }

    @a
    public DefaultExtractorsFactory o(int v) {
        synchronized(this) {
            this.f = v;
        }
        return this;
    }

    @a
    public DefaultExtractorsFactory p(int v) {
        synchronized(this) {
            this.i = v;
        }
        return this;
    }

    @a
    public DefaultExtractorsFactory q(int v) {
        synchronized(this) {
            this.q = v;
        }
        return this;
    }

    @a
    public DefaultExtractorsFactory r(int v) {
        synchronized(this) {
            this.g = v;
        }
        return this;
    }

    @a
    public DefaultExtractorsFactory s(int v) {
        synchronized(this) {
            this.j = v;
        }
        return this;
    }

    @a
    public DefaultExtractorsFactory t(int v) {
        synchronized(this) {
            this.h = v;
        }
        return this;
    }

    @a
    public DefaultExtractorsFactory u(Factory subtitleParser$Factory0) {
        synchronized(this) {
            this.p = subtitleParser$Factory0;
        }
        return this;
    }

    @a
    @Deprecated
    public DefaultExtractorsFactory v(boolean z) {
        synchronized(this) {
            return this.h(z);
        }
    }

    @a
    public DefaultExtractorsFactory w(int v) {
        synchronized(this) {
            this.l = v;
        }
        return this;
    }

    @a
    public DefaultExtractorsFactory x(int v) {
        synchronized(this) {
            this.k = v;
        }
        return this;
    }

    @a
    public DefaultExtractorsFactory y(int v) {
        synchronized(this) {
            this.n = v;
        }
        return this;
    }

    @a
    public DefaultExtractorsFactory z(List list0) {
        synchronized(this) {
            this.m = O2.r(list0);
            return this;
        }
    }
}

