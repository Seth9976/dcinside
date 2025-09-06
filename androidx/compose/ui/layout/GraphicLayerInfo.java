package androidx.compose.ui.layout;

import y4.l;

public interface GraphicLayerInfo {
    public static final class DefaultImpls {
        @Deprecated
        public static long a(@l GraphicLayerInfo graphicLayerInfo0) {
            return a.b(graphicLayerInfo0);
        }
    }

    long getLayerId();

    long getOwnerViewId();
}

