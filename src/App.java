public class App {
    public static void main(String[] args) throws Exception {
        // create the object for teaching and non-teaching then set the data and get the data for both of them.

        Teaching t1 = new Teaching();
        NTeaching nt1 = new NTeaching();

        // using the teaching object call the set_data function and the get_data function and the non-teaching objext

        t1.set_data();
        t1.Get_data();

        nt1.set_data();
        nt1.Get_data();
    }
}
