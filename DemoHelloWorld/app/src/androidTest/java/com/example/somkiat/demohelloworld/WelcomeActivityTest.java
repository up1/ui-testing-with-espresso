package com.example.somkiat.demohelloworld;

import android.content.Intent;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class WelcomeActivityTest {


    @Rule
    public ActivityTestRule activityTestRule
            = new ActivityTestRule(WelcomeActivity.class, true, false);

    @Before
    public void initial() {
        Intent stubIntent = new Intent();
        stubIntent.putExtra("name", "TODO");
        activityTestRule.launchActivity(stubIntent);
    }

    @Test
    public void showข้อมูลที่ส่งมา() {
        onView(withId(R.id.welcome_message)).check(matches(withText("TODO")));
    }

    @Test
    public void clickHelloButtonShouldDisplayHelloEspresso() {
        ViewInteraction helloButton = onView(withId(R.id.hello_button));
        helloButton.check(matches(isDisplayed()));
        helloButton.perform(click());
        onView(withId(R.id.welcome_message)).check(matches(withText("Hello Espresso")));
    }



}