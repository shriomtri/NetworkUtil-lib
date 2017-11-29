package com.example.networkutil;

import android.support.annotation.NonNull;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by joker on 30/11/17.
 */

public class NetworkUtil {

    public static final String TAG = NetworkUtil.class.getSimpleName();

    /*
    * getResponseFromHttpurl is method which will take InputStream as parameter
    * */

    @NonNull
    private String getResponseFromHttpUrl(InputStream in) throws IOException {

        StringBuilder buffer = null;

        try {
            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            buffer = new StringBuilder();
            while (scanner.hasNext()) {
                buffer.append(scanner.next());
            }

        } catch (Exception e){
            Log.e(TAG," Exception "+e);
        }

        assert buffer != null;
        return buffer.toString();
    }


    /*
    * makeServiceCall is public method which will accept URL as string and checks
    * weahter give url is correct or not.*/

    public String makeServiceCall(String reqUrl) {
        String response = null;
        HttpURLConnection connection = null;
        try {
            URL url = new URL(reqUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            //reade the response
            InputStream in = connection.getInputStream();
            response = getResponseFromHttpUrl(in);

        } catch (MalformedURLException e) {
            Log.e(TAG, " MalformedURLException " + e);
        } catch (ProtocolException e) {
            Log.e(TAG, " ProtocolException " + e);
        } catch (IOException e) {
            Log.e(TAG, " IOException " + e);
        } catch (Exception e) {
            Log.e(TAG, " Exception " + e);
        } finally {
            connection.disconnect();
        }

        return response;

    }


}
