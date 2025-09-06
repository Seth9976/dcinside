package androidx.transition;

import android.util.SparseArray;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;

class TransitionValuesMaps {
    final ArrayMap a;
    final SparseArray b;
    final LongSparseArray c;
    final ArrayMap d;

    TransitionValuesMaps() {
        this.a = new ArrayMap();
        this.b = new SparseArray();
        this.c = new LongSparseArray();
        this.d = new ArrayMap();
    }
}

