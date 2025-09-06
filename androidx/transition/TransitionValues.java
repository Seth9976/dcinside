package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TransitionValues {
    public final Map a;
    @SuppressLint({"UnknownNullness"})
    public View b;
    final ArrayList c;

    @Deprecated
    public TransitionValues() {
        this.a = new HashMap();
        this.c = new ArrayList();
    }

    public TransitionValues(@NonNull View view0) {
        this.a = new HashMap();
        this.c = new ArrayList();
        this.b = view0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof TransitionValues && this.b == ((TransitionValues)object0).b && this.a.equals(((TransitionValues)object0).a);
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() * 0x1F + this.a.hashCode();
    }

    @Override
    @NonNull
    public String toString() {
        String s = "TransitionValues@" + Integer.toHexString(this.hashCode()) + ":\n" + "    view = " + this.b + "\n" + "    values:";
        for(Object object0: this.a.keySet()) {
            s = s + "    " + ((String)object0) + ": " + this.a.get(((String)object0)) + "\n";
        }
        return s;
    }
}

