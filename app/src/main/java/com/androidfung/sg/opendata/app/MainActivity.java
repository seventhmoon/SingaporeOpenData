package com.androidfung.sg.opendata.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.androidfung.opendata.ApiServices;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sg.gov.data.GovDataApiService;
import sg.gov.data.environment.model.Pm25Response;

@SuppressWarnings("unused")
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadData();
            }
        });
    }

    private void loadData(){
        GovDataApiService govDataApiService = ApiServices.getGovDataApiService();

        govDataApiService.getPm25Readings("YOUR_API_KEY").enqueue(new Callback<Pm25Response>() {
            @Override
            public void onResponse(Call<Pm25Response> call, Response<Pm25Response> response) {
                Log.d(TAG, response.toString());
                TextView tv = (TextView) findViewById(R.id.text_view);
                tv.setText(new Gson().toJson(response.body()));
            }

            @Override
            public void onFailure(Call<Pm25Response> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
