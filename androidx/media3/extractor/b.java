package androidx.media3.extractor;

import java.lang.reflect.Constructor;

public final class b implements ConstructorSupplier {
    @Override  // androidx.media3.extractor.DefaultExtractorsFactory$ExtensionLoader$ConstructorSupplier
    public final Constructor getConstructor() {
        return DefaultExtractorsFactory.i();
    }
}

