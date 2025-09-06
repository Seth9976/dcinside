package com.karumi.dexter;

import android.content.Context;
import android.content.Intent;

class IntentProvider {
    public Intent get(Context context0, Class class0) {
        return new Intent(context0, class0);
    }
}

