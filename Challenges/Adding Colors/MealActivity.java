public class MealActivity extends Activity {
  
    public TextView foodLabel;
    public TextView drinkLabel;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);

        foodLabel = (TextView) findViewById(R.id.foodTextView);
        drinkLabel = (TextView) findViewById(R.id.drinkTextView);
        RelativeLayout mealLayout = (RelativeLayout) findViewById(R.id.mealLayout);
        mealLayout.setBackgroundColor(Color.GREEN);
        foodLabel.setTextColor(Color.BLUE);
        drinkLabel.setTextColor(Color.GRAY);
    }
}
