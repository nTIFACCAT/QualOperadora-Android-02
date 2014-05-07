package com.nTI.qualoperadora.app;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.os.AsyncTask;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.util.List;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnConsulta = (Button) findViewById(R.id.btnConsulta);

        btnConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String StrServer = "http://private-61fc-rodrigoknascimento.apiary-mock.com/consulta/5199999999";
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private class ConsultaOperadoraJson extends AsyncTask<String, Void, String> {

        private ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);

        protected void OnPreExecute(){
            progressDialog.setMessage("Consultado Operadora. Aguarde...");
            progressDialog.show();
        }

        @Override
        protected String doInBackground(String... strings) {
            final String teste;
            return null;
        }

        protected void onPostExecute(Void result) {
            if (this.progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
        }
    }

}
