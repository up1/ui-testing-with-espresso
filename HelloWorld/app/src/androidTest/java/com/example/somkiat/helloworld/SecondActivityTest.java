package com.example.somkiat.helloworld;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class SecondActivityTest {

    @Rule
    public ActivityTestRule activityTestRule
            = new ActivityTestRule(SecondActivity.class);


    @Test
    public void checkResultInView() {
        onView(withId(R.id.result)).check(matches(isDisplayed()));
        onView(withId(R.id.result)).check(matches(withText("Second activity")));
    }

}