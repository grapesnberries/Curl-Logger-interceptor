package com.grapesnberries.curllogger;


import android.util.Log;

/**
 * Created by mohamedzakaria on 6/7/16.
 */
public class CurlPrinter {


    /**
     * Drawing toolbox
     */
    private static final String SINGLE_DIVIDER = "────────────────────────────────────────────";

    private static final String TAG = "CURL";

    public static void print(String url, String msg) {
        StringBuilder logMsg = new StringBuilder("\n");
        logMsg.append("\n");
        logMsg.append("URL: " + url);
        logMsg.append("\n");
        logMsg.append(SINGLE_DIVIDER);
        logMsg.append("\n");
        logMsg.append(msg);
        logMsg.append(SINGLE_DIVIDER);
        logMsg.append(" \n ");
        log(logMsg.toString());
    }

    private static void log(String msg) {
        Log.d(TAG, msg);
    }
}
