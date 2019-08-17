package com.example.lenovo.rentapps.register;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.lenovo.rentapps.R;
import com.example.lenovo.rentapps.model.Owner;
import com.example.lenovo.rentapps.retrofit.RetrofitClient;

import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OwnerActivity extends AppCompatActivity {

    int id = 0;
    EditText editText;
    EditText eaddress;
    EditText eflatloction;
    EditText eAmenities;
    EditText eFacilitate;
    EditText erents;
    EditText emobileNo;
    Button bpost;


    /*  public void inti()
      {

          //vdetails = findViewById(R.id.details);
          editText = findViewById(R.id.name);
          eaddress = findViewById(R.id.full_address);
          eflatloction =findViewById(R.id.flat_location);
          eAmenities = findViewById(R.id.amenities);
          eFacilitate = findViewById(R.id.facilitate);
          erents = findViewById(R.id.rents);
          emobileNo =findViewById(R.id.mobileNo);
          //bpost = findViewById(R.id.post);


          bpost.setOnClickListener(new View.OnClickListener()
          {
              @Override
              public void onClick(View v) {
                  // String details = vdetails.getText().toString();
                  String name = editText.getText().toString();
                  String address = eaddress.getText().toString();
                  String flat_location = eflatloction.getText().toString();
                  String amenities = eAmenities.getText().toString();
                  String Facilitate = eFacilitate.getText().toString();
                  String rent = erents.getText().toString();
                  String mobileNo = emobileNo.getText().toString();

                  Intent intent = new Intent(getApplicationContext(), TenantActivity.class);
                  startActivity(intent);
                  Bundle bundle = new Bundle();

                  //bundle.putString("Details:-", details);
                  intent.putExtras(bundle);
                  bundle.putString("name", name);
                  intent.putExtras(bundle);
                  bundle.putString("address", address);
                  intent.putExtras(bundle);
                  bundle.putString("flat_location", flat_location);
                  intent.putExtras(bundle);
                  bundle.putString("amenities", amenities);
                  intent.putExtras(bundle);
                  bundle.putString("facilitate", Facilitate);
                  intent.putExtras(bundle);
                  bundle.putString("rent", rent);
                  intent.putExtras(bundle);
                  bundle.putString("mobileNo", mobileNo);
                  intent.putExtras(bundle);



              }
          });
      }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner);

        bpost = findViewById(R.id.post);


        editText = findViewById(R.id.name);
        eaddress = findViewById(R.id.full_address);
        eflatloction = findViewById(R.id.flat_location);
        eAmenities = findViewById(R.id.amenities);
        eFacilitate = findViewById(R.id.facilitate);
        erents = findViewById(R.id.rents);
        emobileNo = findViewById(R.id.mobileNo);

        bpost.setOnClickListener(v -> {

            System.out.println("Post Saved ");
            Owner owner = new Owner();
            owner.setId(id++);
            owner.setName(Objects.requireNonNull(editText.getText().toString()));
            owner.setOwnerAddress(Objects.requireNonNull(eaddress.getText().toString()));
            owner.setFlatLocation(Objects.requireNonNull(eflatloction.getText().toString()));
            owner.setAmenities(Objects.requireNonNull(eAmenities.getText().toString()));
            owner.setFacilities(Objects.requireNonNull(eFacilitate.getText().toString()));
            owner.setRent(Integer.parseInt(erents.getText().toString()));
            owner.setMobileNo(Integer.parseInt(emobileNo.getText().toString()));
            RetrofitClient.requestCall().getPosts(owner).enqueue(new Callback<String>() {
                @Override
                public void onResponse(@NonNull Call<String> call,@NonNull Response<String> response) {
                    System.out.println(response.body());
                    if (response.isSuccessful()) {
                        Intent intent = new Intent(getApplicationContext(), TenantActivity.class);
                        startActivity(intent);
                    }
                }

                @Override
                public void onFailure(@NonNull Call<String> call,@NonNull Throwable t) {
                    System.out.println(t.getMessage());
                }
            });
        });
    }
}
