import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Admin admin1 = new Admin(0, "Admin1", "Admin1@gmail.com", "Admin1Password");
        Admin admin2 = new Admin(1, "Admin2", "Admin2@gmail.com", "Admin2Password");
        Customer customer1 = new Customer(2, "Customer1", "Customer1@gmail.com", "asdf", "adress1");
        Customer customer2 = new Customer(3, "Customer2", "Customer2@gmail.com", "asdf", "adress2");
        Customer customer3 = new Customer(4, "Customer3", "Customer3@gmail.com", "asdf", "adress3");
        Customer customer4 = new Customer(4, "Customer4", "Customer4@gmail.com", "asdf", "adress4");
        Customer customer5 = new Customer(5, "Customer5", "Customer5@gmail.com", "asdf", "adress5");

        admin1.addProduct("Wanderers' Time", 20, 50);
        admin1.addProduct("Song of Oblivion", 18, 50);
        admin1.addProduct("City of Shadows", 22, 50);
        admin1.addProduct("Road to the Stars", 19, 50);
        admin1.addProduct("Beyond the Dream", 21, 50);
        admin1.addProduct("Chronicles of Silence", 23, 50);
        admin1.addProduct("The Last Horizon", 20, 50);
        admin1.addProduct("Echo of the Past", 17, 50);
        admin1.addProduct("Light Over the Abyss", 24, 50);
        admin1.addProduct("Secrets of the Forgotten World", 25, 50);


        customer1.placeOrder("0", customer1, admin1.products.get(0), 4);
        customer1.placeOrder("1", customer1, admin1.products.get(1), 5);
        customer1.placeOrder("2", customer1, admin1.products.get(2), 7);
        customer2.placeOrder("4", customer2, admin1.products.get(3), 3);
        customer2.placeOrder("5", customer2, admin1.products.get(4), 8);
        customer2.placeOrder("6", customer2, admin1.products.get(5), 1);
        customer3.placeOrder("7", customer3, admin1.products.get(6), 2);
        customer3.placeOrder("8", customer3, admin1.products.get(7), 5);
        customer3.placeOrder("9", customer3, admin1.products.get(8), 1);
        customer3.placeOrder("1", customer3, admin1.products.get(9), 2); //
        customer4.placeOrder("0", customer1, admin1.products.get(0), 4);
        customer4.placeOrder("1", customer1, admin1.products.get(1), 5);
        customer4.placeOrder("2", customer1, admin1.products.get(2), 7);
        customer5.placeOrder("4", customer2, admin1.products.get(3), 3);
        customer5.placeOrder("5", customer2, admin1.products.get(4), 8);
        customer5.placeOrder("6", customer2, admin1.products.get(5), 1);
        customer1.placeOrder("7", customer3, admin1.products.get(6), 2);
        customer1.placeOrder("8", customer3, admin1.products.get(7), 5);
        customer1.placeOrder("9", customer3, admin1.products.get(8), 1);
        customer1.placeOrder("1", customer3, admin1.products.get(9), 2); //
        customer2.placeOrder("0", customer1, admin1.products.get(0), 4);
        customer2.placeOrder("1", customer1, admin1.products.get(1), 5);
        customer2.placeOrder("2", customer1, admin1.products.get(2), 7);
        customer3.placeOrder("4", customer2, admin1.products.get(3), 3);
        customer3.placeOrder("5", customer2, admin1.products.get(4), 8);
        customer3.placeOrder("6", customer2, admin1.products.get(5), 1);
        customer4.placeOrder("7", customer3, admin1.products.get(6), 2);
        customer4.placeOrder("8", customer3, admin1.products.get(7), 5);
        customer4.placeOrder("9", customer3, admin1.products.get(8), 1);
        customer4.placeOrder("1", customer3, admin1.products.get(9), 2);

//        customer1.displayDetails("asdf");



        System.out.println("Admin Test #1:");
        admin1.addProduct("New Product!", 3, 30);
        admin1.displayDetails("Admin1Password");
        System.out.println(" ");


        System.out.println("Admin Test #2:");
        admin1.removeProduct("10");
        admin1.displayDetails("Admin1Password");
        System.out.println(" ");

        System.out.println("Admin Test #3:");
        admin1.updateStock("9", 10);
        admin1.displayDetails("Admin1Password");
        System.out.println(" ");



        System.out.println("Displaying all customers: ");
        customer1.displayDetails("asdf");
        System.out.println(" ");
        customer2.displayDetails("asdf");
        System.out.println(" ");
        customer3.displayDetails("asdf");
        System.out.println(" ");
        customer4.displayDetails("asdf");
        System.out.println(" ");
        customer5.displayDetails("asdf");


//        Scanner input = new Scanner(System.in);
//
//        // Массив с пользователями
//        ArrayList<User> users = new ArrayList<User>();
//
//        // Инициализируем переменные
//        int userCounter = 0;
//        boolean loggedIn = false;
//        int option;
//        String password = "";
//        int userId = 0;
//
//        // Запускаем меню
//        while (true) {
//            // Если авторизирован
//            while (loggedIn) {
//                System.out.println(" Choose an option: ");
//                System.out.println("4. Display details");
//                System.out.println("5. Get email");
//                System.out.println("6. Logout");
//                option = input.nextInt();
//                if (option == 4) {
//                    users.get(userId).displayDetails(password);
//                }
//                else if (option == 5) {
//                    users.get(userId).getEmail(password);
//                }
//                else if (option == 6) {
//                    loggedIn = false;
//                    break;
//                }
//            }
//
//            // Выбор опции
//            System.out.println("Choose an option: ");
//            System.out.println("1. Login");
//            System.out.println("2. Signup");
//            System.out.println("3. Exit");
//            option = input.nextInt();
//
//            // Опция #1 - Войти в аккаунт
//            if (option == 1) {
//                System.out.println("Please enter your email address: ");
//                String email = input.next();
//                System.out.println("Please enter your password: ");
//                password = input.next();
//
//                for (User user : users) {
//                    if(user.isLoggedIn(email, password)) {
//                        userId = users.indexOf(user);
//                        loggedIn = true;
//                    }
//                }
//                if (!loggedIn) {
//                    System.out.println("Wrong email or password.");
//                    System.out.println(" ");
//                }
//            }
//
//            // Опция #2 - Создать аккаунт
//            else if (option == 2) {
//                System.out.println(" ");
//                String name = input.nextLine();
//                System.out.println("Enter your name: ");
//                name = input.nextLine();
//                System.out.println("Enter your email: ");
//                String email = input.nextLine();
//                System.out.println("Enter your password: ");
//                password = input.nextLine();
//
//                users.add(new User(userCounter, name, email, password));
//                userId = userCounter;
//                loggedIn = true;
//                userCounter++;
//            }
//
//            // Опция #3 - Завершить программу
//            else if (option == 3) {
//                System.out.print("The program has been successfully completed!");
//                break;
//            }
//        }
    }
}