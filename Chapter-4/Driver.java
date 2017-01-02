public class Driver {
    public static void main(String[] args) {
        
        System.out.print("\f");
        User user1 = new User("Alex", "Rodgers", "djsexypants@hotmail.com", "12345");
        User user2 = new User("Samuel", "Jackson", "samljackson@gmail.com", "54321");
        
        user1.setFirst("Healthy");
        user1.setLast("Vegetables");
        
        user2.setEmail("jacksonsam@yahoo.com");
        user2.setPassword("Hello1!");
        
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}