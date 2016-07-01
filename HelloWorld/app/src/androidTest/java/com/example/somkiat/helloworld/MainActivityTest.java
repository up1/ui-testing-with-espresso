package com.example.somkiat.helloworld;

import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {


    @Rule
    public ActivityTestRule activityTestRule = new ActivityTestRule(MainActivity.class);


    @Test
    public void findHelloButtonInView() {
        onView(withId(R.id.hello_button)).check(matches(isDisplayed()));
        onView(withId(R.id.hello_button)).perform(click());
        onView(withId(R.id.message))
                .check(matches(withText("Hello World with Espresso")));
    }

}




