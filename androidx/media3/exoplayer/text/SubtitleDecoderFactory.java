package androidx.media3.exoplayer.text;

import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.cea.Cea608Decoder;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import j..util.Objects;

@UnstableApi
public interface SubtitleDecoderFactory {
    public static final SubtitleDecoderFactory a;

    static {
        SubtitleDecoderFactory.a = new SubtitleDecoderFactory() {
            private final DefaultSubtitleParserFactory b;

            {
                this.b = new DefaultSubtitleParserFactory();
            }

            // 去混淆评级： 低(40)
            @Override  // androidx.media3.exoplayer.text.SubtitleDecoderFactory
            public boolean a(Format format0) {
                return this.b.a(format0) || Objects.equals(format0.n, "application/cea-608") || Objects.equals(format0.n, "application/x-mp4-cea-608") || Objects.equals(format0.n, "application/cea-708");
            }

            @Override  // androidx.media3.exoplayer.text.SubtitleDecoderFactory
            public SubtitleDecoder b(Format format0) {
                String s = format0.n;
                if(s != null) {
                    switch(s) {
                        case "application/cea-608": 
                        case "application/x-mp4-cea-608": {
                            return new Cea608Decoder(s, format0.G, 16000L);
                        }
                        case "application/cea-708": {
                            return new Cea708Decoder(format0.G, format0.q);
                        }
                    }
                }
                if(!this.b.a(format0)) {
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + s);
                }
                SubtitleParser subtitleParser0 = this.b.c(format0);
                return new DelegatingSubtitleDecoder(subtitleParser0.getClass().getSimpleName() + "Decoder", subtitleParser0);
            }
        };
    }

    boolean a(Format arg1);

    SubtitleDecoder b(Format arg1);
}

