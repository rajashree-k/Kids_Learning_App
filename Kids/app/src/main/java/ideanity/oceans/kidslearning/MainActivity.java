package ideanity.oceans.kidslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    RelativeLayout color, number, alphabet, week, shape, english;
    LinearLayout poem;
    Button btnLogout;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        color = findViewById(R.id.color);
        number = findViewById(R.id.number);
        alphabet = findViewById(R.id.alphabet);
        week = findViewById(R.id.week);
        shape = findViewById(R.id.shape);
        poem = findViewById(R.id.lil_poem);
        english=findViewById(R.id.learn_eng);
        btnLogout=findViewById(R.id.btnLogout);

        btnLogout=findViewById(R.id.btnLogout);
        mAuth=FirebaseAuth.getInstance();

        btnLogout.setOnClickListener(view -> {
            mAuth.signOut();
            startActivity(new Intent(MainActivity.this,LoginActivity.class));
        });


        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ColorsActivity.class));
            }
        });

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NumbersActivity.class));
            }
        });

        alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AlphabetActivity.class));
            }
        });

        week.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WeekActivity.class));
            }
        });

        shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ShapesActivity.class));
            }
        });

        poem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PoemsActivity.class));
            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Learn_english.class));
            }
        });

    }
    @Override
    protected void onStart(){
        super.onStart();
        FirebaseUser user=mAuth.getCurrentUser();
        if(user==null){
            startActivity(new Intent(MainActivity.this,LoginActivity.class));
        }
    }

}