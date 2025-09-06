package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.text.a;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;

@UnstableApi
public final class CueDecoder {
    static final String a = "c";
    static final String b = "d";

    public CuesWithTiming a(long v, byte[] arr_b) {
        return this.b(v, arr_b, 0, arr_b.length);
    }

    public CuesWithTiming b(long v, byte[] arr_b, int v1, int v2) {
        Parcel parcel0 = Parcel.obtain();
        parcel0.unmarshall(arr_b, v1, v2);
        parcel0.setDataPosition(0);
        Bundle bundle0 = parcel0.readBundle(Bundle.class.getClassLoader());
        parcel0.recycle();
        ArrayList arrayList0 = (ArrayList)Assertions.g(bundle0.getParcelableArrayList("c"));
        return new CuesWithTiming(BundleCollectionUtil.d(new a(), arrayList0), v, bundle0.getLong("d"));
    }
}

