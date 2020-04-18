package com.haivu.frogtutoring;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class review extends AppCompatActivity {
    DBManager database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        EditText review_comment =(EditText)findViewById(R.id.review_comment);
        final RatingBar rank =(RatingBar)findViewById(R.id.rank);
        Button submit = (Button)findViewById(R.id.submit);
        //final Cursor cursor =
        String comment;
       // int tid,sid,count=0;
        double rat=rank.getRating();
        comment = review_comment.getText().toString();
        rank.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener()
        {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser)
            {
                if(rating ==1)
                {
                    Toast.makeText(review.this, "Poor",Toast.LENGTH_SHORT).show();
                }
                if(rating ==2)
                {
                    Toast.makeText(review.this, "Fair",Toast.LENGTH_SHORT).show();
                }
                if(rating ==3)
                {
                    Toast.makeText(review.this, "Good",Toast.LENGTH_SHORT).show();
                }
                if(rating ==4)
                {
                    Toast.makeText(review.this, "Very Good",Toast.LENGTH_SHORT).show();
                }
                if(rating ==5)
                {
                    Toast.makeText(review.this, "EXCELLENT!!",Toast.LENGTH_SHORT).show();
                }


            }
        });


                submit.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent toy = new Intent(review.this, profile.class);
                        startActivity(toy);
                    }
                });
               // count ++;
               // database.QueryData("INSERT INTO review VALUES(1, 1, comment, rat, count)");
    }
}
