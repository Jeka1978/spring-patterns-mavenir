package com.epam.springpatternsmavenir.optional_examples;

/**
 * @author Evgeny Borisov
 */
public class UserService {

    private UserRepo userRepo = new UserRepo();

    User getById(int id) {
        return userRepo.findUser(id)
                .orElseGet(UserService::getDefaultUser);
    }


    public static void main(String[] args) {
        User user = new UserService().getById(2);
        System.out.println("user = " + user);
    }




    public static User getDefaultUser() {
        System.out.println("100000 nanos");
        return new User("Default");
    }
}
