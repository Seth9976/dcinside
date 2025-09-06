package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import java.io.InputStream;
import java.util.List;

public abstract class c.c {
    List a;
    c.b b;

    public abstract String a();

    public abstract int b();

    protected c c(String s) {
        if(s == null) {
            return null;
        }
        if(this.a != null && this.a.size() > 0) {
            for(Object object0: this.a) {
                c f$c0 = (c)object0;
                if(s.equals(f$c0.a)) {
                    return f$c0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    protected String d(int v) {
        switch(v) {
            case 200: {
                return "OK";
            }
            case 201: {
                return "Created";
            }
            case 202: {
                return "Accepted";
            }
            case 203: {
                return "Non-Authoritative";
            }
            case 204: {
                return "No Content";
            }
            case 205: {
                return "Reset Content";
            }
            case 206: {
                return "Partial Content";
            }
            case 300: {
                return "Multiple Choices";
            }
            case 301: {
                return "Moved Permanently";
            }
            case 302: {
                return "Temporary Redirect";
            }
            case 303: {
                return "See Other";
            }
            case 304: {
                return "Not Modified";
            }
            case 305: {
                return "Use Proxy";
            }
            case 400: {
                return "Bad Request";
            }
            case 401: {
                return "Unauthorized";
            }
            case 402: {
                return "Payment Required";
            }
            case 403: {
                return "Forbidden";
            }
            case 404: {
                return "Not Found";
            }
            case 405: {
                return "Method Not Allowed";
            }
            case 406: {
                return "Not Acceptable";
            }
            case 407: {
                return "Proxy Authentication Required";
            }
            case 408: {
                return "Request Time-Out";
            }
            case 409: {
                return "Conflict";
            }
            case 410: {
                return "Gone";
            }
            case 411: {
                return "Length Required";
            }
            case 412: {
                return "Precondition Failed";
            }
            case 413: {
                return "Request Entity Too Large";
            }
            case 414: {
                return "Request-URI Too Large";
            }
            case 0x19F: {
                return "Unsupported Media Type";
            }
            case 500: {
                return "Internal Server Error";
            }
            case 501: {
                return "Not Implemented";
            }
            case 502: {
                return "Bad Gateway";
            }
            case 503: {
                return "Service Unavailable";
            }
            case 504: {
                return "Gateway Timeout";
            }
            case 505: {
                return "HTTP Version Not Supported";
            }
            default: {
                return "";
            }
        }
    }

    public abstract String e(String arg1, String arg2);

    public abstract List f();

    public c.b g() {
        return this.b;
    }

    public abstract boolean h();

    public abstract InputStream i();

    public abstract String j();
}

