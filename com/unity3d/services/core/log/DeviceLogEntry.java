package com.unity3d.services.core.log;

class DeviceLogEntry {
    private DeviceLogLevel _logLevel;
    private String _originalMessage;
    private StackTraceElement _stackTraceElement;

    public DeviceLogEntry(DeviceLogLevel deviceLogLevel0, String s, StackTraceElement stackTraceElement0) {
        this._logLevel = deviceLogLevel0;
        this._originalMessage = s;
        this._stackTraceElement = stackTraceElement0;
    }

    public DeviceLogLevel getLogLevel() {
        return this._logLevel;
    }

    public String getParsedMessage() {
        int v;
        String s2;
        String s1;
        String s = this._originalMessage;
        StackTraceElement stackTraceElement0 = this._stackTraceElement;
        if(stackTraceElement0 == null) {
            s1 = "UnknownClass";
            s2 = "unknownMethod";
            v = -1;
        }
        else {
            s1 = stackTraceElement0.getClassName();
            s2 = this._stackTraceElement.getMethodName();
            v = this._stackTraceElement.getLineNumber();
        }
        if(s != null && !s.isEmpty()) {
            s = " :: " + s;
        }
        if(s == null) {
            s = "";
        }
        return s1 + "." + s2 + "()" + (" (line:" + v + ")") + s;
    }
}

