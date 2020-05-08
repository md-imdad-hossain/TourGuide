package com.example.applicationtourguide;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    Button contact,web;
    TextView address, details,name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView=(ImageView)findViewById(R.id.disima);
        contact=(Button)findViewById(R.id.contact);
        web=(Button)findViewById(R.id.web);
        address=(TextView)findViewById(R.id.address);
        details=(TextView)findViewById(R.id.detail);
        name=(TextView)findViewById(R.id.name);

        Bundle extras = getIntent().getExtras();
        String name_string = extras.getString("extra_name");
        String address_string = extras.getString("extra_address");
        String image_string = extras.getString("extra_image");
        String details_string = extras.getString("extra_details");
        final String website_string = extras.getString("extra_website");
        final String phone_string = extras.getString("extra_phone");

        imageView.setImageResource(Integer.parseInt(image_string));
        contact.setText(phone_string);
        web.setText(website_string);
        details.setText(details_string);
        name.setText(name_string);
        address.setText("Address: " + address_string);

        //On clicking makes a call
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                String temp = "tel:" + phone_string;
                callIntent.setData(Uri.parse(temp));
                startActivity(callIntent);
            }
        });
        //On clicking takes to the website
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String web_url="http://"+website_string;
                Uri uri = Uri.parse(web_url); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
