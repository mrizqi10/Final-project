package com.kodulersfittasa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class OnboardingActivity extends AppCompatActivity {

    private ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding1);

        viewPager = findViewById(R.id.onboarding_viewpager);

        // Set up the ViewPager2 adapter
        OnboardingViewPagerAdapter adapter = new OnboardingViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

        // Add a page change listener to handle screen transitions
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                if (position == adapter.getItemCount() - 1) {
                    // This is the last screen; show a button to proceed to the main app content
                    findViewById(R.id.onboarding_proceed_button).setVisibility(View.VISIBLE);
                } else {
                    findViewById(R.id.onboarding_proceed_button).setVisibility(View.GONE);
                }
            }
        });
    }
}