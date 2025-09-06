package com.igaworks.ssp;

import android.content.Context;
import com.pci.beacon.PCI;

public abstract class t0 {
    public static void a(Context context0, String s) {
        try {
            b.c(Thread.currentThread(), "setKTThirdPartyID start : " + s);
            PCI.with(context0).beaconStart(s, "1004");
            E.g().f(s);
            b.c(Thread.currentThread(), "setKTThirdPartyID finish");
        }
        catch(NoClassDefFoundError unused_ex) {
            b.c(Thread.currentThread(), "setKTThirdPartyID NoClassDefFoundError");
        }
        catch(NoSuchMethodError unused_ex) {
            b.c(Thread.currentThread(), "setKTThirdPartyID NoSuchMethodError");
        }
        catch(Exception unused_ex) {
            b.c(Thread.currentThread(), "setKTThirdPartyID Exception");
        }
    }

    public static boolean a() {
        try {
            Class.forName("com.pci.beacon.PCI");
            b.c(Thread.currentThread(), "isKTLibraryExist");
            return true;
        }
        catch(ClassNotFoundException unused_ex) {
            b.c(Thread.currentThread(), "isKTLibraryExist NoClassDefFoundError");
            return false;
        }
        catch(NoClassDefFoundError unused_ex) {
            b.c(Thread.currentThread(), "isKTLibraryExist NoClassDefFoundError");
            return false;
        }
        catch(NoSuchMethodError unused_ex) {
            b.c(Thread.currentThread(), "isKTLibraryExist NoSuchMethodError");
            return false;
        }
        catch(Exception unused_ex) {
            b.c(Thread.currentThread(), "isKTLibraryExist Exception");
            return false;
        }
    }
}

