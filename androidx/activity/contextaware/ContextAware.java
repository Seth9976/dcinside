package androidx.activity.contextaware;

import android.content.Context;
import y4.l;
import y4.m;

public interface ContextAware {
    void addOnContextAvailableListener(@l OnContextAvailableListener arg1);

    @m
    Context peekAvailableContext();

    void removeOnContextAvailableListener(@l OnContextAvailableListener arg1);
}

