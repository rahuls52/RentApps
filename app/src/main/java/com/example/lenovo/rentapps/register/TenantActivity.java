package com.example.lenovo.rentapps.register;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lenovo.rentapps.R;
import com.example.lenovo.rentapps.model.Owner;
import com.example.lenovo.rentapps.retrofit.RestApi;
import com.example.lenovo.rentapps.retrofit.RetrofitClient;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

public class TenantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenant);

        TextView textView = findViewById(R.id.textView);
        TextView textView1= findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);
        TextView textView6 = findViewById(R.id.textView6);

        Intent intent = getIntent();

        Bundle bundle= intent.getExtras();
        String name = getIntent().getStringExtra("name");
        //String name = bundle.getString("name");
        textView.setText(name);
        Bundle bundle1 = intent.getExtras();
        //String address = bundle1.getString("address");
        String address = getIntent().getStringExtra("address");
        textView1.setText(address);
        Bundle bundle2 = intent.getExtras();
        //String flat_location = bundle2.getString("flat_location");
        String flat_location = getIntent().getStringExtra("flat_location");
        textView2.setText(flat_location);
        Bundle bundle3 = intent.getExtras();
       // String amenities = bundle3.getString("amenities");
        String amenities = getIntent().getStringExtra("amenities");
        textView3.setText(amenities);
        Bundle bundle4 = intent.getExtras();
        //String facilitate = bundle4.getString("facilitate");
        String facilitate = getIntent().getStringExtra("facilitate");
        textView4.setText(facilitate);
        Bundle bundle5 = intent.getExtras();
        //String rent = bundle5.getString("rent");
        String rent = getIntent().getStringExtra("rent");
        textView5.setText(rent);
        Bundle bundle6 = intent.getExtras();
        //String mobileNo = bundle6.getString("mobileNo");
        String mobileNo = getIntent().getStringExtra("mobileNo");
        textView6.setText(mobileNo);


     /*   Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.0.107:8084")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
*/


    }
}
