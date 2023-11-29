package in.edu.ptuniv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button:
                Intent intent = new Intent(MainActivity.this, syllabus.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(MainActivity.this, notes.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(MainActivity.this, previousyearquestionpaper.class);
                startActivity(intent3);
                break;
            case R.id.button4:
                Intent intent4 = new Intent(MainActivity.this, cgpacalculator.class);
                startActivity(intent4);
                break;
            case R.id.button6:
                Intent intent6 = new Intent(MainActivity.this, favourites.class);
                startActivity(intent6);
                break;
            case R.id.button7:
                Intent intent7 = new Intent(MainActivity.this, about.class);
                startActivity(intent7);
                break;
            default:
                break;

        }
    }
}
