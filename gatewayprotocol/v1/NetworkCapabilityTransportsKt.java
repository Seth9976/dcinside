package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class NetworkCapabilityTransportsKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0) {
                L.p(networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0, "builder");
                return new Dsl(networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0) {
            this._builder = networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0;
        }

        public Dsl(Builder networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0, w w0) {
            this(networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0);
        }

        @b0
        public final NetworkCapabilityTransports _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (NetworkCapabilityTransports)generatedMessageLite0;
        }

        public final void clearBluetooth() {
            this._builder.clearBluetooth();
        }

        public final void clearCellular() {
            this._builder.clearCellular();
        }

        public final void clearEthernet() {
            this._builder.clearEthernet();
        }

        public final void clearLowpan() {
            this._builder.clearLowpan();
        }

        public final void clearSatellite() {
            this._builder.clearSatellite();
        }

        public final void clearThread() {
            this._builder.clearThread();
        }

        public final void clearUsb() {
            this._builder.clearUsb();
        }

        public final void clearVpn() {
            this._builder.clearVpn();
        }

        public final void clearWifi() {
            this._builder.clearWifi();
        }

        public final void clearWifiAware() {
            this._builder.clearWifiAware();
        }

        @i(name = "getBluetooth")
        public final boolean getBluetooth() {
            return this._builder.getBluetooth();
        }

        @i(name = "getCellular")
        public final boolean getCellular() {
            return this._builder.getCellular();
        }

        @i(name = "getEthernet")
        public final boolean getEthernet() {
            return this._builder.getEthernet();
        }

        @i(name = "getLowpan")
        public final boolean getLowpan() {
            return this._builder.getLowpan();
        }

        @i(name = "getSatellite")
        public final boolean getSatellite() {
            return this._builder.getSatellite();
        }

        @i(name = "getThread")
        public final boolean getThread() {
            return this._builder.getThread();
        }

        @i(name = "getUsb")
        public final boolean getUsb() {
            return this._builder.getUsb();
        }

        @i(name = "getVpn")
        public final boolean getVpn() {
            return this._builder.getVpn();
        }

        @i(name = "getWifi")
        public final boolean getWifi() {
            return this._builder.getWifi();
        }

        @i(name = "getWifiAware")
        public final boolean getWifiAware() {
            return this._builder.getWifiAware();
        }

        public final boolean hasBluetooth() {
            return this._builder.hasBluetooth();
        }

        public final boolean hasCellular() {
            return this._builder.hasCellular();
        }

        public final boolean hasEthernet() {
            return this._builder.hasEthernet();
        }

        public final boolean hasLowpan() {
            return this._builder.hasLowpan();
        }

        public final boolean hasSatellite() {
            return this._builder.hasSatellite();
        }

        public final boolean hasThread() {
            return this._builder.hasThread();
        }

        public final boolean hasUsb() {
            return this._builder.hasUsb();
        }

        public final boolean hasVpn() {
            return this._builder.hasVpn();
        }

        public final boolean hasWifi() {
            return this._builder.hasWifi();
        }

        public final boolean hasWifiAware() {
            return this._builder.hasWifiAware();
        }

        @i(name = "setBluetooth")
        public final void setBluetooth(boolean z) {
            this._builder.setBluetooth(z);
        }

        @i(name = "setCellular")
        public final void setCellular(boolean z) {
            this._builder.setCellular(z);
        }

        @i(name = "setEthernet")
        public final void setEthernet(boolean z) {
            this._builder.setEthernet(z);
        }

        @i(name = "setLowpan")
        public final void setLowpan(boolean z) {
            this._builder.setLowpan(z);
        }

        @i(name = "setSatellite")
        public final void setSatellite(boolean z) {
            this._builder.setSatellite(z);
        }

        @i(name = "setThread")
        public final void setThread(boolean z) {
            this._builder.setThread(z);
        }

        @i(name = "setUsb")
        public final void setUsb(boolean z) {
            this._builder.setUsb(z);
        }

        @i(name = "setVpn")
        public final void setVpn(boolean z) {
            this._builder.setVpn(z);
        }

        @i(name = "setWifi")
        public final void setWifi(boolean z) {
            this._builder.setWifi(z);
        }

        @i(name = "setWifiAware")
        public final void setWifiAware(boolean z) {
            this._builder.setWifiAware(z);
        }
    }

    @l
    public static final NetworkCapabilityTransportsKt INSTANCE;

    static {
        NetworkCapabilityTransportsKt.INSTANCE = new NetworkCapabilityTransportsKt();
    }
}

