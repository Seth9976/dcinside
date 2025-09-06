package androidx.media3.extractor;

import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
public final class GaplessInfoHolder {
    public int a;
    public int b;
    private static final String c = "com.apple.iTunes";
    private static final String d = "iTunSMPB";
    private static final Pattern e;

    static {
        GaplessInfoHolder.e = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    }

    public GaplessInfoHolder() {
        this.a = -1;
        this.b = -1;
    }

    public boolean a() {
        return this.a != -1 && this.b != -1;
    }

    private boolean b(String s) {
        Matcher matcher0 = GaplessInfoHolder.e.matcher(s);
        if(matcher0.find()) {
            try {
                int v = Integer.parseInt(((String)Util.o(matcher0.group(1))), 16);
                int v1 = Integer.parseInt(((String)Util.o(matcher0.group(2))), 16);
                if(v > 0 || v1 > 0) {
                    this.a = v;
                    this.b = v1;
                    return true;
                }
                return false;
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return false;
    }

    public boolean c(Metadata metadata0) {
        for(int v = 0; v < metadata0.f(); ++v) {
            Entry metadata$Entry0 = metadata0.e(v);
            if(metadata$Entry0 instanceof CommentFrame) {
                if("iTunSMPB".equals(((CommentFrame)metadata$Entry0).c) && this.b(((CommentFrame)metadata$Entry0).d)) {
                    return true;
                }
            }
            else if(metadata$Entry0 instanceof InternalFrame && "com.apple.iTunes".equals(((InternalFrame)metadata$Entry0).b) && "iTunSMPB".equals(((InternalFrame)metadata$Entry0).c) && this.b(((InternalFrame)metadata$Entry0).d)) {
                return true;
            }
        }
        return false;
    }
}

