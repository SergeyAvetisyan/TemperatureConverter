# TemperatureConverter


![Image of Yaktocat](https://lmg-labmanager.s3.amazonaws.com/assets/articleNo/3330/aImg/40352/advances-in-temperature-measurement-for-microwave-digestion-l.jpg)


Add this in build.gradle

    repositories {
        maven { 
              url 'https://jitpack.io' 
              }
    }
	

In dependencies add this line

*implementation 'com.github.SergeyAvetisyan:TemperatureConverter:1.0.0'*



# Usage

You can convert following Celcius,Reamur,Fahrenheit,Kelvin
Here is example how use it(converting Celcius to Fahrenheit)
```
Temperature.Celcius.convert(25,Temperature.Fahrenheit);
```
