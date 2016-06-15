package com.grapesnberries.curllogger;


import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by mohamedzakaria on 6/7/16.
 */
public class CurlPrinter {


    /**
     * Drawing toolbox
     */
    private static final String SINGLE_DIVIDER = "────────────────────────────────────────────";

    private static String sTag = "CURL";

    public static void print(@Nullable String tag, String url, String msg) {
        // setting tag if not null
        if(tag != null)
            sTag = tag;

        StringBuilder logMsg = new StringBuilder("\n");
        logMsg.append("\n");
        logMsg.append("URL: " + url);
        logMsg.append("\n");
        logMsg.append(SINGLE_DIVIDER);
        logMsg.append("\n");
        logMsg.append(msg);
        logMsg.append(" ");
        logMsg.append(" \n");
        logMsg.append(SINGLE_DIVIDER);
        logMsg.append(" \n ");
        log(logMsg.toString());
    }

    private static void log(String msg) {
        Log.d(sTag, msg);
    }
}
