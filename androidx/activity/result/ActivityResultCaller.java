package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import y4.l;

public interface ActivityResultCaller {
    @l
    ActivityResultLauncher registerForActivityResult(@l ActivityResultContract arg1, @l ActivityResultCallback arg2);

    @l
    ActivityResultLauncher registerForActivityResult(@l ActivityResultContract arg1, @l ActivityResultRegistry arg2, @l ActivityResultCallback arg3);
}

