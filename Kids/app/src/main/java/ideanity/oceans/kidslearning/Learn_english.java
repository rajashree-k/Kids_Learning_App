package ideanity.oceans.kidslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class Learn_english extends AppCompatActivity {
    Button bt1;
    EditText et1;
    TextToSpeech t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_english);
        bt1=findViewById(R.id.bt1);
        et1=findViewById(R.id.et1);
        t1=new TextToSpeech(getApplicationContext(),status->{
            if(status!=TextToSpeech.ERROR){
                t1.setLanguage(Locale.ENGLISH);
            }
        });
    }
    public void convert(View view){
        String tospeak=et1.getText().toString();
        t1.speak(tospeak,TextToSpeech.QUEUE_FLUSH,null);
    }
}