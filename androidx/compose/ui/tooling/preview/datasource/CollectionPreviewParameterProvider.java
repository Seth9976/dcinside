package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import e.a;
import java.util.Collection;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.sequences.m;
import y4.l;

@StabilityInferred(parameters = 0)
public class CollectionPreviewParameterProvider implements PreviewParameterProvider {
    @l
    private final Collection a;
    public static final int b = 8;

    static {
    }

    public CollectionPreviewParameterProvider(@l Collection collection0) {
        L.p(collection0, "collection");
        super();
        this.a = collection0;
    }

    @Override  // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @l
    public m Q() {
        return u.A1(this.a);
    }

    @Override  // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public int getCount() {
        return a.a(this);
    }
}

