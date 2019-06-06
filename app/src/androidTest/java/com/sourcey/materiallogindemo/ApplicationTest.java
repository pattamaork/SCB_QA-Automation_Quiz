package com.sourcey.materiallogindemo;
import android.app.Application;
import org.junit.runner.RunWith;
import android.support.test.filters.LargeTest;
import android.support.test.espresso.action.ReplaceTextAction;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;
import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.ViewInteraction;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.action.ViewActions.openLink;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.typeTextIntoFocusedView;
import static android.support.test.espresso.matcher.ViewMatchers.hasErrorText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withText;



 /* <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@LargeTest

@RunWith(AndroidJUnit4.class)
public class ApplicationTest extends ApplicationTestCase<Application> {
     public ApplicationTest() {
         super(Application.class);
     }

     @Rule
     public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);


     @Test
     public void TC1() {
         onView(withText("No account yet? Create one")).perform(click());
         onView(withId(R.id.input_name)).perform(scrollTo(), typeText("test"), closeSoftKeyboard());
         onView(withId(R.id.input_address)).perform(scrollTo(), typeText("Sathorn"), closeSoftKeyboard());
         onView(withId(R.id.input_email)).perform(scrollTo(), typeText("test@gmail.com"), closeSoftKeyboard());
         onView(withId(R.id.input_mobile)).perform(scrollTo(), typeText("12345678"), closeSoftKeyboard());
         onView(withId(R.id.input_password)).perform(scrollTo(), typeText("1234"), closeSoftKeyboard());
         onView(withId(R.id.input_reEnterPassword)).perform(scrollTo(), typeText("1234"), closeSoftKeyboard());
         onView(withId(R.id.btn_signup)).perform(scrollTo(), click());
     }
     @Test
     public void TC2() {
         onView(withId(R.id.input_email)).perform(typeText("tedt"), closeSoftKeyboard());
         onView(withId(R.id.btn_login)).perform(click());
     }
     @Test
     public void TC3() {
         onView(withId(R.id.input_email)).perform(typeText("userName"), closeSoftKeyboard());
         onView(withId(R.id.input_password)).perform(typeText("111"), closeSoftKeyboard());
         onView(withId(R.id.btn_login)).perform(click());
         //onView(withText(getString(R.string.email)))
         //.inRoot(withDecorView(not(activityTestRule.getActivity().getWindow().getDecorView())))
         //.check(matches(isDisplayed()));
     }

     @Test
     public void PTC4() {
         onView(withId(R.id.input_email)).perform(typeText("userName"), closeSoftKeyboard());
         onView(withId(R.id.input_password)).perform(typeText("11111111111"), closeSoftKeyboard());
         onView(withId(R.id.btn_login)).perform(click());
         //onView(withId(R.id.input_password)).check(matches(withText("enter a valid email address")));
     }

 }




