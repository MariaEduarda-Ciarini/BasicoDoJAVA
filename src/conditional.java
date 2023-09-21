public class conditional {
    public static void main(String[] args) {
        int release_year = 1983;
        boolean included_in_the_plan = true;
        int film_note = 10;
        String plan_type = "plus";

        if (release_year <= 2023) {
            System.out.println("Old movie");
        } else {
            System.out.println("Very good film recommended!");
        }

        if (included_in_the_plan == true && plan_type.equals("plus")) {
            System.out.println("You can access the film");
        } else {
            System.out.println("Without access, help capitalism");
        }
    }
}
