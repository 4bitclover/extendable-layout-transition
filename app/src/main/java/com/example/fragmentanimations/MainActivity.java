package com.example.fragmentanimations;

import androidx.appcompat.app.AppCompatActivity;


import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;



public class MainActivity extends AppCompatActivity {
    private LinearLayout makePayment;
    private LinearLayout checkout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makePayment = findViewById(R.id.make_payment);
        checkout = findViewById(R.id.checkout);
        makePayment.setOnClickListener(new MakePaymentHandler());
        checkout.setOnClickListener(new CheckoutCartHandler());
    }

    private class MakePaymentHandler implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent makePaymentIntent =
                    new Intent(MainActivity.this, MakePayment.class);
            Pair[] transitions = new Pair[1];
            transitions[0] = new Pair(makePayment, makePayment.getTransitionName());
            ActivityOptions options =
                    ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, transitions);
            startActivity(makePaymentIntent, options.toBundle());
        }
    }

    private class CheckoutCartHandler implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent makePaymentIntent =
                    new Intent(MainActivity.this, Checkout.class);
            Pair[] transitions = new Pair[1];
            transitions[0] = new Pair(checkout, checkout.getTransitionName());
            ActivityOptions options =
                    ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, transitions);
            startActivity(makePaymentIntent, options.toBundle());
        }
    }
}
