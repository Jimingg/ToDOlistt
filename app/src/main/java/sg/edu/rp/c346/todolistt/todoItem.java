package sg.edu.rp.c346.todolistt;

import java.util.Calendar;

/**
 * Created by 17010144 on 17/7/2018.
 */

public class todoItem {
    private String Name;
    private Calendar Date;

    public todoItem(String name, Calendar date) {
        Name = name;
        Date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public String getDateString(){
        String str = Date.get(Calendar.DAY_OF_MONTH)+"/"+ Date.get(Calendar.MONTH)+"/"+Date.get(Calendar.YEAR);
        return str;
    }
    public void setDate(Calendar date) {
        Date = date;
    }

    public Calendar getDate() {
        return Date;
    }

    @Override
    public String toString() {
        return "todoItem{" +
                "Name='" + Name + '\'' +
                ", Date=" + getDateString() +
                '}';
    }
}
