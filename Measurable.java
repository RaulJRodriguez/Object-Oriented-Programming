public interface Measurable {
   int MAX_NUM_OBJECTS = 3; // Automatically public static final, but we dont use it

   double getMeasure(); // Automatically public, no method body
}
