package sg.edu.rp.c346.id20019648.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);

        ArrayList<String> fruits;

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add(3, "durian");

        String theFruit = fruits.get(1);
        tv.setText(theFruit);

        // remove first element from ArrayList
        fruits.remove(0);

        // change value of last element
        fruits.set(fruits.size()-1, "dragon fruit");

        String line = "Fruits\n";
        line += "=====\n";

        // print out arrayList
        for (int i = 0; i < fruits.size(); i++) {
            line += fruits.get(i) + "\n";
        }
        tv.setText(line);
    }
}