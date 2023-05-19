package builder;

/*
    This implementation allows for a flexible way of creating User objects with different combinations of fields. It also makes it clear which fields are required (firstName and lastName) and which are optional.
 */
public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String email;
    private final String phoneNumber;
    
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
    }
    
    // getters for all fields
    
    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String email;
        private String phoneNumber;
        
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
        
        public UserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        
        public User build() {
            return new User(this);
        }
    }
}

/*
    User user = new User.UserBuilder("John", "Doe")
                .age(30)
                .email("johndoe@example.com")
                .phoneNumber("555-1234")
                .build();

 */