package com.google.android.gms.internal.ads;

public final class zzkd extends RuntimeException {
    public zzkd(int v) {
        String s;
        switch(v) {
            case 1: {
                s = "Player release timed out.";
                break;
            }
            case 2: {
                s = "Setting foreground mode timed out.";
                break;
            }
            default: {
                s = "Detaching surface timed out.";
            }
        }
        super(s);
    }
}

