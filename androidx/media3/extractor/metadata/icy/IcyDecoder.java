package androidx.media3.extractor.metadata.icy;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import com.google.common.base.c;
import com.google.common.base.f;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
public final class IcyDecoder extends SimpleMetadataDecoder {
    private final CharsetDecoder a;
    private final CharsetDecoder b;
    private static final Pattern c = null;
    private static final String d = "streamtitle";
    private static final String e = "streamurl";

    static {
        IcyDecoder.c = Pattern.compile("(.+?)=\'(.*?)\';", 0x20);
    }

    public IcyDecoder() {
        this.a = f.c.newDecoder();
        this.b = f.b.newDecoder();
    }

    @Override  // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    protected Metadata b(MetadataInputBuffer metadataInputBuffer0, ByteBuffer byteBuffer0) {
        String s = this.c(byteBuffer0);
        byte[] arr_b = new byte[byteBuffer0.limit()];
        byteBuffer0.get(arr_b);
        String s1 = null;
        if(s == null) {
            return new Metadata(new Entry[]{new IcyInfo(arr_b, null, null)});
        }
        Matcher matcher0 = IcyDecoder.c.matcher(s);
        String s2 = null;
        for(int v = 0; matcher0.find(v); v = matcher0.end()) {
            String s3 = matcher0.group(1);
            String s4 = matcher0.group(2);
            if(s3 != null) {
                String s5 = c.g(s3);
                s5.hashCode();
                if(s5.equals("streamurl")) {
                    s2 = s4;
                }
                else if(s5.equals("streamtitle")) {
                    s1 = s4;
                }
            }
        }
        return new Metadata(new Entry[]{new IcyInfo(arr_b, s1, s2)});
    }

    @Nullable
    private String c(ByteBuffer byteBuffer0) {
        String s;
        try {
            s = this.a.decode(byteBuffer0).toString();
        }
        catch(CharacterCodingException unused_ex) {
            this.a.reset();
            byteBuffer0.rewind();
            try {
                return this.b.decode(byteBuffer0).toString();
            }
            catch(CharacterCodingException unused_ex) {
                return null;
            }
            finally {
                this.b.reset();
                byteBuffer0.rewind();
            }
        }
        finally {
            this.a.reset();
            byteBuffer0.rewind();
        }
        return s;
    }
}

