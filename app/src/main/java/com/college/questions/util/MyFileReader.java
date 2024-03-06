package com.college.questions.util;

import android.content.Context;

import java.io.InputStream;

public class MyFileReader {

    // Returns a String with the contents of the JSON file
    static public String readJson(Context ctx, String fileName) {
        String json;

        try {
            InputStream is = ctx.getAssets().open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "ISO_8859_1");
        }
        catch (java.io.IOException ex) {
            // Log the error
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
