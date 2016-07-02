package com.example.somkiat.workingwithintent;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
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
            = new ActivityTestRule(SecondActivity.class, false, false);

    @Before
    public void initialInput() {
        Intent stubIntent = new Intent();
        stubIntent.putExtra("result", "My message");
        activityTestRule.launchActivity(stubIntent);
    }

    @Test
    public void showResult() {
        onView(withId(R.id.result)).check(matches(isDisplayed()));
        onView(withId(R.id.result)).check(matches(withText("My message")));
    }

}