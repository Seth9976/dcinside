package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo;
import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType;
import kotlin.jvm.internal.L;
import y4.l;

public final class PickVisualMediaRequest {
    public static final class Builder {
        @l
        private VisualMediaType a;

        public Builder() {
            this.a = ImageAndVideo.a;
        }

        @l
        public final PickVisualMediaRequest a() {
            PickVisualMediaRequest pickVisualMediaRequest0 = new PickVisualMediaRequest();
            pickVisualMediaRequest0.b(this.a);
            return pickVisualMediaRequest0;
        }

        @l
        public final Builder b(@l VisualMediaType activityResultContracts$PickVisualMedia$VisualMediaType0) {
            L.p(activityResultContracts$PickVisualMedia$VisualMediaType0, "mediaType");
            this.a = activityResultContracts$PickVisualMedia$VisualMediaType0;
            return this;
        }
    }

    @l
    private VisualMediaType a;

    public PickVisualMediaRequest() {
        this.a = ImageAndVideo.a;
    }

    @l
    public final VisualMediaType a() {
        return this.a;
    }

    public final void b(@l VisualMediaType activityResultContracts$PickVisualMedia$VisualMediaType0) {
        L.p(activityResultContracts$PickVisualMedia$VisualMediaType0, "<set-?>");
        this.a = activityResultContracts$PickVisualMedia$VisualMediaType0;
    }
}

