package com.testaars;

import android.graphics.Bitmap;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.FutureTarget;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

import java.util.concurrent.ExecutionException;

@ReactModule(name = TestAarsModule.NAME)
public class TestAarsModule extends NativeTestAarsSpec {
  public static final String NAME = "TestAars";

  public TestAarsModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @Override
  public double multiply(double a, double b) {
    FutureTarget<Bitmap> futureTarget =
      Glide.with(getReactApplicationContext())
        .asBitmap()
        .load("https://placekitten.com/g/200/300")
        .submit();

    try {
      Bitmap bitmap = futureTarget.get();
    } catch (ExecutionException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    return a * b;
  }
}
