package o0;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import com.dcinside.app.write.results.PostTempActivityResult;

public final class a implements ActivityResultCallback {
    public final PostTempActivityResult a;

    public a(PostTempActivityResult postTempActivityResult0) {
        this.a = postTempActivityResult0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        PostTempActivityResult.c(this.a, ((ActivityResult)object0));
    }
}

