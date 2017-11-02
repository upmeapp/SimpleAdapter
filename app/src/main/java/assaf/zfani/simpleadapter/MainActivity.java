package assaf.zfani.simpleadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.listView);
        String[] keys = new String[]{"Picture","isMale","Text"};
        int[] values = new int[]{R.id.imageView,R.id.checkBox,R.id.textView};
        ArrayList<HashMap<String,?>>myList = new ArrayList<HashMap<String, ?>>();
        HashMap<String,Object>first = new HashMap<String,Object>();
        first.put("Picture",R.drawable.man1);
        first.put("isMale",true);
        first.put("Text","Almoni");
        HashMap<String,Object>sec = new HashMap<String,Object>();
        sec.put("Picture",R.drawable.man2);
        sec.put("isMale",true);
        sec.put("Text","Almoni2");
        HashMap<String,Object>third = new HashMap<String,Object>();
        third.put("Picture",R.drawable.woman1);
        third.put("isMale",false);
        third.put("Text","Almonit");
        HashMap<String,Object>four = new HashMap<String,Object>();
        four.put("Picture",R.drawable.woman2);
        four.put("isMale",false);
        four.put("Text","Almonit2");
        myList.add(first);
        myList.add(sec);
        myList.add(third);
        myList.add(four);
        SimpleAdapter adapter = new SimpleAdapter(this,myList,R.layout.linecontent,keys,values);
        listView.setAdapter(adapter);
    }
}
