package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo;
import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType;
import kotlin.jvm.internal.L;
import y4.l;

public final class PickVisualMediaRequestKt {
    @l
    public static final PickVisualMediaRequest a(@l VisualMediaType activityResultContracts$PickVisualMedia$VisualMediaType0) {
        L.p(activityResultContracts$PickVisualMedia$VisualMediaType0, "mediaType");
        return new Builder().b(activityResultContracts$PickVisualMedia$VisualMediaType0).a();
    }

    public static PickVisualMediaRequest b(VisualMediaType activityResultContracts$PickVisualMedia$VisualMediaType0, int v, Object object0) {
        if((v & 1) != 0) {
            activityResultContracts$PickVisualMedia$VisualMediaType0 = ImageAndVideo.a;
        }
        return PickVisualMediaRequestKt.a(activityResultContracts$PickVisualMedia$VisualMediaType0);
    }
}

