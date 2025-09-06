package androidx.media3.exoplayer.source;

import O1.l;
import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O2;
import java.util.List;

@UnstableApi
public class UnrecognizedInputFormatException extends ParserException {
    public final Uri c;
    public final O2 d;

    @l(imports = {"com.google.common.collect.ImmutableList"}, replacement = "this(message, uri, ImmutableList.of())")
    @Deprecated
    public UnrecognizedInputFormatException(String s, Uri uri0) {
        this(s, uri0, O2.A());
    }

    public UnrecognizedInputFormatException(String s, Uri uri0, List list0) {
        super(s, null, false, 1);
        this.c = uri0;
        this.d = O2.r(list0);
    }
}

