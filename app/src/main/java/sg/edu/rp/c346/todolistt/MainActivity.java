package sg.edu.rp.c346.todolistt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvtodo;
    ArrayList<todoItem> altodoList;
    CustomAdapter catodo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvtodo=findViewById(R.id.ListviewToDo);
        altodoList=new ArrayList<>();
        Calendar date1=Calendar.getInstance();
        date1.set(2018,7,1);
        Calendar date2=Calendar.getInstance();
        date2.set(2018,9,22);
        todoItem item1 = new todoItem("MSA",date1);
        todoItem item2 = new todoItem("Go for haircut",date2);
       altodoList.add(item1);
        altodoList.add(item2);

        catodo= new CustomAdapter(this,R.layout.todo, altodoList);
        lvtodo.setAdapter(catodo);
    }
}
