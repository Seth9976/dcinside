package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
public final class CueEncoder {
    public byte[] a(List list0, long v) {
        ArrayList arrayList0 = BundleCollectionUtil.i(list0, new a());
        Bundle bundle0 = new Bundle();
        bundle0.putParcelableArrayList("c", arrayList0);
        bundle0.putLong("d", v);
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeBundle(bundle0);
        byte[] arr_b = parcel0.marshall();
        parcel0.recycle();
        return arr_b;
    }
}

