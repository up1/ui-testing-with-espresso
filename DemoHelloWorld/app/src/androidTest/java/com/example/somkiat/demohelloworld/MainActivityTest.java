package com.example.somkiat.demohelloworld;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule activityTestRule
            = new ActivityTestRule(MainActivity.class);

    @Test
    public void ส่งค่าชื่อSomkiatจากEditTextไปแสดงที่หน้าWelcome(){
        onView(withId(R.id.name_text))
                .perform(typeText("Somkiat"), closeSoftKeyboard());
        onView(withId(R.id.go_button)).perform(click());
        onView(withId(R.id.welcome_message))
                .check(matches(withText("Somkiat")));
    }

    @Test
    public void กดปุ่มไปแล้วจะไปหน้าWelcome(){
        ViewInteraction viewInteraction = onView(withId(R.id.go_button));
        viewInteraction.check(matches(isDisplayed()));
        viewInteraction.perform(click());

        ViewInteraction helloButton = onView(withId(R.id.hello_button));
        helloButton.check(matches(isDisplayed()));
    }

    @Test
    public void หน้าจอแสดงข้อความ() {
        onView(withId(R.id.hello_message))
                .check(matches(isDisplayed()));
    }

    @Test
    public void หน้าจอแสดงข้อความ_Somkiatcc() {
        onView(withId(R.id.hello_message))
                .check(matches(withText("Somkiat.cc")));
    }

}