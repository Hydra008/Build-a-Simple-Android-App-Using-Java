import android.os.Bundle;
import android.widget.TextView;

public class MealActivity extends Activity {
  
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);

        TextView foodLabel = (TextView) findViewById(R.id.foodTextView);
        TextView drinkLabel = (TextView) findViewById(R.id.drinkTextView);
        RelativeLayout mealLayout = (RelativeLayout) findViewById(R.id.mealLayout);
        mealLayout.setBackgroundColor(Color.GREEN);
    }
}
