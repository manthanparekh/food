package food;

// TODO: create a meal class
public class meal {
    // TODO: create a method named mealType with parameter mealType and print output
    public void mealType(String mealType){
        System.out.println("Meal for time is " + mealType);
    }
}


// TODO: create a main
class main {
    public static void main(String[] args) {
        // TODO: create objects for the different classes
        meal typeOfMeal = new meal();
        Breakfast sevenAM = new Breakfast();
        Lunch onePM = new Lunch();
        Dinner sevenPM = new Dinner();

        // TODO: call the methods from different classes and add custom data
        typeOfMeal.mealType("Lunch");
        sevenAM.items("apple", "oats");
        onePM.items("pizza", "salad");
        sevenPM.items("tacos", "ice-cream");



    }
}
