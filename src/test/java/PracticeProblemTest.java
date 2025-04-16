import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

    private Object createRectangle(double length, double width) {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Constructor<?> constructor = rectangleClass.getConstructor(double.class, double.class);
            return constructor.newInstance(length, width);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Rectangle constructor with (double, double) parameters does not exist");
        } catch (Exception e) {
            fail("Error creating Rectangle instance: " + e.getMessage());
        }
        return null; // This won't be reached due to fail() calls above
    }

    private Object createCircle(double radius) {
        try {
            Class<?> rectangleClass = Class.forName("Circle");
            Constructor<?> constructor = rectangleClass.getConstructor(double.class);
            return constructor.newInstance(radius);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Rectangle constructor with (double, double) parameters does not exist");
        } catch (Exception e) {
            fail("Error creating Rectangle instance: " + e.getMessage());
        }
        return null; // This won't be reached due to fail() calls above
    }

    private Object createPerson(String name, int age, int height, int weight, String eyeColour, String hairColour) {
        try {
            Class<?> rectangleClass = Class.forName("Person");
            Constructor<?> constructor = rectangleClass.getConstructor(String.class, int.class, int.class, int.class, String.class, String.class);
            return constructor.newInstance(name, age, height, weight, eyeColour, hairColour);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Rectangle constructor with (double, double) parameters does not exist");
        } catch (Exception e) {
            fail("Error creating Rectangle instance: " + e.getMessage());
        }
        return null; // This won't be reached due to fail() calls above
    }

    @Test
    @DisplayName("Test getLength method")
    void getLengthTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Method method = rectangleClass.getDeclaredMethod("getLength");
            Object rectangle = createRectangle(5, 4);
            assertEquals(5.0, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void getLengthTest2() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Method method = rectangleClass.getDeclaredMethod("getLength");
            Object rectangle = createRectangle(5, 0);
            assertEquals(5.2, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void getWidthTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Method method = rectangleClass.getDeclaredMethod("getWidth");
            Object rectangle = createRectangle(5, 4);
            assertEquals(5.0, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void getWidthTest2() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Method method = rectangleClass.getDeclaredMethod("getWidth");
            Object rectangle = createRectangle(5, 0);
            assertEquals(5.2, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void rectAreaTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Method method = rectangleClass.getDeclaredMethod("area");
            Object rectangle = createRectangle(5, 4);
            assertEquals(5.0, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void rectAreaTest2() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Method method = rectangleClass.getDeclaredMethod("area");
            Object rectangle = createRectangle(5, 0);
            assertEquals(5.2, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void rectPerimeterTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Method method = rectangleClass.getDeclaredMethod("perimeter");
            Object rectangle = createRectangle(5, 4);
            assertEquals(5.0, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void rectPerimeterTest2() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Method method = rectangleClass.getDeclaredMethod("perimeter");
            Object rectangle = createRectangle(5, 0);
            assertEquals(5.2, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void circRadiusTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Circle");
            Method method = rectangleClass.getDeclaredMethod("getRadius");
            Object rectangle = createCircle(5);
            assertEquals(5.0, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void circRadiusTest2() {
        try {
            Class<?> rectangleClass = Class.forName("Circle");
            Method method = rectangleClass.getDeclaredMethod("getRadius");
            Object rectangle = createCircle(5);
            assertEquals(8.5, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void circGetRadiusTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Circle");
            Method method = rectangleClass.getDeclaredMethod("getRadius");
            Object rectangle = createCircle(5);
            assertEquals(5.0, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void circGetRadiusTest2() {
        try {
            Class<?> rectangleClass = Class.forName("Circle");
            Method method = rectangleClass.getDeclaredMethod("getRadius");
            Object rectangle = createCircle(5);
            assertEquals(8.5, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void circAreaTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Circle");
            Method method = rectangleClass.getDeclaredMethod("area");
            Object rectangle = createCircle(5);
            assertEquals(78.5, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void circAreaTest2() {
        try {
            Class<?> rectangleClass = Class.forName("Circle");
            Method method = rectangleClass.getDeclaredMethod("area");
            Object rectangle = createCircle(5);
            assertEquals(226.865, (double)method.invoke(rectangle), 0.001);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void circCircumferenceTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Circle");
            Method method = rectangleClass.getDeclaredMethod("circumference");
            Object rectangle = createCircle(5);
            assertEquals(31.4, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void circCircumferenceTest2() {
        try {
            Class<?> rectangleClass = Class.forName("Circle");
            Method method = rectangleClass.getDeclaredMethod("circumference");
            Object rectangle = createCircle(5);
            assertEquals(53.38, (double)method.invoke(rectangle), 0.001);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void personNameTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Person");
            Method method = rectangleClass.getDeclaredMethod("getName");
            Object rectangle = createPerson("Mr. Kalisz", 5, 180, 145, "Blue", "Brown");
            assertEquals("Mr. Kalisz", (String)method.invoke(rectangle));
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void personNameTest2() {
        try {
            Class<?> rectangleClass = Class.forName("Person");
            Method method = rectangleClass.getDeclaredMethod("getName");
            Object rectangle = createPerson("Chris", 14, 125, 100, "Grey", "Black");;
            assertEquals("Chris", (String)method.invoke(rectangle));
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void personAgeTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Person");
            Method method = rectangleClass.getDeclaredMethod("getAge");
            Object rectangle = createPerson("Mr. Kalisz", 5, 180, 145, "Blue", "Brown");
            assertEquals(5, (int)method.invoke(rectangle));
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void personAgeTest2() {
        try {
            Class<?> rectangleClass = Class.forName("Person");
            Method method = rectangleClass.getDeclaredMethod("getAge");
            Object rectangle = createPerson("Chris", 14, 125, 100, "Grey", "Black");;
            assertEquals(14, (int)method.invoke(rectangle));
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void personHeightTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Person");
            Method method = rectangleClass.getDeclaredMethod("getHeight");
            Object rectangle = createPerson("Mr. Kalisz", 5, 180, 145, "Blue", "Brown");
            assertEquals(180, (int)method.invoke(rectangle));
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void personHeightTest2() {
        try {
            Class<?> rectangleClass = Class.forName("Person");
            Method method = rectangleClass.getDeclaredMethod("getHeight");
            Object rectangle = createPerson("Chris", 14, 125, 100, "Grey", "Black");;
            assertEquals(125, (int)method.invoke(rectangle));
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void personWeightTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Person");
            Method method = rectangleClass.getDeclaredMethod("getWeight");
            Object rectangle = createPerson("Mr. Kalisz", 5, 180, 145, "Blue", "Brown");
            assertEquals(145, (int)method.invoke(rectangle));
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void personWeightTest2() {
        try {
            Class<?> rectangleClass = Class.forName("Person");
            Method method = rectangleClass.getDeclaredMethod("getWeight");
            Object rectangle = createPerson("Chris", 14, 125, 100, "Grey", "Black");;
            assertEquals(100, (int)method.invoke(rectangle));
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void personEyeColourTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Person");
            Method method = rectangleClass.getDeclaredMethod("getEyeColour");
            Object rectangle = createPerson("Mr. Kalisz", 5, 180, 145, "Blue", "Brown");
            assertEquals("Blue", (String)method.invoke(rectangle));
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void personEyeColourTest2() {
        try {
            Class<?> rectangleClass = Class.forName("Person");
            Method method = rectangleClass.getDeclaredMethod("getEyeColour");
            Object rectangle = createPerson("Chris", 14, 125, 100, "Grey", "Black");;
            assertEquals("Grey", (String)method.invoke(rectangle));
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void personHairColourTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Person");
            Method method = rectangleClass.getDeclaredMethod("getHairColour");
            Object rectangle = createPerson("Mr. Kalisz", 5, 180, 145, "Blue", "Brown");
            assertEquals("Brown", (String)method.invoke(rectangle));
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Test getLength method")
    void personHairColourTest2() {
        try {
            Class<?> rectangleClass = Class.forName("Person");
            Method method = rectangleClass.getDeclaredMethod("getHairColour");
            Object rectangle = createPerson("Chris", 14, 125, 100, "Grey", "Black");;
            assertEquals("Black", (String)method.invoke(rectangle));
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }



    

    


}
