package com.sematec.sematecandroidbasictir98;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestUrlConnectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_url_connection);


        final TextView txtTime = findViewById(R.id.txtTime);


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    String url = "https://api.aladhan.com/v1/timingsByCity?city=Dubai&country=United%20Arab%20Emirates&method=8";

                    URL obj = new URL(url);

                    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                    con.setRequestMethod("GET");
                    con.setRequestProperty("User-Agent", "Mozilla/5.0");

                    int responseCode = con.getResponseCode();

                    if (responseCode == HttpURLConnection.HTTP_OK) {

                        BufferedReader in = new BufferedReader(new InputStreamReader(
                                con.getInputStream()));

                        String inputLine;
                        StringBuffer response = new StringBuffer();
                        while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                        }

                        System.out.println(response.toString());

                        JSONObject object = new JSONObject(response.toString());
                        String result = object.getString("data");

                        JSONObject object1 = new JSONObject(result);
                        String result1 = object1.getString("timings");

                        JSONObject object2 = new JSONObject(result1);
                        String result2 = object2.getString("Maghrib");

                        Log.d("MYTAG", result2);

                        txtTime.setText(result2);
                        
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();


    }
}
